package p085l0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.c2 */
/* loaded from: classes.dex */
public abstract class AbstractC2346c2 {
    /* renamed from: a */
    public static final int m3731a(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 3];
    }

    /* renamed from: b */
    public static final int m3732b(ArrayList arrayList, int i7, int i8) {
        int m3735e = m3735e(arrayList, i7, i8);
        if (m3735e >= 0) {
            return m3735e;
        }
        return -(m3735e + 1);
    }

    /* renamed from: c */
    public static final int m3733c(int[] iArr, int i7) {
        int i8 = i7 * 5;
        return Integer.bitCount(iArr[i8 + 1] >> 28) + iArr[i8 + 4];
    }

    /* renamed from: d */
    public static final void m3734d(int i7, int i8, int[] iArr) {
        if (i8 >= 0) {
        }
        int i9 = (i7 * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    /* renamed from: e */
    public static final int m3735e(ArrayList arrayList, int i7, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int i11 = ((C2335a) arrayList.get(i10)).f13325a;
            if (i11 < 0) {
                i11 += i8;
            }
            int m5101f = AbstractC3367j.m5101f(i11, i7);
            if (m5101f < 0) {
                i9 = i10 + 1;
            } else if (m5101f > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i9 + 1);
    }

    /* renamed from: f */
    public static final void m3736f() {
        throw new ConcurrentModificationException();
    }
}
