package p001a0;

import p035e1.C0654g;
import p035e1.C0666m;
import p035e1.InterfaceC0674q;
import p049g1.C1568b;
import p053g5.C1694m;
import p063i0.C1868c7;
import p092m.AbstractC2487d;
import p100n.C2635d;
import p100n.C2653j;
import p100n.C2662m;
import p122q.C2890a2;
import p122q.InterfaceC2958x0;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3376s;
import p162v1.C3508i0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.d */
/* loaded from: classes.dex */
public final class C0013d extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f84f;

    /* renamed from: g */
    public final /* synthetic */ float f85g;

    /* renamed from: h */
    public final /* synthetic */ Object f86h;

    /* renamed from: i */
    public final /* synthetic */ Object f87i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0013d(float f7, Object obj, Object obj2, int i7) {
        super(1);
        this.f84f = i7;
        this.f85g = f7;
        this.f86h = obj;
        this.f87i = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r2 < r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 > r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r2 = r1;
     */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        float f7;
        long m5795E;
        float floatValue;
        switch (this.f84f) {
            case 0:
                C3508i0 c3508i0 = (C3508i0) obj;
                c3508i0.m5460a();
                float f8 = this.f85g;
                C0654g c0654g = (C0654g) this.f86h;
                C0666m c0666m = (C0666m) this.f87i;
                C1568b c1568b = c3508i0.f16933e;
                C0031h1 c0031h1 = c1568b.f10182f;
                long m109x = c0031h1.m109x();
                c0031h1.m106u().mo1341m();
                try {
                    C0019e1 c0019e1 = (C0019e1) c0031h1.f152f;
                    c0019e1.m50v(f8, 0.0f);
                    InterfaceC0674q m106u = ((C0031h1) c0019e1.f109e).m106u();
                    int i7 = (int) 0;
                    m106u.mo1336h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i7));
                    m106u.mo1337i();
                    m106u.mo1336h(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i7));
                    c1568b.m2528e(c0654g, c0666m);
                    AbstractC2487d.m4052p(c0031h1, m109x);
                    return C1694m.f10482a;
                } catch (Throwable th) {
                    AbstractC2487d.m4052p(c0031h1, m109x);
                    throw th;
                }
            case 1:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) this.f86h;
                C2635d c2635d = ((C1868c7) this.f87i).f11026v;
                if (c2635d != null) {
                    f7 = ((Number) c2635d.m4206d()).floatValue();
                } else {
                    f7 = this.f85g;
                }
                AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, (int) f7, 0);
                return C1694m.f10482a;
            case 2:
                long longValue = ((Number) obj).longValue();
                C2890a2 c2890a2 = (C2890a2) this.f86h;
                if (c2890a2.f15095b == Long.MIN_VALUE) {
                    c2890a2.f15095b = longValue;
                }
                float f9 = c2890a2.f15098e;
                C2662m c2662m = new C2662m(f9);
                float f10 = this.f85g;
                C2662m c2662m2 = C2890a2.f15093f;
                if (f10 == 0.0f) {
                    m5795E = c2890a2.f15094a.mo4095c(new C2662m(f9), c2662m2, c2890a2.f15096c);
                } else {
                    m5795E = AbstractC3784a.m5795E(((float) (longValue - c2890a2.f15095b)) / f10);
                }
                long j6 = m5795E;
                float f11 = ((C2662m) c2890a2.f15094a.mo631o(j6, c2662m, c2662m2, c2890a2.f15096c)).f14358a;
                c2890a2.f15096c = (C2662m) c2890a2.f15094a.mo630n(j6, c2662m, c2662m2, c2890a2.f15096c);
                c2890a2.f15095b = longValue;
                float f12 = c2890a2.f15098e - f11;
                c2890a2.f15098e = f11;
                ((InterfaceC3279c) this.f87i).mo23f(Float.valueOf(f12));
                return C1694m.f10482a;
            default:
                C2653j c2653j = (C2653j) obj;
                C3376s c3376s = (C3376s) this.f86h;
                float f13 = this.f85g;
                float f14 = 0.0f;
                if (f13 > 0.0f) {
                    floatValue = ((Number) c2653j.f14336e.getValue()).floatValue();
                    break;
                } else if (f13 < 0.0f) {
                    floatValue = ((Number) c2653j.f14336e.getValue()).floatValue();
                    break;
                }
                float f15 = f14 - c3376s.f16448e;
                if (f15 != ((InterfaceC2958x0) this.f87i).mo4566a(f15) || f14 != ((Number) c2653j.f14336e.getValue()).floatValue()) {
                    c2653j.m4260a();
                }
                c3376s.f16448e += f15;
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013d(C2890a2 c2890a2, float f7, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f84f = 2;
        this.f86h = c2890a2;
        this.f85g = f7;
        this.f87i = interfaceC3279c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013d(AbstractC3239v0 abstractC3239v0, C1868c7 c1868c7, float f7) {
        super(1);
        this.f84f = 1;
        this.f86h = abstractC3239v0;
        this.f87i = c1868c7;
        this.f85g = f7;
    }
}
