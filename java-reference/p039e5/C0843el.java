package p039e5;

import java.net.InetSocketAddress;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.el */
/* loaded from: classes.dex */
public final class C0843el {

    /* renamed from: a */
    public final InetSocketAddress f3773a;

    /* renamed from: b */
    public final InetSocketAddress f3774b;

    /* renamed from: c */
    public final InetSocketAddress f3775c;

    /* renamed from: d */
    public final InetSocketAddress f3776d;

    public C0843el(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InetSocketAddress inetSocketAddress3, InetSocketAddress inetSocketAddress4) {
        this.f3773a = inetSocketAddress;
        this.f3774b = inetSocketAddress2;
        this.f3775c = inetSocketAddress3;
        this.f3776d = inetSocketAddress4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843el)) {
            return false;
        }
        C0843el c0843el = (C0843el) obj;
        if (AbstractC3367j.m5096a(this.f3773a, c0843el.f3773a) && AbstractC3367j.m5096a(this.f3774b, c0843el.f3774b) && AbstractC3367j.m5096a(this.f3775c, c0843el.f3775c) && AbstractC3367j.m5096a(this.f3776d, c0843el.f3776d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i7 = 0;
        InetSocketAddress inetSocketAddress = this.f3773a;
        if (inetSocketAddress == null) {
            hashCode = 0;
        } else {
            hashCode = inetSocketAddress.hashCode();
        }
        int i8 = hashCode * 31;
        InetSocketAddress inetSocketAddress2 = this.f3774b;
        if (inetSocketAddress2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = inetSocketAddress2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        InetSocketAddress inetSocketAddress3 = this.f3775c;
        if (inetSocketAddress3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = inetSocketAddress3.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        InetSocketAddress inetSocketAddress4 = this.f3776d;
        if (inetSocketAddress4 != null) {
            i7 = inetSocketAddress4.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "StunMessage(mappedAddress=" + this.f3773a + ", xorMappedAddress=" + this.f3774b + ", changedAddress=" + this.f3775c + ", otherAddress=" + this.f3776d + ")";
    }
}
