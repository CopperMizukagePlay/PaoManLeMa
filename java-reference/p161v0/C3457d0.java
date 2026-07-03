package p161v0;

import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p153u0.C3343j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.d0 */
/* loaded from: classes.dex */
public final class C3457d0 extends AbstractC3459f {

    /* renamed from: e */
    public final AbstractC3459f f16693e;

    /* renamed from: f */
    public final boolean f16694f;

    /* renamed from: g */
    public final boolean f16695g;

    /* renamed from: h */
    public InterfaceC3279c f16696h;

    /* renamed from: i */
    public final long f16697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3457d0(AbstractC3459f abstractC3459f, InterfaceC3279c interfaceC3279c, boolean z7, boolean z8) {
        super(0L, C3463j.f16711i);
        InterfaceC3279c mo5207e;
        C3343j c3343j = AbstractC3465l.f16719a;
        this.f16693e = abstractC3459f;
        this.f16694f = z7;
        this.f16695g = z8;
        this.f16696h = AbstractC3465l.m5245l(interfaceC3279c, (abstractC3459f == null || (mo5207e = abstractC3459f.mo5207e()) == null) ? AbstractC3465l.f16728j.f16670e : mo5207e, z7);
        this.f16697i = AbstractC3178i.m4871b();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: c */
    public final void mo5198c() {
        AbstractC3459f abstractC3459f;
        this.f16702c = true;
        if (this.f16695g && (abstractC3459f = this.f16693e) != null) {
            abstractC3459f.mo5198c();
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: d */
    public final C3463j mo5220d() {
        return m5224v().mo5220d();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: e */
    public final InterfaceC3279c mo5207e() {
        return this.f16696h;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: f */
    public final boolean mo5208f() {
        return m5224v().mo5208f();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: g */
    public final long mo5221g() {
        return m5224v().mo5221g();
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
    /* renamed from: m */
    public final void mo5201m() {
        m5224v().mo5201m();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: n */
    public final void mo5211n(InterfaceC3478y interfaceC3478y) {
        m5224v().mo5211n(interfaceC3478y);
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: u */
    public final AbstractC3459f mo5202u(InterfaceC3279c interfaceC3279c) {
        InterfaceC3279c m5245l = AbstractC3465l.m5245l(interfaceC3279c, this.f16696h, true);
        if (!this.f16694f) {
            return AbstractC3465l.m5241h(m5224v().mo5202u(null), m5245l, true);
        }
        return m5224v().mo5202u(m5245l);
    }

    /* renamed from: v */
    public final AbstractC3459f m5224v() {
        AbstractC3459f abstractC3459f = this.f16693e;
        if (abstractC3459f == null) {
            return AbstractC3465l.f16728j;
        }
        return abstractC3459f;
    }
}
