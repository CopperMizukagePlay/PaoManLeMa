package p026d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0456a {

    /* renamed from: a */
    public static final long f1572a = m994a(Float.NaN, Float.NaN);

    /* renamed from: b */
    public static final /* synthetic */ int f1573b = 0;

    /* renamed from: a */
    public static long m994a(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }
}
