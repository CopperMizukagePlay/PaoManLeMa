package p107o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C2743h {

    /* renamed from: a */
    public static final C2743h f14667a = new Object();

    /* renamed from: a */
    public final EdgeEffect m4412a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public final float m4413b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float m4414c(EdgeEffect edgeEffect, float f7, float f8) {
        try {
            return edgeEffect.onPullDistance(f7, f8);
        } catch (Throwable unused) {
            edgeEffect.onPull(f7, f8);
            return 0.0f;
        }
    }
}
