package p077k;

import java.util.Arrays;
import java.util.Collection;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.e0 */
/* loaded from: classes.dex */
public final class C2188e0 {

    /* renamed from: a */
    public long[] f12641a = AbstractC2210p0.f12722a;

    /* renamed from: b */
    public Object[] f12642b = AbstractC2334a.f13324c;

    /* renamed from: c */
    public long[] f12643c = AbstractC2211q.f12724b;

    /* renamed from: d */
    public int f12644d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f12645e = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f12646f;

    /* renamed from: g */
    public int f12647g;

    /* renamed from: h */
    public int f12648h;

    public C2188e0(int i7) {
        if (i7 >= 0) {
            m3579f(AbstractC2210p0.m3621d(i7));
        } else {
            AbstractC2334a.m3712c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean m3574a(Object obj) {
        int i7 = this.f12647g;
        int m3577d = m3577d(obj);
        this.f12642b[m3577d] = obj;
        long[] jArr = this.f12643c;
        int i8 = this.f12644d;
        jArr[m3577d] = (i8 & 2147483647L) | 4611686016279904256L;
        if (i8 != Integer.MAX_VALUE) {
            jArr[i8] = ((m3577d & 2147483647L) << 31) | (jArr[i8] & (-4611686016279904257L));
        }
        this.f12644d = m3577d;
        if (this.f12645e == Integer.MAX_VALUE) {
            this.f12645e = m3577d;
        }
        if (this.f12647g != i7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m3575b() {
        this.f12647g = 0;
        long[] jArr = this.f12641a;
        if (jArr != AbstractC2210p0.f12722a) {
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12641a;
            int i7 = this.f12646f;
            int i8 = i7 >> 3;
            long j6 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j6)) | j6;
        }
        AbstractC1804l.m3023P(this.f12642b, 0, this.f12646f);
        AbstractC1804l.m3024Q(this.f12643c, 4611686018427387903L);
        this.f12644d = Integer.MAX_VALUE;
        this.f12645e = Integer.MAX_VALUE;
        this.f12648h = AbstractC2210p0.m3618a(this.f12646f) - this.f12647g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3576c(Object obj) {
        int i7;
        int i8;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * (-862048943);
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 & 127;
        int i12 = this.f12646f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12641a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = (i11 * 72340172838076673L) ^ j6;
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j8 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j8) >> 3) + i13) & i12;
                if (AbstractC3367j.m5096a(this.f12642b[i8], obj)) {
                    break loop0;
                }
                j8 &= j8 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i8 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int m3577d(Object obj) {
        int i7;
        int i8;
        long j6;
        long j7;
        long j8;
        char c7;
        int i9;
        int i10;
        long[] jArr;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        long j9;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = -862048943;
        int i16 = i7 * (-862048943);
        int i17 = i16 ^ (i16 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = this.f12646f;
        int i21 = i18 & i20;
        int i22 = 0;
        while (true) {
            long[] jArr3 = this.f12641a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j10 = ((jArr3[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr3[i23] >>> i24);
            long j11 = i19;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i21) & i20;
                int i25 = i15;
                if (AbstractC3367j.m5096a(this.f12642b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i15 = i25;
            }
            int i26 = i15;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                int m3578e = m3578e(i18);
                long j14 = 255;
                if (this.f12648h != 0 || ((this.f12641a[m3578e >> 3] >> ((m3578e & 7) << 3)) & 255) == 254) {
                    i8 = 0;
                    j6 = j11;
                    j7 = 255;
                    j8 = 128;
                } else {
                    int i27 = this.f12646f;
                    if (i27 > 8) {
                        c7 = 31;
                        j8 = 128;
                        if (Long.compare((this.f12647g * 32) ^ Long.MIN_VALUE, (i27 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f12641a;
                            if (jArr4 == null) {
                                i8 = 0;
                                j6 = j11;
                                j7 = 255;
                            } else {
                                int i28 = this.f12646f;
                                Object[] objArr = this.f12642b;
                                long[] jArr5 = this.f12643c;
                                long[] jArr6 = new long[i28];
                                Arrays.fill(jArr6, 0, i28, 9223372034707292159L);
                                i8 = 0;
                                int i29 = (i28 + 7) >> 3;
                                int i30 = 0;
                                while (i30 < i29) {
                                    long j15 = j14;
                                    long j16 = jArr4[i30] & (-9187201950435737472L);
                                    int i31 = i30;
                                    jArr4[i31] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                                    i30 = i31 + 1;
                                    j14 = j15;
                                }
                                j7 = j14;
                                int length = jArr4.length;
                                int i32 = length - 1;
                                int i33 = length - 2;
                                jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i32] = jArr4[0];
                                int i34 = 0;
                                while (i34 != i28) {
                                    int i35 = i34 >> 3;
                                    int i36 = (i34 & 7) << 3;
                                    long j17 = (jArr4[i35] >> i36) & j7;
                                    if (j17 == 128 || j17 != 254) {
                                        i34++;
                                    } else {
                                        Object obj2 = objArr[i34];
                                        if (obj2 != null) {
                                            i14 = obj2.hashCode();
                                        } else {
                                            i14 = 0;
                                        }
                                        int i37 = i14 * i26;
                                        int i38 = (i37 ^ (i37 << 16)) >>> 7;
                                        int m3578e2 = m3578e(i38);
                                        int i39 = i38 & i28;
                                        if (((m3578e2 - i39) & i28) / 8 == ((i34 - i39) & i28) / 8) {
                                            int i40 = i28;
                                            Object[] objArr2 = objArr;
                                            jArr4[i35] = (jArr4[i35] & (~(j7 << i36))) | ((r17 & 127) << i36);
                                            if (jArr6[i34] == 9223372034707292159L) {
                                                long j18 = i34;
                                                jArr6[i34] = j18 | (j18 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i34++;
                                            i28 = i40;
                                            objArr = objArr2;
                                        } else {
                                            int i41 = i28;
                                            Object[] objArr3 = objArr;
                                            int i42 = m3578e2 >> 3;
                                            long j19 = jArr4[i42];
                                            int i43 = (m3578e2 & 7) << 3;
                                            if (((j19 >> i43) & j7) == 128) {
                                                jArr4[i42] = (j19 & (~(j7 << i43))) | ((r17 & 127) << i43);
                                                jArr4[i35] = (jArr4[i35] & (~(j7 << i36))) | (128 << i36);
                                                objArr3[m3578e2] = objArr3[i34];
                                                objArr3[i34] = null;
                                                jArr5[m3578e2] = jArr5[i34];
                                                jArr5[i34] = 4611686018427387903L;
                                                int i44 = (int) ((jArr6[i34] >> 32) & 4294967295L);
                                                int i45 = Integer.MAX_VALUE;
                                                if (i44 != Integer.MAX_VALUE) {
                                                    j9 = j11;
                                                    jArr6[i44] = m3578e2 | (jArr6[i44] & (-4294967296L));
                                                    jArr6[i34] = (jArr6[i34] & 4294967295L) | (-4294967296L);
                                                    i45 = Integer.MAX_VALUE;
                                                } else {
                                                    j9 = j11;
                                                    jArr6[i34] = (Integer.MAX_VALUE << 32) | m3578e2;
                                                }
                                                jArr6[m3578e2] = (i34 << 32) | i45;
                                            } else {
                                                j9 = j11;
                                                jArr4[i42] = ((r17 & 127) << i43) | (j19 & (~(j7 << i43)));
                                                Object obj3 = objArr3[m3578e2];
                                                objArr3[m3578e2] = objArr3[i34];
                                                objArr3[i34] = obj3;
                                                long j20 = jArr5[m3578e2];
                                                jArr5[m3578e2] = jArr5[i34];
                                                jArr5[i34] = j20;
                                                int i46 = (int) ((jArr6[i34] >> 32) & 4294967295L);
                                                if (i46 != Integer.MAX_VALUE) {
                                                    long j21 = m3578e2;
                                                    jArr6[i46] = (jArr6[i46] & (-4294967296L)) | j21;
                                                    jArr6[i34] = (jArr6[i34] & 4294967295L) | (j21 << 32);
                                                } else {
                                                    long j22 = m3578e2;
                                                    jArr6[i34] = j22 | (j22 << 32);
                                                    i46 = i34;
                                                }
                                                jArr6[m3578e2] = (i46 << 32) | i34;
                                                i34--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i34++;
                                            i28 = i41;
                                            objArr = objArr3;
                                            j11 = j9;
                                        }
                                    }
                                }
                                j6 = j11;
                                this.f12648h = AbstractC2210p0.m3618a(this.f12646f) - this.f12647g;
                                long[] jArr7 = this.f12643c;
                                int length2 = jArr7.length;
                                for (int i47 = 0; i47 < length2; i47++) {
                                    long j23 = jArr7[i47];
                                    int i48 = (int) ((j23 >> 31) & 2147483647L);
                                    int i49 = (int) (j23 & 2147483647L);
                                    long j24 = j23 & (-4611686018427387904L);
                                    if (i48 == Integer.MAX_VALUE) {
                                        i12 = Integer.MAX_VALUE;
                                    } else {
                                        i12 = (int) (jArr6[i48] & 4294967295L);
                                    }
                                    long j25 = (j24 | i12) << 31;
                                    if (i49 == Integer.MAX_VALUE) {
                                        i13 = Integer.MAX_VALUE;
                                    } else {
                                        i13 = (int) (jArr6[i49] & 4294967295L);
                                    }
                                    jArr7[i47] = j25 | i13;
                                }
                                int i50 = this.f12644d;
                                if (i50 != Integer.MAX_VALUE) {
                                    this.f12644d = (int) (jArr6[i50] & 4294967295L);
                                }
                                int i51 = this.f12645e;
                                if (i51 != Integer.MAX_VALUE) {
                                    this.f12645e = (int) (jArr6[i51] & 4294967295L);
                                }
                            }
                            m3578e = m3578e(i18);
                        }
                    } else {
                        c7 = 31;
                        j8 = 128;
                    }
                    i8 = 0;
                    j6 = j11;
                    j7 = 255;
                    int m3619b = AbstractC2210p0.m3619b(this.f12646f);
                    long[] jArr8 = this.f12641a;
                    Object[] objArr4 = this.f12642b;
                    long[] jArr9 = this.f12643c;
                    int i52 = this.f12646f;
                    int[] iArr = new int[i52];
                    m3579f(m3619b);
                    long[] jArr10 = this.f12641a;
                    Object[] objArr5 = this.f12642b;
                    long[] jArr11 = this.f12643c;
                    int i53 = this.f12646f;
                    int i54 = 0;
                    while (i54 < i52) {
                        if (((jArr8[i54 >> 3] >> ((i54 & 7) << 3)) & 255) < j8) {
                            Object obj4 = objArr4[i54];
                            if (obj4 != null) {
                                i11 = obj4.hashCode();
                            } else {
                                i11 = 0;
                            }
                            int i55 = i11 * i26;
                            int i56 = i55 ^ (i55 << 16);
                            int m3578e3 = m3578e(i56 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j26 = i56 & 127;
                            int i57 = m3578e3 >> 3;
                            int i58 = (m3578e3 & 7) << 3;
                            long j27 = (jArr[i57] & (~(255 << i58))) | (j26 << i58);
                            jArr[i57] = j27;
                            jArr[(((m3578e3 - 7) & i53) + (i53 & 7)) >> 3] = j27;
                            objArr5[m3578e3] = obj4;
                            jArr11[m3578e3] = jArr9[i54];
                            iArr[i54] = m3578e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i54++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f12643c;
                    int length3 = jArr12.length;
                    for (int i59 = 0; i59 < length3; i59++) {
                        long j28 = jArr12[i59];
                        int i60 = (int) ((j28 >> c7) & 2147483647L);
                        int i61 = (int) (j28 & 2147483647L);
                        long j29 = j28 & (-4611686018427387904L);
                        if (i60 == Integer.MAX_VALUE) {
                            i9 = Integer.MAX_VALUE;
                        } else {
                            i9 = iArr[i60];
                        }
                        long j30 = (j29 | i9) << c7;
                        if (i61 == Integer.MAX_VALUE) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = iArr[i61];
                        }
                        jArr12[i59] = j30 | i10;
                    }
                    int i62 = this.f12644d;
                    if (i62 != Integer.MAX_VALUE) {
                        this.f12644d = iArr[i62];
                    }
                    int i63 = this.f12645e;
                    if (i63 != Integer.MAX_VALUE) {
                        this.f12645e = iArr[i63];
                    }
                    m3578e = m3578e(i18);
                }
                this.f12647g++;
                int i64 = this.f12648h;
                long[] jArr13 = this.f12641a;
                int i65 = m3578e >> 3;
                long j31 = jArr13[i65];
                int i66 = (m3578e & 7) << 3;
                if (((j31 >> i66) & j7) == j8) {
                    i8 = 1;
                }
                this.f12648h = i64 - i8;
                int i67 = this.f12646f;
                long j32 = (j31 & (~(j7 << i66))) | (j6 << i66);
                jArr13[i65] = j32;
                jArr13[(((m3578e - 7) & i67) + (i67 & 7)) >> 3] = j32;
                return m3578e;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i15 = i26;
        }
    }

    /* renamed from: e */
    public final int m3578e(int i7) {
        int i8 = this.f12646f;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12641a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j6 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j7 = j6 & ((~j6) << 7) & (-9187201950435737472L);
            if (j7 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2188e0)) {
            return false;
        }
        C2188e0 c2188e0 = (C2188e0) obj;
        if (c2188e0.f12647g != this.f12647g) {
            return false;
        }
        Object[] objArr = this.f12642b;
        long[] jArr = this.f12641a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128 && !c2188e0.m3576c(objArr[(i7 << 3) + i9])) {
                            return false;
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m3579f(int i7) {
        int i8;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12646f = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12641a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12648h = AbstractC2210p0.m3618a(this.f12646f) - this.f12647g;
        if (i8 == 0) {
            objArr = AbstractC2334a.f13324c;
        } else {
            objArr = new Object[i8];
        }
        this.f12642b = objArr;
        if (i8 == 0) {
            jArr2 = AbstractC2211q.f12724b;
        } else {
            jArr2 = new long[i8];
            AbstractC1804l.m3024Q(jArr2, 4611686018427387903L);
        }
        this.f12643c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3580g(Object obj) {
        int i7;
        int i8;
        boolean z7 = false;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * (-862048943);
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 & 127;
        int i12 = this.f12646f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12641a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = (i11 * 72340172838076673L) ^ j6;
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j8 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j8) >> 3) + i13) & i12;
                if (AbstractC3367j.m5096a(this.f12642b[i8], obj)) {
                    break loop0;
                }
                j8 &= j8 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i8 >= 0) {
            z7 = true;
        }
        if (z7) {
            m3581h(i8);
        }
        return z7;
    }

    /* renamed from: h */
    public final void m3581h(int i7) {
        this.f12647g--;
        long[] jArr = this.f12641a;
        int i8 = this.f12646f;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j6 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j6;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j6;
        this.f12642b[i7] = null;
        long[] jArr2 = this.f12643c;
        long j7 = jArr2[i7];
        int i11 = (int) ((j7 >> 31) & 2147483647L);
        int i12 = (int) (j7 & 2147483647L);
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = (jArr2[i11] & (-2147483648L)) | (i12 & 2147483647L);
        } else {
            this.f12644d = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr2[i12] = ((i11 & 2147483647L) << 31) | (jArr2[i12] & (-4611686016279904257L));
        } else {
            this.f12645e = i11;
        }
        jArr2[i7] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i7;
        int i8 = (this.f12646f * 31) + this.f12647g;
        Object[] objArr = this.f12642b;
        long[] jArr = this.f12641a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr[i9];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            Object obj = objArr[(i9 << 3) + i11];
                            if (!AbstractC3367j.m5096a(obj, this)) {
                                if (obj != null) {
                                    i7 = obj.hashCode();
                                } else {
                                    i7 = 0;
                                }
                                i8 += i7;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        return i8;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        return i8;
    }

    /* renamed from: i */
    public final boolean m3582i(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Object[] objArr = this.f12642b;
        int i7 = this.f12647g;
        long[] jArr = this.f12641a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j6) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!AbstractC1805m.m3041e0(collection, objArr[i11])) {
                                m3581h(i11);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        if (i7 == this.f12647g) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f12642b;
        long[] jArr = this.f12643c;
        int i7 = this.f12645e;
        int i8 = 0;
        while (true) {
            if (i7 != Integer.MAX_VALUE) {
                int i9 = (int) ((jArr[i7] >> 31) & 2147483647L);
                Object obj = objArr[i7];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i8++;
                i7 = i9;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
