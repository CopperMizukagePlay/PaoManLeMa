package p107o;

import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p072j1.AbstractC2163b;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p146t1.C3229q0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p160v.AbstractC3405d0;
import p160v.C3431q0;
import p177x0.InterfaceC3797e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.o0 */
/* loaded from: classes.dex */
public final class C2765o0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f14735f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f14736g;

    /* renamed from: h */
    public final /* synthetic */ Object f14737h;

    /* renamed from: i */
    public final /* synthetic */ Object f14738i;

    /* renamed from: j */
    public final /* synthetic */ Object f14739j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2765o0(Object obj, InterfaceC3810r interfaceC3810r, Object obj2, Object obj3, int i7, int i8) {
        super(2);
        this.f14735f = i8;
        this.f14737h = obj;
        this.f14736g = interfaceC3810r;
        this.f14738i = obj2;
        this.f14739j = obj3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f14735f) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC2163b abstractC2163b = (AbstractC2163b) this.f14737h;
                InterfaceC3797e interfaceC3797e = (InterfaceC3797e) this.f14738i;
                C3229q0 c3229q0 = (C3229q0) this.f14739j;
                AbstractC2064e.m3233c(abstractC2163b, this.f14736g, interfaceC3797e, c3229q0, (C2395p) obj, AbstractC2418w.m3957F(49));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f14737h;
                C3431q0 c3431q0 = (C3431q0) this.f14738i;
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f14739j;
                AbstractC3405d0.m5166a(interfaceC3277a, this.f14736g, c3431q0, interfaceC3281e, (C2395p) obj, AbstractC2418w.m3957F(1));
                return C1694m.f10482a;
        }
    }
}
