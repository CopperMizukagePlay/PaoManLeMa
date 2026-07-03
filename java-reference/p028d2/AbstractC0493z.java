package p028d2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p027d1.C0465c;
import p053g5.C1687f;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1810r;
import p077k.AbstractC2203m;
import p077k.C2221w;
import p140s2.EnumC3103m;
import p160v.C3423m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.z */
/* loaded from: classes.dex */
public abstract class AbstractC0493z {

    /* renamed from: a */
    public static final Comparator[] f1776a;

    /* renamed from: b */
    public static final C0486s f1777b;

    static {
        C0472e c0472e;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                c0472e = C0472e.f1646g;
            } else {
                c0472e = C0472e.f1645f;
            }
            comparatorArr[i7] = new C0492y(new C0492y(c0472e), 1);
        }
        f1776a = comparatorArr;
        f1777b = C0486s.f1723y;
    }

    /* renamed from: a */
    public static final void m1067a(C0482o c0482o, ArrayList arrayList, C3423m0 c3423m0, C3423m0 c3423m02, C2221w c2221w) {
        C0477j c0477j = c0482o.f1694d;
        Object m3592g = c0477j.f1683e.m3592g(AbstractC0487t.f1752m);
        if (m3592g == null) {
            m3592g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) m3592g).booleanValue();
        if ((booleanValue || ((Boolean) c3423m02.mo23f(c0482o)).booleanValue()) && ((Boolean) c3423m0.mo23f(c0482o)).booleanValue()) {
            arrayList.add(c0482o);
        }
        if (booleanValue) {
            c2221w.m3652g(c0482o.f1697g, m1068b(c0482o, c3423m0, c3423m02, C0482o.m1038j(7, c0482o)));
            return;
        }
        List m1038j = C0482o.m1038j(7, c0482o);
        int size = m1038j.size();
        for (int i7 = 0; i7 < size; i7++) {
            m1067a((C0482o) m1038j.get(i7), arrayList, c3423m0, c3423m02, c2221w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[LOOP:1: B:11:0x0044->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[EDGE_INSN: B:30:0x00ee->B:31:0x00ee BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00e8], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m1068b(C0482o c0482o, C3423m0 c3423m0, C3423m0 c3423m02, List list) {
        char c7;
        boolean z7;
        boolean z8;
        C2221w c2221w = AbstractC2203m.f12711a;
        C2221w c2221w2 = new C2221w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            m1067a((C0482o) list.get(i7), arrayList, c3423m0, c3423m02, c2221w2);
        }
        if (c0482o.f1693c.f16866C == EnumC3103m.f15704f) {
            c7 = 1;
        } else {
            c7 = 0;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int m3066N = AbstractC1806n.m3066N(arrayList);
        if (m3066N >= 0) {
            int i8 = 0;
            while (true) {
                C0482o c0482o2 = (C0482o) arrayList.get(i8);
                if (i8 != 0) {
                    float f7 = c0482o2.m1046h().f1626b;
                    float f8 = c0482o2.m1046h().f1628d;
                    if (f7 >= f8) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    int m3066N2 = AbstractC1806n.m3066N(arrayList2);
                    if (m3066N2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            C0465c c0465c = (C0465c) ((C1687f) arrayList2.get(i9)).f10471e;
                            float f9 = c0465c.f1626b;
                            float f10 = c0465c.f1628d;
                            if (f9 >= f10) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z7 && !z8 && Math.max(f7, f9) < Math.min(f8, f10)) {
                                arrayList2.set(i9, new C1687f(new C0465c(Math.max(c0465c.f1625a, 0.0f), Math.max(c0465c.f1626b, f7), Math.min(c0465c.f1627c, Float.POSITIVE_INFINITY), Math.min(f10, f8)), ((C1687f) arrayList2.get(i9)).f10472f));
                                ((List) ((C1687f) arrayList2.get(i9)).f10472f).add(c0482o2);
                                break;
                            }
                            if (i9 == m3066N2) {
                                break;
                            }
                            i9++;
                        }
                        if (i8 != m3066N) {
                            break;
                        }
                        i8++;
                    }
                }
                arrayList2.add(new C1687f(c0482o2.m1046h(), AbstractC1806n.m3069Q(c0482o2)));
                if (i8 != m3066N) {
                }
            }
        }
        AbstractC1810r.m3075W(arrayList2, C0472e.f1647h);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f1776a[c7 ^ 1];
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C1687f c1687f = (C1687f) arrayList2.get(i10);
            AbstractC1810r.m3075W((List) c1687f.f10472f, comparator);
            arrayList3.addAll((Collection) c1687f.f10472f);
        }
        AbstractC1810r.m3075W(arrayList3, new C0491x(0, f1777b));
        int i11 = 0;
        while (i11 <= AbstractC1806n.m3066N(arrayList3)) {
            List list2 = (List) c2221w2.m3612b(((C0482o) arrayList3.get(i11)).f1697g);
            if (list2 != null) {
                if (!((Boolean) c3423m02.mo23f(arrayList3.get(i11))).booleanValue()) {
                    arrayList3.remove(i11);
                } else {
                    i11++;
                }
                arrayList3.addAll(i11, list2);
                i11 += list2.size();
            } else {
                i11++;
            }
        }
        return arrayList3;
    }
}
