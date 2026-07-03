package p100n;

import java.util.Arrays;
import p037e3.C0691e;
import p060h5.AbstractC1804l;
import p077k.C2220v;
import p077k.C2221w;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.j0 */
/* loaded from: classes.dex */
public final class C2654j0 implements InterfaceC2695x {

    /* renamed from: a */
    public final C0691e f14341a;

    public C2654j0(C0691e c0691e) {
        this.f14341a = c0691e;
    }

    @Override // p100n.InterfaceC2695x, p100n.InterfaceC2656k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C2688u1 mo4196a(C2664m1 c2664m1) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i7;
        C0691e c0691e = this.f14341a;
        C2221w c2221w = (C2221w) c0691e.f2245b;
        C2220v c2220v = new C2220v(c2221w.f12709e + 2);
        C2221w c2221w2 = new C2221w(c2221w.f12709e);
        int[] iArr3 = c2221w.f12706b;
        Object[] objArr3 = c2221w.f12707c;
        long[] jArr = c2221w.f12705a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr3[i12];
                            i7 = i9;
                            C2651i0 c2651i0 = (C2651i0) objArr3[i12];
                            c2220v.m3643a(i13);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c2221w2.m3652g(i13, new C2685t1((AbstractC2674q) c2664m1.f14361a.mo23f(c2651i0.f14328a), c2651i0.f14329b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i7 = i9;
                        }
                        j6 >>= i7;
                        i11++;
                        iArr3 = iArr2;
                        i9 = i7;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i10 != i9) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c2221w.m3611a(0)) {
            int i14 = c2220v.f12755b;
            if (i14 >= 0) {
                c2220v.m3644b(i14 + 1);
                int[] iArr4 = c2220v.f12754a;
                int i15 = c2220v.f12755b;
                if (i15 != 0) {
                    AbstractC1804l.m3015H(iArr4, iArr4, 1, 0, i15);
                }
                iArr4[0] = 0;
                c2220v.f12755b++;
            } else {
                AbstractC2334a.m3713d("Index must be between 0 and size");
                throw null;
            }
        }
        if (!c2221w.m3611a(c0691e.f2244a)) {
            c2220v.m3643a(c0691e.f2244a);
        }
        int i16 = c2220v.f12755b;
        if (i16 != 0) {
            int[] iArr5 = c2220v.f12754a;
            AbstractC3367j.m5100e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i16);
        }
        return new C2688u1(c2220v, c2221w2, c0691e.f2244a, AbstractC2699z.f14500d);
    }
}
