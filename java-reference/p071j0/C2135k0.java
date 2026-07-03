package p071j0;

import p005a6.InterfaceC0114e;
import p027d1.C0467e;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0473f;
import p028d2.C0477j;
import p028d2.C0490w;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p085l0.C2353e1;
import p085l0.InterfaceC2425y0;
import p100n.C2643f1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.k0 */
/* loaded from: classes.dex */
public final class C2135k0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f12450f;

    /* renamed from: g */
    public final /* synthetic */ float f12451g;

    /* renamed from: h */
    public final /* synthetic */ Object f12452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2135k0(float f7, Object obj, int i7) {
        super(1);
        this.f12450f = i7;
        this.f12451g = f7;
        this.f12452h = obj;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f12450f;
        boolean z7 = true;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f12452h;
        float f7 = this.f12451g;
        switch (i7) {
            case 0:
                long j6 = ((C0467e) obj).f1637a;
                float m1026d = C0467e.m1026d(j6) * f7;
                float m1024b = C0467e.m1024b(j6) * f7;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                if (C0467e.m1026d(((C0467e) interfaceC2425y0.getValue()).f1637a) != m1026d || C0467e.m1024b(((C0467e) interfaceC2425y0.getValue()).f1637a) != m1024b) {
                    interfaceC2425y0.setValue(new C0467e(AbstractC1793a0.m2975c(m1026d, m1024b)));
                }
                return c1694m;
            case 1:
                long longValue = ((Number) obj).longValue();
                C2643f1 c2643f1 = (C2643f1) obj2;
                boolean m4242g = c2643f1.m4242g();
                C2353e1 c2353e1 = c2643f1.f14311g;
                if (!m4242g) {
                    if (c2353e1.m3793g() == Long.MIN_VALUE) {
                        c2353e1.m3794h(longValue);
                        c2643f1.f14305a.f14344a.setValue(Boolean.TRUE);
                    }
                    long m3793g = longValue - c2353e1.m3793g();
                    if (f7 != 0.0f) {
                        m3793g = AbstractC3784a.m5795E(m3793g / f7);
                    }
                    if (c2643f1.f14306b == null) {
                        c2643f1.f14310f.m3794h(m3793g);
                    }
                    if (f7 != 0.0f) {
                        z7 = false;
                    }
                    c2643f1.m4243h(m3793g, z7);
                }
                return c1694m;
            default:
                C3876a c3876a = (C3876a) obj2;
                C0473f c0473f = new C0473f(((Number) AbstractC2168e.m3532s(Float.valueOf(f7), c3876a)).floatValue(), c3876a);
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1742c;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[1];
                c0490w.m1066a((C0477j) obj, c0473f);
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135k0(C2643f1 c2643f1, float f7) {
        super(1);
        this.f12450f = 1;
        this.f12452h = c2643f1;
        this.f12451g = f7;
    }
}
