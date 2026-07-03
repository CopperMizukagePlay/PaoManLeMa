package p174w5;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p008b.AbstractActivityC0245m;
import p017c.AbstractC0326k;
import p017c.C0316a;
import p017c.C0317b;
import p017c.C0318c;
import p017c.C0328m;
import p020c2.C0388h;
import p020c2.C0389i;
import p021c3.AbstractC0390a;
import p023c5.C0427s;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.C0475h;
import p028d2.C0477j;
import p028d2.C0482o;
import p035e1.AbstractC0643a0;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0664l;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0660j;
import p035e1.C0666m;
import p035e1.C0671o0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p035e1.InterfaceC0674q;
import p039e5.C0811dk;
import p041f.InterfaceC1512d;
import p049g1.C1567a;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p056h0.C1748v;
import p057h1.C1752b;
import p057h1.InterfaceC1754d;
import p065i2.InterfaceC2063d;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p068i5.AbstractC2080d;
import p068i5.C2079c;
import p073j2.AbstractC2168e;
import p077k.AbstractC2212q0;
import p077k.C2194h0;
import p077k.C2196i0;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2272i;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2281r;
import p085l0.AbstractC2418w;
import p085l0.C2356f0;
import p085l0.C2375k;
import p085l0.C2395p;
import p092m.AbstractC2487d;
import p101n0.C2705e;
import p102n1.AbstractC2710c;
import p132r2.EnumC3036j;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3191c1;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p177x0.InterfaceC3810r;

/* renamed from: w5.a */
/* loaded from: classes.dex */
public abstract class AbstractC3784a implements InterfaceC2063d {

    /* renamed from: e */
    public static C2266e f17924e;

    /* renamed from: f */
    public static C2266e f17925f;

    /* renamed from: g */
    public static C2266e f17926g;

    /* renamed from: h */
    public static C2266e f17927h;

    /* renamed from: i */
    public static C2266e f17928i;

    /* renamed from: j */
    public static C2266e f17929j;

    /* renamed from: k */
    public static C2266e f17930k;

    /* renamed from: l */
    public static C2266e f17931l;

    /* renamed from: m */
    public static C2266e f17932m;

    /* renamed from: n */
    public static C2266e f17933n;

    /* renamed from: o */
    public static C2266e f17934o;

    /* renamed from: p */
    public static C2266e f17935p;

    /* renamed from: q */
    public static C2266e f17936q;

    /* renamed from: r */
    public static C2266e f17937r;

    /* renamed from: s */
    public static C2266e f17938s;

    /* renamed from: t */
    public static C2266e f17939t;

