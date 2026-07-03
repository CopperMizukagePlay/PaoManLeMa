package p161v0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p015b6.C0310q;
import p068i5.AbstractC2080d;
import p077k.C2182b0;
import p077k.C2194h0;
import p077k.C2196i0;
import p085l0.AbstractC2418w;
import p085l0.C2348d0;
import p085l0.C2352e0;
import p085l0.C2391o;
import p085l0.C2413u0;
import p085l0.InterfaceC2370i2;
import p101n0.C2705e;
import p101n0.C2707g;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.InterfaceC3527o1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.t */
/* loaded from: classes.dex */
public final class C3473t {

    /* renamed from: a */
    public final InterfaceC3279c f16741a;

    /* renamed from: b */
    public Object f16742b;

    /* renamed from: c */
    public C2182b0 f16743c;

    /* renamed from: j */
    public int f16750j;

    /* renamed from: d */
    public int f16744d = -1;

    /* renamed from: e */
    public final C2194h0 f16745e = AbstractC2080d.m3397j();

    /* renamed from: f */
    public final C2194h0 f16746f = new C2194h0();

    /* renamed from: g */
    public final C2196i0 f16747g = new C2196i0();

    /* renamed from: h */
    public final C2705e f16748h = new C2705e(new C2352e0[16]);

    /* renamed from: i */
    public final C2391o f16749i = new C2391o(1, this);

    /* renamed from: k */
    public final C2194h0 f16751k = AbstractC2080d.m3397j();

    /* renamed from: l */
    public final HashMap f16752l = new HashMap();

    public C3473t(InterfaceC3279c interfaceC3279c) {
        this.f16741a = interfaceC3279c;
    }

