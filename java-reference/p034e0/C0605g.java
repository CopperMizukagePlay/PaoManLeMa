package p034e0;

import p000a.AbstractC0000a;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p132r2.EnumC3036j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class C0605g extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f1993f = 0;

    /* renamed from: g */
    public final /* synthetic */ boolean f1994g;

    /* renamed from: h */
    public final /* synthetic */ int f1995h;

    /* renamed from: i */
    public final /* synthetic */ Object f1996i;

    /* renamed from: j */
    public final /* synthetic */ Object f1997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605g(InterfaceC3810r interfaceC3810r, InterfaceC3277a interfaceC3277a, boolean z7, int i7) {
        super(2);
        this.f1996i = interfaceC3810r;
        this.f1997j = interfaceC3277a;
        this.f1994g = z7;
        this.f1995h = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f1993f;
        C2395p c2395p = (C2395p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC0000a.m5f((InterfaceC3810r) this.f1996i, (InterfaceC3277a) this.f1997j, this.f1994g, c2395p, AbstractC2418w.m3957F(this.f1995h | 1));
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2976d(this.f1994g, (EnumC3036j) this.f1996i, (C0622o0) this.f1997j, c2395p, AbstractC2418w.m3957F(this.f1995h | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605g(boolean z7, EnumC3036j enumC3036j, C0622o0 c0622o0, int i7) {
        super(2);
        this.f1994g = z7;
        this.f1996i = enumC3036j;
        this.f1997j = c0622o0;
        this.f1995h = i7;
    }
}
