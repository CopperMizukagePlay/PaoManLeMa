package p126q4;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p022c4.AbstractC0398h;
import p022c4.AbstractC0403m;
import p022c4.C0392b;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p022c4.InterfaceC0402l;
import p067i4.C2068a;
import p067i4.C2074g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.h */
/* loaded from: classes.dex */
public abstract class AbstractC2993h implements InterfaceC0402l {
    /* renamed from: d */
    public static float m4656d(int[] iArr, int[] iArr2, float f7) {
        float f8;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i7 += iArr[i9];
            i8 += iArr2[i9];
        }
        if (i7 < i8) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = i7;
        float f10 = f9 / i8;
        float f11 = f7 * f10;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f13 = iArr2[i10] * f10;
            float f14 = iArr[i10];
            if (f14 > f13) {
                f8 = f14 - f13;
            } else {
                f8 = f13 - f14;
            }
            if (f8 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f8;
        }
        return f12 / f9;
    }

    /* renamed from: e */
    public static void m4657e(int i7, C2068a c2068a, int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i9 = c2068a.f12257f;
        if (i7 < i9) {
            boolean z7 = !c2068a.m3305d(i7);
            while (i7 < i9) {
                if (c2068a.m3305d(i7) != z7) {
                    iArr[i8] = iArr[i8] + 1;
                } else {
                    i8++;
                    if (i8 == length) {
                        break;
                    }
                    iArr[i8] = 1;
                    z7 = !z7;
                }
                i7++;
            }
            if (i8 != length) {
                if (i8 != length - 1 || i7 != i9) {
                    throw C0400j.m878a();
                }
                return;
            }
            return;
        }
        throw C0400j.m878a();
    }

    /* renamed from: f */
    public static void m4658f(int i7, C2068a c2068a, int[] iArr) {
        int length = iArr.length;
        boolean m3305d = c2068a.m3305d(i7);
        while (i7 > 0 && length >= 0) {
            i7--;
            if (c2068a.m3305d(i7) != m3305d) {
                length--;
                m3305d = !m3305d;
            }
        }
        if (length < 0) {
            m4657e(i7 + 1, c2068a, iArr);
            return;
        }
        throw C0400j.m878a();
    }

    @Override // p022c4.InterfaceC0402l
    /* renamed from: a */
    public C0404n mo875a(C0392b c0392b, Map map) {
        try {
            return m4659c(c0392b, map);
        } catch (C0400j e7) {
            if (map != null && map.containsKey(EnumC0394d.TRY_HARDER) && c0392b.f1333a.f12281a.mo871e()) {
                AbstractC0398h mo872f = c0392b.f1333a.f12281a.mo872f();
                C0404n m4659c = m4659c(new C0392b(new C2074g(mo872f)), map);
                Map map2 = m4659c.f1375e;
                EnumC0405o enumC0405o = EnumC0405o.f1376e;
                int i7 = 270;
                if (map2 != null && map2.containsKey(enumC0405o)) {
                    i7 = (((Integer) map2.get(enumC0405o)).intValue() + 270) % 360;
                }
                m4659c.m880b(enumC0405o, Integer.valueOf(i7));
                C0406p[] c0406pArr = m4659c.f1373c;
                if (c0406pArr != null) {
                    int i8 = mo872f.f1361c;
                    for (int i9 = 0; i9 < c0406pArr.length; i9++) {
                        C0406p c0406p = c0406pArr[i9];
                        c0406pArr[i9] = new C0406p((i8 - c0406p.f1391b) - 1.0f, c0406p.f1390a);
                    }
                }
                return m4659c;
            }
            throw e7;
        }
    }

    /* renamed from: b */
    public abstract C0404n mo4642b(int i7, C2068a c2068a, Map map);

    /* renamed from: c */
    public final C0404n m4659c(C0392b c0392b, Map map) {
        boolean z7;
        int i7;
        int i8;
        Map map2;
        int i9;
        C0392b c0392b2 = c0392b;
        Map map3 = map;
        AbstractC0398h abstractC0398h = c0392b2.f1333a.f12281a;
        int i10 = abstractC0398h.f1360b;
        int i11 = abstractC0398h.f1361c;
        C2068a c2068a = new C2068a(i10);
        int i12 = 1;
        if (map3 != null && map3.containsKey(EnumC0394d.TRY_HARDER)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i7 = 8;
        } else {
            i7 = 5;
        }
        int max = Math.max(1, i11 >> i7);
        if (z7) {
            i8 = i11;
        } else {
            i8 = 15;
        }
        int i13 = i11 / 2;
        int i14 = 0;
        while (i14 < i8) {
            int i15 = i14 + 1;
            int i16 = i15 / 2;
            if ((i14 & 1) != 0) {
                i16 = -i16;
            }
            int i17 = (i16 * max) + i13;
            if (i17 < 0 || i17 >= i11) {
                break;
            }
            try {
                c2068a = c0392b2.m866b(c2068a, i17);
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == i12) {
                        c2068a.m3310i();
                        if (map3 != null) {
                            EnumC0394d enumC0394d = EnumC0394d.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(enumC0394d)) {
                                EnumMap enumMap = new EnumMap(EnumC0394d.class);
                                enumMap.putAll(map3);
                                enumMap.remove(enumC0394d);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        C0404n mo4642b = mo4642b(i17, c2068a, map3);
                        if (i18 == i12) {
                            try {
                                mo4642b.m880b(EnumC0405o.f1376e, 180);
                                C0406p[] c0406pArr = mo4642b.f1373c;
                                if (c0406pArr != null) {
                                    i9 = i12;
                                    float f7 = i10;
                                    try {
                                        C0406p c0406p = c0406pArr[0];
                                        map2 = map3;
                                        try {
                                            c0406pArr[0] = new C0406p((f7 - c0406p.f1390a) - 1.0f, c0406p.f1391b);
                                            C0406p c0406p2 = c0406pArr[i9];
                                            c0406pArr[i9] = new C0406p((f7 - c0406p2.f1390a) - 1.0f, c0406p2.f1391b);
                                        } catch (AbstractC0403m unused) {
                                            continue;
                                            i18++;
                                            map3 = map2;
                                            i12 = i9;
                                        }
                                    } catch (AbstractC0403m unused2) {
                                        map2 = map3;
                                    }
                                }
                            } catch (AbstractC0403m unused3) {
                                map2 = map3;
                                i9 = i12;
                            }
                        }
                        return mo4642b;
                    } catch (AbstractC0403m unused4) {
                        map2 = map3;
                        i9 = i12;
                    }
                }
            } catch (C0400j unused5) {
            }
            c0392b2 = c0392b;
            i14 = i15;
            i12 = i12;
        }
        throw C0400j.m878a();
    }

    @Override // p022c4.InterfaceC0402l
    public void reset() {
    }
}
