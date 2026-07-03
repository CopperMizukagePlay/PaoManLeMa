package p018c0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p001a0.C0043k1;
import p008b.RunnableC0239j;
import p034e0.C0622o0;
import p150t5.InterfaceC3279c;
import p170w1.InterfaceC3679g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.f */
/* loaded from: classes.dex */
public final class C0336f {

    /* renamed from: a */
    public static final C0336f f1157a = new Object();

    /* renamed from: a */
    public final void m693a(C0043k1 c0043k1, C0622o0 c0622o0, HandwritingGesture handwritingGesture, InterfaceC3679g2 interfaceC3679g2, Executor executor, IntConsumer intConsumer, InterfaceC3279c interfaceC3279c) {
        int i7;
        if (c0043k1 != null) {
            i7 = C0347q.f1167a.m784i(c0043k1, handwritingGesture, c0622o0, interfaceC3679g2, interfaceC3279c);
        } else {
            i7 = 3;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC0239j(intConsumer, i7));
        } else {
            intConsumer.accept(i7);
        }
    }

    /* renamed from: b */
    public final boolean m694b(C0043k1 c0043k1, C0622o0 c0622o0, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (c0043k1 != null) {
            return C0347q.f1167a.m782A(c0043k1, previewableHandwritingGesture, c0622o0, cancellationSignal);
        }
        return false;
    }
}
