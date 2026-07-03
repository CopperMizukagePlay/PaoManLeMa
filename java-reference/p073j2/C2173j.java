package p073j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p095m2.AbstractC2550a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.j */
/* loaded from: classes.dex */
public final class C2173j extends ReplacementSpan {

    /* renamed from: e */
    public Paint.FontMetricsInt f12589e;

    /* renamed from: f */
    public int f12590f;

    /* renamed from: g */
    public int f12591g;

    /* renamed from: h */
    public boolean f12592h;

    /* renamed from: a */
    public final Paint.FontMetricsInt m3540a() {
        Paint.FontMetricsInt fontMetricsInt = this.f12589e;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC3367j.m5105j("fontMetrics");
        throw null;
    }

    /* renamed from: b */
    public final int m3541b() {
        if (!this.f12592h) {
            AbstractC2550a.m4079b("PlaceholderSpan is not laid out yet.");
        }
        return this.f12591g;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        this.f12592h = true;
        paint.getTextSize();
        this.f12589e = paint.getFontMetricsInt();
        if (m3540a().descent <= m3540a().ascent) {
            AbstractC2550a.m4078a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f12590f = (int) Math.ceil(0.0f);
        this.f12591g = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m3540a().ascent;
            fontMetricsInt.descent = m3540a().descent;
            fontMetricsInt.leading = m3540a().leading;
            if (fontMetricsInt.ascent > (-m3541b())) {
                fontMetricsInt.ascent = -m3541b();
            }
            fontMetricsInt.top = Math.min(m3540a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m3540a().bottom, fontMetricsInt.descent);
        }
        if (!this.f12592h) {
            AbstractC2550a.m4079b("PlaceholderSpan is not laid out yet.");
        }
        return this.f12590f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
    }
}
