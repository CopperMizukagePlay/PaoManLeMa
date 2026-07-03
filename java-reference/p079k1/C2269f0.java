package p079k1;

import java.util.List;
import p035e1.C0671o0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.f0 */
/* loaded from: classes.dex */
public final class C2269f0 extends AbstractC2265d0 {

    /* renamed from: e */
    public final List f13151e;

    /* renamed from: f */
    public final C0671o0 f13152f;

    public C2269f0(List list, C0671o0 c0671o0) {
        this.f13151e = list;
        this.f13152f = c0671o0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C2269f0.class == obj.getClass()) {
                C2269f0 c2269f0 = (C2269f0) obj;
                if (this.f13152f.equals(c2269f0.f13152f) && AbstractC3367j.m5096a(this.f13151e, c2269f0.f13151e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(1.0f, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(1.0f, AbstractC2647h.m4255a(2, AbstractC2647h.m4255a(0, AbstractC2487d.m4038b(1.0f, AbstractC2487d.m4038b(1.0f, AbstractC2487d.m4038b(1.0f, (this.f13152f.hashCode() + (this.f13151e.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
