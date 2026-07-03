package p092m;

import java.util.LinkedHashMap;
import java.util.Map;
import p060h5.C1814v;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.d0 */
/* loaded from: classes.dex */
public final class C2488d0 {

    /* renamed from: a */
    public final C2508x f13787a;

    /* renamed from: b */
    public final C2495k f13788b;

    /* renamed from: c */
    public final boolean f13789c;

    /* renamed from: d */
    public final Map f13790d;

    public C2488d0(C2508x c2508x, C2495k c2495k, boolean z7, Map map) {
        this.f13787a = c2508x;
        this.f13788b = c2495k;
        this.f13789c = z7;
        this.f13790d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2488d0)) {
            return false;
        }
        C2488d0 c2488d0 = (C2488d0) obj;
        if (AbstractC3367j.m5096a(this.f13787a, c2488d0.f13787a) && AbstractC3367j.m5096a(this.f13788b, c2488d0.f13788b) && this.f13789c == c2488d0.f13789c && AbstractC3367j.m5096a(this.f13790d, c2488d0.f13790d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        C2508x c2508x = this.f13787a;
        if (c2508x == null) {
            hashCode = 0;
        } else {
            hashCode = c2508x.hashCode();
        }
        int i8 = hashCode * 961;
        C2495k c2495k = this.f13788b;
        if (c2495k != null) {
            i7 = c2495k.hashCode();
        }
        return this.f13790d.hashCode() + AbstractC2487d.m4040d((i8 + i7) * 961, 31, this.f13789c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f13787a + ", slide=null, changeSize=" + this.f13788b + ", scale=null, hold=" + this.f13789c + ", effectsMap=" + this.f13790d + ')';
    }

    public /* synthetic */ C2488d0(C2508x c2508x, C2495k c2495k, LinkedHashMap linkedHashMap, int i7) {
        this((i7 & 1) != 0 ? null : c2508x, (i7 & 4) != 0 ? null : c2495k, (i7 & 16) == 0, (i7 & 32) != 0 ? C1814v.f10861e : linkedHashMap);
    }
}
