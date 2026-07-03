package p001a0;

import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.relocation.AbstractC0159a;
import p034e0.C0622o0;
import p034e0.C0625q;
import p050g2.C1602n0;
import p050g2.C1604o0;
import p053g5.C1694m;
import p085l0.C2375k;
import p085l0.C2395p;
import p087l2.C2439d0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p102n1.AbstractC2710c;
import p122q.EnumC2931o0;
import p140s2.C3096f;
import p140s2.InterfaceC3093c;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;
import p176x.C3788c;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.z */
/* loaded from: classes.dex */
public final class C0096z extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C0043k1 f445f;

    /* renamed from: g */
    public final /* synthetic */ C1604o0 f446g;

    /* renamed from: h */
    public final /* synthetic */ int f447h;

    /* renamed from: i */
    public final /* synthetic */ int f448i;

    /* renamed from: j */
    public final /* synthetic */ C0048l2 f449j;

    /* renamed from: k */
    public final /* synthetic */ C2459w f450k;

    /* renamed from: l */
    public final /* synthetic */ C0625q f451l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3810r f452m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3810r f453n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC3810r f454o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3810r f455p;

    /* renamed from: q */
    public final /* synthetic */ C3788c f456q;

    /* renamed from: r */
    public final /* synthetic */ C0622o0 f457r;

    /* renamed from: s */
    public final /* synthetic */ boolean f458s;

    /* renamed from: t */
    public final /* synthetic */ boolean f459t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC3279c f460u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2453q f461v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC3093c f462w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096z(C0043k1 c0043k1, C1604o0 c1604o0, int i7, int i8, C0048l2 c0048l2, C2459w c2459w, C0625q c0625q, InterfaceC3810r interfaceC3810r, InterfaceC3810r interfaceC3810r2, InterfaceC3810r interfaceC3810r3, InterfaceC3810r interfaceC3810r4, C3788c c3788c, C0622o0 c0622o0, boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, InterfaceC2453q interfaceC2453q, InterfaceC3093c interfaceC3093c) {
        super(2);
        this.f445f = c0043k1;
        this.f446g = c1604o0;
        this.f447h = i7;
        this.f448i = i8;
        this.f449j = c0048l2;
        this.f450k = c2459w;
        this.f451l = c0625q;
        this.f452m = interfaceC3810r;
        this.f453n = interfaceC3810r2;
        this.f454o = interfaceC3810r3;
        this.f455p = interfaceC3810r4;
        this.f456q = c3788c;
        this.f457r = c0622o0;
        this.f458s = z7;
        this.f459t = z8;
        this.f460u = interfaceC3279c;
        this.f461v = interfaceC2453q;
        this.f462w = interfaceC3093c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC3810r c0080t2;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C0043k1 c0043k1 = this.f445f;
            InterfaceC3810r m349h = AbstractC0155c.m349h(C3807o.f17991a, ((C3096f) c0043k1.f217g.getValue()).f15693e, 0.0f, 2);
            int i7 = this.f447h;
            int i8 = this.f448i;
            C1604o0 c1604o0 = this.f446g;
            InterfaceC3810r m5821a = AbstractC3793a.m5821a(m349h, new C0097z0(i7, i8, c1604o0));
            C2459w c2459w = this.f450k;
            long j6 = c2459w.f13724b;
            boolean m3874i = c2395p.m3874i(c0043k1);
            Object m3847O = c2395p.m3847O();
            if (m3874i || m3847O == C2375k.f13421a) {
                m3847O = new C0053n(1, c0043k1);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
            C0048l2 c0048l2 = this.f449j;
            EnumC2931o0 enumC2931o0 = (EnumC2931o0) c0048l2.f250e.getValue();
            int i9 = C1602n0.f10303c;
            int i10 = (int) (j6 >> 32);
            long j7 = c0048l2.f249d;
            if (i10 == ((int) (j7 >> 32)) && (i10 = (int) (j6 & 4294967295L)) == ((int) (4294967295L & j7))) {
                i10 = C1602n0.m2589e(j6);
            }
            c0048l2.f249d = j6;
            C2439d0 m66l = AbstractC0027g1.m66l(this.f451l, c2459w.f13723a);
            int ordinal = enumC2931o0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c0080t2 = new C0007b1(c0048l2, i10, m66l, interfaceC3277a);
                } else {
                    throw new RuntimeException();
                }
            } else {
                c0080t2 = new C0080t2(c0048l2, i10, m66l, interfaceC3277a);
            }
            AbstractC2710c.m4330b(AbstractC0159a.m370a(AbstractC3793a.m5821a(AbstractC3784a.m5800d(m5821a).mo5829e(c0080t2).mo5829e(this.f452m).mo5829e(this.f453n), new C0060o2(1, c1604o0)).mo5829e(this.f454o).mo5829e(this.f455p), this.f456q), AbstractC3178i.m4873d(-363167407, new C0093y(this.f457r, c0043k1, this.f458s, this.f459t, this.f460u, c2459w, this.f461v, this.f462w, this.f448i), c2395p), c2395p, 48);
        }
        return C1694m.f10482a;
    }
}
