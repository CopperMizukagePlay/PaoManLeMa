package p001a0;

import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p098m5.AbstractC2583c;
import p107o.EnumC2788y0;
import p122q.InterfaceC2914i1;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.i2 */
/* loaded from: classes.dex */
public final class C0036i2 implements InterfaceC2914i1 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2914i1 f165a;

    /* renamed from: b */
    public final C2352e0 f166b;

    /* renamed from: c */
    public final C2352e0 f167c;

    public C0036i2(InterfaceC2914i1 interfaceC2914i1, C0048l2 c0048l2) {
        this.f165a = interfaceC2914i1;
        this.f166b = AbstractC2418w.m3974q(new C0032h2(c0048l2, 1));
        this.f167c = AbstractC2418w.m3974q(new C0032h2(c0048l2, 0));
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: a */
    public final Object mo112a(EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        return this.f165a.mo112a(enumC2788y0, interfaceC3281e, abstractC2583c);
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: b */
    public final boolean mo113b() {
        return ((Boolean) this.f167c.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: c */
    public final boolean mo114c() {
        return this.f165a.mo114c();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: d */
    public final boolean mo115d() {
        return ((Boolean) this.f166b.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: e */
    public final float mo116e(float f7) {
        return this.f165a.mo116e(f7);
    }
}
