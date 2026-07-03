package p039e5;

import p060h5.C1803k;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ic */
/* loaded from: classes.dex */
public final class C0962ic {

    /* renamed from: a */
    public final int f4808a;

    /* renamed from: b */
    public final boolean f4809b;

    /* renamed from: c */
    public final C1803k f4810c;

    public C0962ic(int i7, boolean z7, C1803k c1803k) {
        this.f4808a = i7;
        this.f4809b = z7;
        this.f4810c = c1803k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962ic)) {
            return false;
        }
        C0962ic c0962ic = (C0962ic) obj;
        if (this.f4808a == c0962ic.f4808a && this.f4809b == c0962ic.f4809b && AbstractC3367j.m5096a(this.f4810c, c0962ic.f4810c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4810c.hashCode() + AbstractC2487d.m4040d(Integer.hashCode(this.f4808a) * 31, 31, this.f4809b);
    }

    public final String toString() {
        return "ProcessResult(exitCode=" + this.f4808a + ", sawActive=" + this.f4809b + ", outputTail=" + this.f4810c + ")";
    }
}
