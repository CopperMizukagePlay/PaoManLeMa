package p146t1;

import p077k.C2218t0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.q0 */
/* loaded from: classes.dex */
public final class C3229q0 implements InterfaceC3206h1 {

    /* renamed from: f */
    public static final C3229q0 f16034f = new C3229q0(0);

    /* renamed from: e */
    public final /* synthetic */ int f16035e;

    public /* synthetic */ C3229q0(int i7) {
        this.f16035e = i7;
    }

    /* renamed from: a */
    public long m4947a(long j6, long j7) {
        switch (this.f16035e) {
            case 1:
                float m4892c = AbstractC3191c1.m4892c(j6, j7);
                long floatToRawIntBits = (Float.floatToRawIntBits(m4892c) << 32) | (Float.floatToRawIntBits(m4892c) & 4294967295L);
                int i7 = AbstractC3185a1.f15915a;
                return floatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j6 >> 32)) <= Float.intBitsToFloat((int) (j7 >> 32)) && Float.intBitsToFloat((int) (j6 & 4294967295L)) <= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i8 = AbstractC3185a1.f15915a;
                    return floatToRawIntBits2;
                }
                float m4892c2 = AbstractC3191c1.m4892c(j6, j7);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(m4892c2) << 32) | (Float.floatToRawIntBits(m4892c2) & 4294967295L);
                int i9 = AbstractC3185a1.f15915a;
                return floatToRawIntBits3;
        }
    }

    @Override // p146t1.InterfaceC3206h1
    /* renamed from: o */
    public void mo149o(C2218t0 c2218t0) {
        c2218t0.clear();
    }

    @Override // p146t1.InterfaceC3206h1
    /* renamed from: p */
    public boolean mo150p(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f16035e) {
            case 3:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
