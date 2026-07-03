package p032d6;

import java.util.concurrent.CancellationException;
import p060h5.AbstractC1793a0;
import p069i6.AbstractC2088a;
import p069i6.C2093f;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.AbstractRunnableC2329i;
import p098m5.AbstractC2583c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0546k0 extends AbstractRunnableC2329i {

    /* renamed from: g */
    public int f1892g;

    public AbstractC0546k0(int i7) {
        super(0L, false);
        this.f1892g = i7;
    }

    /* renamed from: c */
    public abstract InterfaceC2313c mo1202c();

    /* renamed from: d */
    public Throwable mo1203d(Object obj) {
        C0569s c0569s;
        if (obj instanceof C0569s) {
            c0569s = (C0569s) obj;
        } else {
            c0569s = null;
        }
        if (c0569s == null) {
            return null;
        }
        return c0569s.f1923a;
    }

    /* renamed from: h */
    public final void m1205h(Throwable th) {
        AbstractC0525d0.m1137o(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo1202c().mo662j());
    }

    /* renamed from: i */
    public abstract Object mo1206i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (p032d6.InterfaceC0520b1) r5.mo853h(p032d6.C0584x.f1939f);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0583w1 c0583w1;
        try {
            InterfaceC2313c mo1202c = mo1202c();
            AbstractC3367j.m5098c(mo1202c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2093f c2093f = (C2093f) mo1202c;
            AbstractC2583c abstractC2583c = c2093f.f12354i;
            Object obj = c2093f.f12356k;
            InterfaceC2318h mo662j = abstractC2583c.mo662j();
            Object m3441l = AbstractC2088a.m3441l(mo662j, obj);
            InterfaceC0520b1 interfaceC0520b1 = null;
            if (m3441l != AbstractC2088a.f12343d) {
                c0583w1 = AbstractC0525d0.m1148z(abstractC2583c, mo662j, m3441l);
            } else {
                c0583w1 = null;
            }
            try {
                InterfaceC2318h mo662j2 = abstractC2583c.mo662j();
                Object mo1206i = mo1206i();
                Throwable mo1203d = mo1203d(mo1206i);
                if (mo1203d == null) {
                    int i7 = this.f1892g;
                    boolean z7 = true;
                    if (i7 != 1 && i7 != 2) {
                        z7 = false;
                    }
                }
                if (interfaceC0520b1 != null && !interfaceC0520b1.mo1113b()) {
                    CancellationException mo1118w = interfaceC0520b1.mo1118w();
                    mo1201b(mo1118w);
                    abstractC2583c.mo663n(AbstractC1793a0.m2985m(mo1118w));
                } else if (mo1203d != null) {
                    abstractC2583c.mo663n(AbstractC1793a0.m2985m(mo1203d));
                } else {
                    abstractC2583c.mo663n(mo1204f(mo1206i));
                }
                if (c0583w1 != null && !c0583w1.m1246m0()) {
                    return;
                }
                AbstractC2088a.m3436g(mo662j, m3441l);
            } catch (Throwable th) {
                if (c0583w1 == null || c0583w1.m1246m0()) {
                    AbstractC2088a.m3436g(mo662j, m3441l);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m1205h(th2);
        }
    }

    /* renamed from: b */
    public void mo1201b(CancellationException cancellationException) {
    }

    /* renamed from: f */
    public Object mo1204f(Object obj) {
        return obj;
    }
}
