package p100n;

import p001a0.C0074s0;
import p018c0.C0334d;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p101n0.C2705e;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.h0 */
/* loaded from: classes.dex */
public final class C2648h0 {

    /* renamed from: a */
    public final C2705e f14319a = new C2705e(new C2642f0[16]);

    /* renamed from: b */
    public final C2361g1 f14320b = AbstractC2418w.m3980x(Boolean.FALSE);

    /* renamed from: c */
    public long f14321c = Long.MIN_VALUE;

    /* renamed from: d */
    public final C2361g1 f14322d = AbstractC2418w.m3980x(Boolean.TRUE);

    /* renamed from: a */
    public final void m4259a(int i7, C2395p c2395p) {
        int i8;
        c2395p.m3859a0(-318043801);
        if (c2395p.m3874i(this)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3980x(null);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            if (!((Boolean) this.f14322d.getValue()).booleanValue() && !((Boolean) this.f14320b.getValue()).booleanValue()) {
                c2395p.m3857Z(1721436120);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(1719915818);
                boolean m3874i = c2395p.m3874i(this);
                Object m3847O2 = c2395p.m3847O();
                if (m3874i || m3847O2 == c2413u0) {
                    m3847O2 = new C0334d(interfaceC2425y0, this, null);
                    c2395p.m3877j0(m3847O2);
                }
                AbstractC2418w.m3965g(this, c2395p, (InterfaceC3281e) m3847O2);
                c2395p.m3888r(false);
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, 4, this);
        }
    }
}
