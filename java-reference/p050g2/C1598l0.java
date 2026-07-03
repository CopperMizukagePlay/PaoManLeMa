package p050g2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import p001a0.AbstractC0094y0;
import p027d1.C0465c;
import p035e1.AbstractC0664l;
import p035e1.C0660j;
import p053g5.C1694m;
import p058h2.AbstractC1774k;
import p058h2.C1772i;
import p058h2.C1773j;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p065i2.C2065f;
import p092m.AbstractC2487d;
import p095m2.AbstractC2550a;
import p132r2.EnumC3036j;
import p140s2.C3102l;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.l0 */
/* loaded from: classes.dex */
public final class C1598l0 {

    /* renamed from: a */
    public final C1596k0 f10288a;

    /* renamed from: b */
    public final C1605p f10289b;

    /* renamed from: c */
    public final long f10290c;

    /* renamed from: d */
    public final float f10291d;

    /* renamed from: e */
    public final float f10292e;

    /* renamed from: f */
    public final ArrayList f10293f;

    public C1598l0(C1596k0 c1596k0, C1605p c1605p, long j6) {
        float m2931d;
        this.f10288a = c1596k0;
        this.f10289b = c1605p;
        this.f10290c = j6;
        ArrayList arrayList = c1605p.f10319h;
        float f7 = 0.0f;
        if (arrayList.isEmpty()) {
            m2931d = 0.0f;
        } else {
            m2931d = ((C1610s) arrayList.get(0)).f10329a.f10195d.m2931d(0);
        }
        this.f10291d = m2931d;
        if (!arrayList.isEmpty()) {
            C1610s c1610s = (C1610s) AbstractC1805m.m3052p0(arrayList);
            f7 = c1610s.f10329a.f10195d.m2931d(r4.f10798g - 1) + c1610s.f10334f;
        }
        this.f10292e = f7;
        this.f10293f = c1605p.f10318g;
    }

    /* renamed from: a */
    public final EnumC3036j m2574a(int i7) {
        int m2560d;
        C1605p c1605p = this.f10289b;
        ArrayList arrayList = c1605p.f10319h;
        c1605p.m2605i(i7);
        if (i7 == ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
            m2560d = AbstractC1806n.m3066N(arrayList);
        } else {
            m2560d = AbstractC1586f0.m2560d(i7, arrayList);
        }
        C1610s c1610s = (C1610s) arrayList.get(m2560d);
        C1575a c1575a = c1610s.f10329a;
        if (c1575a.f10195d.f10797f.isRtlCharAt(c1610s.m2620d(i7))) {
            return EnumC3036j.f15601f;
        }
        return EnumC3036j.f15600e;
    }

