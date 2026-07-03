package p039e5;

import androidx.compose.animation.AbstractC0144a;
import java.util.List;
import p001a0.AbstractC0094y0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p085l0.C2395p;
import p092m.AbstractC2501q;
import p092m.C2506v;
import p092m.C2507w;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rq */
/* loaded from: classes.dex */
public final class C1253rq implements InterfaceC3282f {

    /* renamed from: A */
    public final /* synthetic */ InterfaceC3277a f7409A;

    /* renamed from: B */
    public final /* synthetic */ boolean f7410B;

    /* renamed from: e */
    public final /* synthetic */ boolean f7411e;

    /* renamed from: f */
    public final /* synthetic */ boolean f7412f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f7413g;

    /* renamed from: h */
    public final /* synthetic */ boolean f7414h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f7415i;

    /* renamed from: j */
    public final /* synthetic */ boolean f7416j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f7417k;

    /* renamed from: l */
    public final /* synthetic */ boolean f7418l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f7419m;

    /* renamed from: n */
    public final /* synthetic */ boolean f7420n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC3279c f7421o;

    /* renamed from: p */
    public final /* synthetic */ boolean f7422p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC3279c f7423q;

    /* renamed from: r */
    public final /* synthetic */ boolean f7424r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC3279c f7425s;

    /* renamed from: t */
    public final /* synthetic */ String f7426t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC3279c f7427u;

    /* renamed from: v */
    public final /* synthetic */ boolean f7428v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC3279c f7429w;

    /* renamed from: x */
    public final /* synthetic */ List f7430x;

    /* renamed from: y */
    public final /* synthetic */ List f7431y;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC3279c f7432z;

