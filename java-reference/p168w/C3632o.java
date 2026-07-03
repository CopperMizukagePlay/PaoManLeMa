package p168w;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.o */
/* loaded from: classes.dex */
public final class C3632o extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ boolean f17338f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3642y f17339g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0516a0 f17340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3632o(boolean z7, AbstractC3642y abstractC3642y, InterfaceC0516a0 interfaceC0516a0) {
        super(1);
        this.f17338f = z7;
        this.f17339g = abstractC3642y;
        this.f17340h = interfaceC0516a0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0477j c0477j = (C0477j) obj;
        boolean z7 = this.f17338f;
        InterfaceC0516a0 interfaceC0516a0 = this.f17340h;
        AbstractC3642y abstractC3642y = this.f17339g;
        if (z7) {
            C3631n c3631n = new C3631n(abstractC3642y, interfaceC0516a0, 0);
            InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
            c0477j.m1036d(AbstractC0476i.f1680x, new C0468a(null, c3631n));
            c0477j.m1036d(AbstractC0476i.f1682z, new C0468a(null, new C3631n(abstractC3642y, interfaceC0516a0, 1)));
        } else {
            C3631n c3631n2 = new C3631n(abstractC3642y, interfaceC0516a0, 2);
            InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
            c0477j.m1036d(AbstractC0476i.f1681y, new C0468a(null, c3631n2));
            c0477j.m1036d(AbstractC0476i.f1655A, new C0468a(null, new C3631n(abstractC3642y, interfaceC0516a0, 3)));
        }
        return C1694m.f10482a;
    }
}