    /* renamed from: C */
    public static final C0328m m5793C(AbstractC2710c abstractC2710c, InterfaceC3279c interfaceC3279c, C2395p c2395p) {
        Object c0318c;
        Object obj;
        AbstractC2418w.m3953A(abstractC2710c, c2395p);
        Object m3953A = AbstractC2418w.m3953A(interfaceC3279c, c2395p);
        Object[] objArr = new Object[0];
        Object m3847O = c2395p.m3847O();
        Object obj2 = C2375k.f13421a;
        if (m3847O == obj2) {
            m3847O = new C0317b(0);
            c2395p.m3877j0(m3847O);
        }
        Object obj3 = (String) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
        InterfaceC1512d interfaceC1512d = (InterfaceC1512d) c2395p.m3878k(AbstractC0326k.f1137a);
        if (interfaceC1512d == null) {
            c2395p.m3857Z(1213380307);
            Object obj4 = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            while (true) {
                if (obj4 instanceof ContextWrapper) {
                    if (obj4 instanceof InterfaceC1512d) {
                        break;
                    }
                    obj4 = ((ContextWrapper) obj4).getBaseContext();
                } else {
                    obj4 = null;
                    break;
                }
            }
            interfaceC1512d = (InterfaceC1512d) obj4;
        } else {
            c2395p.m3857Z(1213379439);
        }
        c2395p.m3888r(false);
        if (interfaceC1512d != null) {
            Object obj5 = ((AbstractActivityC0245m) interfaceC1512d).f956l;
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj2) {
                m3847O2 = new Object();
                c2395p.m3877j0(m3847O2);
            }
            C0316a c0316a = (C0316a) m3847O2;
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj2) {
                m3847O3 = new C0328m(c0316a);
                c2395p.m3877j0(m3847O3);
            }
            C0328m c0328m = (C0328m) m3847O3;
            boolean m3874i = c2395p.m3874i(c0316a) | c2395p.m3874i(obj5) | c2395p.m3870g(obj3) | c2395p.m3874i(abstractC2710c) | c2395p.m3870g(m3953A);
            Object m3847O4 = c2395p.m3847O();
            if (!m3874i && m3847O4 != obj2) {
                c0318c = m3847O4;
                obj = abstractC2710c;
            } else {
                obj = abstractC2710c;
                c0318c = new C0318c(c0316a, obj5, obj3, obj, m3953A, 0);
                c2395p.m3877j0(c0318c);
            }
            InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) c0318c;
            boolean m3870g = c2395p.m3870g(obj5) | c2395p.m3870g(obj3) | c2395p.m3870g(obj);
            Object m3847O5 = c2395p.m3847O();
            if (m3870g || m3847O5 == obj2) {
                m3847O5 = new C2356f0(interfaceC3279c2);
                c2395p.m3877j0(m3847O5);
            }
            return c0328m;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
    }

    /* renamed from: D */
    public static int m5794D(float f7) {
        if (!Float.isNaN(f7)) {
            return Math.round(f7);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: E */
    public static long m5795E(double d7) {
        if (!Double.isNaN(d7)) {
            return Math.round(d7);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [t5.a, u5.k] */
    /* renamed from: J */
    public static final void m5796J(C0482o c0482o, int i7, C0388h c0388h) {
        C0482o c0482o2;
        C2705e c2705e = new C2705e(new C0482o[16]);
        List m1047i = c0482o.m1047i(false, false);
        while (true) {
            c2705e.m4301c(c2705e.f14519g, m1047i);
            while (true) {
                int i8 = c2705e.f14519g;
                if (i8 != 0) {
                    c0482o2 = (C0482o) c2705e.m4309k(i8 - 1);
                    boolean m1061e = AbstractC0485r.m1061e(c0482o2);
                    C0477j c0477j = c0482o2.f1694d;
                    C2194h0 c2194h0 = c0477j.f1683e;
                    if (!m1061e && !c2194h0.m3588c(AbstractC0487t.f1748i)) {
                        AbstractC3497e1 m1042d = c0482o2.m1042d();
                        if (m1042d != null) {
                            C3101k m3298w = AbstractC2067b.m3298w(AbstractC3191c1.m4895f(m1042d));
                            if (m3298w.f15698a < m3298w.f15700c && m3298w.f15699b < m3298w.f15701d) {
                                Object m3592g = c0477j.f1683e.m3592g(AbstractC0476i.f1661e);
                                Object obj = null;
                                if (m3592g == null) {
                                    m3592g = null;
                                }
                                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3592g;
                                Object m3592g2 = c2194h0.m3592g(AbstractC0487t.f1760u);
                                if (m3592g2 != null) {
                                    obj = m3592g2;
                                }
                                C0475h c0475h = (C0475h) obj;
                                if (interfaceC3281e != null && c0475h != null && ((Number) c0475h.f1654b.mo52a()).floatValue() > 0.0f) {
                                    int i9 = i7 + 1;
                                    c0388h.mo23f(new C0389i(c0482o2, i9, m3298w, m1042d));
                                    m5796J(c0482o2, i9, c0388h);
                                }
                            }
                        } else {
                            throw AbstractC2487d.m4041e("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            m1047i = c0482o2.m1047i(false, false);
        }
    }

    /* renamed from: a */
    public static final long m5797a(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: b */
    public static C2079c m5798b(C2079c c2079c) {
        c2079c.m3368f();
        c2079c.f12311g = true;
        if (c2079c.f12310f > 0) {
            return c2079c;
        }
        return C2079c.f12308h;
    }

    /* renamed from: c */
    public static final InterfaceC3810r m5799c(InterfaceC3810r interfaceC3810r, InterfaceC0667m0 interfaceC0667m0) {
        return AbstractC0168a.m386c(interfaceC3810r, 0.0f, 0.0f, interfaceC0667m0, 518143);
    }

    /* renamed from: d */
    public static final InterfaceC3810r m5800d(InterfaceC3810r interfaceC3810r) {
        return AbstractC0168a.m386c(interfaceC3810r, 0.0f, 0.0f, null, 520191);
    }

    /* renamed from: e */
    public static Handler m5801e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0390a.m858a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: f */
    public static C2079c m5802f() {
        return new C2079c(10);
    }

    /* renamed from: g */
    public static final void m5803g(InterfaceC1570d interfaceC1570d, C1752b c1752b) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Canvas canvas;
        boolean z11;
        float f7;
        InterfaceC0674q m106u = interfaceC1570d.mo2524E().m106u();
        C1752b c1752b2 = (C1752b) interfaceC1570d.mo2524E().f153g;
        InterfaceC1754d interfaceC1754d = c1752b.f10663a;
        if (!c1752b.f10681s) {
            c1752b.m2805a();
            if (!interfaceC1754d.mo2819H()) {
                try {
                    c1752b.f10663a.mo2832h(c1752b.f10664b, c1752b.f10665c, c1752b, c1752b.f10667e);
                } catch (Throwable unused) {
                }
            }
            if (interfaceC1754d.mo2818G() > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                m106u.mo1346s();
            }
            Canvas m1349a = AbstractC0646c.m1349a(m106u);
            boolean isHardwareAccelerated = m1349a.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j6 = c1752b.f10682t;
                float f8 = (int) (j6 >> 32);
                float f9 = (int) (j6 & 4294967295L);
                long j7 = c1752b.f10683u;
                float f10 = ((int) (j7 >> 32)) + f8;
                float f11 = ((int) (j7 & 4294967295L)) + f9;
                float mo2825a = interfaceC1754d.mo2825a();
                C0666m mo2848x = interfaceC1754d.mo2848x();
                int mo2822K = interfaceC1754d.mo2822K();
                if (mo2825a >= 1.0f && mo2822K == 3 && mo2848x == null && interfaceC1754d.mo2846v() != 1) {
                    m1349a.save();
                    m1349a = m1349a;
                    f7 = f8;
                } else {
                    C0427s c0427s = c1752b.f10678p;
                    if (c0427s == null) {
                        c0427s = AbstractC0659i0.m1407g();
                        c1752b.f10678p = c0427s;
                    }
                    c0427s.m908g(mo2825a);
                    c0427s.m909h(mo2822K);
                    c0427s.m911j(mo2848x);
                    m1349a = m1349a;
                    f7 = f8;
                    m1349a.saveLayer(f7, f9, f10, f11, (Paint) c0427s.f1462g);
                }
                m1349a.translate(f7, f9);
                m1349a.concat(interfaceC1754d.mo2814C());
            }
            if (!isHardwareAccelerated && c1752b.f10685w) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                m106u.mo1341m();
                AbstractC0655g0 m2808d = c1752b.m2808d();
                if (m2808d instanceof C0651e0) {
                    InterfaceC0674q.m1448p(m106u, ((C0651e0) m2808d).f2135a);
                } else if (m2808d instanceof C0653f0) {
                    C0660j c0660j = c1752b.f10675m;
                    if (c0660j != null) {
                        c0660j.f2151a.rewind();
                    } else {
                        c0660j = AbstractC0664l.m1445a();
                        c1752b.f10675m = c0660j;
                    }
                    C0660j.m1427a(c0660j, ((C0653f0) m2808d).f2142a);
                    m106u.mo1344q(c0660j);
                } else if (m2808d instanceof C0649d0) {
                    m106u.mo1344q(((C0649d0) m2808d).f2132a);
                } else {
                    throw new RuntimeException();
                }
            }
            if (c1752b2 != null) {
                C1748v c1748v = c1752b2.f10680r;
                if (!c1748v.f10650a) {
                    AbstractC0643a0.m1328a("Only add dependencies during a tracking");
                }
                C2196i0 c2196i0 = (C2196i0) c1748v.f10653d;
                if (c2196i0 != null) {
                    c2196i0.m3599a(c1752b);
                } else if (((C1752b) c1748v.f10651b) != null) {
                    int i7 = AbstractC2212q0.f12726a;
                    C2196i0 c2196i02 = new C2196i0();
                    C1752b c1752b3 = (C1752b) c1748v.f10651b;
                    AbstractC3367j.m5097b(c1752b3);
                    c2196i02.m3599a(c1752b3);
                    c2196i02.m3599a(c1752b);
                    c1748v.f10653d = c2196i02;
                    c1748v.f10651b = null;
                } else {
                    c1748v.f10651b = c1752b;
                }
                C2196i0 c2196i03 = (C2196i0) c1748v.f10654e;
                if (c2196i03 != null) {
                    z11 = !c2196i03.m3609k(c1752b);
                } else if (((C1752b) c1748v.f10652c) != c1752b) {
                    z11 = true;
                } else {
                    c1748v.f10652c = null;
                    z11 = false;
                }
                if (z11) {
                    c1752b.f10679q++;
                }
            }
            if (!AbstractC0646c.m1349a(m106u).isHardwareAccelerated()) {
                C1568b c1568b = c1752b.f10677o;
                if (c1568b == null) {
                    c1568b = new C1568b();
                    c1752b.f10677o = c1568b;
                }
                C0031h1 c0031h1 = c1568b.f10182f;
                InterfaceC3093c interfaceC3093c = c1752b.f10664b;
                EnumC3103m enumC3103m = c1752b.f10665c;
                long m3347y = AbstractC2072e.m3347y(c1752b.f10683u);
                C1567a c1567a = ((C1568b) c0031h1.f154h).f10181e;
                InterfaceC3093c interfaceC3093c2 = c1567a.f10177a;
                EnumC3103m enumC3103m2 = c1567a.f10178b;
                InterfaceC0674q m106u2 = c0031h1.m106u();
                z10 = z8;
                canvas = m1349a;
                long m109x = c0031h1.m109x();
                z9 = z7;
                C1752b c1752b4 = (C1752b) c0031h1.f153g;
                c0031h1.m84H(interfaceC3093c);
                c0031h1.m85I(enumC3103m);
                c0031h1.m83G(m106u);
                c0031h1.m86J(m3347y);
                c0031h1.f153g = c1752b;
                m106u.mo1341m();
                try {
                    c1752b.m2807c(c1568b);
                } finally {
                    m106u.mo1338j();
                    c0031h1.m84H(interfaceC3093c2);
                    c0031h1.m85I(enumC3103m2);
                    c0031h1.m83G(m106u2);
                    c0031h1.m86J(m109x);
                    c0031h1.f153g = c1752b4;
                }
            } else {
                z9 = z7;
                z10 = z8;
                canvas = m1349a;
                interfaceC1754d.mo2829e(m106u);
            }
            if (z10) {
                m106u.mo1338j();
            }
            if (z9) {
                m106u.mo1343o();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
        }
    }

    /* renamed from: i */
    public static final C2266e m5804i() {
        C2266e c2266e = f17925f;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.AllInclusive", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(18.6f, 6.62f);
        m179f.m1507h(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f);
        m179f.m1510k(12.0f, 10.66f);
        m179f.m1510k(10.48f, 12.0f);
        m179f.m1509j(0.01f);
        m179f.m1510k(7.8f, 14.39f);
        m179f.m1507h(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f);
        m179f.m1507h(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f);
        m179f.m1513n(3.53f, 8.62f, 5.4f, 8.62f);
        m179f.m1507h(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        m179f.m1511l(1.13f, 1.0f);
        m179f.m1511l(1.51f, -1.34f);
        m179f.m1510k(9.22f, 8.2f);
        m179f.m1506g(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        m179f.m1506g(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        m179f.m1514o(2.42f, 5.38f, 5.4f, 5.38f);
        m179f.m1507h(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        m179f.m1511l(2.83f, -2.5f);
        m179f.m1511l(0.01f, 0.01f);
        m179f.m1510k(13.52f, 12.0f);
        m179f.m1509j(-0.01f);
        m179f.m1511l(2.69f, -2.39f);
        m179f.m1507h(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f);
        m179f.m1507h(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f);
        m179f.m1514o(-1.52f, 3.38f, -3.39f, 3.38f);
        m179f.m1507h(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        m179f.m1511l(-1.14f, -1.01f);
        m179f.m1511l(-1.51f, 1.34f);
        m179f.m1511l(1.27f, 1.12f);
        m179f.m1507h(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        m179f.m1507h(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f);
        m179f.m1514o(-2.42f, -5.37f, -5.4f, -5.37f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17925f = m3673b;
        return m3673b;
    }

    /* renamed from: k */
    public static final C2266e m5805k() {
        C2266e c2266e = f17928i;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ContentCopy", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(16.0f, 1.0f);
        c0811dk.m1510k(4.0f, 1.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1510k(4.0f, 3.0f);
        c0811dk.m1509j(12.0f);
        c0811dk.m1510k(16.0f, 1.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(19.0f, 5.0f);
        c0811dk.m1510k(8.0f, 5.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1507h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c0811dk.m1509j(11.0f);
        c0811dk.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0811dk.m1510k(21.0f, 7.0f);
        c0811dk.m1507h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(19.0f, 21.0f);
        c0811dk.m1510k(8.0f, 21.0f);
        c0811dk.m1510k(8.0f, 7.0f);
        c0811dk.m1509j(11.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17928i = m3673b;
        return m3673b;
    }

    /* renamed from: l */
    public static final C2266e m5806l() {
        C2266e c2266e = f17929j;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Dns", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.0f, 13.0f);
        c0811dk.m1508i(4.0f);
        c0811dk.m1507h(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1507h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c0811dk.m1509j(16.0f);
        c0811dk.m1507h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c0811dk.m1517r(-6.0f);
        c0811dk.m1507h(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 19.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c0811dk.m1514o(0.9f, -2.0f, 2.0f, -2.0f);
        c0811dk.m1514o(2.0f, 0.9f, 2.0f, 2.0f);
        c0811dk.m1514o(-0.9f, 2.0f, -2.0f, 2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(20.0f, 3.0f);
        c0811dk.m1508i(4.0f);
        c0811dk.m1507h(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1507h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c0811dk.m1509j(16.0f);
        c0811dk.m1507h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c0811dk.m1516q(4.0f);
        c0811dk.m1507h(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 9.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c0811dk.m1514o(0.9f, -2.0f, 2.0f, -2.0f);
        c0811dk.m1514o(2.0f, 0.9f, 2.0f, 2.0f);
        c0811dk.m1514o(-0.9f, 2.0f, -2.0f, 2.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17929j = m3673b;
        return m3673b;
    }

    /* renamed from: m */
    public static final C2266e m5807m() {
        C2266e c2266e = f17930k;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.FilterAlt", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(4.25f, 5.61f);
        m179f.m1506g(6.27f, 8.2f, 10.0f, 13.0f, 10.0f, 13.0f);
        m179f.m1517r(6.0f);
        m179f.m1507h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        m179f.m1509j(2.0f);
        m179f.m1507h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        m179f.m1517r(-6.0f);
        m179f.m1507h(0.0f, 0.0f, 3.72f, -4.8f, 5.74f, -7.39f);
        m179f.m1506g(20.25f, 4.95f, 19.78f, 4.0f, 18.95f, 4.0f);
        m179f.m1508i(5.04f);
        m179f.m1506g(4.21f, 4.0f, 3.74f, 4.95f, 4.25f, 5.61f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17930k = m3673b;
        return m3673b;
    }

    /* renamed from: n */
    public static final C2266e m5808n() {
        C2266e c2266e = f17924e;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("AutoMirrored.Filled.KeyboardArrowRight", true);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(8.59f, 16.59f));
        arrayList.add(new C2275l(13.17f, 12.0f));
        arrayList.add(new C2275l(8.59f, 7.41f));
        arrayList.add(new C2275l(10.0f, 6.0f));
        arrayList.add(new C2281r(6.0f, 6.0f));
        arrayList.add(new C2281r(-6.0f, 6.0f));
        arrayList.add(new C2281r(-1.41f, -1.41f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17924e = m3673b;
        return m3673b;
    }

    /* renamed from: o */
    public static final C2266e m5809o() {
        C2266e c2266e = f17934o;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Palette", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(12.0f, 2.0f);
        m179f.m1506g(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        m179f.m1514o(4.49f, 10.0f, 10.0f, 10.0f);
        m179f.m1507h(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        m179f.m1507h(0.0f, -0.61f, -0.23f, -1.2f, -0.64f, -1.67f);
        m179f.m1507h(-0.08f, -0.1f, -0.13f, -0.21f, -0.13f, -0.33f);
        m179f.m1507h(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        m179f.m1508i(16.0f);
        m179f.m1507h(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        m179f.m1506g(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
        m179f.m1505f();
        m179f.m1512m(17.5f, 13.0f);
        m179f.m1507h(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        m179f.m1507h(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        m179f.m1514o(1.5f, 0.67f, 1.5f, 1.5f);
        m179f.m1506g(19.0f, 12.33f, 18.33f, 13.0f, 17.5f, 13.0f);
        m179f.m1505f();
        m179f.m1512m(14.5f, 9.0f);
        m179f.m1506g(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
        m179f.m1506g(13.0f, 6.67f, 13.67f, 6.0f, 14.5f, 6.0f);
        m179f.m1513n(16.0f, 6.67f, 16.0f, 7.5f);
        m179f.m1506g(16.0f, 8.33f, 15.33f, 9.0f, 14.5f, 9.0f);
        m179f.m1505f();
        m179f.m1512m(5.0f, 11.5f);
        m179f.m1506g(5.0f, 10.67f, 5.67f, 10.0f, 6.5f, 10.0f);
        m179f.m1513n(8.0f, 10.67f, 8.0f, 11.5f);
        m179f.m1506g(8.0f, 12.33f, 7.33f, 13.0f, 6.5f, 13.0f);
        m179f.m1513n(5.0f, 12.33f, 5.0f, 11.5f);
        m179f.m1505f();
        m179f.m1512m(11.0f, 7.5f);
        m179f.m1506g(11.0f, 8.33f, 10.33f, 9.0f, 9.5f, 9.0f);
        m179f.m1513n(8.0f, 8.33f, 8.0f, 7.5f);
        m179f.m1506g(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f);
        m179f.m1513n(11.0f, 6.67f, 11.0f, 7.5f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17934o = m3673b;
        return m3673b;
    }

    /* renamed from: p */
    public static final C2266e m5810p() {
        C2266e c2266e = f17936q;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Route", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(19.0f, 15.18f);
        c0811dk.m1516q(7.0f);
        c0811dk.m1507h(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        c0811dk.m1514o(-4.0f, 1.79f, -4.0f, 4.0f);
        c0811dk.m1517r(10.0f);
        c0811dk.m1507h(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c0811dk.m1514o(-2.0f, -0.9f, -2.0f, -2.0f);
        c0811dk.m1516q(8.82f);
        c0811dk.m1506g(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
        c0811dk.m1507h(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        c0811dk.m1513n(3.0f, 4.34f, 3.0f, 6.0f);
        c0811dk.m1507h(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        c0811dk.m1516q(17.0f);
        c0811dk.m1507h(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        c0811dk.m1514o(4.0f, -1.79f, 4.0f, -4.0f);
        c0811dk.m1516q(7.0f);
        c0811dk.m1507h(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        c0811dk.m1514o(2.0f, 0.9f, 2.0f, 2.0f);
        c0811dk.m1517r(8.18f);
        c0811dk.m1507h(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
        c0811dk.m1507h(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        c0811dk.m1514o(3.0f, -1.34f, 3.0f, -3.0f);
        c0811dk.m1506g(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17936q = m3673b;
        return m3673b;
    }

    /* renamed from: s */
    public static final C2266e m5811s() {
        C2266e c2266e = f17937r;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Share", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(18.0f, 16.08f);
        m179f.m1507h(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        m179f.m1510k(8.91f, 12.7f);
        m179f.m1507h(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        m179f.m1514o(-0.04f, -0.47f, -0.09f, -0.7f);
        m179f.m1511l(7.05f, -4.11f);
        m179f.m1507h(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        m179f.m1507h(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        m179f.m1514o(-1.34f, -3.0f, -3.0f, -3.0f);
        m179f.m1514o(-3.0f, 1.34f, -3.0f, 3.0f);
        m179f.m1507h(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        m179f.m1510k(8.04f, 9.81f);
        m179f.m1506g(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        m179f.m1507h(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        m179f.m1514o(1.34f, 3.0f, 3.0f, 3.0f);
        m179f.m1507h(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        m179f.m1511l(7.12f, 4.16f);
        m179f.m1507h(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        m179f.m1507h(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        m179f.m1507h(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        m179f.m1514o(-1.31f, -2.92f, -2.92f, -2.92f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17937r = m3673b;
        return m3673b;
    }

    /* renamed from: t */
    public static final C2266e m5812t() {
        C2266e c2266e = f17938s;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.SwapVert", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(16.0f, 17.01f);
        c0811dk.m1516q(10.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(7.01f);
        c0811dk.m1509j(-3.0f);
        c0811dk.m1510k(15.0f, 21.0f);
        c0811dk.m1511l(4.0f, -3.99f);
        c0811dk.m1509j(-3.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(9.0f, 3.0f);
        c0811dk.m1510k(5.0f, 6.99f);
        c0811dk.m1509j(3.0f);
        c0811dk.m1516q(14.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1516q(6.99f);
        c0811dk.m1509j(3.0f);
        c0811dk.m1510k(9.0f, 3.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f17938s = m3673b;
        return m3673b;
    }

    /* renamed from: u */
    public static final EnumC3036j m5813u(C1598l0 c1598l0, int i7) {
        C1596k0 c1596k0 = c1598l0.f10288a;
        if (c1596k0.f10276a.f10239f.length() != 0) {
            int m2578e = c1598l0.m2578e(i7);
            if ((i7 != 0 && m2578e == c1598l0.m2578e(i7 - 1)) || (i7 != c1596k0.f10276a.f10239f.length() && m2578e == c1598l0.m2578e(i7 + 1))) {
                return c1598l0.m2574a(i7);
            }
        }
        return c1598l0.m2582i(i7);
    }

    /* renamed from: w */
    public static long m5814w(float f7, float f8, float f9) {
        return AbstractC0659i0.m1403c(Color.HSVToColor(new float[]{f7, AbstractC2168e.m3529p(f8, 0.0f, 1.0f), AbstractC2168e.m3529p(f9, 0.0f, 1.0f)}));
    }

    /* renamed from: x */
    public static final boolean m5815x(long j6) {
        if ((j6 & 9223372034707292159L) != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static final long m5816y(long j6, long j7, float f7) {
        float m3409v = AbstractC2080d.m3409v(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j7 >> 32)), f7);
        float m3409v2 = AbstractC2080d.m3409v(Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f7);
        return (Float.floatToRawIntBits(m3409v) << 32) | (Float.floatToRawIntBits(m3409v2) & 4294967295L);
    }

    /* renamed from: z */
    public static List m5817z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC3367j.m5099d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* renamed from: A */
    public abstract int mo3222A(int i7);

    /* renamed from: B */
    public abstract int mo3223B(int i7);

    /* renamed from: G */
    public abstract void mo2625G(boolean z7);

    /* renamed from: H */
    public abstract void mo2626H();

    /* renamed from: I */
    public abstract void mo2627I();

    @Override // p065i2.InterfaceC2063d
    /* renamed from: h */
    public int mo144h(int i7) {
        return mo3223B(i7);
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: j */
    public int mo146j(int i7) {
        return mo3222A(i7);
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: q */
    public int mo151q(int i7) {
        int mo3222A = mo3222A(i7);
        if (mo3222A == -1 || mo3222A(mo3222A) == -1) {
            return -1;
        }
        return mo3222A;
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: r */
    public int mo152r(int i7) {
        int mo3223B = mo3223B(i7);
        if (mo3223B == -1 || mo3223B(mo3223B) == -1) {
            return -1;
        }
        return mo3223B;
    }

    /* renamed from: v */
    public abstract void mo2630v();

    /* renamed from: F */
    public void mo2624F(boolean z7) {
    }
}
