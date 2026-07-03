package p039e5;

import android.net.Network;
import java.util.ArrayList;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w7 */
/* loaded from: classes.dex */
public final class C1389w7 {

    /* renamed from: a */
    public final String f8307a;

    /* renamed from: b */
    public final Network f8308b;

    /* renamed from: c */
    public final ArrayList f8309c;

    public C1389w7(String str, Network network, ArrayList arrayList) {
        AbstractC3367j.m5100e(str, "host");
        this.f8307a = str;
        this.f8308b = network;
        this.f8309c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1389w7) {
                C1389w7 c1389w7 = (C1389w7) obj;
                if (!AbstractC3367j.m5096a(this.f8307a, c1389w7.f8307a) || !AbstractC3367j.m5096a(this.f8308b, c1389w7.f8308b) || !this.f8309c.equals(c1389w7.f8309c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f8307a.hashCode() * 31;
        Network network = this.f8308b;
        if (network == null) {
            hashCode = 0;
        } else {
            hashCode = network.hashCode();
        }
        return this.f8309c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "DnsLookupCacheSeed(host=" + this.f8307a + ", network=" + this.f8308b + ", addresses=" + this.f8309c + ")";
    }
}
