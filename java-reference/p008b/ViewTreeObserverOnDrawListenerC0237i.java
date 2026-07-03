package p008b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.RunnableC0219y;
import com.paoman.lema.MainActivity;
import java.util.concurrent.Executor;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.i */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0237i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: e */
    public final long f922e = SystemClock.uptimeMillis() + 10000;

    /* renamed from: f */
    public Runnable f923f;

    /* renamed from: g */
    public boolean f924g;

    /* renamed from: h */
    public final /* synthetic */ MainActivity f925h;

    public ViewTreeObserverOnDrawListenerC0237i(MainActivity mainActivity) {
        this.f925h = mainActivity;
    }

    /* renamed from: a */
    public final void m512a(View view) {
        if (!this.f924g) {
            this.f924g = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC3367j.m5100e(runnable, "runnable");
        this.f923f = runnable;
        View decorView = this.f925h.getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        if (this.f924g) {
            if (AbstractC3367j.m5096a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new RunnableC0219y(2, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f923f;
        if (runnable != null) {
            runnable.run();
            this.f923f = null;
            C0258z c0258z = (C0258z) this.f925h.f955k.getValue();
            synchronized (c0258z.f979a) {
                z7 = c0258z.f980b;
            }
            if (z7) {
                this.f924g = false;
                this.f925h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f922e) {
            this.f924g = false;
            this.f925h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f925h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
