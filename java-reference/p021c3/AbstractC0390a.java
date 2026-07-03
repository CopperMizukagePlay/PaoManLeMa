package p021c3;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0390a {
    /* renamed from: a */
    public static Handler m858a(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: b */
    public static List m859b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: c */
    public static int m860c(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* renamed from: d */
    public static int m861d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: e */
    public static int m862e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: f */
    public static int m863f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: g */
    public static int m864g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
