package p170w1;

import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p171w2.C3771u;
import p182y.C3830c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.m0 */
/* loaded from: classes.dex */
public final class C3701m0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17602f;

    /* renamed from: g */
    public final /* synthetic */ Object f17603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3701m0(int i7, Object obj) {
        super(0);
        this.f17602f = i7;
        this.f17603g = obj;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        InterfaceC3238v parentLayoutCoordinates;
        boolean z7;
        switch (this.f17602f) {
            case 0:
                AbstractC0525d0.m1127e(((C3705n0) this.f17603g).f17619g, null);
                return C1694m.f10482a;
            case 1:
                ((C3709o0) this.f17603g).f17627b = null;
                return C1694m.f10482a;
            case 2:
                C3771u c3771u = (C3771u) this.f17603g;
                parentLayoutCoordinates = c3771u.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo4923M()) {
                    parentLayoutCoordinates = null;
                }
                if (parentLayoutCoordinates != null && c3771u.m5919getPopupContentSizebOM6tXw() != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                ((C3830c) this.f17603g).f18040N.mo23f(Boolean.valueOf(!r0.f18039M));
                return C1694m.f10482a;
        }
    }
}
