package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nt */
/* loaded from: classes.dex */
public final class C1132nt {

    /* renamed from: a */
    public final int f6404a;

    /* renamed from: b */
    public final String f6405b;

    /* renamed from: c */
    public final String f6406c;

    /* renamed from: d */
    public final List f6407d;

    /* renamed from: e */
    public final double f6408e;

    /* renamed from: f */
    public final String f6409f;

    /* renamed from: g */
    public final String f6410g;

    /* renamed from: h */
    public final boolean f6411h;

    public C1132nt(int i7, String str, String str2, List list, double d7, String str3, String str4, boolean z7) {
        AbstractC3367j.m5100e(str, "ip");
        AbstractC3367j.m5100e(str2, "hostname");
        AbstractC3367j.m5100e(list, "rttMs");
        AbstractC3367j.m5100e(str3, "geo");
        AbstractC3367j.m5100e(str4, "asInfo");
        this.f6404a = i7;
        this.f6405b = str;
        this.f6406c = str2;
        this.f6407d = list;
        this.f6408e = d7;
        this.f6409f = str3;
        this.f6410g = str4;
        this.f6411h = z7;
    }

    /* renamed from: a */
    public static C1132nt m2012a(C1132nt c1132nt, String str, String str2, boolean z7, int i7) {
        int i8 = c1132nt.f6404a;
        String str3 = c1132nt.f6405b;
        String str4 = c1132nt.f6406c;
        List list = c1132nt.f6407d;
        double d7 = c1132nt.f6408e;
        if ((i7 & 32) != 0) {
            str = c1132nt.f6409f;
        }
        String str5 = str;
        if ((i7 & 64) != 0) {
            str2 = c1132nt.f6410g;
        }
        String str6 = str2;
        if ((i7 & 128) != 0) {
            z7 = c1132nt.f6411h;
        }
        c1132nt.getClass();
        AbstractC3367j.m5100e(str3, "ip");
        AbstractC3367j.m5100e(str4, "hostname");
        AbstractC3367j.m5100e(list, "rttMs");
        AbstractC3367j.m5100e(str5, "geo");
        AbstractC3367j.m5100e(str6, "asInfo");
        return new C1132nt(i8, str3, str4, list, d7, str5, str6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132nt)) {
            return false;
        }
        C1132nt c1132nt = (C1132nt) obj;
        if (this.f6404a == c1132nt.f6404a && AbstractC3367j.m5096a(this.f6405b, c1132nt.f6405b) && AbstractC3367j.m5096a(this.f6406c, c1132nt.f6406c) && AbstractC3367j.m5096a(this.f6407d, c1132nt.f6407d) && Double.compare(this.f6408e, c1132nt.f6408e) == 0 && AbstractC3367j.m5096a(this.f6409f, c1132nt.f6409f) && AbstractC3367j.m5096a(this.f6410g, c1132nt.f6410g) && this.f6411h == c1132nt.f6411h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6411h) + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m174a(this.f6408e, AbstractC0094y0.m176c(this.f6407d, AbstractC0094y0.m175b(AbstractC0094y0.m175b(Integer.hashCode(this.f6404a) * 31, 31, this.f6405b), 31, this.f6406c), 31), 31), 31, this.f6409f), 31, this.f6410g);
    }

    public final String toString() {
        return "TraceHopResult(ttl=" + this.f6404a + ", ip=" + this.f6405b + ", hostname=" + this.f6406c + ", rttMs=" + this.f6407d + ", lossRate=" + this.f6408e + ", geo=" + this.f6409f + ", asInfo=" + this.f6410g + ", isDestination=" + this.f6411h + ")";
    }
}
