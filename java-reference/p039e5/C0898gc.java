package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gc */
/* loaded from: classes.dex */
public final class C0898gc {

    /* renamed from: a */
    public final EnumC1332uc f4216a;

    /* renamed from: b */
    public final EnumC0803dc f4217b;

    /* renamed from: c */
    public final int f4218c;

    /* renamed from: d */
    public final int f4219d;

    /* renamed from: e */
    public final String f4220e;

    public C0898gc(EnumC1332uc enumC1332uc, EnumC0803dc enumC0803dc, int i7, int i8, String str) {
        AbstractC3367j.m5100e(enumC0803dc, "direction");
        this.f4216a = enumC1332uc;
        this.f4217b = enumC0803dc;
        this.f4218c = i7;
        this.f4219d = i8;
        this.f4220e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0898gc)) {
            return false;
        }
        C0898gc c0898gc = (C0898gc) obj;
        if (this.f4216a == c0898gc.f4216a && this.f4217b == c0898gc.f4217b && this.f4218c == c0898gc.f4218c && this.f4219d == c0898gc.f4219d && AbstractC3367j.m5096a(this.f4220e, c0898gc.f4220e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4220e.hashCode() + AbstractC2647h.m4255a(this.f4219d, AbstractC2647h.m4255a(this.f4218c, (this.f4217b.hashCode() + (this.f4216a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonStartMeta(protocol=");
        sb.append(this.f4216a);
        sb.append(", direction=");
        sb.append(this.f4217b);
        sb.append(", durationSec=");
        AbstractC0094y0.m192s(sb, this.f4218c, ", streams=", this.f4219d, ", peerInfo=");
        return AbstractC2487d.m4046j(sb, this.f4220e, ")");
    }
}
