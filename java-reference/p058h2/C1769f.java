package p058h2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p008b.AbstractC0223b;
import p015b6.C0296c;
import p073j2.C2170g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.f */
/* loaded from: classes.dex */
public final class C1769f {

    /* renamed from: a */
    public final CharSequence f10781a;

    /* renamed from: b */
    public final TextPaint f10782b;

    /* renamed from: c */
    public final int f10783c;

    /* renamed from: d */
    public float f10784d = Float.NaN;

    /* renamed from: e */
    public float f10785e = Float.NaN;

    /* renamed from: f */
    public BoringLayout.Metrics f10786f;

    /* renamed from: g */
    public boolean f10787g;

    /* renamed from: h */
    public CharSequence f10788h;

    public C1769f(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f10781a = charSequence;
        this.f10782b = textPaint;
        this.f10783c = i7;
    }

    /* renamed from: a */
    public final BoringLayout.Metrics m2919a() {
        BoringLayout.Metrics metrics;
        if (!this.f10787g) {
            TextDirectionHeuristic m2938a = AbstractC1774k.m2938a(this.f10783c);
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f10781a;
            TextPaint textPaint = this.f10782b;
            if (i7 >= 33) {
                metrics = AbstractC0223b.m486d(charSequence, textPaint, m2938a);
            } else if (!m2938a.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            } else {
                metrics = null;
            }
            this.f10786f = metrics;
            this.f10787g = true;
        }
        return this.f10786f;
    }

    /* renamed from: b */
    public final CharSequence m2920b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f10788h;
        if (charSequence == null) {
            charSequence = this.f10781a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC1770g.m2927f(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    C0296c m5103h = AbstractC3367j.m5103h(characterStyleArr);
                    SpannableString spannableString = null;
                    while (m5103h.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) m5103h.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f10788h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (p058h2.AbstractC1770g.m2927f(r2, p073j2.C2169f.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m2921c() {
        int i7;
        if (!Float.isNaN(this.f10784d)) {
            return this.f10784d;
        }
        BoringLayout.Metrics m2919a = m2919a();
        if (m2919a != null) {
            i7 = m2919a.width;
        } else {
            i7 = -1;
        }
        float f7 = i7;
        TextPaint textPaint = this.f10782b;
        if (f7 < 0.0f) {
            f7 = (float) Math.ceil(Layout.getDesiredWidth(m2920b(), 0, m2920b().length(), textPaint));
        }
        if (f7 != 0.0f) {
            CharSequence charSequence = this.f10781a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!AbstractC1770g.m2927f(spanned, C2170g.class)) {
                }
                f7 += 0.5f;
            }
        }
        this.f10784d = f7;
        return f7;
    }
}
