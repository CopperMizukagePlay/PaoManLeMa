package p148t3;

import p008b.C0230e0;
import p008b.C0236h0;
import p054g6.C1701c0;
import p096m3.C2572v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.f */
/* loaded from: classes.dex */
public abstract class AbstractC3257f {

    /* renamed from: a */
    public C2572v f16086a;

    /* renamed from: b */
    public boolean f16087b;

    /* renamed from: a */
    public final void m4972a() {
        C2572v c2572v = this.f16086a;
        if (c2572v != null) {
            if (!this.f16087b) {
                c2572v.m4098f(this, null);
            }
            C3258g c3258g = (C3258g) c2572v.f13967f;
            C0230e0 c0230e0 = (C0230e0) c2572v.f13966e;
            c3258g.getClass();
            if (equals(c3258g.f16095h) && -1 == c3258g.f16094g) {
                AbstractC3255d abstractC3255d = c3258g.f16093f;
                if (abstractC3255d == null) {
                    abstractC3255d = c3258g.m4975c(-1);
                }
                c3258g.f16093f = null;
                c3258g.f16094g = 0;
                c3258g.f16095h = null;
                if (abstractC3255d == null) {
                    ((C0236h0) c0230e0.f913a).f920a.run();
                } else {
                    abstractC3255d.mo479b();
                }
                C1701c0 c1701c0 = c3258g.f16088a;
                c1701c0.getClass();
                c1701c0.m2752j(null, C3259h.f16102a);
            }
            this.f16087b = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    /* renamed from: b */
    public void mo508b(boolean z7) {
    }
}
