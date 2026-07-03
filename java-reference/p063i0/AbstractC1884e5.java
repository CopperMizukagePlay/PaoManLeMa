package p063i0;

import p035e1.AbstractC0659i0;
import p035e1.InterfaceC0667m0;
import p085l0.AbstractC2397p1;
import p085l0.C2394o2;
import p085l0.C2395p;
import p100n.AbstractC2647h;
import p144t.AbstractC3122c;
import p190z.AbstractC3861e;
import p190z.C3858b;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e5 */
/* loaded from: classes.dex */
public abstract class AbstractC1884e5 {

    /* renamed from: a */
    public static final C2394o2 f11149a = new AbstractC2397p1(C2011u0.f11890o);

    /* renamed from: a */
    public static final InterfaceC0667m0 m3117a(int i7, C2395p c2395p) {
        C1875d5 c1875d5 = (C1875d5) c2395p.m3878k(f11149a);
        switch (AbstractC2647h.m4257c(i7)) {
            case 0:
                return c1875d5.f11075e;
            case 1:
                return m3118b(c1875d5.f11075e);
            case 2:
                return c1875d5.f11071a;
            case 3:
                return m3118b(c1875d5.f11071a);
            case 4:
                return AbstractC3861e.f18096a;
            case AbstractC3122c.f15761f /* 5 */:
                return c1875d5.f11074d;
            case AbstractC3122c.f15759d /* 6 */:
                C3860d c3860d = c1875d5.f11074d;
                float f7 = (float) 0.0d;
                return C3860d.m5872b(c3860d, new C3858b(f7), null, new C3858b(f7), 6);
            case 7:
                return m3118b(c1875d5.f11074d);
            case 8:
                return c1875d5.f11073c;
            case AbstractC3122c.f15758c /* 9 */:
                return AbstractC0659i0.f2147a;
            case AbstractC3122c.f15760e /* 10 */:
                return c1875d5.f11072b;
            default:
                throw new RuntimeException();
        }
    }

    /* renamed from: b */
    public static final C3860d m3118b(C3860d c3860d) {
        float f7 = (float) 0.0d;
        return C3860d.m5872b(c3860d, null, new C3858b(f7), new C3858b(f7), 3);
    }
}
