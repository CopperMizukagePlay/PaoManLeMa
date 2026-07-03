package p085l0;

import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p037e3.C0687a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.q */
/* loaded from: classes.dex */
public abstract class AbstractC2399q {

    /* renamed from: a */
    public static final C2337a1 f13521a = new C2337a1("provider");

    /* renamed from: b */
    public static final C2337a1 f13522b = new C2337a1("provider");

    /* renamed from: c */
    public static final C2337a1 f13523c = new C2337a1("compositionLocalMap");

    /* renamed from: d */
    public static final C2337a1 f13524d = new C2337a1("providers");

    /* renamed from: e */
    public static final C2337a1 f13525e = new C2337a1("reference");

    /* renamed from: f */
    public static final C0687a f13526f = new C0687a(2);

    /* renamed from: a */
    public static final void m3898a(ArrayList arrayList, int i7, int i8) {
        int m3902e = m3902e(i7, arrayList);
        if (m3902e < 0) {
            m3902e = -(m3902e + 1);
        }
        while (m3902e < arrayList.size() && ((C2392o0) arrayList.get(m3902e)).f13463b < i8) {
        }
    }

    /* renamed from: b */
    public static final void m3899b(C2429z1 c2429z1, ArrayList arrayList, int i7) {
        boolean m3999l = c2429z1.m3999l(i7);
        int[] iArr = c2429z1.f13638b;
        if (m3999l) {
            arrayList.add(c2429z1.m4001n(i7));
            return;
        }
        int i8 = iArr[(i7 * 5) + 3] + i7;
        for (int i9 = i7 + 1; i9 < i8; i9 += iArr[(i9 * 5) + 3]) {
            m3899b(c2429z1, arrayList, i9);
        }
    }

    /* renamed from: c */
    public static final void m3900c(String str) {
        throw new C2371j(AbstractC0094y0.m185l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* renamed from: d */
    public static final Void m3901d(String str) {
        throw new C2371j(AbstractC0094y0.m185l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* renamed from: e */
    public static final int m3902e(int i7, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int m5101f = AbstractC3367j.m5101f(((C2392o0) list.get(i9)).f13463b, i7);
            if (m5101f < 0) {
                i8 = i9 + 1;
            } else if (m5101f > 0) {
                size = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: f */
    public static final void m3903f(C2350d2 c2350d2, int i7, Object obj) {
        int m3772h = c2350d2.m3772h(i7);
        Object[] objArr = c2350d2.f13361c;
        Object obj2 = objArr[m3772h];
        objArr[m3772h] = C2375k.f13421a;
        if (obj == obj2) {
            return;
        }
        m3900c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
