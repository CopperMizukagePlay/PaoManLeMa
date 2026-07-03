package p049g1;

import p027d1.C0467e;
import p035e1.InterfaceC0674q;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C1567a {

    /* renamed from: a */
    public InterfaceC3093c f10177a;

    /* renamed from: b */
    public EnumC3103m f10178b;

    /* renamed from: c */
    public InterfaceC0674q f10179c;

    /* renamed from: d */
    public long f10180d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1567a) {
                C1567a c1567a = (C1567a) obj;
                if (!AbstractC3367j.m5096a(this.f10177a, c1567a.f10177a) || this.f10178b != c1567a.f10178b || !AbstractC3367j.m5096a(this.f10179c, c1567a.f10179c) || !C0467e.m1023a(this.f10180d, c1567a.f10180d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10180d) + ((this.f10179c.hashCode() + ((this.f10178b.hashCode() + (this.f10177a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f10177a + ", layoutDirection=" + this.f10178b + ", canvas=" + this.f10179c + ", size=" + ((Object) C0467e.m1028f(this.f10180d)) + ')';
    }
}
