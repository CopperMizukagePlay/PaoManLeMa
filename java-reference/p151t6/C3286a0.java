package p151t6;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.a0 */
/* loaded from: classes.dex */
public final class C3286a0 {

    /* renamed from: a */
    public int f16130a;

    /* renamed from: b */
    public final int[] f16131b = new int[10];

    /* renamed from: a */
    public final int m4991a() {
        if ((this.f16130a & 128) != 0) {
            return this.f16131b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m4992b(C3286a0 c3286a0) {
        AbstractC3367j.m5100e(c3286a0, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            boolean z7 = true;
            if (((1 << i7) & c3286a0.f16130a) == 0) {
                z7 = false;
            }
            if (z7) {
                m4993c(i7, c3286a0.f16131b[i7]);
            }
        }
    }

    /* renamed from: c */
    public final void m4993c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f16131b;
            if (i7 < iArr.length) {
                this.f16130a = (1 << i7) | this.f16130a;
                iArr[i7] = i8;
            }
        }
    }
}
