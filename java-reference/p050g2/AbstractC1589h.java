package p050g2;

import java.util.ArrayList;
import java.util.List;
import p039e5.C1162os;
import p073j2.AbstractC2168e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.h */
/* loaded from: classes.dex */
public abstract class AbstractC1589h {

    /* renamed from: a */
    public static final C1587g f10258a = new C1587g("");

    /* renamed from: a */
    public static final List m2569a(C1587g c1587g, int i7, int i8, C1162os c1162os) {
        List list;
        boolean z7;
        if (i7 == i8 || (list = c1587g.f10238e) == null) {
            return null;
        }
        if (i7 == 0 && i8 >= c1587g.f10239f.length()) {
            if (c1162os == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = list.get(i9);
                if (((Boolean) c1162os.mo23f(((C1583e) obj).f10229a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C1583e c1583e = (C1583e) list.get(i10);
            boolean z8 = true;
            if (c1162os != null) {
                z7 = ((Boolean) c1162os.mo23f(c1583e.f10229a)).booleanValue();
            } else {
                z7 = true;
            }
            if (!z7 || !m2570b(i7, i8, c1583e.f10230b, c1583e.f10231c)) {
                z8 = false;
            }
            if (z8) {
                arrayList2.add(new C1583e((InterfaceC1577b) c1583e.f10229a, AbstractC2168e.m3530q(c1583e.f10230b, i7, i8) - i7, AbstractC2168e.m3530q(c1583e.f10231c, i7, i8) - i7, c1583e.f10232d));
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static final boolean m2570b(int i7, int i8, int i9, int i10) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (i7 == i8) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i9 == i10) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z12 = z7 | z8;
        if (i7 == i9) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z13 = z12 & z9;
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 < i8) {
            z11 = true;
        }
        return (z10 & z11) | z13;
    }
}
