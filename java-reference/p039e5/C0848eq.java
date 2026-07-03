package p039e5;

import androidx.compose.animation.AbstractC0144a;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p085l0.C2395p;
import p092m.AbstractC2501q;
import p092m.C2506v;
import p092m.C2507w;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.eq */
/* loaded from: classes.dex */
public final class C0848eq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f3833e;

    /* renamed from: f */
    public final /* synthetic */ boolean f3834f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f3835g;

    /* renamed from: h */
    public final /* synthetic */ String f3836h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f3837i;

    public C0848eq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, String str, InterfaceC3279c interfaceC3279c2) {
        this.f3833e = z7;
        this.f3834f = z8;
        this.f3835g = interfaceC3279c;
        this.f3836h = str;
        this.f3837i = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7;
        C3154s c3154s = (C3154s) obj;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e(c3154s, "$this$SpeedSettingsSectionCard");
        if ((intValue & 6) == 0) {
            if (c2395p.m3870g(c3154s)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            intValue |= i7;
        }
        if ((intValue & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC0945hr.m1558B("启用定时停止", "到设定时长自动停止测速", AbstractC1793a0.m2987o(), this.f3833e, this.f3834f, this.f3835g, c2395p, 54);
            C2506v m4059a = AbstractC2501q.m4059a();
            C2507w m4061c = AbstractC2501q.m4061c();
            String str = this.f3836h;
            InterfaceC3279c interfaceC3279c = this.f3837i;
            AbstractC0144a.m315b(c3154s, this.f3833e, null, m4059a, m4061c, null, AbstractC3178i.m4873d(-870635163, new C0816dq(str, interfaceC3279c, this.f3834f, 0), c2395p), c2395p, (intValue & 14) | 1600512);
        }
        return C1694m.f10482a;
    }
}
