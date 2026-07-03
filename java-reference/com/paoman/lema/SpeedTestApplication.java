package com.paoman.lema;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.paoman.lema.SpeedTestApplication;
import java.lang.Thread;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p032d6.AbstractC0525d0;
import p039e5.AbstractC0697a2;
import p039e5.C0800d9;
import p039e5.C0927h9;
import p039e5.C0959i9;
import p039e5.C0979j0;
import p039e5.C1196q0;
import p039e5.C1238rb;
import p039e5.EnumC0768c9;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class SpeedTestApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        if (AbstractC0697a2.f2310a.compareAndSet(false, true)) {
            AbstractC0697a2.m1488a("handler_installed");
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: e5.y1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    SpeedTestApplication speedTestApplication = SpeedTestApplication.this;
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    try {
                        try {
                            AtomicBoolean atomicBoolean = AbstractC0697a2.f2310a;
                            Context applicationContext = speedTestApplication.getApplicationContext();
                            AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                            AbstractC3367j.m5097b(thread);
                            AbstractC3367j.m5097b(th);
                            AbstractC0697a2.m1492e(applicationContext, thread, th);
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th);
                            }
                        } catch (Exception e7) {
                            Log.e("HBCS-Crash", "writeCrashLog failed", e7);
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th);
                            }
                        }
                    } catch (Throwable th2) {
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th);
                        }
                        throw th2;
                    }
                }
            });
        }
        AbstractC0697a2.m1488a("app_onCreate");
        C1238rb c1238rb = C1238rb.f7307a;
        C1238rb.m2164d(this);
        C1196q0 m2199p = C1196q0.f6960p.m2199p(this);
        C0927h9.f4481a.m1554a(m2199p.f6962a);
        C0959i9 c0959i9 = (C0959i9) C0927h9.f4483c.f10535e.getValue();
        if (c0959i9.f4780b && c0959i9.f4789k) {
            Iterable iterable = (Iterable) m2199p.f6971j.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    EnumC0768c9 enumC0768c9 = ((C0800d9) it.next()).f3351l;
                    if (enumC0768c9 == EnumC0768c9.f3009i || enumC0768c9 == EnumC0768c9.f3011k || enumC0768c9 == EnumC0768c9.f3005e) {
                        AbstractC0525d0.m1141s(m2199p.f6966e, null, new C0979j0(m2199p, null, 0), 3);
                        return;
                    }
                }
            }
        }
    }
}
