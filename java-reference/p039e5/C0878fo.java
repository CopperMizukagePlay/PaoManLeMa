package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fo */
/* loaded from: classes.dex */
public final class C0878fo {

    /* renamed from: a */
    public final String f4047a;

    /* renamed from: b */
    public final String f4048b;

    public C0878fo(String str, String str2) {
        AbstractC3367j.m5100e(str, "label");
        AbstractC3367j.m5100e(str2, "cidr");
        this.f4047a = str;
        this.f4048b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0878fo)) {
            return false;
        }
        C0878fo c0878fo = (C0878fo) obj;
        if (AbstractC3367j.m5096a(this.f4047a, c0878fo.f4047a) && AbstractC3367j.m5096a(this.f4048b, c0878fo.f4048b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4048b.hashCode() + (this.f4047a.hashCode() * 31);
    }

    public final String toString() {
        return "SpeedDnsEcsSubnet(label=" + this.f4047a + ", cidr=" + this.f4048b + ")";
    }
}
