package p170w1;

import java.util.List;
import p028d2.C0477j;
import p028d2.C0482o;
import p077k.AbstractC2201l;
import p077k.C2222x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.b2 */
/* loaded from: classes.dex */
public final class C3659b2 {

    /* renamed from: a */
    public final C0477j f17491a;

    /* renamed from: b */
    public final C2222x f17492b;

    public C3659b2(C0482o c0482o, AbstractC2201l abstractC2201l) {
        this.f17491a = c0482o.f1694d;
        this.f17492b = new C2222x(C0482o.m1038j(4, c0482o).size());
        List m1038j = C0482o.m1038j(4, c0482o);
        int size = m1038j.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0482o c0482o2 = (C0482o) m1038j.get(i7);
            if (abstractC2201l.m3611a(c0482o2.f1697g)) {
                this.f17492b.m3653a(c0482o2.f1697g);
            }
        }
    }
}
