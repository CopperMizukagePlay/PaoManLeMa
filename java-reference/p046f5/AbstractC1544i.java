package p046f5;

import android.R;
import android.content.Context;
import android.os.Build;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p039e5.C1415x2;
import p063i0.AbstractC1965o2;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1877d7;
import p063i0.C1995s0;
import p063i0.C2003t0;
import p085l0.C2395p;
import p085l0.C2405r1;
import p145t0.C3173d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f5.i */
/* loaded from: classes.dex */
public abstract class AbstractC1544i {

    /* renamed from: a */
    public static final C2003t0 f10125a = AbstractC2019v0.m3194c(AbstractC1543h.f10119a, 0, 0, 0, 0, AbstractC1543h.f10120b, 0, 0, 0, AbstractC1543h.f10121c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    /* renamed from: b */
    public static final C2003t0 f10126b = AbstractC2019v0.m3197f(AbstractC1543h.f10122d, 0, 0, 0, 0, AbstractC1543h.f10123e, 0, 0, 0, AbstractC1543h.f10124f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    /* renamed from: a */
    public static final void m2475a(boolean z7, AbstractC1540e abstractC1540e, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z8;
        C2003t0 c2003t0;
        float f7;
        long j6;
        C2003t0 c2003t02;
        c2395p.m3859a0(315309981);
        if (c2395p.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i7 | i8;
        if (c2395p.m3870g(abstractC1540e)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        if (((i10 | i9) & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            if ((abstractC1540e instanceof C1538c) && Build.VERSION.SDK_INT >= 31) {
                z8 = true;
            } else {
                z8 = false;
            }
            c2395p.m3857Z(1925612381);
            if (z8) {
                Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
                C1995s0 c1995s0 = C1995s0.f11740a;
                if (z7) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        long m3174a = c1995s0.m3174a(context, R.color.car_cyan_50);
                        long m3174a2 = c1995s0.m3174a(context, R.color.car_cyan_500);
                        long m3174a3 = c1995s0.m3174a(context, R.color.car_cyan_300);
                        long m3174a4 = c1995s0.m3174a(context, R.color.car_cyan_400);
                        long m3174a5 = c1995s0.m3174a(context, R.color.car_action1_dark);
                        long m3174a6 = c1995s0.m3174a(context, R.color.car_cyan_800);
                        long m3174a7 = c1995s0.m3174a(context, R.color.car_cyan_900);
                        long m3174a8 = c1995s0.m3174a(context, R.color.car_cyan_600);
                        long m3174a9 = c1995s0.m3174a(context, R.color.car_cyan_700);
                        long m3174a10 = c1995s0.m3174a(context, R.color.car_dark_blue_grey_700);
                        long m3174a11 = c1995s0.m3174a(context, R.color.car_dark_blue_grey_800);
                        long m3174a12 = c1995s0.m3174a(context, R.color.car_dark_blue_grey_1000);
                        long m3174a13 = c1995s0.m3174a(context, R.color.car_dark_blue_grey_600);
                        long m3174a14 = c1995s0.m3174a(context, R.color.car_dark_blue_grey_900);
                        long m3174a15 = c1995s0.m3174a(context, R.color.car_green_100);
                        long m3174a16 = c1995s0.m3174a(context, R.color.car_green_200);
                        long m3174a17 = c1995s0.m3174a(context, R.color.car_green_300);
                        long m3174a18 = c1995s0.m3174a(context, R.color.car_grey_100);
                        long m3174a19 = c1995s0.m3174a(context, R.color.car_grey_1000);
                        long m3174a20 = c1995s0.m3174a(context, R.color.car_blue_900);
                        long m3174a21 = c1995s0.m3174a(context, R.color.car_blue_grey_800);
                        long m3174a22 = c1995s0.m3174a(context, R.color.car_grey_200);
                        long m3174a23 = c1995s0.m3174a(context, R.color.car_keyboard_divider_line);
                        long m3174a24 = c1995s0.m3174a(context, R.color.car_green_800);
                        long m3174a25 = c1995s0.m3174a(context, R.color.car_green_900);
                        c2003t0 = AbstractC2019v0.m3194c(m3174a, m3174a2, m3174a3, m3174a4, m3174a5, m3174a6, m3174a7, m3174a8, m3174a9, m3174a10, m3174a11, m3174a12, m3174a13, m3174a14, m3174a15, m3174a16, m3174a17, m3174a18, m3174a19, c1995s0.m3174a(context, R.color.car_cyan_50), m3174a20, m3174a21, m3174a22, m3174a23, 0L, m3174a24, c1995s0.m3174a(context, R.color.car_green_500), c1995s0.m3174a(context, R.color.car_green_600), c1995s0.m3174a(context, R.color.car_green_700), c1995s0.m3174a(context, R.color.car_green_400), c1995s0.m3174a(context, R.color.car_green_50), m3174a25, 331350016, 0);
                    } else {
                        C1877d7 m3169j = AbstractC1991r4.m3169j(context);
                        long j7 = m3169j.f11123x;
                        long j8 = m3169j.f11084A;
                        long j9 = m3169j.f11125z;
                        long j10 = m3169j.f11122w;
                        long j11 = m3169j.f11124y;
                        long j12 = m3169j.f11088E;
                        long j13 = m3169j.f11091H;
                        long j14 = m3169j.f11090G;
                        long j15 = m3169j.f11087D;
                        long j16 = m3169j.f11095L;
                        long j17 = m3169j.f11098O;
                        long j18 = m3169j.f11097N;
                        long j19 = m3169j.f11094K;
                        long j20 = m3169j.f11118s;
                        long j21 = m3169j.f11106g;
                        long j22 = m3169j.f11111l;
                        c2003t0 = AbstractC2019v0.m3194c(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j20, j21, j22, m3169j.f11108i, j7, j21, m3169j.f11114o, m3169j.f11109j, j22, m3169j.f11120u, m3169j.f11112m, m3169j.f11116q, m3169j.f11115p, m3169j.f11113n, m3169j.f11117r, m3169j.f11119t, j20, 62914560, 0);
                    }
                } else if (Build.VERSION.SDK_INT >= 34) {
                    long m3174a26 = c1995s0.m3174a(context, R.color.car_action1_dark);
                    long m3174a27 = c1995s0.m3174a(context, R.color.car_action1_light);
                    long m3174a28 = c1995s0.m3174a(context, R.color.car_accent_light);
                    long m3174a29 = c1995s0.m3174a(context, R.color.car_action1);
                    long m3174a30 = c1995s0.m3174a(context, R.color.car_cyan_50);
                    long m3174a31 = c1995s0.m3174a(context, R.color.car_blue_200);
                    long m3174a32 = c1995s0.m3174a(context, R.color.car_blue_300);
                    long m3174a33 = c1995s0.m3174a(context, R.color.car_background);
                    long m3174a34 = c1995s0.m3174a(context, R.color.car_blue_100);
                    long m3174a35 = c1995s0.m3174a(context, R.color.car_blue_500);
                    long m3174a36 = c1995s0.m3174a(context, R.color.car_blue_600);
                    long m3174a37 = c1995s0.m3174a(context, R.color.car_blue_400);
                    long m3174a38 = c1995s0.m3174a(context, R.color.car_blue_50);
                    long m3174a39 = c1995s0.m3174a(context, R.color.car_blue_700);
                    long m3174a40 = c1995s0.m3174a(context, R.color.car_blue_800);
                    long m3174a41 = c1995s0.m3174a(context, R.color.car_blue_900);
                    long m3174a42 = c1995s0.m3174a(context, R.color.car_blue_grey_800);
                    long m3174a43 = c1995s0.m3174a(context, R.color.car_body3);
                    long m3174a44 = c1995s0.m3174a(context, R.color.car_body3_dark);
                    long m3174a45 = c1995s0.m3174a(context, R.color.car_green_200);
                    long m3174a46 = c1995s0.m3174a(context, R.color.car_green_300);
                    long m3174a47 = c1995s0.m3174a(context, R.color.car_body3_light);
                    long m3174a48 = c1995s0.m3174a(context, R.color.car_highlight_light);
                    long m3174a49 = c1995s0.m3174a(context, R.color.car_body2_dark);
                    long m3174a50 = c1995s0.m3174a(context, R.color.car_body2_light);
                    c2003t0 = AbstractC2019v0.m3197f(m3174a26, m3174a27, m3174a28, m3174a29, m3174a30, m3174a31, m3174a32, m3174a33, m3174a34, m3174a35, m3174a36, m3174a37, m3174a38, m3174a39, m3174a40, m3174a41, m3174a42, m3174a43, m3174a44, c1995s0.m3174a(context, R.color.car_action1_dark), m3174a45, m3174a46, m3174a47, m3174a48, 0L, m3174a49, c1995s0.m3174a(context, R.color.car_body1_dark), c1995s0.m3174a(context, R.color.car_body1_light), c1995s0.m3174a(context, R.color.car_body2), c1995s0.m3174a(context, R.color.car_blue_grey_900), c1995s0.m3174a(context, R.color.car_body1), m3174a50, 331350016, 0);
                } else {
                    C1877d7 m3169j2 = AbstractC1991r4.m3169j(context);
                    long j23 = m3169j2.f11124y;
                    long j24 = m3169j2.f11121v;
                    long j25 = m3169j2.f11122w;
                    long j26 = m3169j2.f11085B;
                    long j27 = m3169j2.f11123x;
                    long j28 = m3169j2.f11089F;
                    long j29 = m3169j2.f11086C;
                    long j30 = m3169j2.f11087D;
                    long j31 = m3169j2.f11092I;
                    long j32 = m3169j2.f11096M;
                    long j33 = m3169j2.f11093J;
                    long j34 = m3169j2.f11094K;
                    long j35 = m3169j2.f11099P;
                    long j36 = m3169j2.f11101b;
                    long j37 = m3169j2.f11117r;
                    long j38 = m3169j2.f11106g;
                    c2003t0 = AbstractC2019v0.m3197f(j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j36, j37, j38, m3169j2.f11111l, j23, m3169j2.f11114o, m3169j2.f11103d, m3169j2.f11110k, m3169j2.f11108i, m3169j2.f11120u, j36, m3169j2.f11104e, m3169j2.f11105f, j38, m3169j2.f11102c, m3169j2.f11100a, m3169j2.f11107h, 62914560, 0);
                }
            } else if (z7) {
                c2003t0 = f10125a;
            } else {
                c2003t0 = f10126b;
            }
            c2395p.m3888r(false);
            long mo2472b = abstractC1540e.mo2472b(z7);
            if (C0677s.m1454c(mo2472b, C0677s.f2209g)) {
                c2003t02 = c2003t0;
            } else {
                if (z7) {
                    f7 = 0.24f;
                } else {
                    f7 = 0.12f;
                }
                long m1453b = C0677s.m1453b(f7, mo2472b);
                if (AbstractC0659i0.m1416p(mo2472b) > 0.5f) {
                    j6 = AbstractC0659i0.m1404d(4280032031L);
                } else {
                    j6 = C0677s.f2205c;
                }
                c2003t02 = new C2003t0(mo2472b, j6, m1453b, c2003t0.f11810d, c2003t0.f11811e, c2003t0.f11812f, c2003t0.f11813g, c2003t0.f11814h, c2003t0.f11815i, c2003t0.f11816j, c2003t0.f11817k, c2003t0.f11818l, c2003t0.f11819m, c2003t0.f11820n, c2003t0.f11821o, c2003t0.f11822p, c2003t0.f11823q, c2003t0.f11824r, c2003t0.f11825s, c2003t0.f11826t, c2003t0.f11827u, c2003t0.f11828v, c2003t0.f11829w, c2003t0.f11830x, c2003t0.f11831y, c2003t0.f11832z, c2003t0.f11783A, c2003t0.f11784B, c2003t0.f11785C, c2003t0.f11786D, c2003t0.f11787E, c2003t0.f11788F, c2003t0.f11789G, c2003t0.f11790H, c2003t0.f11791I, c2003t0.f11792J);
            }
            AbstractC1965o2.m3148a(c2003t02, null, AbstractC1545j.f10127a, c3173d, c2395p, 3456);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1415x2(z7, abstractC1540e, c3173d, i7, 5);
        }
    }
}
