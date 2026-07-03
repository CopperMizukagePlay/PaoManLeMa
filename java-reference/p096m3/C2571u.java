package p096m3;

import android.util.SparseArray;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.u */
/* loaded from: classes.dex */
public final class C2571u {

    /* renamed from: a */
    public final SparseArray f13964a;

    /* renamed from: b */
    public C2573w f13965b;

    public C2571u(int i7) {
        this.f13964a = new SparseArray(i7);
    }

    /* renamed from: a */
    public final void m4093a(C2573w c2573w, int i7, int i8) {
        C2571u c2571u;
        int m4104a = c2573w.m4104a(i7);
        SparseArray sparseArray = this.f13964a;
        if (sparseArray == null) {
            c2571u = null;
        } else {
            c2571u = (C2571u) sparseArray.get(m4104a);
        }
        if (c2571u == null) {
            c2571u = new C2571u(1);
            sparseArray.put(c2573w.m4104a(i7), c2571u);
        }
        if (i8 > i7) {
            c2571u.m4093a(c2573w, i7 + 1, i8);
        } else {
            c2571u.f13965b = c2573w;
        }
    }
}
