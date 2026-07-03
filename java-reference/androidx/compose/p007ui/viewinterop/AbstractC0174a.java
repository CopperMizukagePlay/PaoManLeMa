package androidx.compose.p007ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p007ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0213t;
import p001a0.C0046l0;
import p019c1.C0377u;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2387n;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p107o.C2770q;
import p118p3.AbstractC2879d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p153u0.AbstractC3340g;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p162v1.C3502g0;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p163v2.C3563c;
import p163v2.C3571k;
import p163v2.C3572l;
import p163v2.C3576p;
import p170w1.AbstractC3674f1;
import p172w3.InterfaceC3782f;
import p177x0.AbstractC3793a;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3810r;
import p179x3.AbstractC3822a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.ui.viewinterop.a */
/* loaded from: classes.dex */
public abstract class AbstractC0174a {
    /* renamed from: a */
    public static final void m403a(int i7, C2395p c2395p, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r) {
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj = C3563c.f17117j;
        c2395p.m3859a0(-180024211);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i8 = i12 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        int i13 = i8 | 384;
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(obj)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i13 |= i10;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(obj)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i13 |= i9;
        }
        if ((i13 & 9363) != 9362) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i13 & 1, z7)) {
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(FocusGroupPropertiesElement.f795a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC3556y0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj2) {
                    if (obj2 == this) {
                        return true;
                    }
                    return false;
                }

                @Override // p162v1.AbstractC3556y0
                /* renamed from: h */
                public final AbstractC3809q mo312h() {
                    return new C0377u(null, 7);
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // p162v1.AbstractC3556y0
                /* renamed from: i */
                public final /* bridge */ /* synthetic */ void mo313i(AbstractC3809q abstractC3809q) {
                }
            };
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e.mo5829e(focusTargetNode$FocusTargetElement).mo5829e(FocusTargetPropertiesElement.f796a).mo5829e(focusTargetNode$FocusTargetElement));
            InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
            EnumC3103m enumC3103m = (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC0213t interfaceC0213t = (InterfaceC0213t) c2395p.m3878k(AbstractC2879d.f15050a);
            InterfaceC3782f interfaceC3782f = (InterfaceC3782f) c2395p.m3878k(AbstractC3822a.f18029a);
            c2395p.m3857Z(1314800527);
            int i14 = i13 & 14;
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            C2387n m3982z = AbstractC2418w.m3982z(c2395p);
            InterfaceC3338e interfaceC3338e = (InterfaceC3338e) c2395p.m3878k(AbstractC3340g.f16400a);
            View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
            boolean m3874i = c2395p.m3874i(context);
            if ((((i14 & 14) ^ 6) > 4 && c2395p.m3870g(interfaceC3279c)) || (i14 & 6) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean m3874i2 = m3874i | z8 | c2395p.m3874i(m3982z) | c2395p.m3874i(interfaceC3338e) | c2395p.m3866e(hashCode2) | c2395p.m3874i(view);
            Object m3847O = c2395p.m3847O();
            if (m3874i2 || m3847O == C2375k.f13421a) {
                m3847O = new C3572l(context, interfaceC3279c, m3982z, interfaceC3338e, hashCode2, view);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
            c2395p.m3853V(125, 1, null, null);
            c2395p.f13505r = true;
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a);
            } else {
                c2395p.m3883m0();
            }
            InterfaceC3510j.f16935d.getClass();
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            AbstractC2418w.m3954C(m5823c, c2395p, C3571k.f17162i);
            AbstractC2418w.m3954C(interfaceC3093c, c2395p, C3571k.f17163j);
            AbstractC2418w.m3954C(interfaceC0213t, c2395p, C3571k.f17164k);
            AbstractC2418w.m3954C(interfaceC3782f, c2395p, C3571k.f17165l);
            AbstractC2418w.m3954C(enumC3103m, c2395p, C3571k.f17166m);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(obj, c2395p, C3571k.f17160g);
            AbstractC2418w.m3954C(obj, c2395p, C3571k.f17161h);
            c2395p.m3888r(true);
            c2395p.m3888r(false);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2770q(interfaceC3279c, interfaceC3810r, i7);
        }
    }

    /* renamed from: b */
    public static final void m404b(InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c2, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        C3563c c3563c = C3563c.f17117j;
        c2395p.m3859a0(-1783766393);
        if (c2395p.m3874i(interfaceC3279c)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = i8 | i7 | 384;
        if ((i9 & 147) != 146) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i9 & 1, z7)) {
            m403a((i9 & 14) | 27696, c2395p, interfaceC3279c, interfaceC3810r);
            interfaceC3279c2 = c3563c;
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0046l0(interfaceC3279c, interfaceC3810r, interfaceC3279c2, i7);
        }
    }

    /* renamed from: c */
    public static final C3576p m405c(C3502g0 c3502g0) {
        C3576p c3576p = c3502g0.f16897r;
        if (c3576p != null) {
            return c3576p;
        }
        throw AbstractC2487d.m4041e("Required value was null.");
    }
}
