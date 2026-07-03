package p027d1;

import p092m.AbstractC2487d;
import p102n1.AbstractC2710c;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d1.d */
/* loaded from: classes.dex */
public final class C0466d {

    /* renamed from: a */
    public final float f1629a;

    /* renamed from: b */
    public final float f1630b;

    /* renamed from: c */
    public final float f1631c;

    /* renamed from: d */
    public final float f1632d;

    /* renamed from: e */
    public final long f1633e;

    /* renamed from: f */
    public final long f1634f;

    /* renamed from: g */
    public final long f1635g;

    /* renamed from: h */
    public final long f1636h;

    static {
        AbstractC2710c.m4329a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C0466d(float f7, float f8, float f9, float f10, long j6, long j7, long j8, long j9) {
        this.f1629a = f7;
        this.f1630b = f8;
        this.f1631c = f9;
        this.f1632d = f10;
        this.f1633e = j6;
        this.f1634f = j7;
        this.f1635g = j8;
        this.f1636h = j9;
    }

    /* renamed from: a */
    public final float m1021a() {
        return this.f1632d - this.f1630b;
    }

    /* renamed from: b */
    public final float m1022b() {
        return this.f1631c - this.f1629a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0466d) {
                C0466d c0466d = (C0466d) obj;
                if (Float.compare(this.f1629a, c0466d.f1629a) != 0 || Float.compare(this.f1630b, c0466d.f1630b) != 0 || Float.compare(this.f1631c, c0466d.f1631c) != 0 || Float.compare(this.f1632d, c0466d.f1632d) != 0 || !AbstractC2710c.m4336j(this.f1633e, c0466d.f1633e) || !AbstractC2710c.m4336j(this.f1634f, c0466d.f1634f) || !AbstractC2710c.m4336j(this.f1635g, c0466d.f1635g) || !AbstractC2710c.m4336j(this.f1636h, c0466d.f1636h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1636h) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4038b(this.f1632d, AbstractC2487d.m4038b(this.f1631c, AbstractC2487d.m4038b(this.f1630b, Float.hashCode(this.f1629a) * 31, 31), 31), 31), 31, this.f1633e), 31, this.f1634f), 31, this.f1635g);
    }

    public final String toString() {
        String str = AbstractC3393k.m5128A(this.f1629a) + ", " + AbstractC3393k.m5128A(this.f1630b) + ", " + AbstractC3393k.m5128A(this.f1631c) + ", " + AbstractC3393k.m5128A(this.f1632d);
        long j6 = this.f1633e;
        long j7 = this.f1634f;
        boolean m4336j = AbstractC2710c.m4336j(j6, j7);
        long j8 = this.f1635g;
        long j9 = this.f1636h;
        if (m4336j && AbstractC2710c.m4336j(j7, j8) && AbstractC2710c.m4336j(j8, j9)) {
            int i7 = (int) (j6 >> 32);
            int i8 = (int) (j6 & 4294967295L);
            if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i8)) {
                return "RoundRect(rect=" + str + ", radius=" + AbstractC3393k.m5128A(Float.intBitsToFloat(i7)) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + AbstractC3393k.m5128A(Float.intBitsToFloat(i7)) + ", y=" + AbstractC3393k.m5128A(Float.intBitsToFloat(i8)) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC2710c.m4328L(j6)) + ", topRight=" + ((Object) AbstractC2710c.m4328L(j7)) + ", bottomRight=" + ((Object) AbstractC2710c.m4328L(j8)) + ", bottomLeft=" + ((Object) AbstractC2710c.m4328L(j9)) + ')';
    }
}
