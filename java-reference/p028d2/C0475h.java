package p028d2;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.h */
/* loaded from: classes.dex */
public final class C0475h {

    /* renamed from: a */
    public final AbstractC3368k f1653a;

    /* renamed from: b */
    public final AbstractC3368k f1654b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0475h(InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2) {
        this.f1653a = (AbstractC3368k) interfaceC3277a;
        this.f1654b = (AbstractC3368k) interfaceC3277a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.a, u5.k] */
    /* renamed from: a */
    public final InterfaceC3277a m1032a() {
        return this.f1654b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [t5.a, u5.k] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f1653a.mo52a()).floatValue() + ", maxValue=" + ((Number) this.f1654b.mo52a()).floatValue() + ", reverseScrolling=false)";
    }
}
