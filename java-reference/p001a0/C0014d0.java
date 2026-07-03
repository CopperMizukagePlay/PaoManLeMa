package p001a0;

import p000a.AbstractC0000a;
import p027d1.C0465c;
import p034e0.C0622o0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p085l0.C2361g1;
import p087l2.C2437c0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3726s1;
import p170w1.InterfaceC3687i2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.d0 */
/* loaded from: classes.dex */
public final class C0014d0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C0043k1 f88f;

    /* renamed from: g */
    public final /* synthetic */ boolean f89g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3687i2 f90h;

    /* renamed from: i */
    public final /* synthetic */ C0622o0 f91i;

    /* renamed from: j */
    public final /* synthetic */ C2459w f92j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2453q f93k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014d0(C0043k1 c0043k1, boolean z7, InterfaceC3687i2 interfaceC3687i2, C0622o0 c0622o0, C2459w c2459w, InterfaceC2453q interfaceC2453q) {
        super(1);
        this.f88f = c0043k1;
        this.f89g = z7;
        this.f90h = interfaceC3687i2;
        this.f91i = c0622o0;
        this.f92j = c2459w;
        this.f93k = interfaceC2453q;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C2437c0 c2437c0;
        InterfaceC3238v interfaceC3238v;
        InterfaceC3238v interfaceC3238v2;
        InterfaceC3238v interfaceC3238v3 = (InterfaceC3238v) obj;
        C0043k1 c0043k1 = this.f88f;
        C2361g1 c2361g1 = c0043k1.f225o;
        c0043k1.f218h = interfaceC3238v3;
        C0064p2 m120d = c0043k1.m120d();
        if (m120d != null) {
            m120d.f323b = interfaceC3238v3;
        }
        if (this.f89g) {
            EnumC0091x0 m117a = c0043k1.m117a();
            EnumC0091x0 enumC0091x0 = EnumC0091x0.f417f;
            C2459w c2459w = this.f92j;
            C0622o0 c0622o0 = this.f91i;
            if (m117a == enumC0091x0) {
                if (((Boolean) c0043k1.f222l.getValue()).booleanValue() && ((Boolean) ((C3726s1) this.f90h).f17692a.getValue()).booleanValue()) {
                    c0622o0.m1292o();
                } else {
                    c0622o0.m1288k();
                }
                c0043k1.f223m.setValue(Boolean.valueOf(AbstractC1793a0.m2963C(c0622o0, true)));
                c0043k1.f224n.setValue(Boolean.valueOf(AbstractC1793a0.m2963C(c0622o0, false)));
                c2361g1.setValue(Boolean.valueOf(C1602n0.m2586b(c2459w.f13724b)));
            } else if (c0043k1.m117a() == EnumC0091x0.f418g) {
                c2361g1.setValue(Boolean.valueOf(AbstractC1793a0.m2963C(c0622o0, true)));
            }
            InterfaceC2453q interfaceC2453q = this.f93k;
            AbstractC0027g1.m71q(c0043k1, c2459w, interfaceC2453q);
            C0064p2 m120d2 = c0043k1.m120d();
            if (m120d2 != null && (c2437c0 = c0043k1.f215e) != null && c0043k1.m118b() && (interfaceC3238v = m120d2.f323b) != null && interfaceC3238v.mo4923M() && (interfaceC3238v2 = m120d2.f324c) != null) {
                C1598l0 c1598l0 = m120d2.f322a;
                C0005b c0005b = new C0005b(1, interfaceC3238v);
                C0465c m21v = AbstractC0000a.m21v(interfaceC3238v);
                C0465c mo4934j = interfaceC3238v.mo4934j(interfaceC3238v2, false);
                if (AbstractC3367j.m5096a((C2437c0) c2437c0.f13683a.f13727b.get(), c2437c0)) {
                    c2437c0.f13684b.mo682a(c2459w, interfaceC2453q, c1598l0, c0005b, m21v, mo4934j);
                }
            }
        }
        return C1694m.f10482a;
    }
}
