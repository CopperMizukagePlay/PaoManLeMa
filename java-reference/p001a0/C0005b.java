package p001a0;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import androidx.compose.p007ui.draw.ShadowGraphicsLayerElement;
import java.util.List;
import p002a1.C0103e;
import p010b1.C0265c;
import p018c0.InputConnectionC0356z;
import p024c6.C0438e;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0466d;
import p027d1.C0467e;
import p028d2.AbstractC0489v;
import p028d2.C0474g;
import p028d2.C0477j;
import p032d6.C0548l;
import p034e0.AbstractC0641z;
import p034e0.C0640y;
import p034e0.InterfaceC0617m;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0664l;
import p035e1.C0644b;
import p035e1.C0647c0;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0654g;
import p035e1.C0660j;
import p035e1.C0661j0;
import p035e1.C0666m;
import p035e1.C0669n0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p035e1.C0684z;
import p035e1.InterfaceC0674q;
import p039e5.C1120nh;
import p042f1.AbstractC1516c;
import p042f1.C1517d;
import p049g1.C1567a;
import p049g1.C1568b;
import p049g1.C1573g;
import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p057h1.C1752b;
import p060h5.AbstractC1793a0;
import p063i0.C1956n1;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p079k1.AbstractC2287x;
import p079k1.C2260b;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p087l2.InterfaceC2443g;
import p092m.AbstractC2487d;
import p092m.C2502r;
import p100n.C2649h1;
import p100n.C2671p;
import p102n1.AbstractC2710c;
import p107o.C2752k;
import p107o.C2755l;
import p107o.C2758m;
import p107o.C2761n;
import p107o.C2764o;
import p107o.C2769p1;
import p107o.C2775s;
import p115p.AbstractC2826f;
import p115p.C2828h;
import p115p.C2830j;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2868s;
import p117p1.C2874y;
import p117p1.C2875z;
import p122q.C2911h1;
import p122q.C2929n1;
import p140s2.C3096f;
import p140s2.C3100j;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p146t1.AbstractC3191c1;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p152u.C3325m;
import p152u.C3330r;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p160v.C3407e0;
import p160v.C3437t0;
import p162v1.AbstractC3498f;
import p162v1.C3502g0;
import p162v1.C3508i0;
import p162v1.EnumC3483a2;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.b */
/* loaded from: classes.dex */
public final class C0005b extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f53f;

    /* renamed from: g */
    public final /* synthetic */ Object f54g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005b(int i7, Object obj) {
        super(1);
        this.f53f = i7;
        this.f54g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0397  */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, u5.v] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        long m3234d;
        float ceil;
        boolean z7;
        Object c1574h;
        int i7;
        C0666m c0666m;
        long j6;
        C0684z c0684z;
        C0684z c0684z2;
        boolean z8;
        C0654g m1406f;
        C1568b c1568b;
        C0031h1 c0031h1;
        float f7;
        float f8;
        long m109x;
        boolean z9;
        switch (this.f53f) {
            case 0:
                ((C0477j) obj).m1036d(AbstractC0641z.f2122c, new C0640y(EnumC0088w0.f405e, ((InterfaceC0617m) this.f54g).mo125a(), 2, true));
                return C1694m.f10482a;
            case 1:
                float[] fArr = ((C0647c0) obj).f2130a;
                InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f54g;
                if (interfaceC3238v.mo4923M()) {
                    AbstractC3191c1.m4897h(interfaceC3238v).mo4925O(interfaceC3238v, fArr);
                }
                return C1694m.f10482a;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                C0048l2 c0048l2 = (C0048l2) this.f54g;
                C2345c1 c2345c1 = c0048l2.f246a;
                C2345c1 c2345c12 = c0048l2.f246a;
                float m3729g = c2345c1.m3729g() + floatValue;
                C2345c1 c2345c13 = c0048l2.f247b;
                if (m3729g > c2345c13.m3729g()) {
                    floatValue = c2345c13.m3729g() - c2345c12.m3729g();
                } else if (m3729g < 0.0f) {
                    floatValue = -c2345c12.m3729g();
                }
                c2345c12.m3730h(c2345c12.m3729g() + floatValue);
                return Float.valueOf(floatValue);
            case 3:
                C0103e c0103e = (C0103e) obj;
                if (!c0103e.f17992e.f18005r) {
                    return EnumC3483a2.f16783f;
                }
                C0103e c0103e2 = c0103e.f474t;
                EnumC3483a2 enumC3483a2 = EnumC3483a2.f16782e;
                if (c0103e2 != null) {
                    C0005b c0005b = new C0005b(3, (C0019e1) this.f54g);
                    if (c0005b.mo23f(c0103e2) == enumC3483a2) {
                        AbstractC3498f.m5386z(c0103e2, c0005b);
                    }
                }
                c0103e.f474t = null;
                c0103e.f473s = null;
                return enumC3483a2;
            case 4:
                C3508i0 c3508i0 = (C3508i0) obj;
                ((C0078t0) this.f54g).mo23f(c3508i0);
                c3508i0.m5460a();
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C0661j0 c0661j0 = (C0661j0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f54g;
                c0661j0.m1437h(c0661j0.f2169t.mo559b() * AbstractC2826f.f14890d);
                c0661j0.m1438j(shadowGraphicsLayerElement.f752a);
                c0661j0.m1434e(shadowGraphicsLayerElement.f753b);
                c0661j0.m1433d(shadowGraphicsLayerElement.f754c);
                c0661j0.m1439n(shadowGraphicsLayerElement.f755d);
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                ((InputConnectionC0356z) this.f54g).m794a((InterfaceC2443g) obj);
                return C1694m.f10482a;
            case 7:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f54g).cancel();
                }
                return C1694m.f10482a;
            case 8:
                AbstractC0489v.m1065c((C0477j) obj, ((C0474g) this.f54g).f1652a);
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                ((List) obj).add((Float) ((C3437t0) this.f54g).mo52a());
                return true;
            case AbstractC3122c.f15760e /* 10 */:
                C0661j0 c0661j02 = (C0661j0) obj;
                C0669n0 c0669n0 = (C0669n0) this.f54g;
                c0661j02.m1435f(c0669n0.f2189s);
                c0661j02.m1436g(c0669n0.f2190t);
                c0661j02.m1432a(c0669n0.f2191u);
                c0661j02.m1441p(0.0f);
                c0661j02.m1442q(0.0f);
                c0661j02.m1437h(c0669n0.f2192v);
                float f9 = c0669n0.f2193w;
                if (c0661j02.f2163n != f9) {
                    c0661j02.f2154e |= 1024;
                    c0661j02.f2163n = f9;
                }
                float f10 = c0669n0.f2194x;
                if (c0661j02.f2164o != f10) {
                    c0661j02.f2154e |= 2048;
                    c0661j02.f2164o = f10;
                }
                c0661j02.m1440o(c0669n0.f2195y);
                c0661j02.m1438j(c0669n0.f2196z);
                c0661j02.m1434e(c0669n0.f2184A);
                c0661j02.m1433d(c0669n0.f2185B);
                c0661j02.m1439n(c0669n0.f2186C);
                int i8 = c0669n0.f2187D;
                if (c0661j02.f2171v != i8) {
                    c0661j02.f2154e |= 524288;
                    c0661j02.f2171v = i8;
                }
                return C1694m.f10482a;
            case 11:
                ((C0438e) this.f54g).get(((Number) obj).intValue());
                return null;
            case 12:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                C1752b c1752b = (C1752b) this.f54g;
                C0660j c0660j = c1752b.f10674l;
                if (c1752b.f10676n && c1752b.f10685w && c0660j != null) {
                    C0031h1 mo2524E = interfaceC1570d.mo2524E();
                    long m109x2 = mo2524E.m109x();
                    mo2524E.m106u().mo1341m();
                    try {
                        ((C0031h1) ((C0019e1) mo2524E.f152f).f109e).m106u().mo1344q(c0660j);
                        c1752b.m2807c(interfaceC1570d);
                    } finally {
                        AbstractC2487d.m4052p(mo2524E, m109x2);
                    }
                } else {
                    c1752b.m2807c(interfaceC1570d);
                }
                return C1694m.f10482a;
            case 13:
                ((C2349d1) this.f54g).m3742h((int) (((C3102l) obj).f15702a >> 32));
                return C1694m.f10482a;
            case 14:
                float m3729g2 = ((C1956n1) this.f54g).f11575a.f12515h.m3729g();
                if (Float.isNaN(m3729g2)) {
                    m3234d = 0;
                } else {
                    m3234d = AbstractC2064e.m3234d(AbstractC3784a.m5794D(m3729g2), 0);
                }
                return new C3100j(m3234d);
            case AbstractC3122c.f15762g /* 15 */:
                AbstractC2287x abstractC2287x = (AbstractC2287x) obj;
                C2260b c2260b = (C2260b) this.f54g;
                c2260b.m3671g(abstractC2287x);
                InterfaceC3279c interfaceC3279c = c2260b.f13107i;
                if (interfaceC3279c != null) {
                    interfaceC3279c.mo23f(abstractC2287x);
                }
                return C1694m.f10482a;
            case 16:
                C2671p c2671p = (C2671p) obj;
                float f11 = c2671p.f14379b;
                float f12 = 0.0f;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                float f13 = 1.0f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                float f14 = c2671p.f14380c;
                float f15 = -0.5f;
                if (f14 < -0.5f) {
                    f14 = -0.5f;
                }
                float f16 = 0.5f;
                if (f14 > 0.5f) {
                    f14 = 0.5f;
                }
                float f17 = c2671p.f14381d;
                if (f17 >= -0.5f) {
                    f15 = f17;
                }
                if (f15 <= 0.5f) {
                    f16 = f15;
                }
                float f18 = c2671p.f14378a;
                if (f18 >= 0.0f) {
                    f12 = f18;
                }
                if (f12 <= 1.0f) {
                    f13 = f12;
                }
                return new C0677s(C0677s.m1452a(AbstractC0659i0.m1402b(f11, f14, f16, f13, C1517d.f10038x), (AbstractC1516c) this.f54g));
            case 17:
                C0265c c0265c = (C0265c) obj;
                C2764o c2764o = (C2764o) this.f54g;
                if (c0265c.mo559b() * c2764o.f14731v >= 0.0f && C0467e.m1025c(c0265c.f999e.mo550c()) > 0.0f) {
                    if (C3096f.m4776a(c2764o.f14731v, 0.0f)) {
                        ceil = 1.0f;
                    } else {
                        ceil = (float) Math.ceil(c0265c.mo559b() * c2764o.f14731v);
                    }
                    float f19 = 2;
                    float min = Math.min(ceil, (float) Math.ceil(C0467e.m1025c(c0265c.f999e.mo550c()) / f19));
                    float f20 = min / f19;
                    long m5797a = AbstractC3784a.m5797a(f20, f20);
                    long m2975c = AbstractC1793a0.m2975c(C0467e.m1026d(c0265c.f999e.mo550c()) - min, C0467e.m1024b(c0265c.f999e.mo550c()) - min);
                    float f21 = min * f19;
                    if (f21 > C0467e.m1025c(c0265c.f999e.mo550c())) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0655g0 mo1393a = c2764o.f14733x.mo1393a(c0265c.f999e.mo550c(), c0265c.f999e.getLayoutDirection(), c0265c);
                    if (mo1393a instanceof C0649d0) {
                        C0671o0 c0671o0 = c2764o.f14732w;
                        C0649d0 c0649d0 = (C0649d0) mo1393a;
                        C0660j c0660j2 = c0649d0.f2132a;
                        if (z7) {
                            return c0265c.m558a(new C2649h1(3, c0649d0, c0671o0));
                        }
                        if (c0671o0 != null) {
                            c0666m = new C0666m(5, c0671o0.f2197a);
                            i7 = 1;
                        } else {
                            i7 = 0;
                            c0666m = null;
                        }
                        C0465c m1428b = c0660j2.m1428b();
                        float f22 = m1428b.f1626b;
                        float f23 = m1428b.f1625a;
                        if (c2764o.f14730u == null) {
                            c2764o.f14730u = new C2752k();
                        }
                        C2752k c2752k = c2764o.f14730u;
                        AbstractC3367j.m5097b(c2752k);
                        C0660j c0660j3 = c2752k.f14696d;
                        if (c0660j3 == null) {
                            c0660j3 = AbstractC0664l.m1445a();
                            c2752k.f14696d = c0660j3;
                        }
                        c0660j3.m1431e();
                        float f24 = m1428b.f1625a;
                        float f25 = m1428b.f1628d;
                        float f26 = m1428b.f1627c;
                        float f27 = m1428b.f1626b;
                        if (Float.isNaN(f24) || Float.isNaN(f27) || Float.isNaN(f26) || Float.isNaN(f25)) {
                            AbstractC0664l.m1446b("Invalid rectangle, make sure no value is NaN");
                        }
                        if (c0660j3.f2152b == null) {
                            c0660j3.f2152b = new RectF();
                        }
                        RectF rectF = c0660j3.f2152b;
                        AbstractC3367j.m5097b(rectF);
                        rectF.set(f24, f27, f26, f25);
                        Path path = c0660j3.f2151a;
                        RectF rectF2 = c0660j3.f2152b;
                        AbstractC3367j.m5097b(rectF2);
                        path.addRect(rectF2, Path.Direction.CCW);
                        c0660j3.m1430d(c0660j3, c0660j2, 0);
                        ?? obj2 = new Object();
                        long m3326b = AbstractC2072e.m3326b((int) Math.ceil(m1428b.f1627c - f23), (int) Math.ceil(m1428b.f1628d - f22));
                        C2752k c2752k2 = c2764o.f14730u;
                        AbstractC3367j.m5097b(c2752k2);
                        C0654g c0654g = c2752k2.f14693a;
                        C0644b c0644b = c2752k2.f14694b;
                        if (c0654g != null) {
                            j6 = m3326b;
                            c0684z = new C0684z(c0654g.m1362a());
                        } else {
                            j6 = m3326b;
                            c0684z = null;
                        }
                        try {
                            try {
                                if (c0684z == null || c0684z.f2216a != 0) {
                                    if (c0654g != null) {
                                        c0684z2 = new C0684z(c0654g.m1362a());
                                    } else {
                                        c0684z2 = null;
                                    }
                                    if (c0684z2 == null || i7 != c0684z2.f2216a) {
                                        z8 = false;
                                        if (c0654g != null) {
                                            Bitmap bitmap = c0654g.f2144a;
                                            if (c0644b != null && C0467e.m1026d(c0265c.f999e.mo550c()) <= bitmap.getWidth() && C0467e.m1024b(c0265c.f999e.mo550c()) <= bitmap.getHeight() && z8) {
                                                m1406f = c0654g;
                                                c1568b = c2752k2.f14695c;
                                                if (c1568b == null) {
                                                    c1568b = new C1568b();
                                                    c2752k2.f14695c = c1568b;
                                                }
                                                c0031h1 = c1568b.f10182f;
                                                C1567a c1567a = c1568b.f10181e;
                                                long m3347y = AbstractC2072e.m3347y(j6);
                                                EnumC3103m layoutDirection = c0265c.f999e.getLayoutDirection();
                                                C1568b c1568b2 = c1568b;
                                                InterfaceC3093c interfaceC3093c = c1567a.f10177a;
                                                C0666m c0666m2 = c0666m;
                                                EnumC3103m enumC3103m = c1567a.f10178b;
                                                C0660j c0660j4 = c0660j3;
                                                InterfaceC0674q interfaceC0674q = c1567a.f10179c;
                                                C0654g c0654g2 = m1406f;
                                                long j7 = c1567a.f10180d;
                                                c1567a.f10177a = c0265c;
                                                c1567a.f10178b = layoutDirection;
                                                c1567a.f10179c = c0644b;
                                                c1567a.f10180d = m3347y;
                                                c0644b.mo1341m();
                                                InterfaceC1570d.m2535D(c1568b2, C0677s.f2204b, 0L, m3347y, 0.0f, 58);
                                                f7 = -f23;
                                                f8 = -f22;
                                                ((C0019e1) c0031h1.f152f).m50v(f7, f8);
                                                InterfaceC1570d.m2541T(c1568b2, c0649d0.f2132a, c0671o0, 0.0f, new C1574h(f21, 0.0f, 0, 0, 30), 52);
                                                float f28 = 1;
                                                float m1026d = (C0467e.m1026d(c1568b2.mo2546c()) + f28) / C0467e.m1026d(c1568b2.mo2546c());
                                                float m1024b = (C0467e.m1024b(c1568b2.mo2546c()) + f28) / C0467e.m1024b(c1568b2.mo2546c());
                                                C0644b c0644b2 = c0644b;
                                                long mo2545Y = c1568b2.mo2545Y();
                                                m109x = c0031h1.m109x();
                                                c0031h1.m106u().mo1341m();
                                                ((C0019e1) c0031h1.f152f).m48t(m1026d, m1024b, mo2545Y);
                                                InterfaceC1570d.m2541T(c1568b2, c0660j4, c0671o0, 0.0f, null, 28);
                                                ((C0019e1) c0031h1.f152f).m50v(-f7, -f8);
                                                c0644b2.mo1338j();
                                                c1567a.f10177a = interfaceC3093c;
                                                c1567a.f10178b = enumC3103m;
                                                c1567a.f10179c = interfaceC0674q;
                                                c1567a.f10180d = j7;
                                                c0654g2.f2144a.prepareToDraw();
                                                obj2.f16451e = c0654g2;
                                                return c0265c.m558a(new C2758m(m1428b, obj2, j6, c0666m2));
                                            }
                                        }
                                        m1406f = AbstractC0659i0.m1406f((int) (j6 >> 32), (int) (j6 & 4294967295L), i7);
                                        c2752k2.f14693a = m1406f;
                                        c0644b = AbstractC0659i0.m1401a(m1406f);
                                        c2752k2.f14694b = c0644b;
                                        c1568b = c2752k2.f14695c;
                                        if (c1568b == null) {
                                        }
                                        c0031h1 = c1568b.f10182f;
                                        C1567a c1567a2 = c1568b.f10181e;
                                        long m3347y2 = AbstractC2072e.m3347y(j6);
                                        EnumC3103m layoutDirection2 = c0265c.f999e.getLayoutDirection();
                                        C1568b c1568b22 = c1568b;
                                        InterfaceC3093c interfaceC3093c2 = c1567a2.f10177a;
                                        C0666m c0666m22 = c0666m;
                                        EnumC3103m enumC3103m2 = c1567a2.f10178b;
                                        C0660j c0660j42 = c0660j3;
                                        InterfaceC0674q interfaceC0674q2 = c1567a2.f10179c;
                                        C0654g c0654g22 = m1406f;
                                        long j72 = c1567a2.f10180d;
                                        c1567a2.f10177a = c0265c;
                                        c1567a2.f10178b = layoutDirection2;
                                        c1567a2.f10179c = c0644b;
                                        c1567a2.f10180d = m3347y2;
                                        c0644b.mo1341m();
                                        InterfaceC1570d.m2535D(c1568b22, C0677s.f2204b, 0L, m3347y2, 0.0f, 58);
                                        f7 = -f23;
                                        f8 = -f22;
                                        ((C0019e1) c0031h1.f152f).m50v(f7, f8);
                                        InterfaceC1570d.m2541T(c1568b22, c0649d0.f2132a, c0671o0, 0.0f, new C1574h(f21, 0.0f, 0, 0, 30), 52);
                                        float f282 = 1;
                                        float m1026d2 = (C0467e.m1026d(c1568b22.mo2546c()) + f282) / C0467e.m1026d(c1568b22.mo2546c());
                                        float m1024b2 = (C0467e.m1024b(c1568b22.mo2546c()) + f282) / C0467e.m1024b(c1568b22.mo2546c());
                                        C0644b c0644b22 = c0644b;
                                        long mo2545Y2 = c1568b22.mo2545Y();
                                        m109x = c0031h1.m109x();
                                        c0031h1.m106u().mo1341m();
                                        ((C0019e1) c0031h1.f152f).m48t(m1026d2, m1024b2, mo2545Y2);
                                        InterfaceC1570d.m2541T(c1568b22, c0660j42, c0671o0, 0.0f, null, 28);
                                        ((C0019e1) c0031h1.f152f).m50v(-f7, -f8);
                                        c0644b22.mo1338j();
                                        c1567a2.f10177a = interfaceC3093c2;
                                        c1567a2.f10178b = enumC3103m2;
                                        c1567a2.f10179c = interfaceC0674q2;
                                        c1567a2.f10180d = j72;
                                        c0654g22.f2144a.prepareToDraw();
                                        obj2.f16451e = c0654g22;
                                        return c0265c.m558a(new C2758m(m1428b, obj2, j6, c0666m22));
                                    }
                                }
                                ((C0019e1) c0031h1.f152f).m48t(m1026d2, m1024b2, mo2545Y2);
                                InterfaceC1570d.m2541T(c1568b22, c0660j42, c0671o0, 0.0f, null, 28);
                                ((C0019e1) c0031h1.f152f).m50v(-f7, -f8);
                                c0644b22.mo1338j();
                                c1567a2.f10177a = interfaceC3093c2;
                                c1567a2.f10178b = enumC3103m2;
                                c1567a2.f10179c = interfaceC0674q2;
                                c1567a2.f10180d = j72;
                                c0654g22.f2144a.prepareToDraw();
                                obj2.f16451e = c0654g22;
                                return c0265c.m558a(new C2758m(m1428b, obj2, j6, c0666m22));
                            } finally {
                                c0031h1.m106u().mo1338j();
                                c0031h1.m86J(m109x);
                            }
                            InterfaceC1570d.m2541T(c1568b22, c0649d0.f2132a, c0671o0, 0.0f, new C1574h(f21, 0.0f, 0, 0, 30), 52);
                            float f2822 = 1;
                            float m1026d22 = (C0467e.m1026d(c1568b22.mo2546c()) + f2822) / C0467e.m1026d(c1568b22.mo2546c());
                            float m1024b22 = (C0467e.m1024b(c1568b22.mo2546c()) + f2822) / C0467e.m1024b(c1568b22.mo2546c());
                            C0644b c0644b222 = c0644b;
                            long mo2545Y22 = c1568b22.mo2545Y();
                            m109x = c0031h1.m109x();
                            c0031h1.m106u().mo1341m();
                        } catch (Throwable th) {
                            ((C0019e1) c0031h1.f152f).m50v(-f7, -f8);
                            throw th;
                        }
                        z8 = true;
                        if (c0654g != null) {
                        }
                        m1406f = AbstractC0659i0.m1406f((int) (j6 >> 32), (int) (j6 & 4294967295L), i7);
                        c2752k2.f14693a = m1406f;
                        c0644b = AbstractC0659i0.m1401a(m1406f);
                        c2752k2.f14694b = c0644b;
                        c1568b = c2752k2.f14695c;
                        if (c1568b == null) {
                        }
                        c0031h1 = c1568b.f10182f;
                        C1567a c1567a22 = c1568b.f10181e;
                        long m3347y22 = AbstractC2072e.m3347y(j6);
                        EnumC3103m layoutDirection22 = c0265c.f999e.getLayoutDirection();
                        C1568b c1568b222 = c1568b;
                        InterfaceC3093c interfaceC3093c22 = c1567a22.f10177a;
                        C0666m c0666m222 = c0666m;
                        EnumC3103m enumC3103m22 = c1567a22.f10178b;
                        C0660j c0660j422 = c0660j3;
                        InterfaceC0674q interfaceC0674q22 = c1567a22.f10179c;
                        C0654g c0654g222 = m1406f;
                        long j722 = c1567a22.f10180d;
                        c1567a22.f10177a = c0265c;
                        c1567a22.f10178b = layoutDirection22;
                        c1567a22.f10179c = c0644b;
                        c1567a22.f10180d = m3347y22;
                        c0644b.mo1341m();
                        InterfaceC1570d.m2535D(c1568b222, C0677s.f2204b, 0L, m3347y22, 0.0f, 58);
                        f7 = -f23;
                        f8 = -f22;
                        ((C0019e1) c0031h1.f152f).m50v(f7, f8);
                    } else {
                        if (mo1393a instanceof C0653f0) {
                            C0671o0 c0671o02 = c2764o.f14732w;
                            C0466d c0466d = ((C0653f0) mo1393a).f2142a;
                            if (AbstractC2710c.m4322E(c0466d)) {
                                return c0265c.m558a(new C2761n(z7, c0671o02, c0466d.f1633e, f20, min, m5797a, m2975c, new C1574h(min, 0.0f, 0, 0, 30)));
                            }
                            boolean z10 = z7;
                            if (c2764o.f14730u == null) {
                                c2764o.f14730u = new C2752k();
                            }
                            C2752k c2752k3 = c2764o.f14730u;
                            AbstractC3367j.m5097b(c2752k3);
                            C0660j c0660j5 = c2752k3.f14696d;
                            if (c0660j5 == null) {
                                c0660j5 = AbstractC0664l.m1445a();
                                c2752k3.f14696d = c0660j5;
                            }
                            c0660j5.m1431e();
                            C0660j.m1427a(c0660j5, c0466d);
                            if (!z10) {
                                C0660j m1445a = AbstractC0664l.m1445a();
                                C0660j.m1427a(m1445a, new C0466d(min, min, c0466d.m1022b() - min, c0466d.m1021a() - min, AbstractC2067b.m3273A(min, c0466d.f1633e), AbstractC2067b.m3273A(min, c0466d.f1634f), AbstractC2067b.m3273A(min, c0466d.f1635g), AbstractC2067b.m3273A(min, c0466d.f1636h)));
                                c0660j5.m1430d(c0660j5, m1445a, 0);
                            }
                            return c0265c.m558a(new C2649h1(4, c0660j5, c0671o02));
                        }
                        boolean z11 = z7;
                        if (mo1393a instanceof C0651e0) {
                            C0671o0 c0671o03 = c2764o.f14732w;
                            if (z11) {
                                m5797a = 0;
                            }
                            long j8 = m5797a;
                            if (z11) {
                                m2975c = c0265c.f999e.mo550c();
                            }
                            long j9 = m2975c;
                            if (z11) {
                                c1574h = C1573g.f10187a;
                            } else {
                                c1574h = new C1574h(min, 0.0f, 0, 0, 30);
                            }
                            return c0265c.m558a(new C2502r(c0671o03, j8, j9, c1574h, 1));
                        }
                        throw new RuntimeException();
                    }
                } else {
                    return c0265c.m558a(C2755l.f14701g);
                }
                break;
            case 18:
                long j10 = ((C0464b) obj).f1623a;
                C2775s c2775s = (C2775s) this.f54g;
                if (c2775s.f14642y) {
                    c2775s.f14643z.mo52a();
                }
                return C1694m.f10482a;
            case 19:
                float floatValue2 = ((Number) obj).floatValue();
                C2769p1 c2769p1 = (C2769p1) this.f54g;
                C2349d1 c2349d1 = c2769p1.f14745a;
                float m3741g = c2349d1.m3741g() + floatValue2 + c2769p1.f14749e;
                float m3529p = AbstractC2168e.m3529p(m3741g, 0.0f, c2769p1.f14748d.m3741g());
                if (m3741g == m3529p) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                float m3741g2 = m3529p - c2349d1.m3741g();
                int round = Math.round(m3741g2);
                c2349d1.m3742h(c2349d1.m3741g() + round);
                c2769p1.f14749e = m3741g2 - round;
                if (!z9) {
                    floatValue2 = m3741g2;
                }
                return Float.valueOf(floatValue2);
            case 20:
                long j11 = ((C0464b) obj).f1623a;
                ((C2830j) this.f54g).f14902a.setValue(new C2828h(j11));
                return C1694m.f10482a;
            case 21:
                ((C2875z) ((C2874y) this.f54g).m4552h()).mo23f((MotionEvent) obj);
                return C1694m.f10482a;
            case 22:
                Throwable th2 = (Throwable) obj;
                C2855g0 c2855g0 = (C2855g0) this.f54g;
                C0548l c0548l = c2855g0.f14966g;
                if (c0548l != null) {
                    c0548l.mo1199p(th2);
                }
                c2855g0.f14966g = null;
                return C1694m.f10482a;
            case 23:
                ((C0055n1) this.f54g).mo52a();
                return C1694m.f10482a;
            case 24:
                C2868s c2868s = (C2868s) obj;
                ((C1120nh) this.f54g).mo22d(c2868s, new C0464b(AbstractC2866q.m4546e(c2868s, false)));
                c2868s.m4550a();
                return C1694m.f10482a;
            case 25:
                ((C2911h1) this.f54g).f15170J.f15185x = (InterfaceC3238v) obj;
                return C1694m.f10482a;
            case 26:
                long j12 = ((C0464b) obj).f1623a;
                C2929n1 c2929n1 = (C2929n1) this.f54g;
                return new C0464b(C2929n1.m4588a(c2929n1, c2929n1.f15236h, j12, c2929n1.f15235g));
            case 27:
                ((Number) obj).intValue();
                return this.f54g;
            case 28:
                float floatValue3 = ((Number) obj).floatValue();
                C3330r c3330r = (C3330r) this.f54g;
                float f29 = -floatValue3;
                if ((f29 < 0.0f && !c3330r.mo115d()) || (f29 > 0.0f && !c3330r.mo113b())) {
                    f29 = 0.0f;
                } else if (Math.abs(c3330r.f16367h) <= 0.5f) {
                    float f30 = c3330r.f16367h + f29;
                    c3330r.f16367h = f30;
                    if (Math.abs(f30) > 0.5f) {
                        C3325m c3325m = (C3325m) c3330r.f16365f.getValue();
                        float f31 = c3330r.f16367h;
                        int round2 = Math.round(f31);
                        C3325m c3325m2 = c3330r.f16362c;
                        boolean m5061f = c3325m.m5061f(round2, !c3330r.f16361b);
                        if (m5061f && c3325m2 != null) {
                            m5061f = c3325m2.m5061f(round2, true);
                        }
                        if (m5061f) {
                            c3330r.m5066f(c3325m, c3330r.f16361b, true);
                            c3330r.f16381v.setValue(C1694m.f10482a);
                            c3330r.m5068h(f31 - c3330r.f16367h, c3325m);
                        } else {
                            C3502g0 c3502g0 = c3330r.f16370k;
                            if (c3502g0 != null) {
                                c3502g0.m5437k();
                            }
                            c3330r.m5068h(f31 - c3330r.f16367h, c3330r.m5067g());
                        }
                    }
                    if (Math.abs(c3330r.f16367h) > 0.5f) {
                        f29 -= c3330r.f16367h;
                        c3330r.f16367h = 0.0f;
                    }
                } else {
                    throw new IllegalStateException(("entered drag with non-zero pending scroll: " + c3330r.f16367h).toString());
                }
                return Float.valueOf(-f29);
            default:
                return new C0077t(4, (C3407e0) this.f54g);
        }
    }
}
