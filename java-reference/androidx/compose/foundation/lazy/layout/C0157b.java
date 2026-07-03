package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import p001a0.C0065q;
import p001a0.C0068q2;
import p001a0.C0087w;
import p053g5.C1694m;
import p063i0.C1879e0;
import p085l0.C2356f0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p146t1.AbstractC3191c1;
import p146t1.C3200f1;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p153u0.InterfaceC3335b;
import p158u5.AbstractC3368k;
import p160v.AbstractC3433r0;
import p160v.C3409f0;
import p160v.C3431q0;
import p160v.RunnableC3399b;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.lazy.layout.b */
/* loaded from: classes.dex */
public final class C0157b extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ C3431q0 f687f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f688g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3281e f689h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157b(C3431q0 c3431q0, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, InterfaceC2425y0 interfaceC2425y0) {
        super(3);
        this.f687f = c3431q0;
        this.f688g = interfaceC3810r;
        this.f689h = interfaceC3281e;
        this.f690i = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        InterfaceC3810r mo5829e;
        InterfaceC3335b interfaceC3335b = (InterfaceC3335b) obj;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        Object m3847O = c2395p.m3847O();
        Object obj4 = C2375k.f13421a;
        if (m3847O == obj4) {
            m3847O = new C3409f0(interfaceC3335b, new C0065q(this.f690i, 4));
            c2395p.m3877j0(m3847O);
        }
        C3409f0 c3409f0 = (C3409f0) m3847O;
        Object m3847O2 = c2395p.m3847O();
        if (m3847O2 == obj4) {
            m3847O2 = new C3200f1(new C0068q2(c3409f0));
            c2395p.m3877j0(m3847O2);
        }
        C3200f1 c3200f1 = (C3200f1) m3847O2;
        C3431q0 c3431q0 = this.f687f;
        if (c3431q0 != null) {
            c2395p.m3857Z(205264983);
            c2395p.m3857Z(6622915);
            View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
            boolean m3870g = c2395p.m3870g(view);
            Object m3847O3 = c2395p.m3847O();
            if (m3870g || m3847O3 == obj4) {
                m3847O3 = new RunnableC3399b(view);
                c2395p.m3877j0(m3847O3);
            }
            Object obj5 = (RunnableC3399b) m3847O3;
            c2395p.m3888r(false);
            Object[] objArr = {c3431q0, c3409f0, c3200f1, obj5};
            boolean m3870g2 = c2395p.m3870g(c3431q0) | c2395p.m3874i(c3409f0) | c2395p.m3874i(c3200f1) | c2395p.m3874i(obj5);
            Object m3847O4 = c2395p.m3847O();
            if (m3870g2 || m3847O4 == obj4) {
                Object c0087w = new C0087w(c3431q0, c3409f0, c3200f1, obj5, 3);
                c2395p.m3877j0(c0087w);
                m3847O4 = c0087w;
            }
            InterfaceC3279c interfaceC3279c = (InterfaceC3279c) m3847O4;
            boolean z7 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z7 |= c2395p.m3870g(obj6);
            }
            Object m3847O5 = c2395p.m3847O();
            if (z7 || m3847O5 == obj4) {
                c2395p.m3877j0(new C2356f0(interfaceC3279c));
            }
            c2395p.m3888r(false);
        } else {
            c2395p.m3857Z(205858881);
            c2395p.m3888r(false);
        }
        int i7 = AbstractC3433r0.f16615b;
        InterfaceC3810r interfaceC3810r = this.f688g;
        if (c3431q0 != null && (mo5829e = interfaceC3810r.mo5829e(new TraversablePrefetchStateModifierElement(c3431q0))) != null) {
            interfaceC3810r = mo5829e;
        }
        boolean m3870g3 = c2395p.m3870g(c3409f0);
        Object obj7 = this.f689h;
        boolean m3870g4 = m3870g3 | c2395p.m3870g(obj7);
        Object m3847O6 = c2395p.m3847O();
        if (m3870g4 || m3847O6 == obj4) {
            m3847O6 = new C1879e0(11, c3409f0, obj7);
            c2395p.m3877j0(m3847O6);
        }
        AbstractC3191c1.m4890a(c3200f1, interfaceC3810r, (InterfaceC3281e) m3847O6, c2395p, 8);
        return C1694m.f10482a;
    }
}
