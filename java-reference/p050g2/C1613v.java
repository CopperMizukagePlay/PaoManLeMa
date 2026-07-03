package p050g2;

import p092m.AbstractC2487d;
import p095m2.AbstractC2550a;
import p100n.AbstractC2647h;
import p132r2.C3030d;
import p132r2.C3031e;
import p132r2.C3035i;
import p132r2.C3037k;
import p132r2.C3039m;
import p132r2.C3043q;
import p132r2.C3045s;
import p140s2.C3105o;
import p140s2.C3106p;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.v */
/* loaded from: classes.dex */
public final class C1613v implements InterfaceC1577b {

    /* renamed from: a */
    public final int f10339a;

    /* renamed from: b */
    public final int f10340b;

    /* renamed from: c */
    public final long f10341c;

    /* renamed from: d */
    public final C3043q f10342d;

    /* renamed from: e */
    public final C1615x f10343e;

    /* renamed from: f */
    public final C3035i f10344f;

    /* renamed from: g */
    public final int f10345g;

    /* renamed from: h */
    public final int f10346h;

    /* renamed from: i */
    public final C3045s f10347i;

    public C1613v(int i7, int i8, long j6, C3043q c3043q, C1615x c1615x, C3035i c3035i, int i9, int i10, C3045s c3045s) {
        this.f10339a = i7;
        this.f10340b = i8;
        this.f10341c = j6;
        this.f10342d = c3043q;
        this.f10343e = c1615x;
        this.f10344f = c3035i;
        this.f10345g = i9;
        this.f10346h = i10;
        this.f10347i = c3045s;
        if (!C3105o.m4794a(j6, C3105o.f15708c) && C3105o.m4796c(j6) < 0.0f) {
            AbstractC2550a.m4079b("lineHeight can't be negative (" + C3105o.m4796c(j6) + ')');
        }
    }

    /* renamed from: a */
    public final C1613v m2621a(C1613v c1613v) {
        if (c1613v == null) {
            return this;
        }
        return AbstractC1614w.m2622a(this, c1613v.f10339a, c1613v.f10340b, c1613v.f10341c, c1613v.f10342d, c1613v.f10343e, c1613v.f10344f, c1613v.f10345g, c1613v.f10346h, c1613v.f10347i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1613v) {
                C1613v c1613v = (C1613v) obj;
                if (this.f10339a == c1613v.f10339a && this.f10340b == c1613v.f10340b && C3105o.m4794a(this.f10341c, c1613v.f10341c) && AbstractC3367j.m5096a(this.f10342d, c1613v.f10342d) && AbstractC3367j.m5096a(this.f10343e, c1613v.f10343e) && AbstractC3367j.m5096a(this.f10344f, c1613v.f10344f) && this.f10345g == c1613v.f10345g && this.f10346h == c1613v.f10346h && AbstractC3367j.m5096a(this.f10347i, c1613v.f10347i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int m4255a = AbstractC2647h.m4255a(this.f10340b, Integer.hashCode(this.f10339a) * 31, 31);
        C3106p[] c3106pArr = C3105o.f15707b;
        int m4039c = AbstractC2487d.m4039c(m4255a, 31, this.f10341c);
        int i10 = 0;
        C3043q c3043q = this.f10342d;
        if (c3043q != null) {
            i7 = c3043q.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (m4039c + i7) * 31;
        C1615x c1615x = this.f10343e;
        if (c1615x != null) {
            i8 = c1615x.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        C3035i c3035i = this.f10344f;
        if (c3035i != null) {
            i9 = c3035i.hashCode();
        } else {
            i9 = 0;
        }
        int m4255a2 = AbstractC2647h.m4255a(this.f10346h, AbstractC2647h.m4255a(this.f10345g, (i12 + i9) * 31, 31), 31);
        C3045s c3045s = this.f10347i;
        if (c3045s != null) {
            i10 = c3045s.hashCode();
        }
        return m4255a2 + i10;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C3037k.m4723a(this.f10339a)) + ", textDirection=" + ((Object) C3039m.m4724a(this.f10340b)) + ", lineHeight=" + ((Object) C3105o.m4797d(this.f10341c)) + ", textIndent=" + this.f10342d + ", platformStyle=" + this.f10343e + ", lineHeightStyle=" + this.f10344f + ", lineBreak=" + ((Object) C3031e.m4720a(this.f10345g)) + ", hyphens=" + ((Object) C3030d.m4719a(this.f10346h)) + ", textMotion=" + this.f10347i + ')';
    }
}
