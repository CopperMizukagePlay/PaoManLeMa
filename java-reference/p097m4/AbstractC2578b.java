package p097m4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m4.b */
/* loaded from: classes.dex */
public abstract class AbstractC2578b {

    /* renamed from: b */
    public static final char[] f13984b;

    /* renamed from: d */
    public static final char[] f13986d;

    /* renamed from: a */
    public static final char[] f13983a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    public static final char[] f13985c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    public static final char[] f13987e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f13984b = cArr;
        f13986d = cArr;
    }

    /* renamed from: a */
    public static void m4107a(int i7, int i8, int[] iArr) {
        int i9 = ((i7 << 8) + i8) - 1;
        int i10 = i9 / 1600;
        iArr[0] = i10;
        int i11 = i9 - (i10 * 1600);
        int i12 = i11 / 40;
        iArr[1] = i12;
        iArr[2] = i11 - (i12 * 40);
    }

    /* renamed from: b */
    public static int m4108b(int i7, int i8) {
        int i9 = i7 - (((i8 * 149) % 255) + 1);
        if (i9 >= 0) {
            return i9;
        }
        return i9 + 256;
    }
}
