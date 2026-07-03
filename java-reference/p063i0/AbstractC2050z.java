package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import p035e1.C0677s;
import p078k0.AbstractC2241j;
import p078k0.AbstractC2250s;
import p085l0.C2395p;
import p144t.C3137j0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.z */
/* loaded from: classes.dex */
public abstract class AbstractC2050z {

    /* renamed from: a */
    public static final C3137j0 f12193a;

    /* renamed from: b */
    public static final C3137j0 f12194b;

    /* renamed from: c */
    public static final float f12195c;

    /* renamed from: d */
    public static final float f12196d;

    static {
        float f7 = 24;
        float f8 = 8;
        f12193a = new C3137j0(f7, f8, f7, f8);
        float f9 = 16;
        AbstractC0154b.m331b(f9, f8, f7, f8);
        float f10 = 12;
        f12194b = new C3137j0(f10, f8, f10, f8);
        AbstractC0154b.m331b(f10, f8, f9, f8);
        f12195c = 58;
        f12196d = 40;
        float f11 = AbstractC2241j.f12965a;
    }

    /* renamed from: a */
    public static C2042y m3214a(long j6, long j7, C2395p c2395p, int i7) {
        if ((i7 & 2) != 0) {
            j7 = C0677s.f2209g;
        }
        long j8 = j7;
        long j9 = C0677s.f2209g;
        return m3215b((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).m3207a(j6, j8, j9, j9);
    }

    /* renamed from: b */
    public static C2042y m3215b(C2003t0 c2003t0) {
        C2042y c2042y = c2003t0.f11793K;
        if (c2042y == null) {
            float f7 = AbstractC2241j.f12965a;
            C2042y c2042y2 = new C2042y(AbstractC2019v0.m3195d(c2003t0, 26), AbstractC2019v0.m3195d(c2003t0, AbstractC2241j.f12972h), C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, AbstractC2241j.f12967c)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, AbstractC2241j.f12969e)));
            c2003t0.f11793K = c2042y2;
            return c2042y2;
        }
        return c2042y;
    }

    /* renamed from: c */
    public static C2042y m3216c(C2003t0 c2003t0) {
        C2042y c2042y = c2003t0.f11795M;
        if (c2042y == null) {
            long j6 = C0677s.f2208f;
            float f7 = AbstractC2250s.f13014a;
            C2042y c2042y2 = new C2042y(j6, AbstractC2019v0.m3195d(c2003t0, 26), j6, C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)));
            c2003t0.f11795M = c2042y2;
            return c2042y2;
        }
        return c2042y;
    }

    /* renamed from: d */
    public static C2042y m3217d(long j6, long j7, long j8, long j9, C2395p c2395p, int i7) {
        long j10;
        long j11;
        if ((i7 & 1) != 0) {
            j6 = C0677s.f2209g;
        }
        long j12 = j6;
        if ((i7 & 4) != 0) {
            j10 = C0677s.f2209g;
        } else {
            j10 = j8;
        }
        if ((i7 & 8) != 0) {
            j11 = C0677s.f2209g;
        } else {
            j11 = j9;
        }
        return m3216c((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).m3207a(j12, j7, j10, j11);
    }
}
