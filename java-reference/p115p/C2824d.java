package p115p;

import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p171w2.InterfaceC3774x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C2824d implements InterfaceC3774x {

    /* renamed from: a */
    public final long f14885a;

    public C2824d(long j6) {
        this.f14885a = j6;
    }

    @Override // p171w2.InterfaceC3774x
    /* renamed from: a */
    public final long mo1252a(C3101k c3101k, long j6, EnumC3103m enumC3103m, long j7) {
        boolean z7;
        int i7 = c3101k.f15698a;
        long j8 = this.f14885a;
        int i8 = i7 + ((int) (j8 >> 32));
        int i9 = (int) (j7 >> 32);
        int i10 = (int) (j6 >> 32);
        if (enumC3103m == EnumC3103m.f15703e) {
            z7 = true;
        } else {
            z7 = false;
        }
        return AbstractC2064e.m3234d(AbstractC2067b.m3280e(i8, i9, i10, z7), AbstractC2067b.m3280e(c3101k.f15699b + ((int) (j8 & 4294967295L)), (int) (j7 & 4294967295L), (int) (j6 & 4294967295L), true));
    }
}
