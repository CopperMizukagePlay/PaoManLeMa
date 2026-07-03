package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1106n3 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6159e = 3;

    /* renamed from: f */
    public final /* synthetic */ boolean f6160f;

    /* renamed from: g */
    public final /* synthetic */ boolean f6161g;

    /* renamed from: h */
    public final /* synthetic */ Object f6162h;

    /* renamed from: i */
    public final /* synthetic */ Object f6163i;

    public /* synthetic */ C1106n3(EnumC1003jo enumC1003jo, InterfaceC3279c interfaceC3279c, boolean z7, boolean z8, int i7) {
        this.f6163i = enumC1003jo;
        this.f6162h = interfaceC3279c;
        this.f6160f = z7;
        this.f6161g = z8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f6159e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2056d(this.f6160f, (InterfaceC3279c) this.f6162h, this.f6161g, (InterfaceC3810r) this.f6163i, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(3073);
                AbstractC1249rm.m2268k(this.f6160f, this.f6161g, (InterfaceC3277a) this.f6162h, (InterfaceC3277a) this.f6163i, (C2395p) obj, m3957F2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int m3957F3 = AbstractC2418w.m3957F(1);
                AbstractC1092mk.m1791g((List) this.f6162h, this.f6160f, this.f6161g, (EnumC1436xn) this.f6163i, (C2395p) obj, m3957F3);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F4 = AbstractC2418w.m3957F(3073);
                AbstractC0945hr.m1592r((EnumC1003jo) this.f6163i, (InterfaceC3279c) this.f6162h, this.f6160f, this.f6161g, (C2395p) obj, m3957F4);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1106n3(List list, boolean z7, boolean z8, EnumC1436xn enumC1436xn, int i7) {
        this.f6162h = list;
        this.f6160f = z7;
        this.f6161g = z8;
        this.f6163i = enumC1436xn;
    }

    public /* synthetic */ C1106n3(boolean z7, InterfaceC3279c interfaceC3279c, boolean z8, InterfaceC3810r interfaceC3810r, int i7) {
        this.f6160f = z7;
        this.f6162h = interfaceC3279c;
        this.f6161g = z8;
        this.f6163i = interfaceC3810r;
    }

    public /* synthetic */ C1106n3(boolean z7, boolean z8, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, int i7) {
        this.f6160f = z7;
        this.f6161g = z8;
        this.f6162h = interfaceC3277a;
        this.f6163i = interfaceC3277a2;
    }
}
