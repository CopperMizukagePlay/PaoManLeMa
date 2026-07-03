package p060h5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a0.AbstractC0094y0;
import p066i3.AbstractC2067b;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;
import p195z5.C3877b;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.n */
/* loaded from: classes.dex */
public abstract class AbstractC1806n extends AbstractC3784a {
    /* renamed from: K */
    public static ArrayList m3063K(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1802j(objArr, true));
    }

    /* renamed from: L */
    public static int m3064L(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC3367j.m5100e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i7 = 0;
        if (size >= 0) {
            if (size <= size2) {
                int i8 = size - 1;
                while (i7 <= i8) {
                    int i9 = (i7 + i8) >>> 1;
                    int m3284i = AbstractC2067b.m3284i((Comparable) arrayList.get(i9), comparable);
                    if (m3284i < 0) {
                        i7 = i9 + 1;
                    } else if (m3284i > 0) {
                        i8 = i9 - 1;
                    } else {
                        return i9;
                    }
                }
                return -(i7 + 1);
            }
            throw new IndexOutOfBoundsException(AbstractC0094y0.m183j(size, size2, "toIndex (", ") is greater than size (", ")."));
        }
        throw new IllegalArgumentException(AbstractC0094y0.m183j(0, size, "fromIndex (", ") is greater than toIndex (", ")."));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z5.b, z5.d] */
    /* renamed from: M */
    public static C3879d m3065M(Collection collection) {
        AbstractC3367j.m5100e(collection, "<this>");
        return new C3877b(0, collection.size() - 1, 1);
    }

    /* renamed from: N */
    public static int m3066N(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: O */
    public static List m3067O(Object... objArr) {
        AbstractC3367j.m5100e(objArr, "elements");
        if (objArr.length > 0) {
            return AbstractC1804l.m3010C(objArr);
        }
        return C1813u.f10860e;
    }

    /* renamed from: P */
    public static ArrayList m3068P(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static ArrayList m3069Q(Object... objArr) {
        AbstractC3367j.m5100e(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1802j(objArr, true));
    }

    /* renamed from: R */
    public static final List m3070R(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return AbstractC3784a.m5817z(list.get(0));
        }
        return C1813u.f10860e;
    }

    /* renamed from: S */
    public static void m3071S() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: T */
    public static void m3072T() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
