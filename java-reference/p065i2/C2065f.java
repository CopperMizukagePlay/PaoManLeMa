package p065i2;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import p034e0.C0619n;
import p058h2.C1766c;
import p060h5.AbstractC1804l;
import p095m2.AbstractC2550a;
import p096m3.C2560j;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i2.f */
/* loaded from: classes.dex */
public final class C2065f {

    /* renamed from: a */
    public final /* synthetic */ int f12250a = 1;

    /* renamed from: b */
    public int f12251b;

    /* renamed from: c */
    public int f12252c;

    /* renamed from: d */
    public CharSequence f12253d;

    /* renamed from: e */
    public Object f12254e;

    public /* synthetic */ C2065f() {
    }

    /* renamed from: a */
    public void m3261a(int i7) {
        int i8 = this.f12251b;
        int i9 = this.f12252c;
        boolean z7 = false;
        if (i7 <= i9 && i8 <= i7) {
            z7 = true;
        }
        if (!z7) {
            AbstractC2550a.m4078a("Invalid offset: " + i7 + ". Valid range is [" + i8 + " , " + i9 + ']');
        }
    }

    /* renamed from: b */
    public int m3262b() {
        C0619n c0619n = (C0619n) this.f12254e;
        if (c0619n == null) {
            return ((String) this.f12253d).length();
        }
        return (c0619n.f2035b - c0619n.m1275b()) + (((String) this.f12253d).length() - (this.f12252c - this.f12251b));
    }

