package p126q4;

import java.util.Arrays;
import java.util.Map;
import p022c4.C0393c;
import p022c4.C0400j;
import p022c4.C0404n;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.d */
/* loaded from: classes.dex */
public final class C2989d extends AbstractC2993h {

    /* renamed from: c */
    public static final char[] f15432c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    public static final int[] f15433d;

    /* renamed from: e */
    public static final int f15434e;

    /* renamed from: a */
    public final StringBuilder f15435a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f15436b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f15433d = iArr;
        f15434e = iArr[47];
    }

    /* renamed from: g */
    public static void m4645g(CharSequence charSequence, int i7, int i8) {
        int i9 = 0;
        int i10 = 1;
        for (int i11 = i7 - 1; i11 >= 0; i11--) {
            i9 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i11)) * i10;
            i10++;
            if (i10 > i8) {
                i10 = 1;
            }
        }
        if (charSequence.charAt(i7) != f15432c[i9 % 47]) {
            throw C0393c.m867a();
        }
    }

    /* renamed from: h */
    public static int m4646h(int[] iArr) {
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int round = Math.round((iArr[i10] * 9.0f) / i7);
            if (round >= 1 && round <= 4) {
                if ((i10 & 1) == 0) {
                    for (int i11 = 0; i11 < round; i11++) {
                        i9 = (i9 << 1) | 1;
                    }
                } else {
                    i9 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0132, code lost:
    
        if (r6 < 'X') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0134, code lost:
    
        if (r6 > 'Z') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0136, code lost:
    
        r5 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013d, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013e, code lost:
    
        if (r6 < 'A') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0140, code lost:
    
        if (r6 > 'Z') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0142, code lost:
    
        r6 = r6 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014d, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0153, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0159, code lost:
    
        r13 = r13;
        r0 = new p022c4.C0404n(r2.toString(), null, new p022c4.C0406p[]{new p022c4.C0406p((r15[1] + r15[0]) / 2.0f, r13), new p022c4.C0406p((r9 / 2.0f) + r1, r13)}, p022c4.EnumC0391a.f1318h);
        r0.m880b(p022c4.EnumC0405o.f1388q, "]G0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0188, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018d, code lost:
    
        throw p022c4.C0400j.m878a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0192, code lost:
    
        throw p022c4.C0400j.m878a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r5 = p126q4.C2989d.f15432c[r6];
        r4.append(r5);
        r6 = r2.length;
        r7 = 0;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r7 >= r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        r6 = r14.m3306e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r5 != '*') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r4.deleteCharAt(r4.length() - 1);
        r5 = r2.length;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r7 >= r5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r6 == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r14.m3305d(r6) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r4.length() < 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        r14 = r4.length();
        m4645g(r4, r14 - 2, 20);
        m4645g(r4, r14 - 1, 15);
        r4.setLength(r4.length() - 2);
        r14 = r4.length();
        r2 = new java.lang.StringBuilder(r14);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r3 >= r14) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        r5 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r5 < 'a') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (r5 > 'd') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (r3 >= (r14 - 1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r3 = r3 + 1;
        r6 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        switch(r5) {
            case 97: goto L89;
            case 98: goto L56;
            case 99: goto L49;
            case 100: goto L43;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (r6 < 'A') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (r6 > 'Z') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        r6 = r6 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        r5 = (char) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        if (r6 < 'A') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        if (r6 > 'O') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
    
        r6 = r6 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        if (r6 != 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
    
        r5 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
    
        if (r6 < 'A') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:
    
        if (r6 > 'E') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fb, code lost:
    
        r6 = r6 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0100, code lost:
    
        if (r6 < 'F') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0104, code lost:
    
        if (r6 > 'J') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        r6 = r6 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010b, code lost:
    
        if (r6 < 'K') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010d, code lost:
    
        if (r6 > 'O') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010f, code lost:
    
        r6 = r6 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0114, code lost:
    
        if (r6 < 'P') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0118, code lost:
    
        if (r6 > 'T') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011a, code lost:
    
        r6 = r6 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011f, code lost:
    
        if (r6 != 'U') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0124, code lost:
    
        if (r6 != 'V') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0126, code lost:
    
        r5 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012b, code lost:
    
        if (r6 != 'W') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012d, code lost:
    
        r5 = '`';
     */
    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        int m3306e;
        int i8 = c2068a.f12257f;
        int m3306e2 = c2068a.m3306e(0);
        int[] iArr = this.f15436b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z7 = false;
        int i9 = 0;
        int i10 = m3306e2;
        while (m3306e2 < i8) {
            if (c2068a.m3305d(m3306e2) != z7) {
                iArr[i9] = iArr[i9] + 1;
            } else {
                if (i9 == length - 1) {
                    if (m4646h(iArr) == f15434e) {
                        int m3306e3 = c2068a.m3306e(new int[]{i10, m3306e2}[1]);
                        int i11 = c2068a.f12257f;
                        Arrays.fill(iArr, 0);
                        StringBuilder sb = this.f15435a;
                        sb.setLength(0);
                        while (true) {
                            AbstractC2993h.m4657e(m3306e3, c2068a, iArr);
                            int m4646h = m4646h(iArr);
                            if (m4646h >= 0) {
                                int i12 = 0;
                                while (true) {
                                    int[] iArr2 = f15433d;
                                    if (i12 < iArr2.length) {
                                        if (iArr2[i12] == m4646h) {
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        throw C0400j.m878a();
                                    }
                                }
                            } else {
                                throw C0400j.m878a();
                            }
                            m3306e3 = m3306e;
                        }
                    } else {
                        i10 += iArr[0] + iArr[1];
                        int i13 = i9 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i13);
                        iArr[i13] = 0;
                        iArr[i9] = 0;
                        i9--;
                    }
                } else {
                    i9++;
                }
                iArr[i9] = 1;
                z7 = !z7;
            }
            m3306e2++;
        }
        throw C0400j.m878a();
    }
}
