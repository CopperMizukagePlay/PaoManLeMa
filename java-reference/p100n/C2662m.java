package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.m */
/* loaded from: classes.dex */
public final class C2662m extends AbstractC2674q {

    /* renamed from: a */
    public float f14358a;

    public C2662m(float f7) {
        this.f14358a = f7;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: a */
    public final float mo4266a(int i7) {
        if (i7 == 0) {
            return this.f14358a;
        }
        return 0.0f;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: b */
    public final int mo4267b() {
        return 1;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: c */
    public final AbstractC2674q mo4268c() {
        return new C2662m(0.0f);
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: d */
    public final void mo4269d() {
        this.f14358a = 0.0f;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: e */
    public final void mo4270e(float f7, int i7) {
        if (i7 == 0) {
            this.f14358a = f7;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2662m) && ((C2662m) obj).f14358a == this.f14358a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14358a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f14358a;
    }
}
