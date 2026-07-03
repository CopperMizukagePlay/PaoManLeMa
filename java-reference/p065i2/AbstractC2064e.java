package p065i2;

import android.view.View;
import androidx.compose.p007ui.draw.AbstractC0166a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC0206p0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p001a0.AbstractC0094y0;
import p001a0.C0028g2;
import p001a0.C0042k0;
import p001a0.C0057o;
import p001a0.C0068q2;
import p006a7.C0124g;
import p006a7.C0126i;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p027d1.C0464b;
import p028d2.AbstractC0479l;
import p032d6.AbstractC0581w;
import p034e0.C0593a;
import p039e5.C0979j0;
import p050g2.AbstractC1586f0;
import p050g2.C1602n0;
import p053g5.C1694m;
import p063i0.C1962o;
import p066i3.AbstractC2067b;
import p069i6.C2093f;
import p072j1.AbstractC2163b;
import p073j2.AbstractC2168e;
import p080k2.C2300k;
import p082k5.C2314d;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2315e;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2387n;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p090l5.C2466b;
import p090l5.C2467c;
import p092m.AbstractC2486c0;
import p092m.AbstractC2487d;
import p096m3.C2572v;
import p098m5.AbstractC2581a;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2588h;
import p100n.AbstractC2638e;
import p100n.AbstractC2694w1;
import p100n.C2675q0;
import p100n.C2692w;
import p106n6.AbstractC2721b;
import p107o.C2755l;
import p107o.C2762n0;
import p107o.C2765o0;
import p109o1.InterfaceC2796a;
import p121p6.AbstractC2882a;
import p121p6.C2884c;
import p121p6.C2886e;
import p122q.C2921l;
import p122q.EnumC2931o0;
import p122q.InterfaceC2925m0;
import p129r.AbstractC3021j;
import p129r.C3017f;
import p129r.C3022k;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3136j;
import p144t.C3137j0;
import p144t.InterfaceC3132h;
import p144t.InterfaceC3135i0;
import p145t0.C3173d;
import p146t1.C3229q0;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.AbstractC3333u;
import p152u.C3314b;
import p152u.C3330r;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p168w.AbstractC3642y;
import p168w.C3613a;
import p168w.C3626i;
import p168w.C3630m;
import p168w.C3639v;
import p170w1.AbstractC3674f1;
import p171w2.C3751a;
import p171w2.C3753c;
import p171w2.C3754d;
import p171w2.C3766p;
import p171w2.C3767q;
import p171w2.DialogC3769s;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3796d;
import p177x0.InterfaceC3797e;
import p177x0.InterfaceC3810r;
import p178x2.AbstractFutureC3820g;
import p178x2.C3816c;
import p178x2.C3819f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i2.e */
/* loaded from: classes.dex */
public abstract class AbstractC2064e {
    /* renamed from: E */
    public static int m3224E(float f7) {
        float f8;
        if (f7 < 0.0f) {
            f8 = -0.5f;
        } else {
            f8 = 0.5f;
        }
        return (int) (f7 + f8);
    }

    /* renamed from: F */
    public static final long m3225F(long j6) {
        return (Math.round(Float.intBitsToFloat((int) (j6 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j6 >> 32))) << 32);
    }

