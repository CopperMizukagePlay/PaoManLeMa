package p056h0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p001a0.C0070r0;
import p035e1.C0677s;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2771q0;
import p137s.InterfaceC3080i;
import p140s2.C3096f;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.e */
/* loaded from: classes.dex */
public final class C1731e implements InterfaceC2768p0 {

    /* renamed from: a */
    public final boolean f10588a;

    /* renamed from: b */
    public final float f10589b;

    /* renamed from: c */
    public final InterfaceC2425y0 f10590c;

    public C1731e(boolean z7, float f7, InterfaceC2425y0 interfaceC2425y0) {
        this.f10588a = z7;
        this.f10589b = f7;
        this.f10590c = interfaceC2425y0;
    }

    @Override // p107o.InterfaceC2768p0
    /* renamed from: b */
    public final InterfaceC2771q0 mo2788b(InterfaceC3080i interfaceC3080i, C2395p c2395p) {
        long mo2787b;
        c2395p.m3857Z(988743187);
        InterfaceC1743q interfaceC1743q = (InterfaceC1743q) c2395p.m3878k(AbstractC1745s.f10641a);
        InterfaceC2425y0 interfaceC2425y0 = this.f10590c;
        if (((C0677s) interfaceC2425y0.getValue()).f2211a != C0677s.f2209g) {
            c2395p.m3857Z(-303571590);
            c2395p.m3888r(false);
            mo2787b = ((C0677s) interfaceC2425y0.getValue()).f2211a;
        } else {
            c2395p.m3857Z(-303521246);
            mo2787b = interfaceC1743q.mo2787b(c2395p);
            c2395p.m3888r(false);
        }
        InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(new C0677s(mo2787b), c2395p);
        InterfaceC2425y0 m3953A2 = AbstractC2418w.m3953A(interfaceC1743q.mo2786a(c2395p), c2395p);
        c2395p.m3857Z(331259447);
        ViewGroup m2799b = AbstractC1746t.m2799b((View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f));
        boolean m3870g = c2395p.m3870g(interfaceC3080i) | c2395p.m3870g(this) | c2395p.m3870g(m2799b);
        Object m3847O = c2395p.m3847O();
        Object obj = C2375k.f13421a;
        if (m3870g || m3847O == obj) {
            Object c1727a = new C1727a(this.f10588a, this.f10589b, m3953A, m3953A2, m2799b);
            c2395p.m3877j0(c1727a);
            m3847O = c1727a;
        }
        C1727a c1727a2 = (C1727a) m3847O;
        c2395p.m3888r(false);
        boolean m3870g2 = c2395p.m3870g(interfaceC3080i) | c2395p.m3874i(c1727a2);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == obj) {
            m3847O2 = new C0070r0(interfaceC3080i, c1727a2, (InterfaceC2313c) null, 12);
            c2395p.m3877j0(m3847O2);
        }
        AbstractC2418w.m3964f(c1727a2, interfaceC3080i, (InterfaceC3281e) m3847O2, c2395p);
        c2395p.m3888r(false);
        return c1727a2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1731e) {
                C1731e c1731e = (C1731e) obj;
                if (this.f10588a != c1731e.f10588a || !C3096f.m4776a(this.f10589b, c1731e.f10589b) || !this.f10590c.equals(c1731e.f10590c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10590c.hashCode() + AbstractC2487d.m4038b(this.f10589b, Boolean.hashCode(this.f10588a) * 31, 31);
    }
}
