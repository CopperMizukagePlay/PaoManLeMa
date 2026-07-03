package com.paoman.lema;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import p035e1.AbstractC0656h;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class OverlayKeepAliveService extends Service {

    /* renamed from: e */
    public WindowManager f1567e;

    /* renamed from: f */
    public View f1568f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        View view = this.f1568f;
        if (view != null) {
            try {
                WindowManager windowManager = this.f1567e;
                if (windowManager != null) {
                    windowManager.removeView(view);
                }
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
        }
        this.f1568f = null;
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
        if (AbstractC3367j.m5096a(str, "com.paoman.lema.overlay_keepalive.STOP")) {
            View view = this.f1568f;
            if (view != null) {
                try {
                    WindowManager windowManager = this.f1567e;
                    if (windowManager != null) {
                        windowManager.removeView(view);
                    }
                } catch (Throwable th) {
                    AbstractC1793a0.m2985m(th);
                }
            }
            this.f1568f = null;
            stopForeground(1);
            stopSelf();
            return 2;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Object systemService = getSystemService("notification");
            AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            AbstractC0656h.m1375i();
            NotificationChannel m1365C = AbstractC0656h.m1365C();
            m1365C.setDescription("测速期间维持透明悬浮窗以降低进程被回收概率");
            ((NotificationManager) systemService).createNotificationChannel(m1365C);
        }
        if (i9 >= 26) {
            builder = AbstractC0656h.m1369c(this);
        } else {
            builder = new Notification.Builder(this);
        }
        Notification build = builder.setSmallIcon(R.drawable.stat_sys_upload_done).setContentTitle("测速悬浮窗保活").setContentText("测速期间维持透明悬浮窗").setOngoing(true).build();
        AbstractC3367j.m5099d(build, "build(...)");
        int i10 = 2002;
        startForeground(2002, build);
        if (this.f1568f == null) {
            Object systemService2 = getSystemService("window");
            AbstractC3367j.m5098c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            this.f1567e = (WindowManager) systemService2;
            View view2 = new View(this);
            view2.setBackgroundColor(0);
            view2.setAlpha(0.01f);
            this.f1568f = view2;
            if (i9 >= 26) {
                i10 = 2038;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 2, i10, 792, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 0;
            WindowManager windowManager2 = this.f1567e;
            if (windowManager2 != null) {
                windowManager2.addView(this.f1568f, layoutParams);
            }
        }
        return 1;
    }
}
