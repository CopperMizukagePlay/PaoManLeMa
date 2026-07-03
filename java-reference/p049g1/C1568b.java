package p049g1;

import android.graphics.Paint;
import android.graphics.Shader;
import p001a0.C0031h1;
import p023c5.C0427s;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0670o;
import p035e1.C0654g;
import p035e1.C0660j;
import p035e1.C0666m;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p140s2.EnumC3103m;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C1568b implements InterfaceC1570d {

    /* renamed from: e */
    public final C1567a f10181e;

    /* renamed from: f */
    public final C0031h1 f10182f;

    /* renamed from: g */
    public C0427s f10183g;

    /* renamed from: h */
    public C0427s f10184h;

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.a, java.lang.Object] */
    public C1568b() {
        ?? obj = new Object();
        obj.f10177a = AbstractC1569c.f10185a;
        obj.f10178b = EnumC3103m.f15703e;
        obj.f10179c = C1572f.f10186a;
        obj.f10180d = 0L;
        this.f10181e = obj;
        this.f10182f = new C0031h1(this);
    }

    /* renamed from: a */
    public static C0427s m2522a(C1568b c1568b, long j6, AbstractC1571e abstractC1571e, float f7, int i7) {
        C0427s m2529f = c1568b.m2529f(abstractC1571e);
        Paint paint = (Paint) m2529f.f1462g;
        if (f7 != 1.0f) {
            j6 = C0677s.m1453b(C0677s.m1455d(j6) * f7, j6);
        }
        if (!C0677s.m1454c(AbstractC0659i0.m1403c(paint.getColor()), j6)) {
            m2529f.m910i(j6);
        }
        if (((Shader) m2529f.f1463h) != null) {
            m2529f.m913l(null);
        }
        if (!AbstractC3367j.m5096a((C0666m) m2529f.f1464i, null)) {
            m2529f.m911j(null);
        }
        if (m2529f.f1461f != i7) {
            m2529f.m909h(i7);
        }
        if (paint.isFilterBitmap()) {
            return m2529f;
        }
        m2529f.m912k(1);
        return m2529f;
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: B */
    public final void mo2523B(C0660j c0660j, AbstractC0670o abstractC0670o, float f7, AbstractC1571e abstractC1571e, int i7) {
        this.f10181e.f10179c.mo1332d(c0660j, m2527d(abstractC0670o, abstractC1571e, f7, null, i7, 1));
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: E */
    public final C0031h1 mo2524E() {
        return this.f10182f;
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: W */
    public final void mo2525W(long j6, long j7, long j8, float f7, int i7) {
        InterfaceC0674q interfaceC0674q = this.f10181e.f10179c;
        C0427s c0427s = this.f10184h;
        if (c0427s == null) {
            c0427s = AbstractC0659i0.m1407g();
            c0427s.m917p(1);
            this.f10184h = c0427s;
        }
        Paint paint = (Paint) c0427s.f1462g;
        if (!C0677s.m1454c(AbstractC0659i0.m1403c(paint.getColor()), j6)) {
            c0427s.m910i(j6);
        }
        if (((Shader) c0427s.f1463h) != null) {
            c0427s.m913l(null);
        }
        if (!AbstractC3367j.m5096a((C0666m) c0427s.f1464i, null)) {
            c0427s.m911j(null);
        }
        if (c0427s.f1461f != 3) {
            c0427s.m909h(3);
        }
        if (paint.getStrokeWidth() != f7) {
            c0427s.m916o(f7);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c0427s.m906d() != i7) {
            c0427s.m914m(i7);
        }
        if (c0427s.m907f() != 0) {
            c0427s.m915n(0);
        }
        if (!paint.isFilterBitmap()) {
            c0427s.m912k(1);
        }
        interfaceC0674q.mo1342n(j7, j8, c0427s);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f10181e.f10177a.mo559b();
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: b0 */
    public final void mo2526b0(C0660j c0660j, long j6, AbstractC1571e abstractC1571e) {
        this.f10181e.f10179c.mo1332d(c0660j, m2522a(this, j6, abstractC1571e, 1.0f, 3));
    }

    /* renamed from: d */
    public final C0427s m2527d(AbstractC0670o abstractC0670o, AbstractC1571e abstractC1571e, float f7, C0666m c0666m, int i7, int i8) {
        C0427s m2529f = m2529f(abstractC1571e);
        Paint paint = (Paint) m2529f.f1462g;
        if (abstractC0670o != null) {
            abstractC0670o.mo1444a(f7, mo2546c(), m2529f);
        } else {
            if (((Shader) m2529f.f1463h) != null) {
                m2529f.m913l(null);
            }
            long m1403c = AbstractC0659i0.m1403c(paint.getColor());
            long j6 = C0677s.f2204b;
            if (!C0677s.m1454c(m1403c, j6)) {
                m2529f.m910i(j6);
            }
            if (paint.getAlpha() / 255.0f != f7) {
                m2529f.m908g(f7);
            }
        }
        if (!AbstractC3367j.m5096a((C0666m) m2529f.f1464i, c0666m)) {
            m2529f.m911j(c0666m);
        }
        if (m2529f.f1461f != i7) {
            m2529f.m909h(i7);
        }
        if (paint.isFilterBitmap() == i8) {
            return m2529f;
        }
        m2529f.m912k(i8);
        return m2529f;
    }

    /* renamed from: e */
    public final void m2528e(C0654g c0654g, C0666m c0666m) {
        this.f10181e.f10179c.mo1347t(c0654g, m2527d(null, C1573g.f10187a, 1.0f, c0666m, 3, 1));
    }

    /* renamed from: f */
    public final C0427s m2529f(AbstractC1571e abstractC1571e) {
        if (AbstractC3367j.m5096a(abstractC1571e, C1573g.f10187a)) {
            C0427s c0427s = this.f10183g;
            if (c0427s == null) {
                C0427s m1407g = AbstractC0659i0.m1407g();
                m1407g.m917p(0);
                this.f10183g = m1407g;
                return m1407g;
            }
            return c0427s;
        }
        if (abstractC1571e instanceof C1574h) {
            C0427s c0427s2 = this.f10184h;
            if (c0427s2 == null) {
                c0427s2 = AbstractC0659i0.m1407g();
                c0427s2.m917p(1);
                this.f10184h = c0427s2;
            }
            Paint paint = (Paint) c0427s2.f1462g;
            float strokeWidth = paint.getStrokeWidth();
            C1574h c1574h = (C1574h) abstractC1571e;
            float f7 = c1574h.f10188a;
            if (strokeWidth != f7) {
                c0427s2.m916o(f7);
            }
            int m906d = c0427s2.m906d();
            int i7 = c1574h.f10190c;
            if (m906d != i7) {
                c0427s2.m914m(i7);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f8 = c1574h.f10189b;
            if (strokeMiter != f8) {
                paint.setStrokeMiter(f8);
            }
            int m907f = c0427s2.m907f();
            int i8 = c1574h.f10191d;
            if (m907f == i8) {
                return c0427s2;
            }
            c0427s2.m915n(i8);
            return c0427s2;
        }
        throw new RuntimeException();
    }

    @Override // p049g1.InterfaceC1570d
    public final EnumC3103m getLayoutDirection() {
        return this.f10181e.f10178b;
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: i */
    public final void mo2530i(C0654g c0654g, long j6, long j7, long j8, float f7, C0666m c0666m, int i7) {
        this.f10181e.f10179c.mo1329a(c0654g, j6, j7, j8, m2527d(null, C1573g.f10187a, f7, c0666m, 3, i7));
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: j0 */
    public final void mo2531j0(long j6, long j7, long j8, float f7, int i7) {
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        this.f10181e.f10179c.mo1334f(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (4294967295L & j8)) + Float.intBitsToFloat(i9), m2522a(this, j6, C1573g.f10187a, f7, i7));
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: k */
    public final void mo2532k(long j6, float f7, long j7, AbstractC1571e abstractC1571e) {
        this.f10181e.f10179c.mo1331c(f7, j7, m2522a(this, j6, abstractC1571e, 1.0f, 3));
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f10181e.f10177a.mo560l();
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: r0 */
    public final void mo2533r0(long j6, long j7, long j8, long j9, AbstractC1571e abstractC1571e) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        this.f10181e.f10179c.mo1340l(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), m2522a(this, j6, abstractC1571e, 1.0f, 3));
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: u */
    public final void mo2534u(long j6, float f7, float f8, long j7, long j8, AbstractC1571e abstractC1571e) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        this.f10181e.f10179c.mo1333e(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i8), f7, f8, m2522a(this, j6, abstractC1571e, 1.0f, 3));
    }
}
