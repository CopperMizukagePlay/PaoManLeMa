package p034e0;

import java.util.ArrayList;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.h0 */
/* loaded from: classes.dex */
public final class C0608h0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f2004f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f2005g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0608h0(int i7, ArrayList arrayList) {
        super(1);
        this.f2004f = i7;
        this.f2005g = arrayList;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f2004f) {
            case 0:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                ArrayList arrayList = this.f2005g;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    AbstractC3237u0.m4949g(abstractC3237u0, (AbstractC3239v0) arrayList.get(i7), 0, 0);
                }
                return C1694m.f10482a;
            case 1:
                this.f2005g.get(((Number) obj).intValue());
                return null;
            case 2:
                AbstractC3237u0 abstractC3237u02 = (AbstractC3237u0) obj;
                ArrayList arrayList2 = this.f2005g;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    AbstractC3237u0.m4949g(abstractC3237u02, (AbstractC3239v0) arrayList2.get(i8), 0, 0);
                }
                return C1694m.f10482a;
            case 3:
                AbstractC3237u0 abstractC3237u03 = (AbstractC3237u0) obj;
                ArrayList arrayList3 = this.f2005g;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    AbstractC3237u0.m4952n(abstractC3237u03, (AbstractC3239v0) arrayList3.get(i9), 0, 0);
                }
                return C1694m.f10482a;
            case 4:
                AbstractC3237u0 abstractC3237u04 = (AbstractC3237u0) obj;
                ArrayList arrayList4 = this.f2005g;
                int size4 = arrayList4.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    AbstractC3237u0.m4951j(abstractC3237u04, (AbstractC3239v0) arrayList4.get(i10), 0, 0);
                }
                return C1694m.f10482a;
            default:
                AbstractC3237u0 abstractC3237u05 = (AbstractC3237u0) obj;
                ArrayList arrayList5 = this.f2005g;
                int m3066N = AbstractC1806n.m3066N(arrayList5);
                if (m3066N >= 0) {
                    int i11 = 0;
                    while (true) {
                        AbstractC3237u0.m4951j(abstractC3237u05, (AbstractC3239v0) arrayList5.get(i11), 0, 0);
                        if (i11 != m3066N) {
                            i11++;
                        }
                    }
                }
                return C1694m.f10482a;
        }
    }
}
