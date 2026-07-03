package p100n;

import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.z0 */
/* loaded from: classes.dex */
public final class C2700z0 implements InterfaceC2644g {

    /* renamed from: a */
    public final InterfaceC2670o1 f14501a;

    /* renamed from: b */
    public final C2664m1 f14502b;

    /* renamed from: c */
    public final Object f14503c;

    /* renamed from: d */
    public final Object f14504d;

    /* renamed from: e */
    public final AbstractC2674q f14505e;

    /* renamed from: f */
    public final AbstractC2674q f14506f;

    /* renamed from: g */
    public final AbstractC2674q f14507g;

    /* renamed from: h */
    public long f14508h;

    /* renamed from: i */
    public AbstractC2674q f14509i;

    public C2700z0(InterfaceC2656k interfaceC2656k, C2664m1 c2664m1, Object obj, Object obj2, AbstractC2674q abstractC2674q) {
        AbstractC2674q mo4268c;
        this.f14501a = interfaceC2656k.mo4196a(c2664m1);
        this.f14502b = c2664m1;
        this.f14503c = obj2;
        this.f14504d = obj;
        this.f14505e = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
        InterfaceC3279c interfaceC3279c = c2664m1.f14361a;
        this.f14506f = (AbstractC2674q) interfaceC3279c.mo23f(obj2);
        if (abstractC2674q != null) {
            mo4268c = AbstractC2638e.m4225k(abstractC2674q);
        } else {
            mo4268c = ((AbstractC2674q) interfaceC3279c.mo23f(obj)).mo4268c();
        }
        this.f14507g = mo4268c;
        this.f14508h = -1L;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: b */
    public final boolean mo4248b() {
        return this.f14501a.mo4274b();
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: c */
    public final Object mo4249c(long j6) {
        if (!m4254h(j6)) {
            AbstractC2674q mo631o = this.f14501a.mo631o(j6, this.f14505e, this.f14506f, this.f14507g);
            int mo4267b = mo631o.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                if (Float.isNaN(mo631o.mo4266a(i7))) {
                    AbstractC2666n0.m4273b("AnimationVector cannot contain a NaN. " + mo631o + ". Animation: " + this + ", playTimeNanos: " + j6);
                }
            }
            return this.f14502b.f14362b.mo23f(mo631o);
        }
        return this.f14503c;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: d */
    public final long mo4250d() {
        if (this.f14508h < 0) {
            this.f14508h = this.f14501a.mo4095c(this.f14505e, this.f14506f, this.f14507g);
        }
        return this.f14508h;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: e */
    public final C2664m1 mo4251e() {
        return this.f14502b;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: f */
    public final Object mo4252f() {
        return this.f14503c;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: g */
    public final AbstractC2674q mo4253g(long j6) {
        if (!m4254h(j6)) {
            return this.f14501a.mo630n(j6, this.f14505e, this.f14506f, this.f14507g);
        }
        AbstractC2674q abstractC2674q = this.f14509i;
        if (abstractC2674q == null) {
            AbstractC2674q mo4103m = this.f14501a.mo4103m(this.f14505e, this.f14506f, this.f14507g);
            this.f14509i = mo4103m;
            return mo4103m;
        }
        return abstractC2674q;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f14504d + " -> " + this.f14503c + ",initial velocity: " + this.f14507g + ", duration: " + (mo4250d() / 1000000) + " ms,animationSpec: " + this.f14501a;
    }
}
