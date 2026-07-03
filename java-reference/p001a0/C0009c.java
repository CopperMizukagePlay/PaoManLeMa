package p001a0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.c */
/* loaded from: classes.dex */
public final class C0009c extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3810r f64f;

    /* renamed from: g */
    public final /* synthetic */ int f65g;

    /* renamed from: h */
    public final /* synthetic */ int f66h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009c(InterfaceC3810r interfaceC3810r, int i7, int i8) {
        super(2);
        this.f64f = interfaceC3810r;
        this.f65g = i7;
        this.f66h = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(this.f65g | 1);
        int i7 = this.f66h;
        AbstractC0025g.m54b(this.f64f, (C2395p) obj, m3957F, i7);
        return C1694m.f10482a;
    }
}
