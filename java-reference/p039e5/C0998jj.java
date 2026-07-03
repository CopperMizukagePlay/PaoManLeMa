package p039e5;

import android.content.Context;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jj */
/* loaded from: classes.dex */
public final /* synthetic */ class C0998jj implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5082e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC0516a0 f5083f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f5084g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f5085h;

    /* renamed from: i */
    public final /* synthetic */ C2349d1 f5086i;

    /* renamed from: j */
    public final /* synthetic */ Context f5087j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f5088k;

    public /* synthetic */ C0998jj(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C2349d1 c2349d1, Context context, InterfaceC2425y0 interfaceC2425y03, int i7) {
        this.f5082e = i7;
        this.f5083f = interfaceC0516a0;
        this.f5084g = interfaceC2425y0;
        this.f5085h = interfaceC2425y02;
        this.f5086i = c2349d1;
        this.f5087j = context;
        this.f5088k = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f5082e;
        InterfaceC2425y0 interfaceC2425y0 = this.f5088k;
        switch (i7) {
            case 0:
                AbstractC1092mk.m1843q1(this.f5083f, this.f5084g, this.f5085h, this.f5086i, this.f5087j, interfaceC2425y0, false);
                break;
            default:
                AbstractC1092mk.m1843q1(this.f5083f, this.f5084g, this.f5085h, this.f5086i, this.f5087j, interfaceC2425y0, true);
                break;
        }
        return C1694m.f10482a;
    }
}
