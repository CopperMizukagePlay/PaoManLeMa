package p039e5;

import p046f5.AbstractC1540e;
import p053g5.C1694m;
import p085l0.AbstractC2399q;
import p085l0.AbstractC2418w;
import p085l0.C2350d2;
import p085l0.C2383m;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2420w1;
import p085l0.InterfaceC2367i;
import p144t.AbstractC3122c;
import p145t0.C3179j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1019k9 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5249e;

    /* renamed from: f */
    public final /* synthetic */ Object f5250f;

    /* renamed from: g */
    public final /* synthetic */ Object f5251g;

    public /* synthetic */ C1019k9(int i7, int i8, Object obj, Object obj2) {
        this.f5249e = i8;
        this.f5251g = obj;
        this.f5250f = obj2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f5249e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2248a((C1196q0) this.f5251g, (InterfaceC3277a) this.f5250f, (C2395p) obj, AbstractC2418w.m3957F(9));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1302td.m2343j((InterfaceC3279c) this.f5251g, (InterfaceC3277a) this.f5250f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2274n((InterfaceC3277a) this.f5250f, (InterfaceC3277a) this.f5251g, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1846r((C1101mt) this.f5251g, (InterfaceC3810r) this.f5250f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1828n1((C0948hu) this.f5251g, (EnumC1436xn) this.f5250f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case AbstractC3122c.f15761f /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0945hr.m1567K((AbstractC1540e) this.f5251g, (InterfaceC3810r) this.f5250f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            default:
                C3179j c3179j = (C3179j) this.f5251g;
                C2350d2 c2350d2 = (C2350d2) this.f5250f;
                int intValue = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC2367i) {
                    c3179j.f15897f.m4300b((InterfaceC2367i) obj2);
                } else if (obj2 instanceof C2420w1) {
                    C2420w1 c2420w1 = (C2420w1) obj2;
                    if (!(c2420w1.f13625a instanceof C2383m)) {
                        AbstractC2399q.m3903f(c2350d2, intValue, obj2);
                        c3179j.m4878d(c2420w1);
                    }
                } else if (obj2 instanceof C2405r1) {
                    AbstractC2399q.m3903f(c2350d2, intValue, obj2);
                    ((C2405r1) obj2).m3908d();
                }
                return C1694m.f10482a;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1019k9(C3179j c3179j, C2350d2 c2350d2) {
        this.f5249e = 6;
        this.f5251g = c3179j;
        this.f5250f = c2350d2;
    }

    public /* synthetic */ C1019k9(InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, int i7) {
        this.f5249e = 2;
        this.f5250f = interfaceC3277a;
        this.f5251g = interfaceC3277a2;
    }
}
