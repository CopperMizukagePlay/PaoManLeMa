package p050g2;

import p001a0.AbstractC0094y0;
import p095m2.AbstractC2550a;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.e */
/* loaded from: classes.dex */
public final class C1583e {

    /* renamed from: a */
    public final Object f10229a;

    /* renamed from: b */
    public final int f10230b;

    /* renamed from: c */
    public final int f10231c;

    /* renamed from: d */
    public final String f10232d;

    public C1583e(Object obj, int i7, int i8, String str) {
        this.f10229a = obj;
        this.f10230b = i7;
        this.f10231c = i8;
        this.f10232d = str;
        if (i7 <= i8) {
            return;
        }
        AbstractC2550a.m4078a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1583e)) {
            return false;
        }
        C1583e c1583e = (C1583e) obj;
        if (AbstractC3367j.m5096a(this.f10229a, c1583e.f10229a) && this.f10230b == c1583e.f10230b && this.f10231c == c1583e.f10231c && AbstractC3367j.m5096a(this.f10232d, c1583e.f10232d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10229a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f10232d.hashCode() + AbstractC2647h.m4255a(this.f10231c, AbstractC2647h.m4255a(this.f10230b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f10229a);
        sb.append(", start=");
        sb.append(this.f10230b);
        sb.append(", end=");
        sb.append(this.f10231c);
        sb.append(", tag=");
        return AbstractC0094y0.m187n(sb, this.f10232d, ')');
    }

    public C1583e(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }
}
