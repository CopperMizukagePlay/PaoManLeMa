package p058h2;

import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.e */
/* loaded from: classes.dex */
public final class C1768e {

    /* renamed from: a */
    public final int f10778a;

    /* renamed from: b */
    public final int f10779b;

    /* renamed from: c */
    public final boolean f10780c;

    public C1768e(int i7, int i8, boolean z7) {
        this.f10778a = i7;
        this.f10779b = i8;
        this.f10780c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1768e)) {
            return false;
        }
        C1768e c1768e = (C1768e) obj;
        if (this.f10778a == c1768e.f10778a && this.f10779b == c1768e.f10779b && this.f10780c == c1768e.f10780c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10780c) + AbstractC2647h.m4255a(this.f10779b, Integer.hashCode(this.f10778a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f10778a + ", end=" + this.f10779b + ", isRtl=" + this.f10780c + ')';
    }
}
