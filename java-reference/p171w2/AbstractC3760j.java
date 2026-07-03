package p171w2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p007ui.layout.AbstractC0172a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import p001a0.C0079t1;
import p063i0.C1879e0;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2375k;
import p085l0.C2387n;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p100n.C2649h1;
import p107o.C2722a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.j */
/* loaded from: classes.dex */
public abstract class AbstractC3760j {

    /* renamed from: a */
    public static final C2336a0 f17852a = new C2336a0(C3753c.f17831h);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5760a(InterfaceC3774x interfaceC3774x, InterfaceC3277a interfaceC3277a, C3775y c3775y, C3173d c3173d, C2395p c2395p, int i7, int i8) {
        int i9;
        InterfaceC3277a interfaceC3277a2;
        int i10;
        C3775y c3775y2;
        int i11;
        boolean z7;
        InterfaceC3277a interfaceC3277a3;
        C2405r1 m3891u;
        InterfaceC3277a interfaceC3277a4;
        boolean z8;
        InterfaceC3277a interfaceC3277a5;
        String str;
        boolean z9;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        InterfaceC3277a interfaceC3277a6;
        C3771u c3771u;
        String str2;
        boolean z13;
        boolean z14;
        EnumC3103m enumC3103m;
        int i13;
        int i14;
        int i15;
        InterfaceC3774x interfaceC3774x2 = interfaceC3774x;
        c2395p.m3859a0(-1772091631);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3774x2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i7;
        } else {
            i9 = i7;
        }
        int i16 = i8 & 2;
        if (i16 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            interfaceC3277a2 = interfaceC3277a;
            if (c2395p.m3874i(interfaceC3277a2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
            if ((i7 & 384) != 0) {
                c3775y2 = c3775y;
                if (c2395p.m3870g(c3775y2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i9 |= i14;
            } else {
                c3775y2 = c3775y;
            }
            if ((i7 & 3072) == 0) {
                if (c2395p.m3874i(c3173d)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i9 |= i13;
            }
            i11 = i9;
            if ((i11 & 1171) == 1170) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!c2395p.m3849R(i11 & 1, z7)) {
                if (i16 != 0) {
                    interfaceC3277a4 = null;
                } else {
                    interfaceC3277a4 = interfaceC3277a2;
                }
                View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
                InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
                String str3 = (String) c2395p.m3878k(f17852a);
                EnumC3103m enumC3103m2 = (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n);
                C2387n m3982z = AbstractC2418w.m3982z(c2395p);
                InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(c3173d, c2395p);
                Object[] objArr = new Object[0];
                Object m3847O = c2395p.m3847O();
                Object obj = C2375k.f13421a;
                if (m3847O == obj) {
                    m3847O = C3753c.f17832i;
                    c2395p.m3877j0(m3847O);
                }
                UUID uuid = (UUID) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == obj) {
                    z8 = true;
                    C3771u c3771u2 = new C3771u(interfaceC3277a4, c3775y2, str3, view, interfaceC3093c, interfaceC3774x, uuid);
                    str = str3;
                    interfaceC3277a5 = interfaceC3277a4;
                    interfaceC3774x2 = interfaceC3774x;
                    c3771u2.m5770i(m3982z, new C3173d(-297523940, new C1879e0(15, c3771u2, m3953A), true));
                    c2395p.m3877j0(c3771u2);
                    m3847O2 = c3771u2;
                } else {
                    z8 = true;
                    interfaceC3277a5 = interfaceC3277a4;
                    str = str3;
                    interfaceC3774x2 = interfaceC3774x;
                }
                C3771u c3771u3 = (C3771u) m3847O2;
                boolean m3874i = c2395p.m3874i(c3771u3);
                int i17 = i11 & 112;
                if (i17 == 32) {
                    z9 = z8;
                } else {
                    z9 = false;
                }
                boolean z15 = m3874i | z9;
                int i18 = i11 & 896;
                if (i18 == 256) {
                    z10 = z8;
                } else {
                    z10 = false;
                }
                boolean m3870g = z15 | z10 | c2395p.m3870g(str) | c2395p.m3866e(enumC3103m2.ordinal());
                Object m3847O3 = c2395p.m3847O();
                if (!m3870g && m3847O3 != obj) {
                    InterfaceC3277a interfaceC3277a7 = interfaceC3277a5;
                    str2 = str;
                    z11 = z8;
                    interfaceC3277a6 = interfaceC3277a7;
                    i12 = i11;
                    z12 = false;
                    c3771u = c3771u3;
                } else {
                    String str4 = str;
                    i12 = i11;
                    z11 = z8;
                    z12 = false;
                    interfaceC3277a6 = interfaceC3277a5;
                    c3771u = c3771u3;
                    Object c0079t1 = new C0079t1(c3771u, interfaceC3277a6, c3775y, str4, enumC3103m2, 2);
                    str2 = str4;
                    c2395p.m3877j0(c0079t1);
                    m3847O3 = c0079t1;
                }
                AbstractC2418w.m3962d(c3771u, (InterfaceC3279c) m3847O3, c2395p);
                boolean m3874i2 = c2395p.m3874i(c3771u);
                if (i17 == 32) {
                    z13 = z11;
                } else {
                    z13 = z12;
                }
                boolean z16 = z13 | m3874i2;
                if (i18 == 256) {
                    z14 = z11;
                } else {
                    z14 = z12;
                }
                boolean m3870g2 = z16 | z14 | c2395p.m3870g(str2) | c2395p.m3866e(enumC3103m2.ordinal());
                Object m3847O4 = c2395p.m3847O();
                if (!m3870g2 && m3847O4 != obj) {
                    enumC3103m = enumC3103m2;
                } else {
                    Object c3755e = new C3755e(c3771u, interfaceC3277a6, c3775y, str2, enumC3103m2);
                    enumC3103m = enumC3103m2;
                    c2395p.m3877j0(c3755e);
                    m3847O4 = c3755e;
                }
                AbstractC2418w.m3967i((InterfaceC3277a) m3847O4, c2395p);
                boolean m3874i3 = c2395p.m3874i(c3771u);
                if ((i12 & 14) == 4) {
                    z12 = z11;
                }
                boolean z17 = m3874i3 | z12;
                Object m3847O5 = c2395p.m3847O();
                if (z17 || m3847O5 == obj) {
                    m3847O5 = new C2649h1(25, c3771u, interfaceC3774x2);
                    c2395p.m3877j0(m3847O5);
                }
                AbstractC2418w.m3962d(interfaceC3774x2, (InterfaceC3279c) m3847O5, c2395p);
                boolean m3874i4 = c2395p.m3874i(c3771u);
                Object m3847O6 = c2395p.m3847O();
                if (m3874i4 || m3847O6 == obj) {
                    m3847O6 = new C2722a(c3771u, null, 12);
                    c2395p.m3877j0(m3847O6);
                }
                AbstractC2418w.m3965g(c3771u, c2395p, (InterfaceC3281e) m3847O6);
                boolean m3874i5 = c2395p.m3874i(c3771u);
                Object m3847O7 = c2395p.m3847O();
                if (m3874i5 || m3847O7 == obj) {
                    m3847O7 = new C3757g(c3771u, 0);
                    c2395p.m3877j0(m3847O7);
                }
                InterfaceC3810r m394d = AbstractC0172a.m394d(C3807o.f17991a, (InterfaceC3279c) m3847O7);
                boolean m3874i6 = c2395p.m3874i(c3771u) | c2395p.m3866e(enumC3103m.ordinal());
                Object m3847O8 = c2395p.m3847O();
                if (m3874i6 || m3847O8 == obj) {
                    m3847O8 = new C3758h(c3771u, enumC3103m);
                    c2395p.m3877j0(m3847O8);
                }
                InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O8;
                int hashCode = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m = c2395p.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m394d);
                InterfaceC3510j.f16935d.getClass();
                InterfaceC3277a interfaceC3277a8 = C3507i.f16928b;
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(interfaceC3277a8);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(interfaceC3217l0, c2395p, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                C3504h c3504h = C3507i.f16932f;
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                    AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                c2395p.m3888r(z11);
                interfaceC3277a3 = interfaceC3277a6;
            } else {
                c2395p.m3852U();
                interfaceC3277a3 = interfaceC3277a2;
            }
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C3759i(interfaceC3774x2, interfaceC3277a3, c3775y, c3173d, i7, i8);
                return;
            }
            return;
        }
        interfaceC3277a2 = interfaceC3277a;
        if ((i7 & 384) != 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        i11 = i9;
        if ((i11 & 1171) == 1170) {
        }
        if (!c2395p.m3849R(i11 & 1, z7)) {
        }
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: b */
    public static final boolean m5761b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
