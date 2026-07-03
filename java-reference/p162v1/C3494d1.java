package p162v1;

import p035e1.InterfaceC0674q;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.d1 */
/* loaded from: classes.dex */
public final class C3494d1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f16809f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3497e1 f16810g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3494d1(AbstractC3497e1 abstractC3497e1, int i7) {
        super(0);
        this.f16809f = i7;
        this.f16810g = abstractC3497e1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f16809f) {
            case 0:
                AbstractC3497e1 abstractC3497e1 = this.f16810g;
                InterfaceC0674q interfaceC0674q = abstractC3497e1.f16841I;
                AbstractC3367j.m5097b(interfaceC0674q);
                abstractC3497e1.m5327P0(interfaceC0674q, abstractC3497e1.f16840H);
                return C1694m.f10482a;
            default:
                AbstractC3497e1 abstractC3497e12 = this.f16810g.f16849u;
                if (abstractC3497e12 != null) {
                    abstractC3497e12.m5340c1();
                }
                return C1694m.f10482a;
        }
    }
}
