package p039e5;

import android.graphics.Insets;
import android.net.TelephonyNetworkSpecifier;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1413x0 {
    /* renamed from: i */
    public static /* bridge */ /* synthetic */ TelephonyNetworkSpecifier m2402i(Object obj) {
        return (TelephonyNetworkSpecifier) obj;
    }

    /* renamed from: k */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m2404k(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* renamed from: l */
    public static /* synthetic */ WindowInsetsAnimation m2405l(int i7, Interpolator interpolator, long j6) {
        return new WindowInsetsAnimation(i7, interpolator, j6);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m2406m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: o */
    public static /* synthetic */ void m2408o() {
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m2415v(Object obj) {
        return obj instanceof TelephonyNetworkSpecifier;
    }
}
