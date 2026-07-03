package p050g2;

import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.c */
/* loaded from: classes.dex */
public final class C1579c {

    /* renamed from: a */
    public final Object f10200a;

    /* renamed from: b */
    public final int f10201b;

    /* renamed from: c */
    public final int f10202c;

    /* renamed from: d */
    public final String f10203d;

    public C1579c(Object obj, int i7, int i8, String str) {
        this.f10200a = obj;
        this.f10201b = i7;
        this.f10202c = i8;
        this.f10203d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579c)) {
            return false;
        }
        C1579c c1579c = (C1579c) obj;
        if (AbstractC3367j.m5096a(this.f10200a, c1579c.f10200a) && this.f10201b == c1579c.f10201b && this.f10202c == c1579c.f10202c && AbstractC3367j.m5096a(this.f10203d, c1579c.f10203d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10200a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f10203d.hashCode() + AbstractC2647h.m4255a(this.f10202c, AbstractC2647h.m4255a(this.f10201b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f10200a);
        sb.append(", start=");
        sb.append(this.f10201b);
        sb.append(", end=");
        sb.append(this.f10202c);
        sb.append(", tag=");
        return AbstractC0094y0.m187n(sb, this.f10203d, ')');
    }
}
