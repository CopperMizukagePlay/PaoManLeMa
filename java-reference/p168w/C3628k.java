package p168w;

import p073j2.AbstractC2168e;
import p100n.InterfaceC2656k;
import p122q.InterfaceC2900e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.k */
/* loaded from: classes.dex */
public final class C3628k implements InterfaceC2900e {

    /* renamed from: b */
    public final AbstractC3642y f17318b;

    /* renamed from: c */
    public final InterfaceC2900e f17319c;

    /* renamed from: d */
    public final InterfaceC2656k f17320d;

    public C3628k(AbstractC3642y abstractC3642y, InterfaceC2900e interfaceC2900e) {
        this.f17318b = abstractC3642y;
        this.f17319c = interfaceC2900e;
        this.f17320d = interfaceC2900e.mo4571b();
    }

    @Override // p122q.InterfaceC2900e
    /* renamed from: a */
    public final float mo4570a(float f7, float f8, float f9) {
        float mo4570a = this.f17319c.mo4570a(f7, f8, f9);
        AbstractC3642y abstractC3642y = this.f17318b;
        if (mo4570a == 0.0f) {
            int i7 = abstractC3642y.f17398e;
            if (i7 == 0) {
                return 0.0f;
            }
            float f10 = i7 * (-1.0f);
            if (((Boolean) abstractC3642y.f17392E.getValue()).booleanValue()) {
                f10 += abstractC3642y.m5611m();
            }
            return AbstractC2168e.m3529p(f10, -f9, f9);
        }
        float f11 = abstractC3642y.f17398e * (-1);
        while (mo4570a > 0.0f && f11 < mo4570a) {
            f11 += abstractC3642y.m5611m();
        }
        while (mo4570a < 0.0f && f11 > mo4570a) {
            f11 -= abstractC3642y.m5611m();
        }
        return f11;
    }

    @Override // p122q.InterfaceC2900e
    /* renamed from: b */
    public final InterfaceC2656k mo4571b() {
        return this.f17320d;
    }
}
