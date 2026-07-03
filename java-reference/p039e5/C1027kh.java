package p039e5;

import p053g5.C1694m;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kh */
/* loaded from: classes.dex */
public final class C1027kh implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3282f f5278e;

    /* renamed from: f */
    public final /* synthetic */ C2349d1 f5279f;

    /* renamed from: g */
    public final /* synthetic */ C2349d1 f5280g;

    /* renamed from: h */
    public final /* synthetic */ C2345c1 f5281h;

    public C1027kh(InterfaceC3282f interfaceC3282f, C2349d1 c2349d1, C2349d1 c2349d12, C2345c1 c2345c1) {
        this.f5278e = interfaceC3282f;
        this.f5279f = c2349d1;
        this.f5280g = c2349d12;
        this.f5281h = c2345c1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        float f7 = AbstractC1092mk.f5952h;
        C2349d1 c2349d1 = this.f5279f;
        int m3741g = c2349d1.m3741g();
        C2349d1 c2349d12 = this.f5280g;
        int m3741g2 = c2349d12.m3741g();
        if (m3741g != 0 && m3741g2 >= 0) {
            this.f5278e.mo24c(Integer.valueOf(m3741g), Integer.valueOf(m3741g2), Boolean.TRUE);
        }
        c2349d1.m3742h(0);
        c2349d12.m3742h(-1);
        this.f5281h.m3730h(0.0f);
        return C1694m.f10482a;
    }
}
