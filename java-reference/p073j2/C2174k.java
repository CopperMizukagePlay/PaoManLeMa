package p073j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.k */
/* loaded from: classes.dex */
public final class C2174k extends CharacterStyle {

    /* renamed from: a */
    public final int f12593a;

    /* renamed from: b */
    public final float f12594b;

    /* renamed from: c */
    public final float f12595c;

    /* renamed from: d */
    public final float f12596d;

    public C2174k(float f7, float f8, float f9, int i7) {
        this.f12593a = i7;
        this.f12594b = f7;
        this.f12595c = f8;
        this.f12596d = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f12596d, this.f12594b, this.f12595c, this.f12593a);
    }
}
