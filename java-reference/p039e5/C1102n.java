package p039e5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n */
/* loaded from: classes.dex */
public final class C1102n {

    /* renamed from: a */
    public final int f6127a;

    /* renamed from: b */
    public final AtomicLong f6128b;

    /* renamed from: c */
    public final AtomicLong f6129c;

    /* renamed from: d */
    public final AtomicLong f6130d;

    /* renamed from: e */
    public final AtomicBoolean f6131e;

    public C1102n(int i7, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicLong atomicLong3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f6127a = i7;
        this.f6128b = atomicLong;
        this.f6129c = atomicLong2;
        this.f6130d = atomicLong3;
        this.f6131e = atomicBoolean;
    }

    /* renamed from: a */
    public final AtomicLong m2010a() {
        return this.f6129c;
    }

    /* renamed from: b */
    public final AtomicLong m2011b() {
        return this.f6130d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1102n)) {
            return false;
        }
        C1102n c1102n = (C1102n) obj;
        if (this.f6127a == c1102n.f6127a && AbstractC3367j.m5096a(this.f6128b, c1102n.f6128b) && AbstractC3367j.m5096a(this.f6129c, c1102n.f6129c) && AbstractC3367j.m5096a(this.f6130d, c1102n.f6130d) && AbstractC3367j.m5096a(this.f6131e, c1102n.f6131e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6131e.hashCode() + ((this.f6130d.hashCode() + ((this.f6129c.hashCode() + ((this.f6128b.hashCode() + (Integer.hashCode(this.f6127a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DynamicSegment(workerIndex=" + this.f6127a + ", start=" + this.f6128b + ", end=" + this.f6129c + ", position=" + this.f6130d + ", writeInFlight=" + this.f6131e + ")";
    }
}
