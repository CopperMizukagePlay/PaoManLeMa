package p039e5;

import androidx.compose.animation.AbstractC0144a;
import p000a.AbstractC0000a;
import p035e1.C0671o0;
import p035e1.C0677s;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p085l0.C2394o2;
import p085l0.C2395p;
import p092m.AbstractC2501q;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cq */
/* loaded from: classes.dex */
public final class C0785cq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f3190e;

    /* renamed from: f */
    public final /* synthetic */ boolean f3191f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f3192g;

    /* renamed from: h */
    public final /* synthetic */ boolean f3193h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f3194i;

    /* renamed from: j */
    public final /* synthetic */ boolean f3195j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f3196k;

    /* renamed from: l */
    public final /* synthetic */ boolean f3197l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f3198m;

    /* renamed from: n */
    public final /* synthetic */ boolean f3199n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC3279c f3200o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3277a f3201p;

    public C0785cq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, boolean z9, InterfaceC3279c interfaceC3279c2, boolean z10, InterfaceC3279c interfaceC3279c3, boolean z11, InterfaceC3279c interfaceC3279c4, boolean z12, InterfaceC3279c interfaceC3279c5, InterfaceC3277a interfaceC3277a) {
        this.f3190e = z7;
        this.f3191f = z8;
        this.f3192g = interfaceC3279c;
        this.f3193h = z9;
        this.f3194i = interfaceC3279c2;
        this.f3195j = z10;
        this.f3196k = interfaceC3279c3;
        this.f3197l = z11;
        this.f3198m = interfaceC3279c4;
        this.f3199n = z12;
        this.f3200o = interfaceC3279c5;
        this.f3201p = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
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
            AbstractC0945hr.m1558B("保持亮屏", "测速期间屏幕常亮，不会息屏", AbstractC1793a0.m2998z(), this.f3190e, this.f3191f, this.f3192g, c2395p, 54);
            C2394o2 c2394o2 = AbstractC2019v0.f11943a;
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            AbstractC0945hr.m1558B("后台测速", "离开页面后继续测速", AbstractC0000a.m18s(), this.f3193h, this.f3191f, this.f3194i, c2395p, 54);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            AbstractC0945hr.m1558B("通知保活", "降低后台被回收概率", AbstractC0000a.m17r(), this.f3195j, true, this.f3196k, c2395p, 24630);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            C2266e c2266e = AbstractC3784a.f17933n;
            if (c2266e == null) {
                C2264d c2264d = new C2264d("Filled.MusicOff", false);
                int i9 = AbstractC2263c0.f13117a;
                C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
                C0811dk c0811dk = new C0811dk(2);
                c0811dk.m1512m(4.27f, 3.0f);
                c0811dk.m1510k(3.0f, 4.27f);
                c0811dk.m1511l(9.0f, 9.0f);
                c0811dk.m1517r(0.28f);
                c0811dk.m1507h(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
                c0811dk.m1507h(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
                c0811dk.m1514o(1.79f, 4.0f, 4.0f, 4.0f);
                c0811dk.m1514o(4.0f, -1.79f, 4.0f, -4.0f);
                c0811dk.m1517r(-1.73f);
                c0811dk.m1510k(19.73f, 21.0f);
                c0811dk.m1510k(21.0f, 19.73f);
                c0811dk.m1510k(4.27f, 3.0f);
                c0811dk.m1505f();
                c0811dk.m1512m(14.0f, 7.0f);
                c0811dk.m1509j(4.0f);
                c0811dk.m1516q(3.0f);
                c0811dk.m1509j(-6.0f);
                c0811dk.m1517r(5.18f);
                c0811dk.m1511l(2.0f, 2.0f);
                c0811dk.m1505f();
                C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
                c2266e = c2264d.m3673b();
                AbstractC3784a.f17933n = c2266e;
            }
            AbstractC0945hr.m1558B("静音音频保活", "通知保活开启时播放无声音频，进一步提升息屏存活率", c2266e, this.f3197l, this.f3195j, this.f3198m, c2395p, 54);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            C2266e c2266e2 = AbstractC2710c.f14552o;
            if (c2266e2 == null) {
                C2264d c2264d2 = new C2264d("Filled.PictureInPicture", false);
                int i10 = AbstractC2263c0.f13117a;
                C0671o0 c0671o02 = new C0671o0(C0677s.f2204b);
                C0811dk c0811dk2 = new C0811dk(2);
                c0811dk2.m1512m(19.0f, 7.0f);
                c0811dk2.m1509j(-8.0f);
                c0811dk2.m1517r(6.0f);
                c0811dk2.m1509j(8.0f);
                c0811dk2.m1510k(19.0f, 7.0f);
                c0811dk2.m1505f();
                c0811dk2.m1512m(21.0f, 3.0f);
                c0811dk2.m1510k(3.0f, 3.0f);
                c0811dk2.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                c0811dk2.m1517r(14.0f);
                c0811dk2.m1507h(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
                c0811dk2.m1509j(18.0f);
                c0811dk2.m1507h(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
                c0811dk2.m1510k(23.0f, 5.0f);
                c0811dk2.m1507h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                c0811dk2.m1505f();
                c0811dk2.m1512m(21.0f, 19.01f);
                c0811dk2.m1510k(3.0f, 19.01f);
                c0811dk2.m1510k(3.0f, 4.98f);
                c0811dk2.m1509j(18.0f);
                c0811dk2.m1517r(14.03f);
                c0811dk2.m1505f();
                C2264d.m3672a(c2264d2, c0811dk2.f3514f, c0671o02);
                c2266e2 = c2264d2.m3673b();
                AbstractC2710c.f14552o = c2266e2;
            }
            AbstractC0945hr.m1558B("悬浮窗保活", "测速时显示极小透明悬浮窗，提升部分系统后台存活率", c2266e2, this.f3199n, true, this.f3200o, c2395p, 24630);
            if (!this.f3195j && !this.f3199n) {
                z7 = false;
            } else {
                z7 = true;
            }
            AbstractC0144a.m315b(c3154s, z7, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(-639598916, new C1233r6(8, this.f3201p), c2395p), c2395p, (i8 & 14) | 1600512);
        }
        return C1694m.f10482a;
    }
}
