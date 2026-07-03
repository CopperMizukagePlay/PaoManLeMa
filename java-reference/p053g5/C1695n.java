package p053g5;

import java.io.Serializable;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.n */
/* loaded from: classes.dex */
public final class C1695n implements InterfaceC1685d, Serializable {

    /* renamed from: e */
    public InterfaceC3277a f10483e;

    /* renamed from: f */
    public Object f10484f;

    @Override // p053g5.InterfaceC1685d
    public final Object getValue() {
        if (this.f10484f == C1693l.f10481a) {
            InterfaceC3277a interfaceC3277a = this.f10483e;
            AbstractC3367j.m5097b(interfaceC3277a);
            this.f10484f = interfaceC3277a.mo52a();
            this.f10483e = null;
        }
        return this.f10484f;
    }

    public final String toString() {
        if (this.f10484f != C1693l.f10481a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
