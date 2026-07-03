package p195z5;

import java.util.Iterator;
import p068i5.AbstractC2080d;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.b */
/* loaded from: classes.dex */
public class C3877b implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final int f18163e;

    /* renamed from: f */
    public final int f18164f;

    /* renamed from: g */
    public final int f18165g;

    public C3877b(int i7, int i8, int i9) {
        if (i9 != 0) {
            if (i9 != Integer.MIN_VALUE) {
                this.f18163e = i7;
                this.f18164f = AbstractC2080d.m3402o(i7, i8, i9);
                this.f18165g = i9;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3877b) {
            if (!isEmpty() || !((C3877b) obj).isEmpty()) {
                C3877b c3877b = (C3877b) obj;
                if (this.f18163e == c3877b.f18163e && this.f18164f == c3877b.f18164f && this.f18165g == c3877b.f18165g) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f18163e * 31) + this.f18164f) * 31) + this.f18165g;
    }

    public boolean isEmpty() {
        int i7 = this.f18165g;
        int i8 = this.f18164f;
        int i9 = this.f18163e;
        if (i7 > 0) {
            if (i9 <= i8) {
                return false;
            }
            return true;
        }
        if (i9 >= i8) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3878c(this.f18163e, this.f18164f, this.f18165g);
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f18164f;
        int i8 = this.f18163e;
        int i9 = this.f18165g;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
