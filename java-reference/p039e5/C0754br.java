package p039e5;

import android.os.Build;
import p035e1.C0677s;
import p046f5.AbstractC1540e;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p085l0.C2394o2;
import p085l0.C2395p;
import p144t.C3154s;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.br */
/* loaded from: classes.dex */
public final class C0754br implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ AbstractC1540e f2889e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f2890f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2891g;

    /* renamed from: h */
    public final /* synthetic */ float f2892h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f2893i;

    /* renamed from: j */
    public final /* synthetic */ boolean f2894j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f2895k;

    /* renamed from: l */
    public final /* synthetic */ boolean f2896l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f2897m;

    public C0754br(AbstractC1540e abstractC1540e, InterfaceC3279c interfaceC3279c, boolean z7, float f7, InterfaceC3279c interfaceC3279c2, boolean z8, InterfaceC3279c interfaceC3279c3, boolean z9, InterfaceC3279c interfaceC3279c4) {
        this.f2889e = abstractC1540e;
        this.f2890f = interfaceC3279c;
        this.f2891g = z7;
        this.f2892h = f7;
        this.f2893i = interfaceC3279c2;
        this.f2894j = z8;
        this.f2895k = interfaceC3279c3;
        this.f2896l = z9;
        this.f2897m = interfaceC3279c4;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC1540e abstractC1540e = this.f2889e;
            InterfaceC3279c interfaceC3279c = this.f2890f;
            boolean z7 = this.f2891g;
            AbstractC0945hr.m1568L(abstractC1540e, interfaceC3279c, z7, c2395p, 0);
            C2394o2 c2394o2 = AbstractC2019v0.f11943a;
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            AbstractC0945hr.m1571O(this.f2892h, this.f2893i, z7, c2395p, 0);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            if (Build.VERSION.SDK_INT >= 33) {
                str = "读取 WiFi 名称需要位置权限";
            } else {
                str = "Android 8 及以上读取 WiFi 名称需要位置权限";
            }
            String str2 = str;
            AbstractC0945hr.m1558B("显示 WiFi SSID", str2, AbstractC3393k.m5151v(), this.f2894j, this.f2891g, this.f2895k, c2395p, 6);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            AbstractC0945hr.m1558B("显示悬浮测速按钮", "测速页与历史页右下角；长按可本次隐藏", AbstractC3393k.m5146q(), this.f2896l, this.f2891g, this.f2897m, c2395p, 54);
        }
        return C1694m.f10482a;
    }
}
