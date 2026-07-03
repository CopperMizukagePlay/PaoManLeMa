package p162v1;

import java.util.Comparator;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.k1 */
/* loaded from: classes.dex */
public final class C3515k1 implements Comparator {

    /* renamed from: f */
    public static final C3515k1 f16955f = new C3515k1(0);

    /* renamed from: e */
    public final /* synthetic */ int f16956e;

    public /* synthetic */ C3515k1(int i7) {
        this.f16956e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16956e) {
            case 0:
                C3502g0 c3502g0 = (C3502g0) obj;
                C3502g0 c3502g02 = (C3502g0) obj2;
                int m5101f = AbstractC3367j.m5101f(c3502g02.f16898s, c3502g0.f16898s);
                if (m5101f == 0) {
                    return AbstractC3367j.m5101f(c3502g0.hashCode(), c3502g02.hashCode());
                }
                return m5101f;
            default:
                C3502g0 c3502g03 = (C3502g0) obj;
                C3502g0 c3502g04 = (C3502g0) obj2;
                int m5101f2 = AbstractC3367j.m5101f(c3502g03.f16898s, c3502g04.f16898s);
                if (m5101f2 == 0) {
                    return AbstractC3367j.m5101f(c3502g03.hashCode(), c3502g04.hashCode());
                }
                return m5101f2;
        }
    }
}
