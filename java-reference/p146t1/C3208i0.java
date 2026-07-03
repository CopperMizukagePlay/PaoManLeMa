package p146t1;

import p060h5.AbstractC1804l;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3281e;
import p162v1.AbstractC3526o0;
import p162v1.C3548v1;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.i0 */
/* loaded from: classes.dex */
public final class C3208i0 extends AbstractC3237u0 {

    /* renamed from: f */
    public final /* synthetic */ int f15975f;

    /* renamed from: g */
    public final Object f15976g;

    public /* synthetic */ C3208i0(int i7, Object obj) {
        this.f15975f = i7;
        this.f15976g = obj;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        switch (this.f15975f) {
            case 0:
                return ((AbstractC3526o0) this.f15976g).mo559b();
            default:
                return ((C3728t) this.f15976g).getDensity().mo559b();
        }
    }

    @Override // p146t1.AbstractC3237u0
    /* renamed from: d */
    public float mo4913d(C3222n c3222n) {
        float f7;
        float intBitsToFloat;
        int m3028U;
        switch (this.f15975f) {
            case 0:
                InterfaceC3281e interfaceC3281e = c3222n.f16013a;
                if (interfaceC3281e != null) {
                    return ((Number) interfaceC3281e.mo22d(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC3526o0 abstractC3526o0 = (AbstractC3526o0) this.f15976g;
                if (abstractC3526o0.f16978o) {
                    return Float.NaN;
                }
                AbstractC3526o0 abstractC3526o02 = abstractC3526o0;
                while (true) {
                    C3548v1 c3548v1 = abstractC3526o02.f16980q;
                    if (c3548v1 != null && (m3028U = AbstractC1804l.m3028U(c3548v1.f17061b, c3222n)) >= 0) {
                        f7 = c3548v1.f17062c[m3028U];
                    } else {
                        f7 = Float.NaN;
                    }
                    if (!Float.isNaN(f7)) {
                        abstractC3526o02.m5490s0(abstractC3526o0.mo5317C0(), c3222n);
                        InterfaceC3238v mo5315A0 = abstractC3526o02.mo5315A0();
                        InterfaceC3238v mo5315A02 = abstractC3526o0.mo5315A0();
                        switch (c3222n.f16014b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (mo5315A02.mo4928X(mo5315A0, (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(((int) (mo5315A0.mo4926S() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (mo5315A02.mo4928X(mo5315A0, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(((int) (mo5315A0.mo4926S() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    AbstractC3526o0 mo5319E0 = abstractC3526o02.mo5319E0();
                    if (mo5319E0 == null) {
                        abstractC3526o02.m5490s0(abstractC3526o0.mo5317C0(), c3222n);
                        return Float.NaN;
                    }
                    abstractC3526o02 = mo5319E0;
                }
                break;
            default:
                return super.mo4913d(c3222n);
        }
    }

    @Override // p146t1.AbstractC3237u0
    /* renamed from: e */
    public final EnumC3103m mo4914e() {
        switch (this.f15975f) {
            case 0:
                return ((AbstractC3526o0) this.f15976g).getLayoutDirection();
            default:
                return ((C3728t) this.f15976g).getLayoutDirection();
        }
    }

    @Override // p146t1.AbstractC3237u0
    /* renamed from: f */
    public final int mo4915f() {
        switch (this.f15975f) {
            case 0:
                return ((AbstractC3526o0) this.f15976g).mo4956k0();
            default:
                return ((C3728t) this.f15976g).getRoot().f16873J.f16953p.f16053e;
        }
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        switch (this.f15975f) {
            case 0:
                return ((AbstractC3526o0) this.f15976g).mo560l();
            default:
                return ((C3728t) this.f15976g).getDensity().mo560l();
        }
    }
}
