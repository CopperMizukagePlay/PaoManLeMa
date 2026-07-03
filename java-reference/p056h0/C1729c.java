package p056h0;

import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0070r0;
import p027d1.C0464b;
import p027d1.C0467e;
import p032d6.AbstractC0525d0;
import p035e1.C0677s;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p063i0.C1880e1;
import p063i0.C1889f1;
import p068i5.AbstractC2080d;
import p077k.C2194h0;
import p092m.AbstractC2487d;
import p100n.C2635d;
import p137s.C3083l;
import p137s.InterfaceC3080i;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.c */
/* loaded from: classes.dex */
public final class C1729c extends AbstractC1742p {

    /* renamed from: C */
    public final C2194h0 f10586C;

    public C1729c(InterfaceC3080i interfaceC3080i, boolean z7, float f7, C1880e1 c1880e1, C1889f1 c1889f1) {
        super(interfaceC3080i, z7, f7, c1880e1, c1889f1);
        this.f10586C = new C2194h0();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        this.f10586C.m3586a();
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: K0 */
    public final void mo2783K0(C3083l c3083l, long j6, float f7) {
        C0464b c0464b;
        C2194h0 c2194h0 = this.f10586C;
        Object[] objArr = c2194h0.f12677b;
        Object[] objArr2 = c2194h0.f12678c;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j7 = jArr[i7];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj = objArr[i10];
                            C1736j c1736j = (C1736j) objArr2[i10];
                            c1736j.f10615k.setValue(Boolean.TRUE);
                            c1736j.f10613i.m1186X(C1694m.f10482a);
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        boolean z7 = this.f10633t;
        if (z7) {
            c0464b = new C0464b(c3083l.f15681a);
        } else {
            c0464b = null;
        }
        C1736j c1736j2 = new C1736j(c0464b, f7, z7);
        c2194h0.m3598m(c3083l, c1736j2);
        AbstractC0525d0.m1141s(m5830y0(), null, new C0070r0(c1736j2, this, c3083l, null, 11), 3);
        AbstractC3498f.m5373m(this);
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: L0 */
    public final void mo2784L0(C3508i0 c3508i0) {
        int i7;
        C1568b c1568b;
        Object[] objArr;
        Object[] objArr2;
        int i8;
        int i9;
        int i10;
        C1568b c1568b2;
        Object[] objArr3;
        Object[] objArr4;
        int i11;
        float floatValue;
        C1729c c1729c = this;
        C1568b c1568b3 = c3508i0.f16933e;
        c1729c.f10636w.mo52a();
        float f7 = 0.1f;
        if (0.1f != 0.0f) {
            C2194h0 c2194h0 = c1729c.f10586C;
            Object[] objArr5 = c2194h0.f12677b;
            Object[] objArr6 = c2194h0.f12678c;
            long[] jArr = c2194h0.f12676a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j6 = jArr[i12];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        long j7 = j6;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j7 & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr5[i16];
                                C1736j c1736j = (C1736j) objArr6[i16];
                                long m1453b = C0677s.m1453b(f7, c1729c.f10635v.mo1461a());
                                C2635d c2635d = c1736j.f10612h;
                                if (c1736j.f10608d == null) {
                                    long mo2546c = c1568b3.mo2546c();
                                    float f8 = AbstractC1737k.f10616a;
                                    c1736j.f10608d = Float.valueOf(Math.max(C0467e.m1026d(mo2546c), C0467e.m1024b(mo2546c)) * 0.3f);
                                }
                                if (c1736j.f10605a == null) {
                                    c1736j.f10605a = new C0464b(c1568b3.mo2545Y());
                                }
                                if (c1736j.f10609e == null) {
                                    c1736j.f10609e = new C0464b(AbstractC3784a.m5797a(C0467e.m1026d(c1568b3.mo2546c()) / 2.0f, C0467e.m1024b(c1568b3.mo2546c()) / 2.0f));
                                }
                                if (((Boolean) c1736j.f10615k.getValue()).booleanValue() && !((Boolean) c1736j.f10614j.getValue()).booleanValue()) {
                                    floatValue = 1.0f;
                                } else {
                                    floatValue = ((Number) c1736j.f10610f.m4206d()).floatValue();
                                }
                                Float f9 = c1736j.f10608d;
                                AbstractC3367j.m5097b(f9);
                                float m3409v = AbstractC2080d.m3409v(f9.floatValue(), c1736j.f10606b, ((Number) c1736j.f10611g.m4206d()).floatValue());
                                C0464b c0464b = c1736j.f10605a;
                                AbstractC3367j.m5097b(c0464b);
                                float f10 = floatValue;
                                float m1008d = C0464b.m1008d(c0464b.f1623a);
                                C0464b c0464b2 = c1736j.f10609e;
                                AbstractC3367j.m5097b(c0464b2);
                                i8 = i12;
                                float m3409v2 = AbstractC2080d.m3409v(m1008d, C0464b.m1008d(c0464b2.f1623a), ((Number) c2635d.m4206d()).floatValue());
                                C0464b c0464b3 = c1736j.f10605a;
                                AbstractC3367j.m5097b(c0464b3);
                                float m1009e = C0464b.m1009e(c0464b3.f1623a);
                                C0464b c0464b4 = c1736j.f10609e;
                                AbstractC3367j.m5097b(c0464b4);
                                i9 = i15;
                                long m5797a = AbstractC3784a.m5797a(m3409v2, AbstractC2080d.m3409v(m1009e, C0464b.m1009e(c0464b4.f1623a), ((Number) c2635d.m4206d()).floatValue()));
                                long m1453b2 = C0677s.m1453b(C0677s.m1455d(m1453b) * f10, m1453b);
                                if (c1736j.f10607c) {
                                    float m1026d = C0467e.m1026d(c1568b3.mo2546c());
                                    float m1024b = C0467e.m1024b(c1568b3.mo2546c());
                                    C0031h1 c0031h1 = c1568b3.f10182f;
                                    long m109x = c0031h1.m109x();
                                    c0031h1.m106u().mo1341m();
                                    ((C0031h1) ((C0019e1) c0031h1.f152f).f109e).m106u().mo1335g(0.0f, 0.0f, m1026d, m1024b, 1);
                                    i10 = i14;
                                    objArr3 = objArr5;
                                    objArr4 = objArr6;
                                    c1568b2 = c1568b3;
                                    i11 = 8;
                                    InterfaceC1570d.m2540R(c3508i0, m1453b2, m3409v, m5797a, null, 120);
                                    AbstractC2487d.m4052p(c0031h1, m109x);
                                } else {
                                    i10 = i14;
                                    c1568b2 = c1568b3;
                                    objArr3 = objArr5;
                                    i11 = 8;
                                    objArr4 = objArr6;
                                    InterfaceC1570d.m2540R(c3508i0, m1453b2, m3409v, m5797a, null, 120);
                                }
                            } else {
                                i8 = i12;
                                i9 = i15;
                                i10 = i14;
                                c1568b2 = c1568b3;
                                objArr3 = objArr5;
                                objArr4 = objArr6;
                                i11 = i13;
                            }
                            j7 >>= i11;
                            i15 = i9 + 1;
                            i14 = i10;
                            i13 = i11;
                            i12 = i8;
                            objArr5 = objArr3;
                            objArr6 = objArr4;
                            c1568b3 = c1568b2;
                            f7 = 0.1f;
                            c1729c = this;
                        }
                        i7 = i12;
                        c1568b = c1568b3;
                        objArr = objArr5;
                        objArr2 = objArr6;
                        if (i14 != i13) {
                            return;
                        }
                    } else {
                        i7 = i12;
                        c1568b = c1568b3;
                        objArr = objArr5;
                        objArr2 = objArr6;
                    }
                    if (i7 != length) {
                        i12 = i7 + 1;
                        c1729c = this;
                        objArr5 = objArr;
                        objArr6 = objArr2;
                        c1568b3 = c1568b;
                        f7 = 0.1f;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: N0 */
    public final void mo2785N0(C3083l c3083l) {
        C1736j c1736j = (C1736j) this.f10586C.m3592g(c3083l);
        if (c1736j != null) {
            c1736j.f10615k.setValue(Boolean.TRUE);
            c1736j.f10613i.m1186X(C1694m.f10482a);
        }
    }
}
