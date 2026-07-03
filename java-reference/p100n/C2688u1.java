package p100n;

import p001a0.C0019e1;
import p073j2.AbstractC2168e;
import p077k.C2220v;
import p077k.C2221w;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.u1 */
/* loaded from: classes.dex */
public final class C2688u1 implements InterfaceC2676q1 {

    /* renamed from: e */
    public final C2220v f14438e;

    /* renamed from: f */
    public final C2221w f14439f;

    /* renamed from: g */
    public final int f14440g;

    /* renamed from: h */
    public final InterfaceC2697y f14441h;

    /* renamed from: i */
    public int[] f14442i;

    /* renamed from: j */
    public float[] f14443j;

    /* renamed from: k */
    public AbstractC2674q f14444k;

    /* renamed from: l */
    public AbstractC2674q f14445l;

    /* renamed from: m */
    public AbstractC2674q f14446m;

    /* renamed from: n */
    public AbstractC2674q f14447n;

    /* renamed from: o */
    public float[] f14448o;

    /* renamed from: p */
    public float[] f14449p;

    /* renamed from: q */
    public C0019e1 f14450q;

    public C2688u1(C2220v c2220v, C2221w c2221w, int i7, InterfaceC2697y interfaceC2697y) {
        this.f14438e = c2220v;
        this.f14439f = c2221w;
        this.f14440g = i7;
        this.f14441h = interfaceC2697y;
    }

    /* renamed from: a */
    public final int m4294a(int i7) {
        int i8;
        C2220v c2220v = this.f14438e;
        int i9 = c2220v.f12755b;
        int i10 = 0;
        if (i9 < 0) {
            AbstractC2666n0.m4272a("fromIndex(0) > toIndex(" + i9 + ')');
        }
        if (i9 <= c2220v.f12755b) {
            int i11 = i9 - 1;
            while (true) {
                if (i10 <= i11) {
                    i8 = (i10 + i11) >>> 1;
                    int m3645c = c2220v.m3645c(i8);
                    if (m3645c < i7) {
                        i10 = i8 + 1;
                    } else {
                        if (m3645c <= i7) {
                            break;
                        }
                        i11 = i8 - 1;
                    }
                } else {
                    i8 = -(i10 + 1);
                    break;
                }
            }
            if (i8 < -1) {
                return -(i8 + 2);
            }
            return i8;
        }
        throw new IndexOutOfBoundsException(AbstractC2647h.m4256b("Index out of range: ", i9));
    }

