package p063i0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p007ui.focus.AbstractC0167a;
import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0213t;
import java.util.WeakHashMap;
import p001a0.C0033i;
import p001a0.C0034i0;
import p001a0.C0062p0;
import p001a0.C0065q;
import p001a0.C0078t0;
import p019c1.C0373q;
import p028d2.AbstractC0479l;
import p035e1.C0675q0;
import p035e1.InterfaceC0667m0;
import p053g5.C1694m;
import p066i3.AbstractC2067b;
import p071j0.AbstractC2152t;
import p071j0.AccessibilityManagerAccessibilityStateChangeListenerC2119c0;
import p078k0.AbstractC2246o;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p100n.C2657k0;
import p107o.C2769p1;
import p117p1.C2845b0;
import p118p3.AbstractC2879d;
import p140s2.InterfaceC3093c;
import p144t.C3120b;
import p144t.C3161v0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3663c2;
import p171w2.AbstractC3760j;
import p171w2.C3775y;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.x1 */
/* loaded from: classes.dex */
public final class C2036x1 {

    /* renamed from: a */
    public final /* synthetic */ C0373q f12108a;

    /* renamed from: b */
    public final /* synthetic */ boolean f12109b;

    /* renamed from: c */
    public final /* synthetic */ String f12110c;

    /* renamed from: d */
    public final /* synthetic */ String f12111d;

    /* renamed from: e */
    public final /* synthetic */ String f12112e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3663c2 f12113f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f12114g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f12115h;

    /* renamed from: i */
    public final /* synthetic */ C2349d1 f12116i;

    /* renamed from: j */
    public final /* synthetic */ C2349d1 f12117j;

    public C2036x1(C0373q c0373q, boolean z7, String str, String str2, String str3, InterfaceC3663c2 interfaceC3663c2, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, C2349d1 c2349d1, C2349d1 c2349d12) {
        this.f12108a = c0373q;
        this.f12109b = z7;
        this.f12110c = str;
        this.f12111d = str2;
        this.f12112e = str3;
        this.f12113f = interfaceC3663c2;
        this.f12114g = interfaceC2425y0;
        this.f12115h = interfaceC3279c;
        this.f12116i = c2349d1;
        this.f12117j = c2349d12;
    }

