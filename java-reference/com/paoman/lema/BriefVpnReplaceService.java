package com.paoman.lema;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.RunnableC0219y;
import p035e1.AbstractC0656h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class BriefVpnReplaceService extends VpnService {

    /* renamed from: h */
    public static final /* synthetic */ int f1536h = 0;

    /* renamed from: e */
    public ParcelFileDescriptor f1537e;

    /* renamed from: f */
    public Thread f1538f;

    /* renamed from: g */
    public final Handler f1539g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void m981a(boolean z7) {
        this.f1539g.removeCallbacksAndMessages(null);
        Thread thread = this.f1538f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f1538f = null;
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.f1537e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception unused) {
        }
        this.f1537e = null;
        stopForeground(1);
        stopSelf();
        Intent intent = new Intent("com.paoman.lema.vpn.REPLACE_FINISHED");
        intent.setPackage(getPackageName());
        intent.putExtra("success", z7);
        sendBroadcast(intent);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f1539g.removeCallbacksAndMessages(null);
        Thread thread = this.f1538f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.f1537e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception unused) {
        }
        this.f1537e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        String str;
        Notification.Builder builder;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == -723110951 && str.equals("com.paoman.lema.vpn.BRIEF_REPLACE")) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                if (i9 >= 26) {
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                    AbstractC0656h.m1375i();
                    notificationManager.createNotificationChannel(AbstractC0656h.m1370d());
                }
                if (i9 >= 26) {
                    builder = AbstractC0656h.m1367a(this);
                } else {
                    builder = new Notification.Builder(this);
                }
                Notification build = builder.setSmallIcon(R.drawable.stat_sys_warning).setContentTitle("正在切换网络").setContentText("短暂接管 VPN 以关闭第三方隧道").setOngoing(true).build();
                AbstractC3367j.m5099d(build, "build(...)");
                startForeground(2002, build);
            }
            try {
                VpnService.Builder mtu = new VpnService.Builder(this).setSession("跑满了吗").addAddress("10.255.255.2", 32).addRoute("0.0.0.0", 0).setMtu(1280);
                AbstractC3367j.m5099d(mtu, "setMtu(...)");
                mtu.setBlocking(false);
                ParcelFileDescriptor establish = mtu.establish();
                if (establish == null) {
                    m981a(false);
                } else {
                    this.f1537e = establish;
                    Thread thread = new Thread(new RunnableC0219y(7, establish), "brief-vpn-drain");
                    thread.start();
                    this.f1538f = thread;
                    this.f1539g.postDelayed(new RunnableC0219y(6, this), 450L);
                }
                return 2;
            } catch (Exception unused) {
                m981a(false);
                return 2;
            }
        }
        return 2;
    }
}
