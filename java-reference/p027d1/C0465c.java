package p027d1;

import p092m.AbstractC2487d;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d1.c */
/* loaded from: classes.dex */
public final class C0465c {

    /* renamed from: e */
    public static final C0465c f1624e = new C0465c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f1625a;

    /* renamed from: b */
    public final float f1626b;

    /* renamed from: c */
    public final float f1627c;

    /* renamed from: d */
    public final float f1628d;

    public C0465c(float f7, float f8, float f9, float f10) {
        this.f1625a = f7;
        this.f1626b = f8;
        this.f1627c = f9;
        this.f1628d = f10;
    }

    /* renamed from: a */
    public final long m1014a() {
        float f7 = this.f1627c;
        float f8 = this.f1625a;
        float f9 = ((f7 - f8) / 2.0f) + f8;
        float f10 = this.f1628d;
        float f11 = this.f1626b;
        return (Float.floatToRawIntBits(((f10 - f11) / 2.0f) + f11) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    /* renamed from: b */
    public final long m1015b() {
        float f7 = this.f1627c - this.f1625a;
        float f8 = this.f1628d - this.f1626b;
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: c */
    public final C0465c m1016c(C0465c c0465c) {
        return new C0465c(Math.max(this.f1625a, c0465c.f1625a), Math.max(this.f1626b, c0465c.f1626b), Math.min(this.f1627c, c0465c.f1627c), Math.min(this.f1628d, c0465c.f1628d));
    }

    /* renamed from: d */
    public final boolean m1017d() {
        boolean z7;
        boolean z8 = false;
        if (this.f1625a >= this.f1627c) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f1626b >= this.f1628d) {
            z8 = true;
        }
        return z7 | z8;
    }

    /* renamed from: e */
    public final boolean m1018e(C0465c c0465c) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (this.f1625a < c0465c.f1627c) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c0465c.f1625a < this.f1627c) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z11 = z7 & z8;
        if (this.f1626b < c0465c.f1628d) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z11 & z9;
        if (c0465c.f1626b < this.f1628d) {
            z10 = true;
        }
        return z12 & z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0465c)) {
            return false;
        }
        C0465c c0465c = (C0465c) obj;
        if (Float.compare(this.f1625a, c0465c.f1625a) == 0 && Float.compare(this.f1626b, c0465c.f1626b) == 0 && Float.compare(this.f1627c, c0465c.f1627c) == 0 && Float.compare(this.f1628d, c0465c.f1628d) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C0465c m1019f(float f7, float f8) {
        return new C0465c(this.f1625a + f7, this.f1626b + f8, this.f1627c + f7, this.f1628d + f8);
    }

    /* renamed from: g */
    public final C0465c m1020g(long j6) {
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        return new C0465c(Float.intBitsToFloat(i7) + this.f1625a, Float.intBitsToFloat(i8) + this.f1626b, Float.intBitsToFloat(i7) + this.f1627c, Float.intBitsToFloat(i8) + this.f1628d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1628d) + AbstractC2487d.m4038b(this.f1627c, AbstractC2487d.m4038b(this.f1626b, Float.hashCode(this.f1625a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC3393k.m5128A(this.f1625a) + ", " + AbstractC3393k.m5128A(this.f1626b) + ", " + AbstractC3393k.m5128A(this.f1627c) + ", " + AbstractC3393k.m5128A(this.f1628d) + ')';
    }
}
