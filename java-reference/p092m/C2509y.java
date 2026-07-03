package p092m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.y */
/* loaded from: classes.dex */
public final class C2509y {

    /* renamed from: a */
    public final float f13854a;

    /* renamed from: b */
    public final float f13855b;

    /* renamed from: c */
    public final long f13856c;

    public C2509y(float f7, float f8, long j6) {
        this.f13854a = f7;
        this.f13855b = f8;
        this.f13856c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2509y)) {
            return false;
        }
        C2509y c2509y = (C2509y) obj;
        if (Float.compare(this.f13854a, c2509y.f13854a) == 0 && Float.compare(this.f13855b, c2509y.f13855b) == 0 && this.f13856c == c2509y.f13856c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13856c) + AbstractC2487d.m4038b(this.f13855b, Float.hashCode(this.f13854a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f13854a + ", distance=" + this.f13855b + ", duration=" + this.f13856c + ')';
    }
}
