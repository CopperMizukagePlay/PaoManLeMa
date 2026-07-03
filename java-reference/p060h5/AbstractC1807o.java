package p060h5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.o */
/* loaded from: classes.dex */
public abstract class AbstractC1807o extends AbstractC1806n {
    /* renamed from: U */
    public static int m3073U(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* renamed from: V */
    public static ArrayList m3074V(Iterable iterable) {
        AbstractC3367j.m5100e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC1811s.m3076X((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
