package p063i0;

import androidx.compose.foundation.AbstractC0149e;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.NoSuchElementException;
import p001a0.C0040j2;
import p001a0.C0062p0;
import p028d2.AbstractC0479l;
import p034e0.C0611j;
import p068i5.AbstractC2080d;
import p071j0.AbstractC2120d;
import p071j0.C2135k0;
import p073j2.AbstractC2168e;
import p078k0.AbstractC2256y;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p117p1.AbstractC2847c0;
import p117p1.C2845b0;
import p117p1.C2859j;
import p122q.AbstractC2913i0;
import p122q.EnumC2931o0;
import p137s.C3081j;
import p140s2.EnumC3103m;
import p144t.AbstractC3144n;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3802j;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p195z5.C3876a;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s5 */
/* loaded from: classes.dex */
public abstract class AbstractC2000s5 {

    /* renamed from: a */
    public static final float f11761a = AbstractC2256y.f13084d;

    /* renamed from: b */
    public static final float f11762b;

    /* renamed from: c */
    public static final long f11763c;

    /* renamed from: d */
    public static final float f11764d;

    /* renamed from: e */
    public static final float f11765e;

    static {
        float f7 = AbstractC2256y.f13083c;
        f11762b = f7;
        f11763c = AbstractC2168e.m3516c(f7, AbstractC2256y.f13082b);
        f11764d = AbstractC2256y.f13081a;
        f11765e = 2;
    }

