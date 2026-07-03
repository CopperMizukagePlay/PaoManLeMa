package p168w;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.n */
/* loaded from: classes.dex */
public final class C3631n extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17335f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3642y f17336g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0516a0 f17337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3631n(AbstractC3642y abstractC3642y, InterfaceC0516a0 interfaceC0516a0, int i7) {
        super(0);
        this.f17335f = i7;
        this.f17336g = abstractC3642y;
        this.f17337h = interfaceC0516a0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.f17335f) {
            case 0:
                AbstractC3642y abstractC3642y = this.f17336g;
                if (abstractC3642y.mo113b()) {
                    AbstractC0525d0.m1141s(this.f17337h, null, new C3633p(abstractC3642y, null, 0), 3);
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 1:
                AbstractC3642y abstractC3642y2 = this.f17336g;
                if (abstractC3642y2.mo115d()) {
                    AbstractC0525d0.m1141s(this.f17337h, null, new C3633p(abstractC3642y2, null, 1), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 2:
                AbstractC3642y abstractC3642y3 = this.f17336g;
                if (abstractC3642y3.mo113b()) {
                    AbstractC0525d0.m1141s(this.f17337h, null, new C3633p(abstractC3642y3, null, 0), 3);
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                AbstractC3642y abstractC3642y4 = this.f17336g;
                if (abstractC3642y4.mo115d()) {
                    AbstractC0525d0.m1141s(this.f17337h, null, new C3633p(abstractC3642y4, null, 1), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
