package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fj */
/* loaded from: classes.dex */
public final class C0873fj implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ boolean f4031e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4032f;

    public C0873fj(boolean z7, boolean z8) {
        this.f4031e = z7;
        this.f4032f = z8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (this.f4031e) {
                str = "302 跳转增强工作中";
            } else if (this.f4032f) {
                str = "正在解析 DNS";
            } else {
                str = "正在解析 DNS 候选";
            }
            AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
        }
        return C1694m.f10482a;
    }
}
