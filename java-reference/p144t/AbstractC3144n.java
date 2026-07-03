package p144t;

import java.util.HashMap;
import p001a0.C0074s0;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p140s2.EnumC3103m;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3802j;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.n */
/* loaded from: classes.dex */
public abstract class AbstractC3144n {

    /* renamed from: a */
    public static final HashMap f15811a = m4851c(true);

    /* renamed from: b */
    public static final HashMap f15812b = m4851c(false);

    /* renamed from: c */
    public static final C3142m f15813c = C3142m.f15805b;

    /* renamed from: a */
    public static final void m4849a(InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7) {
        int i8;
        c2395p.m3859a0(-211209833);
        if (c2395p.m3870g(interfaceC3810r)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(f15813c, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, 8, interfaceC3810r);
        }
    }

    /* renamed from: b */
    public static final void m4850b(AbstractC3237u0 abstractC3237u0, AbstractC3239v0 abstractC3239v0, InterfaceC3214k0 interfaceC3214k0, EnumC3103m enumC3103m, int i7, int i8, C3802j c3802j) {
        C3138k c3138k;
        C3802j c3802j2;
        C3802j c3802j3;
        Object mo4921n = interfaceC3214k0.mo4921n();
        if (mo4921n instanceof C3138k) {
            c3138k = (C3138k) mo4921n;
        } else {
            c3138k = null;
        }
        if (c3138k != null && (c3802j3 = c3138k.f15799s) != null) {
            c3802j2 = c3802j3;
        } else {
            c3802j2 = c3802j;
        }
        AbstractC3237u0.m4950h(abstractC3237u0, abstractC3239v0, c3802j2.mo5825a(AbstractC2072e.m3326b(abstractC3239v0.f16053e, abstractC3239v0.f16054f), AbstractC2072e.m3326b(i7, i8), enumC3103m));
    }

    /* renamed from: c */
    public static final HashMap m4851c(boolean z7) {
        HashMap hashMap = new HashMap(9);
        m4852d(hashMap, z7, C3795c.f17964e);
        m4852d(hashMap, z7, C3795c.f17965f);
        m4852d(hashMap, z7, C3795c.f17966g);
        m4852d(hashMap, z7, C3795c.f17967h);
        m4852d(hashMap, z7, C3795c.f17968i);
        m4852d(hashMap, z7, C3795c.f17969j);
        m4852d(hashMap, z7, C3795c.f17970k);
        m4852d(hashMap, z7, C3795c.f17971l);
        m4852d(hashMap, z7, C3795c.f17972m);
        return hashMap;
    }

    /* renamed from: d */
    public static final void m4852d(HashMap hashMap, boolean z7, C3802j c3802j) {
        hashMap.put(c3802j, new C3148p(c3802j, z7));
    }

    /* renamed from: e */
    public static final InterfaceC3217l0 m4853e(C3802j c3802j, boolean z7) {
        HashMap hashMap;
        if (z7) {
            hashMap = f15811a;
        } else {
            hashMap = f15812b;
        }
        InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) hashMap.get(c3802j);
        if (interfaceC3217l0 == null) {
            return new C3148p(c3802j, z7);
        }
        return interfaceC3217l0;
    }
}
