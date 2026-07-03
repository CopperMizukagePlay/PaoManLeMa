package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2401q1;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.o3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1137o3 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6455e;

    /* renamed from: f */
    public final /* synthetic */ Object f6456f;

    /* renamed from: g */
    public final /* synthetic */ int f6457g;

    /* renamed from: h */
    public final /* synthetic */ Object f6458h;

    public /* synthetic */ C1137o3(int i7, int i8, Object obj, Object obj2) {
        this.f6455e = i8;
        this.f6456f = obj;
        this.f6458h = obj2;
        this.f6457g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f6455e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2066m((String) this.f6456f, (String) this.f6458h, (C2395p) obj, AbstractC2418w.m3957F(this.f6457g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1328u8.m2361f((String) this.f6456f, (C3173d) this.f6458h, (C2395p) obj, AbstractC2418w.m3957F(this.f6457g | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1249rm.m2286t((List) this.f6456f, this.f6457g, (InterfaceC3279c) this.f6458h, (C2395p) obj, m3957F);
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC2418w.m3959a((C2401q1) this.f6456f, (InterfaceC3281e) this.f6458h, (C2395p) obj, AbstractC2418w.m3957F(this.f6457g | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC2418w.m3960b((C2401q1[]) this.f6456f, (InterfaceC3281e) this.f6458h, (C2395p) obj, AbstractC2418w.m3957F(this.f6457g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int m3957F2 = AbstractC2418w.m3957F(this.f6457g) | 1;
                ((C3173d) this.f6456f).m4866h(this.f6458h, (C2395p) obj, m3957F2);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1137o3(int i7, int i8, List list, InterfaceC3279c interfaceC3279c) {
        this.f6455e = 2;
        this.f6456f = list;
        this.f6457g = i7;
        this.f6458h = interfaceC3279c;
    }
}
