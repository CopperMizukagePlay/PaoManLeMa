package p065i2;

import java.text.BreakIterator;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i2.c */
/* loaded from: classes.dex */
public final class C2062c extends AbstractC3784a {

    /* renamed from: u */
    public final BreakIterator f12249u;

    public C2062c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f12249u = characterInstance;
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: A */
    public final int mo3222A(int i7) {
        return this.f12249u.following(i7);
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: B */
    public final int mo3223B(int i7) {
        return this.f12249u.preceding(i7);
    }
}
