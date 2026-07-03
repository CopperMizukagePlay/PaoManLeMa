package p039e5;

import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1850a7;
import p085l0.C2395p;
import p085l0.InterfaceC2390n2;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ja */
/* loaded from: classes.dex */
public final class C0989ja implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5041e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2390n2 f5042f;

    public /* synthetic */ C0989ja(InterfaceC2390n2 interfaceC2390n2, int i7) {
        this.f5041e = i7;
        this.f5042f = interfaceC2390n2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f5041e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    List list = (List) this.f5042f.getValue();
                    int i7 = 0;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((C0800d9) it.next()).f3351l != EnumC0768c9.f3010j && (i7 = i7 + 1) < 0) {
                                AbstractC1806n.m3071S();
                                throw null;
                            }
                        }
                    }
                    AbstractC1850a7.m3108b(AbstractC0094y0.m184k(i7, "正在下载 (", ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    List list2 = (List) this.f5042f.getValue();
                    int i8 = 0;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((C0800d9) it2.next()).f3351l == EnumC0768c9.f3010j && (i8 = i8 + 1) < 0) {
                                AbstractC1806n.m3071S();
                                throw null;
                            }
                        }
                    }
                    AbstractC1850a7.m3108b(AbstractC0094y0.m184k(i8, "已完成 (", ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                }
                return C1694m.f10482a;
        }
    }
}