    /* renamed from: a */
    public static final void m3177a(float f7, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, boolean z7, InterfaceC3277a interfaceC3277a, C1893f5 c1893f5, C3081j c3081j, C3173d c3173d, C3173d c3173d2, C3876a c3876a, C2395p c2395p, int i7, int i8) {
        int i9;
        C1893f5 c1893f52;
        C3173d c3173d3;
        int i10;
        boolean z8;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        c2395p.m3859a0(1191170377);
        if ((i7 & 6) == 0) {
            if (c2395p.m3864d(f7)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i9 = i21 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i9 |= i20;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i9 |= i19;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(z7)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i9 |= i18;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i9 |= i17;
        }
        if ((196608 & i7) == 0) {
            c1893f52 = c1893f5;
            if (c2395p.m3870g(c1893f52)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i9 |= i16;
        } else {
            c1893f52 = c1893f5;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3870g(c3081j)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i9 |= i15;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3866e(0)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i9 |= i14;
        }
        if ((100663296 & i7) == 0) {
            c3173d3 = c3173d;
            if (c2395p.m3874i(c3173d3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i9 |= i13;
        } else {
            c3173d3 = c3173d;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3874i(c3173d2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i9 |= i12;
        }
        if ((i8 & 6) == 0) {
            if (c2395p.m3870g(c3876a)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i8 | i11;
        } else {
            i10 = i8;
        }
        if ((i9 & 306783379) == 306783378 && (i10 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            if ((29360128 & i9) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((((i10 & 14) ^ 6) > 4 && c2395p.m3870g(c3876a)) || (i10 & 6) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z8 | z9;
            Object m3847O = c2395p.m3847O();
            if (z10 || m3847O == C2375k.f13421a) {
                m3847O = new C2016u5(f7, interfaceC3277a, c3876a);
                c2395p.m3877j0(m3847O);
            }
            C2016u5 c2016u5 = (C2016u5) m3847O;
            c2016u5.f11921e = interfaceC3277a;
            c2016u5.f11924h = interfaceC3279c;
            c2016u5.m3187d(f7);
            int i22 = ((i9 >> 3) & 1008) | ((i9 >> 6) & 57344);
            int i23 = i9 >> 9;
            m3179c(c2016u5, interfaceC3810r, z7, null, c3081j, c3173d3, c3173d2, c2395p, i22 | (458752 & i23) | (i23 & 3670016));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1952m5(f7, interfaceC3279c, interfaceC3810r, z7, interfaceC3277a, c1893f52, c3081j, c3173d, c3173d2, c3876a, i7, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3178b(float f7, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, boolean z7, C3876a c3876a, InterfaceC3277a interfaceC3277a, C1893f5 c1893f5, C3081j c3081j, C2395p c2395p, int i7, int i8) {
        int i9;
        InterfaceC3279c interfaceC3279c2;
        InterfaceC3810r interfaceC3810r2;
        int i10;
        int i11;
        int i12;
        InterfaceC3277a interfaceC3277a2;
        int i13;
        int i14;
        int i15;
        Object m3847O;
        InterfaceC3277a interfaceC3277a3;
        C1893f5 c1893f52;
        int i16;
        C3081j c3081j2;
        InterfaceC3810r interfaceC3810r3;
        C1893f5 c1893f53;
        C3081j c3081j3;
        InterfaceC3277a interfaceC3277a4;
        C2405r1 m3891u;
        int i17;
        int i18;
        c2395p.m3859a0(-202044027);
        if (c2395p.m3864d(f7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i19 = i9 | i7;
        if ((i7 & 48) == 0) {
            interfaceC3279c2 = interfaceC3279c;
            if (c2395p.m3874i(interfaceC3279c2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i19 |= i18;
        } else {
            interfaceC3279c2 = interfaceC3279c;
        }
        int i20 = i8 & 4;
        if (i20 != 0) {
            i19 |= 384;
        } else if ((i7 & 384) == 0) {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p.m3870g(interfaceC3810r2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i19 |= i10;
            if ((i7 & 3072) == 0) {
                if (c2395p.m3872h(z7)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i19 |= i17;
            }
            if (!c2395p.m3870g(c3876a)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            int i21 = i19 | i11;
            int i22 = 196608 | i21;
            i12 = i8 & 64;
            if (i12 == 0) {
                i14 = i21 | 1769472;
                interfaceC3277a2 = interfaceC3277a;
            } else {
                interfaceC3277a2 = interfaceC3277a;
                if (c2395p.m3874i(interfaceC3277a2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i14 = i22 | i13;
            }
            i15 = i14 | 104857600;
            if ((38347923 & i15) != 38347922 && c2395p.m3836D()) {
                c2395p.m3852U();
                c1893f53 = c1893f5;
                c3081j3 = c3081j;
                interfaceC3277a4 = interfaceC3277a2;
                interfaceC3810r3 = interfaceC3810r2;
            } else {
                c2395p.m3854W();
                if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                    c2395p.m3852U();
                    int i23 = i15 & (-29360129);
                    c3081j2 = c3081j;
                    i16 = i23;
                    interfaceC3277a3 = interfaceC3277a2;
                    c1893f52 = c1893f5;
                } else {
                    if (i20 != 0) {
                        interfaceC3810r2 = C3807o.f17991a;
                    }
                    if (i12 != 0) {
                        interfaceC3277a2 = null;
                    }
                    C1936k5 c1936k5 = C1936k5.f11432a;
                    C1893f5 m3134c = C1936k5.m3134c(c2395p);
                    int i24 = i15 & (-29360129);
                    m3847O = c2395p.m3847O();
                    if (m3847O == C2375k.f13421a) {
                        m3847O = new C3081j();
                        c2395p.m3877j0(m3847O);
                    }
                    C3081j c3081j4 = (C3081j) m3847O;
                    interfaceC3277a3 = interfaceC3277a2;
                    c1893f52 = m3134c;
                    i16 = i24;
                    c3081j2 = c3081j4;
                }
                c2395p.m3889s();
                InterfaceC3810r interfaceC3810r4 = interfaceC3810r2;
                C1893f5 c1893f54 = c1893f52;
                m3177a(f7, interfaceC3279c2, interfaceC3810r4, z7, interfaceC3277a3, c1893f54, c3081j2, AbstractC3178i.m4873d(308249025, new C0040j2(c3081j2, c1893f52, z7), c2395p), AbstractC3178i.m4873d(-1843234110, new C0611j(c1893f52, z7), c2395p), c3876a, c2395p, (i16 & 14) | 905969664 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & (i16 >> 6)) | 14155776, (i16 >> 12) & 14);
                interfaceC3810r3 = interfaceC3810r4;
                c1893f53 = c1893f54;
                c3081j3 = c3081j2;
                interfaceC3277a4 = interfaceC3277a3;
            }
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C1944l5(f7, interfaceC3279c, interfaceC3810r3, z7, c3876a, interfaceC3277a4, c1893f53, c3081j3, i7, i8);
                return;
            }
            return;
        }
        interfaceC3810r2 = interfaceC3810r;
        if ((i7 & 3072) == 0) {
        }
        if (!c2395p.m3870g(c3876a)) {
        }
        int i212 = i19 | i11;
        int i222 = 196608 | i212;
        i12 = i8 & 64;
        if (i12 == 0) {
        }
        i15 = i14 | 104857600;
        if ((38347923 & i15) != 38347922) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if (i20 != 0) {
        }
        if (i12 != 0) {
        }
        C1936k5 c1936k52 = C1936k5.f11432a;
        C1893f5 m3134c2 = C1936k5.m3134c(c2395p);
        int i242 = i15 & (-29360129);
        m3847O = c2395p.m3847O();
        if (m3847O == C2375k.f13421a) {
        }
        C3081j c3081j42 = (C3081j) m3847O;
        interfaceC3277a3 = interfaceC3277a2;
        c1893f52 = m3134c2;
        i16 = i242;
        c3081j2 = c3081j42;
        c2395p.m3889s();
        InterfaceC3810r interfaceC3810r42 = interfaceC3810r2;
        C1893f5 c1893f542 = c1893f52;
        m3177a(f7, interfaceC3279c2, interfaceC3810r42, z7, interfaceC3277a3, c1893f542, c3081j2, AbstractC3178i.m4873d(308249025, new C0040j2(c3081j2, c1893f52, z7), c2395p), AbstractC3178i.m4873d(-1843234110, new C0611j(c1893f52, z7), c2395p), c3876a, c2395p, (i16 & 14) | 905969664 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & (i16 >> 6)) | 14155776, (i16 >> 12) & 14);
        interfaceC3810r3 = interfaceC3810r42;
        c1893f53 = c1893f542;
        c3081j3 = c3081j2;
        interfaceC3277a4 = interfaceC3277a3;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: c */
    public static final void m3179c(C2016u5 c2016u5, InterfaceC3810r interfaceC3810r, boolean z7, C1893f5 c1893f5, C3081j c3081j, C3173d c3173d, C3173d c3173d2, C2395p c2395p, int i7) {
        int i8;
        int i9;
        C1893f5 m3134c;
        C1893f5 c1893f52;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c2395p.m3859a0(-1303883986);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c2016u5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i8 = i15 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i8 |= i14;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3872h(z7)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i8 |= i13;
        }
        if ((i7 & 3072) == 0) {
            i8 |= 1024;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3870g(c3081j)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i8 |= i12;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i8 |= i11;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3874i(c3173d2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i8 |= i10;
        }
        if ((599187 & i8) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
            c1893f52 = c1893f5;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i9 = i8 & (-7169);
                m3134c = c1893f5;
            } else {
                C1936k5 c1936k5 = C1936k5.f11432a;
                i9 = i8 & (-7169);
                m3134c = C1936k5.m3134c(c2395p);
            }
            c2395p.m3889s();
            int i16 = i9 >> 3;
            m3180d(interfaceC3810r, c2016u5, z7, c3081j, c3173d, c3173d2, c2395p, (i9 & 896) | (i16 & 14) | ((i9 << 3) & 112) | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
            c1893f52 = m3134c;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2013u2(c2016u5, interfaceC3810r, z7, c1893f52, c3081j, c3173d, c3173d2, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final void m3180d(InterfaceC3810r interfaceC3810r, C2016u5 c2016u5, boolean z7, C3081j c3081j, C3173d c3173d, C3173d c3173d2, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        InterfaceC3810r interfaceC3810r2;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C2016u5 c2016u52 = c2016u5;
        c2395p.m3859a0(1390990089);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c2016u52)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3872h(z7)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c3081j)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(c3173d2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        int i15 = i8;
        if ((74899 & i15) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (c2395p.m3878k(AbstractC3674f1.f17523n) == EnumC3103m.f15704f) {
                z8 = true;
            } else {
                z8 = false;
            }
            c2016u52.f11927k = z8;
            InterfaceC2313c interfaceC2313c = null;
            C3807o c3807o = C3807o.f17991a;
            if (z7) {
                C0062p0 c0062p0 = new C0062p0(c2016u52, interfaceC2313c, 27);
                C2859j c2859j = AbstractC2847c0.f14941a;
                interfaceC3810r2 = new SuspendPointerInputElement(c2016u52, c3081j, new C2845b0(c0062p0), 4);
            } else {
                interfaceC3810r2 = c3807o;
            }
            boolean z10 = c2016u52.f11927k;
            boolean booleanValue = ((Boolean) c2016u52.f11930n.getValue()).booleanValue();
            boolean m3874i = c2395p.m3874i(c2016u52);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3874i || m3847O == c2413u0) {
                m3847O = new C1984q5(c2016u52, null);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3282f interfaceC3282f = (InterfaceC3282f) m3847O;
            InterfaceC3810r interfaceC3810r3 = interfaceC3810r2;
            InterfaceC3810r m4581a = AbstractC2913i0.m4581a(c3807o, c2016u52, EnumC2931o0.f15241f, z7, c3081j, booleanValue, interfaceC3282f, z10, 32);
            c2016u52 = c2016u52;
            C2394o2 c2394o2 = AbstractC1957n2.f11577a;
            InterfaceC3810r mo5829e = AbstractC0479l.m1037a(AbstractC0155c.m352k(interfaceC3810r.mo5829e(MinimumInteractiveModifier.f732a), f11762b, f11761a, 0.0f, 0.0f, 12), false, new C1882e3(2, c2016u52, z7)).mo5829e(AbstractC2120d.f12414b);
            float m3729g = c2016u52.f11923g.m3729g();
            C3876a c3876a = c2016u52.f11922f;
            InterfaceC3810r mo5829e2 = AbstractC0149e.m325a(AbstractC0479l.m1037a(mo5829e, true, new C2135k0(m3729g, new C3876a(c3876a.f18161a, c3876a.f18162b), 2)), z7, c3081j).mo5829e(interfaceC3810r3).mo5829e(m4581a);
            boolean m3874i2 = c2395p.m3874i(c2016u52);
            Object m3847O2 = c2395p.m3847O();
            if (m3874i2 || m3847O2 == c2413u0) {
                m3847O2 = new C1976p5(0, c2016u52);
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O2;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e2);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(interfaceC3217l0, c2395p, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p, c3504h4);
            InterfaceC3810r m361t = AbstractC0155c.m361t(AbstractC0172a.m393c(c3807o, EnumC1902g5.f11236e));
            boolean m3874i3 = c2395p.m3874i(c2016u52);
            Object m3847O3 = c2395p.m3847O();
            if (!m3874i3 && m3847O3 != c2413u0) {
                z9 = false;
            } else {
                z9 = false;
                m3847O3 = new C1960n5(c2016u52, 0 == true ? 1 : 0);
                c2395p.m3877j0(m3847O3);
            }
            InterfaceC3810r m395e = AbstractC0172a.m395e(m361t, (InterfaceC3279c) m3847O3);
            C3802j c3802j = C3795c.f17964e;
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(c3802j, z9);
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m395e);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, c3504h);
            AbstractC2418w.m3954C(m3882m2, c2395p, c3504h2);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode2))) {
                AbstractC2487d.m4050n(hashCode2, c2395p, hashCode2, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c2, c2395p, c3504h4);
            int i16 = (i15 >> 3) & 14;
            c3173d.mo24c(c2016u52, c2395p, Integer.valueOf(((i15 >> 9) & 112) | i16));
            c2395p.m3888r(true);
            InterfaceC3810r m393c = AbstractC0172a.m393c(c3807o, EnumC1902g5.f11237f);
            InterfaceC3217l0 m4853e2 = AbstractC3144n.m4853e(c3802j, false);
            int hashCode3 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m3 = c2395p.m3882m();
            InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m393c);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e2, c2395p, c3504h);
            AbstractC2418w.m3954C(m3882m3, c2395p, c3504h2);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode3))) {
                AbstractC2487d.m4050n(hashCode3, c2395p, hashCode3, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c3, c2395p, c3504h4);
            c3173d2.mo24c(c2016u52, c2395p, Integer.valueOf(((i15 >> 12) & 112) | i16));
            c2395p.m3888r(true);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1900g3(interfaceC3810r, c2016u52, z7, c3081j, c3173d, c3173d2, i7);
        }
    }

    /* renamed from: e */
    public static final float m3181e(float f7, float[] fArr, float f8, float f9) {
        boolean z7;
        Float valueOf;
        int i7;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f10 = fArr[0];
            int i8 = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f10);
            } else {
                float abs = Math.abs(AbstractC2080d.m3409v(f8, f9, f10) - f7);
                C3877b c3877b = new C3877b(1, length, 1);
                int i9 = c3877b.f18164f;
                int i10 = c3877b.f18165g;
                if (i10 <= 0 ? 1 >= i9 : 1 <= i9) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    i8 = i9;
                }
                while (z7) {
                    if (i8 == i9) {
                        if (z7) {
                            z7 = false;
                            i7 = i8;
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        i7 = i8 + i10;
                    }
                    float f11 = fArr[i8];
                    float abs2 = Math.abs(AbstractC2080d.m3409v(f8, f9, f11) - f7);
                    if (Float.compare(abs, abs2) > 0) {
                        f10 = f11;
                        i8 = i7;
                        abs = abs2;
                    } else {
                        i8 = i7;
                    }
                }
                valueOf = Float.valueOf(f10);
            }
        }
        if (valueOf != null) {
            return AbstractC2080d.m3409v(f8, f9, valueOf.floatValue());
        }
        return f7;
    }
}
