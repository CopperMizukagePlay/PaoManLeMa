package p107o;

import p001a0.C0005b;
import p001a0.C0068q2;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2352e0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p122q.C2927n;
import p122q.InterfaceC2914i1;
import p137s.C3081j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.p1 */
/* loaded from: classes.dex */
public final class C2769p1 implements InterfaceC2914i1 {

    /* renamed from: i */
    public static final C0068q2 f14744i = new C0068q2(22, C2763n1.f14729f, C2755l.f14705k);

    /* renamed from: a */
    public final C2349d1 f14745a;

    /* renamed from: e */
    public float f14749e;

    /* renamed from: b */
    public final C2349d1 f14746b = new C2349d1(0);

    /* renamed from: c */
    public final C3081j f14747c = new C3081j();

    /* renamed from: d */
    public final C2349d1 f14748d = new C2349d1(Integer.MAX_VALUE);

    /* renamed from: f */
    public final C2927n f14750f = new C2927n(new C0005b(19, this));

    /* renamed from: g */
    public final C2352e0 f14751g = AbstractC2418w.m3974q(new C2766o1(this, 1));

    /* renamed from: h */
    public final C2352e0 f14752h = AbstractC2418w.m3974q(new C2766o1(this, 0));

    public C2769p1(int i7) {
        this.f14745a = new C2349d1(i7);
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: a */
    public final Object mo112a(EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        Object mo112a = this.f14750f.mo112a(enumC2788y0, interfaceC3281e, abstractC2583c);
        if (mo112a == EnumC2465a.f13750e) {
            return mo112a;
        }
        return C1694m.f10482a;
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: b */
    public final boolean mo113b() {
        return ((Boolean) this.f14752h.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: c */
    public final boolean mo114c() {
        return this.f14750f.mo114c();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: d */
    public final boolean mo115d() {
        return ((Boolean) this.f14751g.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: e */
    public final float mo116e(float f7) {
        return this.f14750f.mo116e(f7);
    }
}