    /* renamed from: d */
    public final float m4295d(int i7, int i8, boolean z7) {
        InterfaceC2697y interfaceC2697y;
        float f7;
        C2220v c2220v = this.f14438e;
        if (i7 >= c2220v.f12755b - 1) {
            f7 = i8;
        } else {
            int m3645c = c2220v.m3645c(i7);
            int m3645c2 = c2220v.m3645c(i7 + 1);
            if (i8 == m3645c) {
                f7 = m3645c;
            } else {
                int i9 = m3645c2 - m3645c;
                C2685t1 c2685t1 = (C2685t1) this.f14439f.m3612b(m3645c);
                if (c2685t1 == null || (interfaceC2697y = c2685t1.f14425b) == null) {
                    interfaceC2697y = this.f14441h;
                }
                float f8 = i9;
                float mo1295a = interfaceC2697y.mo1295a((i8 - m3645c) / f8);
                if (z7) {
                    return mo1295a;
                }
                f7 = (f8 * mo1295a) + m3645c;
            }
        }
        return f7 / ((float) 1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if (r10 == 1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164 A[LOOP:9: B:83:0x0162->B:84:0x0164, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a0.e1, java.lang.Object] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4296e(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        boolean z7;
        int i7;
        int length;
        int i8;
        float[] fArr;
        float[] fArr2;
        if (this.f14450q != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC2674q abstractC2674q4 = this.f14444k;
        C2221w c2221w = this.f14439f;
        C2220v c2220v = this.f14438e;
        if (abstractC2674q4 == null) {
            this.f14444k = abstractC2674q.mo4268c();
            this.f14445l = abstractC2674q3.mo4268c();
            int i9 = c2220v.f12755b;
            float[] fArr3 = new float[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                fArr3[i10] = c2220v.m3645c(i10) / ((float) 1000);
            }
            this.f14443j = fArr3;
            int i11 = c2220v.f12755b;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = 0;
            }
            this.f14442i = iArr;
        }
        if (z7) {
            if (this.f14450q != null) {
                AbstractC2674q abstractC2674q5 = this.f14446m;
                if (abstractC2674q5 != null) {
                    if (abstractC2674q5.equals(abstractC2674q)) {
                        AbstractC2674q abstractC2674q6 = this.f14447n;
                        if (abstractC2674q6 != null) {
                            if (abstractC2674q6.equals(abstractC2674q2)) {
                                return;
                            }
                        } else {
                            AbstractC3367j.m5105j("lastTargetValue");
                            throw null;
                        }
                    }
                } else {
                    AbstractC3367j.m5105j("lastInitialValue");
                    throw null;
                }
            }
            this.f14446m = abstractC2674q;
            this.f14447n = abstractC2674q2;
            int mo4267b = abstractC2674q.mo4267b() + (abstractC2674q.mo4267b() % 2);
            this.f14448o = new float[mo4267b];
            this.f14449p = new float[mo4267b];
            int i13 = c2220v.f12755b;
            float[][] fArr4 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                int m3645c = c2220v.m3645c(i14);
                if (m3645c == 0) {
                    if (!c2221w.m3611a(m3645c)) {
                        fArr2 = new float[mo4267b];
                        for (int i15 = 0; i15 < mo4267b; i15++) {
                            fArr2[i15] = abstractC2674q.mo4266a(i15);
                        }
                    } else {
                        fArr = new float[mo4267b];
                        Object m3612b = c2221w.m3612b(m3645c);
                        AbstractC3367j.m5097b(m3612b);
                        AbstractC2674q abstractC2674q7 = ((C2685t1) m3612b).f14424a;
                        for (int i16 = 0; i16 < mo4267b; i16++) {
                            fArr[i16] = abstractC2674q7.mo4266a(i16);
                        }
                        fArr2 = fArr;
                    }
                } else {
                    if (m3645c == this.f14440g) {
                        if (!c2221w.m3611a(m3645c)) {
                            fArr2 = new float[mo4267b];
                            for (int i17 = 0; i17 < mo4267b; i17++) {
                                fArr2[i17] = abstractC2674q2.mo4266a(i17);
                            }
                        } else {
                            fArr = new float[mo4267b];
                            Object m3612b2 = c2221w.m3612b(m3645c);
                            AbstractC3367j.m5097b(m3612b2);
                            AbstractC2674q abstractC2674q8 = ((C2685t1) m3612b2).f14424a;
                            for (int i18 = 0; i18 < mo4267b; i18++) {
                                fArr[i18] = abstractC2674q8.mo4266a(i18);
                            }
                        }
                    } else {
                        fArr = new float[mo4267b];
                        Object m3612b3 = c2221w.m3612b(m3645c);
                        AbstractC3367j.m5097b(m3612b3);
                        AbstractC2674q abstractC2674q9 = ((C2685t1) m3612b3).f14424a;
                        for (int i19 = 0; i19 < mo4267b; i19++) {
                            fArr[i19] = abstractC2674q9.mo4266a(i19);
                        }
                    }
                    fArr2 = fArr;
                }
                fArr4[i14] = fArr2;
            }
            int[] iArr2 = this.f14442i;
            if (iArr2 != null) {
                float[] fArr5 = this.f14443j;
                if (fArr5 != null) {
                    ?? obj = new Object();
                    int length2 = fArr5.length - 1;
                    C2680s[][] c2680sArr = new C2680s[length2];
                    int i20 = 1;
                    int i21 = 1;
                    int i22 = 0;
                    while (i22 < length2) {
                        int i23 = iArr2[i22];
                        int i24 = 3;
                        if (i23 != 0) {
                            if (i23 != 1) {
                                if (i23 != 2) {
                                    if (i23 != 3) {
                                        i24 = 4;
                                        if (i23 != 4) {
                                            i24 = 5;
                                            if (i23 != 5) {
                                                i7 = i21;
                                                float[] fArr6 = fArr4[i22];
                                                length = (fArr6.length % 2) + (fArr6.length / 2);
                                                C2680s[] c2680sArr2 = new C2680s[length];
                                                for (i8 = 0; i8 < length; i8++) {
                                                    int i25 = i8 * 2;
                                                    float f7 = fArr5[i22];
                                                    int i26 = i22 + 1;
                                                    float f8 = fArr5[i26];
                                                    float[] fArr7 = fArr4[i22];
                                                    float f9 = fArr7[i25];
                                                    int i27 = i25 + 1;
                                                    float f10 = fArr7[i27];
                                                    float[] fArr8 = fArr4[i26];
                                                    c2680sArr2[i8] = new C2680s(i7, f7, f8, f9, f10, fArr8[i25], fArr8[i27]);
                                                }
                                                c2680sArr[i22] = c2680sArr2;
                                                i22++;
                                                i21 = i7;
                                            }
                                        }
                                    }
                                }
                                i20 = 2;
                                i7 = i20;
                                float[] fArr62 = fArr4[i22];
                                length = (fArr62.length % 2) + (fArr62.length / 2);
                                C2680s[] c2680sArr22 = new C2680s[length];
                                while (i8 < length) {
                                }
                                c2680sArr[i22] = c2680sArr22;
                                i22++;
                                i21 = i7;
                            }
                            i20 = 1;
                            i7 = i20;
                            float[] fArr622 = fArr4[i22];
                            length = (fArr622.length % 2) + (fArr622.length / 2);
                            C2680s[] c2680sArr222 = new C2680s[length];
                            while (i8 < length) {
                            }
                            c2680sArr[i22] = c2680sArr222;
                            i22++;
                            i21 = i7;
                        }
                        i7 = i24;
                        float[] fArr6222 = fArr4[i22];
                        length = (fArr6222.length % 2) + (fArr6222.length / 2);
                        C2680s[] c2680sArr2222 = new C2680s[length];
                        while (i8 < length) {
                        }
                        c2680sArr[i22] = c2680sArr2222;
                        i22++;
                        i21 = i7;
                    }
                    obj.f109e = c2680sArr;
                    this.f14450q = obj;
                    return;
                }
                AbstractC3367j.m5105j("times");
                throw null;
            }
            AbstractC3367j.m5105j("modes");
            throw null;
        }
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: k */
    public final int mo628k() {
        return 0;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public final AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        int i7 = 0;
        long m3531r = AbstractC2168e.m3531r((j6 / 1000000) - 0, 0L, this.f14440g);
        if (m3531r < 0) {
            return abstractC2674q3;
        }
        m4296e(abstractC2674q, abstractC2674q2, abstractC2674q3);
        if (this.f14450q != null) {
            int i8 = (int) m3531r;
            float m4295d = m4295d(m4294a(i8), i8, false);
            C0019e1 c0019e1 = this.f14450q;
            if (c0019e1 != null) {
                float[] fArr = this.f14449p;
                if (fArr != null) {
                    C2680s[][] c2680sArr = (C2680s[][]) c0019e1.f109e;
                    float f7 = c2680sArr[0][0].f14397a;
                    if (m4295d < f7) {
                        m4295d = f7;
                    } else if (m4295d > c2680sArr[c2680sArr.length - 1][0].f14398b) {
                        m4295d = c2680sArr[c2680sArr.length - 1][0].f14398b;
                    }
                    int length = c2680sArr.length;
                    boolean z7 = false;
                    for (int i9 = 0; i9 < length; i9++) {
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < fArr.length) {
                            C2680s c2680s = c2680sArr[i9][i11];
                            if (m4295d <= c2680s.f14398b) {
                                if (c2680s.f14414r) {
                                    fArr[i10] = c2680s.f14410n;
                                    fArr[i10 + 1] = c2680s.f14411o;
                                } else {
                                    c2680s.m4291c(m4295d);
                                    fArr[i10] = c2680sArr[i9][i11].m4289a();
                                    fArr[i10 + 1] = c2680sArr[i9][i11].m4290b();
                                }
                                z7 = true;
                            }
                            i10 += 2;
                            i11++;
                        }
                        if (z7) {
                            break;
                        }
                    }
                    float[] fArr2 = this.f14449p;
                    if (fArr2 != null) {
                        int length2 = fArr2.length;
                        while (i7 < length2) {
                            AbstractC2674q abstractC2674q4 = this.f14445l;
                            if (abstractC2674q4 != null) {
                                float[] fArr3 = this.f14449p;
                                if (fArr3 != null) {
                                    abstractC2674q4.mo4270e(fArr3[i7], i7);
                                    i7++;
                                } else {
                                    AbstractC3367j.m5105j("slopeArray");
                                    throw null;
                                }
                            } else {
                                AbstractC3367j.m5105j("velocityVector");
                                throw null;
                            }
                        }
                        AbstractC2674q abstractC2674q5 = this.f14445l;
                        if (abstractC2674q5 != null) {
                            return abstractC2674q5;
                        }
                        AbstractC3367j.m5105j("velocityVector");
                        throw null;
                    }
                    AbstractC3367j.m5105j("slopeArray");
                    throw null;
                }
                AbstractC3367j.m5105j("slopeArray");
                throw null;
            }
            AbstractC3367j.m5105j("arcSpline");
            throw null;
        }
        AbstractC2674q mo631o = mo631o((m3531r - 1) * 1000000, abstractC2674q, abstractC2674q2, abstractC2674q3);
        AbstractC2674q mo631o2 = mo631o(m3531r * 1000000, abstractC2674q, abstractC2674q2, abstractC2674q3);
        int mo4267b = mo631o.mo4267b();
        while (i7 < mo4267b) {
            AbstractC2674q abstractC2674q6 = this.f14445l;
            if (abstractC2674q6 != null) {
                abstractC2674q6.mo4270e((mo631o.mo4266a(i7) - mo631o2.mo4266a(i7)) * 1000.0f, i7);
                i7++;
            } else {
                AbstractC3367j.m5105j("velocityVector");
                throw null;
            }
        }
        AbstractC2674q abstractC2674q7 = this.f14445l;
        if (abstractC2674q7 != null) {
            return abstractC2674q7;
        }
        AbstractC3367j.m5105j("velocityVector");
        throw null;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public final AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        int i7;
        Throwable th;
        int i8;
        int i9;
        boolean z7;
        AbstractC2674q abstractC2674q4 = abstractC2674q;
        AbstractC2674q abstractC2674q5 = abstractC2674q2;
        int i10 = 0;
        int i11 = this.f14440g;
        int m3531r = (int) AbstractC2168e.m3531r((j6 / 1000000) - 0, 0L, i11);
        C2221w c2221w = this.f14439f;
        if (c2221w.m3611a(m3531r)) {
            Object m3612b = c2221w.m3612b(m3531r);
            AbstractC3367j.m5097b(m3612b);
            return ((C2685t1) m3612b).f14424a;
        }
        if (m3531r >= i11) {
            return abstractC2674q5;
        }
        if (m3531r <= 0) {
            return abstractC2674q4;
        }
        m4296e(abstractC2674q4, abstractC2674q5, abstractC2674q3);
        boolean z8 = true;
        if (this.f14450q != null) {
            float m4295d = m4295d(m4294a(m3531r), m3531r, false);
            C0019e1 c0019e1 = this.f14450q;
            if (c0019e1 != null) {
                float[] fArr = this.f14448o;
                if (fArr != null) {
                    C2680s[][] c2680sArr = (C2680s[][]) c0019e1.f109e;
                    float f7 = c2680sArr[0][0].f14397a;
                    if (m4295d < f7 || m4295d > c2680sArr[c2680sArr.length - 1][0].f14398b) {
                        i7 = 0;
                        th = null;
                        if (m4295d > c2680sArr[c2680sArr.length - 1][0].f14398b) {
                            i8 = c2680sArr.length - 1;
                            f7 = c2680sArr[c2680sArr.length - 1][0].f14398b;
                        } else {
                            i8 = 0;
                        }
                        float f8 = m4295d - f7;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < fArr.length) {
                            C2680s c2680s = c2680sArr[i8][i13];
                            if (c2680s.f14414r) {
                                float f9 = c2680s.f14397a;
                                float f10 = c2680s.f14407k;
                                float f11 = c2680s.f14399c;
                                fArr[i12] = (c2680s.f14410n * f8) + ((c2680s.f14401e - f11) * (f7 - f9) * f10) + f11;
                                float f12 = (f7 - f9) * f10;
                                float f13 = c2680s.f14400d;
                                fArr[i12 + 1] = (c2680s.f14411o * f8) + ((c2680s.f14402f - f13) * f12) + f13;
                            } else {
                                c2680s.m4291c(f7);
                                C2680s c2680s2 = c2680sArr[i8][i13];
                                fArr[i12] = (c2680s2.m4289a() * f8) + (c2680s2.f14408l * c2680s2.f14404h) + c2680s2.f14410n;
                                C2680s c2680s3 = c2680sArr[i8][i13];
                                fArr[i12 + 1] = (c2680s3.m4290b() * f8) + (c2680s3.f14409m * c2680s3.f14405i) + c2680s3.f14411o;
                            }
                            i12 += 2;
                            i13++;
                        }
                    } else {
                        int length = c2680sArr.length;
                        int i14 = 0;
                        boolean z9 = false;
                        while (true) {
                            if (i14 < length) {
                                int i15 = i10;
                                int i16 = i15;
                                while (i15 < fArr.length) {
                                    C2680s c2680s4 = c2680sArr[i14][i16];
                                    if (m4295d <= c2680s4.f14398b) {
                                        if (c2680s4.f14414r) {
                                            float f14 = c2680s4.f14397a;
                                            i9 = i10;
                                            float f15 = c2680s4.f14407k;
                                            float f16 = c2680s4.f14399c;
                                            z7 = z8;
                                            fArr[i15] = ((c2680s4.f14401e - f16) * (m4295d - f14) * f15) + f16;
                                            float f17 = (m4295d - f14) * f15;
                                            float f18 = c2680s4.f14400d;
                                            fArr[i15 + 1] = ((c2680s4.f14402f - f18) * f17) + f18;
                                        } else {
                                            i9 = i10;
                                            z7 = z8;
                                            c2680s4.m4291c(m4295d);
                                            C2680s c2680s5 = c2680sArr[i14][i16];
                                            fArr[i15] = (c2680s5.f14408l * c2680s5.f14404h) + c2680s5.f14410n;
                                            fArr[i15 + 1] = (c2680s5.f14409m * c2680s5.f14405i) + c2680s5.f14411o;
                                        }
                                        z9 = z7;
                                    } else {
                                        i9 = i10;
                                        z7 = z8;
                                    }
                                    i15 += 2;
                                    i16++;
                                    i10 = i9;
                                    z8 = z7;
                                }
                                i7 = i10;
                                boolean z10 = z8;
                                th = null;
                                if (z9) {
                                    break;
                                }
                                i14++;
                                i10 = i7;
                                z8 = z10;
                            } else {
                                i7 = i10;
                                th = null;
                                break;
                            }
                        }
                    }
                    float[] fArr2 = this.f14448o;
                    if (fArr2 != null) {
                        int length2 = fArr2.length;
                        for (int i17 = i7; i17 < length2; i17++) {
                            AbstractC2674q abstractC2674q6 = this.f14444k;
                            if (abstractC2674q6 != null) {
                                float[] fArr3 = this.f14448o;
                                if (fArr3 != null) {
                                    abstractC2674q6.mo4270e(fArr3[i17], i17);
                                } else {
                                    AbstractC3367j.m5105j("posArray");
                                    throw th;
                                }
                            } else {
                                AbstractC3367j.m5105j("valueVector");
                                throw th;
                            }
                        }
                        AbstractC2674q abstractC2674q7 = this.f14444k;
                        if (abstractC2674q7 != null) {
                            return abstractC2674q7;
                        }
                        AbstractC3367j.m5105j("valueVector");
                        throw th;
                    }
                    AbstractC3367j.m5105j("posArray");
                    throw th;
                }
                AbstractC3367j.m5105j("posArray");
                throw null;
            }
            AbstractC3367j.m5105j("arcSpline");
            throw null;
        }
        int m4294a = m4294a(m3531r);
        float m4295d2 = m4295d(m4294a, m3531r, true);
        C2220v c2220v = this.f14438e;
        int m3645c = c2220v.m3645c(m4294a);
        if (c2221w.m3611a(m3645c)) {
            Object m3612b2 = c2221w.m3612b(m3645c);
            AbstractC3367j.m5097b(m3612b2);
            abstractC2674q4 = ((C2685t1) m3612b2).f14424a;
        }
        int m3645c2 = c2220v.m3645c(m4294a + 1);
        if (c2221w.m3611a(m3645c2)) {
            Object m3612b3 = c2221w.m3612b(m3645c2);
            AbstractC3367j.m5097b(m3612b3);
            abstractC2674q5 = ((C2685t1) m3612b3).f14424a;
        }
        AbstractC2674q abstractC2674q8 = this.f14444k;
        if (abstractC2674q8 != null) {
            int mo4267b = abstractC2674q8.mo4267b();
            for (int i18 = 0; i18 < mo4267b; i18++) {
                AbstractC2674q abstractC2674q9 = this.f14444k;
                if (abstractC2674q9 != null) {
                    float mo4266a = abstractC2674q4.mo4266a(i18);
                    float mo4266a2 = abstractC2674q5.mo4266a(i18);
                    C2664m1 c2664m1 = AbstractC2667n1.f14365a;
                    abstractC2674q9.mo4270e((mo4266a2 * m4295d2) + ((1 - m4295d2) * mo4266a), i18);
                } else {
                    AbstractC3367j.m5105j("valueVector");
                    throw null;
                }
            }
            AbstractC2674q abstractC2674q10 = this.f14444k;
            if (abstractC2674q10 != null) {
                return abstractC2674q10;
            }
            AbstractC3367j.m5105j("valueVector");
            throw null;
        }
        AbstractC3367j.m5105j("valueVector");
        throw null;
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: p */
    public final int mo632p() {
        return this.f14440g;
    }
}
