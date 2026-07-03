package p100n;

import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.f0 */
/* loaded from: classes.dex */
public final class C2642f0 implements InterfaceC2390n2 {

    /* renamed from: e */
    public Number f14296e;

    /* renamed from: f */
    public Number f14297f;

    /* renamed from: g */
    public final C2664m1 f14298g;

    /* renamed from: h */
    public final C2361g1 f14299h;

    /* renamed from: i */
    public C2700z0 f14300i;

    /* renamed from: j */
    public boolean f14301j;

    /* renamed from: k */
    public boolean f14302k;

    /* renamed from: l */
    public long f14303l;

    /* renamed from: m */
    public final /* synthetic */ C2648h0 f14304m;

    public C2642f0(C2648h0 c2648h0, Number number, Number number2, C2664m1 c2664m1, C2639e0 c2639e0) {
        this.f14304m = c2648h0;
        this.f14296e = number;
        this.f14297f = number2;
        this.f14298g = c2664m1;
        this.f14299h = AbstractC2418w.m3980x(number);
        this.f14300i = new C2700z0(c2639e0, c2664m1, this.f14296e, this.f14297f, null);
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return this.f14299h.getValue();
    }
}
