package p039e5;

import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sn */
/* loaded from: classes.dex */
public final class C1281sn {

    /* renamed from: a */
    public final boolean f7626a;

    /* renamed from: b */
    public final String f7627b;

    /* renamed from: c */
    public final String f7628c;

    /* renamed from: d */
    public final int f7629d;

    /* renamed from: e */
    public final int f7630e;

    /* renamed from: f */
    public final int f7631f;

    /* renamed from: g */
    public final int f7632g;

    /* renamed from: h */
    public final int f7633h;

    /* renamed from: i */
    public final int f7634i;

    /* renamed from: j */
    public final int f7635j;

    /* renamed from: k */
    public final int f7636k;

    /* renamed from: l */
    public final int f7637l;

    /* renamed from: m */
    public final int f7638m;

    /* renamed from: n */
    public final int f7639n;

    /* renamed from: o */
    public final int f7640o;

    /* renamed from: p */
    public final long f7641p;

    /* renamed from: q */
    public final String f7642q;

    /* renamed from: r */
    public final List f7643r;

    public /* synthetic */ C1281sn(String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str2, int i14) {
        this((i14 & 1) == 0, (i14 & 2) != 0 ? "" : str, "", (i14 & 8) != 0 ? 443 : i7, (i14 & 16) != 0 ? 1000 : i8, (i14 & 32) != 0 ? 50 : i9, (i14 & 64) != 0 ? 30 : i10, (i14 & 128) != 0 ? 3000 : i11, (i14 & 256) != 0 ? 100 : i12, (i14 & 512) != 0 ? 100 : i13, 0, 0, 0, 0, 0, 0L, (i14 & 65536) != 0 ? "就绪" : str2, C1813u.f10860e);
    }

