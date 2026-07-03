package p107o;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.o1 */
/* loaded from: classes.dex */
public final class C2766o1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f14740f;

    /* renamed from: g */
    public final /* synthetic */ C2769p1 f14741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2766o1(C2769p1 c2769p1, int i7) {
        super(0);
        this.f14740f = i7;
        this.f14741g = c2769p1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        boolean z8;
        switch (this.f14740f) {
            case 0:
                if (this.f14741g.f14745a.m3741g() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                C2769p1 c2769p1 = this.f14741g;
                if (c2769p1.f14745a.m3741g() < c2769p1.f14748d.m3741g()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
        }
    }
}
