package p032d6;

import java.util.concurrent.ScheduledFuture;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.h */
/* loaded from: classes.dex */
public final class C0536h implements InterfaceC0539i {

    /* renamed from: a */
    public final /* synthetic */ int f1880a;

    /* renamed from: b */
    public final Object f1881b;

    public /* synthetic */ C0536h(int i7, Object obj) {
        this.f1880a = i7;
        this.f1881b = obj;
    }

    @Override // p032d6.InterfaceC0539i
    /* renamed from: a */
    public final void mo1120a(Throwable th) {
        switch (this.f1880a) {
            case 0:
                ((ScheduledFuture) this.f1881b).cancel(false);
                return;
            case 1:
                ((InterfaceC3279c) this.f1881b).mo23f(th);
                return;
            default:
                ((InterfaceC0552m0) this.f1881b).mo1155a();
                return;
        }
    }

    public final String toString() {
        switch (this.f1880a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1881b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC3279c) this.f1881b).getClass().getSimpleName() + '@' + AbstractC0525d0.m1134l(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0552m0) this.f1881b) + ']';
        }
    }
}
