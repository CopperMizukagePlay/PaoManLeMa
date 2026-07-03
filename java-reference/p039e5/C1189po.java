package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1807o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.po */
/* loaded from: classes.dex */
public final class C1189po {

    /* renamed from: a */
    public final int f6926a;

    /* renamed from: b */
    public final String f6927b;

    /* renamed from: c */
    public final List f6928c;

    /* renamed from: d */
    public final List f6929d;

    public C1189po(int i7, String str, List list, List list2) {
        AbstractC3367j.m5100e(str, "name");
        AbstractC3367j.m5100e(list, "downloadEndpoints");
        AbstractC3367j.m5100e(list2, "uploadEndpoints");
        this.f6926a = i7;
        this.f6927b = str;
        this.f6928c = list;
        this.f6929d = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* renamed from: a */
    public static C1189po m2080a(C1189po c1189po, int i7, String str, ArrayList arrayList, ArrayList arrayList2, int i8) {
        if ((i8 & 1) != 0) {
            i7 = c1189po.f6926a;
        }
        if ((i8 & 2) != 0) {
            str = c1189po.f6927b;
        }
        ArrayList arrayList3 = arrayList;
        if ((i8 & 4) != 0) {
            arrayList3 = c1189po.f6928c;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i8 & 8) != 0) {
            arrayList4 = c1189po.f6929d;
        }
        c1189po.getClass();
        AbstractC3367j.m5100e(str, "name");
        AbstractC3367j.m5100e(arrayList3, "downloadEndpoints");
        AbstractC3367j.m5100e(arrayList4, "uploadEndpoints");
        return new C1189po(i7, str, arrayList3, arrayList4);
    }

    /* renamed from: b */
    public final ArrayList m2081b() {
        List list = this.f6928c;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1006jr) it.next()).f5163a);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String m2082c() {
        return this.f6927b;
    }

    /* renamed from: d */
    public final ArrayList m2083d() {
        List list = this.f6929d;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1006jr) it.next()).f5163a);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189po)) {
            return false;
        }
        C1189po c1189po = (C1189po) obj;
        if (this.f6926a == c1189po.f6926a && AbstractC3367j.m5096a(this.f6927b, c1189po.f6927b) && AbstractC3367j.m5096a(this.f6928c, c1189po.f6928c) && AbstractC3367j.m5096a(this.f6929d, c1189po.f6929d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6929d.hashCode() + AbstractC0094y0.m176c(this.f6928c, AbstractC0094y0.m175b(Integer.hashCode(this.f6926a) * 31, 31, this.f6927b), 31);
    }

    public final String toString() {
        return "SpeedProfile(id=" + this.f6926a + ", name=" + this.f6927b + ", downloadEndpoints=" + this.f6928c + ", uploadEndpoints=" + this.f6929d + ")";
    }
}
