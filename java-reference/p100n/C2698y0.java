package p100n;

import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0467e;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p140s2.C3096f;
import p140s2.C3097g;
import p140s2.C3100j;
import p140s2.C3102l;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.y0 */
/* loaded from: classes.dex */
public final class C2698y0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C2698y0 f14476g;

    /* renamed from: h */
    public static final C2698y0 f14477h;

    /* renamed from: i */
    public static final C2698y0 f14478i;

    /* renamed from: j */
    public static final C2698y0 f14479j;

    /* renamed from: k */
    public static final C2698y0 f14480k;

    /* renamed from: l */
    public static final C2698y0 f14481l;

    /* renamed from: m */
    public static final C2698y0 f14482m;

    /* renamed from: n */
    public static final C2698y0 f14483n;

    /* renamed from: o */
    public static final C2698y0 f14484o;

    /* renamed from: p */
    public static final C2698y0 f14485p;

    /* renamed from: q */
    public static final C2698y0 f14486q;

    /* renamed from: r */
    public static final C2698y0 f14487r;

    /* renamed from: s */
    public static final C2698y0 f14488s;

    /* renamed from: t */
    public static final C2698y0 f14489t;

    /* renamed from: u */
    public static final C2698y0 f14490u;

    /* renamed from: v */
    public static final C2698y0 f14491v;

    /* renamed from: w */
    public static final C2698y0 f14492w;

    /* renamed from: x */
    public static final C2698y0 f14493x;

    /* renamed from: y */
    public static final C2698y0 f14494y;

    /* renamed from: z */
    public static final C2698y0 f14495z;

    /* renamed from: f */
    public final /* synthetic */ int f14496f;

    static {
        int i7 = 1;
        f14476g = new C2698y0(i7, 0);
        f14477h = new C2698y0(i7, 1);
        f14478i = new C2698y0(i7, 2);
        f14479j = new C2698y0(i7, 3);
        f14480k = new C2698y0(i7, 4);
        f14481l = new C2698y0(i7, 5);
        f14482m = new C2698y0(i7, 6);
        f14483n = new C2698y0(i7, 7);
        f14484o = new C2698y0(i7, 8);
        f14485p = new C2698y0(i7, 9);
        f14486q = new C2698y0(i7, 10);
        f14487r = new C2698y0(i7, 11);
        f14488s = new C2698y0(i7, 12);
        f14489t = new C2698y0(i7, 13);
        f14490u = new C2698y0(i7, 14);
        f14491v = new C2698y0(i7, 15);
        f14492w = new C2698y0(i7, 16);
        f14493x = new C2698y0(i7, 17);
        f14494y = new C2698y0(i7, 18);
        f14495z = new C2698y0(i7, 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2698y0(int i7, int i8) {
        super(i7);
        this.f14496f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f14496f) {
            case 0:
                return C1694m.f10482a;
            case 1:
                ((InterfaceC3277a) obj).mo52a();
                return C1694m.f10482a;
            case 2:
                long j6 = ((C3097g) obj).f15694a;
                return new C2665n(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
            case 3:
                C2665n c2665n = (C2665n) obj;
                float f7 = c2665n.f14363a;
                float f8 = c2665n.f14364b;
                return new C3097g((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
            case 4:
                return new C2662m(((C3096f) obj).f15693e);
            case AbstractC3122c.f15761f /* 5 */:
                return new C3096f(((C2662m) obj).f14358a);
            case AbstractC3122c.f15759d /* 6 */:
                return new C2662m(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((C2662m) obj).f14358a);
            case 8:
                long j7 = ((C3100j) obj).f15696a;
                return new C2665n((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case AbstractC3122c.f15758c /* 9 */:
                C2665n c2665n2 = (C2665n) obj;
                return new C3100j(AbstractC2064e.m3234d(Math.round(c2665n2.f14363a), Math.round(c2665n2.f14364b)));
            case AbstractC3122c.f15760e /* 10 */:
                long j8 = ((C3102l) obj).f15702a;
                return new C2665n((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 11:
                C2665n c2665n3 = (C2665n) obj;
                int round = Math.round(c2665n3.f14363a);
                int i7 = 0;
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c2665n3.f14364b);
                if (round2 >= 0) {
                    i7 = round2;
                }
                return new C3102l(AbstractC2072e.m3326b(round, i7));
            case 12:
                return new C2662m(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((C2662m) obj).f14358a);
            case 14:
                long j9 = ((C0464b) obj).f1623a;
                return new C2665n(C0464b.m1008d(j9), C0464b.m1009e(j9));
            case AbstractC3122c.f15762g /* 15 */:
                C2665n c2665n4 = (C2665n) obj;
                return new C0464b(AbstractC3784a.m5797a(c2665n4.f14363a, c2665n4.f14364b));
            case 16:
                C0465c c0465c = (C0465c) obj;
                return new C2671p(c0465c.f1625a, c0465c.f1626b, c0465c.f1627c, c0465c.f1628d);
            case 17:
                C2671p c2671p = (C2671p) obj;
                return new C0465c(c2671p.f14378a, c2671p.f14379b, c2671p.f14380c, c2671p.f14381d);
            case 18:
                long j10 = ((C0467e) obj).f1637a;
                return new C2665n(C0467e.m1026d(j10), C0467e.m1024b(j10));
            default:
                C2665n c2665n5 = (C2665n) obj;
                return new C0467e(AbstractC1793a0.m2975c(c2665n5.f14363a, c2665n5.f14364b));
        }
    }
}
