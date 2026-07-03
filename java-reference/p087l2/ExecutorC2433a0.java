package p087l2;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2433a0 implements Executor {

    /* renamed from: e */
    public final /* synthetic */ Choreographer f13655e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13655e.postFrameCallback(new ChoreographerFrameCallbackC2435b0(runnable));
    }
}
