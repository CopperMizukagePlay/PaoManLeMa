package p024c6;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p015b6.C0304k;
import p017c.C0320e;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.i */
/* loaded from: classes.dex */
public final class C0442i implements Serializable {

    /* renamed from: e */
    public final Pattern f1508e;

    public C0442i(String str) {
        Pattern compile = Pattern.compile(str);
        AbstractC3367j.m5099d(compile, "compile(...)");
        this.f1508e = compile;
    }

    /* renamed from: b */
    public static C0304k m926b(C0442i c0442i, String str) {
        c0442i.getClass();
        if (str.length() >= 0) {
            return new C0304k(new C0320e(1, c0442i, str), C0440g.f1500m);
        }
        StringBuilder m188o = AbstractC0094y0.m188o(0, "Start index out of bounds: ", ", input length: ");
        m188o.append(str.length());
        throw new IndexOutOfBoundsException(m188o.toString());
    }

    /* renamed from: a */
    public final C0439f m927a(CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "input");
        Matcher matcher = this.f1508e.matcher(charSequence);
        AbstractC3367j.m5099d(matcher, "matcher(...)");
        return AbstractC1793a0.m2978f(matcher, 0, charSequence);
    }

    public final String toString() {
        String pattern = this.f1508e.toString();
        AbstractC3367j.m5099d(pattern, "toString(...)");
        return pattern;
    }

    public C0442i(String str, int i7) {
        Pattern compile = Pattern.compile(str, 66);
        AbstractC3367j.m5099d(compile, "compile(...)");
        this.f1508e = compile;
    }
}
