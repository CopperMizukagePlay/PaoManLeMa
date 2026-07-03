package p073j2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.b */
/* loaded from: classes.dex */
public final class C2165b extends MetricAffectingSpan {

    /* renamed from: e */
    public final /* synthetic */ int f12571e;

    /* renamed from: f */
    public final Object f12572f;

    public /* synthetic */ C2165b(int i7, Object obj) {
        this.f12571e = i7;
        this.f12572f = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12571e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f12572f);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f12572f);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f12571e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f12572f);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f12572f);
                return;
        }
    }
}
