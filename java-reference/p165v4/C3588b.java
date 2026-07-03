package p165v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p157u4.AbstractC3355a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.b */
/* loaded from: classes.dex */
public final class C3588b {

    /* renamed from: a */
    public final HashMap f17231a = new HashMap();

    /* renamed from: a */
    public final int[] m5579a() {
        ArrayList arrayList = new ArrayList();
        int i7 = -1;
        for (Map.Entry entry : this.f17231a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i7) {
                i7 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i7) {
                arrayList.add(entry.getKey());
            }
        }
        return AbstractC3355a.m5088a(arrayList);
    }

    /* renamed from: b */
    public final void m5580b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f17231a;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() + 1));
    }
}
