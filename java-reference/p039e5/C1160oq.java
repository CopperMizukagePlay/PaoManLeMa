package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p035e1.C0677s;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p085l0.C2395p;
import p144t.C3154s;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.oq */
/* loaded from: classes.dex */
public final class C1160oq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f6727e;

    /* renamed from: f */
    public final /* synthetic */ String f6728f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f6729g;

    /* renamed from: h */
    public final /* synthetic */ boolean f6730h;

    /* renamed from: i */
    public final /* synthetic */ String f6731i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f6732j;

    public /* synthetic */ C1160oq(String str, InterfaceC3279c interfaceC3279c, boolean z7, String str2, InterfaceC3279c interfaceC3279c2, int i7) {
        this.f6727e = i7;
        this.f6728f = str;
        this.f6729g = interfaceC3279c;
        this.f6730h = z7;
        this.f6731i = str2;
        this.f6732j = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f6727e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    String str = this.f6728f;
                    InterfaceC3279c interfaceC3279c = this.f6729g;
                    boolean z7 = this.f6730h;
                    AbstractC0945hr.m1600z(str, interfaceC3279c, z7, c2395p, 0);
                    AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p, 0, 3);
                    AbstractC0945hr.m1575a(this.f6731i, this.f6732j, z7, c2395p, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingSwitchCollapsibleSection");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C3807o c3807o = C3807o.f17991a;
                    AbstractC1847a4.m3102a(this.f6728f, this.f6729g, AbstractC0155c.m346e(c3807o, 1.0f), this.f6730h, false, null, AbstractC1352v1.f8079m, AbstractC1352v1.f8080n, null, null, null, null, null, null, true, 0, 0, null, null, c2395p2, 14156160, 12582912, 8257328);
                    AbstractC1847a4.m3102a(this.f6731i, this.f6732j, AbstractC0155c.m346e(c3807o, 1.0f), this.f6730h, false, null, AbstractC1352v1.f8081o, AbstractC1352v1.f8082p, null, null, null, null, null, null, true, 0, 0, null, null, c2395p2, 14156160, 12582912, 8257328);
                }
                return C1694m.f10482a;
        }
    }
}
