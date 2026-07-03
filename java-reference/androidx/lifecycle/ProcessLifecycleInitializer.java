package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p060h5.C1813u;
import p158u5.AbstractC3367j;
import p193z3.C3868a;
import p193z3.InterfaceC3869b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC3869b {
    @Override // p193z3.InterfaceC3869b
    /* renamed from: a */
    public final List mo411a() {
        return C1813u.f10860e;
    }

    @Override // p193z3.InterfaceC3869b
    /* renamed from: b */
    public final Object mo412b(Context context) {
        AbstractC3367j.m5100e(context, "context");
        C3868a m5885c = C3868a.m5885c(context);
        AbstractC3367j.m5099d(m5885c, "getInstance(...)");
        if (m5885c.f18131b.contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC0207q.f872a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                AbstractC3367j.m5098c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0205p());
            }
            C0178b0 c0178b0 = C0178b0.f822m;
            c0178b0.getClass();
            c0178b0.f827i = new Handler();
            c0178b0.f828j.m471d(EnumC0201n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            AbstractC3367j.m5098c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0176a0(c0178b0));
            return c0178b0;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
