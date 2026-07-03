package p071j0;

import android.content.Context;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0213t;
import p001a0.C0037j;
import p001a0.C0046l0;
import p001a0.C0070r0;
import p032d6.AbstractC0525d0;
import p035e1.C0677s;
import p050g2.C1604o0;
import p050g2.C1615x;
import p050g2.C1617z;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1862c1;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2401q1;
import p085l0.C2405r1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.t */
/* loaded from: classes.dex */
public abstract class AbstractC2152t {

    /* renamed from: a */
    public static final C1617z f12529a = new C1617z(null, new C1615x());

    /* renamed from: a */
    public static final void m3495a(InterfaceC0213t interfaceC0213t, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        boolean z7;
        c2395p.m3859a0(-1868327245);
        if (c2395p.m3874i(interfaceC0213t)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i8 | i7;
        if (c2395p.m3874i(interfaceC3279c)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(interfaceC3277a)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i13 = i12 | i10;
        if ((i13 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean z8 = false;
            if ((i13 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean m3874i = z7 | c2395p.m3874i(interfaceC0213t);
            if ((i13 & 896) == 256) {
                z8 = true;
            }
            boolean z9 = m3874i | z8;
            Object m3847O = c2395p.m3847O();
            if (z9 || m3847O == C2375k.f13421a) {
                m3847O = new C0037j(6, interfaceC0213t, interfaceC3277a, interfaceC3279c);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2418w.m3962d(interfaceC0213t, (InterfaceC3279c) m3847O, c2395p);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0046l0(interfaceC0213t, interfaceC3279c, interfaceC3277a, i7, 2);
        }
    }

    /* renamed from: b */
    public static final void m3496b(long j6, C1604o0 c1604o0, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-716124955);
        if ((i7 & 6) == 0) {
            if (c2395p.m3868f(j6)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(c1604o0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i8 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C2336a0 c2336a0 = AbstractC1850a7.f10933a;
            AbstractC2418w.m3960b(new C2401q1[]{AbstractC1862c1.f10996a.mo3716a(new C0677s(j6)), c2336a0.mo3716a(((C1604o0) c2395p.m3878k(c2336a0)).m2596d(c1604o0))}, interfaceC3281e, c2395p, ((i8 >> 3) & 112) | 8);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2133j0(j6, c1604o0, interfaceC3281e, i7, 0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3497c(InterfaceC3277a interfaceC3277a, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C2132j c2132j;
        int i7;
        if (abstractC2583c instanceof C2132j) {
            C2132j c2132j2 = (C2132j) abstractC2583c;
            int i8 = c2132j2.f12439i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2132j2.f12439i = i8 - Integer.MIN_VALUE;
                c2132j = c2132j2;
                Object obj = c2132j.f12438h;
                i7 = c2132j.f12439i;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0070r0 c0070r0 = new C0070r0(interfaceC3277a, interfaceC3281e, (InterfaceC2313c) null, 16);
                    c2132j.f12439i = 1;
                    Object m1130h = AbstractC0525d0.m1130h(c0070r0, c2132j);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1130h == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            }
        }
        c2132j = new AbstractC2583c(abstractC2583c);
        Object obj2 = c2132j.f12438h;
        i7 = c2132j.f12439i;
        if (i7 == 0) {
        }
        return C1694m.f10482a;
    }

    /* renamed from: d */
    public static final String m3498d(int i7, C2395p c2395p) {
        c2395p.m3878k(AndroidCompositionLocals_androidKt.f785a);
        return ((Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b)).getResources().getString(i7);
    }
}
