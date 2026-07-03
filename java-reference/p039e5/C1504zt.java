package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zt */
/* loaded from: classes.dex */
public final class C1504zt {

    /* renamed from: a */
    public final boolean f9978a;

    /* renamed from: b */
    public final String f9979b;

    /* renamed from: c */
    public final String f9980c;

    /* renamed from: d */
    public final EnumC1163ot f9981d;

    /* renamed from: e */
    public final int f9982e;

    /* renamed from: f */
    public final int f9983f;

    /* renamed from: g */
    public final List f9984g;

    /* renamed from: h */
    public final String f9985h;

    /* renamed from: i */
    public final String f9986i;

    /* renamed from: j */
    public final EnumC1465yl f9987j;

    /* renamed from: k */
    public final String f9988k;

    public /* synthetic */ C1504zt(String str, String str2, EnumC1163ot enumC1163ot, int i7, int i8, List list, String str3, String str4, EnumC1465yl enumC1465yl, String str5, int i9) {
        this((i9 & 1) == 0, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? "" : str2, (i9 & 8) != 0 ? EnumC1163ot.f6736g : enumC1163ot, (i9 & 16) != 0 ? 30 : i7, (i9 & 32) != 0 ? 0 : i8, (i9 & 64) != 0 ? C1813u.f10860e : list, (i9 & 128) != 0 ? "" : str3, (i9 & 256) != 0 ? "就绪" : str4, (i9 & 512) != 0 ? EnumC1465yl.f9455e : enumC1465yl, (i9 & 1024) != 0 ? "api.nxtrace.org" : str5);
    }

    /* renamed from: a */
    public static C1504zt m2438a(C1504zt c1504zt, String str, int i7, List list, String str2, String str3, int i8) {
        boolean z7;
        String str4;
        int i9;
        List list2;
        String str5;
        String str6;
        if ((i8 & 1) != 0) {
            z7 = c1504zt.f9978a;
        } else {
            z7 = false;
        }
        boolean z8 = z7;
        String str7 = c1504zt.f9979b;
        if ((i8 & 4) != 0) {
            str4 = c1504zt.f9980c;
        } else {
            str4 = str;
        }
        EnumC1163ot enumC1163ot = c1504zt.f9981d;
        int i10 = c1504zt.f9982e;
        if ((i8 & 32) != 0) {
            i9 = c1504zt.f9983f;
        } else {
            i9 = i7;
        }
        if ((i8 & 64) != 0) {
            list2 = c1504zt.f9984g;
        } else {
            list2 = list;
        }
        if ((i8 & 128) != 0) {
            str5 = c1504zt.f9985h;
        } else {
            str5 = str2;
        }
        if ((i8 & 256) != 0) {
            str6 = c1504zt.f9986i;
        } else {
            str6 = str3;
        }
        EnumC1465yl enumC1465yl = c1504zt.f9987j;
        String str8 = c1504zt.f9988k;
        c1504zt.getClass();
        AbstractC3367j.m5100e(str7, "target");
        AbstractC3367j.m5100e(str4, "resolvedIp");
        AbstractC3367j.m5100e(enumC1163ot, "protocol");
        AbstractC3367j.m5100e(list2, "hops");
        AbstractC3367j.m5100e(str5, "traceMapUrl");
        AbstractC3367j.m5100e(str6, "status");
        AbstractC3367j.m5100e(enumC1465yl, "serverMode");
        AbstractC3367j.m5100e(str8, "apiServer");
        return new C1504zt(z8, str7, str4, enumC1163ot, i10, i9, list2, str5, str6, enumC1465yl, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1504zt)) {
            return false;
        }
        C1504zt c1504zt = (C1504zt) obj;
        if (this.f9978a == c1504zt.f9978a && AbstractC3367j.m5096a(this.f9979b, c1504zt.f9979b) && AbstractC3367j.m5096a(this.f9980c, c1504zt.f9980c) && this.f9981d == c1504zt.f9981d && this.f9982e == c1504zt.f9982e && this.f9983f == c1504zt.f9983f && AbstractC3367j.m5096a(this.f9984g, c1504zt.f9984g) && AbstractC3367j.m5096a(this.f9985h, c1504zt.f9985h) && AbstractC3367j.m5096a(this.f9986i, c1504zt.f9986i) && this.f9987j == c1504zt.f9987j && AbstractC3367j.m5096a(this.f9988k, c1504zt.f9988k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9988k.hashCode() + ((this.f9987j.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m176c(this.f9984g, AbstractC2647h.m4255a(this.f9983f, AbstractC2647h.m4255a(this.f9982e, (this.f9981d.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(Boolean.hashCode(this.f9978a) * 31, 31, this.f9979b), 31, this.f9980c)) * 31, 31), 31), 31), 31, this.f9985h), 31, this.f9986i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraceRouteSnapshot(running=");
        sb.append(this.f9978a);
        sb.append(", target=");
        sb.append(this.f9979b);
        sb.append(", resolvedIp=");
        sb.append(this.f9980c);
        sb.append(", protocol=");
        sb.append(this.f9981d);
        sb.append(", maxHops=");
        AbstractC0094y0.m192s(sb, this.f9982e, ", currentHop=", this.f9983f, ", hops=");
        sb.append(this.f9984g);
        sb.append(", traceMapUrl=");
        sb.append(this.f9985h);
        sb.append(", status=");
        sb.append(this.f9986i);
        sb.append(", serverMode=");
        sb.append(this.f9987j);
        sb.append(", apiServer=");
        return AbstractC2487d.m4046j(sb, this.f9988k, ")");
    }

    public C1504zt(boolean z7, String str, String str2, EnumC1163ot enumC1163ot, int i7, int i8, List list, String str3, String str4, EnumC1465yl enumC1465yl, String str5) {
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str2, "resolvedIp");
        AbstractC3367j.m5100e(enumC1163ot, "protocol");
        AbstractC3367j.m5100e(list, "hops");
        AbstractC3367j.m5100e(str3, "traceMapUrl");
        AbstractC3367j.m5100e(str4, "status");
        AbstractC3367j.m5100e(enumC1465yl, "serverMode");
        AbstractC3367j.m5100e(str5, "apiServer");
        this.f9978a = z7;
        this.f9979b = str;
        this.f9980c = str2;
        this.f9981d = enumC1163ot;
        this.f9982e = i7;
        this.f9983f = i8;
        this.f9984g = list;
        this.f9985h = str3;
        this.f9986i = str4;
        this.f9987j = enumC1465yl;
        this.f9988k = str5;
    }
}
