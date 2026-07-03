package p063i0;

import p005a6.InterfaceC0110a;
import p005a6.InterfaceC0112c;
import p085l0.InterfaceC2390n2;
import p158u5.AbstractC3373p;
import p158u5.AbstractC3380w;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1990r3 extends AbstractC3373p implements InterfaceC0112c {

    /* renamed from: l */
    public final /* synthetic */ int f11721l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1990r3(Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i7, cls, obj, str, str2);
        this.f11721l = i8;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        return get();
    }

    @Override // p158u5.AbstractC3360c
    /* renamed from: e */
    public final InterfaceC0110a mo3159e() {
        AbstractC3380w.f16452a.getClass();
        return this;
    }

    @Override // p005a6.InterfaceC0112c
    public final Object get() {
        switch (this.f11721l) {
            case 0:
                return ((InterfaceC2390n2) this.f16432f).getValue();
            case 1:
                return this.f16432f.getClass().getSimpleName();
            case 2:
                return ((InterfaceC2390n2) this.f16432f).getValue();
            default:
                return ((InterfaceC2390n2) this.f16432f).getValue();
        }
    }
}
