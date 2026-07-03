package p010b1;

import p001a0.C0019e1;
import p001a0.C0033i;
import p067i4.AbstractC2072e;
import p092m.AbstractC2487d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3522n;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b1.b */
/* loaded from: classes.dex */
public final class C0264b extends AbstractC3809q implements InterfaceC3509i1, InterfaceC0263a, InterfaceC3522n {

    /* renamed from: s */
    public final C0265c f996s;

    /* renamed from: t */
    public boolean f997t;

    /* renamed from: u */
    public InterfaceC3279c f998u;

    public C0264b(C0265c c0265c, InterfaceC3279c interfaceC3279c) {
        this.f996s = c0265c;
        this.f998u = interfaceC3279c;
        c0265c.f999e = this;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: E0 */
    public final void mo551E0() {
        m552K0();
    }

    /* renamed from: K0 */
    public final void m552K0() {
        this.f997t = false;
        this.f996s.f1000f = null;
        AbstractC3498f.m5373m(this);
    }

    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        m552K0();
    }

    @Override // p162v1.InterfaceC3516l
    /* renamed from: a */
    public final void mo554a() {
        m552K0();
    }

    @Override // p010b1.InterfaceC0263a
    /* renamed from: b */
    public final InterfaceC3093c mo549b() {
        return AbstractC3498f.m5382v(this).f16865B;
    }

    @Override // p010b1.InterfaceC0263a
    /* renamed from: c */
    public final long mo550c() {
        return AbstractC2072e.m3347y(AbstractC3498f.m5380t(this, 128).f16055g);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t5.c, u5.k] */
    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        boolean z7 = this.f997t;
        C0265c c0265c = this.f996s;
        if (!z7) {
            c0265c.f1000f = null;
            AbstractC3498f.m5379s(this, new C0033i(2, this, c0265c));
            if (c0265c.f1000f != null) {
                this.f997t = true;
            } else {
                throw AbstractC2487d.m4041e("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        C0019e1 c0019e1 = c0265c.f1000f;
        AbstractC3367j.m5097b(c0019e1);
        ((AbstractC3368k) c0019e1.f109e).mo23f(c3508i0);
    }

    @Override // p010b1.InterfaceC0263a
    public final EnumC3103m getLayoutDirection() {
        return AbstractC3498f.m5382v(this).f16866C;
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: q0 */
    public final void mo556q0() {
        m552K0();
    }

    @Override // p162v1.InterfaceC3516l
    /* renamed from: u0 */
    public final void mo557u0() {
        m552K0();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
    }
}
