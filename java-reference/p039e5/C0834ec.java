package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ec */
/* loaded from: classes.dex */
public final class C0834ec {

    /* renamed from: a */
    public final Enum f3671a;

    /* renamed from: b */
    public final String f3672b;

    /* renamed from: c */
    public final String f3673c;

    public C0834ec(Enum r12, String str, String str2) {
        this.f3671a = r12;
        this.f3672b = str;
        this.f3673c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0834ec) {
                C0834ec c0834ec = (C0834ec) obj;
                if (!this.f3671a.equals(c0834ec.f3671a) || !this.f3672b.equals(c0834ec.f3672b) || !this.f3673c.equals(c0834ec.f3673c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3673c.hashCode() + AbstractC0094y0.m175b(this.f3671a.hashCode() * 31, 31, this.f3672b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Iperf3DropdownOption(value=");
        sb.append(this.f3671a);
        sb.append(", label=");
        sb.append(this.f3672b);
        sb.append(", detail=");
        return AbstractC2487d.m4046j(sb, this.f3673c, ")");
    }
}
