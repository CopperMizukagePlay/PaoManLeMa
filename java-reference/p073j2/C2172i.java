package p073j2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.i */
/* loaded from: classes.dex */
public final class C2172i implements LineHeightSpan {

    /* renamed from: e */
    public final float f12577e;

    /* renamed from: f */
    public final int f12578f;

    /* renamed from: g */
    public final boolean f12579g;

    /* renamed from: h */
    public final boolean f12580h;

    /* renamed from: i */
    public final float f12581i;

    /* renamed from: j */
    public final boolean f12582j;

    /* renamed from: k */
    public int f12583k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f12584l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f12585m = Integer.MIN_VALUE;

    /* renamed from: n */
    public int f12586n = Integer.MIN_VALUE;

    /* renamed from: o */
    public int f12587o;

    /* renamed from: p */
    public int f12588p;

    public C2172i(float f7, int i7, boolean z7, boolean z8, float f8, boolean z9) {
        this.f12577e = f7;
        this.f12578f = i7;
        this.f12579g = z7;
        this.f12580h = z8;
        this.f12581i = f8;
        this.f12582j = z9;
        if ((0.0f <= f8 && f8 <= 1.0f) || f8 == -1.0f) {
            return;
        }
        AbstractC2550a.m4079b("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z7;
        int i11;
        int i12;
        double ceil;
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 > 0) {
            boolean z8 = true;
            if (i7 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i8 != this.f12578f) {
                z8 = false;
            }
            boolean z9 = this.f12580h;
            boolean z10 = this.f12579g;
            if (z7 && z8 && z10 && z9) {
                return;
            }
            if (this.f12583k == Integer.MIN_VALUE) {
                int i15 = i13 - i14;
                int ceil2 = (int) Math.ceil(this.f12577e);
                int i16 = ceil2 - i15;
                if (this.f12582j && i16 <= 0) {
                    int i17 = fontMetricsInt.ascent;
                    this.f12584l = i17;
                    int i18 = fontMetricsInt.descent;
                    this.f12585m = i18;
                    this.f12583k = i17;
                    this.f12586n = i18;
                    this.f12587o = 0;
                    this.f12588p = 0;
                } else {
                    float f7 = this.f12581i;
                    if (f7 == -1.0f) {
                        f7 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i16 <= 0) {
                        ceil = Math.ceil(i16 * f7);
                    } else {
                        ceil = Math.ceil((1.0f - f7) * i16);
                    }
                    int i19 = (int) ceil;
                    int i20 = fontMetricsInt.descent;
                    int i21 = i19 + i20;
                    this.f12585m = i21;
                    int i22 = i21 - ceil2;
                    this.f12584l = i22;
                    if (z10) {
                        i22 = fontMetricsInt.ascent;
                    }
                    this.f12583k = i22;
                    if (z9) {
                        i21 = i20;
                    }
                    this.f12586n = i21;
                    this.f12587o = fontMetricsInt.ascent - i22;
                    this.f12588p = i21 - i20;
                }
            }
            if (z7) {
                i11 = this.f12583k;
            } else {
                i11 = this.f12584l;
            }
            fontMetricsInt.ascent = i11;
            if (z8) {
                i12 = this.f12586n;
            } else {
                i12 = this.f12585m;
            }
            fontMetricsInt.descent = i12;
        }
    }
}
