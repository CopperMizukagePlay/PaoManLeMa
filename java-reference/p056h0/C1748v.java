package p056h0;

import java.util.ArrayList;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0062p0;
import p001a0.C0068q2;
import p027d1.C0464b;
import p027d1.C0467e;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p034e0.C0614k0;
import p035e1.C0677s;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p060h5.AbstractC1805m;
import p077k.C2209p;
import p082k5.InterfaceC2313c;
import p085l0.C2349d1;
import p092m.AbstractC2487d;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2635d;
import p100n.C2661l1;
import p100n.C2673p1;
import p117p1.AbstractC2866q;
import p117p1.C2848d;
import p117p1.C2868s;
import p137s.C3072a;
import p137s.C3073b;
import p137s.C3074c;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3077f;
import p137s.C3078g;
import p137s.InterfaceC3079h;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p160v.C3419k0;
import p162v1.C3502g0;
import p162v1.C3508i0;
import p162v1.C3531q;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.v */
/* loaded from: classes.dex */
public final class C1748v {

    /* renamed from: a */
    public boolean f10650a;

    /* renamed from: b */
    public Object f10651b;

    /* renamed from: c */
    public Object f10652c = AbstractC2638e.m4215a(0.0f);

    /* renamed from: d */
    public Object f10653d = new ArrayList();

    /* renamed from: e */
    public Object f10654e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1748v(InterfaceC3277a interfaceC3277a, boolean z7) {
        this.f10650a = z7;
        this.f10651b = (AbstractC3368k) interfaceC3277a;
    }

