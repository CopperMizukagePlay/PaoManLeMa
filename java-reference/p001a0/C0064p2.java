package p001a0;

import p027d1.C0464b;
import p027d1.C0465c;
import p050g2.C1598l0;
import p146t1.InterfaceC3238v;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.p2 */
/* loaded from: classes.dex */
public final class C0064p2 {

    /* renamed from: a */
    public final C1598l0 f322a;

    /* renamed from: b */
    public InterfaceC3238v f323b = null;

    /* renamed from: c */
    public InterfaceC3238v f324c;

    public C0064p2(C1598l0 c1598l0, InterfaceC3238v interfaceC3238v) {
        this.f322a = c1598l0;
        this.f324c = interfaceC3238v;
    }

    /* renamed from: a */
    public final long m126a(long j6) {
        C0465c c0465c;
        InterfaceC3238v interfaceC3238v = this.f323b;
        C0465c c0465c2 = C0465c.f1624e;
        if (interfaceC3238v != null) {
            if (interfaceC3238v.mo4923M()) {
                InterfaceC3238v interfaceC3238v2 = this.f324c;
                if (interfaceC3238v2 != null) {
                    c0465c = interfaceC3238v2.mo4934j(interfaceC3238v, true);
                } else {
                    c0465c = null;
                }
            } else {
                c0465c = c0465c2;
            }
            if (c0465c != null) {
                c0465c2 = c0465c;
            }
        }
        float m1008d = C0464b.m1008d(j6);
        float f7 = c0465c2.f1625a;
        if (m1008d >= f7) {
            float m1008d2 = C0464b.m1008d(j6);
            f7 = c0465c2.f1627c;
            if (m1008d2 <= f7) {
                f7 = C0464b.m1008d(j6);
            }
        }
        float m1009e = C0464b.m1009e(j6);
        float f8 = c0465c2.f1626b;
        if (m1009e >= f8) {
            float m1009e2 = C0464b.m1009e(j6);
            f8 = c0465c2.f1628d;
            if (m1009e2 <= f8) {
                f8 = C0464b.m1009e(j6);
            }
        }
        return AbstractC3784a.m5797a(f7, f8);
    }

    /* renamed from: b */
    public final int m127b(long j6, boolean z7) {
        if (z7) {
            j6 = m126a(j6);
        }
        return this.f322a.f10289b.m2602e(m129d(j6));
    }

    /* renamed from: c */
    public final boolean m128c(long j6) {
        long m129d = m129d(m126a(j6));
        float m1009e = C0464b.m1009e(m129d);
        C1598l0 c1598l0 = this.f322a;
        int m2600c = c1598l0.f10289b.m2600c(m1009e);
        if (C0464b.m1008d(m129d) >= c1598l0.m2579f(m2600c) && C0464b.m1008d(m129d) <= c1598l0.m2580g(m2600c)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final long m129d(long j6) {
        InterfaceC3238v interfaceC3238v;
        InterfaceC3238v interfaceC3238v2 = this.f323b;
        if (interfaceC3238v2 != null) {
            InterfaceC3238v interfaceC3238v3 = null;
            if (!interfaceC3238v2.mo4923M()) {
                interfaceC3238v2 = null;
            }
            if (interfaceC3238v2 != null && (interfaceC3238v = this.f324c) != null) {
                if (interfaceC3238v.mo4923M()) {
                    interfaceC3238v3 = interfaceC3238v;
                }
                if (interfaceC3238v3 != null) {
                    return interfaceC3238v2.mo4928X(interfaceC3238v3, j6);
                }
                return j6;
            }
            return j6;
        }
        return j6;
    }

    /* renamed from: e */
    public final long m130e(long j6) {
        InterfaceC3238v interfaceC3238v;
        InterfaceC3238v interfaceC3238v2 = this.f323b;
        if (interfaceC3238v2 != null) {
            InterfaceC3238v interfaceC3238v3 = null;
            if (!interfaceC3238v2.mo4923M()) {
                interfaceC3238v2 = null;
            }
            if (interfaceC3238v2 != null && (interfaceC3238v = this.f324c) != null) {
                if (interfaceC3238v.mo4923M()) {
                    interfaceC3238v3 = interfaceC3238v;
                }
                if (interfaceC3238v3 != null) {
                    return interfaceC3238v3.mo4928X(interfaceC3238v2, j6);
                }
                return j6;
            }
            return j6;
        }
        return j6;
    }
}
