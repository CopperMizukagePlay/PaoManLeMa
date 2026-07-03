package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hu */
/* loaded from: classes.dex */
public final class C0948hu {

    /* renamed from: a */
    public final String f4659a;

    /* renamed from: b */
    public final String f4660b;

    /* renamed from: c */
    public final String f4661c;

    /* renamed from: d */
    public final String f4662d;

    /* renamed from: e */
    public final String f4663e;

    /* renamed from: f */
    public final String f4664f;

    /* renamed from: g */
    public final int f4665g;

    /* renamed from: h */
    public final long f4666h;

    /* renamed from: i */
    public final long f4667i;

    /* renamed from: j */
    public final double f4668j;

    /* renamed from: k */
    public final Double f4669k;

    /* renamed from: l */
    public final long f4670l;

    /* renamed from: m */
    public final String f4671m;

    /* renamed from: n */
    public final int f4672n;

    public C0948hu(String str, String str2, String str3, String str4, String str5, String str6, int i7, long j6, long j7, double d7, Double d8, long j8, String str7, int i8) {
        AbstractC3367j.m5100e(str, "id");
        AbstractC3367j.m5100e(str3, "workerLabel");
        AbstractC3367j.m5100e(str4, "interfaceName");
        AbstractC3367j.m5100e(str5, "urlShort");
        this.f4659a = str;
        this.f4660b = str2;
        this.f4661c = str3;
        this.f4662d = str4;
        this.f4663e = str5;
        this.f4664f = str6;
        this.f4665g = i7;
        this.f4666h = j6;
        this.f4667i = j7;
        this.f4668j = d7;
        this.f4669k = d8;
        this.f4670l = j8;
        this.f4671m = str7;
        this.f4672n = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0948hu)) {
            return false;
        }
        C0948hu c0948hu = (C0948hu) obj;
        if (AbstractC3367j.m5096a(this.f4659a, c0948hu.f4659a) && AbstractC3367j.m5096a(this.f4660b, c0948hu.f4660b) && AbstractC3367j.m5096a(this.f4661c, c0948hu.f4661c) && AbstractC3367j.m5096a(this.f4662d, c0948hu.f4662d) && AbstractC3367j.m5096a(this.f4663e, c0948hu.f4663e) && AbstractC3367j.m5096a(this.f4664f, c0948hu.f4664f) && this.f4665g == c0948hu.f4665g && this.f4666h == c0948hu.f4666h && this.f4667i == c0948hu.f4667i && Double.compare(this.f4668j, c0948hu.f4668j) == 0 && AbstractC3367j.m5096a(this.f4669k, c0948hu.f4669k) && this.f4670l == c0948hu.f4670l && AbstractC3367j.m5096a(this.f4671m, c0948hu.f4671m) && this.f4672n == c0948hu.f4672n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m174a = AbstractC0094y0.m174a(this.f4668j, AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2647h.m4255a(this.f4665g, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f4659a.hashCode() * 31, 31, this.f4660b), 31, this.f4661c), 31, this.f4662d), 31, this.f4663e), 31, this.f4664f), 31), 31, this.f4666h), 31, this.f4667i), 31);
        Double d7 = this.f4669k;
        if (d7 == null) {
            hashCode = 0;
        } else {
            hashCode = d7.hashCode();
        }
        return Integer.hashCode(this.f4672n) + AbstractC0094y0.m175b(AbstractC2487d.m4039c((m174a + hashCode) * 31, 31, this.f4670l), 31, this.f4671m);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("WorkerDebugStat(id=", this.f4659a, ", direction=", this.f4660b, ", workerLabel=");
        AbstractC2487d.m4057u(m189p, this.f4661c, ", interfaceName=", this.f4662d, ", urlShort=");
        AbstractC2487d.m4057u(m189p, this.f4663e, ", connectedIp=", this.f4664f, ", localPort=");
        m189p.append(this.f4665g);
        m189p.append(", sessionBytes=");
        m189p.append(this.f4666h);
        AbstractC2487d.m4056t(m189p, ", totalBytes=", this.f4667i, ", speedMbps=");
        m189p.append(this.f4668j);
        m189p.append(", progressPercent=");
        m189p.append(this.f4669k);
        AbstractC2487d.m4056t(m189p, ", contentLength=", this.f4670l, ", status=");
        m189p.append(this.f4671m);
        m189p.append(", attempt=");
        m189p.append(this.f4672n);
        m189p.append(")");
        return m189p.toString();
    }
}
