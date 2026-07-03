package p152u;

import p060h5.AbstractC1805m;
import p085l0.C2349d1;
import p160v.InterfaceC3434s;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.f */
/* loaded from: classes.dex */
public final class C3318f implements InterfaceC3434s {

    /* renamed from: a */
    public final C3330r f16282a;

    public C3318f(C3330r c3330r) {
        this.f16282a = c3330r;
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: a */
    public final int mo5046a() {
        return this.f16282a.m5067g().f16324m;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3434s
    /* renamed from: b */
    public final int mo5047b() {
        return Math.min(mo5046a() - 1, ((C3326n) AbstractC1805m.m3052p0(this.f16282a.m5067g().f16321j)).f16329a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // p160v.InterfaceC3434s
    /* renamed from: c */
    public final boolean mo5048c() {
        return !this.f16282a.m5067g().f16321j.isEmpty();
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: d */
    public final void mo5049d() {
        C3502g0 c3502g0 = this.f16282a.f16370k;
        if (c3502g0 != null) {
            c3502g0.m5437k();
        }
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: e */
    public final int mo5050e() {
        return Math.max(0, ((C2349d1) this.f16282a.f16363d.f10651b).m3741g());
    }
}
