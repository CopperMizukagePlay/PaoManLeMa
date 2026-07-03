package p144t;

import java.util.List;
import p060h5.C1814v;
import p063i0.C1963o0;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p177x0.C3802j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.p */
/* loaded from: classes.dex */
public final class C3148p implements InterfaceC3217l0 {

    /* renamed from: a */
    public final C3802j f15823a;

    /* renamed from: b */
    public final boolean f15824b;

    public C3148p(C3802j c3802j, boolean z7) {
        this.f15823a = c3802j;
        this.f15824b = z7;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [u5.t, java.lang.Object] */
    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        long m4753a;
        boolean isEmpty = list.isEmpty();
        C1814v c1814v = C1814v.f10861e;
        if (isEmpty) {
            return interfaceC3223n0.mo4941K(C3091a.m4762j(j6), C3091a.m4761i(j6), c1814v, C3140l.f15802h);
        }
        if (this.f15824b) {
            m4753a = j6;
        } else {
            m4753a = C3091a.m4753a(j6, 0, 0, 0, 0, 10);
        }
        if (list.size() == 1) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(0);
            interfaceC3214k0.mo4921n();
            AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m4753a);
            int max = Math.max(C3091a.m4762j(j6), mo4918e.f16053e);
            int max2 = Math.max(C3091a.m4761i(j6), mo4918e.f16054f);
            return interfaceC3223n0.mo4941K(max, max2, c1814v, new C3146o(mo4918e, interfaceC3214k0, interfaceC3223n0, max, max2, this));
        }
        AbstractC3239v0[] abstractC3239v0Arr = new AbstractC3239v0[list.size()];
        ?? obj = new Object();
        obj.f16449e = C3091a.m4762j(j6);
        ?? obj2 = new Object();
        obj2.f16449e = C3091a.m4761i(j6);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i7);
            interfaceC3214k02.mo4921n();
            AbstractC3239v0 mo4918e2 = interfaceC3214k02.mo4918e(m4753a);
            abstractC3239v0Arr[i7] = mo4918e2;
            obj.f16449e = Math.max(obj.f16449e, mo4918e2.f16053e);
            obj2.f16449e = Math.max(obj2.f16449e, mo4918e2.f16054f);
        }
        return interfaceC3223n0.mo4941K(obj.f16449e, obj2.f16449e, c1814v, new C1963o0(abstractC3239v0Arr, list, interfaceC3223n0, obj, obj2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3148p) {
                C3148p c3148p = (C3148p) obj;
                if (!this.f15823a.equals(c3148p.f15823a) || this.f15824b != c3148p.f15824b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15824b) + (this.f15823a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f15823a + ", propagateMinConstraints=" + this.f15824b + ')';
    }
}
