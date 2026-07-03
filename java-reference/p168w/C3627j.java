package p168w;

import p060h5.AbstractC1805m;
import p160v.InterfaceC3434s;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.j */
/* loaded from: classes.dex */
public final class C3627j implements InterfaceC3434s {

    /* renamed from: a */
    public final AbstractC3642y f17316a;

    /* renamed from: b */
    public final int f17317b;

    public C3627j(AbstractC3642y abstractC3642y, int i7) {
        this.f17316a = abstractC3642y;
        this.f17317b = i7;
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: a */
    public final int mo5046a() {
        return this.f17316a.mo5600k();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3434s
    /* renamed from: b */
    public final int mo5047b() {
        return Math.min(r0.mo5600k() - 1, ((C3625h) AbstractC1805m.m3052p0(this.f17316a.m5609j().f17357a)).f17302a + this.f17317b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // p160v.InterfaceC3434s
    /* renamed from: c */
    public final boolean mo5048c() {
        return !this.f17316a.m5609j().f17357a.isEmpty();
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: d */
    public final void mo5049d() {
        C3502g0 c3502g0 = (C3502g0) this.f17316a.f17416w.getValue();
        if (c3502g0 != null) {
            c3502g0.m5437k();
        }
    }

    @Override // p160v.InterfaceC3434s
    /* renamed from: e */
    public final int mo5050e() {
        return Math.max(0, this.f17316a.f17397d - this.f17317b);
    }
}
