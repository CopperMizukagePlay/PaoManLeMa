package p161v0;

import p150t5.InterfaceC3279c;
import p153u0.C3343j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.e */
/* loaded from: classes.dex */
public final class C3458e extends AbstractC3459f {

    /* renamed from: e */
    public final InterfaceC3279c f16698e;

    /* renamed from: f */
    public int f16699f;

    public C3458e(long j6, C3463j c3463j, InterfaceC3279c interfaceC3279c) {
        super(j6, c3463j);
        this.f16698e = interfaceC3279c;
        this.f16699f = 1;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: c */
    public final void mo5198c() {
        if (!this.f16702c) {
            mo5200l();
            this.f16702c = true;
            synchronized (AbstractC3465l.f16721c) {
                m5228o();
            }
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: e */
    public final InterfaceC3279c mo5207e() {
        return this.f16698e;
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
        this.f16699f++;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: l */
    public final void mo5200l() {
        int i7 = this.f16699f - 1;
        this.f16699f = i7;
        if (i7 == 0) {
            m5226a();
        }
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
        AbstractC3465l.m5237d(this);
        return new C3456d(this.f16701b, this.f16700a, AbstractC3465l.m5245l(interfaceC3279c, this.f16698e, true), this);
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: m */
    public final void mo5201m() {
    }
}
