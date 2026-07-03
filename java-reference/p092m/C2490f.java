package p092m;

import p100n.C2643f1;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.f */
/* loaded from: classes.dex */
public final class C2490f extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f13797f;

    /* renamed from: g */
    public final /* synthetic */ C2643f1 f13798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2490f(C2643f1 c2643f1, int i7) {
        super(0);
        this.f13797f = i7;
        this.f13798g = c2643f1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        switch (this.f13797f) {
            case 0:
                C2643f1 c2643f1 = this.f13798g;
                Object m4238c = c2643f1.m4238c();
                EnumC2496l enumC2496l = EnumC2496l.f13813g;
                if (m4238c == enumC2496l && c2643f1.f14308d.getValue() == enumC2496l) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                return Long.valueOf(this.f13798g.m4237b());
        }
    }
}
