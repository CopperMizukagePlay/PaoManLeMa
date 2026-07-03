package p100n;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.g0 */
/* loaded from: classes.dex */
public final class C2645g0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public /* synthetic */ float f14316i;

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2645g0) mo28k(Float.valueOf(((Number) obj).floatValue()), (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m5.j, n.g0, k5.c] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        ?? abstractC2590j = new AbstractC2590j(2, interfaceC2313c);
        abstractC2590j.f14316i = ((Number) obj).floatValue();
        return abstractC2590j;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        boolean z7;
        AbstractC1793a0.m2972L(obj);
        if (this.f14316i > 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
