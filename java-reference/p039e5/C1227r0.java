package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.r0 */
/* loaded from: classes.dex */
public final class C1227r0 {

    /* renamed from: a */
    public final String f7193a;

    /* renamed from: b */
    public final String f7194b;

    /* renamed from: c */
    public final String f7195c;

    /* renamed from: d */
    public final String f7196d;

    /* renamed from: e */
    public final String f7197e;

    /* renamed from: f */
    public final String f7198f;

    public C1227r0(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC3367j.m5100e(str5, "apkFileName");
        this.f7193a = str;
        this.f7194b = str2;
        this.f7195c = str3;
        this.f7196d = str4;
        this.f7197e = str5;
        this.f7198f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227r0)) {
            return false;
        }
        C1227r0 c1227r0 = (C1227r0) obj;
        if (AbstractC3367j.m5096a(this.f7193a, c1227r0.f7193a) && AbstractC3367j.m5096a(this.f7194b, c1227r0.f7194b) && AbstractC3367j.m5096a(this.f7195c, c1227r0.f7195c) && AbstractC3367j.m5096a(this.f7196d, c1227r0.f7196d) && AbstractC3367j.m5096a(this.f7197e, c1227r0.f7197e) && AbstractC3367j.m5096a(this.f7198f, c1227r0.f7198f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7198f.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f7193a.hashCode() * 31, 31, this.f7194b), 31, this.f7195c), 31, this.f7196d), 31, this.f7197e);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("AppUpdateInfo(versionName=", this.f7193a, ", releaseName=", this.f7194b, ", releaseUrl=");
        AbstractC2487d.m4057u(m189p, this.f7195c, ", apkDownloadUrl=", this.f7196d, ", apkFileName=");
        m189p.append(this.f7197e);
        m189p.append(", releaseNotes=");
        m189p.append(this.f7198f);
        m189p.append(")");
        return m189p.toString();
    }
}
