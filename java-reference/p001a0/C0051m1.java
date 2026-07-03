package p001a0;

import p027d1.C0464b;
import p053g5.C1694m;
import p117p1.AbstractC2866q;
import p117p1.C2868s;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.m1 */
/* loaded from: classes.dex */
public final class C0051m1 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f263f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0071r1 f264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0051m1(InterfaceC0071r1 interfaceC0071r1, int i7) {
        super(1);
        this.f263f = i7;
        this.f264g = interfaceC0071r1;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f263f) {
            case 0:
                this.f264g.mo163c(((C0464b) obj).f1623a);
                return C1694m.f10482a;
            default:
                C2868s c2868s = (C2868s) obj;
                this.f264g.mo165e(AbstractC2866q.m4546e(c2868s, false));
                c2868s.m4550a();
                return C1694m.f10482a;
        }
    }
}
