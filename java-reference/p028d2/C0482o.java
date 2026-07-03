package p028d2;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0005b;
import p027d1.C0465c;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p077k.C2194h0;
import p101n0.C2705e;
import p146t1.AbstractC3191c1;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3502g0;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.o */
/* loaded from: classes.dex */
public final class C0482o {

    /* renamed from: a */
    public final AbstractC3809q f1691a;

    /* renamed from: b */
    public final boolean f1692b;

    /* renamed from: c */
    public final C3502g0 f1693c;

    /* renamed from: d */
    public final C0477j f1694d;

    /* renamed from: e */
    public boolean f1695e;

    /* renamed from: f */
    public C0482o f1696f;

    /* renamed from: g */
    public final int f1697g;

    public C0482o(AbstractC3809q abstractC3809q, boolean z7, C3502g0 c3502g0, C0477j c0477j) {
        this.f1691a = abstractC3809q;
        this.f1692b = z7;
        this.f1693c = c3502g0;
        this.f1694d = c0477j;
        this.f1697g = c3502g0.f16885f;
    }

    /* renamed from: j */
    public static /* synthetic */ List m1038j(int i7, C0482o c0482o) {
        boolean z7;
        boolean z8 = false;
        if ((i7 & 1) != 0) {
            z7 = !c0482o.f1692b;
        } else {
            z7 = false;
        }
        if ((i7 & 2) == 0) {
            z8 = true;
        }
        return c0482o.m1047i(z7, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: a */
    public final C0465c m1039a(AbstractC3497e1 abstractC3497e1) {
        AbstractC3519m abstractC3519m;
        C0482o m1049l = m1049l();
        if (m1049l == null) {
            return C0465c.f1624e;
        }
        AbstractC3809q abstractC3809q = m1049l.f1693c.f16872I.f16802f;
        AbstractC3497e1 abstractC3497e12 = null;
        if ((abstractC3809q.f17995h & 8) != 0) {
            loop0: while (abstractC3809q != null) {
                if ((abstractC3809q.f17994g & 8) != 0) {
                    abstractC3519m = abstractC3809q;
                    ?? r62 = 0;
                    while (abstractC3519m != 0) {
                        if (abstractC3519m instanceof InterfaceC3551w1) {
                            if (abstractC3519m.mo1447g()) {
                                break loop0;
                            }
                        } else if ((abstractC3519m.f17994g & 8) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                            AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                            int i7 = 0;
                            abstractC3519m = abstractC3519m;
                            r62 = r62;
                            while (abstractC3809q2 != null) {
                                if ((abstractC3809q2.f17994g & 8) != 0) {
                                    i7++;
                                    r62 = r62;
                                    if (i7 == 1) {
                                        abstractC3519m = abstractC3809q2;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3519m != 0) {
                                            r62.m4300b(abstractC3519m);
                                            abstractC3519m = 0;
                                        }
                                        r62.m4300b(abstractC3809q2);
                                    }
                                }
                                abstractC3809q2 = abstractC3809q2.f17997j;
                                abstractC3519m = abstractC3519m;
                                r62 = r62;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC3519m = AbstractC3498f.m5366f(r62);
                    }
                }
                if ((abstractC3809q.f17995h & 8) == 0) {
                    break;
                }
                abstractC3809q = abstractC3809q.f17997j;
            }
        }
        abstractC3519m = 0;
        InterfaceC3551w1 interfaceC3551w1 = (InterfaceC3551w1) abstractC3519m;
        if (interfaceC3551w1 != null) {
            abstractC3497e12 = AbstractC3498f.m5380t(interfaceC3551w1, 8);
        }
        if (abstractC3497e12 == null) {
            return m1049l.m1039a(abstractC3497e1);
        }
        return abstractC3497e12.mo4934j(abstractC3497e1, true);
    }

    /* renamed from: b */
    public final C0482o m1040b(C0474g c0474g, InterfaceC3279c interfaceC3279c) {
        int i7;
        C0477j c0477j = new C0477j();
        c0477j.f1685g = false;
        c0477j.f1686h = false;
        interfaceC3279c.mo23f(c0477j);
        C0481n c0481n = new C0481n(interfaceC3279c);
        int i8 = this.f1697g;
        if (c0474g != null) {
            i7 = 1000000000;
        } else {
            i7 = 2000000000;
        }
        C0482o c0482o = new C0482o(c0481n, false, new C3502g0(i8 + i7, true), c0477j);
        c0482o.f1695e = true;
        c0482o.f1696f = this;
        return c0482o;
    }

    /* renamed from: c */
    public final void m1041c(C3502g0 c3502g0, ArrayList arrayList) {
        C2705e m5450x = c3502g0.m5450x();
        Object[] objArr = m5450x.f14517e;
        int i7 = m5450x.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (c3502g02.m5407I() && !c3502g02.f16883T) {
                if (c3502g02.f16872I.m5308d(8)) {
                    arrayList.add(AbstractC0485r.m1057a(c3502g02, this.f1692b));
                } else {
                    m1041c(c3502g02, arrayList);
                }
            }
        }
    }

    /* renamed from: d */
    public final AbstractC3497e1 m1042d() {
        if (this.f1695e) {
            C0482o m1049l = m1049l();
            if (m1049l != null) {
                return m1049l.m1042d();
            }
            return null;
        }
        InterfaceC3551w1 m1044f = m1044f();
        if (m1044f != null) {
            return AbstractC3498f.m5380t(m1044f, 8);
        }
        return this.f1693c.f16872I.f16799c;
    }

    /* renamed from: e */
    public final void m1043e(ArrayList arrayList, ArrayList arrayList2) {
        m1054q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C0482o c0482o = (C0482o) arrayList.get(size2);
            if (c0482o.m1051n()) {
                arrayList2.add(c0482o);
            } else if (!c0482o.f1694d.f1686h) {
                c0482o.m1043e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v14, types: [v1.w1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* renamed from: f */
    public final InterfaceC3551w1 m1044f() {
        AbstractC3809q abstractC3809q;
        boolean z7 = this.f1694d.f1685g;
        C3502g0 c3502g0 = this.f1693c;
        Object obj = null;
        if (z7) {
            AbstractC3809q abstractC3809q2 = c3502g0.f16872I.f16802f;
            if ((abstractC3809q2.f17995h & 8) != 0) {
                abstractC3809q = null;
                while (abstractC3809q2 != null) {
                    if ((abstractC3809q2.f17994g & 8) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q2;
                        ?? r7 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3551w1) {
                                ?? r62 = (InterfaceC3551w1) abstractC3519m;
                                if (r62.mo1447g()) {
                                    if (r62.mo1030m0()) {
                                        return r62;
                                    }
                                    if (abstractC3809q == null) {
                                        abstractC3809q = r62;
                                    }
                                }
                            } else if ((abstractC3519m.f17994g & 8) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r7 = r7;
                                while (abstractC3809q3 != null) {
                                    if ((abstractC3809q3.f17994g & 8) != 0) {
                                        i7++;
                                        r7 = r7;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q3;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r7.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r7.m4300b(abstractC3809q3);
                                        }
                                    }
                                    abstractC3809q3 = abstractC3809q3.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r7 = r7;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = AbstractC3498f.m5366f(r7);
                        }
                    }
                    if ((abstractC3809q2.f17995h & 8) == 0) {
                        break;
                    }
                    abstractC3809q2 = abstractC3809q2.f17997j;
                }
                obj = abstractC3809q;
            }
            return (InterfaceC3551w1) obj;
        }
        AbstractC3809q abstractC3809q4 = c3502g0.f16872I.f16802f;
        if ((abstractC3809q4.f17995h & 8) != 0) {
            loop3: while (abstractC3809q4 != null) {
                if ((abstractC3809q4.f17994g & 8) != 0) {
                    abstractC3809q = abstractC3809q4;
                    C2705e c2705e = null;
                    while (abstractC3809q != null) {
                        if (abstractC3809q instanceof InterfaceC3551w1) {
                            if (((InterfaceC3551w1) abstractC3809q).mo1447g()) {
                                obj = abstractC3809q;
                            }
                        } else if ((abstractC3809q.f17994g & 8) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                            int i8 = 0;
                            for (AbstractC3809q abstractC3809q5 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                                if ((abstractC3809q5.f17994g & 8) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        abstractC3809q = abstractC3809q5;
                                    } else {
                                        if (c2705e == null) {
                                            c2705e = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3809q != null) {
                                            c2705e.m4300b(abstractC3809q);
                                            abstractC3809q = null;
                                        }
                                        c2705e.m4300b(abstractC3809q5);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        abstractC3809q = AbstractC3498f.m5366f(c2705e);
                    }
                }
                if ((abstractC3809q4.f17995h & 8) == 0) {
                    break;
                }
                abstractC3809q4 = abstractC3809q4.f17997j;
            }
        }
        return (InterfaceC3551w1) obj;
    }

    /* renamed from: g */
    public final C0465c m1045g() {
        AbstractC3497e1 m1042d = m1042d();
        if (m1042d != null) {
            if (!m1042d.mo5333V0().f18005r) {
                m1042d = null;
            }
            if (m1042d != null) {
                return AbstractC3191c1.m4897h(m1042d).mo4934j(m1042d, true);
            }
        }
        return C0465c.f1624e;
    }

    /* renamed from: h */
    public final C0465c m1046h() {
        AbstractC3497e1 m1042d = m1042d();
        if (m1042d != null) {
            if (!m1042d.mo5333V0().f18005r) {
                m1042d = null;
            }
            if (m1042d != null) {
                return AbstractC3191c1.m4895f(m1042d);
            }
        }
        return C0465c.f1624e;
    }

    /* renamed from: i */
    public final List m1047i(boolean z7, boolean z8) {
        if (!z7 && this.f1694d.f1686h) {
            return C1813u.f10860e;
        }
        ArrayList arrayList = new ArrayList();
        if (m1051n()) {
            ArrayList arrayList2 = new ArrayList();
            m1043e(arrayList, arrayList2);
            return arrayList2;
        }
        return m1054q(arrayList, z8);
    }

    /* renamed from: k */
    public final C0477j m1048k() {
        boolean m1051n = m1051n();
        C0477j c0477j = this.f1694d;
        if (m1051n) {
            C0477j m1033a = c0477j.m1033a();
            m1053p(new ArrayList(), m1033a);
            return m1033a;
        }
        return c0477j;
    }

    /* renamed from: l */
    public final C0482o m1049l() {
        C3502g0 c3502g0;
        C0482o c0482o = this.f1696f;
        if (c0482o != null) {
            return c0482o;
        }
        C3502g0 c3502g02 = this.f1693c;
        boolean z7 = this.f1692b;
        if (z7) {
            c3502g0 = c3502g02.m5447u();
            while (c3502g0 != null) {
                C0477j m5449w = c3502g0.m5449w();
                if (m5449w != null && m5449w.f1685g) {
                    break;
                }
                c3502g0 = c3502g0.m5447u();
            }
        }
        c3502g0 = null;
        if (c3502g0 == null) {
            C3502g0 m5447u = c3502g02.m5447u();
            while (true) {
                if (m5447u != null) {
                    if (m5447u.f16872I.m5308d(8)) {
                        c3502g0 = m5447u;
                        break;
                    }
                    m5447u = m5447u.m5447u();
                } else {
                    c3502g0 = null;
                    break;
                }
            }
        }
        if (c3502g0 == null) {
            return null;
        }
        return AbstractC0485r.m1057a(c3502g0, z7);
    }

    /* renamed from: m */
    public final C0477j m1050m() {
        return this.f1694d;
    }

    /* renamed from: n */
    public final boolean m1051n() {
        if (this.f1692b && this.f1694d.f1685g) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m1052o() {
        if (!this.f1695e && m1038j(4, this).isEmpty()) {
            C3502g0 m5447u = this.f1693c.m5447u();
            while (true) {
                if (m5447u != null) {
                    C0477j m5449w = m5447u.m5449w();
                    if (m5449w != null && m5449w.f1685g) {
                        break;
                    }
                    m5447u = m5447u.m5447u();
                } else {
                    m5447u = null;
                    break;
                }
            }
            if (m5447u == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public final void m1053p(ArrayList arrayList, C0477j c0477j) {
        if (!this.f1694d.f1686h) {
            m1054q(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                C0482o c0482o = (C0482o) arrayList.get(size2);
                if (!c0482o.m1051n()) {
                    c0477j.m1035c(c0482o.f1694d);
                    c0482o.m1053p(arrayList, c0477j);
                }
            }
        }
    }

    /* renamed from: q */
    public final List m1054q(ArrayList arrayList, boolean z7) {
        String str;
        if (this.f1695e) {
            return C1813u.f10860e;
        }
        m1041c(this.f1693c, arrayList);
        if (z7) {
            C0477j c0477j = this.f1694d;
            C2194h0 c2194h0 = c0477j.f1683e;
            Object m3592g = c2194h0.m3592g(AbstractC0487t.f1763x);
            if (m3592g == null) {
                m3592g = null;
            }
            C0474g c0474g = (C0474g) m3592g;
            if (c0474g != null && c0477j.f1685g && !arrayList.isEmpty()) {
                arrayList.add(m1040b(c0474g, new C0005b(8, c0474g)));
            }
            C0490w c0490w = AbstractC0487t.f1740a;
            if (c2194h0.m3588c(c0490w) && !arrayList.isEmpty() && c0477j.f1685g) {
                Object m3592g2 = c2194h0.m3592g(c0490w);
                if (m3592g2 == null) {
                    m3592g2 = null;
                }
                List list = (List) m3592g2;
                if (list != null) {
                    str = (String) AbstractC1805m.m3047k0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, m1040b(null, new C0480m(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
