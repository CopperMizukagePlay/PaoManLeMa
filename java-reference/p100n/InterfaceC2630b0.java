package p100n;

import p096m3.C2572v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.b0 */
/* loaded from: classes.dex */
public interface InterfaceC2630b0 extends InterfaceC2656k {
    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    default InterfaceC2670o1 mo4196a(C2664m1 c2664m1) {
        return new C2572v(this);
    }

    /* renamed from: b */
    float mo4197b(long j6, float f7, float f8, float f9);

    /* renamed from: c */
    float mo4198c(long j6, float f7, float f8, float f9);

    /* renamed from: d */
    long mo4199d(float f7, float f8, float f9);

    /* renamed from: e */
    default float mo4200e(float f7, float f8, float f9) {
        return mo4198c(mo4199d(f7, f8, f9), f7, f8, f9);
    }
}
