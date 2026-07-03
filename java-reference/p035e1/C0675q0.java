package p035e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.q0 */
/* loaded from: classes.dex */
public final class C0675q0 {

    /* renamed from: b */
    public static final long f2200b = AbstractC0659i0.m1408h(0.5f, 0.5f);

    /* renamed from: c */
    public static final /* synthetic */ int f2201c = 0;

    /* renamed from: a */
    public final long f2202a;

    /* renamed from: a */
    public static final float m1449a(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: b */
    public static final float m1450b(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: c */
    public static String m1451c(long j6) {
        return "TransformOrigin(packedValue=" + j6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0675q0) {
            if (this.f2202a != ((C0675q0) obj).f2202a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2202a);
    }

    public final String toString() {
        return m1451c(this.f2202a);
    }
}
