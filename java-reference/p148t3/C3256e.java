package p148t3;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.e */
/* loaded from: classes.dex */
public final class C3256e {

    /* renamed from: a */
    public final List f16084a;

    /* renamed from: b */
    public final int f16085b;

    public C3256e(int i7, List list) {
        this.f16084a = list;
        this.f16085b = i7;
        if (list.isEmpty() && i7 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i7 >= 0 && i7 < size) {
                return;
            }
        }
        StringBuilder m188o = AbstractC0094y0.m188o(i7, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        m188o.append(AbstractC1806n.m3065M(list));
        m188o.append("'.");
        throw new IllegalArgumentException(m188o.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3256e.class != obj.getClass()) {
            return false;
        }
        C3256e c3256e = (C3256e) obj;
        if (this.f16085b == c3256e.f16085b && AbstractC3367j.m5096a(this.f16084a, c3256e.f16084a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16084a.hashCode() + (this.f16085b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f16085b + ", mergedHistory=" + this.f16084a + ')';
    }

    public C3256e() {
        this(-1, C1813u.f10860e);
    }
}
