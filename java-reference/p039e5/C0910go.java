package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.go */
/* loaded from: classes.dex */
public final class C0910go {

    /* renamed from: a */
    public final String f4322a;

    /* renamed from: b */
    public final String f4323b;

    /* renamed from: c */
    public final String f4324c;

    /* renamed from: d */
    public final int f4325d;

    /* renamed from: e */
    public final List f4326e;

    /* renamed from: f */
    public final String f4327f;

    public C0910go(String str, String str2, String str3, int i7, List list, String str4) {
        AbstractC3367j.m5100e(str, "selectionKey");
        AbstractC3367j.m5100e(str2, "displayLabel");
        AbstractC3367j.m5100e(str3, "host");
        this.f4322a = str;
        this.f4323b = str2;
        this.f4324c = str3;
        this.f4325d = i7;
        this.f4326e = list;
        this.f4327f = str4;
    }

    /* renamed from: a */
    public static C0910go m1551a(C0910go c0910go, List list, String str, int i7) {
        String str2 = c0910go.f4322a;
        String str3 = c0910go.f4323b;
        String str4 = c0910go.f4324c;
        int i8 = c0910go.f4325d;
        if ((i7 & 32) != 0) {
            str = c0910go.f4327f;
        }
        String str5 = str;
        c0910go.getClass();
        AbstractC3367j.m5100e(str2, "selectionKey");
        AbstractC3367j.m5100e(str3, "displayLabel");
        AbstractC3367j.m5100e(str4, "host");
        AbstractC3367j.m5100e(str5, "selectedAddress");
        return new C0910go(str2, str3, str4, i8, list, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910go)) {
            return false;
        }
        C0910go c0910go = (C0910go) obj;
        if (AbstractC3367j.m5096a(this.f4322a, c0910go.f4322a) && AbstractC3367j.m5096a(this.f4323b, c0910go.f4323b) && AbstractC3367j.m5096a(this.f4324c, c0910go.f4324c) && this.f4325d == c0910go.f4325d && AbstractC3367j.m5096a(this.f4326e, c0910go.f4326e) && AbstractC3367j.m5096a(this.f4327f, c0910go.f4327f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4327f.hashCode() + AbstractC0094y0.m176c(this.f4326e, AbstractC2647h.m4255a(this.f4325d, AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f4322a.hashCode() * 31, 31, this.f4323b), 31, this.f4324c), 31), 31);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("SpeedDnsHostSelection(selectionKey=", this.f4322a, ", displayLabel=", this.f4323b, ", host=");
        m189p.append(this.f4324c);
        m189p.append(", port=");
        m189p.append(this.f4325d);
        m189p.append(", candidates=");
        m189p.append(this.f4326e);
        m189p.append(", selectedAddress=");
        m189p.append(this.f4327f);
        m189p.append(")");
        return m189p.toString();
    }
}
