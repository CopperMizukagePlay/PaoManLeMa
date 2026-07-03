package p073j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.l */
/* loaded from: classes.dex */
public final class C2175l extends CharacterStyle {

    /* renamed from: a */
    public final boolean f12597a;

    /* renamed from: b */
    public final boolean f12598b;

    public C2175l(boolean z7, boolean z8) {
        this.f12597a = z7;
        this.f12598b = z8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f12597a);
        textPaint.setStrikeThruText(this.f12598b);
    }
}
