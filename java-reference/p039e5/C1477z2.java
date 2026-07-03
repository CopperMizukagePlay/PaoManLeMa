package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1477z2 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f9815e;

    /* renamed from: f */
    public final /* synthetic */ Object f9816f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9817g;

    /* renamed from: h */
    public final /* synthetic */ Object f9818h;

    /* renamed from: i */
    public final /* synthetic */ Object f9819i;

    public /* synthetic */ C1477z2(int i7, String str, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7) {
        this.f9815e = 5;
        this.f9818h = str;
        this.f9817g = z7;
        this.f9816f = interfaceC3810r;
        this.f9819i = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f9815e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2061h((List) this.f9816f, (String) this.f9818h, (InterfaceC3279c) this.f9819i, this.f9817g, C3807o.f17991a, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2029F((List) this.f9816f, this.f9817g, (EnumC1063lm) this.f9818h, (InterfaceC3810r) this.f9819i, (C2395p) obj, m3957F2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int m3957F3 = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2028E((EnumC1125nm) this.f9816f, (InterfaceC3279c) this.f9819i, (InterfaceC3810r) this.f9818h, this.f9817g, (C2395p) obj, m3957F3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int m3957F4 = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2039P((EnumC1163ot) this.f9816f, (InterfaceC3279c) this.f9819i, (InterfaceC3810r) this.f9818h, this.f9817g, (C2395p) obj, m3957F4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int m3957F5 = AbstractC2418w.m3957F(7);
                AbstractC1249rm.m2252c((String) this.f9818h, (String) this.f9816f, this.f9817g, (InterfaceC3277a) this.f9819i, (C2395p) obj, m3957F5);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F6 = AbstractC2418w.m3957F(1);
                AbstractC1249rm.m2250b((String) this.f9818h, this.f9817g, (InterfaceC3810r) this.f9816f, (InterfaceC3277a) this.f9819i, (C2395p) obj, m3957F6);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1477z2(Enum r12, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, boolean z7, int i7, int i8) {
        this.f9815e = i8;
        this.f9816f = r12;
        this.f9819i = interfaceC3279c;
        this.f9818h = interfaceC3810r;
        this.f9817g = z7;
    }

    public /* synthetic */ C1477z2(String str, String str2, boolean z7, InterfaceC3277a interfaceC3277a, int i7) {
        this.f9815e = 4;
        this.f9818h = str;
        this.f9816f = str2;
        this.f9817g = z7;
        this.f9819i = interfaceC3277a;
    }

    public /* synthetic */ C1477z2(List list, String str, InterfaceC3279c interfaceC3279c, boolean z7, int i7) {
        this.f9815e = 0;
        this.f9816f = list;
        this.f9818h = str;
        this.f9819i = interfaceC3279c;
        this.f9817g = z7;
    }

    public /* synthetic */ C1477z2(List list, boolean z7, EnumC1063lm enumC1063lm, InterfaceC3810r interfaceC3810r, int i7) {
        this.f9815e = 1;
        this.f9816f = list;
        this.f9817g = z7;
        this.f9818h = enumC1063lm;
        this.f9819i = interfaceC3810r;
    }
}
