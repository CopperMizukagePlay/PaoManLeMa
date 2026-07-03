package p060h5;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p015b6.C0308o;
import p015b6.C0310q;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p174w5.AbstractC3784a;

/* renamed from: h5.m */
/* loaded from: classes.dex */
public abstract class AbstractC1805m extends AbstractC1811s {
    /* renamed from: A0 */
    public static List m3033A0(int i7, List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (i7 >= 0) {
            if (i7 == 0) {
                return C1813u.f10860e;
            }
            int size = list.size();
            if (i7 >= size) {
                return m3035C0(list);
            }
            if (i7 == 1) {
                return AbstractC3784a.m5817z(m3052p0(list));
            }
            ArrayList arrayList = new ArrayList(i7);
            if (list instanceof RandomAccess) {
                for (int i8 = size - i7; i8 < size; i8++) {
                    arrayList.add(list.get(i8));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i7);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: B0 */
    public static final void m3034B0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC3367j.m5100e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: C0 */
    public static List m3035C0(Iterable iterable) {
        Object next;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m3036D0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return AbstractC3784a.m5817z(next);
            }
            return C1813u.f10860e;
        }
        return AbstractC1806n.m3070R(m3037E0(iterable));
    }

    /* renamed from: D0 */
    public static ArrayList m3036D0(Collection collection) {
        AbstractC3367j.m5100e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: E0 */
    public static final List m3037E0(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m3036D0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m3034B0(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: F0 */
    public static Set m3038F0(Iterable iterable) {
        Object next;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1817y.m3082N(collection.size()));
                    m3034B0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return AbstractC1793a0.m2970J(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m3034B0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return AbstractC1793a0.m2970J(linkedHashSet2.iterator().next());
            }
        }
        return C1815w.f10862e;
    }

    /* renamed from: c0 */
    public static C0308o m3039c0(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        return new C0308o(4, iterable);
    }

    /* renamed from: d0 */
    public static double m3040d0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        Iterator it = list.iterator();
        double d7 = 0.0d;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += ((Number) it.next()).doubleValue();
            i7++;
            if (i7 < 0) {
                AbstractC1806n.m3071S();
                throw null;
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    /* renamed from: e0 */
    public static boolean m3041e0(Iterable iterable, Object obj) {
        int i7;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i7 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i8 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i8 >= 0) {
                        if (AbstractC3367j.m5096a(obj, next)) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    } else {
                        AbstractC1806n.m3072T();
                        throw null;
                    }
                } else {
                    i7 = -1;
                    break;
                }
            }
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public static List m3042f0(Iterable iterable) {
        LinkedHashSet linkedHashSet;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            m3034B0(iterable, linkedHashSet);
        }
        return m3035C0(linkedHashSet);
    }

    /* renamed from: g0 */
    public static List m3043g0(Iterable iterable, int i7) {
        ArrayList arrayList;
        Object obj;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (i7 >= 0) {
            if (i7 == 0) {
                return m3035C0(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i7;
                if (size <= 0) {
                    return C1813u.f10860e;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        obj = m3052p0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return AbstractC3784a.m5817z(obj);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i7 < size2) {
                            arrayList.add(list.get(i7));
                            i7++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i7);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i8 = 0;
            for (Object obj2 : iterable) {
                if (i8 >= i7) {
                    arrayList.add(obj2);
                } else {
                    i8++;
                }
            }
            return AbstractC1806n.m3070R(arrayList);
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: h0 */
    public static List m3044h0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m3062z0(list, size);
    }

    /* renamed from: i0 */
    public static Object m3045i0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: j0 */
    public static Object m3046j0(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: k0 */
    public static Object m3047k0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: l0 */
    public static Object m3048l0(int i7, List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (i7 >= 0 && i7 < list.size()) {
            return list.get(i7);
        }
        return null;
    }

    /* renamed from: m0 */
    public static final void m3049m0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC3279c interfaceC3279c) {
        AbstractC3367j.m5100e(iterable, "<this>");
        sb.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            AbstractC3393k.m5136g(sb, obj, interfaceC3279c);
        }
        sb.append(charSequence3);
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m3050n0(List list, StringBuilder sb, C0310q c0310q, int i7) {
        if ((i7 & 64) != 0) {
            c0310q = null;
        }
        m3049m0(list, sb, "\n", "", "", "...", c0310q);
    }

    /* renamed from: o0 */
    public static String m3051o0(Iterable iterable, String str, String str2, String str3, InterfaceC3279c interfaceC3279c, int i7) {
        String str4;
        String str5;
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i7 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i7 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i7 & 32) != 0) {
            interfaceC3279c = null;
        }
        AbstractC3367j.m5100e(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        m3049m0(iterable, sb, str6, str4, str5, "...", interfaceC3279c);
        return sb.toString();
    }

    /* renamed from: p0 */
    public static Object m3052p0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(AbstractC1806n.m3066N(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: q0 */
    public static Object m3053q0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: r0 */
    public static Double m3054r0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: s0 */
    public static Float m3055s0(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: t0 */
    public static Object m3056t0(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: u0 */
    public static ArrayList m3057u0(List list, Object obj) {
        AbstractC3367j.m5100e(list, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        boolean z7 = false;
        for (Object obj2 : list) {
            boolean z8 = true;
            if (!z7 && AbstractC3367j.m5096a(obj2, obj)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: v0 */
    public static ArrayList m3058v0(Collection collection, Iterable iterable) {
        AbstractC3367j.m5100e(collection, "<this>");
        AbstractC3367j.m5100e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        AbstractC1811s.m3076X(iterable, arrayList2);
        return arrayList2;
    }

    /* renamed from: w0 */
    public static ArrayList m3059w0(Collection collection, Object obj) {
        AbstractC3367j.m5100e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: x0 */
    public static List m3060x0(List list) {
        if (list.size() <= 1) {
            return m3035C0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC3367j.m5100e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC1804l.m3010C(array);
    }

    /* renamed from: y0 */
    public static List m3061y0(Iterable iterable, Comparator comparator) {
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m3035C0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            AbstractC3367j.m5100e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return AbstractC1804l.m3010C(array);
        }
        List m3037E0 = m3037E0(iterable);
        AbstractC1810r.m3075W(m3037E0, comparator);
        return m3037E0;
    }

    /* renamed from: z0 */
    public static List m3062z0(Iterable iterable, int i7) {
        Object next;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (i7 >= 0) {
            if (i7 == 0) {
                return C1813u.f10860e;
            }
            if (iterable instanceof Collection) {
                if (i7 >= ((Collection) iterable).size()) {
                    return m3035C0(iterable);
                }
                if (i7 == 1) {
                    if (iterable instanceof List) {
                        next = m3045i0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return AbstractC3784a.m5817z(next);
                }
            }
            ArrayList arrayList = new ArrayList(i7);
            Iterator it2 = iterable.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return AbstractC1806n.m3070R(arrayList);
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Requested element count ", " is less than zero.").toString());
    }
}
