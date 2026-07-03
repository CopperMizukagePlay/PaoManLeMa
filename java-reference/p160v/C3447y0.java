package p160v;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p034e0.C0593a;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p100n.C2649h1;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p153u0.AbstractC3340g;
import p153u0.C3339f;
import p153u0.InterfaceC3335b;
import p153u0.InterfaceC3337d;
import p153u0.InterfaceC3338e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.y0 */
/* loaded from: classes.dex */
public final class C3447y0 implements InterfaceC3338e, InterfaceC3335b {

    /* renamed from: e */
    public final C3339f f16658e;

    /* renamed from: f */
    public final C2361g1 f16659f;

    /* renamed from: g */
    public final LinkedHashSet f16660g;

    public C3447y0(InterfaceC3338e interfaceC3338e, Map map) {
        C3443w0 c3443w0 = new C3443w0(interfaceC3338e, 0);
        C2394o2 c2394o2 = AbstractC3340g.f16400a;
        this.f16658e = new C3339f(map, c3443w0);
        this.f16659f = AbstractC2418w.m3980x(null);
        this.f16660g = new LinkedHashSet();
    }

    @Override // p153u0.InterfaceC3335b
    /* renamed from: a */
    public final void mo5072a(Object obj) {
        InterfaceC3335b interfaceC3335b = (InterfaceC3335b) this.f16659f.getValue();
        if (interfaceC3335b != null) {
            interfaceC3335b.mo5072a(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder");
    }

    @Override // p153u0.InterfaceC3335b
    /* renamed from: b */
    public final void mo5073b(Object obj, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-697180401);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(obj)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(this)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i8 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC3335b interfaceC3335b = (InterfaceC3335b) this.f16659f.getValue();
            if (interfaceC3335b != null) {
                interfaceC3335b.mo5073b(obj, c3173d, c2395p, i8 & 126);
                boolean m3874i = c2395p.m3874i(this) | c2395p.m3874i(obj);
                Object m3847O = c2395p.m3847O();
                if (m3874i || m3847O == C2375k.f13421a) {
                    m3847O = new C2649h1(14, this, obj);
                    c2395p.m3877j0(m3847O);
                }
                AbstractC2418w.m3962d(obj, (InterfaceC3279c) m3847O, c2395p);
            } else {
                throw new IllegalArgumentException("null wrappedHolder");
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(this, obj, c3173d, i7, 5);
        }
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: c */
    public final boolean mo5074c(Object obj) {
        return this.f16658e.mo5074c(obj);
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: d */
    public final Map mo5075d() {
        InterfaceC3335b interfaceC3335b = (InterfaceC3335b) this.f16659f.getValue();
        if (interfaceC3335b != null) {
            Iterator it = this.f16660g.iterator();
            while (it.hasNext()) {
                interfaceC3335b.mo5072a(it.next());
            }
        }
        return this.f16658e.mo5075d();
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: e */
    public final Object mo5076e(String str) {
        return this.f16658e.mo5076e(str);
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: f */
    public final InterfaceC3337d mo5077f(String str, InterfaceC3277a interfaceC3277a) {
        return this.f16658e.mo5077f(str, interfaceC3277a);
    }
}
