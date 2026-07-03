package p018c0;

import android.os.CancellationSignal;
import p001a0.C0043k1;
import p032d6.C0565q1;
import p034e0.C0622o0;
import p050g2.C1602n0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0345o implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ int f1165a;

    /* renamed from: b */
    public final /* synthetic */ Object f1166b;

    public /* synthetic */ C0345o(int i7, Object obj) {
        this.f1165a = i7;
        this.f1166b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f1165a) {
            case 0:
                C0622o0 c0622o0 = (C0622o0) this.f1166b;
                if (c0622o0 != null) {
                    C0043k1 c0043k1 = c0622o0.f2047d;
                    if (c0043k1 != null) {
                        c0043k1.m121e(C1602n0.f10302b);
                    }
                    C0043k1 c0043k12 = c0622o0.f2047d;
                    if (c0043k12 != null) {
                        c0043k12.m122f(C1602n0.f10302b);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((C0565q1) this.f1166b).mo1114c(null);
                return;
        }
    }
}
