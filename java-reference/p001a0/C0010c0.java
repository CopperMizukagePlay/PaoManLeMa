package p001a0;

import p019c1.EnumC0376t;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p034e0.C0622o0;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.C2460x;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p176x.C3788c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.c0 */
/* loaded from: classes.dex */
public final class C0010c0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C0043k1 f67f;

    /* renamed from: g */
    public final /* synthetic */ boolean f68g;

    /* renamed from: h */
    public final /* synthetic */ boolean f69h;

    /* renamed from: i */
    public final /* synthetic */ C2460x f70i;

    /* renamed from: j */
    public final /* synthetic */ C2459w f71j;

    /* renamed from: k */
    public final /* synthetic */ C2447k f72k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2453q f73l;

    /* renamed from: m */
    public final /* synthetic */ C0622o0 f74m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC0516a0 f75n;

    /* renamed from: o */
    public final /* synthetic */ C3788c f76o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010c0(C0043k1 c0043k1, boolean z7, boolean z8, C2460x c2460x, C2459w c2459w, C2447k c2447k, InterfaceC2453q interfaceC2453q, C0622o0 c0622o0, InterfaceC0516a0 interfaceC0516a0, C3788c c3788c) {
        super(1);
        this.f67f = c0043k1;
        this.f68g = z7;
        this.f69h = z8;
        this.f70i = c2460x;
        this.f71j = c2459w;
        this.f72k = c2447k;
        this.f73l = interfaceC2453q;
        this.f74m = c0622o0;
        this.f75n = interfaceC0516a0;
        this.f76o = c3788c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0064p2 m120d;
        EnumC0376t enumC0376t = (EnumC0376t) obj;
        C0043k1 c0043k1 = this.f67f;
        if (c0043k1.m118b() != enumC0376t.m844a()) {
            c0043k1.f216f.setValue(Boolean.valueOf(enumC0376t.m844a()));
            boolean m118b = c0043k1.m118b();
            InterfaceC2453q interfaceC2453q = this.f73l;
            C2459w c2459w = this.f71j;
            if (m118b && this.f68g && !this.f69h) {
                AbstractC0027g1.m64j(this.f70i, c0043k1, c2459w, this.f72k, interfaceC2453q);
            } else {
                AbstractC0027g1.m61g(c0043k1);
            }
            if (enumC0376t.m844a() && (m120d = c0043k1.m120d()) != null) {
                AbstractC0525d0.m1141s(this.f75n, null, new C0073s(this.f76o, c2459w, c0043k1, m120d, interfaceC2453q, (InterfaceC2313c) null), 3);
            }
            if (!enumC0376t.m844a()) {
                this.f74m.m1282e(null);
            }
        }
        return C1694m.f10482a;
    }
}
