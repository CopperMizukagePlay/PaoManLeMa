package p077k;

import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.d0 */
/* loaded from: classes.dex */
public final class C2186d0 {

    /* renamed from: a */
    public long[] f12634a = AbstractC2210p0.f12722a;

    /* renamed from: b */
    public Object[] f12635b = AbstractC2334a.f13324c;

    /* renamed from: c */
    public long[] f12636c = AbstractC2207o.f12716a;

    /* renamed from: d */
    public int f12637d;

    /* renamed from: e */
    public int f12638e;

    /* renamed from: f */
    public int f12639f;

    public C2186d0(int i7) {
        if (i7 >= 0) {
            m3572d(AbstractC2210p0.m3621d(i7));
        } else {
            AbstractC2334a.m3712c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a */
    public final int m3569a(int i7) {
        int i8 = this.f12637d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12634a;
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

    /* renamed from: b */
    public final int m3570b(Object obj) {
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
        int i12 = this.f12637d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12634a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = (i11 * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i14) & i12;
                if (AbstractC3367j.m5096a(this.f12635b[numberOfTrailingZeros], obj)) {
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

    /* renamed from: c */
    public final long m3571c(Object obj) {
        int m3570b = m3570b(obj);
        if (m3570b >= 0) {
            return this.f12636c[m3570b];
        }
        AbstractC2334a.m3714e("There is no key " + obj + " in the map");
        throw null;
    }

    /* renamed from: d */
    public final void m3572d(int i7) {
        int i8;
        long[] jArr;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12637d = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12634a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12639f = AbstractC2210p0.m3618a(this.f12637d) - this.f12638e;
        this.f12635b = new Object[i8];
        this.f12636c = new long[i8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r2 = m3569a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r39.f12639f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (((r39.f12634a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r2 = r39.f12637d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r2 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (java.lang.Long.compare((r39.f12638e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r2 = r39.f12634a;
        r3 = r39.f12637d;
        r5 = r39.f12635b;
        r6 = r39.f12636c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r7 >= r13) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
    
        r31 = r9;
        r29 = r11;
        r12 = 7;
        r7 = p060h5.AbstractC1804l.m3027T(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
    
        if (r7 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0118, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012c, code lost:
    
        if (r9 == 254) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0139, code lost:
    
        r9 = r9 * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = m3569a(r10);
        r10 = r10 & r3;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0179, code lost:
    
        r18 = r14;
        r34 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        if (((r14 >> r12) & r29) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018d, code lost:
    
        r35 = r5;
        r36 = r6;
        r2[r10] = ((~(r29 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r29 << r11))) | (128 << r11);
        r35[r13] = r35[r7];
        r35[r7] = null;
        r36[r13] = r36[r7];
        r36[r7] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d9, code lost:
    
        r2[r2.length - 1] = (r2[r34] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r33;
        r15 = r34;
        r5 = r35;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b8, code lost:
    
        r35 = r5;
        r36 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r29 << r12)) & r14);
        r5 = r35[r13];
        r35[r13] = r35[r7];
        r35[r7] = r5;
        r5 = r36[r13];
        r36[r13] = r36[r7];
        r36[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        r34 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r29 << r11)));
        r2[r2.length - 1] = (r2[r34] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r33;
        r15 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0127, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f2, code lost:
    
        r18 = r14;
        r34 = r15;
        r39.f12639f = p077k.AbstractC2210p0.m3618a(r39.f12637d) - r39.f12638e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0287, code lost:
    
        r2 = m3569a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028b, code lost:
    
        r39.f12638e++;
        r1 = r39.f12639f;
        r3 = r39.f12634a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a3, code lost:
    
        if (((r5 >> r7) & r29) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a6, code lost:
    
        r18 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a8, code lost:
    
        r39.f12639f = r1 - r18;
        r1 = r39.f12637d;
        r5 = (r5 & (~(r29 << r7))) | (r31 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0205, code lost:
    
        r31 = r9;
        r29 = 255;
        r18 = 1;
        r34 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        r2 = p077k.AbstractC2210p0.m3619b(r39.f12637d);
        r3 = r39.f12634a;
        r5 = r39.f12635b;
        r6 = r39.f12636c;
        r7 = r39.f12637d;
        m3572d(r2);
        r2 = r39.f12634a;
        r8 = r39.f12635b;
        r9 = r39.f12636c;
        r10 = r39.f12637d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022e, code lost:
    
        if (r11 >= r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023d, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023f, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0241, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0243, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024a, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = m3569a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0281, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0248, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0280, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0210, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009e, code lost:
    
        r31 = r9;
        r29 = 255;
        r18 = 1;
        r34 = 0;
        r22 = 128;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3573e(long j6, Object obj) {
        int i7;
        int i8;
        Object obj2 = obj;
        int i9 = -862048943;
        int hashCode = obj2.hashCode() * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12637d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12634a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            int i19 = i15;
            int i20 = 0;
            long j7 = (((-i17) >> 63) & (jArr[i16 + 1] << (64 - i17))) | (jArr[i16] >>> i17);
            long j8 = i12;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                int i21 = i9;
                if (AbstractC3367j.m5096a(this.f12635b[i8], obj2)) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i9 = i21;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            obj2 = obj;
            i9 = i7;
        }
        if (i8 < 0) {
            i8 = ~i8;
        }
        this.f12635b[i8] = obj;
        this.f12636c[i8] = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2186d0)) {
            return false;
        }
        C2186d0 c2186d0 = (C2186d0) obj;
        if (c2186d0.f12638e != this.f12638e) {
            return false;
        }
        Object[] objArr = this.f12635b;
        long[] jArr = this.f12636c;
        long[] jArr2 = this.f12634a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            loop0: while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj2 = objArr[i10];
                            long j7 = jArr[i10];
                            int m3570b = c2186d0.m3570b(obj2);
                            if (m3570b < 0 || j7 != c2186d0.f12636c[m3570b]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        Object[] objArr = this.f12635b;
        long[] jArr = this.f12636c;
        long[] jArr2 = this.f12634a;
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
                        Object obj = objArr[i12];
                        long j7 = jArr[i12];
                        if (obj != null) {
                            i7 = obj.hashCode();
                        } else {
                            i7 = 0;
                        }
                        i9 += i7 ^ Long.hashCode(j7);
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
        if (this.f12638e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f12635b;
        long[] jArr = this.f12636c;
        long[] jArr2 = this.f12634a;
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
                            Object obj = objArr[i13];
                            i8 = i9;
                            long j7 = jArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j7);
                            i10++;
                            if (i10 < this.f12638e) {
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
