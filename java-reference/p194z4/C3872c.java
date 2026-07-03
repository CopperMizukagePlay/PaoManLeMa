package p194z4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z4.c */
/* loaded from: classes.dex */
public final class C3872c {

    /* renamed from: c */
    public static final int[][] f18139c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final EnumC3871b f18140a;

    /* renamed from: b */
    public final byte f18141b;

    public C3872c(int i7) {
        int i8 = (i7 >> 3) & 3;
        if (i8 >= 0 && i8 < 4) {
            this.f18140a = EnumC3871b.f18136h[i8];
            this.f18141b = (byte) (i7 & 7);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C3872c m5894a(int i7, int i8) {
        int bitCount;
        int i9 = Integer.MAX_VALUE;
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            int[] iArr = f18139c[i11];
            int i12 = iArr[0];
            if (i12 != i7 && i12 != i8) {
                int bitCount2 = Integer.bitCount(i7 ^ i12);
                if (bitCount2 < i9) {
                    i10 = iArr[1];
                    i9 = bitCount2;
                }
                if (i7 != i8 && (bitCount = Integer.bitCount(i12 ^ i8)) < i9) {
                    i10 = iArr[1];
                    i9 = bitCount;
                }
            } else {
                return new C3872c(iArr[1]);
            }
        }
        if (i9 <= 3) {
            return new C3872c(i10);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3872c)) {
            return false;
        }
        C3872c c3872c = (C3872c) obj;
        if (this.f18140a != c3872c.f18140a || this.f18141b != c3872c.f18141b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f18140a.ordinal() << 3) | this.f18141b;
    }
}
