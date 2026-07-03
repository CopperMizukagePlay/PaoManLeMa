package p126q4;

import java.util.Map;
import p022c4.C0392b;
import p022c4.C0396f;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.EnumC0391a;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.e */
/* loaded from: classes.dex */
public final class C2990e extends AbstractC2996k {

    /* renamed from: j */
    public static final int[] f15437j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k */
    public static final int[] f15438k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l */
    public static final int[][] f15439l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    public final /* synthetic */ int f15440h;

    /* renamed from: i */
    public final Object f15441i;

    public C2990e(int i7) {
        this.f15440h = i7;
        switch (i7) {
            case 1:
                this.f15441i = new int[4];
                return;
            case 2:
                this.f15441i = new int[4];
                return;
            case 3:
                this.f15441i = new C2990e(0);
                return;
            default:
                this.f15441i = new int[4];
                return;
        }
    }

    /* renamed from: o */
    public static C0404n m4647o(C0404n c0404n) {
        String str = c0404n.f1371a;
        if (str.charAt(0) == '0') {
            C0404n c0404n2 = new C0404n(str.substring(1), null, c0404n.f1373c, EnumC0391a.f1329s);
            Map map = c0404n.f1375e;
            if (map != null) {
                c0404n2.m879a(map);
            }
            return c0404n2;
        }
        throw C0396f.m868a();
    }

    @Override // p126q4.AbstractC2993h, p022c4.InterfaceC0402l
    /* renamed from: a */
    public C0404n mo875a(C0392b c0392b, Map map) {
        switch (this.f15440h) {
            case 3:
                return m4647o(((C2990e) this.f15441i).mo875a(c0392b, map));
            default:
                return super.mo875a(c0392b, map);
        }
    }

    @Override // p126q4.AbstractC2996k, p126q4.AbstractC2993h
    /* renamed from: b */
    public C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        switch (this.f15440h) {
            case 3:
                return m4647o(((C2990e) this.f15441i).mo4642b(i7, c2068a, map));
            default:
                return super.mo4642b(i7, c2068a, map);
        }
    }

    @Override // p126q4.AbstractC2996k
    /* renamed from: g */
    public boolean mo4648g(String str) {
        switch (this.f15440h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c7 = cArr[5];
                switch (c7) {
                    case '0':
                    case '1':
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c7);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c7);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.mo4648g(sb.toString());
            default:
                return super.mo4648g(str);
        }
    }

    @Override // p126q4.AbstractC2996k
    /* renamed from: i */
    public int[] mo4649i(C2068a c2068a, int i7) {
        switch (this.f15440h) {
            case 1:
                return AbstractC2996k.m4664l(c2068a, i7, true, f15438k, new int[6]);
            default:
                return super.mo4649i(c2068a, i7);
        }
    }

    @Override // p126q4.AbstractC2996k
    /* renamed from: j */
    public final int mo4650j(C2068a c2068a, int[] iArr, StringBuilder sb) {
        int[][] iArr2;
        switch (this.f15440h) {
            case 0:
                int[] iArr3 = (int[]) this.f15441i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i7 = c2068a.f12257f;
                int i8 = iArr[1];
                int i9 = 0;
                for (int i10 = 0; i10 < 6 && i8 < i7; i10++) {
                    int m4663h = AbstractC2996k.m4663h(c2068a, iArr3, i8, AbstractC2996k.f15460g);
                    sb.append((char) ((m4663h % 10) + 48));
                    for (int i11 : iArr3) {
                        i8 += i11;
                    }
                    if (m4663h >= 10) {
                        i9 |= 1 << (5 - i10);
                    }
                }
                for (int i12 = 0; i12 < 10; i12++) {
                    if (i9 == f15437j[i12]) {
                        sb.insert(0, (char) (i12 + 48));
                        int i13 = AbstractC2996k.m4664l(c2068a, i8, true, AbstractC2996k.f15458e, new int[5])[1];
                        for (int i14 = 0; i14 < 6 && i13 < i7; i14++) {
                            sb.append((char) (AbstractC2996k.m4663h(c2068a, iArr3, i13, AbstractC2996k.f15459f) + 48));
                            for (int i15 : iArr3) {
                                i13 += i15;
                            }
                        }
                        return i13;
                    }
                }
                throw C0400j.m878a();
            case 1:
                int[] iArr4 = (int[]) this.f15441i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i16 = c2068a.f12257f;
                int i17 = iArr[1];
                int i18 = 0;
                for (int i19 = 0; i19 < 6 && i17 < i16; i19++) {
                    int m4663h2 = AbstractC2996k.m4663h(c2068a, iArr4, i17, AbstractC2996k.f15460g);
                    sb.append((char) ((m4663h2 % 10) + 48));
                    for (int i20 : iArr4) {
                        i17 += i20;
                    }
                    if (m4663h2 >= 10) {
                        i18 |= 1 << (5 - i19);
                    }
                }
                for (int i21 = 0; i21 <= 1; i21++) {
                    for (int i22 = 0; i22 < 10; i22++) {
                        if (i18 == f15439l[i21][i22]) {
                            sb.insert(0, (char) (i21 + 48));
                            sb.append((char) (i22 + 48));
                            return i17;
                        }
                    }
                }
                throw C0400j.m878a();
            case 2:
                int[] iArr5 = (int[]) this.f15441i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i23 = c2068a.f12257f;
                int i24 = iArr[1];
                int i25 = 0;
                while (true) {
                    iArr2 = AbstractC2996k.f15459f;
                    if (i25 < 4 && i24 < i23) {
                        sb.append((char) (AbstractC2996k.m4663h(c2068a, iArr5, i24, iArr2) + 48));
                        for (int i26 : iArr5) {
                            i24 += i26;
                        }
                        i25++;
                    }
                }
                int i27 = AbstractC2996k.m4664l(c2068a, i24, true, AbstractC2996k.f15458e, new int[5])[1];
                for (int i28 = 0; i28 < 4 && i27 < i23; i28++) {
                    sb.append((char) (AbstractC2996k.m4663h(c2068a, iArr5, i27, iArr2) + 48));
                    for (int i29 : iArr5) {
                        i27 += i29;
                    }
                }
                return i27;
            default:
                return ((C2990e) this.f15441i).mo4650j(c2068a, iArr, sb);
        }
    }

    @Override // p126q4.AbstractC2996k
    /* renamed from: k */
    public C0404n mo4651k(int i7, C2068a c2068a, int[] iArr, Map map) {
        switch (this.f15440h) {
            case 3:
                return m4647o(((C2990e) this.f15441i).mo4651k(i7, c2068a, iArr, map));
            default:
                return super.mo4651k(i7, c2068a, iArr, map);
        }
    }

    @Override // p126q4.AbstractC2996k
    /* renamed from: n */
    public final EnumC0391a mo4652n() {
        switch (this.f15440h) {
            case 0:
                return EnumC0391a.f1322l;
            case 1:
                return EnumC0391a.f1330t;
            case 2:
                return EnumC0391a.f1321k;
            default:
                return EnumC0391a.f1329s;
        }
    }
}
