package p096m3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p104n3.C2716a;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.x */
/* loaded from: classes.dex */
public final class C2574x extends ReplacementSpan {

    /* renamed from: f */
    public final C2573w f13975f;

    /* renamed from: i */
    public TextPaint f13978i;

    /* renamed from: e */
    public final Paint.FontMetricsInt f13974e = new Paint.FontMetricsInt();

    /* renamed from: g */
    public short f13976g = -1;

    /* renamed from: h */
    public float f13977h = 1.0f;

    public C2574x(C2573w c2573w) {
        AbstractC3393k.m5139j(c2573w, "rasterizer cannot be null");
        this.f13975f = c2573w;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i7, i8, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f13978i;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f13978i = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f7, i9, f7 + this.f13976g, i11, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C2560j.m4081a().getClass();
        float f8 = i10;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C2573w c2573w = this.f13975f;
        C2572v c2572v = c2573w.f13972b;
        Typeface typeface = (Typeface) c2572v.f13969h;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c2572v.f13967f, c2573w.f13971a * 2, 2, f7, f8, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        short s5;
        Paint.FontMetricsInt fontMetricsInt2 = this.f13974e;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C2573w c2573w = this.f13975f;
        C2716a m4105b = c2573w.m4105b();
        int m3415a = m4105b.m3415a(14);
        short s7 = 0;
        if (m3415a != 0) {
            s5 = ((ByteBuffer) m4105b.f12319h).getShort(m3415a + m4105b.f12316e);
        } else {
            s5 = 0;
        }
        this.f13977h = abs / s5;
        C2716a m4105b2 = c2573w.m4105b();
        int m3415a2 = m4105b2.m3415a(14);
        if (m3415a2 != 0) {
            ((ByteBuffer) m4105b2.f12319h).getShort(m3415a2 + m4105b2.f12316e);
        }
        C2716a m4105b3 = c2573w.m4105b();
        int m3415a3 = m4105b3.m3415a(12);
        if (m3415a3 != 0) {
            s7 = ((ByteBuffer) m4105b3.f12319h).getShort(m3415a3 + m4105b3.f12316e);
        }
        short s8 = (short) (s7 * this.f13977h);
        this.f13976g = s8;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}
