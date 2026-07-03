package p160v;

import p073j2.AbstractC2168e;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p085l0.InterfaceC2390n2;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.k0 */
/* loaded from: classes.dex */
public final class C3419k0 implements InterfaceC2390n2 {

    /* renamed from: e */
    public final C2361g1 f16582e;

    /* renamed from: f */
    public int f16583f;

    public C3419k0(int i7) {
        int i8 = (i7 / 30) * 30;
        this.f16582e = new C2361g1(AbstractC2168e.m3513G(Math.max(i8 - 100, 0), i8 + 130), C2413u0.f13575j);
        this.f16583f = i7;
    }

    /* renamed from: a */
    public final void m5180a(int i7) {
        if (i7 != this.f16583f) {
            this.f16583f = i7;
            int i8 = (i7 / 30) * 30;
            this.f16582e.setValue(AbstractC2168e.m3513G(Math.max(i8 - 100, 0), i8 + 130));
        }
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return (C3879d) this.f16582e.getValue();
    }
}
