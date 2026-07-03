package p060h5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.r */
/* loaded from: classes.dex */
public abstract class AbstractC1810r extends AbstractC1809q {
    /* renamed from: W */
    public static void m3075W(List list, Comparator comparator) {
        AbstractC3367j.m5100e(list, "<this>");
        AbstractC3367j.m5100e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
