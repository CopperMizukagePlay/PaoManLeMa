package p144t;

import java.util.List;
import p001a0.C0003a1;
import p060h5.C1814v;
import p067i4.AbstractC2072e;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3228q;
import p158u5.AbstractC3367j;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.o0 */
/* loaded from: classes.dex */
public final class C3147o0 implements InterfaceC3217l0, InterfaceC3141l0 {

    /* renamed from: a */
    public final InterfaceC3128f f15821a;

    /* renamed from: b */
    public final C3801i f15822b;

    public C3147o0(InterfaceC3128f interfaceC3128f, C3801i c3801i) {
        this.f15821a = interfaceC3128f;
        this.f15822b = c3801i;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        return AbstractC3122c.m4831d(this, C3091a.m4762j(j6), C3091a.m4761i(j6), C3091a.m4760h(j6), C3091a.m4759g(j6), interfaceC3223n0.mo4513Q(this.f15821a.mo4835a()), interfaceC3223n0, list, new AbstractC3239v0[list.size()], list.size());
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: b */
    public final int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int round;
        int i8;
        int i9;
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15821a.mo4835a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo4513Q, i7);
        int size = list.size();
        int i10 = 0;
        float f7 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i11);
            float m4830c = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k0));
            if (m4830c == 0.0f) {
                if (i7 == Integer.MAX_VALUE) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = i7 - min;
                }
                int min2 = Math.min(interfaceC3214k0.mo4917c0(Integer.MAX_VALUE), i9);
                min += min2;
                i10 = Math.max(i10, interfaceC3214k0.mo4919e0(min2));
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
            }
        }
        if (f7 == 0.0f) {
            round = 0;
        } else if (i7 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i7 - min, 0) / f7);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i12);
            float m4830c2 = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k02));
            if (m4830c2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i8 = Math.round(round * m4830c2);
                } else {
                    i8 = Integer.MAX_VALUE;
                }
                i10 = Math.max(i10, interfaceC3214k02.mo4919e0(i8));
            }
        }
        return i10;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: c */
    public final int mo4844c(AbstractC3239v0 abstractC3239v0) {
        return abstractC3239v0.f16054f;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15821a.mo4835a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i10);
            float m4830c = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k0));
            int mo4917c0 = interfaceC3214k0.mo4917c0(i7);
            if (m4830c == 0.0f) {
                i9 += mo4917c0;
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
                i8 = Math.max(i8, Math.round(mo4917c0 / m4830c));
            }
        }
        return ((list.size() - 1) * mo4513Q) + Math.round(i8 * f7) + i9;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: e */
    public final long mo4845e(int i7, int i8, int i9, boolean z7) {
        if (!z7) {
            return AbstractC3092b.m4764a(i7, i8, 0, i9);
        }
        return AbstractC2072e.m3332i(i7, i8, 0, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3147o0)) {
            return false;
        }
        C3147o0 c3147o0 = (C3147o0) obj;
        if (AbstractC3367j.m5096a(this.f15821a, c3147o0.f15821a) && AbstractC3367j.m5096a(this.f15822b, c3147o0.f15822b)) {
            return true;
        }
        return false;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: f */
    public final InterfaceC3220m0 mo4846f(AbstractC3239v0[] abstractC3239v0Arr, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int i7, int i8) {
        return interfaceC3223n0.mo4941K(i7, i8, C1814v.f10861e, new C0003a1(abstractC3239v0Arr, this, i8, iArr));
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: g */
    public final int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15821a.mo4835a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i10);
            float m4830c = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k0));
            int mo4916V = interfaceC3214k0.mo4916V(i7);
            if (m4830c == 0.0f) {
                i9 += mo4916V;
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
                i8 = Math.max(i8, Math.round(mo4916V / m4830c));
            }
        }
        return ((list.size() - 1) * mo4513Q) + Math.round(i8 * f7) + i9;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: h */
    public final int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int round;
        int i8;
        int i9;
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15821a.mo4835a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo4513Q, i7);
        int size = list.size();
        int i10 = 0;
        float f7 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i11);
            float m4830c = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k0));
            if (m4830c == 0.0f) {
                if (i7 == Integer.MAX_VALUE) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = i7 - min;
                }
                int min2 = Math.min(interfaceC3214k0.mo4917c0(Integer.MAX_VALUE), i9);
                min += min2;
                i10 = Math.max(i10, interfaceC3214k0.mo4920f(min2));
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
            }
        }
        if (f7 == 0.0f) {
            round = 0;
        } else if (i7 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i7 - min, 0) / f7);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i12);
            float m4830c2 = AbstractC3122c.m4830c(AbstractC3122c.m4829b(interfaceC3214k02));
            if (m4830c2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i8 = Math.round(round * m4830c2);
                } else {
                    i8 = Integer.MAX_VALUE;
                }
                i10 = Math.max(i10, interfaceC3214k02.mo4920f(i8));
            }
        }
        return i10;
    }

    public final int hashCode() {
        return this.f15822b.hashCode() + (this.f15821a.hashCode() * 31);
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: i */
    public final void mo4847i(int i7, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int[] iArr2) {
        this.f15821a.mo4823c(interfaceC3223n0, i7, iArr, interfaceC3223n0.getLayoutDirection(), iArr2);
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: j */
    public final int mo4848j(AbstractC3239v0 abstractC3239v0) {
        return abstractC3239v0.f16053e;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f15821a + ", verticalAlignment=" + this.f15822b + ')';
    }
}
