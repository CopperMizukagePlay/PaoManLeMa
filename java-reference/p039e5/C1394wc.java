package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wc */
/* loaded from: classes.dex */
public final class C1394wc {

    /* renamed from: a */
    public final EnumC1363vc f8325a;

    /* renamed from: b */
    public final boolean f8326b;

    /* renamed from: c */
    public final String f8327c;

    /* renamed from: d */
    public final EnumC1332uc f8328d;

    /* renamed from: e */
    public final EnumC0803dc f8329e;

    /* renamed from: f */
    public final int f8330f;

    /* renamed from: g */
    public final List f8331g;

    /* renamed from: h */
    public final String f8332h;

    /* renamed from: i */
    public final String f8333i;

    /* renamed from: j */
    public final int f8334j;

    /* renamed from: k */
    public final int f8335k;

    /* renamed from: l */
    public final int f8336l;

    /* renamed from: m */
    public final double f8337m;

    /* renamed from: n */
    public final double f8338n;

    /* renamed from: o */
    public final double f8339o;

    /* renamed from: p */
    public final double f8340p;

    /* renamed from: q */
    public final long f8341q;

    /* renamed from: r */
    public final long f8342r;

    /* renamed from: s */
    public final List f8343s;

    /* renamed from: t */
    public final String f8344t;

    /* renamed from: u */
    public final String f8345u;

    public C1394wc(EnumC1363vc enumC1363vc, boolean z7, String str, EnumC1332uc enumC1332uc, EnumC0803dc enumC0803dc, int i7, List list, String str2, String str3, int i8, int i9, int i10, double d7, double d8, double d9, double d10, long j6, long j7, List list2, String str4, String str5) {
        AbstractC3367j.m5100e(enumC1363vc, "role");
        AbstractC3367j.m5100e(str, "status");
        AbstractC3367j.m5100e(enumC1332uc, "protocol");
        AbstractC3367j.m5100e(enumC0803dc, "direction");
        AbstractC3367j.m5100e(list, "localAddresses");
        AbstractC3367j.m5100e(str2, "connectPayload");
        AbstractC3367j.m5100e(str3, "peerInfo");
        this.f8325a = enumC1363vc;
        this.f8326b = z7;
        this.f8327c = str;
        this.f8328d = enumC1332uc;
        this.f8329e = enumC0803dc;
        this.f8330f = i7;
        this.f8331g = list;
        this.f8332h = str2;
        this.f8333i = str3;
        this.f8334j = i8;
        this.f8335k = i9;
        this.f8336l = i10;
        this.f8337m = d7;
        this.f8338n = d8;
        this.f8339o = d9;
        this.f8340p = d10;
        this.f8341q = j6;
        this.f8342r = j7;
        this.f8343s = list2;
        this.f8344t = str4;
        this.f8345u = str5;
    }

