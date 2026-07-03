package p053g5;

import java.io.Serializable;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.j */
/* loaded from: classes.dex */
public final class C1691j implements InterfaceC1685d, Serializable {

    /* renamed from: e */
    public InterfaceC3277a f10475e;

    /* renamed from: f */
    public volatile Object f10476f;

    /* renamed from: g */
    public final Object f10477g;

    public C1691j(InterfaceC3277a interfaceC3277a) {
        AbstractC3367j.m5100e(interfaceC3277a, "initializer");
        this.f10475e = interfaceC3277a;
        this.f10476f = C1693l.f10481a;
        this.f10477g = this;
    }

    @Override // p053g5.InterfaceC1685d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f10476f;
        C1693l c1693l = C1693l.f10481a;
        if (obj2 != c1693l) {
            return obj2;
        }
        synchronized (this.f10477g) {
            obj = this.f10476f;
            if (obj == c1693l) {
                InterfaceC3277a interfaceC3277a = this.f10475e;
                AbstractC3367j.m5097b(interfaceC3277a);
                obj = interfaceC3277a.mo52a();
                this.f10476f = obj;
                this.f10475e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10476f != C1693l.f10481a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
