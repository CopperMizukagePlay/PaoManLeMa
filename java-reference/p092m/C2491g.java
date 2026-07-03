package p092m;

import p035e1.C0677s;
import p042f1.C1517d;
import p067i4.AbstractC2072e;
import p100n.C2671p;
import p140s2.C3102l;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.g */
/* loaded from: classes.dex */
public final class C2491g extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C2491g f13799g;

    /* renamed from: h */
    public static final C2491g f13800h;

    /* renamed from: i */
    public static final C2491g f13801i;

    /* renamed from: j */
    public static final C2491g f13802j;

    /* renamed from: k */
    public static final C2491g f13803k;

    /* renamed from: f */
    public final /* synthetic */ int f13804f;

    static {
        int i7 = 1;
        f13799g = new C2491g(i7, 0);
        f13800h = new C2491g(i7, 1);
        f13801i = new C2491g(i7, 2);
        f13802j = new C2491g(i7, 3);
        f13803k = new C2491g(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2491g(int i7, int i8) {
        super(i7);
        this.f13804f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f13804f) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                long m1452a = C0677s.m1452a(((C0677s) obj).f2211a, C1517d.f10038x);
                return new C2671p(C0677s.m1455d(m1452a), C0677s.m1459h(m1452a), C0677s.m1458g(m1452a), C0677s.m1456e(m1452a));
            case 2:
                ((Number) obj).intValue();
                return 0;
            case 3:
                ((Number) obj).intValue();
                return 0;
            case 4:
                return AbstractC2501q.f13826b;
            case AbstractC3122c.f15761f /* 5 */:
                return new C3102l(AbstractC2072e.m3326b((int) (((C3102l) obj).f15702a >> 32), 0));
            default:
                return new C3102l(AbstractC2072e.m3326b((int) (((C3102l) obj).f15702a >> 32), 0));
        }
    }
}
