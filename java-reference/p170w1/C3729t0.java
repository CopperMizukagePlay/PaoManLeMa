package p170w1;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.t0 */
/* loaded from: classes.dex */
public final class C3729t0 implements InterfaceC3679g2 {

    /* renamed from: a */
    public final ViewConfiguration f17783a;

    public C3729t0(ViewConfiguration viewConfiguration) {
        this.f17783a = viewConfiguration;
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: a */
    public final float mo5676a() {
        return this.f17783a.getScaledMaximumFlingVelocity();
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: b */
    public final long mo5292b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: c */
    public final long mo5293c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: d */
    public final float mo5294d() {
        return this.f17783a.getScaledTouchSlop();
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: e */
    public final float mo5677e() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.f17783a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // p170w1.InterfaceC3679g2
    /* renamed from: f */
    public final float mo5678f() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.f17783a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
