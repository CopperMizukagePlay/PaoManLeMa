package p084l;

import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l.a */
/* loaded from: classes.dex */
public abstract class AbstractC2334a {

    /* renamed from: a */
    public static final int[] f13322a = new int[0];

    /* renamed from: b */
    public static final long[] f13323b = new long[0];

    /* renamed from: c */
    public static final Object[] f13324c = new Object[0];

    /* renamed from: a */
    public static final int m3710a(int i7, int i8, int[] iArr) {
        AbstractC3367j.m5100e(iArr, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 > i8) {
                i9 = i11 - 1;
            } else {
                return i11;
            }
        }
        return ~i10;
    }

    /* renamed from: b */
    public static final int m3711b(long[] jArr, int i7, long j6) {
        AbstractC3367j.m5100e(jArr, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j7 = jArr[i10];
            if (j7 < j6) {
                i9 = i10 + 1;
            } else if (j7 > j6) {
                i8 = i10 - 1;
            } else {
                return i10;
            }
        }
        return ~i9;
    }

    /* renamed from: c */
    public static final void m3712c(String str) {
        AbstractC3367j.m5100e(str, "message");
        throw new IllegalArgumentException(str);
    }

    /* renamed from: d */
    public static final void m3713d(String str) {
        AbstractC3367j.m5100e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: e */
    public static final void m3714e(String str) {
        AbstractC3367j.m5100e(str, "message");
        throw new NoSuchElementException(str);
    }
}
