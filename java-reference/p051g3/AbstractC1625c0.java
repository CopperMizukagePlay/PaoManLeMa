package p051g3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC1625c0 {

    /* renamed from: a */
    public final int f10368a;

    /* renamed from: b */
    public float f10369b;

    /* renamed from: c */
    public final Interpolator f10370c;

    /* renamed from: d */
    public final long f10371d;

    public AbstractC1625c0(int i7, Interpolator interpolator, long j6) {
        this.f10368a = i7;
        this.f10370c = interpolator;
        this.f10371d = j6;
    }

    /* renamed from: a */
    public float mo2633a() {
        return 1.0f;
    }

    /* renamed from: b */
    public long mo2634b() {
        return this.f10371d;
    }

    /* renamed from: c */
    public float mo2635c() {
        Interpolator interpolator = this.f10370c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f10369b);
        }
        return this.f10369b;
    }

    /* renamed from: d */
    public int mo2636d() {
        return this.f10368a;
    }

    /* renamed from: e */
    public void mo2637e(float f7) {
        this.f10369b = f7;
    }
}