    /* renamed from: G */
    public static int m3226G(int[] iArr) {
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        return i7;
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, a7.i] */
    /* renamed from: H */
    public static final String m3227H(String str) {
        InetAddress m3244r;
        AbstractC3367j.m5100e(str, "<this>");
        int i7 = 0;
        int i8 = -1;
        if (AbstractC0444k.m928R(str, ":", false)) {
            if (AbstractC0451r.m971M(str, "[", false) && AbstractC0451r.m965G(str, "]", false)) {
                m3244r = m3244r(1, str.length() - 1, str);
            } else {
                m3244r = m3244r(0, str.length(), str);
            }
            if (m3244r != null) {
                byte[] address = m3244r.getAddress();
                if (address.length == 16) {
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < address.length) {
                        int i11 = i9;
                        while (i11 < 16 && address[i11] == 0 && address[i11 + 1] == 0) {
                            i11 += 2;
                        }
                        int i12 = i11 - i9;
                        if (i12 > i10 && i12 >= 4) {
                            i8 = i9;
                            i10 = i12;
                        }
                        i9 = i11 + 2;
                    }
                    ?? obj = new Object();
                    while (i7 < address.length) {
                        if (i7 == i8) {
                            obj.m272y(58);
                            i7 += i10;
                            if (i7 == 16) {
                                obj.m272y(58);
                            }
                        } else {
                            if (i7 > 0) {
                                obj.m272y(58);
                            }
                            byte b8 = address[i7];
                            byte[] bArr = AbstractC2721b.f14569a;
                            obj.m273z(((b8 & 255) << 8) | (address[i7 + 1] & 255));
                            i7 += 2;
                        }
                    }
                    return obj.m262o();
                }
                if (address.length == 4) {
                    return m3244r.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            AbstractC3367j.m5099d(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            AbstractC3367j.m5099d(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            AbstractC3367j.m5099d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() != 0) {
                int length = lowerCase.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char charAt = lowerCase.charAt(i13);
                    if (AbstractC3367j.m5101f(charAt, 31) <= 0 || AbstractC3367j.m5101f(charAt, 127) >= 0 || AbstractC0444k.m934X(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static void m3228I(C0124g c0124g, byte[] bArr) {
        long j6;
        AbstractC3367j.m5100e(c0124g, "cursor");
        AbstractC3367j.m5100e(bArr, "key");
        int length = bArr.length;
        int i7 = 0;
        do {
            byte[] bArr2 = c0124g.f518i;
            int i8 = c0124g.f519j;
            int i9 = c0124g.f520k;
            if (bArr2 != null) {
                while (i8 < i9) {
                    int i10 = i7 % length;
                    bArr2[i8] = (byte) (bArr2[i8] ^ bArr[i10]);
                    i8++;
                    i7 = i10 + 1;
                }
            }
            long j7 = c0124g.f517h;
            C0126i c0126i = c0124g.f514e;
            AbstractC3367j.m5097b(c0126i);
            if (j7 != c0126i.f524f) {
                long j8 = c0124g.f517h;
                if (j8 == -1) {
                    j6 = 0;
                } else {
                    j6 = j8 + (c0124g.f520k - c0124g.f519j);
                }
            } else {
                throw new IllegalStateException("no more bytes");
            }
        } while (c0124g.m237c(j6) != -1);
    }

    /* renamed from: J */
    public static final long m3229J(long j6, long j7) {
        boolean z7;
        boolean z8;
        int m2587c;
        boolean z9;
        boolean z10;
        boolean z11;
        int m2589e = C1602n0.m2589e(j6);
        int m2588d = C1602n0.m2588d(j6);
        boolean z12 = false;
        if (C1602n0.m2589e(j7) < C1602n0.m2588d(j6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (C1602n0.m2589e(j6) < C1602n0.m2588d(j7)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 & z8) {
            if (C1602n0.m2589e(j7) <= C1602n0.m2589e(j6)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (C1602n0.m2588d(j6) <= C1602n0.m2588d(j7)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 & z10) {
                m2589e = C1602n0.m2589e(j7);
                m2588d = m2589e;
            } else {
                if (C1602n0.m2589e(j6) <= C1602n0.m2589e(j7)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (C1602n0.m2588d(j7) <= C1602n0.m2588d(j6)) {
                    z12 = true;
                }
                if (z11 & z12) {
                    m2587c = C1602n0.m2587c(j7);
                } else {
                    int m2589e2 = C1602n0.m2589e(j7);
                    if (m2589e < C1602n0.m2588d(j7) && m2589e2 <= m2589e) {
                        m2589e = C1602n0.m2589e(j7);
                        m2587c = C1602n0.m2587c(j7);
                    } else {
                        m2588d = C1602n0.m2589e(j7);
                    }
                }
                m2588d -= m2587c;
            }
        } else if (m2588d > C1602n0.m2589e(j7)) {
            m2589e -= C1602n0.m2587c(j7);
            m2587c = C1602n0.m2587c(j7);
            m2588d -= m2587c;
        }
        return AbstractC1586f0.m2558b(m2589e, m2588d);
    }

    /* renamed from: K */
    public static Object m3230K(InterfaceC3281e interfaceC3281e, Object obj, InterfaceC2313c interfaceC2313c) {
        Object abstractC2583c;
        AbstractC3367j.m5100e(interfaceC3281e, "<this>");
        InterfaceC2318h mo662j = interfaceC2313c.mo662j();
        if (mo662j == C2319i.f13273e) {
            abstractC2583c = new AbstractC2588h(interfaceC2313c);
        } else {
            abstractC2583c = new AbstractC2583c(interfaceC2313c, mo662j);
        }
        AbstractC3382y.m5111b(2, interfaceC3281e);
        return interfaceC3281e.mo22d(obj, abstractC2583c);
    }

    /* renamed from: a */
    public static final void m3231a(InterfaceC3277a interfaceC3277a, C3767q c3767q, C3173d c3173d, C2395p c2395p, int i7) {
        InterfaceC3277a interfaceC3277a2;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(826668973);
        if ((i7 & 6) == 0) {
            interfaceC3277a2 = interfaceC3277a;
            if (c2395p.m3874i(interfaceC3277a2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            interfaceC3277a2 = interfaceC3277a;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(c3767q)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i8 & 147) != 146) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
            InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
            EnumC3103m enumC3103m = (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n);
            C2387n m3982z = AbstractC2418w.m3982z(c2395p);
            InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(c3173d, c2395p);
            Object[] objArr = new Object[0];
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                m3847O = C3753c.f17830g;
                c2395p.m3877j0(m3847O);
            }
            UUID uuid = (UUID) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
            boolean m3870g = c2395p.m3870g(view) | c2395p.m3870g(interfaceC3093c);
            Object m3847O2 = c2395p.m3847O();
            if (m3870g || m3847O2 == obj) {
                DialogC3769s dialogC3769s = new DialogC3769s(interfaceC3277a2, c3767q, view, enumC3103m, interfaceC3093c, uuid);
                C3173d c3173d2 = new C3173d(346960332, new C1962o(m3953A, 2), true);
                C3766p c3766p = dialogC3769s.f17879l;
                c3766p.setParentCompositionContext(m3982z);
                c3766p.f17861n.setValue(c3173d2);
                c3766p.f17865r = true;
                if (c3766p.f17432h == null && !c3766p.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                c3766p.m5619d();
                c2395p.m3877j0(dialogC3769s);
                m3847O2 = dialogC3769s;
            }
            DialogC3769s dialogC3769s2 = (DialogC3769s) m3847O2;
            boolean m3874i = c2395p.m3874i(dialogC3769s2);
            Object m3847O3 = c2395p.m3847O();
            if (m3874i || m3847O3 == obj) {
                m3847O3 = new C0979j0(dialogC3769s2, null, 2);
                c2395p.m3877j0(m3847O3);
            }
            AbstractC2418w.m3965g(C1694m.f10482a, c2395p, (InterfaceC3281e) m3847O3);
            boolean m3874i2 = c2395p.m3874i(dialogC3769s2);
            Object m3847O4 = c2395p.m3847O();
            if (m3874i2 || m3847O4 == obj) {
                m3847O4 = new C3751a(dialogC3769s2, 0);
                c2395p.m3877j0(m3847O4);
            }
            AbstractC2418w.m3962d(dialogC3769s2, (InterfaceC3279c) m3847O4, c2395p);
            boolean m3874i3 = c2395p.m3874i(dialogC3769s2);
            if ((i8 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z10 = m3874i3 | z8;
            if ((i8 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean m3866e = z10 | z9 | c2395p.m3866e(enumC3103m.ordinal());
            Object m3847O5 = c2395p.m3847O();
            if (m3866e || m3847O5 == obj) {
                Object c0042k0 = new C0042k0(dialogC3769s2, interfaceC3277a, c3767q, enumC3103m, 2);
                c2395p.m3877j0(c0042k0);
                m3847O5 = c0042k0;
            }
            AbstractC2418w.m3967i((InterfaceC3277a) m3847O5, c2395p);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(interfaceC3277a, c3767q, c3173d, i7, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, w.v] */
    /* renamed from: b */
    public static final void m3232b(AbstractC3642y abstractC3642y, InterfaceC3810r interfaceC3810r, InterfaceC3135i0 interfaceC3135i0, C3626i c3626i, int i7, float f7, C3801i c3801i, C3017f c3017f, boolean z7, InterfaceC2796a interfaceC2796a, C3022k c3022k, C3173d c3173d, C2395p c2395p, int i8) {
        int i9;
        int i10;
        int i11;
        C3801i c3801i2;
        boolean z8;
        boolean z9;
        C3022k c3022k2;
        InterfaceC2796a interfaceC2796a2;
        int i12;
        float f8;
        C3626i c3626i2;
        InterfaceC3135i0 interfaceC3135i02;
        C3017f c3017f2;
        boolean z10;
        boolean z11;
        C3626i c3626i3;
        C3801i c3801i3;
        C3022k c3022k3;
        InterfaceC2796a interfaceC2796a3;
        C3017f c3017f3;
        InterfaceC3135i0 interfaceC3135i03;
        c2395p.m3859a0(1870896258);
        int i13 = 4;
        if (c2395p.m3870g(abstractC3642y)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i14 = i8 | i9;
        if (c2395p.m3870g(interfaceC3810r)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10 | 3456;
        if (c2395p.m3866e(i7)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i16 = i15 | i11 | 911933440;
        if ((306783379 & i16) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3135i03 = interfaceC3135i0;
            c3626i3 = c3626i;
            f8 = f7;
            c3801i3 = c3801i;
            c3017f3 = c3017f;
            z11 = z7;
            interfaceC2796a3 = interfaceC2796a;
            c3022k3 = c3022k;
        } else {
            c2395p.m3854W();
            if ((i8 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i12 = i16 & (-29360129);
                interfaceC3135i02 = interfaceC3135i0;
                c3626i2 = c3626i;
                f8 = f7;
                c3801i2 = c3801i;
                c3017f2 = c3017f;
                z10 = z7;
                interfaceC2796a2 = interfaceC2796a;
                c3022k2 = c3022k;
            } else {
                float f9 = 0;
                C3137j0 c3137j0 = new C3137j0(f9, f9, f9, f9);
                float f10 = 0;
                c3801i2 = C3795c.f17974o;
                int i17 = (i16 & 14) | 196608;
                ?? obj = new Object();
                C2692w m4036a = AbstractC2486c0.m4036a(c2395p);
                Object obj2 = AbstractC2694w1.f14470a;
                C2675q0 m4231q = AbstractC2638e.m4231q(1, Float.valueOf(1));
                InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
                EnumC3103m enumC3103m = (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n);
                if ((((i17 & 14) ^ 6) > 4 && c2395p.m3870g(abstractC3642y)) || (i17 & 6) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean m3870g = c2395p.m3870g(interfaceC3093c) | z8 | c2395p.m3870g(m4036a) | c2395p.m3870g(m4231q) | c2395p.m3870g(obj) | c2395p.m3870g(enumC3103m);
                Object m3847O = c2395p.m3847O();
                Object obj3 = C2375k.f13421a;
                if (m3870g || m3847O == obj3) {
                    C0068q2 c0068q2 = new C0068q2(abstractC3642y, new C0028g2(i13, abstractC3642y, enumC3103m), (C3639v) obj);
                    float f11 = AbstractC3021j.f15576a;
                    m3847O = new C3017f(c0068q2, m4036a, m4231q);
                    c2395p.m3877j0(m3847O);
                }
                C3017f c3017f4 = (C3017f) m3847O;
                int i18 = i16 & (-29360129);
                int i19 = (i16 & 14) | 432;
                if ((((i19 & 14) ^ 6) > 4 && c2395p.m3870g(abstractC3642y)) || (i19 & 6) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Object m3847O2 = c2395p.m3847O();
                if (z9 || m3847O2 == obj3) {
                    m3847O2 = new C3613a(abstractC3642y);
                    c2395p.m3877j0(m3847O2);
                }
                C3613a c3613a = (C3613a) m3847O2;
                C3626i c3626i4 = C3626i.f17315a;
                c3022k2 = C3022k.f15577a;
                interfaceC2796a2 = c3613a;
                i12 = i18;
                f8 = f10;
                c3626i2 = c3626i4;
                interfaceC3135i02 = c3137j0;
                c3017f2 = c3017f4;
                z10 = true;
            }
            c2395p.m3889s();
            AbstractC2168e.m3521h(interfaceC3810r, abstractC3642y, interfaceC3135i02, c3017f2, z10, i7, f8, c3626i2, interfaceC2796a2, c3801i2, c3022k2, c3173d, c2395p, ((i12 << 9) & 29360128) | ((i12 >> 3) & 14) | 24576 | ((i12 << 3) & 112) | 1576320 | 905969664, 224688);
            C3801i c3801i4 = c3801i2;
            z11 = z10;
            c3626i3 = c3626i2;
            c3801i3 = c3801i4;
            c3022k3 = c3022k2;
            interfaceC2796a3 = interfaceC2796a2;
            c3017f3 = c3017f2;
            interfaceC3135i03 = interfaceC3135i02;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3630m(abstractC3642y, interfaceC3810r, interfaceC3135i03, c3626i3, i7, f8, c3801i3, c3017f3, z11, interfaceC2796a3, c3022k3, c3173d, i8);
        }
    }

    /* renamed from: c */
    public static final void m3233c(AbstractC2163b abstractC2163b, InterfaceC3810r interfaceC3810r, InterfaceC3797e interfaceC3797e, C3229q0 c3229q0, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC2163b abstractC2163b2;
        InterfaceC3797e interfaceC3797e2;
        C3229q0 c3229q02;
        c2395p.m3859a0(1142754848);
        if (c2395p.m3874i(abstractC2163b)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i14 = i8 | i7;
        if (c2395p.m3870g(interfaceC3810r)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i15 = i14 | i9;
        if (c2395p.m3870g(interfaceC3797e)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i16 = i15 | i10;
        if (c2395p.m3870g(c3229q0)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i17 = i16 | i11;
        if (c2395p.m3864d(1.0f)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        int i18 = i17 | i12;
        if (c2395p.m3870g(null)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        if (((i18 | i13) & 599187) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
            abstractC2163b2 = abstractC2163b;
            interfaceC3797e2 = interfaceC3797e;
            c3229q02 = c3229q0;
        } else {
            c2395p.m3857Z(1040258775);
            Object m3847O = c2395p.m3847O();
            int i19 = 1;
            if (m3847O == C2375k.f13421a) {
                m3847O = new C2755l(i19, 5);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3810r m1037a = AbstractC0479l.m1037a(C3807o.f17991a, false, (InterfaceC3279c) m3847O);
            c2395p.m3888r(false);
            abstractC2163b2 = abstractC2163b;
            interfaceC3797e2 = interfaceC3797e;
            c3229q02 = c3229q0;
            InterfaceC3810r m381d = AbstractC0166a.m381d(AbstractC3784a.m5800d(interfaceC3810r.mo5829e(m1037a)), abstractC2163b2, interfaceC3797e2, c3229q02, null, 2);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m381d);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(C2762n0.f14728a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            C3229q0 c3229q03 = c3229q02;
            m3891u.f13542d = new C2765o0(abstractC2163b2, interfaceC3810r, interfaceC3797e2, c3229q03, i7, 0);
        }
    }

    /* renamed from: d */
    public static final long m3234d(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3235e(int i7, int i8, C2395p c2395p, InterfaceC2925m0 interfaceC2925m0, InterfaceC3132h interfaceC3132h, InterfaceC3135i0 interfaceC3135i0, InterfaceC3279c interfaceC3279c, C3330r c3330r, InterfaceC3796d interfaceC3796d, InterfaceC3810r interfaceC3810r, boolean z7) {
        int i9;
        C3330r c3330r2;
        InterfaceC3135i0 interfaceC3135i02;
        int i10;
        InterfaceC3132h interfaceC3132h2;
        int i11;
        int i12;
        boolean z8;
        int i13;
        InterfaceC3279c interfaceC3279c2;
        boolean m3870g;
        Object m3847O;
        C3330r c3330r3;
        InterfaceC3796d interfaceC3796d2;
        InterfaceC3135i0 interfaceC3135i03;
        InterfaceC3132h interfaceC3132h3;
        int i14;
        boolean z9;
        InterfaceC2925m0 interfaceC2925m02;
        InterfaceC2925m0 interfaceC2925m03;
        InterfaceC3132h interfaceC3132h4;
        InterfaceC3135i0 interfaceC3135i04;
        InterfaceC3796d interfaceC3796d3;
        C2405r1 m3891u;
        int i15;
        int i16;
        int i17;
        int i18;
        c2395p.m3859a0(-740714857);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i9 = i18 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if ((i8 & 2) == 0) {
                c3330r2 = c3330r;
                if (c2395p.m3870g(c3330r2)) {
                    i17 = 32;
                    i9 |= i17;
                }
            } else {
                c3330r2 = c3330r;
            }
            i17 = 16;
            i9 |= i17;
        } else {
            c3330r2 = c3330r;
        }
        int i19 = i8 & 4;
        if (i19 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            interfaceC3135i02 = interfaceC3135i0;
            if (c2395p.m3870g(interfaceC3135i02)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
            int i20 = i9 | 3072;
            if ((i7 & 24576) != 0) {
                if ((i8 & 16) == 0) {
                    interfaceC3132h2 = interfaceC3132h;
                    if (c2395p.m3870g(interfaceC3132h2)) {
                        i16 = 16384;
                        i20 |= i16;
                    }
                } else {
                    interfaceC3132h2 = interfaceC3132h;
                }
                i16 = 8192;
                i20 |= i16;
            } else {
                interfaceC3132h2 = interfaceC3132h;
            }
            i11 = 196608 | i20;
            if ((1572864 & i7) == 0) {
                i11 = 720896 | i20;
            }
            i12 = i8 & 128;
            if (i12 == 0) {
                i11 |= 12582912;
            } else if ((12582912 & i7) == 0) {
                z8 = z7;
                if (c2395p.m3872h(z8)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i11 |= i13;
                if ((100663296 & i7) == 0) {
                    interfaceC3279c2 = interfaceC3279c;
                    if (c2395p.m3874i(interfaceC3279c2)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i11 |= i15;
                } else {
                    interfaceC3279c2 = interfaceC3279c;
                }
                if ((38347923 & i11) != 38347922 && c2395p.m3836D()) {
                    c2395p.m3852U();
                    interfaceC2925m03 = interfaceC2925m0;
                    interfaceC3135i04 = interfaceC3135i02;
                    interfaceC3132h4 = interfaceC3132h2;
                    interfaceC3796d3 = interfaceC3796d;
                } else {
                    c2395p.m3854W();
                    if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                        c2395p.m3852U();
                        if ((i8 & 2) != 0) {
                            i11 &= -113;
                        }
                        if ((i8 & 16) != 0) {
                            i11 &= -57345;
                        }
                        i14 = i11 & (-3670017);
                        interfaceC2925m02 = interfaceC2925m0;
                        interfaceC3796d2 = interfaceC3796d;
                        c3330r3 = c3330r2;
                        interfaceC3135i03 = interfaceC3135i02;
                        interfaceC3132h3 = interfaceC3132h2;
                        z9 = z8;
                    } else {
                        if ((i8 & 2) != 0) {
                            c3330r2 = AbstractC3333u.m5070a(c2395p);
                            i11 &= -113;
                        }
                        if (i19 != 0) {
                            float f7 = 0;
                            interfaceC3135i02 = new C3137j0(f7, f7, f7, f7);
                        }
                        if ((i8 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3132h2 = AbstractC3136j.f15791c;
                        }
                        C3800h c3800h = C3795c.f17976q;
                        C2692w m4036a = AbstractC2486c0.m4036a(c2395p);
                        m3870g = c2395p.m3870g(m4036a);
                        m3847O = c2395p.m3847O();
                        if (!m3870g || m3847O == C2375k.f13421a) {
                            m3847O = new C2921l(m4036a);
                            c2395p.m3877j0(m3847O);
                        }
                        C2921l c2921l = (C2921l) m3847O;
                        int i21 = i11 & (-3670017);
                        if (i12 != 0) {
                            z9 = true;
                            c3330r3 = c3330r2;
                            interfaceC3796d2 = c3800h;
                            interfaceC3135i03 = interfaceC3135i02;
                            interfaceC3132h3 = interfaceC3132h2;
                            i14 = i21;
                        } else {
                            c3330r3 = c3330r2;
                            interfaceC3796d2 = c3800h;
                            interfaceC3135i03 = interfaceC3135i02;
                            interfaceC3132h3 = interfaceC3132h2;
                            i14 = i21;
                            z9 = z8;
                        }
                        interfaceC2925m02 = c2921l;
                    }
                    c2395p.m3889s();
                    AbstractC2067b.m3279d((i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | ((i14 >> 3) & 3670016) | ((i14 << 9) & 234881024) | ((i14 << 15) & 1879048192), (i14 >> 18) & 896, c2395p, interfaceC2925m02, interfaceC3132h3, interfaceC3135i03, interfaceC3279c2, c3330r3, interfaceC3796d2, interfaceC3810r, z9);
                    interfaceC2925m03 = interfaceC2925m02;
                    interfaceC3132h4 = interfaceC3132h3;
                    interfaceC3135i04 = interfaceC3135i03;
                    c3330r2 = c3330r3;
                    interfaceC3796d3 = interfaceC3796d2;
                    z8 = z9;
                }
                m3891u = c2395p.m3891u();
                if (m3891u != null) {
                    m3891u.f13542d = new C3314b(interfaceC3810r, c3330r2, interfaceC3135i04, interfaceC3132h4, interfaceC3796d3, interfaceC2925m03, z8, interfaceC3279c, i7, i8);
                    return;
                }
                return;
            }
            z8 = z7;
            if ((100663296 & i7) == 0) {
            }
            if ((38347923 & i11) != 38347922) {
            }
            c2395p.m3854W();
            if ((i7 & 1) == 0) {
            }
            if ((i8 & 2) != 0) {
            }
            if (i19 != 0) {
            }
            if ((i8 & 16) != 0) {
            }
            C3800h c3800h2 = C3795c.f17976q;
            C2692w m4036a2 = AbstractC2486c0.m4036a(c2395p);
            m3870g = c2395p.m3870g(m4036a2);
            m3847O = c2395p.m3847O();
            if (!m3870g) {
            }
            m3847O = new C2921l(m4036a2);
            c2395p.m3877j0(m3847O);
            C2921l c2921l2 = (C2921l) m3847O;
            int i212 = i11 & (-3670017);
            if (i12 != 0) {
            }
            interfaceC2925m02 = c2921l2;
            c2395p.m3889s();
            AbstractC2067b.m3279d((i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | ((i14 >> 3) & 3670016) | ((i14 << 9) & 234881024) | ((i14 << 15) & 1879048192), (i14 >> 18) & 896, c2395p, interfaceC2925m02, interfaceC3132h3, interfaceC3135i03, interfaceC3279c2, c3330r3, interfaceC3796d2, interfaceC3810r, z9);
            interfaceC2925m03 = interfaceC2925m02;
            interfaceC3132h4 = interfaceC3132h3;
            interfaceC3135i04 = interfaceC3135i03;
            c3330r2 = c3330r3;
            interfaceC3796d3 = interfaceC3796d2;
            z8 = z9;
            m3891u = c2395p.m3891u();
            if (m3891u != null) {
            }
        }
        interfaceC3135i02 = interfaceC3135i0;
        int i202 = i9 | 3072;
        if ((i7 & 24576) != 0) {
        }
        i11 = 196608 | i202;
        if ((1572864 & i7) == 0) {
        }
        i12 = i8 & 128;
        if (i12 == 0) {
        }
        z8 = z7;
        if ((100663296 & i7) == 0) {
        }
        if ((38347923 & i11) != 38347922) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if ((i8 & 2) != 0) {
        }
        if (i19 != 0) {
        }
        if ((i8 & 16) != 0) {
        }
        C3800h c3800h22 = C3795c.f17976q;
        C2692w m4036a22 = AbstractC2486c0.m4036a(c2395p);
        m3870g = c2395p.m3870g(m4036a22);
        m3847O = c2395p.m3847O();
        if (!m3870g) {
        }
        m3847O = new C2921l(m4036a22);
        c2395p.m3877j0(m3847O);
        C2921l c2921l22 = (C2921l) m3847O;
        int i2122 = i11 & (-3670017);
        if (i12 != 0) {
        }
        interfaceC2925m02 = c2921l22;
        c2395p.m3889s();
        AbstractC2067b.m3279d((i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | ((i14 >> 3) & 3670016) | ((i14 << 9) & 234881024) | ((i14 << 15) & 1879048192), (i14 >> 18) & 896, c2395p, interfaceC2925m02, interfaceC3132h3, interfaceC3135i03, interfaceC3279c2, c3330r3, interfaceC3796d2, interfaceC3810r, z9);
        interfaceC2925m03 = interfaceC2925m02;
        interfaceC3132h4 = interfaceC3132h3;
        interfaceC3135i04 = interfaceC3135i03;
        c3330r2 = c3330r3;
        interfaceC3796d3 = interfaceC3796d2;
        z8 = z9;
        m3891u = c2395p.m3891u();
        if (m3891u != null) {
        }
    }

    /* renamed from: f */
    public static final void m3236f(InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        c2395p.m3859a0(1090521195);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) != 18) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = C3754d.f17834b;
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            int i11 = (((((i8 << 3) & 112) | (((i8 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(interfaceC3217l0, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            interfaceC3281e.mo22d(c2395p, Integer.valueOf((i11 >> 6) & 14));
            c2395p.m3888r(true);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0057o(i7, 6, interfaceC3810r, interfaceC3281e);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m3237g(p117p1.C2855g0 r7, p098m5.AbstractC2581a r8) {
        /*
            boolean r0 = r8 instanceof p115p.C2822b
            if (r0 == 0) goto L13
            r0 = r8
            p.b r0 = (p115p.C2822b) r0
            int r1 = r0.f14883j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14883j = r1
            goto L18
        L13:
            p.b r0 = new p.b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14882i
            int r1 = r0.f14883j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            p1.g0 r7 = r0.f14881h
            p060h5.AbstractC1793a0.m2972L(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p060h5.AbstractC1793a0.m2972L(r8)
        L32:
            r0.f14881h = r7
            r0.f14883j = r2
            p1.k r8 = p117p1.EnumC2860k.f14996f
            java.lang.Object r8 = r7.m4514a(r8, r0)
            l5.a r1 = p090l5.EnumC2465a.f13750e
            if (r8 != r1) goto L41
            return r1
        L41:
            p1.j r8 = (p117p1.C2859j) r8
            int r1 = r8.f14993c
            java.lang.Object r8 = r8.f14991a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L51:
            if (r4 >= r1) goto L6a
            java.lang.Object r5 = r8.get(r4)
            p1.s r5 = (p117p1.C2868s) r5
            boolean r6 = r5.m4551b()
            if (r6 != 0) goto L32
            boolean r6 = r5.f15013h
            if (r6 != 0) goto L32
            boolean r5 = r5.f15009d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L51
        L6a:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i2.AbstractC2064e.m3237g(p1.g0, m5.a):java.lang.Object");
    }

    /* renamed from: h */
    public static final void m3238h(AbstractC2882a abstractC2882a, C2884c c2884c, String str) {
        C2886e.f15073h.getClass();
        C2886e.f15075j.fine(c2884c.f15066b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC2882a.f15059a);
    }

    /* renamed from: l */
    public static final void m3239l(int i7, int i8) {
        if (i7 >= 0 && i7 < i8) {
        } else {
            throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
        }
    }

    /* renamed from: m */
    public static final void m3240m(int i7, int i8) {
        if (i7 >= 0 && i7 <= i8) {
        } else {
            throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
        }
    }

    /* renamed from: n */
    public static final void m3241n(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 <= i8) {
                return;
            } else {
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static InterfaceC2313c m3242p(InterfaceC2313c interfaceC2313c, InterfaceC2313c interfaceC2313c2, InterfaceC3281e interfaceC3281e) {
        AbstractC3367j.m5100e(interfaceC3281e, "<this>");
        if (interfaceC3281e instanceof AbstractC2581a) {
            return ((AbstractC2581a) interfaceC3281e).mo28k(interfaceC2313c, interfaceC2313c2);
        }
        InterfaceC2318h mo662j = interfaceC2313c2.mo662j();
        if (mo662j == C2319i.f13273e) {
            return new C2466b(interfaceC2313c2, interfaceC2313c, interfaceC3281e);
        }
        return new C2467c(interfaceC2313c2, mo662j, interfaceC3281e, interfaceC2313c);
    }

    /* renamed from: q */
    public static AbstractC0206p0 m3243q(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    AbstractC3367j.m5097b(newInstance);
                    return (AbstractC0206p0) newInstance;
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress m3244r(int i7, int i8, String str) {
        int i9;
        byte[] bArr = new byte[16];
        int i10 = i7;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i10 >= i8) {
                break;
            }
            if (i11 != 16) {
                int i14 = i10 + 2;
                if (i14 <= i8 && AbstractC0451r.m970L(str, "::", i10, false)) {
                    if (i12 == -1) {
                        i11 += 2;
                        i12 = i11;
                        if (i14 == i8) {
                            break;
                        }
                        i13 = i14;
                        int i15 = 0;
                        i10 = i13;
                        while (i10 < i8) {
                        }
                        i9 = i10 - i13;
                        return i9 == 0 ? null : null;
                    }
                    return null;
                }
                if (i11 != 0) {
                    if (AbstractC0451r.m970L(str, ":", i10, false)) {
                        i10++;
                    } else if (AbstractC0451r.m970L(str, ".", i10, false)) {
                        int i16 = i11 - 2;
                        int i17 = i16;
                        while (i13 < i8) {
                            if (i17 != 16) {
                                if (i17 != i16) {
                                    if (str.charAt(i13) == '.') {
                                        i13++;
                                    } else {
                                        return null;
                                    }
                                }
                                int i18 = 0;
                                int i19 = i13;
                                while (i19 < i8) {
                                    char charAt = str.charAt(i19);
                                    if (AbstractC3367j.m5101f(charAt, 48) < 0 || AbstractC3367j.m5101f(charAt, 57) > 0) {
                                        break;
                                    }
                                    if ((i18 != 0 || i13 == i19) && ((i18 * 10) + charAt) - 48 <= 255) {
                                        i19++;
                                    } else {
                                        return null;
                                    }
                                }
                                if (i19 - i13 != 0) {
                                    bArr[i17] = (byte) i18;
                                    i17++;
                                    i13 = i19;
                                } else {
                                    return null;
                                }
                            } else {
                                return null;
                            }
                        }
                        if (i17 == i11 + 2) {
                            i11 += 2;
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                }
                i13 = i10;
                int i152 = 0;
                i10 = i13;
                while (i10 < i8) {
                    int m4372r = AbstractC2721b.m4372r(str.charAt(i10));
                    if (m4372r == -1) {
                        break;
                    }
                    i152 = (i152 << 4) + m4372r;
                    i10++;
                }
                i9 = i10 - i13;
                if (i9 == 0 && i9 <= 4) {
                    int i20 = i11 + 1;
                    bArr[i11] = (byte) (255 & (i152 >>> 8));
                    i11 += 2;
                    bArr[i20] = (byte) (i152 & 255);
                }
            } else {
                return null;
            }
        }
        if (i11 != 16) {
            if (i12 == -1) {
                return null;
            }
            int i21 = i11 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i21, i21);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* renamed from: s */
    public static float m3245s(float f7, float f8, float f9, float f10) {
        double d7 = f7 - f9;
        double d8 = f8 - f10;
        return (float) Math.sqrt((d8 * d8) + (d7 * d7));
    }

    /* renamed from: t */
    public static float m3246t(int i7, int i8, int i9, int i10) {
        double d7 = i7 - i9;
        double d8 = i8 - i10;
        return (float) Math.sqrt((d8 * d8) + (d7 * d7));
    }

    /* renamed from: u */
    public static final float m3247u(AbstractC3642y abstractC3642y) {
        if (abstractC3642y.m5609j().f17361e == EnumC2931o0.f15241f) {
            return C0464b.m1008d(abstractC3642y.m5612n());
        }
        return C0464b.m1009e(abstractC3642y.m5612n());
    }

    /* renamed from: v */
    public static final String m3248v(long j6) {
        String str;
        if (j6 <= -999500000) {
            str = ((j6 - 500000000) / 1000000000) + " s ";
        } else if (j6 <= -999500) {
            str = ((j6 - 500000) / 1000000) + " ms";
        } else if (j6 <= 0) {
            str = ((j6 - 500) / 1000) + " µs";
        } else if (j6 < 999500) {
            str = ((j6 + 500) / 1000) + " µs";
        } else if (j6 < 999500000) {
            str = ((j6 + 500000) / 1000000) + " ms";
        } else {
            str = ((j6 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* renamed from: w */
    public static final int m3249w(C2300k c2300k, int i7) {
        boolean z7;
        boolean z8;
        if (AbstractC3367j.m5101f(c2300k.f13237e, C2300k.f13231f.f13237e) >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && z7) {
            return 3;
        }
        if (z7) {
            return 1;
        }
        if (!z8) {
            return 0;
        }
        return 2;
    }

    /* renamed from: x */
    public static InterfaceC2313c m3250x(InterfaceC2313c interfaceC2313c) {
        AbstractC2583c abstractC2583c;
        InterfaceC2313c interfaceC2313c2;
        AbstractC3367j.m5100e(interfaceC2313c, "<this>");
        if (interfaceC2313c instanceof AbstractC2583c) {
            abstractC2583c = (AbstractC2583c) interfaceC2313c;
        } else {
            abstractC2583c = null;
        }
        if (abstractC2583c != null && (interfaceC2313c = abstractC2583c.f14000g) == null) {
            InterfaceC2315e interfaceC2315e = (InterfaceC2315e) abstractC2583c.mo662j().mo853h(C2314d.f13272e);
            if (interfaceC2315e != null) {
                interfaceC2313c2 = new C2093f((AbstractC0581w) interfaceC2315e, abstractC2583c);
            } else {
                interfaceC2313c2 = abstractC2583c;
            }
            abstractC2583c.f14000g = interfaceC2313c2;
            return interfaceC2313c2;
        }
        return interfaceC2313c;
    }

    /* renamed from: y */
    public static boolean m3251y(int i7) {
        int type = Character.getType(i7);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static final boolean m3252z(AbstractC3642y abstractC3642y) {
        abstractC3642y.m5609j().getClass();
        m3247u(abstractC3642y);
        if (m3247u(abstractC3642y) > 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public abstract void mo3253A(Throwable th);

    /* renamed from: B */
    public abstract void mo3254B(C2572v c2572v);

    /* renamed from: C */
    public abstract void mo3255C(C3819f c3819f, C3819f c3819f2);

    /* renamed from: D */
    public abstract void mo3256D(C3819f c3819f, Thread thread);

    /* renamed from: i */
    public abstract boolean mo3257i(AbstractFutureC3820g abstractFutureC3820g, C3816c c3816c);

    /* renamed from: j */
    public abstract boolean mo3258j(AbstractFutureC3820g abstractFutureC3820g, Object obj, Object obj2);

    /* renamed from: k */
    public abstract boolean mo3259k(AbstractFutureC3820g abstractFutureC3820g, C3819f c3819f, C3819f c3819f2);

    /* renamed from: o */
    public abstract List mo3260o(String str, List list);
}
