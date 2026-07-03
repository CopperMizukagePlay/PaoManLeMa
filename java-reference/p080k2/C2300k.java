package p080k2;

import p060h5.AbstractC1806n;
import p092m.AbstractC2487d;
import p095m2.AbstractC2550a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.k */
/* loaded from: classes.dex */
public final class C2300k implements Comparable {

    /* renamed from: f */
    public static final C2300k f13231f;

    /* renamed from: g */
    public static final C2300k f13232g;

    /* renamed from: h */
    public static final C2300k f13233h;

    /* renamed from: i */
    public static final C2300k f13234i;

    /* renamed from: j */
    public static final C2300k f13235j;

    /* renamed from: k */
    public static final C2300k f13236k;

    /* renamed from: e */
    public final int f13237e;

    static {
        C2300k c2300k = new C2300k(100);
        C2300k c2300k2 = new C2300k(200);
        C2300k c2300k3 = new C2300k(300);
        C2300k c2300k4 = new C2300k(400);
        C2300k c2300k5 = new C2300k(500);
        C2300k c2300k6 = new C2300k(600);
        f13231f = c2300k6;
        C2300k c2300k7 = new C2300k(700);
        C2300k c2300k8 = new C2300k(800);
        C2300k c2300k9 = new C2300k(900);
        f13232g = c2300k3;
        f13233h = c2300k4;
        f13234i = c2300k5;
        f13235j = c2300k6;
        f13236k = c2300k7;
        AbstractC1806n.m3067O(c2300k, c2300k2, c2300k3, c2300k4, c2300k5, c2300k6, c2300k7, c2300k8, c2300k9);
    }

    public C2300k(int i7) {
        this.f13237e = i7;
        boolean z7 = false;
        if (1 <= i7 && i7 < 1001) {
            z7 = true;
        }
        if (!z7) {
            AbstractC2550a.m4078a("Font weight can be in range [1, 1000]. Current value: " + i7);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3367j.m5101f(this.f13237e, ((C2300k) obj).f13237e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2300k)) {
            return false;
        }
        if (this.f13237e == ((C2300k) obj).f13237e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13237e;
    }

    public final String toString() {
        return AbstractC2487d.m4045i(new StringBuilder("FontWeight(weight="), this.f13237e, ')');
    }
}
