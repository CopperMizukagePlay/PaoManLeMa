package p063i0;

import p053g5.C1694m;
import p056h0.AbstractC1741o;
import p056h0.AbstractC1742p;
import p056h0.AbstractC1746t;
import p056h0.C1729c;
import p100n.C2661l1;
import p137s.InterfaceC3080i;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f1 */
/* loaded from: classes.dex */
public final class C1889f1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f11175f;

    /* renamed from: g */
    public final /* synthetic */ C1898g1 f11176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1889f1(C1898g1 c1898g1, int i7) {
        super(0);
        this.f11175f = i7;
        this.f11176g = c1898g1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        AbstractC1742p abstractC1742p;
        int i7 = this.f11175f;
        C1898g1 c1898g1 = this.f11176g;
        switch (i7) {
            case 0:
                return AbstractC1991r4.f11722a;
            default:
                if (((C1983q4) AbstractC3498f.m5369i(c1898g1, AbstractC1999s4.f11758b)) == null) {
                    AbstractC1742p abstractC1742p2 = c1898g1.f11218y;
                    if (abstractC1742p2 != null) {
                        c1898g1.m5484L0(abstractC1742p2);
                    }
                } else if (c1898g1.f11218y == null) {
                    int i8 = 0;
                    C1880e1 c1880e1 = new C1880e1(i8, c1898g1);
                    C1889f1 c1889f1 = new C1889f1(c1898g1, i8);
                    InterfaceC3080i interfaceC3080i = c1898g1.f11214u;
                    boolean z7 = c1898g1.f11215v;
                    float f7 = c1898g1.f11216w;
                    C2661l1 c2661l1 = AbstractC1741o.f10629a;
                    if (AbstractC1746t.f10644a) {
                        abstractC1742p = new C1729c(interfaceC3080i, z7, f7, c1880e1, c1889f1);
                    } else {
                        abstractC1742p = new AbstractC1742p(interfaceC3080i, z7, f7, c1880e1, c1889f1);
                    }
                    c1898g1.m5483K0(abstractC1742p);
                    c1898g1.f11218y = abstractC1742p;
                }
                return C1694m.f10482a;
        }
    }
}
