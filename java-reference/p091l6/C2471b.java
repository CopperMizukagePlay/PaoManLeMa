package p091l6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p015b6.C0310q;
import p032d6.C0545k;
import p032d6.C0548l;
import p032d6.InterfaceC0542j;
import p032d6.InterfaceC0589y1;
import p039e5.C1279sl;
import p053g5.C1694m;
import p069i6.AbstractC2104q;
import p082k5.InterfaceC2318h;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l6.b */
/* loaded from: classes.dex */
public final class C2471b implements InterfaceC0542j, InterfaceC0589y1 {

    /* renamed from: e */
    public final C0548l f13760e;

    /* renamed from: f */
    public final /* synthetic */ C2472c f13761f;

    public C2471b(C2472c c2472c, C0548l c0548l) {
        this.f13761f = c2472c;
        this.f13760e = c0548l;
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: C */
    public final void mo1197C(Object obj) {
        this.f13760e.mo1197C(obj);
    }

    @Override // p032d6.InterfaceC0589y1
    /* renamed from: a */
    public final void mo1214a(AbstractC2104q abstractC2104q, int i7) {
        this.f13760e.mo1214a(abstractC2104q, i7);
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: e */
    public final C1279sl mo1198e(Object obj, InterfaceC3282f interfaceC3282f) {
        C2472c c2472c = this.f13761f;
        C0545k c0545k = new C0545k(c2472c, this);
        C1279sl m1213H = this.f13760e.m1213H((C1694m) obj, c0545k);
        if (m1213H != null) {
            C2472c.f13762h.set(c2472c, null);
        }
        return m1213H;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f13760e.f1897i;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        this.f13760e.mo663n(obj);
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: p */
    public final boolean mo1199p(Throwable th) {
        return this.f13760e.mo1199p(th);
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: r */
    public final void mo1200r(Object obj, InterfaceC3282f interfaceC3282f) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2472c.f13762h;
        C2472c c2472c = this.f13761f;
        atomicReferenceFieldUpdater.set(c2472c, null);
        C0310q c0310q = new C0310q(19, c2472c, this);
        C0548l c0548l = this.f13760e;
        c0548l.m1211E(C1694m.f10482a, c0548l.f1892g, new C0545k(0, c0310q));
    }
}
