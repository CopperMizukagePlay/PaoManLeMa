package p146t1;

import p053g5.C1694m;
import p085l0.AbstractC2406s;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.e1 */
/* loaded from: classes.dex */
public final class C3197e1 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f15945f;

    /* renamed from: g */
    public final /* synthetic */ C3200f1 f15946g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3197e1(C3200f1 c3200f1, int i7) {
        super(2);
        this.f15945f = i7;
        this.f15946g = c3200f1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f15945f) {
            case 0:
                this.f15946g.m4905a().f15959f = (AbstractC2406s) obj2;
                return C1694m.f10482a;
            case 1:
                C3205h0 m4905a = this.f15946g.m4905a();
                ((C3502g0) obj).m5430f0(new C3196e0(m4905a, (InterfaceC3281e) obj2, m4905a.f15973t));
                return C1694m.f10482a;
            default:
                C3502g0 c3502g0 = (C3502g0) obj;
                C3200f1 c3200f1 = this.f15946g;
                InterfaceC3206h1 interfaceC3206h1 = c3200f1.f15948a;
                C3205h0 c3205h0 = c3502g0.f16874K;
                if (c3205h0 == null) {
                    c3205h0 = new C3205h0(c3502g0, interfaceC3206h1);
                    c3502g0.f16874K = c3205h0;
                }
                c3200f1.f15949b = c3205h0;
                c3200f1.m4905a().m4907d();
                C3205h0 m4905a2 = c3200f1.m4905a();
                if (m4905a2.f15960g != interfaceC3206h1) {
                    m4905a2.f15960g = interfaceC3206h1;
                    m4905a2.m4908e(false);
                    C3502g0.m5396Y(m4905a2.f15958e, false, 7);
                }
                return C1694m.f10482a;
        }
    }
}
