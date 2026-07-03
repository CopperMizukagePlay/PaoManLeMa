package p039e5;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.p007ui.ZIndexElement;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1906h0;
import p063i0.C2003t0;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2661l1;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p152u.C3330r;
import p158u5.AbstractC3368k;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rh */
/* loaded from: classes.dex */
public final class C1244rh extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ List f7342f;

    /* renamed from: g */
    public final /* synthetic */ int f7343g;

    /* renamed from: h */
    public final /* synthetic */ List f7344h;

    /* renamed from: i */
    public final /* synthetic */ boolean f7345i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f7346j;

    /* renamed from: k */
    public final /* synthetic */ C2349d1 f7347k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2390n2 f7348l;

    /* renamed from: m */
    public final /* synthetic */ List f7349m;

    /* renamed from: n */
    public final /* synthetic */ C3330r f7350n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f7351o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3282f f7352p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC0516a0 f7353q;

    /* renamed from: r */
    public final /* synthetic */ float f7354r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC3279c f7355s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC3279c f7356t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC3279c f7357u;

    /* renamed from: v */
    public final /* synthetic */ C2345c1 f7358v;

    /* renamed from: w */
    public final /* synthetic */ C2349d1 f7359w;

    /* renamed from: x */
    public final /* synthetic */ C2345c1 f7360x;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC2425y0 f7361y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244rh(List list, int i7, List list2, boolean z7, InterfaceC3279c interfaceC3279c, C2349d1 c2349d1, InterfaceC2390n2 interfaceC2390n2, List list3, C3330r c3330r, InterfaceC2425y0 interfaceC2425y0, InterfaceC3282f interfaceC3282f, InterfaceC0516a0 interfaceC0516a0, float f7, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3, InterfaceC3279c interfaceC3279c4, C2345c1 c2345c1, C2349d1 c2349d12, C2345c1 c2345c12, InterfaceC2425y0 interfaceC2425y02) {
        super(4);
        this.f7342f = list;
        this.f7343g = i7;
        this.f7344h = list2;
        this.f7345i = z7;
        this.f7346j = interfaceC3279c;
        this.f7347k = c2349d1;
        this.f7348l = interfaceC2390n2;
        this.f7349m = list3;
        this.f7350n = c3330r;
        this.f7351o = interfaceC2425y0;
        this.f7352p = interfaceC3282f;
        this.f7353q = interfaceC0516a0;
        this.f7354r = f7;
        this.f7355s = interfaceC3279c2;
        this.f7356t = interfaceC3279c3;
        this.f7357u = interfaceC3279c4;
        this.f7358v = c2345c1;
        this.f7359w = c2349d12;
        this.f7360x = c2345c12;
        this.f7361y = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        boolean z7;
        long j6;
        InterfaceC3810r interfaceC3810r;
        float f7;
        int i8;
        int i9;
        C3315c c3315c = (C3315c) obj;
        int intValue = ((Number) obj2).intValue();
        C2395p c2395p = (C2395p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (c2395p.m3870g(c3315c)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i7 = i9 | intValue2;
        } else {
            i7 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (c2395p.m3866e(intValue)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        if ((i7 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1189po c1189po = (C1189po) this.f7342f.get(intValue);
            c2395p.m3857Z(-814356111);
            int i10 = c1189po.f6926a;
            boolean z8 = true;
            if (i10 == this.f7343g) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean contains = this.f7344h.contains(Integer.valueOf(i10));
            if (c1189po.f6926a != this.f7347k.m3741g()) {
                z8 = false;
            }
            boolean z9 = this.f7345i;
            if (z9 && contains) {
                c2395p.m3857Z(-2104475532);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11814h;
                c2395p.m3888r(false);
            } else if (z7) {
                c2395p.m3857Z(-2104472814);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11809c;
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(-2104470288);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11824r;
                c2395p.m3888r(false);
            }
            C1906h0 m3168i = AbstractC1991r4.m3168i(j6, c2395p);
            InterfaceC3810r interfaceC3810r2 = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(interfaceC3810r2, 1.0f);
            if (!z8) {
                C2661l1 m4232r = AbstractC2638e.m4232r(180, 6, null);
                C2661l1 m4232r2 = AbstractC2638e.m4232r(180, 6, null);
                C2661l1 m4232r3 = AbstractC2638e.m4232r(220, 2, AbstractC2699z.f14497a);
                c3315c.getClass();
                interfaceC3810r = new LazyLayoutAnimateItemElement(m4232r, m4232r3, m4232r2);
            } else {
                interfaceC3810r = interfaceC3810r2;
            }
            InterfaceC3810r mo5829e = m346e.mo5829e(interfaceC3810r);
            if (z8) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            InterfaceC3810r mo5829e2 = mo5829e.mo5829e(new ZIndexElement(f7));
            c2395p.m3857Z(-2104445697);
            boolean m3872h = c2395p.m3872h(z8);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3872h || m3847O == c2413u0) {
                m3847O = new C0935hh(z8, this.f7348l);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            InterfaceC3810r m384a = AbstractC0168a.m384a(mo5829e2, (InterfaceC3279c) m3847O);
            c2395p.m3857Z(-2104433730);
            if (z9) {
                c2395p.m3857Z(-2104431544);
                InterfaceC3279c interfaceC3279c = this.f7346j;
                boolean m3870g = c2395p.m3870g(interfaceC3279c) | c2395p.m3874i(c1189po);
                Object m3847O2 = c2395p.m3847O();
                if (m3870g || m3847O2 == c2413u0) {
                    m3847O2 = new C0966ih(interfaceC3279c, c1189po, 0);
                    c2395p.m3877j0(m3847O2);
                }
                c2395p.m3888r(false);
                interfaceC3810r2 = AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O2, interfaceC3810r2, false);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3162c(m384a.mo5829e(interfaceC3810r2), null, m3168i, null, AbstractC3178i.m4873d(1542558867, new C1213qh(this.f7345i, contains, this.f7346j, c1189po, this.f7349m, this.f7350n, this.f7351o, this.f7352p, this.f7353q, this.f7354r, this.f7355s, this.f7356t, this.f7357u, this.f7358v, this.f7347k, this.f7359w, this.f7360x, this.f7361y), c2395p), c2395p, 196608, 26);
            c2395p.m3888r(false);
        }
        return C1694m.f10482a;
    }
}
