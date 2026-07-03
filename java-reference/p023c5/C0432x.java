package p023c5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.x */
/* loaded from: classes.dex */
public final class C0432x implements Comparable {

    /* renamed from: e */
    public final int f1470e;

    /* renamed from: f */
    public final int f1471f;

    public C0432x(int i7, int i8) {
        this.f1470e = i7;
        this.f1471f = i8;
    }

    /* renamed from: a */
    public final C0432x m920a(C0432x c0432x) {
        int i7 = c0432x.f1471f;
        int i8 = this.f1470e;
        int i9 = i8 * i7;
        int i10 = c0432x.f1470e;
        int i11 = this.f1471f;
        if (i9 <= i10 * i11) {
            return new C0432x(i10, (i11 * i10) / i8);
        }
        return new C0432x((i8 * i7) / i11, i7);
    }

    /* renamed from: b */
    public final C0432x m921b(C0432x c0432x) {
        int i7 = c0432x.f1471f;
        int i8 = this.f1470e;
        int i9 = i8 * i7;
        int i10 = c0432x.f1470e;
        int i11 = this.f1471f;
        if (i9 >= i10 * i11) {
            return new C0432x(i10, (i11 * i10) / i8);
        }
        return new C0432x((i8 * i7) / i11, i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0432x c0432x = (C0432x) obj;
        int i7 = this.f1471f * this.f1470e;
        int i8 = c0432x.f1471f * c0432x.f1470e;
        if (i8 < i7) {
            return 1;
        }
        if (i8 > i7) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0432x.class == obj.getClass()) {
            C0432x c0432x = (C0432x) obj;
            if (this.f1470e == c0432x.f1470e && this.f1471f == c0432x.f1471f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1470e * 31) + this.f1471f;
    }

    public final String toString() {
        return this.f1470e + "x" + this.f1471f;
    }
}
