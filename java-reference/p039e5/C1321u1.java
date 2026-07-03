package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u1 */
/* loaded from: classes.dex */
public final class C1321u1 implements InterfaceC3281e {

    /* renamed from: f */
    public static final C1321u1 f7872f = new C1321u1(0);

    /* renamed from: g */
    public static final C1321u1 f7873g = new C1321u1(1);

    /* renamed from: h */
    public static final C1321u1 f7874h = new C1321u1(2);

    /* renamed from: i */
    public static final C1321u1 f7875i = new C1321u1(3);

    /* renamed from: e */
    public final /* synthetic */ int f7876e;

    public /* synthetic */ C1321u1(int i7) {
        this.f7876e = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f7876e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b("接口 Debug 信息", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 6, 0, 131070);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1850a7.m3108b("1400", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                }
                return C1694m.f10482a;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    AbstractC1850a7.m3108b("56~65500；超 MTU 大包可能被分片或被部分链路丢弃", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p3, 0, 0, 131070);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    AbstractC1850a7.m3108b("目标线程", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 6, 0, 131070);
                }
                return C1694m.f10482a;
        }
    }
}
