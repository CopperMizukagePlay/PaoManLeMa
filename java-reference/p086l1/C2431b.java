package p086l1;

import android.view.View;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l1.b */
/* loaded from: classes.dex */
public final class C2431b implements InterfaceC2430a {

    /* renamed from: a */
    public final /* synthetic */ int f13651a;

    /* renamed from: b */
    public final View f13652b;

    public /* synthetic */ C2431b(View view, int i7) {
        this.f13651a = i7;
        this.f13652b = view;
    }

    @Override // p086l1.InterfaceC2430a
    /* renamed from: a */
    public final void mo4009a() {
        switch (this.f13651a) {
            case 0:
                ((C3728t) this.f13652b).performHapticFeedback(9);
                return;
            default:
                this.f13652b.performHapticFeedback(9);
                return;
        }
    }
}
