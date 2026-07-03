package p077k;

import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.b0 */
/* loaded from: classes.dex */
public final class C2182b0 {

    /* renamed from: a */
    public long[] f12621a;

    /* renamed from: b */
    public Object[] f12622b;

    /* renamed from: c */
    public int[] f12623c;

    /* renamed from: d */
    public int f12624d;

    /* renamed from: e */
    public int f12625e;

    /* renamed from: f */
    public int f12626f;

    public C2182b0(int i7) {
        this.f12621a = AbstractC2210p0.f12722a;
        this.f12622b = AbstractC2334a.f13324c;
        this.f12623c = AbstractC2205n.f12714a;
        if (i7 >= 0) {
            m3553f(AbstractC2210p0.m3621d(i7));
        } else {
            AbstractC2334a.m3712c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m3548a() {
        this.f12625e = 0;
        long[] jArr = this.f12621a;
        if (jArr != AbstractC2210p0.f12722a) {
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12621a;
            int i7 = this.f12624d;
            int i8 = i7 >> 3;
            long j6 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j6)) | j6;
        }
        AbstractC1804l.m3023P(this.f12622b, 0, this.f12624d);
        this.f12626f = AbstractC2210p0.m3618a(this.f12624d) - this.f12625e;
    }

    /* renamed from: b */
    public final int m3549b(int i7) {
        int i8 = this.f12624d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12621a;
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

    /* renamed from: c */
    public final int m3550c(Object obj) {
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
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = -862048943;
        int i12 = i7 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f12624d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f12621a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j9 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j10 = i15;
            int i21 = i15;
            int i22 = 0;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                int i23 = i11;
                if (AbstractC3367j.m5096a(this.f12622b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i11 = i23;
            }
            int i24 = i11;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int m3549b = m3549b(i14);
                long j13 = 255;
                if (this.f12626f != 0 || ((this.f12621a[m3549b >> 3] >> ((m3549b & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    j7 = j10;
                    j8 = 128;
                } else {
                    int i25 = this.f12624d;
                    if (i25 > 8) {
                        int i26 = 8;
                        if (Long.compare((this.f12625e * 32) ^ Long.MIN_VALUE, (i25 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f12621a;
                            int i27 = this.f12624d;
                            Object[] objArr2 = this.f12622b;
                            int[] iArr = this.f12623c;
                            j8 = 128;
                            int i28 = (i27 + 7) >> 3;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j14 = j13;
                                long j15 = jArr4[i29] & (-9187201950435737472L);
                                jArr4[i29] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i29++;
                                i26 = i26;
                                j10 = j10;
                                j13 = j14;
                            }
                            j6 = j13;
                            j7 = j10;
                            int i30 = i26;
                            int m3027T = AbstractC1804l.m3027T(jArr4);
                            int i31 = m3027T - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[m3027T] = jArr4[0];
                            int i32 = 0;
                            while (i32 != i27) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j17 = (jArr4[i33] >> i34) & j6;
                                if (j17 == 128 || j17 != 254) {
                                    i32++;
                                } else {
                                    Object obj2 = objArr2[i32];
                                    if (obj2 != null) {
                                        i9 = obj2.hashCode();
                                    } else {
                                        i9 = 0;
                                    }
                                    int i35 = i9 * i24;
                                    int i36 = (i35 ^ (i35 << 16)) >>> 7;
                                    int m3549b2 = m3549b(i36);
                                    int i37 = i36 & i27;
                                    long j18 = j16;
                                    if (((m3549b2 - i37) & i27) / 8 == ((i32 - i37) & i27) / i30) {
                                        jArr4[i33] = ((r8 & 127) << i34) | (jArr4[i33] & (~(j6 << i34)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i32++;
                                        j16 = j18;
                                        i30 = i30;
                                    } else {
                                        int i38 = i30;
                                        int i39 = m3549b2 >> 3;
                                        long j19 = jArr4[i39];
                                        int i40 = (m3549b2 & 7) << 3;
                                        if (((j19 >> i40) & j6) == 128) {
                                            i10 = i27;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j6 << i40)) & j19) | ((r8 & 127) << i40);
                                            jArr4[i33] = (jArr4[i33] & (~(j6 << i34))) | (128 << i34);
                                            objArr[m3549b2] = objArr[i32];
                                            objArr[i32] = null;
                                            iArr[m3549b2] = iArr[i32];
                                            iArr[i32] = 0;
                                        } else {
                                            i10 = i27;
                                            objArr = objArr2;
                                            jArr4[i39] = ((r8 & 127) << i40) | ((~(j6 << i40)) & j19);
                                            Object obj3 = objArr[m3549b2];
                                            objArr[m3549b2] = objArr[i32];
                                            objArr[i32] = obj3;
                                            int i41 = iArr[m3549b2];
                                            iArr[m3549b2] = iArr[i32];
                                            iArr[i32] = i41;
                                            i32--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i32++;
                                        i27 = i10;
                                        j16 = j18;
                                        i30 = i38;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f12626f = AbstractC2210p0.m3618a(this.f12624d) - this.f12625e;
                            m3549b = m3549b(i14);
                        }
                    }
                    j6 = 255;
                    j7 = j10;
                    j8 = 128;
                    int m3619b = AbstractC2210p0.m3619b(this.f12624d);
                    long[] jArr5 = this.f12621a;
                    Object[] objArr3 = this.f12622b;
                    int[] iArr2 = this.f12623c;
                    int i42 = this.f12624d;
                    m3553f(m3619b);
                    long[] jArr6 = this.f12621a;
                    Object[] objArr4 = this.f12622b;
                    int[] iArr3 = this.f12623c;
                    int i43 = this.f12624d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i44];
                            if (obj4 != null) {
                                i8 = obj4.hashCode();
                            } else {
                                i8 = 0;
                            }
                            int i45 = i8 * i24;
                            int i46 = i45 ^ (i45 << 16);
                            int m3549b3 = m3549b(i46 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j20 = i46 & 127;
                            int i47 = m3549b3 >> 3;
                            int i48 = (m3549b3 & 7) << 3;
                            long j21 = (jArr[i47] & (~(255 << i48))) | (j20 << i48);
                            jArr[i47] = j21;
                            jArr[(((m3549b3 - 7) & i43) + (i43 & 7)) >> 3] = j21;
                            objArr4[m3549b3] = obj4;
                            iArr3[m3549b3] = iArr2[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    m3549b = m3549b(i14);
                }
                this.f12625e++;
                int i49 = this.f12626f;
                long[] jArr7 = this.f12621a;
                int i50 = m3549b >> 3;
                long j22 = jArr7[i50];
                int i51 = (m3549b & 7) << 3;
                if (((j22 >> i51) & j6) == j8) {
                    i22 = 1;
                }
                this.f12626f = i49 - i22;
                int i52 = this.f12624d;
                long j23 = (j22 & (~(j6 << i51))) | (j7 << i51);
                jArr7[i50] = j23;
                jArr7[(((m3549b - 7) & i52) + (i52 & 7)) >> 3] = j23;
                return ~m3549b;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
            i11 = i24;
        }
    }

    /* renamed from: d */
    public final int m3551d(Object obj) {
        int i7;
        int i8 = 0;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * (-862048943);
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 & 127;
        int i12 = this.f12624d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12621a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = (i11 * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i14) & i12;
                if (AbstractC3367j.m5096a(this.f12622b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i13 = i14 + i8;
        }
    }

    /* renamed from: e */
    public final int m3552e(Object obj) {
        int m3551d = m3551d(obj);
        if (m3551d >= 0) {
            return this.f12623c[m3551d];
        }
        AbstractC2334a.m3714e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2182b0)) {
            return false;
        }
        C2182b0 c2182b0 = (C2182b0) obj;
        if (c2182b0.f12625e != this.f12625e) {
            return false;
        }
        Object[] objArr = this.f12622b;
        int[] iArr = this.f12623c;
        long[] jArr = this.f12621a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        loop0: while (true) {
            long j6 = jArr[i7];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j6) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj2 = objArr[i10];
                        int i11 = iArr[i10];
                        int m3551d = c2182b0.m3551d(obj2);
                        if (m3551d < 0) {
                            break loop0;
                        }
                        z8 = z9;
                        if (i11 != c2182b0.f12623c[m3551d]) {
                            break loop0;
                        }
                    } else {
                        z8 = z9;
                    }
                    j6 >>= 8;
                    i9++;
                    z9 = z8;
                }
                z7 = z9;
                if (i8 != 8) {
                    return z7;
                }
            } else {
                z7 = z9;
            }
            if (i7 != length) {
                i7++;
                z9 = z7;
            } else {
                return z7;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m3553f(int i7) {
        int i8;
        long[] jArr;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12624d = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12621a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12626f = AbstractC2210p0.m3618a(this.f12624d) - this.f12625e;
        this.f12622b = new Object[i8];
        this.f12623c = new int[i8];
    }

    /* renamed from: g */
    public final void m3554g(int i7) {
        this.f12625e--;
        long[] jArr = this.f12621a;
        int i8 = this.f12624d;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j6 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j6;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j6;
        this.f12622b[i7] = null;
    }

    /* renamed from: h */
    public final void m3555h(int i7, Object obj) {
        int m3550c = m3550c(obj);
        if (m3550c < 0) {
            m3550c = ~m3550c;
        }
        this.f12622b[m3550c] = obj;
        this.f12623c[m3550c] = i7;
    }

    public final int hashCode() {
        int i7;
        Object[] objArr = this.f12622b;
        int[] iArr = this.f12623c;
        long[] jArr = this.f12621a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            long j6 = jArr[i8];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        int i12 = (i8 << 3) + i11;
                        Object obj = objArr[i12];
                        int i13 = iArr[i12];
                        if (obj != null) {
                            i7 = obj.hashCode();
                        } else {
                            i7 = 0;
                        }
                        i9 += Integer.hashCode(i13) ^ i7;
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return i9;
                }
            }
            if (i8 != length) {
                i8++;
            } else {
                return i9;
            }
        }
    }

    public final String toString() {
        if (this.f12625e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f12622b;
        int[] iArr = this.f12623c;
        long[] jArr = this.f12621a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j6) < 128) {
                            int i11 = (i7 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i12);
                            i8++;
                            if (i8 < this.f12625e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C2182b0() {
        this(6);
    }
}
