package p034e0;

import p100n.AbstractC2647h;
import p132r2.EnumC3036j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.o */
/* loaded from: classes.dex */
public final class C0621o {

    /* renamed from: a */
    public final EnumC3036j f2041a;

    /* renamed from: b */
    public final int f2042b;

    /* renamed from: c */
    public final long f2043c;

    public C0621o(EnumC3036j enumC3036j, int i7, long j6) {
        this.f2041a = enumC3036j;
        this.f2042b = i7;
        this.f2043c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0621o)) {
            return false;
        }
        C0621o c0621o = (C0621o) obj;
        if (this.f2041a == c0621o.f2041a && this.f2042b == c0621o.f2042b && this.f2043c == c0621o.f2043c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2043c) + AbstractC2647h.m4255a(this.f2042b, this.f2041a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f2041a + ", offset=" + this.f2042b + ", selectableId=" + this.f2043c + ')';
    }
}
