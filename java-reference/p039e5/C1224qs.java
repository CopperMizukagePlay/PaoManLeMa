package p039e5;

import java.util.ArrayList;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qs */
/* loaded from: classes.dex */
public final class C1224qs {

    /* renamed from: a */
    public final String f7180a;

    /* renamed from: b */
    public final ArrayList f7181b;

    /* renamed from: c */
    public final ArrayList f7182c;

    /* renamed from: d */
    public final boolean f7183d;

    /* renamed from: e */
    public final int f7184e;

    /* renamed from: f */
    public final C1131ns f7185f;

    public C1224qs(String str, ArrayList arrayList, ArrayList arrayList2, boolean z7, int i7, C1131ns c1131ns) {
        AbstractC3367j.m5100e(str, "targetSignature");
        this.f7180a = str;
        this.f7181b = arrayList;
        this.f7182c = arrayList2;
        this.f7183d = z7;
        this.f7184e = i7;
        this.f7185f = c1131ns;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1224qs) {
            C1224qs c1224qs = (C1224qs) obj;
            if (AbstractC3367j.m5096a(this.f7180a, c1224qs.f7180a) && this.f7181b.equals(c1224qs.f7181b) && this.f7182c.equals(c1224qs.f7182c) && this.f7183d == c1224qs.f7183d && this.f7184e == c1224qs.f7184e && this.f7185f.equals(c1224qs.f7185f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(900) + AbstractC2487d.m4039c((this.f7185f.hashCode() + AbstractC2647h.m4255a(this.f7184e, AbstractC2487d.m4040d((this.f7182c.hashCode() + ((this.f7181b.hashCode() + (this.f7180a.hashCode() * 31)) * 31)) * 31, 31, this.f7183d), 31)) * 31, 31, 1000L);
    }

    public final String toString() {
        return "MonitorSessionParams(targetSignature=" + this.f7180a + ", gatewayInputs=" + this.f7181b + ", externalInputs=" + this.f7182c + ", cellularAirCongestionEnhanced=" + this.f7183d + ", packetSizeBytes=" + this.f7184e + ", congestionConfig=" + this.f7185f + ", intervalMs=1000, timeoutMs=900)";
    }
}
