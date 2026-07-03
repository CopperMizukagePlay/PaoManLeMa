package p077k;

import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.i0 */
/* loaded from: classes.dex */
public final class C2196i0 {

    /* renamed from: a */
    public long[] f12684a;

    /* renamed from: b */
    public Object[] f12685b;

    /* renamed from: c */
    public int f12686c;

    /* renamed from: d */
    public int f12687d;

    /* renamed from: e */
    public int f12688e;

    public C2196i0(int i7) {
        this.f12684a = AbstractC2210p0.f12722a;
        this.f12685b = AbstractC2334a.f13324c;
        if (i7 >= 0) {
            m3604f(AbstractC2210p0.m3621d(i7));
        } else {
            AbstractC2334a.m3712c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean m3599a(Object obj) {
        int i7 = this.f12687d;
        this.f12685b[m3602d(obj)] = obj;
        if (this.f12687d != i7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m3600b() {
        this.f12687d = 0;
        long[] jArr = this.f12684a;
        if (jArr != AbstractC2210p0.f12722a) {
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12684a;
            int i7 = this.f12686c;
            int i8 = i7 >> 3;
            long j6 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j6)) | j6;
        }
        AbstractC1804l.m3023P(this.f12685b, 0, this.f12686c);
        this.f12688e = AbstractC2210p0.m3618a(this.f12686c) - this.f12687d;
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
    public final boolean m3601c(Object obj) {
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
        int i12 = this.f12686c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12684a;
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
                if (AbstractC3367j.m5096a(this.f12685b[i8], obj)) {
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
    public final int m3602d(Object obj) {
        int i7;
        long j6;
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i8;
        int i9;
        int i10;
        Object[] objArr;
        int i11;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = -862048943;
        int i13 = i7 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f12686c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f12684a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j9 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j10 = i16;
            int i22 = i16;
            int i23 = 0;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j12) >> 3)) & i17;
                int i24 = i12;
                if (AbstractC3367j.m5096a(this.f12685b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int m3603e = m3603e(i15);
                long j13 = 255;
                if (this.f12688e != 0 || ((this.f12684a[m3603e >> 3] >> ((m3603e & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    j7 = j10;
                    j8 = 128;
                } else {
                    int i26 = this.f12686c;
                    if (i26 > 8) {
                        int i27 = 8;
                        if (Long.compare((this.f12687d * 32) ^ Long.MIN_VALUE, (i26 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f12684a;
                            int i28 = this.f12686c;
                            Object[] objArr2 = this.f12685b;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            j8 = 128;
                            while (i30 < i29) {
                                long j14 = j13;
                                long j15 = jArr4[i30] & (-9187201950435737472L);
                                jArr4[i30] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i30++;
                                i27 = i27;
                                j10 = j10;
                                j13 = j14;
                            }
                            j6 = j13;
                            j7 = j10;
                            int i31 = i27;
                            int m3027T = AbstractC1804l.m3027T(jArr4);
                            int i32 = m3027T - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[m3027T] = jArr4[0];
                            int i33 = 0;
                            while (i33 != i28) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j17 = (jArr4[i34] >> i35) & j6;
                                if (j17 == 128 || j17 != 254) {
                                    i33++;
                                } else {
                                    Object obj2 = objArr2[i33];
                                    if (obj2 != null) {
                                        i9 = obj2.hashCode();
                                    } else {
                                        i9 = 0;
                                    }
                                    int i36 = i9 * i25;
                                    int i37 = (i36 ^ (i36 << 16)) >>> 7;
                                    int m3603e2 = m3603e(i37);
                                    int i38 = i37 & i28;
                                    if (((m3603e2 - i38) & i28) / i31 == ((i33 - i38) & i28) / i31) {
                                        long j18 = j16;
                                        jArr4[i34] = ((r7 & 127) << i35) | ((~(j6 << i35)) & jArr4[i34]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i33++;
                                        j16 = j18;
                                    } else {
                                        long j19 = j16;
                                        int i39 = m3603e2 >> 3;
                                        long j20 = jArr4[i39];
                                        int i40 = (m3603e2 & 7) << 3;
                                        if (((j20 >> i40) & j6) == 128) {
                                            i11 = i31;
                                            i10 = i28;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j6 << i40)) & j20) | ((r7 & 127) << i40);
                                            jArr4[i34] = (jArr4[i34] & (~(j6 << i35))) | (128 << i35);
                                            objArr[m3603e2] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            i10 = i28;
                                            objArr = objArr2;
                                            i11 = i31;
                                            jArr4[i39] = ((r7 & 127) << i40) | ((~(j6 << i40)) & j20);
                                            Object obj3 = objArr[m3603e2];
                                            objArr[m3603e2] = objArr[i33];
                                            objArr[i33] = obj3;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i33++;
                                        j16 = j19;
                                        i31 = i11;
                                        i28 = i10;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f12688e = AbstractC2210p0.m3618a(this.f12686c) - this.f12687d;
                            m3603e = m3603e(i15);
                        }
                    }
                    j6 = 255;
                    j7 = j10;
                    j8 = 128;
                    int m3619b = AbstractC2210p0.m3619b(this.f12686c);
                    long[] jArr5 = this.f12684a;
                    Object[] objArr3 = this.f12685b;
                    int i41 = this.f12686c;
                    m3604f(m3619b);
                    long[] jArr6 = this.f12684a;
                    Object[] objArr4 = this.f12685b;
                    int i42 = this.f12686c;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr5[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i43];
                            if (obj4 != null) {
                                i8 = obj4.hashCode();
                            } else {
                                i8 = 0;
                            }
                            int i44 = i8 * i25;
                            int i45 = i44 ^ (i44 << 16);
                            int m3603e3 = m3603e(i45 >>> 7);
                            long j21 = i45 & 127;
                            int i46 = m3603e3 >> 3;
                            int i47 = (m3603e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = (jArr6[i46] & (~(255 << i47))) | (j21 << i47);
                            jArr[i46] = j22;
                            jArr[(((m3603e3 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                            objArr4[m3603e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i43++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    m3603e = m3603e(i15);
                }
                this.f12687d++;
                int i48 = this.f12688e;
                long[] jArr7 = this.f12684a;
                int i49 = m3603e >> 3;
                long j23 = jArr7[i49];
                int i50 = (m3603e & 7) << 3;
                if (((j23 >> i50) & j6) == j8) {
                    i23 = 1;
                }
                this.f12688e = i48 - i23;
                int i51 = this.f12686c;
                long j24 = (j23 & (~(j6 << i50))) | (j7 << i50);
                jArr7[i49] = j24;
                jArr7[(((m3603e - 7) & i51) + (i51 & 7)) >> 3] = j24;
                return m3603e;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i22;
            i12 = i25;
        }
    }

    /* renamed from: e */
    public final int m3603e(int i7) {
        int i8 = this.f12686c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12684a;
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
        if (!(obj instanceof C2196i0)) {
            return false;
        }
        C2196i0 c2196i0 = (C2196i0) obj;
        if (c2196i0.f12687d != this.f12687d) {
            return false;
        }
        Object[] objArr = this.f12685b;
        long[] jArr = this.f12684a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128 && !c2196i0.m3601c(objArr[(i7 << 3) + i9])) {
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
    public final void m3604f(int i7) {
        int i8;
        long[] jArr;
        Object[] objArr;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12686c = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12684a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12688e = AbstractC2210p0.m3618a(this.f12686c) - this.f12687d;
        if (i8 == 0) {
            objArr = AbstractC2334a.f13324c;
        } else {
            objArr = new Object[i8];
        }
        this.f12685b = objArr;
    }

    /* renamed from: g */
    public final boolean m3605g() {
        if (this.f12687d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m3606h() {
        if (this.f12687d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (this.f12686c * 31) + this.f12687d;
        Object[] objArr = this.f12685b;
        long[] jArr = this.f12684a;
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
    public final void m3607i(Object obj) {
        this.f12685b[m3602d(obj)] = obj;
    }

    /* renamed from: j */
    public final void m3608j(C2196i0 c2196i0) {
        AbstractC3367j.m5100e(c2196i0, "elements");
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
                        if ((255 & j6) < 128) {
                            m3607i(objArr[(i7 << 3) + i9]);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3609k(Object obj) {
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
        int i12 = this.f12686c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12684a;
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
                if (AbstractC3367j.m5096a(this.f12685b[i8], obj)) {
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
            m3610l(i8);
        }
        return z7;
    }

    /* renamed from: l */
    public final void m3610l(int i7) {
        this.f12687d--;
        long[] jArr = this.f12684a;
        int i8 = this.f12686c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j6 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j6;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j6;
        this.f12685b[i7] = null;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f12685b;
        long[] jArr = this.f12684a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j6) < 128) {
                            Object obj = objArr[(i7 << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
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
                        }
                        j6 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C2196i0() {
        this(6);
    }
}
