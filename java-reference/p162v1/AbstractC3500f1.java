package p162v1;

import p001a0.C0068q2;
import p010b1.InterfaceC0267e;
import p019c1.C0364h;
import p019c1.C0368l;
import p019c1.C0377u;
import p019c1.InterfaceC0361e;
import p019c1.InterfaceC0372p;
import p028d2.InterfaceC0478k;
import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p101n0.C2705e;
import p102n1.InterfaceC2711d;
import p117p1.C2874y;
import p131r1.C3025a;
import p139s1.AbstractC3088a;
import p146t1.InterfaceC3242x;
import p154u1.InterfaceC3347c;
import p154u1.InterfaceC3349e;
import p154u1.InterfaceC3350f;
import p160v.C3404d;
import p170w1.C3728t;
import p170w1.C3743x0;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.f1 */
/* loaded from: classes.dex */
public abstract class AbstractC3500f1 {

    /* renamed from: a */
    public static final C2182b0 f16858a;

    static {
        C2182b0 c2182b0 = AbstractC2202l0.f12710a;
        f16858a = new C2182b0();
    }

    /* renamed from: a */
    public static final void m5387a(AbstractC3809q abstractC3809q, int i7, int i8) {
        if (abstractC3809q instanceof AbstractC3519m) {
            AbstractC3519m abstractC3519m = (AbstractC3519m) abstractC3809q;
            int i9 = abstractC3519m.f16961s;
            m5388b(abstractC3809q, i9 & i7, i8);
            int i10 = (~i9) & i7;
            for (AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
                m5387a(abstractC3809q2, i10, i8);
            }
            return;
        }
        m5388b(abstractC3809q, i7 & abstractC3809q.f17994g, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final void m5388b(AbstractC3809q abstractC3809q, int i7, int i8) {
        if (i8 != 0 || abstractC3809q.mo570z0()) {
            if ((i7 & 2) != 0 && (abstractC3809q instanceof InterfaceC3549w)) {
                AbstractC3498f.m5374n((InterfaceC3549w) abstractC3809q);
                if (i8 == 2) {
                    AbstractC3498f.m5380t(abstractC3809q, 2).m5346i1();
                }
            }
            if ((i7 & 128) != 0 && (abstractC3809q instanceof InterfaceC3546v) && i8 != 2) {
                AbstractC3498f.m5382v(abstractC3809q).m5403E();
            }
            if ((i7 & 256) != 0 && (abstractC3809q instanceof InterfaceC3525o)) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        AbstractC3498f.m5382v(abstractC3809q).m5426d0(r0.f16882S - 1);
                    }
                } else {
                    C3502g0 m5382v = AbstractC3498f.m5382v(abstractC3809q);
                    m5382v.m5426d0(m5382v.f16882S + 1);
                }
                if (i8 != 2) {
                    C3502g0 m5382v2 = AbstractC3498f.m5382v(abstractC3809q);
                    if (m5382v2.f16882S != 0 && !m5382v2.m5442p() && !m5382v2.m5443q() && !m5382v2.f16881R) {
                        C3728t c3728t = (C3728t) AbstractC3511j0.m5464a(m5382v2);
                        C0068q2 c0068q2 = c3728t.f17730S.f17055e;
                        c0068q2.getClass();
                        if (m5382v2.f16882S > 0) {
                            ((C2705e) c0068q2.f344f).m4300b(m5382v2);
                            m5382v2.f16881R = true;
                        }
                        c3728t.m5732G(null);
                    }
                }
            }
            if ((i7 & 4) != 0 && (abstractC3809q instanceof InterfaceC3522n)) {
                AbstractC3498f.m5373m((InterfaceC3522n) abstractC3809q);
            }
            if ((i7 & 8) != 0 && (abstractC3809q instanceof InterfaceC3551w1)) {
                AbstractC3498f.m5382v(abstractC3809q).f16900u = true;
            }
            if ((i7 & 64) != 0 && (abstractC3809q instanceof InterfaceC3533q1)) {
                C3514k0 c3514k0 = AbstractC3498f.m5382v((InterfaceC3533q1) abstractC3809q).f16873J;
                c3514k0.f16953p.f17098v = true;
                C3541t0 c3541t0 = c3514k0.f16954q;
                if (c3541t0 != null) {
                    c3541t0.f17021A = true;
                }
            }
            if ((i7 & 2048) != 0 && (abstractC3809q instanceof InterfaceC0372p)) {
                InterfaceC0372p interfaceC0372p = (InterfaceC0372p) abstractC3809q;
                C3501g.f16860b = null;
                interfaceC0372p.mo842w0(C3501g.f16859a);
                if (C3501g.f16860b != null) {
                    AbstractC3809q abstractC3809q2 = (AbstractC3809q) interfaceC0372p;
                    if (!abstractC3809q2.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitChildren called on an unattached node");
                    }
                    C2705e c2705e = new C2705e(new AbstractC3809q[16]);
                    AbstractC3809q abstractC3809q3 = abstractC3809q2.f17992e;
                    AbstractC3809q abstractC3809q4 = abstractC3809q3.f17997j;
                    if (abstractC3809q4 == null) {
                        AbstractC3498f.m5362b(c2705e, abstractC3809q3);
                    } else {
                        c2705e.m4300b(abstractC3809q4);
                    }
                    while (true) {
                        int i9 = c2705e.f14519g;
                        if (i9 == 0) {
                            break;
                        }
                        AbstractC3809q abstractC3809q5 = (AbstractC3809q) c2705e.m4309k(i9 - 1);
                        if ((abstractC3809q5.f17995h & 1024) == 0) {
                            AbstractC3498f.m5362b(c2705e, abstractC3809q5);
                        } else {
                            while (true) {
                                if (abstractC3809q5 == null) {
                                    break;
                                }
                                if ((abstractC3809q5.f17994g & 1024) != 0) {
                                    C2705e c2705e2 = null;
                                    while (abstractC3809q5 != null) {
                                        if (abstractC3809q5 instanceof C0377u) {
                                            C0377u c0377u = (C0377u) abstractC3809q5;
                                            C0364h c0364h = ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1241d;
                                            if (c0364h.f1232c.m3599a(c0377u)) {
                                                c0364h.m829a();
                                            }
                                        } else if ((abstractC3809q5.f17994g & 1024) != 0 && (abstractC3809q5 instanceof AbstractC3519m)) {
                                            int i10 = 0;
                                            for (AbstractC3809q abstractC3809q6 = ((AbstractC3519m) abstractC3809q5).f16962t; abstractC3809q6 != null; abstractC3809q6 = abstractC3809q6.f17997j) {
                                                if ((abstractC3809q6.f17994g & 1024) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        abstractC3809q5 = abstractC3809q6;
                                                    } else {
                                                        if (c2705e2 == null) {
                                                            c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                        }
                                                        if (abstractC3809q5 != null) {
                                                            c2705e2.m4300b(abstractC3809q5);
                                                            abstractC3809q5 = null;
                                                        }
                                                        c2705e2.m4300b(abstractC3809q6);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        abstractC3809q5 = AbstractC3498f.m5366f(c2705e2);
                                    }
                                } else {
                                    abstractC3809q5 = abstractC3809q5.f17997j;
                                }
                            }
                        }
                    }
                }
            }
            if ((i7 & 4096) != 0 && (abstractC3809q instanceof InterfaceC0361e)) {
                InterfaceC0361e interfaceC0361e = (InterfaceC0361e) abstractC3809q;
                C0364h c0364h2 = ((C0368l) ((C3728t) AbstractC3498f.m5383w(interfaceC0361e)).getFocusOwner()).f1241d;
                if (c0364h2.f1233d.m3599a(interfaceC0361e)) {
                    c0364h2.m829a();
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m5389c(AbstractC3809q abstractC3809q) {
        if (!abstractC3809q.f18005r) {
            AbstractC3088a.m4750b("autoInvalidateUpdatedNode called on unattached node");
        }
        m5387a(abstractC3809q, -1, 0);
    }

    /* renamed from: d */
    public static final int m5390d(InterfaceC3808p interfaceC3808p) {
        int i7;
        if (interfaceC3808p instanceof InterfaceC3242x) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        if (interfaceC3808p instanceof InterfaceC0267e) {
            i7 |= 4;
        }
        if (interfaceC3808p instanceof InterfaceC0478k) {
            i7 |= 8;
        }
        if (interfaceC3808p instanceof C2874y) {
            i7 |= 16;
        }
        if ((interfaceC3808p instanceof InterfaceC3347c) || (interfaceC3808p instanceof InterfaceC3350f)) {
            i7 |= 32;
        }
        if (interfaceC3808p instanceof C3404d) {
            i7 |= 256;
        }
        if (interfaceC3808p instanceof C3743x0) {
            return 524288 | i7;
        }
        return i7;
    }

    /* renamed from: e */
    public static final int m5391e(AbstractC3809q abstractC3809q) {
        int i7;
        int i8 = abstractC3809q.f17994g;
        if (i8 != 0) {
            return i8;
        }
        Class<?> cls = abstractC3809q.getClass();
        C2182b0 c2182b0 = f16858a;
        int m3551d = c2182b0.m3551d(cls);
        if (m3551d >= 0) {
            return c2182b0.f12623c[m3551d];
        }
        if (abstractC3809q instanceof InterfaceC3549w) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        if (abstractC3809q instanceof InterfaceC3522n) {
            i7 |= 4;
        }
        if (abstractC3809q instanceof InterfaceC3551w1) {
            i7 |= 8;
        }
        if (abstractC3809q instanceof InterfaceC3539s1) {
            i7 |= 16;
        }
        if (abstractC3809q instanceof InterfaceC3349e) {
            i7 |= 32;
        }
        if (abstractC3809q instanceof InterfaceC3533q1) {
            i7 |= 64;
        }
        if (abstractC3809q instanceof InterfaceC3546v) {
            i7 |= 128;
        }
        if (abstractC3809q instanceof InterfaceC3525o) {
            i7 |= 256;
        }
        if (abstractC3809q instanceof C0377u) {
            i7 |= 1024;
        }
        if (abstractC3809q instanceof InterfaceC0372p) {
            i7 |= 2048;
        }
        if (abstractC3809q instanceof InterfaceC0361e) {
            i7 |= 4096;
        }
        if (abstractC3809q instanceof InterfaceC2711d) {
            i7 |= 8192;
        }
        if (abstractC3809q instanceof C3025a) {
            i7 |= 16384;
        }
        if (abstractC3809q instanceof InterfaceC3513k) {
            i7 |= 32768;
        }
        if (abstractC3809q instanceof InterfaceC3487b2) {
            i7 |= 262144;
        }
        if (abstractC3809q instanceof C3743x0) {
            i7 |= 524288;
        }
        c2182b0.m3555h(i7, cls);
        return i7;
    }

    /* renamed from: f */
    public static final int m5392f(AbstractC3809q abstractC3809q) {
        if (abstractC3809q instanceof AbstractC3519m) {
            AbstractC3519m abstractC3519m = (AbstractC3519m) abstractC3809q;
            int i7 = abstractC3519m.f16961s;
            for (AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
                i7 |= m5392f(abstractC3809q2);
            }
            return i7;
        }
        return m5391e(abstractC3809q);
    }

    /* renamed from: g */
    public static final boolean m5393g(int i7) {
        if ((i7 & 128) != 0) {
            return true;
        }
        return false;
    }
}
