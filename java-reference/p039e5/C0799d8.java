package p039e5;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d8 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0799d8 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f3335e;

    /* renamed from: f */
    public final /* synthetic */ boolean f3336f;

    /* renamed from: g */
    public final /* synthetic */ int f3337g;

    /* renamed from: h */
    public final /* synthetic */ Object f3338h;

    /* renamed from: i */
    public final /* synthetic */ Object f3339i;

    public /* synthetic */ C0799d8(Object obj, Object obj2, boolean z7, int i7, int i8) {
        this.f3335e = i8;
        this.f3338h = obj;
        this.f3339i = obj2;
        this.f3336f = z7;
        this.f3337g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f3335e) {
            case 0:
                ((Integer) obj2).intValue();
                int m3957F = AbstractC2418w.m3957F(this.f3337g | 1);
                AbstractC1328u8.m2357b(this.f3336f, (InterfaceC3277a) this.f3338h, (InterfaceC3277a) this.f3339i, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int m3957F2 = AbstractC2418w.m3957F(this.f3337g | 1);
                AbstractC1092mk.m1823m1((List) this.f3338h, this.f3336f, (EnumC1436xn) this.f3339i, (C2395p) obj, m3957F2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int m3957F3 = AbstractC2418w.m3957F(this.f3337g | 1);
                AbstractC1092mk.m1793g1((C0915gt) this.f3338h, (Map) this.f3339i, this.f3336f, (C2395p) obj, m3957F3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int m3957F4 = AbstractC2418w.m3957F(this.f3337g | 1);
                AbstractC1092mk.m1689K((C0976ir) this.f3338h, this.f3336f, (EnumC1436xn) this.f3339i, (C2395p) obj, m3957F4);
                break;
            default:
                ((Integer) obj2).intValue();
                int m3957F5 = AbstractC2418w.m3957F(this.f3337g | 1);
                AbstractC0945hr.m1594t((Set) this.f3338h, (InterfaceC3281e) this.f3339i, this.f3336f, (C2395p) obj, m3957F5);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0799d8(Object obj, boolean z7, EnumC1436xn enumC1436xn, int i7, int i8) {
        this.f3335e = i8;
        this.f3338h = obj;
        this.f3336f = z7;
        this.f3339i = enumC1436xn;
        this.f3337g = i7;
    }

    public /* synthetic */ C0799d8(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, int i7) {
        this.f3335e = 0;
        this.f3336f = z7;
        this.f3338h = interfaceC3277a;
        this.f3339i = interfaceC3277a2;
        this.f3337g = i7;
    }
}
