package p194z4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z4.d */
/* loaded from: classes.dex */
public enum EnumC3873d {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: e */
    public final int[] f18153e;

    /* renamed from: f */
    public final int f18154f;

    EnumC3873d(int[] iArr, int i7) {
        this.f18153e = iArr;
        this.f18154f = i7;
    }

    /* renamed from: a */
    public final int m5895a(C3875f c3875f) {
        char c7;
        int i7 = c3875f.f18157a;
        if (i7 <= 9) {
            c7 = 0;
        } else if (i7 <= 26) {
            c7 = 1;
        } else {
            c7 = 2;
        }
        return this.f18153e[c7];
    }
}
