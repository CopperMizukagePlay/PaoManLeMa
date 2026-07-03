package p063i0;

import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.p007ui.draw.AbstractC0166a;
import p027d1.C0467e;
import p028d2.AbstractC0479l;
import p028d2.C0480m;
import p035e1.C0666m;
import p035e1.C0677s;
import p072j1.AbstractC2163b;
import p073j2.AbstractC2168e;
import p078k0.AbstractC2244m;
import p079k1.C2260b;
import p079k1.C2266e;
import p079k1.C2267e0;
import p079k1.C2289z;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3144n;
import p146t1.C3207i;
import p150t5.InterfaceC3279c;
import p170w1.AbstractC3674f1;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.m2 */
/* loaded from: classes.dex */
public abstract class AbstractC1949m2 {

    /* renamed from: a */
    public static final InterfaceC3810r f11518a = AbstractC0155c.m353l(C3807o.f17991a, AbstractC2244m.f12990a);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (java.lang.Float.isInfinite(p027d1.C0467e.m1024b(r11)) != false) goto L78;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3139a(AbstractC2163b abstractC2163b, String str, InterfaceC3810r interfaceC3810r, long j6, C2395p c2395p, int i7) {
        AbstractC2163b abstractC2163b2;
        int i8;
        boolean z7;
        C0666m c0666m;
        InterfaceC3810r interfaceC3810r2;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(-2142239481);
        if ((i7 & 6) == 0) {
            abstractC2163b2 = abstractC2163b;
            if (c2395p.m3874i(abstractC2163b2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i8 = i12 | i7;
        } else {
            abstractC2163b2 = abstractC2163b;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(str)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i8 |= i10;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3868f(j6)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i8 |= i9;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            boolean z8 = true;
            if ((((i8 & 7168) ^ 3072) > 2048 && c2395p.m3868f(j6)) || (i8 & 3072) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (z7 || m3847O == c2413u0) {
                if (C0677s.m1454c(j6, C0677s.f2209g)) {
                    c0666m = null;
                } else {
                    c0666m = new C0666m(5, j6);
                }
                m3847O = c0666m;
                c2395p.m3877j0(m3847O);
            }
            C0666m c0666m2 = (C0666m) m3847O;
            c2395p.m3857Z(-2144891392);
            InterfaceC3810r interfaceC3810r3 = C3807o.f17991a;
            if (str != null) {
                if ((i8 & 112) != 32) {
                    z8 = false;
                }
                Object m3847O2 = c2395p.m3847O();
                if (z8 || m3847O2 == c2413u0) {
                    m3847O2 = new C0480m(str, 2);
                    c2395p.m3877j0(m3847O2);
                }
                interfaceC3810r2 = AbstractC0479l.m1037a(interfaceC3810r3, false, (InterfaceC3279c) m3847O2);
            } else {
                interfaceC3810r2 = interfaceC3810r3;
            }
            c2395p.m3888r(false);
            InterfaceC3810r interfaceC3810r4 = interfaceC3810r2;
            if (!C0467e.m1023a(abstractC2163b2.mo3504d(), 9205357640488583168L)) {
                long mo3504d = abstractC2163b2.mo3504d();
                if (Float.isInfinite(C0467e.m1026d(mo3504d))) {
                }
                AbstractC3144n.m4849a(AbstractC0166a.m381d(interfaceC3810r.mo5829e(interfaceC3810r3), abstractC2163b2, null, C3207i.f15974a, c0666m2, 22).mo5829e(interfaceC3810r4), c2395p, 0);
            }
            interfaceC3810r3 = f11518a;
            AbstractC3144n.m4849a(AbstractC0166a.m381d(interfaceC3810r.mo5829e(interfaceC3810r3), abstractC2163b2, null, C3207i.f15974a, c0666m2, 22).mo5829e(interfaceC3810r4), c2395p, 0);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1941l2(abstractC2163b, str, interfaceC3810r, j6, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3140b(C2266e c2266e, String str, InterfaceC3810r interfaceC3810r, long j6, C2395p c2395p, int i7, int i8) {
        int i9;
        String str2;
        InterfaceC3810r interfaceC3810r2;
        int i10;
        long j7;
        InterfaceC3810r interfaceC3810r3;
        boolean m3868f;
        Object m3847O;
        InterfaceC3810r interfaceC3810r4;
        float f7;
        float f8;
        Object[] objArr;
        long j8;
        long j9;
        C0666m c0666m;
        InterfaceC3810r interfaceC3810r5;
        long j10;
        C2405r1 m3891u;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(-126890956);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2266e)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            str2 = str;
            if (c2395p.m3870g(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        } else {
            str2 = str;
        }
        int i14 = i8 & 4;
        if (i14 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p.m3870g(interfaceC3810r2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
            if ((i7 & 3072) != 0) {
                if ((i8 & 8) == 0) {
                    j7 = j6;
                    if (c2395p.m3868f(j7)) {
                        i11 = 2048;
                        i9 |= i11;
                    }
                } else {
                    j7 = j6;
                }
                i11 = 1024;
                i9 |= i11;
            } else {
                j7 = j6;
            }
            if ((i9 & 1171) != 1170 && c2395p.m3836D()) {
                c2395p.m3852U();
                interfaceC3810r5 = interfaceC3810r2;
                j10 = j7;
            } else {
                c2395p.m3854W();
                if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                    c2395p.m3852U();
                    if ((i8 & 8) != 0) {
                        i9 &= -7169;
                    }
                    interfaceC3810r3 = interfaceC3810r2;
                } else {
                    if (i14 == 0) {
                        interfaceC3810r3 = C3807o.f17991a;
                    } else {
                        interfaceC3810r3 = interfaceC3810r2;
                    }
                    if ((i8 & 8) != 0) {
                        j7 = ((C0677s) c2395p.m3878k(AbstractC1862c1.f10996a)).f2211a;
                        i9 &= -7169;
                    }
                }
                c2395p.m3889s();
                InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
                float f9 = c2266e.f13140j;
                float mo559b = interfaceC3093c.mo559b();
                m3868f = c2395p.m3868f((Float.floatToRawIntBits(mo559b) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32));
                m3847O = c2395p.m3847O();
                if (m3868f && m3847O != C2375k.f13421a) {
                    interfaceC3810r4 = interfaceC3810r3;
                } else {
                    C2260b c2260b = new C2260b();
                    AbstractC2168e.m3536w(c2260b, c2266e.f13136f);
                    float f10 = c2266e.f13132b;
                    float f11 = c2266e.f13133c;
                    float mo4526y = interfaceC3093c.mo4526y(f10);
                    float mo4526y2 = interfaceC3093c.mo4526y(f11);
                    interfaceC3810r4 = interfaceC3810r3;
                    long floatToRawIntBits = (Float.floatToRawIntBits(mo4526y2) & 4294967295L) | (Float.floatToRawIntBits(mo4526y) << 32);
                    f7 = c2266e.f13134d;
                    f8 = c2266e.f13135e;
                    if (!Float.isNaN(f7)) {
                        objArr = 32;
                        j8 = 4294967295L;
                        f7 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    } else {
                        objArr = 32;
                        j8 = 4294967295L;
                    }
                    if (Float.isNaN(f8)) {
                        f8 = Float.intBitsToFloat((int) (floatToRawIntBits & j8));
                    }
                    long floatToRawIntBits2 = Float.floatToRawIntBits(f7);
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(f8) & j8) | (floatToRawIntBits2 << (objArr == true ? 1L : 0L));
                    C2267e0 c2267e0 = new C2267e0(c2260b);
                    String str3 = c2266e.f13131a;
                    j9 = c2266e.f13137g;
                    int i15 = c2266e.f13138h;
                    if (j9 == 16) {
                        c0666m = new C0666m(i15, j9);
                    } else {
                        c0666m = null;
                    }
                    boolean z7 = c2266e.f13139i;
                    c2267e0.f13141e.setValue(new C0467e(floatToRawIntBits));
                    c2267e0.f13142f.setValue(Boolean.valueOf(z7));
                    C2289z c2289z = c2267e0.f13143g;
                    c2289z.f13214g.setValue(c0666m);
                    c2289z.f13216i.setValue(new C0467e(floatToRawIntBits3));
                    c2289z.f13210c = str3;
                    c2395p.m3877j0(c2267e0);
                    m3847O = c2267e0;
                }
                InterfaceC3810r interfaceC3810r6 = interfaceC3810r4;
                long j11 = j7;
                m3139a((C2267e0) m3847O, str2, interfaceC3810r6, j11, c2395p, (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168));
                interfaceC3810r5 = interfaceC3810r6;
                j10 = j11;
            }
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C1933k2(c2266e, str, interfaceC3810r5, j10, i7, i8);
                return;
            }
            return;
        }
        interfaceC3810r2 = interfaceC3810r;
        if ((i7 & 3072) != 0) {
        }
        if ((i9 & 1171) != 1170) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if ((i8 & 8) != 0) {
        }
        c2395p.m3889s();
        InterfaceC3093c interfaceC3093c2 = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
        float f92 = c2266e.f13140j;
        float mo559b2 = interfaceC3093c2.mo559b();
        m3868f = c2395p.m3868f((Float.floatToRawIntBits(mo559b2) & 4294967295L) | (Float.floatToRawIntBits(f92) << 32));
        m3847O = c2395p.m3847O();
        if (m3868f) {
        }
        C2260b c2260b2 = new C2260b();
        AbstractC2168e.m3536w(c2260b2, c2266e.f13136f);
        float f102 = c2266e.f13132b;
        float f112 = c2266e.f13133c;
        float mo4526y3 = interfaceC3093c2.mo4526y(f102);
        float mo4526y22 = interfaceC3093c2.mo4526y(f112);
        interfaceC3810r4 = interfaceC3810r3;
        long floatToRawIntBits4 = (Float.floatToRawIntBits(mo4526y22) & 4294967295L) | (Float.floatToRawIntBits(mo4526y3) << 32);
        f7 = c2266e.f13134d;
        f8 = c2266e.f13135e;
        if (!Float.isNaN(f7)) {
        }
        if (Float.isNaN(f8)) {
        }
        long floatToRawIntBits22 = Float.floatToRawIntBits(f7);
        long floatToRawIntBits32 = (Float.floatToRawIntBits(f8) & j8) | (floatToRawIntBits22 << (objArr == true ? 1L : 0L));
        C2267e0 c2267e02 = new C2267e0(c2260b2);
        String str32 = c2266e.f13131a;
        j9 = c2266e.f13137g;
        int i152 = c2266e.f13138h;
        if (j9 == 16) {
        }
        boolean z72 = c2266e.f13139i;
        c2267e02.f13141e.setValue(new C0467e(floatToRawIntBits4));
        c2267e02.f13142f.setValue(Boolean.valueOf(z72));
        C2289z c2289z2 = c2267e02.f13143g;
        c2289z2.f13214g.setValue(c0666m);
        c2289z2.f13216i.setValue(new C0467e(floatToRawIntBits32));
        c2289z2.f13210c = str32;
        c2395p.m3877j0(c2267e02);
        m3847O = c2267e02;
        InterfaceC3810r interfaceC3810r62 = interfaceC3810r4;
        long j112 = j7;
        m3139a((C2267e0) m3847O, str2, interfaceC3810r62, j112, c2395p, (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168));
        interfaceC3810r5 = interfaceC3810r62;
        j10 = j112;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }
}
