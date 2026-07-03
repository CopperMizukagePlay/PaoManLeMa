package p001a0;

import p019c1.C0370n;
import p019c1.C0373q;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p039e5.C0796d5;
import p053g5.C1694m;
import p063i0.C1956n1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p170w1.C3682h1;
import p170w1.InterfaceC3663c2;
import p172w3.C3781e;
import p186y3.C3850a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.i0 */
/* loaded from: classes.dex */
public final class C0034i0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f160f;

    /* renamed from: g */
    public final /* synthetic */ boolean f161g;

    /* renamed from: h */
    public final /* synthetic */ Object f162h;

    /* renamed from: i */
    public final /* synthetic */ Object f163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0034i0(Object obj, Object obj2, boolean z7, int i7) {
        super(0);
        this.f160f = i7;
        this.f162h = obj;
        this.f163i = obj2;
        this.f161g = z7;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        InterfaceC3663c2 interfaceC3663c2;
        switch (this.f160f) {
            case 0:
                C0043k1 c0043k1 = (C0043k1) this.f162h;
                C0373q c0373q = (C0373q) this.f163i;
                boolean z7 = this.f161g;
                if (!c0043k1.m118b()) {
                    c0373q.getClass();
                    c0373q.m843a(new C0370n(1, 3));
                } else if (!z7 && (interfaceC3663c2 = c0043k1.f213c) != null) {
                    ((C3682h1) interfaceC3663c2).m5701b();
                }
                return Boolean.TRUE;
            case 1:
                ((InterfaceC2425y0) this.f162h).setValue(new Object());
                ((InterfaceC3279c) this.f163i).mo23f(Boolean.valueOf(!this.f161g));
                return C1694m.f10482a;
            case 2:
                C1956n1 c1956n1 = (C1956n1) this.f162h;
                if (this.f161g) {
                    c1956n1.f11575a.getClass();
                    if (Boolean.TRUE.booleanValue()) {
                        AbstractC0525d0.m1141s((InterfaceC0516a0) this.f163i, null, new C0796d5(c1956n1, null, 2), 3);
                    }
                }
                return C1694m.f10482a;
            default:
                if (this.f161g) {
                    C3781e c3781e = (C3781e) this.f162h;
                    String str = (String) this.f163i;
                    C3850a c3850a = (C3850a) c3781e.f17917b;
                    synchronized (c3850a.f18079c) {
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0034i0(boolean z7, Object obj, Object obj2, int i7) {
        super(0);
        this.f160f = i7;
        this.f161g = z7;
        this.f162h = obj;
        this.f163i = obj2;
    }
}
