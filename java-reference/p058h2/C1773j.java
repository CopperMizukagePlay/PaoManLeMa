package p058h2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.NoSuchElementException;
import p008b.AbstractC0223b;
import p050g2.C1609r;
import p065i2.C2065f;
import p073j2.AbstractC2168e;
import p073j2.C2164a;
import p073j2.C2172i;
import p095m2.AbstractC2550a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.j */
/* loaded from: classes.dex */
public final class C1773j {

    /* renamed from: a */
    public final TextPaint f10792a;

    /* renamed from: b */
    public final TextUtils.TruncateAt f10793b;

    /* renamed from: c */
    public final boolean f10794c;

    /* renamed from: d */
    public final boolean f10795d;

    /* renamed from: e */
    public C2065f f10796e;

    /* renamed from: f */
    public final Layout f10797f;

    /* renamed from: g */
    public final int f10798g;

    /* renamed from: h */
    public final int f10799h;

    /* renamed from: i */
    public final int f10800i;

    /* renamed from: j */
    public final float f10801j;

    /* renamed from: k */
    public final float f10802k;

    /* renamed from: l */
    public final boolean f10803l;

    /* renamed from: m */
    public final Paint.FontMetricsInt f10804m;

    /* renamed from: n */
    public final int f10805n;

    /* renamed from: o */
    public final C2172i[] f10806o;

    /* renamed from: p */
    public final Rect f10807p = new Rect();

