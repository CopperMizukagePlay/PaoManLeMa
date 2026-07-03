package p039e5;

import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dm */
/* loaded from: classes.dex */
public final class C0813dm {

    /* renamed from: a */
    public final C1189po f3517a;

    /* renamed from: b */
    public final List f3518b;

    /* renamed from: c */
    public final boolean f3519c;

    /* renamed from: d */
    public final boolean f3520d;

    /* renamed from: e */
    public final Map f3521e;

    /* renamed from: f */
    public final Map f3522f;

    public C0813dm(C1189po c1189po, List list, boolean z7, boolean z8, Map map, Map map2) {
        AbstractC3367j.m5100e(c1189po, "profile");
        AbstractC3367j.m5100e(list, "targets");
        AbstractC3367j.m5100e(map, "targetDownloadUrls");
        AbstractC3367j.m5100e(map2, "targetUploadUrls");
        this.f3517a = c1189po;
        this.f3518b = list;
        this.f3519c = z7;
        this.f3520d = z8;
        this.f3521e = map;
        this.f3522f = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0813dm)) {
            return false;
        }
        C0813dm c0813dm = (C0813dm) obj;
        if (AbstractC3367j.m5096a(this.f3517a, c0813dm.f3517a) && AbstractC3367j.m5096a(this.f3518b, c0813dm.f3518b) && this.f3519c == c0813dm.f3519c && this.f3520d == c0813dm.f3520d && AbstractC3367j.m5096a(this.f3521e, c0813dm.f3521e) && AbstractC3367j.m5096a(this.f3522f, c0813dm.f3522f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3522f.hashCode() + ((this.f3521e.hashCode() + AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC0094y0.m176c(this.f3518b, this.f3517a.hashCode() * 31, 31), 31, this.f3519c), 31, this.f3520d)) * 31);
    }

    public final String toString() {
        return "PendingEngineStart(profile=" + this.f3517a + ", targets=" + this.f3518b + ", runDownload=" + this.f3519c + ", runUpload=" + this.f3520d + ", targetDownloadUrls=" + this.f3521e + ", targetUploadUrls=" + this.f3522f + ")";
    }
}
