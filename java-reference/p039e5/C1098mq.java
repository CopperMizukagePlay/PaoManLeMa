package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.C2395p;
import p144t.C3154s;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mq */
/* loaded from: classes.dex */
public final class C1098mq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ List f5985e;

    /* renamed from: f */
    public final /* synthetic */ String f5986f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f5987g;

    /* renamed from: h */
    public final /* synthetic */ String f5988h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f5989i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3281e f5990j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3277a f5991k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f5992l;

    /* renamed from: m */
    public final /* synthetic */ boolean f5993m;

    /* renamed from: n */
    public final /* synthetic */ boolean f5994n;

    /* renamed from: o */
    public final /* synthetic */ boolean f5995o;

    public C1098mq(List list, String str, InterfaceC3279c interfaceC3279c, String str2, InterfaceC3279c interfaceC3279c2, InterfaceC3281e interfaceC3281e, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c3, boolean z7, boolean z8, boolean z9) {
        this.f5985e = list;
        this.f5986f = str;
        this.f5987g = interfaceC3279c;
        this.f5988h = str2;
        this.f5989i = interfaceC3279c2;
        this.f5990j = interfaceC3281e;
        this.f5991k = interfaceC3277a;
        this.f5992l = interfaceC3279c3;
        this.f5993m = z7;
        this.f5994n = z8;
        this.f5995o = z9;
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
            if (this.f5994n && this.f5995o) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0945hr.m1588n(this.f5985e, this.f5986f, this.f5987g, this.f5988h, this.f5989i, this.f5990j, this.f5991k, this.f5992l, this.f5993m, z7, c2395p, 0);
        }
        return C1694m.f10482a;
    }
}
