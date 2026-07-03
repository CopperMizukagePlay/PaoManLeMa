package p060h5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p015b6.C0300g;
import p015b6.C0301h;
import p053g5.C1687f;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.y */
/* loaded from: classes.dex */
public abstract class AbstractC1817y extends AbstractC2710c {
    /* renamed from: M */
    public static Object m3081M(Object obj, Map map) {
        AbstractC3367j.m5100e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    /* renamed from: N */
    public static int m3082N(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: O */
    public static Map m3083O(C1687f... c1687fArr) {
        if (c1687fArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N(c1687fArr.length));
            for (C1687f c1687f : c1687fArr) {
                linkedHashMap.put(c1687f.f10471e, c1687f.f10472f);
            }
            return linkedHashMap;
        }
        return C1814v.f10861e;
    }

    /* renamed from: P */
    public static final Map m3084P(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                return linkedHashMap;
            }
            return m3090V(linkedHashMap);
        }
        return C1814v.f10861e;
    }

    /* renamed from: Q */
    public static Map m3085Q(C0301h c0301h) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0300g c0300g = new C0300g(c0301h);
        while (c0300g.hasNext()) {
            C1687f c1687f = (C1687f) c0300g.next();
            linkedHashMap.put(c1687f.f10471e, c1687f.f10472f);
        }
        return m3084P(linkedHashMap);
    }

    /* renamed from: R */
    public static Map m3086R(Iterable iterable) {
        Object next;
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N(collection.size()));
                    m3088T(iterable, linkedHashMap);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                C1687f c1687f = (C1687f) next;
                AbstractC3367j.m5100e(c1687f, "pair");
                Map singletonMap = Collections.singletonMap(c1687f.f10471e, c1687f.f10472f);
                AbstractC3367j.m5099d(singletonMap, "singletonMap(...)");
                return singletonMap;
            }
            return C1814v.f10861e;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m3088T(iterable, linkedHashMap2);
        return m3084P(linkedHashMap2);
    }

    /* renamed from: S */
    public static Map m3087S(LinkedHashMap linkedHashMap) {
        AbstractC3367j.m5100e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                return m3089U(linkedHashMap);
            }
            return m3090V(linkedHashMap);
        }
        return C1814v.f10861e;
    }

    /* renamed from: T */
    public static final void m3088T(Iterable iterable, LinkedHashMap linkedHashMap) {
        AbstractC3367j.m5100e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1687f c1687f = (C1687f) it.next();
            linkedHashMap.put(c1687f.f10471e, c1687f.f10472f);
        }
    }

    /* renamed from: U */
    public static LinkedHashMap m3089U(Map map) {
        AbstractC3367j.m5100e(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* renamed from: V */
    public static final Map m3090V(Map map) {
        AbstractC3367j.m5100e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC3367j.m5099d(singletonMap, "with(...)");
        return singletonMap;
    }
}
