package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gb */
/* loaded from: classes.dex */
public final class C0897gb {

    /* renamed from: a */
    public final String f4214a;

    /* renamed from: b */
    public final String f4215b;

    public C0897gb(String str, String str2) {
        this.f4214a = str;
        this.f4215b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897gb)) {
            return false;
        }
        C0897gb c0897gb = (C0897gb) obj;
        if (AbstractC3367j.m5096a(this.f4214a, c0897gb.f4214a) && AbstractC3367j.m5096a(this.f4215b, c0897gb.f4215b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f4214a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode * 31;
        String str2 = this.f4215b;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "GatewayEndpoints(ipv4=" + this.f4214a + ", ipv6=" + this.f4215b + ")";
    }
}
