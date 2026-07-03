package p161v0;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0031h1;
import p031d5.C0512l;
import p060h5.AbstractC1804l;
import p060h5.C1813u;
import p077k.C2196i0;
import p101n0.C2707g;
import p145t0.C3170a;
import p145t0.C3182m;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.C3343j;
import p158u5.AbstractC3367j;
import p160v.C3449z0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.l */
/* loaded from: classes.dex */
public abstract class AbstractC3465l {

    /* renamed from: a */
    public static final C3343j f16719a = new C3343j(2);

    /* renamed from: b */
    public static final C0031h1 f16720b = new C0031h1(10, (byte) 0);

    /* renamed from: c */
    public static final Object f16721c = new Object();

    /* renamed from: d */
    public static C3463j f16722d;

    /* renamed from: e */
    public static long f16723e;

    /* renamed from: f */
    public static final C3449z0 f16724f;

    /* renamed from: g */
    public static final C0512l f16725g;

    /* renamed from: h */
    public static Object f16726h;

    /* renamed from: i */
    public static Object f16727i;

    /* renamed from: j */
    public static final C3450a f16728j;

    /* renamed from: k */
    public static final C3170a f16729k;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicInteger, t0.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [v0.f, v0.b, v0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.z0, java.lang.Object] */
    static {
        C3463j c3463j = C3463j.f16711i;
        f16722d = c3463j;
        long j6 = 1;
        f16723e = j6 + j6;
        ?? obj = new Object();
        obj.f16664c = new long[16];
        obj.f16665d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            iArr[i7] = i8;
            i7 = i8;
        }
        obj.f16666e = iArr;
        f16724f = obj;
        C0512l c0512l = new C0512l(6);
        c0512l.f1836c = new int[16];
        c0512l.f1837d = new C3182m[16];
        f16725g = c0512l;
        C1813u c1813u = C1813u.f10860e;
        f16726h = c1813u;
        f16727i = c1813u;
        long j7 = f16723e;
        f16723e = j6 + j7;
        ?? c3452b = new C3452b(j7, c3463j, null, new C3343j(1));
        f16722d = f16722d.m5233e(c3452b.f16701b);
        f16728j = c3452b;
        f16729k = new AtomicInteger(0);
    }

    /* renamed from: a */
    public static final void m5234a() {
        m5239f(f16719a);
    }

    /* renamed from: b */
    public static final InterfaceC3279c m5235b(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        if (interfaceC3279c != null && interfaceC3279c2 != null && interfaceC3279c != interfaceC3279c2) {
            return new C3464k(interfaceC3279c, interfaceC3279c2, 1);
        }
        if (interfaceC3279c == null) {
            return interfaceC3279c2;
        }
        return interfaceC3279c;
    }

    /* renamed from: c */
    public static final HashMap m5236c(long j6, C3452b c3452b, C3463j c3463j) {
        long[] jArr;
        C3463j c3463j2;
        long[] jArr2;
        C3463j c3463j3;
        int i7;
        AbstractC3451a0 m5252s;
        long j7 = j6;
        C2196i0 mo5215x = c3452b.mo5215x();
        if (mo5215x != null) {
            C3463j m5232d = c3452b.mo5220d().m5233e(c3452b.mo5221g()).m5232d(c3452b.f16675j);
            Object[] objArr = mo5215x.f12685b;
            long[] jArr3 = mo5215x.f12684a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j8 = jArr3[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j8 & 255) < 128) {
                                InterfaceC3478y interfaceC3478y = (InterfaceC3478y) objArr[(i8 << 3) + i11];
                                AbstractC3451a0 mo3725a = interfaceC3478y.mo3725a();
                                jArr2 = jArr3;
                                i7 = i9;
                                AbstractC3451a0 m5252s2 = m5252s(mo3725a, j7, c3463j);
                                if (m5252s2 != null && (m5252s = m5252s(mo3725a, j7, m5232d)) != null && !m5252s2.equals(m5252s)) {
                                    c3463j3 = m5232d;
                                    AbstractC3451a0 m5252s3 = m5252s(mo3725a, c3452b.mo5221g(), c3452b.mo5220d());
                                    if (m5252s3 != null) {
                                        AbstractC3451a0 mo3727c = interfaceC3478y.mo3727c(m5252s, m5252s2, m5252s3);
                                        if (mo3727c == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(m5252s2, mo3727c);
                                        hashMap = hashMap;
                                    } else {
                                        m5251r();
                                        throw null;
                                    }
                                } else {
                                    c3463j3 = m5232d;
                                }
                            } else {
                                jArr2 = jArr3;
                                c3463j3 = m5232d;
                                i7 = i9;
                            }
                            j8 >>= i7;
                            i11++;
                            j7 = j6;
                            i9 = i7;
                            jArr3 = jArr2;
                            m5232d = c3463j3;
                        }
                        jArr = jArr3;
                        c3463j2 = m5232d;
                        if (i10 != i9) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        c3463j2 = m5232d;
                    }
                    if (i8 != length) {
                        i8++;
                        j7 = j6;
                        jArr3 = jArr;
                        m5232d = c3463j2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final void m5237d(AbstractC3459f abstractC3459f) {
        C3452b c3452b;
        Object obj;
        long j6;
        if (!f16722d.m5231c(abstractC3459f.mo5221g())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(abstractC3459f.mo5221g());
            sb.append(", disposed=");
            sb.append(abstractC3459f.f16702c);
            sb.append(", applied=");
            if (abstractC3459f instanceof C3452b) {
                c3452b = (C3452b) abstractC3459f;
            } else {
                c3452b = null;
            }
            if (c3452b != null) {
                obj = Boolean.valueOf(c3452b.f16678m);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (f16721c) {
                C3449z0 c3449z0 = f16724f;
                if (c3449z0.f16662a > 0) {
                    j6 = ((long[]) c3449z0.f16664c)[0];
                } else {
                    j6 = -1;
                }
            }
            sb.append(j6);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: e */
    public static final C3463j m5238e(C3463j c3463j, long j6, long j7) {
        while (AbstractC3367j.m5102g(j6, j7) < 0) {
            c3463j = c3463j.m5233e(j6);
            j6++;
        }
        return c3463j;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* renamed from: f */
    public static final Object m5239f(InterfaceC3279c interfaceC3279c) {
        C2196i0 c2196i0;
        Object m5255v;
        C3450a c3450a = f16728j;
        synchronized (f16721c) {
            try {
                c2196i0 = c3450a.f16673h;
                if (c2196i0 != null) {
                    f16729k.addAndGet(1);
                }
                m5255v = m5255v(c3450a, interfaceC3279c);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2196i0 != null) {
            try {
                ?? r42 = f16726h;
                int size = r42.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((InterfaceC3281e) r42.get(i7)).mo22d(new C2707g(c2196i0), c3450a);
                }
            } finally {
                f16729k.addAndGet(-1);
            }
        }
        synchronized (f16721c) {
            m5240g();
            if (c2196i0 != null) {
                Object[] objArr = c2196i0.f12685b;
                long[] jArr = c2196i0.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j6 = jArr[i8];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j6) < 128) {
                                    m5250q((InterfaceC3478y) objArr[(i8 << 3) + i10]);
                                }
                                j6 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        return m5255v;
    }

    /* renamed from: g */
    public static final void m5240g() {
        C0512l c0512l = f16725g;
        int i7 = c0512l.f1835b;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            Object obj = null;
            if (i8 >= i7) {
                break;
            }
            C3182m c3182m = ((C3182m[]) c0512l.f1837d)[i8];
            if (c3182m != null) {
                obj = c3182m.get();
            }
            if (obj != null && m5249p((InterfaceC3478y) obj)) {
                if (i9 != i8) {
                    ((C3182m[]) c0512l.f1837d)[i9] = c3182m;
                    int[] iArr = (int[]) c0512l.f1836c;
                    iArr[i9] = iArr[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < i7; i10++) {
            ((C3182m[]) c0512l.f1837d)[i10] = null;
            ((int[]) c0512l.f1836c)[i10] = 0;
        }
        if (i9 != i7) {
            c0512l.f1835b = i9;
        }
    }

    /* renamed from: h */
    public static final AbstractC3459f m5241h(AbstractC3459f abstractC3459f, InterfaceC3279c interfaceC3279c, boolean z7) {
        C3452b c3452b;
        boolean z8 = abstractC3459f instanceof C3452b;
        if (!z8 && abstractC3459f != null) {
            return new C3457d0(abstractC3459f, interfaceC3279c, false, z7);
        }
        if (z8) {
            c3452b = (C3452b) abstractC3459f;
        } else {
            c3452b = null;
        }
        return new C3455c0(c3452b, interfaceC3279c, null, false, z7);
    }

    /* renamed from: i */
    public static final AbstractC3451a0 m5242i(AbstractC3451a0 abstractC3451a0) {
        AbstractC3451a0 m5252s;
        AbstractC3459f m5244k = m5244k();
        AbstractC3451a0 m5252s2 = m5252s(abstractC3451a0, m5244k.mo5221g(), m5244k.mo5220d());
        if (m5252s2 == null) {
            synchronized (f16721c) {
                AbstractC3459f m5244k2 = m5244k();
                m5252s = m5252s(abstractC3451a0, m5244k2.mo5221g(), m5244k2.mo5220d());
            }
            if (m5252s != null) {
                return m5252s;
            }
            m5251r();
            throw null;
        }
        return m5252s2;
    }

    /* renamed from: j */
    public static final AbstractC3451a0 m5243j(AbstractC3451a0 abstractC3451a0, AbstractC3459f abstractC3459f) {
        AbstractC3451a0 m5252s;
        AbstractC3451a0 m5252s2 = m5252s(abstractC3451a0, abstractC3459f.mo5221g(), abstractC3459f.mo5220d());
        if (m5252s2 == null) {
            synchronized (f16721c) {
                m5252s = m5252s(abstractC3451a0, abstractC3459f.mo5221g(), abstractC3459f.mo5220d());
            }
            if (m5252s != null) {
                return m5252s;
            }
            m5251r();
            throw null;
        }
        return m5252s2;
    }

    /* renamed from: k */
    public static final AbstractC3459f m5244k() {
        AbstractC3459f abstractC3459f = (AbstractC3459f) f16720b.m105t();
        if (abstractC3459f == null) {
            return f16728j;
        }
        return abstractC3459f;
    }

    /* renamed from: l */
    public static final InterfaceC3279c m5245l(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, boolean z7) {
        if (!z7) {
            interfaceC3279c2 = null;
        }
        if (interfaceC3279c != null && interfaceC3279c2 != null && interfaceC3279c != interfaceC3279c2) {
            return new C3464k(interfaceC3279c, interfaceC3279c2, 0);
        }
        if (interfaceC3279c == null) {
            return interfaceC3279c2;
        }
        return interfaceC3279c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC3451a0 m5246m(AbstractC3451a0 abstractC3451a0, InterfaceC3478y interfaceC3478y) {
        AbstractC3451a0 mo3725a = interfaceC3478y.mo3725a();
        long j6 = f16723e;
        C3449z0 c3449z0 = f16724f;
        if (c3449z0.f16662a > 0) {
            j6 = ((long[]) c3449z0.f16664c)[0];
        }
        long j7 = j6 - 1;
        AbstractC3451a0 abstractC3451a02 = null;
        AbstractC3451a0 abstractC3451a03 = null;
        while (true) {
            if (mo3725a == null) {
                break;
            }
            long j8 = mo3725a.f16667a;
            if (j8 == 0) {
                break;
            }
            if (j8 != 0 && AbstractC3367j.m5102g(j8, j7) <= 0 && !C3463j.f16711i.m5231c(j8)) {
                if (abstractC3451a03 == null) {
                    abstractC3451a03 = mo3725a;
                } else if (AbstractC3367j.m5102g(mo3725a.f16667a, abstractC3451a03.f16667a) >= 0) {
                    abstractC3451a02 = abstractC3451a03;
                }
            }
            mo3725a = mo3725a.f16668b;
        }
        if (abstractC3451a02 != null) {
            abstractC3451a02.f16667a = Long.MAX_VALUE;
            return abstractC3451a02;
        }
        AbstractC3451a0 mo3738b = abstractC3451a0.mo3738b(Long.MAX_VALUE);
        mo3738b.f16668b = interfaceC3478y.mo3725a();
        interfaceC3478y.mo3726b(mo3738b);
        return mo3738b;
    }

    /* renamed from: n */
    public static final void m5247n(AbstractC3459f abstractC3459f, InterfaceC3478y interfaceC3478y) {
        abstractC3459f.mo5213t(abstractC3459f.mo5209h() + 1);
        InterfaceC3279c mo5210i = abstractC3459f.mo5210i();
        if (mo5210i != null) {
            mo5210i.mo23f(interfaceC3478y);
        }
    }

    /* renamed from: o */
    public static final AbstractC3451a0 m5248o(AbstractC3451a0 abstractC3451a0, AbstractC3479z abstractC3479z, AbstractC3459f abstractC3459f, AbstractC3451a0 abstractC3451a02) {
        AbstractC3451a0 m5246m;
        if (abstractC3459f.mo5208f()) {
            abstractC3459f.mo5211n(abstractC3479z);
        }
        long mo5221g = abstractC3459f.mo5221g();
        if (abstractC3451a02.f16667a == mo5221g) {
            return abstractC3451a02;
        }
        synchronized (f16721c) {
            m5246m = m5246m(abstractC3451a0, abstractC3479z);
        }
        m5246m.f16667a = mo5221g;
        if (abstractC3451a02.f16667a != 1) {
            abstractC3459f.mo5211n(abstractC3479z);
        }
        return m5246m;
    }

    /* renamed from: p */
    public static final boolean m5249p(InterfaceC3478y interfaceC3478y) {
        AbstractC3451a0 abstractC3451a0;
        long j6 = f16723e;
        C3449z0 c3449z0 = f16724f;
        if (c3449z0.f16662a > 0) {
            j6 = ((long[]) c3449z0.f16664c)[0];
        }
        AbstractC3451a0 abstractC3451a02 = null;
        AbstractC3451a0 abstractC3451a03 = null;
        int i7 = 0;
        for (AbstractC3451a0 mo3725a = interfaceC3478y.mo3725a(); mo3725a != null; mo3725a = mo3725a.f16668b) {
            long j7 = mo3725a.f16667a;
            if (j7 != 0) {
                if (AbstractC3367j.m5102g(j7, j6) < 0) {
                    if (abstractC3451a02 == null) {
                        i7++;
                        abstractC3451a02 = mo3725a;
                    } else {
                        if (AbstractC3367j.m5102g(mo3725a.f16667a, abstractC3451a02.f16667a) < 0) {
                            abstractC3451a0 = abstractC3451a02;
                            abstractC3451a02 = mo3725a;
                        } else {
                            abstractC3451a0 = mo3725a;
                        }
                        if (abstractC3451a03 == null) {
                            abstractC3451a03 = interfaceC3478y.mo3725a();
                            AbstractC3451a0 abstractC3451a04 = abstractC3451a03;
                            while (true) {
                                if (abstractC3451a03 != null) {
                                    if (AbstractC3367j.m5102g(abstractC3451a03.f16667a, j6) >= 0) {
                                        break;
                                    }
                                    if (AbstractC3367j.m5102g(abstractC3451a04.f16667a, abstractC3451a03.f16667a) < 0) {
                                        abstractC3451a04 = abstractC3451a03;
                                    }
                                    abstractC3451a03 = abstractC3451a03.f16668b;
                                } else {
                                    abstractC3451a03 = abstractC3451a04;
                                    break;
                                }
                            }
                        }
                        abstractC3451a02.f16667a = 0L;
                        abstractC3451a02.mo3737a(abstractC3451a03);
                        abstractC3451a02 = abstractC3451a0;
                    }
                } else {
                    i7++;
                }
            }
        }
        if (i7 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final void m5250q(InterfaceC3478y interfaceC3478y) {
        Object obj;
        Object obj2;
        Object obj3;
        if (m5249p(interfaceC3478y)) {
            C0512l c0512l = f16725g;
            int i7 = c0512l.f1835b;
            int identityHashCode = System.identityHashCode(interfaceC3478y);
            int i8 = -1;
            if (i7 > 0) {
                int i9 = c0512l.f1835b - 1;
                int i10 = 0;
                while (true) {
                    if (i10 <= i9) {
                        int i11 = (i10 + i9) >>> 1;
                        int i12 = ((int[]) c0512l.f1836c)[i11];
                        if (i12 < identityHashCode) {
                            i10 = i11 + 1;
                        } else if (i12 > identityHashCode) {
                            i9 = i11 - 1;
                        } else {
                            C3182m c3182m = ((C3182m[]) c0512l.f1837d)[i11];
                            if (c3182m != null) {
                                obj = c3182m.get();
                            } else {
                                obj = null;
                            }
                            if (interfaceC3478y != obj) {
                                for (int i13 = i11 - 1; -1 < i13 && ((int[]) c0512l.f1836c)[i13] == identityHashCode; i13--) {
                                    C3182m c3182m2 = ((C3182m[]) c0512l.f1837d)[i13];
                                    if (c3182m2 != null) {
                                        obj3 = c3182m2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == interfaceC3478y) {
                                        i8 = i13;
                                        break;
                                    }
                                }
                                i11++;
                                int i14 = c0512l.f1835b;
                                while (true) {
                                    if (i11 < i14) {
                                        if (((int[]) c0512l.f1836c)[i11] != identityHashCode) {
                                            i8 = -(i11 + 1);
                                            break;
                                        }
                                        C3182m c3182m3 = ((C3182m[]) c0512l.f1837d)[i11];
                                        if (c3182m3 != null) {
                                            obj2 = c3182m3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == interfaceC3478y) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    } else {
                                        i8 = -(c0512l.f1835b + 1);
                                        break;
                                    }
                                }
                            }
                            i8 = i11;
                        }
                    } else {
                        i8 = -(i10 + 1);
                        break;
                    }
                }
                if (i8 >= 0) {
                    return;
                }
            }
            int i15 = -(i8 + 1);
            C3182m[] c3182mArr = (C3182m[]) c0512l.f1837d;
            int length = c3182mArr.length;
            if (i7 == length) {
                int i16 = length * 2;
                C3182m[] c3182mArr2 = new C3182m[i16];
                int[] iArr = new int[i16];
                int i17 = i15 + 1;
                System.arraycopy(c3182mArr, i15, c3182mArr2, i17, i7 - i15);
                System.arraycopy((C3182m[]) c0512l.f1837d, 0, c3182mArr2, 0, i15);
                AbstractC1804l.m3015H((int[]) c0512l.f1836c, iArr, i17, i15, i7);
                AbstractC1804l.m3019L((int[]) c0512l.f1836c, iArr, 0, i15, 6);
                c0512l.f1837d = c3182mArr2;
                c0512l.f1836c = iArr;
            } else {
                int i18 = i15 + 1;
                System.arraycopy(c3182mArr, i15, c3182mArr, i18, i7 - i15);
                int[] iArr2 = (int[]) c0512l.f1836c;
                AbstractC1804l.m3015H(iArr2, iArr2, i18, i15, i7);
            }
            ((C3182m[]) c0512l.f1837d)[i15] = new WeakReference(interfaceC3478y);
            ((int[]) c0512l.f1836c)[i15] = identityHashCode;
            c0512l.f1835b++;
        }
    }

    /* renamed from: r */
    public static final void m5251r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* renamed from: s */
    public static final AbstractC3451a0 m5252s(AbstractC3451a0 abstractC3451a0, long j6, C3463j c3463j) {
        AbstractC3451a0 abstractC3451a02 = null;
        while (abstractC3451a0 != null) {
            long j7 = abstractC3451a0.f16667a;
            if (j7 != 0 && AbstractC3367j.m5102g(j7, j6) <= 0 && !c3463j.m5231c(j7) && (abstractC3451a02 == null || AbstractC3367j.m5102g(abstractC3451a02.f16667a, abstractC3451a0.f16667a) < 0)) {
                abstractC3451a02 = abstractC3451a0;
            }
            abstractC3451a0 = abstractC3451a0.f16668b;
        }
        if (abstractC3451a02 == null) {
            return null;
        }
        return abstractC3451a02;
    }

    /* renamed from: t */
    public static final AbstractC3451a0 m5253t(AbstractC3451a0 abstractC3451a0, InterfaceC3478y interfaceC3478y) {
        AbstractC3451a0 m5252s;
        AbstractC3459f m5244k = m5244k();
        InterfaceC3279c mo5207e = m5244k.mo5207e();
        if (mo5207e != null) {
            mo5207e.mo23f(interfaceC3478y);
        }
        AbstractC3451a0 m5252s2 = m5252s(abstractC3451a0, m5244k.mo5221g(), m5244k.mo5220d());
        if (m5252s2 == null) {
            synchronized (f16721c) {
                AbstractC3459f m5244k2 = m5244k();
                AbstractC3451a0 mo3725a = interfaceC3478y.mo3725a();
                AbstractC3367j.m5098c(mo3725a, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
                m5252s = m5252s(mo3725a, m5244k2.mo5221g(), m5244k2.mo5220d());
                if (m5252s == null) {
                    m5251r();
                    throw null;
                }
            }
            return m5252s;
        }
        return m5252s2;
    }

    /* renamed from: u */
    public static final void m5254u(int i7) {
        C3449z0 c3449z0 = f16724f;
        int i8 = ((int[]) c3449z0.f16666e)[i7];
        c3449z0.m5196b(i8, c3449z0.f16662a - 1);
        c3449z0.f16662a--;
        long[] jArr = (long[]) c3449z0.f16664c;
        long j6 = jArr[i8];
        int i9 = i8;
        while (i9 > 0) {
            int i10 = ((i9 + 1) >> 1) - 1;
            if (AbstractC3367j.m5102g(jArr[i10], j6) <= 0) {
                break;
            }
            c3449z0.m5196b(i10, i9);
            i9 = i10;
        }
        long[] jArr2 = (long[]) c3449z0.f16664c;
        int i11 = c3449z0.f16662a >> 1;
        while (i8 < i11) {
            int i12 = (i8 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < c3449z0.f16662a && AbstractC3367j.m5102g(jArr2[i12], jArr2[i13]) < 0) {
                if (AbstractC3367j.m5102g(jArr2[i12], jArr2[i8]) >= 0) {
                    break;
                }
                c3449z0.m5196b(i12, i8);
                i8 = i12;
            } else {
                if (AbstractC3367j.m5102g(jArr2[i13], jArr2[i8]) >= 0) {
                    break;
                }
                c3449z0.m5196b(i13, i8);
                i8 = i13;
            }
        }
        ((int[]) c3449z0.f16666e)[i7] = c3449z0.f16663b;
        c3449z0.f16663b = i7;
    }

    /* renamed from: v */
    public static final Object m5255v(C3450a c3450a, InterfaceC3279c interfaceC3279c) {
        long j6 = c3450a.f16701b;
        Object mo23f = interfaceC3279c.mo23f(f16722d.m5230b(j6));
        long j7 = f16723e;
        f16723e = 1 + j7;
        C3463j m5230b = f16722d.m5230b(j6);
        f16722d = m5230b;
        c3450a.f16701b = j7;
        c3450a.f16700a = m5230b;
        c3450a.f16672g = 0;
        c3450a.f16673h = null;
        c3450a.m5228o();
        f16722d = f16722d.m5233e(j7);
        return mo23f;
    }

    /* renamed from: w */
    public static final AbstractC3451a0 m5256w(AbstractC3451a0 abstractC3451a0, InterfaceC3478y interfaceC3478y, AbstractC3459f abstractC3459f) {
        AbstractC3451a0 m5252s;
        if (abstractC3459f.mo5208f()) {
            abstractC3459f.mo5211n(interfaceC3478y);
        }
        long mo5221g = abstractC3459f.mo5221g();
        AbstractC3451a0 m5252s2 = m5252s(abstractC3451a0, mo5221g, abstractC3459f.mo5220d());
        if (m5252s2 != null) {
            if (m5252s2.f16667a == abstractC3459f.mo5221g()) {
                return m5252s2;
            }
            synchronized (f16721c) {
                m5252s = m5252s(interfaceC3478y.mo3725a(), mo5221g, abstractC3459f.mo5220d());
                if (m5252s != null) {
                    if (m5252s.f16667a != mo5221g) {
                        AbstractC3451a0 m5246m = m5246m(m5252s, interfaceC3478y);
                        m5246m.mo3737a(m5252s);
                        m5246m.f16667a = abstractC3459f.mo5221g();
                        m5252s = m5246m;
                    }
                } else {
                    m5251r();
                    throw null;
                }
            }
            if (m5252s2.f16667a != 1) {
                abstractC3459f.mo5211n(interfaceC3478y);
            }
            return m5252s;
        }
        m5251r();
        throw null;
    }
}
