package p161v0;

import p150t5.InterfaceC3279c;
import p153u0.C3343j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C3456d extends AbstractC3459f {

    /* renamed from: e */
    public final InterfaceC3279c f16691e;

    /* renamed from: f */
    public final AbstractC3459f f16692f;

    public C3456d(long j6, C3463j c3463j, InterfaceC3279c interfaceC3279c, AbstractC3459f abstractC3459f) {
        super(j6, c3463j);
        this.f16691e = interfaceC3279c;
        this.f16692f = abstractC3459f;
        abstractC3459f.mo5199k();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: c */
    public final void mo5198c() {
        AbstractC3459f abstractC3459f = this.f16692f;
        if (!this.f16702c) {
            if (this.f16701b != abstractC3459f.mo5221g()) {
                m5226a();
            }
            abstractC3459f.mo5200l();
            this.f16702c = true;
            synchronized (AbstractC3465l.f16721c) {
                m5228o();
            }
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: e */
    public final InterfaceC3279c mo5207e() {
        return this.f16691e;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: f */
    public final boolean mo5208f() {
        return true;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: i */
    public final InterfaceC3279c mo5210i() {
        return null;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: k */
    public final void mo5199k() {
        AbstractC3470q.m5270k();
        throw null;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: l */
    public final void mo5200l() {
        AbstractC3470q.m5270k();
        throw null;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: n */
    public final void mo5211n(InterfaceC3478y interfaceC3478y) {
        C3343j c3343j = AbstractC3465l.f16719a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: u */
    public final AbstractC3459f mo5202u(InterfaceC3279c interfaceC3279c) {
        return new C3456d(this.f16701b, this.f16700a, AbstractC3465l.m5245l(interfaceC3279c, this.f16691e, true), this.f16692f);
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: m */
    public final void mo5201m() {
    }
}
