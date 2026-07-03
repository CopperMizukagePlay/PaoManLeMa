package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0953i3 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f4750e = 0;

    /* renamed from: f */
    public final /* synthetic */ boolean f4751f;

    /* renamed from: g */
    public final /* synthetic */ Object f4752g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f4753h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3277a f4754i;

    /* renamed from: j */
    public final /* synthetic */ Object f4755j;

    /* renamed from: k */
    public final /* synthetic */ Object f4756k;

    public /* synthetic */ C0953i3(List list, String str, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, boolean z7, InterfaceC3810r interfaceC3810r, int i7) {
        this.f4755j = list;
        this.f4752g = str;
        this.f4753h = interfaceC3279c;
        this.f4754i = interfaceC3277a;
        this.f4751f = z7;
        this.f4756k = interfaceC3810r;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f4750e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2054c((List) this.f4755j, (String) this.f4752g, this.f4753h, this.f4754i, this.f4751f, (InterfaceC3810r) this.f4756k, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(1);
                AbstractC1092mk.m1679I(this.f4751f, (EnumC1311tm) this.f4755j, (String) this.f4752g, this.f4753h, this.f4754i, (InterfaceC3277a) this.f4756k, (C2395p) obj, m3957F2);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F3 = AbstractC2418w.m3957F(1);
                AbstractC0945hr.m1593s((List) this.f4755j, (InterfaceC3282f) this.f4752g, this.f4754i, this.f4753h, (InterfaceC3279c) this.f4756k, this.f4751f, (C2395p) obj, m3957F3);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0953i3(List list, InterfaceC3282f interfaceC3282f, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, boolean z7, int i7) {
        this.f4755j = list;
        this.f4752g = interfaceC3282f;
        this.f4754i = interfaceC3277a;
        this.f4753h = interfaceC3279c;
        this.f4756k = interfaceC3279c2;
        this.f4751f = z7;
    }

    public /* synthetic */ C0953i3(boolean z7, EnumC1311tm enumC1311tm, String str, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, int i7) {
        this.f4751f = z7;
        this.f4755j = enumC1311tm;
        this.f4752g = str;
        this.f4753h = interfaceC3279c;
        this.f4754i = interfaceC3277a;
        this.f4756k = interfaceC3277a2;
    }
}
