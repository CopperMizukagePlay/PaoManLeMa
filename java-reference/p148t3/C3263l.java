package p148t3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p054g6.C1701c0;
import p073j2.AbstractC2168e;
import p096m3.C2572v;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.l */
/* loaded from: classes.dex */
public final class C3263l implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C3261j f16110a;

    public C3263l(C3261j c3261j) {
        this.f16110a = c3261j;
    }

    public final void onBackCancelled() {
        C3261j c3261j = this.f16110a;
        C2572v c2572v = c3261j.f16086a;
        if (c2572v != null) {
            if (!c3261j.f16087b) {
                c2572v.m4098f(c3261j, null);
            }
            C3258g c3258g = (C3258g) c2572v.f13967f;
            c3258g.getClass();
            if (c3261j.equals(c3258g.f16095h) && -1 == c3258g.f16094g) {
                AbstractC3255d abstractC3255d = c3258g.f16093f;
                if (abstractC3255d == null) {
                    abstractC3255d = c3258g.m4975c(-1);
                }
                c3258g.f16093f = null;
                c3258g.f16094g = 0;
                c3258g.f16095h = null;
                if (abstractC3255d != null) {
                    abstractC3255d.mo478a();
                }
                C1701c0 c1701c0 = c3258g.f16088a;
                c1701c0.getClass();
                c1701c0.m2752j(null, C3259h.f16102a);
            }
            c3261j.f16087b = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.f16110a.m4972a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC3367j.m5100e(backEvent, "backEvent");
        C3253b m3520g = AbstractC2168e.m3520g(backEvent);
        C3261j c3261j = this.f16110a;
        C2572v c2572v = c3261j.f16086a;
        if (c2572v != null) {
            if (c3261j.f16087b) {
                C3258g c3258g = (C3258g) c2572v.f13967f;
                c3258g.getClass();
                if (c3261j.equals(c3258g.f16095h) && -1 == c3258g.f16094g) {
                    AbstractC3255d abstractC3255d = c3258g.f16093f;
                    if (abstractC3255d == null) {
                        abstractC3255d = c3258g.m4975c(-1);
                    }
                    if (abstractC3255d != null) {
                        abstractC3255d.mo480c(m3520g);
                    }
                    C1701c0 c1701c0 = c3258g.f16088a;
                    C3260i c3260i = new C3260i(m3520g);
                    c1701c0.getClass();
                    c1701c0.m2752j(null, c3260i);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC3367j.m5100e(backEvent, "backEvent");
        C3253b m3520g = AbstractC2168e.m3520g(backEvent);
        C3261j c3261j = this.f16110a;
        C2572v c2572v = c3261j.f16086a;
        if (c2572v != null) {
            if (!c3261j.f16087b) {
                c2572v.m4098f(c3261j, m3520g);
                c3261j.f16087b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }
}
