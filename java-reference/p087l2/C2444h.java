package p087l2;

import p001a0.AbstractC0094y0;
import p034e0.C0619n;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p065i2.AbstractC2064e;
import p065i2.C2065f;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.h */
/* loaded from: classes.dex */
public final class C2444h {

    /* renamed from: a */
    public final C2065f f13692a;

    /* renamed from: b */
    public int f13693b;

    /* renamed from: c */
    public int f13694c;

    /* renamed from: d */
    public int f13695d;

    /* renamed from: e */
    public int f13696e;

    public C2444h(C1587g c1587g, long j6) {
        String str = c1587g.f10239f;
        C2065f c2065f = new C2065f();
        c2065f.f12253d = str;
        c2065f.f12251b = -1;
        c2065f.f12252c = -1;
        this.f13692a = c2065f;
        this.f13693b = C1602n0.m2589e(j6);
        this.f13694c = C1602n0.m2588d(j6);
        this.f13695d = -1;
        this.f13696e = -1;
        int m2589e = C1602n0.m2589e(j6);
        int m2588d = C1602n0.m2588d(j6);
        if (m2589e >= 0 && m2589e <= str.length()) {
            if (m2588d >= 0 && m2588d <= str.length()) {
                if (m2589e <= m2588d) {
                    return;
                } else {
                    throw new IllegalArgumentException(AbstractC0094y0.m182i(m2589e, m2588d, "Do not set reversed range: ", " > "));
                }
            } else {
                StringBuilder m188o = AbstractC0094y0.m188o(m2588d, "end (", ") offset is outside of text region ");
                m188o.append(str.length());
                throw new IndexOutOfBoundsException(m188o.toString());
            }
        }
        StringBuilder m188o2 = AbstractC0094y0.m188o(m2589e, "start (", ") offset is outside of text region ");
        m188o2.append(str.length());
        throw new IndexOutOfBoundsException(m188o2.toString());
    }

    /* renamed from: a */
    public final void m4012a(int i7, int i8) {
        long m2558b = AbstractC1586f0.m2558b(i7, i8);
        this.f13692a.m3271k(i7, i8, "");
        long m3229J = AbstractC2064e.m3229J(AbstractC1586f0.m2558b(this.f13693b, this.f13694c), m2558b);
        m4019h(C1602n0.m2589e(m3229J));
        m4018g(C1602n0.m2588d(m3229J));
        int i9 = this.f13695d;
        if (i9 != -1) {
            long m3229J2 = AbstractC2064e.m3229J(AbstractC1586f0.m2558b(i9, this.f13696e), m2558b);
            if (C1602n0.m2586b(m3229J2)) {
                this.f13695d = -1;
                this.f13696e = -1;
            } else {
                this.f13695d = C1602n0.m2589e(m3229J2);
                this.f13696e = C1602n0.m2588d(m3229J2);
            }
        }
    }

    /* renamed from: b */
    public final char m4013b(int i7) {
        C2065f c2065f = this.f13692a;
        C0619n c0619n = (C0619n) c2065f.f12254e;
        if (c0619n == null) {
            return ((String) c2065f.f12253d).charAt(i7);
        }
        if (i7 < c2065f.f12251b) {
            return ((String) c2065f.f12253d).charAt(i7);
        }
        int m1275b = c0619n.f2035b - c0619n.m1275b();
        int i8 = c2065f.f12251b;
        if (i7 < m1275b + i8) {
            int i9 = i7 - i8;
            int i10 = c0619n.f2036c;
            if (i9 < i10) {
                return ((char[]) c0619n.f2038e)[i9];
            }
            return ((char[]) c0619n.f2038e)[(i9 - i10) + c0619n.f2037d];
        }
        return ((String) c2065f.f12253d).charAt(i7 - ((m1275b - c2065f.f12252c) + i8));
    }

    /* renamed from: c */
    public final C1602n0 m4014c() {
        int i7 = this.f13695d;
        if (i7 != -1) {
            return new C1602n0(AbstractC1586f0.m2558b(i7, this.f13696e));
        }
        return null;
    }

    /* renamed from: d */
    public final void m4015d(int i7, int i8, String str) {
        C2065f c2065f = this.f13692a;
        if (i7 >= 0 && i7 <= c2065f.m3262b()) {
            if (i8 >= 0 && i8 <= c2065f.m3262b()) {
                if (i7 <= i8) {
                    c2065f.m3271k(i7, i8, str);
                    m4019h(str.length() + i7);
                    m4018g(str.length() + i7);
                    this.f13695d = -1;
                    this.f13696e = -1;
                    return;
                }
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "Do not set reversed range: ", " > "));
            }
            StringBuilder m188o = AbstractC0094y0.m188o(i8, "end (", ") offset is outside of text region ");
            m188o.append(c2065f.m3262b());
            throw new IndexOutOfBoundsException(m188o.toString());
        }
        StringBuilder m188o2 = AbstractC0094y0.m188o(i7, "start (", ") offset is outside of text region ");
        m188o2.append(c2065f.m3262b());
        throw new IndexOutOfBoundsException(m188o2.toString());
    }

    /* renamed from: e */
    public final void m4016e(int i7, int i8) {
        C2065f c2065f = this.f13692a;
        if (i7 >= 0 && i7 <= c2065f.m3262b()) {
            if (i8 >= 0 && i8 <= c2065f.m3262b()) {
                if (i7 < i8) {
                    this.f13695d = i7;
                    this.f13696e = i8;
                    return;
                }
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "Do not set reversed or empty range: ", " > "));
            }
            StringBuilder m188o = AbstractC0094y0.m188o(i8, "end (", ") offset is outside of text region ");
            m188o.append(c2065f.m3262b());
            throw new IndexOutOfBoundsException(m188o.toString());
        }
        StringBuilder m188o2 = AbstractC0094y0.m188o(i7, "start (", ") offset is outside of text region ");
        m188o2.append(c2065f.m3262b());
        throw new IndexOutOfBoundsException(m188o2.toString());
    }

    /* renamed from: f */
    public final void m4017f(int i7, int i8) {
        C2065f c2065f = this.f13692a;
        if (i7 >= 0 && i7 <= c2065f.m3262b()) {
            if (i8 >= 0 && i8 <= c2065f.m3262b()) {
                if (i7 <= i8) {
                    m4019h(i7);
                    m4018g(i8);
                    return;
                }
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "Do not set reversed range: ", " > "));
            }
            StringBuilder m188o = AbstractC0094y0.m188o(i8, "end (", ") offset is outside of text region ");
            m188o.append(c2065f.m3262b());
            throw new IndexOutOfBoundsException(m188o.toString());
        }
        StringBuilder m188o2 = AbstractC0094y0.m188o(i7, "start (", ") offset is outside of text region ");
        m188o2.append(c2065f.m3262b());
        throw new IndexOutOfBoundsException(m188o2.toString());
    }

    /* renamed from: g */
    public final void m4018g(int i7) {
        boolean z7;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2550a.m4078a("Cannot set selectionEnd to a negative value: " + i7);
        }
        this.f13694c = i7;
    }

    /* renamed from: h */
    public final void m4019h(int i7) {
        boolean z7;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2550a.m4078a("Cannot set selectionStart to a negative value: " + i7);
        }
        this.f13693b = i7;
    }

    public final String toString() {
        return this.f13692a.toString();
    }
}
