package p039e5;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d9 */
/* loaded from: classes.dex */
public final class C0800d9 {

    /* renamed from: a */
    public final String f3340a;

    /* renamed from: b */
    public final String f3341b;

    /* renamed from: c */
    public final String f3342c;

    /* renamed from: d */
    public final Map f3343d;

    /* renamed from: e */
    public final List f3344e;

    /* renamed from: f */
    public final EnumC0704a9 f3345f;

    /* renamed from: g */
    public final int f3346g;

    /* renamed from: h */
    public final int f3347h;

    /* renamed from: i */
    public final EnumC1452y8 f3348i;

    /* renamed from: j */
    public final int f3349j;

    /* renamed from: k */
    public final int f3350k;

    /* renamed from: l */
    public final EnumC0768c9 f3351l;

    /* renamed from: m */
    public final long f3352m;

    /* renamed from: n */
    public final long f3353n;

    /* renamed from: o */
    public final long f3354o;

    /* renamed from: p */
    public final boolean f3355p;

    /* renamed from: q */
    public final int f3356q;

    /* renamed from: r */
    public final String f3357r;

    /* renamed from: s */
    public final long f3358s;

    /* renamed from: t */
    public final long f3359t;

    /* renamed from: u */
    public final String f3360u;

    /* renamed from: v */
    public final String f3361v;

    public C0800d9(String str, String str2, String str3, Map map, List list, EnumC0704a9 enumC0704a9, int i7, int i8, EnumC1452y8 enumC1452y8, int i9, int i10, EnumC0768c9 enumC0768c9, long j6, long j7, long j8, boolean z7, int i11, String str4, long j9, long j10, String str5, String str6) {
        AbstractC3367j.m5100e(str, "id");
        AbstractC3367j.m5100e(str2, "url");
        AbstractC3367j.m5100e(str3, "fileName");
        AbstractC3367j.m5100e(enumC0704a9, "networkStack");
        AbstractC3367j.m5100e(enumC1452y8, "httpProtocol");
        AbstractC3367j.m5100e(enumC0768c9, "status");
        AbstractC3367j.m5100e(str4, "error");
        AbstractC3367j.m5100e(str5, "outputUri");
        AbstractC3367j.m5100e(str6, "workingUri");
        this.f3340a = str;
        this.f3341b = str2;
        this.f3342c = str3;
        this.f3343d = map;
        this.f3344e = list;
        this.f3345f = enumC0704a9;
        this.f3346g = i7;
        this.f3347h = i8;
        this.f3348i = enumC1452y8;
        this.f3349j = i9;
        this.f3350k = i10;
        this.f3351l = enumC0768c9;
        this.f3352m = j6;
        this.f3353n = j7;
        this.f3354o = j8;
        this.f3355p = z7;
        this.f3356q = i11;
        this.f3357r = str4;
        this.f3358s = j9;
        this.f3359t = j10;
        this.f3360u = str5;
        this.f3361v = str6;
    }

