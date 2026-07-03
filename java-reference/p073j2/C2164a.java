package p073j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.a */
/* loaded from: classes.dex */
public final class C2164a extends MetricAffectingSpan {

    /* renamed from: e */
    public final /* synthetic */ int f12569e;

    /* renamed from: f */
    public final float f12570f;

    public /* synthetic */ C2164a(float f7, int i7) {
        this.f12569e = i7;
        this.f12570f = f7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12569e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f12570f);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f12570f);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f12569e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f12570f);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f12570f);
                return;
        }
    }
}
