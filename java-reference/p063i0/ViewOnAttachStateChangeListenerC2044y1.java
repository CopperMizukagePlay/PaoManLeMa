package p063i0;

import android.view.View;
import android.view.ViewTreeObserver;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.y1 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2044y1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    public boolean f12166e;

    /* renamed from: f */
    public final /* synthetic */ View f12167f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f12168g;

    public ViewOnAttachStateChangeListenerC2044y1(View view, InterfaceC3277a interfaceC3277a) {
        this.f12167f = view;
        this.f12168g = interfaceC3277a;
        view.addOnAttachStateChangeListener(this);
        if (!this.f12166e && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f12166e = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12168g.mo52a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.f12166e) {
            View view2 = this.f12167f;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.f12166e = true;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!this.f12166e) {
            return;
        }
        this.f12167f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f12166e = false;
    }
}
