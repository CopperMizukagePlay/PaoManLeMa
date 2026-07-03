package p085l0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p024c6.C0453t;
import p039e5.C1019k9;
import p053g5.C1687f;
import p060h5.C1815w;
import p068i5.AbstractC2080d;
import p077k.C2182b0;
import p077k.C2194h0;
import p077k.C2196i0;
import p077k.C2200k0;
import p077k.C2221w;
import p093m0.C2511a;
import p093m0.C2530j0;
import p101n0.C2705e;
import p101n0.C2707g;
import p145t0.C3179j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3479z;
import p161v0.InterfaceC3478y;
import p169w0.C3645b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.v */
/* loaded from: classes.dex */
public final class C2415v implements InterfaceC2403r {

    /* renamed from: e */
    public final AbstractC2406s f13602e;

    /* renamed from: f */
    public final C0031h1 f13603f;

    /* renamed from: g */
    public final AtomicReference f13604g = new AtomicReference(null);

    /* renamed from: h */
    public final Object f13605h = new Object();

    /* renamed from: i */
    public final C2200k0 f13606i;

    /* renamed from: j */
    public final C2338a2 f13607j;

    /* renamed from: k */
    public final C2194h0 f13608k;

    /* renamed from: l */
    public final C2196i0 f13609l;

    /* renamed from: m */
    public final C2196i0 f13610m;

    /* renamed from: n */
    public final C2194h0 f13611n;

    /* renamed from: o */
    public final C2511a f13612o;

    /* renamed from: p */
    public final C2511a f13613p;

    /* renamed from: q */
    public final C2194h0 f13614q;

    /* renamed from: r */
    public C2194h0 f13615r;

    /* renamed from: s */
    public boolean f13616s;

    /* renamed from: t */
    public C2415v f13617t;

    /* renamed from: u */
    public int f13618u;

    /* renamed from: v */
    public final C0019e1 f13619v;

    /* renamed from: w */
    public final C3179j f13620w;

    /* renamed from: x */
    public final C2395p f13621x;

    /* renamed from: y */
    public int f13622y;

    public C2415v(AbstractC2406s abstractC2406s, C0031h1 c0031h1) {
        this.f13602e = abstractC2406s;
        this.f13603f = c0031h1;
        C2200k0 c2200k0 = new C2200k0(new C2196i0());
        this.f13606i = c2200k0;
        C2338a2 c2338a2 = new C2338a2();
        if (abstractC2406s.mo3805c()) {
            c2338a2.f13339o = new C2221w();
        }
        if (abstractC2406s.mo3807e()) {
            c2338a2.m3719b();
        }
        this.f13607j = c2338a2;
        this.f13608k = AbstractC2080d.m3397j();
        this.f13609l = new C2196i0();
        this.f13610m = new C2196i0();
        this.f13611n = AbstractC2080d.m3397j();
        C2511a c2511a = new C2511a();
        this.f13612o = c2511a;
        C2511a c2511a2 = new C2511a();
        this.f13613p = c2511a2;
        this.f13614q = AbstractC2080d.m3397j();
        this.f13615r = AbstractC2080d.m3397j();
        C0019e1 c0019e1 = new C0019e1(abstractC2406s);
        this.f13619v = c0019e1;
        this.f13620w = new C3179j();
        C2395p c2395p = new C2395p(c0031h1, abstractC2406s, c2338a2, c2200k0, c2511a, c2511a2, c0019e1, this);
        abstractC2406s.mo3815m(c2395p);
        this.f13621x = c2395p;
        int i7 = AbstractC2363h.f13404a;
    }

    /* renamed from: A */
    public final void m3926A(InterfaceC3281e interfaceC3281e) {
        boolean m3935i = m3935i();
        m3942p();
        AbstractC2406s abstractC2406s = this.f13602e;
        if (m3935i) {
            C2395p c2395p = this.f13621x;
            c2395p.f13513z = 100;
            c2395p.f13512y = true;
            abstractC2406s.mo3803a(this, interfaceC3281e);
            c2395p.m3893w();
            return;
        }
        abstractC2406s.mo3803a(this, interfaceC3281e);
    }

    /* renamed from: a */
    public final void m3927a() {
        this.f13604g.set(null);
        this.f13612o.f13859a.m4073P();
        this.f13613p.f13859a.m4073P();
        C2200k0 c2200k0 = this.f13606i;
        if (!c2200k0.f12703e.m3605g()) {
            C3179j c3179j = this.f13620w;
            try {
                c3179j.m4879e(c2200k0, this.f13621x.m3835C());
                c3179j.m4876b();
            } finally {
                c3179j.m4875a();
            }
        }
    }

