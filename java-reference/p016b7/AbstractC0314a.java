package p016b7;

import p006a7.C0126i;
import p006a7.C0136s;
import p006a7.C0139v;
import p024c6.AbstractC0434a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b7.a */
/* loaded from: classes.dex */
public abstract class AbstractC0314a {

    /* renamed from: a */
    public static final byte[] f1110a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0434a.f1477a);
        AbstractC3367j.m5099d(bytes, "this as java.lang.String).getBytes(charset)");
        f1110a = bytes;
    }

    /* renamed from: a */
    public static final String m669a(long j6, C0126i c0126i) {
        if (j6 > 0) {
            long j7 = j6 - 1;
            if (c0126i.m252d(j7) == 13) {
                String m261n = c0126i.m261n(j7, AbstractC0434a.f1477a);
                c0126i.skip(2L);
                return m261n;
            }
        }
        String m261n2 = c0126i.m261n(j6, AbstractC0434a.f1477a);
        c0126i.skip(1L);
        return m261n2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m670b(C0126i c0126i, C0136s c0136s, boolean z7) {
        int i7;
        int i8;
        int i9;
        boolean z8;
        C0139v c0139v;
        int i10;
        AbstractC3367j.m5100e(c0136s, "options");
        C0139v c0139v2 = c0126i.f523e;
        if (c0139v2 == null) {
            if (!z7) {
                return -1;
            }
            return -2;
        }
        byte[] bArr = c0139v2.f555a;
        int i11 = c0139v2.f556b;
        int i12 = c0139v2.f557c;
        int[] iArr = c0136s.f548f;
        C0139v c0139v3 = c0139v2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = iArr[i14];
            int i17 = i14 + 2;
            int i18 = iArr[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (c0139v3 == null) {
                break;
            }
            if (i16 < 0) {
                int i19 = (i16 * (-1)) + i17;
                while (true) {
                    int i20 = i11 + 1;
                    int i21 = i17 + 1;
                    if ((bArr[i11] & 255) != iArr[i17]) {
                        break loop0;
                    }
                    if (i21 == i19) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i20 == i12) {
                        AbstractC3367j.m5097b(c0139v3);
                        C0139v c0139v4 = c0139v3.f560f;
                        AbstractC3367j.m5097b(c0139v4);
                        i9 = c0139v4.f556b;
                        byte[] bArr2 = c0139v4.f555a;
                        i10 = c0139v4.f557c;
                        if (c0139v4 == c0139v2) {
                            if (!z8) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c0139v = null;
                        } else {
                            c0139v = c0139v4;
                            bArr = bArr2;
                        }
                    } else {
                        c0139v = c0139v3;
                        i10 = i12;
                        i9 = i20;
                    }
                    if (z8) {
                        i7 = iArr[i21];
                        int i22 = i10;
                        c0139v3 = c0139v;
                        i8 = i22;
                        break;
                    }
                    i11 = i9;
                    i12 = i10;
                    c0139v3 = c0139v;
                    i17 = i21;
                }
            } else {
                int i23 = i11 + 1;
                int i24 = bArr[i11] & 255;
                int i25 = i17 + i16;
                while (i17 != i25) {
                    if (i24 == iArr[i17]) {
                        i7 = iArr[i17 + i16];
                        if (i23 == i12) {
                            c0139v3 = c0139v3.f560f;
                            AbstractC3367j.m5097b(c0139v3);
                            int i26 = c0139v3.f556b;
                            byte[] bArr3 = c0139v3.f555a;
                            i8 = c0139v3.f557c;
                            if (c0139v3 == c0139v2) {
                                i9 = i26;
                                bArr = bArr3;
                                c0139v3 = null;
                            } else {
                                i9 = i26;
                                bArr = bArr3;
                            }
                        } else {
                            i8 = i12;
                            i9 = i23;
                        }
                        if (i7 >= 0) {
                            return i7;
                        }
                        int i27 = i8;
                        i14 = -i7;
                        i11 = i9;
                        i12 = i27;
                    } else {
                        i17++;
                    }
                }
                break loop0;
            }
        }
        return i13;
    }
}
