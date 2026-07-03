package p132r2;

import p068i5.AbstractC2080d;
import p140s2.C3105o;
import p140s2.C3106p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.q */
/* loaded from: classes.dex */
public final class C3043q {

    /* renamed from: c */
    public static final C3043q f15613c = new C3043q(AbstractC2080d.m3405r(0), AbstractC2080d.m3405r(0));

    /* renamed from: a */
    public final long f15614a;

    /* renamed from: b */
    public final long f15615b;

    public C3043q(long j6, long j7) {
        this.f15614a = j6;
        this.f15615b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3043q)) {
            return false;
        }
        C3043q c3043q = (C3043q) obj;
        if (C3105o.m4794a(this.f15614a, c3043q.f15614a) && C3105o.m4794a(this.f15615b, c3043q.f15615b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C3106p[] c3106pArr = C3105o.f15707b;
        return Long.hashCode(this.f15615b) + (Long.hashCode(this.f15614a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C3105o.m4797d(this.f15614a)) + ", restLine=" + ((Object) C3105o.m4797d(this.f15615b)) + ')';
    }
}
