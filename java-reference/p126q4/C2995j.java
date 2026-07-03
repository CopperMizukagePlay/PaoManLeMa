package p126q4;

import java.util.ArrayList;
import java.util.EnumMap;
import p022c4.AbstractC0403m;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0405o;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.j */
/* loaded from: classes.dex */
public final class C2995j {

    /* renamed from: c */
    public static final int[] f15454c = {1, 1, 2};

    /* renamed from: a */
    public final Object f15455a;

    /* renamed from: b */
    public final Object f15456b;

    public C2995j(int i7) {
        switch (i7) {
            case 1:
                this.f15455a = new ArrayList();
                this.f15456b = new ArrayList();
                return;
            default:
                this.f15455a = new C2994i(1);
                this.f15456b = new C2994i(0);
                return;
        }
    }

    /* renamed from: a */
    public void m4661a(int[] iArr, String str) {
        ((ArrayList) this.f15455a).add(iArr);
        ((ArrayList) this.f15456b).add(str);
    }

    /* renamed from: b */
    public C0404n m4662b(int i7, int i8, C2068a c2068a) {
        EnumMap enumMap;
        int[] m4664l = AbstractC2996k.m4664l(c2068a, i8, false, f15454c, new int[3]);
        try {
            return ((C2994i) this.f15456b).m4660a(i7, c2068a, m4664l);
        } catch (AbstractC0403m unused) {
            C2994i c2994i = (C2994i) this.f15455a;
            StringBuilder sb = c2994i.f15453b;
            sb.setLength(0);
            int[] iArr = c2994i.f15452a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i9 = c2068a.f12257f;
            int i10 = m4664l[1];
            int i11 = 0;
            for (int i12 = 0; i12 < 2 && i10 < i9; i12++) {
                int m4663h = AbstractC2996k.m4663h(c2068a, iArr, i10, AbstractC2996k.f15460g);
                sb.append((char) ((m4663h % 10) + 48));
                for (int i13 : iArr) {
                    i10 += i13;
                }
                if (m4663h >= 10) {
                    i11 |= 1 << (1 - i12);
                }
                if (i12 != 1) {
                    i10 = c2068a.m3307f(c2068a.m3306e(i10));
                }
            }
            if (sb.length() == 2) {
                if (Integer.parseInt(sb.toString()) % 4 == i11) {
                    String sb2 = sb.toString();
                    if (sb2.length() != 2) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(EnumC0405o.class);
                        enumMap.put((EnumMap) EnumC0405o.f1381j, (EnumC0405o) Integer.valueOf(sb2));
                    }
                    float f7 = i7;
                    C0404n c0404n = new C0404n(sb2, null, new C0406p[]{new C0406p((m4664l[0] + m4664l[1]) / 2.0f, f7), new C0406p(i10, f7)}, EnumC0391a.f1331u);
                    if (enumMap != null) {
                        c0404n.m879a(enumMap);
                    }
                    return c0404n;
                }
                throw C0400j.m878a();
            }
            throw C0400j.m878a();
        }
    }
}
