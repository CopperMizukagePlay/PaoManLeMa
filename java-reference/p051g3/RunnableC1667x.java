package p051g3;

import android.animation.ValueAnimator;
import android.view.View;
import p001a0.C0068q2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.x */
/* loaded from: classes.dex */
public final class RunnableC1667x implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ View f10439e;

    /* renamed from: f */
    public final /* synthetic */ C1628d0 f10440f;

    /* renamed from: g */
    public final /* synthetic */ C0068q2 f10441g;

    /* renamed from: h */
    public final /* synthetic */ ValueAnimator f10442h;

    public RunnableC1667x(View view, C1628d0 c1628d0, C0068q2 c0068q2, ValueAnimator valueAnimator) {
        this.f10439e = view;
        this.f10440f = c1628d0;
        this.f10441g = c0068q2;
        this.f10442h = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1671z.m2737i(this.f10439e, this.f10440f, this.f10441g);
        this.f10442h.start();
    }
}
