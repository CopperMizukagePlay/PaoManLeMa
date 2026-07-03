package p146t1;

import java.util.List;
import java.util.Map;
import p060h5.C1813u;
import p077k.C2194h0;
import p101n0.C2702b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p162v1.C3502g0;
import p162v1.C3553x0;
import p162v1.EnumC3489c0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.z */
/* loaded from: classes.dex */
public final class C3246z implements InterfaceC3203g1, InterfaceC3223n0 {

    /* renamed from: e */
    public final /* synthetic */ C3190c0 f16066e;

    /* renamed from: f */
    public final /* synthetic */ C3205h0 f16067f;

    public C3246z(C3205h0 c3205h0) {
        this.f16067f = c3205h0;
        this.f16066e = c3205h0.f15965l;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f16066e.mo4511H(j6);
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: I */
    public final InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        return this.f16066e.mo4887I(i7, i8, map, interfaceC3279c, interfaceC3279c2);
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: K */
    public final InterfaceC3220m0 mo4941K(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c) {
        return this.f16066e.mo4887I(i7, i8, map, null, interfaceC3279c);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f16066e.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f16066e.mo4513Q(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f16066e.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16066e.f15931f;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f16066e.mo4518f0(j6);
    }

    @Override // p146t1.InterfaceC3203g1
    /* renamed from: g0 */
    public final List mo4888g0(Object obj, InterfaceC3281e interfaceC3281e) {
        C3184a0 c3184a0;
        C3205h0 c3205h0 = this.f16067f;
        C3502g0 c3502g0 = c3205h0.f15958e;
        C3502g0 c3502g02 = (C3502g0) c3205h0.f15964k.m3592g(obj);
        if (c3502g02 != null && ((C2702b) c3502g0.m5441o()).f14511e.m4307i(c3502g02) < c3205h0.f15961h) {
            return c3502g02.m5439m();
        }
        C2194h0 c2194h0 = c3205h0.f15967n;
        C2705e c2705e = c3205h0.f15970q;
        if (c2705e.f14519g < c3205h0.f15962i) {
            AbstractC3088a.m4749a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i7 = c2705e.f14519g;
        int i8 = c3205h0.f15962i;
        if (i7 == i8) {
            c2705e.m4300b(obj);
        } else {
            Object[] objArr = c2705e.f14517e;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
        }
        c3205h0.f15962i++;
        if (!c2194h0.m3587b(obj)) {
            c3205h0.f15969p.m3598m(obj, c3205h0.m4909f(obj, interfaceC3281e));
            if (c3502g0.f16873J.f16941d == EnumC3489c0.f16793g) {
                c3502g0.m5419V(true);
            } else {
                C3502g0.m5395W(c3502g0, true, 6);
            }
        } else {
            C3502g0 c3502g03 = (C3502g0) c2194h0.m3592g(obj);
            if (c3502g03 != null) {
                c3184a0 = (C3184a0) c3205h0.f15963j.m3592g(c3502g03);
            } else {
                c3184a0 = null;
            }
            if (c3184a0 != null && c3184a0.f15911d) {
                c3205h0.m4911h(c3502g03, obj, interfaceC3281e);
            }
        }
        C3502g0 c3502g04 = (C3502g0) c2194h0.m3592g(obj);
        if (c3502g04 != null) {
            List m5530s0 = c3502g04.f16873J.f16953p.m5530s0();
            C2702b c2702b = (C2702b) m5530s0;
            int i9 = c2702b.f14511e.f14519g;
            for (int i10 = 0; i10 < i9; i10++) {
                ((C3553x0) c2702b.get(i10)).f17086j.f16939b = true;
            }
            return m5530s0;
        }
        return C1813u.f10860e;
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f16066e.f15930e;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16066e.f15932g;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f16066e.mo4521n0(f7);
    }

    @Override // p146t1.InterfaceC3228q
    /* renamed from: s */
    public final boolean mo4889s() {
        return this.f16066e.mo4889s();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f16066e.mo4522t0(i7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f16066e.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return f7 / this.f16066e.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f16066e.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f16066e.mo559b() * f7;
    }
}
