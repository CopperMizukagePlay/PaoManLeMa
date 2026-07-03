package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.om */
/* loaded from: classes.dex */
public final class C1156om {

    /* renamed from: a */
    public final boolean f6642a;

    /* renamed from: b */
    public final String f6643b;

    /* renamed from: c */
    public final String f6644c;

    /* renamed from: d */
    public final String f6645d;

    /* renamed from: e */
    public final EnumC1125nm f6646e;

    /* renamed from: f */
    public final int f6647f;

    /* renamed from: g */
    public final int f6648g;

    /* renamed from: h */
    public final boolean f6649h;

    /* renamed from: i */
    public final int f6650i;

    /* renamed from: j */
    public final int f6651j;

    /* renamed from: k */
    public final double f6652k;

    /* renamed from: l */
    public final double f6653l;

    /* renamed from: m */
    public final double f6654m;

    /* renamed from: n */
    public final double f6655n;

    /* renamed from: o */
    public final List f6656o;

    /* renamed from: p */
    public final String f6657p;

    /* renamed from: q */
    public final boolean f6658q;

    public /* synthetic */ C1156om(boolean z7, String str, String str2, EnumC1125nm enumC1125nm, int i7, int i8, boolean z8, String str3, boolean z9, int i9) {
        this((i9 & 1) != 0 ? false : z7, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? "" : str2, "", (i9 & 16) != 0 ? EnumC1125nm.f6344f : enumC1125nm, (i9 & 32) != 0 ? 443 : i7, (i9 & 64) != 0 ? 0 : i8, (i9 & 128) != 0 ? false : z8, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, C1813u.f10860e, (32768 & i9) != 0 ? "就绪" : str3, (i9 & 65536) != 0 ? true : z9);
    }

