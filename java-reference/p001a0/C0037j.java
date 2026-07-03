package p001a0;

import android.graphics.Canvas;
import androidx.lifecycle.InterfaceC0213t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import p000a.AbstractC0000a;
import p002a1.C0103e;
import p002a1.ViewOnDragListenerC0099a;
import p005a6.InterfaceC0114e;
import p019c1.C0368l;
import p019c1.C0377u;
import p023c5.C0427s;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0490w;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0670o;
import p035e1.C0661j0;
import p035e1.C0665l0;
import p035e1.C0675q0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p039e5.C1460yg;
import p049g1.AbstractC1571e;
import p049g1.C1573g;
import p049g1.InterfaceC1570d;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p050g2.C1610s;
import p053g5.C1694m;
import p063i0.C1956n1;
import p063i0.EnumC1964o1;
import p071j0.C2114a;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p087l2.C2437c0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p100n.C2653j;
import p102n1.AbstractC2710c;
import p122q.C2915j;
import p122q.C2920k1;
import p122q.C2921l;
import p122q.C2923l1;
import p122q.C2929n1;
import p132r2.C3038l;
import p132r2.C3040n;
import p132r2.InterfaceC3041o;
import p140s2.C3100j;
import p144t.AbstractC3122c;
import p144t.C3131g0;
import p144t.C3133h0;
import p144t.C3139k0;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3376s;
import p158u5.C3379v;
import p162v1.AbstractC3498f;
import p162v1.C3502g0;
import p162v1.EnumC3483a2;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3524n1;
import p163v2.C3576p;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.j */
/* loaded from: classes.dex */
public final class C0037j extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f168f;

    /* renamed from: g */
    public final /* synthetic */ Object f169g;

    /* renamed from: h */
    public final /* synthetic */ Object f170h;

    /* renamed from: i */
    public final /* synthetic */ Object f171i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037j(int i7, Object obj, Object obj2, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f168f = i7;
        this.f170h = obj;
        this.f169g = interfaceC3279c;
        this.f171i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [t5.c, u5.k] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C1596k0 c1596k0;
        long j6;
        boolean z7;
        boolean z8;
        InterfaceC0674q interfaceC0674q;
        long j7;
        float f7;
        float f8;
        float f9;
        float f10;
        long j8;
        float f11;
        int i7 = this.f168f;
        boolean z9 = false;
        Object[] objArr = 0;
        C3728t c3728t = null;
        int i8 = 1;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f171i;
        Object obj3 = this.f170h;
        Object obj4 = this.f169g;
        switch (i7) {
            case 0:
                C2459w c2459w = (C2459w) obj;
                ((InterfaceC2425y0) obj3).setValue(c2459w);
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                boolean m5096a = AbstractC3367j.m5096a((String) interfaceC2425y0.getValue(), c2459w.f13723a.f10239f);
                C1587g c1587g = c2459w.f13723a;
                interfaceC2425y0.setValue(c1587g.f10239f);
                if (!m5096a) {
                    ((InterfaceC3279c) obj4).mo23f(c1587g.f10239f);
                }
                return c1694m;
            case 1:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                C0043k1 c0043k1 = (C0043k1) obj4;
                C0064p2 m120d = c0043k1.m120d();
                if (m120d != null) {
                    long j9 = ((C2459w) obj3).f13724b;
                    InterfaceC2453q interfaceC2453q = (InterfaceC2453q) obj2;
                    InterfaceC0674q m106u = interfaceC1570d.mo2524E().m106u();
                    long j10 = ((C1602n0) c0043k1.f234x.getValue()).f10304a;
                    long j11 = ((C1602n0) c0043k1.f235y.getValue()).f10304a;
                    C1598l0 c1598l0 = m120d.f322a;
                    C1596k0 c1596k02 = c1598l0.f10288a;
                    C1605p c1605p = c1598l0.f10289b;
                    C0427s c0427s = c0043k1.f232v;
                    long j12 = c0043k1.f233w;
                    if (!C1602n0.m2586b(j10)) {
                        c0427s.m910i(j12);
                        int mo168b = interfaceC2453q.mo168b(C1602n0.m2589e(j10));
                        int mo168b2 = interfaceC2453q.mo168b(C1602n0.m2588d(j10));
                        if (mo168b != mo168b2) {
                            m106u.mo1332d(c1598l0.m2583j(mo168b, mo168b2), c0427s);
                        }
                        c1596k0 = c1596k02;
                    } else if (!C1602n0.m2586b(j11)) {
                        c1596k0 = c1596k02;
                        long m2594b = c1596k0.f10277b.m2594b();
                        C0677s c0677s = new C0677s(m2594b);
                        if (m2594b == 16) {
                            c0677s = null;
                        }
                        if (c0677s != null) {
                            j6 = c0677s.f2211a;
                        } else {
                            j6 = C0677s.f2204b;
                        }
                        c0427s.m910i(C0677s.m1453b(C0677s.m1455d(j6) * 0.2f, j6));
                        int mo168b3 = interfaceC2453q.mo168b(C1602n0.m2589e(j11));
                        int mo168b4 = interfaceC2453q.mo168b(C1602n0.m2588d(j11));
                        if (mo168b3 != mo168b4) {
                            m106u.mo1332d(c1598l0.m2583j(mo168b3, mo168b4), c0427s);
                        }
                    } else {
                        c1596k0 = c1596k02;
                        if (!C1602n0.m2586b(j9)) {
                            c0427s.m910i(j12);
                            int mo168b5 = interfaceC2453q.mo168b(C1602n0.m2589e(j9));
                            int mo168b6 = interfaceC2453q.mo168b(C1602n0.m2588d(j9));
                            if (mo168b5 != mo168b6) {
                                m106u.mo1332d(c1598l0.m2583j(mo168b5, mo168b6), c0427s);
                            }
                        }
                    }
                    long j13 = c1598l0.f10290c;
                    if (((int) (j13 >> 32)) >= c1605p.f10315d && !c1605p.f10314c && ((int) (j13 & 4294967295L)) >= c1605p.f10316e) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7 && c1596k0.f10281f != 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        C0465c m3d = AbstractC0000a.m3d(0L, (Float.floatToRawIntBits((int) (j13 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j13 & 4294967295L)) & 4294967295L));
                        m106u.mo1341m();
                        InterfaceC0674q.m1448p(m106u, m3d);
                    }
                    C1588g0 c1588g0 = c1596k0.f10277b.f10309a;
                    C3038l c3038l = c1588g0.f10254m;
                    InterfaceC3041o interfaceC3041o = c1588g0.f10242a;
                    if (c3038l == null) {
                        c3038l = C3038l.f15604b;
                    }
                    C3038l c3038l2 = c3038l;
                    C0665l0 c0665l0 = c1588g0.f10255n;
                    if (c0665l0 == null) {
                        c0665l0 = C0665l0.f2176d;
                    }
                    C0665l0 c0665l02 = c0665l0;
                    AbstractC1571e abstractC1571e = c1588g0.f10257p;
                    if (abstractC1571e == null) {
                        abstractC1571e = C1573g.f10187a;
                    }
                    AbstractC1571e abstractC1571e2 = abstractC1571e;
                    try {
                        AbstractC0670o mo4718c = interfaceC3041o.mo4718c();
                        C3040n c3040n = C3040n.f15609a;
                        try {
                            if (mo4718c != null) {
                                if (interfaceC3041o != c3040n) {
                                    f7 = interfaceC3041o.mo4716a();
                                } else {
                                    f7 = 1.0f;
                                }
                                C1605p.m2597g(c1605p, m106u, mo4718c, f7, c0665l02, c3038l2, abstractC1571e2);
                                interfaceC0674q = m106u;
                            } else {
                                InterfaceC0674q interfaceC0674q2 = m106u;
                                if (interfaceC3041o != c3040n) {
                                    j7 = interfaceC3041o.mo4717b();
                                } else {
                                    j7 = C0677s.f2204b;
                                }
                                interfaceC0674q2.mo1341m();
                                ArrayList arrayList = c1605p.f10319h;
                                int size = arrayList.size();
                                int i9 = 0;
                                while (i9 < size) {
                                    C1610s c1610s = (C1610s) arrayList.get(i9);
                                    long j14 = j7;
                                    c1610s.f10329a.m2552f(interfaceC0674q2, j14, c0665l02, c3038l2, abstractC1571e2);
                                    interfaceC0674q = interfaceC0674q2;
                                    try {
                                        interfaceC0674q.mo1336h(0.0f, c1610s.f10329a.m2548b());
                                        i9++;
                                        interfaceC0674q2 = interfaceC0674q;
                                        j7 = j14;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (z8) {
                                            interfaceC0674q.mo1338j();
                                        }
                                        throw th;
                                    }
                                }
                                interfaceC0674q = interfaceC0674q2;
                                interfaceC0674q.mo1338j();
                            }
                            if (z8) {
                                interfaceC0674q.mo1338j();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC0674q = 4294967295;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC0674q = m106u;
                    }
                }
                return c1694m;
            case 2:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj4;
                C2437c0 c2437c0 = (C2437c0) ((C3379v) obj2).f16451e;
                C2459w m153s = ((C0068q2) obj3).m153s((List) obj);
                if (c2437c0 != null) {
                    c2437c0.m4011a(null, m153s);
                }
                interfaceC3279c.mo23f(m153s);
                return c1694m;
            case 3:
                InterfaceC3487b2 interfaceC3487b2 = (InterfaceC3487b2) obj;
                C0103e c0103e = (C0103e) interfaceC3487b2;
                if (((ViewOnDragListenerC0099a) ((C3728t) AbstractC3498f.m5383w((C0103e) obj3)).m5916getDragAndDropManager()).f468b.contains(c0103e) && AbstractC0000a.m6g(c0103e, AbstractC2710c.m4350x((C0019e1) obj2))) {
                    ((C3379v) obj4).f16451e = interfaceC3487b2;
                    return EnumC3483a2.f16784g;
                }
                return EnumC3483a2.f16782e;
            case 4:
                C0377u c0377u = (C0377u) obj;
                if (!AbstractC3367j.m5096a(c0377u, (C0377u) obj4)) {
                    if (!AbstractC3367j.m5096a(c0377u, ((C0368l) obj3).f1240c)) {
                        z9 = ((Boolean) ((AbstractC3368k) obj2).mo23f(c0377u)).booleanValue();
                    } else {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                }
                return Boolean.valueOf(z9);
            case AbstractC3122c.f15761f /* 5 */:
                C0477j c0477j = (C0477j) obj;
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1743d;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[2];
                c0490w.m1066a(c0477j, (String) obj4);
                C1956n1 c1956n1 = (C1956n1) obj3;
                if (((EnumC1964o1) c1956n1.f11575a.f12512e.getValue()) == EnumC1964o1.f11600f) {
                    c0477j.m1036d(AbstractC0476i.f1677u, new C0468a(null, new C0033i(7, c1956n1, (InterfaceC0516a0) obj2)));
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2114a c2114a = new C2114a(objArr == true ? 1 : 0, (InterfaceC3279c) obj4);
                InterfaceC0213t interfaceC0213t = (InterfaceC0213t) obj3;
                interfaceC0213t.mo415g().m468a(c2114a);
                return new C1460yg((InterfaceC3277a) obj2, interfaceC0213t, c2114a, i8);
            case 7:
                C0661j0 c0661j0 = (C0661j0) obj;
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) obj3;
                InterfaceC2390n2 interfaceC2390n22 = (InterfaceC2390n2) obj4;
                if (interfaceC2390n22 != null) {
                    f8 = ((Number) interfaceC2390n22.getValue()).floatValue();
                } else {
                    f8 = 1.0f;
                }
                c0661j0.m1432a(f8);
                if (interfaceC2390n2 != null) {
                    f9 = ((Number) interfaceC2390n2.getValue()).floatValue();
                } else {
                    f9 = 1.0f;
                }
                c0661j0.m1435f(f9);
                if (interfaceC2390n2 != null) {
                    f10 = ((Number) interfaceC2390n2.getValue()).floatValue();
                } else {
                    f10 = 1.0f;
                }
                c0661j0.m1436g(f10);
                InterfaceC2390n2 interfaceC2390n23 = (InterfaceC2390n2) obj2;
                if (interfaceC2390n23 != null) {
                    j8 = ((C0675q0) interfaceC2390n23.getValue()).f2202a;
                } else {
                    j8 = C0675q0.f2200b;
                }
                c0661j0.m1440o(j8);
                return c1694m;
            case 8:
                float floatValue = ((Number) obj).floatValue();
                C2915j c2915j = (C2915j) obj4;
                if (c2915j.f15182u) {
                    f11 = 1.0f;
                } else {
                    f11 = -1.0f;
                }
                C2929n1 c2929n1 = c2915j.f15181t;
                long m4591d = c2929n1.m4591d(c2929n1.m4594g(f11 * floatValue));
                C2929n1 c2929n12 = ((C2923l1) obj2).f15214a;
                float m4593f = c2929n1.m4593f(c2929n1.m4591d(C2929n1.m4588a(c2929n12, c2929n12.f15236h, m4591d, 1))) * f11;
                if (Math.abs(m4593f) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + m4593f + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((InterfaceC0520b1) obj3).mo1114c(cancellationException);
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C2653j c2653j = (C2653j) obj;
                C3376s c3376s = (C3376s) obj4;
                float floatValue2 = ((Number) c2653j.f14336e.getValue()).floatValue() - c3376s.f16448e;
                float mo4566a = ((C2920k1) obj3).mo4566a(floatValue2);
                c3376s.f16448e = ((Number) c2653j.f14336e.getValue()).floatValue();
                ((C3376s) obj2).f16448e = ((Number) c2653j.f14332a.f14362b.mo23f(c2653j.f14337f)).floatValue();
                if (Math.abs(floatValue2 - mo4566a) > 0.5f) {
                    c2653j.m4260a();
                }
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) obj2;
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                C3131g0 c3131g0 = (C3131g0) obj4;
                long j15 = ((C3100j) c3131g0.f15780s.mo23f((InterfaceC3223n0) obj3)).f15696a;
                if (c3131g0.f15781t) {
                    AbstractC3237u0.m4952n(abstractC3237u0, abstractC3239v0, (int) (j15 >> 32), (int) (j15 & 4294967295L));
                } else {
                    AbstractC3237u0.m4953o(abstractC3237u0, abstractC3239v0, (int) (j15 >> 32), (int) (j15 & 4294967295L), null, 12);
                }
                return c1694m;
            case 11:
                AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) obj3;
                AbstractC3237u0 abstractC3237u02 = (AbstractC3237u0) obj;
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) obj2;
                C3133h0 c3133h0 = (C3133h0) obj4;
                if (c3133h0.f15786w) {
                    AbstractC3237u0.m4951j(abstractC3237u02, abstractC3239v02, interfaceC3223n0.mo4513Q(c3133h0.f15782s), interfaceC3223n0.mo4513Q(c3133h0.f15783t));
                } else {
                    AbstractC3237u0.m4949g(abstractC3237u02, abstractC3239v02, interfaceC3223n0.mo4513Q(c3133h0.f15782s), interfaceC3223n0.mo4513Q(c3133h0.f15783t));
                }
                return c1694m;
            case 12:
                InterfaceC3223n0 interfaceC3223n02 = (InterfaceC3223n0) obj3;
                C3139k0 c3139k0 = (C3139k0) obj2;
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, (AbstractC3239v0) obj4, interfaceC3223n02.mo4513Q(c3139k0.f15800s.mo4827d(interfaceC3223n02.getLayoutDirection())), interfaceC3223n02.mo4513Q(c3139k0.f15800s.mo4825b()));
                return c1694m;
            default:
                C3576p c3576p = (C3576p) obj4;
                C3502g0 c3502g0 = (C3502g0) obj3;
                C3576p c3576p2 = (C3576p) obj2;
                InterfaceC0674q m106u2 = ((InterfaceC1570d) obj).mo2524E().m106u();
                if (c3576p.getView().getVisibility() != 8) {
                    c3576p.f17135B = true;
                    InterfaceC3524n1 interfaceC3524n1 = c3502g0.f16896q;
                    if (interfaceC3524n1 instanceof C3728t) {
                        c3728t = (C3728t) interfaceC3524n1;
                    }
                    if (c3728t != null) {
                        Canvas m1349a = AbstractC0646c.m1349a(m106u2);
                        c3728t.getAndroidViewsHandler$ui_release().getClass();
                        c3576p2.draw(m1349a);
                    }
                    c3576p.f17135B = false;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0037j(C0377u c0377u, C0368l c0368l, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f168f = 4;
        this.f169g = c0377u;
        this.f170h = c0368l;
        this.f171i = (AbstractC3368k) interfaceC3279c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037j(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f168f = i7;
        this.f169g = obj;
        this.f170h = obj2;
        this.f171i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037j(C3376s c3376s, C2920k1 c2920k1, C3376s c3376s2, C2921l c2921l) {
        super(1);
        this.f168f = 9;
        this.f169g = c3376s;
        this.f170h = c2920k1;
        this.f171i = c3376s2;
    }
}
