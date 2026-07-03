package p032d6;

import p053g5.C1687f;
import p069i6.AbstractC2088a;
import p069i6.C2103p;
import p082k5.C2314d;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.w1 */
/* loaded from: classes.dex */
public final class C0583w1 extends C2103p {

    /* renamed from: i */
    public final ThreadLocal f1937i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0583w1(InterfaceC2313c interfaceC2313c, InterfaceC2318h interfaceC2318h) {
        super(interfaceC2313c, r0);
        InterfaceC2318h interfaceC2318h2;
        C0586x1 c0586x1 = C0586x1.f1940e;
        if (interfaceC2318h.mo853h(c0586x1) == null) {
            interfaceC2318h2 = interfaceC2318h.mo855z(c0586x1);
        } else {
            interfaceC2318h2 = interfaceC2318h;
        }
        this.f1937i = new ThreadLocal();
        if (!(interfaceC2313c.mo662j().mo853h(C2314d.f13272e) instanceof AbstractC0581w)) {
            Object m3441l = AbstractC2088a.m3441l(interfaceC2318h, null);
            AbstractC2088a.m3436g(interfaceC2318h, m3441l);
            m1247n0(interfaceC2318h, m3441l);
        }
    }

    @Override // p069i6.C2103p, p032d6.C0541i1
    /* renamed from: E */
    public final void mo1171E(Object obj) {
        if (this.threadLocalIsSet) {
            C1687f c1687f = (C1687f) this.f1937i.get();
            if (c1687f != null) {
                AbstractC2088a.m3436g((InterfaceC2318h) c1687f.f10471e, c1687f.f10472f);
            }
            this.f1937i.remove();
        }
        Object m1143u = AbstractC0525d0.m1143u(obj);
        InterfaceC2313c interfaceC2313c = this.f12378h;
        InterfaceC2318h mo662j = interfaceC2313c.mo662j();
        C0583w1 c0583w1 = null;
        Object m3441l = AbstractC2088a.m3441l(mo662j, null);
        if (m3441l != AbstractC2088a.f12343d) {
            c0583w1 = AbstractC0525d0.m1148z(interfaceC2313c, mo662j, m3441l);
        }
        try {
            this.f12378h.mo663n(m1143u);
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
    }

    /* renamed from: m0 */
    public final boolean m1246m0() {
        boolean z7;
        if (this.threadLocalIsSet && this.f1937i.get() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f1937i.remove();
        return !z7;
    }

    /* renamed from: n0 */
    public final void m1247n0(InterfaceC2318h interfaceC2318h, Object obj) {
        this.threadLocalIsSet = true;
        this.f1937i.set(new C1687f(interfaceC2318h, obj));
    }
}
