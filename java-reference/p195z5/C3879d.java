package p195z5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.d */
/* loaded from: classes.dex */
public final class C3879d extends C3877b {

    /* renamed from: h */
    public static final C3879d f18170h = new C3877b(1, 0, 1);

    @Override // p195z5.C3877b
    public final boolean equals(Object obj) {
        if (obj instanceof C3879d) {
            if (!isEmpty() || !((C3879d) obj).isEmpty()) {
                C3879d c3879d = (C3879d) obj;
                if (this.f18163e == c3879d.f18163e && this.f18164f == c3879d.f18164f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // p195z5.C3877b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18163e * 31) + this.f18164f;
    }

    @Override // p195z5.C3877b
    public final boolean isEmpty() {
        if (this.f18163e > this.f18164f) {
            return true;
        }
        return false;
    }

    @Override // p195z5.C3877b
    public final String toString() {
        return this.f18163e + ".." + this.f18164f;
    }
}
