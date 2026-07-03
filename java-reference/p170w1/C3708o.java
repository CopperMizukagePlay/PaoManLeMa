package p170w1;

import p019c1.C0360d;
import p019c1.C0377u;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.o */
/* loaded from: classes.dex */
public final class C3708o extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17624f;

    /* renamed from: g */
    public final /* synthetic */ C0360d f17625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3708o(C0360d c0360d, int i7) {
        super(1);
        this.f17624f = i7;
        this.f17625g = c0360d;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17624f) {
            case 0:
                return Boolean.valueOf(((C0377u) obj).m849O0(this.f17625g.f1227a));
            default:
                return Boolean.valueOf(((C0377u) obj).m849O0(this.f17625g.f1227a));
        }
    }
}
