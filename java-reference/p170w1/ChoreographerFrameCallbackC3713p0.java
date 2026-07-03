package p170w1;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.p0 */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC3713p0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3717q0 f17658e;

    public ChoreographerFrameCallbackC3713p0(C3717q0 c3717q0) {
        this.f17658e = c3717q0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f17658e.f17666h.removeCallbacks(this);
        C3717q0.m5714M(this.f17658e);
        C3717q0 c3717q0 = this.f17658e;
        synchronized (c3717q0.f17667i) {
            if (!c3717q0.f17672n) {
                return;
            }
            c3717q0.f17672n = false;
            ArrayList arrayList = c3717q0.f17669k;
            c3717q0.f17669k = c3717q0.f17670l;
            c3717q0.f17670l = arrayList;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j6);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3717q0.m5714M(this.f17658e);
        C3717q0 c3717q0 = this.f17658e;
        synchronized (c3717q0.f17667i) {
            if (c3717q0.f17669k.isEmpty()) {
                c3717q0.f17665g.removeFrameCallback(this);
                c3717q0.f17672n = false;
            }
        }
    }
}
