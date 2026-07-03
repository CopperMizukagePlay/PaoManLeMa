package p072j1;

import p001a0.C0019e1;
import p023c5.C0427s;
import p035e1.C0666m;
import p049g1.C1568b;
import p140s2.EnumC3103m;
import p158u5.AbstractC3367j;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j1.b */
/* loaded from: classes.dex */
public abstract class AbstractC2163b {

    /* renamed from: a */
    public C0427s f12565a;

    /* renamed from: b */
    public C0666m f12566b;

    /* renamed from: c */
    public float f12567c = 1.0f;

    /* renamed from: d */
    public EnumC3103m f12568d = EnumC3103m.f15703e;

    /* renamed from: a */
    public abstract void mo3502a(float f7);

    /* renamed from: b */
    public abstract void mo3503b(C0666m c0666m);

    /* renamed from: c */
    public final void m3506c(C3508i0 c3508i0, long j6, float f7, C0666m c0666m) {
        C1568b c1568b = c3508i0.f16933e;
        if (this.f12567c != f7) {
            mo3502a(f7);
            this.f12567c = f7;
        }
        if (!AbstractC3367j.m5096a(this.f12566b, c0666m)) {
            mo3503b(c0666m);
            this.f12566b = c0666m;
        }
        EnumC3103m layoutDirection = c3508i0.getLayoutDirection();
        if (this.f12568d != layoutDirection) {
            this.f12568d = layoutDirection;
        }
        int i7 = (int) (j6 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (c1568b.mo2546c() >> 32)) - Float.intBitsToFloat(i7);
        int i8 = (int) (j6 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c1568b.mo2546c() & 4294967295L)) - Float.intBitsToFloat(i8);
        ((C0019e1) c1568b.f10182f.f152f).m44p(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f7 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i7) > 0.0f && Float.intBitsToFloat(i8) > 0.0f) {
                    mo3505e(c3508i0);
                }
            } finally {
                ((C0019e1) c1568b.f10182f.f152f).m44p(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    /* renamed from: d */
    public abstract long mo3504d();

    /* renamed from: e */
    public abstract void mo3505e(C3508i0 c3508i0);
}