    /* renamed from: c */
    public boolean m3263c(int i7) {
        CharSequence charSequence = this.f12253d;
        int i8 = this.f12251b + 1;
        if (i7 <= this.f12252c && i8 <= i7) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i7))) {
                int i9 = i7 - 1;
                if (!Character.isSurrogate(charSequence.charAt(i9))) {
                    if (C2560j.m4082d()) {
                        C2560j m4081a = C2560j.m4081a();
                        if (m4081a.m4084c() != 1 || m4081a.m4083b(charSequence, i9) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m3264d(int i7) {
        int i8 = this.f12251b + 1;
        if (i7 <= this.f12252c && i8 <= i7) {
            return AbstractC2064e.m3251y(Character.codePointBefore(this.f12253d, i7));
        }
        return false;
    }

    /* renamed from: e */
    public boolean m3265e(int i7) {
        m3261a(i7);
        if (((BreakIterator) this.f12254e).isBoundary(i7)) {
            if (!m3267g(i7) || !m3267g(i7 - 1) || !m3267g(i7 + 1)) {
                if (i7 <= 0 || i7 >= this.f12253d.length() - 1 || (!m3266f(i7) && !m3266f(i7 + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3266f(int i7) {
        CharSequence charSequence = this.f12253d;
        int i8 = i7 - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i8));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!AbstractC3367j.m5096a(of, unicodeBlock) || !AbstractC3367j.m5096a(Character.UnicodeBlock.of(charSequence.charAt(i7)), Character.UnicodeBlock.KATAKANA)) {
            if (AbstractC3367j.m5096a(Character.UnicodeBlock.of(charSequence.charAt(i7)), unicodeBlock) && AbstractC3367j.m5096a(Character.UnicodeBlock.of(charSequence.charAt(i8)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m3267g(int i7) {
        CharSequence charSequence = this.f12253d;
        int i8 = this.f12251b;
        if (i7 < this.f12252c && i8 <= i7) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i7)) && !Character.isSurrogate(charSequence.charAt(i7))) {
                if (C2560j.m4082d()) {
                    C2560j m4081a = C2560j.m4081a();
                    if (m4081a.m4084c() != 1 || m4081a.m4083b(charSequence, i7) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m3268h(int i7) {
        int i8 = this.f12251b;
        if (i7 < this.f12252c && i8 <= i7) {
            return AbstractC2064e.m3251y(Character.codePointAt(this.f12253d, i7));
        }
        return false;
    }

    /* renamed from: i */
    public int m3269i(int i7) {
        m3261a(i7);
        int following = ((BreakIterator) this.f12254e).following(i7);
        if (m3267g(following - 1) && m3267g(following) && !m3266f(following)) {
            return m3269i(following);
        }
        return following;
    }

    /* renamed from: j */
    public int m3270j(int i7) {
        m3261a(i7);
        int preceding = ((BreakIterator) this.f12254e).preceding(i7);
        if (m3267g(preceding) && m3263c(preceding) && !m3266f(preceding)) {
            return m3270j(preceding);
        }
        return preceding;
    }

    /* renamed from: k */
    public void m3271k(int i7, int i8, String str) {
        if (i7 > i8) {
            AbstractC2550a.m4078a("start index must be less than or equal to end index: " + i7 + " > " + i8);
        }
        if (i7 < 0) {
            AbstractC2550a.m4078a("start must be non-negative, but was " + i7);
        }
        C0619n c0619n = (C0619n) this.f12254e;
        if (c0619n == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i7, 64);
            int min2 = Math.min(((String) this.f12253d).length() - i8, 64);
            String str2 = (String) this.f12253d;
            int i9 = i7 - min;
            AbstractC3367j.m5098c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i9, i7, cArr, 0);
            String str3 = (String) this.f12253d;
            int i10 = max - min2;
            int i11 = min2 + i8;
            AbstractC3367j.m5098c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i8, i11, cArr, i10);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C0619n c0619n2 = new C0619n();
            c0619n2.f2035b = max;
            c0619n2.f2038e = cArr;
            c0619n2.f2036c = length;
            c0619n2.f2037d = i10;
            this.f12254e = c0619n2;
            this.f12251b = i9;
            this.f12252c = i11;
            return;
        }
        int i12 = this.f12251b;
        int i13 = i7 - i12;
        int i14 = i8 - i12;
        if (i13 >= 0 && i14 <= c0619n.f2035b - c0619n.m1275b()) {
            int length2 = str.length() - (i14 - i13);
            if (length2 > c0619n.m1275b()) {
                int m1275b = length2 - c0619n.m1275b();
                int i15 = c0619n.f2035b;
                do {
                    i15 *= 2;
                } while (i15 - c0619n.f2035b < m1275b);
                char[] cArr2 = new char[i15];
                AbstractC1804l.m3014G((char[]) c0619n.f2038e, cArr2, 0, 0, c0619n.f2036c);
                int i16 = c0619n.f2035b;
                int i17 = c0619n.f2037d;
                int i18 = i16 - i17;
                int i19 = i15 - i18;
                AbstractC1804l.m3014G((char[]) c0619n.f2038e, cArr2, i19, i17, i18 + i17);
                c0619n.f2038e = cArr2;
                c0619n.f2035b = i15;
                c0619n.f2037d = i19;
            }
            int i20 = c0619n.f2036c;
            if (i13 < i20 && i14 <= i20) {
                int i21 = i20 - i14;
                char[] cArr3 = (char[]) c0619n.f2038e;
                AbstractC1804l.m3014G(cArr3, cArr3, c0619n.f2037d - i21, i14, i20);
                c0619n.f2036c = i13;
                c0619n.f2037d -= i21;
            } else if (i13 < i20 && i14 >= i20) {
                c0619n.f2037d = c0619n.m1275b() + i14;
                c0619n.f2036c = i13;
            } else {
                int m1275b2 = c0619n.m1275b() + i13;
                int m1275b3 = c0619n.m1275b() + i14;
                int i22 = c0619n.f2037d;
                char[] cArr4 = (char[]) c0619n.f2038e;
                AbstractC1804l.m3014G(cArr4, cArr4, c0619n.f2036c, i22, m1275b2);
                c0619n.f2036c += m1275b2 - i22;
                c0619n.f2037d = m1275b3;
            }
            str.getChars(0, str.length(), (char[]) c0619n.f2038e, c0619n.f2036c);
            c0619n.f2036c = str.length() + c0619n.f2036c;
            return;
        }
        this.f12253d = toString();
        this.f12254e = null;
        this.f12251b = -1;
        this.f12252c = -1;
        m3271k(i7, i8, str);
    }

    public String toString() {
        switch (this.f12250a) {
            case 1:
                C0619n c0619n = (C0619n) this.f12254e;
                if (c0619n == null) {
                    return (String) this.f12253d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12253d, 0, this.f12251b);
                sb.append((char[]) c0619n.f2038e, 0, c0619n.f2036c);
                char[] cArr = (char[]) c0619n.f2038e;
                int i7 = c0619n.f2037d;
                sb.append(cArr, i7, c0619n.f2035b - i7);
                String str = (String) this.f12253d;
                sb.append((CharSequence) str, this.f12252c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C2065f(CharSequence charSequence, int i7, Locale locale) {
        this.f12253d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC2550a.m4078a("input start index is outside the CharSequence");
        }
        if (i7 < 0 || i7 > charSequence.length()) {
            AbstractC2550a.m4078a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f12254e = wordInstance;
        this.f12251b = Math.max(0, -50);
        this.f12252c = Math.min(charSequence.length(), i7 + 50);
        wordInstance.setText(new C1766c(charSequence, i7));
    }
}
