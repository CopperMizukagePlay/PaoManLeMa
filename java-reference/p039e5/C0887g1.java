package p039e5;

import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1949m2;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p085l0.C2395p;
import p102n1.AbstractC2710c;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p159u6.AbstractC3393k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.g1 */
/* loaded from: classes.dex */
public final class C0887g1 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f4138e;

    /* renamed from: f */
    public static final C0887g1 f4117f = new C0887g1(0);

    /* renamed from: g */
    public static final C0887g1 f4118g = new C0887g1(1);

    /* renamed from: h */
    public static final C0887g1 f4119h = new C0887g1(2);

    /* renamed from: i */
    public static final C0887g1 f4120i = new C0887g1(3);

    /* renamed from: j */
    public static final C0887g1 f4121j = new C0887g1(4);

    /* renamed from: k */
    public static final C0887g1 f4122k = new C0887g1(5);

    /* renamed from: l */
    public static final C0887g1 f4123l = new C0887g1(6);

    /* renamed from: m */
    public static final C0887g1 f4124m = new C0887g1(7);

    /* renamed from: n */
    public static final C0887g1 f4125n = new C0887g1(8);

    /* renamed from: o */
    public static final C0887g1 f4126o = new C0887g1(9);

    /* renamed from: p */
    public static final C0887g1 f4127p = new C0887g1(10);

    /* renamed from: q */
    public static final C0887g1 f4128q = new C0887g1(11);

    /* renamed from: r */
    public static final C0887g1 f4129r = new C0887g1(12);

    /* renamed from: s */
    public static final C0887g1 f4130s = new C0887g1(13);

    /* renamed from: t */
    public static final C0887g1 f4131t = new C0887g1(14);

    /* renamed from: u */
    public static final C0887g1 f4132u = new C0887g1(15);

    /* renamed from: v */
    public static final C0887g1 f4133v = new C0887g1(16);

    /* renamed from: w */
    public static final C0887g1 f4134w = new C0887g1(17);

    /* renamed from: x */
    public static final C0887g1 f4135x = new C0887g1(18);

    /* renamed from: y */
    public static final C0887g1 f4136y = new C0887g1(19);

    /* renamed from: z */
    public static final C0887g1 f4137z = new C0887g1(20);

    /* renamed from: A */
    public static final C0887g1 f4108A = new C0887g1(21);

    /* renamed from: B */
    public static final C0887g1 f4109B = new C0887g1(22);

    /* renamed from: C */
    public static final C0887g1 f4110C = new C0887g1(23);

    /* renamed from: D */
    public static final C0887g1 f4111D = new C0887g1(24);

    /* renamed from: E */
    public static final C0887g1 f4112E = new C0887g1(25);

    /* renamed from: F */
    public static final C0887g1 f4113F = new C0887g1(26);

    /* renamed from: G */
    public static final C0887g1 f4114G = new C0887g1(27);

    /* renamed from: H */
    public static final C0887g1 f4115H = new C0887g1(28);

    /* renamed from: I */
    public static final C0887g1 f4116I = new C0887g1(29);

    public /* synthetic */ C0887g1(int i7) {
        this.f4138e = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f4138e;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b("清理下载工作区？", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 6, 0, 131070);
                }
                return c1694m;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1850a7.m3108b("所有未完成下载的记录、临时文件和分片进度都会被永久删除，此操作无法撤销。", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 6, 0, 131070);
                }
                return c1694m;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    C2266e c2266e = AbstractC3393k.f16485l;
                    if (c2266e == null) {
                        C2264d c2264d = new C2264d("Filled.MoreVert", false);
                        int i8 = AbstractC2263c0.f13117a;
                        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
                        C0811dk m179f = AbstractC0094y0.m179f(12.0f, 8.0f);
                        m179f.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        m179f.m1514o(-0.9f, -2.0f, -2.0f, -2.0f);
                        m179f.m1514o(-2.0f, 0.9f, -2.0f, 2.0f);
                        m179f.m1514o(0.9f, 2.0f, 2.0f, 2.0f);
                        m179f.m1505f();
                        m179f.m1512m(12.0f, 10.0f);
                        m179f.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        m179f.m1514o(0.9f, 2.0f, 2.0f, 2.0f);
                        m179f.m1514o(2.0f, -0.9f, 2.0f, -2.0f);
                        m179f.m1514o(-0.9f, -2.0f, -2.0f, -2.0f);
                        m179f.m1505f();
                        m179f.m1512m(12.0f, 16.0f);
                        m179f.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        m179f.m1514o(0.9f, 2.0f, 2.0f, 2.0f);
                        m179f.m1514o(2.0f, -0.9f, 2.0f, -2.0f);
                        m179f.m1514o(-0.9f, -2.0f, -2.0f, -2.0f);
                        m179f.m1505f();
                        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
                        c2266e = c2264d.m3673b();
                        AbstractC3393k.f16485l = c2266e;
                    }
                    AbstractC1949m2.m3140b(c2266e, "更多", null, 0L, c2395p3, 48, 12);
                }
                return c1694m;
            case 3:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    AbstractC1850a7.m3108b("复制下载链接", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 6, 0, 131070);
                }
                return c1694m;
            case 4:
                C2395p c2395p5 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5805k(), null, null, 0L, c2395p5, 48, 12);
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                C2395p c2395p6 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    AbstractC1850a7.m3108b("打开", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p6, 6, 0, 131070);
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2395p c2395p7 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p7.m3836D()) {
                    c2395p7.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3393k.m5146q(), null, null, 0L, c2395p7, 48, 12);
                }
                return c1694m;
            case 7:
                C2395p c2395p8 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p8.m3836D()) {
                    c2395p8.m3852U();
                } else {
                    AbstractC1850a7.m3108b("分享", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p8, 6, 0, 131070);
                }
                return c1694m;
            case 8:
                C2395p c2395p9 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p9.m3836D()) {
                    c2395p9.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5811s(), null, null, 0L, c2395p9, 48, 12);
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C2395p c2395p10 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p10.m3836D()) {
                    c2395p10.m3852U();
                } else {
                    AbstractC1850a7.m3108b("重命名", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p10, 6, 0, 131070);
                }
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                C2395p c2395p11 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p11.m3836D()) {
                    c2395p11.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC2710c.m4343q(), null, null, 0L, c2395p11, 48, 12);
                }
                return c1694m;
            case 11:
                C2395p c2395p12 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p12.m3836D()) {
                    c2395p12.m3852U();
                } else {
                    AbstractC1850a7.m3108b("定位文件", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p12, 6, 0, 131070);
                }
                return c1694m;
            case 12:
                C2395p c2395p13 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p13.m3836D()) {
                    c2395p13.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC2710c.m4344r(), null, null, 0L, c2395p13, 48, 12);
                }
                return c1694m;
            case 13:
                C2395p c2395p14 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p14.m3836D()) {
                    c2395p14.m3852U();
                } else {
                    AbstractC1850a7.m3108b("重新解析 DNS", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p14, 6, 0, 131070);
                }
                return c1694m;
            case 14:
                C2395p c2395p15 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p15.m3836D()) {
                    c2395p15.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5806l(), null, null, 0L, c2395p15, 48, 12);
                }
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                C2395p c2395p16 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p16.m3836D()) {
                    c2395p16.m3852U();
                } else {
                    AbstractC1850a7.m3108b("删除", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p16, 6, 0, 131070);
                }
                return c1694m;
            case 16:
                C2395p c2395p17 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p17.m3836D()) {
                    c2395p17.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC1793a0.m2992t(), null, null, 0L, c2395p17, 48, 12);
                }
                return c1694m;
            case 17:
                C2395p c2395p18 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p18.m3836D()) {
                    c2395p18.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC0000a.m13n(), "暂停", null, 0L, c2395p18, 48, 12);
                }
                return c1694m;
            case 18:
                C2395p c2395p19 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p19.m3836D()) {
                    c2395p19.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5806l(), "重新解析 DNS", null, 0L, c2395p19, 48, 12);
                }
                return c1694m;
            case 19:
                C2395p c2395p20 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p20.m3836D()) {
                    c2395p20.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3393k.m5147r(), "继续", null, 0L, c2395p20, 48, 12);
                }
                return c1694m;
            case 20:
                C2395p c2395p21 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p21.m3836D()) {
                    c2395p21.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5806l(), "重新解析 DNS", null, 0L, c2395p21, 48, 12);
                }
                return c1694m;
            case 21:
                C2395p c2395p22 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p22.m3836D()) {
                    c2395p22.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3393k.m5148s(), "重试", null, 0L, c2395p22, 48, 12);
                }
                return c1694m;
            case 22:
                C2395p c2395p23 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p23.m3836D()) {
                    c2395p23.m3852U();
                } else {
                    AbstractC1850a7.m3108b("重新解析 DNS", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p23, 6, 0, 131070);
                }
                return c1694m;
            case 23:
                C2395p c2395p24 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p24.m3836D()) {
                    c2395p24.m3852U();
                } else {
                    AbstractC1850a7.m3108b("重命名文件", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p24, 6, 0, 131070);
                }
                return c1694m;
            case 24:
                C2395p c2395p25 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p25.m3836D()) {
                    c2395p25.m3852U();
                }
                return c1694m;
            case 25:
                C2395p c2395p26 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p26.m3836D()) {
                    c2395p26.m3852U();
                } else {
                    AbstractC1850a7.m3108b("URL、多个 URL 或 cURL", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p26, 6, 0, 131070);
                }
                return c1694m;
            case 26:
                C2395p c2395p27 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p27.m3836D()) {
                    c2395p27.m3852U();
                } else {
                    AbstractC1949m2.m3140b(AbstractC3784a.m5805k(), null, null, 0L, c2395p27, 48, 12);
                }
                return c1694m;
            case 27:
                C2395p c2395p28 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p28.m3836D()) {
                    c2395p28.m3852U();
                } else {
                    AbstractC1850a7.m3108b("每服务器 Worker", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p28, 6, 0, 131070);
                }
                return c1694m;
            case 28:
                C2395p c2395p29 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p29.m3836D()) {
                    c2395p29.m3852U();
                } else {
                    AbstractC1850a7.m3108b("1–32", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p29, 6, 0, 131070);
                }
                return c1694m;
            default:
                C2395p c2395p30 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p30.m3836D()) {
                    c2395p30.m3852U();
                } else {
                    AbstractC1850a7.m3108b("总 Worker 上限", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p30, 6, 0, 131070);
                }
                return c1694m;
        }
    }
}