    /* renamed from: a */
    public final void m3204a(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, C2769p1 c2769p1, boolean z8, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, float f8, C3173d c3173d, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        InterfaceC3810r interfaceC3810r2;
        float f9;
        float f10;
        InterfaceC0667m0 interfaceC0667m02;
        long j7;
        C2769p1 c2769p12;
        boolean z9;
        C2657k0 c2657k0;
        C2769p1 c2769p13;
        int i11;
        boolean z10;
        InterfaceC3810r interfaceC3810r3;
        long j8;
        InterfaceC3810r interfaceC3810r4;
        C2769p1 c2769p14;
        boolean z11;
        int i12;
        c2395p.m3859a0(720925481);
        int i13 = 4;
        if (c2395p.m3872h(z7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i14 = i7 | i9 | 919168384;
        if ((i8 & 6) == 0) {
            if (!c2395p.m3874i(c3173d)) {
                i13 = 2;
            }
            i10 = i8 | i13;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3870g(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i14 & 306783379) == 306783378 && (i10 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r4 = interfaceC3810r;
            c2769p14 = c2769p1;
            z11 = z8;
            interfaceC0667m02 = interfaceC0667m0;
            j8 = j6;
            f9 = f7;
            f10 = f8;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                c2769p12 = c2769p1;
                z9 = z8;
                interfaceC0667m02 = interfaceC0667m0;
                j7 = j6;
                f9 = f7;
                f10 = f8;
            } else {
                C2769p1 m3297v = AbstractC2067b.m3297v(c2395p);
                float f11 = AbstractC1981q2.f11691a;
                InterfaceC0667m0 m3117a = AbstractC1884e5.m3117a(AbstractC2246o.f13003b, c2395p);
                long m3196e = AbstractC2019v0.m3196e(37, c2395p);
                float f12 = AbstractC1981q2.f11691a;
                float f13 = AbstractC1981q2.f11692b;
                interfaceC3810r2 = C3807o.f17991a;
                f9 = f12;
                f10 = f13;
                interfaceC0667m02 = m3117a;
                j7 = m3196e;
                c2769p12 = m3297v;
                z9 = true;
            }
            c2395p.m3889s();
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                Object c2361g1 = new C2361g1(C1694m.f10482a, C2413u0.f13572g);
                c2395p.m3877j0(c2361g1);
                m3847O = c2361g1;
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
            InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
            WeakHashMap weakHashMap = C3161v0.f15846u;
            boolean z12 = z9;
            int i15 = C3120b.m4822e(c2395p).f15852f.m4817e().f1016b;
            long j9 = j7;
            c2395p.m3857Z(321499814);
            if (z7) {
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == obj) {
                    m3847O2 = new C0065q(interfaceC2425y0, 2);
                    c2395p.m3877j0(m3847O2);
                }
                AbstractC2052z1.m3219b(view, interfaceC3093c, (InterfaceC3277a) m3847O2, c2395p, 384);
            }
            c2395p.m3888r(false);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj) {
                m3847O3 = new C2657k0(Boolean.FALSE);
                c2395p.m3877j0(m3847O3);
            }
            C2657k0 c2657k02 = (C2657k0) m3847O3;
            c2657k02.f14346c.setValue(Boolean.valueOf(z7));
            if (!((Boolean) c2657k02.f14345b.getValue()).booleanValue() && !((Boolean) c2657k02.f14346c.getValue()).booleanValue()) {
                z10 = z12;
                interfaceC3810r3 = interfaceC3810r2;
                j8 = j9;
            } else {
                Object m3847O4 = c2395p.m3847O();
                if (m3847O4 == obj) {
                    c2657k0 = c2657k02;
                    m3847O4 = AbstractC2418w.m3980x(new C0675q0(C0675q0.f2200b));
                    c2395p.m3877j0(m3847O4);
                } else {
                    c2657k0 = c2657k02;
                }
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O4;
                boolean m3870g = c2395p.m3870g(interfaceC3093c) | c2395p.m3866e(i15);
                Object m3847O5 = c2395p.m3847O();
                if (!m3870g && m3847O5 != obj) {
                    c2769p13 = c2769p12;
                } else {
                    c2769p13 = c2769p12;
                    m3847O5 = new C2004t1(interfaceC3093c, i15, interfaceC2425y0, new C1962o(interfaceC2425y02, 1));
                    c2395p.m3877j0(m3847O5);
                }
                C2004t1 c2004t1 = (C2004t1) m3847O5;
                C1996s1 c1996s1 = C1996s1.f11741a;
                ((C1973p2) this.f12114g.getValue()).getClass();
                Object systemService = ((Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b)).getSystemService("accessibility");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                Object obj2 = (AccessibilityManager) systemService;
                boolean m3872h = c2395p.m3872h(true) | c2395p.m3872h(true);
                Object m3847O6 = c2395p.m3847O();
                if (m3872h || m3847O6 == obj) {
                    m3847O6 = new AccessibilityManagerAccessibilityStateChangeListenerC2119c0();
                    c2395p.m3877j0(m3847O6);
                }
                AccessibilityManagerAccessibilityStateChangeListenerC2119c0 accessibilityManagerAccessibilityStateChangeListenerC2119c0 = (AccessibilityManagerAccessibilityStateChangeListenerC2119c0) m3847O6;
                InterfaceC0213t interfaceC0213t = (InterfaceC0213t) c2395p.m3878k(AbstractC2879d.f15050a);
                boolean m3870g2 = c2395p.m3870g(accessibilityManagerAccessibilityStateChangeListenerC2119c0) | c2395p.m3874i(obj2);
                Object m3847O7 = c2395p.m3847O();
                if (m3870g2 || m3847O7 == obj) {
                    m3847O7 = new C0078t0(25, accessibilityManagerAccessibilityStateChangeListenerC2119c0, obj2);
                    c2395p.m3877j0(m3847O7);
                }
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) m3847O7;
                boolean m3870g3 = c2395p.m3870g(accessibilityManagerAccessibilityStateChangeListenerC2119c0) | c2395p.m3874i(obj2);
                Object m3847O8 = c2395p.m3847O();
                if (m3870g3 || m3847O8 == obj) {
                    m3847O8 = new C0033i(8, accessibilityManagerAccessibilityStateChangeListenerC2119c0, obj2);
                    c2395p.m3877j0(m3847O8);
                }
                AbstractC2152t.m3495a(interfaceC0213t, interfaceC3279c, (InterfaceC3277a) m3847O8, c2395p, 0);
                if (!((Boolean) accessibilityManagerAccessibilityStateChangeListenerC2119c0.getValue()).booleanValue()) {
                    i11 = 393248;
                } else {
                    i11 = 393216;
                }
                z10 = z12;
                c2769p12 = c2769p13;
                interfaceC3810r3 = interfaceC3810r2;
                j8 = j9;
                AbstractC3760j.m5760a(c2004t1, interfaceC3277a, new C3775y(i11, true), AbstractC3178i.m4873d(-1082380263, new C1972p1(this, interfaceC3810r3, z10, c2657k0, interfaceC2425y02, c2769p12, interfaceC0667m02, j8, f9, f10, c3173d), c2395p), c2395p, 3120, 0);
            }
            interfaceC3810r4 = interfaceC3810r3;
            c2769p14 = c2769p12;
            z11 = z10;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1980q1(this, z7, interfaceC3277a, interfaceC3810r4, c2769p14, z11, interfaceC0667m02, j8, f9, f10, c3173d, i7, i8);
        }
    }

    /* renamed from: b */
    public final InterfaceC3810r m3205b() {
        InterfaceC3810r mo5829e;
        InterfaceC3810r m382a = AbstractC0167a.m382a(this.f12108a);
        InterfaceC3279c interfaceC3279c = this.f12115h;
        InterfaceC2425y0 interfaceC2425y0 = this.f12114g;
        boolean z7 = this.f12109b;
        C0034i0 c0034i0 = new C0034i0(interfaceC2425y0, interfaceC3279c, z7, 1);
        mo5829e = C3807o.f17991a.mo5829e(new SuspendPointerInputElement(c0034i0, null, new C2845b0(new C0062p0(c0034i0, null, 22)), 6));
        return m382a.mo5829e(AbstractC0479l.m1037a(mo5829e, false, new C0078t0(z7, this.f12110c, this.f12111d, this.f12112e, c0034i0, this.f12113f)));
    }
}
