package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.C1813u;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bn */
/* loaded from: classes.dex */
public final class C0750bn {

    /* renamed from: a */
    public final boolean f2846a;

    /* renamed from: b */
    public final List f2847b;

    /* renamed from: c */
    public final List f2848c;

    /* renamed from: d */
    public final int f2849d;

    /* renamed from: e */
    public final int f2850e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0750bn() {
        this(256, 2, r3, r3, false);
        C1813u c1813u = C1813u.f10860e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0750bn) {
                C0750bn c0750bn = (C0750bn) obj;
                if (this.f2846a != c0750bn.f2846a || !AbstractC3367j.m5096a(this.f2847b, c0750bn.f2847b) || !AbstractC3367j.m5096a(this.f2848c, c0750bn.f2848c) || this.f2849d != c0750bn.f2849d || this.f2850e != c0750bn.f2850e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2850e) + AbstractC2647h.m4255a(this.f2849d, AbstractC0094y0.m176c(this.f2848c, AbstractC0094y0.m176c(this.f2847b, Boolean.hashCode(this.f2846a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RatePushConfig(enabled=" + this.f2846a + ", downloadUrls=" + this.f2847b + ", uploadUrls=" + this.f2848c + ", targetWorkerThreads=" + this.f2849d + ", stepThreads=" + this.f2850e + ")";
    }

    public C0750bn(int i7, int i8, List list, List list2, boolean z7) {
        this.f2846a = z7;
        this.f2847b = list;
        this.f2848c = list2;
        this.f2849d = i7;
        this.f2850e = i8;
    }
}
