package p001a0;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.AbstractC0149e;
import androidx.compose.foundation.text.handwriting.AbstractC0163a;
import androidx.compose.foundation.text.input.internal.AbstractC0164a;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.p007ui.draw.AbstractC0166a;
import androidx.compose.p007ui.focus.AbstractC0167a;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.input.key.AbstractC0169a;
import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p007ui.layout.AbstractC0172a;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicReference;
import p000a.AbstractC0000a;
import p018c0.AbstractC0353w;
import p018c0.C0335e;
import p018c0.C0352v;
import p019c1.C0373q;
import p019c1.InterfaceC0366j;
import p027d1.C0464b;
import p027d1.C0465c;
import p028d2.AbstractC0479l;
import p032d6.InterfaceC0516a0;
import p034e0.AbstractC0606g0;
import p034e0.AbstractC0638w0;
import p034e0.C0618m0;
import p034e0.C0622o0;
import p034e0.C0625q;
import p034e0.C0636v0;
import p034e0.InterfaceC0617m;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p050g2.C1579c;
import p050g2.C1581d;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.C1813u;
import p073j2.AbstractC2168e;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.InterfaceC2293d;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.C2427z;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p086l1.InterfaceC2430a;
import p087l2.C2437c0;
import p087l2.C2439d0;
import p087l2.C2444h;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.C2460x;
import p087l2.InterfaceC2453q;
import p087l2.InterfaceC2454r;
import p092m.AbstractC2487d;
import p096m3.C2560j;
import p096m3.C2567q;
import p096m3.C2574x;
import p102n1.AbstractC2710c;
import p103n2.C2714b;
import p107o.AbstractC2786x0;
import p115p.C2830j;
import p117p1.C2842a;
import p117p1.C2845b0;
import p122q.EnumC2931o0;
import p132r2.C3027a;
import p132r2.C3038l;
import p132r2.C3042p;
import p132r2.EnumC3036j;
import p137s.C3081j;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3144n;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p170w1.C3726s1;
import p170w1.InterfaceC3658b1;
import p170w1.InterfaceC3663c2;
import p170w1.InterfaceC3667d2;
import p170w1.InterfaceC3687i2;
import p174w5.AbstractC3784a;
import p176x.C3788c;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC0027g1 {

    /* renamed from: a */
    public static final C0011c1 f128a = new C0011c1(1);

    /* renamed from: b */
    public static final C2842a f129b = new C2842a(1008);

    /* renamed from: c */
    public static final C0076s2 f130c = new C0076s2(0, 0, 0);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m55a(String str, InterfaceC3810r interfaceC3810r, C1604o0 c1604o0, int i7, boolean z7, int i8, int i9, C2395p c2395p, int i10, int i11) {
        int i12;
        C1604o0 c1604o02;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        c2395p.m3859a0(-1186827822);
        if ((i10 & 6) == 0) {
            if (c2395p.m3870g(str)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i12 = i28 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i12 |= i27;
        }
        if ((i10 & 384) == 0) {
            c1604o02 = c1604o0;
            if (c2395p.m3870g(c1604o02)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i12 |= i26;
        } else {
            c1604o02 = c1604o0;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c2395p.m3874i(null)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        int i29 = i11 & 16;
        if (i29 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i14 = i7;
            if (c2395p.m3866e(i14)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
            i16 = i11 & 32;
            if (i16 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                z8 = z7;
                if (c2395p.m3872h(z8)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
                if ((1572864 & i10) == 0) {
                    if (c2395p.m3866e(i8)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                } else if ((12582912 & i10) == 0) {
                    i19 = i9;
                    if (c2395p.m3866e(i19)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                    if (((i12 | 100663296) & 38347923) != 38347922 && c2395p.m3836D()) {
                        c2395p.m3852U();
                        i23 = i14;
                        z9 = z8;
                        i24 = i19;
                    } else {
                        if (i29 == 0) {
                            i21 = 1;
                        } else {
                            i21 = i14;
                        }
                        if (i16 != 0) {
                            z8 = true;
                        }
                        if (i18 == 0) {
                            i22 = 1;
                        } else {
                            i22 = i19;
                        }
                        m73s(i22, i8);
                        if (c2395p.m3878k(AbstractC0606g0.f1998a) != null) {
                            c2395p.m3857Z(-1588686502);
                            c2395p.m3888r(false);
                            c2395p.m3857Z(-1587866335);
                            boolean z10 = z8;
                            InterfaceC3810r mo5829e = AbstractC0168a.m385b(interfaceC3810r, 0.0f, null, 131071).mo5829e(new TextStringSimpleElement(str, c1604o02, (InterfaceC2293d) c2395p.m3878k(AbstractC3674f1.f17520k), i21, z10, i8, i22));
                            c2395p.m3888r(false);
                            int hashCode = Long.hashCode(c2395p.f13486T);
                            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e);
                            InterfaceC2385m1 m3882m = c2395p.m3882m();
                            InterfaceC3510j.f16935d.getClass();
                            C3558z c3558z = C3507i.f16928b;
                            c2395p.m3863c0();
                            if (c2395p.f13485S) {
                                c2395p.m3880l(c3558z);
                            } else {
                                c2395p.m3883m0();
                            }
                            AbstractC2418w.m3954C(C0085v0.f398a, c2395p, C3507i.f16931e);
                            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                            C3504h c3504h = C3507i.f16932f;
                            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                            }
                            c2395p.m3888r(true);
                            i23 = i21;
                            z9 = z10;
                            i24 = i22;
                        } else {
                            throw new ClassCastException();
                        }
                    }
                    C2405r1 m3891u = c2395p.m3891u();
                    if (m3891u != null) {
                        m3891u.f13542d = new C0049m(str, interfaceC3810r, c1604o0, i23, z9, i8, i24, i10, i11);
                        return;
                    }
                    return;
                }
                i19 = i9;
                if (((i12 | 100663296) & 38347923) != 38347922) {
                }
                if (i29 == 0) {
                }
                if (i16 != 0) {
                }
                if (i18 == 0) {
                }
                m73s(i22, i8);
                if (c2395p.m3878k(AbstractC0606g0.f1998a) != null) {
                }
            }
            z8 = z7;
            if ((1572864 & i10) == 0) {
            }
            i18 = i11 & 128;
            if (i18 != 0) {
            }
            i19 = i9;
            if (((i12 | 100663296) & 38347923) != 38347922) {
            }
            if (i29 == 0) {
            }
            if (i16 != 0) {
            }
            if (i18 == 0) {
            }
            m73s(i22, i8);
            if (c2395p.m3878k(AbstractC0606g0.f1998a) != null) {
            }
        }
        i14 = i7;
        i16 = i11 & 32;
        if (i16 == 0) {
        }
        z8 = z7;
        if ((1572864 & i10) == 0) {
        }
        i18 = i11 & 128;
        if (i18 != 0) {
        }
        i19 = i9;
        if (((i12 | 100663296) & 38347923) != 38347922) {
        }
        if (i29 == 0) {
        }
        if (i16 != 0) {
        }
        if (i18 == 0) {
        }
        m73s(i22, i8);
        if (c2395p.m3878k(AbstractC0606g0.f1998a) != null) {
        }
    }

    /* renamed from: b */
    public static final void m56b(C0622o0 c0622o0, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        C3173d c3173d2;
        C2395p c2395p2;
        int i9;
        int i10;
        c2395p.m3859a0(-1985516685);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c0622o0)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            c3173d2 = c3173d;
            c2395p2 = c2395p;
        } else {
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = new C2830j();
                c2395p.m3877j0(m3847O);
            }
            C2830j c2830j = (C2830j) m3847O;
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == c2413u0) {
                m3847O2 = new C0053n(0, c2830j);
                c2395p.m3877j0(m3847O2);
            }
            c3173d2 = c3173d;
            c2395p2 = c2395p;
            AbstractC2168e.m3515b(c2830j, (InterfaceC3277a) m3847O2, new C0078t0(c0622o0, c2830j, false, 4), null, c0622o0.m1285h(), c3173d2, c2395p2, ((i8 << 12) & 458752) | 54);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0057o(i7, 0, c0622o0, c3173d2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0490, code lost:
    
        if (r3 > ((r6 != null ? r6.longValue() : 0) + 5000)) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0650 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0699 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x073e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0829 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0865 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x042d  */
    /* JADX WARN: Type inference failed for: r0v69, types: [x0.r] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, x0.r] */
    /* JADX WARN: Type inference failed for: r2v87, types: [x0.r] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m57c(C2459w c2459w, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, C1604o0 c1604o0, C0625q c0625q, InterfaceC3279c interfaceC3279c2, C3081j c3081j, AbstractC0670o abstractC0670o, boolean z7, int i7, int i8, C2447k c2447k, C0035i1 c0035i1, boolean z8, boolean z9, C3173d c3173d, C2395p c2395p, int i9, int i10) {
        int i11;
        int i12;
        Object obj;
        C2460x c2460x;
        C0048l2 c0048l2;
        int i13;
        C2439d0 c2439d0;
        Object obj2;
        C2413u0 c2413u0;
        InterfaceC2453q interfaceC2453q;
        Object c0043k1;
        int i14;
        C0048l2 c0048l22;
        C1602n0 c1602n0;
        C0335e c0335e;
        InterfaceC3093c interfaceC3093c;
        InterfaceC2293d interfaceC2293d;
        InterfaceC0366j interfaceC0366j;
        InterfaceC3687i2 interfaceC3687i2;
        C1604o0 c1604o02;
        boolean z10;
        C1587g c1587g;
        C2460x c2460x2;
        C1587g c1587g2;
        C2439d0 c2439d02;
        long j6;
        boolean z11;
        boolean z12;
        C2459w m4026a;
        Object m3847O;
        C2413u0 c2413u02;
        C0072r2 c0072r2;
        Object m3847O2;
        Object m3847O3;
        Object m3847O4;
        int i15;
        C2447k c2447k2;
        C2460x c2460x3;
        C0043k1 c0043k12;
        boolean z13;
        boolean m3874i;
        Object c0010c0;
        int i16;
        C0373q c0373q;
        int i17;
        int i18;
        C0043k1 c0043k13;
        boolean z14;
        boolean z15;
        C2460x c2460x4;
        C3788c c3788c;
        C2459w c2459w2;
        C2447k c2447k3;
        InterfaceC2453q interfaceC2453q2;
        InterfaceC3810r m325a;
        InterfaceC3810r interfaceC3810r2;
        boolean z16;
        boolean z17;
        Object c0073s;
        C3081j c3081j2;
        InterfaceC3810r interfaceC3810r3;
        InterfaceC2425y0 interfaceC2425y0;
        boolean m3874i2;
        C2460x c2460x5;
        C3807o c3807o;
        InterfaceC3810r mo5829e;
        int i19;
        boolean m3874i3;
        Object c0018e0;
        int i20;
        InterfaceC2453q interfaceC2453q3;
        C2460x c2460x6;
        C3807o c3807o2;
        InterfaceC3810r interfaceC3810r4;
        boolean m3874i4;
        InterfaceC3687i2 interfaceC3687i22;
        boolean m3874i5;
        Object m3847O5;
        InterfaceC3687i2 interfaceC3687i23;
        boolean m3874i6;
        Object c0038j0;
        C0622o0 c0622o0;
        int i21;
        C2459w c2459w3;
        boolean m3874i7;
        boolean m3874i8;
        Object m3847O6;
        C2447k c2447k4;
        boolean m3874i9;
        Object m3847O7;
        C2395p c2395p2;
        C2395p c2395p3 = c2395p;
        C1602n0 c1602n02 = c2459w.f13725c;
        C1587g c1587g3 = c2459w.f13723a;
        c2395p3.m3859a0(-958708118);
        if ((i9 & 6) == 0) {
            i11 = i9 | (c2395p3.m3870g(c2459w) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c2395p3.m3874i(interfaceC3279c) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c2395p3.m3870g(interfaceC3810r) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c2395p3.m3870g(c1604o0) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c2395p3.m3870g(c0625q) ? 16384 : 8192;
        }
        if ((i9 & 196608) == 0) {
            i11 |= c2395p3.m3874i(interfaceC3279c2) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i11 |= c2395p3.m3870g(c3081j) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i11 |= c2395p3.m3870g(abstractC0670o) ? 8388608 : 4194304;
        }
        if ((i9 & 100663296) == 0) {
            i11 |= c2395p3.m3872h(z7) ? 67108864 : 33554432;
        }
        if ((i9 & 805306368) == 0) {
            i11 |= c2395p3.m3866e(i7) ? 536870912 : 268435456;
        }
        int i22 = i11;
        if ((i10 & 6) == 0) {
            i12 = i10 | (c2395p3.m3866e(i8) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c2395p3.m3870g(c2447k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c2395p3.m3870g(c0035i1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c2395p3.m3872h(z8) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c2395p3.m3872h(z9) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c2395p3.m3874i(c3173d) ? 131072 : 65536;
        }
        int i23 = i12;
        if ((i22 & 306783379) == 306783378 && (74899 & i23) == 74898 && c2395p3.m3836D()) {
            c2395p3.m3852U();
            c2395p2 = c2395p3;
        } else {
            c2395p3.m3854W();
            if ((i9 & 1) != 0 && !c2395p3.m3834B()) {
                c2395p3.m3852U();
            }
            c2395p3.m3889s();
            Object m3847O8 = c2395p3.m3847O();
            C2413u0 c2413u03 = C2375k.f13421a;
            Object obj3 = m3847O8;
            if (m3847O8 == c2413u03) {
                C0373q c0373q2 = new C0373q();
                c2395p3.m3877j0(c0373q2);
                obj3 = c0373q2;
            }
            C0373q c0373q3 = (C0373q) obj3;
            Object m3847O9 = c2395p3.m3847O();
            if (m3847O9 == c2413u03) {
                C0352v c0352v = AbstractC0353w.f1193a;
                m3847O9 = new Object();
                c2395p3.m3877j0(m3847O9);
            }
            C0335e c0335e2 = (C0335e) m3847O9;
            Object m3847O10 = c2395p3.m3847O();
            Object obj4 = m3847O10;
            if (m3847O10 == c2413u03) {
                C2460x c2460x7 = new C2460x(c0335e2);
                c2395p3.m3877j0(c2460x7);
                obj4 = c2460x7;
            }
            C2460x c2460x8 = (C2460x) obj4;
            InterfaceC3093c interfaceC3093c2 = (InterfaceC3093c) c2395p3.m3878k(AbstractC3674f1.f17517h);
            InterfaceC2293d interfaceC2293d2 = (InterfaceC2293d) c2395p3.m3878k(AbstractC3674f1.f17520k);
            long j7 = ((C0636v0) c2395p3.m3878k(AbstractC0638w0.f2110a)).f2104b;
            InterfaceC0366j interfaceC0366j2 = (InterfaceC0366j) c2395p3.m3878k(AbstractC3674f1.f17518i);
            InterfaceC3687i2 interfaceC3687i24 = (InterfaceC3687i2) c2395p3.m3878k(AbstractC3674f1.f17529t);
            InterfaceC3663c2 interfaceC3663c2 = (InterfaceC3663c2) c2395p3.m3878k(AbstractC3674f1.f17525p);
            EnumC2931o0 enumC2931o0 = (i7 == 1 && !z7 && c2447k.f13699a) ? EnumC2931o0.f15241f : EnumC2931o0.f15240e;
            Object[] objArr = {enumC2931o0};
            C0068q2 c0068q2 = C0048l2.f245f;
            boolean m3870g = c2395p3.m3870g(enumC2931o0);
            Object m3847O11 = c2395p3.m3847O();
            if (m3870g || m3847O11 == c2413u03) {
                C0053n c0053n = new C0053n(2, enumC2931o0);
                c2395p3.m3877j0(c0053n);
                obj = c0053n;
            } else {
                obj = m3847O11;
            }
            C0048l2 c0048l23 = (C0048l2) AbstractC3344k.m5081d(objArr, c0068q2, (InterfaceC3277a) obj, c2395p3, 0, 4);
            int i24 = i22 & 14;
            boolean z18 = (i24 == 4) | ((i22 & 57344) == 16384);
            Object m3847O12 = c2395p3.m3847O();
            if (z18 || m3847O12 == c2413u03) {
                C2439d0 m66l = m66l(c0625q, c1587g3);
                if (c1602n02 != null) {
                    c1587g3 = c1587g3;
                    c2460x = c2460x8;
                    long j8 = c1602n02.f10304a;
                    InterfaceC2453q interfaceC2453q4 = m66l.f13686b;
                    int i25 = C1602n0.f10303c;
                    int mo168b = interfaceC2453q4.mo168b((int) (j8 >> 32));
                    c0048l2 = c0048l23;
                    int mo168b2 = interfaceC2453q4.mo168b((int) (j8 & 4294967295L));
                    int min = Math.min(mo168b, mo168b2);
                    int max = Math.max(mo168b, mo168b2);
                    C1581d c1581d = new C1581d(m66l.f13685a);
                    i13 = i24;
                    c1581d.f10207f.add(new C1579c(new C1588g0(0L, 0L, (C2300k) null, (C2298i) null, (C2299j) null, (AbstractC2305p) null, (String) null, 0L, (C3027a) null, (C3042p) null, (C2714b) null, 0L, C3038l.f15605c, (C0665l0) null, 61439), min, max, ""));
                    c2439d0 = new C2439d0(c1581d.m2555b(), interfaceC2453q4);
                } else {
                    c1587g3 = c1587g3;
                    c2460x = c2460x8;
                    c0048l2 = c0048l23;
                    i13 = i24;
                    c2439d0 = m66l;
                }
                c2395p3.m3877j0(c2439d0);
                obj2 = c2439d0;
            } else {
                c2460x = c2460x8;
                c0048l2 = c0048l23;
                i13 = i24;
                obj2 = m3847O12;
            }
            C2439d0 c2439d03 = (C2439d0) obj2;
            C1587g c1587g4 = c2439d03.f13685a;
            InterfaceC2453q interfaceC2453q5 = c2439d03.f13686b;
            C2405r1 m3833A = c2395p3.m3833A();
            if (m3833A != null) {
                m3833A.f13540b |= 1;
                boolean m3870g2 = c2395p3.m3870g(interfaceC3663c2);
                Object m3847O13 = c2395p3.m3847O();
                if (m3870g2 || m3847O13 == c2413u03) {
                    c2413u0 = c2413u03;
                    interfaceC2453q = interfaceC2453q5;
                    i14 = i13;
                    c0048l22 = c0048l2;
                    c1602n0 = c1602n02;
                    c0335e = c0335e2;
                    interfaceC3093c = interfaceC3093c2;
                    interfaceC2293d = interfaceC2293d2;
                    interfaceC0366j = interfaceC0366j2;
                    interfaceC3687i2 = interfaceC3687i24;
                    c1604o02 = c1604o0;
                    z10 = z7;
                    c1587g = c1587g4;
                    c2460x2 = c2460x;
                    c1587g2 = c1587g3;
                    c2439d02 = c2439d03;
                    j6 = j7;
                    c0043k1 = new C0043k1(new C0067q1(c1587g, c1604o02, z10, interfaceC3093c, interfaceC2293d, 0), m3833A, interfaceC3663c2);
                    c2395p3.m3877j0(c0043k1);
                } else {
                    z10 = z7;
                    c2413u0 = c2413u03;
                    interfaceC2453q = interfaceC2453q5;
                    c0043k1 = m3847O13;
                    i14 = i13;
                    c0048l22 = c0048l2;
                    c1602n0 = c1602n02;
                    c0335e = c0335e2;
                    interfaceC3093c = interfaceC3093c2;
                    interfaceC2293d = interfaceC2293d2;
                    interfaceC0366j = interfaceC0366j2;
                    interfaceC3687i2 = interfaceC3687i24;
                    c1604o02 = c1604o0;
                    c1587g = c1587g4;
                    c2460x2 = c2460x;
                    c1587g2 = c1587g3;
                    c2439d02 = c2439d03;
                    j6 = j7;
                }
                C0043k1 c0043k14 = (C0043k1) c0043k1;
                c0043k14.f229s = interfaceC3279c;
                c0043k14.f233w = j6;
                C0031h1 c0031h1 = c0043k14.f228r;
                c0031h1.f153g = c0035i1;
                c0031h1.f154h = interfaceC0366j;
                c0043k14.f220j = c1587g2;
                C0067q1 c0067q1 = c0043k14.f211a;
                if (!AbstractC3367j.m5096a(c0067q1.f332a, c1587g) || !AbstractC3367j.m5096a(c0067q1.f333b, c1604o02) || c0067q1.f336e != z10 || c0067q1.f337f != 1 || c0067q1.f334c != Integer.MAX_VALUE || c0067q1.f335d != 1 || !AbstractC3367j.m5096a(c0067q1.f338g, interfaceC3093c) || !AbstractC3367j.m5096a(c0067q1.f340i, C1813u.f10860e) || c0067q1.f339h != interfaceC2293d) {
                    c0067q1 = new C0067q1(c1587g, c1604o02, z10, interfaceC3093c, interfaceC2293d, 0);
                }
                InterfaceC3093c interfaceC3093c3 = interfaceC3093c;
                if (c0043k14.f211a != c0067q1) {
                    c0043k14.f226p = true;
                }
                c0043k14.f211a = c0067q1;
                C0068q2 c0068q22 = c0043k14.f214d;
                C2437c0 c2437c0 = c0043k14.f215e;
                c0068q22.getClass();
                long j9 = c2459w.f13724b;
                C1602n0 c1602n03 = c1602n0;
                boolean m5096a = AbstractC3367j.m5096a(c1602n03, ((C2444h) c0068q22.f344f).m4014c());
                if (!AbstractC3367j.m5096a(((C2459w) c0068q22.f345g).f13723a.f10239f, c1587g2.f10239f)) {
                    c0068q22.f344f = new C2444h(c1587g2, j9);
                    z11 = true;
                } else if (C1602n0.m2585a(((C2459w) c0068q22.f345g).f13724b, j9)) {
                    z11 = false;
                } else {
                    ((C2444h) c0068q22.f344f).m4017f(C1602n0.m2589e(j9), C1602n0.m2588d(j9));
                    z12 = true;
                    z11 = false;
                    if (c1602n03 != null) {
                        C2444h c2444h = (C2444h) c0068q22.f344f;
                        c2444h.f13695d = -1;
                        c2444h.f13696e = -1;
                    } else {
                        long j10 = c1602n03.f10304a;
                        if (!C1602n0.m2586b(j10)) {
                            ((C2444h) c0068q22.f344f).m4016e(C1602n0.m2589e(j10), C1602n0.m2588d(j10));
                        }
                    }
                    if (z11 && (z12 || m5096a)) {
                        m4026a = c2459w;
                    } else {
                        C2444h c2444h2 = (C2444h) c0068q22.f344f;
                        c2444h2.f13695d = -1;
                        c2444h2.f13696e = -1;
                        m4026a = C2459w.m4026a(c2459w, null, 0L, 3);
                    }
                    C2459w c2459w4 = (C2459w) c0068q22.f345g;
                    c0068q22.f345g = m4026a;
                    if (c2437c0 != null) {
                        c2437c0.m4011a(c2459w4, m4026a);
                    }
                    m3847O = c2395p3.m3847O();
                    c2413u02 = c2413u0;
                    if (m3847O == c2413u02) {
                        m3847O = new Object();
                        c2395p3.m3877j0(m3847O);
                    }
                    c0072r2 = (C0072r2) m3847O;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!c0072r2.f360e) {
                        Long l7 = c0072r2.f359d;
                    }
                    c0072r2.f359d = Long.valueOf(currentTimeMillis);
                    c0072r2.m166a(c2459w);
                    m3847O2 = c2395p3.m3847O();
                    Object obj5 = m3847O2;
                    if (m3847O2 == c2413u02) {
                        C0622o0 c0622o02 = new C0622o0(c0072r2);
                        c2395p3.m3877j0(c0622o02);
                        obj5 = c0622o02;
                    }
                    C0622o0 c0622o03 = (C0622o0) obj5;
                    InterfaceC2453q interfaceC2453q6 = interfaceC2453q;
                    c0622o03.f2045b = interfaceC2453q6;
                    c0622o03.f2046c = c0043k14.f230t;
                    c0622o03.f2047d = c0043k14;
                    c0622o03.f2048e.setValue(c2459w);
                    c0622o03.f2049f = (InterfaceC3658b1) c2395p3.m3878k(AbstractC3674f1.f17514e);
                    c0622o03.f2050g = (InterfaceC3667d2) c2395p3.m3878k(AbstractC3674f1.f17526q);
                    c0622o03.f2051h = (InterfaceC2430a) c2395p3.m3878k(AbstractC3674f1.f17521l);
                    c0622o03.f2052i = c0373q3;
                    boolean z19 = !z9;
                    c0622o03.f2053j.setValue(Boolean.valueOf(z19));
                    c0622o03.f2054k.setValue(Boolean.valueOf(z8));
                    m3847O3 = c2395p3.m3847O();
                    if (m3847O3 == c2413u02) {
                        C2427z c2427z = new C2427z(AbstractC2418w.m3971n(c2395p3));
                        c2395p3.m3877j0(c2427z);
                        m3847O3 = c2427z;
                    }
                    InterfaceC0516a0 interfaceC0516a0 = ((C2427z) m3847O3).f13636e;
                    m3847O4 = c2395p3.m3847O();
                    Object obj6 = m3847O4;
                    if (m3847O4 == c2413u02) {
                        C3788c c3788c2 = new C3788c();
                        c2395p3.m3877j0(c3788c2);
                        obj6 = c3788c2;
                    }
                    C3788c c3788c3 = (C3788c) obj6;
                    int i26 = i23 & 7168;
                    int i27 = i23 & 57344;
                    C2460x c2460x9 = c2460x2;
                    InterfaceC0366j interfaceC0366j3 = interfaceC0366j;
                    int i28 = i14;
                    boolean m3874i10 = (i26 != 2048) | c2395p3.m3874i(c0043k14) | (i27 != 16384) | c2395p3.m3874i(c2460x9) | (i28 != 4);
                    i15 = (i23 & 112) ^ 48;
                    if (i15 <= 32) {
                        c2447k2 = c2447k;
                        if (c2395p3.m3870g(c2447k2)) {
                            c2460x3 = c2460x9;
                            c0043k12 = c0043k14;
                            z13 = true;
                            m3874i = m3874i10 | z13 | c2395p3.m3874i(interfaceC2453q6) | c2395p3.m3874i(interfaceC0516a0) | c2395p3.m3874i(c3788c3) | c2395p3.m3874i(c0622o03);
                            Object m3847O14 = c2395p3.m3847O();
                            if (!m3874i || m3847O14 == c2413u02) {
                                C2447k c2447k5 = c2447k2;
                                i16 = i27;
                                c0373q = c0373q3;
                                i17 = i23;
                                i18 = i26;
                                c0043k13 = c0043k12;
                                z14 = true;
                                C2460x c2460x10 = c2460x3;
                                c0010c0 = new C0010c0(c0043k13, z8, z9, c2460x10, c2459w, c2447k5, interfaceC2453q6, c0622o03, interfaceC0516a0, c3788c3);
                                z15 = z8;
                                c2460x4 = c2460x10;
                                c0622o03 = c0622o03;
                                c3788c = c3788c3;
                                c2459w2 = c2459w;
                                c2447k3 = c2447k5;
                                interfaceC2453q2 = interfaceC2453q6;
                                c2395p3.m3877j0(c0010c0);
                            } else {
                                z15 = z8;
                                c0010c0 = m3847O14;
                                c0373q = c0373q3;
                                i17 = i23;
                                i18 = i26;
                                c2460x4 = c2460x3;
                                c0043k13 = c0043k12;
                                z14 = true;
                                c2459w2 = c2459w;
                                c3788c = c3788c3;
                                c2447k3 = c2447k2;
                                interfaceC2453q2 = interfaceC2453q6;
                                i16 = i27;
                            }
                            m325a = AbstractC0149e.m325a(AbstractC0167a.m383b(AbstractC0167a.m382a(c0373q), (InterfaceC3279c) c0010c0), z15, c3081j);
                            InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(Boolean.valueOf((z15 || z9) ? false : z14), c2395p3);
                            boolean m3870g3 = c2395p3.m3870g(m3953A) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x4) | c2395p3.m3874i(c0622o03);
                            if (i15 > 32 || !c2395p3.m3870g(c2447k3)) {
                                interfaceC3810r2 = m325a;
                                if ((i17 & 48) != 32) {
                                    z16 = false;
                                    z17 = z16 | m3870g3;
                                    Object m3847O15 = c2395p3.m3847O();
                                    if (!z17 || m3847O15 == c2413u02) {
                                        C2460x c2460x11 = c2460x4;
                                        c3081j2 = c3081j;
                                        interfaceC3810r3 = interfaceC3810r2;
                                        c0073s = new C0073s(c0043k13, m3953A, c2460x11, c0622o03, c2447k3, null, 0);
                                        interfaceC2425y0 = m3953A;
                                        c2460x4 = c2460x11;
                                        c2395p3.m3877j0(c0073s);
                                    } else {
                                        c3081j2 = c3081j;
                                        c0073s = m3847O15;
                                        interfaceC3810r3 = interfaceC3810r2;
                                        interfaceC2425y0 = m3953A;
                                    }
                                    AbstractC2418w.m3965g(C1694m.f10482a, c2395p3, (InterfaceC3281e) c0073s);
                                    m3874i2 = c2395p3.m3874i(c0043k13);
                                    Object m3847O16 = c2395p3.m3847O();
                                    Object obj7 = m3847O16;
                                    if (!m3874i2 || m3847O16 == c2413u02) {
                                        C0006b0 c0006b0 = new C0006b0(c0043k13, 1);
                                        c2395p3.m3877j0(c0006b0);
                                        obj7 = c0006b0;
                                    }
                                    c2460x5 = c2460x4;
                                    C0062p0 c0062p0 = new C0062p0((InterfaceC3279c) obj7, null, 6);
                                    c3807o = C3807o.f17991a;
                                    mo5829e = c3807o.mo5829e(new SuspendPointerInputElement(8675309, null, new C2845b0(c0062p0), 6));
                                    i19 = i18;
                                    m3874i3 = c2395p3.m3874i(c0043k13) | (i16 == 16384) | (i19 == 2048) | c2395p3.m3874i(interfaceC2453q2) | c2395p3.m3874i(c0622o03);
                                    Object m3847O17 = c2395p3.m3847O();
                                    if (!m3874i3 || m3847O17 == c2413u02) {
                                        i20 = i19;
                                        interfaceC2453q3 = interfaceC2453q2;
                                        c2460x6 = c2460x5;
                                        c3807o2 = c3807o;
                                        C0622o0 c0622o04 = c0622o03;
                                        boolean z20 = z15;
                                        interfaceC3810r4 = mo5829e;
                                        c0018e0 = new C0018e0(c0043k13, c0373q, z9, z20, c0622o04, interfaceC2453q3);
                                        c0622o03 = c0622o04;
                                        c2395p3.m3877j0(c0018e0);
                                    } else {
                                        interfaceC3810r4 = mo5829e;
                                        i20 = i19;
                                        c0018e0 = m3847O17;
                                        interfaceC2453q3 = interfaceC2453q2;
                                        c2460x6 = c2460x5;
                                        c3807o2 = c3807o;
                                    }
                                    InterfaceC3810r m5821a = z8 ? AbstractC3793a.m5821a(interfaceC3810r4, new C0028g2(0, (InterfaceC3279c) c0018e0, c3081j2)) : interfaceC3810r4;
                                    C0019e1 c0019e1 = c0622o03.f2064u;
                                    C0618m0 c0618m0 = c0622o03.f2063t;
                                    InterfaceC3810r mo5829e2 = m5821a.mo5829e(new SuspendPointerInputElement(c0019e1, c0618m0, new C2845b0(new C0070r0(c0019e1, c0618m0, (InterfaceC2313c) null)), 4)).mo5829e(new Object());
                                    m3874i4 = c2395p3.m3874i(c0043k13) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                                    Object m3847O18 = c2395p3.m3847O();
                                    Object obj8 = m3847O18;
                                    if (!m3874i4 || m3847O18 == c2413u02) {
                                        C0037j c0037j = new C0037j(c0043k13, c2459w2, interfaceC2453q3, 1);
                                        c2395p3.m3877j0(c0037j);
                                        obj8 = c0037j;
                                    }
                                    InterfaceC3810r m378a = AbstractC0166a.m378a(c3807o2, (InterfaceC3279c) obj8);
                                    interfaceC3687i22 = interfaceC3687i2;
                                    m3874i5 = c2395p3.m3874i(c0043k13) | (i20 == 2048) | c2395p3.m3870g(interfaceC3687i22) | c2395p3.m3874i(c0622o03) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                                    m3847O5 = c2395p3.m3847O();
                                    if (!m3874i5 || m3847O5 == c2413u02) {
                                        C0014d0 c0014d0 = new C0014d0(c0043k13, z8, interfaceC3687i22, c0622o03, c2459w2, interfaceC2453q3);
                                        interfaceC3687i23 = interfaceC3687i22;
                                        c2395p3.m3877j0(c0014d0);
                                        m3847O5 = c0014d0;
                                    } else {
                                        interfaceC3687i23 = interfaceC3687i22;
                                    }
                                    InterfaceC3810r m394d = AbstractC0172a.m394d(c3807o2, (InterfaceC3279c) m3847O5);
                                    C2439d0 c2439d04 = c2439d02;
                                    m3874i6 = c2395p3.m3874i(c2439d04) | (i28 == 4) | (i20 == 2048) | c2395p3.m3872h(false) | (i16 == 16384) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(interfaceC2453q3) | c2395p3.m3874i(c0622o03) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                                    Object m3847O19 = c2395p3.m3847O();
                                    if (!m3874i6 || m3847O19 == c2413u02) {
                                        c0622o0 = c0622o03;
                                        InterfaceC2453q interfaceC2453q7 = interfaceC2453q3;
                                        i21 = i28;
                                        C0043k1 c0043k15 = c0043k13;
                                        c0038j0 = new C0038j0(c2439d04, c2459w, z8, z9, c2447k, c0043k15, interfaceC2453q7, c0622o0, c0373q);
                                        c2459w3 = c2459w;
                                        c0043k13 = c0043k15;
                                        interfaceC2453q3 = interfaceC2453q7;
                                        c2395p3.m3877j0(c0038j0);
                                    } else {
                                        c0038j0 = m3847O19;
                                        c0622o0 = c0622o03;
                                        i21 = i28;
                                        c2459w3 = c2459w;
                                    }
                                    InterfaceC3810r m1037a = AbstractC0479l.m1037a(c3807o2, true, (InterfaceC3279c) c0038j0);
                                    boolean z21 = !z8 && !z9 && ((Boolean) ((C3726s1) interfaceC3687i23).f17692a.getValue()).booleanValue() && C1602n0.m2586b(((C1602n0) c0043k13.f234x.getValue()).f10304a) && C1602n0.m2586b(((C1602n0) c0043k13.f235y.getValue()).f10304a);
                                    float f7 = AbstractC0086v1.f399a;
                                    C3807o m5821a2 = z21 ? AbstractC3793a.m5821a(c3807o2, new C0083u1(abstractC0670o, c0043k13, c2459w3, interfaceC2453q3)) : c3807o2;
                                    m3874i7 = c2395p3.m3874i(c0622o0);
                                    Object m3847O20 = c2395p3.m3847O();
                                    Object obj9 = m3847O20;
                                    if (!m3874i7 || m3847O20 == c2413u02) {
                                        C0081u c0081u = new C0081u(c0622o0, 0);
                                        c2395p3.m3877j0(c0081u);
                                        obj9 = c0081u;
                                    }
                                    AbstractC2418w.m3962d(c0622o0, (InterfaceC3279c) obj9, c2395p3);
                                    C2460x c2460x12 = c2460x6;
                                    m3874i8 = c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x12) | (i21 == 4) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                                    m3847O6 = c2395p3.m3847O();
                                    if (!m3874i8 || m3847O6 == c2413u02) {
                                        C0087w c0087w = new C0087w(c0043k13, c2460x12, c2459w3, c2447k, 0);
                                        c2447k4 = c2447k;
                                        c2395p3.m3877j0(c0087w);
                                        m3847O6 = c0087w;
                                    } else {
                                        c2447k4 = c2447k;
                                    }
                                    AbstractC2418w.m3962d(c2447k4, (InterfaceC3279c) m3847O6, c2395p3);
                                    C0622o0 c0622o05 = c0622o0;
                                    InterfaceC3810r m5821a3 = AbstractC3793a.m5821a(c3807o2, new C0004a2(c0043k13, c0622o05, c2459w, z19, i7 == 1, interfaceC2453q3, c0072r2, c0043k13.f230t, c2447k4.f13703e));
                                    boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                                    C0335e c0335e3 = c0335e;
                                    m3874i9 = c2395p3.m3874i(c0043k13) | ((i15 <= 32 && c2395p3.m3870g(c2447k4)) || (i17 & 48) == 32) | c2395p3.m3874i(c0335e3);
                                    m3847O7 = c2395p3.m3847O();
                                    if (!m3874i9 || m3847O7 == c2413u02) {
                                        C0042k0 c0042k0 = new C0042k0(c0043k13, c0373q, c2447k4, c0335e3, 0);
                                        c2395p3.m3877j0(c0042k0);
                                        m3847O7 = c0042k0;
                                    }
                                    InterfaceC3810r mo5829e3 = AbstractC0169a.m388b(AbstractC0169a.m388b(AbstractC0164a.m375a(interfaceC3810r, c0335e3, c0043k13, c0622o05).mo5829e(AbstractC0163a.m374a((InterfaceC3277a) m3847O7, booleanValue)).mo5829e(interfaceC3810r3), new C0078t0(interfaceC0366j3, c0043k13, false, 1)), new C0078t0(false ? 1 : 0, c0043k13, c0622o05)).mo5829e(m5821a3);
                                    InterfaceC2453q interfaceC2453q8 = interfaceC2453q3;
                                    C0048l2 c0048l24 = c0048l22;
                                    InterfaceC3810r m394d2 = AbstractC0172a.m394d(AbstractC3793a.m5821a(mo5829e3, new C0040j2(c0048l24, z8, c3081j)).mo5829e(mo5829e2).mo5829e(m1037a), new C0006b0(c0043k13, (int) (false ? 1 : 0)));
                                    boolean z22 = !z8 && c0043k13.m118b() && ((Boolean) c0043k13.f227q.getValue()).booleanValue() && ((Boolean) ((C3726s1) interfaceC3687i23).f17692a.getValue()).booleanValue();
                                    C2395p c2395p4 = c2395p;
                                    m58d(m394d2, c0622o05, AbstractC3178i.m4873d(-374338080, new C0002a0(c3173d, c0043k13, c1604o0, i8, i7, c0048l24, c2459w, c0625q, m5821a2, m378a, m394d, (z22 || !AbstractC2786x0.m4428a()) ? c3807o2 : AbstractC3793a.m5821a(c3807o2, new C0060o2(2, c0622o05)), c3788c, c0622o05, z22, z9, interfaceC3279c2, interfaceC2453q8, interfaceC3093c3), c2395p4), c2395p4, 384);
                                    c2395p2 = c2395p4;
                                }
                            } else {
                                interfaceC3810r2 = m325a;
                            }
                            z16 = true;
                            z17 = z16 | m3870g3;
                            Object m3847O152 = c2395p3.m3847O();
                            if (z17) {
                            }
                            C2460x c2460x112 = c2460x4;
                            c3081j2 = c3081j;
                            interfaceC3810r3 = interfaceC3810r2;
                            c0073s = new C0073s(c0043k13, m3953A, c2460x112, c0622o03, c2447k3, null, 0);
                            interfaceC2425y0 = m3953A;
                            c2460x4 = c2460x112;
                            c2395p3.m3877j0(c0073s);
                            AbstractC2418w.m3965g(C1694m.f10482a, c2395p3, (InterfaceC3281e) c0073s);
                            m3874i2 = c2395p3.m3874i(c0043k13);
                            Object m3847O162 = c2395p3.m3847O();
                            Object obj72 = m3847O162;
                            if (!m3874i2) {
                            }
                            C0006b0 c0006b02 = new C0006b0(c0043k13, 1);
                            c2395p3.m3877j0(c0006b02);
                            obj72 = c0006b02;
                            c2460x5 = c2460x4;
                            C0062p0 c0062p02 = new C0062p0((InterfaceC3279c) obj72, null, 6);
                            c3807o = C3807o.f17991a;
                            mo5829e = c3807o.mo5829e(new SuspendPointerInputElement(8675309, null, new C2845b0(c0062p02), 6));
                            i19 = i18;
                            m3874i3 = c2395p3.m3874i(c0043k13) | (i16 == 16384) | (i19 == 2048) | c2395p3.m3874i(interfaceC2453q2) | c2395p3.m3874i(c0622o03);
                            Object m3847O172 = c2395p3.m3847O();
                            if (m3874i3) {
                            }
                            i20 = i19;
                            interfaceC2453q3 = interfaceC2453q2;
                            c2460x6 = c2460x5;
                            c3807o2 = c3807o;
                            C0622o0 c0622o042 = c0622o03;
                            boolean z202 = z15;
                            interfaceC3810r4 = mo5829e;
                            c0018e0 = new C0018e0(c0043k13, c0373q, z9, z202, c0622o042, interfaceC2453q3);
                            c0622o03 = c0622o042;
                            c2395p3.m3877j0(c0018e0);
                            if (z8) {
                            }
                            C0019e1 c0019e12 = c0622o03.f2064u;
                            C0618m0 c0618m02 = c0622o03.f2063t;
                            InterfaceC3810r mo5829e22 = m5821a.mo5829e(new SuspendPointerInputElement(c0019e12, c0618m02, new C2845b0(new C0070r0(c0019e12, c0618m02, (InterfaceC2313c) null)), 4)).mo5829e(new Object());
                            m3874i4 = c2395p3.m3874i(c0043k13) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                            Object m3847O182 = c2395p3.m3847O();
                            Object obj82 = m3847O182;
                            if (!m3874i4) {
                            }
                            C0037j c0037j2 = new C0037j(c0043k13, c2459w2, interfaceC2453q3, 1);
                            c2395p3.m3877j0(c0037j2);
                            obj82 = c0037j2;
                            InterfaceC3810r m378a2 = AbstractC0166a.m378a(c3807o2, (InterfaceC3279c) obj82);
                            interfaceC3687i22 = interfaceC3687i2;
                            m3874i5 = c2395p3.m3874i(c0043k13) | (i20 == 2048) | c2395p3.m3870g(interfaceC3687i22) | c2395p3.m3874i(c0622o03) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                            m3847O5 = c2395p3.m3847O();
                            if (m3874i5) {
                            }
                            C0014d0 c0014d02 = new C0014d0(c0043k13, z8, interfaceC3687i22, c0622o03, c2459w2, interfaceC2453q3);
                            interfaceC3687i23 = interfaceC3687i22;
                            c2395p3.m3877j0(c0014d02);
                            m3847O5 = c0014d02;
                            InterfaceC3810r m394d3 = AbstractC0172a.m394d(c3807o2, (InterfaceC3279c) m3847O5);
                            C2439d0 c2439d042 = c2439d02;
                            m3874i6 = c2395p3.m3874i(c2439d042) | (i28 == 4) | (i20 == 2048) | c2395p3.m3872h(false) | (i16 == 16384) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(interfaceC2453q3) | c2395p3.m3874i(c0622o03) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                            Object m3847O192 = c2395p3.m3847O();
                            if (m3874i6) {
                            }
                            c0622o0 = c0622o03;
                            InterfaceC2453q interfaceC2453q72 = interfaceC2453q3;
                            i21 = i28;
                            C0043k1 c0043k152 = c0043k13;
                            c0038j0 = new C0038j0(c2439d042, c2459w, z8, z9, c2447k, c0043k152, interfaceC2453q72, c0622o0, c0373q);
                            c2459w3 = c2459w;
                            c0043k13 = c0043k152;
                            interfaceC2453q3 = interfaceC2453q72;
                            c2395p3.m3877j0(c0038j0);
                            InterfaceC3810r m1037a2 = AbstractC0479l.m1037a(c3807o2, true, (InterfaceC3279c) c0038j0);
                            if (z8) {
                            }
                            float f72 = AbstractC0086v1.f399a;
                            if (z21) {
                            }
                            m3874i7 = c2395p3.m3874i(c0622o0);
                            Object m3847O202 = c2395p3.m3847O();
                            Object obj92 = m3847O202;
                            if (!m3874i7) {
                            }
                            C0081u c0081u2 = new C0081u(c0622o0, 0);
                            c2395p3.m3877j0(c0081u2);
                            obj92 = c0081u2;
                            AbstractC2418w.m3962d(c0622o0, (InterfaceC3279c) obj92, c2395p3);
                            C2460x c2460x122 = c2460x6;
                            m3874i8 = c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x122) | (i21 == 4) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                            m3847O6 = c2395p3.m3847O();
                            if (m3874i8) {
                            }
                            C0087w c0087w2 = new C0087w(c0043k13, c2460x122, c2459w3, c2447k, 0);
                            c2447k4 = c2447k;
                            c2395p3.m3877j0(c0087w2);
                            m3847O6 = c0087w2;
                            AbstractC2418w.m3962d(c2447k4, (InterfaceC3279c) m3847O6, c2395p3);
                            C0622o0 c0622o052 = c0622o0;
                            InterfaceC3810r m5821a32 = AbstractC3793a.m5821a(c3807o2, new C0004a2(c0043k13, c0622o052, c2459w, z19, i7 == 1, interfaceC2453q3, c0072r2, c0043k13.f230t, c2447k4.f13703e));
                            boolean booleanValue2 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                            C0335e c0335e32 = c0335e;
                            m3874i9 = c2395p3.m3874i(c0043k13) | ((i15 <= 32 && c2395p3.m3870g(c2447k4)) || (i17 & 48) == 32) | c2395p3.m3874i(c0335e32);
                            m3847O7 = c2395p3.m3847O();
                            if (!m3874i9) {
                            }
                            C0042k0 c0042k02 = new C0042k0(c0043k13, c0373q, c2447k4, c0335e32, 0);
                            c2395p3.m3877j0(c0042k02);
                            m3847O7 = c0042k02;
                            InterfaceC3810r mo5829e32 = AbstractC0169a.m388b(AbstractC0169a.m388b(AbstractC0164a.m375a(interfaceC3810r, c0335e32, c0043k13, c0622o052).mo5829e(AbstractC0163a.m374a((InterfaceC3277a) m3847O7, booleanValue2)).mo5829e(interfaceC3810r3), new C0078t0(interfaceC0366j3, c0043k13, false, 1)), new C0078t0(false ? 1 : 0, c0043k13, c0622o052)).mo5829e(m5821a32);
                            InterfaceC2453q interfaceC2453q82 = interfaceC2453q3;
                            C0048l2 c0048l242 = c0048l22;
                            InterfaceC3810r m394d22 = AbstractC0172a.m394d(AbstractC3793a.m5821a(mo5829e32, new C0040j2(c0048l242, z8, c3081j)).mo5829e(mo5829e22).mo5829e(m1037a2), new C0006b0(c0043k13, (int) (false ? 1 : 0)));
                            if (z8) {
                            }
                            C2395p c2395p42 = c2395p;
                            m58d(m394d22, c0622o052, AbstractC3178i.m4873d(-374338080, new C0002a0(c3173d, c0043k13, c1604o0, i8, i7, c0048l242, c2459w, c0625q, m5821a2, m378a2, m394d3, (z22 || !AbstractC2786x0.m4428a()) ? c3807o2 : AbstractC3793a.m5821a(c3807o2, new C0060o2(2, c0622o052)), c3788c, c0622o052, z22, z9, interfaceC3279c2, interfaceC2453q82, interfaceC3093c3), c2395p42), c2395p42, 384);
                            c2395p2 = c2395p42;
                        }
                    } else {
                        c2447k2 = c2447k;
                    }
                    c2460x3 = c2460x9;
                    c0043k12 = c0043k14;
                    if ((i23 & 48) != 32) {
                        z13 = false;
                        m3874i = m3874i10 | z13 | c2395p3.m3874i(interfaceC2453q6) | c2395p3.m3874i(interfaceC0516a0) | c2395p3.m3874i(c3788c3) | c2395p3.m3874i(c0622o03);
                        Object m3847O142 = c2395p3.m3847O();
                        if (m3874i) {
                        }
                        C2447k c2447k52 = c2447k2;
                        i16 = i27;
                        c0373q = c0373q3;
                        i17 = i23;
                        i18 = i26;
                        c0043k13 = c0043k12;
                        z14 = true;
                        C2460x c2460x102 = c2460x3;
                        c0010c0 = new C0010c0(c0043k13, z8, z9, c2460x102, c2459w, c2447k52, interfaceC2453q6, c0622o03, interfaceC0516a0, c3788c3);
                        z15 = z8;
                        c2460x4 = c2460x102;
                        c0622o03 = c0622o03;
                        c3788c = c3788c3;
                        c2459w2 = c2459w;
                        c2447k3 = c2447k52;
                        interfaceC2453q2 = interfaceC2453q6;
                        c2395p3.m3877j0(c0010c0);
                        m325a = AbstractC0149e.m325a(AbstractC0167a.m383b(AbstractC0167a.m382a(c0373q), (InterfaceC3279c) c0010c0), z15, c3081j);
                        InterfaceC2425y0 m3953A2 = AbstractC2418w.m3953A(Boolean.valueOf((z15 || z9) ? false : z14), c2395p3);
                        boolean m3870g32 = c2395p3.m3870g(m3953A2) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x4) | c2395p3.m3874i(c0622o03);
                        if (i15 > 32) {
                        }
                        interfaceC3810r2 = m325a;
                        if ((i17 & 48) != 32) {
                        }
                        z16 = true;
                        z17 = z16 | m3870g32;
                        Object m3847O1522 = c2395p3.m3847O();
                        if (z17) {
                        }
                        C2460x c2460x1122 = c2460x4;
                        c3081j2 = c3081j;
                        interfaceC3810r3 = interfaceC3810r2;
                        c0073s = new C0073s(c0043k13, m3953A2, c2460x1122, c0622o03, c2447k3, null, 0);
                        interfaceC2425y0 = m3953A2;
                        c2460x4 = c2460x1122;
                        c2395p3.m3877j0(c0073s);
                        AbstractC2418w.m3965g(C1694m.f10482a, c2395p3, (InterfaceC3281e) c0073s);
                        m3874i2 = c2395p3.m3874i(c0043k13);
                        Object m3847O1622 = c2395p3.m3847O();
                        Object obj722 = m3847O1622;
                        if (!m3874i2) {
                        }
                        C0006b0 c0006b022 = new C0006b0(c0043k13, 1);
                        c2395p3.m3877j0(c0006b022);
                        obj722 = c0006b022;
                        c2460x5 = c2460x4;
                        C0062p0 c0062p022 = new C0062p0((InterfaceC3279c) obj722, null, 6);
                        c3807o = C3807o.f17991a;
                        mo5829e = c3807o.mo5829e(new SuspendPointerInputElement(8675309, null, new C2845b0(c0062p022), 6));
                        i19 = i18;
                        m3874i3 = c2395p3.m3874i(c0043k13) | (i16 == 16384) | (i19 == 2048) | c2395p3.m3874i(interfaceC2453q2) | c2395p3.m3874i(c0622o03);
                        Object m3847O1722 = c2395p3.m3847O();
                        if (m3874i3) {
                        }
                        i20 = i19;
                        interfaceC2453q3 = interfaceC2453q2;
                        c2460x6 = c2460x5;
                        c3807o2 = c3807o;
                        C0622o0 c0622o0422 = c0622o03;
                        boolean z2022 = z15;
                        interfaceC3810r4 = mo5829e;
                        c0018e0 = new C0018e0(c0043k13, c0373q, z9, z2022, c0622o0422, interfaceC2453q3);
                        c0622o03 = c0622o0422;
                        c2395p3.m3877j0(c0018e0);
                        if (z8) {
                        }
                        C0019e1 c0019e122 = c0622o03.f2064u;
                        C0618m0 c0618m022 = c0622o03.f2063t;
                        InterfaceC3810r mo5829e222 = m5821a.mo5829e(new SuspendPointerInputElement(c0019e122, c0618m022, new C2845b0(new C0070r0(c0019e122, c0618m022, (InterfaceC2313c) null)), 4)).mo5829e(new Object());
                        m3874i4 = c2395p3.m3874i(c0043k13) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                        Object m3847O1822 = c2395p3.m3847O();
                        Object obj822 = m3847O1822;
                        if (!m3874i4) {
                        }
                        C0037j c0037j22 = new C0037j(c0043k13, c2459w2, interfaceC2453q3, 1);
                        c2395p3.m3877j0(c0037j22);
                        obj822 = c0037j22;
                        InterfaceC3810r m378a22 = AbstractC0166a.m378a(c3807o2, (InterfaceC3279c) obj822);
                        interfaceC3687i22 = interfaceC3687i2;
                        m3874i5 = c2395p3.m3874i(c0043k13) | (i20 == 2048) | c2395p3.m3870g(interfaceC3687i22) | c2395p3.m3874i(c0622o03) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                        m3847O5 = c2395p3.m3847O();
                        if (m3874i5) {
                        }
                        C0014d0 c0014d022 = new C0014d0(c0043k13, z8, interfaceC3687i22, c0622o03, c2459w2, interfaceC2453q3);
                        interfaceC3687i23 = interfaceC3687i22;
                        c2395p3.m3877j0(c0014d022);
                        m3847O5 = c0014d022;
                        InterfaceC3810r m394d32 = AbstractC0172a.m394d(c3807o2, (InterfaceC3279c) m3847O5);
                        C2439d0 c2439d0422 = c2439d02;
                        m3874i6 = c2395p3.m3874i(c2439d0422) | (i28 == 4) | (i20 == 2048) | c2395p3.m3872h(false) | (i16 == 16384) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(interfaceC2453q3) | c2395p3.m3874i(c0622o03) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                        Object m3847O1922 = c2395p3.m3847O();
                        if (m3874i6) {
                        }
                        c0622o0 = c0622o03;
                        InterfaceC2453q interfaceC2453q722 = interfaceC2453q3;
                        i21 = i28;
                        C0043k1 c0043k1522 = c0043k13;
                        c0038j0 = new C0038j0(c2439d0422, c2459w, z8, z9, c2447k, c0043k1522, interfaceC2453q722, c0622o0, c0373q);
                        c2459w3 = c2459w;
                        c0043k13 = c0043k1522;
                        interfaceC2453q3 = interfaceC2453q722;
                        c2395p3.m3877j0(c0038j0);
                        InterfaceC3810r m1037a22 = AbstractC0479l.m1037a(c3807o2, true, (InterfaceC3279c) c0038j0);
                        if (z8) {
                        }
                        float f722 = AbstractC0086v1.f399a;
                        if (z21) {
                        }
                        m3874i7 = c2395p3.m3874i(c0622o0);
                        Object m3847O2022 = c2395p3.m3847O();
                        Object obj922 = m3847O2022;
                        if (!m3874i7) {
                        }
                        C0081u c0081u22 = new C0081u(c0622o0, 0);
                        c2395p3.m3877j0(c0081u22);
                        obj922 = c0081u22;
                        AbstractC2418w.m3962d(c0622o0, (InterfaceC3279c) obj922, c2395p3);
                        C2460x c2460x1222 = c2460x6;
                        m3874i8 = c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x1222) | (i21 == 4) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                        m3847O6 = c2395p3.m3847O();
                        if (m3874i8) {
                        }
                        C0087w c0087w22 = new C0087w(c0043k13, c2460x1222, c2459w3, c2447k, 0);
                        c2447k4 = c2447k;
                        c2395p3.m3877j0(c0087w22);
                        m3847O6 = c0087w22;
                        AbstractC2418w.m3962d(c2447k4, (InterfaceC3279c) m3847O6, c2395p3);
                        C0622o0 c0622o0522 = c0622o0;
                        InterfaceC3810r m5821a322 = AbstractC3793a.m5821a(c3807o2, new C0004a2(c0043k13, c0622o0522, c2459w, z19, i7 == 1, interfaceC2453q3, c0072r2, c0043k13.f230t, c2447k4.f13703e));
                        boolean booleanValue22 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                        C0335e c0335e322 = c0335e;
                        m3874i9 = c2395p3.m3874i(c0043k13) | ((i15 <= 32 && c2395p3.m3870g(c2447k4)) || (i17 & 48) == 32) | c2395p3.m3874i(c0335e322);
                        m3847O7 = c2395p3.m3847O();
                        if (!m3874i9) {
                        }
                        C0042k0 c0042k022 = new C0042k0(c0043k13, c0373q, c2447k4, c0335e322, 0);
                        c2395p3.m3877j0(c0042k022);
                        m3847O7 = c0042k022;
                        InterfaceC3810r mo5829e322 = AbstractC0169a.m388b(AbstractC0169a.m388b(AbstractC0164a.m375a(interfaceC3810r, c0335e322, c0043k13, c0622o0522).mo5829e(AbstractC0163a.m374a((InterfaceC3277a) m3847O7, booleanValue22)).mo5829e(interfaceC3810r3), new C0078t0(interfaceC0366j3, c0043k13, false, 1)), new C0078t0(false ? 1 : 0, c0043k13, c0622o0522)).mo5829e(m5821a322);
                        InterfaceC2453q interfaceC2453q822 = interfaceC2453q3;
                        C0048l2 c0048l2422 = c0048l22;
                        InterfaceC3810r m394d222 = AbstractC0172a.m394d(AbstractC3793a.m5821a(mo5829e322, new C0040j2(c0048l2422, z8, c3081j)).mo5829e(mo5829e222).mo5829e(m1037a22), new C0006b0(c0043k13, (int) (false ? 1 : 0)));
                        if (z8) {
                        }
                        C2395p c2395p422 = c2395p;
                        m58d(m394d222, c0622o0522, AbstractC3178i.m4873d(-374338080, new C0002a0(c3173d, c0043k13, c1604o0, i8, i7, c0048l2422, c2459w, c0625q, m5821a2, m378a22, m394d32, (z22 || !AbstractC2786x0.m4428a()) ? c3807o2 : AbstractC3793a.m5821a(c3807o2, new C0060o2(2, c0622o0522)), c3788c, c0622o0522, z22, z9, interfaceC3279c2, interfaceC2453q822, interfaceC3093c3), c2395p422), c2395p422, 384);
                        c2395p2 = c2395p422;
                    }
                    z13 = true;
                    m3874i = m3874i10 | z13 | c2395p3.m3874i(interfaceC2453q6) | c2395p3.m3874i(interfaceC0516a0) | c2395p3.m3874i(c3788c3) | c2395p3.m3874i(c0622o03);
                    Object m3847O1422 = c2395p3.m3847O();
                    if (m3874i) {
                    }
                    C2447k c2447k522 = c2447k2;
                    i16 = i27;
                    c0373q = c0373q3;
                    i17 = i23;
                    i18 = i26;
                    c0043k13 = c0043k12;
                    z14 = true;
                    C2460x c2460x1022 = c2460x3;
                    c0010c0 = new C0010c0(c0043k13, z8, z9, c2460x1022, c2459w, c2447k522, interfaceC2453q6, c0622o03, interfaceC0516a0, c3788c3);
                    z15 = z8;
                    c2460x4 = c2460x1022;
                    c0622o03 = c0622o03;
                    c3788c = c3788c3;
                    c2459w2 = c2459w;
                    c2447k3 = c2447k522;
                    interfaceC2453q2 = interfaceC2453q6;
                    c2395p3.m3877j0(c0010c0);
                    m325a = AbstractC0149e.m325a(AbstractC0167a.m383b(AbstractC0167a.m382a(c0373q), (InterfaceC3279c) c0010c0), z15, c3081j);
                    InterfaceC2425y0 m3953A22 = AbstractC2418w.m3953A(Boolean.valueOf((z15 || z9) ? false : z14), c2395p3);
                    boolean m3870g322 = c2395p3.m3870g(m3953A22) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x4) | c2395p3.m3874i(c0622o03);
                    if (i15 > 32) {
                    }
                    interfaceC3810r2 = m325a;
                    if ((i17 & 48) != 32) {
                    }
                    z16 = true;
                    z17 = z16 | m3870g322;
                    Object m3847O15222 = c2395p3.m3847O();
                    if (z17) {
                    }
                    C2460x c2460x11222 = c2460x4;
                    c3081j2 = c3081j;
                    interfaceC3810r3 = interfaceC3810r2;
                    c0073s = new C0073s(c0043k13, m3953A22, c2460x11222, c0622o03, c2447k3, null, 0);
                    interfaceC2425y0 = m3953A22;
                    c2460x4 = c2460x11222;
                    c2395p3.m3877j0(c0073s);
                    AbstractC2418w.m3965g(C1694m.f10482a, c2395p3, (InterfaceC3281e) c0073s);
                    m3874i2 = c2395p3.m3874i(c0043k13);
                    Object m3847O16222 = c2395p3.m3847O();
                    Object obj7222 = m3847O16222;
                    if (!m3874i2) {
                    }
                    C0006b0 c0006b0222 = new C0006b0(c0043k13, 1);
                    c2395p3.m3877j0(c0006b0222);
                    obj7222 = c0006b0222;
                    c2460x5 = c2460x4;
                    C0062p0 c0062p0222 = new C0062p0((InterfaceC3279c) obj7222, null, 6);
                    c3807o = C3807o.f17991a;
                    mo5829e = c3807o.mo5829e(new SuspendPointerInputElement(8675309, null, new C2845b0(c0062p0222), 6));
                    i19 = i18;
                    m3874i3 = c2395p3.m3874i(c0043k13) | (i16 == 16384) | (i19 == 2048) | c2395p3.m3874i(interfaceC2453q2) | c2395p3.m3874i(c0622o03);
                    Object m3847O17222 = c2395p3.m3847O();
                    if (m3874i3) {
                    }
                    i20 = i19;
                    interfaceC2453q3 = interfaceC2453q2;
                    c2460x6 = c2460x5;
                    c3807o2 = c3807o;
                    C0622o0 c0622o04222 = c0622o03;
                    boolean z20222 = z15;
                    interfaceC3810r4 = mo5829e;
                    c0018e0 = new C0018e0(c0043k13, c0373q, z9, z20222, c0622o04222, interfaceC2453q3);
                    c0622o03 = c0622o04222;
                    c2395p3.m3877j0(c0018e0);
                    if (z8) {
                    }
                    C0019e1 c0019e1222 = c0622o03.f2064u;
                    C0618m0 c0618m0222 = c0622o03.f2063t;
                    InterfaceC3810r mo5829e2222 = m5821a.mo5829e(new SuspendPointerInputElement(c0019e1222, c0618m0222, new C2845b0(new C0070r0(c0019e1222, c0618m0222, (InterfaceC2313c) null)), 4)).mo5829e(new Object());
                    m3874i4 = c2395p3.m3874i(c0043k13) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                    Object m3847O18222 = c2395p3.m3847O();
                    Object obj8222 = m3847O18222;
                    if (!m3874i4) {
                    }
                    C0037j c0037j222 = new C0037j(c0043k13, c2459w2, interfaceC2453q3, 1);
                    c2395p3.m3877j0(c0037j222);
                    obj8222 = c0037j222;
                    InterfaceC3810r m378a222 = AbstractC0166a.m378a(c3807o2, (InterfaceC3279c) obj8222);
                    interfaceC3687i22 = interfaceC3687i2;
                    m3874i5 = c2395p3.m3874i(c0043k13) | (i20 == 2048) | c2395p3.m3870g(interfaceC3687i22) | c2395p3.m3874i(c0622o03) | (i28 == 4) | c2395p3.m3874i(interfaceC2453q3);
                    m3847O5 = c2395p3.m3847O();
                    if (m3874i5) {
                    }
                    C0014d0 c0014d0222 = new C0014d0(c0043k13, z8, interfaceC3687i22, c0622o03, c2459w2, interfaceC2453q3);
                    interfaceC3687i23 = interfaceC3687i22;
                    c2395p3.m3877j0(c0014d0222);
                    m3847O5 = c0014d0222;
                    InterfaceC3810r m394d322 = AbstractC0172a.m394d(c3807o2, (InterfaceC3279c) m3847O5);
                    C2439d0 c2439d04222 = c2439d02;
                    m3874i6 = c2395p3.m3874i(c2439d04222) | (i28 == 4) | (i20 == 2048) | c2395p3.m3872h(false) | (i16 == 16384) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(interfaceC2453q3) | c2395p3.m3874i(c0622o03) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                    Object m3847O19222 = c2395p3.m3847O();
                    if (m3874i6) {
                    }
                    c0622o0 = c0622o03;
                    InterfaceC2453q interfaceC2453q7222 = interfaceC2453q3;
                    i21 = i28;
                    C0043k1 c0043k15222 = c0043k13;
                    c0038j0 = new C0038j0(c2439d04222, c2459w, z8, z9, c2447k, c0043k15222, interfaceC2453q7222, c0622o0, c0373q);
                    c2459w3 = c2459w;
                    c0043k13 = c0043k15222;
                    interfaceC2453q3 = interfaceC2453q7222;
                    c2395p3.m3877j0(c0038j0);
                    InterfaceC3810r m1037a222 = AbstractC0479l.m1037a(c3807o2, true, (InterfaceC3279c) c0038j0);
                    if (z8) {
                    }
                    float f7222 = AbstractC0086v1.f399a;
                    if (z21) {
                    }
                    m3874i7 = c2395p3.m3874i(c0622o0);
                    Object m3847O20222 = c2395p3.m3847O();
                    Object obj9222 = m3847O20222;
                    if (!m3874i7) {
                    }
                    C0081u c0081u222 = new C0081u(c0622o0, 0);
                    c2395p3.m3877j0(c0081u222);
                    obj9222 = c0081u222;
                    AbstractC2418w.m3962d(c0622o0, (InterfaceC3279c) obj9222, c2395p3);
                    C2460x c2460x12222 = c2460x6;
                    m3874i8 = c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x12222) | (i21 == 4) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                    m3847O6 = c2395p3.m3847O();
                    if (m3874i8) {
                    }
                    C0087w c0087w222 = new C0087w(c0043k13, c2460x12222, c2459w3, c2447k, 0);
                    c2447k4 = c2447k;
                    c2395p3.m3877j0(c0087w222);
                    m3847O6 = c0087w222;
                    AbstractC2418w.m3962d(c2447k4, (InterfaceC3279c) m3847O6, c2395p3);
                    C0622o0 c0622o05222 = c0622o0;
                    InterfaceC3810r m5821a3222 = AbstractC3793a.m5821a(c3807o2, new C0004a2(c0043k13, c0622o05222, c2459w, z19, i7 == 1, interfaceC2453q3, c0072r2, c0043k13.f230t, c2447k4.f13703e));
                    boolean booleanValue222 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    C0335e c0335e3222 = c0335e;
                    m3874i9 = c2395p3.m3874i(c0043k13) | ((i15 <= 32 && c2395p3.m3870g(c2447k4)) || (i17 & 48) == 32) | c2395p3.m3874i(c0335e3222);
                    m3847O7 = c2395p3.m3847O();
                    if (!m3874i9) {
                    }
                    C0042k0 c0042k0222 = new C0042k0(c0043k13, c0373q, c2447k4, c0335e3222, 0);
                    c2395p3.m3877j0(c0042k0222);
                    m3847O7 = c0042k0222;
                    InterfaceC3810r mo5829e3222 = AbstractC0169a.m388b(AbstractC0169a.m388b(AbstractC0164a.m375a(interfaceC3810r, c0335e3222, c0043k13, c0622o05222).mo5829e(AbstractC0163a.m374a((InterfaceC3277a) m3847O7, booleanValue222)).mo5829e(interfaceC3810r3), new C0078t0(interfaceC0366j3, c0043k13, false, 1)), new C0078t0(false ? 1 : 0, c0043k13, c0622o05222)).mo5829e(m5821a3222);
                    InterfaceC2453q interfaceC2453q8222 = interfaceC2453q3;
                    C0048l2 c0048l24222 = c0048l22;
                    InterfaceC3810r m394d2222 = AbstractC0172a.m394d(AbstractC3793a.m5821a(mo5829e3222, new C0040j2(c0048l24222, z8, c3081j)).mo5829e(mo5829e2222).mo5829e(m1037a222), new C0006b0(c0043k13, (int) (false ? 1 : 0)));
                    if (z8) {
                    }
                    C2395p c2395p4222 = c2395p;
                    m58d(m394d2222, c0622o05222, AbstractC3178i.m4873d(-374338080, new C0002a0(c3173d, c0043k13, c1604o0, i8, i7, c0048l24222, c2459w, c0625q, m5821a2, m378a222, m394d322, (z22 || !AbstractC2786x0.m4428a()) ? c3807o2 : AbstractC3793a.m5821a(c3807o2, new C0060o2(2, c0622o05222)), c3788c, c0622o05222, z22, z9, interfaceC3279c2, interfaceC2453q8222, interfaceC3093c3), c2395p4222), c2395p4222, 384);
                    c2395p2 = c2395p4222;
                }
                z12 = false;
                if (c1602n03 != null) {
                }
                if (z11) {
                }
                C2444h c2444h22 = (C2444h) c0068q22.f344f;
                c2444h22.f13695d = -1;
                c2444h22.f13696e = -1;
                m4026a = C2459w.m4026a(c2459w, null, 0L, 3);
                C2459w c2459w42 = (C2459w) c0068q22.f345g;
                c0068q22.f345g = m4026a;
                if (c2437c0 != null) {
                }
                m3847O = c2395p3.m3847O();
                c2413u02 = c2413u0;
                if (m3847O == c2413u02) {
                }
                c0072r2 = (C0072r2) m3847O;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!c0072r2.f360e) {
                }
                c0072r2.f359d = Long.valueOf(currentTimeMillis2);
                c0072r2.m166a(c2459w);
                m3847O2 = c2395p3.m3847O();
                Object obj52 = m3847O2;
                if (m3847O2 == c2413u02) {
                }
                C0622o0 c0622o032 = (C0622o0) obj52;
                InterfaceC2453q interfaceC2453q62 = interfaceC2453q;
                c0622o032.f2045b = interfaceC2453q62;
                c0622o032.f2046c = c0043k14.f230t;
                c0622o032.f2047d = c0043k14;
                c0622o032.f2048e.setValue(c2459w);
                c0622o032.f2049f = (InterfaceC3658b1) c2395p3.m3878k(AbstractC3674f1.f17514e);
                c0622o032.f2050g = (InterfaceC3667d2) c2395p3.m3878k(AbstractC3674f1.f17526q);
                c0622o032.f2051h = (InterfaceC2430a) c2395p3.m3878k(AbstractC3674f1.f17521l);
                c0622o032.f2052i = c0373q3;
                boolean z192 = !z9;
                c0622o032.f2053j.setValue(Boolean.valueOf(z192));
                c0622o032.f2054k.setValue(Boolean.valueOf(z8));
                m3847O3 = c2395p3.m3847O();
                if (m3847O3 == c2413u02) {
                }
                InterfaceC0516a0 interfaceC0516a02 = ((C2427z) m3847O3).f13636e;
                m3847O4 = c2395p3.m3847O();
                Object obj62 = m3847O4;
                if (m3847O4 == c2413u02) {
                }
                C3788c c3788c32 = (C3788c) obj62;
                int i262 = i23 & 7168;
                int i272 = i23 & 57344;
                C2460x c2460x92 = c2460x2;
                InterfaceC0366j interfaceC0366j32 = interfaceC0366j;
                int i282 = i14;
                boolean m3874i102 = (i262 != 2048) | c2395p3.m3874i(c0043k14) | (i272 != 16384) | c2395p3.m3874i(c2460x92) | (i282 != 4);
                i15 = (i23 & 112) ^ 48;
                if (i15 <= 32) {
                }
                c2460x3 = c2460x92;
                c0043k12 = c0043k14;
                if ((i23 & 48) != 32) {
                }
                z13 = true;
                m3874i = m3874i102 | z13 | c2395p3.m3874i(interfaceC2453q62) | c2395p3.m3874i(interfaceC0516a02) | c2395p3.m3874i(c3788c32) | c2395p3.m3874i(c0622o032);
                Object m3847O14222 = c2395p3.m3847O();
                if (m3874i) {
                }
                C2447k c2447k5222 = c2447k2;
                i16 = i272;
                c0373q = c0373q3;
                i17 = i23;
                i18 = i262;
                c0043k13 = c0043k12;
                z14 = true;
                C2460x c2460x10222 = c2460x3;
                c0010c0 = new C0010c0(c0043k13, z8, z9, c2460x10222, c2459w, c2447k5222, interfaceC2453q62, c0622o032, interfaceC0516a02, c3788c32);
                z15 = z8;
                c2460x4 = c2460x10222;
                c0622o032 = c0622o032;
                c3788c = c3788c32;
                c2459w2 = c2459w;
                c2447k3 = c2447k5222;
                interfaceC2453q2 = interfaceC2453q62;
                c2395p3.m3877j0(c0010c0);
                m325a = AbstractC0149e.m325a(AbstractC0167a.m383b(AbstractC0167a.m382a(c0373q), (InterfaceC3279c) c0010c0), z15, c3081j);
                InterfaceC2425y0 m3953A222 = AbstractC2418w.m3953A(Boolean.valueOf((z15 || z9) ? false : z14), c2395p3);
                boolean m3870g3222 = c2395p3.m3870g(m3953A222) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x4) | c2395p3.m3874i(c0622o032);
                if (i15 > 32) {
                }
                interfaceC3810r2 = m325a;
                if ((i17 & 48) != 32) {
                }
                z16 = true;
                z17 = z16 | m3870g3222;
                Object m3847O152222 = c2395p3.m3847O();
                if (z17) {
                }
                C2460x c2460x112222 = c2460x4;
                c3081j2 = c3081j;
                interfaceC3810r3 = interfaceC3810r2;
                c0073s = new C0073s(c0043k13, m3953A222, c2460x112222, c0622o032, c2447k3, null, 0);
                interfaceC2425y0 = m3953A222;
                c2460x4 = c2460x112222;
                c2395p3.m3877j0(c0073s);
                AbstractC2418w.m3965g(C1694m.f10482a, c2395p3, (InterfaceC3281e) c0073s);
                m3874i2 = c2395p3.m3874i(c0043k13);
                Object m3847O162222 = c2395p3.m3847O();
                Object obj72222 = m3847O162222;
                if (!m3874i2) {
                }
                C0006b0 c0006b02222 = new C0006b0(c0043k13, 1);
                c2395p3.m3877j0(c0006b02222);
                obj72222 = c0006b02222;
                c2460x5 = c2460x4;
                C0062p0 c0062p02222 = new C0062p0((InterfaceC3279c) obj72222, null, 6);
                c3807o = C3807o.f17991a;
                mo5829e = c3807o.mo5829e(new SuspendPointerInputElement(8675309, null, new C2845b0(c0062p02222), 6));
                i19 = i18;
                m3874i3 = c2395p3.m3874i(c0043k13) | (i16 == 16384) | (i19 == 2048) | c2395p3.m3874i(interfaceC2453q2) | c2395p3.m3874i(c0622o032);
                Object m3847O172222 = c2395p3.m3847O();
                if (m3874i3) {
                }
                i20 = i19;
                interfaceC2453q3 = interfaceC2453q2;
                c2460x6 = c2460x5;
                c3807o2 = c3807o;
                C0622o0 c0622o042222 = c0622o032;
                boolean z202222 = z15;
                interfaceC3810r4 = mo5829e;
                c0018e0 = new C0018e0(c0043k13, c0373q, z9, z202222, c0622o042222, interfaceC2453q3);
                c0622o032 = c0622o042222;
                c2395p3.m3877j0(c0018e0);
                if (z8) {
                }
                C0019e1 c0019e12222 = c0622o032.f2064u;
                C0618m0 c0618m02222 = c0622o032.f2063t;
                InterfaceC3810r mo5829e22222 = m5821a.mo5829e(new SuspendPointerInputElement(c0019e12222, c0618m02222, new C2845b0(new C0070r0(c0019e12222, c0618m02222, (InterfaceC2313c) null)), 4)).mo5829e(new Object());
                m3874i4 = c2395p3.m3874i(c0043k13) | (i282 == 4) | c2395p3.m3874i(interfaceC2453q3);
                Object m3847O182222 = c2395p3.m3847O();
                Object obj82222 = m3847O182222;
                if (!m3874i4) {
                }
                C0037j c0037j2222 = new C0037j(c0043k13, c2459w2, interfaceC2453q3, 1);
                c2395p3.m3877j0(c0037j2222);
                obj82222 = c0037j2222;
                InterfaceC3810r m378a2222 = AbstractC0166a.m378a(c3807o2, (InterfaceC3279c) obj82222);
                interfaceC3687i22 = interfaceC3687i2;
                m3874i5 = c2395p3.m3874i(c0043k13) | (i20 == 2048) | c2395p3.m3870g(interfaceC3687i22) | c2395p3.m3874i(c0622o032) | (i282 == 4) | c2395p3.m3874i(interfaceC2453q3);
                m3847O5 = c2395p3.m3847O();
                if (m3874i5) {
                }
                C0014d0 c0014d02222 = new C0014d0(c0043k13, z8, interfaceC3687i22, c0622o032, c2459w2, interfaceC2453q3);
                interfaceC3687i23 = interfaceC3687i22;
                c2395p3.m3877j0(c0014d02222);
                m3847O5 = c0014d02222;
                InterfaceC3810r m394d3222 = AbstractC0172a.m394d(c3807o2, (InterfaceC3279c) m3847O5);
                C2439d0 c2439d042222 = c2439d02;
                m3874i6 = c2395p3.m3874i(c2439d042222) | (i282 == 4) | (i20 == 2048) | c2395p3.m3872h(false) | (i16 == 16384) | c2395p3.m3874i(c0043k13) | c2395p3.m3874i(interfaceC2453q3) | c2395p3.m3874i(c0622o032) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                Object m3847O192222 = c2395p3.m3847O();
                if (m3874i6) {
                }
                c0622o0 = c0622o032;
                InterfaceC2453q interfaceC2453q72222 = interfaceC2453q3;
                i21 = i282;
                C0043k1 c0043k152222 = c0043k13;
                c0038j0 = new C0038j0(c2439d042222, c2459w, z8, z9, c2447k, c0043k152222, interfaceC2453q72222, c0622o0, c0373q);
                c2459w3 = c2459w;
                c0043k13 = c0043k152222;
                interfaceC2453q3 = interfaceC2453q72222;
                c2395p3.m3877j0(c0038j0);
                InterfaceC3810r m1037a2222 = AbstractC0479l.m1037a(c3807o2, true, (InterfaceC3279c) c0038j0);
                if (z8) {
                }
                float f72222 = AbstractC0086v1.f399a;
                if (z21) {
                }
                m3874i7 = c2395p3.m3874i(c0622o0);
                Object m3847O202222 = c2395p3.m3847O();
                Object obj92222 = m3847O202222;
                if (!m3874i7) {
                }
                C0081u c0081u2222 = new C0081u(c0622o0, 0);
                c2395p3.m3877j0(c0081u2222);
                obj92222 = c0081u2222;
                AbstractC2418w.m3962d(c0622o0, (InterfaceC3279c) obj92222, c2395p3);
                C2460x c2460x122222 = c2460x6;
                m3874i8 = c2395p3.m3874i(c0043k13) | c2395p3.m3874i(c2460x122222) | (i21 == 4) | ((i15 <= 32 && c2395p3.m3870g(c2447k)) || (i17 & 48) == 32);
                m3847O6 = c2395p3.m3847O();
                if (m3874i8) {
                }
                C0087w c0087w2222 = new C0087w(c0043k13, c2460x122222, c2459w3, c2447k, 0);
                c2447k4 = c2447k;
                c2395p3.m3877j0(c0087w2222);
                m3847O6 = c0087w2222;
                AbstractC2418w.m3962d(c2447k4, (InterfaceC3279c) m3847O6, c2395p3);
                C0622o0 c0622o052222 = c0622o0;
                InterfaceC3810r m5821a32222 = AbstractC3793a.m5821a(c3807o2, new C0004a2(c0043k13, c0622o052222, c2459w, z192, i7 == 1, interfaceC2453q3, c0072r2, c0043k13.f230t, c2447k4.f13703e));
                boolean booleanValue2222 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                C0335e c0335e32222 = c0335e;
                m3874i9 = c2395p3.m3874i(c0043k13) | ((i15 <= 32 && c2395p3.m3870g(c2447k4)) || (i17 & 48) == 32) | c2395p3.m3874i(c0335e32222);
                m3847O7 = c2395p3.m3847O();
                if (!m3874i9) {
                }
                C0042k0 c0042k02222 = new C0042k0(c0043k13, c0373q, c2447k4, c0335e32222, 0);
                c2395p3.m3877j0(c0042k02222);
                m3847O7 = c0042k02222;
                InterfaceC3810r mo5829e32222 = AbstractC0169a.m388b(AbstractC0169a.m388b(AbstractC0164a.m375a(interfaceC3810r, c0335e32222, c0043k13, c0622o052222).mo5829e(AbstractC0163a.m374a((InterfaceC3277a) m3847O7, booleanValue2222)).mo5829e(interfaceC3810r3), new C0078t0(interfaceC0366j32, c0043k13, false, 1)), new C0078t0(false ? 1 : 0, c0043k13, c0622o052222)).mo5829e(m5821a32222);
                InterfaceC2453q interfaceC2453q82222 = interfaceC2453q3;
                C0048l2 c0048l242222 = c0048l22;
                InterfaceC3810r m394d22222 = AbstractC0172a.m394d(AbstractC3793a.m5821a(mo5829e32222, new C0040j2(c0048l242222, z8, c3081j)).mo5829e(mo5829e22222).mo5829e(m1037a2222), new C0006b0(c0043k13, (int) (false ? 1 : 0)));
                if (z8) {
                }
                C2395p c2395p42222 = c2395p;
                m58d(m394d22222, c0622o052222, AbstractC3178i.m4873d(-374338080, new C0002a0(c3173d, c0043k13, c1604o0, i8, i7, c0048l242222, c2459w, c0625q, m5821a2, m378a2222, m394d3222, (z22 || !AbstractC2786x0.m4428a()) ? c3807o2 : AbstractC3793a.m5821a(c3807o2, new C0060o2(2, c0622o052222)), c3788c, c0622o052222, z22, z9, interfaceC3279c2, interfaceC2453q82222, interfaceC3093c3), c2395p42222), c2395p42222, 384);
                c2395p2 = c2395p42222;
            } else {
                throw new IllegalStateException("no recompose scope found");
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0041k(c2459w, interfaceC3279c, interfaceC3810r, c1604o0, c0625q, interfaceC3279c2, c3081j, abstractC0670o, z7, i7, i8, c2447k, c0035i1, z8, z9, c3173d, i9, i10);
        }
    }

    /* renamed from: d */
    public static final void m58d(InterfaceC3810r interfaceC3810r, C0622o0 c0622o0, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        c2395p.m3859a0(-20551815);
        if (c2395p.m3870g(interfaceC3810r)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i8 | i7;
        if (c2395p.m3874i(c0622o0)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i11 = i10 | i9;
        if ((i11 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, true);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            m56b(c0622o0, c3173d, c2395p, (i11 >> 3) & 126);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0046l0(interfaceC3810r, c0622o0, c3173d, i7, 0);
        }
    }

    /* renamed from: e */
    public static final void m59e(C0622o0 c0622o0, C2395p c2395p, int i7) {
        int i8;
        C1587g c1587g;
        C0064p2 c0064p2;
        InterfaceC3810r mo5829e;
        c2395p.m3859a0(-1436003720);
        if (c2395p.m3874i(c0622o0)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = 0;
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C0043k1 c0043k1 = c0622o0.f2047d;
            if (c0043k1 != null) {
                int i10 = 1;
                if (((Boolean) c0043k1.f225o.getValue()).booleanValue()) {
                    C0043k1 c0043k12 = c0622o0.f2047d;
                    InterfaceC2313c interfaceC2313c = null;
                    if (c0043k12 != null) {
                        c1587g = c0043k12.f211a.f332a;
                    } else {
                        c1587g = null;
                    }
                    if (c1587g != null && c1587g.f10239f.length() > 0) {
                        c2395p.m3857Z(-285446808);
                        boolean m3870g = c2395p.m3870g(c0622o0);
                        Object m3847O = c2395p.m3847O();
                        C2413u0 c2413u0 = C2375k.f13421a;
                        if (m3870g || m3847O == c2413u0) {
                            m3847O = new C0618m0(c0622o0, i9);
                            c2395p.m3877j0(m3847O);
                        }
                        InterfaceC0071r1 interfaceC0071r1 = (InterfaceC0071r1) m3847O;
                        InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
                        InterfaceC2453q interfaceC2453q = c0622o0.f2045b;
                        long j6 = c0622o0.m1287j().f13724b;
                        int i11 = C1602n0.f10303c;
                        int mo168b = interfaceC2453q.mo168b((int) (j6 >> 32));
                        C0043k1 c0043k13 = c0622o0.f2047d;
                        if (c0043k13 != null) {
                            c0064p2 = c0043k13.m120d();
                        } else {
                            c0064p2 = null;
                        }
                        AbstractC3367j.m5097b(c0064p2);
                        C1598l0 c1598l0 = c0064p2.f322a;
                        C0465c m2576c = c1598l0.m2576c(AbstractC2168e.m3530q(mo168b, 0, c1598l0.f10288a.f10276a.f10239f.length()));
                        long m5797a = AbstractC3784a.m5797a((interfaceC3093c.mo4526y(AbstractC0086v1.f399a) / 2) + m2576c.f1625a, m2576c.f1628d);
                        boolean m3868f = c2395p.m3868f(m5797a);
                        Object m3847O2 = c2395p.m3847O();
                        if (m3868f || m3847O2 == c2413u0) {
                            m3847O2 = new C0054n0(m5797a);
                            c2395p.m3877j0(m3847O2);
                        }
                        InterfaceC0617m interfaceC0617m = (InterfaceC0617m) m3847O2;
                        boolean m3874i = c2395p.m3874i(interfaceC0071r1) | c2395p.m3874i(c0622o0);
                        Object m3847O3 = c2395p.m3847O();
                        if (m3874i || m3847O3 == c2413u0) {
                            m3847O3 = new C0070r0(interfaceC0071r1, c0622o0, interfaceC2313c, i9);
                            c2395p.m3877j0(m3847O3);
                        }
                        mo5829e = C3807o.f17991a.mo5829e(new SuspendPointerInputElement(interfaceC0071r1, null, new C2845b0((InterfaceC3281e) m3847O3), 6));
                        boolean m3868f2 = c2395p.m3868f(m5797a);
                        Object m3847O4 = c2395p.m3847O();
                        if (m3868f2 || m3847O4 == c2413u0) {
                            m3847O4 = new C0017e(i10, m5797a);
                            c2395p.m3877j0(m3847O4);
                        }
                        AbstractC0025g.m53a(interfaceC0617m, AbstractC0479l.m1037a(mo5829e, false, (InterfaceC3279c) m3847O4), 0L, c2395p, 0);
                        c2395p.m3888r(false);
                    }
                }
            }
            c2395p.m3857Z(-284257090);
            c2395p.m3888r(false);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, i9, c0622o0);
        }
    }

    /* renamed from: f */
    public static final void m60f(C0622o0 c0622o0, boolean z7, C2395p c2395p, int i7) {
        int i8;
        C0064p2 m120d;
        boolean z8;
        int i9;
        int i10;
        c2395p.m3859a0(626339208);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c0622o0)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else if (z7) {
            c2395p.m3857Z(-1286242594);
            C0043k1 c0043k1 = c0622o0.f2047d;
            C1598l0 c1598l0 = null;
            if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
                C1598l0 c1598l02 = m120d.f322a;
                C0043k1 c0043k12 = c0622o0.f2047d;
                if (c0043k12 != null) {
                    z8 = c0043k12.f226p;
                } else {
                    z8 = true;
                }
                if (!z8) {
                    c1598l0 = c1598l02;
                }
            }
            if (c1598l0 == null) {
                c2395p.m3857Z(-1285984396);
            } else {
                c2395p.m3857Z(-1285984395);
                if (!C1602n0.m2586b(c0622o0.m1287j().f13724b)) {
                    c2395p.m3857Z(-1680616096);
                    int mo168b = c0622o0.f2045b.mo168b((int) (c0622o0.m1287j().f13724b >> 32));
                    int mo168b2 = c0622o0.f2045b.mo168b((int) (c0622o0.m1287j().f13724b & 4294967295L));
                    EnumC3036j m2574a = c1598l0.m2574a(mo168b);
                    EnumC3036j m2574a2 = c1598l0.m2574a(Math.max(mo168b2 - 1, 0));
                    C0043k1 c0043k13 = c0622o0.f2047d;
                    if (c0043k13 != null && ((Boolean) c0043k13.f223m.getValue()).booleanValue()) {
                        c2395p.m3857Z(-1680216289);
                        AbstractC1793a0.m2976d(true, m2574a, c0622o0, c2395p, ((i8 << 6) & 896) | 6);
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(-1679975078);
                        c2395p.m3888r(false);
                    }
                    C0043k1 c0043k14 = c0622o0.f2047d;
                    if (c0043k14 != null && ((Boolean) c0043k14.f224n.getValue()).booleanValue()) {
                        c2395p.m3857Z(-1679895904);
                        AbstractC1793a0.m2976d(false, m2574a2, c0622o0, c2395p, ((i8 << 6) & 896) | 6);
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(-1679655654);
                        c2395p.m3888r(false);
                    }
                    c2395p.m3888r(false);
                } else {
                    c2395p.m3857Z(-1679637798);
                    c2395p.m3888r(false);
                }
                C0043k1 c0043k15 = c0622o0.f2047d;
                if (c0043k15 != null) {
                    C2361g1 c2361g1 = c0043k15.f222l;
                    if (!AbstractC3367j.m5096a(c0622o0.f2061r.f13723a.f10239f, c0622o0.m1287j().f13723a.f10239f)) {
                        c2361g1.setValue(Boolean.FALSE);
                    }
                    if (c0043k15.m118b()) {
                        if (((Boolean) c2361g1.getValue()).booleanValue()) {
                            c0622o0.m1292o();
                        } else {
                            c0622o0.m1288k();
                        }
                    }
                }
            }
            c2395p.m3888r(false);
            c2395p.m3888r(false);
        } else {
            c2395p.m3857Z(651305535);
            c2395p.m3888r(false);
            c0622o0.m1288k();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0050m0(c0622o0, z7, i7);
        }
    }

    /* renamed from: g */
    public static final void m61g(C0043k1 c0043k1) {
        C2437c0 c2437c0 = c0043k1.f215e;
        if (c2437c0 != null) {
            c0043k1.f230t.mo23f(C2459w.m4026a((C2459w) c0043k1.f214d.f345g, null, 0L, 3));
            C2460x c2460x = c2437c0.f13683a;
            AtomicReference atomicReference = c2460x.f13727b;
            while (true) {
                if (atomicReference.compareAndSet(c2437c0, null)) {
                    c2460x.f13726a.mo688g();
                    break;
                } else if (atomicReference.get() != c2437c0) {
                    break;
                }
            }
        }
        c0043k1.f215e = null;
    }

    /* renamed from: h */
    public static final C0465c m62h(InterfaceC3093c interfaceC3093c, int i7, C2439d0 c2439d0, C1598l0 c1598l0, boolean z7, int i8) {
        C0465c c0465c;
        float f7;
        float f8;
        if (c1598l0 != null) {
            c0465c = c1598l0.m2576c(c2439d0.f13686b.mo168b(i7));
        } else {
            c0465c = C0465c.f1624e;
        }
        float f9 = c0465c.f1625a;
        int mo4513Q = interfaceC3093c.mo4513Q(AbstractC0086v1.f399a);
        if (z7) {
            f7 = (i8 - f9) - mo4513Q;
        } else {
            f7 = f9;
        }
        if (z7) {
            f8 = i8 - f9;
        } else {
            f8 = mo4513Q + f9;
        }
        return new C0465c(f7, c0465c.f1626b, f8, c0465c.f1628d);
    }

    /* renamed from: i */
    public static final boolean m63i(int i7, KeyEvent keyEvent) {
        if (((int) (AbstractC2710c.m4345s(keyEvent) >> 32)) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u5.v] */
    /* renamed from: j */
    public static final void m64j(C2460x c2460x, C0043k1 c0043k1, C2459w c2459w, C2447k c2447k, InterfaceC2453q interfaceC2453q) {
        C0068q2 c0068q2 = c0043k1.f214d;
        C0006b0 c0006b0 = c0043k1.f230t;
        C0006b0 c0006b02 = c0043k1.f231u;
        ?? obj = new Object();
        C0037j c0037j = new C0037j(2, c0068q2, (Object) obj, c0006b0);
        InterfaceC2454r interfaceC2454r = c2460x.f13726a;
        interfaceC2454r.mo689h(c2459w, c2447k, c0037j, c0006b02);
        C2437c0 c2437c0 = new C2437c0(c2460x, interfaceC2454r);
        c2460x.f13727b.set(c2437c0);
        obj.f16451e = c2437c0;
        c0043k1.f215e = c2437c0;
        m71q(c0043k1, c2459w, interfaceC2453q);
    }

    /* renamed from: k */
    public static final int m65k(float f7) {
        return Math.round((float) Math.ceil(f7));
    }

    /* renamed from: l */
    public static final C2439d0 m66l(C0625q c0625q, C1587g c1587g) {
        c0625q.getClass();
        int length = c1587g.f10239f.length();
        int length2 = c1587g.f10239f.length();
        int min = Math.min(length, 100);
        for (int i7 = 0; i7 < min; i7++) {
            m74t(i7, length2, i7);
        }
        m74t(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i8 = 0; i8 < min2; i8++) {
            m75u(i8, length, i8);
        }
        m75u(length2, length, length2);
        return new C2439d0(c1587g, new C0076s2(c1587g.f10239f.length(), c1587g.f10239f.length(), 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.m4084c() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m67m(String str, int i7) {
        C2560j c2560j;
        String str2;
        int i8;
        boolean z7 = true;
        Integer num = null;
        if (C2560j.m4082d()) {
            c2560j = C2560j.m4081a();
        }
        c2560j = null;
        if (c2560j != null) {
            if (c2560j.m4084c() != 1) {
                z7 = false;
            }
            if (z7) {
                AbstractC3393k.m5139j(str, "charSequence cannot be null");
                C0031h1 c0031h1 = c2560j.f13932e.f13922b;
                c0031h1.getClass();
                if (i7 < 0 || i7 >= str.length()) {
                    str2 = str;
                    i8 = -1;
                } else {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        C2574x[] c2574xArr = (C2574x[]) spanned.getSpans(i7, i7 + 1, C2574x.class);
                        if (c2574xArr.length > 0) {
                            i8 = spanned.getSpanEnd(c2574xArr[0]);
                            str2 = str;
                        }
                    }
                    str2 = str;
                    i8 = ((C2567q) c0031h1.m79C(str2, Math.max(0, i7 - 16), Math.min(str.length(), i7 + 16), Integer.MAX_VALUE, true, new C2567q(i7))).f13945g;
                }
                Integer valueOf = Integer.valueOf(i8);
                if (i8 != -1) {
                    num = valueOf;
                }
            } else {
                throw new IllegalStateException("Not initialized yet");
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i7);
    }

    /* renamed from: n */
    public static final int m68n(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        while (i7 < length) {
            if (charSequence.charAt(i7) == '\n') {
                return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    /* renamed from: o */
    public static final int m69o(CharSequence charSequence, int i7) {
        while (i7 > 0) {
            if (charSequence.charAt(i7 - 1) == '\n') {
                return i7;
            }
            i7--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.m4084c() == 1) goto L8;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m70p(String str, int i7) {
        C2560j c2560j;
        Integer num = null;
        if (C2560j.m4082d()) {
            c2560j = C2560j.m4081a();
        }
        c2560j = null;
        if (c2560j != null) {
            int m4083b = c2560j.m4083b(str, Math.max(0, i7 - 1));
            Integer valueOf = Integer.valueOf(m4083b);
            if (m4083b != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i7);
    }

    /* renamed from: q */
    public static final void m71q(C0043k1 c0043k1, C2459w c2459w, InterfaceC2453q interfaceC2453q) {
        InterfaceC3279c interfaceC3279c;
        AbstractC3459f m5263d = AbstractC3470q.m5263d();
        if (m5263d != null) {
            interfaceC3279c = m5263d.mo5207e();
        } else {
            interfaceC3279c = null;
        }
        InterfaceC3279c interfaceC3279c2 = interfaceC3279c;
        AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
        try {
            C0064p2 m120d = c0043k1.m120d();
            if (m120d == null) {
                return;
            }
            C2437c0 c2437c0 = c0043k1.f215e;
            if (c2437c0 == null) {
                return;
            }
            InterfaceC3238v m119c = c0043k1.m119c();
            if (m119c == null) {
                return;
            }
            m72r(c2459w, c0043k1.f211a, m120d.f322a, m119c, c2437c0, c0043k1.m118b(), interfaceC2453q);
        } finally {
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c2);
        }
    }

    /* renamed from: r */
    public static void m72r(C2459w c2459w, C0067q1 c0067q1, C1598l0 c1598l0, InterfaceC3238v interfaceC3238v, C2437c0 c2437c0, boolean z7, InterfaceC2453q interfaceC2453q) {
        C0465c c0465c;
        if (z7) {
            int mo168b = interfaceC2453q.mo168b(C1602n0.m2588d(c2459w.f13724b));
            if (mo168b < c1598l0.f10288a.f10276a.f10239f.length()) {
                c0465c = c1598l0.m2575b(mo168b);
            } else if (mo168b != 0) {
                c0465c = c1598l0.m2575b(mo168b - 1);
            } else {
                c0465c = new C0465c(0.0f, 0.0f, 1.0f, (int) (AbstractC0089w1.m172b(c0067q1.f333b, c0067q1.f338g, c0067q1.f339h) & 4294967295L));
            }
            float f7 = c0465c.f1626b;
            float f8 = c0465c.f1625a;
            long mo4927U = interfaceC3238v.mo4927U(AbstractC3784a.m5797a(f8, f7));
            C0465c m3d = AbstractC0000a.m3d(AbstractC3784a.m5797a(C0464b.m1008d(mo4927U), C0464b.m1009e(mo4927U)), AbstractC1793a0.m2975c(c0465c.f1627c - f8, c0465c.f1628d - f7));
            if (AbstractC3367j.m5096a((C2437c0) c2437c0.f13683a.f13727b.get(), c2437c0)) {
                c2437c0.f13684b.mo684c(m3d);
            }
        }
    }

    /* renamed from: s */
    public static final void m73s(int i7, int i8) {
        if (i7 > 0 && i8 > 0) {
            if (i7 <= i8) {
                return;
            } else {
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "minLines ", " must be less than or equal to maxLines ").toString());
            }
        }
        throw new IllegalArgumentException(AbstractC0094y0.m183j(i7, i8, "both minLines ", " and maxLines ", " must be greater than zero").toString());
    }

    /* renamed from: t */
    public static final void m74t(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 <= i8) {
            return;
        }
        StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
        sb.append(i9);
        sb.append(" -> ");
        sb.append(i7);
        sb.append(" is not in range of transformed text [0, ");
        throw new IllegalStateException(AbstractC2487d.m4045i(sb, i8, ']').toString());
    }

    /* renamed from: u */
    public static final void m75u(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 <= i8) {
            return;
        }
        StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
        sb.append(i9);
        sb.append(" -> ");
        sb.append(i7);
        sb.append(" is not in range of original text [0, ");
        throw new IllegalStateException(AbstractC2487d.m4045i(sb, i8, ']').toString());
    }
}
