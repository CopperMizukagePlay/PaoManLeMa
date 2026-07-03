package p050g2;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p020c2.C0387g;
import p027d1.C0465c;
import p034e0.C0625q;
import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0671o0;
import p035e1.C0672p;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1571e;
import p053g5.C1694m;
import p058h2.C1773j;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1811s;
import p095m2.AbstractC2550a;
import p110o2.AbstractC2814k;
import p110o2.C2807d;
import p132r2.C3038l;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p150t5.InterfaceC3279c;
import p158u5.C3376s;
import p158u5.C3377t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.p */
/* loaded from: classes.dex */
public final class C1605p {

    /* renamed from: a */
    public final C1609r f10312a;

    /* renamed from: b */
    public final int f10313b;

    /* renamed from: c */
    public final boolean f10314c;

    /* renamed from: d */
    public final float f10315d;

    /* renamed from: e */
    public final float f10316e;

    /* renamed from: f */
    public final int f10317f;

    /* renamed from: g */
    public final ArrayList f10318g;

    /* renamed from: h */
    public final ArrayList f10319h;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public C1605p(C1609r c1609r, long j6, int i7, boolean z7) {
        int i8;
        int i9;
        C0465c c0465c;
        int m4759g;
        boolean z8 = true;
        if (z7) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        this.f10312a = c1609r;
        this.f10313b = i7;
        if (C3091a.m4762j(j6) != 0 || C3091a.m4761i(j6) != 0) {
            AbstractC2550a.m4078a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1609r.f10324a;
        int size = arrayList2.size();
        float f7 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1611t c1611t = (C1611t) arrayList2.get(i10);
            C2807d c2807d = c1611t.f10336a;
            int m4760h = C3091a.m4760h(j6);
            if (C3091a.m4755c(j6)) {
                m4759g = C3091a.m4759g(j6) - ((int) Math.ceil(f7));
                if (m4759g < 0) {
                    m4759g = 0;
                }
            } else {
                m4759g = C3091a.m4759g(j6);
            }
            C1575a c1575a = new C1575a(c2807d, this.f10313b - i11, i8, AbstractC3092b.m4765b(m4760h, m4759g, 5));
            float m2548b = c1575a.m2548b() + f7;
            C1773j c1773j = c1575a.f10195d;
            int i12 = i11 + c1773j.f10798g;
            int i13 = c1611t.f10337b;
            int i14 = c1611t.f10338c;
            int i15 = i10;
            C1610s c1610s = new C1610s(c1575a, i13, i14, i11, i12, f7, m2548b);
            i9 = i12;
            arrayList.add(c1610s);
            if (!c1773j.f10795d && (i9 != this.f10313b || i15 == AbstractC1806n.m3066N((ArrayList) this.f10312a.f10324a))) {
                i10 = i15 + 1;
                i11 = i9;
                f7 = m2548b;
            } else {
                f7 = m2548b;
                break;
            }
        }
        z8 = false;
        i9 = i11;
        this.f10316e = f7;
        this.f10317f = i9;
        this.f10314c = z8;
        this.f10319h = arrayList;
        this.f10315d = C3091a.m4760h(j6);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            C1610s c1610s2 = (C1610s) arrayList.get(i16);
            ?? r7 = c1610s2.f10329a.f10197f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i17 = 0; i17 < size3; i17++) {
                C0465c c0465c2 = (C0465c) r7.get(i17);
                if (c0465c2 != null) {
                    c0465c = c1610s2.m2617a(c0465c2);
                } else {
                    c0465c = null;
                }
                arrayList4.add(c0465c);
            }
            AbstractC1811s.m3076X(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f10312a.f10326c).size()) {
            int size4 = ((List) this.f10312a.f10326c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC1805m.m3058v0(arrayList3, arrayList5);
        }
        this.f10318g = arrayList3;
    }

    /* renamed from: g */
    public static void m2597g(C1605p c1605p, InterfaceC0674q interfaceC0674q, AbstractC0670o abstractC0670o, float f7, C0665l0 c0665l0, C3038l c3038l, AbstractC1571e abstractC1571e) {
        interfaceC0674q.mo1341m();
        ArrayList arrayList = c1605p.f10319h;
        if (arrayList.size() <= 1) {
            AbstractC2814k.m4442a(c1605p, interfaceC0674q, abstractC0670o, f7, c0665l0, c3038l, abstractC1571e);
        } else if (abstractC0670o instanceof C0671o0) {
            AbstractC2814k.m4442a(c1605p, interfaceC0674q, abstractC0670o, f7, c0665l0, c3038l, abstractC1571e);
        } else if (abstractC0670o instanceof AbstractC0663k0) {
            int size = arrayList.size();
            float f8 = 0.0f;
            float f9 = 0.0f;
            for (int i7 = 0; i7 < size; i7++) {
                C1610s c1610s = (C1610s) arrayList.get(i7);
                f9 += c1610s.f10329a.m2548b();
                f8 = Math.max(f8, c1610s.f10329a.m2550d());
            }
            Shader mo1348b = ((AbstractC0663k0) abstractC0670o).mo1348b((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L));
            Matrix matrix = new Matrix();
            mo1348b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                C1575a c1575a = ((C1610s) arrayList.get(i8)).f10329a;
                c1575a.m2553g(interfaceC0674q, new C0672p(mo1348b), f7, c0665l0, c3038l, abstractC1571e);
                interfaceC0674q.mo1336h(0.0f, c1575a.m2548b());
                matrix.setTranslate(0.0f, -c1575a.m2548b());
                mo1348b.setLocalMatrix(matrix);
            }
        } else {
            throw new RuntimeException();
        }
        interfaceC0674q.mo1338j();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [u5.s, java.lang.Object] */
    /* renamed from: a */
    public final void m2598a(final long j6, final float[] fArr) {
        m2604h(C1602n0.m2589e(j6));
        m2605i(C1602n0.m2588d(j6));
        final ?? obj = new Object();
        obj.f16449e = 0;
        final ?? obj2 = new Object();
        AbstractC1586f0.m2563g(this.f10319h, j6, new InterfaceC3279c() { // from class: g2.n
            @Override // p150t5.InterfaceC3279c
            /* renamed from: f */
            public final Object mo23f(Object obj3) {
                int m2589e;
                long j7;
                C1575a c1575a;
                boolean z7;
                boolean z8;
                float m856a;
                float m856a2;
                C1610s c1610s = (C1610s) obj3;
                int i7 = c1610s.f10330b;
                C1575a c1575a2 = c1610s.f10329a;
                int i8 = c1610s.f10331c;
                long j8 = j6;
                if (i7 > C1602n0.m2589e(j8)) {
                    m2589e = c1610s.f10330b;
                } else {
                    m2589e = C1602n0.m2589e(j8);
                }
                if (i8 >= C1602n0.m2588d(j8)) {
                    i8 = C1602n0.m2588d(j8);
                }
                long m2558b = AbstractC1586f0.m2558b(c1610s.m2620d(m2589e), c1610s.m2620d(i8));
                C3377t c3377t = obj;
                int i9 = c3377t.f16449e;
                C1773j c1773j = c1575a2.f10195d;
                int m2589e2 = C1602n0.m2589e(m2558b);
                int m2588d = C1602n0.m2588d(m2558b);
                Layout layout = c1773j.f10797f;
                int length = layout.getText().length();
                if (m2589e2 < 0) {
                    AbstractC2550a.m4078a("startOffset must be > 0");
                }
                if (m2589e2 >= length) {
                    AbstractC2550a.m4078a("startOffset must be less than text length");
                }
                if (m2588d <= m2589e2) {
                    AbstractC2550a.m4078a("endOffset must be greater than startOffset");
                }
                if (m2588d > length) {
                    AbstractC2550a.m4078a("endOffset must be smaller or equal to text length");
                }
                int i10 = (m2588d - m2589e2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i9 < i10) {
                    AbstractC2550a.m4078a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(m2589e2);
                int lineForOffset2 = layout.getLineForOffset(m2588d - 1);
                C0387g c0387g = new C0387g(c1773j);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int m2933f = c1773j.m2933f(lineForOffset);
                        int max = Math.max(m2589e2, lineStart);
                        int min = Math.min(m2588d, m2933f);
                        float m2934g = c1773j.m2934g(lineForOffset);
                        float m2932e = c1773j.m2932e(lineForOffset);
                        j7 = m2558b;
                        c1575a = c1575a2;
                        boolean z9 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z7 && !isRtlCharAt) {
                                m856a = c0387g.m856a(max, z9, z9, true);
                                z8 = z7;
                                m856a2 = c0387g.m856a(max + 1, true, true, true);
                            } else {
                                if (z7 && isRtlCharAt) {
                                    z9 = false;
                                    float m856a3 = c0387g.m856a(max, false, false, false);
                                    z8 = z7;
                                    m856a = c0387g.m856a(max + 1, true, true, false);
                                    m856a2 = m856a3;
                                } else {
                                    z8 = z7;
                                    z9 = false;
                                    if (!z8 && isRtlCharAt) {
                                        m856a2 = c0387g.m856a(max, false, false, true);
                                        m856a = c0387g.m856a(max + 1, true, true, true);
                                    } else {
                                        m856a = c0387g.m856a(max, false, false, false);
                                        m856a2 = c0387g.m856a(max + 1, true, true, false);
                                    }
                                }
                                fArr2[i9] = m856a;
                                fArr2[i9 + 1] = m2934g;
                                fArr2[i9 + 2] = m856a2;
                                fArr2[i9 + 3] = m2932e;
                                i9 += 4;
                                max++;
                                z7 = z8;
                            }
                            z9 = false;
                            fArr2[i9] = m856a;
                            fArr2[i9 + 1] = m2934g;
                            fArr2[i9 + 2] = m856a2;
                            fArr2[i9 + 3] = m2932e;
                            i9 += 4;
                            max++;
                            z7 = z8;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        c1575a2 = c1575a;
                        m2558b = j7;
                    }
                } else {
                    j7 = m2558b;
                    c1575a = c1575a2;
                }
                int m2587c = (C1602n0.m2587c(j7) * 4) + c3377t.f16449e;
                int i11 = c3377t.f16449e;
                while (true) {
                    C3376s c3376s = obj2;
                    if (i11 < m2587c) {
                        int i12 = i11 + 1;
                        float f7 = fArr2[i12];
                        float f8 = c3376s.f16448e;
                        fArr2[i12] = f7 + f8;
                        int i13 = i11 + 3;
                        fArr2[i13] = fArr2[i13] + f8;
                        i11 += 4;
                    } else {
                        c3377t.f16449e = m2587c;
                        c3376s.f16448e = c1575a.m2548b() + c3376s.f16448e;
                        return C1694m.f10482a;
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final float m2599b(int i7) {
        m2606j(i7);
        ArrayList arrayList = this.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        return c1575a.f10195d.m2932e(i7 - c1610s.f10332d) + c1610s.f10334f;
    }

    /* renamed from: c */
    public final int m2600c(float f7) {
        ArrayList arrayList = this.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2562f(arrayList, f7));
        int i7 = c1610s.f10331c - c1610s.f10330b;
        int i8 = c1610s.f10332d;
        if (i7 == 0) {
            return i8;
        }
        C1575a c1575a = c1610s.f10329a;
        float f8 = f7 - c1610s.f10334f;
        C1773j c1773j = c1575a.f10195d;
        return c1773j.f10797f.getLineForVertical(((int) f8) - c1773j.f10799h) + i8;
    }

    /* renamed from: d */
    public final float m2601d(int i7) {
        m2606j(i7);
        ArrayList arrayList = this.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2561e(i7, arrayList));
        C1575a c1575a = c1610s.f10329a;
        return c1575a.f10195d.m2934g(i7 - c1610s.f10332d) + c1610s.f10334f;
    }

    /* renamed from: e */
    public final int m2602e(long j6) {
        int i7 = (int) (j6 & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i7);
        ArrayList arrayList = this.f10319h;
        C1610s c1610s = (C1610s) arrayList.get(AbstractC1586f0.m2562f(arrayList, intBitsToFloat));
        int i8 = c1610s.f10331c;
        int i9 = c1610s.f10330b;
        if (i8 - i9 == 0) {
            return i9;
        }
        C1575a c1575a = c1610s.f10329a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i7) - c1610s.f10334f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        C1773j c1773j = c1575a.f10195d;
        int lineForVertical = c1773j.f10797f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - c1773j.f10799h);
        return c1773j.f10797f.getOffsetForHorizontal(lineForVertical, (c1773j.m2929b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i9;
    }

    /* renamed from: f */
    public final long m2603f(C0465c c0465c, int i7, C0625q c0625q) {
        long j6;
        long j7;
        float f7 = c0465c.f1626b;
        ArrayList arrayList = this.f10319h;
        int m2562f = AbstractC1586f0.m2562f(arrayList, f7);
        float f8 = ((C1610s) arrayList.get(m2562f)).f10335g;
        float f9 = c0465c.f1628d;
        if (f8 < f9 && m2562f != AbstractC1806n.m3066N(arrayList)) {
            int m2562f2 = AbstractC1586f0.m2562f(arrayList, f9);
            long j8 = C1602n0.f10302b;
            while (true) {
                j6 = C1602n0.f10302b;
                if (!C1602n0.m2585a(j8, j6) || m2562f > m2562f2) {
                    break;
                }
                C1610s c1610s = (C1610s) arrayList.get(m2562f);
                j8 = c1610s.m2618b(c1610s.f10329a.m2549c(c1610s.m2619c(c0465c), i7, c0625q), true);
                m2562f++;
            }
            if (C1602n0.m2585a(j8, j6)) {
                return j6;
            }
            while (true) {
                j7 = C1602n0.f10302b;
                if (!C1602n0.m2585a(j6, j7) || m2562f > m2562f2) {
                    break;
                }
                C1610s c1610s2 = (C1610s) arrayList.get(m2562f2);
                j6 = c1610s2.m2618b(c1610s2.f10329a.m2549c(c1610s2.m2619c(c0465c), i7, c0625q), true);
                m2562f2--;
            }
            if (C1602n0.m2585a(j6, j7)) {
                return j8;
            }
            return AbstractC1586f0.m2558b((int) (j8 >> 32), (int) (4294967295L & j6));
        }
        C1610s c1610s3 = (C1610s) arrayList.get(m2562f);
        return c1610s3.m2618b(c1610s3.f10329a.m2549c(c1610s3.m2619c(c0465c), i7, c0625q), true);
    }

    /* renamed from: h */
    public final void m2604h(int i7) {
        boolean z7 = false;
        C1609r c1609r = this.f10312a;
        if (i7 >= 0 && i7 < ((C1587g) c1609r.f10325b).f10239f.length()) {
            z7 = true;
        }
        if (!z7) {
            StringBuilder m188o = AbstractC0094y0.m188o(i7, "offset(", ") is out of bounds [0, ");
            m188o.append(((C1587g) c1609r.f10325b).f10239f.length());
            m188o.append(')');
            AbstractC2550a.m4078a(m188o.toString());
        }
    }

    /* renamed from: i */
    public final void m2605i(int i7) {
        boolean z7 = false;
        C1609r c1609r = this.f10312a;
        if (i7 >= 0 && i7 <= ((C1587g) c1609r.f10325b).f10239f.length()) {
            z7 = true;
        }
        if (!z7) {
            StringBuilder m188o = AbstractC0094y0.m188o(i7, "offset(", ") is out of bounds [0, ");
            m188o.append(((C1587g) c1609r.f10325b).f10239f.length());
            m188o.append(']');
            AbstractC2550a.m4078a(m188o.toString());
        }
    }

    /* renamed from: j */
    public final void m2606j(int i7) {
        boolean z7 = false;
        int i8 = this.f10317f;
        if (i7 >= 0 && i7 < i8) {
            z7 = true;
        }
        if (!z7) {
            AbstractC2550a.m4078a("lineIndex(" + i7 + ") is out of bounds [0, " + i8 + ')');
        }
    }
}
