package p117p1;

import java.util.List;
import p001a0.C0033i;
import p034e0.C0614k0;
import p060h5.AbstractC1804l;
import p077k.AbstractC2207o;
import p077k.AbstractC2210p0;
import p077k.C2184c0;
import p077k.C2209p;
import p077k.C2224z;
import p084l.AbstractC2334a;
import p101n0.C2705e;
import p146t1.InterfaceC3238v;
import p158u5.AbstractC3367j;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.d */
/* loaded from: classes.dex */
public final class C2848d {

    /* renamed from: a */
    public final InterfaceC3238v f14942a;

    /* renamed from: b */
    public boolean f14943b;

    /* renamed from: c */
    public boolean f14944c;

    /* renamed from: d */
    public boolean f14945d;

    /* renamed from: e */
    public boolean f14946e;

    /* renamed from: f */
    public final C2184c0 f14947f = new C2184c0();

    /* renamed from: g */
    public final C2858i f14948g = new C2858i();

    /* renamed from: h */
    public final C2224z f14949h;

    /* JADX WARN: Type inference failed for: r2v3, types: [k.z, java.lang.Object] */
    public C2848d(InterfaceC3238v interfaceC3238v) {
        this.f14942a = interfaceC3238v;
        ?? obj = new Object();
        obj.f12764a = AbstractC2210p0.f12722a;
        obj.f12765b = AbstractC2207o.f12716a;
        obj.f12766c = AbstractC2334a.f13324c;
        obj.m3662c(AbstractC2210p0.m3621d(10));
        this.f14949h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* renamed from: a */
    public final void m4506a(long j6, List list, boolean z7) {
        long j7;
        long j8;
        int i7;
        char c7;
        long j9;
        C2856h c2856h;
        C2856h c2856h2;
        C2224z c2224z = this.f14949h;
        c2224z.f12768e = 0;
        long[] jArr = c2224z.f12764a;
        char c8 = 7;
        if (jArr != AbstractC2210p0.f12722a) {
            AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
            long[] jArr2 = c2224z.f12764a;
            int i8 = c2224z.f12767d;
            int i9 = i8 >> 3;
            j7 = -9187201950435737472L;
            long j10 = 255 << ((i8 & 7) << 3);
            j8 = 255;
            jArr2[i9] = ((~j10) & jArr2[i9]) | j10;
        } else {
            j7 = -9187201950435737472L;
            j8 = 255;
        }
        AbstractC1804l.m3023P(c2224z.f12766c, 0, c2224z.f12767d);
        c2224z.f12769f = AbstractC2210p0.m3618a(c2224z.f12767d) - c2224z.f12768e;
        int size = list.size();
        C2858i c2858i = this.f14948g;
        int i10 = 0;
        boolean z8 = true;
        C2858i c2858i2 = c2858i;
        while (i10 < size) {
            AbstractC3809q abstractC3809q = (AbstractC3809q) list.get(i10);
            if (abstractC3809q.f18005r) {
                abstractC3809q.f18004q = new C0033i(11, this, abstractC3809q);
                if (z8) {
                    C2705e c2705e = c2858i2.f14989a;
                    ?? r14 = c2705e.f14517e;
                    int i11 = c2705e.f14519g;
                    c7 = c8;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            c2856h2 = r14[i12];
                            j9 = j7;
                            if (AbstractC3367j.m5096a(((C2856h) c2856h2).f14970c, abstractC3809q)) {
                                break;
                            }
                            i12++;
                            j7 = j9;
                        } else {
                            j9 = j7;
                            c2856h2 = 0;
                            break;
                        }
                    }
                    c2856h = c2856h2;
                    if (c2856h != null) {
                        c2856h.f14976i = true;
                        c2856h.f14971d.m1476a(j6);
                        Object m3661b = c2224z.m3661b(j6);
                        Object obj = m3661b;
                        if (m3661b == null) {
                            C2184c0 c2184c0 = new C2184c0();
                            c2224z.m3663d(j6, c2184c0);
                            obj = c2184c0;
                        }
                        ((C2184c0) obj).m3556a(c2856h);
                        c2858i2 = c2856h;
                    } else {
                        z8 = false;
                    }
                } else {
                    c7 = c8;
                    j9 = j7;
                }
                c2856h = new C2856h(abstractC3809q);
                c2856h.f14971d.m1476a(j6);
                Object m3661b2 = c2224z.m3661b(j6);
                Object obj2 = m3661b2;
                if (m3661b2 == null) {
                    C2184c0 c2184c02 = new C2184c0();
                    c2224z.m3663d(j6, c2184c02);
                    obj2 = c2184c02;
                }
                ((C2184c0) obj2).m3556a(c2856h);
                c2858i2.f14989a.m4300b(c2856h);
                c2858i2 = c2856h;
            } else {
                c7 = c8;
                j9 = j7;
            }
            i10++;
            c8 = c7;
            j7 = j9;
        }
        char c9 = c8;
        long j11 = j7;
        if (z7) {
            long[] jArr3 = c2224z.f12765b;
            Object[] objArr = c2224z.f12766c;
            long[] jArr4 = c2224z.f12764a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j12 = jArr4[i13];
                    if ((((~j12) << c9) & j12 & j11) != j11) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j12 & j8) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j13 = jArr3[i17];
                                C2184c0 c2184c03 = (C2184c0) objArr[i17];
                                C2705e c2705e2 = c2858i.f14989a;
                                i7 = i14;
                                Object[] objArr2 = c2705e2.f14517e;
                                int i18 = c2705e2.f14519g;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((C2856h) objArr2[i19]).m4532f(j13, c2184c03);
                                }
                            } else {
                                i7 = i14;
                            }
                            j12 >>= i7;
                            i16++;
                            i14 = i7;
                        }
                        if (i15 != i14) {
                            return;
                        }
                    }
                    if (i13 != length) {
                        i13++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m4507b(C0614k0 c0614k0, boolean z7) {
        C2209p c2209p = (C2209p) c0614k0.f2018c;
        InterfaceC3238v interfaceC3238v = this.f14942a;
        C2858i c2858i = this.f14948g;
        boolean mo4527a = c2858i.mo4527a(c2209p, interfaceC3238v, c0614k0, z7);
        C2705e c2705e = c2858i.f14989a;
        if (!mo4527a) {
            return false;
        }
        boolean z8 = true;
        this.f14943b = true;
        Object[] objArr = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        boolean z9 = false;
        for (int i8 = 0; i8 < i7; i8++) {
            if (!((C2856h) objArr[i8]).m4531e(c0614k0, z7) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        Object[] objArr2 = c2705e.f14517e;
        int i9 = c2705e.f14519g;
        boolean z10 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            if (!((C2856h) objArr2[i10]).m4530d(c0614k0) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        c2858i.mo4528b(c0614k0);
        if (!z10 && !z9) {
            z8 = false;
        }
        this.f14943b = false;
        if (this.f14946e) {
            this.f14946e = false;
            C2184c0 c2184c0 = this.f14947f;
            int i11 = c2184c0.f12629b;
            for (int i12 = 0; i12 < i11; i12++) {
                m4509d((AbstractC3809q) c2184c0.m3560e(i12));
            }
            c2184c0.m3558c();
        }
        if (this.f14944c) {
            this.f14944c = false;
            m4508c();
        }
        if (this.f14945d) {
            this.f14945d = false;
            c2858i.f14989a.m4305g();
        }
        return z8;
    }

    /* renamed from: c */
    public final void m4508c() {
        if (this.f14943b) {
            this.f14944c = true;
            return;
        }
        C2858i c2858i = this.f14948g;
        C2705e c2705e = c2858i.f14989a;
        Object[] objArr = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C2856h) objArr[i8]).m4529c();
        }
        if (this.f14945d) {
            this.f14945d = true;
        } else {
            c2858i.f14989a.m4305g();
        }
    }

    /* renamed from: d */
    public final void m4509d(AbstractC3809q abstractC3809q) {
        if (this.f14943b) {
            this.f14946e = true;
            this.f14947f.m3556a(abstractC3809q);
            return;
        }
        C2858i c2858i = this.f14948g;
        C2184c0 c2184c0 = c2858i.f14990b;
        c2184c0.m3558c();
        c2184c0.m3556a(c2858i);
        while (c2184c0.m3563h()) {
            C2858i c2858i2 = (C2858i) c2184c0.m3565j(c2184c0.f12629b - 1);
            int i7 = 0;
            while (true) {
                C2705e c2705e = c2858i2.f14989a;
                if (i7 < c2705e.f14519g) {
                    C2856h c2856h = (C2856h) c2705e.f14517e[i7];
                    if (AbstractC3367j.m5096a(c2856h.f14970c, abstractC3809q)) {
                        c2858i2.f14989a.m4308j(c2856h);
                        c2856h.m4529c();
                    } else {
                        c2184c0.m3556a(c2856h);
                        i7++;
                    }
                }
            }
        }
    }
}
