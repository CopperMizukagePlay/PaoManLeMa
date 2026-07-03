package p170w1;

import android.view.View;
import p085l0.C2414u1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.m2 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3703m2 implements View.OnAttachStateChangeListener {

    /* renamed from: e */
    public final /* synthetic */ View f17609e;

    /* renamed from: f */
    public final /* synthetic */ C2414u1 f17610f;

    public ViewOnAttachStateChangeListenerC3703m2(View view, C2414u1 c2414u1) {
        this.f17609e = view;
        this.f17610f = c2414u1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17609e.removeOnAttachStateChangeListener(this);
        this.f17610f.m3919s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
