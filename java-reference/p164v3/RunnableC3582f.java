package p164v3;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v3.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3582f implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f17213e;

    /* renamed from: f */
    public final /* synthetic */ Context f17214f;

    public /* synthetic */ RunnableC3582f(Context context, int i7) {
        this.f17213e = i7;
        this.f17214f = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17213e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC3582f(this.f17214f, 1));
                return;
            default:
                AbstractC3581e.m5568t(this.f17214f, new Object(), AbstractC3581e.f17203a, false);
                return;
        }
    }
}
