package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p017c.C0318c;
import p017c.C0328m;
import p032d6.InterfaceC0516a0;
import p046f5.AbstractC1540e;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p068i5.C2077a;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wi */
/* loaded from: classes.dex */
public final class C1400wi implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ InterfaceC2425y0 f8381A;

    /* renamed from: A0 */
    public final /* synthetic */ InterfaceC0516a0 f8382A0;

    /* renamed from: B */
    public final /* synthetic */ InterfaceC2425y0 f8383B;

    /* renamed from: B0 */
    public final /* synthetic */ InterfaceC2425y0 f8384B0;

    /* renamed from: C */
    public final /* synthetic */ InterfaceC2425y0 f8385C;

    /* renamed from: C0 */
    public final /* synthetic */ InterfaceC2425y0 f8386C0;

    /* renamed from: D */
    public final /* synthetic */ InterfaceC2425y0 f8387D;

    /* renamed from: D0 */
    public final /* synthetic */ AbstractC1540e f8388D0;

    /* renamed from: E */
    public final /* synthetic */ InterfaceC2425y0 f8389E;

    /* renamed from: E0 */
    public final /* synthetic */ InterfaceC3279c f8390E0;

    /* renamed from: F */
    public final /* synthetic */ InterfaceC2425y0 f8391F;

    /* renamed from: F0 */
    public final /* synthetic */ float f8392F0;

    /* renamed from: G */
    public final /* synthetic */ InterfaceC2425y0 f8393G;

    /* renamed from: G0 */
    public final /* synthetic */ InterfaceC3279c f8394G0;

    /* renamed from: H */
    public final /* synthetic */ InterfaceC2425y0 f8395H;

    /* renamed from: H0 */
    public final /* synthetic */ InterfaceC2425y0 f8396H0;

    /* renamed from: I */
    public final /* synthetic */ InterfaceC2425y0 f8397I;

    /* renamed from: I0 */
    public final /* synthetic */ InterfaceC2425y0 f8398I0;

    /* renamed from: J */
    public final /* synthetic */ InterfaceC2425y0 f8399J;

    /* renamed from: J0 */
    public final /* synthetic */ C0328m f8400J0;

    /* renamed from: K */
    public final /* synthetic */ InterfaceC2425y0 f8401K;

    /* renamed from: K0 */
    public final /* synthetic */ InterfaceC2425y0 f8402K0;

    /* renamed from: L */
    public final /* synthetic */ InterfaceC2425y0 f8403L;

    /* renamed from: L0 */
    public final /* synthetic */ C0976ir f8404L0;

    /* renamed from: M */
    public final /* synthetic */ InterfaceC2425y0 f8405M;

    /* renamed from: M0 */
    public final /* synthetic */ InterfaceC2425y0 f8406M0;

    /* renamed from: N */
    public final /* synthetic */ C3469p f8407N;

    /* renamed from: N0 */
    public final /* synthetic */ InterfaceC2425y0 f8408N0;

    /* renamed from: O */
    public final /* synthetic */ C3469p f8409O;

    /* renamed from: O0 */
    public final /* synthetic */ InterfaceC2425y0 f8410O0;

    /* renamed from: P */
    public final /* synthetic */ InterfaceC2425y0 f8411P;

    /* renamed from: P0 */
    public final /* synthetic */ InterfaceC2425y0 f8412P0;

    /* renamed from: Q */
    public final /* synthetic */ C3469p f8413Q;

    /* renamed from: Q0 */
    public final /* synthetic */ InterfaceC2425y0 f8414Q0;

    /* renamed from: R */
    public final /* synthetic */ C3469p f8415R;

    /* renamed from: R0 */
    public final /* synthetic */ C2349d1 f8416R0;

    /* renamed from: S */
    public final /* synthetic */ InterfaceC2425y0 f8417S;

    /* renamed from: S0 */
    public final /* synthetic */ InterfaceC2425y0 f8418S0;

    /* renamed from: T */
    public final /* synthetic */ InterfaceC2425y0 f8419T;

    /* renamed from: T0 */
    public final /* synthetic */ InterfaceC2425y0 f8420T0;

    /* renamed from: U */
    public final /* synthetic */ InterfaceC2425y0 f8421U;

    /* renamed from: V */
    public final /* synthetic */ InterfaceC2425y0 f8422V;

    /* renamed from: W */
    public final /* synthetic */ InterfaceC2425y0 f8423W;

    /* renamed from: X */
    public final /* synthetic */ InterfaceC2425y0 f8424X;

    /* renamed from: Y */
    public final /* synthetic */ InterfaceC2425y0 f8425Y;

    /* renamed from: Z */
    public final /* synthetic */ InterfaceC2425y0 f8426Z;

    /* renamed from: a0 */
    public final /* synthetic */ InterfaceC2425y0 f8427a0;

    /* renamed from: b0 */
    public final /* synthetic */ InterfaceC2425y0 f8428b0;

    /* renamed from: c0 */
    public final /* synthetic */ InterfaceC2425y0 f8429c0;

    /* renamed from: d0 */
    public final /* synthetic */ InterfaceC2425y0 f8430d0;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2425y0 f8431e;

    /* renamed from: e0 */
    public final /* synthetic */ InterfaceC2425y0 f8432e0;

    /* renamed from: f */
    public final /* synthetic */ Context f8433f;

    /* renamed from: f0 */
    public final /* synthetic */ InterfaceC2425y0 f8434f0;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8435g;

    /* renamed from: g0 */
    public final /* synthetic */ InterfaceC2425y0 f8436g0;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8437h;

    /* renamed from: h0 */
    public final /* synthetic */ InterfaceC2425y0 f8438h0;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f8439i;

    /* renamed from: i0 */
    public final /* synthetic */ InterfaceC2425y0 f8440i0;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f8441j;

    /* renamed from: j0 */
    public final /* synthetic */ InterfaceC2425y0 f8442j0;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f8443k;

    /* renamed from: k0 */
    public final /* synthetic */ C3469p f8444k0;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f8445l;

    /* renamed from: l0 */
    public final /* synthetic */ InterfaceC2425y0 f8446l0;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f8447m;

    /* renamed from: m0 */
    public final /* synthetic */ InterfaceC2425y0 f8448m0;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f8449n;

    /* renamed from: n0 */
    public final /* synthetic */ InterfaceC2425y0 f8450n0;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f8451o;

    /* renamed from: o0 */
    public final /* synthetic */ InterfaceC2425y0 f8452o0;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f8453p;

    /* renamed from: p0 */
    public final /* synthetic */ InterfaceC2425y0 f8454p0;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f8455q;

    /* renamed from: q0 */
    public final /* synthetic */ InterfaceC2425y0 f8456q0;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f8457r;

    /* renamed from: r0 */
    public final /* synthetic */ InterfaceC2425y0 f8458r0;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f8459s;

    /* renamed from: s0 */
    public final /* synthetic */ InterfaceC2425y0 f8460s0;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f8461t;

    /* renamed from: t0 */
    public final /* synthetic */ InterfaceC2425y0 f8462t0;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f8463u;

    /* renamed from: u0 */
    public final /* synthetic */ C0328m f8464u0;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f8465v;

    /* renamed from: v0 */
    public final /* synthetic */ InterfaceC2425y0 f8466v0;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f8467w;

    /* renamed from: w0 */
    public final /* synthetic */ InterfaceC2425y0 f8468w0;

    /* renamed from: x */
    public final /* synthetic */ InterfaceC2425y0 f8469x;

    /* renamed from: x0 */
    public final /* synthetic */ InterfaceC2425y0 f8470x0;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC2425y0 f8471y;

    /* renamed from: y0 */
    public final /* synthetic */ InterfaceC2425y0 f8472y0;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC2425y0 f8473z;

    /* renamed from: z0 */
    public final /* synthetic */ InterfaceC2425y0 f8474z0;

    public C1400wi(InterfaceC2425y0 interfaceC2425y0, Context context, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010, InterfaceC2425y0 interfaceC2425y011, InterfaceC2425y0 interfaceC2425y012, InterfaceC2425y0 interfaceC2425y013, InterfaceC2425y0 interfaceC2425y014, InterfaceC2425y0 interfaceC2425y015, InterfaceC2425y0 interfaceC2425y016, InterfaceC2425y0 interfaceC2425y017, InterfaceC2425y0 interfaceC2425y018, InterfaceC2425y0 interfaceC2425y019, InterfaceC2425y0 interfaceC2425y020, InterfaceC2425y0 interfaceC2425y021, InterfaceC2425y0 interfaceC2425y022, InterfaceC2425y0 interfaceC2425y023, InterfaceC2425y0 interfaceC2425y024, InterfaceC2425y0 interfaceC2425y025, InterfaceC2425y0 interfaceC2425y026, InterfaceC2425y0 interfaceC2425y027, InterfaceC2425y0 interfaceC2425y028, InterfaceC2425y0 interfaceC2425y029, InterfaceC2425y0 interfaceC2425y030, InterfaceC2425y0 interfaceC2425y031, InterfaceC2425y0 interfaceC2425y032, InterfaceC2425y0 interfaceC2425y033, InterfaceC2425y0 interfaceC2425y034, C3469p c3469p, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y035, C3469p c3469p3, C3469p c3469p4, InterfaceC2425y0 interfaceC2425y036, InterfaceC2425y0 interfaceC2425y037, InterfaceC2425y0 interfaceC2425y038, InterfaceC2425y0 interfaceC2425y039, InterfaceC2425y0 interfaceC2425y040, InterfaceC2425y0 interfaceC2425y041, InterfaceC2425y0 interfaceC2425y042, InterfaceC2425y0 interfaceC2425y043, InterfaceC2425y0 interfaceC2425y044, InterfaceC2425y0 interfaceC2425y045, InterfaceC2425y0 interfaceC2425y046, InterfaceC2425y0 interfaceC2425y047, InterfaceC2425y0 interfaceC2425y048, InterfaceC2425y0 interfaceC2425y049, InterfaceC2425y0 interfaceC2425y050, InterfaceC2425y0 interfaceC2425y051, InterfaceC2425y0 interfaceC2425y052, InterfaceC2425y0 interfaceC2425y053, C3469p c3469p5, InterfaceC2425y0 interfaceC2425y054, InterfaceC2425y0 interfaceC2425y055, InterfaceC2425y0 interfaceC2425y056, InterfaceC2425y0 interfaceC2425y057, InterfaceC2425y0 interfaceC2425y058, InterfaceC2425y0 interfaceC2425y059, InterfaceC2425y0 interfaceC2425y060, InterfaceC2425y0 interfaceC2425y061, InterfaceC2425y0 interfaceC2425y062, C0328m c0328m, InterfaceC2425y0 interfaceC2425y063, InterfaceC2425y0 interfaceC2425y064, InterfaceC2425y0 interfaceC2425y065, InterfaceC2425y0 interfaceC2425y066, InterfaceC2425y0 interfaceC2425y067, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y068, InterfaceC2425y0 interfaceC2425y069, AbstractC1540e abstractC1540e, InterfaceC3279c interfaceC3279c, float f7, InterfaceC3279c interfaceC3279c2, InterfaceC2425y0 interfaceC2425y070, InterfaceC2425y0 interfaceC2425y071, C0328m c0328m2, InterfaceC2425y0 interfaceC2425y072, C0976ir c0976ir, InterfaceC2425y0 interfaceC2425y073, InterfaceC2425y0 interfaceC2425y074, InterfaceC2425y0 interfaceC2425y075, InterfaceC2425y0 interfaceC2425y076, InterfaceC2425y0 interfaceC2425y077, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y078, InterfaceC2425y0 interfaceC2425y079) {
        this.f8431e = interfaceC2425y0;
        this.f8433f = context;
        this.f8435g = interfaceC2425y02;
        this.f8437h = interfaceC2425y03;
        this.f8439i = interfaceC2425y04;
        this.f8441j = interfaceC2425y05;
        this.f8443k = interfaceC2425y06;
        this.f8445l = interfaceC2425y07;
        this.f8447m = interfaceC2425y08;
        this.f8449n = interfaceC2425y09;
        this.f8451o = interfaceC2425y010;
        this.f8453p = interfaceC2425y011;
        this.f8455q = interfaceC2425y012;
        this.f8457r = interfaceC2425y013;
        this.f8459s = interfaceC2425y014;
        this.f8461t = interfaceC2425y015;
        this.f8463u = interfaceC2425y016;
        this.f8465v = interfaceC2425y017;
        this.f8467w = interfaceC2425y018;
        this.f8469x = interfaceC2425y019;
        this.f8471y = interfaceC2425y020;
        this.f8473z = interfaceC2425y021;
        this.f8381A = interfaceC2425y022;
        this.f8383B = interfaceC2425y023;
        this.f8385C = interfaceC2425y024;
        this.f8387D = interfaceC2425y025;
        this.f8389E = interfaceC2425y026;
        this.f8391F = interfaceC2425y027;
        this.f8393G = interfaceC2425y028;
        this.f8395H = interfaceC2425y029;
        this.f8397I = interfaceC2425y030;
        this.f8399J = interfaceC2425y031;
        this.f8401K = interfaceC2425y032;
        this.f8403L = interfaceC2425y033;
        this.f8405M = interfaceC2425y034;
        this.f8407N = c3469p;
        this.f8409O = c3469p2;
        this.f8411P = interfaceC2425y035;
        this.f8413Q = c3469p3;
        this.f8415R = c3469p4;
        this.f8417S = interfaceC2425y036;
        this.f8419T = interfaceC2425y037;
        this.f8421U = interfaceC2425y038;
        this.f8422V = interfaceC2425y039;
        this.f8423W = interfaceC2425y040;
        this.f8424X = interfaceC2425y041;
        this.f8425Y = interfaceC2425y042;
        this.f8426Z = interfaceC2425y043;
        this.f8427a0 = interfaceC2425y044;
        this.f8428b0 = interfaceC2425y045;
        this.f8429c0 = interfaceC2425y046;
        this.f8430d0 = interfaceC2425y047;
        this.f8432e0 = interfaceC2425y048;
        this.f8434f0 = interfaceC2425y049;
        this.f8436g0 = interfaceC2425y050;
        this.f8438h0 = interfaceC2425y051;
        this.f8440i0 = interfaceC2425y052;
        this.f8442j0 = interfaceC2425y053;
        this.f8444k0 = c3469p5;
        this.f8446l0 = interfaceC2425y054;
        this.f8448m0 = interfaceC2425y055;
        this.f8450n0 = interfaceC2425y056;
        this.f8452o0 = interfaceC2425y057;
        this.f8454p0 = interfaceC2425y058;
        this.f8456q0 = interfaceC2425y059;
        this.f8458r0 = interfaceC2425y060;
        this.f8460s0 = interfaceC2425y061;
        this.f8462t0 = interfaceC2425y062;
        this.f8464u0 = c0328m;
        this.f8466v0 = interfaceC2425y063;
        this.f8468w0 = interfaceC2425y064;
        this.f8470x0 = interfaceC2425y065;
        this.f8472y0 = interfaceC2425y066;
        this.f8474z0 = interfaceC2425y067;
        this.f8382A0 = interfaceC0516a0;
        this.f8384B0 = interfaceC2425y068;
        this.f8386C0 = interfaceC2425y069;
        this.f8388D0 = abstractC1540e;
        this.f8390E0 = interfaceC3279c;
        this.f8392F0 = f7;
        this.f8394G0 = interfaceC3279c2;
        this.f8396H0 = interfaceC2425y070;
        this.f8398I0 = interfaceC2425y071;
        this.f8400J0 = c0328m2;
        this.f8402K0 = interfaceC2425y072;
        this.f8404L0 = c0976ir;
        this.f8406M0 = interfaceC2425y073;
        this.f8408N0 = interfaceC2425y074;
        this.f8410O0 = interfaceC2425y075;
        this.f8412P0 = interfaceC2425y076;
        this.f8414Q0 = interfaceC2425y077;
        this.f8416R0 = c2349d1;
        this.f8418S0 = interfaceC2425y078;
        this.f8420T0 = interfaceC2425y079;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo22d(Object obj, Object obj2) {
        m2375e(((Number) obj2).intValue(), (C2395p) obj);
        return C1694m.f10482a;
    }

    /* renamed from: e */
    public final void m2375e(int i7, C2395p c2395p) {
        InterfaceC2425y0 interfaceC2425y0;
        InterfaceC3279c interfaceC3279c;
        boolean z7;
        InterfaceC3279c interfaceC3279c2;
        boolean m1777d0;
        boolean z8;
        Object obj;
        C3469p c3469p;
        InterfaceC3279c interfaceC3279c3;
        InterfaceC2425y0 interfaceC2425y02;
        C3469p c3469p2;
        Object obj2;
        final C3469p c3469p3;
        InterfaceC3277a interfaceC3277a;
        boolean m1837p0;
        InterfaceC3279c interfaceC3279c4;
        if ((i7 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            return;
        }
        InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC0155c.m345d(C3807o.f17991a), 4, 2);
        final InterfaceC2425y0 interfaceC2425y03 = this.f8431e;
        String m1858t1 = AbstractC1092mk.m1858t1(interfaceC2425y03);
        c2395p.m3857Z(-1376611916);
        boolean m3870g = c2395p.m3870g(interfaceC2425y03);
        final Context context = this.f8433f;
        boolean m3874i = m3870g | c2395p.m3874i(context);
        Object m3847O = c2395p.m3847O();
        Object obj3 = C2375k.f13421a;
        if (m3874i || m3847O == obj3) {
            final int i8 = 11;
            m3847O = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i9 = i8;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y04 = interfaceC2425y03;
                    Context context2 = context;
                    switch (i9) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool, context2, "rate_push_enabled", booleanValue);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue2 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool2, context2, "emergency_compensation_enabled", booleanValue2);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y04, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y04, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O);
        }
        InterfaceC3279c interfaceC3279c5 = (InterfaceC3279c) m3847O;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y04 = this.f8435g;
        boolean m1863u1 = AbstractC1092mk.m1863u1(interfaceC2425y04);
        c2395p.m3857Z(-1376604067);
        boolean m3870g2 = c2395p.m3870g(interfaceC2425y04) | c2395p.m3874i(context);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == obj3) {
            m3847O2 = new C0708ad(context, interfaceC2425y04, 24);
            c2395p.m3877j0(m3847O2);
        }
        InterfaceC3279c interfaceC3279c6 = (InterfaceC3279c) m3847O2;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y05 = this.f8437h;
        boolean m1848r1 = AbstractC1092mk.m1848r1(interfaceC2425y05);
        c2395p.m3857Z(-1376595740);
        boolean m3870g3 = c2395p.m3870g(interfaceC2425y05) | c2395p.m3874i(context);
        Object m3847O3 = c2395p.m3847O();
        if (m3870g3 || m3847O3 == obj3) {
            final int i9 = 5;
            m3847O3 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i9;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y05;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue2 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue2);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O3);
        }
        InterfaceC3279c interfaceC3279c7 = (InterfaceC3279c) m3847O3;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y06 = this.f8439i;
        boolean m1853s1 = AbstractC1092mk.m1853s1(interfaceC2425y06);
        c2395p.m3857Z(-1376586708);
        boolean m3870g4 = c2395p.m3870g(interfaceC2425y06) | c2395p.m3874i(context);
        Object m3847O4 = c2395p.m3847O();
        if (m3870g4 || m3847O4 == obj3) {
            final int i10 = 16;
            m3847O4 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i10;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y06;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue2 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue2);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O4);
        }
        InterfaceC3279c interfaceC3279c8 = (InterfaceC3279c) m3847O4;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y07 = this.f8441j;
        boolean booleanValue = ((Boolean) interfaceC2425y07.getValue()).booleanValue();
        c2395p.m3857Z(-1376578312);
        boolean m3870g5 = c2395p.m3870g(interfaceC2425y07) | c2395p.m3874i(context);
        Object m3847O5 = c2395p.m3847O();
        if (m3870g5 || m3847O5 == obj3) {
            final int i11 = 20;
            m3847O5 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i11;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y07;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O5);
        }
        InterfaceC3279c interfaceC3279c9 = (InterfaceC3279c) m3847O5;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y08 = this.f8443k;
        boolean m1651C1 = AbstractC1092mk.m1651C1(interfaceC2425y08);
        c2395p.m3857Z(-1376569914);
        boolean m3870g6 = c2395p.m3870g(interfaceC2425y08);
        InterfaceC2425y0 interfaceC2425y09 = this.f8445l;
        boolean m3870g7 = m3870g6 | c2395p.m3870g(interfaceC2425y09) | c2395p.m3874i(context);
        Object m3847O6 = c2395p.m3847O();
        if (m3870g7 || m3847O6 == obj3) {
            m3847O6 = new C0828e6(context, interfaceC2425y08, interfaceC2425y09, 4);
            c2395p.m3877j0(m3847O6);
        }
        InterfaceC3279c interfaceC3279c10 = (InterfaceC3279c) m3847O6;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y010 = this.f8447m;
        boolean m1656D1 = AbstractC1092mk.m1656D1(interfaceC2425y010);
        c2395p.m3857Z(-1376553581);
        boolean m3870g8 = c2395p.m3870g(interfaceC2425y010) | c2395p.m3874i(context);
        Object m3847O7 = c2395p.m3847O();
        if (m3870g8 || m3847O7 == obj3) {
            m3847O7 = new C1307ti(context, interfaceC2425y010, 4);
            c2395p.m3877j0(m3847O7);
        }
        InterfaceC3279c interfaceC3279c11 = (InterfaceC3279c) m3847O7;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y011 = this.f8449n;
        EnumC1127no m1661E1 = AbstractC1092mk.m1661E1(interfaceC2425y011);
        c2395p.m3857Z(-1376545258);
        boolean m3870g9 = c2395p.m3870g(interfaceC2425y011) | c2395p.m3874i(context);
        Object m3847O8 = c2395p.m3847O();
        if (m3870g9 || m3847O8 == obj3) {
            m3847O8 = new C1307ti(context, interfaceC2425y011, 9);
            c2395p.m3877j0(m3847O8);
        }
        InterfaceC3279c interfaceC3279c12 = (InterfaceC3279c) m3847O8;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y012 = this.f8451o;
        boolean m1666F1 = AbstractC1092mk.m1666F1(interfaceC2425y012);
        c2395p.m3857Z(-1376537297);
        boolean m3870g10 = c2395p.m3870g(interfaceC2425y012) | c2395p.m3874i(context);
        Object m3847O9 = c2395p.m3847O();
        if (m3870g10 || m3847O9 == obj3) {
            m3847O9 = new C1307ti(context, interfaceC2425y012, 13);
            c2395p.m3877j0(m3847O9);
        }
        InterfaceC3279c interfaceC3279c13 = (InterfaceC3279c) m3847O9;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y013 = this.f8457r;
        List m1671G1 = AbstractC1092mk.m1671G1(interfaceC2425y013);
        InterfaceC2425y0 interfaceC2425y014 = this.f8453p;
        String m1676H1 = AbstractC1092mk.m1676H1(interfaceC2425y014);
        c2395p.m3857Z(-1376525436);
        boolean m3870g11 = c2395p.m3870g(interfaceC2425y014) | c2395p.m3874i(context);
        Object m3847O10 = c2395p.m3847O();
        if (m3870g11 || m3847O10 == obj3) {
            m3847O10 = new C1307ti(context, interfaceC2425y014, 14);
            c2395p.m3877j0(m3847O10);
        }
        InterfaceC3279c interfaceC3279c14 = (InterfaceC3279c) m3847O10;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y015 = this.f8455q;
        String m1681I1 = AbstractC1092mk.m1681I1(interfaceC2425y015);
        c2395p.m3857Z(-1376516797);
        boolean m3870g12 = c2395p.m3870g(interfaceC2425y015) | c2395p.m3874i(context);
        Object m3847O11 = c2395p.m3847O();
        if (m3870g12 || m3847O11 == obj3) {
            final int i12 = 18;
            m3847O11 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i12;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y015;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O11);
        }
        InterfaceC3279c interfaceC3279c15 = (InterfaceC3279c) m3847O11;
        boolean m196w = AbstractC0094y0.m196w(c2395p, -1376510099, interfaceC2425y013) | c2395p.m3874i(context);
        Object m3847O12 = c2395p.m3847O();
        if (m196w || m3847O12 == obj3) {
            m3847O12 = new C1245ri(interfaceC2425y013, context);
            c2395p.m3877j0(m3847O12);
        }
        InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3847O12;
        boolean m196w2 = AbstractC0094y0.m196w(c2395p, -1376500356, interfaceC2425y013) | c2395p.m3874i(context);
        Object m3847O13 = c2395p.m3847O();
        if (m196w2 || m3847O13 == obj3) {
            m3847O13 = new C1045l4(interfaceC2425y013, context, 12);
            c2395p.m3877j0(m3847O13);
        }
        InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O13;
        boolean m196w3 = AbstractC0094y0.m196w(c2395p, -1376494864, interfaceC2425y013) | c2395p.m3874i(context);
        Object m3847O14 = c2395p.m3847O();
        if (m196w3 || m3847O14 == obj3) {
            m3847O14 = new C1307ti(interfaceC2425y013, context);
            c2395p.m3877j0(m3847O14);
        }
        InterfaceC3279c interfaceC3279c16 = (InterfaceC3279c) m3847O14;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y016 = this.f8459s;
        boolean m1686J1 = AbstractC1092mk.m1686J1(interfaceC2425y016);
        c2395p.m3857Z(-1376482876);
        boolean m3870g13 = c2395p.m3870g(interfaceC2425y016) | c2395p.m3874i(context);
        Object m3847O15 = c2395p.m3847O();
        if (m3870g13 || m3847O15 == obj3) {
            m3847O15 = new C1307ti(context, interfaceC2425y016, 10);
            c2395p.m3877j0(m3847O15);
        }
        InterfaceC3279c interfaceC3279c17 = (InterfaceC3279c) m3847O15;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y017 = this.f8406M0;
        List m1691K1 = AbstractC1092mk.m1691K1(interfaceC2425y017);
        c2395p.m3857Z(-1376474053);
        boolean m3874i2 = c2395p.m3874i(context);
        Object m3847O16 = c2395p.m3847O();
        if (m3874i2 || m3847O16 == obj3) {
            m3847O16 = new C1369vi(0, interfaceC2425y017, context);
            c2395p.m3877j0(m3847O16);
        }
        InterfaceC3282f interfaceC3282f = (InterfaceC3282f) m3847O16;
        c2395p.m3890t();
        c2395p.m3857Z(-1376460778);
        boolean m3874i3 = c2395p.m3874i(context);
        Object m3847O17 = c2395p.m3847O();
        if (m3874i3 || m3847O17 == obj3) {
            m3847O17 = new C1045l4(interfaceC2425y017, context, 13);
            c2395p.m3877j0(m3847O17);
        }
        InterfaceC3277a interfaceC3277a3 = (InterfaceC3277a) m3847O17;
        c2395p.m3890t();
        c2395p.m3857Z(-1376454372);
        boolean m3874i4 = c2395p.m3874i(context);
        Object m3847O18 = c2395p.m3847O();
        if (m3874i4 || m3847O18 == obj3) {
            m3847O18 = new C0708ad(interfaceC2425y017, context);
            c2395p.m3877j0(m3847O18);
        }
        InterfaceC3279c interfaceC3279c18 = (InterfaceC3279c) m3847O18;
        InterfaceC2425y0 interfaceC2425y018 = this.f8461t;
        boolean m196w4 = AbstractC0094y0.m196w(c2395p, -1376443299, interfaceC2425y018) | c2395p.m3870g(interfaceC2425y016) | c2395p.m3874i(context);
        Object m3847O19 = c2395p.m3847O();
        if (m196w4 || m3847O19 == obj3) {
            Object c0740bd = new C0740bd(context, interfaceC2425y017, interfaceC2425y018, interfaceC2425y016, 1);
            interfaceC2425y0 = interfaceC2425y018;
            c2395p.m3877j0(c0740bd);
            m3847O19 = c0740bd;
        } else {
            interfaceC2425y0 = interfaceC2425y018;
        }
        InterfaceC3279c interfaceC3279c19 = (InterfaceC3279c) m3847O19;
        c2395p.m3890t();
        boolean m1716P1 = AbstractC1092mk.m1716P1(interfaceC2425y0);
        c2395p.m3857Z(-1376421792);
        boolean m3870g14 = c2395p.m3870g(interfaceC2425y0) | c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y012) | c2395p.m3870g(interfaceC2425y016);
        Object m3847O20 = c2395p.m3847O();
        if (m3870g14 || m3847O20 == obj3) {
            Object c0740bd2 = new C0740bd(context, interfaceC2425y0, interfaceC2425y012, interfaceC2425y016, 2);
            c2395p.m3877j0(c0740bd2);
            m3847O20 = c0740bd2;
        }
        InterfaceC3279c interfaceC3279c20 = (InterfaceC3279c) m3847O20;
        c2395p.m3890t();
        EnumC1003jo m1721Q1 = AbstractC1092mk.m1721Q1(this.f8463u);
        c2395p.m3857Z(-1376417535);
        boolean m3870g15 = c2395p.m3870g(this.f8463u) | c2395p.m3874i(context);
        Object m3847O21 = c2395p.m3847O();
        if (m3870g15 || m3847O21 == obj3) {
            m3847O21 = new C0708ad(context, this.f8463u, 25);
            c2395p.m3877j0(m3847O21);
        }
        InterfaceC3279c interfaceC3279c21 = (InterfaceC3279c) m3847O21;
        c2395p.m3890t();
        boolean m1696L1 = AbstractC1092mk.m1696L1(this.f8465v);
        c2395p.m3857Z(-1376409283);
        boolean m3870g16 = c2395p.m3870g(this.f8465v) | c2395p.m3874i(context);
        Object m3847O22 = c2395p.m3847O();
        if (m3870g16 || m3847O22 == obj3) {
            m3847O22 = new C0708ad(context, this.f8465v, 26);
            c2395p.m3877j0(m3847O22);
        }
        InterfaceC3279c interfaceC3279c22 = (InterfaceC3279c) m3847O22;
        c2395p.m3890t();
        String m1701M1 = AbstractC1092mk.m1701M1(this.f8467w);
        c2395p.m3857Z(-1376400868);
        boolean m3870g17 = c2395p.m3870g(this.f8467w) | c2395p.m3874i(context);
        Object m3847O23 = c2395p.m3847O();
        if (m3870g17 || m3847O23 == obj3) {
            m3847O23 = new C0708ad(context, this.f8467w, 27);
            c2395p.m3877j0(m3847O23);
        }
        InterfaceC3279c interfaceC3279c23 = (InterfaceC3279c) m3847O23;
        c2395p.m3890t();
        String m1706N1 = AbstractC1092mk.m1706N1(this.f8469x);
        c2395p.m3857Z(-1376391993);
        boolean m3870g18 = c2395p.m3870g(this.f8469x) | c2395p.m3874i(context);
        Object m3847O24 = c2395p.m3847O();
        if (m3870g18 || m3847O24 == obj3) {
            m3847O24 = new C0708ad(context, this.f8469x, 28);
            c2395p.m3877j0(m3847O24);
        }
        InterfaceC3279c interfaceC3279c24 = (InterfaceC3279c) m3847O24;
        c2395p.m3890t();
        boolean m1711O1 = AbstractC1092mk.m1711O1(this.f8471y);
        c2395p.m3857Z(-1376382869);
        boolean m3870g19 = c2395p.m3870g(this.f8471y) | c2395p.m3874i(context);
        Object m3847O25 = c2395p.m3847O();
        if (m3870g19 || m3847O25 == obj3) {
            m3847O25 = new C0708ad(context, this.f8471y, 29);
            c2395p.m3877j0(m3847O25);
        }
        InterfaceC3279c interfaceC3279c25 = (InterfaceC3279c) m3847O25;
        c2395p.m3890t();
        boolean m1726R1 = AbstractC1092mk.m1726R1(this.f8473z);
        c2395p.m3857Z(-1376374405);
        boolean m3870g20 = c2395p.m3870g(this.f8473z) | c2395p.m3874i(context);
        Object m3847O26 = c2395p.m3847O();
        if (m3870g20 || m3847O26 == obj3) {
            final int i13 = 0;
            final InterfaceC2425y0 interfaceC2425y019 = this.f8473z;
            m3847O26 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i13;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y019;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O26);
        }
        InterfaceC3279c interfaceC3279c26 = (InterfaceC3279c) m3847O26;
        c2395p.m3890t();
        String m1731S1 = AbstractC1092mk.m1731S1(this.f8381A);
        c2395p.m3857Z(-1376366050);
        boolean m3870g21 = c2395p.m3870g(this.f8381A) | c2395p.m3874i(context);
        Object m3847O27 = c2395p.m3847O();
        if (m3870g21 || m3847O27 == obj3) {
            final int i14 = 1;
            final InterfaceC2425y0 interfaceC2425y020 = this.f8381A;
            m3847O27 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i14;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y020;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O27);
        }
        InterfaceC3279c interfaceC3279c27 = (InterfaceC3279c) m3847O27;
        c2395p.m3890t();
        String m1735T1 = AbstractC1092mk.m1735T1(this.f8383B);
        c2395p.m3857Z(-1376357791);
        boolean m3870g22 = c2395p.m3870g(this.f8383B) | c2395p.m3874i(context);
        Object m3847O28 = c2395p.m3847O();
        if (m3870g22 || m3847O28 == obj3) {
            final int i15 = 2;
            final InterfaceC2425y0 interfaceC2425y021 = this.f8383B;
            m3847O28 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i15;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y021;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O28);
        }
        InterfaceC3279c interfaceC3279c28 = (InterfaceC3279c) m3847O28;
        c2395p.m3890t();
        boolean m1739U1 = AbstractC1092mk.m1739U1(this.f8385C);
        c2395p.m3857Z(-1376348363);
        boolean m3870g23 = c2395p.m3870g(this.f8385C) | c2395p.m3874i(context);
        Object m3847O29 = c2395p.m3847O();
        if (m3870g23 || m3847O29 == obj3) {
            final int i16 = 3;
            final InterfaceC2425y0 interfaceC2425y022 = this.f8385C;
            m3847O29 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i16;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y022;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O29);
        }
        InterfaceC3279c interfaceC3279c29 = (InterfaceC3279c) m3847O29;
        c2395p.m3890t();
        boolean m1743V1 = AbstractC1092mk.m1743V1(this.f8387D);
        c2395p.m3857Z(-1376338615);
        boolean m3870g24 = c2395p.m3870g(this.f8387D) | c2395p.m3874i(context);
        Object m3847O30 = c2395p.m3847O();
        if (m3870g24 || m3847O30 == obj3) {
            final int i17 = 4;
            final InterfaceC2425y0 interfaceC2425y023 = this.f8387D;
            m3847O30 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i17;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y023;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O30);
        }
        InterfaceC3279c interfaceC3279c30 = (InterfaceC3279c) m3847O30;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y024 = this.f8389E;
        String m1747W1 = AbstractC1092mk.m1747W1(interfaceC2425y024);
        c2395p.m3857Z(-1376329525);
        boolean m3870g25 = c2395p.m3870g(interfaceC2425y024) | c2395p.m3874i(context);
        Object m3847O31 = c2395p.m3847O();
        if (m3870g25 || m3847O31 == obj3) {
            final int i18 = 6;
            m3847O31 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i18;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y024;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O31);
        }
        InterfaceC3279c interfaceC3279c31 = (InterfaceC3279c) m3847O31;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y025 = this.f8391F;
        String m1751X1 = AbstractC1092mk.m1751X1(interfaceC2425y025);
        c2395p.m3857Z(-1376320373);
        boolean m3870g26 = c2395p.m3870g(interfaceC2425y025) | c2395p.m3874i(context);
        Object m3847O32 = c2395p.m3847O();
        if (m3870g26 || m3847O32 == obj3) {
            final int i19 = 7;
            m3847O32 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i19;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y025;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O32);
        }
        InterfaceC3279c interfaceC3279c32 = (InterfaceC3279c) m3847O32;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y026 = this.f8393G;
        String m1755Y1 = AbstractC1092mk.m1755Y1(interfaceC2425y026);
        c2395p.m3857Z(-1376311417);
        boolean m3870g27 = c2395p.m3870g(interfaceC2425y026) | c2395p.m3874i(context);
        Object m3847O33 = c2395p.m3847O();
        if (m3870g27 || m3847O33 == obj3) {
            final int i20 = 8;
            m3847O33 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i20;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y026;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O33);
        }
        InterfaceC3279c interfaceC3279c33 = (InterfaceC3279c) m3847O33;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y027 = this.f8395H;
        String m1759Z1 = AbstractC1092mk.m1759Z1(interfaceC2425y027);
        c2395p.m3857Z(-1376302585);
        boolean m3870g28 = c2395p.m3870g(interfaceC2425y027) | c2395p.m3874i(context);
        Object m3847O34 = c2395p.m3847O();
        if (m3870g28 || m3847O34 == obj3) {
            final int i21 = 9;
            m3847O34 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i21;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y027;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O34);
        }
        InterfaceC3279c interfaceC3279c34 = (InterfaceC3279c) m3847O34;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y028 = this.f8397I;
        String m1764a2 = AbstractC1092mk.m1764a2(interfaceC2425y028);
        c2395p.m3857Z(-1376293268);
        boolean m3870g29 = c2395p.m3870g(interfaceC2425y028) | c2395p.m3874i(context);
        Object m3847O35 = c2395p.m3847O();
        if (m3870g29 || m3847O35 == obj3) {
            final int i22 = 10;
            m3847O35 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i22;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y028;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O35);
        }
        InterfaceC3279c interfaceC3279c35 = (InterfaceC3279c) m3847O35;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y029 = this.f8399J;
        String m1769b2 = AbstractC1092mk.m1769b2(interfaceC2425y029);
        c2395p.m3857Z(-1376283992);
        boolean m3870g30 = c2395p.m3870g(interfaceC2425y029) | c2395p.m3874i(context);
        Object m3847O36 = c2395p.m3847O();
        if (m3870g30 || m3847O36 == obj3) {
            interfaceC3279c = interfaceC3279c5;
            final int i23 = 12;
            m3847O36 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i23;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y029;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O36);
        } else {
            interfaceC3279c = interfaceC3279c5;
        }
        InterfaceC3279c interfaceC3279c36 = (InterfaceC3279c) m3847O36;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y030 = this.f8401K;
        String m1774c2 = AbstractC1092mk.m1774c2(interfaceC2425y030);
        c2395p.m3857Z(-1376273469);
        boolean m3870g31 = c2395p.m3870g(interfaceC2425y030) | c2395p.m3874i(context);
        Object m3847O37 = c2395p.m3847O();
        if (m3870g31 || m3847O37 == obj3) {
            z7 = m1863u1;
            final int i24 = 13;
            m3847O37 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i24;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y030;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O37);
        } else {
            z7 = m1863u1;
        }
        InterfaceC3279c interfaceC3279c37 = (InterfaceC3279c) m3847O37;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y031 = this.f8403L;
        String m1779d2 = AbstractC1092mk.m1779d2(interfaceC2425y031);
        c2395p.m3857Z(-1376263090);
        boolean m3870g32 = c2395p.m3870g(interfaceC2425y031) | c2395p.m3874i(context);
        Object m3847O38 = c2395p.m3847O();
        if (m3870g32 || m3847O38 == obj3) {
            interfaceC3279c2 = interfaceC3279c6;
            final int i25 = 14;
            m3847O38 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i25;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y031;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O38);
        } else {
            interfaceC3279c2 = interfaceC3279c6;
        }
        InterfaceC3279c interfaceC3279c38 = (InterfaceC3279c) m3847O38;
        c2395p.m3890t();
        m1777d0 = AbstractC1092mk.m1777d0(interfaceC2425y09);
        c2395p.m3857Z(-1376252890);
        boolean m3870g33 = c2395p.m3870g(interfaceC2425y09) | c2395p.m3870g(interfaceC2425y08) | c2395p.m3874i(context);
        Object m3847O39 = c2395p.m3847O();
        if (m3870g33 || m3847O39 == obj3) {
            z8 = m1853s1;
            m3847O39 = new C0828e6(context, interfaceC2425y09, interfaceC2425y08, 3);
            c2395p.m3877j0(m3847O39);
        } else {
            z8 = m1853s1;
        }
        InterfaceC3279c interfaceC3279c39 = (InterfaceC3279c) m3847O39;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y032 = this.f8405M;
        String m1789f2 = AbstractC1092mk.m1789f2(interfaceC2425y032);
        c2395p.m3857Z(-1376226241);
        boolean m3870g34 = c2395p.m3870g(interfaceC2425y032) | c2395p.m3874i(context);
        Object m3847O40 = c2395p.m3847O();
        if (m3870g34 || m3847O40 == obj3) {
            final int i26 = 15;
            m3847O40 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i26;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y032;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O40);
        }
        InterfaceC3279c interfaceC3279c40 = (InterfaceC3279c) m3847O40;
        boolean m3870g35 = c2395p.m3870g(interfaceC2425y030) | AbstractC0094y0.m196w(c2395p, -1376219776, interfaceC2425y024) | c2395p.m3870g(interfaceC2425y025) | c2395p.m3870g(interfaceC2425y026) | c2395p.m3870g(interfaceC2425y027) | c2395p.m3870g(interfaceC2425y028) | c2395p.m3870g(interfaceC2425y029) | c2395p.m3870g(interfaceC2425y031) | c2395p.m3870g(interfaceC2425y09) | c2395p.m3870g(interfaceC2425y032) | c2395p.m3874i(context);
        Object m3847O41 = c2395p.m3847O();
        if (m3870g35 || m3847O41 == obj3) {
            obj = obj3;
            Object c1028ki = new C1028ki(context, this.f8389E, this.f8391F, this.f8393G, this.f8395H, this.f8397I, this.f8399J, this.f8401K, this.f8403L, this.f8445l, this.f8405M);
            c2395p.m3877j0(c1028ki);
            m3847O41 = c1028ki;
        } else {
            obj = obj3;
        }
        InterfaceC3277a interfaceC3277a4 = (InterfaceC3277a) m3847O41;
        c2395p.m3890t();
        C3469p c3469p4 = this.f8407N;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c3469p4));
        Iterator it = c3469p4.iterator();
        while (true) {
            C2077a c2077a = (C2077a) it;
            if (!c2077a.hasNext()) {
                break;
            }
            C1189po c1189po = (C1189po) c2077a.next();
            arrayList.add(new C0782cn(c1189po.f6926a, c1189po.m2081b().size(), c1189po.m2083d().size(), c1189po.m2082c()));
        }
        c2395p.m3857Z(-1376204178);
        boolean m3874i5 = c2395p.m3874i(context);
        Object m3847O42 = c2395p.m3847O();
        if (m3874i5 || m3847O42 == obj) {
            final int i27 = 0;
            final C3469p c3469p5 = this.f8409O;
            m3847O42 = new InterfaceC3279c() { // from class: e5.oi
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i28 = i27;
                    C1694m c1694m = C1694m.f10482a;
                    Context context2 = context;
                    C3469p c3469p6 = c3469p5;
                    Integer num = (Integer) obj4;
                    switch (i28) {
                        case 0:
                            num.getClass();
                            if (c3469p6.contains(num)) {
                                c3469p6.remove(num);
                            } else {
                                c3469p6.add(num);
                            }
                            float f7 = AbstractC1092mk.f5952h;
                            SharedPreferences.Editor edit = context2.getSharedPreferences("speed_test_profiles", 0).edit();
                            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(c3469p6));
                            ListIterator listIterator = c3469p6.listIterator();
                            while (true) {
                                C2077a c2077a2 = (C2077a) listIterator;
                                if (c2077a2.hasNext()) {
                                    arrayList2.add(String.valueOf(((Number) c2077a2.next()).intValue()));
                                } else {
                                    edit.putStringSet("rate_push_profile_ids", AbstractC1805m.m3038F0(arrayList2)).apply();
                                    return c1694m;
                                }
                            }
                        case 1:
                            int intValue = num.intValue();
                            if (intValue >= 0 && intValue < c3469p6.size()) {
                                c3469p6.remove(intValue);
                                AbstractC1092mk.m1740U2(context2, c3469p6);
                            }
                            return c1694m;
                        default:
                            int intValue2 = num.intValue();
                            if (intValue2 >= 0 && intValue2 < c3469p6.size()) {
                                c3469p6.remove(intValue2);
                                AbstractC1092mk.m1736T2(context2, c3469p6);
                            }
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O42);
        }
        InterfaceC3279c interfaceC3279c41 = (InterfaceC3279c) m3847O42;
        c2395p.m3890t();
        boolean m1794g2 = AbstractC1092mk.m1794g2(this.f8411P);
        c2395p.m3857Z(-1376187194);
        boolean m3870g36 = c2395p.m3870g(this.f8411P) | c2395p.m3874i(context);
        Object m3847O43 = c2395p.m3847O();
        if (m3870g36 || m3847O43 == obj) {
            final int i28 = 17;
            final InterfaceC2425y0 interfaceC2425y033 = this.f8411P;
            m3847O43 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i28;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y033;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O43);
        }
        InterfaceC3279c interfaceC3279c42 = (InterfaceC3279c) m3847O43;
        c2395p.m3890t();
        c2395p.m3857Z(-1376178229);
        boolean m3874i6 = c2395p.m3874i(context);
        Object m3847O44 = c2395p.m3847O();
        final C3469p c3469p6 = this.f8413Q;
        if (m3874i6 || m3847O44 == obj) {
            final int i29 = 0;
            m3847O44 = new InterfaceC3281e() { // from class: e5.pi
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj4, Object obj5) {
                    int i30 = i29;
                    int intValue = ((Integer) obj4).intValue();
                    String str = (String) obj5;
                    switch (i30) {
                        case 0:
                            AbstractC3367j.m5100e(str, "value");
                            if (intValue >= 0) {
                                C3469p c3469p7 = c3469p6;
                                if (intValue < c3469p7.size()) {
                                    c3469p7.set(intValue, str);
                                    AbstractC1092mk.m1740U2(context, c3469p7);
                                }
                            }
                            return C1694m.f10482a;
                        default:
                            AbstractC3367j.m5100e(str, "value");
                            if (intValue >= 0) {
                                C3469p c3469p8 = c3469p6;
                                if (intValue < c3469p8.size()) {
                                    c3469p8.set(intValue, str);
                                    AbstractC1092mk.m1736T2(context, c3469p8);
                                }
                            }
                            return C1694m.f10482a;
                    }
                }
            };
            c2395p.m3877j0(m3847O44);
        }
        InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) m3847O44;
        Object m180g = AbstractC0094y0.m180g(-1376168442, c2395p);
        if (m180g == obj) {
            m180g = new C1214qi(c3469p6, 0);
            c2395p.m3877j0(m180g);
        }
        InterfaceC3277a interfaceC3277a5 = (InterfaceC3277a) m180g;
        c2395p.m3890t();
        c2395p.m3857Z(-1376164475);
        boolean m3874i7 = c2395p.m3874i(context);
        Object m3847O45 = c2395p.m3847O();
        if (m3874i7 || m3847O45 == obj) {
            final int i30 = 1;
            m3847O45 = new InterfaceC3279c() { // from class: e5.oi
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i282 = i30;
                    C1694m c1694m = C1694m.f10482a;
                    Context context2 = context;
                    C3469p c3469p62 = c3469p6;
                    Integer num = (Integer) obj4;
                    switch (i282) {
                        case 0:
                            num.getClass();
                            if (c3469p62.contains(num)) {
                                c3469p62.remove(num);
                            } else {
                                c3469p62.add(num);
                            }
                            float f7 = AbstractC1092mk.f5952h;
                            SharedPreferences.Editor edit = context2.getSharedPreferences("speed_test_profiles", 0).edit();
                            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(c3469p62));
                            ListIterator listIterator = c3469p62.listIterator();
                            while (true) {
                                C2077a c2077a2 = (C2077a) listIterator;
                                if (c2077a2.hasNext()) {
                                    arrayList2.add(String.valueOf(((Number) c2077a2.next()).intValue()));
                                } else {
                                    edit.putStringSet("rate_push_profile_ids", AbstractC1805m.m3038F0(arrayList2)).apply();
                                    return c1694m;
                                }
                            }
                        case 1:
                            int intValue = num.intValue();
                            if (intValue >= 0 && intValue < c3469p62.size()) {
                                c3469p62.remove(intValue);
                                AbstractC1092mk.m1740U2(context2, c3469p62);
                            }
                            return c1694m;
                        default:
                            int intValue2 = num.intValue();
                            if (intValue2 >= 0 && intValue2 < c3469p62.size()) {
                                c3469p62.remove(intValue2);
                                AbstractC1092mk.m1736T2(context2, c3469p62);
                            }
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O45);
        }
        InterfaceC3279c interfaceC3279c43 = (InterfaceC3279c) m3847O45;
        c2395p.m3890t();
        c2395p.m3857Z(-1376152465);
        boolean m3874i8 = c2395p.m3874i(context);
        Object m3847O46 = c2395p.m3847O();
        final C3469p c3469p7 = this.f8415R;
        if (m3874i8 || m3847O46 == obj) {
            final int i31 = 1;
            m3847O46 = new InterfaceC3281e() { // from class: e5.pi
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj4, Object obj5) {
                    int i302 = i31;
                    int intValue = ((Integer) obj4).intValue();
                    String str = (String) obj5;
                    switch (i302) {
                        case 0:
                            AbstractC3367j.m5100e(str, "value");
                            if (intValue >= 0) {
                                C3469p c3469p72 = c3469p7;
                                if (intValue < c3469p72.size()) {
                                    c3469p72.set(intValue, str);
                                    AbstractC1092mk.m1740U2(context, c3469p72);
                                }
                            }
                            return C1694m.f10482a;
                        default:
                            AbstractC3367j.m5100e(str, "value");
                            if (intValue >= 0) {
                                C3469p c3469p8 = c3469p7;
                                if (intValue < c3469p8.size()) {
                                    c3469p8.set(intValue, str);
                                    AbstractC1092mk.m1736T2(context, c3469p8);
                                }
                            }
                            return C1694m.f10482a;
                    }
                }
            };
            c2395p.m3877j0(m3847O46);
        }
        InterfaceC3281e interfaceC3281e3 = (InterfaceC3281e) m3847O46;
        Object m180g2 = AbstractC0094y0.m180g(-1376142521, c2395p);
        if (m180g2 == obj) {
            m180g2 = new C1214qi(c3469p7, 1);
            c2395p.m3877j0(m180g2);
        }
        InterfaceC3277a interfaceC3277a6 = (InterfaceC3277a) m180g2;
        c2395p.m3890t();
        c2395p.m3857Z(-1376138487);
        boolean m3874i9 = c2395p.m3874i(context);
        Object m3847O47 = c2395p.m3847O();
        if (m3874i9 || m3847O47 == obj) {
            final int i32 = 2;
            m3847O47 = new InterfaceC3279c() { // from class: e5.oi
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i282 = i32;
                    C1694m c1694m = C1694m.f10482a;
                    Context context2 = context;
                    C3469p c3469p62 = c3469p7;
                    Integer num = (Integer) obj4;
                    switch (i282) {
                        case 0:
                            num.getClass();
                            if (c3469p62.contains(num)) {
                                c3469p62.remove(num);
                            } else {
                                c3469p62.add(num);
                            }
                            float f7 = AbstractC1092mk.f5952h;
                            SharedPreferences.Editor edit = context2.getSharedPreferences("speed_test_profiles", 0).edit();
                            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(c3469p62));
                            ListIterator listIterator = c3469p62.listIterator();
                            while (true) {
                                C2077a c2077a2 = (C2077a) listIterator;
                                if (c2077a2.hasNext()) {
                                    arrayList2.add(String.valueOf(((Number) c2077a2.next()).intValue()));
                                } else {
                                    edit.putStringSet("rate_push_profile_ids", AbstractC1805m.m3038F0(arrayList2)).apply();
                                    return c1694m;
                                }
                            }
                        case 1:
                            int intValue = num.intValue();
                            if (intValue >= 0 && intValue < c3469p62.size()) {
                                c3469p62.remove(intValue);
                                AbstractC1092mk.m1740U2(context2, c3469p62);
                            }
                            return c1694m;
                        default:
                            int intValue2 = num.intValue();
                            if (intValue2 >= 0 && intValue2 < c3469p62.size()) {
                                c3469p62.remove(intValue2);
                                AbstractC1092mk.m1736T2(context2, c3469p62);
                            }
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O47);
        }
        InterfaceC3279c interfaceC3279c44 = (InterfaceC3279c) m3847O47;
        c2395p.m3890t();
        String m1799h2 = AbstractC1092mk.m1799h2(this.f8417S);
        c2395p.m3857Z(-1376125839);
        boolean m3870g37 = c2395p.m3870g(this.f8417S) | c2395p.m3874i(context);
        Object m3847O48 = c2395p.m3847O();
        if (m3870g37 || m3847O48 == obj) {
            final int i33 = 19;
            final InterfaceC2425y0 interfaceC2425y034 = this.f8417S;
            m3847O48 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i33;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y034;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O48);
        }
        InterfaceC3279c interfaceC3279c45 = (InterfaceC3279c) m3847O48;
        c2395p.m3890t();
        String m1804i2 = AbstractC1092mk.m1804i2(this.f8419T);
        c2395p.m3857Z(-1376115719);
        boolean m3870g38 = c2395p.m3870g(this.f8419T) | c2395p.m3874i(context);
        Object m3847O49 = c2395p.m3847O();
        if (m3870g38 || m3847O49 == obj) {
            final int i34 = 21;
            final InterfaceC2425y0 interfaceC2425y035 = this.f8419T;
            m3847O49 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i34;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y035;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O49);
        }
        InterfaceC3279c interfaceC3279c46 = (InterfaceC3279c) m3847O49;
        c2395p.m3890t();
        String m1809j2 = AbstractC1092mk.m1809j2(this.f8421U);
        c2395p.m3857Z(-1376105155);
        boolean m3870g39 = c2395p.m3870g(this.f8421U) | c2395p.m3874i(context);
        Object m3847O50 = c2395p.m3847O();
        if (m3870g39 || m3847O50 == obj) {
            final int i35 = 22;
            final InterfaceC2425y0 interfaceC2425y036 = this.f8421U;
            m3847O50 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i35;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y036;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O50);
        }
        InterfaceC3279c interfaceC3279c47 = (InterfaceC3279c) m3847O50;
        c2395p.m3890t();
        String m1814k2 = AbstractC1092mk.m1814k2(this.f8422V);
        c2395p.m3857Z(-1376094663);
        boolean m3870g40 = c2395p.m3870g(this.f8422V) | c2395p.m3874i(context);
        Object m3847O51 = c2395p.m3847O();
        if (m3870g40 || m3847O51 == obj) {
            final int i36 = 23;
            final InterfaceC2425y0 interfaceC2425y037 = this.f8422V;
            m3847O51 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i36;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y037;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O51);
        }
        InterfaceC3279c interfaceC3279c48 = (InterfaceC3279c) m3847O51;
        c2395p.m3890t();
        String m1819l2 = AbstractC1092mk.m1819l2(this.f8423W);
        c2395p.m3857Z(-1376084099);
        boolean m3870g41 = c2395p.m3870g(this.f8423W) | c2395p.m3874i(context);
        Object m3847O52 = c2395p.m3847O();
        if (m3870g41 || m3847O52 == obj) {
            final int i37 = 24;
            final InterfaceC2425y0 interfaceC2425y038 = this.f8423W;
            m3847O52 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i37;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y038;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O52);
        }
        InterfaceC3279c interfaceC3279c49 = (InterfaceC3279c) m3847O52;
        c2395p.m3890t();
        String m1824m2 = AbstractC1092mk.m1824m2(this.f8424X);
        c2395p.m3857Z(-1376073700);
        boolean m3870g42 = c2395p.m3870g(this.f8424X) | c2395p.m3874i(context);
        Object m3847O53 = c2395p.m3847O();
        if (m3870g42 || m3847O53 == obj) {
            final int i38 = 25;
            final InterfaceC2425y0 interfaceC2425y039 = this.f8424X;
            m3847O53 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i38;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y039;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O53);
        }
        InterfaceC3279c interfaceC3279c50 = (InterfaceC3279c) m3847O53;
        c2395p.m3890t();
        boolean m1829n2 = AbstractC1092mk.m1829n2(this.f8425Y);
        c2395p.m3857Z(-1376063336);
        boolean m3870g43 = c2395p.m3870g(this.f8425Y) | c2395p.m3874i(context);
        Object m3847O54 = c2395p.m3847O();
        if (m3870g43 || m3847O54 == obj) {
            final int i39 = 26;
            final InterfaceC2425y0 interfaceC2425y040 = this.f8425Y;
            m3847O54 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i39;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y040;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue2 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue2);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue22 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue22);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O54);
        }
        InterfaceC3279c interfaceC3279c51 = (InterfaceC3279c) m3847O54;
        c2395p.m3890t();
        boolean booleanValue2 = ((Boolean) this.f8426Z.getValue()).booleanValue();
        c2395p.m3857Z(-1376053782);
        boolean m3870g44 = c2395p.m3870g(this.f8426Z) | c2395p.m3874i(context);
        Object m3847O55 = c2395p.m3847O();
        if (m3870g44 || m3847O55 == obj) {
            final int i40 = 27;
            final InterfaceC2425y0 interfaceC2425y041 = this.f8426Z;
            m3847O55 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i40;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y042 = interfaceC2425y041;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue22 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool, context2, "rate_push_enabled", booleanValue22);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue222 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool2, context2, "emergency_compensation_enabled", booleanValue222);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y042, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y042, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O55);
        }
        InterfaceC3279c interfaceC3279c52 = (InterfaceC3279c) m3847O55;
        c2395p.m3890t();
        String m1834o2 = AbstractC1092mk.m1834o2(this.f8427a0);
        c2395p.m3857Z(-1376044571);
        boolean m3870g45 = c2395p.m3870g(this.f8427a0) | c2395p.m3874i(context);
        Object m3847O56 = c2395p.m3847O();
        if (m3870g45 || m3847O56 == obj) {
            final int i41 = 28;
            final InterfaceC2425y0 interfaceC2425y042 = this.f8427a0;
            m3847O56 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i41;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y0422 = interfaceC2425y042;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue22 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool, context2, "rate_push_enabled", booleanValue22);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue222 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool2, context2, "emergency_compensation_enabled", booleanValue222);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O56);
        }
        InterfaceC3279c interfaceC3279c53 = (InterfaceC3279c) m3847O56;
        c2395p.m3890t();
        String m1839p2 = AbstractC1092mk.m1839p2(this.f8428b0);
        c2395p.m3857Z(-1376035515);
        boolean m3870g46 = c2395p.m3870g(this.f8428b0) | c2395p.m3874i(context);
        Object m3847O57 = c2395p.m3847O();
        if (m3870g46 || m3847O57 == obj) {
            final int i42 = 29;
            final InterfaceC2425y0 interfaceC2425y043 = this.f8428b0;
            m3847O57 = new InterfaceC3279c() { // from class: e5.ni
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj4) {
                    int i92 = i42;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y0422 = interfaceC2425y043;
                    Context context2 = context;
                    switch (i92) {
                        case 0:
                            Boolean bool = (Boolean) obj4;
                            boolean booleanValue22 = bool.booleanValue();
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool, context2, "rate_push_enabled", booleanValue22);
                            return c1694m;
                        case 1:
                            String str = (String) obj4;
                            AbstractC3367j.m5100e(str, "it");
                            float f8 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str, context2, "rate_push_threads", str);
                            return c1694m;
                        case 2:
                            String str2 = (String) obj4;
                            AbstractC3367j.m5100e(str2, "it");
                            float f9 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str2, context2, "rate_push_step_threads", str2);
                            return c1694m;
                        case 3:
                            Boolean bool2 = (Boolean) obj4;
                            boolean booleanValue222 = bool2.booleanValue();
                            float f10 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool2, context2, "emergency_compensation_enabled", booleanValue222);
                            return c1694m;
                        case 4:
                            Boolean bool3 = (Boolean) obj4;
                            boolean booleanValue3 = bool3.booleanValue();
                            float f11 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool3, context2, "tuning_custom_enabled", booleanValue3);
                            return c1694m;
                        case AbstractC3122c.f15761f /* 5 */:
                            Boolean bool4 = (Boolean) obj4;
                            boolean booleanValue4 = bool4.booleanValue();
                            float f12 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool4, context2, "use_root_traffic_stats", booleanValue4);
                            return c1694m;
                        case AbstractC3122c.f15759d /* 6 */:
                            String str3 = (String) obj4;
                            AbstractC3367j.m5100e(str3, "it");
                            float f13 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str3, context2, "tuning_download_min_workers", str3);
                            return c1694m;
                        case 7:
                            String str4 = (String) obj4;
                            AbstractC3367j.m5100e(str4, "it");
                            float f14 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str4, context2, "tuning_download_max_workers", str4);
                            return c1694m;
                        case 8:
                            String str5 = (String) obj4;
                            AbstractC3367j.m5100e(str5, "it");
                            float f15 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str5, context2, "tuning_upload_min_workers", str5);
                            return c1694m;
                        case AbstractC3122c.f15758c /* 9 */:
                            String str6 = (String) obj4;
                            AbstractC3367j.m5100e(str6, "it");
                            float f16 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str6, context2, "tuning_upload_max_workers", str6);
                            return c1694m;
                        case AbstractC3122c.f15760e /* 10 */:
                            String str7 = (String) obj4;
                            AbstractC3367j.m5100e(str7, "it");
                            float f17 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str7, context2, "tuning_download_buffer_kb", str7);
                            return c1694m;
                        case 11:
                            String str8 = (String) obj4;
                            AbstractC3367j.m5100e(str8, "it");
                            float f18 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str8, context2, "test_duration", str8);
                            return c1694m;
                        case 12:
                            String str9 = (String) obj4;
                            AbstractC3367j.m5100e(str9, "it");
                            float f19 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str9, context2, "tuning_upload_buffer_kb", str9);
                            return c1694m;
                        case 13:
                            String str10 = (String) obj4;
                            AbstractC3367j.m5100e(str10, "it");
                            float f20 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str10, context2, "tuning_high_throughput_worker_budget", str10);
                            return c1694m;
                        case 14:
                            String str11 = (String) obj4;
                            AbstractC3367j.m5100e(str11, "it");
                            float f21 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str11, context2, "tuning_max_worker_threads", str11);
                            return c1694m;
                        case AbstractC3122c.f15762g /* 15 */:
                            String str12 = (String) obj4;
                            AbstractC3367j.m5100e(str12, "it");
                            float f22 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str12, context2, "single_local_port", str12);
                            return c1694m;
                        case 16:
                            Boolean bool5 = (Boolean) obj4;
                            boolean booleanValue5 = bool5.booleanValue();
                            float f23 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool5, context2, "root_queue_monitor_enabled", booleanValue5);
                            return c1694m;
                        case 17:
                            Boolean bool6 = (Boolean) obj4;
                            boolean booleanValue6 = bool6.booleanValue();
                            float f24 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool6, context2, "speed_test_ping_enabled", booleanValue6);
                            return c1694m;
                        case 18:
                            String str13 = (String) obj4;
                            AbstractC3367j.m5100e(str13, "it");
                            float f25 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str13, context2, "custom_dns_retry_count", str13);
                            return c1694m;
                        case 19:
                            String str14 = (String) obj4;
                            AbstractC3367j.m5100e(str14, "it");
                            float f26 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str14, context2, "speed_test_ping_packet_size", str14);
                            return c1694m;
                        case 20:
                            Boolean bool7 = (Boolean) obj4;
                            boolean booleanValue7 = bool7.booleanValue();
                            float f27 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool7, context2, "background_test", booleanValue7);
                            return c1694m;
                        case 21:
                            String str15 = (String) obj4;
                            AbstractC3367j.m5100e(str15, "it");
                            float f28 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str15, context2, "speed_test_ping_internal_mild_rtt", str15);
                            return c1694m;
                        case 22:
                            String str16 = (String) obj4;
                            AbstractC3367j.m5100e(str16, "it");
                            float f29 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str16, context2, "speed_test_ping_internal_severe_rtt", str16);
                            return c1694m;
                        case 23:
                            String str17 = (String) obj4;
                            AbstractC3367j.m5100e(str17, "it");
                            float f30 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str17, context2, "speed_test_ping_external_mild_rtt", str17);
                            return c1694m;
                        case 24:
                            String str18 = (String) obj4;
                            AbstractC3367j.m5100e(str18, "it");
                            float f31 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str18, context2, "speed_test_ping_external_severe_rtt", str18);
                            return c1694m;
                        case 25:
                            String str19 = (String) obj4;
                            AbstractC3367j.m5100e(str19, "it");
                            float f32 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str19, context2, "speed_test_ping_consecutive_threshold", str19);
                            return c1694m;
                        case 26:
                            Boolean bool8 = (Boolean) obj4;
                            boolean booleanValue8 = bool8.booleanValue();
                            float f33 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool8, context2, "cellular_air_congestion_enhanced", booleanValue8);
                            return c1694m;
                        case 27:
                            Boolean bool9 = (Boolean) obj4;
                            boolean booleanValue9 = bool9.booleanValue();
                            float f34 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m194u(interfaceC2425y0422, bool9, context2, "public_ip_display_enabled", booleanValue9);
                            return c1694m;
                        case 28:
                            String str20 = (String) obj4;
                            AbstractC3367j.m5100e(str20, "it");
                            float f35 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str20, context2, "public_ipv4_endpoint", str20);
                            return c1694m;
                        default:
                            String str21 = (String) obj4;
                            AbstractC3367j.m5100e(str21, "it");
                            float f36 = AbstractC1092mk.f5952h;
                            AbstractC0094y0.m195v(interfaceC2425y0422, str21, context2, "public_ipv6_endpoint", str21);
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(m3847O57);
        }
        InterfaceC3279c interfaceC3279c54 = (InterfaceC3279c) m3847O57;
        c2395p.m3890t();
        final InterfaceC2425y0 interfaceC2425y044 = this.f8429c0;
        boolean m1873w1 = AbstractC1092mk.m1873w1(interfaceC2425y044);
        c2395p.m3857Z(-1376026177);
        boolean m3870g47 = c2395p.m3870g(interfaceC2425y044) | c2395p.m3874i(context);
        InterfaceC2425y0 interfaceC2425y045 = this.f8430d0;
        boolean m3870g48 = m3870g47 | c2395p.m3870g(interfaceC2425y045);
        Object m3847O58 = c2395p.m3847O();
        final InterfaceC2425y0 interfaceC2425y046 = this.f8408N0;
        if (m3870g48 || m3847O58 == obj) {
            c3469p = c3469p7;
            interfaceC3279c3 = interfaceC3279c40;
            interfaceC2425y02 = interfaceC2425y045;
            Object c0318c = new C0318c(context, interfaceC2425y044, this.f8444k0, interfaceC2425y046, this.f8430d0);
            c2395p.m3877j0(c0318c);
            m3847O58 = c0318c;
        } else {
            interfaceC3279c3 = interfaceC3279c40;
            interfaceC2425y02 = interfaceC2425y045;
            c3469p = c3469p7;
        }
        InterfaceC3279c interfaceC3279c55 = (InterfaceC3279c) m3847O58;
        c2395p.m3890t();
        boolean m1868v1 = AbstractC1092mk.m1868v1(this.f8432e0);
        c2395p.m3857Z(-1376011412);
        boolean m3870g49 = c2395p.m3870g(this.f8432e0) | c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y044) | c2395p.m3870g(interfaceC2425y02);
        Object m3847O59 = c2395p.m3847O();
        if (m3870g49 || m3847O59 == obj) {
            c3469p2 = c3469p6;
            Object c1366vf = new C1366vf(context, this.f8432e0, interfaceC2425y044, this.f8444k0, interfaceC2425y046, this.f8430d0);
            interfaceC2425y044 = interfaceC2425y044;
            interfaceC2425y046 = interfaceC2425y046;
            c2395p.m3877j0(c1366vf);
            m3847O59 = c1366vf;
        } else {
            c3469p2 = c3469p6;
        }
        InterfaceC3279c interfaceC3279c56 = (InterfaceC3279c) m3847O59;
        c2395p.m3890t();
        c2395p.m3857Z(-1375991342);
        boolean m3874i10 = c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y044);
        Object m3847O60 = c2395p.m3847O();
        C3469p c3469p8 = this.f8444k0;
        if (m3874i10 || m3847O60 == obj) {
            c3469p3 = c3469p8;
            final int i43 = 0;
            obj2 = new InterfaceC3277a() { // from class: e5.si
                @Override // p150t5.InterfaceC3277a
                /* renamed from: a */
                public final Object mo52a() {
                    int i44 = i43;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y047 = interfaceC2425y046;
                    C3469p c3469p9 = c3469p3;
                    InterfaceC2425y0 interfaceC2425y048 = interfaceC2425y044;
                    Context context2 = context;
                    switch (i44) {
                        case 0:
                            C1247rk.f7375b.m2197k(context2);
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, ((Boolean) interfaceC2425y048.getValue()).booleanValue());
                            Toast.makeText(context2, "已重新申请 Android 蜂窝网络", 0).show();
                            return c1694m;
                        case 1:
                            C1247rk.f7384k.m2198l(context2, true);
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "已重新申请 Android WiFi 网络", 0).show();
                            return c1694m;
                        default:
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "接口列表已刷新", 0).show();
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(obj2);
        } else {
            obj2 = m3847O60;
            c3469p3 = c3469p8;
        }
        InterfaceC3277a interfaceC3277a7 = (InterfaceC3277a) obj2;
        c2395p.m3890t();
        c2395p.m3857Z(-1375981069);
        boolean m3874i11 = c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y044);
        Object m3847O61 = c2395p.m3847O();
        if (m3874i11 || m3847O61 == obj) {
            final int i44 = 1;
            Object obj4 = new InterfaceC3277a() { // from class: e5.si
                @Override // p150t5.InterfaceC3277a
                /* renamed from: a */
                public final Object mo52a() {
                    int i442 = i44;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y047 = interfaceC2425y046;
                    C3469p c3469p9 = c3469p3;
                    InterfaceC2425y0 interfaceC2425y048 = interfaceC2425y044;
                    Context context2 = context;
                    switch (i442) {
                        case 0:
                            C1247rk.f7375b.m2197k(context2);
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, ((Boolean) interfaceC2425y048.getValue()).booleanValue());
                            Toast.makeText(context2, "已重新申请 Android 蜂窝网络", 0).show();
                            return c1694m;
                        case 1:
                            C1247rk.f7384k.m2198l(context2, true);
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "已重新申请 Android WiFi 网络", 0).show();
                            return c1694m;
                        default:
                            AbstractC1092mk.m1742V0(context2, c3469p9, interfaceC2425y047, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "接口列表已刷新", 0).show();
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(obj4);
            m3847O61 = obj4;
        }
        InterfaceC3277a interfaceC3277a8 = (InterfaceC3277a) m3847O61;
        c2395p.m3890t();
        boolean m1641A1 = AbstractC1092mk.m1641A1(this.f8434f0);
        c2395p.m3857Z(-1375967918);
        boolean m3870g50 = c2395p.m3870g(this.f8434f0) | c2395p.m3874i(context);
        Object m3847O62 = c2395p.m3847O();
        if (m3870g50 || m3847O62 == obj) {
            m3847O62 = new C1307ti(context, this.f8434f0, 0);
            c2395p.m3877j0(m3847O62);
        }
        InterfaceC3279c interfaceC3279c57 = (InterfaceC3279c) m3847O62;
        c2395p.m3890t();
        boolean m1883y1 = AbstractC1092mk.m1883y1(this.f8436g0);
        c2395p.m3857Z(-1375957863);
        boolean m3870g51 = c2395p.m3870g(this.f8436g0) | c2395p.m3874i(context);
        Object m3847O63 = c2395p.m3847O();
        if (m3870g51 || m3847O63 == obj) {
            m3847O63 = new C1307ti(context, this.f8436g0, 1);
            c2395p.m3877j0(m3847O63);
        }
        InterfaceC3279c interfaceC3279c58 = (InterfaceC3279c) m3847O63;
        c2395p.m3890t();
        String m1888z1 = AbstractC1092mk.m1888z1(this.f8438h0);
        c2395p.m3857Z(-1375947394);
        boolean m3870g52 = c2395p.m3870g(this.f8438h0) | c2395p.m3874i(context);
        Object m3847O64 = c2395p.m3847O();
        if (m3870g52 || m3847O64 == obj) {
            m3847O64 = new C1307ti(context, this.f8438h0, 2);
            c2395p.m3877j0(m3847O64);
        }
        InterfaceC3279c interfaceC3279c59 = (InterfaceC3279c) m3847O64;
        c2395p.m3890t();
        boolean m1646B1 = AbstractC1092mk.m1646B1(this.f8440i0);
        c2395p.m3857Z(-1375936700);
        boolean m3870g53 = c2395p.m3870g(this.f8440i0) | c2395p.m3874i(context);
        InterfaceC2425y0 interfaceC2425y047 = this.f8442j0;
        boolean m3870g54 = m3870g53 | c2395p.m3870g(interfaceC2425y047);
        Object m3847O65 = c2395p.m3847O();
        if (m3870g54 || m3847O65 == obj) {
            interfaceC3277a = interfaceC3277a4;
            m3847O65 = new C0828e6(context, this.f8440i0, interfaceC2425y047, 5);
            c2395p.m3877j0(m3847O65);
        } else {
            interfaceC3277a = interfaceC3277a4;
        }
        InterfaceC3279c interfaceC3279c60 = (InterfaceC3279c) m3847O65;
        c2395p.m3890t();
        InterfaceC3279c interfaceC3279c61 = interfaceC3279c3;
        boolean m1878x1 = AbstractC1092mk.m1878x1(interfaceC2425y047);
        c2395p.m3857Z(-1375917759);
        boolean m3870g55 = c2395p.m3870g(interfaceC2425y047) | c2395p.m3874i(context);
        Object m3847O66 = c2395p.m3847O();
        if (m3870g55 || m3847O66 == obj) {
            m3847O66 = new C1307ti(context, interfaceC2425y047, 3);
            c2395p.m3877j0(m3847O66);
        }
        InterfaceC3279c interfaceC3279c62 = (InterfaceC3279c) m3847O66;
        c2395p.m3890t();
        boolean m1844q2 = AbstractC1092mk.m1844q2(interfaceC2425y02);
        c2395p.m3857Z(-1375908355);
        boolean m3870g56 = c2395p.m3870g(interfaceC2425y02);
        Object m3847O67 = c2395p.m3847O();
        if (m3870g56 || m3847O67 == obj) {
            m3847O67 = new C1478z3(interfaceC2425y02, 28);
            c2395p.m3877j0(m3847O67);
        }
        InterfaceC3279c interfaceC3279c63 = (InterfaceC3279c) m3847O67;
        c2395p.m3890t();
        boolean z9 = z7;
        C3469p c3469p9 = c3469p2;
        List m1672G2 = AbstractC1092mk.m1672G2(interfaceC2425y046);
        c2395p.m3857Z(-1375902337);
        boolean m3870g57 = c2395p.m3870g(interfaceC2425y044) | c2395p.m3874i(context);
        Object m3847O68 = c2395p.m3847O();
        if (m3870g57 || m3847O68 == obj) {
            m3847O68 = new C1009k(c3469p3, context, interfaceC2425y044, 7);
            c2395p.m3877j0(m3847O68);
        }
        InterfaceC3279c interfaceC3279c64 = (InterfaceC3279c) m3847O68;
        c2395p.m3890t();
        c2395p.m3857Z(-1375900000);
        boolean m3874i12 = c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y044);
        Object m3847O69 = c2395p.m3847O();
        if (m3874i12 || m3847O69 == obj) {
            final int i45 = 2;
            Object obj5 = new InterfaceC3277a() { // from class: e5.si
                @Override // p150t5.InterfaceC3277a
                /* renamed from: a */
                public final Object mo52a() {
                    int i442 = i45;
                    C1694m c1694m = C1694m.f10482a;
                    InterfaceC2425y0 interfaceC2425y0472 = interfaceC2425y046;
                    C3469p c3469p92 = c3469p3;
                    InterfaceC2425y0 interfaceC2425y048 = interfaceC2425y044;
                    Context context2 = context;
                    switch (i442) {
                        case 0:
                            C1247rk.f7375b.m2197k(context2);
                            float f7 = AbstractC1092mk.f5952h;
                            AbstractC1092mk.m1742V0(context2, c3469p92, interfaceC2425y0472, ((Boolean) interfaceC2425y048.getValue()).booleanValue());
                            Toast.makeText(context2, "已重新申请 Android 蜂窝网络", 0).show();
                            return c1694m;
                        case 1:
                            C1247rk.f7384k.m2198l(context2, true);
                            AbstractC1092mk.m1742V0(context2, c3469p92, interfaceC2425y0472, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "已重新申请 Android WiFi 网络", 0).show();
                            return c1694m;
                        default:
                            AbstractC1092mk.m1742V0(context2, c3469p92, interfaceC2425y0472, AbstractC1092mk.m1745W(interfaceC2425y048));
                            Toast.makeText(context2, "接口列表已刷新", 0).show();
                            return c1694m;
                    }
                }
            };
            c2395p.m3877j0(obj5);
            m3847O69 = obj5;
        }
        InterfaceC3277a interfaceC3277a9 = (InterfaceC3277a) m3847O69;
        c2395p.m3890t();
        boolean m1849r2 = AbstractC1092mk.m1849r2(this.f8446l0);
        c2395p.m3857Z(-1375890689);
        boolean m3870g58 = c2395p.m3870g(this.f8446l0) | c2395p.m3874i(context);
        Object m3847O70 = c2395p.m3847O();
        if (m3870g58 || m3847O70 == obj) {
            m3847O70 = new C1307ti(context, this.f8446l0, 6);
            c2395p.m3877j0(m3847O70);
        }
        InterfaceC3279c interfaceC3279c65 = (InterfaceC3279c) m3847O70;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y048 = this.f8448m0;
        String m1854s2 = AbstractC1092mk.m1854s2(interfaceC2425y048);
        InterfaceC2425y0 interfaceC2425y049 = this.f8452o0;
        String m1859t2 = AbstractC1092mk.m1859t2(interfaceC2425y049);
        InterfaceC2425y0 interfaceC2425y050 = this.f8450n0;
        String m1864u2 = AbstractC1092mk.m1864u2(interfaceC2425y050);
        c2395p.m3857Z(-1375878941);
        boolean m3870g59 = c2395p.m3870g(interfaceC2425y048) | c2395p.m3870g(interfaceC2425y050) | c2395p.m3874i(context);
        Object m3847O71 = c2395p.m3847O();
        if (m3870g59 || m3847O71 == obj) {
            m3847O71 = new C0828e6(context, interfaceC2425y048, interfaceC2425y050, 6);
            c2395p.m3877j0(m3847O71);
        }
        InterfaceC3279c interfaceC3279c66 = (InterfaceC3279c) m3847O71;
        boolean m196w5 = AbstractC0094y0.m196w(c2395p, -1375866337, interfaceC2425y049) | c2395p.m3870g(interfaceC2425y050) | c2395p.m3874i(context);
        Object m3847O72 = c2395p.m3847O();
        if (m196w5 || m3847O72 == obj) {
            m3847O72 = new C0828e6(context, interfaceC2425y049, interfaceC2425y050, 7);
            c2395p.m3877j0(m3847O72);
        }
        InterfaceC3279c interfaceC3279c67 = (InterfaceC3279c) m3847O72;
        boolean m196w6 = AbstractC0094y0.m196w(c2395p, -1375853720, interfaceC2425y050) | c2395p.m3870g(interfaceC2425y048) | c2395p.m3870g(interfaceC2425y049) | c2395p.m3874i(context);
        Object m3847O73 = c2395p.m3847O();
        if (m196w6 || m3847O73 == obj) {
            Object c0740bd3 = new C0740bd(context, interfaceC2425y050, interfaceC2425y048, interfaceC2425y049, 3);
            c2395p.m3877j0(c0740bd3);
            m3847O73 = c0740bd3;
        }
        InterfaceC3279c interfaceC3279c68 = (InterfaceC3279c) m3847O73;
        c2395p.m3890t();
        boolean m1869v2 = AbstractC1092mk.m1869v2(this.f8454p0);
        c2395p.m3857Z(-1375834143);
        boolean m3870g60 = c2395p.m3870g(this.f8454p0) | c2395p.m3874i(context);
        Object m3847O74 = c2395p.m3847O();
        if (m3870g60 || m3847O74 == obj) {
            m3847O74 = new C1307ti(context, this.f8454p0, 7);
            c2395p.m3877j0(m3847O74);
        }
        InterfaceC3279c interfaceC3279c69 = (InterfaceC3279c) m3847O74;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y051 = this.f8456q0;
        String m1874w2 = AbstractC1092mk.m1874w2(interfaceC2425y051);
        InterfaceC2425y0 interfaceC2425y052 = this.f8460s0;
        InterfaceC3277a interfaceC3277a10 = interfaceC3277a;
        String m1879x2 = AbstractC1092mk.m1879x2(interfaceC2425y052);
        InterfaceC2425y0 interfaceC2425y053 = this.f8458r0;
        String m1884y2 = AbstractC1092mk.m1884y2(interfaceC2425y053);
        c2395p.m3857Z(-1375822561);
        boolean m3870g61 = c2395p.m3870g(interfaceC2425y051) | c2395p.m3870g(interfaceC2425y053) | c2395p.m3874i(context);
        Object m3847O75 = c2395p.m3847O();
        if (m3870g61 || m3847O75 == obj) {
            m3847O75 = new C0828e6(context, interfaceC2425y051, interfaceC2425y053, 8);
            c2395p.m3877j0(m3847O75);
        }
        InterfaceC3279c interfaceC3279c70 = (InterfaceC3279c) m3847O75;
        boolean m196w7 = AbstractC0094y0.m196w(c2395p, -1375810117, interfaceC2425y052) | c2395p.m3870g(interfaceC2425y053) | c2395p.m3874i(context);
        Object m3847O76 = c2395p.m3847O();
        if (m196w7 || m3847O76 == obj) {
            m3847O76 = new C0828e6(context, interfaceC2425y052, interfaceC2425y053, 9);
            c2395p.m3877j0(m3847O76);
        }
        InterfaceC3279c interfaceC3279c71 = (InterfaceC3279c) m3847O76;
        boolean m196w8 = AbstractC0094y0.m196w(c2395p, -1375797662, interfaceC2425y053) | c2395p.m3870g(interfaceC2425y051) | c2395p.m3870g(interfaceC2425y052) | c2395p.m3874i(context);
        Object m3847O77 = c2395p.m3847O();
        if (m196w8 || m3847O77 == obj) {
            Object c0740bd4 = new C0740bd(context, interfaceC2425y053, interfaceC2425y051, interfaceC2425y052, 4);
            c2395p.m3877j0(c0740bd4);
            m3847O77 = c0740bd4;
        }
        InterfaceC3279c interfaceC3279c72 = (InterfaceC3279c) m3847O77;
        c2395p.m3890t();
        boolean m1647B2 = AbstractC1092mk.m1647B2(this.f8462t0);
        c2395p.m3857Z(-1375778859);
        boolean m3870g62 = c2395p.m3870g(this.f8462t0) | c2395p.m3874i(context);
        Object m3847O78 = c2395p.m3847O();
        if (m3870g62 || m3847O78 == obj) {
            m3847O78 = new C1307ti(context, this.f8462t0, 8);
            c2395p.m3877j0(m3847O78);
        }
        InterfaceC3279c interfaceC3279c73 = (InterfaceC3279c) m3847O78;
        c2395p.m3890t();
        InterfaceC2425y0 interfaceC2425y054 = this.f8466v0;
        boolean booleanValue3 = ((Boolean) interfaceC2425y054.getValue()).booleanValue();
        c2395p.m3857Z(-1375769899);
        boolean m3874i13 = c2395p.m3874i(this.f8464u0) | c2395p.m3870g(interfaceC2425y054) | c2395p.m3874i(context);
        InterfaceC2425y0 interfaceC2425y055 = this.f8468w0;
        boolean m3870g63 = m3874i13 | c2395p.m3870g(interfaceC2425y055);
        Object m3847O79 = c2395p.m3847O();
        if (m3870g63 || m3847O79 == obj) {
            m3847O79 = new C1338ui(this.f8464u0, context, interfaceC2425y054, interfaceC2425y055);
            c2395p.m3877j0(m3847O79);
        }
        InterfaceC3279c interfaceC3279c74 = (InterfaceC3279c) m3847O79;
        c2395p.m3890t();
        boolean m1889z2 = AbstractC1092mk.m1889z2(interfaceC2425y055);
        c2395p.m3857Z(-1375742425);
        boolean m3870g64 = c2395p.m3870g(interfaceC2425y055) | c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y054);
        Object m3847O80 = c2395p.m3847O();
        if (m3870g64 || m3847O80 == obj) {
            m3847O80 = new C0828e6(context, interfaceC2425y055, interfaceC2425y054, 10);
            c2395p.m3877j0(m3847O80);
        }
        InterfaceC3279c interfaceC3279c75 = (InterfaceC3279c) m3847O80;
        c2395p.m3890t();
        boolean m1642A2 = AbstractC1092mk.m1642A2(this.f8472y0);
        c2395p.m3857Z(-1375722069);
        boolean m3874i14 = c2395p.m3874i(context) | c2395p.m3870g(this.f8470x0) | c2395p.m3870g(this.f8472y0);
        Object m3847O81 = c2395p.m3847O();
        if (m3874i14 || m3847O81 == obj) {
            m3847O81 = new C0828e6(context, this.f8470x0, this.f8472y0, 11);
            c2395p.m3877j0(m3847O81);
        }
        InterfaceC3279c interfaceC3279c76 = (InterfaceC3279c) m3847O81;
        c2395p.m3890t();
        boolean booleanValue4 = ((Boolean) this.f8474z0.getValue()).booleanValue();
        c2395p.m3857Z(-1375681713);
        boolean m3870g65 = c2395p.m3870g(this.f8474z0) | c2395p.m3874i(context);
        Object m3847O82 = c2395p.m3847O();
        if (m3870g65 || m3847O82 == obj) {
            m3847O82 = new C0828e6(context, this.f8474z0, this.f8410O0, 12);
            c2395p.m3877j0(m3847O82);
        }
        InterfaceC3279c interfaceC3279c77 = (InterfaceC3279c) m3847O82;
        c2395p.m3890t();
        c2395p.m3857Z(-1375672817);
        boolean m3874i15 = c2395p.m3874i(context);
        Object m3847O83 = c2395p.m3847O();
        if (m3874i15 || m3847O83 == obj) {
            m3847O83 = new C1119ng(context, 1);
            c2395p.m3877j0(m3847O83);
        }
        InterfaceC3277a interfaceC3277a11 = (InterfaceC3277a) m3847O83;
        c2395p.m3890t();
        boolean m1657D2 = AbstractC1092mk.m1657D2(this.f8412P0);
        m1837p0 = AbstractC1092mk.m1837p0(this.f8414Q0);
        int m1667F2 = AbstractC1092mk.m1667F2(this.f8416R0);
        c2395p.m3857Z(-1375662855);
        boolean m3874i16 = c2395p.m3874i(this.f8382A0) | c2395p.m3874i(context) | c2395p.m3870g(this.f8384B0);
        Object m3847O84 = c2395p.m3847O();
        if (m3874i16 || m3847O84 == obj) {
            Object c1334ue = new C1334ue(this.f8382A0, this.f8412P0, this.f8414Q0, context, this.f8418S0, this.f8384B0);
            context = context;
            c2395p.m3877j0(c1334ue);
            m3847O84 = c1334ue;
        }
        InterfaceC3277a interfaceC3277a12 = (InterfaceC3277a) m3847O84;
        c2395p.m3890t();
        boolean booleanValue5 = ((Boolean) this.f8386C0.getValue()).booleanValue();
        c2395p.m3857Z(-1375657935);
        boolean m3870g66 = c2395p.m3870g(this.f8386C0) | c2395p.m3874i(context);
        Object m3847O85 = c2395p.m3847O();
        if (m3870g66 || m3847O85 == obj) {
            m3847O85 = new C1307ti(context, this.f8386C0, 11);
            c2395p.m3877j0(m3847O85);
        }
        InterfaceC3279c interfaceC3279c78 = (InterfaceC3279c) m3847O85;
        c2395p.m3890t();
        boolean booleanValue6 = ((Boolean) this.f8396H0.getValue()).booleanValue();
        c2395p.m3857Z(-1375641822);
        boolean m3874i17 = c2395p.m3874i(context) | c2395p.m3870g(this.f8396H0) | c2395p.m3870g(this.f8398I0) | c2395p.m3874i(this.f8400J0);
        Object m3847O86 = c2395p.m3847O();
        if (m3874i17 || m3847O86 == obj) {
            interfaceC3279c4 = interfaceC3279c63;
            m3847O86 = new C1338ui(context, this.f8400J0, this.f8396H0, this.f8398I0);
            c2395p.m3877j0(m3847O86);
        } else {
            interfaceC3279c4 = interfaceC3279c63;
        }
        InterfaceC3279c interfaceC3279c79 = (InterfaceC3279c) m3847O86;
        c2395p.m3890t();
        EnumC1436xn m1652C2 = AbstractC1092mk.m1652C2(this.f8402K0);
        c2395p.m3857Z(-1375609760);
        boolean m3870g67 = c2395p.m3870g(this.f8402K0) | c2395p.m3874i(context);
        Object m3847O87 = c2395p.m3847O();
        if (m3870g67 || m3847O87 == obj) {
            m3847O87 = new C1307ti(context, this.f8402K0, 12);
            c2395p.m3877j0(m3847O87);
        }
        InterfaceC3279c interfaceC3279c80 = (InterfaceC3279c) m3847O87;
        c2395p.m3890t();
        Set m1677H2 = AbstractC1092mk.m1677H2(this.f8420T0);
        c2395p.m3857Z(-1375601897);
        boolean m3874i18 = c2395p.m3874i(context);
        Object m3847O88 = c2395p.m3847O();
        if (m3874i18 || m3847O88 == obj) {
            m3847O88 = new C1245ri(context, this.f8420T0);
            c2395p.m3877j0(m3847O88);
        }
        InterfaceC3281e interfaceC3281e4 = (InterfaceC3281e) m3847O88;
        c2395p.m3890t();
        AbstractC0945hr.m1564H(m338i, m1858t1, interfaceC3279c, z9, interfaceC3279c2, m1848r1, interfaceC3279c7, z8, interfaceC3279c8, booleanValue, interfaceC3279c9, m1651C1, interfaceC3279c10, m1656D1, interfaceC3279c11, m1661E1, interfaceC3279c12, m1666F1, interfaceC3279c13, m1671G1, m1676H1, interfaceC3279c14, m1681I1, interfaceC3279c15, interfaceC3281e, interfaceC3277a2, interfaceC3279c16, m1686J1, interfaceC3279c17, m1691K1, interfaceC3282f, interfaceC3277a3, interfaceC3279c18, interfaceC3279c19, m1716P1, interfaceC3279c20, m1721Q1, interfaceC3279c21, m1696L1, interfaceC3279c22, m1701M1, interfaceC3279c23, m1706N1, interfaceC3279c24, m1711O1, interfaceC3279c25, m1726R1, interfaceC3279c26, m1731S1, interfaceC3279c27, m1735T1, interfaceC3279c28, m1739U1, interfaceC3279c29, m1743V1, interfaceC3279c30, m1747W1, interfaceC3279c31, m1751X1, interfaceC3279c32, m1755Y1, interfaceC3279c33, m1759Z1, interfaceC3279c34, m1764a2, interfaceC3279c35, m1769b2, interfaceC3279c36, m1774c2, interfaceC3279c37, m1779d2, interfaceC3279c38, m1777d0, interfaceC3279c39, m1789f2, interfaceC3279c61, interfaceC3277a10, arrayList, this.f8409O, interfaceC3279c41, m1794g2, interfaceC3279c42, c3469p9, interfaceC3281e2, interfaceC3277a5, interfaceC3279c43, c3469p, interfaceC3281e3, interfaceC3277a6, interfaceC3279c44, m1799h2, interfaceC3279c45, m1804i2, interfaceC3279c46, m1809j2, interfaceC3279c47, m1814k2, interfaceC3279c48, m1819l2, interfaceC3279c49, m1824m2, interfaceC3279c50, m1829n2, interfaceC3279c51, booleanValue2, interfaceC3279c52, m1834o2, interfaceC3279c53, m1839p2, interfaceC3279c54, m1873w1, interfaceC3279c55, m1868v1, interfaceC3279c56, interfaceC3277a7, interfaceC3277a8, m1641A1, interfaceC3279c57, m1883y1, interfaceC3279c58, m1888z1, interfaceC3279c59, m1646B1, interfaceC3279c60, m1878x1, interfaceC3279c62, m1844q2, interfaceC3279c4, m1672G2, this.f8444k0, interfaceC3279c64, interfaceC3277a9, m1849r2, interfaceC3279c65, m1854s2, m1859t2, m1864u2, interfaceC3279c66, interfaceC3279c67, interfaceC3279c68, m1869v2, interfaceC3279c69, m1874w2, m1879x2, m1884y2, interfaceC3279c70, interfaceC3279c71, interfaceC3279c72, m1647B2, interfaceC3279c73, booleanValue3, interfaceC3279c74, m1889z2, interfaceC3279c75, m1642A2, interfaceC3279c76, booleanValue4, interfaceC3279c77, interfaceC3277a11, m1657D2, m1837p0, m1667F2, interfaceC3277a12, booleanValue5, interfaceC3279c78, this.f8388D0, this.f8390E0, this.f8392F0, this.f8394G0, booleanValue6, interfaceC3279c79, m1652C2, interfaceC3279c80, m1677H2, interfaceC3281e4, (this.f8404L0.m1612d() || this.f8404L0.m1613e()) ? false : true, c2395p, 6);
    }
}
