package p096m3;

import android.os.Trace;
import p029d3.AbstractC0498e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.n */
/* loaded from: classes.dex */
public final class RunnableC2564n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = AbstractC0498e.f1779a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C2560j.m4082d()) {
                C2560j.m4081a().m4085e();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i8 = AbstractC0498e.f1779a;
            Trace.endSection();
            throw th;
        }
    }
}
