package p051g3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.v */
/* loaded from: classes.dex */
public final class C1663v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1628d0 f10430a;

    /* renamed from: b */
    public final /* synthetic */ C1672z0 f10431b;

    /* renamed from: c */
    public final /* synthetic */ C1672z0 f10432c;

    /* renamed from: d */
    public final /* synthetic */ int f10433d;

    /* renamed from: e */
    public final /* synthetic */ View f10434e;

    public C1663v(C1628d0 c1628d0, C1672z0 c1672z0, C1672z0 c1672z02, int i7, View view) {
        this.f10430a = c1628d0;
        this.f10431b = c1672z0;
        this.f10432c = c1672z02;
        this.f10433d = i7;
        this.f10434e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC1644l0 c1630e0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1628d0 c1628d0 = this.f10430a;
        AbstractC1625c0 abstractC1625c0 = c1628d0.f10375a;
        abstractC1625c0.mo2637e(animatedFraction);
        C1672z0 c1672z0 = this.f10431b;
        C1664v0 c1664v0 = c1672z0.f10450a;
        float mo2635c = abstractC1625c0.mo2635c();
        PathInterpolator pathInterpolator = C1671z.f10445e;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 36) {
            c1630e0 = new C1642k0(c1672z0);
        } else if (i7 >= 35) {
            c1630e0 = new C1640j0(c1672z0);
        } else if (i7 >= 34) {
            c1630e0 = new C1638i0(c1672z0);
        } else if (i7 >= 31) {
            c1630e0 = new C1636h0(c1672z0);
        } else if (i7 >= 30) {
            c1630e0 = new C1634g0(c1672z0);
        } else if (i7 >= 29) {
            c1630e0 = new C1632f0(c1672z0);
        } else {
            c1630e0 = new C1630e0(c1672z0);
        }
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((this.f10433d & i8) == 0) {
                c1630e0.mo2648d(i8, c1664v0.mo2671i(i8));
            } else {
                C0274b mo2671i = c1664v0.mo2671i(i8);
                C0274b mo2671i2 = this.f10432c.f10450a.mo2671i(i8);
                float f7 = 1.0f - mo2635c;
                c1630e0.mo2648d(i8, C1672z0.m2740a(mo2671i, (int) (((mo2671i.f1015a - mo2671i2.f1015a) * f7) + 0.5d), (int) (((mo2671i.f1016b - mo2671i2.f1016b) * f7) + 0.5d), (int) (((mo2671i.f1017c - mo2671i2.f1017c) * f7) + 0.5d), (int) (((mo2671i.f1018d - mo2671i2.f1018d) * f7) + 0.5d)));
            }
        }
        C1671z.m2736h(this.f10434e, c1630e0.mo2641b(), Collections.singletonList(c1628d0));
    }
}
