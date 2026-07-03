package p042f1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1515b {

    /* renamed from: a */
    public static final long f10007a;

    /* renamed from: b */
    public static final long f10008b;

    /* renamed from: c */
    public static final long f10009c;

    /* renamed from: d */
    public static final long f10010d;

    /* renamed from: e */
    public static final /* synthetic */ int f10011e = 0;

    static {
        long j6 = 3;
        long j7 = j6 << 32;
        f10007a = (0 & 4294967295L) | j7;
        f10008b = (1 & 4294967295L) | j7;
        f10009c = j7 | (2 & 4294967295L);
        f10010d = (j6 & 4294967295L) | (4 << 32);
    }

    /* renamed from: a */
    public static final boolean m2441a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m2442b(long j6) {
        if (m2441a(j6, f10007a)) {
            return "Rgb";
        }
        if (m2441a(j6, f10008b)) {
            return "Xyz";
        }
        if (m2441a(j6, f10009c)) {
            return "Lab";
        }
        if (m2441a(j6, f10010d)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
