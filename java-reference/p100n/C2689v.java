package p100n;

import p001a0.C0019e1;
import p073j2.AbstractC2168e;
import p092m.AbstractC2482a0;
import p092m.AbstractC2483b;
import p092m.C2509y;
import p092m.C2510z;
import p096m3.C2572v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.v */
/* loaded from: classes.dex */
public final class C2689v implements InterfaceC2644g {

    /* renamed from: a */
    public final C2572v f14451a;

    /* renamed from: b */
    public final C2664m1 f14452b;

    /* renamed from: c */
    public final Object f14453c;

    /* renamed from: d */
    public final AbstractC2674q f14454d;

    /* renamed from: e */
    public final AbstractC2674q f14455e;

    /* renamed from: f */
    public final AbstractC2674q f14456f;

    /* renamed from: g */
    public final Object f14457g;

    /* renamed from: h */
    public final long f14458h;

    public C2689v(C2692w c2692w, C2664m1 c2664m1, Object obj, AbstractC2674q abstractC2674q) {
        C2572v c2572v = new C2572v(c2692w.f14462a);
        this.f14451a = c2572v;
        this.f14452b = c2664m1;
        this.f14453c = obj;
        AbstractC2674q abstractC2674q2 = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
        this.f14454d = abstractC2674q2;
        this.f14455e = AbstractC2638e.m4225k(abstractC2674q);
        this.f14457g = c2664m1.f14362b.mo23f(c2572v.m4100h(abstractC2674q2, abstractC2674q));
        if (((AbstractC2674q) c2572v.f13968g) == null) {
            c2572v.f13968g = abstractC2674q2.mo4268c();
        }
        AbstractC2674q abstractC2674q3 = (AbstractC2674q) c2572v.f13968g;
        if (abstractC2674q3 != null) {
            int mo4267b = abstractC2674q3.mo4267b();
            long j6 = 0;
            for (int i7 = 0; i7 < mo4267b; i7++) {
                C0019e1 c0019e1 = (C0019e1) c2572v.f13966e;
                abstractC2674q2.getClass();
                j6 = Math.max(j6, ((long) (Math.exp(((C2510z) c0019e1.f109e).m4066b(abstractC2674q.mo4266a(i7)) / (AbstractC2482a0.f13782a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.f14458h = j6;
            AbstractC2674q m4225k = AbstractC2638e.m4225k(this.f14451a.m4101i(j6, this.f14454d, abstractC2674q));
            this.f14456f = m4225k;
            int mo4267b2 = m4225k.mo4267b();
            for (int i8 = 0; i8 < mo4267b2; i8++) {
                AbstractC2674q abstractC2674q4 = this.f14456f;
                float mo4266a = abstractC2674q4.mo4266a(i8);
                this.f14451a.getClass();
                this.f14451a.getClass();
                abstractC2674q4.mo4270e(AbstractC2168e.m3529p(mo4266a, -0.0f, 0.0f), i8);
            }
            return;
        }
        AbstractC3367j.m5105j("velocityVector");
        throw null;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: b */
    public final boolean mo4248b() {
        return false;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: c */
    public final Object mo4249c(long j6) {
        float f7;
        if (!m4254h(j6)) {
            InterfaceC3279c interfaceC3279c = this.f14452b.f14362b;
            C2572v c2572v = this.f14451a;
            AbstractC2674q abstractC2674q = (AbstractC2674q) c2572v.f13967f;
            AbstractC2674q abstractC2674q2 = this.f14454d;
            if (abstractC2674q == null) {
                c2572v.f13967f = abstractC2674q2.mo4268c();
            }
            AbstractC2674q abstractC2674q3 = (AbstractC2674q) c2572v.f13967f;
            if (abstractC2674q3 != null) {
                int mo4267b = abstractC2674q3.mo4267b();
                for (int i7 = 0; i7 < mo4267b; i7++) {
                    AbstractC2674q abstractC2674q4 = (AbstractC2674q) c2572v.f13967f;
                    if (abstractC2674q4 != null) {
                        C0019e1 c0019e1 = (C0019e1) c2572v.f13966e;
                        float mo4266a = abstractC2674q2.mo4266a(i7);
                        long j7 = j6 / 1000000;
                        C2509y m4065a = ((C2510z) c0019e1.f109e).m4065a(this.f14455e.mo4266a(i7));
                        long j8 = m4065a.f13856c;
                        if (j8 > 0) {
                            f7 = ((float) j7) / ((float) j8);
                        } else {
                            f7 = 1.0f;
                        }
                        abstractC2674q4.mo4270e((Math.signum(m4065a.f13854a) * m4065a.f13855b * AbstractC2483b.m4034a(f7).f13780a) + mo4266a, i7);
                    } else {
                        AbstractC3367j.m5105j("valueVector");
                        throw null;
                    }
                }
                AbstractC2674q abstractC2674q5 = (AbstractC2674q) c2572v.f13967f;
                if (abstractC2674q5 != null) {
                    return interfaceC3279c.mo23f(abstractC2674q5);
                }
                AbstractC3367j.m5105j("valueVector");
                throw null;
            }
            AbstractC3367j.m5105j("valueVector");
            throw null;
        }
        return this.f14457g;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: d */
    public final long mo4250d() {
        return this.f14458h;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: e */
    public final C2664m1 mo4251e() {
        return this.f14452b;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: f */
    public final Object mo4252f() {
        return this.f14457g;
    }

    @Override // p100n.InterfaceC2644g
    /* renamed from: g */
    public final AbstractC2674q mo4253g(long j6) {
        if (!m4254h(j6)) {
            return this.f14451a.m4101i(j6, this.f14454d, this.f14455e);
        }
        return this.f14456f;
    }
}
