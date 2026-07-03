package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.selection.AbstractC0161b;
import androidx.compose.material3.MinimumInteractiveModifier;
import p028d2.C0474g;
import p035e1.C0677s;
import p043f2.EnumC1533a;
import p068i5.AbstractC2080d;
import p078k0.AbstractC2225a;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2484b0;
import p100n.AbstractC2638e;
import p100n.AbstractC2658k1;
import p100n.AbstractC2667n1;
import p100n.C2634c1;
import p100n.C2637d1;
import p100n.C2643f1;
import p100n.C2664m1;
import p100n.C2669o0;
import p100n.InterfaceC2627a0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC1987r0 {

    /* renamed from: a */
    public static final float f11708a;

    /* renamed from: b */
    public static final float f11709b = 20;

    /* renamed from: c */
    public static final float f11710c;

    /* renamed from: d */
    public static final float f11711d;

    static {
        float f7 = 2;
        f11708a = f7;
        f11710c = f7;
        f11711d = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0053  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3156a(boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, boolean z8, C1939l0 c1939l0, C2395p c2395p, int i7, int i8) {
        int i9;
        InterfaceC3810r interfaceC3810r2;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        InterfaceC3810r interfaceC3810r3;
        C1939l0 c1939l02;
        int i14;
        int i15;
        C1939l0 c1939l03;
        EnumC1533a enumC1533a;
        InterfaceC3277a interfaceC3277a;
        InterfaceC3810r interfaceC3810r4;
        boolean z10;
        C1939l0 c1939l04;
        boolean z11;
        boolean z12;
        C2405r1 m3891u;
        int i16;
        int i17;
        c2395p.m3859a0(-1406741137);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i9 = i17 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i9 |= i16;
        }
        int i18 = i8 & 4;
        if (i18 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p.m3870g(interfaceC3810r2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
            i11 = i8 & 8;
            if (i11 == 0) {
                i9 |= 3072;
            } else if ((i7 & 3072) == 0) {
                z9 = z8;
                if (c2395p.m3872h(z9)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i9 |= i12;
                if ((i7 & 24576) == 0) {
                    i9 |= 8192;
                }
                i13 = i9 | 196608;
                if ((74899 & i13) != 74898 && c2395p.m3836D()) {
                    c2395p.m3852U();
                    c1939l04 = c1939l0;
                    interfaceC3810r4 = interfaceC3810r2;
                    z10 = z9;
                } else {
                    c2395p.m3854W();
                    if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                        c2395p.m3852U();
                        i15 = i13 & (-57345);
                        interfaceC3810r3 = interfaceC3810r2;
                        c1939l03 = c1939l0;
                    } else {
                        if (i18 != 0) {
                            interfaceC3810r3 = C3807o.f17991a;
                        } else {
                            interfaceC3810r3 = interfaceC3810r2;
                        }
                        if (i11 != 0) {
                            z9 = true;
                        }
                        C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
                        c1939l02 = c2003t0.f11799Q;
                        if (c1939l02 == null) {
                            long m3195d = AbstractC2019v0.m3195d(c2003t0, AbstractC2225a.f12773d);
                            long j6 = C0677s.f2208f;
                            int i19 = AbstractC2225a.f12771b;
                            long m3195d2 = AbstractC2019v0.m3195d(c2003t0, i19);
                            int i20 = AbstractC2225a.f12772c;
                            i14 = -57345;
                            C1939l0 c1939l05 = new C1939l0(m3195d, j6, m3195d2, j6, C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i20)), j6, C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i20)), AbstractC2019v0.m3195d(c2003t0, i19), AbstractC2019v0.m3195d(c2003t0, AbstractC2225a.f12775f), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i20)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, AbstractC2225a.f12774e)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i20)));
                            c2003t0.f11799Q = c1939l05;
                            c1939l02 = c1939l05;
                        } else {
                            i14 = -57345;
                        }
                        i15 = i13 & i14;
                        c1939l03 = c1939l02;
                    }
                    c2395p.m3889s();
                    if (z7) {
                        enumC1533a = EnumC1533a.f10090e;
                    } else {
                        enumC1533a = EnumC1533a.f10091f;
                    }
                    c2395p.m3857Z(1046936362);
                    if (interfaceC3279c != null) {
                        if ((i15 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i15 & 14) == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z13 = z11 | z12;
                        Object m3847O = c2395p.m3847O();
                        if (z13 || m3847O == C2375k.f13421a) {
                            m3847O = new C1947m0(interfaceC3279c, z7, 0);
                            c2395p.m3877j0(m3847O);
                        }
                        interfaceC3277a = (InterfaceC3277a) m3847O;
                    } else {
                        interfaceC3277a = null;
                    }
                    c2395p.m3888r(false);
                    boolean z14 = z9;
                    m3158c(enumC1533a, interfaceC3277a, interfaceC3810r3, z14, c1939l03, c2395p, i15 & 524160);
                    interfaceC3810r4 = interfaceC3810r3;
                    z10 = z14;
                    c1939l04 = c1939l03;
                }
                m3891u = c2395p.m3891u();
                if (m3891u != null) {
                    m3891u.f13542d = new C1955n0(z7, interfaceC3279c, interfaceC3810r4, z10, c1939l04, i7, i8);
                    return;
                }
                return;
            }
            z9 = z8;
            if ((i7 & 24576) == 0) {
            }
            i13 = i9 | 196608;
            if ((74899 & i13) != 74898) {
            }
            c2395p.m3854W();
            if ((i7 & 1) == 0) {
            }
            if (i18 != 0) {
            }
            if (i11 != 0) {
            }
            C2003t0 c2003t02 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
            c1939l02 = c2003t02.f11799Q;
            if (c1939l02 == null) {
            }
            i15 = i13 & i14;
            c1939l03 = c1939l02;
            c2395p.m3889s();
            if (z7) {
            }
            c2395p.m3857Z(1046936362);
            if (interfaceC3279c != null) {
            }
            c2395p.m3888r(false);
            boolean z142 = z9;
            m3158c(enumC1533a, interfaceC3277a, interfaceC3810r3, z142, c1939l03, c2395p, i15 & 524160);
            interfaceC3810r4 = interfaceC3810r3;
            z10 = z142;
            c1939l04 = c1939l03;
            m3891u = c2395p.m3891u();
            if (m3891u != null) {
            }
        }
        interfaceC3810r2 = interfaceC3810r;
        i11 = i8 & 8;
        if (i11 == 0) {
        }
        z9 = z8;
        if ((i7 & 24576) == 0) {
        }
        i13 = i9 | 196608;
        if ((74899 & i13) != 74898) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if (i18 != 0) {
        }
        if (i11 != 0) {
        }
        C2003t0 c2003t022 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
        c1939l02 = c2003t022.f11799Q;
        if (c1939l02 == null) {
        }
        i15 = i13 & i14;
        c1939l03 = c1939l02;
        c2395p.m3889s();
        if (z7) {
        }
        c2395p.m3857Z(1046936362);
        if (interfaceC3279c != null) {
        }
        c2395p.m3888r(false);
        boolean z1422 = z9;
        m3158c(enumC1533a, interfaceC3277a, interfaceC3810r3, z1422, c1939l03, c2395p, i15 & 524160);
        interfaceC3810r4 = interfaceC3810r3;
        z10 = z1422;
        c1939l04 = c1939l03;
        m3891u = c2395p.m3891u();
        if (m3891u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d9  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3157b(boolean z7, EnumC1533a enumC1533a, InterfaceC3810r interfaceC3810r, C1939l0 c1939l0, C2395p c2395p, int i7) {
        int i8;
        float f7;
        int ordinal;
        float f8;
        Object obj;
        EnumC1533a enumC1533a2;
        InterfaceC2627a0 m4231q;
        int ordinal2;
        float f9;
        int ordinal3;
        C2634c1 m4241f;
        int i9;
        InterfaceC2627a0 m4232r;
        Object m3847O;
        C2413u0 c2413u0;
        long j6;
        int i10;
        long j7;
        Object m3953A;
        long j8;
        Object m3953A2;
        boolean m3870g;
        Object m3847O2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c2395p.m3859a0(2007131616);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i8 = i16 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(enumC1533a)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i8 |= i15;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i8 |= i14;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c1939l0)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i8 |= i13;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C2643f1 m4264c = AbstractC2658k1.m4264c(enumC1533a, null, c2395p, (i8 >> 3) & 14, 2);
            C2361g1 c2361g1 = m4264c.f14308d;
            C2664m1 c2664m1 = AbstractC2667n1.f14365a;
            EnumC1533a enumC1533a3 = (EnumC1533a) m4264c.m4238c();
            c2395p.m3857Z(1800065638);
            int ordinal4 = enumC1533a3.ordinal();
            float f10 = 0.0f;
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    f7 = 0.0f;
                    c2395p.m3888r(false);
                    Float valueOf = Float.valueOf(f7);
                    EnumC1533a enumC1533a4 = (EnumC1533a) c2361g1.getValue();
                    c2395p.m3857Z(1800065638);
                    ordinal = enumC1533a4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new RuntimeException();
                            }
                        } else {
                            f8 = 0.0f;
                            c2395p.m3888r(false);
                            Float valueOf2 = Float.valueOf(f8);
                            C2634c1 m4241f2 = m4264c.m4241f();
                            c2395p.m3857Z(1373301606);
                            obj = m4241f2.f14255a;
                            enumC1533a2 = EnumC1533a.f10091f;
                            if (obj == enumC1533a2) {
                                m4231q = AbstractC2638e.m4232r(100, 6, null);
                            } else if (m4241f2.f14256b == enumC1533a2) {
                                m4231q = new C2669o0(100);
                            } else {
                                m4231q = AbstractC2638e.m4231q(7, null);
                            }
                            c2395p.m3888r(false);
                            C2637d1 m4263b = AbstractC2658k1.m4263b(m4264c, valueOf, valueOf2, m4231q, c2664m1, c2395p, 0);
                            EnumC1533a enumC1533a5 = (EnumC1533a) m4264c.m4238c();
                            c2395p.m3857Z(-1426969489);
                            ordinal2 = enumC1533a5.ordinal();
                            if (ordinal2 == 0 && ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    f9 = 1.0f;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                f9 = 0.0f;
                            }
                            c2395p.m3888r(false);
                            Float valueOf3 = Float.valueOf(f9);
                            EnumC1533a enumC1533a6 = (EnumC1533a) c2361g1.getValue();
                            c2395p.m3857Z(-1426969489);
                            ordinal3 = enumC1533a6.ordinal();
                            if (ordinal3 != 0 && ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    f10 = 1.0f;
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            c2395p.m3888r(false);
                            Float valueOf4 = Float.valueOf(f10);
                            m4241f = m4264c.m4241f();
                            c2395p.m3857Z(-1324481169);
                            if (m4241f.f14255a == enumC1533a2) {
                                m4232r = new C2669o0(0);
                            } else if (m4241f.f14256b == enumC1533a2) {
                                m4232r = new C2669o0(100);
                            } else {
                                i9 = 6;
                                m4232r = AbstractC2638e.m4232r(100, 6, null);
                                c2395p.m3888r(false);
                                C2637d1 m4263b2 = AbstractC2658k1.m4263b(m4264c, valueOf3, valueOf4, m4232r, c2664m1, c2395p, 0);
                                m3847O = c2395p.m3847O();
                                c2413u0 = C2375k.f13421a;
                                if (m3847O == c2413u0) {
                                    m3847O = new C1931k0();
                                    c2395p.m3877j0(m3847O);
                                }
                                C1931k0 c1931k0 = (C1931k0) m3847O;
                                c1939l0.getClass();
                                if (enumC1533a != enumC1533a2) {
                                    j6 = c1939l0.f11455b;
                                } else {
                                    j6 = c1939l0.f11454a;
                                }
                                if (enumC1533a != enumC1533a2) {
                                    i10 = 100;
                                } else {
                                    i10 = 50;
                                }
                                InterfaceC2390n2 m4035a = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(i10, i9, null), c2395p, 0);
                                if (!z7) {
                                    int ordinal5 = enumC1533a.ordinal();
                                    if (ordinal5 != 0) {
                                        if (ordinal5 != 1) {
                                            if (ordinal5 != 2) {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            j7 = c1939l0.f11457d;
                                        }
                                    }
                                    j7 = c1939l0.f11456c;
                                } else {
                                    int ordinal6 = enumC1533a.ordinal();
                                    if (ordinal6 != 0) {
                                        if (ordinal6 != 1) {
                                            if (ordinal6 == 2) {
                                                j7 = c1939l0.f11460g;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            j7 = c1939l0.f11459f;
                                        }
                                    } else {
                                        j7 = c1939l0.f11458e;
                                    }
                                }
                                if (!z7) {
                                    c2395p.m3857Z(-392211906);
                                    if (enumC1533a == enumC1533a2) {
                                        i12 = 100;
                                    } else {
                                        i12 = 50;
                                    }
                                    m3953A = AbstractC2484b0.m4035a(j7, AbstractC2638e.m4232r(i12, i9, null), c2395p, 0);
                                    c2395p.m3888r(false);
                                } else {
                                    c2395p.m3857Z(-392031362);
                                    m3953A = AbstractC2418w.m3953A(new C0677s(j7), c2395p);
                                    c2395p.m3888r(false);
                                }
                                if (!z7) {
                                    int ordinal7 = enumC1533a.ordinal();
                                    if (ordinal7 != 0) {
                                        if (ordinal7 != 1) {
                                            if (ordinal7 != 2) {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            j8 = c1939l0.f11462i;
                                        }
                                    }
                                    j8 = c1939l0.f11461h;
                                } else {
                                    int ordinal8 = enumC1533a.ordinal();
                                    if (ordinal8 != 0) {
                                        if (ordinal8 != 1) {
                                            if (ordinal8 == 2) {
                                                j8 = c1939l0.f11465l;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            j8 = c1939l0.f11464k;
                                        }
                                    } else {
                                        j8 = c1939l0.f11463j;
                                    }
                                }
                                if (!z7) {
                                    c2395p.m3857Z(-1725816497);
                                    if (enumC1533a == enumC1533a2) {
                                        i11 = 100;
                                    } else {
                                        i11 = 50;
                                    }
                                    m3953A2 = AbstractC2484b0.m4035a(j8, AbstractC2638e.m4232r(i11, 6, null), c2395p, 0);
                                    c2395p.m3888r(false);
                                } else {
                                    c2395p.m3857Z(-1725635953);
                                    m3953A2 = AbstractC2418w.m3953A(new C0677s(j8), c2395p);
                                    c2395p.m3888r(false);
                                }
                                InterfaceC3810r m350i = AbstractC0155c.m350i(AbstractC0155c.m360s(interfaceC3810r, C3795c.f17968i), f11709b);
                                m3870g = c2395p.m3870g(m3953A) | c2395p.m3870g(m3953A2) | c2395p.m3870g(m4035a) | c2395p.m3870g(m4263b) | c2395p.m3870g(m4263b2);
                                m3847O2 = c2395p.m3847O();
                                if (!m3870g || m3847O2 == c2413u0) {
                                    m3847O2 = new C1963o0(m3953A, m3953A2, m4035a, m4263b, m4263b2, c1931k0, 0);
                                    c2395p.m3877j0(m3847O2);
                                }
                                AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O2, m350i);
                            }
                            i9 = 6;
                            c2395p.m3888r(false);
                            C2637d1 m4263b22 = AbstractC2658k1.m4263b(m4264c, valueOf3, valueOf4, m4232r, c2664m1, c2395p, 0);
                            m3847O = c2395p.m3847O();
                            c2413u0 = C2375k.f13421a;
                            if (m3847O == c2413u0) {
                            }
                            C1931k0 c1931k02 = (C1931k0) m3847O;
                            c1939l0.getClass();
                            if (enumC1533a != enumC1533a2) {
                            }
                            if (enumC1533a != enumC1533a2) {
                            }
                            InterfaceC2390n2 m4035a2 = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(i10, i9, null), c2395p, 0);
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            InterfaceC3810r m350i2 = AbstractC0155c.m350i(AbstractC0155c.m360s(interfaceC3810r, C3795c.f17968i), f11709b);
                            m3870g = c2395p.m3870g(m3953A) | c2395p.m3870g(m3953A2) | c2395p.m3870g(m4035a2) | c2395p.m3870g(m4263b) | c2395p.m3870g(m4263b22);
                            m3847O2 = c2395p.m3847O();
                            if (!m3870g) {
                            }
                            m3847O2 = new C1963o0(m3953A, m3953A2, m4035a2, m4263b, m4263b22, c1931k02, 0);
                            c2395p.m3877j0(m3847O2);
                            AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O2, m350i2);
                        }
                    }
                    f8 = 1.0f;
                    c2395p.m3888r(false);
                    Float valueOf22 = Float.valueOf(f8);
                    C2634c1 m4241f22 = m4264c.m4241f();
                    c2395p.m3857Z(1373301606);
                    obj = m4241f22.f14255a;
                    enumC1533a2 = EnumC1533a.f10091f;
                    if (obj == enumC1533a2) {
                    }
                    c2395p.m3888r(false);
                    C2637d1 m4263b3 = AbstractC2658k1.m4263b(m4264c, valueOf, valueOf22, m4231q, c2664m1, c2395p, 0);
                    EnumC1533a enumC1533a52 = (EnumC1533a) m4264c.m4238c();
                    c2395p.m3857Z(-1426969489);
                    ordinal2 = enumC1533a52.ordinal();
                    if (ordinal2 == 0) {
                    }
                    f9 = 0.0f;
                    c2395p.m3888r(false);
                    Float valueOf32 = Float.valueOf(f9);
                    EnumC1533a enumC1533a62 = (EnumC1533a) c2361g1.getValue();
                    c2395p.m3857Z(-1426969489);
                    ordinal3 = enumC1533a62.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 2) {
                        }
                    }
                    c2395p.m3888r(false);
                    Float valueOf42 = Float.valueOf(f10);
                    m4241f = m4264c.m4241f();
                    c2395p.m3857Z(-1324481169);
                    if (m4241f.f14255a == enumC1533a2) {
                    }
                    i9 = 6;
                    c2395p.m3888r(false);
                    C2637d1 m4263b222 = AbstractC2658k1.m4263b(m4264c, valueOf32, valueOf42, m4232r, c2664m1, c2395p, 0);
                    m3847O = c2395p.m3847O();
                    c2413u0 = C2375k.f13421a;
                    if (m3847O == c2413u0) {
                    }
                    C1931k0 c1931k022 = (C1931k0) m3847O;
                    c1939l0.getClass();
                    if (enumC1533a != enumC1533a2) {
                    }
                    if (enumC1533a != enumC1533a2) {
                    }
                    InterfaceC2390n2 m4035a22 = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(i10, i9, null), c2395p, 0);
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    InterfaceC3810r m350i22 = AbstractC0155c.m350i(AbstractC0155c.m360s(interfaceC3810r, C3795c.f17968i), f11709b);
                    m3870g = c2395p.m3870g(m3953A) | c2395p.m3870g(m3953A2) | c2395p.m3870g(m4035a22) | c2395p.m3870g(m4263b3) | c2395p.m3870g(m4263b222);
                    m3847O2 = c2395p.m3847O();
                    if (!m3870g) {
                    }
                    m3847O2 = new C1963o0(m3953A, m3953A2, m4035a22, m4263b3, m4263b222, c1931k022, 0);
                    c2395p.m3877j0(m3847O2);
                    AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O2, m350i22);
                }
            }
            f7 = 1.0f;
            c2395p.m3888r(false);
            Float valueOf5 = Float.valueOf(f7);
            EnumC1533a enumC1533a42 = (EnumC1533a) c2361g1.getValue();
            c2395p.m3857Z(1800065638);
            ordinal = enumC1533a42.ordinal();
            if (ordinal != 0) {
            }
            f8 = 1.0f;
            c2395p.m3888r(false);
            Float valueOf222 = Float.valueOf(f8);
            C2634c1 m4241f222 = m4264c.m4241f();
            c2395p.m3857Z(1373301606);
            obj = m4241f222.f14255a;
            enumC1533a2 = EnumC1533a.f10091f;
            if (obj == enumC1533a2) {
            }
            c2395p.m3888r(false);
            C2637d1 m4263b32 = AbstractC2658k1.m4263b(m4264c, valueOf5, valueOf222, m4231q, c2664m1, c2395p, 0);
            EnumC1533a enumC1533a522 = (EnumC1533a) m4264c.m4238c();
            c2395p.m3857Z(-1426969489);
            ordinal2 = enumC1533a522.ordinal();
            if (ordinal2 == 0) {
            }
            f9 = 0.0f;
            c2395p.m3888r(false);
            Float valueOf322 = Float.valueOf(f9);
            EnumC1533a enumC1533a622 = (EnumC1533a) c2361g1.getValue();
            c2395p.m3857Z(-1426969489);
            ordinal3 = enumC1533a622.ordinal();
            if (ordinal3 != 0) {
            }
            c2395p.m3888r(false);
            Float valueOf422 = Float.valueOf(f10);
            m4241f = m4264c.m4241f();
            c2395p.m3857Z(-1324481169);
            if (m4241f.f14255a == enumC1533a2) {
            }
            i9 = 6;
            c2395p.m3888r(false);
            C2637d1 m4263b2222 = AbstractC2658k1.m4263b(m4264c, valueOf322, valueOf422, m4232r, c2664m1, c2395p, 0);
            m3847O = c2395p.m3847O();
            c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
            }
            C1931k0 c1931k0222 = (C1931k0) m3847O;
            c1939l0.getClass();
            if (enumC1533a != enumC1533a2) {
            }
            if (enumC1533a != enumC1533a2) {
            }
            InterfaceC2390n2 m4035a222 = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(i10, i9, null), c2395p, 0);
            if (!z7) {
            }
            if (!z7) {
            }
            if (!z7) {
            }
            if (!z7) {
            }
            InterfaceC3810r m350i222 = AbstractC0155c.m350i(AbstractC0155c.m360s(interfaceC3810r, C3795c.f17968i), f11709b);
            m3870g = c2395p.m3870g(m3953A) | c2395p.m3870g(m3953A2) | c2395p.m3870g(m4035a222) | c2395p.m3870g(m4263b32) | c2395p.m3870g(m4263b2222);
            m3847O2 = c2395p.m3847O();
            if (!m3870g) {
            }
            m3847O2 = new C1963o0(m3953A, m3953A2, m4035a222, m4263b32, m4263b2222, c1931k0222, 0);
            c2395p.m3877j0(m3847O2);
            AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O2, m350i222);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1971p0(z7, enumC1533a, interfaceC3810r, c1939l0, i7, 0);
        }
    }

    /* renamed from: c */
    public static final void m3158c(EnumC1533a enumC1533a, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7, C1939l0 c1939l0, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3810r interfaceC3810r2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c2395p.m3859a0(-1608358065);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(enumC1533a)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(z7)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3870g(c1939l0)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3870g(null)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            c2395p.m3857Z(-97239746);
            InterfaceC3810r interfaceC3810r3 = C3807o.f17991a;
            if (interfaceC3277a != null) {
                interfaceC3810r2 = AbstractC0161b.m373c(new C0474g(1), enumC1533a, AbstractC1999s4.m3176a(false, AbstractC2225a.f12770a / 2, 0L, c2395p, 54, 4), interfaceC3277a, z7);
            } else {
                interfaceC3810r2 = interfaceC3810r3;
            }
            c2395p.m3888r(false);
            if (interfaceC3277a != null) {
                C2394o2 c2394o2 = AbstractC1957n2.f11577a;
                interfaceC3810r3 = MinimumInteractiveModifier.f732a;
            }
            m3157b(z7, enumC1533a, AbstractC0154b.m337h(interfaceC3810r.mo5829e(interfaceC3810r3).mo5829e(interfaceC3810r2), f11708a), c1939l0, c2395p, ((i8 >> 3) & 7168) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1979q0(enumC1533a, interfaceC3277a, interfaceC3810r, z7, c1939l0, i7);
        }
    }
}
