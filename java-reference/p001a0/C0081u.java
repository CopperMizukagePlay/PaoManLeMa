package p001a0;

import p027d1.C0464b;
import p034e0.C0622o0;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.u */
/* loaded from: classes.dex */
public final class C0081u extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f391f;

    /* renamed from: g */
    public final /* synthetic */ C0622o0 f392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0081u(C0622o0 c0622o0, int i7) {
        super(1);
        this.f391f = i7;
        this.f392g = c0622o0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f391f) {
            case 0:
                return new C0077t(0, this.f392g);
            default:
                long j6 = ((C0464b) obj).f1623a;
                this.f392g.m1292o();
                return C1694m.f10482a;
        }
    }
}
