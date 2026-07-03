package p019c1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import p001a0.C0037j;
import p001a0.C0053n;
import p027d1.C0465c;
import p060h5.AbstractC1804l;
import p073j2.AbstractC2168e;
import p101n0.C2705e;
import p122q.C2891b;
import p139s1.AbstractC3088a;
import p146t1.AbstractC3191c1;
import p146t1.AbstractC3198f;
import p150t5.InterfaceC3279c;
import p154u1.C3352h;
import p158u5.AbstractC3367j;
import p160v.C3426o;
import p160v.C3430q;
import p160v.C3432r;
import p160v.InterfaceC3434s;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p170w1.C3728t;
import p177x0.AbstractC3809q;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0362f {

    /* renamed from: a */
    public static final int[] f1228a = new int[2];

    /* renamed from: A */
    public static final boolean m798A(int i7, C0037j c0037j, C0377u c0377u, C0465c c0465c) {
        C0377u m810h;
        C2705e c2705e = new C2705e(new C0377u[16]);
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitChildren called on an unattached node");
        }
        C2705e c2705e2 = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q = c0377u.f17992e;
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
        if (abstractC3809q2 == null) {
            AbstractC3498f.m5362b(c2705e2, abstractC3809q);
        } else {
            c2705e2.m4300b(abstractC3809q2);
        }
        while (true) {
            int i8 = c2705e2.f14519g;
            if (i8 == 0) {
                break;
            }
            AbstractC3809q abstractC3809q3 = (AbstractC3809q) c2705e2.m4309k(i8 - 1);
            if ((abstractC3809q3.f17995h & 1024) == 0) {
                AbstractC3498f.m5362b(c2705e2, abstractC3809q3);
            } else {
                while (true) {
                    if (abstractC3809q3 == null) {
                        break;
                    }
                    if ((abstractC3809q3.f17994g & 1024) != 0) {
                        C2705e c2705e3 = null;
                        while (abstractC3809q3 != null) {
                            if (abstractC3809q3 instanceof C0377u) {
                                C0377u c0377u2 = (C0377u) abstractC3809q3;
                                if (c0377u2.f18005r) {
                                    c2705e.m4300b(c0377u2);
                                }
                            } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                                int i9 = 0;
                                for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                    if ((abstractC3809q4.f17994g & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC3809q3 = abstractC3809q4;
                                        } else {
                                            if (c2705e3 == null) {
                                                c2705e3 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q3 != null) {
                                                c2705e3.m4300b(abstractC3809q3);
                                                abstractC3809q3 = null;
                                            }
                                            c2705e3.m4300b(abstractC3809q4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC3809q3 = AbstractC3498f.m5366f(c2705e3);
                        }
                    } else {
                        abstractC3809q3 = abstractC3809q3.f17997j;
                    }
                }
            }
        }
        while (c2705e.f14519g != 0 && (m810h = m810h(c2705e, c0465c, i7)) != null) {
            if (m810h.m846L0().f1250a) {
                return ((Boolean) c0037j.mo23f(m810h)).booleanValue();
            }
            if (m814l(i7, c0037j, m810h, c0465c)) {
                return true;
            }
            c2705e.m4308j(m810h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m799B(C0377u c0377u, C0377u c0377u2, int i7, C0037j c0037j) {
        AbstractC3809q abstractC3809q;
        C3502g0 m5382v;
        C3490c1 c3490c1;
        if (c0377u.m847M0() == EnumC0376t.f1267f) {
            C0377u[] c0377uArr = new C0377u[16];
            if (!c0377u.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitChildren called on an unattached node");
            }
            C2705e c2705e = new C2705e(new AbstractC3809q[16]);
            AbstractC3809q abstractC3809q2 = c0377u.f17992e;
            AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j;
            if (abstractC3809q3 == null) {
                AbstractC3498f.m5362b(c2705e, abstractC3809q2);
            } else {
                c2705e.m4300b(abstractC3809q3);
            }
            int i8 = 0;
            while (true) {
                int i9 = c2705e.f14519g;
                abstractC3809q = null;
                if (i9 == 0) {
                    break;
                }
                AbstractC3809q abstractC3809q4 = (AbstractC3809q) c2705e.m4309k(i9 - 1);
                if ((abstractC3809q4.f17995h & 1024) == 0) {
                    AbstractC3498f.m5362b(c2705e, abstractC3809q4);
                } else {
                    while (true) {
                        if (abstractC3809q4 == null) {
                            break;
                        }
                        if ((abstractC3809q4.f17994g & 1024) != 0) {
                            C2705e c2705e2 = null;
                            while (abstractC3809q4 != null) {
                                if (abstractC3809q4 instanceof C0377u) {
                                    C0377u c0377u3 = (C0377u) abstractC3809q4;
                                    int i10 = i8 + 1;
                                    if (c0377uArr.length < i10) {
                                        int length = c0377uArr.length;
                                        ?? r11 = new Object[Math.max(i10, length * 2)];
                                        System.arraycopy(c0377uArr, 0, r11, 0, length);
                                        c0377uArr = r11;
                                    }
                                    c0377uArr[i8] = c0377u3;
                                    i8 = i10;
                                } else if ((abstractC3809q4.f17994g & 1024) != 0 && (abstractC3809q4 instanceof AbstractC3519m)) {
                                    int i11 = 0;
                                    for (AbstractC3809q abstractC3809q5 = ((AbstractC3519m) abstractC3809q4).f16962t; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                                        if ((abstractC3809q5.f17994g & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC3809q4 = abstractC3809q5;
                                            } else {
                                                if (c2705e2 == null) {
                                                    c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q4 != null) {
                                                    c2705e2.m4300b(abstractC3809q4);
                                                    abstractC3809q4 = null;
                                                }
                                                c2705e2.m4300b(abstractC3809q5);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC3809q4 = AbstractC3498f.m5366f(c2705e2);
                            }
                        } else {
                            abstractC3809q4 = abstractC3809q4.f17997j;
                        }
                    }
                }
            }
            AbstractC1804l.m3030W(c0377uArr, C0378v.f1275e, 0, i8);
            if (i7 == 1) {
                C3879d m3513G = AbstractC2168e.m3513G(0, i8);
                int i12 = m3513G.f18163e;
                int i13 = m3513G.f18164f;
                if (i12 <= i13) {
                    boolean z7 = false;
                    while (true) {
                        if (z7) {
                            C0377u c0377u4 = c0377uArr[i12];
                            if (m820r(c0377u4) && m813k(c0377u4, c0037j)) {
                                break;
                            }
                        }
                        if (AbstractC3367j.m5096a(c0377uArr[i12], c0377u2)) {
                            z7 = true;
                        }
                        if (i12 == i13) {
                            break;
                        }
                        i12++;
                    }
                    return true;
                }
                if (i7 != 1 && c0377u.m846L0().f1250a) {
                    if (!c0377u.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                    }
                    AbstractC3809q abstractC3809q6 = c0377u.f17992e.f17996i;
                    m5382v = AbstractC3498f.m5382v(c0377u);
                    loop5: while (true) {
                        if (m5382v == null) {
                            break;
                        }
                        if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                            while (abstractC3809q6 != null) {
                                if ((abstractC3809q6.f17994g & 1024) != 0) {
                                    AbstractC3809q abstractC3809q7 = abstractC3809q6;
                                    C2705e c2705e3 = null;
                                    while (abstractC3809q7 != null) {
                                        if (abstractC3809q7 instanceof C0377u) {
                                            abstractC3809q = abstractC3809q7;
                                            break loop5;
                                        }
                                        if ((abstractC3809q7.f17994g & 1024) != 0 && (abstractC3809q7 instanceof AbstractC3519m)) {
                                            int i14 = 0;
                                            for (AbstractC3809q abstractC3809q8 = ((AbstractC3519m) abstractC3809q7).f16962t; abstractC3809q8 != null; abstractC3809q8 = abstractC3809q8.f17997j) {
                                                if ((abstractC3809q8.f17994g & 1024) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        abstractC3809q7 = abstractC3809q8;
                                                    } else {
                                                        if (c2705e3 == null) {
                                                            c2705e3 = new C2705e(new AbstractC3809q[16]);
                                                        }
                                                        if (abstractC3809q7 != null) {
                                                            c2705e3.m4300b(abstractC3809q7);
                                                            abstractC3809q7 = null;
                                                        }
                                                        c2705e3.m4300b(abstractC3809q8);
                                                    }
                                                }
                                            }
                                            if (i14 == 1) {
                                            }
                                        }
                                        abstractC3809q7 = AbstractC3498f.m5366f(c2705e3);
                                    }
                                }
                                abstractC3809q6 = abstractC3809q6.f17996i;
                            }
                        }
                        m5382v = m5382v.m5447u();
                        if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                            abstractC3809q6 = c3490c1.f16801e;
                        } else {
                            abstractC3809q6 = null;
                        }
                    }
                    if (abstractC3809q != null) {
                        return ((Boolean) c0037j.mo23f(c0377u)).booleanValue();
                    }
                }
                return false;
            }
            if (i7 == 2) {
                C3879d m3513G2 = AbstractC2168e.m3513G(0, i8);
                int i15 = m3513G2.f18163e;
                int i16 = m3513G2.f18164f;
                if (i15 <= i16) {
                    boolean z8 = false;
                    while (true) {
                        if (z8) {
                            C0377u c0377u5 = c0377uArr[i16];
                            if (m820r(c0377u5) && m803a(c0377u5, c0037j)) {
                                break;
                            }
                        }
                        if (AbstractC3367j.m5096a(c0377uArr[i16], c0377u2)) {
                            z8 = true;
                        }
                        if (i16 == i15) {
                            break;
                        }
                        i16--;
                    }
                    return true;
                }
                if (i7 != 1) {
                    if (!c0377u.f17992e.f18005r) {
                    }
                    AbstractC3809q abstractC3809q62 = c0377u.f17992e.f17996i;
                    m5382v = AbstractC3498f.m5382v(c0377u);
                    loop5: while (true) {
                        if (m5382v == null) {
                        }
                    }
                    if (abstractC3809q != null) {
                    }
                }
                return false;
            }
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }

    /* renamed from: C */
    public static final Integer m800C(int i7) {
        if (i7 == 5) {
            return 33;
        }
        if (i7 == 6) {
            return 130;
        }
        if (i7 == 3) {
            return 17;
        }
        if (i7 == 4) {
            return 66;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 1;
        }
        return null;
    }

    /* renamed from: D */
    public static final C0360d m801D(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 17) {
                    if (i7 != 33) {
                        if (i7 != 66) {
                            if (i7 != 130) {
                                return null;
                            }
                            return new C0360d(6);
                        }
                        return new C0360d(4);
                    }
                    return new C0360d(5);
                }
                return new C0360d(3);
            }
            return new C0360d(1);
        }
        return new C0360d(2);
    }

    /* renamed from: E */
    public static final Boolean m802E(int i7, C0037j c0037j, C0377u c0377u, C0465c c0465c) {
        int ordinal = c0377u.m847M0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (c0377u.m846L0().f1250a) {
                            return (Boolean) c0037j.mo23f(c0377u);
                        }
                        if (c0465c == null) {
                            return Boolean.valueOf(m811i(c0377u, i7, c0037j));
                        }
                        return Boolean.valueOf(m798A(i7, c0037j, c0377u, c0465c));
                    }
                    throw new RuntimeException();
                }
            } else {
                C0377u m816n = m816n(c0377u);
                if (m816n != null) {
                    int ordinal2 = m816n.m847M0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new RuntimeException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else {
                            Boolean m802E = m802E(i7, c0037j, m816n, c0465c);
                            if (!AbstractC3367j.m5096a(m802E, Boolean.FALSE)) {
                                return m802E;
                            }
                            if (c0465c == null) {
                                if (m816n.m847M0() == EnumC0376t.f1267f) {
                                    C0377u m809g = m809g(m816n);
                                    if (m809g != null) {
                                        c0465c = m812j(m809g);
                                    } else {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                } else {
                                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                }
                            }
                            return Boolean.valueOf(m814l(i7, c0037j, c0377u, c0465c));
                        }
                    }
                    if (c0465c == null) {
                        c0465c = m812j(m816n);
                    }
                    return Boolean.valueOf(m814l(i7, c0037j, c0377u, c0465c));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(m811i(c0377u, i7, c0037j));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m803a(C0377u c0377u, C0037j c0037j) {
        boolean z7;
        int ordinal = c0377u.m847M0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!m825w(c0377u, c0037j)) {
                            if (c0377u.m846L0().f1250a) {
                                z7 = ((Boolean) c0037j.mo23f(c0377u)).booleanValue();
                            } else {
                                z7 = false;
                            }
                            if (!z7) {
                                return false;
                            }
                        }
                        return true;
                    }
                    throw new RuntimeException();
                }
            } else {
                C0377u m816n = m816n(c0377u);
                if (m816n != null) {
                    int ordinal2 = m816n.m847M0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new RuntimeException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else if (m803a(m816n, c0037j) || m815m(c0377u, m816n, 2, c0037j) || (m816n.m846L0().f1250a && ((Boolean) c0037j.mo23f(m816n)).booleanValue())) {
                            return true;
                        }
                    }
                    return m815m(c0377u, m816n, 2, c0037j);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return m825w(c0377u, c0037j);
    }

    /* renamed from: b */
    public static final boolean m804b(C0465c c0465c, C0465c c0465c2, C0465c c0465c3, int i7) {
        float f7;
        float f8;
        boolean m805c = m805c(i7, c0465c3, c0465c);
        float f9 = c0465c3.f1626b;
        float f10 = c0465c3.f1628d;
        float f11 = c0465c3.f1625a;
        float f12 = c0465c3.f1627c;
        float f13 = c0465c.f1628d;
        float f14 = c0465c.f1626b;
        float f15 = c0465c.f1627c;
        float f16 = c0465c.f1625a;
        if (!m805c && m805c(i7, c0465c2, c0465c)) {
            if (i7 == 3) {
                if (f16 < f12) {
                    return true;
                }
            } else if (i7 == 4) {
                if (f15 > f11) {
                    return true;
                }
            } else if (i7 == 5) {
                if (f14 < f10) {
                    return true;
                }
            } else if (i7 == 6) {
                if (f13 > f9) {
                    return true;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (i7 != 3 && i7 != 4) {
                if (i7 == 3) {
                    f7 = f16 - c0465c2.f1627c;
                } else if (i7 == 4) {
                    f7 = c0465c2.f1625a - f15;
                } else if (i7 == 5) {
                    f7 = f14 - c0465c2.f1628d;
                } else if (i7 == 6) {
                    f7 = c0465c2.f1626b - f13;
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (i7 == 3) {
                    f8 = f16 - f11;
                } else if (i7 == 4) {
                    f8 = f12 - f15;
                } else if (i7 == 5) {
                    f8 = f14 - f9;
                } else if (i7 == 6) {
                    f8 = f10 - f13;
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f8 < 1.0f) {
                    f8 = 1.0f;
                }
                if (f7 < f8) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m805c(int i7, C0465c c0465c, C0465c c0465c2) {
        if (i7 == 3 || i7 == 4) {
            if (c0465c.f1628d > c0465c2.f1626b && c0465c.f1626b < c0465c2.f1628d) {
                return true;
            }
            return false;
        }
        if (i7 == 5 || i7 == 6) {
            if (c0465c.f1627c > c0465c2.f1625a && c0465c.f1625a < c0465c2.f1627c) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* renamed from: d */
    public static final C0465c m806d(View view, C3728t c3728t) {
        int[] iArr = f1228a;
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        c3728t.getLocationInWindow(iArr);
        float f7 = i7 - iArr[0];
        float f8 = i8 - iArr[1];
        return new C0465c(f7, f8, view.getWidth() + f7, view.getHeight() + f8);
    }

    /* renamed from: e */
    public static final boolean m807e(C0377u c0377u, boolean z7) {
        boolean z8;
        int ordinal = c0377u.m847M0().ordinal();
        EnumC0376t enumC0376t = EnumC0376t.f1269h;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    throw new RuntimeException();
                }
                if (z7) {
                    ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).m836g(null);
                    c0377u.m845K0(EnumC0376t.f1268g, enumC0376t);
                }
                return z7;
            }
            C0377u m816n = m816n(c0377u);
            if (m816n != null) {
                z8 = m807e(m816n, z7);
            } else {
                z8 = true;
            }
            if (z8) {
                c0377u.m845K0(EnumC0376t.f1267f, enumC0376t);
                return true;
            }
            return false;
        }
        ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).m836g(null);
        c0377u.m845K0(EnumC0376t.f1266e, enumC0376t);
        return true;
    }

    /* renamed from: f */
    public static final void m808f(C0377u c0377u, C2705e c2705e) {
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitChildren called on an unattached node");
        }
        C2705e c2705e2 = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q = c0377u.f17992e;
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
        if (abstractC3809q2 == null) {
            AbstractC3498f.m5362b(c2705e2, abstractC3809q);
        } else {
            c2705e2.m4300b(abstractC3809q2);
        }
        while (true) {
            int i7 = c2705e2.f14519g;
            if (i7 != 0) {
                AbstractC3809q abstractC3809q3 = (AbstractC3809q) c2705e2.m4309k(i7 - 1);
                if ((abstractC3809q3.f17995h & 1024) == 0) {
                    AbstractC3498f.m5362b(c2705e2, abstractC3809q3);
                } else {
                    while (true) {
                        if (abstractC3809q3 == null) {
                            break;
                        }
                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                            C2705e c2705e3 = null;
                            while (abstractC3809q3 != null) {
                                if (abstractC3809q3 instanceof C0377u) {
                                    C0377u c0377u2 = (C0377u) abstractC3809q3;
                                    if (c0377u2.f18005r && !AbstractC3498f.m5382v(c0377u2).f16883T) {
                                        if (c0377u2.m846L0().f1250a) {
                                            c2705e.m4300b(c0377u2);
                                        } else {
                                            m808f(c0377u2, c2705e);
                                        }
                                    }
                                } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                                    int i8 = 0;
                                    for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                        if ((abstractC3809q4.f17994g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                abstractC3809q3 = abstractC3809q4;
                                            } else {
                                                if (c2705e3 == null) {
                                                    c2705e3 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q3 != null) {
                                                    c2705e3.m4300b(abstractC3809q3);
                                                    abstractC3809q3 = null;
                                                }
                                                c2705e3.m4300b(abstractC3809q4);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3809q3 = AbstractC3498f.m5366f(c2705e3);
                            }
                        } else {
                            abstractC3809q3 = abstractC3809q3.f17997j;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public static final C0377u m809g(C0377u c0377u) {
        C0377u c0377u2 = ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1245h;
        if (c0377u2 != null && c0377u2.f18005r) {
            return c0377u2;
        }
        return null;
    }

    /* renamed from: h */
    public static final C0377u m810h(C2705e c2705e, C0465c c0465c, int i7) {
        C0465c m1019f;
        if (i7 == 3) {
            m1019f = c0465c.m1019f((c0465c.f1627c - c0465c.f1625a) + 1, 0.0f);
        } else if (i7 == 4) {
            m1019f = c0465c.m1019f(-((c0465c.f1627c - c0465c.f1625a) + 1), 0.0f);
        } else if (i7 == 5) {
            m1019f = c0465c.m1019f(0.0f, (c0465c.f1628d - c0465c.f1626b) + 1);
        } else if (i7 == 6) {
            m1019f = c0465c.m1019f(0.0f, -((c0465c.f1628d - c0465c.f1626b) + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        Object[] objArr = c2705e.f14517e;
        int i8 = c2705e.f14519g;
        C0377u c0377u = null;
        for (int i9 = 0; i9 < i8; i9++) {
            C0377u c0377u2 = (C0377u) objArr[i9];
            if (m820r(c0377u2)) {
                C0465c m812j = m812j(c0377u2);
                if (m817o(m812j, m1019f, c0465c, i7)) {
                    c0377u = c0377u2;
                    m1019f = m812j;
                }
            }
        }
        return c0377u;
    }

    /* renamed from: i */
    public static final boolean m811i(C0377u c0377u, int i7, InterfaceC3279c interfaceC3279c) {
        C0465c c0465c;
        Object obj;
        C2705e c2705e = new C2705e(new C0377u[16]);
        m808f(c0377u, c2705e);
        int i8 = c2705e.f14519g;
        if (i8 <= 1) {
            if (i8 == 0) {
                obj = null;
            } else {
                obj = c2705e.f14517e[0];
            }
            C0377u c0377u2 = (C0377u) obj;
            if (c0377u2 != null) {
                return ((Boolean) interfaceC3279c.mo23f(c0377u2)).booleanValue();
            }
        } else {
            if (i7 == 7) {
                i7 = 4;
            }
            if (i7 == 4 || i7 == 6) {
                C0465c m812j = m812j(c0377u);
                float f7 = m812j.f1625a;
                float f8 = m812j.f1626b;
                c0465c = new C0465c(f7, f8, f7, f8);
            } else if (i7 == 3 || i7 == 5) {
                C0465c m812j2 = m812j(c0377u);
                float f9 = m812j2.f1627c;
                float f10 = m812j2.f1628d;
                c0465c = new C0465c(f9, f10, f9, f10);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            C0377u m810h = m810h(c2705e, c0465c, i7);
            if (m810h != null) {
                return ((Boolean) interfaceC3279c.mo23f(m810h)).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final C0465c m812j(C0377u c0377u) {
        AbstractC3497e1 abstractC3497e1 = c0377u.f17999l;
        if (abstractC3497e1 != null) {
            return AbstractC3191c1.m4897h(abstractC3497e1).mo4934j(abstractC3497e1, false);
        }
        return C0465c.f1624e;
    }

    /* renamed from: k */
    public static final boolean m813k(C0377u c0377u, C0037j c0037j) {
        int ordinal = c0377u.m847M0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (c0377u.m846L0().f1250a) {
                            return ((Boolean) c0037j.mo23f(c0377u)).booleanValue();
                        }
                        return m826x(c0377u, c0037j);
                    }
                    throw new RuntimeException();
                }
            } else {
                C0377u m816n = m816n(c0377u);
                if (m816n != null) {
                    if (m813k(m816n, c0037j) || m815m(c0377u, m816n, 1, c0037j)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return m826x(c0377u, c0037j);
    }

    /* renamed from: l */
    public static final boolean m814l(int i7, C0037j c0037j, C0377u c0377u, C0465c c0465c) {
        if (m798A(i7, c0037j, c0377u, c0465c)) {
            return true;
        }
        Boolean bool = (Boolean) m828z(c0377u, i7, new C0380x(((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1245h, c0377u, c0465c, i7, c0037j, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m815m(C0377u c0377u, C0377u c0377u2, int i7, C0037j c0037j) {
        if (m799B(c0377u, c0377u2, i7, c0037j)) {
            return true;
        }
        Boolean bool = (Boolean) m828z(c0377u, i7, new C0380x(((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1245h, c0377u, c0377u2, i7, c0037j, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0377u m816n(C0377u c0377u) {
        boolean z7 = c0377u.f17992e.f18005r;
        if (z7) {
            if (!z7) {
                AbstractC3088a.m4750b("visitChildren called on an unattached node");
            }
            C2705e c2705e = new C2705e(new AbstractC3809q[16]);
            AbstractC3809q abstractC3809q = c0377u.f17992e;
            AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
            if (abstractC3809q2 == null) {
                AbstractC3498f.m5362b(c2705e, abstractC3809q);
            } else {
                c2705e.m4300b(abstractC3809q2);
            }
            loop0: while (true) {
                int i7 = c2705e.f14519g;
                if (i7 == 0) {
                    break;
                }
                AbstractC3809q abstractC3809q3 = (AbstractC3809q) c2705e.m4309k(i7 - 1);
                if ((abstractC3809q3.f17995h & 1024) == 0) {
                    AbstractC3498f.m5362b(c2705e, abstractC3809q3);
                } else {
                    while (true) {
                        if (abstractC3809q3 == null) {
                            break;
                        }
                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                            C2705e c2705e2 = null;
                            while (abstractC3809q3 != null) {
                                if (abstractC3809q3 instanceof C0377u) {
                                    C0377u c0377u2 = (C0377u) abstractC3809q3;
                                    if (c0377u2.f17992e.f18005r) {
                                        int ordinal = c0377u2.m847M0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new RuntimeException();
                                        }
                                    }
                                } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                                    int i8 = 0;
                                    for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                        if ((abstractC3809q4.f17994g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                abstractC3809q3 = abstractC3809q4;
                                            } else {
                                                if (c2705e2 == null) {
                                                    c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q3 != null) {
                                                    c2705e2.m4300b(abstractC3809q3);
                                                    abstractC3809q3 = null;
                                                }
                                                c2705e2.m4300b(abstractC3809q4);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3809q3 = AbstractC3498f.m5366f(c2705e2);
                            }
                        } else {
                            abstractC3809q3 = abstractC3809q3.f17997j;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final boolean m817o(C0465c c0465c, C0465c c0465c2, C0465c c0465c3, int i7) {
        if (m818p(i7, c0465c, c0465c3)) {
            if (m818p(i7, c0465c2, c0465c3) && !m804b(c0465c3, c0465c, c0465c2, i7)) {
                if (!m804b(c0465c3, c0465c2, c0465c, i7) && m819q(i7, c0465c3, c0465c) < m819q(i7, c0465c3, c0465c2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m818p(int i7, C0465c c0465c, C0465c c0465c2) {
        float f7 = c0465c.f1626b;
        float f8 = c0465c.f1628d;
        float f9 = c0465c.f1625a;
        float f10 = c0465c.f1627c;
        if (i7 == 3) {
            float f11 = c0465c2.f1627c;
            float f12 = c0465c2.f1625a;
            if ((f11 > f10 || f12 >= f10) && f12 > f9) {
                return true;
            }
            return false;
        }
        if (i7 == 4) {
            float f13 = c0465c2.f1625a;
            float f14 = c0465c2.f1627c;
            if ((f13 < f9 || f14 <= f9) && f14 < f10) {
                return true;
            }
            return false;
        }
        if (i7 == 5) {
            float f15 = c0465c2.f1628d;
            float f16 = c0465c2.f1626b;
            if ((f15 > f8 || f16 >= f8) && f16 > f7) {
                return true;
            }
            return false;
        }
        if (i7 == 6) {
            float f17 = c0465c2.f1626b;
            float f18 = c0465c2.f1628d;
            if ((f17 < f7 || f18 <= f7) && f18 < f8) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* renamed from: q */
    public static final long m819q(int i7, C0465c c0465c, C0465c c0465c2) {
        float f7;
        float f8;
        float f9 = c0465c2.f1626b;
        float f10 = c0465c2.f1628d;
        float f11 = c0465c2.f1625a;
        float f12 = c0465c2.f1627c;
        if (i7 == 3) {
            f7 = c0465c.f1625a - f12;
        } else if (i7 == 4) {
            f7 = f11 - c0465c.f1627c;
        } else if (i7 == 5) {
            f7 = c0465c.f1626b - f10;
        } else if (i7 == 6) {
            f7 = f9 - c0465c.f1628d;
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j6 = f7;
        if (i7 == 3 || i7 == 4) {
            float f13 = c0465c.f1626b;
            float f14 = 2;
            f8 = (((c0465c.f1628d - f13) / f14) + f13) - (((f10 - f9) / f14) + f9);
        } else if (i7 == 5 || i7 == 6) {
            float f15 = c0465c.f1625a;
            float f16 = 2;
            f8 = (((c0465c.f1627c - f15) / f16) + f15) - (((f12 - f11) / f16) + f11);
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        long j7 = f8;
        return (j7 * j7) + (13 * j6 * j6);
    }

    /* renamed from: r */
    public static final boolean m820r(C0377u c0377u) {
        C3502g0 c3502g0;
        AbstractC3497e1 abstractC3497e1;
        C3502g0 c3502g02;
        AbstractC3497e1 abstractC3497e12 = c0377u.f17999l;
        if (abstractC3497e12 != null && (c3502g0 = abstractC3497e12.f16847s) != null && c3502g0.m5408J() && (abstractC3497e1 = c0377u.f17999l) != null && (c3502g02 = abstractC3497e1.f16847s) != null && c3502g02.m5407I()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [t5.c, u5.k] */
    /* renamed from: s */
    public static final EnumC0358b m821s(C0377u c0377u, int i7) {
        int ordinal = c0377u.m847M0().ordinal();
        EnumC0358b enumC0358b = EnumC0358b.f1221e;
        if (ordinal != 0) {
            EnumC0358b enumC0358b2 = EnumC0358b.f1222f;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                } else {
                    return enumC0358b2;
                }
            } else {
                C0377u m816n = m816n(c0377u);
                if (m816n != null) {
                    EnumC0358b m821s = m821s(m816n, i7);
                    if (m821s == enumC0358b) {
                        m821s = null;
                    }
                    if (m821s == null) {
                        if (!c0377u.f1272t) {
                            c0377u.f1272t = true;
                            try {
                                C0371o m846L0 = c0377u.m846L0();
                                C0357a c0357a = new C0357a(i7);
                                InterfaceC0366j focusOwner = ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner();
                                C0377u c0377u2 = ((C0368l) focusOwner).f1245h;
                                m846L0.f1260k.mo23f(c0357a);
                                C0377u c0377u3 = ((C0368l) focusOwner).f1245h;
                                if (c0357a.f1220b) {
                                    C0373q c0373q = C0373q.f1261b;
                                    return enumC0358b2;
                                }
                                if (c0377u2 != c0377u3 && c0377u3 != null) {
                                    if (C0373q.f1263d == C0373q.f1262c) {
                                        return enumC0358b2;
                                    }
                                    return EnumC0358b.f1223g;
                                }
                                return enumC0358b;
                            } finally {
                                c0377u.f1272t = false;
                            }
                        }
                        return enumC0358b;
                    }
                    return m821s;
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
        }
        return enumC0358b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [t5.c, u5.k] */
    /* renamed from: t */
    public static final EnumC0358b m822t(C0377u c0377u, int i7) {
        if (!c0377u.f1273u) {
            c0377u.f1273u = true;
            try {
                C0371o m846L0 = c0377u.m846L0();
                C0357a c0357a = new C0357a(i7);
                InterfaceC0366j focusOwner = ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner();
                C0377u c0377u2 = ((C0368l) focusOwner).f1245h;
                m846L0.f1259j.mo23f(c0357a);
                C0377u c0377u3 = ((C0368l) focusOwner).f1245h;
                boolean z7 = c0357a.f1220b;
                EnumC0358b enumC0358b = EnumC0358b.f1222f;
                if (z7) {
                    C0373q c0373q = C0373q.f1261b;
                    return enumC0358b;
                }
                if (c0377u2 != c0377u3 && c0377u3 != null) {
                    if (C0373q.f1263d == C0373q.f1262c) {
                        return enumC0358b;
                    }
                    return EnumC0358b.f1223g;
                }
            } finally {
                c0377u.f1273u = false;
            }
        }
        return EnumC0358b.f1221e;
    }

    /* renamed from: u */
    public static final EnumC0358b m823u(C0377u c0377u, int i7) {
        EnumC0358b enumC0358b;
        AbstractC3809q abstractC3809q;
        C3490c1 c3490c1;
        int ordinal = c0377u.m847M0().ordinal();
        EnumC0358b enumC0358b2 = EnumC0358b.f1221e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!c0377u.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                        }
                        AbstractC3809q abstractC3809q2 = c0377u.f17992e.f17996i;
                        C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
                        loop0: while (true) {
                            enumC0358b = null;
                            if (m5382v != null) {
                                if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                                    while (abstractC3809q2 != null) {
                                        if ((abstractC3809q2.f17994g & 1024) != 0) {
                                            abstractC3809q = abstractC3809q2;
                                            C2705e c2705e = null;
                                            while (abstractC3809q != null) {
                                                if (abstractC3809q instanceof C0377u) {
                                                    break loop0;
                                                }
                                                if ((abstractC3809q.f17994g & 1024) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                                                    int i8 = 0;
                                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                                                            i8++;
                                                            if (i8 == 1) {
                                                                abstractC3809q = abstractC3809q3;
                                                            } else {
                                                                if (c2705e == null) {
                                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                                }
                                                                if (abstractC3809q != null) {
                                                                    c2705e.m4300b(abstractC3809q);
                                                                    abstractC3809q = null;
                                                                }
                                                                c2705e.m4300b(abstractC3809q3);
                                                            }
                                                        }
                                                    }
                                                    if (i8 == 1) {
                                                    }
                                                }
                                                abstractC3809q = AbstractC3498f.m5366f(c2705e);
                                            }
                                        }
                                        abstractC3809q2 = abstractC3809q2.f17996i;
                                    }
                                }
                                m5382v = m5382v.m5447u();
                                if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                                    abstractC3809q2 = c3490c1.f16801e;
                                } else {
                                    abstractC3809q2 = null;
                                }
                            } else {
                                abstractC3809q = null;
                                break;
                            }
                        }
                        C0377u c0377u2 = (C0377u) abstractC3809q;
                        if (c0377u2 == null) {
                            return enumC0358b2;
                        }
                        int ordinal2 = c0377u2.m847M0().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        EnumC0358b m823u = m823u(c0377u2, i7);
                                        if (m823u != enumC0358b2) {
                                            enumC0358b = m823u;
                                        }
                                        if (enumC0358b == null) {
                                            return m822t(c0377u2, i7);
                                        }
                                        return enumC0358b;
                                    }
                                    throw new RuntimeException();
                                }
                                return EnumC0358b.f1222f;
                            }
                            return m823u(c0377u2, i7);
                        }
                        return m822t(c0377u2, i7);
                    }
                    throw new RuntimeException();
                }
            } else {
                C0377u m816n = m816n(c0377u);
                if (m816n != null) {
                    return m821s(m816n, i7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
        }
        return enumC0358b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: v */
    public static final boolean m824v(C0377u c0377u) {
        C2705e c2705e;
        EnumC0376t enumC0376t;
        C3490c1 c3490c1;
        char c7;
        Boolean bool;
        C3490c1 c3490c12;
        C0368l c0368l = (C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner();
        C0377u c0377u2 = c0368l.f1245h;
        EnumC0376t m847M0 = c0377u.m847M0();
        if (c0377u2 == c0377u) {
            c0377u.m845K0(m847M0, m847M0);
            return true;
        }
        int i7 = 0;
        if (c0377u2 == null && !((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).f1238a.m5731F()) {
            return false;
        }
        char c8 = 16;
        if (c0377u2 != null) {
            c2705e = new C2705e(new C0377u[16]);
            if (!c0377u2.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitAncestors called on an unattached node");
            }
            AbstractC3809q abstractC3809q = c0377u2.f17992e.f17996i;
            C3502g0 m5382v = AbstractC3498f.m5382v(c0377u2);
            while (m5382v != null) {
                if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                    while (abstractC3809q != null) {
                        if ((abstractC3809q.f17994g & 1024) != 0) {
                            AbstractC3809q abstractC3809q2 = abstractC3809q;
                            C2705e c2705e2 = null;
                            while (abstractC3809q2 != null) {
                                if (abstractC3809q2 instanceof C0377u) {
                                    c2705e.m4300b((C0377u) abstractC3809q2);
                                } else if ((abstractC3809q2.f17994g & 1024) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                                    int i8 = 0;
                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                abstractC3809q2 = abstractC3809q3;
                                            } else {
                                                if (c2705e2 == null) {
                                                    c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q2 != null) {
                                                    c2705e2.m4300b(abstractC3809q2);
                                                    abstractC3809q2 = null;
                                                }
                                                c2705e2.m4300b(abstractC3809q3);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3809q2 = AbstractC3498f.m5366f(c2705e2);
                            }
                        }
                        abstractC3809q = abstractC3809q.f17996i;
                    }
                }
                m5382v = m5382v.m5447u();
                if (m5382v != null && (c3490c12 = m5382v.f16872I) != null) {
                    abstractC3809q = c3490c12.f16801e;
                } else {
                    abstractC3809q = null;
                }
            }
        } else {
            c2705e = null;
        }
        C0377u[] c0377uArr = new C0377u[16];
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q4 = c0377u.f17992e.f17996i;
        C3502g0 m5382v2 = AbstractC3498f.m5382v(c0377u);
        int i9 = 1;
        int i10 = 0;
        while (m5382v2 != null) {
            if ((m5382v2.f16872I.f16802f.f17995h & 1024) != 0) {
                while (abstractC3809q4 != null) {
                    if ((abstractC3809q4.f17994g & 1024) != 0) {
                        AbstractC3809q abstractC3809q5 = abstractC3809q4;
                        C2705e c2705e3 = null;
                        while (abstractC3809q5 != null) {
                            if (abstractC3809q5 instanceof C0377u) {
                                C0377u c0377u3 = (C0377u) abstractC3809q5;
                                if (c2705e != null) {
                                    bool = Boolean.valueOf(c2705e.m4308j(c0377u3));
                                } else {
                                    bool = null;
                                }
                                if (bool == null || !bool.booleanValue()) {
                                    int i11 = i10 + 1;
                                    if (c0377uArr.length < i11) {
                                        int length = c0377uArr.length;
                                        ?? r42 = new Object[Math.max(i11, length * 2)];
                                        System.arraycopy(c0377uArr, i7, r42, i7, length);
                                        c0377uArr = r42;
                                    }
                                    c0377uArr[i10] = c0377u3;
                                    i10 = i11;
                                }
                                if (c0377u3 == c0377u2) {
                                    i9 = i7;
                                }
                            } else if ((abstractC3809q5.f17994g & 1024) != 0 && (abstractC3809q5 instanceof AbstractC3519m)) {
                                int i12 = i7;
                                for (AbstractC3809q abstractC3809q6 = ((AbstractC3519m) abstractC3809q5).f16962t; abstractC3809q6 != null; abstractC3809q6 = abstractC3809q6.f17997j) {
                                    if ((abstractC3809q6.f17994g & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC3809q5 = abstractC3809q6;
                                        } else {
                                            if (c2705e3 == null) {
                                                c2705e3 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q5 != null) {
                                                c2705e3.m4300b(abstractC3809q5);
                                                abstractC3809q5 = null;
                                            }
                                            c2705e3.m4300b(abstractC3809q6);
                                        }
                                    }
                                }
                                c7 = 16;
                                if (i12 == 1) {
                                    c8 = 16;
                                    i7 = 0;
                                }
                                abstractC3809q5 = AbstractC3498f.m5366f(c2705e3);
                                c8 = c7;
                                i7 = 0;
                            }
                            c7 = 16;
                            abstractC3809q5 = AbstractC3498f.m5366f(c2705e3);
                            c8 = c7;
                            i7 = 0;
                        }
                    }
                    abstractC3809q4 = abstractC3809q4.f17996i;
                    c8 = c8;
                    i7 = 0;
                }
            }
            char c9 = c8;
            m5382v2 = m5382v2.m5447u();
            if (m5382v2 != null && (c3490c1 = m5382v2.f16872I) != null) {
                abstractC3809q4 = c3490c1.f16801e;
            } else {
                abstractC3809q4 = null;
            }
            c8 = c9;
            i7 = 0;
        }
        if (i9 == 0 || c0377u2 == null || m807e(c0377u2, false)) {
            AbstractC3498f.m5379s(c0377u, new C0053n(5, c0377u));
            int ordinal = c0377u.m847M0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new RuntimeException();
                        }
                    }
                }
                ((C0368l) ((C3728t) AbstractC3498f.m5383w(c0377u)).getFocusOwner()).m836g(c0377u);
            }
            EnumC0376t enumC0376t2 = EnumC0376t.f1269h;
            EnumC0376t enumC0376t3 = EnumC0376t.f1267f;
            if (c2705e != null) {
                int i13 = c2705e.f14519g - 1;
                Object[] objArr = c2705e.f14517e;
                if (i13 < objArr.length) {
                    while (i13 >= 0) {
                        C0377u c0377u4 = (C0377u) objArr[i13];
                        if (c0368l.f1245h != c0377u) {
                            break;
                        }
                        c0377u4.m845K0(enumC0376t3, enumC0376t2);
                        i13--;
                    }
                }
            }
            int i14 = i10 - 1;
            int length2 = c0377uArr.length;
            EnumC0376t enumC0376t4 = EnumC0376t.f1266e;
            if (i14 < length2) {
                while (i14 >= 0) {
                    C0377u c0377u5 = c0377uArr[i14];
                    if (c0368l.f1245h != c0377u) {
                        break;
                    }
                    if (c0377u5 == c0377u2) {
                        enumC0376t = enumC0376t4;
                    } else {
                        enumC0376t = enumC0376t2;
                    }
                    c0377u5.m845K0(enumC0376t, enumC0376t3);
                    i14--;
                }
            }
            if (c0368l.f1245h == c0377u) {
                c0377u.m845K0(m847M0, enumC0376t4);
                if (c0368l.f1245h != c0377u) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: w */
    public static final boolean m825w(C0377u c0377u, C0037j c0037j) {
        C0377u[] c0377uArr = new C0377u[16];
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitChildren called on an unattached node");
        }
        C2705e c2705e = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q = c0377u.f17992e;
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
        if (abstractC3809q2 == null) {
            AbstractC3498f.m5362b(c2705e, abstractC3809q);
        } else {
            c2705e.m4300b(abstractC3809q2);
        }
        int i7 = 0;
        while (true) {
            int i8 = c2705e.f14519g;
            if (i8 == 0) {
                break;
            }
            AbstractC3809q abstractC3809q3 = (AbstractC3809q) c2705e.m4309k(i8 - 1);
            if ((abstractC3809q3.f17995h & 1024) == 0) {
                AbstractC3498f.m5362b(c2705e, abstractC3809q3);
            } else {
                while (true) {
                    if (abstractC3809q3 == null) {
                        break;
                    }
                    if ((abstractC3809q3.f17994g & 1024) != 0) {
                        C2705e c2705e2 = null;
                        while (abstractC3809q3 != null) {
                            if (abstractC3809q3 instanceof C0377u) {
                                C0377u c0377u2 = (C0377u) abstractC3809q3;
                                int i9 = i7 + 1;
                                if (c0377uArr.length < i9) {
                                    int length = c0377uArr.length;
                                    ?? r10 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(c0377uArr, 0, r10, 0, length);
                                    c0377uArr = r10;
                                }
                                c0377uArr[i7] = c0377u2;
                                i7 = i9;
                            } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                                int i10 = 0;
                                for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                    if ((abstractC3809q4.f17994g & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC3809q3 = abstractC3809q4;
                                        } else {
                                            if (c2705e2 == null) {
                                                c2705e2 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q3 != null) {
                                                c2705e2.m4300b(abstractC3809q3);
                                                abstractC3809q3 = null;
                                            }
                                            c2705e2.m4300b(abstractC3809q4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC3809q3 = AbstractC3498f.m5366f(c2705e2);
                        }
                    } else {
                        abstractC3809q3 = abstractC3809q3.f17997j;
                    }
                }
            }
        }
        AbstractC1804l.m3030W(c0377uArr, C0378v.f1275e, 0, i7);
        int i11 = i7 - 1;
        if (i11 < c0377uArr.length) {
            while (i11 >= 0) {
                C0377u c0377u3 = c0377uArr[i11];
                if (m820r(c0377u3) && m803a(c0377u3, c0037j)) {
                    return true;
                }
                i11--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: x */
    public static final boolean m826x(C0377u c0377u, C0037j c0037j) {
        C0377u[] c0377uArr = new C0377u[16];
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitChildren called on an unattached node");
        }
        C2705e c2705e = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q = c0377u.f17992e;
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
        if (abstractC3809q2 == null) {
            AbstractC3498f.m5362b(c2705e, abstractC3809q);
        } else {
            c2705e.m4300b(abstractC3809q2);
        }
        int i7 = 0;
        while (true) {
            int i8 = c2705e.f14519g;
            if (i8 == 0) {
                break;
            }
            AbstractC3809q abstractC3809q3 = (AbstractC3809q) c2705e.m4309k(i8 - 1);
            if ((abstractC3809q3.f17995h & 1024) == 0) {
                AbstractC3498f.m5362b(c2705e, abstractC3809q3);
            } else {
                while (true) {
                    if (abstractC3809q3 == null) {
                        break;
                    }
                    if ((abstractC3809q3.f17994g & 1024) != 0) {
                        C2705e c2705e2 = null;
                        while (abstractC3809q3 != null) {
                            if (abstractC3809q3 instanceof C0377u) {
                                C0377u c0377u2 = (C0377u) abstractC3809q3;
                                int i9 = i7 + 1;
                                if (c0377uArr.length < i9) {
                                    int length = c0377uArr.length;
                                    ?? r10 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(c0377uArr, 0, r10, 0, length);
                                    c0377uArr = r10;
                                }
                                c0377uArr[i7] = c0377u2;
                                i7 = i9;
                            } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                                int i10 = 0;
                                for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                    if ((abstractC3809q4.f17994g & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC3809q3 = abstractC3809q4;
                                        } else {
                                            if (c2705e2 == null) {
                                                c2705e2 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q3 != null) {
                                                c2705e2.m4300b(abstractC3809q3);
                                                abstractC3809q3 = null;
                                            }
                                            c2705e2.m4300b(abstractC3809q4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC3809q3 = AbstractC3498f.m5366f(c2705e2);
                        }
                    } else {
                        abstractC3809q3 = abstractC3809q3.f17997j;
                    }
                }
            }
        }
        AbstractC1804l.m3030W(c0377uArr, C0378v.f1275e, 0, i7);
        for (int i11 = 0; i11 < i7; i11++) {
            C0377u c0377u3 = c0377uArr[i11];
            if (m820r(c0377u3) && m813k(c0377u3, c0037j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static final boolean m827y(View view, Integer num, Rect rect) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C3728t) {
            return ((C3728t) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (findNextFocusFromRect != null) {
                return findNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (viewGroup.hasFocus()) {
            view2 = viewGroup.findFocus();
        } else {
            view2 = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view2, num.intValue());
        if (findNextFocus != null) {
            return findNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (p158u5.AbstractC3367j.m5096a((p160v.C3432r) r4.mo5084e(r0), (p160v.C3432r) r9.mo5084e(r0)) != false) goto L93;
     */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, u5.v] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m828z(C0377u c0377u, int i7, InterfaceC3279c interfaceC3279c) {
        int i8;
        Object obj;
        AbstractC3809q abstractC3809q;
        InterfaceC3434s interfaceC3434s;
        int mo5050e;
        C3490c1 c3490c1;
        if (!c0377u.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = c0377u.f17992e.f17996i;
        C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
        loop0: while (true) {
            i8 = 1;
            obj = null;
            if (m5382v != null) {
                if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                    while (abstractC3809q2 != null) {
                        if ((abstractC3809q2.f17994g & 1024) != 0) {
                            abstractC3809q = abstractC3809q2;
                            C2705e c2705e = null;
                            while (abstractC3809q != null) {
                                if (abstractC3809q instanceof C0377u) {
                                    break loop0;
                                }
                                if ((abstractC3809q.f17994g & 1024) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                                    int i9 = 0;
                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC3809q = abstractC3809q3;
                                            } else {
                                                if (c2705e == null) {
                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q != null) {
                                                    c2705e.m4300b(abstractC3809q);
                                                    abstractC3809q = null;
                                                }
                                                c2705e.m4300b(abstractC3809q3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC3809q = AbstractC3498f.m5366f(c2705e);
                            }
                        }
                        abstractC3809q2 = abstractC3809q2.f17996i;
                    }
                }
                m5382v = m5382v.m5447u();
                if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                    abstractC3809q2 = c3490c1.f16801e;
                } else {
                    abstractC3809q2 = null;
                }
            } else {
                abstractC3809q = null;
                break;
            }
        }
        C0377u c0377u2 = (C0377u) abstractC3809q;
        if (c0377u2 != null) {
            C3352h c3352h = AbstractC3198f.f15947a;
        }
        C3432r c3432r = (C3432r) c0377u.mo5084e(AbstractC3198f.f15947a);
        if (c3432r != null) {
            int i10 = 5;
            if (i7 != 5) {
                i10 = 6;
                if (i7 != 6) {
                    i10 = 3;
                    if (i7 != 3) {
                        i10 = 4;
                        if (i7 != 4) {
                            i10 = 2;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                }
                                C2891b c2891b = c3432r.f16611b;
                                interfaceC3434s = c3432r.f16610a;
                                if (interfaceC3434s.mo5046a() <= 0 && interfaceC3434s.mo5048c()) {
                                    if (c3432r.m5186i(i8)) {
                                        mo5050e = interfaceC3434s.mo5047b();
                                    } else {
                                        mo5050e = interfaceC3434s.mo5050e();
                                    }
                                    ?? obj2 = new Object();
                                    c2891b.getClass();
                                    C2705e c2705e2 = c2891b.f15099a;
                                    C3426o c3426o = new C3426o(mo5050e, mo5050e);
                                    c2705e2.m4300b(c3426o);
                                    obj2.f16451e = c3426o;
                                    while (obj == null && c3432r.m5185h((C3426o) obj2.f16451e, i8)) {
                                        C3426o c3426o2 = (C3426o) obj2.f16451e;
                                        int i11 = c3426o2.f16599a;
                                        int i12 = c3426o2.f16600b;
                                        if (c3432r.m5186i(i8)) {
                                            i12++;
                                        } else {
                                            i11--;
                                        }
                                        C3426o c3426o3 = new C3426o(i11, i12);
                                        c2705e2.m4300b(c3426o3);
                                        c2705e2.m4308j((C3426o) obj2.f16451e);
                                        obj2.f16451e = c3426o3;
                                        interfaceC3434s.mo5049d();
                                        obj = interfaceC3279c.mo23f(new C3430q(c3432r, obj2, i8));
                                    }
                                    c2705e2.m4308j((C3426o) obj2.f16451e);
                                    interfaceC3434s.mo5049d();
                                    return obj;
                                }
                                return interfaceC3279c.mo23f(C3432r.f16609e);
                            }
                        }
                    }
                }
            }
            i8 = i10;
            C2891b c2891b2 = c3432r.f16611b;
            interfaceC3434s = c3432r.f16610a;
            if (interfaceC3434s.mo5046a() <= 0) {
            }
            return interfaceC3279c.mo23f(C3432r.f16609e);
        }
        return null;
    }
}
