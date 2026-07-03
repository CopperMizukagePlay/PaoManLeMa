package p178x2;

import p065i2.AbstractC2064e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x2.e */
/* loaded from: classes.dex */
public final class C3818e extends AbstractC2064e {
    @Override // p065i2.AbstractC2064e
    /* renamed from: C */
    public final void mo3255C(C3819f c3819f, C3819f c3819f2) {
        c3819f.f18021b = c3819f2;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: D */
    public final void mo3256D(C3819f c3819f, Thread thread) {
        c3819f.f18020a = thread;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: i */
    public final boolean mo3257i(AbstractFutureC3820g abstractFutureC3820g, C3816c c3816c) {
        C3816c c3816c2 = C3816c.f18012b;
        synchronized (abstractFutureC3820g) {
            try {
                if (abstractFutureC3820g.f18027f == c3816c) {
                    abstractFutureC3820g.f18027f = c3816c2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: j */
    public final boolean mo3258j(AbstractFutureC3820g abstractFutureC3820g, Object obj, Object obj2) {
        synchronized (abstractFutureC3820g) {
            try {
                if (abstractFutureC3820g.f18026e == obj) {
                    abstractFutureC3820g.f18026e = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: k */
    public final boolean mo3259k(AbstractFutureC3820g abstractFutureC3820g, C3819f c3819f, C3819f c3819f2) {
        synchronized (abstractFutureC3820g) {
            try {
                if (abstractFutureC3820g.f18028g == c3819f) {
                    abstractFutureC3820g.f18028g = c3819f2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
