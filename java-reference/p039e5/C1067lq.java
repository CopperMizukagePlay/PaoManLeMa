package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.C2395p;
import p144t.C3154s;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lq */
/* loaded from: classes.dex */
public final class C1067lq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ List f5718e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3282f f5719f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f5720g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f5721h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f5722i;

    /* renamed from: j */
    public final /* synthetic */ boolean f5723j;

    /* renamed from: k */
    public final /* synthetic */ boolean f5724k;

    public C1067lq(List list, InterfaceC3282f interfaceC3282f, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, boolean z7, boolean z8) {
        this.f5718e = list;
        this.f5719f = interfaceC3282f;
        this.f5720g = interfaceC3277a;
        this.f5721h = interfaceC3279c;
        this.f5722i = interfaceC3279c2;
        this.f5723j = z7;
        this.f5724k = z8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingSwitchCollapsibleSection");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (this.f5723j && this.f5724k) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0945hr.m1593s(this.f5718e, this.f5719f, this.f5720g, this.f5721h, this.f5722i, z7, c2395p, 0);
        }
        return C1694m.f10482a;
    }
}
