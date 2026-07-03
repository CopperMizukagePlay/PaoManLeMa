package p195z5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.a */
/* loaded from: classes.dex */
public final class C3876a {

    /* renamed from: a */
    public final float f18161a;

    /* renamed from: b */
    public final float f18162b;

    public C3876a(float f7, float f8) {
        this.f18161a = f7;
        this.f18162b = f8;
    }

    /* renamed from: a */
    public static boolean m5899a(Float f7, Float f8) {
        if (f7.floatValue() <= f8.floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3876a) {
            float f7 = this.f18161a;
            float f8 = this.f18162b;
            if (f7 > f8) {
                C3876a c3876a = (C3876a) obj;
                if (c3876a.f18161a > c3876a.f18162b) {
                    return true;
                }
            }
            C3876a c3876a2 = (C3876a) obj;
            if (f7 == c3876a2.f18161a && f8 == c3876a2.f18162b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f7 = this.f18161a;
        float f8 = this.f18162b;
        if (f7 > f8) {
            return -1;
        }
        return Float.hashCode(f8) + (Float.hashCode(f7) * 31);
    }

    public final String toString() {
        return this.f18161a + ".." + this.f18162b;
    }
}
