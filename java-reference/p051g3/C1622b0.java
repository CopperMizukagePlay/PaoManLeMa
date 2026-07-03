package p051g3;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.b0 */
/* loaded from: classes.dex */
public final class C1622b0 extends AbstractC1625c0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f10366e;

    public C1622b0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f10366e = windowInsetsAnimation;
    }

    @Override // p051g3.AbstractC1625c0
    /* renamed from: a */
    public final float mo2633a() {
        float alpha;
        alpha = this.f10366e.getAlpha();
        return alpha;
    }

    @Override // p051g3.AbstractC1625c0
    /* renamed from: b */
    public final long mo2634b() {
        long durationMillis;
        durationMillis = this.f10366e.getDurationMillis();
        return durationMillis;
    }

    @Override // p051g3.AbstractC1625c0
    /* renamed from: c */
    public final float mo2635c() {
        float interpolatedFraction;
        interpolatedFraction = this.f10366e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // p051g3.AbstractC1625c0
    /* renamed from: d */
    public final int mo2636d() {
        int typeMask;
        typeMask = this.f10366e.getTypeMask();
        return typeMask;
    }

    @Override // p051g3.AbstractC1625c0
    /* renamed from: e */
    public final void mo2637e(float f7) {
        this.f10366e.setFraction(f7);
    }
}
