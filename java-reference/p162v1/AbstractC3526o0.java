package p162v1;

import java.lang.ref.WeakReference;
import java.util.Map;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p077k.C2194h0;
import p077k.C2196i0;
import p139s1.AbstractC3088a;
import p140s2.C3100j;
import p140s2.C3102l;
import p146t1.AbstractC3239v0;
import p146t1.C3208i0;
import p146t1.C3216l;
import p146t1.C3222n;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC3526o0 extends AbstractC3239v0 implements InterfaceC3223n0, InterfaceC3559z0 {

    /* renamed from: j */
    public C3517l0 f16973j;

    /* renamed from: k */
    public InterfaceC3279c f16974k;

    /* renamed from: l */
    public C3536r1 f16975l;

    /* renamed from: m */
    public boolean f16976m;

    /* renamed from: n */
    public boolean f16977n;

    /* renamed from: o */
    public boolean f16978o;

    /* renamed from: p */
    public final C3208i0 f16979p = new C3208i0(0, this);

    /* renamed from: q */
    public C3548v1 f16980q;

    /* renamed from: r */
    public C2194h0 f16981r;

    /* renamed from: H0 */
    public static void m5486H0(AbstractC3497e1 abstractC3497e1) {
        C3502g0 c3502g0;
        C3505h0 c3505h0;
        AbstractC3497e1 abstractC3497e12 = abstractC3497e1.f16848t;
        C3502g0 c3502g02 = abstractC3497e1.f16847s;
        if (abstractC3497e12 != null) {
            c3502g0 = abstractC3497e12.f16847s;
        } else {
            c3502g0 = null;
        }
        if (!AbstractC3367j.m5096a(c3502g0, c3502g02)) {
            c3502g02.f16873J.f16953p.f17071C.m5457f();
            return;
        }
        InterfaceC3480a mo5290t = c3502g02.f16873J.f16953p.mo5290t();
        if (mo5290t != null && (c3505h0 = ((C3553x0) mo5290t).f17071C) != null) {
            c3505h0.m5457f();
        }
    }

    /* renamed from: A0 */
    public abstract InterfaceC3238v mo5315A0();

    /* renamed from: B0 */
    public abstract boolean mo5316B0();

    /* renamed from: C0 */
    public abstract C3502g0 mo5317C0();

    /* renamed from: D0 */
    public abstract InterfaceC3220m0 mo5318D0();

    /* renamed from: E0 */
    public abstract AbstractC3526o0 mo5319E0();

    /* renamed from: F0 */
    public abstract long mo5320F0();

    /* renamed from: G0 */
    public final C3517l0 m5487G0() {
        C3517l0 c3517l0 = this.f16973j;
        if (c3517l0 == null) {
            C3517l0 c3517l02 = new C3517l0(this);
            this.f16973j = c3517l02;
            return c3517l02;
        }
        return c3517l0;
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: I */
    public final InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            AbstractC3088a.m4750b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C3523n0(i7, i8, map, interfaceC3279c, interfaceC3279c2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I0 */
    public final void m5488I0(C2196i0 c2196i0) {
        C3502g0 c3502g0;
        Object[] objArr = c2196i0.f12685b;
        long[] jArr = c2196i0.f12684a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128 && (c3502g0 = (C3502g0) ((C3491c2) objArr[(i7 << 3) + i9]).get()) != null) {
                            if (mo4889s()) {
                                c3502g0.m5419V(false);
                            } else {
                                c3502g0.m5420X(false);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: J0 */
    public abstract void mo5321J0();

    @Override // p146t1.AbstractC3239v0
    /* renamed from: h0 */
    public final int mo4939h0(C3216l c3216l) {
        int mo5491u0;
        if (!mo5316B0() || (mo5491u0 = mo5491u0(c3216l)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return mo5491u0 + ((int) (this.f16057i & 4294967295L));
    }

    @Override // p162v1.InterfaceC3559z0
    /* renamed from: p */
    public final void mo5489p(boolean z7) {
        C3502g0 c3502g0;
        EnumC3489c0 enumC3489c0;
        AbstractC3526o0 mo5319E0 = mo5319E0();
        EnumC3489c0 enumC3489c02 = null;
        if (mo5319E0 != null) {
            c3502g0 = mo5319E0.mo5317C0();
        } else {
            c3502g0 = null;
        }
        if (AbstractC3367j.m5096a(c3502g0, mo5317C0())) {
            this.f16976m = z7;
            return;
        }
        if (c3502g0 != null) {
            enumC3489c0 = c3502g0.f16873J.f16941d;
        } else {
            enumC3489c0 = null;
        }
        if (enumC3489c0 != EnumC3489c0.f16793g) {
            if (c3502g0 != null) {
                enumC3489c02 = c3502g0.f16873J.f16941d;
            }
            if (enumC3489c02 != EnumC3489c0.f16794h) {
                return;
            }
        }
        this.f16976m = z7;
    }

    @Override // p146t1.InterfaceC3228q
    /* renamed from: s */
    public boolean mo4889s() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5490s0(C3502g0 c3502g0, C3222n c3222n) {
        char c7;
        long j6;
        long j7;
        long j8;
        C2194h0 c2194h0;
        C2194h0 c2194h02;
        Object m3592g;
        long[] jArr;
        long[] jArr2;
        long j9;
        int i7;
        char c8;
        long j10;
        long j11;
        int i8;
        int i9;
        int i10;
        C2194h0 c2194h03 = this.f16981r;
        char c9 = 7;
        long j12 = -9187201950435737472L;
        int i11 = 8;
        if (c2194h03 != null) {
            Object[] objArr = c2194h03.f12678c;
            long[] jArr3 = c2194h03.f12676a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                long j13 = 128;
                while (true) {
                    long j14 = jArr3[i12];
                    j7 = 255;
                    if ((((~j14) << c9) & j14 & j12) != j12) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j14 & 255) < j13) {
                                c8 = c9;
                                C2196i0 c2196i0 = (C2196i0) objArr[(i12 << 3) + i14];
                                j10 = j12;
                                Object[] objArr2 = c2196i0.f12685b;
                                long[] jArr4 = c2196i0.f12684a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j11 = j13;
                                    int i15 = 0;
                                    int i16 = i11;
                                    while (true) {
                                        int i17 = length2;
                                        long j15 = jArr4[i15];
                                        jArr2 = jArr3;
                                        j9 = j14;
                                        if ((((~j15) << c8) & j15 & j10) != j10) {
                                            int i18 = 8 - ((~(i15 - i17)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j15 & 255) < j11) {
                                                    int i20 = (i15 << 3) + i19;
                                                    C3502g0 c3502g02 = (C3502g0) ((C3491c2) objArr2[i20]).get();
                                                    i9 = i19;
                                                    if (c3502g02 != null) {
                                                        boolean m5407I = c3502g02.m5407I();
                                                        i10 = i14;
                                                        if (m5407I) {
                                                        }
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                    c2196i0.m3610l(i20);
                                                } else {
                                                    i9 = i19;
                                                    i10 = i14;
                                                }
                                                j15 >>= i16;
                                                i19 = i9 + 1;
                                                i14 = i10;
                                            }
                                            i7 = i14;
                                            if (i18 != i16) {
                                                break;
                                            }
                                        } else {
                                            i7 = i14;
                                        }
                                        length2 = i17;
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        jArr3 = jArr2;
                                        j14 = j9;
                                        i14 = i7;
                                        i16 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j9 = j14;
                                    i7 = i14;
                                    j11 = j13;
                                }
                                i8 = 8;
                            } else {
                                jArr2 = jArr3;
                                j9 = j14;
                                i7 = i14;
                                c8 = c9;
                                j10 = j12;
                                j11 = j13;
                                i8 = i11;
                            }
                            i11 = i8;
                            j14 = j9 >> i8;
                            c9 = c8;
                            j12 = j10;
                            j13 = j11;
                            i14 = i7 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c7 = c9;
                        j6 = j12;
                        j8 = j13;
                        if (i13 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c7 = c9;
                        j6 = j12;
                        j8 = j13;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    c9 = c7;
                    j12 = j6;
                    j13 = j8;
                    jArr3 = jArr;
                    i11 = 8;
                }
                c2194h0 = this.f16981r;
                if (c2194h0 != null) {
                    long[] jArr5 = c2194h0.f12676a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j16 = jArr5[i21];
                            if ((((~j16) << c7) & j16 & j6) != j6) {
                                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if ((j16 & j7) < j8) {
                                        int i24 = (i21 << 3) + i23;
                                        if (((C2196i0) c2194h0.f12678c[i24]).m3605g()) {
                                            c2194h0.m3597l(i24);
                                        }
                                    }
                                    j16 >>= 8;
                                }
                                if (i22 != 8) {
                                    break;
                                }
                            }
                            if (i21 == length3) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                c2194h02 = this.f16981r;
                if (c2194h02 == null) {
                    c2194h02 = new C2194h0();
                    this.f16981r = c2194h02;
                }
                m3592g = c2194h02.m3592g(c3222n);
                if (m3592g == null) {
                    m3592g = new C2196i0();
                    c2194h02.m3598m(c3222n, m3592g);
                }
                ((C2196i0) m3592g).m3607i(new WeakReference(c3502g0));
            }
        }
        c7 = 7;
        j6 = -9187201950435737472L;
        j7 = 255;
        j8 = 128;
        c2194h0 = this.f16981r;
        if (c2194h0 != null) {
        }
        c2194h02 = this.f16981r;
        if (c2194h02 == null) {
        }
        m3592g = c2194h02.m3592g(c3222n);
        if (m3592g == null) {
        }
        ((C2196i0) m3592g).m3607i(new WeakReference(c3502g0));
    }

    /* renamed from: u0 */
    public abstract int mo5491u0(C3216l c3216l);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w0 */
    public final void m5492w0(C3536r1 c3536r1, long j6, long j7) {
        boolean z7;
        char c7;
        long j8;
        long j9;
        long j10;
        C3502g0 c3502g0;
        boolean z8;
        int i7;
        char c8;
        long j11;
        AbstractC3526o0 abstractC3526o0;
        C2196i0 c2196i0;
        C3530p1 snapshotObserver;
        C2194h0 c2194h0 = this.f16981r;
        C3548v1 c3548v1 = this.f16980q;
        if (c3548v1 == null) {
            c3548v1 = new C3548v1();
            this.f16980q = c3548v1;
        }
        C3548v1 c3548v12 = c3548v1;
        InterfaceC3524n1 interfaceC3524n1 = mo5317C0().f16896q;
        if (interfaceC3524n1 != null && (snapshotObserver = ((C3728t) interfaceC3524n1).getSnapshotObserver()) != null) {
            snapshotObserver.m5498a(c3536r1, C3495e.f16812h, new C3520m0(this, j6, j7, c3536r1));
        }
        boolean mo4889s = mo4889s();
        C2196i0 c2196i02 = c3548v12.f17064e;
        C2196i0 c2196i03 = c3548v12.f17065f;
        int i8 = c3548v12.f17060a;
        for (int i9 = 0; i9 < i8; i9++) {
            byte b8 = c3548v12.f17063d[i9];
            if (b8 == 3) {
                C3222n c3222n = c3548v12.f17061b[i9];
                AbstractC3367j.m5097b(c3222n);
                c2196i03.m3607i(c3222n);
            } else if (b8 != 0 && c2194h0 != null) {
                C3222n c3222n2 = c3548v12.f17061b[i9];
                AbstractC3367j.m5097b(c3222n2);
                C2196i0 c2196i04 = (C2196i0) c2194h0.m3596k(c3222n2);
                if (c2196i04 != null) {
                    c2196i02.m3608j(c2196i04);
                }
            }
        }
        int i10 = c3548v12.f17060a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr = c3548v12.f17063d;
            if (bArr[i12] == 2) {
                i11++;
            } else if (i11 > 0) {
                C3222n[] c3222nArr = c3548v12.f17061b;
                c3222nArr[i12 - i11] = c3222nArr[i12];
            }
            bArr[i12] = 2;
        }
        int i13 = c3548v12.f17060a;
        for (int i14 = i13 - i11; i14 < i13; i14++) {
            c3548v12.f17061b[i14] = null;
        }
        c3548v12.f17060a -= i11;
        AbstractC3526o0 mo5319E0 = mo5319E0();
        Object[] objArr = c2196i03.f12685b;
        long[] jArr = c2196i03.f12684a;
        int length = jArr.length - 2;
        char c9 = 7;
        long j12 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            j9 = 128;
            int i16 = 0;
            while (true) {
                long j13 = jArr[i16];
                j10 = 255;
                if ((((~j13) << c9) & j13 & j12) != j12) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j13 & 255) < 128) {
                            c8 = c9;
                            C3222n c3222n3 = (C3222n) objArr[(i16 << 3) + i18];
                            j11 = j12;
                            if (mo5319E0 == null) {
                                abstractC3526o0 = this;
                            } else {
                                abstractC3526o0 = mo5319E0;
                            }
                            i7 = i15;
                            AbstractC3526o0 abstractC3526o02 = abstractC3526o0;
                            while (true) {
                                C3548v1 c3548v13 = abstractC3526o02.f16980q;
                                if (c3548v13 != null) {
                                    z8 = mo4889s;
                                    if (AbstractC1804l.m3012E(c3548v13.f17061b, c3222n3)) {
                                        break;
                                    }
                                } else {
                                    z8 = mo4889s;
                                }
                                AbstractC3526o0 mo5319E02 = abstractC3526o02.mo5319E0();
                                if (mo5319E02 == null) {
                                    break;
                                }
                                abstractC3526o02 = mo5319E02;
                                mo4889s = z8;
                            }
                            C2194h0 c2194h02 = abstractC3526o02.f16981r;
                            if (c2194h02 != null) {
                                c2196i0 = (C2196i0) c2194h02.m3596k(c3222n3);
                            } else {
                                c2196i0 = null;
                            }
                            if (c2196i0 != null) {
                                abstractC3526o0.m5488I0(c2196i0);
                            }
                        } else {
                            z8 = mo4889s;
                            i7 = i15;
                            c8 = c9;
                            j11 = j12;
                        }
                        j13 >>= i7;
                        i18++;
                        c9 = c8;
                        j12 = j11;
                        i15 = i7;
                        mo4889s = z8;
                    }
                    z7 = mo4889s;
                    c7 = c9;
                    j8 = j12;
                    if (i17 != i15) {
                        break;
                    }
                } else {
                    z7 = mo4889s;
                    c7 = c9;
                    j8 = j12;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c9 = c7;
                j12 = j8;
                mo4889s = z7;
                i15 = 8;
            }
        } else {
            z7 = mo4889s;
            c7 = 7;
            j8 = -9187201950435737472L;
            j9 = 128;
            j10 = 255;
        }
        c2196i03.m3600b();
        Object[] objArr2 = c2196i02.f12685b;
        long[] jArr2 = c2196i02.f12684a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j14 = jArr2[i19];
                if ((((~j14) << c7) & j14 & j8) != j8) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j14 & j10) < j9 && (c3502g0 = (C3502g0) ((C3491c2) objArr2[(i19 << 3) + i21]).get()) != null) {
                            if (z7) {
                                c3502g0.m5419V(false);
                            } else {
                                c3502g0.m5420X(false);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length2) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        c2196i02.m3600b();
    }

    /* renamed from: y0 */
    public final void m5493y0(InterfaceC3220m0 interfaceC3220m0) {
        boolean z7;
        long j6;
        long j7;
        C2194h0 c2194h0 = this.f16981r;
        if (!this.f16978o) {
            InterfaceC3279c mo4885d = interfaceC3220m0.mo4885d();
            boolean z8 = false;
            if (mo4885d == null) {
                if (c2194h0 != null) {
                    Object[] objArr = c2194h0.f12678c;
                    long[] jArr = c2194h0.f12676a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j8 = jArr[i7];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((255 & j8) < 128) {
                                        m5488I0((C2196i0) objArr[(i7 << 3) + i9]);
                                    }
                                    j8 >>= 8;
                                }
                                if (i8 != 8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    c2194h0.m3586a();
                }
            } else {
                if (this.f16974k != mo4885d) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7 && m5487G0().f16957e) {
                    InterfaceC3238v mo5315A0 = mo5315A0();
                    long m3225F = AbstractC2064e.m3225F(mo5315A0.mo4931d(0L));
                    long mo4926S = mo5315A0.mo4926S();
                    if (!C3100j.m4783a(m3225F, m5487G0().f16958f) || !C3102l.m4790a(mo4926S, m5487G0().f16959g)) {
                        z8 = true;
                    }
                    j7 = m3225F;
                    j6 = mo4926S;
                    z7 = z8;
                } else {
                    j6 = 0;
                    j7 = 9223372034707292159L;
                }
                if (z7) {
                    C3536r1 c3536r1 = this.f16975l;
                    if (c3536r1 != null) {
                        c3536r1.f17008e = interfaceC3220m0;
                    } else {
                        c3536r1 = new C3536r1(interfaceC3220m0, this);
                        this.f16975l = c3536r1;
                    }
                    m5492w0(c3536r1, j7, j6);
                    this.f16974k = interfaceC3220m0.mo4885d();
                }
            }
        }
    }

    /* renamed from: z0 */
    public abstract AbstractC3526o0 mo5360z0();
}
