package p122q;

import p018c0.C0334d;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0467e;
import p032d6.AbstractC0525d0;
import p067i4.AbstractC2072e;
import p101n0.C2705e;
import p140s2.C3102l;
import p146t1.InterfaceC3238v;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3546v;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.j */
/* loaded from: classes.dex */
public final class C2915j extends AbstractC3809q implements InterfaceC3546v, InterfaceC3513k {

    /* renamed from: B */
    public boolean f15179B;

    /* renamed from: s */
    public EnumC2931o0 f15180s;

    /* renamed from: t */
    public final C2929n1 f15181t;

    /* renamed from: u */
    public boolean f15182u;

    /* renamed from: v */
    public InterfaceC2900e f15183v;

    /* renamed from: x */
    public InterfaceC3238v f15185x;

    /* renamed from: y */
    public C0465c f15186y;

    /* renamed from: z */
    public boolean f15187z;

    /* renamed from: w */
    public final C2891b f15184w = new C2891b(0);

    /* renamed from: A */
    public long f15178A = 0;

    public C2915j(EnumC2931o0 enumC2931o0, C2929n1 c2929n1, boolean z7, InterfaceC2900e interfaceC2900e) {
        this.f15180s = enumC2931o0;
        this.f15181t = c2929n1;
        this.f15182u = z7;
        this.f15183v = interfaceC2900e;
    }

    /* renamed from: K0 */
    public static final float m4582K0(C2915j c2915j, InterfaceC2900e interfaceC2900e) {
        C0465c c0465c;
        int compare;
        if (!C3102l.m4790a(c2915j.f15178A, 0L)) {
            C2705e c2705e = c2915j.f15184w.f15099a;
            int i7 = c2705e.f14519g;
            C0465c c0465c2 = null;
            if (i7 > 0) {
                int i8 = i7 - 1;
                Object[] objArr = c2705e.f14517e;
                c0465c = null;
                while (true) {
                    C0465c c0465c3 = (C0465c) ((C2912i) objArr[i8]).f15174a.mo52a();
                    if (c0465c3 != null) {
                        long m1015b = c0465c3.m1015b();
                        long m3347y = AbstractC2072e.m3347y(c2915j.f15178A);
                        int ordinal = c2915j.f15180s.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                compare = Float.compare(C0467e.m1026d(m1015b), C0467e.m1026d(m3347y));
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            compare = Float.compare(C0467e.m1024b(m1015b), C0467e.m1024b(m3347y));
                        }
                        if (compare <= 0) {
                            c0465c = c0465c3;
                        } else if (c0465c == null) {
                            c0465c = c0465c3;
                        }
                    }
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                }
            } else {
                c0465c = null;
            }
            if (c0465c == null) {
                if (c2915j.f15187z) {
                    c0465c2 = c2915j.m4583L0();
                }
                if (c0465c2 == null) {
                    return 0.0f;
                }
                c0465c = c0465c2;
            }
            long m3347y2 = AbstractC2072e.m3347y(c2915j.f15178A);
            int ordinal2 = c2915j.f15180s.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    float f7 = c0465c.f1625a;
                    return interfaceC2900e.mo4570a(f7, c0465c.f1627c - f7, C0467e.m1026d(m3347y2));
                }
                throw new RuntimeException();
            }
            float f8 = c0465c.f1626b;
            return interfaceC2900e.mo4570a(f8, c0465c.f1628d - f8, C0467e.m1024b(m3347y2));
        }
        return 0.0f;
    }

    /* renamed from: L0 */
    public final C0465c m4583L0() {
        if (this.f18005r) {
            AbstractC3497e1 m5381u = AbstractC3498f.m5381u(this);
            InterfaceC3238v interfaceC3238v = this.f15185x;
            if (interfaceC3238v != null) {
                if (!interfaceC3238v.mo4923M()) {
                    interfaceC3238v = null;
                }
                if (interfaceC3238v != null) {
                    return m5381u.mo4934j(interfaceC3238v, false);
                }
            }
        }
        return null;
    }

    /* renamed from: M0 */
    public final boolean m4584M0(C0465c c0465c, long j6) {
        long m4586O0 = m4586O0(c0465c, j6);
        if (Math.abs(C0464b.m1008d(m4586O0)) <= 0.5f && Math.abs(C0464b.m1009e(m4586O0)) <= 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public final void m4585N0() {
        InterfaceC2900e interfaceC2900e = this.f15183v;
        if (interfaceC2900e == null) {
            interfaceC2900e = (InterfaceC2900e) AbstractC3498f.m5369i(this, AbstractC2909h.f15160a);
        }
        InterfaceC2900e interfaceC2900e2 = interfaceC2900e;
        if (!this.f15179B) {
            AbstractC0525d0.m1141s(m5830y0(), null, new C0334d(this, new C2890a2(interfaceC2900e2.mo4571b()), interfaceC2900e2, null, 22), 1);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running");
    }

    /* renamed from: O0 */
    public final long m4586O0(C0465c c0465c, long j6) {
        long m3347y = AbstractC2072e.m3347y(j6);
        int ordinal = this.f15180s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                InterfaceC2900e interfaceC2900e = this.f15183v;
                if (interfaceC2900e == null) {
                    interfaceC2900e = (InterfaceC2900e) AbstractC3498f.m5369i(this, AbstractC2909h.f15160a);
                }
                float f7 = c0465c.f1625a;
                return AbstractC3784a.m5797a(interfaceC2900e.mo4570a(f7, c0465c.f1627c - f7, C0467e.m1026d(m3347y)), 0.0f);
            }
            throw new RuntimeException();
        }
        InterfaceC2900e interfaceC2900e2 = this.f15183v;
        if (interfaceC2900e2 == null) {
            interfaceC2900e2 = (InterfaceC2900e) AbstractC3498f.m5369i(this, AbstractC2909h.f15160a);
        }
        float f8 = c0465c.f1626b;
        return AbstractC3784a.m5797a(0.0f, interfaceC2900e2.mo4570a(f8, c0465c.f1628d - f8, C0467e.m1024b(m3347y)));
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: r */
    public final void mo205r(long j6) {
        int m5101f;
        C0465c m4583L0;
        long j7 = this.f15178A;
        this.f15178A = j6;
        int ordinal = this.f15180s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                m5101f = AbstractC3367j.m5101f((int) (j6 >> 32), (int) (j7 >> 32));
            } else {
                throw new RuntimeException();
            }
        } else {
            m5101f = AbstractC3367j.m5101f((int) (j6 & 4294967295L), (int) (4294967295L & j7));
        }
        if (m5101f < 0 && (m4583L0 = m4583L0()) != null) {
            C0465c c0465c = this.f15186y;
            if (c0465c == null) {
                c0465c = m4583L0;
            }
            if (!this.f15179B && !this.f15187z && m4584M0(c0465c, j7) && !m4584M0(m4583L0, j6)) {
                this.f15187z = true;
                m4585N0();
            }
            this.f15186y = m4583L0;
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