    /* renamed from: a */
    public final void m5273a(Object obj, C0310q c0310q, InterfaceC3277a interfaceC3277a) {
        boolean z7;
        int i7;
        int i8;
        boolean z8;
        Object obj2 = this.f16742b;
        C2182b0 c2182b0 = this.f16743c;
        int i9 = this.f16744d;
        this.f16742b = obj;
        this.f16743c = (C2182b0) this.f16746f.m3592g(obj);
        if (this.f16744d == -1) {
            this.f16744d = Long.hashCode(AbstractC3465l.m5244k().mo5221g());
        }
        C2391o c2391o = this.f16749i;
        C2705e m3972o = AbstractC2418w.m3972o();
        boolean z9 = true;
        try {
            m3972o.m4300b(c2391o);
            AbstractC3470q.m5268i(interfaceC3277a, c0310q);
            m3972o.m4309k(m3972o.f14519g - 1);
            Object obj3 = this.f16742b;
            AbstractC3367j.m5097b(obj3);
            int i10 = this.f16744d;
            C2182b0 c2182b02 = this.f16743c;
            if (c2182b02 != null) {
                long[] jArr = c2182b02.f12621a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j6 = jArr[i11];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            z7 = z9;
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j6 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    i8 = i12;
                                    Object obj4 = c2182b02.f12622b[i15];
                                    i7 = i14;
                                    if (c2182b02.f12623c[i15] != i10) {
                                        z8 = z7;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        m5276d(obj3, obj4);
                                    }
                                    if (z8) {
                                        c2182b02.m3554g(i15);
                                    }
                                } else {
                                    i7 = i14;
                                    i8 = i12;
                                }
                                j6 >>= i8;
                                i14 = i7 + 1;
                                i12 = i8;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z7 = z9;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z9 = z7;
                    }
                }
            }
            this.f16742b = obj2;
            this.f16743c = c2182b0;
            this.f16744d = i9;
        } catch (Throwable th) {
            m3972o.m4309k(m3972o.f14519g - 1);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (((p161v0.AbstractC3479z) r1).m5283e(2) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x050f A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5274b(Set set) {
        char c7;
        long j6;
        boolean z7;
        Iterator it;
        String str;
        C2194h0 c2194h0;
        Object m3592g;
        Object m3592g2;
        Object[] objArr;
        Iterator it2;
        int i7;
        String str2;
        C2194h0 c2194h02;
        Object[] objArr2;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i8;
        Object[] objArr3;
        int i9;
        int i10;
        int i11;
        C2182b0 c2182b0;
        long[] jArr3;
        C2413u0 c2413u0;
        Object[] objArr4;
        long[] jArr4;
        C2413u0 c2413u02;
        Object[] objArr5;
        int i12;
        int i13;
        int i14;
        long j8;
        Object obj;
        Object obj2;
        Object obj3;
        int i15;
        int i16;
        long j9;
        int i17;
        int i18;
        C2413u0 c2413u03 = C2413u0.f13575j;
        boolean z8 = set instanceof C2707g;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        C2705e c2705e = this.f16748h;
        C2194h0 c2194h03 = this.f16751k;
        HashMap hashMap = this.f16752l;
        C2194h0 c2194h04 = this.f16745e;
        C2196i0 c2196i0 = this.f16747g;
        if (z8) {
            C2196i0 c2196i02 = ((C2707g) set).f14520e;
            Object[] objArr6 = c2196i02.f12685b;
            long[] jArr5 = c2196i02.f12684a;
            c7 = 7;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i19 = 0;
                z7 = false;
                j6 = -9187201950435737472L;
                while (true) {
                    int i20 = 8;
                    long j10 = jArr5[i19];
                    int i21 = i19;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j10 & 255) < 128) {
                                jArr4 = jArr5;
                                Object obj4 = objArr6[(i21 << 3) + i23];
                                c2413u02 = c2413u03;
                                if (obj4 instanceof AbstractC3479z) {
                                    objArr5 = objArr6;
                                } else {
                                    objArr5 = objArr6;
                                }
                                if (c2194h03.m3588c(obj4)) {
                                    Object m3592g3 = c2194h03.m3592g(obj4);
                                    if (m3592g3 != null) {
                                        if (m3592g3 instanceof C2196i0) {
                                            C2196i0 c2196i03 = (C2196i0) m3592g3;
                                            Object[] objArr7 = c2196i03.f12685b;
                                            long[] jArr6 = c2196i03.f12684a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                i14 = i23;
                                                boolean z9 = z7;
                                                int i24 = 0;
                                                while (true) {
                                                    long j11 = jArr6[i24];
                                                    j8 = j10;
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                        int i26 = 0;
                                                        while (i26 < i25) {
                                                            if ((j11 & 255) < 128) {
                                                                j9 = j11;
                                                                C2352e0 c2352e0 = (C2352e0) objArr7[(i24 << 3) + i26];
                                                                AbstractC3367j.m5098c(c2352e0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                Object obj5 = hashMap.get(c2352e0);
                                                                i17 = i26;
                                                                InterfaceC2370i2 interfaceC2370i2 = c2352e0.f13390g;
                                                                if (interfaceC2370i2 == null) {
                                                                    interfaceC2370i2 = c2413u02;
                                                                }
                                                                if (!interfaceC2370i2.mo3798a(c2352e0.m3792h().f13356f, obj5)) {
                                                                    Object m3592g4 = c2194h04.m3592g(c2352e0);
                                                                    if (m3592g4 != null) {
                                                                        if (m3592g4 instanceof C2196i0) {
                                                                            C2196i0 c2196i04 = (C2196i0) m3592g4;
                                                                            Object[] objArr8 = c2196i04.f12685b;
                                                                            long[] jArr7 = c2196i04.f12684a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i15 = length;
                                                                                i16 = i22;
                                                                                int i27 = 0;
                                                                                while (true) {
                                                                                    long j12 = jArr7[i27];
                                                                                    long[] jArr8 = jArr7;
                                                                                    obj3 = obj4;
                                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                                                        int i29 = 0;
                                                                                        while (i29 < i28) {
                                                                                            if ((j12 & 255) < 128) {
                                                                                                i18 = i29;
                                                                                                c2196i0.m3599a(objArr8[(i27 << 3) + i29]);
                                                                                                z9 = true;
                                                                                            } else {
                                                                                                i18 = i29;
                                                                                            }
                                                                                            j12 >>= i20;
                                                                                            i29 = i18 + 1;
                                                                                        }
                                                                                        if (i28 != i20) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (i27 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i27++;
                                                                                    obj4 = obj3;
                                                                                    jArr7 = jArr8;
                                                                                    i20 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj3 = obj4;
                                                                            i15 = length;
                                                                            i16 = i22;
                                                                            c2196i0.m3599a(m3592g4);
                                                                            z9 = true;
                                                                        }
                                                                    }
                                                                    obj3 = obj4;
                                                                    i15 = length;
                                                                    i16 = i22;
                                                                } else {
                                                                    obj3 = obj4;
                                                                    i15 = length;
                                                                    i16 = i22;
                                                                    c2705e.m4300b(c2352e0);
                                                                }
                                                            } else {
                                                                obj3 = obj4;
                                                                i15 = length;
                                                                i16 = i22;
                                                                j9 = j11;
                                                                i17 = i26;
                                                            }
                                                            j11 = j9 >> 8;
                                                            i26 = i17 + 1;
                                                            i20 = 8;
                                                            length = i15;
                                                            i22 = i16;
                                                            obj4 = obj3;
                                                        }
                                                        obj2 = obj4;
                                                        i12 = length;
                                                        i13 = i22;
                                                        if (i25 != i20) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj2 = obj4;
                                                        i12 = length;
                                                        i13 = i22;
                                                    }
                                                    if (i24 == length2) {
                                                        break;
                                                    }
                                                    i24++;
                                                    i20 = 8;
                                                    j10 = j8;
                                                    length = i12;
                                                    i22 = i13;
                                                    obj4 = obj2;
                                                }
                                                z7 = z9;
                                            }
                                        } else {
                                            obj2 = obj4;
                                            i12 = length;
                                            i13 = i22;
                                            i14 = i23;
                                            j8 = j10;
                                            C2352e0 c2352e02 = (C2352e0) m3592g3;
                                            Object obj6 = hashMap.get(c2352e02);
                                            InterfaceC2370i2 interfaceC2370i22 = c2352e02.f13390g;
                                            if (interfaceC2370i22 == null) {
                                                interfaceC2370i22 = c2413u02;
                                            }
                                            if (!interfaceC2370i22.mo3798a(c2352e02.m3792h().f13356f, obj6)) {
                                                Object m3592g5 = c2194h04.m3592g(c2352e02);
                                                if (m3592g5 != null) {
                                                    if (m3592g5 instanceof C2196i0) {
                                                        C2196i0 c2196i05 = (C2196i0) m3592g5;
                                                        Object[] objArr9 = c2196i05.f12685b;
                                                        long[] jArr9 = c2196i05.f12684a;
                                                        int length4 = jArr9.length - 2;
                                                        if (length4 >= 0) {
                                                            int i30 = 0;
                                                            while (true) {
                                                                long j13 = jArr9[i30];
                                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i31 = 8 - ((~(i30 - length4)) >>> 31);
                                                                    for (int i32 = 0; i32 < i31; i32++) {
                                                                        if ((j13 & 255) < 128) {
                                                                            c2196i0.m3599a(objArr9[(i30 << 3) + i32]);
                                                                            z7 = true;
                                                                        }
                                                                        j13 >>= 8;
                                                                    }
                                                                    if (i31 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i30 == length4) {
                                                                    break;
                                                                }
                                                                i30++;
                                                            }
                                                        }
                                                    } else {
                                                        c2196i0.m3599a(m3592g5);
                                                        z7 = true;
                                                    }
                                                }
                                            } else {
                                                c2705e.m4300b(c2352e02);
                                            }
                                        }
                                        obj = obj2;
                                    }
                                    obj2 = obj4;
                                    i12 = length;
                                    i13 = i22;
                                    i14 = i23;
                                    j8 = j10;
                                    obj = obj2;
                                } else {
                                    i12 = length;
                                    i13 = i22;
                                    i14 = i23;
                                    j8 = j10;
                                    obj = obj4;
                                }
                                Object m3592g6 = c2194h04.m3592g(obj);
                                if (m3592g6 != null) {
                                    if (m3592g6 instanceof C2196i0) {
                                        C2196i0 c2196i06 = (C2196i0) m3592g6;
                                        Object[] objArr10 = c2196i06.f12685b;
                                        long[] jArr10 = c2196i06.f12684a;
                                        int length5 = jArr10.length - 2;
                                        if (length5 >= 0) {
                                            int i33 = 0;
                                            while (true) {
                                                long j14 = jArr10[i33];
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i34 = 8 - ((~(i33 - length5)) >>> 31);
                                                    for (int i35 = 0; i35 < i34; i35++) {
                                                        if ((j14 & 255) < 128) {
                                                            c2196i0.m3599a(objArr10[(i33 << 3) + i35]);
                                                            z7 = true;
                                                        }
                                                        j14 >>= 8;
                                                    }
                                                    if (i34 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i33 == length5) {
                                                    break;
                                                }
                                                i33++;
                                            }
                                        }
                                    } else {
                                        c2196i0.m3599a(m3592g6);
                                        z7 = true;
                                    }
                                }
                                i23 = i14 + 1;
                                i20 = 8;
                                c2413u03 = c2413u02;
                                objArr6 = objArr5;
                                length = i12;
                                i22 = i13;
                                j10 = j8 >> 8;
                                jArr5 = jArr4;
                            } else {
                                jArr4 = jArr5;
                                c2413u02 = c2413u03;
                                objArr5 = objArr6;
                            }
                            i12 = length;
                            i13 = i22;
                            i14 = i23;
                            j8 = j10;
                            i23 = i14 + 1;
                            i20 = 8;
                            c2413u03 = c2413u02;
                            objArr6 = objArr5;
                            length = i12;
                            i22 = i13;
                            j10 = j8 >> 8;
                            jArr5 = jArr4;
                        }
                        jArr3 = jArr5;
                        c2413u0 = c2413u03;
                        objArr4 = objArr6;
                        int i36 = length;
                        if (i22 != i20) {
                            break;
                        }
                        length = i36;
                    } else {
                        jArr3 = jArr5;
                        c2413u0 = c2413u03;
                        objArr4 = objArr6;
                    }
                    if (i21 == length) {
                        break;
                    }
                    i19 = i21 + 1;
                    c2413u03 = c2413u0;
                    jArr5 = jArr3;
                    objArr6 = objArr4;
                }
            } else {
                j6 = -9187201950435737472L;
                z7 = false;
            }
        } else {
            c7 = 7;
            j6 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z7 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if ((next instanceof AbstractC3479z) && !((AbstractC3479z) next).m5283e(2)) {
                    it = it3;
                    str = str3;
                    c2194h0 = c2194h03;
                } else {
                    if (c2194h03.m3588c(next) && (m3592g2 = c2194h03.m3592g(next)) != null) {
                        if (m3592g2 instanceof C2196i0) {
                            C2196i0 c2196i07 = (C2196i0) m3592g2;
                            Object[] objArr11 = c2196i07.f12685b;
                            long[] jArr11 = c2196i07.f12684a;
                            int length6 = jArr11.length - 2;
                            if (length6 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j15 = jArr11[i37];
                                    long[] jArr12 = jArr11;
                                    Object[] objArr12 = objArr11;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j15 & 255) < 128) {
                                                it2 = it3;
                                                C2352e0 c2352e03 = (C2352e0) objArr12[(i37 << 3) + i39];
                                                AbstractC3367j.m5098c(c2352e03, str3);
                                                i7 = i39;
                                                Object obj7 = hashMap.get(c2352e03);
                                                str2 = str3;
                                                InterfaceC2370i2 interfaceC2370i23 = c2352e03.f13390g;
                                                if (interfaceC2370i23 == null) {
                                                    interfaceC2370i23 = c2413u03;
                                                }
                                                c2194h02 = c2194h03;
                                                if (!interfaceC2370i23.mo3798a(c2352e03.m3792h().f13356f, obj7)) {
                                                    Object m3592g7 = c2194h04.m3592g(c2352e03);
                                                    if (m3592g7 != null) {
                                                        if (m3592g7 instanceof C2196i0) {
                                                            C2196i0 c2196i08 = (C2196i0) m3592g7;
                                                            Object[] objArr13 = c2196i08.f12685b;
                                                            long[] jArr13 = c2196i08.f12684a;
                                                            int length7 = jArr13.length - 2;
                                                            if (length7 >= 0) {
                                                                objArr2 = objArr12;
                                                                boolean z10 = z7;
                                                                int i40 = 0;
                                                                while (true) {
                                                                    long j16 = jArr13[i40];
                                                                    j7 = j15;
                                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                                                        int i42 = 0;
                                                                        while (i42 < i41) {
                                                                            if ((j16 & 255) < 128) {
                                                                                jArr2 = jArr13;
                                                                                c2196i0.m3599a(objArr13[(i40 << 3) + i42]);
                                                                                z10 = true;
                                                                            } else {
                                                                                jArr2 = jArr13;
                                                                            }
                                                                            j16 >>= 8;
                                                                            i42++;
                                                                            jArr13 = jArr2;
                                                                        }
                                                                        jArr = jArr13;
                                                                        if (i41 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr = jArr13;
                                                                    }
                                                                    if (i40 == length7) {
                                                                        break;
                                                                    }
                                                                    i40++;
                                                                    j15 = j7;
                                                                    jArr13 = jArr;
                                                                }
                                                                z7 = z10;
                                                            }
                                                        } else {
                                                            objArr2 = objArr12;
                                                            j7 = j15;
                                                            c2196i0.m3599a(m3592g7);
                                                            z7 = true;
                                                        }
                                                    }
                                                } else {
                                                    objArr2 = objArr12;
                                                    j7 = j15;
                                                    c2705e.m4300b(c2352e03);
                                                }
                                                j15 = j7 >> 8;
                                                str3 = str2;
                                                c2194h03 = c2194h02;
                                                objArr12 = objArr2;
                                                i39 = i7 + 1;
                                                it3 = it2;
                                            } else {
                                                it2 = it3;
                                                i7 = i39;
                                                str2 = str3;
                                                c2194h02 = c2194h03;
                                            }
                                            objArr2 = objArr12;
                                            j7 = j15;
                                            j15 = j7 >> 8;
                                            str3 = str2;
                                            c2194h03 = c2194h02;
                                            objArr12 = objArr2;
                                            i39 = i7 + 1;
                                            it3 = it2;
                                        }
                                        it = it3;
                                        str = str3;
                                        c2194h0 = c2194h03;
                                        objArr = objArr12;
                                        if (i38 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        str = str3;
                                        c2194h0 = c2194h03;
                                        objArr = objArr12;
                                    }
                                    if (i37 == length6) {
                                        break;
                                    }
                                    i37++;
                                    it3 = it;
                                    jArr11 = jArr12;
                                    str3 = str;
                                    c2194h03 = c2194h0;
                                    objArr11 = objArr;
                                }
                            }
                        } else {
                            it = it3;
                            str = str3;
                            c2194h0 = c2194h03;
                            C2352e0 c2352e04 = (C2352e0) m3592g2;
                            Object obj8 = hashMap.get(c2352e04);
                            InterfaceC2370i2 interfaceC2370i24 = c2352e04.f13390g;
                            if (interfaceC2370i24 == null) {
                                interfaceC2370i24 = c2413u03;
                            }
                            if (!interfaceC2370i24.mo3798a(c2352e04.m3792h().f13356f, obj8)) {
                                Object m3592g8 = c2194h04.m3592g(c2352e04);
                                if (m3592g8 != null) {
                                    if (m3592g8 instanceof C2196i0) {
                                        C2196i0 c2196i09 = (C2196i0) m3592g8;
                                        Object[] objArr14 = c2196i09.f12685b;
                                        long[] jArr14 = c2196i09.f12684a;
                                        int length8 = jArr14.length - 2;
                                        if (length8 >= 0) {
                                            int i43 = 0;
                                            while (true) {
                                                long j17 = jArr14[i43];
                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i44 = 8 - ((~(i43 - length8)) >>> 31);
                                                    for (int i45 = 0; i45 < i44; i45++) {
                                                        if ((j17 & 255) < 128) {
                                                            c2196i0.m3599a(objArr14[(i43 << 3) + i45]);
                                                            z7 = true;
                                                        }
                                                        j17 >>= 8;
                                                    }
                                                    if (i44 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i43 == length8) {
                                                    break;
                                                }
                                                i43++;
                                            }
                                        }
                                    } else {
                                        c2196i0.m3599a(m3592g8);
                                        z7 = true;
                                    }
                                }
                            } else {
                                c2705e.m4300b(c2352e04);
                            }
                        }
                        m3592g = c2194h04.m3592g(next);
                        if (m3592g != null) {
                            if (m3592g instanceof C2196i0) {
                                C2196i0 c2196i010 = (C2196i0) m3592g;
                                Object[] objArr15 = c2196i010.f12685b;
                                long[] jArr15 = c2196i010.f12684a;
                                int length9 = jArr15.length - 2;
                                if (length9 >= 0) {
                                    int i46 = 0;
                                    while (true) {
                                        long j18 = jArr15[i46];
                                        if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i47 = 8 - ((~(i46 - length9)) >>> 31);
                                            for (int i48 = 0; i48 < i47; i48++) {
                                                if ((j18 & 255) < 128) {
                                                    c2196i0.m3599a(objArr15[(i46 << 3) + i48]);
                                                    z7 = true;
                                                }
                                                j18 >>= 8;
                                            }
                                            if (i47 != 8) {
                                                break;
                                            }
                                        }
                                        if (i46 != length9) {
                                            i46++;
                                        }
                                    }
                                }
                            } else {
                                c2196i0.m3599a(m3592g);
                                z7 = true;
                            }
                        }
                    }
                    it = it3;
                    str = str3;
                    c2194h0 = c2194h03;
                    m3592g = c2194h04.m3592g(next);
                    if (m3592g != null) {
                    }
                }
                it3 = it;
                str3 = str;
                c2194h03 = c2194h0;
            }
        }
        int i49 = c2705e.f14519g;
        if (i49 != 0) {
            Object[] objArr16 = c2705e.f14517e;
            int i50 = 0;
            while (i50 < i49) {
                C2352e0 c2352e05 = (C2352e0) objArr16[i50];
                int hashCode = Long.hashCode(AbstractC3465l.m5244k().mo5221g());
                Object m3592g9 = c2194h04.m3592g(c2352e05);
                if (m3592g9 != null) {
                    boolean z11 = m3592g9 instanceof C2196i0;
                    C2194h0 c2194h05 = this.f16746f;
                    if (z11) {
                        C2196i0 c2196i011 = (C2196i0) m3592g9;
                        Object[] objArr17 = c2196i011.f12685b;
                        long[] jArr16 = c2196i011.f12684a;
                        int length10 = jArr16.length - 2;
                        if (length10 >= 0) {
                            int i51 = 0;
                            while (true) {
                                long j19 = jArr16[i51];
                                i8 = i49;
                                objArr3 = objArr16;
                                if ((((~j19) << c7) & j19 & j6) != j6) {
                                    int i52 = 8 - ((~(i51 - length10)) >>> 31);
                                    int i53 = 0;
                                    while (i53 < i52) {
                                        if ((j19 & 255) < 128) {
                                            i10 = i53;
                                            Object obj9 = objArr17[(i51 << 3) + i53];
                                            C2182b0 c2182b02 = (C2182b0) c2194h05.m3592g(obj9);
                                            i11 = i50;
                                            if (c2182b02 == null) {
                                                c2182b0 = new C2182b0();
                                                c2194h05.m3598m(obj9, c2182b0);
                                            } else {
                                                c2182b0 = c2182b02;
                                            }
                                            m5275c(c2352e05, hashCode, obj9, c2182b0);
                                        } else {
                                            i10 = i53;
                                            i11 = i50;
                                        }
                                        j19 >>= 8;
                                        i53 = i10 + 1;
                                        i50 = i11;
                                    }
                                    i9 = i50;
                                    if (i52 != 8) {
                                        break;
                                    }
                                } else {
                                    i9 = i50;
                                }
                                if (i51 != length10) {
                                    i51++;
                                    i49 = i8;
                                    objArr16 = objArr3;
                                    i50 = i9;
                                }
                            }
                        } else {
                            i8 = i49;
                            objArr3 = objArr16;
                            i9 = i50;
                        }
                    } else {
                        i8 = i49;
                        objArr3 = objArr16;
                        i9 = i50;
                        C2182b0 c2182b03 = (C2182b0) c2194h05.m3592g(m3592g9);
                        if (c2182b03 == null) {
                            c2182b03 = new C2182b0();
                            c2194h05.m3598m(m3592g9, c2182b03);
                        }
                        m5275c(c2352e05, hashCode, m3592g9, c2182b03);
                    }
                } else {
                    i8 = i49;
                    objArr3 = objArr16;
                    i9 = i50;
                }
                i50 = i9 + 1;
                i49 = i8;
                objArr16 = objArr3;
            }
            c2705e.m4305g();
            return z7;
        }
        return z7;
    }

    /* renamed from: c */
    public final void m5275c(Object obj, int i7, Object obj2, C2182b0 c2182b0) {
        int i8;
        if (this.f16750j <= 0) {
            int m3550c = c2182b0.m3550c(obj);
            if (m3550c < 0) {
                m3550c = ~m3550c;
                i8 = -1;
            } else {
                i8 = c2182b0.f12623c[m3550c];
            }
            c2182b0.f12622b[m3550c] = obj;
            c2182b0.f12623c[m3550c] = i7;
            if ((obj instanceof C2352e0) && i8 != i7) {
                C2348d0 m3792h = ((C2352e0) obj).m3792h();
                this.f16752l.put(obj, m3792h.f13356f);
                C2182b0 c2182b02 = m3792h.f13355e;
                C2194h0 c2194h0 = this.f16751k;
                AbstractC2080d.m3378F(c2194h0, obj);
                Object[] objArr = c2182b02.f12622b;
                long[] jArr = c2182b02.f12621a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j6 = jArr[i9];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j6 & 255) < 128) {
                                    InterfaceC3478y interfaceC3478y = (InterfaceC3478y) objArr[(i9 << 3) + i11];
                                    if (interfaceC3478y instanceof AbstractC3479z) {
                                        ((AbstractC3479z) interfaceC3478y).m5284f(2);
                                    }
                                    AbstractC2080d.m3394g(c2194h0, interfaceC3478y, obj);
                                }
                                j6 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (i8 == -1) {
                if (obj instanceof AbstractC3479z) {
                    ((AbstractC3479z) obj).m5284f(2);
                }
                AbstractC2080d.m3394g(this.f16745e, obj, obj2);
            }
        }
    }

    /* renamed from: d */
    public final void m5276d(Object obj, Object obj2) {
        C2194h0 c2194h0 = this.f16745e;
        AbstractC2080d.m3377E(c2194h0, obj2, obj);
        if ((obj2 instanceof C2352e0) && !c2194h0.m3588c(obj2)) {
            AbstractC2080d.m3378F(this.f16751k, obj2);
            this.f16752l.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5277e() {
        long[] jArr;
        long[] jArr2;
        long j6;
        char c7;
        long j7;
        int i7;
        boolean z7;
        long j8;
        C2194h0 c2194h0 = this.f16746f;
        long[] jArr3 = c2194h0.f12676a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j9 = jArr3[i8];
                char c8 = 7;
                long j10 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j9 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            c7 = c8;
                            Object obj = c2194h0.f12677b[i12];
                            j7 = j10;
                            C2182b0 c2182b0 = (C2182b0) c2194h0.f12678c[i12];
                            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                            boolean mo5303z = ((InterfaceC3527o1) obj).mo5303z();
                            if (!mo5303z) {
                                Object[] objArr = c2182b0.f12622b;
                                int[] iArr = c2182b0.f12623c;
                                long[] jArr4 = c2182b0.f12621a;
                                int i13 = i9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j6 = j9;
                                    int i14 = 0;
                                    while (true) {
                                        long j11 = jArr4[i14];
                                        long[] jArr5 = jArr4;
                                        z7 = mo5303z;
                                        if ((((~j11) << c7) & j11 & j7) != j7) {
                                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                if ((j11 & 255) < 128) {
                                                    int i17 = (i14 << 3) + i16;
                                                    j8 = j11;
                                                    Object obj2 = objArr[i17];
                                                    int i18 = iArr[i17];
                                                    m5276d(obj, obj2);
                                                } else {
                                                    j8 = j11;
                                                }
                                                j11 = j8 >> i13;
                                            }
                                            if (i15 != i13) {
                                                break;
                                            }
                                        }
                                        if (i14 == length2) {
                                            break;
                                        }
                                        i14++;
                                        mo5303z = z7;
                                        jArr4 = jArr5;
                                        i13 = 8;
                                    }
                                    if (!z7) {
                                        c2194h0.m3597l(i12);
                                    }
                                    i7 = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j6 = j9;
                            z7 = mo5303z;
                            if (!z7) {
                            }
                            i7 = 8;
                        } else {
                            jArr2 = jArr3;
                            j6 = j9;
                            c7 = c8;
                            j7 = j10;
                            i7 = i9;
                        }
                        i11++;
                        i9 = i7;
                        j9 = j6 >> i7;
                        c8 = c7;
                        j10 = j7;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i10 != i9) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i8 != length) {
                    i8++;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
