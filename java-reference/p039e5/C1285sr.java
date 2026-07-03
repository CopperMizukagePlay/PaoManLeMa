package p039e5;

import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sr */
/* loaded from: classes.dex */
public final class C1285sr {

    /* renamed from: a */
    public final List f7657a;

    /* renamed from: b */
    public final List f7658b;

    /* renamed from: c */
    public final Map f7659c;

    /* renamed from: d */
    public final Map f7660d;

    /* renamed from: e */
    public final String f7661e;

    /* renamed from: f */
    public final String f7662f;

    /* renamed from: g */
    public final String f7663g;

    public C1285sr(List list, List list2, Map map, Map map2, String str, String str2, String str3) {
        AbstractC3367j.m5100e(list, "downloadUrls");
        AbstractC3367j.m5100e(list2, "uploadUrls");
        AbstractC3367j.m5100e(map, "targetDownloadUrls");
        AbstractC3367j.m5100e(str, "notice");
        this.f7657a = list;
        this.f7658b = list2;
        this.f7659c = map;
        this.f7660d = map2;
        this.f7661e = str;
        this.f7662f = str2;
        this.f7663g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1285sr)) {
            return false;
        }
        C1285sr c1285sr = (C1285sr) obj;
        if (AbstractC3367j.m5096a(this.f7657a, c1285sr.f7657a) && AbstractC3367j.m5096a(this.f7658b, c1285sr.f7658b) && AbstractC3367j.m5096a(this.f7659c, c1285sr.f7659c) && AbstractC3367j.m5096a(this.f7660d, c1285sr.f7660d) && AbstractC3367j.m5096a(this.f7661e, c1285sr.f7661e) && AbstractC3367j.m5096a(this.f7662f, c1285sr.f7662f) && AbstractC3367j.m5096a(this.f7663g, c1285sr.f7663g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m175b = AbstractC0094y0.m175b((this.f7660d.hashCode() + ((this.f7659c.hashCode() + AbstractC0094y0.m176c(this.f7658b, this.f7657a.hashCode() * 31, 31)) * 31)) * 31, 31, this.f7661e);
        int i7 = 0;
        String str = this.f7662f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (m175b + hashCode) * 31;
        String str2 = this.f7663g;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkModePreflightResult(downloadUrls=");
        sb.append(this.f7657a);
        sb.append(", uploadUrls=");
        sb.append(this.f7658b);
        sb.append(", targetDownloadUrls=");
        sb.append(this.f7659c);
        sb.append(", targetUploadUrls=");
        sb.append(this.f7660d);
        sb.append(", notice=");
        AbstractC2487d.m4057u(sb, this.f7661e, ", downloadBlockedMessage=", this.f7662f, ", uploadBlockedMessage=");
        return AbstractC2487d.m4046j(sb, this.f7663g, ")");
    }
}
