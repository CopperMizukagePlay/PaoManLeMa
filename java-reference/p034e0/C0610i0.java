package p034e0;

import java.util.ArrayList;
import java.util.List;
import p060h5.C1814v;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.i0 */
/* loaded from: classes.dex */
public final class C0610i0 implements InterfaceC3217l0 {

    /* renamed from: a */
    public static final C0610i0 f2009a = new Object();

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        ArrayList arrayList = new ArrayList(list.size());
        Integer num = 0;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((InterfaceC3214k0) list.get(i7)).mo4918e(j6));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i8 = 0; i8 < size2; i8++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((AbstractC3239v0) arrayList.get(i8)).f16053e));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((AbstractC3239v0) arrayList.get(i9)).f16054f));
        }
        return interfaceC3223n0.mo4941K(intValue, num.intValue(), C1814v.f10861e, new C0608h0(0, arrayList));
    }
}
