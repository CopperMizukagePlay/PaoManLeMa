package p001a0;

import android.os.Build;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import p000a.AbstractC0000a;
import p008b.AbstractC0223b;
import p010b1.C0264b;
import p010b1.C0265c;
import p019c1.C0377u;
import p027d1.C0464b;
import p027d1.C0465c;
import p028d2.C0475h;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0483p;
import p031d5.C0512l;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p034e0.AbstractC0626q0;
import p034e0.C0622o0;
import p039e5.C0796d5;
import p047f6.InterfaceC1552g;
import p050g2.C1587g;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p053g5.C1694m;
import p059h3.C1782h;
import p063i0.C1956n1;
import p067i4.AbstractC2072e;
import p071j0.AbstractC2161z;
import p071j0.AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
import p071j0.AccessibilityManagerAccessibilityStateChangeListenerC2119c0;
import p071j0.AccessibilityManagerTouchExplorationStateChangeListenerC2117b0;
import p073j2.AbstractC2168e;
import p085l0.C2345c1;
import p085l0.C2352e0;
import p085l0.InterfaceC2425y0;
import p087l2.C2446j;
import p087l2.C2447k;
import p087l2.C2459w;
import p101n0.C2702b;
import p101n0.C2705e;
import p107o.C2738f0;
import p117p1.C2848d;
import p140s2.C3102l;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p146t1.AbstractC3235t0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3379v;
import p160v.C3419k0;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.AbstractC3529p0;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.C3505h0;
import p162v1.C3514k0;
import p162v1.C3534r;
import p162v1.C3541t0;
import p162v1.EnumC3496e0;
import p162v1.InterfaceC3551w1;
import p168w.AbstractC3642y;
import p168w.C3634q;
import p168w.C3635r;
import p170w1.C3653a0;
import p170w1.C3655a2;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.i */
/* loaded from: classes.dex */
public final class C0033i extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f157f;

    /* renamed from: g */
    public final /* synthetic */ Object f158g;

    /* renamed from: h */
    public final /* synthetic */ Object f159h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033i(int i7, Object obj, Object obj2) {
        super(0);
        this.f157f = i7;
        this.f158g = obj;
        this.f159h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r0v52, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r3v48, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r5v7, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        long j6;
        int i7;
        long j7;
        C0064p2 m120d;
        C0043k1 c0043k1;
        C1587g c1587g;
        AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
        boolean dispatchKeyEvent;
        float f7;
        float f8;
        C0482o c0482o;
        C3502g0 c3502g0;
        int i8 = this.f157f;
        int i9 = 3;
        C1587g c1587g2 = null;
        boolean z7 = false;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f159h;
        Object obj2 = this.f158g;
        switch (i8) {
            case 0:
                C2459w c2459w = (C2459w) obj2;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj;
                if (!C1602n0.m2585a(c2459w.f13724b, ((C2459w) interfaceC2425y0.getValue()).f13724b) || !AbstractC3367j.m5096a(c2459w.f13725c, ((C2459w) interfaceC2425y0.getValue()).f13725c)) {
                    interfaceC2425y0.setValue(c2459w);
                }
                return c1694m;
            case 1:
                ((C0043k1) obj2).f231u.mo23f(new C2446j(((C2447k) obj).f13703e));
                return Boolean.TRUE;
            case 2:
                ((C0264b) obj2).f998u.mo23f((C0265c) obj);
                return c1694m;
            case 3:
                ((C3379v) obj2).f16451e = ((C0377u) obj).m846L0();
                return c1694m;
            case 4:
                C0622o0 c0622o0 = (C0622o0) obj2;
                long j8 = ((C3102l) ((InterfaceC2425y0) obj).getValue()).f15702a;
                C0464b m1284g = c0622o0.m1284g();
                if (m1284g != null) {
                    long j9 = m1284g.f1623a;
                    C0043k1 c0043k12 = c0622o0.f2047d;
                    if (c0043k12 != null) {
                        c1587g2 = c0043k12.f211a.f332a;
                    }
                    if (c1587g2 != null && c1587g2.f10239f.length() != 0) {
                        EnumC0088w0 enumC0088w0 = (EnumC0088w0) c0622o0.f2058o.getValue();
                        if (enumC0088w0 == null) {
                            i7 = -1;
                        } else {
                            i7 = AbstractC0626q0.f2071a[enumC0088w0.ordinal()];
                        }
                        if (i7 != -1) {
                            if (i7 != 1 && i7 != 2) {
                                if (i7 == 3) {
                                    long j10 = c0622o0.m1287j().f13724b;
                                    int i10 = C1602n0.f10303c;
                                    j7 = j10 & 4294967295L;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                long j11 = c0622o0.m1287j().f13724b;
                                int i11 = C1602n0.f10303c;
                                j7 = j11 >> 32;
                            }
                            int i12 = (int) j7;
                            C0043k1 c0043k13 = c0622o0.f2047d;
                            if (c0043k13 != null && (m120d = c0043k13.m120d()) != null && (c0043k1 = c0622o0.f2047d) != null && (c1587g = c0043k1.f211a.f332a) != null) {
                                int m3530q = AbstractC2168e.m3530q(c0622o0.f2045b.mo168b(i12), 0, c1587g.f10239f.length());
                                float m1008d = C0464b.m1008d(m120d.m129d(j9));
                                C1598l0 c1598l0 = m120d.f322a;
                                int m2578e = c1598l0.m2578e(m3530q);
                                C1605p c1605p = c1598l0.f10289b;
                                float m2579f = c1598l0.m2579f(m2578e);
                                float m2580g = c1598l0.m2580g(m2578e);
                                float m3529p = AbstractC2168e.m3529p(m1008d, Math.min(m2579f, m2580g), Math.max(m2579f, m2580g));
                                if (C3102l.m4790a(j8, 0L) || Math.abs(m1008d - m3529p) <= ((int) (j8 >> 32)) / 2) {
                                    float m2601d = c1605p.m2601d(m2578e);
                                    j6 = AbstractC3784a.m5797a(m3529p, ((c1605p.m2599b(m2578e) - m2601d) / 2) + m2601d);
                                    return new C0464b(j6);
                                }
                            }
                        }
                    }
                }
                j6 = 9205357640488583168L;
                return new C0464b(j6);
            case AbstractC3122c.f15761f /* 5 */:
                ((C1956n1) obj2).f11576b.setValue((InterfaceC3093c) obj);
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                float m3729g = ((C2345c1) obj).m3729g();
                return Float.valueOf(AbstractC2168e.m3529p((((C1956n1) obj2).f11575a.m3488e() - m3729g) / (0.0f - m3729g), 0.0f, 1.0f));
            case 7:
                C1956n1 c1956n1 = (C1956n1) obj2;
                c1956n1.f11575a.getClass();
                Boolean bool = Boolean.TRUE;
                if (bool.booleanValue()) {
                    AbstractC0525d0.m1141s((InterfaceC0516a0) obj, null, new C0796d5(c1956n1, z7 ? 1 : 0, i9), 3);
                }
                return bool;
            case 8:
                AccessibilityManagerAccessibilityStateChangeListenerC2119c0 accessibilityManagerAccessibilityStateChangeListenerC2119c0 = (AccessibilityManagerAccessibilityStateChangeListenerC2119c0) obj2;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
                accessibilityManagerAccessibilityStateChangeListenerC2119c0.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC2119c0);
                AccessibilityManagerTouchExplorationStateChangeListenerC2117b0 accessibilityManagerTouchExplorationStateChangeListenerC2117b0 = accessibilityManagerAccessibilityStateChangeListenerC2119c0.f12411f;
                if (accessibilityManagerTouchExplorationStateChangeListenerC2117b0 != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2117b0);
                }
                if (Build.VERSION.SDK_INT >= 33 && (accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 = accessibilityManagerAccessibilityStateChangeListenerC2119c0.f12412g) != null) {
                    AbstractC2161z.m3501b(accessibilityManager, AbstractC0223b.m488f(accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0));
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                ((InterfaceC1552g) obj2).mo2505v(obj);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                ((C3379v) obj2).f16451e = AbstractC3498f.m5369i((C2738f0) obj, AbstractC3235t0.f16049a);
                return c1694m;
            case 11:
                ((C2848d) obj2).m4509d((AbstractC3809q) obj);
                return c1694m;
            case 12:
                C3490c1 c3490c1 = ((C3502g0) obj2).f16872I;
                C3379v c3379v = (C3379v) obj;
                if ((c3490c1.f16802f.f17995h & 8) != 0) {
                    for (AbstractC3809q abstractC3809q = c3490c1.f16801e; abstractC3809q != null; abstractC3809q = abstractC3809q.f17996i) {
                        if ((abstractC3809q.f17994g & 8) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q;
                            ?? r22 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3551w1) {
                                    InterfaceC3551w1 interfaceC3551w1 = (InterfaceC3551w1) abstractC3519m;
                                    if (interfaceC3551w1.mo1029k0()) {
                                        C0477j c0477j = new C0477j();
                                        c3379v.f16451e = c0477j;
                                        c0477j.f1686h = true;
                                    }
                                    if (interfaceC3551w1.mo1030m0()) {
                                        ((C0477j) c3379v.f16451e).f1685g = true;
                                    }
                                    interfaceC3551w1.mo1002t((C0477j) c3379v.f16451e);
                                } else if ((abstractC3519m.f17994g & 8) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                    int i13 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r22 = r22;
                                    while (abstractC3809q2 != null) {
                                        if ((abstractC3809q2.f17994g & 8) != 0) {
                                            i13++;
                                            r22 = r22;
                                            if (i13 == 1) {
                                                abstractC3519m = abstractC3809q2;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r22.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r22.m4300b(abstractC3809q2);
                                            }
                                        }
                                        abstractC3809q2 = abstractC3809q2.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r22 = r22;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r22);
                            }
                        }
                    }
                }
                return c1694m;
            case 13:
                C3541t0 c3541t0 = (C3541t0) obj2;
                C3514k0 c3514k0 = c3541t0.f17024j;
                c3514k0.f16945h = 0;
                C2705e m5451y = c3514k0.f16938a.m5451y();
                Object[] objArr = m5451y.f14517e;
                int i14 = m5451y.f14519g;
                for (int i15 = 0; i15 < i14; i15++) {
                    C3541t0 c3541t02 = ((C3502g0) objArr[i15]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t02);
                    c3541t02.f17026l = c3541t02.f17027m;
                    c3541t02.f17027m = Integer.MAX_VALUE;
                    if (c3541t02.f17028n == EnumC3496e0.f16825f) {
                        c3541t02.f17028n = EnumC3496e0.f16826g;
                    }
                }
                C3502g0 c3502g02 = c3514k0.f16938a;
                C3502g0 c3502g03 = c3514k0.f16938a;
                C2705e m5451y2 = c3502g02.m5451y();
                Object[] objArr2 = m5451y2.f14517e;
                int i16 = m5451y2.f14519g;
                for (int i17 = 0; i17 < i16; i17++) {
                    C3541t0 c3541t03 = ((C3502g0) objArr2[i17]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t03);
                    c3541t03.f17037w.f16917d = false;
                }
                C3534r c3534r = c3541t0.mo5288q().f17012U;
                if (c3534r != null) {
                    boolean z8 = c3534r.f16978o;
                    C2702b c2702b = (C2702b) c3502g03.m5440n();
                    int i18 = c2702b.f14511e.f14519g;
                    for (int i19 = 0; i19 < i18; i19++) {
                        AbstractC3529p0 mo5331T0 = ((C3502g0) c2702b.get(i19)).f16872I.f16800d.mo5331T0();
                        if (mo5331T0 != null) {
                            mo5331T0.f16978o = z8;
                        }
                    }
                }
                ((AbstractC3529p0) obj).mo5318D0().mo4883b();
                if (c3541t0.mo5288q().f17012U != null) {
                    C2702b c2702b2 = (C2702b) c3502g03.m5440n();
                    int i20 = c2702b2.f14511e.f14519g;
                    for (int i21 = 0; i21 < i20; i21++) {
                        AbstractC3529p0 mo5331T02 = ((C3502g0) c2702b2.get(i21)).f16872I.f16800d.mo5331T0();
                        if (mo5331T02 != null) {
                            mo5331T02.f16978o = false;
                        }
                    }
                }
                C2705e m5451y3 = c3502g03.m5451y();
                Object[] objArr3 = m5451y3.f14517e;
                int i22 = m5451y3.f14519g;
                for (int i23 = 0; i23 < i22; i23++) {
                    C3541t0 c3541t04 = ((C3502g0) objArr3[i23]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t04);
                    int i24 = c3541t04.f17026l;
                    int i25 = c3541t04.f17027m;
                    if (i24 != i25 && i25 == Integer.MAX_VALUE) {
                        c3541t04.m5503s0(true);
                    }
                }
                C2705e m5451y4 = c3502g03.m5451y();
                Object[] objArr4 = m5451y4.f14517e;
                int i26 = m5451y4.f14519g;
                for (int i27 = 0; i27 < i26; i27++) {
                    C3541t0 c3541t05 = ((C3502g0) objArr4[i27]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t05);
                    C3505h0 c3505h0 = c3541t05.f17037w;
                    c3505h0.f16918e = c3505h0.f16917d;
                }
                return c1694m;
            case 14:
                C3634q c3634q = (C3634q) ((C2352e0) obj2).getValue();
                AbstractC3642y abstractC3642y = (AbstractC3642y) obj;
                return new C3635r(abstractC3642y, c3634q, new C0512l((C3879d) ((C3419k0) abstractC3642y.f17396c.f15488f).getValue(), c3634q));
            case AbstractC3122c.f15762g /* 15 */:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 16:
                C3653a0 c3653a0 = (C3653a0) obj;
                C3655a2 c3655a2 = (C3655a2) obj2;
                C0475h c0475h = c3655a2.f17481i;
                C0475h c0475h2 = c3655a2.f17482j;
                Float f9 = c3655a2.f17479g;
                Float f10 = c3655a2.f17480h;
                if (c0475h != null && f9 != null) {
                    f7 = ((Number) c0475h.f1653a.mo52a()).floatValue() - f9.floatValue();
                } else {
                    f7 = 0.0f;
                }
                if (c0475h2 != null && f10 != null) {
                    f8 = ((Number) c0475h2.f1653a.mo52a()).floatValue() - f10.floatValue();
                } else {
                    f8 = 0.0f;
                }
                if (f7 != 0.0f || f8 != 0.0f) {
                    int m5650t = c3653a0.m5650t(c3655a2.f17477e);
                    C0483p c0483p = (C0483p) c3653a0.m5647m().m3612b(c3653a0.f17464n);
                    if (c0483p != null) {
                        try {
                            C1782h c1782h = c3653a0.f17466p;
                            if (c1782h != null) {
                                c1782h.f10826a.setBoundsInScreen(c3653a0.m5638d(c0483p));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    C0483p c0483p2 = (C0483p) c3653a0.m5647m().m3612b(c3653a0.f17465o);
                    if (c0483p2 != null) {
                        try {
                            C1782h c1782h2 = c3653a0.f17467q;
                            if (c1782h2 != null) {
                                c1782h2.f10826a.setBoundsInScreen(c3653a0.m5638d(c0483p2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    c3653a0.f17454d.invalidate();
                    C0483p c0483p3 = (C0483p) c3653a0.m5647m().m3612b(m5650t);
                    if (c0483p3 != null && (c0482o = c0483p3.f1698a) != null && (c3502g0 = c0482o.f1693c) != null) {
                        if (c0475h != null) {
                            c3653a0.f17469s.m3652g(m5650t, c0475h);
                        }
                        if (c0475h2 != null) {
                            c3653a0.f17470t.m3652g(m5650t, c0475h2);
                        }
                        c3653a0.m5649p(c3502g0);
                    }
                }
                if (c0475h != null) {
                    c3655a2.f17479g = (Float) c0475h.f1653a.mo52a();
                }
                if (c0475h2 != null) {
                    c3655a2.f17480h = (Float) c0475h2.f1653a.mo52a();
                }
                return c1694m;
            default:
                C0465c c0465c = (C0465c) obj2;
                if (c0465c == null) {
                    AbstractC3497e1 abstractC3497e1 = (AbstractC3497e1) obj;
                    if (!abstractC3497e1.mo5333V0().f18005r) {
                        abstractC3497e1 = null;
                    }
                    if (abstractC3497e1 == null) {
                        return null;
                    }
                    return AbstractC0000a.m3d(0L, AbstractC2072e.m3347y(abstractC3497e1.f16055g));
                }
                return c0465c;
        }
    }
}