    /* renamed from: a */
    public void m2800a(C3508i0 c3508i0, float f7, long j6) {
        C1568b c1568b = c3508i0.f16933e;
        float floatValue = ((Number) ((C2635d) this.f10652c).m4206d()).floatValue();
        if (floatValue > 0.0f) {
            long m1453b = C0677s.m1453b(floatValue, j6);
            if (this.f10650a) {
                float m1026d = C0467e.m1026d(c1568b.mo2546c());
                float m1024b = C0467e.m1024b(c1568b.mo2546c());
                C0031h1 c0031h1 = c1568b.f10182f;
                long m109x = c0031h1.m109x();
                c0031h1.m106u().mo1341m();
                ((C0031h1) ((C0019e1) c0031h1.f152f).f109e).m106u().mo1335g(0.0f, 0.0f, m1026d, m1024b, 1);
                InterfaceC1570d.m2540R(c3508i0, m1453b, f7, 0L, null, 124);
                AbstractC2487d.m4052p(c0031h1, m109x);
                return;
            }
            InterfaceC1570d.m2540R(c3508i0, m1453b, f7, 0L, null, 124);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [t5.a, u5.k] */
    /* renamed from: b */
    public void m2801b(InterfaceC3079h interfaceC3079h, InterfaceC0516a0 interfaceC0516a0) {
        float f7;
        ArrayList arrayList = (ArrayList) this.f10653d;
        boolean z7 = interfaceC3079h instanceof C3077f;
        if (z7) {
            arrayList.add(interfaceC3079h);
        } else if (interfaceC3079h instanceof C3078g) {
            arrayList.remove(((C3078g) interfaceC3079h).f15678a);
        } else if (interfaceC3079h instanceof C3075d) {
            arrayList.add(interfaceC3079h);
        } else if (interfaceC3079h instanceof C3076e) {
            arrayList.remove(((C3076e) interfaceC3079h).f15677a);
        } else if (interfaceC3079h instanceof C3073b) {
            arrayList.add(interfaceC3079h);
        } else if (interfaceC3079h instanceof C3074c) {
            arrayList.remove(((C3074c) interfaceC3079h).f15676a);
        } else if (interfaceC3079h instanceof C3072a) {
            arrayList.remove(((C3072a) interfaceC3079h).f15675a);
        } else {
            return;
        }
        InterfaceC3079h interfaceC3079h2 = (InterfaceC3079h) AbstractC1805m.m3053q0(arrayList);
        if (!AbstractC3367j.m5096a((InterfaceC3079h) this.f10654e, interfaceC3079h2)) {
            InterfaceC2313c interfaceC2313c = null;
            if (interfaceC3079h2 != null) {
                C1732f c1732f = (C1732f) ((AbstractC3368k) this.f10651b).mo52a();
                if (z7) {
                    f7 = c1732f.f10593c;
                } else if (interfaceC3079h instanceof C3075d) {
                    f7 = c1732f.f10592b;
                } else if (interfaceC3079h instanceof C3073b) {
                    f7 = c1732f.f10591a;
                } else {
                    f7 = 0.0f;
                }
                C2661l1 c2661l1 = AbstractC1741o.f10629a;
                if (!(interfaceC3079h2 instanceof C3077f)) {
                    if (interfaceC3079h2 instanceof C3075d) {
                        c2661l1 = new C2661l1(45, AbstractC2699z.f14500d, 2);
                    } else if (interfaceC3079h2 instanceof C3073b) {
                        c2661l1 = new C2661l1(45, AbstractC2699z.f14500d, 2);
                    }
                }
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C1747u(this, f7, c2661l1, null), 3);
            } else {
                InterfaceC3079h interfaceC3079h3 = (InterfaceC3079h) this.f10654e;
                C2661l1 c2661l12 = AbstractC1741o.f10629a;
                if (!(interfaceC3079h3 instanceof C3077f) && !(interfaceC3079h3 instanceof C3075d) && (interfaceC3079h3 instanceof C3073b)) {
                    c2661l12 = new C2661l1(150, AbstractC2699z.f14500d, 2);
                }
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0062p0(this, c2661l12, interfaceC2313c, 19), 3);
            }
            this.f10654e = interfaceC3079h2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public int m2802c(C0068q2 c0068q2, C3728t c3728t, boolean z7) {
        Object[] objArr;
        int i7;
        int i8;
        C2848d c2848d = (C2848d) this.f10652c;
        C3531q c3531q = (C3531q) this.f10654e;
        if (this.f10650a) {
            return 0;
        }
        try {
            this.f10650a = true;
            C0614k0 m4287s = ((C2673p1) this.f10653d).m4287s(c0068q2, c3728t);
            C2209p c2209p = (C2209p) m4287s.f2018c;
            int m3616c = c2209p.m3616c();
            for (int i9 = 0; i9 < m3616c; i9++) {
                C2868s c2868s = (C2868s) c2209p.m3617d(i9);
                if (!c2868s.f15009d && !c2868s.f15013h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int m3616c2 = c2209p.m3616c();
            for (int i10 = 0; i10 < m3616c2; i10++) {
                C2868s c2868s2 = (C2868s) c2209p.m3617d(i10);
                if (objArr != false || AbstractC2866q.m4542a(c2868s2)) {
                    ((C3502g0) this.f10651b).m5399A(c2868s2.f15008c, (C3531q) this.f10654e, c2868s2.f15014i, true);
                    if (!c3531q.f16999e.m3562g()) {
                        c2848d.m4506a(c2868s2.f15006a, c3531q, AbstractC2866q.m4542a(c2868s2));
                        c3531q.clear();
                    }
                }
            }
            boolean m4507b = c2848d.m4507b(m4287s, z7);
            if (!m4287s.f2017b) {
                int m3616c3 = c2209p.m3616c();
                for (int i11 = 0; i11 < m3616c3; i11++) {
                    C2868s c2868s3 = (C2868s) c2209p.m3617d(i11);
                    if (!C0464b.m1006b(AbstractC2866q.m4546e(c2868s3, true), 0L) && c2868s3.m4551b()) {
                        i7 = 1;
                        break;
                    }
                }
            }
            i7 = 0;
            int m3616c4 = c2209p.m3616c();
            int i12 = 0;
            while (true) {
                if (i12 < m3616c4) {
                    if (((C2868s) c2209p.m3617d(i12)).m4551b()) {
                        i8 = 1;
                        break;
                    }
                    i12++;
                } else {
                    i8 = 0;
                    break;
                }
            }
            int i13 = (m4507b ? 1 : 0) | (i7 << 1) | (i8 << 2);
            this.f10650a = false;
            return i13;
        } catch (Throwable th) {
            this.f10650a = false;
            throw th;
        }
    }

    /* renamed from: d */
    public void m2803d(int i7, int i8) {
        if (i7 >= 0.0f) {
            ((C2349d1) this.f10651b).m3742h(i7);
            ((C3419k0) this.f10654e).m5180a(i7);
            ((C2349d1) this.f10652c).m3742h(i8);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i7 + ')').toString());
        }
    }
}
