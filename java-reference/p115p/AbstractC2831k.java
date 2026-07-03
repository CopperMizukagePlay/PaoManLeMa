package p115p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p007ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p001a0.AbstractC0027g1;
import p001a0.C0078t0;
import p034e0.C0593a;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0683y;
import p035e1.C0677s;
import p050g2.C1604o0;
import p063i0.C1879e0;
import p063i0.C1922j;
import p063i0.C1971p0;
import p063i0.C2020v1;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3120b;
import p144t.C3130g;
import p144t.C3147o0;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p171w2.AbstractC3760j;
import p171w2.C3775y;
import p171w2.InterfaceC3774x;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.k */
/* loaded from: classes.dex */
public abstract class AbstractC2831k {

    /* renamed from: a */
    public static final C3775y f14903a = new C3775y(14);

    /* renamed from: b */
    public static final C2821a f14904b;

    static {
        long j6 = C0677s.f2205c;
        long j7 = C0677s.f2204b;
        f14904b = new C2821a(j6, j7, j7, C0677s.m1453b(0.38f, j7), C0677s.m1453b(0.38f, j7));
    }

    /* renamed from: a */
    public static final void m4451a(C2821a c2821a, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z7;
        c2395p.m3859a0(-921259293);
        if (c2395p.m3870g(c2821a)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i8 | i7;
        InterfaceC3810r interfaceC3810r = C3807o.f17991a;
        if (c2395p.m3870g(interfaceC3810r)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        if (((i10 | i9) & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            float f7 = AbstractC2826f.f14890d;
            C3860d m5873a = AbstractC3861e.m5873a(AbstractC2826f.f14891e);
            float f8 = 0;
            if (Float.compare(f7, f8) > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            long j6 = AbstractC0683y.f2215a;
            if (Float.compare(f7, f8) > 0 || z7) {
                interfaceC3810r = new ShadowGraphicsLayerElement(m5873a, z7, j6, j6);
            }
            InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0154b.m339j(AbstractC0154b.m341l(AbstractC0145a.m319b(interfaceC3810r, c2821a.f14876a, AbstractC0659i0.f2147a)), 0.0f, AbstractC2826f.f14895i, 1), AbstractC2067b.m3297v(c2395p));
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p, 0);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m3275C);
            InterfaceC3510j.f16935d.getClass();
            InterfaceC3277a interfaceC3277a = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4857a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c3173d.mo24c(C3154s.f15836a, c2395p, 54);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1879e0(i7, 6, c2821a, c3173d);
        }
    }

    /* renamed from: b */
    public static final void m4452b(String str, boolean z7, C2821a c2821a, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        boolean z9;
        long j6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c2395p.m3859a0(791018367);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(c2821a)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        int i15 = i7 & 3072;
        C3807o c3807o = C3807o.f17991a;
        if (i15 == 0) {
            if (c2395p.m3870g(c3807o)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(null)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3801i c3801i = AbstractC2826f.f14892f;
            C3120b c3120b = AbstractC3136j.f15789a;
            float f7 = AbstractC2826f.f14894h;
            C3130g m4843g = AbstractC3136j.m4843g(f7);
            if ((i8 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((458752 & i8) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z8 | z9;
            Object m3847O = c2395p.m3847O();
            if (z10 || m3847O == C2375k.f13421a) {
                m3847O = new C2020v1(interfaceC3277a, z7);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3810r m346e = AbstractC0155c.m346e(AbstractC0145a.m322e(4, str, (InterfaceC3277a) m3847O, c3807o, z7), 1.0f);
            float f8 = AbstractC2826f.f14887a;
            float f9 = AbstractC2826f.f14888b;
            float f10 = AbstractC2826f.f14889c;
            InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m355n(m346e, f8, f10, f9, f10), f7, 0.0f, 2);
            C3147o0 m4854a = AbstractC3145n0.m4854a(m4843g, c3801i, c2395p, 54);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m339j);
            InterfaceC3510j.f16935d.getClass();
            InterfaceC3277a interfaceC3277a2 = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a2);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c2395p.m3857Z(554568909);
            c2395p.m3888r(false);
            if (z7) {
                j6 = c2821a.f14877b;
            } else {
                j6 = c2821a.f14879d;
            }
            long j7 = j6;
            C1604o0 c1604o0 = new C1604o0(j7, AbstractC2826f.f14896j, AbstractC2826f.f14897k, AbstractC2826f.f14899m, AbstractC2826f.f14893g, AbstractC2826f.f14898l, 16613240);
            if (1.0f > 0.0d) {
                AbstractC0027g1.m55a(str, new LayoutWeightElement(1.0f, true), c1604o0, 0, false, 1, 0, c2395p, (i8 & 14) | 1572864, 440);
                c2395p.m3888r(true);
            } else {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1971p0(str, z7, c2821a, interfaceC3277a, i7);
        }
    }

    /* renamed from: c */
    public static final void m4453c(InterfaceC3774x interfaceC3774x, InterfaceC3277a interfaceC3277a, C0078t0 c0078t0, C2395p c2395p, int i7) {
        int i8;
        Integer num;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(712057293);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3774x)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i8 = i12 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(C3807o.f17991a)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i8 |= i10;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c0078t0)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i8 |= i9;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            boolean m3870g = c2395p.m3870g((Configuration) c2395p.m3878k(AndroidCompositionLocals_androidKt.f785a)) | c2395p.m3870g(context);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                C2821a c2821a = f14904b;
                long j6 = c2821a.f14876a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int m1426z = AbstractC0659i0.m1426z(j6);
                int color = obtainStyledAttributes.getColor(0, m1426z);
                obtainStyledAttributes.recycle();
                if (color != m1426z) {
                    j6 = AbstractC0659i0.m1403c(color);
                }
                long j7 = j6;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j8 = c2821a.f14877b;
                int m1426z2 = AbstractC0659i0.m1426z(j8);
                Integer num2 = null;
                if (colorStateList != null) {
                    num = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, m1426z2));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() != m1426z2) {
                    j8 = AbstractC0659i0.m1403c(num.intValue());
                }
                long j9 = j8;
                long j10 = c2821a.f14879d;
                int m1426z3 = AbstractC0659i0.m1426z(j10);
                if (colorStateList != null) {
                    num2 = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, m1426z3));
                }
                if (num2 != null && num2.intValue() != m1426z3) {
                    j10 = AbstractC0659i0.m1403c(num2.intValue());
                }
                long j11 = j10;
                Object c2821a2 = new C2821a(j7, j9, j9, j11, j11);
                c2395p.m3877j0(c2821a2);
                m3847O = c2821a2;
            }
            m4454d(interfaceC3774x, interfaceC3277a, (C2821a) m3847O, c0078t0, c2395p, (i8 & 1022) | ((i8 << 3) & 57344));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(interfaceC3774x, interfaceC3277a, c0078t0, i7);
        }
    }

    /* renamed from: d */
    public static final void m4454d(InterfaceC3774x interfaceC3774x, InterfaceC3277a interfaceC3277a, C2821a c2821a, C0078t0 c0078t0, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3277a interfaceC3277a2;
        C2395p c2395p2;
        InterfaceC3774x interfaceC3774x2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(1447189339);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3774x)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i8 = i13 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i8 |= i12;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(C3807o.f17991a)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i8 |= i11;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c2821a)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i8 |= i10;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(c0078t0)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i8 |= i9;
        }
        if ((i8 & 9363) == 9362 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3277a2 = interfaceC3277a;
            c2395p2 = c2395p;
            interfaceC3774x2 = interfaceC3774x;
        } else {
            interfaceC3277a2 = interfaceC3277a;
            c2395p2 = c2395p;
            AbstractC3760j.m5760a(interfaceC3774x, interfaceC3277a2, f14903a, AbstractC3178i.m4873d(795909757, new C1879e0(c2821a, c0078t0), c2395p), c2395p2, (i8 & 14) | 3456 | (i8 & 112), 0);
            interfaceC3774x2 = interfaceC3774x;
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1922j(interfaceC3774x2, interfaceC3277a2, c2821a, c0078t0, i7);
        }
    }
}
