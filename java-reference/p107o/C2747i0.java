package p107o;

import android.content.Context;
import android.widget.EdgeEffect;
import p066i3.AbstractC2067b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.i0 */
/* loaded from: classes.dex */
public final class C2747i0 extends EdgeEffect {

    /* renamed from: a */
    public final float f14674a;

    /* renamed from: b */
    public float f14675b;

    public C2747i0(Context context) {
        super(context);
        this.f14674a = AbstractC2067b.m3277b(context).f15690e * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f14675b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7, float f8) {
        this.f14675b = 0.0f;
        super.onPull(f7, f8);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f14675b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7) {
        this.f14675b = 0.0f;
        super.onPull(f7);
    }
}
