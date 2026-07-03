package p008b;

import android.content.Intent;
import android.content.IntentSender;
import p164v3.C3577a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0241k implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f934e;

    /* renamed from: f */
    public final /* synthetic */ int f935f;

    /* renamed from: g */
    public final /* synthetic */ Object f936g;

    /* renamed from: h */
    public final /* synthetic */ Object f937h;

    public /* synthetic */ RunnableC0241k(int i7, int i8, Object obj, Object obj2) {
        this.f934e = i8;
        this.f936g = obj;
        this.f935f = i7;
        this.f937h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f934e) {
            case 0:
                ((C0243l) this.f936g).m517a(this.f935f, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f937h));
                return;
            default:
                C3577a c3577a = (C3577a) this.f936g;
                c3577a.f17187b.mo4281h(this.f935f, this.f937h);
                return;
        }
    }
}