    /* renamed from: a */
    public static C1394wc m2374a(C1394wc c1394wc, String str, EnumC1332uc enumC1332uc, EnumC0803dc enumC0803dc, String str2, int i7, int i8, double d7, double d8, double d9, double d10, long j6, long j7, List list, String str3, String str4, int i9) {
        EnumC1363vc enumC1363vc = c1394wc.f8325a;
        boolean z7 = (i9 & 2) != 0 ? c1394wc.f8326b : false;
        String str5 = (i9 & 4) != 0 ? c1394wc.f8327c : str;
        EnumC1332uc enumC1332uc2 = (i9 & 8) != 0 ? c1394wc.f8328d : enumC1332uc;
        EnumC0803dc enumC0803dc2 = (i9 & 16) != 0 ? c1394wc.f8329e : enumC0803dc;
        int i10 = c1394wc.f8330f;
        List list2 = c1394wc.f8331g;
        String str6 = c1394wc.f8332h;
        String str7 = (i9 & 256) != 0 ? c1394wc.f8333i : str2;
        int i11 = (i9 & 512) != 0 ? c1394wc.f8334j : i7;
        int i12 = (i9 & 1024) != 0 ? c1394wc.f8335k : i8;
        int i13 = c1394wc.f8336l;
        double d11 = (i9 & 4096) != 0 ? c1394wc.f8337m : d7;
        boolean z8 = z7;
        int i14 = i11;
        int i15 = i12;
        double d12 = (i9 & 8192) != 0 ? c1394wc.f8338n : d8;
        double d13 = (i9 & 16384) != 0 ? c1394wc.f8339o : d9;
        double d14 = (32768 & i9) != 0 ? c1394wc.f8340p : d10;
        long j8 = (65536 & i9) != 0 ? c1394wc.f8341q : j6;
        long j9 = (131072 & i9) != 0 ? c1394wc.f8342r : j7;
        List list3 = (262144 & i9) != 0 ? c1394wc.f8343s : list;
        String str8 = (524288 & i9) != 0 ? c1394wc.f8344t : str3;
        String str9 = (i9 & 1048576) != 0 ? c1394wc.f8345u : str4;
        c1394wc.getClass();
        AbstractC3367j.m5100e(enumC1363vc, "role");
        AbstractC3367j.m5100e(str5, "status");
        AbstractC3367j.m5100e(enumC1332uc2, "protocol");
        AbstractC3367j.m5100e(enumC0803dc2, "direction");
        AbstractC3367j.m5100e(list2, "localAddresses");
        AbstractC3367j.m5100e(str6, "connectPayload");
        AbstractC3367j.m5100e(str7, "peerInfo");
        AbstractC3367j.m5100e(list3, "intervals");
        AbstractC3367j.m5100e(str8, "summary");
        AbstractC3367j.m5100e(str9, "error");
        return new C1394wc(enumC1363vc, z8, str5, enumC1332uc2, enumC0803dc2, i10, list2, str6, str7, i14, i15, i13, d11, d12, d13, d14, j8, j9, list3, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1394wc)) {
            return false;
        }
        C1394wc c1394wc = (C1394wc) obj;
        if (this.f8325a == c1394wc.f8325a && this.f8326b == c1394wc.f8326b && AbstractC3367j.m5096a(this.f8327c, c1394wc.f8327c) && this.f8328d == c1394wc.f8328d && this.f8329e == c1394wc.f8329e && this.f8330f == c1394wc.f8330f && AbstractC3367j.m5096a(this.f8331g, c1394wc.f8331g) && AbstractC3367j.m5096a(this.f8332h, c1394wc.f8332h) && AbstractC3367j.m5096a(this.f8333i, c1394wc.f8333i) && this.f8334j == c1394wc.f8334j && this.f8335k == c1394wc.f8335k && this.f8336l == c1394wc.f8336l && Double.compare(this.f8337m, c1394wc.f8337m) == 0 && Double.compare(this.f8338n, c1394wc.f8338n) == 0 && Double.compare(this.f8339o, c1394wc.f8339o) == 0 && Double.compare(this.f8340p, c1394wc.f8340p) == 0 && this.f8341q == c1394wc.f8341q && this.f8342r == c1394wc.f8342r && AbstractC3367j.m5096a(this.f8343s, c1394wc.f8343s) && AbstractC3367j.m5096a(this.f8344t, c1394wc.f8344t) && AbstractC3367j.m5096a(this.f8345u, c1394wc.f8345u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8345u.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m176c(this.f8343s, AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC0094y0.m174a(this.f8340p, AbstractC0094y0.m174a(this.f8339o, AbstractC0094y0.m174a(this.f8338n, AbstractC0094y0.m174a(this.f8337m, AbstractC2647h.m4255a(this.f8336l, AbstractC2647h.m4255a(this.f8335k, AbstractC2647h.m4255a(this.f8334j, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m176c(this.f8331g, AbstractC2647h.m4255a(this.f8330f, (this.f8329e.hashCode() + ((this.f8328d.hashCode() + AbstractC0094y0.m175b(AbstractC2487d.m4040d(this.f8325a.hashCode() * 31, 31, this.f8326b), 31, this.f8327c)) * 31)) * 31, 31), 31), 31, this.f8332h), 31, this.f8333i), 31), 31), 31), 31), 31), 31), 31), 31, this.f8341q), 31, this.f8342r), 31), 31, this.f8344t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Iperf3Snapshot(role=");
        sb.append(this.f8325a);
        sb.append(", running=");
        sb.append(this.f8326b);
        sb.append(", status=");
        sb.append(this.f8327c);
        sb.append(", protocol=");
        sb.append(this.f8328d);
        sb.append(", direction=");
        sb.append(this.f8329e);
        sb.append(", serverPort=");
        sb.append(this.f8330f);
        sb.append(", localAddresses=");
        sb.append(this.f8331g);
        sb.append(", connectPayload=");
        sb.append(this.f8332h);
        sb.append(", peerInfo=");
        sb.append(this.f8333i);
        sb.append(", streams=");
        sb.append(this.f8334j);
        sb.append(", durationSec=");
        AbstractC0094y0.m192s(sb, this.f8335k, ", intervalSec=", this.f8336l, ", uploadBps=");
        sb.append(this.f8337m);
        AbstractC0094y0.m193t(sb, ", downloadBps=", this.f8338n, ", totalBps=");
        sb.append(this.f8339o);
        AbstractC0094y0.m193t(sb, ", elapsedSec=", this.f8340p, ", bytesSent=");
        sb.append(this.f8341q);
        AbstractC2487d.m4056t(sb, ", bytesReceived=", this.f8342r, ", intervals=");
        sb.append(this.f8343s);
        sb.append(", summary=");
        sb.append(this.f8344t);
        sb.append(", error=");
        return AbstractC2487d.m4046j(sb, this.f8345u, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1394wc(EnumC1363vc enumC1363vc, String str, EnumC1332uc enumC1332uc, EnumC0803dc enumC0803dc, int i7, List list, String str2, String str3, int i8, int i9, int i10, int i11) {
        this(r3, r4, r5, r6, r7, r8, r1 != 0 ? r27 : list, (i11 & 128) != 0 ? "" : str2, (i11 & 256) != 0 ? "" : str3, (i11 & 512) != 0 ? 1 : i8, (i11 & 1024) != 0 ? 10 : i9, (i11 & 2048) != 0 ? 1 : i10, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, r27, "", "");
        EnumC1363vc enumC1363vc2 = (i11 & 1) != 0 ? EnumC1363vc.f8155g : enumC1363vc;
        boolean z7 = (i11 & 2) == 0;
        String str4 = (i11 & 4) != 0 ? "就绪" : str;
        EnumC1332uc enumC1332uc2 = (i11 & 8) != 0 ? EnumC1332uc.f7919f : enumC1332uc;
        EnumC0803dc enumC0803dc2 = (i11 & 16) != 0 ? EnumC0803dc.f3385f : enumC0803dc;
        int i12 = (i11 & 32) != 0 ? 5201 : i7;
        int i13 = i11 & 64;
        C1813u c1813u = C1813u.f10860e;
    }
}
