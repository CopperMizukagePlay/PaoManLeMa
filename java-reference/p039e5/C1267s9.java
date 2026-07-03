package p039e5;

import p053g5.C1694m;
import p085l0.C2349d1;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1267s9 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7534e;

    /* renamed from: f */
    public final /* synthetic */ C2349d1 f7535f;

    public /* synthetic */ C1267s9(C2349d1 c2349d1, int i7) {
        this.f7534e = i7;
        this.f7535f = c2349d1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f7534e;
        C1694m c1694m = C1694m.f10482a;
        C2349d1 c2349d1 = this.f7535f;
        switch (i7) {
            case 0:
                c2349d1.m3742h(0);
                return c1694m;
            case 1:
                c2349d1.m3742h(0);
                return c1694m;
            case 2:
                c2349d1.m3742h(1);
                return c1694m;
            case 3:
                c2349d1.m3742h(c2349d1.m3741g() + 1);
                return c1694m;
            case 4:
                c2349d1.m3742h(c2349d1.m3741g() + 1);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                c2349d1.m3742h(c2349d1.m3741g() + 1);
                return c1694m;
            default:
                float f7 = AbstractC1092mk.f5952h;
                return Float.valueOf(c2349d1.m3741g() / 100.0f);
        }
    }
}
