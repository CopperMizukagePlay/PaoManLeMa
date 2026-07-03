package p169w0;

import java.util.ArrayList;
import p085l0.AbstractC2384m0;
import p085l0.C2335a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w0.h */
/* loaded from: classes.dex */
public final class C3651h {

    /* renamed from: a */
    public final ArrayList f17428a = new ArrayList();

    public C3651h(Object obj) {
    }

    /* renamed from: a */
    public final boolean m5615a(AbstractC2384m0 abstractC2384m0, Object obj) {
        ArrayList arrayList = abstractC2384m0.f13447a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof C2335a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else if (obj2 instanceof AbstractC2384m0) {
                if (m5615a((AbstractC2384m0) obj2, obj)) {
                    return true;
                }
            } else {
                throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m5616b(AbstractC2384m0 abstractC2384m0, Object obj) {
    }
}
