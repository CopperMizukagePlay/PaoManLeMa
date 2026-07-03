package p001a0;

import android.util.SparseArray;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p006a7.C0129l;
import p014b5.AbstractC0289c;
import p014b5.C0291e;
import p014b5.C0292f;
import p014b5.C0293g;
import p022c4.C0396f;
import p028d2.AbstractC0479l;
import p028d2.AbstractC0487t;
import p028d2.C0477j;
import p035e1.InterfaceC0674q;
import p039e5.C1279sl;
import p049g1.C1568b;
import p052g4.C1676d;
import p067i4.C2068a;
import p067i4.C2069b;
import p067i4.EnumC2070c;
import p077k.C2194h0;
import p077k.C2222x;
import p080k2.C2307r;
import p085l0.InterfaceC2343c;
import p085l0.InterfaceC2390n2;
import p096m3.C2554d;
import p096m3.C2568r;
import p096m3.C2571u;
import p096m3.C2572v;
import p096m3.C2573w;
import p096m3.InterfaceC2557g;
import p096m3.InterfaceC2566p;
import p097m4.C2580d;
import p100n.AbstractC2647h;
import p100n.C2673p1;
import p102n1.AbstractC2710c;
import p104n3.C2716a;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p145t0.AbstractC3178i;
import p145t0.AbstractC3181l;
import p145t0.C3180k;
import p146t1.C3205h0;
import p149t4.AbstractC3276m;
import p149t4.C3271h;
import p149t4.C3272i;
import p149t4.C3273j;
import p150t5.InterfaceC3277a;
import p153u0.InterfaceC3337d;
import p158u5.AbstractC3367j;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.C3554x1;
import p162v1.EnumC3540t;
import p162v1.InterfaceC3524n1;
import p163v2.C3576p;
import p170w1.C3728t;
import p170w1.InterfaceC3663c2;
import p177x0.AbstractC3809q;
import p183y0.C3834c;
import p194z4.C3875f;
import p194z4.EnumC3871b;
import p194z4.EnumC3873d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.h1 */
/* loaded from: classes.dex */
public final class C0031h1 implements InterfaceC3337d, InterfaceC2343c {

    /* renamed from: e */
    public final /* synthetic */ int f151e;

    /* renamed from: f */
    public Object f152f;

    /* renamed from: g */
    public Object f153g;

    /* renamed from: h */
    public Object f154h;

    public /* synthetic */ C0031h1(Object obj, Object obj2, Object obj3, int i7) {
        this.f151e = i7;
        this.f152f = obj;
        this.f153g = obj2;
        this.f154h = obj3;
    }

