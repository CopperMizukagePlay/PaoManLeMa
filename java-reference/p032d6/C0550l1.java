package p032d6;

import java.util.concurrent.CancellationException;
import p001a0.C0098z1;
import p082k5.AbstractC2311a;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.l1 */
/* loaded from: classes.dex */
public final class C0550l1 extends AbstractC2311a implements InterfaceC0520b1 {

    /* renamed from: f */
    public static final C0550l1 f1899f = new AbstractC2311a(C0584x.f1939f);

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: b */
    public final boolean mo1113b() {
        return true;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: o */
    public final InterfaceC0557o mo1115o(C0541i1 c0541i1) {
        return C0553m1.f1901e;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: s */
    public final Object mo1116s(AbstractC2583c abstractC2583c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p032d6.InterfaceC0520b1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: u */
    public final InterfaceC0552m0 mo1117u(boolean z7, boolean z8, C0098z1 c0098z1) {
        return C0553m1.f1901e;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: w */
    public final CancellationException mo1118w() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: y */
    public final InterfaceC0552m0 mo1119y(InterfaceC3279c interfaceC3279c) {
        return C0553m1.f1901e;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: c */
    public final void mo1114c(CancellationException cancellationException) {
    }
}
