package p100n;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.o */
/* loaded from: classes.dex */
public final class C2668o extends AbstractC2674q {

    /* renamed from: a */
    public float f14374a;

    /* renamed from: b */
    public float f14375b;

    /* renamed from: c */
    public float f14376c;

    public C2668o(float f7, float f8, float f9) {
        this.f14374a = f7;
        this.f14375b = f8;
        this.f14376c = f9;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: a */
    public final float mo4266a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return 0.0f;
                }
                return this.f14376c;
            }
            return this.f14375b;
        }
        return this.f14374a;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: b */
    public final int mo4267b() {
        return 3;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: c */
    public final AbstractC2674q mo4268c() {
        return new C2668o(0.0f, 0.0f, 0.0f);
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: d */
    public final void mo4269d() {
        this.f14374a = 0.0f;
        this.f14375b = 0.0f;
        this.f14376c = 0.0f;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: e */
    public final void mo4270e(float f7, int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                this.f14376c = f7;
                return;
            }
            this.f14375b = f7;
            return;
        }
        this.f14374a = f7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2668o) {
            C2668o c2668o = (C2668o) obj;
            if (c2668o.f14374a == this.f14374a && c2668o.f14375b == this.f14375b && c2668o.f14376c == this.f14376c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14376c) + AbstractC2487d.m4038b(this.f14375b, Float.hashCode(this.f14374a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f14374a + ", v2 = " + this.f14375b + ", v3 = " + this.f14376c;
    }
}
