package p170w1;

import android.view.accessibility.AccessibilityEvent;
import p001a0.C0033i;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.z */
/* loaded from: classes.dex */
public final class C3748z extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17816f;

    /* renamed from: g */
    public final /* synthetic */ C3653a0 f17817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3748z(C3653a0 c3653a0, int i7) {
        super(1);
        this.f17816f = i7;
        this.f17817g = c3653a0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17816f) {
            case 0:
                C3653a0 c3653a0 = this.f17817g;
                return Boolean.valueOf(c3653a0.f17454d.getParent().requestSendAccessibilityEvent(c3653a0.f17454d, (AccessibilityEvent) obj));
            default:
                C3655a2 c3655a2 = (C3655a2) obj;
                if (c3655a2.f17478f.contains(c3655a2)) {
                    C3653a0 c3653a02 = this.f17817g;
                    c3653a02.f17454d.getSnapshotObserver().m5498a(c3655a2, c3653a02.f17453P, new C0033i(16, c3655a2, c3653a02));
                }
                return C1694m.f10482a;
        }
    }
}