    public C1253rq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, boolean z9, InterfaceC3279c interfaceC3279c2, boolean z10, InterfaceC3279c interfaceC3279c3, boolean z11, InterfaceC3279c interfaceC3279c4, boolean z12, InterfaceC3279c interfaceC3279c5, boolean z13, InterfaceC3279c interfaceC3279c6, boolean z14, InterfaceC3279c interfaceC3279c7, String str, InterfaceC3279c interfaceC3279c8, boolean z15, InterfaceC3279c interfaceC3279c9, List list, List list2, InterfaceC3279c interfaceC3279c10, InterfaceC3277a interfaceC3277a, boolean z16) {
        this.f7411e = z7;
        this.f7412f = z8;
        this.f7413g = interfaceC3279c;
        this.f7414h = z9;
        this.f7415i = interfaceC3279c2;
        this.f7416j = z10;
        this.f7417k = interfaceC3279c3;
        this.f7418l = z11;
        this.f7419m = interfaceC3279c4;
        this.f7420n = z12;
        this.f7421o = interfaceC3279c5;
        this.f7422p = z13;
        this.f7423q = interfaceC3279c6;
        this.f7424r = z14;
        this.f7425s = interfaceC3279c7;
        this.f7426t = str;
        this.f7427u = interfaceC3279c8;
        this.f7428v = z15;
        this.f7429w = interfaceC3279c9;
        this.f7430x = list;
        this.f7431y = list2;
        this.f7432z = interfaceC3279c10;
        this.f7409A = interfaceC3277a;
        this.f7410B = z16;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7;
        C3154s c3154s = (C3154s) obj;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e(c3154s, "$this$SpeedSettingsSectionCard");
        if ((intValue & 6) == 0) {
            if (c2395p.m3870g(c3154s)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            intValue |= i7;
        }
        int i8 = intValue;
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC0945hr.m1558B("多接口同时测速", "每个已选接口按默认线程数测速", AbstractC2710c.m4346t(), this.f7411e, this.f7412f, this.f7413g, c2395p, 54);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p, 0, 3);
            C2266e c2266e = AbstractC3784a.f17931l;
            boolean z7 = false;
            if (c2266e == null) {
                C2264d c2264d = new C2264d("Filled.Hub", false);
                int i9 = AbstractC2263c0.f13117a;
                C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
                C0811dk m179f = AbstractC0094y0.m179f(8.4f, 18.2f);
                m179f.m1506g(8.78f, 18.7f, 9.0f, 19.32f, 9.0f, 20.0f);
                m179f.m1507h(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
                m179f.m1514o(-3.0f, -1.34f, -3.0f, -3.0f);
                m179f.m1514o(1.34f, -3.0f, 3.0f, -3.0f);
                m179f.m1507h(0.44f, 0.0f, 0.85f, 0.09f, 1.23f, 0.26f);
                m179f.m1511l(1.41f, -1.77f);
                m179f.m1507h(-0.92f, -1.03f, -1.29f, -2.39f, -1.09f, -3.69f);
                m179f.m1511l(-2.03f, -0.68f);
                m179f.m1506g(4.98f, 11.95f, 4.06f, 12.5f, 3.0f, 12.5f);
                m179f.m1507h(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
                m179f.m1514o(1.34f, -3.0f, 3.0f, -3.0f);
                m179f.m1514o(3.0f, 1.34f, 3.0f, 3.0f);
                m179f.m1507h(0.0f, 0.07f, 0.0f, 0.14f, -0.01f, 0.21f);
                m179f.m1511l(2.03f, 0.68f);
                m179f.m1507h(0.64f, -1.21f, 1.82f, -2.09f, 3.22f, -2.32f);
                m179f.m1511l(0.0f, -2.16f);
                m179f.m1506g(9.96f, 5.57f, 9.0f, 4.4f, 9.0f, 3.0f);
                m179f.m1507h(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
                m179f.m1514o(3.0f, 1.34f, 3.0f, 3.0f);
                m179f.m1507h(0.0f, 1.4f, -0.96f, 2.57f, -2.25f, 2.91f);
                m179f.m1517r(2.16f);
                m179f.m1507h(1.4f, 0.23f, 2.58f, 1.11f, 3.22f, 2.32f);
                m179f.m1511l(2.03f, -0.68f);
                m179f.m1506g(18.0f, 9.64f, 18.0f, 9.57f, 18.0f, 9.5f);
                m179f.m1507h(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
                m179f.m1514o(3.0f, 1.34f, 3.0f, 3.0f);
                m179f.m1514o(-1.34f, 3.0f, -3.0f, 3.0f);
                m179f.m1507h(-1.06f, 0.0f, -1.98f, -0.55f, -2.52f, -1.37f);
                m179f.m1511l(-2.03f, 0.68f);
                m179f.m1507h(0.2f, 1.29f, -0.16f, 2.65f, -1.09f, 3.69f);
                m179f.m1511l(1.41f, 1.77f);
                m179f.m1506g(17.15f, 17.09f, 17.56f, 17.0f, 18.0f, 17.0f);
                m179f.m1507h(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
                m179f.m1514o(-1.34f, 3.0f, -3.0f, 3.0f);
                m179f.m1514o(-3.0f, -1.34f, -3.0f, -3.0f);
                m179f.m1507h(0.0f, -0.68f, 0.22f, -1.3f, 0.6f, -1.8f);
                m179f.m1511l(-1.41f, -1.77f);
                m179f.m1507h(-1.35f, 0.75f, -3.01f, 0.76f, -4.37f, 0.0f);
                m179f.m1510k(8.4f, 18.2f);
                m179f.m1505f();
                C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
                c2266e = c2264d.m3673b();
                AbstractC3784a.f17931l = c2266e;
            }
            C2266e c2266e2 = c2266e;
            if (this.f7412f && this.f7411e) {
                z7 = true;
            }
            InterfaceC3279c interfaceC3279c = this.f7415i;
            AbstractC0945hr.m1558B("多进程测速模式（Beta）", "模式二多接口生效；每个接口使用独立 worker 进程", c2266e2, this.f7414h, z7, interfaceC3279c, c2395p, 54);
            C2506v m4059a = AbstractC2501q.m4059a();
            C2507w m4061c = AbstractC2501q.m4061c();
            boolean z8 = this.f7410B;
            boolean z9 = this.f7412f;
            AbstractC0144a.m315b(c3154s, this.f7411e, null, m4059a, m4061c, null, AbstractC3178i.m4873d(568928440, new C1222qq(this.f7416j, this.f7417k, this.f7418l, this.f7419m, this.f7420n, this.f7421o, this.f7422p, this.f7423q, this.f7424r, this.f7425s, this.f7426t, this.f7427u, this.f7428v, this.f7429w, this.f7430x, this.f7431y, this.f7432z, this.f7409A, z8, z9), c2395p), c2395p, (i8 & 14) | 1600512);
        }
        return C1694m.f10482a;
    }
}
