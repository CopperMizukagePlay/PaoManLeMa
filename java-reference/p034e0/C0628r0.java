package p034e0;

import p053g5.C1694m;
import p115p.C2827g;
import p115p.C2830j;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.r0 */
/* loaded from: classes.dex */
public final class C0628r0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f2079f;

    /* renamed from: g */
    public final /* synthetic */ C2830j f2080g;

    /* renamed from: h */
    public final /* synthetic */ C0622o0 f2081h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0628r0(C2830j c2830j, C0622o0 c0622o0, int i7) {
        super(0);
        this.f2079f = i7;
        this.f2080g = c2830j;
        this.f2081h = c0622o0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f2079f) {
            case 0:
                this.f2081h.m1281d();
                this.f2080g.f14902a.setValue(C2827g.f14900a);
                return C1694m.f10482a;
            case 1:
                this.f2081h.m1280b(false);
                this.f2080g.f14902a.setValue(C2827g.f14900a);
                return C1694m.f10482a;
            case 2:
                this.f2081h.m1289l();
                this.f2080g.f14902a.setValue(C2827g.f14900a);
                return C1694m.f10482a;
            default:
                this.f2081h.m1290m();
                this.f2080g.f14902a.setValue(C2827g.f14900a);
                return C1694m.f10482a;
        }
    }
}
