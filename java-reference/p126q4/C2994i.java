package p126q4;

import java.util.EnumMap;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0405o;
import p067i4.C2068a;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.i */
/* loaded from: classes.dex */
public final class C2994i {

    /* renamed from: c */
    public static final int[] f15451c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final int[] f15452a;

    /* renamed from: b */
    public final StringBuilder f15453b;

    public C2994i(int i7) {
        switch (i7) {
            case 1:
                this.f15452a = new int[4];
                this.f15453b = new StringBuilder();
                return;
            default:
                this.f15452a = new int[4];
                this.f15453b = new StringBuilder();
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r1.equals("99991") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0404n m4660a(int i7, C2068a c2068a, int[] iArr) {
        String str;
        String valueOf;
        String str2;
        EnumMap enumMap;
        StringBuilder sb = this.f15453b;
        sb.setLength(0);
        int[] iArr2 = this.f15452a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        char c7 = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i8 = c2068a.f12257f;
        int i9 = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 5 && i9 < i8; i11++) {
            int m4663h = AbstractC2996k.m4663h(c2068a, iArr2, i9, AbstractC2996k.f15460g);
            sb.append((char) ((m4663h % 10) + 48));
            for (int i12 : iArr2) {
                i9 += i12;
            }
            if (m4663h >= 10) {
                i10 |= 1 << (4 - i11);
            }
            if (i11 != 4) {
                i9 = c2068a.m3307f(c2068a.m3306e(i9));
            }
        }
        if (sb.length() == 5) {
            for (int i13 = 0; i13 < 10; i13++) {
                if (i10 == f15451c[i13]) {
                    String sb2 = sb.toString();
                    int length = sb2.length();
                    int i14 = 0;
                    for (int i15 = length - 2; i15 >= 0; i15 -= 2) {
                        i14 += sb2.charAt(i15) - '0';
                    }
                    int i16 = i14 * 3;
                    for (int i17 = length - 1; i17 >= 0; i17 -= 2) {
                        i16 += sb2.charAt(i17) - '0';
                    }
                    if ((i16 * 3) % 10 == i13) {
                        String sb3 = sb.toString();
                        if (sb3.length() == 5) {
                            char charAt = sb3.charAt(0);
                            if (charAt != '0') {
                                if (charAt != '5') {
                                    str = "";
                                    if (charAt == '9') {
                                        switch (sb3.hashCode()) {
                                            case 54118329:
                                                if (sb3.equals("90000")) {
                                                    c7 = 0;
                                                    break;
                                                }
                                                c7 = 65535;
                                                break;
                                            case 54395376:
                                                if (sb3.equals("99990")) {
                                                    c7 = 1;
                                                    break;
                                                }
                                                c7 = 65535;
                                                break;
                                            case 54395377:
                                                break;
                                            default:
                                                c7 = 65535;
                                                break;
                                        }
                                        switch (c7) {
                                            case 0:
                                                str2 = null;
                                                break;
                                            case 1:
                                                str2 = "Used";
                                                break;
                                            case 2:
                                                str2 = "0.00";
                                                break;
                                        }
                                        if (str2 != null) {
                                            enumMap = new EnumMap(EnumC0405o.class);
                                            enumMap.put((EnumMap) EnumC0405o.f1382k, (EnumC0405o) str2);
                                            float f7 = i7;
                                            C0404n c0404n = new C0404n(sb3, null, new C0406p[]{new C0406p((iArr[0] + iArr[1]) / 2.0f, f7), new C0406p(i9, f7)}, EnumC0391a.f1331u);
                                            if (enumMap != null) {
                                                c0404n.m879a(enumMap);
                                            }
                                            return c0404n;
                                        }
                                    }
                                } else {
                                    str = "$";
                                }
                            } else {
                                str = "£";
                            }
                            int parseInt = Integer.parseInt(sb3.substring(1));
                            String valueOf2 = String.valueOf(parseInt / 100);
                            int i18 = parseInt % 100;
                            if (i18 < 10) {
                                valueOf = AbstractC2647h.m4256b("0", i18);
                            } else {
                                valueOf = String.valueOf(i18);
                            }
                            str2 = str + valueOf2 + '.' + valueOf;
                            if (str2 != null) {
                            }
                        }
                        enumMap = null;
                        float f72 = i7;
                        C0404n c0404n2 = new C0404n(sb3, null, new C0406p[]{new C0406p((iArr[0] + iArr[1]) / 2.0f, f72), new C0406p(i9, f72)}, EnumC0391a.f1331u);
                        if (enumMap != null) {
                        }
                        return c0404n2;
                    }
                    throw C0400j.m878a();
                }
            }
            throw C0400j.m878a();
        }
        throw C0400j.m878a();
    }
}
