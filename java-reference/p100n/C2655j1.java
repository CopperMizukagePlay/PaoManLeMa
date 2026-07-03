package p100n;

import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.j1 */
/* loaded from: classes.dex */
public final class C2655j1 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f14342f;

    /* renamed from: g */
    public final /* synthetic */ C2643f1 f14343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2655j1(C2643f1 c2643f1, int i7) {
        super(1);
        this.f14342f = i7;
        this.f14343g = c2643f1;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f14342f) {
            case 0:
                return new C2652i1(this.f14343g, 0);
            default:
                return new C2652i1(this.f14343g, 1);
        }
    }
}