    /* renamed from: a */
    public static C1156om m2016a(C1156om c1156om, String str, int i7, int i8, double d7, double d8, double d9, double d10, List list, String str2, int i9) {
        boolean z7;
        String str3;
        int i10;
        int i11;
        double d11;
        double d12;
        double d13;
        double d14;
        List list2;
        String str4;
        if ((i9 & 1) != 0) {
            z7 = c1156om.f6642a;
        } else {
            z7 = false;
        }
        boolean z8 = z7;
        String str5 = c1156om.f6643b;
        String str6 = c1156om.f6644c;
        if ((i9 & 8) != 0) {
            str3 = c1156om.f6645d;
        } else {
            str3 = str;
        }
        EnumC1125nm enumC1125nm = c1156om.f6646e;
        int i12 = c1156om.f6647f;
        int i13 = c1156om.f6648g;
        boolean z9 = c1156om.f6649h;
        if ((i9 & 256) != 0) {
            i10 = c1156om.f6650i;
        } else {
            i10 = i7;
        }
        if ((i9 & 512) != 0) {
            i11 = c1156om.f6651j;
        } else {
            i11 = i8;
        }
        if ((i9 & 1024) != 0) {
            d11 = c1156om.f6652k;
        } else {
            d11 = d7;
        }
        if ((i9 & 2048) != 0) {
            d12 = c1156om.f6653l;
        } else {
            d12 = d8;
        }
        if ((i9 & 4096) != 0) {
            d13 = c1156om.f6654m;
        } else {
            d13 = d9;
        }
        if ((i9 & 8192) != 0) {
            d14 = c1156om.f6655n;
        } else {
            d14 = d10;
        }
        if ((i9 & 16384) != 0) {
            list2 = c1156om.f6656o;
        } else {
            list2 = list;
        }
        if ((i9 & 32768) != 0) {
            str4 = c1156om.f6657p;
        } else {
            str4 = str2;
        }
        boolean z10 = c1156om.f6658q;
        c1156om.getClass();
        AbstractC3367j.m5100e(str5, "target");
        AbstractC3367j.m5100e(str6, "resolvedAddress");
        AbstractC3367j.m5100e(str3, "resolvedGeo");
        AbstractC3367j.m5100e(enumC1125nm, "protocol");
        AbstractC3367j.m5100e(list2, "results");
        AbstractC3367j.m5100e(str4, "status");
        return new C1156om(z8, str5, str6, str3, enumC1125nm, i12, i13, z9, i10, i11, d11, d12, d13, d14, list2, str4, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156om)) {
            return false;
        }
        C1156om c1156om = (C1156om) obj;
        if (this.f6642a == c1156om.f6642a && AbstractC3367j.m5096a(this.f6643b, c1156om.f6643b) && AbstractC3367j.m5096a(this.f6644c, c1156om.f6644c) && AbstractC3367j.m5096a(this.f6645d, c1156om.f6645d) && this.f6646e == c1156om.f6646e && this.f6647f == c1156om.f6647f && this.f6648g == c1156om.f6648g && this.f6649h == c1156om.f6649h && this.f6650i == c1156om.f6650i && this.f6651j == c1156om.f6651j && Double.compare(this.f6652k, c1156om.f6652k) == 0 && Double.compare(this.f6653l, c1156om.f6653l) == 0 && Double.compare(this.f6654m, c1156om.f6654m) == 0 && Double.compare(this.f6655n, c1156om.f6655n) == 0 && AbstractC3367j.m5096a(this.f6656o, c1156om.f6656o) && AbstractC3367j.m5096a(this.f6657p, c1156om.f6657p) && this.f6658q == c1156om.f6658q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6658q) + AbstractC0094y0.m175b(AbstractC0094y0.m176c(this.f6656o, AbstractC0094y0.m174a(this.f6655n, AbstractC0094y0.m174a(this.f6654m, AbstractC0094y0.m174a(this.f6653l, AbstractC0094y0.m174a(this.f6652k, AbstractC2647h.m4255a(this.f6651j, AbstractC2647h.m4255a(this.f6650i, AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f6648g, AbstractC2647h.m4255a(this.f6647f, (this.f6646e.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(Boolean.hashCode(this.f6642a) * 31, 31, this.f6643b), 31, this.f6644c), 31, this.f6645d)) * 31, 31), 31), 31, this.f6649h), 31), 31), 31), 31), 31), 31), 31), 31, this.f6657p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PingSnapshot(running=");
        sb.append(this.f6642a);
        sb.append(", target=");
        sb.append(this.f6643b);
        sb.append(", resolvedAddress=");
        AbstractC2487d.m4057u(sb, this.f6644c, ", resolvedGeo=", this.f6645d, ", protocol=");
        sb.append(this.f6646e);
        sb.append(", tcpPort=");
        sb.append(this.f6647f);
        sb.append(", plannedCount=");
        sb.append(this.f6648g);
        sb.append(", continuous=");
        sb.append(this.f6649h);
        sb.append(", sent=");
        AbstractC0094y0.m192s(sb, this.f6650i, ", received=", this.f6651j, ", lossRate=");
        sb.append(this.f6652k);
        AbstractC0094y0.m193t(sb, ", minRttMs=", this.f6653l, ", maxRttMs=");
        sb.append(this.f6654m);
        AbstractC0094y0.m193t(sb, ", avgRttMs=", this.f6655n, ", results=");
        sb.append(this.f6656o);
        sb.append(", status=");
        sb.append(this.f6657p);
        sb.append(", icmpAvailable=");
        sb.append(this.f6658q);
        sb.append(")");
        return sb.toString();
    }

    public C1156om(boolean z7, String str, String str2, String str3, EnumC1125nm enumC1125nm, int i7, int i8, boolean z8, int i9, int i10, double d7, double d8, double d9, double d10, List list, String str4, boolean z9) {
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str2, "resolvedAddress");
        AbstractC3367j.m5100e(str3, "resolvedGeo");
        AbstractC3367j.m5100e(enumC1125nm, "protocol");
        AbstractC3367j.m5100e(str4, "status");
        this.f6642a = z7;
        this.f6643b = str;
        this.f6644c = str2;
        this.f6645d = str3;
        this.f6646e = enumC1125nm;
        this.f6647f = i7;
        this.f6648g = i8;
        this.f6649h = z8;
        this.f6650i = i9;
        this.f6651j = i10;
        this.f6652k = d7;
        this.f6653l = d8;
        this.f6654m = d9;
        this.f6655n = d10;
        this.f6656o = list;
        this.f6657p = str4;
        this.f6658q = z9;
    }
}
