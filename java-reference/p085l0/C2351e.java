package p085l0;

import java.util.concurrent.atomic.AtomicInteger;
import p008b.C0226c0;
import p032d6.C0548l;
import p039e5.C0737ba;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p068i5.AbstractC2080d;
import p077k.C2184c0;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p098m5.AbstractC2583c;
import p145t0.C3170a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.e */
/* loaded from: classes.dex */
public final class C2351e implements InterfaceC2416v0 {

    /* renamed from: e */
    public final C0226c0 f13383e;

    /* renamed from: g */
    public Throwable f13385g;

    /* renamed from: f */
    public final Object f13384f = new Object();

    /* renamed from: h */
    public final C3170a f13386h = new AtomicInteger(0);

    /* renamed from: i */
    public C2184c0 f13387i = new C2184c0();

    /* renamed from: j */
    public C2184c0 f13388j = new C2184c0();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, t0.a] */
    public C2351e(C0226c0 c0226c0) {
        this.f13383e = c0226c0;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        return interfaceC3281e.mo22d(obj, this);
    }

    /* renamed from: a */
    public final void m3789a(long j6) {
        int i7;
        C0548l c0548l;
        Object m2985m;
        synchronized (this.f13384f) {
            try {
                C2184c0 c2184c0 = this.f13387i;
                this.f13387i = this.f13388j;
                this.f13388j = c2184c0;
                C3170a c3170a = this.f13386h;
                do {
                    i7 = c3170a.get();
                } while (!c3170a.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
                int i8 = c2184c0.f12629b;
                for (int i9 = 0; i9 < i8; i9++) {
                    C2347d c2347d = (C2347d) c2184c0.m3560e(i9);
                    InterfaceC3279c interfaceC3279c = c2347d.f13350a;
                    if (interfaceC3279c != null && (c0548l = c2347d.f13351b) != null) {
                        try {
                            m2985m = interfaceC3279c.mo23f(Long.valueOf(j6));
                        } catch (Throwable th) {
                            m2985m = AbstractC1793a0.m2985m(th);
                        }
                        c0548l.mo663n(m2985m);
                    }
                }
                c2184c0.m3558c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3401n(this, interfaceC2317g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, l0.d] */
    @Override // p085l0.InterfaceC2416v0
    /* renamed from: m */
    public final Object mo3790m(InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        int i7;
        int i8;
        boolean z7;
        int i9;
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(abstractC2583c));
        c0548l.m1222u();
        ?? obj = new Object();
        obj.f13350a = interfaceC3279c;
        obj.f13351b = c0548l;
        ?? obj2 = new Object();
        obj2.f16449e = -1;
        synchronized (this.f13384f) {
            Throwable th = this.f13385g;
            if (th != null) {
                c0548l.mo663n(AbstractC1793a0.m2985m(th));
            } else {
                C3170a c3170a = this.f13386h;
                do {
                    i7 = c3170a.get();
                    i8 = i7 + 1;
                } while (!c3170a.compareAndSet(i7, i8));
                if ((134217727 & i8) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                obj2.f16449e = (i8 >>> 27) & 15;
                this.f13387i.m3556a(obj);
                c0548l.m1224w(new C0737ba(obj, this, obj2, 2));
                if (z7) {
                    try {
                        this.f13383e.mo52a();
                    } catch (Throwable th2) {
                        synchronized (this.f13384f) {
                            try {
                                if (this.f13385g == null) {
                                    this.f13385g = th2;
                                    C2184c0 c2184c0 = this.f13387i;
                                    Object[] objArr = c2184c0.f12628a;
                                    int i10 = c2184c0.f12629b;
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        C0548l c0548l2 = ((C2347d) objArr[i11]).f13351b;
                                        if (c0548l2 != null) {
                                            c0548l2.mo663n(AbstractC1793a0.m2985m(th2));
                                        }
                                    }
                                    this.f13387i.m3558c();
                                    C3170a c3170a2 = this.f13386h;
                                    do {
                                        i9 = c3170a2.get();
                                    } while (!c3170a2.compareAndSet(i9, ((((i9 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0548l.m1221t();
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3411x(this, interfaceC2317g);
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        return AbstractC2080d.m3374B(this, interfaceC2318h);
    }
}
