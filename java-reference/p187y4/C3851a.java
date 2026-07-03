package p187y4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.C0068q2;
import p004a5.C0105a;
import p004a5.C0107c;
import p004a5.C0109e;
import p022c4.C0392b;
import p022c4.C0396f;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p022c4.InterfaceC0402l;
import p022c4.InterfaceC0407q;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p067i4.C2069b;
import p067i4.C2071d;
import p067i4.C2075h;
import p097m4.C2579c;
import p194z4.C3874e;
import p194z4.C3875f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C3851a implements InterfaceC0402l {

    /* renamed from: b */
    public static final C0406p[] f18085b = new C0406p[0];

    /* renamed from: a */
    public final C2579c f18086a = new C2579c(2);

    /* JADX WARN: Removed duplicated region for block: B:207:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0337 A[SYNTHETIC] */
    @Override // p022c4.InterfaceC0402l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0404n mo875a(C0392b c0392b, Map map) {
        InterfaceC0407q interfaceC0407q;
        boolean z7;
        int i7;
        ArrayList arrayList;
        C0107c c0107c;
        C0107c c0107c2;
        C0107c c0107c3;
        float f7;
        float f8;
        C0105a c0105a;
        float f9;
        float f10;
        float f11;
        int i8;
        C0406p[] c0406pArr;
        C2071d m4112d;
        C0406p[] c0406pArr2;
        double d7;
        double abs;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 3;
        C2579c c2579c = this.f18086a;
        int i14 = 1;
        int i15 = 0;
        if (map != null && map.containsKey(EnumC0394d.PURE_BARCODE)) {
            C2069b m865a = c0392b.m865a();
            int[] m3316e = m865a.m3316e();
            int[] m3314c = m865a.m3314c();
            if (m3316e != null && m3314c != null) {
                int i16 = m865a.f12259f;
                int i17 = m865a.f12258e;
                int i18 = m3316e[0];
                int i19 = m3316e[1];
                boolean z8 = true;
                int i20 = 0;
                while (i18 < i17 && i19 < i16) {
                    if (z8 != m865a.m3313b(i18, i19)) {
                        int i21 = i20 + 1;
                        if (i21 == 5) {
                            break;
                        }
                        z8 = !z8;
                        i20 = i21;
                    }
                    i18++;
                    i19++;
                }
                if (i18 != i17 && i19 != i16) {
                    int i22 = m3316e[0];
                    float f12 = (i18 - i22) / 7.0f;
                    int i23 = m3316e[1];
                    int i24 = m3314c[1];
                    int i25 = m3314c[0];
                    if (i22 < i25 && i23 < i24) {
                        int i26 = i24 - i23;
                        if (i26 != i25 - i22 && (i25 = i22 + i26) >= m865a.f12258e) {
                            throw C0400j.m878a();
                        }
                        int round = Math.round(((i25 - i22) + 1) / f12);
                        int round2 = Math.round((i26 + 1) / f12);
                        if (round > 0 && round2 > 0) {
                            if (round2 == round) {
                                int i27 = (int) (f12 / 2.0f);
                                int i28 = i23 + i27;
                                int i29 = i22 + i27;
                                int i30 = (((int) ((round - 1) * f12)) + i29) - i25;
                                if (i30 > 0) {
                                    if (i30 <= i27) {
                                        i29 -= i30;
                                    } else {
                                        throw C0400j.m878a();
                                    }
                                }
                                int i31 = (((int) ((round2 - 1) * f12)) + i28) - i24;
                                if (i31 > 0) {
                                    if (i31 <= i27) {
                                        i28 -= i31;
                                    } else {
                                        throw C0400j.m878a();
                                    }
                                }
                                C2069b c2069b = new C2069b(round, round2);
                                for (int i32 = 0; i32 < round2; i32++) {
                                    int i33 = ((int) (i32 * f12)) + i28;
                                    for (int i34 = 0; i34 < round; i34++) {
                                        if (m865a.m3313b(((int) (i34 * f12)) + i29, i33)) {
                                            c2069b.m3319h(i34, i32);
                                        }
                                    }
                                }
                                m4112d = c2579c.m4112d(c2069b, map);
                                c0406pArr2 = f18085b;
                                i8 = 3;
                            } else {
                                throw C0400j.m878a();
                            }
                        } else {
                            throw C0400j.m878a();
                        }
                    } else {
                        throw C0400j.m878a();
                    }
                } else {
                    throw C0400j.m878a();
                }
            } else {
                throw C0400j.m878a();
            }
        } else {
            C2069b m865a2 = c0392b.m865a();
            C0068q2 c0068q2 = new C0068q2(m865a2, 1);
            if (map == null) {
                interfaceC0407q = null;
            } else {
                interfaceC0407q = (InterfaceC0407q) map.get(EnumC0394d.NEED_RESULT_POINT_CALLBACK);
            }
            c0068q2.f345g = interfaceC0407q;
            C0109e c0109e = new C0109e(m865a2, interfaceC0407q);
            if (map != null && map.containsKey(EnumC0394d.TRY_HARDER)) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i35 = m865a2.f12259f;
            int i36 = m865a2.f12258e;
            int i37 = (i35 * 3) / 388;
            if (i37 < 3 || z7) {
                i37 = 3;
            }
            int[] iArr = new int[5];
            int i38 = i37 - 1;
            boolean z9 = false;
            while (true) {
                i7 = i13;
                arrayList = c0109e.f490b;
                if (i38 >= i35 || z9) {
                    break;
                }
                Arrays.fill(iArr, i15);
                int i39 = i37;
                int i40 = i15;
                while (i15 < i36) {
                    if (m865a2.m3313b(i15, i38)) {
                        if ((i40 & 1) == i14) {
                            i40++;
                        }
                        iArr[i40] = iArr[i40] + i14;
                    } else if ((i40 & 1) == 0) {
                        if (i40 == 4) {
                            if (C0109e.m210b(iArr)) {
                                if (c0109e.m212c(i38, i15, iArr)) {
                                    if (c0109e.f491c) {
                                        z9 = c0109e.m213d();
                                        i10 = 2;
                                    } else {
                                        if (arrayList.size() <= i14) {
                                            i9 = i15;
                                            i11 = 0;
                                            i10 = 2;
                                        } else {
                                            int size = arrayList.size();
                                            C0107c c0107c4 = null;
                                            int i41 = 0;
                                            while (true) {
                                                if (i41 < size) {
                                                    Object obj = arrayList.get(i41);
                                                    i41++;
                                                    C0107c c0107c5 = (C0107c) obj;
                                                    i9 = i15;
                                                    int i42 = size;
                                                    if (c0107c5.f487d >= 2) {
                                                        if (c0107c4 == null) {
                                                            c0107c4 = c0107c5;
                                                        } else {
                                                            c0109e.f491c = true;
                                                            i10 = 2;
                                                            i11 = ((int) (Math.abs(c0107c4.f1390a - c0107c5.f1390a) - Math.abs(c0107c4.f1391b - c0107c5.f1391b))) / 2;
                                                            break;
                                                        }
                                                    }
                                                    size = i42;
                                                    i15 = i9;
                                                } else {
                                                    i9 = i15;
                                                    i10 = 2;
                                                    i11 = 0;
                                                    break;
                                                }
                                            }
                                        }
                                        if (i11 > iArr[i10]) {
                                            i38 += (i11 - r7) - 2;
                                            i15 = i36 - 1;
                                        } else {
                                            i15 = i9;
                                        }
                                    }
                                    Arrays.fill(iArr, 0);
                                    i40 = 0;
                                    i39 = i10;
                                } else {
                                    iArr[0] = iArr[2];
                                    iArr[1] = iArr[i7];
                                    iArr[2] = iArr[4];
                                    iArr[i7] = 1;
                                    iArr[4] = 0;
                                }
                            } else {
                                int i43 = i14;
                                iArr[0] = iArr[2];
                                iArr[i43] = iArr[i7];
                                iArr[2] = iArr[4];
                                iArr[i7] = i43;
                                iArr[4] = 0;
                            }
                            i40 = i7;
                        } else {
                            int i44 = i40 + 1;
                            iArr[i44] = iArr[i44] + 1;
                            i40 = i44;
                        }
                    } else {
                        iArr[i40] = iArr[i40] + 1;
                    }
                    i15++;
                    i14 = 1;
                }
                if (C0109e.m210b(iArr) && c0109e.m212c(i38, i36, iArr)) {
                    int i45 = iArr[0];
                    if (c0109e.f491c) {
                        i37 = i45;
                        z9 = c0109e.m213d();
                    } else {
                        i37 = i45;
                    }
                } else {
                    i37 = i39;
                }
                i38 += i37;
                i13 = i7;
                i14 = 1;
                i15 = 0;
            }
            if (arrayList.size() >= i7) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C0107c) it.next()).f487d < 2) {
                        it.remove();
                    }
                }
                Collections.sort(arrayList, C0109e.f488f);
                C0107c[] c0107cArr = new C0107c[3];
                int i46 = 0;
                double d8 = Double.MAX_VALUE;
                for (int i47 = 2; i46 < arrayList.size() - i47; i47 = 2) {
                    C0107c c0107c6 = (C0107c) arrayList.get(i46);
                    float f13 = c0107c6.f486c;
                    i46++;
                    int i48 = i46;
                    while (i48 < arrayList.size() - 1) {
                        C0107c c0107c7 = (C0107c) arrayList.get(i48);
                        double m211e = C0109e.m211e(c0107c6, c0107c7);
                        i48++;
                        for (int i49 = i48; i49 < arrayList.size(); i49++) {
                            C0107c c0107c8 = (C0107c) arrayList.get(i49);
                            if (c0107c8.f486c <= 1.4f * f13) {
                                double m211e2 = C0109e.m211e(c0107c7, c0107c8);
                                double m211e3 = C0109e.m211e(c0107c6, c0107c8);
                                if (m211e < m211e2) {
                                    if (m211e2 > m211e3) {
                                        if (m211e >= m211e3) {
                                            d7 = m211e3;
                                            m211e3 = m211e;
                                            abs = Math.abs(m211e2 - (d7 * 2.0d)) + Math.abs(m211e2 - (m211e3 * 2.0d));
                                            if (abs >= d8) {
                                                c0107cArr[0] = c0107c6;
                                                c0107cArr[1] = c0107c7;
                                                c0107cArr[2] = c0107c8;
                                                d8 = abs;
                                            }
                                        }
                                    } else {
                                        m211e3 = m211e2;
                                        m211e2 = m211e3;
                                    }
                                    d7 = m211e;
                                    abs = Math.abs(m211e2 - (d7 * 2.0d)) + Math.abs(m211e2 - (m211e3 * 2.0d));
                                    if (abs >= d8) {
                                    }
                                } else {
                                    if (m211e2 < m211e3) {
                                        if (m211e < m211e3) {
                                            d7 = m211e2;
                                            m211e2 = m211e3;
                                            m211e3 = m211e;
                                            abs = Math.abs(m211e2 - (d7 * 2.0d)) + Math.abs(m211e2 - (m211e3 * 2.0d));
                                            if (abs >= d8) {
                                            }
                                        } else {
                                            d7 = m211e2;
                                        }
                                    } else {
                                        d7 = m211e3;
                                        m211e3 = m211e2;
                                    }
                                    m211e2 = m211e;
                                    abs = Math.abs(m211e2 - (d7 * 2.0d)) + Math.abs(m211e2 - (m211e3 * 2.0d));
                                    if (abs >= d8) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (d8 != Double.MAX_VALUE) {
                    float m881a = C0406p.m881a(c0107cArr[0], c0107cArr[1]);
                    float m881a2 = C0406p.m881a(c0107cArr[1], c0107cArr[2]);
                    float m881a3 = C0406p.m881a(c0107cArr[0], c0107cArr[2]);
                    if (m881a2 >= m881a && m881a2 >= m881a3) {
                        c0107c = c0107cArr[0];
                        c0107c2 = c0107cArr[1];
                        c0107c3 = c0107cArr[2];
                    } else if (m881a3 >= m881a2 && m881a3 >= m881a) {
                        c0107c = c0107cArr[1];
                        c0107c2 = c0107cArr[0];
                        c0107c3 = c0107cArr[2];
                    } else {
                        c0107c = c0107cArr[2];
                        c0107c2 = c0107cArr[0];
                        c0107c3 = c0107cArr[1];
                    }
                    float f14 = c0107c.f1390a;
                    float f15 = c0107c.f1391b;
                    if (((c0107c2.f1391b - f15) * (c0107c3.f1390a - f14)) - ((c0107c2.f1390a - f14) * (c0107c3.f1391b - f15)) < 0.0f) {
                        C0107c c0107c9 = c0107c3;
                        c0107c3 = c0107c2;
                        c0107c2 = c0107c9;
                    }
                    c0107cArr[0] = c0107c2;
                    c0107cArr[1] = c0107c;
                    c0107cArr[2] = c0107c3;
                    float m154t = c0068q2.m154t(c0107c, c0107c3);
                    float f16 = c0107c.f1390a;
                    float f17 = c0107c3.f1391b;
                    float f18 = c0107c3.f1390a;
                    float m154t2 = c0068q2.m154t(c0107c, c0107c2);
                    float f19 = c0107c2.f1391b;
                    float f20 = c0107c2.f1390a;
                    float f21 = (m154t2 + m154t) / 2.0f;
                    if (f21 >= 1.0f) {
                        int m3224E = (AbstractC2064e.m3224E(C0406p.m881a(c0107c, c0107c2) / f21) + AbstractC2064e.m3224E(C0406p.m881a(c0107c, c0107c3) / f21)) / 2;
                        int i50 = m3224E + 7;
                        int i51 = i50 & 3;
                        if (i51 != 0) {
                            if (i51 != 2) {
                                if (i51 == 3) {
                                    throw C0400j.m878a();
                                }
                            } else {
                                i50 = m3224E + 6;
                            }
                        } else {
                            i50 = m3224E + 8;
                        }
                        int i52 = i50;
                        int[] iArr2 = C3875f.f18155e;
                        if (i52 % 4 == 1) {
                            try {
                                C3875f m5898c = C3875f.m5898c((i52 - 17) / 4);
                                int i53 = (m5898c.f18157a * 4) + 10;
                                if (m5898c.f18158b.length > 0) {
                                    float f22 = 1.0f - (3.0f / i53);
                                    int i54 = (int) (((((f18 - f16) + f20) - f16) * f22) + f16);
                                    int i55 = (int) (((((f17 - f15) + f19) - f15) * f22) + f15);
                                    f7 = f15;
                                    f8 = f17;
                                    for (int i56 = 4; i56 <= 16; i56 <<= 1) {
                                        try {
                                            c0105a = c0068q2.m155v(f21, i54, i55, i56);
                                            break;
                                        } catch (C0400j unused) {
                                        }
                                    }
                                } else {
                                    f7 = f15;
                                    f8 = f17;
                                }
                                c0105a = null;
                                float f23 = i52 - 3.5f;
                                if (c0105a != null) {
                                    f9 = c0105a.f1390a;
                                    f10 = c0105a.f1391b;
                                    f11 = f23 - 3.0f;
                                } else {
                                    f9 = (f18 - f16) + f20;
                                    f10 = (f8 - f7) + f19;
                                    f11 = f23;
                                }
                                C2069b m3341s = AbstractC2072e.m3341s(m865a2, i52, i52, C2075h.m3352a(3.5f, 3.5f, f23, 3.5f, f11, f11, 3.5f, f23, c0107c.f1390a, c0107c.f1391b, c0107c3.f1390a, c0107c3.f1391b, f9, f10, c0107c2.f1390a, c0107c2.f1391b));
                                if (c0105a == null) {
                                    i8 = 3;
                                    c0406pArr = new C0406p[]{c0107c2, c0107c, c0107c3};
                                } else {
                                    i8 = 3;
                                    c0406pArr = new C0406p[]{c0107c2, c0107c, c0107c3, c0105a};
                                }
                                m4112d = c2579c.m4112d(m3341s, map);
                                c0406pArr2 = c0406pArr;
                            } catch (IllegalArgumentException unused2) {
                                throw C0396f.m868a();
                            }
                        } else {
                            throw C0396f.m868a();
                        }
                    } else {
                        throw C0400j.m878a();
                    }
                } else {
                    throw C0400j.m878a();
                }
            } else {
                throw C0400j.m878a();
            }
        }
        int i57 = m4112d.f12267a;
        if ((m4112d.f12276j instanceof C3874e) && c0406pArr2.length >= i8) {
            C0406p c0406p = c0406pArr2[0];
            c0406pArr2[0] = c0406pArr2[2];
            c0406pArr2[2] = c0406p;
        }
        C0404n c0404n = new C0404n((String) m4112d.f12271e, (byte[]) m4112d.f12270d, c0406pArr2, EnumC0391a.f1326p);
        List list = (List) m4112d.f12273g;
        if (list != null) {
            c0404n.m880b(EnumC0405o.f1377f, list);
        }
        String str = (String) m4112d.f12272f;
        if (str != null) {
            c0404n.m880b(EnumC0405o.f1378g, str);
        }
        if (i57 >= 0 && (i12 = m4112d.f12268b) >= 0) {
            c0404n.m880b(EnumC0405o.f1386o, Integer.valueOf(i12));
            c0404n.m880b(EnumC0405o.f1387p, Integer.valueOf(i57));
        }
        c0404n.m880b(EnumC0405o.f1379h, (Integer) m4112d.f12274h);
        c0404n.m880b(EnumC0405o.f1388q, "]Q" + m4112d.f12269c);
        return c0404n;
    }

    @Override // p022c4.InterfaceC0402l
    public final void reset() {
    }
}