    /* renamed from: s */
    public static int m76s(int i7, int i8, C2068a c2068a) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (c2068a.m3305d(i7 + i10)) {
                i9 |= 1 << ((i8 - i10) - 1);
            }
        }
        return i9;
    }

    /* renamed from: A */
    public boolean m77A() {
        boolean z7;
        if (((C3554x1) ((C2673p1) this.f152f).f14390f).isEmpty() && ((C3554x1) ((C2673p1) this.f154h).f14390f).isEmpty() && ((C3554x1) ((C2673p1) this.f153g).f14390f).isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        return !z7;
    }

    /* renamed from: B */
    public boolean m78B() {
        if (((InterfaceC2390n2) this.f152f).getValue() == this.f154h) {
            C0031h1 c0031h1 = (C0031h1) this.f153g;
            if (c0031h1 == null || !c0031h1.m78B()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: C */
    public Object m79C(CharSequence charSequence, int i7, int i8, int i9, boolean z7, InterfaceC2566p interfaceC2566p) {
        int i10;
        C2571u c2571u;
        char c7;
        C2568r c2568r = new C2568r((C2571u) ((C2572v) this.f153g).f13968g);
        int codePointAt = Character.codePointAt(charSequence, i7);
        int i11 = 0;
        boolean z8 = true;
        int i12 = i7;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i8 && i11 < i9 && z8) {
                SparseArray sparseArray = c2568r.f13948c.f13964a;
                if (sparseArray == null) {
                    c2571u = null;
                } else {
                    c2571u = (C2571u) sparseArray.get(codePointAt);
                }
                if (c2568r.f13946a != 2) {
                    if (c2571u == null) {
                        c2568r.m4089a();
                        c7 = 1;
                    } else {
                        c2568r.f13946a = 2;
                        c2568r.f13948c = c2571u;
                        c2568r.f13951f = 1;
                        c7 = 2;
                    }
                } else {
                    if (c2571u != null) {
                        c2568r.f13948c = c2571u;
                        c2568r.f13951f++;
                    } else {
                        if (codePointAt == 65038) {
                            c2568r.m4089a();
                        } else if (codePointAt != 65039) {
                            C2571u c2571u2 = c2568r.f13948c;
                            if (c2571u2.f13965b != null) {
                                if (c2568r.f13951f == 1) {
                                    if (c2568r.m4090b()) {
                                        c2568r.f13949d = c2568r.f13948c;
                                        c2568r.m4089a();
                                    } else {
                                        c2568r.m4089a();
                                    }
                                } else {
                                    c2568r.f13949d = c2571u2;
                                    c2568r.m4089a();
                                }
                                c7 = 3;
                            } else {
                                c2568r.m4089a();
                            }
                        }
                        c7 = 1;
                    }
                    c7 = 2;
                }
                c2568r.f13950e = codePointAt;
                if (c7 != 1) {
                    if (c7 != 2) {
                        if (c7 == 3) {
                            if (z7 || !m110y(charSequence, i10, i12, c2568r.f13949d.f13965b)) {
                                z8 = interfaceC2566p.mo147k(charSequence, i10, i12, c2568r.f13949d.f13965b);
                                i11++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i12;
                        if (charCount < i8) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i12 = charCount;
                    }
                } else {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i8) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                }
            }
        }
        if (c2568r.f13946a == 2 && c2568r.f13948c.f13965b != null && ((c2568r.f13951f > 1 || c2568r.m4090b()) && i11 < i9 && z8 && (z7 || !m110y(charSequence, i10, i12, c2568r.f13948c.f13965b)))) {
            interfaceC2566p.mo147k(charSequence, i10, i12, c2568r.f13948c.f13965b);
        }
        return interfaceC2566p.mo141b();
    }

    /* renamed from: D */
    public boolean m80D(int i7, int i8, int i9, int i10) {
        if (i7 < 0) {
            i7 += i9;
            i8 += 4 - ((i9 + 4) & 7);
        }
        if (i8 < 0) {
            i8 += i10;
            i7 += 4 - ((i10 + 4) & 7);
        }
        if (i7 >= i9) {
            i7 -= i9;
        }
        ((C2069b) this.f153g).m3319h(i8, i7);
        return ((C2069b) this.f152f).m3313b(i8, i7);
    }

    /* renamed from: E */
    public int m81E(int i7, int i8, int i9, int i10) {
        int i11 = i7 - 2;
        int i12 = i8 - 2;
        int i13 = (m80D(i11, i12, i9, i10) ? 1 : 0) << 1;
        int i14 = i8 - 1;
        if (m80D(i11, i14, i9, i10)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i7 - 1;
        if (m80D(i16, i12, i9, i10)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (m80D(i16, i14, i9, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (m80D(i16, i8, i9, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (m80D(i7, i12, i9, i10)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (m80D(i7, i14, i9, i10)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (m80D(i7, i8, i9, i10)) {
            return i21 | 1;
        }
        return i21;
    }

    /* renamed from: F */
    public void m82F(Object obj) {
        long m4871b = AbstractC3178i.m4871b();
        if (m4871b == AbstractC3181l.f15906a) {
            this.f154h = obj;
            return;
        }
        synchronized (this.f153g) {
            C3180k c3180k = (C3180k) ((AtomicReference) this.f152f).get();
            int m4880a = c3180k.m4880a(m4871b);
            if (m4880a < 0) {
                ((AtomicReference) this.f152f).set(c3180k.m4881b(m4871b, obj));
            } else {
                c3180k.f15905c[m4880a] = obj;
            }
        }
    }

    /* renamed from: G */
    public void m83G(InterfaceC0674q interfaceC0674q) {
        ((C1568b) this.f154h).f10181e.f10179c = interfaceC0674q;
    }

    /* renamed from: H */
    public void m84H(InterfaceC3093c interfaceC3093c) {
        ((C1568b) this.f154h).f10181e.f10177a = interfaceC3093c;
    }

    /* renamed from: I */
    public void m85I(EnumC3103m enumC3103m) {
        ((C1568b) this.f154h).f10181e.f10178b = enumC3103m;
    }

    /* renamed from: J */
    public void m86J(long j6) {
        ((C1568b) this.f154h).f10181e.f10180d = j6;
    }

    /* renamed from: K */
    public void m87K() {
        C2194h0 c2194h0 = (C2194h0) this.f152f;
        String str = (String) this.f153g;
        List list = (List) c2194h0.m3596k(str);
        if (list != null) {
            list.remove((InterfaceC3277a) this.f154h);
        }
        if (list != null && !list.isEmpty()) {
            c2194h0.m3598m(str, list);
        }
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: a */
    public void mo88a(int i7, Object obj) {
        ((C3502g0) this.f154h).m5400B(i7, (C3502g0) obj);
    }

    /* renamed from: b */
    public void m89b(C3502g0 c3502g0, EnumC3540t enumC3540t) {
        C2673p1 c2673p1 = (C2673p1) this.f152f;
        C2673p1 c2673p12 = (C2673p1) this.f153g;
        C2673p1 c2673p13 = (C2673p1) this.f154h;
        int ordinal = enumC3540t.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (c3502g0.f16890k != null) {
                            c2673p13.m4284l(c3502g0);
                            return;
                        } else {
                            c2673p12.m4284l(c3502g0);
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                if (c3502g0.f16890k != null) {
                    c2673p13.m4284l(c3502g0);
                    return;
                } else {
                    c2673p1.m4284l(c3502g0);
                    return;
                }
            }
            c2673p12.m4284l(c3502g0);
            c2673p13.m4284l(c3502g0);
            return;
        }
        c2673p1.m4284l(c3502g0);
        c2673p13.m4284l(c3502g0);
    }

    /* renamed from: c */
    public void m90c(char c7) {
        ((StringBuilder) this.f152f).append((char) (c7 & 255));
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: d */
    public void mo91d(Object obj) {
        ((ArrayList) this.f153g).add(this.f154h);
        this.f154h = obj;
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: e */
    public void mo92e() {
        C3834c c3834c;
        C3502g0 c3502g0 = (C3502g0) this.f154h;
        C3490c1 c3490c1 = c3502g0.f16872I;
        if (!c3502g0.m5407I()) {
            AbstractC3088a.m4749a("onReuse is only expected on attached node");
        }
        C3576p c3576p = c3502g0.f16897r;
        if (c3576p != null) {
            View view = c3576p.f17138f;
            if (view.getParent() != c3576p) {
                c3576p.addView(view);
            } else {
                c3576p.f17142j.mo52a();
            }
        }
        C3205h0 c3205h0 = c3502g0.f16874K;
        if (c3205h0 != null) {
            c3205h0.m4908e(false);
        }
        c3502g0.f16902w = false;
        if (c3502g0.f16883T) {
            c3502g0.f16883T = false;
        } else {
            AbstractC3809q abstractC3809q = c3502g0.f16872I.f16801e;
            for (AbstractC3809q abstractC3809q2 = abstractC3809q; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17996i) {
                if (abstractC3809q2.f18005r) {
                    abstractC3809q2.mo5478F0();
                }
            }
            for (AbstractC3809q abstractC3809q3 = abstractC3809q; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17996i) {
                if (abstractC3809q3.f18005r) {
                    abstractC3809q3.mo5480H0();
                }
            }
            while (abstractC3809q != null) {
                if (abstractC3809q.f18005r) {
                    abstractC3809q.mo5477B0();
                }
                abstractC3809q = abstractC3809q.f17996i;
            }
        }
        int i7 = c3502g0.f16885f;
        c3502g0.f16885f = AbstractC0479l.f1687a.addAndGet(1);
        InterfaceC3524n1 interfaceC3524n1 = c3502g0.f16896q;
        if (interfaceC3524n1 != null) {
            C3728t c3728t = (C3728t) interfaceC3524n1;
            c3728t.getLayoutNodes().m3651f(i7);
            c3728t.getLayoutNodes().m3652g(c3502g0.f16885f, c3502g0);
        }
        for (AbstractC3809q abstractC3809q4 = c3490c1.f16802f; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
            abstractC3809q4.mo5476A0();
        }
        c3490c1.m5309e();
        if (c3490c1.m5308d(8)) {
            c3502g0.m5405G();
        }
        C3502g0.m5397Z(c3502g0);
        InterfaceC3524n1 interfaceC3524n12 = c3502g0.f16896q;
        if (interfaceC3524n12 != null) {
            C3728t c3728t2 = (C3728t) interfaceC3524n12;
            if (C3728t.m5720h() && (c3834c = c3728t2.f17719J) != null) {
                C3728t c3728t3 = c3834c.f18047c;
                C2673p1 c2673p1 = c3834c.f18045a;
                C2222x c2222x = c3834c.f18051g;
                if (c2222x.m3657e(i7)) {
                    c2673p1.m4286r(c3728t3, i7, false);
                }
                C0477j m5449w = c3502g0.m5449w();
                if (m5449w != null && m5449w.f1683e.m3587b(AbstractC0487t.f1756q)) {
                    c2222x.m3653a(c3502g0.f16885f);
                    c2673p1.m4286r(c3728t3, c3502g0.f16885f, true);
                }
            }
            c3728t2.getRectManager().m1471g(c3502g0, true);
        }
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo93f(int i7, Object obj) {
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: g */
    public void mo94g() {
        InterfaceC3524n1 interfaceC3524n1 = ((C3502g0) this.f152f).f16896q;
        if (interfaceC3524n1 != null) {
            ((C3728t) interfaceC3524n1).m5750y();
        }
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: h */
    public void mo95h(int i7, int i8, int i9) {
        ((C3502g0) this.f154h).m5411M(i7, i8, i9);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: i */
    public Object mo96i() {
        return this.f154h;
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: j */
    public void mo97j(int i7, int i8) {
        ((C3502g0) this.f154h).m5417T(i7, i8);
    }

    /* renamed from: k */
    public void m98k(int i7) {
        m104r();
        EnumC2070c m3321a = EnumC2070c.m3321a(i7);
        if (m3321a != null) {
            this.f154h = Charset.forName(m3321a.name());
            return;
        }
        throw C0396f.m868a();
    }

    /* renamed from: m */
    public void m99m() {
        ((ArrayList) this.f153g).clear();
        this.f154h = this.f152f;
        ((C3502g0) this.f152f).m5416S();
    }

    /* renamed from: n */
    public boolean m100n(C3502g0 c3502g0) {
        boolean z7;
        boolean z8;
        if (c3502g0.f16890k == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!((C3554x1) ((C2673p1) this.f152f).f14390f).contains(c3502g0) && !((C3554x1) ((C2673p1) this.f153g).f14390f).contains(c3502g0)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z7 || !z8) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public String m101o(StringBuilder sb, int i7) {
        String str;
        String str2 = null;
        while (true) {
            C3272i m102p = m102p(str2, i7);
            String m4988a = AbstractC3276m.m4988a(m102p.f16118b);
            if (m4988a != null) {
                sb.append(m4988a);
            }
            if (m102p.f16120d) {
                str = String.valueOf(m102p.f16119c);
            } else {
                str = null;
            }
            int i8 = m102p.f16123a;
            if (i7 == i8) {
                return sb.toString();
            }
            i7 = i8;
            str2 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0211, code lost:
    
        if (r6 <= r2.f12257f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0214, code lost:
    
        if (r5 >= r6) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x021a, code lost:
    
        if (r2.m3305d(r5) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0236, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0239, code lost:
    
        r3.f374b += 3;
        r3.f375c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0244, code lost:
    
        r6 = new p052g4.C1676d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0222, code lost:
    
        if (m111z(r3.f374b) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0224, code lost:
    
        r5 = r3.f374b;
        r6 = r5 + 5;
        r7 = r2.f12257f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x022a, code lost:
    
        if (r6 >= r7) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x022c, code lost:
    
        r3.f374b = r5 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0233, code lost:
    
        r3.f375c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0231, code lost:
    
        r3.f374b = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x032f  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3272i m102p(String str, int i7) {
        boolean m3305d;
        boolean z7;
        boolean z8;
        C1676d c1676d;
        boolean z9;
        C3273j c3273j;
        boolean z10;
        boolean z11;
        C3272i c3272i;
        boolean z12;
        int m76s;
        int m76s2;
        int m76s3;
        char c7;
        C3271h c3271h;
        C3271h c3271h2;
        int i8;
        boolean z13;
        C3272i c3272i2;
        int m76s4;
        int m76s5;
        char c8;
        C3271h c3271h3;
        C3271h c3271h4;
        C2068a c2068a = (C2068a) this.f152f;
        C0076s2 c0076s2 = (C0076s2) this.f153g;
        StringBuilder sb = (StringBuilder) this.f154h;
        sb.setLength(0);
        if (str != null) {
            sb.append(str);
        }
        c0076s2.f374b = i7;
        do {
            int i9 = c0076s2.f374b;
            int i10 = c0076s2.f375c;
            int i11 = 16;
            if (i10 == 2) {
                while (true) {
                    int i12 = c0076s2.f374b;
                    if (i12 + 5 <= c2068a.f12257f && (((m76s4 = m76s(i12, 5, c2068a)) >= 5 && m76s4 < 16) || (i12 + 6 <= c2068a.f12257f && (m76s5 = m76s(i12, 6, c2068a)) >= 16 && m76s5 < 63))) {
                        int i13 = c0076s2.f374b;
                        int m76s6 = m76s(i13, 5, c2068a);
                        if (m76s6 == 15) {
                            c3271h4 = new C3271h(i13 + 5, '$');
                        } else {
                            if (m76s6 >= 5 && m76s6 < 15) {
                                c3271h3 = new C3271h(i13 + 5, (char) (m76s6 + 43));
                            } else {
                                int m76s7 = m76s(i13, 6, c2068a);
                                if (m76s7 >= 32 && m76s7 < 58) {
                                    c3271h3 = new C3271h(i13 + 6, (char) (m76s7 + 33));
                                } else {
                                    switch (m76s7) {
                                        case 58:
                                            c8 = '*';
                                            break;
                                        case 59:
                                            c8 = ',';
                                            break;
                                        case 60:
                                            c8 = '-';
                                            break;
                                        case 61:
                                            c8 = '.';
                                            break;
                                        case 62:
                                            c8 = '/';
                                            break;
                                        default:
                                            throw new IllegalStateException(AbstractC2647h.m4256b("Decoding invalid alphanumeric value: ", m76s7));
                                    }
                                    c3271h3 = new C3271h(i13 + 6, c8);
                                }
                            }
                            c3271h4 = c3271h3;
                        }
                        int i14 = c3271h4.f16123a;
                        c0076s2.f374b = i14;
                        char c9 = c3271h4.f16117b;
                        if (c9 == '$') {
                            c1676d = new C1676d(new C3272i(sb.toString(), i14), true);
                        } else {
                            sb.append(c9);
                        }
                    }
                }
                int i15 = c0076s2.f374b;
                int i16 = i15 + 3;
                if (i16 <= c2068a.f12257f) {
                    while (i15 < i16) {
                        if (!c2068a.m3305d(i15)) {
                            i15++;
                        }
                    }
                    c0076s2.f374b += 3;
                    c0076s2.f375c = 1;
                    c1676d = new C1676d();
                    z9 = c1676d.f10453e;
                }
                if (m111z(c0076s2.f374b)) {
                    int i17 = c0076s2.f374b;
                    int i18 = i17 + 5;
                    int i19 = c2068a.f12257f;
                    if (i18 < i19) {
                        c0076s2.f374b = i17 + 5;
                    } else {
                        c0076s2.f374b = i19;
                    }
                    c0076s2.f375c = 3;
                }
                c1676d = new C1676d();
                z9 = c1676d.f10453e;
            } else if (i10 == 3) {
                while (true) {
                    int i20 = c0076s2.f374b;
                    if (i20 + 5 <= c2068a.f12257f && (((m76s = m76s(i20, 5, c2068a)) >= 5 && m76s < i11) || (i20 + 7 <= c2068a.f12257f && (((m76s2 = m76s(i20, 7, c2068a)) >= 64 && m76s2 < 116) || (i20 + 8 <= c2068a.f12257f && (m76s3 = m76s(i20, 8, c2068a)) >= 232 && m76s3 < 253))))) {
                        int i21 = c0076s2.f374b;
                        int m76s8 = m76s(i21, 5, c2068a);
                        if (m76s8 == 15) {
                            c3271h2 = new C3271h(i21 + 5, '$');
                        } else {
                            if (m76s8 >= 5 && m76s8 < 15) {
                                c3271h = new C3271h(i21 + 5, (char) (m76s8 + 43));
                            } else {
                                int m76s9 = m76s(i21, 7, c2068a);
                                if (m76s9 >= 64 && m76s9 < 90) {
                                    c3271h = new C3271h(i21 + 7, (char) (m76s9 + 1));
                                } else if (m76s9 >= 90 && m76s9 < 116) {
                                    c3271h = new C3271h(i21 + 7, (char) (m76s9 + 7));
                                } else {
                                    switch (m76s(i21, 8, c2068a)) {
                                        case 232:
                                            c7 = '!';
                                            break;
                                        case 233:
                                            c7 = '\"';
                                            break;
                                        case 234:
                                            c7 = '%';
                                            break;
                                        case 235:
                                            c7 = '&';
                                            break;
                                        case 236:
                                            c7 = '\'';
                                            break;
                                        case 237:
                                            c7 = '(';
                                            break;
                                        case 238:
                                            c7 = ')';
                                            break;
                                        case 239:
                                            c7 = '*';
                                            break;
                                        case 240:
                                            c7 = '+';
                                            break;
                                        case 241:
                                            c7 = ',';
                                            break;
                                        case 242:
                                            c7 = '-';
                                            break;
                                        case 243:
                                            c7 = '.';
                                            break;
                                        case 244:
                                            c7 = '/';
                                            break;
                                        case 245:
                                            c7 = ':';
                                            break;
                                        case 246:
                                            c7 = ';';
                                            break;
                                        case 247:
                                            c7 = '<';
                                            break;
                                        case 248:
                                            c7 = '=';
                                            break;
                                        case 249:
                                            c7 = '>';
                                            break;
                                        case 250:
                                            c7 = '?';
                                            break;
                                        case 251:
                                            c7 = '_';
                                            break;
                                        case 252:
                                            c7 = ' ';
                                            break;
                                        default:
                                            throw C0396f.m868a();
                                    }
                                    c3271h = new C3271h(i21 + 8, c7);
                                }
                            }
                            c3271h2 = c3271h;
                        }
                        int i22 = c3271h2.f16123a;
                        c0076s2.f374b = i22;
                        char c10 = c3271h2.f16117b;
                        if (c10 == '$') {
                            c1676d = new C1676d(new C3272i(sb.toString(), i22), true);
                        } else {
                            sb.append(c10);
                            i11 = 16;
                        }
                    }
                }
                z9 = c1676d.f10453e;
            } else {
                while (true) {
                    int i23 = c0076s2.f374b;
                    int i24 = i23 + 7;
                    int i25 = c2068a.f12257f;
                    if (i24 > i25) {
                        if (i23 + 4 > i25) {
                            m3305d = false;
                            if (m3305d) {
                                int i26 = c0076s2.f374b;
                                int i27 = i26 + 7;
                                if (i27 > c2068a.f12257f) {
                                    int m76s10 = m76s(i26, 4, c2068a);
                                    if (m76s10 == 0) {
                                        c3273j = new C3273j(c2068a.f12257f, 10, 10);
                                    } else {
                                        c3273j = new C3273j(c2068a.f12257f, m76s10 - 1, 10);
                                    }
                                } else {
                                    int m76s11 = m76s(i26, 7, c2068a) - 8;
                                    c3273j = new C3273j(i27, m76s11 / 11, m76s11 % 11);
                                }
                                int i28 = c3273j.f16123a;
                                c0076s2.f374b = i28;
                                int i29 = c3273j.f16121b;
                                if (i29 == 10) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i30 = c3273j.f16122c;
                                if (z10) {
                                    if (i30 == 10) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        c3272i = new C3272i(sb.toString(), i28);
                                    } else {
                                        c3272i = new C3272i(i28, i30, sb.toString());
                                    }
                                    c1676d = new C1676d(c3272i, true);
                                    z7 = true;
                                } else {
                                    sb.append(i29);
                                    if (i30 == 10) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        z7 = true;
                                        c1676d = new C1676d(new C3272i(sb.toString(), c0076s2.f374b), z7);
                                    } else {
                                        sb.append(i30);
                                    }
                                }
                            } else {
                                z7 = true;
                                int i31 = c0076s2.f374b;
                                if (i31 + 1 <= c2068a.f12257f) {
                                    for (int i32 = 0; i32 < 4; i32++) {
                                        int i33 = i32 + i31;
                                        if (i33 < c2068a.f12257f) {
                                            if (!c2068a.m3305d(i33)) {
                                            }
                                        } else {
                                            z8 = true;
                                            if (z8) {
                                                c0076s2.f375c = 2;
                                                c0076s2.f374b += 4;
                                            }
                                            c1676d = new C1676d();
                                        }
                                    }
                                    z8 = true;
                                    if (z8) {
                                    }
                                    c1676d = new C1676d();
                                }
                                z8 = false;
                                if (z8) {
                                }
                                c1676d = new C1676d();
                            }
                        }
                        m3305d = true;
                        if (m3305d) {
                        }
                    } else {
                        int i34 = i23;
                        while (true) {
                            int i35 = i23 + 3;
                            if (i34 < i35) {
                                if (!c2068a.m3305d(i34)) {
                                    i34++;
                                }
                            } else {
                                m3305d = c2068a.m3305d(i35);
                            }
                        }
                        m3305d = true;
                        if (m3305d) {
                        }
                    }
                    i8 = c0076s2.f374b;
                    if (i9 != i8) {
                        z13 = z7;
                    } else {
                        z13 = false;
                    }
                    if (!z13 || z9) {
                    }
                    c3272i2 = (C3272i) c1676d.f10454f;
                    if (c3272i2 == null && c3272i2.f16120d) {
                        return new C3272i(i8, c3272i2.f16119c, sb.toString());
                    }
                    return new C3272i(sb.toString(), i8);
                }
                z9 = c1676d.f10453e;
                i8 = c0076s2.f374b;
                if (i9 != i8) {
                }
                if (!z13) {
                }
            }
            z7 = true;
            i8 = c0076s2.f374b;
            if (i9 != i8) {
            }
            if (!z13) {
            }
        } while (!z9);
        c3272i2 = (C3272i) c1676d.f10454f;
        if (c3272i2 == null) {
        }
        return new C3272i(sb.toString(), i8);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: q */
    public void mo103q() {
        this.f154h = ((ArrayList) this.f153g).remove(r0.size() - 1);
    }

    /* renamed from: r */
    public void m104r() {
        Charset charset = (Charset) this.f154h;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (charset.equals(charset2)) {
            if (((StringBuilder) this.f152f).length() > 0) {
                StringBuilder sb = (StringBuilder) this.f153g;
                if (sb == null) {
                    this.f153g = (StringBuilder) this.f152f;
                    this.f152f = new StringBuilder();
                    return;
                } else {
                    sb.append((CharSequence) this.f152f);
                    this.f152f = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (((StringBuilder) this.f152f).length() > 0) {
            byte[] bytes = ((StringBuilder) this.f152f).toString().getBytes(charset2);
            this.f152f = new StringBuilder();
            StringBuilder sb2 = (StringBuilder) this.f153g;
            if (sb2 == null) {
                this.f153g = new StringBuilder(new String(bytes, (Charset) this.f154h));
            } else {
                sb2.append(new String(bytes, (Charset) this.f154h));
            }
        }
    }

    /* renamed from: t */
    public Object m105t() {
        long m4871b = AbstractC3178i.m4871b();
        if (m4871b == AbstractC3181l.f15906a) {
            return this.f154h;
        }
        C3180k c3180k = (C3180k) ((AtomicReference) this.f152f).get();
        int m4880a = c3180k.m4880a(m4871b);
        if (m4880a >= 0) {
            return c3180k.f15905c[m4880a];
        }
        return null;
    }

    public String toString() {
        switch (this.f151e) {
            case 1:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f152f;
                int size = arrayList.size();
                C0292f c0292f = null;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    C0292f c0292f2 = (C0292f) obj;
                    if (c0292f != null) {
                        sb.append(",");
                    }
                    sb.append(c0292f2.toString());
                    c0292f = c0292f2;
                }
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                m104r();
                StringBuilder sb2 = (StringBuilder) this.f153g;
                if (sb2 == null) {
                    return "";
                }
                return sb2.toString();
        }
    }

    /* renamed from: u */
    public InterfaceC0674q m106u() {
        return ((C1568b) this.f154h).f10181e.f10179c;
    }

    /* renamed from: v */
    public C0035i1 m107v() {
        C0035i1 c0035i1 = (C0035i1) this.f153g;
        if (c0035i1 != null) {
            return c0035i1;
        }
        AbstractC3367j.m5105j("keyboardActions");
        throw null;
    }

    /* renamed from: w */
    public int m108w(C3875f c3875f) {
        ArrayList arrayList = (ArrayList) this.f152f;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C0292f c0292f = (C0292f) obj;
            int i9 = c0292f.f1065d;
            EnumC3873d enumC3873d = c0292f.f1062a;
            int m5895a = enumC3873d.m5895a(c3875f);
            int i10 = m5895a + 4;
            int ordinal = enumC3873d.ordinal();
            int i11 = 4;
            if (ordinal != 1) {
                int i12 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i10 += i9 * 13;
                            }
                        } else {
                            i10 = m5895a + 12;
                        }
                    } else {
                        i10 += c0292f.m645a() * 8;
                    }
                } else {
                    int i13 = ((i9 / 2) * 11) + i10;
                    if (i9 % 2 != 1) {
                        i12 = 0;
                    }
                    i10 = i13 + i12;
                }
            } else {
                int i14 = ((i9 / 3) * 10) + i10;
                int i15 = i9 % 3;
                if (i15 != 1) {
                    if (i15 == 2) {
                        i11 = 7;
                    } else {
                        i11 = 0;
                    }
                }
                i10 = i14 + i11;
            }
            i7 += i10;
        }
        return i7;
    }

    /* renamed from: x */
    public long m109x() {
        return ((C1568b) this.f154h).f10181e.f10180d;
    }

    /* renamed from: y */
    public boolean m110y(CharSequence charSequence, int i7, int i8, C2573w c2573w) {
        int i9;
        if ((c2573w.f13973c & 3) == 0) {
            InterfaceC2557g interfaceC2557g = (InterfaceC2557g) this.f154h;
            C2716a m4105b = c2573w.m4105b();
            int m3415a = m4105b.m3415a(8);
            if (m3415a != 0) {
                ((ByteBuffer) m4105b.f12319h).getShort(m3415a + m4105b.f12316e);
            }
            C2554d c2554d = (C2554d) interfaceC2557g;
            c2554d.getClass();
            ThreadLocal threadLocal = C2554d.f13918b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            boolean hasGlyph = c2554d.f13919a.hasGlyph(sb.toString());
            int i10 = c2573w.f13973c & 4;
            if (hasGlyph) {
                i9 = i10 | 2;
            } else {
                i9 = i10 | 1;
            }
            c2573w.f13973c = i9;
        }
        if ((c2573w.f13973c & 3) != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean m111z(int i7) {
        int i8;
        int i9 = i7 + 1;
        C2068a c2068a = (C2068a) this.f152f;
        if (i9 > c2068a.f12257f) {
            return false;
        }
        for (int i10 = 0; i10 < 5 && (i8 = i10 + i7) < c2068a.f12257f; i10++) {
            if (i10 == 2) {
                if (!c2068a.m3305d(i7 + 2)) {
                    return false;
                }
            } else if (c2068a.m3305d(i8)) {
                return false;
            }
        }
        return true;
    }

    public C0031h1(int i7, byte b8) {
        this.f151e = i7;
        switch (i7) {
            case 7:
                this.f154h = new C0129l(27);
                return;
            case AbstractC3122c.f15758c /* 9 */:
                this.f152f = new WeakHashMap();
                this.f153g = new WeakHashMap();
                this.f154h = new WeakHashMap();
                return;
            case AbstractC3122c.f15760e /* 10 */:
                this.f152f = new AtomicReference(AbstractC3178i.f15891b);
                this.f153g = new Object();
                return;
            case 14:
                this.f152f = new C2673p1(10);
                this.f153g = new C2673p1(10);
                this.f154h = new C2673p1(10);
                return;
            default:
                this.f154h = StandardCharsets.ISO_8859_1;
                this.f152f = new StringBuilder();
                return;
        }
    }

    public C0031h1(C2069b c2069b) {
        int i7;
        int i8;
        this.f151e = 6;
        int i9 = c2069b.f12259f;
        if (i9 >= 8 && i9 <= 144 && (i7 = i9 & 1) == 0) {
            int i10 = c2069b.f12258e;
            C2580d[] c2580dArr = C2580d.f13989h;
            if (i7 == 0 && (i10 & 1) == 0) {
                C2580d[] c2580dArr2 = C2580d.f13989h;
                for (int i11 = 0; i11 < 48; i11++) {
                    C2580d c2580d = c2580dArr2[i11];
                    int i12 = c2580d.f13991b;
                    if (i12 == i9 && (i8 = c2580d.f13992c) == i10) {
                        this.f154h = c2580d;
                        if (c2069b.f12259f == i12) {
                            int i13 = c2580d.f13993d;
                            int i14 = c2580d.f13994e;
                            int i15 = i12 / i13;
                            int i16 = i8 / i14;
                            C2069b c2069b2 = new C2069b(i16 * i14, i15 * i13);
                            for (int i17 = 0; i17 < i15; i17++) {
                                int i18 = i17 * i13;
                                for (int i19 = 0; i19 < i16; i19++) {
                                    int i20 = i19 * i14;
                                    for (int i21 = 0; i21 < i13; i21++) {
                                        int i22 = ((i13 + 2) * i17) + 1 + i21;
                                        int i23 = i18 + i21;
                                        for (int i24 = 0; i24 < i14; i24++) {
                                            if (c2069b.m3313b(((i14 + 2) * i19) + 1 + i24, i22)) {
                                                c2069b2.m3319h(i20 + i24, i23);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f152f = c2069b2;
                            this.f153g = new C2069b(c2069b2.f12258e, c2069b2.f12259f);
                            return;
                        }
                        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                    }
                }
                throw C0396f.m868a();
            }
            throw C0396f.m868a();
        }
        throw C0396f.m868a();
    }

    public C0031h1(InterfaceC3663c2 interfaceC3663c2) {
        this.f151e = 0;
        this.f152f = interfaceC3663c2;
    }

    public C0031h1(int i7) {
        this.f151e = 3;
        this.f154h = StandardCharsets.ISO_8859_1;
        this.f152f = new StringBuilder(i7);
    }

    public C0031h1(C2068a c2068a) {
        this.f151e = 11;
        C0076s2 c0076s2 = new C0076s2();
        c0076s2.f374b = 0;
        c0076s2.f375c = 1;
        this.f153g = c0076s2;
        this.f154h = new StringBuilder();
        this.f152f = c2068a;
    }

    public C0031h1(View view) {
        this.f151e = 4;
        this.f152f = view;
        this.f153g = AbstractC2710c.m4326I(new C0053n(14, this));
        this.f154h = new C0019e1(view);
    }

    public C0031h1(C1568b c1568b) {
        this.f151e = 2;
        this.f154h = c1568b;
        this.f152f = new C0019e1(this);
    }

    public C0031h1(C2572v c2572v, C0129l c0129l, C2554d c2554d, Set set) {
        this.f151e = 5;
        this.f152f = c0129l;
        this.f153g = c2572v;
        this.f154h = c2554d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m79C(str, 0, str.length(), 1, true, new C1279sl(str, 2));
        }
    }

    public C0031h1(C2307r c2307r, C0031h1 c0031h1) {
        this.f151e = 8;
        this.f152f = c2307r;
        this.f153g = c0031h1;
        this.f154h = c2307r.f13250e;
    }

    public C0031h1(C3502g0 c3502g0) {
        this.f151e = 15;
        this.f152f = c3502g0;
        this.f153g = new ArrayList();
        this.f154h = c3502g0;
    }

    public C0031h1(C0293g c0293g, C3875f c3875f, C0291e c0291e) {
        EnumC3873d enumC3873d;
        int i7;
        int i8;
        this.f151e = 1;
        this.f154h = c0293g;
        this.f152f = new ArrayList();
        C0291e c0291e2 = c0291e;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            enumC3873d = EnumC3873d.ECI;
            if (c0291e2 == null) {
                break;
            }
            int i11 = c0291e2.f1058c;
            int i12 = i9 + c0291e2.f1059d;
            C0291e c0291e3 = c0291e2.f1060e;
            int i13 = i10;
            EnumC3873d enumC3873d2 = c0291e2.f1056a;
            boolean z7 = (enumC3873d2 == EnumC3873d.BYTE && c0291e3 == null && i11 != 0) || !(c0291e3 == null || i11 == c0291e3.f1058c);
            i7 = z7 ? 1 : i13;
            if (c0291e3 == null || c0291e3.f1056a != enumC3873d2 || z7) {
                ((ArrayList) this.f152f).add(0, new C0292f(this, enumC3873d2, c0291e2.f1057b, i11, i12));
                i8 = 0;
            } else {
                i8 = i12;
            }
            if (z7) {
                ((ArrayList) this.f152f).add(0, new C0292f(this, enumC3873d, c0291e2.f1057b, c0291e2.f1058c, 0));
            }
            i10 = i7;
            c0291e2 = c0291e3;
            i9 = i8;
        }
        int i14 = i10;
        boolean z8 = c0293g.f1067a;
        EnumC3871b enumC3871b = (EnumC3871b) c0293g.f1070d;
        if (z8) {
            C0292f c0292f = (C0292f) ((ArrayList) this.f152f).get(0);
            if (c0292f != null && c0292f.f1062a != enumC3873d && i14 != 0) {
                ((ArrayList) this.f152f).add(0, new C0292f(this, enumC3873d, 0, 0, 0));
            }
            ((ArrayList) this.f152f).add(((C0292f) ((ArrayList) this.f152f).get(0)).f1062a == enumC3873d ? 1 : 0, new C0292f(this, EnumC3873d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i15 = c3875f.f18157a;
        int i16 = 26;
        int m4257c = AbstractC2647h.m4257c(i15 <= 9 ? 1 : i15 <= 26 ? 2 : 3);
        if (m4257c == 0) {
            i16 = 9;
        } else if (m4257c != 1) {
            i7 = 27;
            i16 = 40;
        } else {
            i7 = 10;
        }
        int m108w = m108w(c3875f);
        while (i15 < i16 && !AbstractC0289c.m637c(m108w, C3875f.m5898c(i15), enumC3871b)) {
            i15++;
        }
        while (i15 > i7 && AbstractC0289c.m637c(m108w, C3875f.m5898c(i15 - 1), enumC3871b)) {
            i15--;
        }
        this.f153g = C3875f.m5898c(i15);
    }
}
