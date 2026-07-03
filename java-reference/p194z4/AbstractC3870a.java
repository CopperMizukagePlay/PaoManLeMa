package p194z4;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import p022c4.C0396f;
import p022c4.EnumC0394d;
import p023c5.C0430v;
import p067i4.AbstractC2076i;
import p067i4.EnumC2070c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z4.a */
/* loaded from: classes.dex */
public abstract class AbstractC3870a {

    /* renamed from: a */
    public static final char[] f18133a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: a */
    public static void m5888a(C0430v c0430v, StringBuilder sb, int i7, boolean z7) {
        while (i7 > 1) {
            if (c0430v.m918a() >= 11) {
                int m919b = c0430v.m919b(11);
                sb.append(m5893f(m919b / 45));
                sb.append(m5893f(m919b % 45));
                i7 -= 2;
            } else {
                throw C0396f.m868a();
            }
        }
        if (i7 == 1) {
            if (c0430v.m918a() >= 6) {
                sb.append(m5893f(c0430v.m919b(6)));
            } else {
                throw C0396f.m868a();
            }
        }
        if (z7) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i8 = length + 1;
                        if (sb.charAt(i8) == '%') {
                            sb.deleteCharAt(i8);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5889b(C0430v c0430v, StringBuilder sb, int i7, EnumC2070c enumC2070c, ArrayList arrayList, Map map) {
        Charset forName;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte b8;
        if (i7 * 8 <= c0430v.m918a()) {
            byte[] bArr = new byte[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) c0430v.m919b(8);
            }
            if (enumC2070c == null) {
                Charset charset = AbstractC2076i.f12295b;
                if (map != null) {
                    EnumC0394d enumC0394d = EnumC0394d.CHARACTER_SET;
                    if (map.containsKey(enumC0394d)) {
                        forName = Charset.forName(map.get(enumC0394d).toString());
                    }
                }
                boolean z14 = true;
                if (i7 > 2 && (((b8 = bArr[0]) == -2 && bArr[1] == -1) || (b8 == -1 && bArr[1] == -2))) {
                    forName = StandardCharsets.UTF_16;
                } else {
                    if (charset != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i7 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    boolean z15 = z7;
                    boolean z16 = true;
                    while (i12 < i7 && (z14 || z15 || z16)) {
                        boolean z17 = z14;
                        byte b9 = bArr[i12];
                        Charset charset2 = charset;
                        int i21 = b9 & 255;
                        if (z16) {
                            if (i13 > 0) {
                                if ((b9 & 128) != 0) {
                                    i13--;
                                    if (z17) {
                                        if (i21 > 127 && i21 < 160) {
                                            z12 = false;
                                            if (!z15) {
                                                if (i14 > 0) {
                                                    z13 = z12;
                                                    if (i21 >= 64 && i21 != 127 && i21 <= 252) {
                                                        i14--;
                                                    }
                                                    z15 = false;
                                                } else {
                                                    z13 = z12;
                                                    if (i21 != 128 && i21 != 160 && i21 <= 239) {
                                                        if (i21 > 160 && i21 < 224) {
                                                            i11++;
                                                            int i22 = i20 + 1;
                                                            if (i22 > i8) {
                                                                i8 = i22;
                                                                i20 = i8;
                                                            } else {
                                                                i20 = i22;
                                                            }
                                                            i19 = 0;
                                                        } else {
                                                            if (i21 > 127) {
                                                                i14++;
                                                                int i23 = i19 + 1;
                                                                if (i23 > i10) {
                                                                    i10 = i23;
                                                                    i19 = i10;
                                                                } else {
                                                                    i19 = i23;
                                                                }
                                                            } else {
                                                                i19 = 0;
                                                            }
                                                            i20 = 0;
                                                        }
                                                    }
                                                    z15 = false;
                                                }
                                            } else {
                                                z13 = z12;
                                            }
                                            i12++;
                                            z14 = z13;
                                            charset = charset2;
                                        } else if (i21 > 159 && (i21 < 192 || i21 == 215 || i21 == 247)) {
                                            i18++;
                                        }
                                    }
                                    z12 = z17;
                                    if (!z15) {
                                    }
                                    i12++;
                                    z14 = z13;
                                    charset = charset2;
                                }
                            } else {
                                z11 = z16;
                                if ((b9 & 128) != 0) {
                                    if ((b9 & 64) != 0) {
                                        int i24 = i13 + 1;
                                        if ((b9 & 32) == 0) {
                                            i15++;
                                        } else {
                                            i24 = i13 + 2;
                                            if ((b9 & 16) == 0) {
                                                i16++;
                                            } else {
                                                i13 += 3;
                                                if ((b9 & 8) == 0) {
                                                    i17++;
                                                }
                                            }
                                        }
                                        i13 = i24;
                                    }
                                }
                            }
                            z16 = false;
                            if (z17) {
                            }
                            z12 = z17;
                            if (!z15) {
                            }
                            i12++;
                            z14 = z13;
                            charset = charset2;
                        } else {
                            z11 = z16;
                        }
                        z16 = z11;
                        if (z17) {
                        }
                        z12 = z17;
                        if (!z15) {
                        }
                        i12++;
                        z14 = z13;
                        charset = charset2;
                    }
                    boolean z18 = z14;
                    Charset charset3 = charset;
                    boolean z19 = z16;
                    if (z19 && i13 > 0) {
                        z9 = false;
                    } else {
                        z9 = z19;
                    }
                    if (z15 && i14 > 0) {
                        z10 = false;
                    } else {
                        z10 = z15;
                    }
                    if (z9 && (z8 || i15 + i16 + i17 > 0)) {
                        forName = StandardCharsets.UTF_8;
                    } else {
                        if (!z10 || (!AbstractC2076i.f12297d && i8 < 3 && i10 < 3)) {
                            if (z18 && z10) {
                                if ((i8 != 2 || i11 != 2) && i18 * 10 < i7) {
                                    forName = StandardCharsets.ISO_8859_1;
                                }
                            } else if (z18) {
                                forName = StandardCharsets.ISO_8859_1;
                            } else if (!z10) {
                                if (z9) {
                                    forName = StandardCharsets.UTF_8;
                                } else {
                                    forName = AbstractC2076i.f12294a;
                                }
                            }
                        }
                        forName = charset3;
                    }
                }
            } else {
                forName = Charset.forName(enumC2070c.name());
            }
            sb.append(new String(bArr, forName));
            arrayList.add(bArr);
            return;
        }
        throw C0396f.m868a();
    }

    /* renamed from: c */
    public static void m5890c(C0430v c0430v, StringBuilder sb, int i7) {
        int i8;
        if (AbstractC2076i.f12296c != null) {
            if (i7 * 13 <= c0430v.m918a()) {
                byte[] bArr = new byte[i7 * 2];
                int i9 = 0;
                while (i7 > 0) {
                    int m919b = c0430v.m919b(13);
                    int i10 = (m919b % 96) | ((m919b / 96) << 8);
                    if (i10 < 2560) {
                        i8 = 41377;
                    } else {
                        i8 = 42657;
                    }
                    int i11 = i10 + i8;
                    bArr[i9] = (byte) ((i11 >> 8) & 255);
                    bArr[i9 + 1] = (byte) (i11 & 255);
                    i9 += 2;
                    i7--;
                }
                sb.append(new String(bArr, AbstractC2076i.f12296c));
                return;
            }
            throw C0396f.m868a();
        }
        throw C0396f.m868a();
    }

    /* renamed from: d */
    public static void m5891d(C0430v c0430v, StringBuilder sb, int i7) {
        int i8;
        if (AbstractC2076i.f12295b != null) {
            if (i7 * 13 <= c0430v.m918a()) {
                byte[] bArr = new byte[i7 * 2];
                int i9 = 0;
                while (i7 > 0) {
                    int m919b = c0430v.m919b(13);
                    int i10 = (m919b % 192) | ((m919b / 192) << 8);
                    if (i10 < 7936) {
                        i8 = 33088;
                    } else {
                        i8 = 49472;
                    }
                    int i11 = i10 + i8;
                    bArr[i9] = (byte) (i11 >> 8);
                    bArr[i9 + 1] = (byte) i11;
                    i9 += 2;
                    i7--;
                }
                sb.append(new String(bArr, AbstractC2076i.f12295b));
                return;
            }
            throw C0396f.m868a();
        }
        throw C0396f.m868a();
    }

    /* renamed from: e */
    public static void m5892e(C0430v c0430v, StringBuilder sb, int i7) {
        while (i7 >= 3) {
            if (c0430v.m918a() >= 10) {
                int m919b = c0430v.m919b(10);
                if (m919b < 1000) {
                    sb.append(m5893f(m919b / 100));
                    sb.append(m5893f((m919b / 10) % 10));
                    sb.append(m5893f(m919b % 10));
                    i7 -= 3;
                } else {
                    throw C0396f.m868a();
                }
            } else {
                throw C0396f.m868a();
            }
        }
        if (i7 == 2) {
            if (c0430v.m918a() >= 7) {
                int m919b2 = c0430v.m919b(7);
                if (m919b2 < 100) {
                    sb.append(m5893f(m919b2 / 10));
                    sb.append(m5893f(m919b2 % 10));
                    return;
                }
                throw C0396f.m868a();
            }
            throw C0396f.m868a();
        }
        if (i7 == 1) {
            if (c0430v.m918a() >= 4) {
                int m919b3 = c0430v.m919b(4);
                if (m919b3 < 10) {
                    sb.append(m5893f(m919b3));
                    return;
                }
                throw C0396f.m868a();
            }
            throw C0396f.m868a();
        }
    }

    /* renamed from: f */
    public static char m5893f(int i7) {
        char[] cArr = f18133a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw C0396f.m868a();
    }
}
