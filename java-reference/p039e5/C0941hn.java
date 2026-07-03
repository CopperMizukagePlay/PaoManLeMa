package p039e5;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hn */
/* loaded from: classes.dex */
public final class C0941hn {

    /* renamed from: a */
    public final long f4621a;

    /* renamed from: b */
    public final long f4622b;

    /* renamed from: c */
    public final long f4623c;

    public C0941hn(long j6, long j7, long j8) {
        this.f4621a = j6;
        this.f4622b = j7;
        this.f4623c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0941hn)) {
            return false;
        }
        C0941hn c0941hn = (C0941hn) obj;
        if (this.f4621a == c0941hn.f4621a && this.f4622b == c0941hn.f4622b && this.f4623c == c0941hn.f4623c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4623c) + AbstractC2487d.m4039c(Long.hashCode(this.f4621a) * 31, 31, this.f4622b);
    }

    public final String toString() {
        return "TcRootStats(backlogBytes=" + this.f4621a + ", droppedTotal=" + this.f4622b + ", requeuesTotal=" + this.f4623c + ")";
    }
}
