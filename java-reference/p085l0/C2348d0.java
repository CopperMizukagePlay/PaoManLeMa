package p085l0;

import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p101n0.C2705e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.InterfaceC3478y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.d0 */
/* loaded from: classes.dex */
public final class C2348d0 extends AbstractC3451a0 {

    /* renamed from: h */
    public static final Object f13352h = new Object();

    /* renamed from: c */
    public long f13353c;

    /* renamed from: d */
    public int f13354d;

    /* renamed from: e */
    public C2182b0 f13355e;

    /* renamed from: f */
    public Object f13356f;

    /* renamed from: g */
    public int f13357g;

    public C2348d0(long j6) {
        super(j6);
        C2182b0 c2182b0 = AbstractC2202l0.f12710a;
        AbstractC3367j.m5098c(c2182b0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f13355e = c2182b0;
        this.f13356f = f13352h;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C2348d0 c2348d0 = (C2348d0) abstractC3451a0;
        this.f13355e = c2348d0.f13355e;
        this.f13356f = c2348d0.f13356f;
        this.f13357g = c2348d0.f13357g;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C2348d0(j6);
    }

    /* renamed from: c */
    public final boolean m3739c(C2352e0 c2352e0, AbstractC3459f abstractC3459f) {
        boolean z7;
        boolean z8;
        Object obj = AbstractC3465l.f16721c;
        synchronized (obj) {
            z7 = true;
            if (this.f13353c == abstractC3459f.mo5221g()) {
                if (this.f13354d == abstractC3459f.mo5209h()) {
                    z8 = false;
                }
            }
            z8 = true;
        }
        if (this.f13356f == f13352h || (z8 && this.f13357g != m3740d(c2352e0, abstractC3459f))) {
            z7 = false;
        }
        if (z7 && z8) {
            synchronized (obj) {
                this.f13353c = abstractC3459f.mo5221g();
                this.f13354d = abstractC3459f.mo5209h();
            }
            return z7;
        }
        return z7;
    }

    /* renamed from: d */
    public final int m3740d(C2352e0 c2352e0, AbstractC3459f abstractC3459f) {
        C2182b0 c2182b0;
        int i7;
        long[] jArr;
        int i8;
        long[] jArr2;
        int i9;
        int i10;
        AbstractC3451a0 m3791g;
        synchronized (AbstractC3465l.f16721c) {
            c2182b0 = this.f13355e;
        }
        int i11 = 7;
        if (c2182b0.f12625e == 0) {
            return 7;
        }
        C2705e m3972o = AbstractC2418w.m3972o();
        Object[] objArr = m3972o.f14517e;
        int i12 = m3972o.f14519g;
        for (int i13 = 0; i13 < i12; i13++) {
            ((C2391o) objArr[i13]).m3831b();
        }
        try {
            Object[] objArr2 = c2182b0.f12622b;
            int[] iArr = c2182b0.f12623c;
            long[] jArr3 = c2182b0.f12621a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i7 = 7;
                int i14 = 0;
                while (true) {
                    long j6 = jArr3[i14];
                    if ((((~j6) << i11) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j6 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = objArr2[i18];
                                i9 = i11;
                                int i19 = iArr[i18];
                                i10 = i15;
                                InterfaceC3478y interfaceC3478y = (InterfaceC3478y) obj;
                                if (i19 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (interfaceC3478y instanceof C2352e0) {
                                        try {
                                            C2352e0 c2352e02 = (C2352e0) interfaceC3478y;
                                            m3791g = c2352e02.m3791g((C2348d0) AbstractC3465l.m5243j(c2352e02.f13391h, abstractC3459f), abstractC3459f, false, c2352e02.f13389f);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = m3972o.f14517e;
                                            int i20 = m3972o.f14519g;
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                ((C2391o) objArr3[i21]).m3830a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        m3791g = AbstractC3465l.m5243j(interfaceC3478y.mo3725a(), abstractC3459f);
                                    }
                                    jArr2 = jArr3;
                                    i7 = (((i7 * 31) + System.identityHashCode(m3791g)) * 31) + Long.hashCode(m3791g.f16667a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i9 = i11;
                                i10 = i15;
                            }
                            j6 >>= i10;
                            i17++;
                            i11 = i9;
                            jArr3 = jArr2;
                            i15 = i10;
                        }
                        jArr = jArr3;
                        i8 = i11;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i8 = i11;
                    }
                    if (i14 != length) {
                        i14++;
                        i11 = i8;
                        jArr3 = jArr;
                    } else {
                        i11 = i7;
                        break;
                    }
                }
            }
            i7 = i11;
            Object[] objArr4 = m3972o.f14517e;
            int i22 = m3972o.f14519g;
            for (int i23 = 0; i23 < i22; i23++) {
                ((C2391o) objArr4[i23]).m3830a();
            }
            return i7;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
