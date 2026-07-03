package p051g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.w */
/* loaded from: classes.dex */
public final class C1665w extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1628d0 f10437a;

    /* renamed from: b */
    public final /* synthetic */ View f10438b;

    public C1665w(View view, C1628d0 c1628d0) {
        this.f10437a = c1628d0;
        this.f10438b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1628d0 c1628d0 = this.f10437a;
        c1628d0.f10375a.mo2637e(1.0f);
        C1671z.m2734f(this.f10438b, c1628d0);
    }
}
