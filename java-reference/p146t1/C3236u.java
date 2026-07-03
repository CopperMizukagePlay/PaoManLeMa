package p146t1;

import java.util.Map;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.u */
/* loaded from: classes.dex */
public final class C3236u implements InterfaceC3223n0, InterfaceC3228q {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3228q f16050e;

    /* renamed from: f */
    public final EnumC3103m f16051f;

    public C3236u(InterfaceC3228q interfaceC3228q, EnumC3103m enumC3103m) {
        this.f16050e = interfaceC3228q;
        this.f16051f = enumC3103m;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f16050e.mo4511H(j6);
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: I */
    public final InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            AbstractC3088a.m4750b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C3234t(i7, i8, map, interfaceC3279c);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f16050e.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f16050e.mo4513Q(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f16050e.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16050e.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f16050e.mo4518f0(j6);
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f16051f;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16050e.mo560l();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f16050e.mo4521n0(f7);
    }

    @Override // p146t1.InterfaceC3228q
    /* renamed from: s */
    public final boolean mo4889s() {
        return this.f16050e.mo4889s();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f16050e.mo4522t0(i7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f16050e.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return this.f16050e.mo4524v0(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f16050e.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f16050e.mo4526y(f7);
    }
}
