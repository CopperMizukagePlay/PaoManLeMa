package p161v0;

import java.util.ArrayList;
import java.util.HashMap;
import p053g5.C1687f;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p077k.AbstractC2212q0;
import p077k.C2196i0;
import p085l0.AbstractC2389n1;
import p101n0.C2707g;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.C3343j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.b */
/* loaded from: classes.dex */
public class C3452b extends AbstractC3459f {

    /* renamed from: n */
    public static final int[] f16669n = new int[0];

    /* renamed from: e */
    public final InterfaceC3279c f16670e;

    /* renamed from: f */
    public final InterfaceC3279c f16671f;

    /* renamed from: g */
    public int f16672g;

    /* renamed from: h */
    public C2196i0 f16673h;

    /* renamed from: i */
    public ArrayList f16674i;

    /* renamed from: j */
    public C3463j f16675j;

    /* renamed from: k */
    public int[] f16676k;

    /* renamed from: l */
    public int f16677l;

    /* renamed from: m */
    public boolean f16678m;

    public C3452b(long j6, C3463j c3463j, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        super(j6, c3463j);
        this.f16670e = interfaceC3279c;
        this.f16671f = interfaceC3279c2;
        this.f16675j = C3463j.f16711i;
        this.f16676k = f16669n;
        this.f16677l = 1;
    }

    /* renamed from: A */
    public final void m5204A(long j6) {
        synchronized (AbstractC3465l.f16721c) {
            this.f16675j = this.f16675j.m5233e(j6);
        }
    }

    /* renamed from: B */
    public void mo5205B(C2196i0 c2196i0) {
        this.f16673h = c2196i0;
    }

