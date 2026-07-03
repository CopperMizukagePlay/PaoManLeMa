package p087l2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import p164v3.RunnableC3582f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC2435b0 implements Choreographer.FrameCallback {

    /* renamed from: e */
    public final /* synthetic */ int f13663e = 1;

    /* renamed from: f */
    public final /* synthetic */ Object f13664f;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        Handler handler;
        switch (this.f13663e) {
            case 0:
                ((Runnable) this.f13664f).run();
                return;
            default:
                Context context = (Context) this.f13664f;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new RunnableC3582f(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
