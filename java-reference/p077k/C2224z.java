package p077k;

import p060h5.AbstractC1804l;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.z */
/* loaded from: classes.dex */
public final class C2224z {

    /* renamed from: a */
    public long[] f12764a;

    /* renamed from: b */
    public long[] f12765b;

    /* renamed from: c */
    public Object[] f12766c;

    /* renamed from: d */
    public int f12767d;

    /* renamed from: e */
    public int f12768e;

    /* renamed from: f */
    public int f12769f;

    /* renamed from: a */
    public final int m3660a(int i7) {
        int i8 = this.f12767d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12764a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3661b(long j6) {
        int i7;
        int hashCode = Long.hashCode(j6) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f12767d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f12764a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (this.f12765b[i7] == j6) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        if (i7 >= 0) {
            return this.f12766c[i7];
        }
        return null;
    }

    /* renamed from: c */
    public final void m3662c(int i7) {
        int i8;
        long[] jArr;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12767d = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12764a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12769f = AbstractC2210p0.m3618a(this.f12767d) - this.f12768e;
        this.f12765b = new long[i8];
        this.f12766c = new Object[i8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = m3660a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r38.f12769f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r38.f12764a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r1 = r38.f12767d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (java.lang.Long.compare((r38.f12768e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r1 = r38.f12764a;
        r2 = r38.f12767d;
        r4 = r38.f12765b;
        r5 = r38.f12766c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = p060h5.AbstractC1804l.m3027T(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = m3660a(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0182, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d4, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01af, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r18 = r11;
        r38.f12769f = p077k.AbstractC2210p0.m3618a(r38.f12767d) - r38.f12768e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027e, code lost:
    
        r1 = m3660a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0282, code lost:
    
        r16 = r1;
        r38.f12768e++;
        r1 = r38.f12769f;
        r2 = r38.f12764a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029c, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029e, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a0, code lost:
    
        r38.f12769f = r1 - r29;
        r1 = r38.f12767d;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fd, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020b, code lost:
    
        r1 = p077k.AbstractC2210p0.m3619b(r38.f12767d);
        r2 = r38.f12764a;
        r4 = r38.f12765b;
        r5 = r38.f12766c;
        r6 = r38.f12767d;
        m3662c(r1);
        r1 = r38.f12764a;
        r7 = r38.f12765b;
        r8 = r38.f12766c;
        r9 = r38.f12767d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        if (r10 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0235, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = m3660a(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0278, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3663d(long j6, C2184c0 c2184c0) {
        int i7;
        int i8;
        int i9 = -862048943;
        int hashCode = Long.hashCode(j6) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12767d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12764a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j7 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j8 = i12;
            int i19 = i15;
            int i20 = 0;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = (i14 + (Long.numberOfTrailingZeros(j10) >> 3)) & i13;
                int i21 = i9;
                if (this.f12765b[i8] == j6) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i9 = i21;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i7;
        }
        this.f12765b[i8] = j6;
        this.f12766c[i8] = c2184c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z7;
        int i7;
        Object[] objArr2;
        long j6;
        int i8;
        char c7;
        long j7;
        long[] jArr2;
        int i9;
        boolean z8;
        if (obj != this) {
            if (obj instanceof C2224z) {
                C2224z c2224z = (C2224z) obj;
                if (c2224z.f12768e == this.f12768e) {
                    long[] jArr3 = this.f12765b;
                    Object[] objArr3 = this.f12766c;
                    long[] jArr4 = this.f12764a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j8 = jArr4[i10];
                            char c8 = 7;
                            long j9 = -9187201950435737472L;
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = 0;
                                z7 = true;
                                while (i13 < i12) {
                                    if ((j8 & 255) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        objArr2 = objArr3;
                                        long j10 = jArr3[i14];
                                        c7 = c8;
                                        Object obj2 = objArr2[i14];
                                        if (obj2 == null) {
                                            if (c2224z.m3661b(j10) != null) {
                                                return false;
                                            }
                                            int hashCode = Long.hashCode(j10) * (-862048943);
                                            int i15 = hashCode ^ (hashCode << 16);
                                            j7 = j9;
                                            int i16 = i15 & 127;
                                            int i17 = c2224z.f12767d;
                                            int i18 = (i15 >>> 7) & i17;
                                            i8 = i11;
                                            int i19 = 0;
                                            while (true) {
                                                long[] jArr5 = c2224z.f12764a;
                                                int i20 = i18 >> 3;
                                                int i21 = (i18 & 7) << 3;
                                                long j11 = jArr5[i20] >>> i21;
                                                long j12 = jArr5[i20 + 1] << (64 - i21);
                                                i7 = i13;
                                                jArr2 = jArr3;
                                                long j13 = j11 | (j12 & ((-i21) >> 63));
                                                j6 = j8;
                                                long j14 = (i16 * 72340172838076673L) ^ j13;
                                                long j15 = (j14 - 72340172838076673L) & (~j14) & j7;
                                                while (true) {
                                                    if (j15 == 0) {
                                                        break;
                                                    }
                                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i17;
                                                    if (c2224z.f12765b[numberOfTrailingZeros] == j10) {
                                                        i9 = numberOfTrailingZeros;
                                                        break;
                                                    }
                                                    j15 &= j15 - 1;
                                                }
                                                i19 += 8;
                                                i18 = (i18 + i19) & i17;
                                                jArr3 = jArr2;
                                                i13 = i7;
                                                j8 = j6;
                                            }
                                            if (i9 >= 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (!z8) {
                                                return false;
                                            }
                                        } else {
                                            i7 = i13;
                                            j6 = j8;
                                            i8 = i11;
                                            j7 = j9;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(c2224z.m3661b(j10))) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i7 = i13;
                                        objArr2 = objArr3;
                                        j6 = j8;
                                        i8 = i11;
                                        c7 = c8;
                                        j7 = j9;
                                        jArr2 = jArr3;
                                    }
                                    j8 = j6 >> i8;
                                    i13 = i7 + 1;
                                    c8 = c7;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    j9 = j7;
                                    i11 = i8;
                                }
                                objArr = objArr3;
                                int i22 = i11;
                                jArr = jArr3;
                                if (i12 != i22) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z7 = true;
                            }
                            if (i10 != length) {
                                i10++;
                                jArr3 = jArr;
                                objArr3 = objArr;
                            } else {
                                return z7;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        long[] jArr = this.f12765b;
        Object[] objArr = this.f12766c;
        long[] jArr2 = this.f12764a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            long j6 = jArr2[i8];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        int i12 = (i8 << 3) + i11;
                        long j7 = jArr[i12];
                        Object obj = objArr[i12];
                        int hashCode = Long.hashCode(j7);
                        if (obj != null) {
                            i7 = obj.hashCode();
                        } else {
                            i7 = 0;
                        }
                        i9 += i7 ^ hashCode;
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
        int i7;
        int i8;
        if (this.f12768e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f12765b;
        Object[] objArr = this.f12766c;
        long[] jArr2 = this.f12764a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j6 = jArr2[i9];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j6) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i9;
                            long j7 = jArr[i13];
                            Object obj = objArr[i13];
                            sb.append(j7);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f12768e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j6 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i14;
                } else {
                    i7 = i9;
                }
                if (i7 == length) {
                    break;
                }
                i9 = i7 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
