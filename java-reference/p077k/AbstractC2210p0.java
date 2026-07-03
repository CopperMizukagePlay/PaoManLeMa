package p077k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC2210p0 {

    /* renamed from: a */
    public static final long[] f12722a = {-9187201950435737345L, -1};

    static {
        new C2194h0(0);
    }

    /* renamed from: a */
    public static final int m3618a(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    /* renamed from: b */
    public static final int m3619b(int i7) {
        if (i7 == 0) {
            return 6;
        }
        return (i7 * 2) + 1;
    }

    /* renamed from: c */
    public static final int m3620c(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    /* renamed from: d */
    public static final int m3621d(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