    /* renamed from: q */
    public C1609r f10808q;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1773j(CharSequence charSequence, float f7, TextPaint textPaint, int i7, TextUtils.TruncateAt truncateAt, int i8, boolean z7, int i9, int i10, int i11, int i12, int i13, int i14, C1769f c1769f) {
        Layout.Alignment alignment;
        int i15;
        TextDirectionHeuristic textDirectionHeuristic;
        int i16;
        Layout m2922a;
        long j6;
        C2172i[] c2172iArr;
        char c7;
        int i17;
        Layout layout;
        int i18;
        boolean z8;
        this.f10792a = textPaint;
        this.f10793b = truncateAt;
        this.f10794c = z7;
        int length = charSequence.length();
        TextDirectionHeuristic m2938a = AbstractC1774k.m2938a(i8);
        Layout.Alignment alignment2 = AbstractC1771h.f10789a;
        if (i7 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i7 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i7 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i7 == 3) {
            alignment = AbstractC1771h.f10789a;
        } else if (i7 != 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = AbstractC1771h.f10790b;
        }
        Layout.Alignment alignment3 = alignment;
        boolean z9 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C2164a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics m2919a = c1769f.m2919a();
            double d7 = f7;
            int ceil = (int) Math.ceil(d7);
            if (m2919a != null && c1769f.m2921c() <= f7 && !z9) {
                this.f10803l = true;
                if (ceil < 0) {
                    AbstractC2550a.m4078a("negative width");
                }
                if (ceil < 0) {
                    AbstractC2550a.m4078a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    m2922a = AbstractC0223b.m487e(charSequence, textPaint, ceil, alignment3, m2919a, z7, truncateAt, ceil);
                } else {
                    m2922a = new BoringLayout(charSequence, textPaint, ceil, alignment3, 1.0f, 0.0f, m2919a, z7, truncateAt, ceil);
                }
                i15 = i9;
                textDirectionHeuristic = m2938a;
                i16 = 33;
            } else {
                this.f10803l = false;
                i15 = i9;
                textDirectionHeuristic = m2938a;
                i16 = 33;
                m2922a = AbstractC1770g.m2922a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment3, i15, truncateAt, (int) Math.ceil(d7), i14, z7, i10, i11, i12, i13);
            }
            this.f10797f = m2922a;
            Trace.endSection();
            int min = Math.min(m2922a.getLineCount(), i15);
            this.f10798g = min;
            int i19 = min - 1;
            this.f10795d = min >= i15 && (m2922a.getEllipsisCount(i19) > 0 || m2922a.getLineEnd(i19) != charSequence.length());
            long j7 = AbstractC1774k.f10810b;
            char c8 = ' ';
            if (!z7) {
                if (this.f10803l) {
                    BoringLayout boringLayout = (BoringLayout) m2922a;
                    if (Build.VERSION.SDK_INT >= i16) {
                        z8 = AbstractC0223b.m503u(boringLayout);
                        if (!z8) {
                            TextPaint paint = m2922a.getPaint();
                            CharSequence text = m2922a.getText();
                            Rect m2923b = AbstractC1770g.m2923b(paint, text, m2922a.getLineStart(0), m2922a.getLineEnd(0));
                            int lineAscent = m2922a.getLineAscent(0);
                            int i20 = m2923b.top;
                            int topPadding = i20 < lineAscent ? lineAscent - i20 : m2922a.getTopPadding();
                            m2923b = min != 1 ? AbstractC1770g.m2923b(paint, text, m2922a.getLineStart(i19), m2922a.getLineEnd(i19)) : m2923b;
                            int lineDescent = m2922a.getLineDescent(i19);
                            int i21 = m2923b.bottom;
                            int bottomPadding = i21 > lineDescent ? i21 - lineDescent : m2922a.getBottomPadding();
                            j6 = (topPadding == 0 && bottomPadding == 0) ? j6 : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    z8 = false;
                    if (!z8) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) m2922a;
                    int i22 = Build.VERSION.SDK_INT;
                    if (i22 >= i16) {
                        z8 = AbstractC0223b.m504v(staticLayout);
                    } else {
                        if (i22 >= 28) {
                            z8 = true;
                        }
                        z8 = false;
                    }
                    if (!z8) {
                    }
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (m2922a.getText() instanceof Spanned) {
                    CharSequence text2 = m2922a.getText();
                    AbstractC3367j.m5098c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    if (AbstractC1770g.m2927f((Spanned) text2, C2172i.class) || m2922a.getText().length() <= 0) {
                        CharSequence text3 = m2922a.getText();
                        AbstractC3367j.m5098c(text3, "null cannot be cast to non-null type android.text.Spanned");
                        c2172iArr = (C2172i[]) ((Spanned) text3).getSpans(0, m2922a.getText().length(), C2172i.class);
                        this.f10806o = c2172iArr;
                        if (c2172iArr != null) {
                            int length2 = c2172iArr.length;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (i25 < length2) {
                                C2172i c2172i = c2172iArr[i25];
                                char c9 = c8;
                                int i26 = c2172i.f12587o;
                                i23 = i26 < 0 ? Math.max(i23, Math.abs(i26)) : i23;
                                int i27 = c2172i.f12588p;
                                if (i27 < 0) {
                                    i24 = Math.max(i23, Math.abs(i27));
                                }
                                i25++;
                                c8 = c9;
                            }
                            c7 = c8;
                            j7 = (i23 == 0 && i24 == 0) ? AbstractC1774k.f10810b : (i23 << c7) | (i24 & 4294967295L);
                        } else {
                            c7 = ' ';
                        }
                        this.f10799h = Math.max((int) (j6 >> c7), (int) (j7 >> c7));
                        this.f10800i = Math.max((int) (j6 & 4294967295L), (int) (j7 & 4294967295L));
                        TextPaint textPaint2 = this.f10792a;
                        C2172i[] c2172iArr2 = this.f10806o;
                        i17 = this.f10798g - 1;
                        layout = this.f10797f;
                        if (layout.getLineStart(i17) == layout.getLineEnd(i17) || c2172iArr2 == null || c2172iArr2.length == 0) {
                            i18 = 0;
                        } else {
                            TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                            SpannableString spannableString = new SpannableString("\u200b");
                            if (c2172iArr2.length != 0) {
                                C2172i c2172i2 = c2172iArr2[0];
                                spannableString.setSpan(new C2172i(c2172i2.f12577e, spannableString.length(), (i17 == 0 || !c2172i2.f12580h) ? c2172i2.f12580h : false, c2172i2.f12580h, c2172i2.f12581i, c2172i2.f12582j), 0, spannableString.length(), i16);
                                StaticLayout m2922a2 = AbstractC1770g.m2922a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, AbstractC1767d.f10777a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f10794c, 0, 0, 0, 0);
                                fontMetricsInt = new Paint.FontMetricsInt();
                                i18 = 0;
                                fontMetricsInt.ascent = m2922a2.getLineAscent(0);
                                fontMetricsInt.descent = m2922a2.getLineDescent(0);
                                fontMetricsInt.top = m2922a2.getLineTop(0);
                                fontMetricsInt.bottom = m2922a2.getLineBottom(0);
                            } else {
                                throw new NoSuchElementException("Array is empty.");
                            }
                        }
                        this.f10805n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m2932e(i19) - m2934g(i19))) : i18;
                        this.f10804m = fontMetricsInt;
                        Layout layout2 = this.f10797f;
                        this.f10801j = AbstractC2168e.m3539z(layout2, i19, layout2.getPaint());
                        Layout layout3 = this.f10797f;
                        this.f10802k = AbstractC2168e.m3507A(layout3, i19, layout3.getPaint());
                    }
                }
                c2172iArr = null;
                this.f10806o = c2172iArr;
                if (c2172iArr != null) {
                }
                this.f10799h = Math.max((int) (j6 >> c7), (int) (j7 >> c7));
                this.f10800i = Math.max((int) (j6 & 4294967295L), (int) (j7 & 4294967295L));
                TextPaint textPaint22 = this.f10792a;
                C2172i[] c2172iArr22 = this.f10806o;
                i17 = this.f10798g - 1;
                layout = this.f10797f;
                if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                }
                i18 = 0;
                this.f10805n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m2932e(i19) - m2934g(i19))) : i18;
                this.f10804m = fontMetricsInt;
                Layout layout22 = this.f10797f;
                this.f10801j = AbstractC2168e.m3539z(layout22, i19, layout22.getPaint());
                Layout layout32 = this.f10797f;
                this.f10802k = AbstractC2168e.m3507A(layout32, i19, layout32.getPaint());
            }
            j6 = j7;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (m2922a.getText() instanceof Spanned) {
            }
            c2172iArr = null;
            this.f10806o = c2172iArr;
            if (c2172iArr != null) {
            }
            this.f10799h = Math.max((int) (j6 >> c7), (int) (j7 >> c7));
            this.f10800i = Math.max((int) (j6 & 4294967295L), (int) (j7 & 4294967295L));
            TextPaint textPaint222 = this.f10792a;
            C2172i[] c2172iArr222 = this.f10806o;
            i17 = this.f10798g - 1;
            layout = this.f10797f;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = 0;
            this.f10805n = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (m2932e(i19) - m2934g(i19))) : i18;
            this.f10804m = fontMetricsInt2;
            Layout layout222 = this.f10797f;
            this.f10801j = AbstractC2168e.m3539z(layout222, i19, layout222.getPaint());
            Layout layout322 = this.f10797f;
            this.f10802k = AbstractC2168e.m3507A(layout322, i19, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: a */
    public final int m2928a() {
        int height;
        boolean z7 = this.f10795d;
        Layout layout = this.f10797f;
        if (z7) {
            height = layout.getLineBottom(this.f10798g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.f10799h + this.f10800i + this.f10805n;
    }

    /* renamed from: b */
    public final float m2929b(int i7) {
        if (i7 == this.f10798g - 1) {
            return this.f10801j + this.f10802k;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final C1609r m2930c() {
        C1609r c1609r = this.f10808q;
        if (c1609r == null) {
            C1609r c1609r2 = new C1609r(this.f10797f);
            this.f10808q = c1609r2;
            return c1609r2;
        }
        return c1609r;
    }

    /* renamed from: d */
    public final float m2931d(int i7) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f7 = this.f10799h;
        if (i7 == this.f10798g - 1 && (fontMetricsInt = this.f10804m) != null) {
            lineBaseline = m2934g(i7) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f10797f.getLineBaseline(i7);
        }
        return f7 + lineBaseline;
    }

    /* renamed from: e */
    public final float m2932e(int i7) {
        int i8;
        Paint.FontMetricsInt fontMetricsInt;
        int i9 = this.f10798g;
        int i10 = i9 - 1;
        Layout layout = this.f10797f;
        if (i7 == i10 && (fontMetricsInt = this.f10804m) != null) {
            return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f10799h + layout.getLineBottom(i7);
        if (i7 == i9 - 1) {
            i8 = this.f10800i;
        } else {
            i8 = 0;
        }
        return lineBottom + i8;
    }

    /* renamed from: f */
    public final int m2933f(int i7) {
        C1772i c1772i = AbstractC1774k.f10809a;
        Layout layout = this.f10797f;
        if (layout.getEllipsisCount(i7) > 0 && this.f10793b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i7);
    }

    /* renamed from: g */
    public final float m2934g(int i7) {
        int i8;
        float lineTop = this.f10797f.getLineTop(i7);
        if (i7 == 0) {
            i8 = 0;
        } else {
            i8 = this.f10799h;
        }
        return lineTop + i8;
    }

    /* renamed from: h */
    public final float m2935h(int i7, boolean z7) {
        return m2929b(this.f10797f.getLineForOffset(i7)) + m2930c().m2612f(i7, true, z7);
    }

    /* renamed from: i */
    public final float m2936i(int i7, boolean z7) {
        return m2929b(this.f10797f.getLineForOffset(i7)) + m2930c().m2612f(i7, false, z7);
    }

    /* renamed from: j */
    public final C2065f m2937j() {
        C2065f c2065f = this.f10796e;
        if (c2065f != null) {
            return c2065f;
        }
        Layout layout = this.f10797f;
        C2065f c2065f2 = new C2065f(layout.getText(), layout.getText().length(), this.f10792a.getTextLocale());
        this.f10796e = c2065f2;
        return c2065f2;
    }
}
