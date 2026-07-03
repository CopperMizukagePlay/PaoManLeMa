package p152u;

import p060h5.AbstractC1805m;
import p085l0.C2349d1;
import p160v.InterfaceC3422m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C3317e implements InterfaceC3422m {

    /* renamed from: e */
    public final C3330r f16281e;

    public /* synthetic */ C3317e(C3330r c3330r) {
        this.f16281e = c3330r;
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: a */
    public int mo4276a() {
        return this.f16281e.m5067g().f16324m;
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: d */
    public int mo4277d() {
        return ((C2349d1) this.f16281e.f16363d.f10652c).m3741g();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3422m
    /* renamed from: e */
    public int mo4278e() {
        C3326n c3326n = (C3326n) AbstractC1805m.m3053q0(this.f16281e.m5067g().f16321j);
        if (c3326n != null) {
            return c3326n.f16329a;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3422m
    /* renamed from: f */
    public float mo4279f(int i7) {
        Object obj;
        C3325m m5067g = this.f16281e.m5067g();
        if (m5067g.f16321j.isEmpty()) {
            return 0.0f;
        }
        ?? r12 = m5067g.f16321j;
        int size = r12.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                obj = r12.get(i8);
                if (((C3326n) obj).f16329a == i7) {
                    break;
                }
                i8++;
            } else {
                obj = null;
                break;
            }
        }
        if (((C3326n) obj) == null) {
            int size2 = r12.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                i9 += ((C3326n) r12.get(i10)).f16342n;
            }
            return ((i7 - mo4282i()) * ((i9 / r12.size()) + m5067g.f16327p)) - mo4277d();
        }
        return r5.f16341m;
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: i */
    public int mo4282i() {
        return ((C2349d1) this.f16281e.f16363d.f10651b).m3741g();
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: j */
    public void mo4283j(int i7) {
        this.f16281e.m5069j(i7);
    }
}
