package p153u0;

import java.util.Map;
import p001a0.C0068q2;
import p015b6.C0310q;
import p039e5.C0974ip;
import p039e5.C1009k;
import p039e5.C1162os;
import p050g2.C1584e0;
import p053g5.C1694m;
import p077k.AbstractC2210p0;
import p077k.C2194h0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2401q1;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p179x3.AbstractC3822a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.c */
/* loaded from: classes.dex */
public final class C3336c implements InterfaceC3335b {

    /* renamed from: i */
    public static final C0068q2 f16392i = new C0068q2(22, new C1584e0(9), new C1162os(29));

    /* renamed from: e */
    public final Map f16393e;

    /* renamed from: f */
    public final C2194h0 f16394f;

    /* renamed from: g */
    public InterfaceC3338e f16395g;

    /* renamed from: h */
    public final C0310q f16396h;

    public C3336c(Map map) {
        this.f16393e = map;
        long[] jArr = AbstractC2210p0.f12722a;
        this.f16394f = new C2194h0();
        this.f16396h = new C0310q(20, this);
    }

    @Override // p153u0.InterfaceC3335b
    /* renamed from: a */
    public final void mo5072a(Object obj) {
        if (this.f16394f.m3596k(obj) == null) {
            this.f16393e.remove(obj);
        }
    }

    @Override // p153u0.InterfaceC3335b
    /* renamed from: b */
    public final void mo5073b(Object obj, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(533563200);
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
        if ((i8 & 147) != 146) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            c2395p.m3861b0(obj);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                C0310q c0310q = this.f16396h;
                if (((Boolean) c0310q.mo23f(obj)).booleanValue()) {
                    Map map = (Map) this.f16393e.get(obj);
                    C2394o2 c2394o2 = AbstractC3340g.f16400a;
                    C3341h c3341h = new C3341h(new C3339f(map, c0310q));
                    c2395p.m3877j0(c3341h);
                    m3847O = c3341h;
                } else {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
            }
            C3341h c3341h2 = (C3341h) m3847O;
            AbstractC2418w.m3960b(new C2401q1[]{AbstractC3340g.f16400a.mo3716a(c3341h2), AbstractC3822a.f18029a.mo3716a(c3341h2)}, c3173d, c2395p, (i8 & 112) | 8);
            boolean m3874i = c2395p.m3874i(this) | c2395p.m3874i(obj) | c2395p.m3874i(c3341h2);
            Object m3847O2 = c2395p.m3847O();
            if (m3874i || m3847O2 == c2413u0) {
                m3847O2 = new C1009k(this, obj, c3341h2, 12);
                c2395p.m3877j0(m3847O2);
            }
            AbstractC2418w.m3962d(C1694m.f10482a, (InterfaceC3279c) m3847O2, c2395p);
            c2395p.m3892v();
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0974ip(this, obj, c3173d, i7, 3);
        }
    }
}
