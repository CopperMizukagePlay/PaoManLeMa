package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.io */
/* loaded from: classes.dex */
public final class C0973io {

    /* renamed from: a */
    public final String f4935a;

    /* renamed from: b */
    public final String f4936b;

    /* renamed from: c */
    public final String f4937c;

    /* renamed from: d */
    public final int f4938d;

    public C0973io(int i7, String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "selectionKey");
        AbstractC3367j.m5100e(str2, "displayLabel");
        AbstractC3367j.m5100e(str3, "host");
        this.f4935a = str;
        this.f4936b = str2;
        this.f4937c = str3;
        this.f4938d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973io)) {
            return false;
        }
        C0973io c0973io = (C0973io) obj;
        if (AbstractC3367j.m5096a(this.f4935a, c0973io.f4935a) && AbstractC3367j.m5096a(this.f4936b, c0973io.f4936b) && AbstractC3367j.m5096a(this.f4937c, c0973io.f4937c) && this.f4938d == c0973io.f4938d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4938d) + AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f4935a.hashCode() * 31, 31, this.f4936b), 31, this.f4937c);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("SpeedDnsResolveTarget(selectionKey=", this.f4935a, ", displayLabel=", this.f4936b, ", host=");
        m189p.append(this.f4937c);
        m189p.append(", port=");
        m189p.append(this.f4938d);
        m189p.append(")");
        return m189p.toString();
    }
}
