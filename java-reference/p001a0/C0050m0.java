package p001a0;

import p034e0.C0622o0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.m0 */
/* loaded from: classes.dex */
public final class C0050m0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C0622o0 f260f;

    /* renamed from: g */
    public final /* synthetic */ boolean f261g;

    /* renamed from: h */
    public final /* synthetic */ int f262h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050m0(C0622o0 c0622o0, boolean z7, int i7) {
        super(2);
        this.f260f = c0622o0;
        this.f261g = z7;
        this.f262h = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(this.f262h | 1);
        AbstractC0027g1.m60f(this.f260f, this.f261g, (C2395p) obj, m3957F);
        return C1694m.f10482a;
    }
}
