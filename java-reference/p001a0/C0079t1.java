package p001a0;

import android.graphics.Paint;
import p018c0.C0335e;
import p018c0.C0342l;
import p018c0.C0350t;
import p018c0.C0354x;
import p023c5.C0427s;
import p027d1.C0465c;
import p027d1.C0467e;
import p034e0.C0622o0;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0670o;
import p035e1.C0666m;
import p035e1.InterfaceC0674q;
import p049g1.C1568b;
import p050g2.C1602n0;
import p053g5.C1694m;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3679g2;
import p171w2.C3771u;
import p171w2.C3775y;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.t1 */
/* loaded from: classes.dex */
public final class C0079t1 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f381f;

    /* renamed from: g */
    public final /* synthetic */ Object f382g;

    /* renamed from: h */
    public final /* synthetic */ Object f383h;

    /* renamed from: i */
    public final /* synthetic */ Object f384i;

    /* renamed from: j */
    public final /* synthetic */ Object f385j;

    /* renamed from: k */
    public final /* synthetic */ Object f386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0079t1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        super(1);
        this.f381f = i7;
        this.f383h = obj;
        this.f384i = obj2;
        this.f382g = obj3;
        this.f385j = obj4;
        this.f386k = obj5;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0465c c0465c;
        C0043k1 c0043k1;
        C0622o0 c0622o0;
        int i7 = this.f381f;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC3679g2 interfaceC3679g2 = null;
        Object obj2 = this.f386k;
        Object obj3 = this.f385j;
        Object obj4 = this.f382g;
        Object obj5 = this.f384i;
        Object obj6 = this.f383h;
        switch (i7) {
            case 0:
                C3508i0 c3508i0 = (C3508i0) obj;
                c3508i0.m5460a();
                C1568b c1568b = c3508i0.f16933e;
                float m3729g = ((C0342l) obj6).f1163b.m3729g();
                if (m3729g != 0.0f) {
                    long j6 = ((C2459w) obj4).f13724b;
                    int i8 = C1602n0.f10303c;
                    int mo168b = ((InterfaceC2453q) obj5).mo168b((int) (j6 >> 32));
                    C0064p2 m120d = ((C0043k1) obj3).m120d();
                    if (m120d != null) {
                        c0465c = m120d.f322a.m2576c(mo168b);
                    } else {
                        c0465c = new C0465c(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float mo4526y = c3508i0.mo4526y(AbstractC0086v1.f399a);
                    float f7 = mo4526y / 2;
                    float f8 = c0465c.f1625a + f7;
                    float m1026d = C0467e.m1026d(c1568b.mo2546c()) - f7;
                    if (f8 > m1026d) {
                        f8 = m1026d;
                    }
                    if (f8 >= f7) {
                        f7 = f8;
                    }
                    long m5797a = AbstractC3784a.m5797a(f7, c0465c.f1626b);
                    long m5797a2 = AbstractC3784a.m5797a(f7, c0465c.f1628d);
                    AbstractC0670o abstractC0670o = (AbstractC0670o) obj2;
                    InterfaceC0674q interfaceC0674q = c1568b.f10181e.f10179c;
                    C0427s c0427s = c1568b.f10184h;
                    if (c0427s == null) {
                        c0427s = AbstractC0659i0.m1407g();
                        c0427s.m917p(1);
                        c1568b.f10184h = c0427s;
                    }
                    C0427s c0427s2 = c0427s;
                    Paint paint = (Paint) c0427s2.f1462g;
                    if (abstractC0670o != null) {
                        abstractC0670o.mo1444a(m3729g, c1568b.mo2546c(), c0427s2);
                    } else if (paint.getAlpha() / 255.0f != m3729g) {
                        c0427s2.m908g(m3729g);
                    }
                    if (!AbstractC3367j.m5096a((C0666m) c0427s2.f1464i, null)) {
                        c0427s2.m911j(null);
                    }
                    if (c0427s2.f1461f != 3) {
                        c0427s2.m909h(3);
                    }
                    if (paint.getStrokeWidth() != mo4526y) {
                        c0427s2.m916o(mo4526y);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c0427s2.m906d() != 0) {
                        c0427s2.m914m(0);
                    }
                    if (c0427s2.m907f() != 0) {
                        c0427s2.m915n(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        c0427s2.m912k(1);
                    }
                    interfaceC0674q.mo1342n(m5797a, m5797a2, c0427s2);
                }
                return c1694m;
            case 1:
                C0354x c0354x = (C0354x) obj;
                C0350t c0350t = ((C0335e) obj6).f1153a;
                c0354x.f1201h = (C2459w) obj4;
                c0354x.f1202i = (C2447k) obj5;
                c0354x.f1196c = (C0037j) obj3;
                c0354x.f1197d = (InterfaceC3279c) obj2;
                if (c0350t != null) {
                    c0043k1 = c0350t.f1172t;
                } else {
                    c0043k1 = null;
                }
                c0354x.f1198e = c0043k1;
                if (c0350t != null) {
                    c0622o0 = c0350t.f1173u;
                } else {
                    c0622o0 = null;
                }
                c0354x.f1199f = c0622o0;
                if (c0350t != null) {
                    interfaceC3679g2 = (InterfaceC3679g2) AbstractC3498f.m5369i(c0350t, AbstractC3674f1.f17528s);
                }
                c0354x.f1200g = interfaceC3679g2;
                return c1694m;
            default:
                C3771u c3771u = (C3771u) obj6;
                c3771u.f17896r.addView(c3771u, c3771u.f17897s);
                c3771u.m5771j((InterfaceC3277a) obj5, (C3775y) obj4, (String) obj3, (EnumC3103m) obj2);
                return new C0077t(9, c3771u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079t1(C2459w c2459w, C0335e c0335e, C2447k c2447k, C0037j c0037j, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f381f = 1;
        this.f382g = c2459w;
        this.f383h = c0335e;
        this.f384i = c2447k;
        this.f385j = c0037j;
        this.f386k = interfaceC3279c;
    }
}
