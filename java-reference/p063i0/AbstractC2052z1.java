package p063i0;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p007ui.layout.AbstractC0172a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import com.paoman.lema.R;
import p000a.AbstractC0000a;
import p001a0.C0078t0;
import p019c1.C0373q;
import p019c1.C0380x;
import p027d1.C0465c;
import p034e0.C0593a;
import p071j0.AbstractC2152t;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3144n;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3663c2;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.z1 */
/* loaded from: classes.dex */
public abstract class AbstractC2052z1 {

    /* renamed from: a */
    public static final float f12199a = 16;

    /* renamed from: a */
    public static final void m3218a(boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        boolean z9;
        InterfaceC3093c interfaceC3093c;
        Object obj;
        int i9;
        int i10;
        int i11;
        View view;
        int i12;
        InterfaceC2425y0 interfaceC2425y0;
        C3173d c3173d2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13 = z7;
        InterfaceC3279c interfaceC3279c2 = interfaceC3279c;
        c2395p.m3859a0(2067579792);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z13)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i8 = i16 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3279c2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i8 |= i15;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i8 |= i14;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i8 |= i13;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
            c3173d2 = c3173d;
        } else {
            Object obj2 = (Configuration) c2395p.m3878k(AndroidCompositionLocals_androidKt.f785a);
            View view2 = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
            InterfaceC3093c interfaceC3093c2 = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
            int mo4513Q = interfaceC3093c2.mo4513Q(AbstractC2021v2.f11948a);
            Object m3847O = c2395p.m3847O();
            Object obj3 = C2375k.f13421a;
            if (m3847O == obj3) {
                m3847O = AbstractC2418w.m3980x(null);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O;
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj3) {
                m3847O2 = new C2349d1(0);
                c2395p.m3877j0(m3847O2);
            }
            C2349d1 c2349d1 = (C2349d1) m3847O2;
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj3) {
                m3847O3 = new C2349d1(0);
                c2395p.m3877j0(m3847O3);
            }
            C2349d1 c2349d12 = (C2349d1) m3847O3;
            Object m3847O4 = c2395p.m3847O();
            if (m3847O4 == obj3) {
                m3847O4 = new C0373q();
                c2395p.m3877j0(m3847O4);
            }
            C0373q c0373q = (C0373q) m3847O4;
            InterfaceC3663c2 interfaceC3663c2 = (InterfaceC3663c2) c2395p.m3878k(AbstractC3674f1.f17525p);
            String m3498d = AbstractC2152t.m3498d(R.string.m3c_dropdown_menu_expanded, c2395p);
            String m3498d2 = AbstractC2152t.m3498d(R.string.m3c_dropdown_menu_collapsed, c2395p);
            int i17 = i8;
            String m3498d3 = AbstractC2152t.m3498d(R.string.m3c_dropdown_menu_toggle, c2395p);
            Object m3847O5 = c2395p.m3847O();
            if (m3847O5 == obj3) {
                m3847O5 = AbstractC2418w.m3980x(new Object());
                c2395p.m3877j0(m3847O5);
            }
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) m3847O5;
            int i18 = i17 & 14;
            if (i18 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z8;
            int i19 = i17 & 112;
            if (i19 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean m3870g = z14 | z9 | c2395p.m3870g(obj2) | c2395p.m3870g(view2) | c2395p.m3870g(interfaceC3093c2);
            Object m3847O6 = c2395p.m3847O();
            if (!m3870g && m3847O6 != obj3) {
                interfaceC3093c = interfaceC3093c2;
                obj = obj3;
                i9 = i18;
                i10 = i19;
                i11 = mo4513Q;
                i12 = i17;
                view = view2;
            } else {
                interfaceC3093c = interfaceC3093c2;
                obj = obj3;
                i9 = i18;
                i10 = i19;
                i11 = mo4513Q;
                view = view2;
                i12 = i17;
                m3847O6 = new C2036x1(c0373q, z13, m3498d, m3498d2, m3498d3, interfaceC3663c2, interfaceC2425y03, interfaceC3279c2, c2349d1, c2349d12);
                c0373q = c0373q;
                z13 = z13;
                interfaceC3279c2 = interfaceC3279c2;
                c2395p.m3877j0(m3847O6);
            }
            C2036x1 c2036x1 = (C2036x1) m3847O6;
            boolean m3874i = c2395p.m3874i(view) | c2395p.m3866e(i11);
            Object m3847O7 = c2395p.m3847O();
            if (!m3874i && m3847O7 != obj) {
                interfaceC2425y0 = interfaceC2425y02;
            } else {
                m3847O7 = new C0380x(view, i11, interfaceC2425y02, c2349d1, c2349d12, 2);
                interfaceC2425y0 = interfaceC2425y02;
                c2395p.m3877j0(m3847O7);
            }
            InterfaceC3810r m394d = AbstractC0172a.m394d(interfaceC3810r, (InterfaceC3279c) m3847O7);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m394d);
            InterfaceC3510j.f16935d.getClass();
            InterfaceC3277a interfaceC3277a = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c3173d2 = c3173d;
            c3173d2.mo24c(c2036x1, c2395p, Integer.valueOf((i12 >> 6) & 112));
            c2395p.m3888r(true);
            c2395p.m3857Z(426363998);
            if (z13) {
                boolean m3874i2 = c2395p.m3874i(view) | c2395p.m3866e(i11);
                Object m3847O8 = c2395p.m3847O();
                if (m3874i2 || m3847O8 == obj) {
                    m3847O8 = new C2012u1(view, i11, interfaceC2425y0, c2349d12);
                    c2395p.m3877j0(m3847O8);
                }
                z10 = false;
                m3219b(view, interfaceC3093c, (InterfaceC3277a) m3847O8, c2395p, 0);
            } else {
                z10 = false;
            }
            c2395p.m3888r(z10);
            int i20 = i9;
            if (i20 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object m3847O9 = c2395p.m3847O();
            if (z11 || m3847O9 == obj) {
                m3847O9 = new C2020v1(z13, c0373q);
                c2395p.m3877j0(m3847O9);
            }
            AbstractC2418w.m3967i((InterfaceC3277a) m3847O9, c2395p);
            if (i10 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object m3847O10 = c2395p.m3847O();
            if (z12 || m3847O10 == obj) {
                m3847O10 = new C2028w1(interfaceC3279c2, 0);
                c2395p.m3877j0(m3847O10);
            }
            AbstractC0000a.m0a(z13, (InterfaceC3277a) m3847O10, c2395p, i20, 0);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1971p0(z13, interfaceC3279c2, interfaceC3810r, c3173d2, i7, 1);
        }
    }

    /* renamed from: b */
    public static final void m3219b(View view, InterfaceC3093c interfaceC3093c, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z7;
        int i10;
        c2395p.m3859a0(-1319522472);
        if (c2395p.m3874i(view)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i8 | i7;
        if (c2395p.m3870g(interfaceC3093c)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9;
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i12 |= i10;
        }
        if ((i12 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean m3874i = c2395p.m3874i(view);
            if ((i12 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7 | m3874i;
            Object m3847O = c2395p.m3847O();
            if (z8 || m3847O == C2375k.f13421a) {
                m3847O = new C0078t0(19, view, interfaceC3277a);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2418w.m3961c(view, interfaceC3093c, (InterfaceC3279c) m3847O, c2395p);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(view, interfaceC3093c, interfaceC3277a, i7, 1);
        }
    }

    /* renamed from: c */
    public static final int m3220c(int i7, C0465c c0465c, C0465c c0465c2) {
        int m5794D;
        float f7 = c0465c.f1626b;
        float f8 = i7;
        float f9 = f7 + f8;
        float f10 = c0465c.f1628d;
        float f11 = f10 - f8;
        float f12 = c0465c2.f1626b;
        if (f12 <= f10) {
            float f13 = c0465c2.f1628d;
            if (f13 >= f7) {
                m5794D = AbstractC3784a.m5794D(Math.max(f12 - f9, f11 - f13));
                return Math.max(m5794D, 0);
            }
        }
        m5794D = AbstractC3784a.m5794D(f11 - f9);
        return Math.max(m5794D, 0);
    }
}
