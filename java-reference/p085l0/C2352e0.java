package p085l0;

import p001a0.C0031h1;
import p053g5.C1694m;
import p077k.C2182b0;
import p101n0.C2705e;
import p145t0.C3174e;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.AbstractC3470q;
import p161v0.AbstractC3479z;
import p161v0.InterfaceC3478y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.e0 */
/* loaded from: classes.dex */
public final class C2352e0 extends AbstractC3479z implements InterfaceC2390n2 {

    /* renamed from: f */
    public final InterfaceC3277a f13389f;

    /* renamed from: g */
    public final InterfaceC2370i2 f13390g;

    /* renamed from: h */
    public C2348d0 f13391h = new C2348d0(AbstractC3465l.m5244k().mo5221g());

    public C2352e0(InterfaceC2370i2 interfaceC2370i2, InterfaceC3277a interfaceC3277a) {
        this.f13389f = interfaceC3277a;
        this.f13390g = interfaceC2370i2;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f13391h;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f13391h = (C2348d0) abstractC3451a0;
    }

    /* renamed from: g */
    public final C2348d0 m3791g(C2348d0 c2348d0, AbstractC3459f abstractC3459f, boolean z7, InterfaceC3277a interfaceC3277a) {
        C2705e m3972o;
        InterfaceC2370i2 interfaceC2370i2;
        int i7;
        C2348d0 c2348d02 = c2348d0;
        if (c2348d02.m3739c(this, abstractC3459f)) {
            if (z7) {
                m3972o = AbstractC2418w.m3972o();
                Object[] objArr = m3972o.f14517e;
                int i8 = m3972o.f14519g;
                for (int i9 = 0; i9 < i8; i9++) {
                    ((C2391o) objArr[i9]).m3831b();
                }
                try {
                    C2182b0 c2182b0 = c2348d02.f13355e;
                    C0031h1 c0031h1 = AbstractC2374j2.f13419a;
                    C3174e c3174e = (C3174e) c0031h1.m105t();
                    if (c3174e == null) {
                        c3174e = new C3174e();
                        c0031h1.m82F(c3174e);
                    }
                    int i10 = c3174e.f15887a;
                    Object[] objArr2 = c2182b0.f12622b;
                    int[] iArr = c2182b0.f12623c;
                    long[] jArr = c2182b0.f12621a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr[i11];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((j6 & 255) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        i7 = i12;
                                        InterfaceC3478y interfaceC3478y = (InterfaceC3478y) objArr2[i15];
                                        c3174e.f15887a = i10 + iArr[i15];
                                        InterfaceC3279c mo5207e = abstractC3459f.mo5207e();
                                        if (mo5207e != null) {
                                            mo5207e.mo23f(interfaceC3478y);
                                        }
                                    } else {
                                        i7 = i12;
                                    }
                                    j6 >>= i7;
                                    i14++;
                                    i12 = i7;
                                }
                                if (i13 != i12) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                        }
                    }
                    c3174e.f15887a = i10;
                    Object[] objArr3 = m3972o.f14517e;
                    int i16 = m3972o.f14519g;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((C2391o) objArr3[i17]).m3830a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2348d02;
        }
        final C2182b0 c2182b02 = new C2182b0();
        C0031h1 c0031h12 = AbstractC2374j2.f13419a;
        final C3174e c3174e2 = (C3174e) c0031h12.m105t();
        if (c3174e2 == null) {
            c3174e2 = new C3174e();
            c0031h12.m82F(c3174e2);
        }
        final int i18 = c3174e2.f15887a;
        m3972o = AbstractC2418w.m3972o();
        Object[] objArr4 = m3972o.f14517e;
        int i19 = m3972o.f14519g;
        for (int i20 = 0; i20 < i19; i20++) {
            ((C2391o) objArr4[i20]).m3831b();
        }
        try {
            c3174e2.f15887a = i18 + 1;
            Object m5268i = AbstractC3470q.m5268i(interfaceC3277a, new InterfaceC3279c() { // from class: l0.c0
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj) {
                    int i21;
                    if (obj != C2352e0.this) {
                        if (obj instanceof InterfaceC3478y) {
                            int i22 = c3174e2.f15887a - i18;
                            C2182b0 c2182b03 = c2182b02;
                            int m3551d = c2182b03.m3551d(obj);
                            if (m3551d >= 0) {
                                i21 = c2182b03.f12623c[m3551d];
                            } else {
                                i21 = Integer.MAX_VALUE;
                            }
                            c2182b03.m3555h(Math.min(i22, i21), obj);
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
            });
            c3174e2.f15887a = i18;
            Object[] objArr5 = m3972o.f14517e;
            int i21 = m3972o.f14519g;
            for (int i22 = 0; i22 < i21; i22++) {
                ((C2391o) objArr5[i22]).m3830a();
            }
            Object obj = AbstractC3465l.f16721c;
            synchronized (obj) {
                try {
                    AbstractC3459f m5244k = AbstractC3465l.m5244k();
                    Object obj2 = c2348d02.f13356f;
                    if (obj2 != C2348d0.f13352h && (interfaceC2370i2 = this.f13390g) != null && interfaceC2370i2.mo3798a(m5268i, obj2)) {
                        c2348d02.f13355e = c2182b02;
                        c2348d02.f13357g = c2348d02.m3740d(this, m5244k);
                    } else {
                        C2348d0 c2348d03 = this.f13391h;
                        synchronized (obj) {
                            AbstractC3451a0 m5246m = AbstractC3465l.m5246m(c2348d03, this);
                            m5246m.mo3737a(c2348d03);
                            m5246m.f16667a = m5244k.mo5221g();
                            c2348d02 = (C2348d0) m5246m;
                            c2348d02.f13355e = c2182b02;
                            c2348d02.f13357g = c2348d02.m3740d(this, m5244k);
                            c2348d02.f13356f = m5268i;
                        }
                        return c2348d02;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C3174e c3174e3 = (C3174e) AbstractC2374j2.f13419a.m105t();
            if (c3174e3 != null && c3174e3.f15887a == 0) {
                AbstractC3465l.m5244k().mo5201m();
                synchronized (obj) {
                    AbstractC3459f m5244k2 = AbstractC3465l.m5244k();
                    c2348d02.f13353c = m5244k2.mo5221g();
                    c2348d02.f13354d = m5244k2.mo5209h();
                    return c2348d02;
                }
            }
            return c2348d02;
        } finally {
            Object[] objArr6 = m3972o.f14517e;
            int i23 = m3972o.f14519g;
            for (int i24 = 0; i24 < i23; i24++) {
                ((C2391o) objArr6[i24]).m3830a();
            }
        }
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        InterfaceC3279c mo5207e = AbstractC3465l.m5244k().mo5207e();
        if (mo5207e != null) {
            mo5207e.mo23f(this);
        }
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        return m3791g((C2348d0) AbstractC3465l.m5243j(this.f13391h, m5244k), m5244k, true, this.f13389f).f13356f;
    }

    /* renamed from: h */
    public final C2348d0 m3792h() {
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        return m3791g((C2348d0) AbstractC3465l.m5243j(this.f13391h, m5244k), m5244k, false, this.f13389f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C2348d0 c2348d0 = (C2348d0) AbstractC3465l.m5242i(this.f13391h);
        if (c2348d0.m3739c(this, AbstractC3465l.m5244k())) {
            str = String.valueOf(c2348d0.f13356f);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
