package p039e5;

import java.util.List;
import p053g5.C1694m;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0730b3 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f2570e;

    /* renamed from: f */
    public final /* synthetic */ Object f2571f;

    /* renamed from: g */
    public final /* synthetic */ Object f2572g;

    /* renamed from: h */
    public final /* synthetic */ boolean f2573h;

    /* renamed from: i */
    public final /* synthetic */ Object f2574i;

    /* renamed from: j */
    public final /* synthetic */ Object f2575j;

    public /* synthetic */ C0730b3(String str, C2266e c2266e, boolean z7, InterfaceC3277a interfaceC3277a, C3173d c3173d, int i7) {
        this.f2570e = 4;
        this.f2575j = str;
        this.f2571f = c2266e;
        this.f2573h = z7;
        this.f2572g = interfaceC3277a;
        this.f2574i = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f2570e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2061h((List) this.f2571f, (String) this.f2575j, (InterfaceC3279c) this.f2572g, this.f2573h, (InterfaceC3810r) this.f2574i, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(24577);
                AbstractC1172p7.m2071r((List) this.f2571f, (EnumC1495zk) this.f2575j, (InterfaceC3279c) this.f2572g, this.f2573h, (InterfaceC3810r) this.f2574i, (C2395p) obj, m3957F2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int m3957F3 = AbstractC2418w.m3957F(385);
                AbstractC1172p7.m2033J((String) this.f2575j, (InterfaceC3279c) this.f2572g, (String) this.f2571f, this.f2573h, (InterfaceC3810r) this.f2574i, (C2395p) obj, m3957F3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int m3957F4 = AbstractC2418w.m3957F(7);
                AbstractC1172p7.m2060g((String) this.f2575j, (InterfaceC3277a) this.f2571f, (InterfaceC3810r) this.f2574i, this.f2573h, (C2266e) this.f2572g, (C2395p) obj, m3957F4);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F5 = AbstractC2418w.m3957F(24583);
                AbstractC1302td.m2344k((String) this.f2575j, (C2266e) this.f2571f, this.f2573h, (InterfaceC3277a) this.f2572g, (C3173d) this.f2574i, (C2395p) obj, m3957F5);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0730b3(String str, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7, C2266e c2266e, int i7) {
        this.f2570e = 3;
        this.f2575j = str;
        this.f2571f = interfaceC3277a;
        this.f2574i = interfaceC3810r;
        this.f2573h = z7;
        this.f2572g = c2266e;
    }

    public /* synthetic */ C0730b3(String str, InterfaceC3279c interfaceC3279c, String str2, boolean z7, InterfaceC3810r interfaceC3810r, int i7) {
        this.f2570e = 2;
        this.f2575j = str;
        this.f2572g = interfaceC3279c;
        this.f2571f = str2;
        this.f2573h = z7;
        this.f2574i = interfaceC3810r;
    }

    public /* synthetic */ C0730b3(List list, Object obj, InterfaceC3279c interfaceC3279c, boolean z7, InterfaceC3810r interfaceC3810r, int i7, int i8) {
        this.f2570e = i8;
        this.f2571f = list;
        this.f2575j = obj;
        this.f2572g = interfaceC3279c;
        this.f2573h = z7;
        this.f2574i = interfaceC3810r;
    }
}
