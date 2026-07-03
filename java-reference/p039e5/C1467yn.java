package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yn */
/* loaded from: classes.dex */
public final class C1467yn {

    /* renamed from: a */
    public final String f9464a;

    /* renamed from: b */
    public final String f9465b;

    /* renamed from: c */
    public final Double f9466c;

    /* renamed from: d */
    public final String f9467d;

    /* renamed from: e */
    public final boolean f9468e;

    /* renamed from: f */
    public final boolean f9469f;

    /* renamed from: g */
    public final List f9470g;

    /* renamed from: h */
    public final List f9471h;

    public C1467yn(String str, String str2, Double d7, String str3, boolean z7, boolean z8, List list, List list2) {
        AbstractC3367j.m5100e(list, "ecsSubnetLabels");
        AbstractC3367j.m5100e(list2, "dnsServerLabels");
        this.f9464a = str;
        this.f9465b = str2;
        this.f9466c = d7;
        this.f9467d = str3;
        this.f9468e = z7;
        this.f9469f = z8;
        this.f9470g = list;
        this.f9471h = list2;
    }

    /* renamed from: a */
    public static C1467yn m2427a(C1467yn c1467yn, String str, boolean z7, List list, List list2, int i7) {
        boolean z8;
        String str2 = c1467yn.f9464a;
        String str3 = c1467yn.f9465b;
        Double d7 = c1467yn.f9466c;
        if ((i7 & 8) != 0) {
            str = c1467yn.f9467d;
        }
        String str4 = str;
        if ((i7 & 16) != 0) {
            z8 = c1467yn.f9468e;
        } else {
            z8 = false;
        }
        boolean z9 = z8;
        if ((i7 & 32) != 0) {
            z7 = c1467yn.f9469f;
        }
        boolean z10 = z7;
        if ((i7 & 64) != 0) {
            list = c1467yn.f9470g;
        }
        List list3 = list;
        if ((i7 & 128) != 0) {
            list2 = c1467yn.f9471h;
        }
        List list4 = list2;
        c1467yn.getClass();
        AbstractC3367j.m5100e(str2, "address");
        AbstractC3367j.m5100e(str3, "family");
        AbstractC3367j.m5100e(str4, "geo");
        AbstractC3367j.m5100e(list3, "ecsSubnetLabels");
        AbstractC3367j.m5100e(list4, "dnsServerLabels");
        return new C1467yn(str2, str3, d7, str4, z9, z10, list3, list4);
    }

    /* renamed from: b */
    public final String m2428b() {
        List list = this.f9471h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return (String) AbstractC1805m.m3045i0(list);
        }
        return AbstractC1805m.m3045i0(list) + "等";
    }

    /* renamed from: c */
    public final String m2429c() {
        List list = this.f9470g;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return (String) AbstractC1805m.m3045i0(list);
        }
        return AbstractC1805m.m3051o0(this.f9470g, " + ", null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1467yn)) {
            return false;
        }
        C1467yn c1467yn = (C1467yn) obj;
        if (AbstractC3367j.m5096a(this.f9464a, c1467yn.f9464a) && AbstractC3367j.m5096a(this.f9465b, c1467yn.f9465b) && AbstractC3367j.m5096a(this.f9466c, c1467yn.f9466c) && AbstractC3367j.m5096a(this.f9467d, c1467yn.f9467d) && this.f9468e == c1467yn.f9468e && this.f9469f == c1467yn.f9469f && AbstractC3367j.m5096a(this.f9470g, c1467yn.f9470g) && AbstractC3367j.m5096a(this.f9471h, c1467yn.f9471h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m175b = AbstractC0094y0.m175b(this.f9464a.hashCode() * 31, 31, this.f9465b);
        Double d7 = this.f9466c;
        if (d7 == null) {
            hashCode = 0;
        } else {
            hashCode = d7.hashCode();
        }
        return this.f9471h.hashCode() + AbstractC0094y0.m176c(this.f9470g, AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC0094y0.m175b((m175b + hashCode) * 31, 31, this.f9467d), 31, this.f9468e), 31, this.f9469f), 31);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("SpeedDnsCandidate(address=", this.f9464a, ", family=", this.f9465b, ", latencyMs=");
        m189p.append(this.f9466c);
        m189p.append(", geo=");
        m189p.append(this.f9467d);
        m189p.append(", latencyPending=");
        m189p.append(this.f9468e);
        m189p.append(", geoPending=");
        m189p.append(this.f9469f);
        m189p.append(", ecsSubnetLabels=");
        m189p.append(this.f9470g);
        m189p.append(", dnsServerLabels=");
        m189p.append(this.f9471h);
        m189p.append(")");
        return m189p.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1467yn(String str, String str2, Double d7, List list, List list2, int i7) {
        this(str, str2, r3, "", r5, false, r12 != 0 ? r0 : list, (i7 & 128) != 0 ? r0 : list2);
        Double d8 = (i7 & 4) != 0 ? null : d7;
        boolean z7 = (i7 & 16) == 0;
        int i8 = i7 & 64;
        C1813u c1813u = C1813u.f10860e;
    }
}