    /* renamed from: b */
    public final C0465c m2575b(int i7) {
        boolean z7;
        float m2936i;
        float m2936i2;
        float m2935h;
        float m2935h2;
        C1605p c1605p = this.f10289b;
        c1605p.m2604h(i7);
        ArrayList arrayList = c1605p.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2560d(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        int m2620d = c1610s.m2620d(i7);
        CharSequence charSequence = c1575a.f10196e;
        if (m2620d < 0 || m2620d >= charSequence.length()) {
            StringBuilder m188o = AbstractC0094y0.m188o(m2620d, "offset(", ") is out of bounds [0,");
            m188o.append(charSequence.length());
            m188o.append(')');
            AbstractC2550a.m4078a(m188o.toString());
        }
        C1773j c1773j = c1575a.f10195d;
        Layout layout = c1773j.f10797f;
        int lineForOffset = layout.getLineForOffset(m2620d);
        float m2934g = c1773j.m2934g(lineForOffset);
        float m2932e = c1773j.m2932e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(m2620d);
        if (z7 && !isRtlCharAt) {
            m2936i = c1773j.m2935h(m2620d, false);
            m2936i2 = c1773j.m2935h(m2620d + 1, true);
        } else {
            if (z7 && isRtlCharAt) {
                m2935h = c1773j.m2936i(m2620d, false);
                m2935h2 = c1773j.m2936i(m2620d + 1, true);
            } else if (isRtlCharAt) {
                m2935h = c1773j.m2935h(m2620d, false);
                m2935h2 = c1773j.m2935h(m2620d + 1, true);
            } else {
                m2936i = c1773j.m2936i(m2620d, false);
                m2936i2 = c1773j.m2936i(m2620d + 1, true);
            }
            float f7 = m2935h;
            m2936i = m2935h2;
            m2936i2 = f7;
        }
        RectF rectF = new RectF(m2936i, m2934g, m2936i2, m2932e);
        return c1610s.m2617a(new C0465c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* renamed from: c */
    public final C0465c m2576c(int i7) {
        int m2560d;
        C1605p c1605p = this.f10289b;
        ArrayList arrayList = c1605p.f10319h;
        c1605p.m2605i(i7);
        if (i7 == ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
            m2560d = AbstractC1806n.m3066N(arrayList);
        } else {
            m2560d = AbstractC1586f0.m2560d(i7, arrayList);
        }
        C1610s c1610s = (C1610s) arrayList.get(m2560d);
        C1575a c1575a = c1610s.f10329a;
        int m2620d = c1610s.m2620d(i7);
        CharSequence charSequence = c1575a.f10196e;
        C1773j c1773j = c1575a.f10195d;
        if (m2620d < 0 || m2620d > charSequence.length()) {
            StringBuilder m188o = AbstractC0094y0.m188o(m2620d, "offset(", ") is out of bounds [0,");
            m188o.append(charSequence.length());
            m188o.append(']');
            AbstractC2550a.m4078a(m188o.toString());
        }
        float m2935h = c1773j.m2935h(m2620d, false);
        int lineForOffset = c1773j.f10797f.getLineForOffset(m2620d);
        return c1610s.m2617a(new C0465c(m2935h, c1773j.m2934g(lineForOffset), m2935h, c1773j.m2932e(lineForOffset)));
    }

    /* renamed from: d */
    public final int m2577d(int i7, boolean z7) {
        int m2933f;
        C1605p c1605p = this.f10289b;
        c1605p.m2606j(i7);
        ArrayList arrayList = c1605p.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        int i8 = i7 - c1610s.f10332d;
        C1773j c1773j = c1575a.f10195d;
        if (z7) {
            Layout layout = c1773j.f10797f;
            C1772i c1772i = AbstractC1774k.f10809a;
            if (layout.getEllipsisCount(i8) > 0 && c1773j.f10793b == TextUtils.TruncateAt.END) {
                m2933f = layout.getEllipsisStart(i8) + layout.getLineStart(i8);
            } else {
                C1609r m2930c = c1773j.m2930c();
                Layout layout2 = (Layout) m2930c.f10325b;
                m2933f = m2930c.m2615i(layout2.getLineEnd(i8), layout2.getLineStart(i8));
            }
        } else {
            m2933f = c1773j.m2933f(i8);
        }
        return m2933f + c1610s.f10330b;
    }

    /* renamed from: e */
    public final int m2578e(int i7) {
        int m2560d;
        C1605p c1605p = this.f10289b;
        ArrayList arrayList = c1605p.f10319h;
        if (i7 >= ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
            m2560d = AbstractC1806n.m3066N(arrayList);
        } else if (i7 < 0) {
            m2560d = 0;
        } else {
            m2560d = AbstractC1586f0.m2560d(i7, arrayList);
        }
        C1610s c1610s = (C1610s) arrayList.get(m2560d);
        C1575a c1575a = c1610s.f10329a;
        return c1575a.f10195d.f10797f.getLineForOffset(c1610s.m2620d(i7)) + c1610s.f10332d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1598l0) {
                C1598l0 c1598l0 = (C1598l0) obj;
                if (AbstractC3367j.m5096a(this.f10288a, c1598l0.f10288a) && this.f10289b.equals(c1598l0.f10289b) && C3102l.m4790a(this.f10290c, c1598l0.f10290c) && this.f10291d == c1598l0.f10291d && this.f10292e == c1598l0.f10292e && AbstractC3367j.m5096a(this.f10293f, c1598l0.f10293f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final float m2579f(int i7) {
        float f7;
        C1605p c1605p = this.f10289b;
        c1605p.m2606j(i7);
        ArrayList arrayList = c1605p.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        int i8 = i7 - c1610s.f10332d;
        C1773j c1773j = c1575a.f10195d;
        float lineLeft = c1773j.f10797f.getLineLeft(i8);
        if (i8 == c1773j.f10798g - 1) {
            f7 = c1773j.f10801j;
        } else {
            f7 = 0.0f;
        }
        return lineLeft + f7;
    }

    /* renamed from: g */
    public final float m2580g(int i7) {
        float f7;
        C1605p c1605p = this.f10289b;
        c1605p.m2606j(i7);
        ArrayList arrayList = c1605p.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        int i8 = i7 - c1610s.f10332d;
        C1773j c1773j = c1575a.f10195d;
        float lineRight = c1773j.f10797f.getLineRight(i8);
        if (i8 == c1773j.f10798g - 1) {
            f7 = c1773j.f10802k;
        } else {
            f7 = 0.0f;
        }
        return lineRight + f7;
    }

    /* renamed from: h */
    public final int m2581h(int i7) {
        C1605p c1605p = this.f10289b;
        c1605p.m2606j(i7);
        ArrayList arrayList = c1605p.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        return c1575a.f10195d.f10797f.getLineStart(i7 - c1610s.f10332d) + c1610s.f10330b;
    }

    public final int hashCode() {
        return this.f10293f.hashCode() + AbstractC2487d.m4038b(this.f10292e, AbstractC2487d.m4038b(this.f10291d, AbstractC2487d.m4039c((this.f10289b.hashCode() + (this.f10288a.hashCode() * 31)) * 31, 31, this.f10290c), 31), 31);
    }

    /* renamed from: i */
    public final EnumC3036j m2582i(int i7) {
        int m2560d;
        C1605p c1605p = this.f10289b;
        ArrayList arrayList = c1605p.f10319h;
        c1605p.m2605i(i7);
        if (i7 == ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
            m2560d = AbstractC1806n.m3066N(arrayList);
        } else {
            m2560d = AbstractC1586f0.m2560d(i7, arrayList);
        }
        C1610s c1610s = (C1610s) arrayList.get(m2560d);
        C1575a c1575a = c1610s.f10329a;
        int m2620d = c1610s.m2620d(i7);
        C1773j c1773j = c1575a.f10195d;
        if (c1773j.f10797f.getParagraphDirection(c1773j.f10797f.getLineForOffset(m2620d)) == 1) {
            return EnumC3036j.f15600e;
        }
        return EnumC3036j.f15601f;
    }

    /* renamed from: j */
    public final C0660j m2583j(final int i7, final int i8) {
        C1605p c1605p = this.f10289b;
        C1587g c1587g = (C1587g) c1605p.f10312a.f10325b;
        if (i7 < 0 || i7 > i8 || i8 > c1587g.f10239f.length()) {
            AbstractC2550a.m4078a("Start(" + i7 + ") or End(" + i8 + ") is out of range [0.." + c1587g.f10239f.length() + "), or start > end!");
        }
        if (i7 == i8) {
            return AbstractC0664l.m1445a();
        }
        final C0660j m1445a = AbstractC0664l.m1445a();
        AbstractC1586f0.m2563g(c1605p.f10319h, AbstractC1586f0.m2558b(i7, i8), new InterfaceC3279c() { // from class: g2.o
            @Override // p150t5.InterfaceC3279c
            /* renamed from: f */
            public final Object mo23f(Object obj) {
                C1610s c1610s = (C1610s) obj;
                C1575a c1575a = c1610s.f10329a;
                int m2620d = c1610s.m2620d(i7);
                int m2620d2 = c1610s.m2620d(i8);
                CharSequence charSequence = c1575a.f10196e;
                if (m2620d < 0 || m2620d > m2620d2 || m2620d2 > charSequence.length()) {
                    AbstractC2550a.m4078a("start(" + m2620d + ") or end(" + m2620d2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                C1773j c1773j = c1575a.f10195d;
                c1773j.f10797f.getSelectionPath(m2620d, m2620d2, path);
                int i9 = c1773j.f10799h;
                if (i9 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i9);
                }
                float f7 = c1610s.f10334f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                C0660j.this.f2151a.addPath(path, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
                return C1694m.f10482a;
            }
        });
        return m1445a;
    }

    /* renamed from: k */
    public final long m2584k(int i7) {
        int m2560d;
        int i8;
        int i9;
        int m3269i;
        C1605p c1605p = this.f10289b;
        ArrayList arrayList = c1605p.f10319h;
        c1605p.m2605i(i7);
        if (i7 == ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
            m2560d = AbstractC1806n.m3066N(arrayList);
        } else {
            m2560d = AbstractC1586f0.m2560d(i7, arrayList);
        }
        C1610s c1610s = (C1610s) arrayList.get(m2560d);
        C1575a c1575a = c1610s.f10329a;
        int m2620d = c1610s.m2620d(i7);
        C2065f m2937j = c1575a.f10195d.m2937j();
        if (m2937j.m3268h(m2937j.m3270j(m2620d))) {
            m2937j.m3261a(m2620d);
            i8 = m2620d;
            while (i8 != -1 && (!m2937j.m3268h(i8) || m2937j.m3264d(i8))) {
                i8 = m2937j.m3270j(i8);
            }
        } else {
            m2937j.m3261a(m2620d);
            if (m2937j.m3267g(m2620d)) {
                if (m2937j.m3265e(m2620d) && !m2937j.m3263c(m2620d)) {
                    i8 = m2620d;
                } else {
                    i8 = m2937j.m3270j(m2620d);
                }
            } else if (m2937j.m3263c(m2620d)) {
                i8 = m2937j.m3270j(m2620d);
            } else {
                i8 = -1;
            }
        }
        if (i8 == -1) {
            i8 = m2620d;
        }
        if (m2937j.m3264d(m2937j.m3269i(m2620d))) {
            m2937j.m3261a(m2620d);
            i9 = m2620d;
            while (i9 != -1 && (m2937j.m3268h(i9) || !m2937j.m3264d(i9))) {
                i9 = m2937j.m3269i(i9);
            }
        } else {
            m2937j.m3261a(m2620d);
            if (m2937j.m3263c(m2620d)) {
                if (m2937j.m3265e(m2620d) && !m2937j.m3267g(m2620d)) {
                    i9 = m2620d;
                } else {
                    m3269i = m2937j.m3269i(m2620d);
                    i9 = m3269i;
                }
            } else if (m2937j.m3267g(m2620d)) {
                m3269i = m2937j.m3269i(m2620d);
                i9 = m3269i;
            } else {
                i9 = -1;
            }
        }
        if (i9 != -1) {
            m2620d = i9;
        }
        return c1610s.m2618b(AbstractC1586f0.m2558b(i8, m2620d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f10288a + ", multiParagraph=" + this.f10289b + ", size=" + ((Object) C3102l.m4791b(this.f10290c)) + ", firstBaseline=" + this.f10291d + ", lastBaseline=" + this.f10292e + ", placeholderRects=" + this.f10293f + ')';
    }
}
