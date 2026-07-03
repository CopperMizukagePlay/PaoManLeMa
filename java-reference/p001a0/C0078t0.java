package p001a0;

import android.content.ClipDescription;
import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.EnumC0201n;
import java.util.ArrayList;
import java.util.List;
import p008b.AbstractC0223b;
import p008b.C0242k0;
import p010b1.C0265c;
import p019c1.C0368l;
import p019c1.InterfaceC0366j;
import p024c6.C0438e;
import p027d1.C0467e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p032d6.AbstractC0525d0;
import p032d6.C0575u;
import p032d6.InterfaceC0516a0;
import p034e0.C0622o0;
import p034e0.C0625q;
import p034e0.C0628r0;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.C0668n;
import p035e1.C0669n0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p039e5.C0866fc;
import p039e5.C0932he;
import p039e5.C1263s5;
import p039e5.C1478z3;
import p049g1.C1568b;
import p049g1.C1573g;
import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p050g2.C1602n0;
import p053g5.C1694m;
import p056h0.C1747u;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1975p4;
import p063i0.AbstractC2054z3;
import p063i0.C1974p3;
import p063i0.C2041x6;
import p063i0.ViewOnAttachStateChangeListenerC2044y1;
import p071j0.AbstractC2161z;
import p071j0.AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
import p071j0.AccessibilityManagerAccessibilityStateChangeListenerC2119c0;
import p071j0.AccessibilityManagerTouchExplorationStateChangeListenerC2117b0;
import p071j0.C2131i0;
import p071j0.C2137l0;
import p078k0.AbstractC2254w;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p100n.C2642f0;
import p100n.C2643f1;
import p100n.C2648h0;
import p102n1.AbstractC2710c;
import p102n1.C2709b;
import p115p.C2825e;
import p115p.C2830j;
import p117p1.C2868s;
import p137s.C3081j;
import p140s2.C3096f;
import p140s2.EnumC3103m;
import p144t.AbstractC3122c;
import p144t.C3160v;
import p144t.InterfaceC3135i0;
import p144t.InterfaceC3159u0;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.C3508i0;
import p170w1.C3680h;
import p170w1.C3682h1;
import p170w1.InterfaceC3658b1;
import p170w1.InterfaceC3663c2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.t0 */
/* loaded from: classes.dex */
public final class C0078t0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f378f;

    /* renamed from: g */
    public final /* synthetic */ Object f379g;

    /* renamed from: h */
    public final /* synthetic */ Object f380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0078t0(int i7, Object obj, Object obj2) {
        super(1);
        this.f378f = i7;
        this.f379g = obj;
        this.f380h = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x046a  */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        boolean z7;
        boolean z8;
        C0043k1 c0043k1;
        boolean z9;
        boolean z10;
        InterfaceC3658b1 interfaceC3658b1;
        boolean z11;
        float f7;
        AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
        switch (this.f378f) {
            case 0:
                KeyEvent keyEvent = ((C2709b) obj).f14537a;
                if (((C0043k1) this.f379g).m117a() == EnumC0091x0.f417f && keyEvent.getKeyCode() == 4) {
                    z7 = true;
                    if (AbstractC2710c.m4320C(keyEvent) == 1) {
                        ((C0622o0) this.f380h).m1282e(null);
                        return Boolean.valueOf(z7);
                    }
                }
                z7 = false;
                return Boolean.valueOf(z7);
            case 1:
                KeyEvent keyEvent2 = ((C2709b) obj).f14537a;
                InterfaceC0366j interfaceC0366j = (InterfaceC0366j) this.f380h;
                InputDevice device = keyEvent2.getDevice();
                boolean z12 = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC2710c.m4320C(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (AbstractC0027g1.m63i(19, keyEvent2)) {
                        z12 = ((C0368l) interfaceC0366j).m835f(5);
                    } else if (AbstractC0027g1.m63i(20, keyEvent2)) {
                        z12 = ((C0368l) interfaceC0366j).m835f(6);
                    } else if (AbstractC0027g1.m63i(21, keyEvent2)) {
                        z12 = ((C0368l) interfaceC0366j).m835f(3);
                    } else if (AbstractC0027g1.m63i(22, keyEvent2)) {
                        z12 = ((C0368l) interfaceC0366j).m835f(4);
                    } else if (AbstractC0027g1.m63i(23, keyEvent2)) {
                        InterfaceC3663c2 interfaceC3663c2 = ((C0043k1) this.f379g).f213c;
                        if (interfaceC3663c2 != null) {
                            ((C3682h1) interfaceC3663c2).m5701b();
                        }
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
            case 2:
                return new C0008b2(0, (InterfaceC2425y0) this.f379g, (C3081j) this.f380h);
            case 3:
                C2868s c2868s = (C2868s) obj;
                C0019e1 c0019e1 = (C0019e1) this.f379g;
                long j6 = c2868s.f15008c;
                C0625q c0625q = (C0625q) this.f380h;
                C0622o0 c0622o0 = (C0622o0) c0019e1.f109e;
                if (c0622o0.m1285h() && c0622o0.m1287j().f13723a.f10239f.length() != 0 && (c0043k1 = c0622o0.f2047d) != null && c0043k1.m120d() != null) {
                    c0019e1.m51w(c0622o0.m1287j(), j6, false, c0625q);
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    c2868s.m4550a();
                }
                return C1694m.f10482a;
            case 4:
                C2825e c2825e = (C2825e) obj;
                C0622o0 c0622o02 = (C0622o0) this.f380h;
                C2361g1 c2361g1 = c0622o02.f2053j;
                boolean m2586b = C1602n0.m2586b(c0622o02.m1287j().f13724b);
                C2830j c2830j = (C2830j) this.f379g;
                boolean z13 = false;
                if (!m2586b && ((Boolean) c2361g1.getValue()).booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C2825e.m4449b(c2825e, new C0061p(1), z9, new C0628r0(c2830j, c0622o02, 0));
                C2825e.m4449b(c2825e, new C0061p(2), !m2586b, new C0628r0(c2830j, c0622o02, 1));
                if (((Boolean) c2361g1.getValue()).booleanValue() && (interfaceC3658b1 = c0622o02.f2049f) != null) {
                    ClipDescription primaryClipDescription = ((C3680h) interfaceC3658b1).f17534a.getPrimaryClipDescription();
                    if (primaryClipDescription != null) {
                        z11 = primaryClipDescription.hasMimeType("text/*");
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        C2825e.m4449b(c2825e, new C0061p(3), z10, new C0628r0(c2830j, c0622o02, 2));
                        if (C1602n0.m2587c(c0622o02.m1287j().f13724b) != c0622o02.m1287j().f13723a.f10239f.length()) {
                            z13 = true;
                        }
                        C2825e.m4449b(c2825e, new C0061p(4), z13, new C0628r0(c2830j, c0622o02, 3));
                        return C1694m.f10482a;
                    }
                }
                z10 = false;
                C2825e.m4449b(c2825e, new C0061p(3), z10, new C0628r0(c2830j, c0622o02, 2));
                if (C1602n0.m2587c(c0622o02.m1287j().f13724b) != c0622o02.m1287j().f13723a.f10239f.length()) {
                }
                C2825e.m4449b(c2825e, new C0061p(4), z13, new C0628r0(c2830j, c0622o02, 3));
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3237u0.m4953o((AbstractC3237u0) obj, (AbstractC3239v0) this.f379g, 0, 0, ((C0668n) this.f380h).f2183s, 4);
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC3237u0.m4953o((AbstractC3237u0) obj, (AbstractC3239v0) this.f379g, 0, 0, ((C0669n0) this.f380h).f2188E, 4);
                return C1694m.f10482a;
            case 7:
                return ((C0242k0) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 8:
                return ((C0242k0) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case AbstractC3122c.f15758c /* 9 */:
                return ((C1263s5) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case AbstractC3122c.f15760e /* 10 */:
                return ((C1263s5) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 11:
                return ((C1263s5) this.f379g).mo23f(((ArrayList) this.f380h).get(((Number) obj).intValue()));
            case 12:
                return ((C1263s5) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 13:
                return ((C0866fc) this.f379g).mo23f(((C0438e) this.f380h).get(((Number) obj).intValue()));
            case 14:
                return ((C1478z3) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case AbstractC3122c.f15762g /* 15 */:
                return ((C0932he) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 16:
                return ((C0866fc) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 17:
                int intValue = ((Number) obj).intValue();
                return ((C0575u) this.f379g).mo22d(Integer.valueOf(intValue), ((List) this.f380h).get(intValue));
            case 18:
                return ((C0866fc) this.f379g).mo23f(((List) this.f380h).get(((Number) obj).intValue()));
            case 19:
                return new C0077t(3, new ViewOnAttachStateChangeListenerC2044y1((View) this.f379g, (InterfaceC3277a) this.f380h));
            case 20:
                C0477j c0477j = (C0477j) obj;
                AbstractC0489v.m1065c(c0477j, 6);
                c0477j.m1036d(AbstractC0476i.f1658b, new C0468a(null, new C0053n((C0034i0) this.f379g, (InterfaceC3663c2) this.f380h)));
                return C1694m.f10482a;
            case 21:
                C0477j c0477j2 = (C0477j) obj;
                AbstractC0489v.m1064b(c0477j2, (String) this.f379g);
                c0477j2.m1036d(AbstractC0476i.f1658b, new C0468a(null, new C1974p3(0, (InterfaceC3277a) this.f380h)));
                return C1694m.f10482a;
            case 22:
                C3508i0 c3508i0 = (C3508i0) obj;
                long j7 = ((C0467e) ((C2137l0) this.f379g).get()).f1637a;
                float m1026d = C0467e.m1026d(j7);
                float f8 = 0.0f;
                if (m1026d > 0.0f) {
                    float mo4526y = c3508i0.mo4526y(AbstractC1847a4.f10920a);
                    C1568b c1568b = c3508i0.f16933e;
                    float mo4526y2 = c3508i0.mo4526y(((InterfaceC3135i0) this.f380h).mo4827d(c3508i0.getLayoutDirection())) - mo4526y;
                    float f9 = 2;
                    float f10 = (mo4526y * f9) + m1026d + mo4526y2;
                    EnumC3103m layoutDirection = c3508i0.getLayoutDirection();
                    int[] iArr = AbstractC2054z3.f12206a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        f7 = C0467e.m1026d(c1568b.mo2546c()) - f10;
                    } else if (mo4526y2 < 0.0f) {
                        f7 = 0.0f;
                    } else {
                        f7 = mo4526y2;
                    }
                    float f11 = f7;
                    if (iArr[c3508i0.getLayoutDirection().ordinal()] == 1) {
                        float m1026d2 = C0467e.m1026d(c1568b.mo2546c());
                        if (mo4526y2 >= 0.0f) {
                            f8 = mo4526y2;
                        }
                        f10 = m1026d2 - f8;
                    }
                    float f12 = f10;
                    float m1024b = C0467e.m1024b(j7);
                    float f13 = (-m1024b) / f9;
                    float f14 = m1024b / f9;
                    C0031h1 c0031h1 = c1568b.f10182f;
                    long m109x = c0031h1.m109x();
                    c0031h1.m106u().mo1341m();
                    try {
                        ((C0031h1) ((C0019e1) c0031h1.f152f).f109e).m106u().mo1335g(f11, f13, f12, f14, 0);
                        c3508i0.m5460a();
                    } finally {
                        AbstractC2487d.m4052p(c0031h1, m109x);
                    }
                } else {
                    c3508i0.m5460a();
                }
                return C1694m.f10482a;
            case 23:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                float mo4526y3 = interfaceC1570d.mo4526y(AbstractC1975p4.f11662c);
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) this.f379g;
                float f15 = 2;
                float f16 = mo4526y3 / f15;
                InterfaceC1570d.m2540R(interfaceC1570d, ((C0677s) interfaceC2390n2.getValue()).f2211a, interfaceC1570d.mo4526y(AbstractC2254w.f13074a / f15) - f16, 0L, new C1574h(mo4526y3, 0.0f, 0, 0, 30), 108);
                InterfaceC2390n2 interfaceC2390n22 = (InterfaceC2390n2) this.f380h;
                if (Float.compare(((C3096f) interfaceC2390n22.getValue()).f15693e, 0) > 0) {
                    InterfaceC1570d.m2540R(interfaceC1570d, ((C0677s) interfaceC2390n2.getValue()).f2211a, interfaceC1570d.mo4526y(((C3096f) interfaceC2390n22.getValue()).f15693e) - f16, 0L, C1573g.f10187a, 108);
                }
                return C1694m.f10482a;
            case 24:
                ((C2131i0) this.f379g).f12437a.setValue(new C3160v((InterfaceC3159u0) this.f380h, (InterfaceC3159u0) obj));
                return C1694m.f10482a;
            case 25:
                if (((EnumC0201n) obj) == EnumC0201n.ON_RESUME) {
                    AccessibilityManagerAccessibilityStateChangeListenerC2119c0 accessibilityManagerAccessibilityStateChangeListenerC2119c0 = (AccessibilityManagerAccessibilityStateChangeListenerC2119c0) this.f379g;
                    AccessibilityManager accessibilityManager = (AccessibilityManager) this.f380h;
                    accessibilityManagerAccessibilityStateChangeListenerC2119c0.getClass();
                    accessibilityManagerAccessibilityStateChangeListenerC2119c0.f12410e.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC2119c0);
                    AccessibilityManagerTouchExplorationStateChangeListenerC2117b0 accessibilityManagerTouchExplorationStateChangeListenerC2117b0 = accessibilityManagerAccessibilityStateChangeListenerC2119c0.f12411f;
                    if (accessibilityManagerTouchExplorationStateChangeListenerC2117b0 != null) {
                        accessibilityManagerTouchExplorationStateChangeListenerC2117b0.f12408a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2117b0);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 = accessibilityManagerAccessibilityStateChangeListenerC2119c0.f12412g) != null) {
                        accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0.f12404a.setValue(Boolean.valueOf(AccessibilityManagerAccessibilityStateChangeListenerC2119c0.m3471a(accessibilityManager)));
                        AbstractC2161z.m3500a(accessibilityManager, AbstractC0223b.m488f(accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0));
                    }
                }
                return C1694m.f10482a;
            case 26:
                AbstractC0659i0.m1412l((InterfaceC1570d) obj, (AbstractC0655g0) this.f379g, ((C2041x6) this.f380h).mo1461a());
                return C1694m.f10482a;
            case 27:
                C0265c c0265c = (C0265c) obj;
                return c0265c.m558a(new C0005b(4, new C0078t0(26, ((InterfaceC0667m0) this.f379g).mo1393a(c0265c.f999e.mo550c(), c0265c.f999e.getLayoutDirection(), c0265c), (C2041x6) this.f380h)));
            case 28:
                C2648h0 c2648h0 = (C2648h0) this.f379g;
                C2642f0 c2642f0 = (C2642f0) this.f380h;
                c2648h0.f14319a.m4300b(c2642f0);
                c2648h0.f14320b.setValue(Boolean.TRUE);
                return new C0008b2(5, c2648h0, c2642f0);
            default:
                AbstractC0525d0.m1141s((InterfaceC0516a0) this.f379g, null, new C1747u((C2643f1) this.f380h, null), 1);
                return new Object();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0078t0(Object obj, Object obj2, boolean z7, int i7) {
        super(1);
        this.f378f = i7;
        this.f380h = obj;
        this.f379g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078t0(boolean z7, String str, String str2, String str3, C0034i0 c0034i0, InterfaceC3663c2 interfaceC3663c2) {
        super(1);
        this.f378f = 20;
        this.f379g = c0034i0;
        this.f380h = interfaceC3663c2;
    }
}
