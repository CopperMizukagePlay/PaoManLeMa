package p144t;

import java.util.List;
import p019c1.C0380x;
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
import p177x0.C3800h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.r */
/* loaded from: classes.dex */
public final class C3152r implements InterfaceC3217l0, InterfaceC3141l0 {

    /* renamed from: a */
    public final InterfaceC3132h f15832a;

    /* renamed from: b */
    public final C3800h f15833b;

    public C3152r(InterfaceC3132h interfaceC3132h, C3800h c3800h) {
        this.f15832a = interfaceC3132h;
        this.f15833b = c3800h;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        return AbstractC3122c.m4831d(this, C3091a.m4761i(j6), C3091a.m4762j(j6), C3091a.m4759g(j6), C3091a.m4760h(j6), interfaceC3223n0.mo4513Q(this.f15832a.mo4835a()), interfaceC3223n0, list, new AbstractC3239v0[list.size()], list.size());
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: b */
    public final int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15832a.mo4835a());
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
            int mo4919e0 = interfaceC3214k0.mo4919e0(i7);
            if (m4830c == 0.0f) {
                i9 += mo4919e0;
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
                i8 = Math.max(i8, Math.round(mo4919e0 / m4830c));
            }
        }
        return ((list.size() - 1) * mo4513Q) + Math.round(i8 * f7) + i9;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: c */
    public final int mo4844c(AbstractC3239v0 abstractC3239v0) {
        return abstractC3239v0.f16053e;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int round;
        int i8;
        int i9;
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15832a.mo4835a());
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
                int min2 = Math.min(interfaceC3214k0.mo4920f(Integer.MAX_VALUE), i9);
                min += min2;
                i10 = Math.max(i10, interfaceC3214k0.mo4917c0(min2));
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
                i10 = Math.max(i10, interfaceC3214k02.mo4917c0(i8));
            }
        }
        return i10;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: e */
    public final long mo4845e(int i7, int i8, int i9, boolean z7) {
        if (!z7) {
            return AbstractC3092b.m4764a(0, i9, i7, i8);
        }
        return AbstractC2072e.m3331h(0, i9, i7, i8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3152r) {
                C3152r c3152r = (C3152r) obj;
                if (!AbstractC3367j.m5096a(this.f15832a, c3152r.f15832a) || !this.f15833b.equals(c3152r.f15833b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: f */
    public final InterfaceC3220m0 mo4846f(AbstractC3239v0[] abstractC3239v0Arr, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int i7, int i8) {
        return interfaceC3223n0.mo4941K(i8, i7, C1814v.f10861e, new C0380x(abstractC3239v0Arr, this, i8, interfaceC3223n0, iArr));
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: g */
    public final int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int round;
        int i8;
        int i9;
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15832a.mo4835a());
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
                int min2 = Math.min(interfaceC3214k0.mo4920f(Integer.MAX_VALUE), i9);
                min += min2;
                i10 = Math.max(i10, interfaceC3214k0.mo4916V(min2));
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
                i10 = Math.max(i10, interfaceC3214k02.mo4916V(i8));
            }
        }
        return i10;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: h */
    public final int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int mo4513Q = interfaceC3228q.mo4513Q(this.f15832a.mo4835a());
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
            int mo4920f = interfaceC3214k0.mo4920f(i7);
            if (m4830c == 0.0f) {
                i9 += mo4920f;
            } else if (m4830c > 0.0f) {
                f7 += m4830c;
                i8 = Math.max(i8, Math.round(mo4920f / m4830c));
            }
        }
        return ((list.size() - 1) * mo4513Q) + Math.round(i8 * f7) + i9;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15833b.f17982a) + (this.f15832a.hashCode() * 31);
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: i */
    public final void mo4847i(int i7, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int[] iArr2) {
        this.f15832a.mo4834b(i7, interfaceC3223n0, iArr, iArr2);
    }

    @Override // p144t.InterfaceC3141l0
    /* renamed from: j */
    public final int mo4848j(AbstractC3239v0 abstractC3239v0) {
        return abstractC3239v0.f16054f;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f15832a + ", horizontalAlignment=" + this.f15833b + ')';
    }
}
