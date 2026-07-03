package p001a0;

import java.util.List;
import p034e0.C0616l0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p053g5.C1694m;
import p087l2.C2440e;
import p087l2.InterfaceC2453q;
import p122q.EnumC2931o0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.h */
/* loaded from: classes.dex */
public final class C0029h extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C0029h f134g;

    /* renamed from: h */
    public static final C0029h f135h;

    /* renamed from: i */
    public static final C0029h f136i;

    /* renamed from: j */
    public static final C0029h f137j;

    /* renamed from: k */
    public static final C0029h f138k;

    /* renamed from: l */
    public static final C0029h f139l;

    /* renamed from: m */
    public static final C0029h f140m;

    /* renamed from: n */
    public static final C0029h f141n;

    /* renamed from: o */
    public static final C0029h f142o;

    /* renamed from: p */
    public static final C0029h f143p;

    /* renamed from: q */
    public static final C0029h f144q;

    /* renamed from: f */
    public final /* synthetic */ int f145f;

    static {
        int i7 = 1;
        f134g = new C0029h(i7, 0);
        f135h = new C0029h(i7, 1);
        f136i = new C0029h(i7, 2);
        f137j = new C0029h(i7, 3);
        f138k = new C0029h(i7, 4);
        f139l = new C0029h(i7, 5);
        f140m = new C0029h(i7, 6);
        f141n = new C0029h(i7, 7);
        f142o = new C0029h(i7, 8);
        f143p = new C0029h(i7, 9);
        f144q = new C0029h(i7, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029h(int i7, int i8) {
        super(i7);
        this.f145f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        Integer num;
        EnumC2931o0 enumC2931o0;
        int i7 = this.f145f;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                return c1694m;
            case 1:
                return c1694m;
            case 2:
                return c1694m;
            case 3:
                return c1694m;
            case 4:
                C0616l0 c0616l0 = (C0616l0) obj;
                long j6 = c0616l0.f2028f;
                int i8 = C1602n0.f10303c;
                return new C2440e(((int) (j6 & 4294967295L)) - AbstractC0027g1.m70p(c0616l0.f2029g.f10239f, (int) (j6 & 4294967295L)), 0);
            case AbstractC3122c.f15761f /* 5 */:
                C0616l0 c0616l02 = (C0616l0) obj;
                String str = c0616l02.f2029g.f10239f;
                long j7 = c0616l02.f2028f;
                int i9 = C1602n0.f10303c;
                int m67m = AbstractC0027g1.m67m(str, (int) (j7 & 4294967295L));
                if (m67m == -1) {
                    return null;
                }
                return new C2440e(0, m67m - ((int) (4294967295L & c0616l02.f2028f)));
            case AbstractC3122c.f15759d /* 6 */:
                C0616l0 c0616l03 = (C0616l0) obj;
                Integer m1256d = c0616l03.m1256d();
                if (m1256d == null) {
                    return null;
                }
                int intValue = m1256d.intValue();
                long j8 = c0616l03.f2028f;
                int i10 = C1602n0.f10303c;
                return new C2440e(((int) (4294967295L & j8)) - intValue, 0);
            case 7:
                C0616l0 c0616l04 = (C0616l0) obj;
                Integer m1255c = c0616l04.m1255c();
                if (m1255c == null) {
                    return null;
                }
                int intValue2 = m1255c.intValue();
                long j9 = c0616l04.f2028f;
                int i11 = C1602n0.f10303c;
                return new C2440e(0, intValue2 - ((int) (4294967295L & j9)));
            case 8:
                C0616l0 c0616l05 = (C0616l0) obj;
                InterfaceC2453q interfaceC2453q = c0616l05.f2026d;
                C1598l0 c1598l0 = c0616l05.f2025c;
                if (c1598l0 != null) {
                    num = Integer.valueOf(interfaceC2453q.mo167a(c1598l0.m2581h(c1598l0.m2578e(interfaceC2453q.mo168b(C1602n0.m2589e(c0616l05.f2028f))))));
                } else {
                    num = null;
                }
                if (num == null) {
                    return null;
                }
                int intValue3 = num.intValue();
                long j10 = c0616l05.f2028f;
                int i12 = C1602n0.f10303c;
                return new C2440e(((int) (4294967295L & j10)) - intValue3, 0);
            case AbstractC3122c.f15758c /* 9 */:
                C0616l0 c0616l06 = (C0616l0) obj;
                Integer m1254b = c0616l06.m1254b();
                if (m1254b == null) {
                    return null;
                }
                int intValue4 = m1254b.intValue();
                long j11 = c0616l06.f2028f;
                int i13 = C1602n0.f10303c;
                return new C2440e(0, intValue4 - ((int) (4294967295L & j11)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj2).booleanValue()) {
                    enumC2931o0 = EnumC2931o0.f15240e;
                } else {
                    enumC2931o0 = EnumC2931o0.f15241f;
                }
                Object obj3 = list.get(0);
                AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C0048l2(enumC2931o0, ((Float) obj3).floatValue());
        }
    }
}
