package p100n;

import p014b5.C0288b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.l1 */
/* loaded from: classes.dex */
public final class C2661l1 implements InterfaceC2695x {

    /* renamed from: a */
    public final int f14355a;

    /* renamed from: b */
    public final int f14356b;

    /* renamed from: c */
    public final InterfaceC2697y f14357c;

    public C2661l1(int i7, InterfaceC2697y interfaceC2697y, int i8) {
        this(i7, 0, (i8 & 4) != 0 ? AbstractC2699z.f14497a : interfaceC2697y);
    }

    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2670o1 mo4196a(C2664m1 c2664m1) {
        return new C0288b(this.f14355a, this.f14356b, this.f14357c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2661l1) {
            C2661l1 c2661l1 = (C2661l1) obj;
            if (c2661l1.f14355a == this.f14355a && c2661l1.f14356b == this.f14356b && AbstractC3367j.m5096a(c2661l1.f14357c, this.f14357c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14357c.hashCode() + (this.f14355a * 31)) * 31) + this.f14356b;
    }

    @Override // p100n.InterfaceC2695x, p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2676q1 mo4196a(C2664m1 c2664m1) {
        return new C0288b(this.f14355a, this.f14356b, this.f14357c);
    }

    public C2661l1(int i7, int i8, InterfaceC2697y interfaceC2697y) {
        this.f14355a = i7;
        this.f14356b = i8;
        this.f14357c = interfaceC2697y;
    }
}
