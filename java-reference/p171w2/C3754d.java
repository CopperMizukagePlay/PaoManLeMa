package p171w2;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0056n2;
import p034e0.C0608h0;
import p060h5.C1814v;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.d */
/* loaded from: classes.dex */
public final class C3754d implements InterfaceC3217l0 {

    /* renamed from: b */
    public static final C3754d f17834b = new C3754d(0);

    /* renamed from: c */
    public static final C3754d f17835c = new C3754d(1);

    /* renamed from: a */
    public final /* synthetic */ int f17836a;

    public /* synthetic */ C3754d(int i7) {
        this.f17836a = i7;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        switch (this.f17836a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    AbstractC3239v0 mo4918e = ((InterfaceC3214k0) list.get(i9)).mo4918e(j6);
                    i7 = Math.max(i7, mo4918e.f16053e);
                    i8 = Math.max(i8, mo4918e.f16054f);
                    arrayList.add(mo4918e);
                }
                if (list.isEmpty()) {
                    i7 = C3091a.m4762j(j6);
                    i8 = C3091a.m4761i(j6);
                }
                return interfaceC3223n0.mo4941K(i7, i8, C1814v.f10861e, new C0608h0(4, arrayList));
            default:
                int size2 = list.size();
                C1814v c1814v = C1814v.f10861e;
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i10 = 0;
                        int i11 = 0;
                        for (int i12 = 0; i12 < size3; i12++) {
                            AbstractC3239v0 mo4918e2 = ((InterfaceC3214k0) list.get(i12)).mo4918e(j6);
                            i10 = Math.max(i10, mo4918e2.f16053e);
                            i11 = Math.max(i11, mo4918e2.f16054f);
                            arrayList2.add(mo4918e2);
                        }
                        return interfaceC3223n0.mo4941K(i10, i11, c1814v, new C0608h0(5, arrayList2));
                    }
                    AbstractC3239v0 mo4918e3 = ((InterfaceC3214k0) list.get(0)).mo4918e(j6);
                    return interfaceC3223n0.mo4941K(mo4918e3.f16053e, mo4918e3.f16054f, c1814v, new C0056n2(mo4918e3, 13));
                }
                return interfaceC3223n0.mo4941K(0, 0, c1814v, C3752b.f17827k);
        }
    }
}
