package p100n;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.q0 */
/* loaded from: classes.dex */
public final class C2675q0 implements InterfaceC2627a0 {

    /* renamed from: a */
    public final float f14391a;

    /* renamed from: b */
    public final float f14392b;

    /* renamed from: c */
    public final Object f14393c;

    public C2675q0(float f7, float f8, Object obj) {
        this.f14391a = f7;
        this.f14392b = f8;
        this.f14393c = obj;
    }

    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2670o1 mo4196a(C2664m1 c2664m1) {
        AbstractC2674q abstractC2674q;
        Object obj = this.f14393c;
        if (obj == null) {
            abstractC2674q = null;
        } else {
            abstractC2674q = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
        }
        return new C2673p1(this.f14391a, this.f14392b, abstractC2674q);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2675q0) {
            C2675q0 c2675q0 = (C2675q0) obj;
            if (c2675q0.f14391a == this.f14391a && c2675q0.f14392b == this.f14392b && AbstractC3367j.m5096a(c2675q0.f14393c, this.f14393c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        Object obj = this.f14393c;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return Float.hashCode(this.f14392b) + AbstractC2487d.m4038b(this.f14391a, i7 * 31, 31);
    }

    public /* synthetic */ C2675q0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
