package p122q;

import p001a0.C0070r0;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p107o.C2727b1;
import p107o.EnumC2788y0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.n */
/* loaded from: classes.dex */
public final class C2927n implements InterfaceC2914i1 {

    /* renamed from: a */
    public final AbstractC3368k f15220a;

    /* renamed from: b */
    public final C2924m f15221b = new C2924m(this);

    /* renamed from: c */
    public final C2727b1 f15222c = new C2727b1();

    /* renamed from: d */
    public final C2361g1 f15223d;

    /* renamed from: e */
    public final C2361g1 f15224e;

    /* renamed from: f */
    public final C2361g1 f15225f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2927n(InterfaceC3279c interfaceC3279c) {
        this.f15220a = (AbstractC3368k) interfaceC3279c;
        Boolean bool = Boolean.FALSE;
        this.f15223d = AbstractC2418w.m3980x(bool);
        this.f15224e = AbstractC2418w.m3980x(bool);
        this.f15225f = AbstractC2418w.m3980x(bool);
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: a */
    public final Object mo112a(EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        Object m1130h = AbstractC0525d0.m1130h(new C0070r0(this, enumC2788y0, interfaceC3281e, null, 24), abstractC2583c);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: c */
    public final boolean mo114c() {
        return ((Boolean) this.f15223d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.c, u5.k] */
    @Override // p122q.InterfaceC2914i1
    /* renamed from: e */
    public final float mo116e(float f7) {
        return ((Number) this.f15220a.mo23f(Float.valueOf(f7))).floatValue();
    }
}
