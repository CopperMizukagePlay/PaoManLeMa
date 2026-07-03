package p019c1;

import java.util.Comparator;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.v */
/* loaded from: classes.dex */
public final class C0378v implements Comparator {

    /* renamed from: e */
    public static final C0378v f1275e = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0377u c0377u = (C0377u) obj;
        C0377u c0377u2 = (C0377u) obj2;
        int i7 = 0;
        if (AbstractC0362f.m820r(c0377u) && AbstractC0362f.m820r(c0377u2)) {
            C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
            C3502g0 m5382v2 = AbstractC3498f.m5382v(c0377u2);
            if (!AbstractC3367j.m5096a(m5382v, m5382v2)) {
                C3502g0[] c3502g0Arr = new C3502g0[16];
                int i8 = 0;
                while (m5382v != null) {
                    int i9 = i8 + 1;
                    if (c3502g0Arr.length < i9) {
                        int length = c3502g0Arr.length;
                        ?? r52 = new Object[Math.max(i9, length * 2)];
                        System.arraycopy(c3502g0Arr, 0, r52, 0, length);
                        c3502g0Arr = r52;
                    }
                    if (i8 != 0) {
                        System.arraycopy(c3502g0Arr, 0, c3502g0Arr, 0 + 1, i8 + 0);
                    }
                    c3502g0Arr[0] = m5382v;
                    i8++;
                    m5382v = m5382v.m5447u();
                }
                C3502g0[] c3502g0Arr2 = new C3502g0[16];
                int i10 = 0;
                while (m5382v2 != null) {
                    int i11 = i10 + 1;
                    if (c3502g0Arr2.length < i11) {
                        int length2 = c3502g0Arr2.length;
                        ?? r53 = new Object[Math.max(i11, length2 * 2)];
                        System.arraycopy(c3502g0Arr2, 0, r53, 0, length2);
                        c3502g0Arr2 = r53;
                    }
                    if (i10 != 0) {
                        System.arraycopy(c3502g0Arr2, 0, c3502g0Arr2, 0 + 1, i10 + 0);
                    }
                    c3502g0Arr2[0] = m5382v2;
                    i10++;
                    m5382v2 = m5382v2.m5447u();
                }
                int min = Math.min(i8 - 1, i10 - 1);
                if (min >= 0) {
                    while (AbstractC3367j.m5096a(c3502g0Arr[i7], c3502g0Arr2[i7])) {
                        if (i7 != min) {
                            i7++;
                        }
                    }
                    return AbstractC3367j.m5101f(c3502g0Arr[i7].m5448v(), c3502g0Arr2[i7].m5448v());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC0362f.m820r(c0377u)) {
                return -1;
            }
            if (AbstractC0362f.m820r(c0377u2)) {
                return 1;
            }
        }
        return 0;
    }
}
