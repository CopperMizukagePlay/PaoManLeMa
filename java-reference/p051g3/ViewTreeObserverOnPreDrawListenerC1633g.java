package p051g3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.g */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1633g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e */
    public final View f10384e;

    /* renamed from: f */
    public ViewTreeObserver f10385f;

    /* renamed from: g */
    public final RunnableC1667x f10386g;

    public ViewTreeObserverOnPreDrawListenerC1633g(View view, RunnableC1667x runnableC1667x) {
        this.f10384e = view;
        this.f10385f = view.getViewTreeObserver();
        this.f10386g = runnableC1667x;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f10385f.isAlive();
        View view = this.f10384e;
        if (isAlive) {
            this.f10385f.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f10386g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10385f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f10385f.isAlive();
        View view2 = this.f10384e;
        if (isAlive) {
            this.f10385f.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
