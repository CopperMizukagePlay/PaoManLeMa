package p039e5;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0917h implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f4387e = 0;

    /* renamed from: f */
    public final /* synthetic */ long f4388f;

    /* renamed from: g */
    public final /* synthetic */ Object f4389g;

    public /* synthetic */ C0917h(long j6, Set set) {
        this.f4388f = j6;
        this.f4389g = set;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f4387e) {
            case 0:
                Set set = (Set) this.f4389g;
                C1102n c1102n = (C1102n) obj;
                AbstractC3367j.m5100e(c1102n, "donor");
                long j6 = c1102n.f6130d.get();
                long j7 = c1102n.f6129c.get();
                long j8 = (j7 - j6) + 1;
                if (65536 <= j8 && j8 <= Math.min(524288L, this.f4388f)) {
                    C1195q c1195q = new C1195q(c1102n, j6, j7);
                    if (!set.contains(c1195q.m2085a())) {
                        return c1195q;
                    }
                }
                return null;
            default:
                return C0831e9.m1519a((C0831e9) obj, 0L, 0L, ((AtomicLong) this.f4389g).get(), this.f4388f, null, null, 103);
        }
    }

    public /* synthetic */ C0917h(AtomicLong atomicLong, long j6) {
        this.f4389g = atomicLong;
        this.f4388f = j6;
    }
}
