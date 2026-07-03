package p039e5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vk */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1371vk extends Service {

    /* renamed from: g */
    public Messenger f8194g;

    /* renamed from: h */
    public C0565q1 f8195h;

    /* renamed from: j */
    public int f8197j;

    /* renamed from: e */
    public final C1100ms f8192e = new C1100ms();

    /* renamed from: f */
    public final C2090c f8193f = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(AbstractC0525d0.m1124b(), AbstractC0549l0.f1898a));

    /* renamed from: i */
    public String f8196i = "";

    /* renamed from: k */
    public final Messenger f8198k = new Messenger(new HandlerC1309tk(this, Looper.getMainLooper(), 1));

    /* renamed from: a */
    public final void m2370a() {
        this.f8192e.m1962S0();
        C0565q1 c0565q1 = this.f8195h;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f8195h = null;
        C1247rk.f7381h.m2202v();
        String str = "MP_WORKER stop pid=" + Process.myPid() + " targetId=" + this.f8196i;
        AbstractC3367j.m5100e(str, "message");
        if (!Log.isLoggable("HBCS-NetIface", 4)) {
            return;
        }
        Log.i("HBCS-NetIface", str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder = this.f8198k.getBinder();
        AbstractC3367j.m5099d(binder, "getBinder(...)");
        return binder;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m2370a();
        AbstractC0525d0.m1127e(this.f8193f, null);
        super.onDestroy();
    }
}
