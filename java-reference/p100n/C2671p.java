package p100n;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.p */
/* loaded from: classes.dex */
public final class C2671p extends AbstractC2674q {

    /* renamed from: a */
    public float f14378a;

    /* renamed from: b */
    public float f14379b;

    /* renamed from: c */
    public float f14380c;

    /* renamed from: d */
    public float f14381d;

    public C2671p(float f7, float f8, float f9, float f10) {
        this.f14378a = f7;
        this.f14379b = f8;
        this.f14380c = f9;
        this.f14381d = f10;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: a */
    public final float mo4266a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return 0.0f;
                    }
                    return this.f14381d;
                }
                return this.f14380c;
            }
            return this.f14379b;
        }
        return this.f14378a;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: b */
    public final int mo4267b() {
        return 4;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: c */
    public final AbstractC2674q mo4268c() {
        return new C2671p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: d */
    public final void mo4269d() {
        this.f14378a = 0.0f;
        this.f14379b = 0.0f;
        this.f14380c = 0.0f;
        this.f14381d = 0.0f;
    }

    @Override // p100n.AbstractC2674q
    /* renamed from: e */
    public final void mo4270e(float f7, int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return;
                    }
                    this.f14381d = f7;
                    return;
                }
                this.f14380c = f7;
                return;
            }
            this.f14379b = f7;
            return;
        }
        this.f14378a = f7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2671p) {
            C2671p c2671p = (C2671p) obj;
            if (c2671p.f14378a == this.f14378a && c2671p.f14379b == this.f14379b && c2671p.f14380c == this.f14380c && c2671p.f14381d == this.f14381d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14381d) + AbstractC2487d.m4038b(this.f14380c, AbstractC2487d.m4038b(this.f14379b, Float.hashCode(this.f14378a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f14378a + ", v2 = " + this.f14379b + ", v3 = " + this.f14380c + ", v4 = " + this.f14381d;
    }
}
