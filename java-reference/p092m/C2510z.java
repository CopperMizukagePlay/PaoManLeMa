package p092m;

import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.z */
/* loaded from: classes.dex */
public final class C2510z {

    /* renamed from: a */
    public final float f13857a;

    /* renamed from: b */
    public final float f13858b;

    public C2510z(float f7, InterfaceC3093c interfaceC3093c) {
        this.f13857a = f7;
        float mo559b = interfaceC3093c.mo559b();
        float f8 = AbstractC2482a0.f13782a;
        this.f13858b = mo559b * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public final C2509y m4065a(float f7) {
        double m4066b = m4066b(f7);
        double d7 = AbstractC2482a0.f13782a;
        double d8 = d7 - 1.0d;
        return new C2509y(f7, (float) (Math.exp((d7 / d8) * m4066b) * this.f13857a * this.f13858b), (long) (Math.exp(m4066b / d8) * 1000.0d));
    }

    /* renamed from: b */
    public final double m4066b(float f7) {
        float[] fArr = AbstractC2483b.f13783a;
        return Math.log((Math.abs(f7) * 0.35f) / (this.f13857a * this.f13858b));
    }
}
