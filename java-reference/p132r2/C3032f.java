package p132r2;

import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.f */
/* loaded from: classes.dex */
public final class C3032f {

    /* renamed from: b */
    public static final float f15592b;

    /* renamed from: c */
    public static final float f15593c;

    /* renamed from: d */
    public static final float f15594d;

    /* renamed from: a */
    public final float f15595a;

    static {
        m4721a(0.0f);
        m4721a(0.5f);
        f15592b = 0.5f;
        m4721a(-1.0f);
        f15593c = -1.0f;
        m4721a(1.0f);
        f15594d = 1.0f;
    }

    /* renamed from: a */
    public static void m4721a(float f7) {
        if ((0.0f <= f7 && f7 <= 1.0f) || f7 == -1.0f) {
            return;
        }
        AbstractC2550a.m4079b("topRatio should be in [0..1] range or -1");
    }

    /* renamed from: b */
    public static String m4722b(float f7) {
        if (f7 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f7 == f15592b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f7 == f15593c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f7 == f15594d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3032f) {
            if (Float.compare(this.f15595a, ((C3032f) obj).f15595a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15595a);
    }

    public final String toString() {
        return m4722b(this.f15595a);
    }
}
