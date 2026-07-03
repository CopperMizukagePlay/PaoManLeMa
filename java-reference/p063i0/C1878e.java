package p063i0;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0003a1;
import p060h5.AbstractC1805m;
import p060h5.C1814v;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p158u5.C3377t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e */
/* loaded from: classes.dex */
public final class C1878e implements InterfaceC3217l0 {
    /* renamed from: c */
    public static final void m3114c(ArrayList arrayList, C3377t c3377t, InterfaceC3223n0 interfaceC3223n0, ArrayList arrayList2, ArrayList arrayList3, C3377t c3377t2, ArrayList arrayList4, C3377t c3377t3, C3377t c3377t4) {
        float f7 = AbstractC1930k.f11409d;
        if (!arrayList.isEmpty()) {
            c3377t.f16449e = interfaceC3223n0.mo4513Q(f7) + c3377t.f16449e;
        }
        arrayList.add(0, AbstractC1805m.m3035C0(arrayList2));
        arrayList3.add(Integer.valueOf(c3377t2.f16449e));
        arrayList4.add(Integer.valueOf(c3377t.f16449e));
        c3377t.f16449e += c3377t2.f16449e;
        c3377t3.f16449e = Math.max(c3377t3.f16449e, c3377t4.f16449e);
        arrayList2.clear();
        c3377t4.f16449e = 0;
        c3377t2.f16449e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [u5.t, java.lang.Object] */
    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ?? obj = new Object();
        Object obj2 = new Object();
        ArrayList arrayList6 = new ArrayList();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        float f7 = AbstractC1930k.f11408c;
        float f8 = AbstractC1930k.f11406a;
        int size = list.size();
        int i7 = 0;
        C3377t c3377t = obj2;
        while (i7 < size) {
            AbstractC3239v0 mo4918e = ((InterfaceC3214k0) list.get(i7)).mo4918e(j6);
            C3377t c3377t2 = c3377t;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                C3377t c3377t3 = c3377t;
                if (interfaceC3223n0.mo4513Q(f7) + obj3.f16449e + mo4918e.f16053e <= C3091a.m4760h(j6)) {
                    arrayList3 = arrayList7;
                    c3377t2 = c3377t3;
                } else {
                    arrayList3 = arrayList7;
                    C3377t c3377t4 = c3377t3;
                    m3114c(arrayList3, c3377t4, interfaceC3223n0, arrayList6, arrayList4, obj4, arrayList5, obj, obj3);
                    c3377t2 = c3377t4;
                }
            }
            if (!arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
                obj3.f16449e = interfaceC3223n0.mo4513Q(f7) + obj3.f16449e;
            } else {
                arrayList2 = arrayList3;
            }
            arrayList6.add(mo4918e);
            obj3.f16449e += mo4918e.f16053e;
            obj4.f16449e = Math.max(obj4.f16449e, mo4918e.f16054f);
            i7++;
            arrayList3 = arrayList2;
            c3377t = c3377t2;
        }
        ArrayList arrayList8 = arrayList3;
        if (!arrayList6.isEmpty()) {
            float f9 = AbstractC1930k.f11406a;
            arrayList = arrayList8;
            m3114c(arrayList, c3377t, interfaceC3223n0, arrayList6, arrayList4, obj4, arrayList5, obj, obj3);
        } else {
            arrayList = arrayList8;
        }
        int max = Math.max(obj.f16449e, C3091a.m4762j(j6));
        int max2 = Math.max(c3377t.f16449e, C3091a.m4761i(j6));
        float f10 = AbstractC1930k.f11406a;
        return interfaceC3223n0.mo4941K(max, max2, C1814v.f10861e, new C0003a1(arrayList, interfaceC3223n0, max, arrayList5));
    }
}
