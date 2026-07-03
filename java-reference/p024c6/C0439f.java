package p024c6;

import java.util.List;
import java.util.regex.Matcher;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.f */
/* loaded from: classes.dex */
public final class C0439f {

    /* renamed from: a */
    public final Matcher f1497a;

    /* renamed from: b */
    public final CharSequence f1498b;

    /* renamed from: c */
    public C0438e f1499c;

    public C0439f(Matcher matcher, CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "input");
        this.f1497a = matcher;
        this.f1498b = charSequence;
    }

    /* renamed from: a */
    public final List m923a() {
        if (this.f1499c == null) {
            this.f1499c = new C0438e(this);
        }
        C0438e c0438e = this.f1499c;
        AbstractC3367j.m5097b(c0438e);
        return c0438e;
    }

    /* renamed from: b */
    public final C3879d m924b() {
        Matcher matcher = this.f1497a;
        return AbstractC2168e.m3513G(matcher.start(), matcher.end());
    }

    /* renamed from: c */
    public final C0439f m925c() {
        int i7;
        Matcher matcher = this.f1497a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i8 = end + i7;
        CharSequence charSequence = this.f1498b;
        if (i8 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            AbstractC3367j.m5099d(matcher2, "matcher(...)");
            return AbstractC1793a0.m2978f(matcher2, i8, charSequence);
        }
        return null;
    }
}
