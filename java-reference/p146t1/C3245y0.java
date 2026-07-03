package p146t1;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0056n2;
import p034e0.C0608h0;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p162v1.AbstractC3493d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.y0 */
/* loaded from: classes.dex */
public final class C3245y0 extends AbstractC3493d0 {

    /* renamed from: b */
    public static final C3245y0 f16065b = new AbstractC3493d0("Undefined intrinsics block and it is required");

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        int size = list.size();
        C1814v c1814v = C1814v.f10861e;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    AbstractC3239v0 mo4918e = ((InterfaceC3214k0) list.get(i9)).mo4918e(j6);
                    i7 = Math.max(mo4918e.f16053e, i7);
                    i8 = Math.max(mo4918e.f16054f, i8);
                    arrayList.add(mo4918e);
                }
                return interfaceC3223n0.mo4941K(AbstractC3092b.m4770g(i7, j6), AbstractC3092b.m4769f(i8, j6), c1814v, new C0608h0(3, arrayList));
            }
            AbstractC3239v0 mo4918e2 = ((InterfaceC3214k0) list.get(0)).mo4918e(j6);
            return interfaceC3223n0.mo4941K(AbstractC3092b.m4770g(mo4918e2.f16053e, j6), AbstractC3092b.m4769f(mo4918e2.f16054f, j6), c1814v, new C0056n2(mo4918e2, 11));
        }
        return interfaceC3223n0.mo4941K(C3091a.m4762j(j6), C3091a.m4761i(j6), c1814v, C3241w0.f16060h);
    }
}
