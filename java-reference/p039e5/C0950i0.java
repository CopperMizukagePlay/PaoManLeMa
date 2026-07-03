package p039e5;

import p053g5.C1690i;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i0 */
/* loaded from: classes.dex */
public final class C0950i0 extends AbstractC2583c {

    /* renamed from: h */
    public /* synthetic */ Object f4674h;

    /* renamed from: i */
    public final /* synthetic */ C1196q0 f4675i;

    /* renamed from: j */
    public int f4676j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950i0(C1196q0 c1196q0, AbstractC2583c abstractC2583c) {
        super(abstractC2583c);
        this.f4675i = c1196q0;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        this.f4674h = obj;
        this.f4676j |= Integer.MIN_VALUE;
        Object m2117K = this.f4675i.m2117K(null, null, this);
        if (m2117K == EnumC2465a.f13750e) {
            return m2117K;
        }
        return new C1690i(m2117K);
    }
}
