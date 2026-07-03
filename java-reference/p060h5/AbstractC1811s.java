package p060h5;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p015b6.C0308o;
import p024c6.C0437d;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.s */
/* loaded from: classes.dex */
public abstract class AbstractC1811s extends AbstractC1810r {
    /* renamed from: X */
    public static void m3076X(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC3367j.m5100e(abstractCollection, "<this>");
        AbstractC3367j.m5100e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: Y */
    public static void m3077Y(ArrayList arrayList, C0308o c0308o) {
        Iterator it = c0308o.iterator();
        while (true) {
            C0437d c0437d = (C0437d) it;
            if (c0437d.hasNext()) {
                arrayList.add(c0437d.next());
            } else {
                return;
            }
        }
    }

    /* renamed from: Z */
    public static final boolean m3078Z(Iterable iterable, InterfaceC3279c interfaceC3279c) {
        Iterator it = iterable.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC3279c.mo23f(it.next())).booleanValue()) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    /* renamed from: a0 */
    public static void m3079a0(Iterable iterable, InterfaceC3279c interfaceC3279c) {
        AbstractC3367j.m5100e(iterable, "<this>");
        m3078Z(iterable, interfaceC3279c);
    }

    /* renamed from: b0 */
    public static void m3080b0(List list, InterfaceC3279c interfaceC3279c) {
        int m3066N;
        AbstractC3367j.m5100e(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC3594a) && !(list instanceof InterfaceC3595b)) {
                AbstractC3382y.m5113d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            m3078Z(list, interfaceC3279c);
            return;
        }
        int m3066N2 = AbstractC1806n.m3066N(list);
        int i7 = 0;
        if (m3066N2 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) interfaceC3279c.mo23f(obj)).booleanValue()) {
                    if (i8 != i7) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i7 == m3066N2) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i8;
        }
        if (i7 >= list.size() || i7 > (m3066N = AbstractC1806n.m3066N(list))) {
            return;
        }
        while (true) {
            list.remove(m3066N);
            if (m3066N != i7) {
                m3066N--;
            } else {
                return;
            }
        }
    }
}
