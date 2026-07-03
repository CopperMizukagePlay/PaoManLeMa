package p063i0;

import p035e1.C0661j0;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p085l0.InterfaceC2390n2;
import p140s2.C3096f;
import p140s2.C3100j;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.a3 */
/* loaded from: classes.dex */
public final class C1846a3 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f10918f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2390n2 f10919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1846a3(InterfaceC2390n2 interfaceC2390n2, int i7) {
        super(1);
        this.f10918f = i7;
        this.f10919g = interfaceC2390n2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f10918f) {
            case 0:
                ((C0661j0) obj).m1432a(((Number) this.f10919g.getValue()).floatValue());
                return C1694m.f10482a;
            case 1:
                return new C3100j(AbstractC2064e.m3234d(((InterfaceC3093c) obj).mo4513Q(((C3096f) this.f10919g.getValue()).f15693e), 0));
            default:
                ((C0661j0) obj).m1432a(((Number) this.f10919g.getValue()).floatValue());
                return C1694m.f10482a;
        }
    }
}
