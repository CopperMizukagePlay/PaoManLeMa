package p039e5;

import java.util.ArrayList;
import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.m9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1081m9 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5872e;

    /* renamed from: f */
    public final /* synthetic */ Object f5873f;

    /* renamed from: g */
    public final /* synthetic */ Object f5874g;

    /* renamed from: h */
    public final /* synthetic */ Object f5875h;

    public /* synthetic */ C1081m9(Object obj, Object obj2, Object obj3, int i7, int i8) {
        this.f5872e = i8;
        this.f5873f = obj;
        this.f5874g = obj2;
        this.f5875h = obj3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f5872e;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f5875h;
        Object obj4 = this.f5874g;
        Object obj5 = this.f5873f;
        switch (i7) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2254d((C0800d9) obj5, (List) obj4, (C1196q0) obj3, (C2395p) obj, AbstractC2418w.m3957F(521));
                return c1694m;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2294x((String) obj5, (InterfaceC3277a) obj4, (InterfaceC3279c) obj3, (C2395p) obj, AbstractC2418w.m3957F(49));
                return c1694m;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2292w((C0800d9) obj5, (InterfaceC3277a) obj4, (InterfaceC3279c) obj3, (C2395p) obj, AbstractC2418w.m3957F(57));
                return c1694m;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2211C((EnumC0964ie) obj5, (InterfaceC3279c) obj4, (InterfaceC3277a) obj3, (C2395p) obj, AbstractC2418w.m3957F(3073));
                return c1694m;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1818l1((InterfaceC3277a) obj5, (InterfaceC3277a) obj4, (InterfaceC3277a) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1836p((InterfaceC3810r) obj5, (List) obj4, (InterfaceC3277a) obj3, (C2395p) obj, AbstractC2418w.m3957F(55));
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1806j((C0976ir) obj5, (EnumC1436xn) obj4, (InterfaceC3810r) obj3, (C2395p) obj, AbstractC2418w.m3957F(393));
                return c1694m;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1871w((ArrayList) obj5, (List) obj4, (InterfaceC3279c) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
            default:
                int intValue = ((Integer) obj).intValue();
                C1006jr c1006jr = (C1006jr) obj2;
                AbstractC3367j.m5100e(c1006jr, "endpoint");
                float f7 = AbstractC1092mk.f5952h;
                ((C2349d1) obj4).m3742h(intValue);
                ((InterfaceC2425y0) obj3).setValue(Boolean.TRUE);
                ((InterfaceC3279c) obj5).mo23f(AbstractC1092mk.m1698L3(c1006jr));
                return c1694m;
        }
    }

    public /* synthetic */ C1081m9(InterfaceC3279c interfaceC3279c, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0) {
        this.f5872e = 8;
        this.f5873f = interfaceC3279c;
        this.f5874g = c2349d1;
        this.f5875h = interfaceC2425y0;
    }
}
