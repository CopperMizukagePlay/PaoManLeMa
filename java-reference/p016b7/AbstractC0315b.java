package p016b7;

import p006a7.C0141x;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b7.b */
/* loaded from: classes.dex */
public abstract class AbstractC0315b {

    /* renamed from: a */
    public static final char[] f1111a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m671a(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    /* renamed from: b */
    public static final int m672b(C0141x c0141x, int i7) {
        int i8;
        int[] iArr = c0141x.f566j;
        int i9 = i7 + 1;
        int length = c0141x.f565i.length;
        AbstractC3367j.m5100e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 < i9) {
                    i11 = i8 + 1;
                } else {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        if (i8 >= 0) {
            return i8;
        }
        return ~i8;
    }
}
