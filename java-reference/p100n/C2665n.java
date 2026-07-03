package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.n */
/* loaded from: classes.dex */
public final class C2665n extends AbstractC2674q {

    /* renamed from: a */
    public float f14363a;

    /* renamed from: b */
    public float f14364b;

    public C2665n(float f7, float f8) {
        this.f14363a = f7;
        this.f14364b = f8;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: a */
    public final float mo4266a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return 0.0f;
            }
            return this.f14364b;
        }
        return this.f14363a;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: b */
    public final int mo4267b() {
        return 2;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: c */
    public final AbstractC2674q mo4268c() {
        return new C2665n(0.0f, 0.0f);
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: d */
    public final void mo4269d() {
        this.f14363a = 0.0f;
        this.f14364b = 0.0f;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: e */
    public final void mo4270e(float f7, int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return;
            }
            this.f14364b = f7;
            return;
        }
        this.f14363a = f7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2665n) {
            C2665n c2665n = (C2665n) obj;
            if (c2665n.f14363a == this.f14363a && c2665n.f14364b == this.f14364b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14364b) + (Float.hashCode(this.f14363a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f14363a + ", v2 = " + this.f14364b;
    }
}
