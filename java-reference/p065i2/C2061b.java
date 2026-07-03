package p065i2;

import android.text.TextPaint;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C2061b extends AbstractC3784a {

    /* renamed from: u */
    public final CharSequence f12247u;

    /* renamed from: v */
    public final TextPaint f12248v;

    public C2061b(CharSequence charSequence, TextPaint textPaint) {
        this.f12247u = charSequence;
        this.f12248v = textPaint;
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: A */
    public final int mo3222A(int i7) {
        int textRunCursor;
        CharSequence charSequence = this.f12247u;
        textRunCursor = this.f12248v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 0);
        return textRunCursor;
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: B */
    public final int mo3223B(int i7) {
        int textRunCursor;
        CharSequence charSequence = this.f12247u;
        textRunCursor = this.f12248v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 2);
        return textRunCursor;
    }
}
