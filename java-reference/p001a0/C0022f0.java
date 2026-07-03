package p001a0;

import p034e0.C0622o0;
import p053g5.C1694m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.f0 */
/* loaded from: classes.dex */
public final class C0022f0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f117f;

    /* renamed from: g */
    public final /* synthetic */ C0622o0 f118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0022f0(C0622o0 c0622o0, int i7) {
        super(0);
        this.f117f = i7;
        this.f118g = c0622o0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f117f) {
            case 0:
                this.f118g.m1289l();
                return Boolean.TRUE;
            case 1:
                this.f118g.m1283f(true);
                return Boolean.TRUE;
            case 2:
                this.f118g.m1280b(true);
                return Boolean.TRUE;
            case 3:
                this.f118g.m1281d();
                return Boolean.TRUE;
            case 4:
                C0622o0 c0622o0 = this.f118g;
                c0622o0.m1280b(true);
                c0622o0.m1288k();
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C0622o0 c0622o02 = this.f118g;
                c0622o02.m1281d();
                c0622o02.m1288k();
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                C0622o0 c0622o03 = this.f118g;
                c0622o03.m1289l();
                c0622o03.m1288k();
                return C1694m.f10482a;
            default:
                this.f118g.m1290m();
                return C1694m.f10482a;
        }
    }
}
