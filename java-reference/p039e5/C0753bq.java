package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p079k1.C2266e;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p092m.C2493i;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bq */
/* loaded from: classes.dex */
public final class C0753bq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f2884e = 1;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f2885f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2886g;

    /* renamed from: h */
    public final /* synthetic */ boolean f2887h;

    /* renamed from: i */
    public final /* synthetic */ Object f2888i;

    public C0753bq(String str, InterfaceC3279c interfaceC3279c, boolean z7, boolean z8) {
        this.f2888i = str;
        this.f2885f = interfaceC3279c;
        this.f2886g = z7;
        this.f2887h = z8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z7;
        boolean z8;
        switch (this.f2884e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f2888i;
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b("读取本机 tc / sysfs / proc 队列指标。开启后测速主页面实时显示 QPI。", null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p, 6, 0, 65530);
                    Boolean bool = (Boolean) interfaceC2425y0.getValue();
                    Boolean bool2 = Boolean.TRUE;
                    if (AbstractC3367j.m5096a(bool, bool2)) {
                        str = "测速时在主页面显示";
                    } else {
                        str = "正在检测可用性…";
                    }
                    String str2 = str;
                    C2266e m4349w = AbstractC2710c.m4349w();
                    if (this.f2887h && AbstractC3367j.m5096a((Boolean) interfaceC2425y0.getValue(), bool2)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z9 = z7;
                    AbstractC0945hr.m1558B("启用队列压力监测", str2, m4349w, this.f2886g, z9, this.f2885f, c2395p, 6);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                String str3 = (String) this.f2888i;
                if (this.f2886g && this.f2887h) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z10 = z8;
                AbstractC0945hr.m1577c(str3, this.f2885f, "单本地端口", "1024~65535", z10, AbstractC0155c.m346e(C3807o.f17991a, 1.0f), c2395p2, 196992);
                return C1694m.f10482a;
        }
    }

    public C0753bq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0) {
        this.f2886g = z7;
        this.f2887h = z8;
        this.f2885f = interfaceC3279c;
        this.f2888i = interfaceC2425y0;
    }
}
