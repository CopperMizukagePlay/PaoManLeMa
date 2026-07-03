package p034e0;

import p005a6.InterfaceC0114e;
import p027d1.C0464b;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0473f;
import p028d2.C0477j;
import p028d2.C0490w;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.s0 */
/* loaded from: classes.dex */
public final class C0630s0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f2087f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f2088g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0630s0(int i7, InterfaceC3277a interfaceC3277a) {
        super(1);
        this.f2087f = i7;
        this.f2088g = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f2087f;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC3277a interfaceC3277a = this.f2088g;
        switch (i7) {
            case 0:
                return new C0464b(((C0464b) interfaceC3277a.mo52a()).f1623a);
            case 1:
                long j6 = ((C0464b) obj).f1623a;
                interfaceC3277a.mo52a();
                return c1694m;
            default:
                C0473f c0473f = new C0473f(((Number) interfaceC3277a.mo52a()).floatValue(), new C3876a(0.0f, 1.0f));
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1742c;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[1];
                c0490w.m1066a((C0477j) obj, c0473f);
                return c1694m;
        }
    }
}
