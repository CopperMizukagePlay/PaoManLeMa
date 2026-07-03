package p039e5;

import android.content.Context;
import java.util.List;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.g7 */
/* loaded from: classes.dex */
public final class C0893g7 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ List f4186e;

    /* renamed from: f */
    public final /* synthetic */ String f4187f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f4188g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3277a f4189h;

    /* renamed from: i */
    public final /* synthetic */ C1281sn f4190i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f4191j;

    /* renamed from: k */
    public final /* synthetic */ Context f4192k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f4193l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f4194m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f4195n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f4196o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f4197p;

    public C0893g7(List list, String str, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, C1281sn c1281sn, InterfaceC2425y0 interfaceC2425y0, Context context, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f4186e = list;
        this.f4187f = str;
        this.f4188g = interfaceC3279c;
        this.f4189h = interfaceC3277a;
        this.f4190i = c1281sn;
        this.f4191j = interfaceC2425y0;
        this.f4192k = context;
        this.f4193l = interfaceC2425y02;
        this.f4194m = interfaceC2425y03;
        this.f4195n = interfaceC2425y04;
        this.f4196o = interfaceC2425y05;
        this.f4197p = interfaceC2425y06;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3315c) obj, "$this$item");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC1172p7.m2052b("设置", "session_limit_settings", AbstractC1793a0.m2962B(), false, null, AbstractC3178i.m4873d(-240270174, new C0861f7(this.f4186e, this.f4187f, this.f4188g, this.f4189h, this.f4190i, this.f4191j, this.f4192k, this.f4193l, this.f4194m, this.f4195n, this.f4196o, this.f4197p), c2395p), c2395p, 199734, 16);
        }
        return C1694m.f10482a;
    }
}
