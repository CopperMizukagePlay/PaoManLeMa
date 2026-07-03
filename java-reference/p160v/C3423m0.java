package p160v;

import android.content.res.Resources;
import java.util.List;
import java.util.Map;
import p001a0.C0077t;
import p018c0.InputConnectionC0356z;
import p028d2.C0482o;
import p035e1.InterfaceC0674q;
import p047f6.C1548c;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p057h1.C1752b;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p077k.AbstractC2201l;
import p085l0.C2345c1;
import p085l0.C2361g1;
import p087l2.InputConnectionC2449m;
import p101n0.C2705e;
import p122q.InterfaceC2958x0;
import p128q6.C3002e;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p146t1.C3216l;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3497e1;
import p162v1.C3491c2;
import p162v1.C3502g0;
import p162v1.C3505h0;
import p162v1.InterfaceC3480a;
import p168w.AbstractC3642y;
import p168w.C3622e0;
import p168w.C3625h;
import p168w.C3637t;
import p170w1.AbstractC3681h0;
import p170w1.AbstractC3706n1;
import p170w1.C3686i1;
import p170w1.C3710o1;
import p170w1.C3718q1;
import p174w5.AbstractC3784a;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.m0 */
/* loaded from: classes.dex */
public final class C3423m0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f16593f;

    /* renamed from: g */
    public final /* synthetic */ Object f16594g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3423m0(int i7, Object obj) {
        super(1);
        this.f16593f = i7;
        this.f16594g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0262  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [t1.v0, v1.a] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        boolean z7;
        float f7;
        float m5611m;
        Number valueOf;
        int i7;
        float f8;
        boolean z8;
        boolean z9;
        boolean z10;
        float f9;
        switch (this.f16593f) {
            case 0:
                return new C0077t(6, (C3421l0) this.f16594g);
            case 1:
                InterfaceC3480a interfaceC3480a = (InterfaceC3480a) obj;
                C3505h0 c3505h0 = (C3505h0) this.f16594g;
                if (interfaceC3480a.mo5285A()) {
                    if (interfaceC3480a.mo5287a().f16915b) {
                        interfaceC3480a.mo5291x();
                    }
                    for (Map.Entry entry : interfaceC3480a.mo5287a().f16922i.entrySet()) {
                        C3505h0.m5452a(c3505h0, (C3216l) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC3480a.mo5288q());
                    }
                    AbstractC3497e1 abstractC3497e1 = interfaceC3480a.mo5288q().f16849u;
                    AbstractC3367j.m5097b(abstractC3497e1);
                    while (!abstractC3497e1.equals(c3505h0.f16914a.mo5288q())) {
                        for (C3216l c3216l : c3505h0.m5453b(abstractC3497e1).keySet()) {
                            C3505h0.m5452a(c3505h0, c3216l, c3505h0.m5454c(abstractC3497e1, c3216l), abstractC3497e1);
                        }
                        abstractC3497e1 = abstractC3497e1.f16849u;
                        AbstractC3367j.m5097b(abstractC3497e1);
                    }
                }
                return C1694m.f10482a;
            case 2:
                ((C2705e) this.f16594g).m4300b((InterfaceC3808p) obj);
                return Boolean.TRUE;
            case 3:
                ((C3502g0) this.f16594g).m5424c0((InterfaceC3093c) obj);
                return C1694m.f10482a;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                AbstractC3642y abstractC3642y = (AbstractC3642y) this.f16594g;
                C3002e c3002e = abstractC3642y.f17396c;
                long m5795E = AbstractC3784a.m5795E(((C2345c1) c3002e.f15486d).m3729g() * abstractC3642y.m5611m()) + (abstractC3642y.m5608i() * abstractC3642y.m5611m());
                float f10 = abstractC3642y.f17401h + floatValue;
                long m5795E2 = AbstractC3784a.m5795E(f10);
                abstractC3642y.f17401h = f10 - ((float) m5795E2);
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j6 = m5795E + m5795E2;
                    long m3531r = AbstractC2168e.m3531r(j6, abstractC3642y.f17400g, abstractC3642y.f17399f);
                    if (j6 != m3531r) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    long j7 = m3531r - m5795E;
                    float f11 = (float) j7;
                    abstractC3642y.f17402i = f11;
                    if (Math.abs(j7) != 0) {
                        C2361g1 c2361g1 = abstractC3642y.f17392E;
                        if (f11 > 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        c2361g1.setValue(Boolean.valueOf(z9));
                        C2361g1 c2361g12 = abstractC3642y.f17393F;
                        if (f11 < 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c2361g12.setValue(Boolean.valueOf(z10));
                    }
                    C3637t c3637t = (C3637t) abstractC3642y.f17408o.getValue();
                    int i8 = (int) j7;
                    int i9 = -i8;
                    int i10 = c3637t.f17363g;
                    int i11 = c3637t.f17362f;
                    ?? r15 = c3637t.f17357a;
                    int i12 = c3637t.f17358b + c3637t.f17359c;
                    if (!c3637t.f17371o && !r15.isEmpty() && c3637t.f17365i != null && (i7 = c3637t.f17368l - i9) >= 0 && i7 < i12) {
                        if (i12 != 0) {
                            f8 = i9 / i12;
                        } else {
                            f8 = 0.0f;
                        }
                        float f12 = c3637t.f17367k - f8;
                        f7 = floatValue;
                        if (c3637t.f17366j != null && f12 < 0.5f && f12 > -0.5f) {
                            C3625h c3625h = (C3625h) AbstractC1805m.m3045i0(r15);
                            C3625h c3625h2 = (C3625h) AbstractC1805m.m3052p0(r15);
                            if (i9 >= 0 ? Math.min(i11 - c3625h.f17313l, i10 - c3625h2.f17313l) > i9 : Math.min((c3625h.f17313l + i12) - i11, (c3625h2.f17313l + i12) - i10) > (-i9)) {
                                c3637t.f17367k -= f8;
                                c3637t.f17368l -= i9;
                                int size = r15.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    ((C3625h) r15.get(i13)).m5601a(i9);
                                }
                                List list = c3637t.f17372p;
                                int size2 = list.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    ((C3625h) list.get(i14)).m5601a(i9);
                                }
                                List list2 = c3637t.f17373q;
                                int size3 = list2.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    ((C3625h) list2.get(i15)).m5601a(i9);
                                }
                                if (!c3637t.f17369m && i9 > 0) {
                                    z8 = true;
                                    c3637t.f17369m = true;
                                } else {
                                    z8 = true;
                                }
                                abstractC3642y.m5606g(c3637t, z8);
                                abstractC3642y.f17388A.setValue(C1694m.f10482a);
                                if (!z7) {
                                    valueOf = Long.valueOf(j7);
                                } else {
                                    valueOf = Float.valueOf(f7);
                                }
                                floatValue = valueOf.floatValue();
                            }
                        }
                    } else {
                        f7 = floatValue;
                    }
                    AbstractC3642y abstractC3642y2 = (AbstractC3642y) c3002e.f15484b;
                    C2345c1 c2345c1 = (C2345c1) c3002e.f15486d;
                    if (abstractC3642y2.m5611m() == 0) {
                        m5611m = 0.0f;
                    } else {
                        m5611m = i8 / abstractC3642y2.m5611m();
                    }
                    c2345c1.m3730h(c2345c1.m3729g() + m5611m);
                    C3502g0 c3502g0 = (C3502g0) abstractC3642y.f17416w.getValue();
                    if (c3502g0 != null) {
                        c3502g0.m5437k();
                    }
                    if (!z7) {
                    }
                    floatValue = valueOf.floatValue();
                }
                return Float.valueOf(floatValue);
            case AbstractC3122c.f15761f /* 5 */:
                float floatValue2 = ((Number) obj).floatValue();
                AbstractC3642y abstractC3642y3 = ((C3622e0) this.f16594g).f17297b;
                if (abstractC3642y3.m5611m() != 0) {
                    f9 = floatValue2 / abstractC3642y3.m5611m();
                } else {
                    f9 = 0.0f;
                }
                abstractC3642y3.f17411r.m3742h(abstractC3642y3.m5607h(abstractC3642y3.m5608i() + AbstractC3784a.m5794D(f9)));
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                return Boolean.valueOf(((AbstractC2201l) this.f16594g).m3611a(((C0482o) obj).f1697g));
            case 7:
                return Boolean.valueOf(AbstractC3681h0.m5683j((C0482o) obj, (Resources) this.f16594g));
            case 8:
                return new C0077t(7, (C3686i1) this.f16594g);
            case AbstractC3122c.f15758c /* 9 */:
                boolean compareAndSet = AbstractC3706n1.f17622b.compareAndSet(false, true);
                C1694m c1694m = C1694m.f10482a;
                if (compareAndSet) {
                    ((C1548c) this.f16594g).mo2505v(c1694m);
                }
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                C3710o1 c3710o1 = (C3710o1) this.f16594g;
                InterfaceC0674q m106u = interfaceC1570d.mo2524E().m106u();
                InterfaceC3281e interfaceC3281e = c3710o1.f17633h;
                if (interfaceC3281e != null) {
                    interfaceC3281e.mo22d(m106u, (C1752b) interfaceC1570d.mo2524E().f153g);
                }
                return C1694m.f10482a;
            default:
                InputConnectionC2449m inputConnectionC2449m = (InputConnectionC2449m) obj;
                InputConnectionC0356z inputConnectionC0356z = inputConnectionC2449m.f13707b;
                if (inputConnectionC0356z != null) {
                    inputConnectionC2449m.m4022a(inputConnectionC0356z);
                    inputConnectionC2449m.f13707b = null;
                }
                C3718q1 c3718q1 = (C3718q1) this.f16594g;
                C2705e c2705e = c3718q1.f17678d;
                Object[] objArr = c2705e.f14517e;
                int i16 = c2705e.f14519g;
                int i17 = 0;
                while (true) {
                    if (i17 < i16) {
                        if (!AbstractC3367j.m5096a((C3491c2) objArr[i17], inputConnectionC2449m)) {
                            i17++;
                        }
                    } else {
                        i17 = -1;
                    }
                }
                if (i17 >= 0) {
                    c2705e.m4309k(i17);
                }
                if (c2705e.f14519g == 0) {
                    c3718q1.f17676b.mo52a();
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3423m0(C3622e0 c3622e0, InterfaceC2958x0 interfaceC2958x0) {
        super(1);
        this.f16593f = 5;
        this.f16594g = c3622e0;
    }
}
