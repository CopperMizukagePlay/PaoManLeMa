package p063i0;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0477j;
import p028d2.C0490w;
import p053g5.C1694m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.d0 */
/* loaded from: classes.dex */
public final class C1870d0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C1870d0 f11041g;

    /* renamed from: h */
    public static final C1870d0 f11042h;

    /* renamed from: i */
    public static final C1870d0 f11043i;

    /* renamed from: j */
    public static final C1870d0 f11044j;

    /* renamed from: k */
    public static final C1870d0 f11045k;

    /* renamed from: l */
    public static final C1870d0 f11046l;

    /* renamed from: m */
    public static final C1870d0 f11047m;

    /* renamed from: n */
    public static final C1870d0 f11048n;

    /* renamed from: f */
    public final /* synthetic */ int f11049f;

    static {
        int i7 = 1;
        f11041g = new C1870d0(i7, 0);
        f11042h = new C1870d0(i7, 1);
        f11043i = new C1870d0(i7, 2);
        f11044j = new C1870d0(i7, 3);
        f11045k = new C1870d0(i7, 4);
        f11046l = new C1870d0(i7, 5);
        f11047m = new C1870d0(i7, 6);
        f11048n = new C1870d0(i7, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1870d0(int i7, int i8) {
        super(i7);
        this.f11049f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f11049f;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                AbstractC0489v.m1065c((C0477j) obj, 0);
                return c1694m;
            case 1:
                AbstractC0489v.m1065c((C0477j) obj, 0);
                return c1694m;
            case 2:
                return c1694m;
            case 3:
                AbstractC0489v.m1065c((C0477j) obj, 4);
                return c1694m;
            case 4:
                return Boolean.TRUE;
            case AbstractC3122c.f15761f /* 5 */:
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                return c1694m;
            case 7:
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1751l;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[5];
                c0490w.m1066a((C0477j) obj, Boolean.TRUE);
                return c1694m;
            default:
                return new C1956n1((EnumC1964o1) obj);
        }
    }
}