    /* renamed from: C */
    public C3452b mo5197C(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        if (this.f16702c) {
            AbstractC2389n1.m3828a("Cannot use a disposed snapshot");
        }
        if (this.f16678m && this.f16703d < 0) {
            AbstractC2389n1.m3829b("Unsupported operation on a disposed or applied snapshot");
        }
        m5204A(mo5221g());
        Object obj = AbstractC3465l.f16721c;
        synchronized (obj) {
            try {
                long j6 = AbstractC3465l.f16723e;
                long j7 = 1;
                AbstractC3465l.f16723e = j6 + j7;
                AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(j6);
                C3463j mo5220d = mo5220d();
                mo5222r(mo5220d.m5233e(j6));
                try {
                    C3454c c3454c = new C3454c(j6, AbstractC3465l.m5238e(mo5220d, mo5221g() + j7, j6), AbstractC3465l.m5245l(interfaceC3279c, mo5207e(), true), AbstractC3465l.m5235b(interfaceC3279c2, mo5210i()), this);
                    if (!this.f16678m && !this.f16702c) {
                        long mo5221g = mo5221g();
                        synchronized (obj) {
                            long j8 = AbstractC3465l.f16723e;
                            AbstractC3465l.f16723e = j8 + j7;
                            mo5223s(j8);
                            AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(mo5221g());
                        }
                        mo5222r(AbstractC3465l.m5238e(mo5220d(), mo5221g + j7, mo5221g()));
                        return c3454c;
                    }
                    return c3454c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: b */
    public final void mo5206b() {
        AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5230b(mo5221g()).m5229a(this.f16675j);
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: c */
    public void mo5198c() {
        if (!this.f16702c) {
            this.f16702c = true;
            synchronized (AbstractC3465l.f16721c) {
                m5228o();
            }
            mo5200l();
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: f */
    public boolean mo5208f() {
        return false;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: h */
    public int mo5209h() {
        return this.f16672g;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: i */
    public InterfaceC3279c mo5210i() {
        return this.f16671f;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: k */
    public void mo5199k() {
        this.f16677l++;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: l */
    public void mo5200l() {
        if (this.f16677l <= 0) {
            AbstractC2389n1.m3828a("no pending nested snapshots");
        }
        int i7 = this.f16677l - 1;
        this.f16677l = i7;
        if (i7 == 0 && !this.f16678m) {
            C2196i0 mo5215x = mo5215x();
            if (mo5215x != null) {
                if (this.f16678m) {
                    AbstractC2389n1.m3829b("Unsupported operation on a snapshot that has been applied");
                }
                mo5205B(null);
                long mo5221g = mo5221g();
                Object[] objArr = mo5215x.f12685b;
                long[] jArr = mo5215x.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j6 = jArr[i8];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j6) < 128) {
                                    for (AbstractC3451a0 mo3725a = ((InterfaceC3478y) objArr[(i8 << 3) + i10]).mo3725a(); mo3725a != null; mo3725a = mo3725a.f16668b) {
                                        long j7 = mo3725a.f16667a;
                                        if (j7 == mo5221g || AbstractC1805m.m3041e0(this.f16675j, Long.valueOf(j7))) {
                                            C3343j c3343j = AbstractC3465l.f16719a;
                                            mo3725a.f16667a = 0L;
                                        }
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            m5226a();
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: m */
    public void mo5201m() {
        if (!this.f16678m && !this.f16702c) {
            m5214v();
        }
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: n */
    public void mo5211n(InterfaceC3478y interfaceC3478y) {
        C2196i0 mo5215x = mo5215x();
        if (mo5215x == null) {
            int i7 = AbstractC2212q0.f12726a;
            mo5215x = new C2196i0();
            mo5205B(mo5215x);
        }
        mo5215x.m3599a(interfaceC3478y);
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: p */
    public final void mo5212p() {
        int length = this.f16676k.length;
        for (int i7 = 0; i7 < length; i7++) {
            AbstractC3465l.m5254u(this.f16676k[i7]);
        }
        m5228o();
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: t */
    public void mo5213t(int i7) {
        this.f16672g = i7;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: u */
    public AbstractC3459f mo5202u(InterfaceC3279c interfaceC3279c) {
        if (this.f16702c) {
            AbstractC2389n1.m3828a("Cannot use a disposed snapshot");
        }
        if (this.f16678m && this.f16703d < 0) {
            AbstractC2389n1.m3829b("Unsupported operation on a disposed or applied snapshot");
        }
        long mo5221g = mo5221g();
        m5204A(mo5221g());
        Object obj = AbstractC3465l.f16721c;
        synchronized (obj) {
            try {
                long j6 = AbstractC3465l.f16723e;
                long j7 = 1;
                AbstractC3465l.f16723e = j6 + j7;
                AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(j6);
                try {
                    C3456d c3456d = new C3456d(j6, AbstractC3465l.m5238e(mo5220d(), mo5221g + j7, j6), AbstractC3465l.m5245l(interfaceC3279c, mo5207e(), true), this);
                    if (!this.f16678m && !this.f16702c) {
                        long mo5221g2 = mo5221g();
                        synchronized (obj) {
                            long j8 = AbstractC3465l.f16723e;
                            AbstractC3465l.f16723e = j8 + j7;
                            mo5223s(j8);
                            AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(mo5221g());
                        }
                        mo5222r(AbstractC3465l.m5238e(mo5220d(), mo5221g2 + j7, mo5221g()));
                        return c3456d;
                    }
                    return c3456d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: v */
    public final void m5214v() {
        long j6;
        m5204A(mo5221g());
        if (!this.f16678m && !this.f16702c) {
            long mo5221g = mo5221g();
            synchronized (AbstractC3465l.f16721c) {
                long j7 = AbstractC3465l.f16723e;
                j6 = 1;
                AbstractC3465l.f16723e = j7 + j6;
                mo5223s(j7);
                AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(mo5221g());
            }
            mo5222r(AbstractC3465l.m5238e(mo5220d(), mo5221g + j6, mo5221g()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3470q mo5203w() {
        HashMap hashMap;
        C1813u c1813u;
        C2196i0 c2196i0;
        long j6;
        long j7;
        ArrayList arrayList;
        int size;
        int i7;
        C2196i0 mo5215x = mo5215x();
        if (mo5215x != null) {
            long j8 = AbstractC3465l.f16728j.f16701b;
            hashMap = AbstractC3465l.m5236c(j8, this, AbstractC3465l.f16722d.m5230b(j8));
        } else {
            hashMap = null;
        }
        C1813u c1813u2 = C1813u.f10860e;
        synchronized (AbstractC3465l.f16721c) {
            try {
                AbstractC3465l.m5237d(this);
                if (mo5215x != null && mo5215x.f12687d != 0) {
                    C3450a c3450a = AbstractC3465l.f16728j;
                    AbstractC3470q m5217z = m5217z(AbstractC3465l.f16723e, mo5215x, hashMap, AbstractC3465l.f16722d.m5230b(c3450a.f16701b));
                    if (!m5217z.equals(C3461h.f16704c)) {
                        return m5217z;
                    }
                    mo5206b();
                    c2196i0 = c3450a.f16673h;
                    AbstractC3465l.m5255v(c3450a, AbstractC3465l.f16719a);
                    mo5205B(null);
                    c3450a.f16673h = null;
                    c1813u = AbstractC3465l.f16726h;
                    this.f16678m = true;
                    if (c2196i0 != null) {
                        C2707g c2707g = new C2707g(c2196i0);
                        if (!c2196i0.m3605g()) {
                            int size2 = c1813u.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                ((InterfaceC3281e) c1813u.get(i8)).mo22d(c2707g, this);
                            }
                        }
                    }
                    if (mo5215x != null && mo5215x.m3606h()) {
                        C2707g c2707g2 = new C2707g(mo5215x);
                        size = c1813u.size();
                        for (i7 = 0; i7 < size; i7++) {
                            ((InterfaceC3281e) c1813u.get(i7)).mo22d(c2707g2, this);
                        }
                    }
                    synchronized (AbstractC3465l.f16721c) {
                        try {
                            mo5212p();
                            AbstractC3465l.m5240g();
                            if (c2196i0 != null) {
                                Object[] objArr = c2196i0.f12685b;
                                long[] jArr = c2196i0.f12684a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    j6 = 128;
                                    while (true) {
                                        long j9 = jArr[i9];
                                        j7 = 255;
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j9 & 255) < 128) {
                                                    AbstractC3465l.m5250q((InterfaceC3478y) objArr[(i9 << 3) + i11]);
                                                }
                                                j9 >>= 8;
                                            }
                                            if (i10 != 8) {
                                                break;
                                            }
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    if (mo5215x != null) {
                                        Object[] objArr2 = mo5215x.f12685b;
                                        long[] jArr2 = mo5215x.f12684a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j10 = jArr2[i12];
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j10 & j7) < j6) {
                                                            AbstractC3465l.m5250q((InterfaceC3478y) objArr2[(i12 << 3) + i14]);
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i13 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    arrayList = this.f16674i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i15 = 0; i15 < size3; i15++) {
                                            AbstractC3465l.m5250q((InterfaceC3478y) arrayList.get(i15));
                                        }
                                    }
                                    this.f16674i = null;
                                }
                            }
                            j6 = 128;
                            j7 = 255;
                            if (mo5215x != null) {
                            }
                            arrayList = this.f16674i;
                            if (arrayList != null) {
                            }
                            this.f16674i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return C3461h.f16704c;
                }
                mo5206b();
                C3450a c3450a2 = AbstractC3465l.f16728j;
                C2196i0 c2196i02 = c3450a2.f16673h;
                AbstractC3465l.m5255v(c3450a2, AbstractC3465l.f16719a);
                if (c2196i02 != null && c2196i02.m3606h()) {
                    c1813u = AbstractC3465l.f16726h;
                    c2196i0 = c2196i02;
                } else {
                    c1813u = c1813u2;
                    c2196i0 = null;
                }
                this.f16678m = true;
                if (c2196i0 != null) {
                }
                if (mo5215x != null) {
                    C2707g c2707g22 = new C2707g(mo5215x);
                    size = c1813u.size();
                    while (i7 < size) {
                    }
                }
                synchronized (AbstractC3465l.f16721c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public C2196i0 mo5215x() {
        return this.f16673h;
    }

    @Override // p161v0.AbstractC3459f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC3279c mo5207e() {
        return this.f16670e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, v0.q] */
    /* renamed from: z */
    public final AbstractC3470q m5217z(long j6, C2196i0 c2196i0, HashMap hashMap, C3463j c3463j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C3463j c3463j2;
        Object[] objArr;
        long[] jArr;
        C3463j c3463j3;
        Object[] objArr2;
        long[] jArr2;
        int i7;
        long j7;
        ArrayList arrayList4;
        AbstractC3451a0 mo3727c;
        C1687f c1687f;
        ArrayList arrayList5;
        C3463j m5232d = mo5220d().m5233e(mo5221g()).m5232d(this.f16675j);
        Object[] objArr3 = c2196i0.f12685b;
        long[] jArr3 = c2196i0.f12684a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j8 = jArr3[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j8 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC3478y interfaceC3478y = (InterfaceC3478y) objArr3[(i8 << 3) + i10];
                            jArr2 = jArr3;
                            AbstractC3451a0 mo3725a = interfaceC3478y.mo3725a();
                            i7 = i10;
                            ArrayList arrayList6 = arrayList3;
                            AbstractC3451a0 m5252s = AbstractC3465l.m5252s(mo3725a, j6, c3463j);
                            if (m5252s == null) {
                                c3463j3 = m5232d;
                                arrayList4 = arrayList2;
                                j7 = j8;
                            } else {
                                arrayList4 = arrayList2;
                                j7 = j8;
                                AbstractC3451a0 m5252s2 = AbstractC3465l.m5252s(mo3725a, mo5221g(), m5232d);
                                if (m5252s2 == null) {
                                    c3463j3 = m5232d;
                                } else {
                                    c3463j3 = m5232d;
                                    if (m5252s2.f16667a != 1 && !m5252s.equals(m5252s2)) {
                                        AbstractC3451a0 m5252s3 = AbstractC3465l.m5252s(mo3725a, mo5221g(), mo5220d());
                                        if (m5252s3 != null) {
                                            if (hashMap == null || (mo3727c = (AbstractC3451a0) hashMap.get(m5252s)) == null) {
                                                mo3727c = interfaceC3478y.mo3727c(m5252s2, m5252s, m5252s3);
                                            }
                                            if (mo3727c == null) {
                                                return new Object();
                                            }
                                            if (!mo3727c.equals(m5252s3)) {
                                                if (mo3727c.equals(m5252s)) {
                                                    if (arrayList6 == null) {
                                                        arrayList5 = new ArrayList();
                                                    } else {
                                                        arrayList5 = arrayList6;
                                                    }
                                                    arrayList5.add(new C1687f(interfaceC3478y, m5252s.mo3738b(mo5221g())));
                                                    if (arrayList4 == null) {
                                                        arrayList2 = new ArrayList();
                                                    } else {
                                                        arrayList2 = arrayList4;
                                                    }
                                                    arrayList2.add(interfaceC3478y);
                                                    arrayList3 = arrayList5;
                                                } else {
                                                    if (arrayList6 == null) {
                                                        arrayList3 = new ArrayList();
                                                    } else {
                                                        arrayList3 = arrayList6;
                                                    }
                                                    if (!mo3727c.equals(m5252s2)) {
                                                        c1687f = new C1687f(interfaceC3478y, mo3727c);
                                                    } else {
                                                        c1687f = new C1687f(interfaceC3478y, m5252s2.mo3738b(mo5221g()));
                                                    }
                                                    arrayList3.add(c1687f);
                                                    arrayList2 = arrayList4;
                                                }
                                            }
                                        } else {
                                            AbstractC3465l.m5251r();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            c3463j3 = m5232d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i7 = i10;
                            j7 = j8;
                        }
                        j8 = j7 >> 8;
                        i10 = i7 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        m5232d = c3463j3;
                    }
                    c3463j2 = m5232d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c3463j2 = m5232d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i8 != length) {
                    i8++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    m5232d = c3463j2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            m5214v();
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1687f c1687f2 = (C1687f) arrayList3.get(i11);
                InterfaceC3478y interfaceC3478y2 = (InterfaceC3478y) c1687f2.f10471e;
                AbstractC3451a0 abstractC3451a0 = (AbstractC3451a0) c1687f2.f10472f;
                abstractC3451a0.f16667a = j6;
                synchronized (AbstractC3465l.f16721c) {
                    abstractC3451a0.f16668b = interfaceC3478y2.mo3725a();
                    interfaceC3478y2.mo3726b(abstractC3451a0);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                c2196i0.m3609k((InterfaceC3478y) arrayList2.get(i12));
            }
            ArrayList arrayList7 = this.f16674i;
            if (arrayList7 != null) {
                arrayList2 = AbstractC1805m.m3058v0(arrayList7, arrayList2);
            }
            this.f16674i = arrayList2;
        }
        return C3461h.f16704c;
    }
}
