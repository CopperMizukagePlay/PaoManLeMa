package p051g3;

import android.os.Build;
import android.view.animation.Interpolator;
import p039e5.AbstractC1413x0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.d0 */
/* loaded from: classes.dex */
public final class C1628d0 {

    /* renamed from: a */
    public AbstractC1625c0 f10375a;

    public C1628d0(int i7, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10375a = new C1622b0(AbstractC1413x0.m2405l(i7, interpolator, j6));
        } else {
            this.f10375a = new AbstractC1625c0(i7, interpolator, j6);
        }
    }
}
