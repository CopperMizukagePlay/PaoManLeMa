package p014b5;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p022c4.C0396f;
import p067i4.C2069b;
import p067i4.C2073f;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p194z4.C3872c;
import p194z4.C3875f;
import p194z4.EnumC3871b;
import p194z4.EnumC3873d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b5.g */
/* loaded from: classes.dex */
public final class C0293g {

    /* renamed from: a */
    public boolean f1067a;

    /* renamed from: b */
    public final Object f1068b;

    /* renamed from: c */
    public Object f1069c;

    /* renamed from: d */
    public Object f1070d;

    public C0293g() {
        this.f1068b = new Object();
        this.f1069c = new ArrayList();
        this.f1070d = new ArrayList();
        this.f1067a = true;
    }

    /* renamed from: a */
    public static void m646a(C0291e[][][] c0291eArr, int i7, C0291e c0291e) {
        C0291e[] c0291eArr2 = c0291eArr[i7 + c0291e.f1059d][c0291e.f1058c];
        EnumC3873d enumC3873d = c0291e.f1056a;
        int ordinal = enumC3873d.ordinal();
        char c7 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c7 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + enumC3873d);
                    }
                } else {
                    c7 = 3;
                }
            } else {
                c7 = 1;
            }
        }
        C0291e c0291e2 = c0291eArr2[c7];
        if (c0291e2 != null && c0291e2.f1061f <= c0291e.f1061f) {
            return;
        }
        c0291eArr2[c7] = c0291e;
    }

    /* renamed from: c */
    public static boolean m647c(EnumC3873d enumC3873d, char c7) {
        int i7;
        int ordinal = enumC3873d.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return AbstractC0289c.m636b(String.valueOf(c7));
                    }
                    return false;
                }
            } else {
                int[] iArr = AbstractC0289c.f1050a;
                if (c7 < '`') {
                    i7 = iArr[c7];
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    return false;
                }
            }
        } else if (c7 < '0' || c7 > '9') {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static C3875f m648f(int i7) {
        int m4257c = AbstractC2647h.m4257c(i7);
        if (m4257c != 0) {
            if (m4257c != 1) {
                return C3875f.m5898c(40);
            }
            return C3875f.m5898c(26);
        }
        return C3875f.m5898c(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m649b(C3875f c3875f, C0291e[][][] c0291eArr, int i7, C0291e c0291e) {
        int i8;
        int i9;
        char charAt;
        EnumC3873d enumC3873d;
        char charAt2;
        EnumC3873d enumC3873d2;
        char charAt3;
        EnumC3873d enumC3873d3;
        int i10;
        int i11;
        String str = (String) this.f1068b;
        C2073f c2073f = (C2073f) this.f1069c;
        CharsetEncoder[] charsetEncoderArr = c2073f.f12278a;
        CharsetEncoder[] charsetEncoderArr2 = c2073f.f12278a;
        int length = charsetEncoderArr.length;
        int i12 = c2073f.f12279b;
        if (i12 >= 0) {
            char charAt4 = str.charAt(i7);
            if (charsetEncoderArr2[i12].canEncode("" + charAt4)) {
                length = i12 + 1;
                i8 = length;
                for (i9 = i12; i9 < i8; i9++) {
                    char charAt5 = str.charAt(i7);
                    if (charsetEncoderArr2[i9].canEncode("" + charAt5)) {
                        m646a(c0291eArr, i7, new C0291e(this, EnumC3873d.BYTE, i7, i9, 1, c0291e, c3875f));
                    }
                }
                charAt = str.charAt(i7);
                enumC3873d = EnumC3873d.KANJI;
                if (m647c(enumC3873d, charAt)) {
                    m646a(c0291eArr, i7, new C0291e(this, enumC3873d, i7, 0, 1, c0291e, c3875f));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i7);
                enumC3873d2 = EnumC3873d.ALPHANUMERIC;
                int i13 = 2;
                if (m647c(enumC3873d2, charAt2)) {
                    int i14 = i7 + 1;
                    if (i14 < length2 && m647c(enumC3873d2, str.charAt(i14))) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    m646a(c0291eArr, i7, new C0291e(this, enumC3873d2, i7, 0, i11, c0291e, c3875f));
                }
                charAt3 = str.charAt(i7);
                enumC3873d3 = EnumC3873d.NUMERIC;
                if (!m647c(enumC3873d3, charAt3)) {
                    int i15 = i7 + 1;
                    if (i15 < length2 && m647c(enumC3873d3, str.charAt(i15))) {
                        int i16 = i7 + 2;
                        if (i16 < length2 && m647c(enumC3873d3, str.charAt(i16))) {
                            i13 = 3;
                        }
                        i10 = i13;
                    } else {
                        i10 = 1;
                    }
                    m646a(c0291eArr, i7, new C0291e(this, enumC3873d3, i7, 0, i10, c0291e, c3875f));
                    return;
                }
                return;
            }
        }
        i12 = 0;
        i8 = length;
        while (i9 < i8) {
        }
        charAt = str.charAt(i7);
        enumC3873d = EnumC3873d.KANJI;
        if (m647c(enumC3873d, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i7);
        enumC3873d2 = EnumC3873d.ALPHANUMERIC;
        int i132 = 2;
        if (m647c(enumC3873d2, charAt2)) {
        }
        charAt3 = str.charAt(i7);
        enumC3873d3 = EnumC3873d.NUMERIC;
        if (!m647c(enumC3873d3, charAt3)) {
        }
    }

    /* renamed from: d */
    public int m650d(int i7, int i8, int i9) {
        boolean m3313b;
        C2069b c2069b = (C2069b) this.f1068b;
        if (this.f1067a) {
            m3313b = c2069b.m3313b(i8, i7);
        } else {
            m3313b = c2069b.m3313b(i7, i8);
        }
        if (m3313b) {
            return (i9 << 1) | 1;
        }
        return i9 << 1;
    }

    /* renamed from: e */
    public C0031h1 m651e(C3875f c3875f) {
        int i7;
        String str = (String) this.f1068b;
        int length = str.length();
        C2073f c2073f = (C2073f) this.f1069c;
        CharsetEncoder[] charsetEncoderArr = c2073f.f12278a;
        CharsetEncoder[] charsetEncoderArr2 = c2073f.f12278a;
        C0291e[][][] c0291eArr = (C0291e[][][]) Array.newInstance((Class<?>) C0291e.class, length + 1, charsetEncoderArr.length, 4);
        m649b(c3875f, c0291eArr, 0, null);
        for (int i8 = 1; i8 <= length; i8++) {
            for (int i9 = 0; i9 < charsetEncoderArr2.length; i9++) {
                for (int i10 = 0; i10 < 4; i10++) {
                    C0291e c0291e = c0291eArr[i8][i9][i10];
                    if (c0291e != null && i8 < length) {
                        m649b(c3875f, c0291eArr, i8, c0291e);
                    }
                }
            }
        }
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        int i13 = -1;
        for (int i14 = 0; i14 < charsetEncoderArr2.length; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                C0291e c0291e2 = c0291eArr[length][i14][i15];
                if (c0291e2 != null && (i7 = c0291e2.f1061f) < i12) {
                    i11 = i14;
                    i13 = i15;
                    i12 = i7;
                }
            }
        }
        if (i11 >= 0) {
            return new C0031h1(this, c3875f, c0291eArr[length][i11][i13]);
        }
        throw new Exception(AbstractC0094y0.m185l("Internal error: failed to encode \"", str, "\""));
    }

    /* renamed from: g */
    public C3872c m652g() {
        C3872c c3872c = (C3872c) this.f1070d;
        if (c3872c != null) {
            return c3872c;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            i8 = m650d(i9, 8, i8);
        }
        int m650d = m650d(8, 7, m650d(8, 8, m650d(7, 8, i8)));
        for (int i10 = 5; i10 >= 0; i10--) {
            m650d = m650d(8, i10, m650d);
        }
        int i11 = ((C2069b) this.f1068b).f12259f;
        int i12 = i11 - 7;
        for (int i13 = i11 - 1; i13 >= i12; i13--) {
            i7 = m650d(8, i13, i7);
        }
        for (int i14 = i11 - 8; i14 < i11; i14++) {
            i7 = m650d(i14, 8, i7);
        }
        C3872c m5894a = C3872c.m5894a(m650d, i7);
        if (m5894a == null) {
            m5894a = C3872c.m5894a(m650d ^ 21522, i7 ^ 21522);
        }
        this.f1070d = m5894a;
        if (m5894a != null) {
            return m5894a;
        }
        throw C0396f.m868a();
    }

    /* renamed from: h */
    public C3875f m653h() {
        C3875f c3875f = (C3875f) this.f1069c;
        if (c3875f != null) {
            return c3875f;
        }
        int i7 = ((C2069b) this.f1068b).f12259f;
        int i8 = (i7 - 17) / 4;
        if (i8 <= 6) {
            return C3875f.m5898c(i8);
        }
        int i9 = i7 - 11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i7 - 9; i13 >= i9; i13--) {
                i11 = m650d(i13, i12, i11);
            }
        }
        C3875f m5897b = C3875f.m5897b(i11);
        if (m5897b != null && (m5897b.f18157a * 4) + 17 == i7) {
            this.f1069c = m5897b;
            return m5897b;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i9; i15--) {
                i10 = m650d(i14, i15, i10);
            }
        }
        C3875f m5897b2 = C3875f.m5897b(i10);
        if (m5897b2 != null && (m5897b2.f18157a * 4) + 17 == i7) {
            this.f1069c = m5897b2;
            return m5897b2;
        }
        throw C0396f.m868a();
    }

    /* renamed from: i */
    public void m654i() {
        if (((C3872c) this.f1070d) != null) {
            int i7 = AbstractC2647h.m4258d(8)[((C3872c) this.f1070d).f18141b];
            C2069b c2069b = (C2069b) this.f1068b;
            int i8 = c2069b.f12259f;
            for (int i9 = 0; i9 < i8; i9++) {
                for (int i10 = 0; i10 < i8; i10++) {
                    if (AbstractC2487d.m4037a(i7, i9, i10)) {
                        c2069b.m3312a(i10, i9);
                    }
                }
            }
        }
    }

    public C0293g(C2069b c2069b) {
        int i7 = c2069b.f12259f;
        if (i7 >= 21 && (i7 & 3) == 1) {
            this.f1068b = c2069b;
            return;
        }
        throw C0396f.m868a();
    }

    public C0293g(String str, Charset charset, boolean z7, EnumC3871b enumC3871b) {
        this.f1068b = str;
        this.f1067a = z7;
        this.f1069c = new C2073f(str, charset);
        this.f1070d = enumC3871b;
    }
}
