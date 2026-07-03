package p146t1;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.b1 */
/* loaded from: classes.dex */
public final class C3188b1 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3810r f15924f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f15925g;

    /* renamed from: h */
    public final /* synthetic */ int f15926h;

    /* renamed from: i */
    public final /* synthetic */ int f15927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3188b1(InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, int i7, int i8) {
        super(2);
        this.f15924f = interfaceC3810r;
        this.f15925g = interfaceC3281e;
        this.f15926h = i7;
        this.f15927i = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(this.f15926h | 1);
        int i7 = this.f15927i;
        AbstractC3191c1.m4891b(this.f15924f, this.f15925g, (C2395p) obj, m3957F, i7);
        return C1694m.f10482a;
    }
}
