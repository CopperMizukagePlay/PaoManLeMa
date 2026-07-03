package p077k;

import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.a0 */
/* loaded from: classes.dex */
public final class C2180a0 {

    /* renamed from: a */
    public long[] f12611a = AbstractC2210p0.f12722a;

    /* renamed from: b */
    public long[] f12612b = AbstractC2207o.f12716a;

    /* renamed from: c */
    public int f12613c;

    /* renamed from: d */
    public int f12614d;

    /* renamed from: e */
    public int f12615e;

    public C2180a0(int i7) {
        if (i7 >= 0) {
            m3547c(AbstractC2210p0.m3621d(i7));
        } else {
            AbstractC2334a.m3712c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3545a(long j6) {
        int i7;
        int hashCode = Long.hashCode(j6) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f12613c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f12611a;
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
                if (this.f12612b[i7] == j6) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int m3546b(int i7) {
        int i8 = this.f12613c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12611a;
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
    public final void m3547c(int i7) {
        int i8;
        long[] jArr;
        if (i7 > 0) {
            i8 = Math.max(7, AbstractC2210p0.m3620c(i7));
        } else {
            i8 = 0;
        }
        this.f12613c = i8;
        if (i8 == 0) {
            jArr = AbstractC2210p0.f12722a;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
        }
        this.f12611a = jArr;
        int i9 = i8 >> 3;
        long j6 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j6)) | j6;
        this.f12615e = AbstractC2210p0.m3618a(this.f12613c) - this.f12614d;
        this.f12612b = new long[i8];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2180a0)) {
            return false;
        }
        C2180a0 c2180a0 = (C2180a0) obj;
        if (c2180a0.f12614d != this.f12614d) {
            return false;
        }
        long[] jArr = this.f12612b;
        long[] jArr2 = this.f12611a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128 && !c2180a0.m3545a(jArr[(i7 << 3) + i9])) {
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

    public final int hashCode() {
        long[] jArr = this.f12612b;
        long[] jArr2 = this.f12611a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j6 = jArr2[i7];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j6) < 128) {
                        i8 = Long.hashCode(jArr[(i7 << 3) + i10]) + i8;
                    }
                    j6 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 != length) {
                i7++;
            } else {
                return i8;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f12612b;
        long[] jArr2 = this.f12611a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j6) < 128) {
                            long j7 = jArr[(i7 << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j7);
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
}
