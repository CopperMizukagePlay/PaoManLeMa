package p039e5;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pf */
/* loaded from: classes.dex */
public final /* synthetic */ class C1180pf implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6866e = 0;

    /* renamed from: f */
    public final /* synthetic */ String f6867f;

    /* renamed from: g */
    public final /* synthetic */ double f6868g;

    /* renamed from: h */
    public final /* synthetic */ Object f6869h;

    public /* synthetic */ C1180pf(String str, double d7, InterfaceC3810r interfaceC3810r, int i7) {
        this.f6867f = str;
        this.f6868g = d7;
        this.f6869h = interfaceC3810r;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f6866e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(7);
                AbstractC1092mk.m1826n(this.f6867f, this.f6868g, (InterfaceC3810r) this.f6869h, (C2395p) obj, m3957F);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(55);
                AbstractC1249rm.m2288u(this.f6867f, (String) this.f6869h, this.f6868g, (C2395p) obj, m3957F2);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1180pf(String str, String str2, double d7, int i7) {
        this.f6867f = str;
        this.f6869h = str2;
        this.f6868g = d7;
    }
}