    /* renamed from: a */
    public static C0800d9 m1498a(C0800d9 c0800d9, String str, List list, EnumC0768c9 enumC0768c9, long j6, long j7, long j8, boolean z7, String str2, long j9, String str3, String str4, int i7) {
        String str5;
        List list2;
        EnumC0768c9 enumC0768c92;
        long j10;
        int i8;
        int i9;
        long j11;
        long j12;
        boolean z8;
        String str6;
        long j13;
        String str7;
        String str8;
        String str9 = c0800d9.f3340a;
        String str10 = c0800d9.f3341b;
        if ((i7 & 4) != 0) {
            str5 = c0800d9.f3342c;
        } else {
            str5 = str;
        }
        Map map = c0800d9.f3343d;
        if ((i7 & 16) != 0) {
            list2 = c0800d9.f3344e;
        } else {
            list2 = list;
        }
        EnumC0704a9 enumC0704a9 = c0800d9.f3345f;
        int i10 = c0800d9.f3346g;
        int i11 = c0800d9.f3347h;
        EnumC1452y8 enumC1452y8 = c0800d9.f3348i;
        int i12 = c0800d9.f3349j;
        int i13 = c0800d9.f3350k;
        if ((i7 & 2048) != 0) {
            enumC0768c92 = c0800d9.f3351l;
        } else {
            enumC0768c92 = enumC0768c9;
        }
        if ((i7 & 4096) != 0) {
            j10 = c0800d9.f3352m;
        } else {
            j10 = j6;
        }
        if ((i7 & 8192) != 0) {
            i8 = i12;
            i9 = i13;
            j11 = c0800d9.f3353n;
        } else {
            i8 = i12;
            i9 = i13;
            j11 = j7;
        }
        int i14 = i8;
        long j14 = j11;
        if ((i7 & 16384) != 0) {
            j12 = c0800d9.f3354o;
        } else {
            j12 = j8;
        }
        if ((32768 & i7) != 0) {
            z8 = c0800d9.f3355p;
        } else {
            z8 = z7;
        }
        int i15 = c0800d9.f3356q;
        if ((i7 & 131072) != 0) {
            str6 = c0800d9.f3357r;
        } else {
            str6 = str2;
        }
        long j15 = j12;
        long j16 = c0800d9.f3358s;
        if ((i7 & 524288) != 0) {
            j13 = c0800d9.f3359t;
        } else {
            j13 = j9;
        }
        if ((i7 & 1048576) != 0) {
            str7 = c0800d9.f3360u;
        } else {
            str7 = str3;
        }
        if ((i7 & 2097152) != 0) {
            str8 = c0800d9.f3361v;
        } else {
            str8 = str4;
        }
        c0800d9.getClass();
        AbstractC3367j.m5100e(str9, "id");
        AbstractC3367j.m5100e(str10, "url");
        AbstractC3367j.m5100e(str5, "fileName");
        AbstractC3367j.m5100e(map, "headers");
        AbstractC3367j.m5100e(list2, "selectedAddresses");
        AbstractC3367j.m5100e(enumC0704a9, "networkStack");
        AbstractC3367j.m5100e(enumC1452y8, "httpProtocol");
        AbstractC3367j.m5100e(enumC0768c92, "status");
        AbstractC3367j.m5100e(str6, "error");
        AbstractC3367j.m5100e(str7, "outputUri");
        AbstractC3367j.m5100e(str8, "workingUri");
        String str11 = str8;
        return new C0800d9(str9, str10, str5, map, list2, enumC0704a9, i10, i11, enumC1452y8, i14, i9, enumC0768c92, j10, j14, j15, z8, i15, str6, j16, j13, str7, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800d9)) {
            return false;
        }
        C0800d9 c0800d9 = (C0800d9) obj;
        if (AbstractC3367j.m5096a(this.f3340a, c0800d9.f3340a) && AbstractC3367j.m5096a(this.f3341b, c0800d9.f3341b) && AbstractC3367j.m5096a(this.f3342c, c0800d9.f3342c) && AbstractC3367j.m5096a(this.f3343d, c0800d9.f3343d) && AbstractC3367j.m5096a(this.f3344e, c0800d9.f3344e) && this.f3345f == c0800d9.f3345f && this.f3346g == c0800d9.f3346g && this.f3347h == c0800d9.f3347h && this.f3348i == c0800d9.f3348i && this.f3349j == c0800d9.f3349j && this.f3350k == c0800d9.f3350k && this.f3351l == c0800d9.f3351l && this.f3352m == c0800d9.f3352m && this.f3353n == c0800d9.f3353n && this.f3354o == c0800d9.f3354o && this.f3355p == c0800d9.f3355p && this.f3356q == c0800d9.f3356q && AbstractC3367j.m5096a(this.f3357r, c0800d9.f3357r) && this.f3358s == c0800d9.f3358s && this.f3359t == c0800d9.f3359t && AbstractC3367j.m5096a(this.f3360u, c0800d9.f3360u) && AbstractC3367j.m5096a(this.f3361v, c0800d9.f3361v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3361v.hashCode() + AbstractC0094y0.m175b(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC0094y0.m175b(AbstractC2647h.m4255a(this.f3356q, AbstractC2487d.m4040d(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c((this.f3351l.hashCode() + AbstractC2647h.m4255a(this.f3350k, AbstractC2647h.m4255a(this.f3349j, (this.f3348i.hashCode() + AbstractC2647h.m4255a(this.f3347h, AbstractC2647h.m4255a(this.f3346g, (this.f3345f.hashCode() + AbstractC0094y0.m176c(this.f3344e, (this.f3343d.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f3340a.hashCode() * 31, 31, this.f3341b), 31, this.f3342c)) * 31, 31)) * 31, 31), 31)) * 31, 31), 31)) * 31, 31, this.f3352m), 31, this.f3353n), 31, this.f3354o), 31, this.f3355p), 31), 31, this.f3357r), 31, this.f3358s), 31, this.f3359t), 31, this.f3360u);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("DownloadTask(id=", this.f3340a, ", url=", this.f3341b, ", fileName=");
        m189p.append(this.f3342c);
        m189p.append(", headers=");
        m189p.append(this.f3343d);
        m189p.append(", selectedAddresses=");
        m189p.append(this.f3344e);
        m189p.append(", networkStack=");
        m189p.append(this.f3345f);
        m189p.append(", workersPerServer=");
        AbstractC0094y0.m192s(m189p, this.f3346g, ", maxWorkers=", this.f3347h, ", httpProtocol=");
        m189p.append(this.f3348i);
        m189p.append(", bufferSizeKb=");
        m189p.append(this.f3349j);
        m189p.append(", maxTailHedges=");
        m189p.append(this.f3350k);
        m189p.append(", status=");
        m189p.append(this.f3351l);
        m189p.append(", totalBytes=");
        m189p.append(this.f3352m);
        AbstractC2487d.m4056t(m189p, ", downloadedBytes=", this.f3353n, ", speedBytesPerSecond=");
        m189p.append(this.f3354o);
        m189p.append(", supportsResume=");
        m189p.append(this.f3355p);
        m189p.append(", threadCount=");
        m189p.append(this.f3356q);
        m189p.append(", error=");
        m189p.append(this.f3357r);
        AbstractC2487d.m4056t(m189p, ", createdAt=", this.f3358s, ", completedAt=");
        m189p.append(this.f3359t);
        m189p.append(", outputUri=");
        m189p.append(this.f3360u);
        m189p.append(", workingUri=");
        m189p.append(this.f3361v);
        m189p.append(")");
        return m189p.toString();
    }

    public /* synthetic */ C0800d9(String str, String str2, String str3, Map map, List list, EnumC0704a9 enumC0704a9, int i7, int i8, EnumC1452y8 enumC1452y8, int i9, int i10, EnumC0768c9 enumC0768c9, long j6, long j7, boolean z7, int i11, String str4, long j8, long j9, String str5, String str6, int i12) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, map, list, enumC0704a9, i7, i8, enumC1452y8, i9, i10, (i12 & 2048) != 0 ? EnumC0768c9.f3005e : enumC0768c9, (i12 & 4096) != 0 ? -1L : j6, (i12 & 8192) != 0 ? 0L : j7, 0L, (32768 & i12) != 0 ? false : z7, i11, (131072 & i12) != 0 ? "" : str4, (262144 & i12) != 0 ? System.currentTimeMillis() : j8, (524288 & i12) != 0 ? 0L : j9, (1048576 & i12) != 0 ? "" : str5, (i12 & 2097152) != 0 ? "" : str6);
    }
}
