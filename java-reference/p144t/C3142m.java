package p144t;

import java.util.List;
import p060h5.C1814v;
import p140s2.C3091a;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C3142m implements InterfaceC3217l0 {

    /* renamed from: b */
    public static final C3142m f15805b = new C3142m(0);

    /* renamed from: c */
    public static final C3142m f15806c = new C3142m(1);

    /* renamed from: a */
    public final /* synthetic */ int f15807a;

    public /* synthetic */ C3142m(int i7) {
        this.f15807a = i7;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        int i7;
        switch (this.f15807a) {
            case 0:
                return interfaceC3223n0.mo4941K(C3091a.m4762j(j6), C3091a.m4761i(j6), C1814v.f10861e, C3140l.f15801g);
            default:
                int i8 = 0;
                if (C3091a.m4758f(j6)) {
                    i7 = C3091a.m4760h(j6);
                } else {
                    i7 = 0;
                }
                if (C3091a.m4757e(j6)) {
                    i8 = C3091a.m4759g(j6);
                }
                return interfaceC3223n0.mo4941K(i7, i8, C1814v.f10861e, C3140l.f15803i);
        }
    }
}
