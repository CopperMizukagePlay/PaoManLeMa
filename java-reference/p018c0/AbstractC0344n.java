package p018c0;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.window.BackEvent;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.n */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0344n {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ float m729a(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ int m734f(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* renamed from: k */
    public static /* synthetic */ GraphemeClusterSegmentFinder m739k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ SegmentFinder m740l(Object obj) {
        return (SegmentFinder) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ HandwritingGesture m741m(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ SelectGesture m742n(Object obj) {
        return (SelectGesture) obj;
    }

    /* renamed from: p */
    public static /* synthetic */ void m744p() {
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m745q(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ float m747s(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ float m752x(BackEvent backEvent) {
        return backEvent.getProgress();
    }
}
