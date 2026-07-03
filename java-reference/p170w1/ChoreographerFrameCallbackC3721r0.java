package p170w1;

import android.view.Choreographer;
import p032d6.C0548l;
import p060h5.AbstractC1793a0;
import p085l0.C2369i1;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.r0 */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC3721r0 implements Choreographer.FrameCallback {

    /* renamed from: e */
    public final /* synthetic */ C0548l f17683e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f17684f;

    public ChoreographerFrameCallbackC3721r0(C0548l c0548l, C2369i1 c2369i1, InterfaceC3279c interfaceC3279c) {
        this.f17683e = c0548l;
        this.f17684f = interfaceC3279c;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        Object m2985m;
        try {
            m2985m = this.f17684f.mo23f(Long.valueOf(j6));
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        this.f17683e.mo663n(m2985m);
    }
}
