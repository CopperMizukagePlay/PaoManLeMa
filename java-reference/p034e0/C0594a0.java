package p034e0;

import p027d1.C0464b;
import p053g5.C1694m;
import p100n.C2665n;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.a0 */
/* loaded from: classes.dex */
public final class C0594a0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C0594a0 f1952g;

    /* renamed from: h */
    public static final C0594a0 f1953h;

    /* renamed from: i */
    public static final C0594a0 f1954i;

    /* renamed from: f */
    public final /* synthetic */ int f1955f;

    static {
        int i7 = 1;
        f1952g = new C0594a0(i7, 0);
        f1953h = new C0594a0(i7, 1);
        f1954i = new C0594a0(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594a0(int i7, int i8) {
        super(i7);
        this.f1955f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f1955f) {
            case 0:
                long j6 = ((C0464b) obj).f1623a;
                if (AbstractC3784a.m5815x(j6)) {
                    return new C2665n(C0464b.m1008d(j6), C0464b.m1009e(j6));
                }
                return AbstractC0602e0.f1983a;
            case 1:
                C2665n c2665n = (C2665n) obj;
                return new C0464b(AbstractC3784a.m5797a(c2665n.f14363a, c2665n.f14364b));
            default:
                return C1694m.f10482a;
        }
    }
}