    /* renamed from: b */
    public final void m3928b(Object obj, boolean z7) {
        int i7;
        Object m3592g = this.f13608k.m3592g(obj);
        if (m3592g != null) {
            boolean z8 = m3592g instanceof C2196i0;
            EnumC2396p0 enumC2396p0 = EnumC2396p0.f13514e;
            C2196i0 c2196i0 = this.f13609l;
            C2196i0 c2196i02 = this.f13610m;
            C2194h0 c2194h0 = this.f13614q;
            if (z8) {
                C2196i0 c2196i03 = (C2196i0) m3592g;
                Object[] objArr = c2196i03.f12685b;
                long[] jArr = c2196i03.f12684a;
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
                                    C2405r1 c2405r1 = (C2405r1) objArr[(i8 << 3) + i11];
                                    if (!AbstractC2080d.m3377E(c2194h0, obj, c2405r1)) {
                                        i7 = i9;
                                        if (c2405r1.m3907c(obj) != enumC2396p0) {
                                            if (c2405r1.f13545g != null && !z7) {
                                                c2196i02.m3599a(c2405r1);
                                            } else {
                                                c2196i0.m3599a(c2405r1);
                                            }
                                        }
                                        j6 >>= i7;
                                        i11++;
                                        i9 = i7;
                                    }
                                }
                                i7 = i9;
                                j6 >>= i7;
                                i11++;
                                i9 = i7;
                            }
                            if (i10 != i9) {
                                return;
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C2405r1 c2405r12 = (C2405r1) m3592g;
                if (!AbstractC2080d.m3377E(c2194h0, obj, c2405r12) && c2405r12.m3907c(obj) != enumC2396p0) {
                    if (c2405r12.f13545g != null && !z7) {
                        c2196i02.m3599a(c2405r12);
                    } else {
                        c2196i0.m3599a(c2405r12);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m3929c(Set set, boolean z7) {
        long j6;
        long j7;
        long j8;
        char c7;
        long[] jArr;
        boolean z8;
        long[] jArr2;
        long j9;
        boolean m3601c;
        boolean z9;
        long[] jArr3;
        long j10;
        long[] jArr4;
        long[] jArr5;
        int i7;
        long j11;
        boolean z10;
        int i8;
        long j12;
        long[] jArr6;
        long[] jArr7;
        char c8;
        long j13;
        int i9;
        int i10;
        long[] jArr8;
        boolean z11 = set instanceof C2707g;
        C2194h0 c2194h0 = this.f13611n;
        Object obj = null;
        int i11 = 8;
        if (z11) {
            C2196i0 c2196i0 = ((C2707g) set).f14520e;
            Object[] objArr = c2196i0.f12685b;
            long[] jArr9 = c2196i0.f12684a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i12 = 0;
                j6 = 128;
                j7 = 255;
                while (true) {
                    long j14 = jArr9[i12];
                    char c9 = 7;
                    j8 = -9187201950435737472L;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j14 & 255) < 128) {
                                Object obj2 = objArr[(i12 << 3) + i14];
                                c8 = c9;
                                if (obj2 instanceof C2405r1) {
                                    ((C2405r1) obj2).m3907c(obj);
                                } else {
                                    m3928b(obj2, z7);
                                    Object m3592g = c2194h0.m3592g(obj2);
                                    if (m3592g != null) {
                                        if (m3592g instanceof C2196i0) {
                                            C2196i0 c2196i02 = (C2196i0) m3592g;
                                            Object[] objArr2 = c2196i02.f12685b;
                                            long[] jArr10 = c2196i02.f12684a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i15 = i11;
                                                i9 = length;
                                                int i16 = 0;
                                                while (true) {
                                                    long j15 = jArr10[i16];
                                                    j13 = j14;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j15) << c8) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            if ((j15 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                m3928b((C2352e0) objArr2[(i16 << 3) + i18], z7);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j15 >>= i15;
                                                            i18++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i17 != i15) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i16 == length2) {
                                                        break;
                                                    }
                                                    i16++;
                                                    jArr10 = jArr11;
                                                    j14 = j13;
                                                    jArr9 = jArr7;
                                                    i15 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j13 = j14;
                                            i9 = length;
                                            m3928b((C2352e0) m3592g, z7);
                                        }
                                        i10 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j13 = j14;
                                i9 = length;
                                i10 = 8;
                            } else {
                                jArr7 = jArr9;
                                c8 = c9;
                                j13 = j14;
                                i9 = length;
                                i10 = i11;
                            }
                            j14 = j13 >> i10;
                            i14++;
                            length = i9;
                            i11 = i10;
                            c9 = c8;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c7 = c9;
                        int i19 = length;
                        if (i13 != i11) {
                            break;
                        } else {
                            length = i19;
                        }
                    } else {
                        jArr6 = jArr9;
                        c7 = 7;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    jArr9 = jArr6;
                    obj = null;
                    i11 = 8;
                }
            } else {
                j6 = 128;
                j7 = 255;
                j8 = -9187201950435737472L;
                c7 = 7;
            }
        } else {
            j6 = 128;
            j7 = 255;
            j8 = -9187201950435737472L;
            c7 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C2405r1) {
                    ((C2405r1) obj3).m3907c(null);
                } else {
                    m3928b(obj3, z7);
                    Object m3592g2 = c2194h0.m3592g(obj3);
                    if (m3592g2 != null) {
                        if (m3592g2 instanceof C2196i0) {
                            C2196i0 c2196i03 = (C2196i0) m3592g2;
                            Object[] objArr3 = c2196i03.f12685b;
                            long[] jArr12 = c2196i03.f12684a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j16 = jArr12[i20];
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length3)) >>> 31);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j16 & 255) < 128) {
                                                m3928b((C2352e0) objArr3[(i20 << 3) + i22], z7);
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i21 != 8) {
                                            break;
                                        }
                                    }
                                    if (i20 != length3) {
                                        i20++;
                                    }
                                }
                            }
                        } else {
                            m3928b((C2352e0) m3592g2, z7);
                        }
                    }
                }
            }
        }
        C2194h0 c2194h02 = this.f13608k;
        C2196i0 c2196i04 = this.f13609l;
        if (z7) {
            C2196i0 c2196i05 = this.f13610m;
            if (c2196i05.m3606h()) {
                long[] jArr13 = c2194h02.f12676a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j17 = jArr13[i23];
                        if ((((~j17) << c7) & j17 & j8) != j8) {
                            int i24 = 8 - ((~(i23 - length4)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j17 & j7) < j6) {
                                    int i26 = (i23 << 3) + i25;
                                    Object obj4 = c2194h02.f12677b[i26];
                                    Object obj5 = c2194h02.f12678c[i26];
                                    if (obj5 instanceof C2196i0) {
                                        C2196i0 c2196i06 = (C2196i0) obj5;
                                        Object[] objArr4 = c2196i06.f12685b;
                                        long[] jArr14 = c2196i06.f12684a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j11 = j17;
                                            int i27 = 0;
                                            while (true) {
                                                long j18 = jArr14[i27];
                                                jArr5 = jArr13;
                                                i7 = length4;
                                                if ((((~j18) << c7) & j18 & j8) != j8) {
                                                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                    for (int i29 = 0; i29 < i28; i29 = i8 + 1) {
                                                        if ((j18 & j7) < j6) {
                                                            i8 = i29;
                                                            int i30 = (i27 << 3) + i8;
                                                            j12 = j18;
                                                            C2405r1 c2405r1 = (C2405r1) objArr4[i30];
                                                            if (c2196i05.m3601c(c2405r1) || c2196i04.m3601c(c2405r1)) {
                                                                c2196i06.m3610l(i30);
                                                            }
                                                        } else {
                                                            i8 = i29;
                                                            j12 = j18;
                                                        }
                                                        j18 = j12 >> 8;
                                                    }
                                                    if (i28 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i27 == length5) {
                                                    break;
                                                }
                                                i27++;
                                                length4 = i7;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i7 = length4;
                                            j11 = j17;
                                        }
                                        z10 = c2196i06.m3605g();
                                    } else {
                                        jArr5 = jArr13;
                                        i7 = length4;
                                        j11 = j17;
                                        AbstractC3367j.m5098c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C2405r1 c2405r12 = (C2405r1) obj5;
                                        if (!c2196i05.m3601c(c2405r12) && !c2196i04.m3601c(c2405r12)) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        c2194h02.m3597l(i26);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i7 = length4;
                                    j11 = j17;
                                }
                                j17 = j11 >> 8;
                                i25++;
                                length4 = i7;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i31 = length4;
                            if (i24 != 8) {
                                break;
                            } else {
                                length4 = i31;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i23 == length4) {
                            break;
                        }
                        i23++;
                        jArr13 = jArr4;
                    }
                }
                c2196i05.m3600b();
                m3934h();
                return;
            }
        }
        if (c2196i04.m3606h()) {
            long[] jArr15 = c2194h02.f12676a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j19 = jArr15[i32];
                    if ((((~j19) << c7) & j19 & j8) != j8) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j19 & j7) < j6) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                int i35 = (i32 << 3) + i34;
                                Object obj6 = c2194h02.f12677b[i35];
                                Object obj7 = c2194h02.f12678c[i35];
                                if (obj7 instanceof C2196i0) {
                                    C2196i0 c2196i07 = (C2196i0) obj7;
                                    Object[] objArr5 = c2196i07.f12685b;
                                    long[] jArr16 = c2196i07.f12684a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j9 = j19;
                                        int i36 = 0;
                                        while (true) {
                                            long j20 = jArr16[i36];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j20) << c7) & j20 & j8) != j8) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j20 & j7) < j6) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        jArr3 = jArr15;
                                                        int i39 = (i36 << 3) + i38;
                                                        j10 = j20;
                                                        if (c2196i04.m3601c((C2405r1) objArr6[i39])) {
                                                            c2196i07.m3610l(i39);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j10 = j20;
                                                    }
                                                    i38++;
                                                    jArr15 = jArr3;
                                                    j20 = j10 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i36 == length7) {
                                                break;
                                            }
                                            i36++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j9 = j19;
                                    }
                                    m3601c = c2196i07.m3605g();
                                } else {
                                    jArr2 = jArr15;
                                    j9 = j19;
                                    AbstractC3367j.m5098c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    m3601c = c2196i04.m3601c((C2405r1) obj7);
                                }
                                if (m3601c) {
                                    c2194h02.m3597l(i35);
                                }
                            } else {
                                jArr2 = jArr15;
                                j9 = j19;
                            }
                            i34++;
                            j19 = j9 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i33 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i32 == length6) {
                        break;
                    }
                    i32++;
                    jArr15 = jArr;
                }
            }
            m3934h();
            c2196i04.m3600b();
        }
    }

    /* renamed from: d */
    public final void m3930d() {
        synchronized (this.f13605h) {
            try {
                m3931e(this.f13612o);
                m3940n();
            } catch (Throwable th) {
                try {
                    if (!this.f13606i.f12703e.m3605g()) {
                        C3179j c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } catch (Throwable th2) {
                            c3179j.m4875a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m3927a();
                    throw th3;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m3931e(C2511a c2511a) {
        C3179j c3179j;
        long[] jArr;
        int i7;
        long[] jArr2;
        C3179j c3179j2;
        long j6;
        char c7;
        long j7;
        int i8;
        boolean z7;
        C2511a c2511a2 = this.f13613p;
        C2395p c2395p = this.f13621x;
        C3645b m3835C = c2395p.m3835C();
        C3179j c3179j3 = this.f13620w;
        c3179j3.m4879e(this.f13606i, m3835C);
        try {
            if (c2511a.f13859a.m4075R()) {
                try {
                    if (c2511a2.f13859a.m4075R()) {
                        c3179j3.m4876b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    C0031h1 c0031h1 = this.f13603f;
                    C2350d2 m3721d = this.f13607j.m3721d();
                    int i9 = 0;
                    try {
                        c2511a.m4067P(c0031h1, m3721d, c3179j3, c2395p.m3835C());
                        m3721d.m3769e(true);
                        c0031h1.mo94g();
                        Trace.endSection();
                        c3179j3.m4877c();
                        C2705e c2705e = c3179j3.f15898g;
                        if (c2705e.f14519g != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = c2705e.f14517e;
                                int i10 = c2705e.f14519g;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((InterfaceC3277a) objArr[i11]).mo52a();
                                }
                                c2705e.m4305g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.f13616s) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f13616s = false;
                                C2194h0 c2194h0 = this.f13608k;
                                long[] jArr3 = c2194h0.f12676a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j8 = jArr3[i12];
                                        char c8 = 7;
                                        long j9 = -9187201950435737472L;
                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = i9;
                                            while (i15 < i14) {
                                                if ((j8 & 255) < 128) {
                                                    c7 = c8;
                                                    int i16 = (i12 << 3) + i15;
                                                    j7 = j9;
                                                    Object obj = c2194h0.f12677b[i16];
                                                    Object obj2 = c2194h0.f12678c[i16];
                                                    if (obj2 instanceof C2196i0) {
                                                        C2196i0 c2196i0 = (C2196i0) obj2;
                                                        Object[] objArr2 = c2196i0.f12685b;
                                                        long[] jArr4 = c2196i0.f12684a;
                                                        int i17 = i13;
                                                        int length2 = jArr4.length - 2;
                                                        i7 = i15;
                                                        jArr2 = jArr3;
                                                        c3179j2 = c3179j3;
                                                        if (length2 >= 0) {
                                                            int i18 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j10 = jArr4[i18];
                                                                    j6 = j8;
                                                                    if ((((~j10) << c7) & j10 & j7) != j7) {
                                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                        for (int i20 = 0; i20 < i19; i20++) {
                                                                            if ((j10 & 255) < 128) {
                                                                                int i21 = (i18 << 3) + i20;
                                                                                if (!((C2405r1) objArr2[i21]).m3906b()) {
                                                                                    c2196i0.m3610l(i21);
                                                                                }
                                                                            }
                                                                            j10 >>= i17;
                                                                        }
                                                                        if (i19 != i17) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i18 == length2) {
                                                                        break;
                                                                    }
                                                                    i18++;
                                                                    i17 = 8;
                                                                    j8 = j6;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j6 = j8;
                                                        }
                                                        z7 = c2196i0.m3605g();
                                                    } else {
                                                        i7 = i15;
                                                        jArr2 = jArr3;
                                                        c3179j2 = c3179j3;
                                                        j6 = j8;
                                                        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        if (!((C2405r1) obj2).m3906b()) {
                                                            z7 = true;
                                                        } else {
                                                            z7 = false;
                                                        }
                                                    }
                                                    if (z7) {
                                                        c2194h0.m3597l(i16);
                                                    }
                                                    i8 = 8;
                                                } else {
                                                    i7 = i15;
                                                    jArr2 = jArr3;
                                                    c3179j2 = c3179j3;
                                                    j6 = j8;
                                                    c7 = c8;
                                                    j7 = j9;
                                                    i8 = i13;
                                                }
                                                j8 = j6 >> i8;
                                                i15 = i7 + 1;
                                                i13 = i8;
                                                c8 = c7;
                                                j9 = j7;
                                                c3179j3 = c3179j2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c3179j = c3179j3;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c3179j = c3179j3;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        c3179j3 = c3179j;
                                        jArr3 = jArr;
                                        i9 = 0;
                                    }
                                } else {
                                    c3179j = c3179j3;
                                }
                                m3934h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c3179j = c3179j3;
                        }
                        try {
                            if (c2511a2.f13859a.m4075R()) {
                                c3179j.m4876b();
                            }
                        } finally {
                            c3179j.m4875a();
                        }
                    } catch (Throwable th3) {
                        try {
                            m3721d.m3769e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (c2511a2.f13859a.m4075R()) {
                        c3179j3.m4876b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: f */
    public final void m3932f() {
        synchronized (this.f13605h) {
            try {
                if (this.f13613p.f13859a.m4076S()) {
                    m3931e(this.f13613p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f13606i.f12703e.m3605g()) {
                        C3179j c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } catch (Throwable th2) {
                            c3179j.m4875a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m3927a();
                    throw th3;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m3933g() {
        C3179j c3179j;
        synchronized (this.f13605h) {
            try {
                this.f13621x.f13509v = null;
                if (!this.f13606i.f12703e.m3605g()) {
                    c3179j = this.f13620w;
                    try {
                        c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                        c3179j.m4876b();
                        c3179j.m4875a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f13606i.f12703e.m3605g()) {
                        c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m3927a();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: h */
    public final void m3934h() {
        char c7;
        long j6;
        long j7;
        long j8;
        boolean z7;
        boolean z8;
        long[] jArr;
        long[] jArr2;
        int i7;
        long j9;
        char c8;
        long j10;
        long j11;
        int i8;
        boolean z9;
        int i9;
        long j12;
        C2194h0 c2194h0 = this.f13611n;
        long[] jArr3 = c2194h0.f12676a;
        int length = jArr3.length - 2;
        char c9 = 7;
        long j13 = -9187201950435737472L;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            long j14 = 128;
            while (true) {
                long j15 = jArr3[i11];
                j7 = 255;
                if ((((~j15) << c9) & j15 & j13) != j13) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j15 & 255) < j14) {
                            c8 = c9;
                            int i14 = (i11 << 3) + i13;
                            j10 = j13;
                            Object obj = c2194h0.f12677b[i14];
                            Object obj2 = c2194h0.f12678c[i14];
                            boolean z10 = obj2 instanceof C2196i0;
                            C2194h0 c2194h02 = this.f13608k;
                            if (z10) {
                                C2196i0 c2196i0 = (C2196i0) obj2;
                                Object[] objArr = c2196i0.f12685b;
                                long[] jArr4 = c2196i0.f12684a;
                                j11 = j14;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j9 = j15;
                                    int i15 = i10;
                                    int i16 = 0;
                                    while (true) {
                                        long j16 = jArr4[i16];
                                        jArr2 = jArr3;
                                        i7 = length;
                                        if ((((~j16) << c8) & j16 & j10) != j10) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j16 & 255) < j11) {
                                                    i9 = i18;
                                                    int i19 = (i16 << 3) + i9;
                                                    j12 = j16;
                                                    if (!c2194h02.m3588c((C2352e0) objArr[i19])) {
                                                        c2196i0.m3610l(i19);
                                                    }
                                                } else {
                                                    i9 = i18;
                                                    j12 = j16;
                                                }
                                                j16 = j12 >> i15;
                                                i18 = i9 + 1;
                                            }
                                            if (i17 != i15) {
                                                break;
                                            }
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        jArr3 = jArr2;
                                        length = i7;
                                        i15 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i7 = length;
                                    j9 = j15;
                                }
                                z9 = c2196i0.m3605g();
                            } else {
                                jArr2 = jArr3;
                                i7 = length;
                                j9 = j15;
                                j11 = j14;
                                AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                if (!c2194h02.m3588c((C2352e0) obj2)) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                            }
                            if (z9) {
                                c2194h0.m3597l(i14);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr3;
                            i7 = length;
                            j9 = j15;
                            c8 = c9;
                            j10 = j13;
                            j11 = j14;
                            i8 = i10;
                        }
                        j15 = j9 >> i8;
                        i13++;
                        i10 = i8;
                        c9 = c8;
                        j13 = j10;
                        j14 = j11;
                        jArr3 = jArr2;
                        length = i7;
                    }
                    jArr = jArr3;
                    int i20 = length;
                    c7 = c9;
                    j6 = j13;
                    j8 = j14;
                    if (i12 != i10) {
                        break;
                    } else {
                        length = i20;
                    }
                } else {
                    jArr = jArr3;
                    c7 = c9;
                    j6 = j13;
                    j8 = j14;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                c9 = c7;
                j13 = j6;
                j14 = j8;
                jArr3 = jArr;
                i10 = 8;
            }
        } else {
            c7 = 7;
            j6 = -9187201950435737472L;
            j7 = 255;
            j8 = 128;
        }
        C2196i0 c2196i02 = this.f13610m;
        if (c2196i02.m3606h()) {
            Object[] objArr2 = c2196i02.f12685b;
            long[] jArr5 = c2196i02.f12684a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i21 = 0;
                while (true) {
                    long j17 = jArr5[i21];
                    if ((((~j17) << c7) & j17 & j6) != j6) {
                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                        for (int i23 = 0; i23 < i22; i23++) {
                            if ((j17 & j7) < j8) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                int i24 = (i21 << 3) + i23;
                                if (((C2405r1) objArr2[i24]).f13545g != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (!z8) {
                                    c2196i02.m3610l(i24);
                                }
                            }
                            j17 >>= 8;
                        }
                        if (i22 != 8) {
                            return;
                        }
                    }
                    if (i21 != length3) {
                        i21++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m3935i() {
        boolean z7;
        synchronized (this.f13605h) {
            z7 = true;
            if (this.f13622y != 1) {
                z7 = false;
            }
            if (z7) {
                this.f13622y = 0;
            }
        }
        return z7;
    }

    /* renamed from: j */
    public final void m3936j(InterfaceC3281e interfaceC3281e) {
        try {
            synchronized (this.f13605h) {
                m3939m();
                C2194h0 c2194h0 = this.f13615r;
                this.f13615r = AbstractC2080d.m3397j();
                try {
                    C2395p c2395p = this.f13621x;
                    if (!c2395p.f13492e.f13859a.m4075R()) {
                        AbstractC2399q.m3900c("Expected applyChanges() to have been called");
                    }
                    c2395p.f13482P = null;
                    try {
                        c2395p.m3886p(c2194h0, interfaceC3281e);
                    } finally {
                        c2395p.f13482P = null;
                    }
                } catch (Throwable th) {
                    this.f13615r = c2194h0;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f13606i.f12703e.m3605g()) {
                    C3179j c3179j = this.f13620w;
                    try {
                        c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                        c3179j.m4876b();
                        c3179j.m4875a();
                    } catch (Throwable th3) {
                        c3179j.m4875a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m3927a();
                throw th4;
            }
        }
    }

    /* renamed from: k */
    public final void m3937k() {
        boolean z7;
        C3179j c3179j;
        synchronized (this.f13605h) {
            try {
                if (this.f13607j.f13330f > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                try {
                    try {
                        if (!z7) {
                            if (!this.f13606i.f12703e.m3605g()) {
                            }
                            this.f13608k.m3586a();
                            this.f13611n.m3586a();
                            this.f13615r.m3586a();
                            this.f13612o.f13859a.m4073P();
                            this.f13613p.f13859a.m4073P();
                            C2395p c2395p = this.f13621x;
                            c2395p.f13471E.clear();
                            c2395p.f13506s.clear();
                            c2395p.f13492e.f13859a.m4073P();
                            c2395p.f13509v = null;
                            this.f13622y = 1;
                        }
                        c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                        if (z7) {
                            C2350d2 m3721d = this.f13607j.m3721d();
                            try {
                                m3721d.m3777n(m3721d.f13378t, new C1019k9(this.f13620w, m3721d));
                                m3721d.m3769e(true);
                                this.f13603f.mo94g();
                                c3179j.m4877c();
                            } catch (Throwable th) {
                                m3721d.m3769e(false);
                                throw th;
                            }
                        }
                        c3179j.m4876b();
                        c3179j.m4875a();
                        this.f13608k.m3586a();
                        this.f13611n.m3586a();
                        this.f13615r.m3586a();
                        this.f13612o.f13859a.m4073P();
                        this.f13613p.f13859a.m4073P();
                        C2395p c2395p2 = this.f13621x;
                        c2395p2.f13471E.clear();
                        c2395p2.f13506s.clear();
                        c2395p2.f13492e.f13859a.m4073P();
                        c2395p2.f13509v = null;
                        this.f13622y = 1;
                    } catch (Throwable th2) {
                        c3179j.m4875a();
                        throw th2;
                    }
                    c3179j = this.f13620w;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: l */
    public final void m3938l() {
        boolean z7;
        synchronized (this.f13605h) {
            try {
                if (this.f13621x.f13472F) {
                    AbstractC2389n1.m3829b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f13622y != 3) {
                    this.f13622y = 3;
                    int i7 = AbstractC2363h.f13404a;
                    C2511a c2511a = this.f13621x.f13478L;
                    if (c2511a != null) {
                        m3931e(c2511a);
                    }
                    if (this.f13607j.f13330f > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7 || !this.f13606i.f12703e.m3605g()) {
                        C3179j c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                            if (z7) {
                                C2350d2 m3721d = this.f13607j.m3721d();
                                try {
                                    m3721d.m3777n(m3721d.f13378t, new C0453t(12, this.f13620w));
                                    m3721d.m3751G();
                                    m3721d.m3769e(true);
                                    this.f13603f.m99m();
                                    this.f13603f.mo94g();
                                    c3179j.m4877c();
                                } catch (Throwable th) {
                                    m3721d.m3769e(false);
                                    throw th;
                                }
                            }
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } catch (Throwable th2) {
                            c3179j.m4875a();
                            throw th2;
                        }
                    }
                    C2395p c2395p = this.f13621x;
                    c2395p.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c2395p.f13489b.mo3818p(c2395p);
                        c2395p.f13471E.clear();
                        c2395p.f13506s.clear();
                        c2395p.f13492e.f13859a.m4073P();
                        c2395p.f13509v = null;
                        c2395p.f13488a.m99m();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f13602e.mo3819q(this);
    }

    /* renamed from: m */
    public final void m3939m() {
        Object obj = AbstractC2418w.f13623a;
        AtomicReference atomicReference = this.f13604g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    m3929c((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        m3929c(set, true);
                    }
                    return;
                }
                AbstractC2399q.m3901d("corrupt pendingModifications drain: " + atomicReference);
                throw new RuntimeException();
            }
            AbstractC2399q.m3901d("pending composition has not been applied");
            throw new RuntimeException();
        }
    }

    /* renamed from: n */
    public final void m3940n() {
        AtomicReference atomicReference = this.f13604g;
        Object andSet = atomicReference.getAndSet(null);
        if (!AbstractC3367j.m5096a(andSet, AbstractC2418w.f13623a)) {
            if (andSet instanceof Set) {
                m3929c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    m3929c(set, false);
                }
                return;
            }
            if (andSet == null) {
                AbstractC2399q.m3901d("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new RuntimeException();
            }
            AbstractC2399q.m3901d("corrupt pendingModifications drain: " + atomicReference);
            throw new RuntimeException();
        }
    }

    /* renamed from: o */
    public final void m3941o() {
        C1815w c1815w = C1815w.f10862e;
        AtomicReference atomicReference = this.f13604g;
        Object andSet = atomicReference.getAndSet(c1815w);
        if (!AbstractC3367j.m5096a(andSet, AbstractC2418w.f13623a) && andSet != null) {
            if (andSet instanceof Set) {
                m3929c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    m3929c(set, false);
                }
                return;
            }
            AbstractC2399q.m3901d("corrupt pendingModifications drain: " + atomicReference);
            throw new RuntimeException();
        }
    }

    /* renamed from: p */
    public final void m3942p() {
        String str;
        int i7 = this.f13622y;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            AbstractC2389n1.m3829b(str);
        }
    }

    /* renamed from: q */
    public final void m3943q(ArrayList arrayList) {
        C2200k0 c2200k0 = this.f13606i;
        C2395p c2395p = this.f13621x;
        if (arrayList.size() <= 0) {
            try {
                c2395p.getClass();
                try {
                    c2395p.m3837E(arrayList);
                    c2395p.m3876j();
                    return;
                } catch (Throwable th) {
                    c2395p.m3858a();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!c2200k0.f12703e.m3605g()) {
                        C3179j c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(c2200k0, c2395p.m3835C());
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } catch (Throwable th3) {
                            c3179j.m4875a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    m3927a();
                    throw th4;
                }
            }
        }
        ((AbstractC2422x0) ((C1687f) arrayList.get(0)).f10471e).getClass();
        throw null;
    }

    /* renamed from: r */
    public final EnumC2396p0 m3944r(C2405r1 c2405r1, Object obj) {
        C2415v c2415v;
        int i7 = c2405r1.f13540b;
        if ((i7 & 2) != 0) {
            c2405r1.f13540b = i7 | 4;
        }
        C2335a c2335a = c2405r1.f13541c;
        if (c2335a != null && c2335a.m3715a()) {
            if (!this.f13607j.m3722e(c2335a)) {
                synchronized (this.f13605h) {
                    c2415v = this.f13617t;
                }
                if (c2415v != null) {
                    C2395p c2395p = c2415v.f13621x;
                    if (c2395p.f13472F && c2395p.m3867e0(c2405r1, obj)) {
                        return EnumC2396p0.f13517h;
                    }
                }
                return EnumC2396p0.f13514e;
            }
            if (c2405r1.f13542d != null) {
                EnumC2396p0 m3946t = m3946t(c2405r1, c2335a, obj);
                if (m3946t != EnumC2396p0.f13514e) {
                    this.f13619v.m38i();
                }
                return m3946t;
            }
            return EnumC2396p0.f13514e;
        }
        return EnumC2396p0.f13514e;
    }

    /* renamed from: s */
    public final void m3945s() {
        C2405r1 c2405r1;
        C2415v c2415v;
        synchronized (this.f13605h) {
            try {
                for (Object obj : this.f13607j.f13331g) {
                    if (obj instanceof C2405r1) {
                        c2405r1 = (C2405r1) obj;
                    } else {
                        c2405r1 = null;
                    }
                    if (c2405r1 != null && (c2415v = c2405r1.f13539a) != null) {
                        c2415v.m3944r(c2405r1, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final EnumC2396p0 m3946t(C2405r1 c2405r1, C2335a c2335a, Object obj) {
        boolean z7;
        int i7;
        synchronized (this.f13605h) {
            try {
                C2415v c2415v = this.f13617t;
                C2415v c2415v2 = null;
                if (c2415v != null) {
                    C2338a2 c2338a2 = this.f13607j;
                    int i8 = this.f13618u;
                    if (c2338a2.f13335k) {
                        AbstractC2399q.m3900c("Writer is active");
                    }
                    if (i8 < 0 || i8 >= c2338a2.f13330f) {
                        AbstractC2399q.m3900c("Invalid group index");
                    }
                    if (c2338a2.m3722e(c2335a)) {
                        int i9 = c2338a2.f13329e[(i8 * 5) + 3] + i8;
                        int i10 = c2335a.f13325a;
                        if (i8 <= i10 && i10 < i9) {
                            c2415v2 = c2415v;
                        }
                    }
                    c2415v = null;
                    c2415v2 = c2415v;
                }
                if (c2415v2 == null) {
                    C2395p c2395p = this.f13621x;
                    if (c2395p.f13472F && c2395p.m3867e0(c2405r1, obj)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        return EnumC2396p0.f13517h;
                    }
                    if (obj == null) {
                        this.f13615r.m3598m(c2405r1, C2413u0.f13574i);
                    } else if (!(obj instanceof C2352e0)) {
                        this.f13615r.m3598m(c2405r1, C2413u0.f13574i);
                    } else {
                        Object m3592g = this.f13615r.m3592g(c2405r1);
                        if (m3592g != null) {
                            if (m3592g instanceof C2196i0) {
                                C2196i0 c2196i0 = (C2196i0) m3592g;
                                Object[] objArr = c2196i0.f12685b;
                                long[] jArr = c2196i0.f12684a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    loop0: while (true) {
                                        long j6 = jArr[i11];
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j6 & 255) < 128) {
                                                    i7 = i12;
                                                    if (objArr[(i11 << 3) + i14] == C2413u0.f13574i) {
                                                        break loop0;
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
                            } else if (m3592g == C2413u0.f13574i) {
                            }
                        }
                        AbstractC2080d.m3394g(this.f13615r, c2405r1, obj);
                    }
                }
                if (c2415v2 != null) {
                    return c2415v2.m3946t(c2405r1, c2335a, obj);
                }
                this.f13602e.mo3812j(this);
                if (this.f13621x.f13472F) {
                    return EnumC2396p0.f13516g;
                }
                return EnumC2396p0.f13515f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m3947u(Object obj) {
        Object m3592g = this.f13608k.m3592g(obj);
        if (m3592g != null) {
            boolean z7 = m3592g instanceof C2196i0;
            C2194h0 c2194h0 = this.f13614q;
            if (z7) {
                C2196i0 c2196i0 = (C2196i0) m3592g;
                Object[] objArr = c2196i0.f12685b;
                long[] jArr = c2196i0.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j6 = jArr[i7];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j6) < 128) {
                                    C2405r1 c2405r1 = (C2405r1) objArr[(i7 << 3) + i9];
                                    if (c2405r1.m3907c(obj) == EnumC2396p0.f13517h) {
                                        AbstractC2080d.m3394g(c2194h0, obj, c2405r1);
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i8 != 8) {
                                return;
                            }
                        }
                        if (i7 != length) {
                            i7++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C2405r1 c2405r12 = (C2405r1) m3592g;
                if (c2405r12.m3907c(obj) == EnumC2396p0.f13517h) {
                    AbstractC2080d.m3394g(c2194h0, obj, c2405r12);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3948v(Set set) {
        boolean z7 = set instanceof C2707g;
        C2194h0 c2194h0 = this.f13611n;
        C2194h0 c2194h02 = this.f13608k;
        if (z7) {
            C2196i0 c2196i0 = ((C2707g) set).f14520e;
            Object[] objArr = c2196i0.f12685b;
            long[] jArr = c2196i0.f12684a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                loop0: while (true) {
                    long j6 = jArr[i7];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j6) < 128) {
                                Object obj = objArr[(i7 << 3) + i9];
                                if (c2194h02.m3588c(obj) || c2194h0.m3588c(obj)) {
                                    break loop0;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (c2194h02.m3588c(obj2) || c2194h0.m3588c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m3949w() {
        boolean m4076S;
        synchronized (this.f13605h) {
            m3939m();
            try {
                C2194h0 c2194h0 = this.f13615r;
                this.f13615r = AbstractC2080d.m3397j();
                try {
                    C2395p c2395p = this.f13621x;
                    C2530j0 c2530j0 = c2395p.f13492e.f13859a;
                    if (!c2530j0.m4075R()) {
                        AbstractC2399q.m3900c("Expected applyChanges() to have been called");
                    }
                    if (c2194h0.f12680e <= 0 && c2395p.f13506s.isEmpty()) {
                        m4076S = false;
                    } else {
                        c2395p.f13482P = null;
                        try {
                            c2395p.m3886p(c2194h0, null);
                            c2395p.f13482P = null;
                            m4076S = c2530j0.m4076S();
                        } catch (Throwable th) {
                            c2395p.f13482P = null;
                            throw th;
                        }
                    }
                    if (!m4076S) {
                        m3940n();
                    }
                } catch (Throwable th2) {
                    this.f13615r = c2194h0;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f13606i.f12703e.m3605g()) {
                        C3179j c3179j = this.f13620w;
                        try {
                            c3179j.m4879e(this.f13606i, this.f13621x.m3835C());
                            c3179j.m4876b();
                            c3179j.m4875a();
                        } catch (Throwable th4) {
                            c3179j.m4875a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m3927a();
                    throw th5;
                }
            }
        }
        return m4076S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    /* renamed from: x */
    public final void m3950x(C2707g c2707g) {
        C2707g c2707g2;
        while (true) {
            Object obj = this.f13604g.get();
            if (obj != null && !obj.equals(AbstractC2418w.f13623a)) {
                if (obj instanceof Set) {
                    c2707g2 = new Set[]{obj, c2707g};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = c2707g;
                    c2707g2 = copyOf;
                } else {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f13604g).toString());
                }
            } else {
                c2707g2 = c2707g;
            }
            AtomicReference atomicReference = this.f13604g;
            while (!atomicReference.compareAndSet(obj, c2707g2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f13605h) {
                    m3940n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3951y(Object obj) {
        C2405r1 m3833A;
        int i7;
        boolean z7;
        boolean z8;
        boolean z9;
        int i8;
        C2395p c2395p = this.f13621x;
        if (c2395p.f13467A <= 0 && (m3833A = c2395p.m3833A()) != null) {
            boolean z10 = true;
            int i9 = m3833A.f13540b | 1;
            m3833A.f13540b = i9;
            if ((i9 & 32) == 0) {
                C2182b0 c2182b0 = m3833A.f13544f;
                if (c2182b0 == null) {
                    c2182b0 = new C2182b0();
                    m3833A.f13544f = c2182b0;
                }
                int i10 = m3833A.f13543e;
                int m3550c = c2182b0.m3550c(obj);
                if (m3550c < 0) {
                    m3550c = ~m3550c;
                    i7 = -1;
                } else {
                    i7 = c2182b0.f12623c[m3550c];
                }
                c2182b0.f12622b[m3550c] = obj;
                c2182b0.f12623c[m3550c] = i10;
                if (i7 == m3833A.f13543e) {
                    z7 = true;
                    this.f13619v.m38i();
                    if (z7) {
                        if (obj instanceof AbstractC3479z) {
                            ((AbstractC3479z) obj).m5284f(1);
                        }
                        AbstractC2080d.m3394g(this.f13608k, obj, m3833A);
                        if (obj instanceof C2352e0) {
                            C2352e0 c2352e0 = (C2352e0) obj;
                            C2348d0 m3792h = c2352e0.m3792h();
                            C2194h0 c2194h0 = this.f13611n;
                            AbstractC2080d.m3378F(c2194h0, obj);
                            C2182b0 c2182b02 = m3792h.f13355e;
                            Object[] objArr = c2182b02.f12622b;
                            long[] jArr = c2182b02.f12621a;
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
                                                i8 = i12;
                                                InterfaceC3478y interfaceC3478y = (InterfaceC3478y) objArr[(i11 << 3) + i14];
                                                if (interfaceC3478y instanceof AbstractC3479z) {
                                                    z9 = true;
                                                    ((AbstractC3479z) interfaceC3478y).m5284f(1);
                                                } else {
                                                    z9 = true;
                                                }
                                                AbstractC2080d.m3394g(c2194h0, interfaceC3478y, obj);
                                            } else {
                                                z9 = z10;
                                                i8 = i12;
                                            }
                                            j6 >>= i8;
                                            i14++;
                                            z10 = z9;
                                            i12 = i8;
                                        }
                                        z8 = z10;
                                        if (i13 != i12) {
                                            break;
                                        }
                                    } else {
                                        z8 = z10;
                                    }
                                    if (i11 == length) {
                                        break;
                                    }
                                    i11++;
                                    z10 = z8;
                                }
                            }
                            Object obj2 = m3792h.f13356f;
                            C2194h0 c2194h02 = m3833A.f13545g;
                            if (c2194h02 == null) {
                                c2194h02 = new C2194h0();
                                m3833A.f13545g = c2194h02;
                            }
                            c2194h02.m3598m(c2352e0, obj2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z7 = false;
            this.f13619v.m38i();
            if (z7) {
            }
        }
    }

    /* renamed from: z */
    public final void m3952z(Object obj) {
        synchronized (this.f13605h) {
            try {
                m3947u(obj);
                Object m3592g = this.f13611n.m3592g(obj);
                if (m3592g != null) {
                    if (m3592g instanceof C2196i0) {
                        C2196i0 c2196i0 = (C2196i0) m3592g;
                        Object[] objArr = c2196i0.f12685b;
                        long[] jArr = c2196i0.f12684a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j6 = jArr[i7];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((255 & j6) < 128) {
                                            m3947u((C2352e0) objArr[(i7 << 3) + i9]);
                                        }
                                        j6 >>= 8;
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
                    } else {
                        m3947u((C2352e0) m3592g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
