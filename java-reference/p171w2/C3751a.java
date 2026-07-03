package p171w2;

import p001a0.C0077t;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.a */
/* loaded from: classes.dex */
public final class C3751a extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17821f;

    /* renamed from: g */
    public final /* synthetic */ DialogC3769s f17822g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3751a(DialogC3769s dialogC3769s, int i7) {
        super(1);
        this.f17821f = i7;
        this.f17822g = dialogC3769s;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17821f) {
            case 0:
                return new C0077t(8, this.f17822g);
            default:
                DialogC3769s dialogC3769s = this.f17822g;
                if (dialogC3769s.f17877j.f17866a) {
                    dialogC3769s.f17876i.mo52a();
                }
                return C1694m.f10482a;
        }
    }
}
