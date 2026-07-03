package p039e5;

import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qm */
/* loaded from: classes.dex */
public final class C1218qm {

    /* renamed from: a */
    public final C1189po f7129a;

    /* renamed from: b */
    public final List f7130b;

    /* renamed from: c */
    public final boolean f7131c;

    /* renamed from: d */
    public final boolean f7132d;

    /* renamed from: e */
    public final Map f7133e;

    /* renamed from: f */
    public final Map f7134f;

    /* renamed from: g */
    public final List f7135g;

    public C1218qm(C1189po c1189po, List list, boolean z7, boolean z8, Map map, Map map2, List list2) {
        AbstractC3367j.m5100e(c1189po, "profile");
        AbstractC3367j.m5100e(list, "targets");
        AbstractC3367j.m5100e(map, "targetDownloadUrls");
        AbstractC3367j.m5100e(map2, "targetUploadUrls");
        this.f7129a = c1189po;
        this.f7130b = list;
        this.f7131c = z7;
        this.f7132d = z8;
        this.f7133e = map;
        this.f7134f = map2;
        this.f7135g = list2;
    }

    /* renamed from: a */
    public static C1218qm m2146a(C1218qm c1218qm, C1189po c1189po, Map map, Map map2, List list, int i7) {
        if ((i7 & 1) != 0) {
            c1189po = c1218qm.f7129a;
        }
        C1189po c1189po2 = c1189po;
        List list2 = c1218qm.f7130b;
        boolean z7 = c1218qm.f7131c;
        boolean z8 = c1218qm.f7132d;
        if ((i7 & 16) != 0) {
            map = c1218qm.f7133e;
        }
        Map map3 = map;
        if ((i7 & 32) != 0) {
            map2 = c1218qm.f7134f;
        }
        Map map4 = map2;
        if ((i7 & 64) != 0) {
            list = c1218qm.f7135g;
        }
        List list3 = list;
        c1218qm.getClass();
        AbstractC3367j.m5100e(c1189po2, "profile");
        AbstractC3367j.m5100e(list2, "targets");
        AbstractC3367j.m5100e(map3, "targetDownloadUrls");
        AbstractC3367j.m5100e(map4, "targetUploadUrls");
        AbstractC3367j.m5100e(list3, "selections");
        return new C1218qm(c1189po2, list2, z7, z8, map3, map4, list3);
    }

    /* renamed from: b */
    public final List m2147b() {
        return this.f7135g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218qm)) {
            return false;
        }
        C1218qm c1218qm = (C1218qm) obj;
        if (AbstractC3367j.m5096a(this.f7129a, c1218qm.f7129a) && AbstractC3367j.m5096a(this.f7130b, c1218qm.f7130b) && this.f7131c == c1218qm.f7131c && this.f7132d == c1218qm.f7132d && AbstractC3367j.m5096a(this.f7133e, c1218qm.f7133e) && AbstractC3367j.m5096a(this.f7134f, c1218qm.f7134f) && AbstractC3367j.m5096a(this.f7135g, c1218qm.f7135g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7135g.hashCode() + ((this.f7134f.hashCode() + ((this.f7133e.hashCode() + AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC0094y0.m176c(this.f7130b, this.f7129a.hashCode() * 31, 31), 31, this.f7131c), 31, this.f7132d)) * 31)) * 31);
    }

    public final String toString() {
        return "PreparedDnsSelectionStart(profile=" + this.f7129a + ", targets=" + this.f7130b + ", runDownload=" + this.f7131c + ", runUpload=" + this.f7132d + ", targetDownloadUrls=" + this.f7133e + ", targetUploadUrls=" + this.f7134f + ", selections=" + this.f7135g + ")";
    }
}
