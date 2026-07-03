package p001a0;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p087l2.C2437c0;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.C2460x;
import p087l2.InterfaceC2454r;
import p100n.AbstractC2638e;
import p100n.C2635d;
import p100n.C2642f0;
import p100n.C2648h0;
import p100n.C2653j;
import p100n.C2659l;
import p101n0.C2705e;
import p146t1.C3200f1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3374q;
import p158u5.C3376s;
import p160v.C3409f0;
import p160v.C3431q0;
import p160v.RunnableC3399b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.w */
/* loaded from: classes.dex */
public final class C0087w extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f400f;

    /* renamed from: g */
    public final /* synthetic */ Object f401g;

    /* renamed from: h */
    public final /* synthetic */ Object f402h;

    /* renamed from: i */
    public final /* synthetic */ Object f403i;

    /* renamed from: j */
    public final /* synthetic */ Object f404j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0087w(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(1);
        this.f400f = i7;
        this.f401g = obj;
        this.f402h = obj2;
        this.f403i = obj3;
        this.f404j = obj4;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, u5.v] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long j6;
        boolean z7;
        switch (this.f400f) {
            case 0:
                C0043k1 c0043k1 = (C0043k1) this.f401g;
                if (c0043k1.m118b()) {
                    C2460x c2460x = (C2460x) this.f402h;
                    C2459w c2459w = (C2459w) this.f403i;
                    C0068q2 c0068q2 = c0043k1.f214d;
                    C2447k c2447k = (C2447k) this.f404j;
                    C0006b0 c0006b0 = c0043k1.f230t;
                    C0006b0 c0006b02 = c0043k1.f231u;
                    ?? obj2 = new Object();
                    C0037j c0037j = new C0037j(2, c0068q2, (Object) obj2, c0006b0);
                    InterfaceC2454r interfaceC2454r = c2460x.f13726a;
                    interfaceC2454r.mo689h(c2459w, c2447k, c0037j, c0006b02);
                    C2437c0 c2437c0 = new C2437c0(c2460x, interfaceC2454r);
                    c2460x.f13727b.set(c2437c0);
                    obj2.f16451e = c2437c0;
                    c0043k1.f215e = c2437c0;
                }
                return new Object();
            case 1:
                C2653j c2653j = (C2653j) obj;
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f403i;
                C2635d c2635d = (C2635d) this.f401g;
                AbstractC2638e.m4233s(c2653j, c2635d.f14259c);
                C2361g1 c2361g1 = c2653j.f14336e;
                Object m4203a = C2635d.m4203a(c2635d, c2361g1.getValue());
                if (!AbstractC3367j.m5096a(m4203a, c2361g1.getValue())) {
                    c2635d.f14259c.f14349f.setValue(m4203a);
                    ((C2659l) this.f402h).f14349f.setValue(m4203a);
                    if (interfaceC3279c != null) {
                        interfaceC3279c.mo23f(c2635d);
                    }
                    c2653j.m4260a();
                    ((C3374q) this.f404j).f16446e = true;
                } else if (interfaceC3279c != null) {
                    interfaceC3279c.mo23f(c2635d);
                }
                return C1694m.f10482a;
            case 2:
                long longValue = ((Number) obj).longValue();
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f404j;
                C3376s c3376s = (C3376s) this.f403i;
                C2648h0 c2648h0 = (C2648h0) this.f402h;
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) ((InterfaceC2425y0) this.f401g).getValue();
                if (interfaceC2390n2 != null) {
                    j6 = ((Number) interfaceC2390n2.getValue()).longValue();
                } else {
                    j6 = longValue;
                }
                long j7 = c2648h0.f14321c;
                C2705e c2705e = c2648h0.f14319a;
                int i7 = 0;
                if (j7 == Long.MIN_VALUE || c3376s.f16448e != AbstractC2638e.m4228n(interfaceC0516a0.mo1107i())) {
                    c2648h0.f14321c = longValue;
                    int i8 = c2705e.f14519g;
                    if (i8 > 0) {
                        Object[] objArr = c2705e.f14517e;
                        int i9 = 0;
                        do {
                            ((C2642f0) objArr[i9]).f14302k = true;
                            i9++;
                        } while (i9 < i8);
                    }
                    c3376s.f16448e = AbstractC2638e.m4228n(interfaceC0516a0.mo1107i());
                }
                float f7 = c3376s.f16448e;
                if (f7 == 0.0f) {
                    int i10 = c2705e.f14519g;
                    if (i10 > 0) {
                        Object[] objArr2 = c2705e.f14517e;
                        do {
                            C2642f0 c2642f0 = (C2642f0) objArr2[i7];
                            c2642f0.f14299h.setValue(c2642f0.f14300i.f14503c);
                            c2642f0.f14302k = true;
                            i7++;
                        } while (i7 < i10);
                    }
                } else {
                    long j8 = ((float) (j6 - c2648h0.f14321c)) / f7;
                    int i11 = c2705e.f14519g;
                    if (i11 > 0) {
                        Object[] objArr3 = c2705e.f14517e;
                        int i12 = 0;
                        z7 = true;
                        do {
                            C2642f0 c2642f02 = (C2642f0) objArr3[i12];
                            if (!c2642f02.f14301j) {
                                c2642f02.f14304m.f14320b.setValue(Boolean.FALSE);
                                if (c2642f02.f14302k) {
                                    c2642f02.f14302k = false;
                                    c2642f02.f14303l = j8;
                                }
                                long j9 = j8 - c2642f02.f14303l;
                                c2642f02.f14299h.setValue(c2642f02.f14300i.mo4249c(j9));
                                c2642f02.f14301j = c2642f02.f14300i.m4254h(j9);
                            }
                            if (!c2642f02.f14301j) {
                                z7 = false;
                            }
                            i12++;
                        } while (i12 < i11);
                    } else {
                        z7 = true;
                    }
                    c2648h0.f14322d.setValue(Boolean.valueOf(!z7));
                }
                return C1694m.f10482a;
            default:
                C3431q0 c3431q0 = (C3431q0) this.f401g;
                c3431q0.f16608c = new C0031h1((C3409f0) this.f402h, (C3200f1) this.f403i, (RunnableC3399b) this.f404j, 13);
                return new C0077t(5, c3431q0);
        }
    }
}
