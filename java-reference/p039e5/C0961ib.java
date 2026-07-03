package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ib */
/* loaded from: classes.dex */
public final class C0961ib {

    /* renamed from: a */
    public final String f4800a;

    /* renamed from: b */
    public final String f4801b;

    /* renamed from: c */
    public final String f4802c;

    /* renamed from: d */
    public final String f4803d;

    /* renamed from: e */
    public final String f4804e;

    /* renamed from: f */
    public final String f4805f;

    /* renamed from: g */
    public final long f4806g;

    /* renamed from: h */
    public final long f4807h;

    public C0961ib(String str, String str2, String str3, String str4, String str5, String str6, long j6, long j7) {
        this.f4800a = str;
        this.f4801b = str2;
        this.f4802c = str3;
        this.f4803d = str4;
        this.f4804e = str5;
        this.f4805f = str6;
        this.f4806g = j6;
        this.f4807h = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0961ib)) {
            return false;
        }
        C0961ib c0961ib = (C0961ib) obj;
        if (AbstractC3367j.m5096a(this.f4800a, c0961ib.f4800a) && AbstractC3367j.m5096a(this.f4801b, c0961ib.f4801b) && AbstractC3367j.m5096a(this.f4802c, c0961ib.f4802c) && AbstractC3367j.m5096a(this.f4803d, c0961ib.f4803d) && AbstractC3367j.m5096a(this.f4804e, c0961ib.f4804e) && AbstractC3367j.m5096a(this.f4805f, c0961ib.f4805f) && this.f4806g == c0961ib.f4806g && this.f4807h == c0961ib.f4807h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4807h) + AbstractC2487d.m4039c(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f4800a.hashCode() * 31, 31, this.f4801b), 31, this.f4802c), 31, this.f4803d), 31, this.f4804e), 31, this.f4805f), 31, this.f4806g);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("PendingUpdateMeta(versionName=", this.f4800a, ", releaseName=", this.f4801b, ", releaseUrl=");
        AbstractC2487d.m4057u(m189p, this.f4802c, ", apkDownloadUrl=", this.f4803d, ", apkFileName=");
        AbstractC2487d.m4057u(m189p, this.f4804e, ", releaseNotes=", this.f4805f, ", fileSize=");
        m189p.append(this.f4806g);
        m189p.append(", downloadedAt=");
        m189p.append(this.f4807h);
        m189p.append(")");
        return m189p.toString();
    }
}
