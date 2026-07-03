package p039e5;

import java.util.List;
import p001a0.C0078t0;
import p008b.C0242k0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1103n0 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f6132e;

    /* renamed from: f */
    public final /* synthetic */ List f6133f;

    public /* synthetic */ C1103n0(int i7, List list) {
        this.f6132e = i7;
        this.f6133f = list;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f6132e) {
            case 0:
                return C0800d9.m1498a((C0800d9) obj, null, this.f6133f, null, 0L, 0L, 0L, false, null, 0L, null, null, 4194287);
            case 1:
                C0831e9 c0831e9 = (C0831e9) obj;
                int i7 = c0831e9.f3659a;
                List list = this.f6133f;
                int size = list.size();
                if (size < 1) {
                    size = 1;
                }
                String str = (String) AbstractC1805m.m3048l0(i7 % size, list);
                if (str == null) {
                    str = "系统 DNS";
                }
                return C0831e9.m1519a(c0831e9, 0L, 0L, 0L, 0L, str, null, 95);
            case 2:
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                C0242k0 c0242k0 = new C0242k0(24);
                List list2 = this.f6133f;
                c3320h.m5054m(list2.size(), new C0078t0(7, c0242k0, list2), new C1481z6(0, list2), new C3173d(-632812321, new C0702a7(0, list2), true));
                return C1694m.f10482a;
            case 3:
                C1189po c1189po = (C1189po) obj;
                AbstractC3367j.m5100e(c1189po, "it");
                return Boolean.valueOf(this.f6133f.contains(Integer.valueOf(c1189po.f6926a)));
            default:
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(this.f6133f.contains(num));
        }
    }
}
