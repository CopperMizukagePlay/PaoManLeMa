package p067i4;

import p022c4.AbstractC0398h;
import p022c4.C0400j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.g */
/* loaded from: classes.dex */
public final class C2074g {

    /* renamed from: e */
    public static final byte[] f12280e = new byte[0];

    /* renamed from: a */
    public final AbstractC0398h f12281a;

    /* renamed from: b */
    public byte[] f12282b = f12280e;

    /* renamed from: c */
    public final int[] f12283c = new int[32];

    /* renamed from: d */
    public C2069b f12284d;

    public C2074g(AbstractC0398h abstractC0398h) {
        this.f12281a = abstractC0398h;
    }

    /* renamed from: a */
    public static int m3351a(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 > i7) {
                i9 = i10;
                i7 = i11;
            }
            if (i11 > i8) {
                i8 = i11;
            }
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 - i9;
            int i16 = iArr[i14] * i15 * i15;
            if (i16 > i13) {
                i12 = i14;
                i13 = i16;
            }
        }
        if (i9 <= i12) {
            int i17 = i9;
            i9 = i12;
            i12 = i17;
        }
        if (i9 - i12 > length / 16) {
            int i18 = i9 - 1;
            int i19 = -1;
            int i20 = i18;
            while (i18 > i12) {
                int i21 = i18 - i12;
                int i22 = (i8 - iArr[i18]) * (i9 - i18) * i21 * i21;
                if (i22 > i19) {
                    i20 = i18;
                    i19 = i22;
                }
                i18--;
            }
            return i20 << 3;
        }
        throw C0400j.m878a();
    }
}
