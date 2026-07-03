package p160v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p140s2.EnumC3103m;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.j0 */
/* loaded from: classes.dex */
public final class C3417j0 implements InterfaceC3223n0 {

    /* renamed from: e */
    public final C3409f0 f16566e;

    /* renamed from: f */
    public final InterfaceC3203g1 f16567f;

    /* renamed from: g */
    public final InterfaceC3413h0 f16568g;

    /* renamed from: h */
    public final HashMap f16569h = new HashMap();

    public C3417j0(C3409f0 c3409f0, InterfaceC3203g1 interfaceC3203g1) {
        this.f16566e = c3409f0;
        this.f16567f = interfaceC3203g1;
        this.f16568g = (InterfaceC3413h0) c3409f0.f16541b.mo52a();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f16567f.mo4511H(j6);
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: I */
    public final InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        return this.f16567f.mo4887I(i7, i8, map, interfaceC3279c, interfaceC3279c2);
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: K */
    public final InterfaceC3220m0 mo4941K(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c) {
        return this.f16567f.mo4941K(i7, i8, map, interfaceC3279c);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f16567f.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f16567f.mo4513Q(f7);
    }

    /* renamed from: a */
    public final List m5178a(int i7, long j6) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f16569h;
        List list = (List) hashMap.get(valueOf);
        if (list != null) {
            return list;
        }
        InterfaceC3413h0 interfaceC3413h0 = this.f16568g;
        Object mo5057c = interfaceC3413h0.mo5057c(i7);
        List mo4888g0 = this.f16567f.mo4888g0(mo5057c, this.f16566e.m5176a(i7, mo5057c, interfaceC3413h0.mo5058d(i7)));
        int size = mo4888g0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((InterfaceC3214k0) mo4888g0.get(i8)).mo4918e(j6));
        }
        hashMap.put(Integer.valueOf(i7), arrayList);
        return arrayList;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f16567f.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16567f.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f16567f.mo4518f0(j6);
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f16567f.getLayoutDirection();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16567f.mo560l();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f16567f.mo4521n0(f7);
    }

    @Override // p146t1.InterfaceC3228q
    /* renamed from: s */
    public final boolean mo4889s() {
        return this.f16567f.mo4889s();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f16567f.mo4522t0(i7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f16567f.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return this.f16567f.mo4524v0(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f16567f.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f16567f.mo4526y(f7);
    }
}
