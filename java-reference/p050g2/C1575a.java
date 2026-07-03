package p050g2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import p001a0.C0068q2;
import p015b6.C0296c;
import p018c0.AbstractC0344n;
import p024c6.C0453t;
import p027d1.C0465c;
import p027d1.C0467e;
import p034e0.C0625q;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1571e;
import p058h2.AbstractC1770g;
import p058h2.AbstractC1774k;
import p058h2.C1769f;
import p058h2.C1772i;
import p058h2.C1773j;
import p060h5.C1813u;
import p065i2.C2060a;
import p065i2.C2061b;
import p065i2.C2062c;
import p065i2.InterfaceC2063d;
import p068i5.AbstractC2080d;
import p073j2.C2166c;
import p073j2.C2173j;
import p095m2.AbstractC2550a;
import p110o2.AbstractC2805b;
import p110o2.C2804a;
import p110o2.C2807d;
import p110o2.C2809f;
import p125q2.C2985b;
import p132r2.C3038l;
import p132r2.EnumC3036j;
import p140s2.C3091a;
import p140s2.C3105o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.a */
/* loaded from: classes.dex */
public final class C1575a {

    /* renamed from: a */
    public final C2807d f10192a;

    /* renamed from: b */
    public final int f10193b;

    /* renamed from: c */
    public final long f10194c;

    /* renamed from: d */
    public final C1773j f10195d;

    /* renamed from: e */
    public final CharSequence f10196e;

