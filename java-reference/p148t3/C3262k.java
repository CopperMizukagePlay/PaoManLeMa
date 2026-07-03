package p148t3;

import android.window.OnBackInvokedCallback;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C3262k implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f16108a;

    /* renamed from: b */
    public final /* synthetic */ Object f16109b;

    public /* synthetic */ C3262k(int i7, Object obj) {
        this.f16108a = i7;
        this.f16109b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f16108a) {
            case 0:
                ((C3261j) this.f16109b).m4972a();
                return;
            default:
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f16109b;
                if (interfaceC3277a != null) {
                    interfaceC3277a.mo52a();
                    return;
                }
                return;
        }
    }
}
