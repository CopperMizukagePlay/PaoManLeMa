package p034e0;

import p027d1.C0464b;
import p085l0.InterfaceC2390n2;
import p100n.C2665n;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.b0 */
/* loaded from: classes.dex */
public final class C0596b0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f1958f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2390n2 f1959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0596b0(InterfaceC2390n2 interfaceC2390n2, int i7) {
        super(0);
        this.f1958f = i7;
        this.f1959g = interfaceC2390n2;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f1958f;
        boolean z7 = false;
        InterfaceC2390n2 interfaceC2390n2 = this.f1959g;
        switch (i7) {
            case 0:
                return new C0464b(((C0464b) interfaceC2390n2.getValue()).f1623a);
            case 1:
                C2665n c2665n = AbstractC0602e0.f1983a;
                return new C0464b(((C0464b) interfaceC2390n2.getValue()).f1623a);
            case 2:
                return (Float) interfaceC2390n2.getValue();
            case 3:
                if (((Number) interfaceC2390n2.getValue()).floatValue() > 0.0f) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            default:
                if (((Number) interfaceC2390n2.getValue()).floatValue() > 0.0f) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
        }
    }
}