    /* renamed from: a */
    public static C1281sn m2332a(C1281sn c1281sn, String str, int i7, int i8, int i9, int i10, int i11, long j6, String str2, ArrayList arrayList, int i12) {
        boolean z7;
        String str3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j7;
        String str4;
        List list;
        if ((i12 & 1) != 0) {
            z7 = c1281sn.f7626a;
        } else {
            z7 = false;
        }
        boolean z8 = z7;
        String str5 = c1281sn.f7627b;
        if ((i12 & 4) != 0) {
            str3 = c1281sn.f7628c;
        } else {
            str3 = str;
        }
        int i18 = c1281sn.f7629d;
        int i19 = c1281sn.f7630e;
        int i20 = c1281sn.f7631f;
        int i21 = c1281sn.f7632g;
        int i22 = c1281sn.f7633h;
        int i23 = c1281sn.f7634i;
        int i24 = c1281sn.f7635j;
        if ((i12 & 1024) != 0) {
            i13 = c1281sn.f7636k;
        } else {
            i13 = i7;
        }
        if ((i12 & 2048) != 0) {
            i14 = c1281sn.f7637l;
        } else {
            i14 = i8;
        }
        if ((i12 & 4096) != 0) {
            i15 = c1281sn.f7638m;
        } else {
            i15 = i9;
        }
        if ((i12 & 8192) != 0) {
            i16 = c1281sn.f7639n;
        } else {
            i16 = i10;
        }
        if ((i12 & 16384) != 0) {
            i17 = c1281sn.f7640o;
        } else {
            i17 = i11;
        }
        if ((32768 & i12) != 0) {
            j7 = c1281sn.f7641p;
        } else {
            j7 = j6;
        }
        if ((65536 & i12) != 0) {
            str4 = c1281sn.f7642q;
        } else {
            str4 = str2;
        }
        if ((i12 & 131072) != 0) {
            list = c1281sn.f7643r;
        } else {
            list = arrayList;
        }
        c1281sn.getClass();
        AbstractC3367j.m5100e(str5, "target");
        AbstractC3367j.m5100e(str3, "resolvedAddress");
        AbstractC3367j.m5100e(str4, "status");
        AbstractC3367j.m5100e(list, "events");
        return new C1281sn(z8, str5, str3, i18, i19, i20, i21, i22, i23, i24, i13, i14, i15, i16, i17, j7, str4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281sn)) {
            return false;
        }
        C1281sn c1281sn = (C1281sn) obj;
        if (this.f7626a == c1281sn.f7626a && AbstractC3367j.m5096a(this.f7627b, c1281sn.f7627b) && AbstractC3367j.m5096a(this.f7628c, c1281sn.f7628c) && this.f7629d == c1281sn.f7629d && this.f7630e == c1281sn.f7630e && this.f7631f == c1281sn.f7631f && this.f7632g == c1281sn.f7632g && this.f7633h == c1281sn.f7633h && this.f7634i == c1281sn.f7634i && this.f7635j == c1281sn.f7635j && this.f7636k == c1281sn.f7636k && this.f7637l == c1281sn.f7637l && this.f7638m == c1281sn.f7638m && this.f7639n == c1281sn.f7639n && this.f7640o == c1281sn.f7640o && this.f7641p == c1281sn.f7641p && AbstractC3367j.m5096a(this.f7642q, c1281sn.f7642q) && AbstractC3367j.m5096a(this.f7643r, c1281sn.f7643r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7643r.hashCode() + AbstractC0094y0.m175b(AbstractC2487d.m4039c(AbstractC2647h.m4255a(this.f7640o, AbstractC2647h.m4255a(this.f7639n, AbstractC2647h.m4255a(this.f7638m, AbstractC2647h.m4255a(this.f7637l, AbstractC2647h.m4255a(this.f7636k, AbstractC2647h.m4255a(this.f7635j, AbstractC2647h.m4255a(this.f7634i, AbstractC2647h.m4255a(this.f7633h, AbstractC2647h.m4255a(this.f7632g, AbstractC2647h.m4255a(this.f7631f, AbstractC2647h.m4255a(this.f7630e, AbstractC2647h.m4255a(this.f7629d, AbstractC0094y0.m175b(AbstractC0094y0.m175b(Boolean.hashCode(this.f7626a) * 31, 31, this.f7627b), 31, this.f7628c), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f7641p), 31, this.f7642q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionLimitSnapshot(running=");
        sb.append(this.f7626a);
        sb.append(", target=");
        sb.append(this.f7627b);
        sb.append(", resolvedAddress=");
        sb.append(this.f7628c);
        sb.append(", port=");
        sb.append(this.f7629d);
        sb.append(", maxConnections=");
        AbstractC0094y0.m192s(sb, this.f7630e, ", concurrency=", this.f7631f, ", holdSeconds=");
        AbstractC0094y0.m192s(sb, this.f7632g, ", connectTimeoutMs=", this.f7633h, ", failureThreshold=");
        AbstractC0094y0.m192s(sb, this.f7634i, ", launchDelayMs=", this.f7635j, ", attempted=");
        AbstractC0094y0.m192s(sb, this.f7636k, ", opened=", this.f7637l, ", failed=");
        AbstractC0094y0.m192s(sb, this.f7638m, ", activeConnections=", this.f7639n, ", estimatedLimit=");
        sb.append(this.f7640o);
        sb.append(", elapsedMillis=");
        sb.append(this.f7641p);
        sb.append(", status=");
        sb.append(this.f7642q);
        sb.append(", events=");
        sb.append(this.f7643r);
        sb.append(")");
        return sb.toString();
    }

    public C1281sn(boolean z7, String str, String str2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j6, String str3, List list) {
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str3, "status");
        this.f7626a = z7;
        this.f7627b = str;
        this.f7628c = str2;
        this.f7629d = i7;
        this.f7630e = i8;
        this.f7631f = i9;
        this.f7632g = i10;
        this.f7633h = i11;
        this.f7634i = i12;
        this.f7635j = i13;
        this.f7636k = i14;
        this.f7637l = i15;
        this.f7638m = i16;
        this.f7639n = i17;
        this.f7640o = i18;
        this.f7641p = j6;
        this.f7642q = str3;
        this.f7643r = list;
    }
}
