package p100n;

import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2353e1;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.d1 */
/* loaded from: classes.dex */
public final class C2637d1 implements InterfaceC2390n2 {

    /* renamed from: e */
    public final C2664m1 f14272e;

    /* renamed from: f */
    public final C2361g1 f14273f;

    /* renamed from: g */
    public final C2361g1 f14274g;

    /* renamed from: h */
    public final C2361g1 f14275h;

    /* renamed from: i */
    public final C2361g1 f14276i;

    /* renamed from: j */
    public final C2345c1 f14277j;

    /* renamed from: k */
    public boolean f14278k;

    /* renamed from: l */
    public final C2361g1 f14279l;

    /* renamed from: m */
    public AbstractC2674q f14280m;

    /* renamed from: n */
    public final C2353e1 f14281n;

    /* renamed from: o */
    public boolean f14282o;

    /* renamed from: p */
    public final C2675q0 f14283p;

    /* renamed from: q */
    public final /* synthetic */ C2643f1 f14284q;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map, java.lang.Object] */
    public C2637d1(C2643f1 c2643f1, Object obj, AbstractC2674q abstractC2674q, C2664m1 c2664m1) {
        this.f14284q = c2643f1;
        this.f14272e = c2664m1;
        C2361g1 m3980x = AbstractC2418w.m3980x(obj);
        this.f14273f = m3980x;
        Object obj2 = null;
        this.f14274g = AbstractC2418w.m3980x(AbstractC2638e.m4231q(7, null));
        this.f14275h = AbstractC2418w.m3980x(new C2700z0(m4210b(), c2664m1, obj, m3980x.getValue(), abstractC2674q));
        this.f14276i = AbstractC2418w.m3980x(Boolean.TRUE);
        this.f14277j = new C2345c1(-1.0f);
        this.f14279l = AbstractC2418w.m3980x(obj);
        this.f14280m = abstractC2674q;
        this.f14281n = new C2353e1(m4209a().mo4250d());
        Float f7 = (Float) AbstractC2694w1.f14470a.get(c2664m1);
        if (f7 != null) {
            float floatValue = f7.floatValue();
            AbstractC2674q abstractC2674q2 = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
            int mo4267b = abstractC2674q2.mo4267b();
            for (int i7 = 0; i7 < mo4267b; i7++) {
                abstractC2674q2.mo4270e(floatValue, i7);
            }
            obj2 = this.f14272e.f14362b.mo23f(abstractC2674q2);
        }
        this.f14283p = AbstractC2638e.m4231q(3, obj2);
    }

    /* renamed from: a */
    public final C2700z0 m4209a() {
        return (C2700z0) this.f14275h.getValue();
    }

    /* renamed from: b */
    public final InterfaceC2627a0 m4210b() {
        return (InterfaceC2627a0) this.f14274g.getValue();
    }

    /* renamed from: c */
    public final void m4211c() {
        if (this.f14277j.m3729g() == -1.0f) {
            this.f14282o = true;
            boolean m5096a = AbstractC3367j.m5096a(m4209a().f14503c, m4209a().f14504d);
            C2361g1 c2361g1 = this.f14279l;
            if (m5096a) {
                c2361g1.setValue(m4209a().f14503c);
            } else {
                c2361g1.setValue(m4209a().mo4249c(0L));
                this.f14280m = m4209a().mo4253g(0L);
            }
        }
    }

    /* renamed from: e */
    public final void m4212e(Object obj, boolean z7) {
        InterfaceC2627a0 m4210b;
        InterfaceC2656k c2678r0;
        C2643f1 c2643f1 = this.f14284q;
        C2361g1 c2361g1 = c2643f1.f14312h;
        C2361g1 c2361g12 = this.f14273f;
        boolean m5096a = AbstractC3367j.m5096a(null, c2361g12.getValue());
        C2353e1 c2353e1 = this.f14281n;
        C2361g1 c2361g13 = this.f14275h;
        if (m5096a) {
            c2361g13.setValue(new C2700z0(this.f14283p, this.f14272e, obj, obj, this.f14280m.mo4268c()));
            this.f14278k = true;
            c2353e1.m3794h(m4209a().mo4250d());
            return;
        }
        if (z7 && !this.f14282o) {
            if (m4210b() instanceof C2675q0) {
                m4210b = m4210b();
            } else {
                m4210b = this.f14283p;
            }
        } else {
            m4210b = m4210b();
        }
        long j6 = 0;
        if (c2643f1.m4240e() <= 0) {
            c2678r0 = m4210b;
        } else {
            c2678r0 = new C2678r0(m4210b, c2643f1.m4240e());
        }
        c2361g13.setValue(new C2700z0(c2678r0, this.f14272e, obj, c2361g12.getValue(), this.f14280m));
        c2353e1.m3794h(m4209a().mo4250d());
        this.f14278k = false;
        c2361g1.setValue(Boolean.TRUE);
        if (c2643f1.m4242g()) {
            C3469p c3469p = c2643f1.f14313i;
            int size = c3469p.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2637d1 c2637d1 = (C2637d1) c3469p.get(i7);
                j6 = Math.max(j6, c2637d1.f14281n.m3793g());
                c2637d1.m4211c();
            }
            c2361g1.setValue(Boolean.FALSE);
        }
    }

    /* renamed from: f */
    public final void m4213f(Object obj, Object obj2, InterfaceC2627a0 interfaceC2627a0) {
        this.f14273f.setValue(obj2);
        this.f14274g.setValue(interfaceC2627a0);
        if (AbstractC3367j.m5096a(m4209a().f14504d, obj) && AbstractC3367j.m5096a(m4209a().f14503c, obj2)) {
            return;
        }
        m4212e(obj, false);
    }

    /* renamed from: g */
    public final void m4214g(Object obj, InterfaceC2627a0 interfaceC2627a0) {
        Object value;
        if (!this.f14278k || !AbstractC3367j.m5096a(obj, null)) {
            C2361g1 c2361g1 = this.f14273f;
            boolean m5096a = AbstractC3367j.m5096a(c2361g1.getValue(), obj);
            C2345c1 c2345c1 = this.f14277j;
            if (m5096a && c2345c1.m3729g() == -1.0f) {
                return;
            }
            c2361g1.setValue(obj);
            this.f14274g.setValue(interfaceC2627a0);
            float m3729g = c2345c1.m3729g();
            C2361g1 c2361g12 = this.f14279l;
            if (m3729g == -3.0f) {
                value = obj;
            } else {
                value = c2361g12.getValue();
            }
            C2361g1 c2361g13 = this.f14276i;
            boolean z7 = true;
            m4212e(value, !((Boolean) c2361g13.getValue()).booleanValue());
            if (c2345c1.m3729g() != -3.0f) {
                z7 = false;
            }
            c2361g13.setValue(Boolean.valueOf(z7));
            if (c2345c1.m3729g() >= 0.0f) {
                long mo4250d = m4209a().mo4250d();
                c2361g12.setValue(m4209a().mo4249c(c2345c1.m3729g() * ((float) mo4250d)));
            } else if (c2345c1.m3729g() == -3.0f) {
                c2361g12.setValue(obj);
            }
            this.f14278k = false;
            c2345c1.m3730h(-1.0f);
        }
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return this.f14279l.getValue();
    }

    public final String toString() {
        return "current value: " + this.f14279l.getValue() + ", target: " + this.f14273f.getValue() + ", spec: " + m4210b();
    }
}
