package p063i0;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.p007ui.draw.AbstractC0166a;
import p001a0.C0078t0;
import p034e0.C0625q;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p067i4.AbstractC2072e;
import p071j0.AbstractC2151s0;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2484b0;
import p100n.AbstractC2638e;
import p100n.AbstractC2641f;
import p107o.C2767p;
import p137s.InterfaceC3080i;
import p140s2.C3096f;
import p144t.AbstractC3144n;
import p144t.C3137j0;
import p144t.InterfaceC3135i0;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u3 */
/* loaded from: classes.dex */
public final class C2014u3 {

    /* renamed from: a */
    public static final C2014u3 f11908a = new Object();

    /* renamed from: b */
    public static final float f11909b = 56;

    /* renamed from: c */
    public static final float f11910c = 280;

    /* renamed from: d */
    public static final float f11911d = 1;

    /* renamed from: e */
    public static final float f11912e = 2;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3183a(boolean z7, InterfaceC3080i interfaceC3080i, InterfaceC3810r interfaceC3810r, C2033w6 c2033w6, InterfaceC0667m0 interfaceC0667m0, float f7, float f8, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        InterfaceC3810r interfaceC3810r2;
        int i12;
        int i13;
        int i14;
        int i15;
        float f9;
        float f10;
        InterfaceC3810r interfaceC3810r3;
        float f11;
        long j6;
        boolean z8;
        boolean z9;
        InterfaceC2390n2 m3953A;
        InterfaceC2390n2 interfaceC2390n2;
        InterfaceC2390n2 m3953A2;
        long j7;
        InterfaceC3810r interfaceC3810r4;
        float f12;
        float f13;
        C2405r1 m3891u;
        int i16;
        int i17;
        c2395p.m3859a0(1035477640);
        if (c2395p.m3872h(z7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i18 = i9 | i7;
        if (c2395p.m3872h(false)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i19 = i18 | i10;
        if (c2395p.m3870g(interfaceC3080i)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i20 = i19 | i11;
        int i21 = i8 & 8;
        if (i21 != 0) {
            i20 |= 3072;
        } else if ((i7 & 3072) == 0) {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p.m3870g(interfaceC3810r2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i20 |= i12;
            if (!c2395p.m3870g(c2033w6)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            int i22 = i20 | i13;
            if (!c2395p.m3870g(interfaceC0667m0)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i15 = i22 | i14;
            if ((1572864 & i7) != 0) {
                if ((i8 & 64) == 0) {
                    f9 = f7;
                    if (c2395p.m3864d(f9)) {
                        i17 = 1048576;
                        i15 |= i17;
                    }
                } else {
                    f9 = f7;
                }
                i17 = 524288;
                i15 |= i17;
            } else {
                f9 = f7;
            }
            if ((12582912 & i7) != 0) {
                if ((i8 & 128) == 0) {
                    f10 = f8;
                    if (c2395p.m3864d(f10)) {
                        i16 = 8388608;
                        i15 |= i16;
                    }
                } else {
                    f10 = f8;
                }
                i16 = 4194304;
                i15 |= i16;
            } else {
                f10 = f8;
            }
            if ((38347923 & i15) != 38347922 && c2395p.m3836D()) {
                c2395p.m3852U();
                interfaceC3810r4 = interfaceC3810r2;
                f12 = f9;
            } else {
                c2395p.m3854W();
                if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                    c2395p.m3852U();
                    if ((i8 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    if ((i8 & 128) != 0) {
                        i15 &= -29360129;
                    }
                    interfaceC3810r3 = interfaceC3810r2;
                    f11 = f9;
                } else {
                    if (i21 == 0) {
                        interfaceC3810r3 = C3807o.f17991a;
                    } else {
                        interfaceC3810r3 = interfaceC3810r2;
                    }
                    if ((i8 & 64) == 0) {
                        i15 &= -3670017;
                        f11 = f11912e;
                    } else {
                        f11 = f9;
                    }
                    if ((i8 & 128) != 0) {
                        i15 &= -29360129;
                        f10 = f11911d;
                    }
                }
                c2395p.m3889s();
                boolean booleanValue = ((Boolean) AbstractC2168e.m3533t(interfaceC3080i, c2395p, (i15 >> 6) & 14).getValue()).booleanValue();
                float f14 = AbstractC2151s0.f12521b;
                if (z7) {
                    j6 = c2033w6.f12079n;
                } else if (booleanValue) {
                    j6 = c2033w6.f12077l;
                } else {
                    j6 = c2033w6.f12078m;
                }
                if (!z7) {
                    z8 = booleanValue;
                    c2395p.m3857Z(1023053998);
                    m3953A = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(150, 6, null), c2395p, 48);
                    z9 = false;
                    c2395p.m3888r(false);
                } else {
                    z8 = booleanValue;
                    z9 = false;
                    c2395p.m3857Z(1023165505);
                    m3953A = AbstractC2418w.m3953A(new C0677s(j6), c2395p);
                    c2395p.m3888r(false);
                }
                if (!z7) {
                    c2395p.m3857Z(1023269417);
                    if (z8) {
                        f13 = f11;
                    } else {
                        f13 = f10;
                    }
                    interfaceC2390n2 = m3953A;
                    m3953A2 = AbstractC2641f.m4234a(f13, AbstractC2638e.m4232r(150, 6, null), c2395p, 48);
                    c2395p.m3888r(z9);
                } else {
                    interfaceC2390n2 = m3953A;
                    c2395p.m3857Z(1023478388);
                    m3953A2 = AbstractC2418w.m3953A(new C3096f(f10), c2395p);
                    c2395p.m3888r(z9);
                }
                InterfaceC2425y0 m3953A3 = AbstractC2418w.m3953A(AbstractC2072e.m3325a(((C3096f) m3953A2.getValue()).f15693e, ((C0677s) interfaceC2390n2.getValue()).f2211a), c2395p);
                if (z7) {
                    j7 = c2033w6.f12072g;
                } else if (z8) {
                    j7 = c2033w6.f12070e;
                } else {
                    j7 = c2033w6.f12071f;
                }
                InterfaceC2390n2 m4035a = AbstractC2484b0.m4035a(j7, AbstractC2638e.m4232r(150, 6, null), c2395p, 48);
                C2767p c2767p = (C2767p) m3953A3.getValue();
                AbstractC3144n.m4849a(AbstractC0166a.m379b(interfaceC3810r3.mo5829e(new BorderModifierNodeElement(c2767p.f14742a, c2767p.f14743b, interfaceC0667m0)), new C0078t0(27, interfaceC0667m0, new C2041x6(new C1990r3(m4035a, InterfaceC2390n2.class, "value", "getValue()Ljava/lang/Object;", 0, 0)))), c2395p, 0);
                interfaceC3810r4 = interfaceC3810r3;
                f12 = f11;
            }
            float f15 = f10;
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C1998s3(this, z7, interfaceC3080i, interfaceC3810r4, c2033w6, interfaceC0667m0, f12, f15, i7, i8);
                return;
            }
            return;
        }
        interfaceC3810r2 = interfaceC3810r;
        if (!c2395p.m3870g(c2033w6)) {
        }
        int i222 = i20 | i13;
        if (!c2395p.m3870g(interfaceC0667m0)) {
        }
        i15 = i222 | i14;
        if ((1572864 & i7) != 0) {
        }
        if ((12582912 & i7) != 0) {
        }
        if ((38347923 & i15) != 38347922) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if ((i8 & 64) == 0) {
        }
        if ((i8 & 128) != 0) {
        }
        c2395p.m3889s();
        boolean booleanValue2 = ((Boolean) AbstractC2168e.m3533t(interfaceC3080i, c2395p, (i15 >> 6) & 14).getValue()).booleanValue();
        float f142 = AbstractC2151s0.f12521b;
        if (z7) {
        }
        if (!z7) {
        }
        if (!z7) {
        }
        InterfaceC2425y0 m3953A32 = AbstractC2418w.m3953A(AbstractC2072e.m3325a(((C3096f) m3953A2.getValue()).f15693e, ((C0677s) interfaceC2390n2.getValue()).f2211a), c2395p);
        if (z7) {
        }
        InterfaceC2390n2 m4035a2 = AbstractC2484b0.m4035a(j7, AbstractC2638e.m4232r(150, 6, null), c2395p, 48);
        C2767p c2767p2 = (C2767p) m3953A32.getValue();
        AbstractC3144n.m4849a(AbstractC0166a.m379b(interfaceC3810r3.mo5829e(new BorderModifierNodeElement(c2767p2.f14742a, c2767p2.f14743b, interfaceC0667m0)), new C0078t0(27, interfaceC0667m0, new C2041x6(new C1990r3(m4035a2, InterfaceC2390n2.class, "value", "getValue()Ljava/lang/Object;", 0, 0)))), c2395p, 0);
        interfaceC3810r4 = interfaceC3810r3;
        f12 = f11;
        float f152 = f10;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: b */
    public final void m3184b(String str, InterfaceC3281e interfaceC3281e, boolean z7, boolean z8, C0625q c0625q, InterfaceC3080i interfaceC3080i, InterfaceC3281e interfaceC3281e2, InterfaceC3281e interfaceC3281e3, InterfaceC3281e interfaceC3281e4, InterfaceC3281e interfaceC3281e5, InterfaceC3281e interfaceC3281e6, C2033w6 c2033w6, InterfaceC3135i0 interfaceC3135i0, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3281e interfaceC3281e7;
        boolean z9;
        boolean z10;
        C0625q c0625q2;
        int i9;
        InterfaceC3281e interfaceC3281e8;
        int i10;
        int i11;
        int i12;
        InterfaceC3135i0 c3137j0;
        int i13;
        InterfaceC3135i0 interfaceC3135i02;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        c2395p.m3859a0(-350442135);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i8 = i23 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            interfaceC3281e7 = interfaceC3281e;
            if (c2395p.m3874i(interfaceC3281e7)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i8 |= i22;
        } else {
            interfaceC3281e7 = interfaceC3281e;
        }
        if ((i7 & 384) == 0) {
            z9 = z7;
            if (c2395p.m3872h(z9)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i8 |= i21;
        } else {
            z9 = z7;
        }
        int i24 = 1024;
        if ((i7 & 3072) == 0) {
            z10 = z8;
            if (c2395p.m3872h(z10)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i8 |= i20;
        } else {
            z10 = z8;
        }
        int i25 = 8192;
        if ((i7 & 24576) == 0) {
            c0625q2 = c0625q;
            if (c2395p.m3870g(c0625q2)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i8 |= i19;
        } else {
            c0625q2 = c0625q;
        }
        if ((i7 & 196608) == 0) {
            if (c2395p.m3870g(interfaceC3080i)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i8 |= i18;
        }
        if ((i7 & 1572864) == 0) {
            if (c2395p.m3872h(false)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i8 |= i17;
        }
        if ((i7 & 12582912) == 0) {
            i9 = 12582912;
            interfaceC3281e8 = interfaceC3281e2;
            if (c2395p.m3874i(interfaceC3281e8)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i8 |= i16;
        } else {
            i9 = 12582912;
            interfaceC3281e8 = interfaceC3281e2;
        }
        if ((i7 & 100663296) == 0) {
            if (c2395p.m3874i(interfaceC3281e3)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i8 |= i15;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3874i(interfaceC3281e4)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i8 |= i14;
        }
        if (c2395p.m3874i(interfaceC3281e5)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i26 = 14155776 | i10;
        if (c2395p.m3874i(null)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i27 = i26 | i11;
        if (c2395p.m3874i(null)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i28 = i27 | i12;
        if (c2395p.m3874i(interfaceC3281e6)) {
            i24 = 2048;
        }
        int i29 = i28 | i24;
        if (c2395p.m3870g(c2033w6)) {
            i25 = 16384;
        }
        int i30 = i29 | i25 | 65536;
        if ((306783379 & i8) == 306783378 && (4793491 & i30) == 4793490 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3135i02 = interfaceC3135i0;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i13 = i30 & (-458753);
                c3137j0 = interfaceC3135i0;
            } else {
                float f7 = AbstractC2151s0.f12521b;
                c3137j0 = new C3137j0(f7, f7, f7, f7);
                i13 = i30 & (-458753);
            }
            c2395p.m3889s();
            int i31 = i8 << 3;
            int i32 = i13;
            int i33 = i8 >> 3;
            int i34 = (i33 & 7168) | (i31 & 112) | 6 | (i31 & 896);
            int i35 = i8 >> 9;
            int i36 = i32 << 21;
            int i37 = i34 | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192);
            int i38 = (i33 & 57344) | ((i32 >> 9) & 14) | ((i8 >> 6) & 112) | (i8 & 896) | (i35 & 7168) | ((i32 << 6) & 3670016) | i9;
            boolean z11 = z9;
            boolean z12 = z10;
            InterfaceC3135i0 interfaceC3135i03 = c3137j0;
            AbstractC2151s0.m3491a(str, interfaceC3281e7, c0625q2, interfaceC3281e8, interfaceC3281e3, interfaceC3281e4, interfaceC3281e5, interfaceC3281e6, z12, z11, interfaceC3080i, interfaceC3135i03, c2033w6, c3173d, c2395p, i37, i38);
            interfaceC3135i02 = interfaceC3135i03;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2006t3(this, str, interfaceC3281e, z7, z8, c0625q, interfaceC3080i, interfaceC3281e2, interfaceC3281e3, interfaceC3281e4, interfaceC3281e5, interfaceC3281e6, c2033w6, interfaceC3135i02, c3173d, i7);
        }
    }
}