    /* renamed from: f */
    public final Object f10197f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1575a(C2807d c2807d, int i7, int i8, long j6) {
        int i9;
        CharSequence charSequence;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C1588g0 c1588g0;
        int i19;
        int i20;
        int i21;
        char c7;
        C1588g0 c1588g02;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        C1773j m2547a;
        int i22;
        C1575a c1575a;
        int i23;
        int i24;
        int i25;
        Layout layout;
        C2985b[] c2985bArr;
        CharSequence charSequence2;
        Object obj;
        boolean z7;
        boolean z8;
        boolean z9;
        C0465c c0465c;
        EnumC3036j enumC3036j;
        float m2935h;
        int i26;
        Spannable spannable;
        this.f10192a = c2807d;
        this.f10193b = i7;
        this.f10194c = j6;
        if (C3091a.m4761i(j6) != 0 || C3091a.m4762j(j6) != 0) {
            AbstractC2550a.m4078a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i7 < 1) {
            AbstractC2550a.m4078a("maxLines should be greater than 0");
        }
        C1604o0 c1604o0 = c2807d.f14833b;
        CharSequence charSequence3 = c2807d.f14839h;
        if (i8 == 2) {
            i9 = 0;
            charSequence = charSequence3;
            if (!C3105o.m4794a(c1604o0.f10309a.f10249h, AbstractC2080d.m3405r(0))) {
                charSequence = charSequence3;
                if (!C3105o.m4794a(c1604o0.f10309a.f10249h, C3105o.f15708c)) {
                    int i27 = c1604o0.f10310b.f10339a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i27 != Integer.MIN_VALUE && i27 != 5 && i27 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            if (charSequence3 instanceof Spannable) {
                                spannable = (Spannable) charSequence3;
                            } else {
                                spannable = null;
                            }
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean m2927f = AbstractC1770g.m2927f(spannableString, C2166c.class);
                            charSequence = spannableString;
                            if (!m2927f) {
                                spannableString.setSpan(new Object(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i9 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f10196e = charSequence4;
        C1613v c1613v = c1604o0.f10310b;
        C1588g0 c1588g03 = c1604o0.f10309a;
        int i28 = c1613v.f10339a;
        int i29 = 3;
        if (i28 == 1) {
            i10 = 3;
        } else if (i28 == 2) {
            i10 = 4;
        } else if (i28 == 3) {
            i10 = 2;
        } else if (i28 != 5 && i28 == 6) {
            i10 = 1;
        } else {
            i10 = i9;
        }
        if (i28 == 4) {
            i11 = 1;
        } else {
            i11 = i9;
        }
        if (c1613v.f10346h == 2) {
            if (Build.VERSION.SDK_INT <= 32) {
                i12 = 2;
            } else {
                i12 = 4;
            }
        } else {
            i12 = i9;
        }
        int i30 = c1613v.f10345g;
        int i31 = i30 & 255;
        if (i31 != 1) {
            if (i31 == 2) {
                i13 = i30;
                i14 = i11;
                i15 = 1;
            } else if (i31 == 3) {
                i13 = i30;
                i14 = i11;
                i15 = 2;
            }
            i16 = (i13 >> 8) & 255;
            if (i16 != 1) {
                if (i16 == 2) {
                    i29 = 1;
                } else if (i16 == 3) {
                    i29 = 2;
                } else if (i16 == 4) {
                }
                i17 = (i13 >> 16) & 255;
                if (i17 == 1) {
                    i18 = 2;
                } else {
                    i18 = 2;
                    if (i17 == 2) {
                        c1588g0 = c1588g03;
                        i19 = i10;
                        i20 = 1;
                        if (i8 != i18) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i8 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else if (i8 == 4) {
                            truncateAt2 = TextUtils.TruncateAt.START;
                        } else {
                            i21 = i12;
                            c7 = ' ';
                            c1588g02 = c1588g0;
                            truncateAt = null;
                            m2547a = m2547a(i19, i14, truncateAt, i7, i21, i15, i29, i20, charSequence4);
                            Layout layout2 = m2547a.f10797f;
                            i22 = i19;
                            if (Build.VERSION.SDK_INT < 35 || c2807d.f14838g.getLetterSpacing() == 0.0f || ((i8 != 4 && i8 != 5) || layout2.getEllipsisCount(0) <= 0)) {
                                c1575a = this;
                                i23 = i7;
                                i24 = i22;
                                i25 = 2;
                            } else {
                                int ellipsisStart = layout2.getEllipsisStart(0);
                                i25 = 2;
                                CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                                c1575a = this;
                                i23 = i7;
                                i24 = i22;
                                m2547a = c1575a.m2547a(i24, i14, truncateAt, i23, i21, i15, i29, i20, TextUtils.concat(charSequenceArr));
                            }
                            int i32 = m2547a.f10798g;
                            if (i8 != i25 && m2547a.m2928a() > C3091a.m4759g(j6) && i23 > 1) {
                                int m4759g = C3091a.m4759g(j6);
                                int i33 = 0;
                                while (true) {
                                    if (i33 < i32) {
                                        if (m2547a.m2932e(i33) > m4759g) {
                                            break;
                                        } else {
                                            i33++;
                                        }
                                    } else {
                                        i33 = i32;
                                        break;
                                    }
                                }
                                if (i33 >= 0 && i33 != c1575a.f10193b) {
                                    if (i33 < 1) {
                                        i26 = 1;
                                    } else {
                                        i26 = i33;
                                    }
                                    m2547a = c1575a.m2547a(i24, i14, truncateAt, i26, i21, i15, i29, i20, c1575a.f10196e);
                                }
                                c1575a.f10195d = m2547a;
                            } else {
                                c1575a.f10195d = m2547a;
                            }
                            c1575a.f10192a.f14838g.m4437c(c1588g02.f10242a.mo4718c(), (Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7), c1588g02.f10242a.mo4716a());
                            layout = c1575a.f10195d.f10797f;
                            if (layout.getText() instanceof Spanned) {
                                CharSequence text = layout.getText();
                                AbstractC3367j.m5098c(text, "null cannot be cast to non-null type android.text.Spanned");
                                Spanned spanned = (Spanned) text;
                                if (spanned.nextSpanTransition(-1, spanned.length(), C2985b.class) != spanned.length()) {
                                    CharSequence text2 = layout.getText();
                                    AbstractC3367j.m5098c(text2, "null cannot be cast to non-null type android.text.Spanned");
                                    c2985bArr = (C2985b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C2985b.class);
                                    if (c2985bArr != null) {
                                        C0296c m5103h = AbstractC3367j.m5103h(c2985bArr);
                                        while (m5103h.hasNext()) {
                                            ((C2985b) m5103h.next()).f15419g.setValue(new C0467e((Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7)));
                                        }
                                    }
                                    charSequence2 = c1575a.f10196e;
                                    if (charSequence2 instanceof Spanned) {
                                        obj = C1813u.f10860e;
                                    } else {
                                        Spanned spanned2 = (Spanned) charSequence2;
                                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), C2173j.class);
                                        ArrayList arrayList = new ArrayList(spans.length);
                                        for (Object obj2 : spans) {
                                            C2173j c2173j = (C2173j) obj2;
                                            int spanStart = spanned2.getSpanStart(c2173j);
                                            int spanEnd = spanned2.getSpanEnd(c2173j);
                                            int lineForOffset = c1575a.f10195d.f10797f.getLineForOffset(spanStart);
                                            if (lineForOffset >= c1575a.f10193b) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (c1575a.f10195d.f10797f.getEllipsisCount(lineForOffset) > 0 && spanEnd > c1575a.f10195d.f10797f.getEllipsisStart(lineForOffset)) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (spanEnd > c1575a.f10195d.m2933f(lineForOffset)) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (!z8 && !z9 && !z7) {
                                                if (c1575a.f10195d.f10797f.isRtlCharAt(spanStart)) {
                                                    enumC3036j = EnumC3036j.f15601f;
                                                } else {
                                                    enumC3036j = EnumC3036j.f15600e;
                                                }
                                                int ordinal = enumC3036j.ordinal();
                                                if (ordinal != 0) {
                                                    if (ordinal == 1) {
                                                        float m2935h2 = c1575a.f10195d.m2935h(spanStart, false);
                                                        if (!c2173j.f12592h) {
                                                            AbstractC2550a.m4079b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        m2935h = m2935h2 - c2173j.f12590f;
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                } else {
                                                    m2935h = c1575a.f10195d.m2935h(spanStart, false);
                                                }
                                                if (!c2173j.f12592h) {
                                                    AbstractC2550a.m4079b("PlaceholderSpan is not laid out yet.");
                                                }
                                                float m2931d = c1575a.f10195d.m2931d(lineForOffset) - c2173j.m3541b();
                                                c0465c = new C0465c(m2935h, m2931d, c2173j.f12590f + m2935h, c2173j.m3541b() + m2931d);
                                            } else {
                                                c0465c = null;
                                            }
                                            arrayList.add(c0465c);
                                        }
                                        obj = arrayList;
                                    }
                                    c1575a.f10197f = obj;
                                }
                            }
                            c2985bArr = null;
                            if (c2985bArr != null) {
                            }
                            charSequence2 = c1575a.f10196e;
                            if (charSequence2 instanceof Spanned) {
                            }
                            c1575a.f10197f = obj;
                        }
                        i21 = i12;
                        c7 = ' ';
                        c1588g02 = c1588g0;
                        truncateAt = truncateAt2;
                        m2547a = m2547a(i19, i14, truncateAt, i7, i21, i15, i29, i20, charSequence4);
                        Layout layout22 = m2547a.f10797f;
                        i22 = i19;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        c1575a = this;
                        i23 = i7;
                        i24 = i22;
                        i25 = 2;
                        int i322 = m2547a.f10798g;
                        if (i8 != i25) {
                        }
                        c1575a.f10195d = m2547a;
                        c1575a.f10192a.f14838g.m4437c(c1588g02.f10242a.mo4718c(), (Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7), c1588g02.f10242a.mo4716a());
                        layout = c1575a.f10195d.f10797f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        c2985bArr = null;
                        if (c2985bArr != null) {
                        }
                        charSequence2 = c1575a.f10196e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        c1575a.f10197f = obj;
                    }
                }
                c1588g0 = c1588g03;
                i19 = i10;
                i20 = i9;
                if (i8 != i18) {
                }
                i21 = i12;
                c7 = ' ';
                c1588g02 = c1588g0;
                truncateAt = truncateAt2;
                m2547a = m2547a(i19, i14, truncateAt, i7, i21, i15, i29, i20, charSequence4);
                Layout layout222 = m2547a.f10797f;
                i22 = i19;
                if (Build.VERSION.SDK_INT < 35) {
                }
                c1575a = this;
                i23 = i7;
                i24 = i22;
                i25 = 2;
                int i3222 = m2547a.f10798g;
                if (i8 != i25) {
                }
                c1575a.f10195d = m2547a;
                c1575a.f10192a.f14838g.m4437c(c1588g02.f10242a.mo4718c(), (Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7), c1588g02.f10242a.mo4716a());
                layout = c1575a.f10195d.f10797f;
                if (layout.getText() instanceof Spanned) {
                }
                c2985bArr = null;
                if (c2985bArr != null) {
                }
                charSequence2 = c1575a.f10196e;
                if (charSequence2 instanceof Spanned) {
                }
                c1575a.f10197f = obj;
            }
            i29 = i9;
            i17 = (i13 >> 16) & 255;
            if (i17 == 1) {
            }
            c1588g0 = c1588g03;
            i19 = i10;
            i20 = i9;
            if (i8 != i18) {
            }
            i21 = i12;
            c7 = ' ';
            c1588g02 = c1588g0;
            truncateAt = truncateAt2;
            m2547a = m2547a(i19, i14, truncateAt, i7, i21, i15, i29, i20, charSequence4);
            Layout layout2222 = m2547a.f10797f;
            i22 = i19;
            if (Build.VERSION.SDK_INT < 35) {
            }
            c1575a = this;
            i23 = i7;
            i24 = i22;
            i25 = 2;
            int i32222 = m2547a.f10798g;
            if (i8 != i25) {
            }
            c1575a.f10195d = m2547a;
            c1575a.f10192a.f14838g.m4437c(c1588g02.f10242a.mo4718c(), (Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7), c1588g02.f10242a.mo4716a());
            layout = c1575a.f10195d.f10797f;
            if (layout.getText() instanceof Spanned) {
            }
            c2985bArr = null;
            if (c2985bArr != null) {
            }
            charSequence2 = c1575a.f10196e;
            if (charSequence2 instanceof Spanned) {
            }
            c1575a.f10197f = obj;
        }
        i13 = i30;
        i14 = i11;
        i15 = i9;
        i16 = (i13 >> 8) & 255;
        if (i16 != 1) {
        }
        i29 = i9;
        i17 = (i13 >> 16) & 255;
        if (i17 == 1) {
        }
        c1588g0 = c1588g03;
        i19 = i10;
        i20 = i9;
        if (i8 != i18) {
        }
        i21 = i12;
        c7 = ' ';
        c1588g02 = c1588g0;
        truncateAt = truncateAt2;
        m2547a = m2547a(i19, i14, truncateAt, i7, i21, i15, i29, i20, charSequence4);
        Layout layout22222 = m2547a.f10797f;
        i22 = i19;
        if (Build.VERSION.SDK_INT < 35) {
        }
        c1575a = this;
        i23 = i7;
        i24 = i22;
        i25 = 2;
        int i322222 = m2547a.f10798g;
        if (i8 != i25) {
        }
        c1575a.f10195d = m2547a;
        c1575a.f10192a.f14838g.m4437c(c1588g02.f10242a.mo4718c(), (Float.floatToRawIntBits(c1575a.m2548b()) & 4294967295L) | (Float.floatToRawIntBits(c1575a.m2550d()) << c7), c1588g02.f10242a.mo4716a());
        layout = c1575a.f10195d.f10797f;
        if (layout.getText() instanceof Spanned) {
        }
        c2985bArr = null;
        if (c2985bArr != null) {
        }
        charSequence2 = c1575a.f10196e;
        if (charSequence2 instanceof Spanned) {
        }
        c1575a.f10197f = obj;
    }

    /* renamed from: a */
    public final C1773j m2547a(int i7, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        boolean z7;
        C1615x c1615x;
        float m2550d = m2550d();
        C2807d c2807d = this.f10192a;
        C2809f c2809f = c2807d.f14838g;
        int i14 = c2807d.f14843l;
        C1769f c1769f = c2807d.f14840i;
        C1604o0 c1604o0 = c2807d.f14833b;
        C2804a c2804a = AbstractC2805b.f14830a;
        C1617z c1617z = c1604o0.f10311c;
        if (c1617z != null && (c1615x = c1617z.f10354b) != null) {
            z7 = c1615x.f10351a;
        } else {
            z7 = false;
        }
        return new C1773j(charSequence, m2550d, c2809f, i7, truncateAt, i14, z7, i9, i11, i12, i13, i10, i8, c1769f);
    }

    /* renamed from: b */
    public final float m2548b() {
        return this.f10195d.m2928a();
    }

    /* JADX WARN: Type inference failed for: r13v26, types: [h2.a] */
    /* renamed from: c */
    public final long m2549c(C0465c c0465c, int i7, C0625q c0625q) {
        boolean z7;
        InterfaceC2063d c2062c;
        int i8;
        int[] iArr;
        SegmentFinder m740l;
        RectF m1425y = AbstractC0659i0.m1425y(c0465c);
        if (i7 != 0 && i7 == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        final C0453t c0453t = new C0453t(10, c0625q);
        C1773j c1773j = this.f10195d;
        TextPaint textPaint = c1773j.f10792a;
        Layout layout = c1773j.f10797f;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            if (z7) {
                m740l = new C2060a(new C0068q2(10, layout.getText(), c1773j.m2937j()));
            } else {
                AbstractC0344n.m744p();
                m740l = AbstractC0344n.m740l(AbstractC0344n.m739k(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(m1425y, m740l, new Layout.TextInclusionStrategy() { // from class: h2.a
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) C0453t.this.mo22d(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C1609r m2930c = c1773j.m2930c();
            if (z7) {
                c2062c = new C0068q2(10, layout.getText(), c1773j.m2937j());
            } else {
                CharSequence text = layout.getText();
                if (i9 >= 29) {
                    c2062c = new C2061b(text, textPaint);
                } else {
                    c2062c = new C2062c(text);
                }
            }
            InterfaceC2063d interfaceC2063d = c2062c;
            int lineForVertical = layout.getLineForVertical((int) m1425y.top);
            if (m1425y.top <= c1773j.m2932e(lineForVertical) || (lineForVertical = lineForVertical + 1) < c1773j.f10798g) {
                int i10 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) m1425y.bottom);
                if (lineForVertical2 != 0 || m1425y.bottom >= c1773j.m2934g(0)) {
                    int m2926e = AbstractC1770g.m2926e(c1773j, layout, m2930c, i10, m1425y, interfaceC2063d, c0453t, true);
                    while (true) {
                        i8 = i10;
                        if (m2926e != -1 || i8 >= lineForVertical2) {
                            break;
                        }
                        i10 = i8 + 1;
                        m2926e = AbstractC1770g.m2926e(c1773j, layout, m2930c, i10, m1425y, interfaceC2063d, c0453t, true);
                    }
                    if (m2926e != -1) {
                        int i11 = lineForVertical2;
                        int m2926e2 = AbstractC1770g.m2926e(c1773j, layout, m2930c, i11, m1425y, interfaceC2063d, c0453t, false);
                        while (m2926e2 == -1 && i8 < i11) {
                            i11--;
                            m2926e2 = AbstractC1770g.m2926e(c1773j, layout, m2930c, i11, m1425y, interfaceC2063d, c0453t, false);
                        }
                        if (m2926e2 != -1) {
                            iArr = new int[]{interfaceC2063d.mo144h(m2926e + 1), interfaceC2063d.mo146j(m2926e2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return C1602n0.f10302b;
        }
        return AbstractC1586f0.m2558b(iArr[0], iArr[1]);
    }

    /* renamed from: d */
    public final float m2550d() {
        return C3091a.m4760h(this.f10194c);
    }

    /* renamed from: e */
    public final void m2551e(InterfaceC0674q interfaceC0674q) {
        Canvas m1349a = AbstractC0646c.m1349a(interfaceC0674q);
        C1773j c1773j = this.f10195d;
        if (c1773j.f10795d) {
            m1349a.save();
            m1349a.clipRect(0.0f, 0.0f, m2550d(), m2548b());
        }
        int i7 = c1773j.f10799h;
        if (m1349a.getClipBounds(c1773j.f10807p)) {
            if (i7 != 0) {
                m1349a.translate(0.0f, i7);
            }
            C1772i c1772i = AbstractC1774k.f10809a;
            c1772i.f10791a = m1349a;
            c1773j.f10797f.draw(c1772i);
            if (i7 != 0) {
                m1349a.translate(0.0f, (-1) * i7);
            }
        }
        if (c1773j.f10795d) {
            m1349a.restore();
        }
    }

    /* renamed from: f */
    public final void m2552f(InterfaceC0674q interfaceC0674q, long j6, C0665l0 c0665l0, C3038l c3038l, AbstractC1571e abstractC1571e) {
        C2809f c2809f = this.f10192a.f14838g;
        int i7 = c2809f.f14848c;
        c2809f.m4438d(j6);
        c2809f.m4440f(c0665l0);
        c2809f.m4441g(c3038l);
        c2809f.m4439e(abstractC1571e);
        c2809f.m4436b(3);
        m2551e(interfaceC0674q);
        c2809f.m4436b(i7);
    }

    /* renamed from: g */
    public final void m2553g(InterfaceC0674q interfaceC0674q, AbstractC0670o abstractC0670o, float f7, C0665l0 c0665l0, C3038l c3038l, AbstractC1571e abstractC1571e) {
        C2809f c2809f = this.f10192a.f14838g;
        int i7 = c2809f.f14848c;
        float m2550d = m2550d();
        float m2548b = m2548b();
        c2809f.m4437c(abstractC0670o, (Float.floatToRawIntBits(m2548b) & 4294967295L) | (Float.floatToRawIntBits(m2550d) << 32), f7);
        c2809f.m4440f(c0665l0);
        c2809f.m4441g(c3038l);
        c2809f.m4439e(abstractC1571e);
        c2809f.m4436b(3);
        m2551e(interfaceC0674q);
        c2809f.m4436b(i7);
    }
}
