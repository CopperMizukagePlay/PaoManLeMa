package p024c6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.l */
/* loaded from: classes.dex */
public abstract class AbstractC0445l extends AbstractC3393k {
    /* renamed from: C */
    public static String m961C(String str) {
        Comparable comparable;
        int i7;
        String str2;
        AbstractC3367j.m5100e(str, "<this>");
        List m941e0 = AbstractC0444k.m941e0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m941e0) {
            if (!AbstractC0444k.m937a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (!AbstractC2710c.m4323F(str3.charAt(i10))) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i10));
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        int length2 = str.length();
        m941e0.size();
        int m3066N = AbstractC1806n.m3066N(m941e0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : m941e0) {
            int i11 = i8 + 1;
            if (i8 >= 0) {
                String str4 = (String) obj3;
                if ((i8 == 0 || i8 == m3066N) && AbstractC0444k.m937a0(str4)) {
                    str2 = null;
                } else {
                    str2 = AbstractC0444k.m930T(str4, i7);
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i8 = i11;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC1805m.m3050n0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    /* renamed from: D */
    public static String m962D(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        if (!AbstractC0444k.m937a0("|")) {
            List m941e0 = AbstractC0444k.m941e0(str);
            int length = str.length();
            m941e0.size();
            int m3066N = AbstractC1806n.m3066N(m941e0);
            ArrayList arrayList = new ArrayList();
            Iterator it = m941e0.iterator();
            int i7 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i8 = i7 + 1;
                    if (i7 >= 0) {
                        String str3 = (String) next;
                        if ((i7 != 0 && i7 != m3066N) || !AbstractC0444k.m937a0(str3)) {
                            int length2 = str3.length();
                            int i9 = 0;
                            while (true) {
                                if (i9 < length2) {
                                    if (!AbstractC2710c.m4323F(str3.charAt(i9))) {
                                        break;
                                    }
                                    i9++;
                                } else {
                                    i9 = -1;
                                    break;
                                }
                            }
                            if (i9 != -1 && AbstractC0451r.m970L(str3, "|", i9, false)) {
                                str2 = str3.substring("|".length() + i9);
                                AbstractC3367j.m5099d(str2, "substring(...)");
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i7 = i8;
                    } else {
                        AbstractC1806n.m3072T();
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    AbstractC1805m.m3050n0(arrayList, sb, null, 124);
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
    }
}
