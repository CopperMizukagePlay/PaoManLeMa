package p099m6;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.g0 */
/* loaded from: classes.dex */
public final class C2604g0 {

    /* renamed from: a */
    public final C2591a f14094a;

    /* renamed from: b */
    public final Proxy f14095b;

    /* renamed from: c */
    public final InetSocketAddress f14096c;

    public C2604g0(C2591a c2591a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC3367j.m5100e(inetSocketAddress, "socketAddress");
        this.f14094a = c2591a;
        this.f14095b = proxy;
        this.f14096c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2604g0) {
            C2604g0 c2604g0 = (C2604g0) obj;
            if (AbstractC3367j.m5096a(c2604g0.f14094a, this.f14094a) && AbstractC3367j.m5096a(c2604g0.f14095b, this.f14095b) && AbstractC3367j.m5096a(c2604g0.f14096c, this.f14096c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14096c.hashCode() + ((this.f14095b.hashCode() + ((this.f14094a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f14096c + '}';
    }
}
