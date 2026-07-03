package p097m4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0076s2;
import p014b5.C0293g;
import p022c4.C0393c;
import p022c4.C0396f;
import p023c5.C0430v;
import p037e3.C0691e;
import p067i4.C2069b;
import p067i4.C2071d;
import p067i4.EnumC2070c;
import p081k4.C2308a;
import p081k4.C2310c;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p144t.AbstractC3122c;
import p194z4.AbstractC3870a;
import p194z4.C3872c;
import p194z4.C3875f;
import p194z4.EnumC3871b;
import p194z4.EnumC3873d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C2579c {

    /* renamed from: a */
    public final C0019e1 f13988a;

    public C2579c(int i7) {
        switch (i7) {
            case 1:
                this.f13988a = new C0019e1(C2308a.f13259o);
                return;
            case 2:
                this.f13988a = new C0019e1(C2308a.f13256l);
                return;
            default:
                this.f13988a = new C0019e1(C2308a.f13257m);
                return;
        }
    }

    /* renamed from: a */
    public int m4109a(byte[] bArr, int i7, int i8, int i9, int i10) {
        int i11;
        int i12 = i8 + i9;
        if (i10 == 0) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        int[] iArr = new int[i12 / i11];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i10 == 0 || i13 % 2 == i10 - 1) {
                iArr[i13 / i11] = bArr[i13 + i7] & 255;
            }
        }
        try {
            int m39j = this.f13988a.m39j(iArr, i9 / i11);
            for (int i14 = 0; i14 < i8; i14++) {
                if (i10 == 0 || i14 % 2 == i10 - 1) {
                    bArr[i14 + i7] = (byte) iArr[i14 / i11];
                }
            }
            return m39j;
        } catch (C2310c unused) {
            throw C0393c.m867a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x039c A[LOOP:21: B:142:0x0220->B:172:0x039c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036b A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2071d m4110b(C0293g c0293g, Map map) {
        int m919b;
        EnumC3873d enumC3873d;
        EnumC3871b enumC3871b;
        int i7;
        int i8;
        int i9;
        EnumC2070c enumC2070c;
        EnumC3873d enumC3873d2;
        ArrayList arrayList;
        int m919b2;
        int i10;
        int i11;
        C3875f m653h = c0293g.m653h();
        EnumC3871b enumC3871b2 = c0293g.m652g().f18140a;
        C3872c m652g = c0293g.m652g();
        C3875f m653h2 = c0293g.m653h();
        int i12 = AbstractC2647h.m4258d(8)[m652g.f18141b];
        C2069b c2069b = (C2069b) c0293g.f1068b;
        int i13 = c2069b.f12259f;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (AbstractC2487d.m4037a(i12, i15, i16)) {
                    c2069b.m3312a(i16, i15);
                }
            }
        }
        int i17 = m653h2.f18157a * 4;
        int i18 = i17 + 17;
        int i19 = m653h2.f18160d;
        C2069b c2069b2 = new C2069b(i18, i18);
        c2069b2.m3320i(0, 0, 9, 9);
        int i20 = i17 + 9;
        c2069b2.m3320i(i20, 0, 8, 9);
        c2069b2.m3320i(0, i20, 9, 8);
        int[] iArr = m653h2.f18158b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    c2069b2.m3320i(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        c2069b2.m3320i(6, 9, 1, i17);
        c2069b2.m3320i(9, 6, i17, 1);
        if (m653h2.f18157a > 6) {
            int i27 = i17 + 6;
            c2069b2.m3320i(i27, 0, 3, 6);
            c2069b2.m3320i(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z7 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                if (z7) {
                    i11 = i28 - i33;
                } else {
                    i11 = i33;
                }
                int i34 = i26;
                int i35 = 0;
                for (int i36 = i24; i35 < i36; i36 = 2) {
                    int i37 = i29 - i35;
                    if (!c2069b2.m3313b(i37, i11)) {
                        i31++;
                        i32 <<= 1;
                        if (c2069b.m3313b(i37, i11)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i35++;
                }
                i33++;
                i26 = i34;
                i24 = 2;
            }
            z7 = !z7;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i38 = i26;
        if (i30 == i19) {
            if (i19 == m653h.f18160d) {
                C0691e c0691e = m653h.f18159c[enumC3871b2.ordinal()];
                C0076s2[] c0076s2Arr = (C0076s2[]) c0691e.f2245b;
                int i39 = c0691e.f2244a;
                int i40 = 0;
                for (C0076s2 c0076s2 : c0076s2Arr) {
                    i40 += c0076s2.f374b;
                }
                C2577a[] c2577aArr = new C2577a[i40];
                int i41 = 0;
                for (C0076s2 c0076s22 : c0076s2Arr) {
                    int i42 = 0;
                    while (i42 < c0076s22.f374b) {
                        int i43 = c0076s22.f375c;
                        c2577aArr[i41] = new C2577a(i43, new byte[i39 + i43]);
                        i42++;
                        i41++;
                    }
                }
                int length2 = c2577aArr[0].f13982b.length;
                int i44 = i40 - 1;
                while (i44 >= 0 && c2577aArr[i44].f13982b.length != length2) {
                    i44--;
                }
                int i45 = i44 + 1;
                int i46 = length2 - i39;
                int i47 = 0;
                int i48 = 0;
                while (i47 < i46) {
                    int i49 = i48;
                    int i50 = 0;
                    while (i50 < i41) {
                        c2577aArr[i50].f13982b[i47] = bArr[i49];
                        i50++;
                        i49++;
                    }
                    i47++;
                    i48 = i49;
                }
                int i51 = i45;
                while (i51 < i41) {
                    c2577aArr[i51].f13982b[i46] = bArr[i48];
                    i51++;
                    i48++;
                }
                boolean z8 = false;
                int length3 = c2577aArr[0].f13982b.length;
                while (i46 < length3) {
                    int i52 = i48;
                    int i53 = 0;
                    while (i53 < i41) {
                        if (i53 < i45) {
                            i10 = i46;
                        } else {
                            i10 = i46 + 1;
                        }
                        c2577aArr[i53].f13982b[i10] = bArr[i52];
                        i53++;
                        i52++;
                    }
                    i46++;
                    i48 = i52;
                }
                int i54 = 0;
                for (int i55 = 0; i55 < i40; i55++) {
                    i54 += c2577aArr[i55].f13981a;
                }
                byte[] bArr2 = new byte[i54];
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                while (i57 < i40) {
                    C2577a c2577a = c2577aArr[i57];
                    byte[] bArr3 = c2577a.f13982b;
                    int i59 = c2577a.f13981a;
                    int length4 = bArr3.length;
                    int[] iArr2 = new int[length4];
                    for (int i60 = 0; i60 < length4; i60++) {
                        iArr2[i60] = bArr3[i60] & 255;
                    }
                    try {
                        int m39j = this.f13988a.m39j(iArr2, bArr3.length - i59);
                        for (int i61 = 0; i61 < i59; i61++) {
                            bArr3[i61] = (byte) iArr2[i61];
                        }
                        i56 += m39j;
                        int i62 = i58;
                        int i63 = 0;
                        while (i63 < i59) {
                            bArr2[i62] = bArr3[i63];
                            i63++;
                            i62++;
                        }
                        i57++;
                        i58 = i62;
                    } catch (C2310c unused) {
                        throw C0393c.m867a();
                    }
                }
                char[] cArr = AbstractC3870a.f18133a;
                C0430v c0430v = new C0430v(bArr2);
                StringBuilder sb = new StringBuilder(50);
                ArrayList arrayList2 = new ArrayList(i38);
                int i64 = -1;
                int i65 = -1;
                boolean z9 = false;
                boolean z10 = false;
                EnumC2070c enumC2070c2 = null;
                while (true) {
                    try {
                        int m918a = c0430v.m918a();
                        EnumC3873d enumC3873d3 = EnumC3873d.TERMINATOR;
                        if (m918a < 4 || (m919b = c0430v.m919b(4)) == 0) {
                            enumC3873d = enumC3873d3;
                        } else if (m919b != 1) {
                            if (m919b != 2) {
                                if (m919b != 3) {
                                    if (m919b != 4) {
                                        if (m919b != 5) {
                                            if (m919b != 7) {
                                                if (m919b != 8) {
                                                    if (m919b != 9) {
                                                        if (m919b == 13) {
                                                            enumC3873d = EnumC3873d.HANZI;
                                                        } else {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        enumC3873d = EnumC3873d.FNC1_SECOND_POSITION;
                                                    }
                                                } else {
                                                    enumC3873d = EnumC3873d.KANJI;
                                                }
                                            } else {
                                                enumC3873d = EnumC3873d.ECI;
                                            }
                                        } else {
                                            enumC3873d = EnumC3873d.FNC1_FIRST_POSITION;
                                        }
                                    } else {
                                        enumC3873d = EnumC3873d.BYTE;
                                    }
                                } else {
                                    enumC3873d = EnumC3873d.STRUCTURED_APPEND;
                                }
                            } else {
                                enumC3873d = EnumC3873d.ALPHANUMERIC;
                            }
                        } else {
                            enumC3873d = EnumC3873d.NUMERIC;
                        }
                        int ordinal = enumC3873d.ordinal();
                        if (ordinal != 0) {
                            enumC3871b = enumC3871b2;
                            if (ordinal != 3) {
                                if (ordinal != 5) {
                                    if (ordinal != 7) {
                                        if (ordinal != 8) {
                                            if (ordinal != 9) {
                                                int m919b3 = c0430v.m919b(enumC3873d.m5895a(m653h));
                                                int ordinal2 = enumC3873d.ordinal();
                                                i7 = i56;
                                                if (ordinal2 != 1) {
                                                    if (ordinal2 != 2) {
                                                        if (ordinal2 != 4) {
                                                            if (ordinal2 == 6) {
                                                                AbstractC3870a.m5891d(c0430v, sb, m919b3);
                                                            } else {
                                                                throw C0396f.m868a();
                                                            }
                                                        } else {
                                                            enumC3873d2 = enumC3873d;
                                                            AbstractC3870a.m5889b(c0430v, sb, m919b3, enumC2070c2, arrayList2, map);
                                                        }
                                                    } else {
                                                        enumC3873d2 = enumC3873d;
                                                        AbstractC3870a.m5888a(c0430v, sb, m919b3, z10);
                                                    }
                                                } else {
                                                    enumC3873d2 = enumC3873d;
                                                    AbstractC3870a.m5892e(c0430v, sb, m919b3);
                                                }
                                                i8 = 1;
                                            } else {
                                                i7 = i56;
                                                enumC3873d2 = enumC3873d;
                                                int m919b4 = c0430v.m919b(4);
                                                int m919b5 = c0430v.m919b(enumC3873d2.m5895a(m653h));
                                                i8 = 1;
                                                if (m919b4 == 1) {
                                                    AbstractC3870a.m5890c(c0430v, sb, m919b5);
                                                }
                                            }
                                        } else {
                                            i7 = i56;
                                            enumC3873d2 = enumC3873d;
                                            i8 = 1;
                                            EnumC2070c enumC2070c3 = enumC2070c2;
                                            i9 = i64;
                                            enumC2070c = enumC2070c3;
                                            z9 = true;
                                            z10 = true;
                                        }
                                    } else {
                                        i7 = i56;
                                        enumC3873d2 = enumC3873d;
                                        i8 = 1;
                                        EnumC2070c enumC2070c4 = enumC2070c2;
                                        i9 = i64;
                                        enumC2070c = enumC2070c4;
                                        z10 = true;
                                        z8 = true;
                                    }
                                } else {
                                    i7 = i56;
                                    enumC3873d2 = enumC3873d;
                                    i8 = 1;
                                    int m919b6 = c0430v.m919b(8);
                                    if ((m919b6 & 128) == 0) {
                                        m919b2 = m919b6 & 127;
                                    } else if ((m919b6 & 192) == 128) {
                                        m919b2 = ((m919b6 & 63) << 8) | c0430v.m919b(8);
                                    } else if ((m919b6 & 224) == 192) {
                                        m919b2 = ((m919b6 & 31) << 16) | c0430v.m919b(16);
                                    } else {
                                        throw C0396f.m868a();
                                    }
                                    EnumC2070c m3321a = EnumC2070c.m3321a(m919b2);
                                    if (m3321a != null) {
                                        i9 = i64;
                                        enumC2070c = m3321a;
                                    } else {
                                        throw C0396f.m868a();
                                    }
                                }
                                if (enumC3873d2 == enumC3873d3) {
                                    if (enumC2070c != null) {
                                        if (z8) {
                                            i8 = 4;
                                        } else if (z9) {
                                            i8 = 6;
                                        } else {
                                            i8 = 2;
                                        }
                                    } else if (z8) {
                                        i8 = 3;
                                    } else if (z9) {
                                        i8 = 5;
                                    }
                                    String sb2 = sb.toString();
                                    if (arrayList2.isEmpty()) {
                                        arrayList = null;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                    C2071d c2071d = new C2071d(bArr2, sb2, arrayList, enumC3871b.toString(), i9, i65, i8);
                                    c2071d.f12274h = Integer.valueOf(i7);
                                    return c2071d;
                                }
                                int i66 = i9;
                                enumC2070c2 = enumC2070c;
                                i64 = i66;
                                i56 = i7;
                                enumC3871b2 = enumC3871b;
                            } else {
                                i7 = i56;
                                enumC3873d2 = enumC3873d;
                                i8 = 1;
                                if (c0430v.m918a() >= 16) {
                                    i64 = c0430v.m919b(8);
                                    i65 = c0430v.m919b(8);
                                } else {
                                    throw C0396f.m868a();
                                }
                            }
                            EnumC2070c enumC2070c5 = enumC2070c2;
                            i9 = i64;
                            enumC2070c = enumC2070c5;
                            if (enumC3873d2 == enumC3873d3) {
                            }
                        } else {
                            enumC3871b = enumC3871b2;
                            i7 = i56;
                        }
                        enumC3873d2 = enumC3873d;
                        i8 = 1;
                        EnumC2070c enumC2070c52 = enumC2070c2;
                        i9 = i64;
                        enumC2070c = enumC2070c52;
                        if (enumC3873d2 == enumC3873d3) {
                        }
                    } catch (IllegalArgumentException unused2) {
                        throw C0396f.m868a();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw C0396f.m868a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0389, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0785, code lost:
    
        if (r8.length() <= 0) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0787, code lost:
    
        r7.m104r();
        ((java.lang.StringBuilder) r7.f153g).append((java.lang.CharSequence) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0791, code lost:
    
        if (r15 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0797, code lost:
    
        if (r13.contains(0) != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x079d, code lost:
    
        if (r13.contains(4) == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x07a4, code lost:
    
        if (r13.contains(1) != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x07aa, code lost:
    
        if (r13.contains(5) == false) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x07ad, code lost:
    
        r27 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x07d8, code lost:
    
        r22 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x07e2, code lost:
    
        if (r12.isEmpty() == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x07e4, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x07e5, code lost:
    
        r20 = new p067i4.C2071d(r25, r22, r12, null, -1, -1, r27);
        r20.f12274h = java.lang.Integer.valueOf(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x07fa, code lost:
    
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x07b0, code lost:
    
        r27 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x07b3, code lost:
    
        r27 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x07ba, code lost:
    
        if (r13.contains(0) != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x07c0, code lost:
    
        if (r13.contains(4) == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x07c7, code lost:
    
        if (r13.contains(1) != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x07cd, code lost:
    
        if (r13.contains(5) == false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x07d0, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x07d3, code lost:
    
        r27 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x07d6, code lost:
    
        r27 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03cf, code lost:
    
        throw p022c4.C0396f.m868a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x03bb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:207:0x0465. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043c A[LOOP:15: B:113:0x036e->B:129:0x043c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0389 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2071d m4111c(C2069b c2069b) {
        byte[] bArr;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int m919b;
        int[] iArr;
        char c7;
        char c8;
        int m919b2;
        int i11;
        int m919b3;
        int i12;
        int i13;
        int i14;
        C0031h1 c0031h1 = new C0031h1(c2069b);
        C2580d c2580d = (C2580d) c0031h1.f154h;
        C2069b c2069b2 = (C2069b) c0031h1.f153g;
        int i15 = c2580d.f13996g;
        byte[] bArr3 = new byte[i15];
        C2069b c2069b3 = (C2069b) c0031h1.f152f;
        int i16 = c2069b3.f12259f;
        int i17 = c2069b3.f12258e;
        int i18 = 0;
        int i19 = 0;
        boolean z8 = false;
        int i20 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i21 = 4;
        while (true) {
            if (i21 == i16 && i19 == 0 && !z8) {
                int i22 = i20 + 1;
                int i23 = i16 - 1;
                int i24 = (c0031h1.m80D(i23, i18, i16, i17) ? 1 : 0) << 1;
                if (c0031h1.m80D(i23, 1, i16, i17)) {
                    i24 |= 1;
                }
                int i25 = i24 << 1;
                if (c0031h1.m80D(i23, 2, i16, i17)) {
                    i25 |= 1;
                }
                int i26 = i25 << 1;
                bArr = bArr3;
                if (c0031h1.m80D(0, i17 - 2, i16, i17)) {
                    i26 |= 1;
                }
                int i27 = i26 << 1;
                int i28 = i17 - 1;
                if (c0031h1.m80D(0, i28, i16, i17)) {
                    i27 |= 1;
                }
                int i29 = i27 << 1;
                if (c0031h1.m80D(1, i28, i16, i17)) {
                    i29 |= 1;
                }
                int i30 = i29 << 1;
                if (c0031h1.m80D(2, i28, i16, i17)) {
                    i30 |= 1;
                }
                int i31 = i30 << 1;
                if (c0031h1.m80D(3, i28, i16, i17)) {
                    i31 |= 1;
                }
                bArr[i20] = (byte) i31;
                i21 -= 2;
                i19 += 2;
                i20 = i22;
                z8 = true;
            } else {
                bArr = bArr3;
                int i32 = i16 - 2;
                if (i21 == i32 && i19 == 0 && (i17 & 3) != 0 && !z9) {
                    int i33 = i20 + 1;
                    int i34 = (c0031h1.m80D(i16 + (-3), 0, i16, i17) ? 1 : 0) << 1;
                    if (c0031h1.m80D(i32, 0, i16, i17)) {
                        i34 |= 1;
                    }
                    int i35 = i34 << 1;
                    if (c0031h1.m80D(i16 - 1, 0, i16, i17)) {
                        i35 |= 1;
                    }
                    int i36 = i35 << 1;
                    if (c0031h1.m80D(0, i17 - 4, i16, i17)) {
                        i36 |= 1;
                    }
                    int i37 = i36 << 1;
                    if (c0031h1.m80D(0, i17 - 3, i16, i17)) {
                        i37 |= 1;
                    }
                    int i38 = i37 << 1;
                    if (c0031h1.m80D(0, i17 - 2, i16, i17)) {
                        i38 |= 1;
                    }
                    int i39 = i38 << 1;
                    int i40 = i17 - 1;
                    if (c0031h1.m80D(0, i40, i16, i17)) {
                        i39 |= 1;
                    }
                    int i41 = i39 << 1;
                    if (c0031h1.m80D(1, i40, i16, i17)) {
                        i41 |= 1;
                    }
                    bArr[i20] = (byte) i41;
                    i21 -= 2;
                    i19 += 2;
                    i20 = i33;
                    z9 = true;
                } else if (i21 == i16 + 4 && i19 == 2 && (i17 & 7) == 0 && !z10) {
                    int i42 = i20 + 1;
                    int i43 = i16 - 1;
                    int i44 = (c0031h1.m80D(i43, 0, i16, i17) ? 1 : 0) << 1;
                    int i45 = i17 - 1;
                    if (c0031h1.m80D(i43, i45, i16, i17)) {
                        i44 |= 1;
                    }
                    int i46 = i44 << 1;
                    int i47 = i17 - 3;
                    if (c0031h1.m80D(0, i47, i16, i17)) {
                        i46 |= 1;
                    }
                    int i48 = i46 << 1;
                    int i49 = i17 - 2;
                    if (c0031h1.m80D(0, i49, i16, i17)) {
                        i48 |= 1;
                    }
                    int i50 = i48 << 1;
                    if (c0031h1.m80D(0, i45, i16, i17)) {
                        i50 |= 1;
                    }
                    int i51 = i50 << 1;
                    if (c0031h1.m80D(1, i47, i16, i17)) {
                        i7 = i51 | 1;
                    } else {
                        i7 = i51;
                    }
                    int i52 = i7 << 1;
                    if (c0031h1.m80D(1, i49, i16, i17)) {
                        i52 |= 1;
                    }
                    int i53 = i52 << 1;
                    if (c0031h1.m80D(1, i45, i16, i17)) {
                        i53 |= 1;
                    }
                    bArr[i20] = (byte) i53;
                    i21 -= 2;
                    i19 += 2;
                    i20 = i42;
                    z10 = true;
                } else if (i21 == i32 && i19 == 0 && (i17 & 7) == 4 && !z11) {
                    int i54 = i20 + 1;
                    int i55 = (c0031h1.m80D(i16 + (-3), 0, i16, i17) ? 1 : 0) << 1;
                    if (c0031h1.m80D(i32, 0, i16, i17)) {
                        i55 |= 1;
                    }
                    int i56 = i55 << 1;
                    if (c0031h1.m80D(i16 - 1, 0, i16, i17)) {
                        i56 |= 1;
                    }
                    int i57 = i56 << 1;
                    if (c0031h1.m80D(0, i17 - 2, i16, i17)) {
                        i57 |= 1;
                    }
                    int i58 = i57 << 1;
                    int i59 = i17 - 1;
                    if (c0031h1.m80D(0, i59, i16, i17)) {
                        i58 |= 1;
                    }
                    int i60 = i58 << 1;
                    if (c0031h1.m80D(1, i59, i16, i17)) {
                        i60 |= 1;
                    }
                    int i61 = i60 << 1;
                    if (c0031h1.m80D(2, i59, i16, i17)) {
                        i61 |= 1;
                    }
                    int i62 = i61 << 1;
                    if (c0031h1.m80D(3, i59, i16, i17)) {
                        i62 |= 1;
                    }
                    bArr[i20] = (byte) i62;
                    i21 -= 2;
                    i19 += 2;
                    i20 = i54;
                    z11 = true;
                } else {
                    while (true) {
                        if (i21 < i16 && i19 >= 0 && !c2069b2.m3313b(i19, i21)) {
                            bArr[i20] = (byte) c0031h1.m81E(i21, i19, i16, i17);
                            i20++;
                        }
                        int i63 = i21 - 2;
                        int i64 = i19 + 2;
                        if (i63 < 0 || i64 >= i17) {
                            break;
                        }
                        i21 = i63;
                        i19 = i64;
                    }
                    int i65 = i21 - 1;
                    int i66 = i19 + 5;
                    while (true) {
                        if (i65 >= 0 && i66 < i17 && !c2069b2.m3313b(i66, i65)) {
                            bArr[i20] = (byte) c0031h1.m81E(i65, i66, i16, i17);
                            i20++;
                        }
                        int i67 = i65 + 2;
                        int i68 = i66 - 2;
                        if (i67 >= i16 || i68 < 0) {
                            break;
                        }
                        i65 = i67;
                        i66 = i68;
                    }
                    i21 = i65 + 5;
                    i19 = i66 - 1;
                }
            }
            if (i21 >= i16 && i19 >= i17) {
                break;
            }
            i18 = 0;
            bArr3 = bArr;
        }
        if (i20 == c2580d.f13996g) {
            C0691e c0691e = c2580d.f13995f;
            C0076s2[] c0076s2Arr = (C0076s2[]) c0691e.f2245b;
            int i69 = c0691e.f2244a;
            int i70 = 0;
            for (C0076s2 c0076s2 : c0076s2Arr) {
                i70 += c0076s2.f374b;
            }
            C2577a[] c2577aArr = new C2577a[i70];
            int i71 = 0;
            for (C0076s2 c0076s22 : c0076s2Arr) {
                int i72 = 0;
                while (i72 < c0076s22.f374b) {
                    int i73 = c0076s22.f375c;
                    c2577aArr[i71] = new C2577a(i73, new byte[i69 + i73]);
                    i72++;
                    i71++;
                }
            }
            int length = c2577aArr[0].f13982b.length - i69;
            int i74 = length - 1;
            int i75 = 0;
            for (int i76 = 0; i76 < i74; i76++) {
                int i77 = 0;
                while (i77 < i71) {
                    c2577aArr[i77].f13982b[i76] = bArr[i75];
                    i77++;
                    i75++;
                }
            }
            if (c2580d.f13990a == 24) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i78 = 8;
            if (z7) {
                i8 = 8;
            } else {
                i8 = i71;
            }
            int i79 = 0;
            while (i79 < i8) {
                c2577aArr[i79].f13982b[i74] = bArr[i75];
                i79++;
                i75++;
            }
            int length2 = c2577aArr[0].f13982b.length;
            while (length < length2) {
                int i80 = 0;
                while (i80 < i71) {
                    if (z7) {
                        i14 = (i80 + 8) % i71;
                    } else {
                        i14 = i80;
                    }
                    c2577aArr[i14].f13982b[(z7 && i14 > 7) ? length - 1 : length] = bArr[i75];
                    i80++;
                    i75++;
                }
                length++;
            }
            if (i75 == i15) {
                int i81 = 0;
                for (int i82 = 0; i82 < i70; i82++) {
                    i81 += c2577aArr[i82].f13981a;
                }
                byte[] bArr4 = new byte[i81];
                int i83 = 0;
                for (int i84 = 0; i84 < i70; i84++) {
                    C2577a c2577a = c2577aArr[i84];
                    byte[] bArr5 = c2577a.f13982b;
                    int i85 = c2577a.f13981a;
                    int length3 = bArr5.length;
                    int[] iArr2 = new int[length3];
                    for (int i86 = 0; i86 < length3; i86++) {
                        iArr2[i86] = bArr5[i86] & 255;
                    }
                    try {
                        int m39j = this.f13988a.m39j(iArr2, bArr5.length - i85);
                        for (int i87 = 0; i87 < i85; i87++) {
                            bArr5[i87] = (byte) iArr2[i87];
                        }
                        i83 += m39j;
                        for (int i88 = 0; i88 < i85; i88++) {
                            bArr4[(i88 * i70) + i84] = bArr5[i88];
                        }
                    } catch (C2310c unused) {
                        throw C0393c.m867a();
                    }
                }
                C0430v c0430v = new C0430v(bArr4);
                C0031h1 c0031h12 = new C0031h1(100);
                StringBuilder sb = new StringBuilder(0);
                ArrayList arrayList = new ArrayList(1);
                HashSet hashSet = new HashSet();
                int i89 = 2;
                boolean z12 = false;
                while (true) {
                    if (i89 == 2) {
                        boolean z13 = false;
                        while (true) {
                            int m919b4 = c0430v.m919b(i78);
                            if (m919b4 != 0) {
                                if (m919b4 <= 128) {
                                    if (z13) {
                                        m919b4 += 128;
                                    }
                                    c0031h12.m90c((char) (m919b4 - 1));
                                    bArr2 = bArr4;
                                    i9 = i83;
                                } else if (m919b4 == 129) {
                                    bArr2 = bArr4;
                                    i9 = i83;
                                    i13 = 1;
                                } else {
                                    if (m919b4 <= 229) {
                                        int i90 = m919b4 - 130;
                                        if (i90 < 10) {
                                            c0031h12.m90c('0');
                                        }
                                        ((StringBuilder) c0031h12.f152f).append(String.valueOf(i90));
                                    } else {
                                        switch (m919b4) {
                                            case 230:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 3;
                                                break;
                                            case 231:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 7;
                                                break;
                                            case 232:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                hashSet.add(Integer.valueOf(c0031h12.toString().length()));
                                                c0031h12.m90c((char) 29);
                                                if (c0430v.m918a() > 0) {
                                                    break;
                                                } else {
                                                    i83 = i9;
                                                    bArr4 = bArr2;
                                                    i78 = 8;
                                                }
                                            case 233:
                                            case 234:
                                                break;
                                            case 235:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                z13 = true;
                                                if (c0430v.m918a() > 0) {
                                                }
                                                break;
                                            case 236:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                ((StringBuilder) c0031h12.f152f).append("[)>\u001e05\u001d");
                                                sb.insert(0, "\u001e\u0004");
                                                if (c0430v.m918a() > 0) {
                                                }
                                                break;
                                            case 237:
                                                bArr2 = bArr4;
                                                ((StringBuilder) c0031h12.f152f).append("[)>\u001e06\u001d");
                                                sb.insert(0, "\u001e\u0004");
                                                i9 = i83;
                                                if (c0430v.m918a() > 0) {
                                                }
                                                break;
                                            case 238:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 5;
                                                break;
                                            case 239:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 4;
                                                break;
                                            case 240:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 6;
                                                break;
                                            case 241:
                                                bArr2 = bArr4;
                                                i9 = i83;
                                                i13 = 8;
                                                break;
                                            default:
                                                bArr2 = bArr4;
                                                if (m919b4 != 254 || c0430v.m918a() != 0) {
                                                }
                                                i9 = i83;
                                                if (c0430v.m918a() > 0) {
                                                }
                                                break;
                                        }
                                    }
                                    bArr2 = bArr4;
                                    i9 = i83;
                                    if (c0430v.m918a() > 0) {
                                    }
                                }
                            } else {
                                throw C0396f.m868a();
                            }
                        }
                        i89 = i13;
                        i10 = 6;
                    } else {
                        bArr2 = bArr4;
                        i9 = i83;
                        switch (AbstractC2647h.m4257c(i89)) {
                            case 2:
                                i10 = 6;
                                int[] iArr3 = new int[3];
                                boolean z14 = false;
                                int i91 = 0;
                                while (c0430v.m918a() != 8 && (m919b = c0430v.m919b(8)) != 254) {
                                    AbstractC2578b.m4107a(m919b, c0430v.m919b(8), iArr3);
                                    int i92 = i91;
                                    z14 = z14;
                                    int i93 = 0;
                                    while (i93 < 3) {
                                        int i94 = iArr3[i93];
                                        if (i92 != 0) {
                                            iArr = iArr3;
                                            if (i92 != 1) {
                                                if (i92 != 2) {
                                                    if (i92 == 3) {
                                                        if (z14) {
                                                            c0031h12.m90c((char) (i94 + 224));
                                                            z14 = false;
                                                        } else {
                                                            c0031h12.m90c((char) (i94 + 96));
                                                        }
                                                        i92 = 0;
                                                    } else {
                                                        throw C0396f.m868a();
                                                    }
                                                } else if (i94 < 27) {
                                                    char c9 = AbstractC2578b.f13984b[i94];
                                                    if (z14) {
                                                        c0031h12.m90c((char) (c9 + 128));
                                                        z14 = false;
                                                    } else {
                                                        c0031h12.m90c(c9);
                                                    }
                                                    c8 = 29;
                                                    c7 = 30;
                                                } else if (i94 != 27) {
                                                    c7 = 30;
                                                    if (i94 == 30) {
                                                        c8 = 29;
                                                        z14 = true;
                                                    } else {
                                                        throw C0396f.m868a();
                                                    }
                                                } else {
                                                    c7 = 30;
                                                    hashSet.add(Integer.valueOf(c0031h12.toString().length()));
                                                    c8 = 29;
                                                    c0031h12.m90c((char) 29);
                                                }
                                            } else {
                                                c7 = 30;
                                                if (z14) {
                                                    c0031h12.m90c((char) (i94 + 128));
                                                    z14 = false;
                                                } else {
                                                    c0031h12.m90c((char) i94);
                                                }
                                            }
                                            i92 = 0;
                                        } else {
                                            iArr = iArr3;
                                            if (i94 < 3) {
                                                i92 = i94 + 1;
                                            } else if (i94 < 40) {
                                                char c10 = AbstractC2578b.f13983a[i94];
                                                if (z14) {
                                                    c0031h12.m90c((char) (c10 + 128));
                                                    z14 = false;
                                                } else {
                                                    c0031h12.m90c(c10);
                                                }
                                            } else {
                                                throw C0396f.m868a();
                                            }
                                        }
                                        i93++;
                                        iArr3 = iArr;
                                    }
                                    int[] iArr4 = iArr3;
                                    if (c0430v.m918a() > 0) {
                                        i91 = i92;
                                        iArr3 = iArr4;
                                    }
                                }
                                i89 = 2;
                                break;
                            case 3:
                                i10 = 6;
                                int[] iArr5 = new int[3];
                                boolean z15 = false;
                                int i95 = 0;
                                while (c0430v.m918a() != 8 && (m919b2 = c0430v.m919b(8)) != 254) {
                                    AbstractC2578b.m4107a(m919b2, c0430v.m919b(8), iArr5);
                                    int i96 = i95;
                                    int i97 = 0;
                                    while (i97 < 3) {
                                        int i98 = iArr5[i97];
                                        if (i96 != 0) {
                                            i11 = i97;
                                            if (i96 != 1) {
                                                if (i96 != 2) {
                                                    if (i96 == 3) {
                                                        if (i98 < 32) {
                                                            char c11 = AbstractC2578b.f13987e[i98];
                                                            if (z15) {
                                                                c0031h12.m90c((char) (c11 + 128));
                                                                z15 = false;
                                                                i96 = 0;
                                                            } else {
                                                                c0031h12.m90c(c11);
                                                                i96 = 0;
                                                            }
                                                        } else {
                                                            throw C0396f.m868a();
                                                        }
                                                    } else {
                                                        throw C0396f.m868a();
                                                    }
                                                } else {
                                                    if (i98 < 27) {
                                                        char c12 = AbstractC2578b.f13986d[i98];
                                                        if (z15) {
                                                            c0031h12.m90c((char) (c12 + 128));
                                                            z15 = false;
                                                        } else {
                                                            c0031h12.m90c(c12);
                                                        }
                                                    } else if (i98 != 27) {
                                                        if (i98 == 30) {
                                                            z15 = true;
                                                        } else {
                                                            throw C0396f.m868a();
                                                        }
                                                    } else {
                                                        hashSet.add(Integer.valueOf(c0031h12.toString().length()));
                                                        c0031h12.m90c((char) 29);
                                                    }
                                                    i96 = 0;
                                                }
                                            } else if (z15) {
                                                c0031h12.m90c((char) (i98 + 128));
                                                z15 = false;
                                                i96 = 0;
                                            } else {
                                                c0031h12.m90c((char) i98);
                                                i96 = 0;
                                            }
                                        } else {
                                            i11 = i97;
                                            if (i98 < 3) {
                                                i96 = i98 + 1;
                                            } else if (i98 < 40) {
                                                char c13 = AbstractC2578b.f13985c[i98];
                                                if (z15) {
                                                    c0031h12.m90c((char) (c13 + 128));
                                                    z15 = false;
                                                } else {
                                                    c0031h12.m90c(c13);
                                                }
                                            } else {
                                                throw C0396f.m868a();
                                            }
                                        }
                                        i97 = i11 + 1;
                                    }
                                    if (c0430v.m918a() > 0) {
                                        i95 = i96;
                                    }
                                }
                                i89 = 2;
                                break;
                            case 4:
                                int i99 = 3;
                                int[] iArr6 = new int[3];
                                while (c0430v.m918a() != 8 && (m919b3 = c0430v.m919b(8)) != 254) {
                                    AbstractC2578b.m4107a(m919b3, c0430v.m919b(8), iArr6);
                                    int i100 = 0;
                                    while (i100 < i99) {
                                        int i101 = iArr6[i100];
                                        if (i101 != 0) {
                                            if (i101 != 1) {
                                                if (i101 != 2) {
                                                    if (i101 != i99) {
                                                        if (i101 < 14) {
                                                            c0031h12.m90c((char) (i101 + 44));
                                                        } else if (i101 < 40) {
                                                            c0031h12.m90c((char) (i101 + 51));
                                                        } else {
                                                            throw C0396f.m868a();
                                                        }
                                                    } else {
                                                        c0031h12.m90c(' ');
                                                    }
                                                } else {
                                                    c0031h12.m90c('>');
                                                }
                                            } else {
                                                c0031h12.m90c('*');
                                            }
                                        } else {
                                            c0031h12.m90c('\r');
                                        }
                                        i100++;
                                        i99 = 3;
                                    }
                                    if (c0430v.m918a() > 0) {
                                        i99 = 3;
                                    }
                                }
                                i10 = 6;
                                i89 = 2;
                                break;
                            case AbstractC3122c.f15761f /* 5 */:
                                while (true) {
                                    if (c0430v.m918a() <= 16) {
                                        i12 = 6;
                                    } else {
                                        int i102 = 0;
                                        while (true) {
                                            if (i102 < 4) {
                                                i12 = 6;
                                                int m919b5 = c0430v.m919b(6);
                                                if (m919b5 == 31) {
                                                    int i103 = 8 - c0430v.f1468c;
                                                    if (i103 != 8) {
                                                        c0430v.m919b(i103);
                                                    }
                                                } else {
                                                    if ((m919b5 & 32) == 0) {
                                                        m919b5 |= 64;
                                                    }
                                                    c0031h12.m90c((char) m919b5);
                                                    i102++;
                                                }
                                            } else {
                                                i12 = 6;
                                                if (c0430v.m918a() <= 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i12;
                                i89 = 2;
                                break;
                            case AbstractC3122c.f15759d /* 6 */:
                                int i104 = c0430v.f1467b;
                                int i105 = 8;
                                int i106 = i104 + 2;
                                int m4108b = AbstractC2578b.m4108b(c0430v.m919b(8), i104 + 1);
                                if (m4108b == 0) {
                                    m4108b = c0430v.m918a() / 8;
                                } else if (m4108b >= 250) {
                                    m4108b = ((m4108b - 249) * 250) + AbstractC2578b.m4108b(c0430v.m919b(8), i106);
                                    i106 = i104 + 3;
                                }
                                if (m4108b >= 0) {
                                    byte[] bArr6 = new byte[m4108b];
                                    int i107 = 0;
                                    while (i107 < m4108b) {
                                        int i108 = m4108b;
                                        if (c0430v.m918a() >= i105) {
                                            bArr6[i107] = (byte) AbstractC2578b.m4108b(c0430v.m919b(i105), i106);
                                            i107++;
                                            i106++;
                                            m4108b = i108;
                                            i105 = 8;
                                        } else {
                                            throw C0396f.m868a();
                                        }
                                    }
                                    arrayList.add(bArr6);
                                    ((StringBuilder) c0031h12.f152f).append(new String(bArr6, StandardCharsets.ISO_8859_1));
                                    i10 = 6;
                                    i89 = 2;
                                    break;
                                } else {
                                    throw C0396f.m868a();
                                }
                            case 7:
                                if (c0430v.m918a() >= 8) {
                                    int m919b6 = c0430v.m919b(8);
                                    if (m919b6 <= 127) {
                                        c0031h12.m98k(m919b6 - 1);
                                    }
                                    z12 = true;
                                    i10 = 6;
                                    i89 = 2;
                                    break;
                                } else {
                                    throw C0396f.m868a();
                                }
                            default:
                                throw C0396f.m868a();
                        }
                    }
                    if (i89 != 1 && c0430v.m918a() > 0) {
                        i83 = i9;
                        bArr4 = bArr2;
                        i78 = 8;
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw C0396f.m868a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: c | f -> 0x0052, TryCatch #1 {c | f -> 0x0052, blocks: (B:10:0x0011, B:11:0x0026, B:13:0x002a, B:14:0x002d, B:16:0x0031, B:18:0x003b, B:20:0x0041, B:25:0x0046), top: B:9:0x0011 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2071d m4112d(C2069b c2069b, Map map) {
        C0393c c0393c;
        C2069b c2069b2;
        int i7;
        C0293g c0293g = new C0293g(c2069b);
        try {
            return m4110b(c0293g, map);
        } catch (C0393c e7) {
            c0393c = e7;
            e = null;
            try {
                c0293g.m654i();
                c0293g.f1069c = null;
                c0293g.f1070d = null;
                c0293g.f1067a = true;
                c0293g.m653h();
                c0293g.m652g();
                c2069b2 = (C2069b) c0293g.f1068b;
                i7 = 0;
                while (i7 < c2069b2.f12258e) {
                    int i8 = i7 + 1;
                    for (int i9 = i8; i9 < c2069b2.f12259f; i9++) {
                        if (c2069b2.m3313b(i7, i9) != c2069b2.m3313b(i9, i7)) {
                            c2069b2.m3312a(i9, i7);
                            c2069b2.m3312a(i7, i9);
                        }
                    }
                    i7 = i8;
                }
                C2071d m4110b = m4110b(c0293g, map);
                m4110b.f12276j = new Object();
                return m4110b;
            } catch (C0393c | C0396f unused) {
                if (e != null) {
                    throw e;
                }
                throw c0393c;
            }
        } catch (C0396f e8) {
            e = e8;
            c0393c = null;
            c0293g.m654i();
            c0293g.f1069c = null;
            c0293g.f1070d = null;
            c0293g.f1067a = true;
            c0293g.m653h();
            c0293g.m652g();
            c2069b2 = (C2069b) c0293g.f1068b;
            i7 = 0;
            while (i7 < c2069b2.f12258e) {
            }
            C2071d m4110b2 = m4110b(c0293g, map);
            m4110b2.f12276j = new Object();
            return m4110b2;
        }
    }
}
