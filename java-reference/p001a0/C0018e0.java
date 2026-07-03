package p001a0;

import p019c1.C0370n;
import p019c1.C0373q;
import p027d1.C0464b;
import p034e0.C0622o0;
import p050g2.AbstractC1586f0;
import p053g5.C1694m;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p170w1.C3682h1;
import p170w1.InterfaceC3663c2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.e0 */
/* loaded from: classes.dex */
public final class C0018e0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C0043k1 f103f;

    /* renamed from: g */
    public final /* synthetic */ C0373q f104g;

    /* renamed from: h */
    public final /* synthetic */ boolean f105h;

    /* renamed from: i */
    public final /* synthetic */ boolean f106i;

    /* renamed from: j */
    public final /* synthetic */ C0622o0 f107j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2453q f108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018e0(C0043k1 c0043k1, C0373q c0373q, boolean z7, boolean z8, C0622o0 c0622o0, InterfaceC2453q interfaceC2453q) {
        super(1);
        this.f103f = c0043k1;
        this.f104g = c0373q;
        this.f105h = z7;
        this.f106i = z8;
        this.f107j = c0622o0;
        this.f108k = interfaceC2453q;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC3663c2 interfaceC3663c2;
        long j6 = ((C0464b) obj).f1623a;
        C0043k1 c0043k1 = this.f103f;
        if (!c0043k1.m118b()) {
            C0373q c0373q = this.f104g;
            c0373q.getClass();
            c0373q.m843a(new C0370n(1, 3));
        } else if (!this.f105h && (interfaceC3663c2 = c0043k1.f213c) != null) {
            ((C3682h1) interfaceC3663c2).m5701b();
        }
        if (c0043k1.m118b() && this.f106i) {
            if (c0043k1.m117a() != EnumC0091x0.f417f) {
                C0064p2 m120d = c0043k1.m120d();
                if (m120d != null) {
                    C0068q2 c0068q2 = c0043k1.f214d;
                    C0006b0 c0006b0 = c0043k1.f230t;
                    int mo167a = this.f108k.mo167a(m120d.m127b(j6, true));
                    c0006b0.mo23f(C2459w.m4026a((C2459w) c0068q2.f345g, null, AbstractC1586f0.m2558b(mo167a, mo167a), 5));
                    if (c0043k1.f211a.f332a.f10239f.length() > 0) {
                        c0043k1.f221k.setValue(EnumC0091x0.f418g);
                    }
                }
            } else {
                this.f107j.m1282e(new C0464b(j6));
            }
        }
        return C1694m.f10482a;
    }
}
