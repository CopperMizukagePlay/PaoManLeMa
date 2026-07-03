package p039e5;

import java.net.InetSocketAddress;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gl */
/* loaded from: classes.dex */
public final class C0907gl {

    /* renamed from: a */
    public final InetSocketAddress f4305a;

    /* renamed from: b */
    public final InetSocketAddress f4306b;

    /* renamed from: c */
    public final C0843el f4307c;

    public C0907gl(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C0843el c0843el) {
        this.f4305a = inetSocketAddress;
        this.f4306b = inetSocketAddress2;
        this.f4307c = c0843el;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0907gl)) {
            return false;
        }
        C0907gl c0907gl = (C0907gl) obj;
        if (AbstractC3367j.m5096a(this.f4305a, c0907gl.f4305a) && AbstractC3367j.m5096a(this.f4306b, c0907gl.f4306b) && AbstractC3367j.m5096a(this.f4307c, c0907gl.f4307c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4307c.hashCode() + ((this.f4306b.hashCode() + (this.f4305a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StunResponse(local=" + this.f4305a + ", remote=" + this.f4306b + ", message=" + this.f4307c + ")";
    }
}
