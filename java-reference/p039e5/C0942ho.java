package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ho */
/* loaded from: classes.dex */
public final class C0942ho {

    /* renamed from: a */
    public final String f4624a;

    /* renamed from: b */
    public final int f4625b;

    /* renamed from: c */
    public final int f4626c;

    /* renamed from: d */
    public final String f4627d;

    /* renamed from: e */
    public final String f4628e;

    public C0942ho(int i7, int i8, String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "server");
        AbstractC3367j.m5100e(str2, "host");
        AbstractC3367j.m5100e(str3, "ecsSubnet");
        this.f4624a = str;
        this.f4625b = i7;
        this.f4626c = i8;
        this.f4627d = str2;
        this.f4628e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0942ho)) {
            return false;
        }
        C0942ho c0942ho = (C0942ho) obj;
        if (AbstractC3367j.m5096a(this.f4624a, c0942ho.f4624a) && this.f4625b == c0942ho.f4625b && this.f4626c == c0942ho.f4626c && AbstractC3367j.m5096a(this.f4627d, c0942ho.f4627d) && AbstractC3367j.m5096a(this.f4628e, c0942ho.f4628e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4628e.hashCode() + AbstractC0094y0.m175b(AbstractC2647h.m4255a(this.f4626c, AbstractC2647h.m4255a(this.f4625b, this.f4624a.hashCode() * 31, 31), 31), 31, this.f4627d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedDnsQueryProgress(server=");
        sb.append(this.f4624a);
        sb.append(", index=");
        sb.append(this.f4625b);
        sb.append(", total=");
        sb.append(this.f4626c);
        sb.append(", host=");
        sb.append(this.f4627d);
        sb.append(", ecsSubnet=");
        return AbstractC2487d.m4046j(sb, this.f4628e, ")");
    }
}
