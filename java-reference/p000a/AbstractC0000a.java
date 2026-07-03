package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import com.paoman.lema.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p002a1.C0103e;
import p008b.C0236h0;
import p008b.InterfaceC0240j0;
import p010b1.C0265c;
import p017c.AbstractC0327l;
import p017c.C0317b;
import p017c.C0319d;
import p017c.C0320e;
import p017c.C0321f;
import p017c.C0325j;
import p025d.C0455b;
import p027d1.C0465c;
import p028d2.AbstractC0479l;
import p034e0.AbstractC0641z;
import p034e0.C0593a;
import p034e0.C0599d;
import p034e0.C0601e;
import p034e0.C0603f;
import p034e0.C0605g;
import p034e0.C0611j;
import p034e0.C0615l;
import p034e0.InterfaceC0617m;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0654g;
import p035e1.C0671o0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p039e5.C0762c3;
import p039e5.C0811dk;
import p039e5.C1324u4;
import p046f5.AbstractC1541f;
import p049g1.C1567a;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p051g3.C1635h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.InterfaceC1816x;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2272i;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2279p;
import p079k1.C2281r;
import p079k1.C2282s;
import p079k1.C2284u;
import p079k1.C2285v;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p096m3.C2572v;
import p100n.AbstractC2647h;
import p102n1.AbstractC2710c;
import p113o5.AbstractC2818a;
import p120p5.AbstractC2881a;
import p132r2.EnumC3036j;
import p140s2.C3094d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.AbstractC3191c1;
import p146t1.InterfaceC3238v;
import p148t3.InterfaceC3254c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p156u3.AbstractC3354a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p158u5.C3377t;
import p162v1.AbstractC3498f;
import p162v1.C3537s;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3596c;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3679g2;
import p171w2.AbstractC3760j;
import p171w2.C3775y;
import p171w2.EnumC3776z;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3799g;
import p177x0.InterfaceC3797e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* renamed from: a */
    public static C2266e f0a;

    /* renamed from: b */
    public static C2266e f1b;

    /* renamed from: c */
    public static C2266e f2c;

    /* renamed from: d */
    public static C2266e f3d;

    /* renamed from: e */
    public static C2266e f4e;

    /* renamed from: f */
    public static C2266e f5f;

    /* renamed from: g */
    public static C2266e f6g;

    /* renamed from: h */
    public static C2266e f7h;

    /* renamed from: i */
    public static C2266e f8i;

    /* renamed from: j */
    public static C2266e f9j;

    /* renamed from: k */
    public static C2266e f10k;

    /* renamed from: l */
    public static C2266e f11l;

    /* renamed from: m */
    public static C2266e f12m;

    /* renamed from: n */
    public static C2266e f13n;

    /* renamed from: o */
    public static C2266e f14o;

    /* renamed from: p */
    public static C2266e f15p;

    /* renamed from: a */
    public static final void m0a(boolean z7, final InterfaceC3277a interfaceC3277a, C2395p c2395p, final int i7, final int i8) {
        final boolean z8;
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        InterfaceC3254c interfaceC3254c;
        C2572v c2572v;
        InterfaceC0240j0 interfaceC0240j0;
        boolean z11;
        boolean z12;
        Object obj;
        Object obj2;
        int i11;
        c2395p.m3859a0(-361453782);
        int i12 = i8 & 1;
        if (i12 != 0) {
            i9 = i7 | 6;
            z8 = z7;
        } else if ((i7 & 6) == 0) {
            z8 = z7;
            if (c2395p.m3872h(z8)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i7;
        } else {
            z8 = z7;
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i9 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (c2395p.m3849R(i9 & 1, z9)) {
            if (i12 != 0) {
                z10 = true;
            } else {
                z10 = z8;
            }
            Object obj3 = (InterfaceC3254c) c2395p.m3878k(AbstractC3354a.f16416a);
            C0236h0 c0236h0 = null;
            if (obj3 == null) {
                c2395p.m3857Z(950836184);
                View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
                AbstractC3367j.m5100e(view, "<this>");
                while (true) {
                    if (view != null) {
                        Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                        if (tag instanceof InterfaceC3254c) {
                            obj2 = (InterfaceC3254c) tag;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            obj3 = obj2;
                            break;
                        }
                        Object m3335m = AbstractC2072e.m3335m(view);
                        if (m3335m instanceof View) {
                            view = (View) m3335m;
                        } else {
                            view = null;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(950834231);
                c2395p.m3888r(false);
            }
            if (obj3 == null) {
                c2395p.m3857Z(535274673);
                obj3 = (InterfaceC0240j0) c2395p.m3878k(AbstractC0327l.f1138a);
                if (obj3 == null) {
                    c2395p.m3857Z(1208426157);
                    View view2 = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
                    AbstractC3367j.m5100e(view2, "<this>");
                    while (true) {
                        if (view2 != null) {
                            Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                            if (tag2 instanceof InterfaceC0240j0) {
                                obj = (InterfaceC0240j0) tag2;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                obj3 = obj;
                                break;
                            }
                            Object m3335m2 = AbstractC2072e.m3335m(view2);
                            if (m3335m2 instanceof View) {
                                view2 = (View) m3335m2;
                            } else {
                                view2 = null;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                } else {
                    c2395p.m3857Z(1208423708);
                }
                c2395p.m3888r(false);
                if (obj3 == null) {
                    c2395p.m3857Z(1208428160);
                    Object obj4 = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
                    while (true) {
                        if (obj4 instanceof ContextWrapper) {
                            if (obj4 instanceof InterfaceC0240j0) {
                                break;
                            } else {
                                obj4 = ((ContextWrapper) obj4).getBaseContext();
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    obj3 = (InterfaceC0240j0) obj4;
                } else {
                    c2395p.m3857Z(1208423789);
                }
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(535271790);
            }
            c2395p.m3888r(false);
            if (obj3 != null) {
                boolean m3870g = c2395p.m3870g(obj3);
                Object m3847O = c2395p.m3847O();
                Object obj5 = C2375k.f13421a;
                if (m3870g || m3847O == obj5) {
                    if (obj3 instanceof InterfaceC3254c) {
                        interfaceC3254c = (InterfaceC3254c) obj3;
                    } else {
                        interfaceC3254c = null;
                    }
                    if (interfaceC3254c != null) {
                        c2572v = interfaceC3254c.mo521c();
                    } else {
                        c2572v = null;
                    }
                    if (obj3 instanceof InterfaceC0240j0) {
                        interfaceC0240j0 = (InterfaceC0240j0) obj3;
                    } else {
                        interfaceC0240j0 = null;
                    }
                    if (interfaceC0240j0 != null) {
                        c0236h0 = interfaceC0240j0.mo516a();
                    }
                    m3847O = new C0455b(c2572v, c0236h0);
                    c2395p.m3877j0(m3847O);
                }
                Object obj6 = (C0455b) m3847O;
                long j6 = c2395p.f13486T;
                boolean m3870g2 = c2395p.m3870g(obj6) | c2395p.m3868f(j6);
                Object m3847O2 = c2395p.m3847O();
                Object obj7 = m3847O2;
                if (m3870g2 || m3847O2 == obj5) {
                    C0325j c0325j = new C0325j(new C0319d(j6, obj3));
                    c0325j.f1136c = new C0317b(1);
                    c2395p.m3877j0(c0325j);
                    obj7 = c0325j;
                }
                C0325j c0325j2 = (C0325j) obj7;
                c2395p.m3857Z(-585307852);
                boolean m3874i = c2395p.m3874i(c0325j2);
                if ((i9 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = m3874i | z11;
                Object m3847O3 = c2395p.m3847O();
                if (z13 || m3847O3 == obj5) {
                    m3847O3 = new C0320e(0, c0325j2, interfaceC3277a);
                    c2395p.m3877j0(m3847O3);
                }
                AbstractC2418w.m3967i((InterfaceC3277a) m3847O3, c2395p);
                Boolean valueOf = Boolean.valueOf(z10);
                boolean m3874i2 = c2395p.m3874i(c0325j2);
                int i13 = i9 & 14;
                if (i13 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z14 = m3874i2 | z12;
                Object m3847O4 = c2395p.m3847O();
                if (z14 || m3847O4 == obj5) {
                    m3847O4 = new C0762c3(c0325j2, z10);
                    c2395p.m3877j0(m3847O4);
                }
                AbstractC2168e.m3518e(valueOf, c0325j2, null, (InterfaceC3279c) m3847O4, c2395p, i13);
                boolean m3874i3 = c2395p.m3874i(obj6) | c2395p.m3874i(c0325j2);
                Object m3847O5 = c2395p.m3847O();
                if (m3874i3 || m3847O5 == obj5) {
                    m3847O5 = new C0321f(0, obj6, c0325j2);
                    c2395p.m3877j0(m3847O5);
                }
                AbstractC2418w.m3961c(obj6, c0325j2, (InterfaceC3279c) m3847O5, c2395p);
                c2395p.m3888r(false);
                z8 = z10;
            } else {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e() { // from class: c.g
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int m3957F = AbstractC2418w.m3957F(i7 | 1);
                    AbstractC0000a.m0a(z8, interfaceC3277a, (C2395p) obj8, m3957F, i8);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: b */
    public static final void m1b(InterfaceC0617m interfaceC0617m, InterfaceC3797e interfaceC3797e, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        boolean m3874i;
        int i11;
        c2395p.m3859a0(476043083);
        if ((i7 & 6) == 0) {
            if ((i7 & 8) == 0) {
                m3874i = c2395p.m3870g(interfaceC0617m);
            } else {
                m3874i = c2395p.m3874i(interfaceC0617m);
            }
            if (m3874i) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3797e)) {
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
        if ((i8 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean z8 = true;
            if ((i8 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 14) != 4 && ((i8 & 8) == 0 || !c2395p.m3870g(interfaceC0617m))) {
                z8 = false;
            }
            boolean z9 = z7 | z8;
            Object m3847O = c2395p.m3847O();
            if (z9 || m3847O == C2375k.f13421a) {
                m3847O = new C0615l(interfaceC3797e, interfaceC0617m);
                c2395p.m3877j0(m3847O);
            }
            AbstractC3760j.m5760a((C0615l) m3847O, null, new C3775y(false, EnumC3776z.f17910e, false), c3173d, c2395p, ((i8 << 3) & 7168) | 384, 2);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(interfaceC0617m, interfaceC3797e, c3173d, i7, 0);
        }
    }

    /* renamed from: c */
    public static final void m2c(final float f7, final C3173d c3173d, C2395p c2395p, final int i7) {
        int i8;
        boolean z7;
        c2395p.m3859a0(537559447);
        if (c2395p.m3864d(f7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = i8 | i7;
        if ((i9 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC2397p1 abstractC2397p1 = AbstractC3674f1.f17517h;
            InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(abstractC2397p1);
            c2395p.m3857Z(-1873145174);
            boolean m3870g = c2395p.m3870g(interfaceC3093c);
            if ((i9 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7 | m3870g;
            Object m3847O = c2395p.m3847O();
            if (z8 || m3847O == C2375k.f13421a) {
                float m2473a = AbstractC1541f.m2473a(f7);
                Object c3094d = new C3094d(interfaceC3093c.mo559b() * m2473a, interfaceC3093c.mo560l() * m2473a);
                c2395p.m3877j0(c3094d);
                m3847O = c3094d;
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3959a(abstractC2397p1.mo3716a((InterfaceC3093c) m3847O), AbstractC3178i.m4873d(-2133715753, new C1324u4(11, c3173d), c2395p), c2395p, 56);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(f7, c3173d, i7) { // from class: f5.g

                /* renamed from: e */
                public final /* synthetic */ float f10117e;

                /* renamed from: f */
                public final /* synthetic */ C3173d f10118f;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(49);
                    AbstractC0000a.m2c(this.f10117e, this.f10118f, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: d */
    public static final C0465c m3d(long j6, long j7) {
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        return new C0465c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        if (r20 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00bd, code lost:
    
        if (r20 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00cd, code lost:
    
        if (r3 == false) goto L73;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4e(InterfaceC0617m interfaceC0617m, boolean z7, EnumC3036j enumC3036j, boolean z8, long j6, InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7) {
        int i8;
        int i9;
        long j7;
        boolean z9;
        boolean z10;
        C3799g c3799g;
        boolean z11;
        boolean z12;
        long j8;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean m3874i;
        int i14;
        InterfaceC0617m interfaceC0617m2 = interfaceC0617m;
        c2395p.m3859a0(-843755800);
        if ((i7 & 6) == 0) {
            if ((i7 & 8) == 0) {
                m3874i = c2395p.m3870g(interfaceC0617m2);
            } else {
                m3874i = c2395p.m3874i(interfaceC0617m2);
            }
            if (m3874i) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(enumC3036j)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(z8)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i8 |= i10;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            j8 = j6;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i9 = i8 & (-57345);
                j7 = j6;
            } else {
                i9 = i8 & (-57345);
                j7 = 9205357640488583168L;
            }
            c2395p.m3889s();
            EnumC3036j enumC3036j2 = EnumC3036j.f15601f;
            EnumC3036j enumC3036j3 = EnumC3036j.f15600e;
            if (z7) {
                float f7 = AbstractC0641z.f2120a;
                if (enumC3036j == enumC3036j3) {
                }
                if (enumC3036j == enumC3036j2) {
                }
                z10 = false;
            } else {
                float f8 = AbstractC0641z.f2120a;
                if ((enumC3036j == enumC3036j3 && !z8) || (enumC3036j == enumC3036j2 && z8)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (z10) {
                c3799g = AbstractC3793a.f17960b;
            } else {
                c3799g = AbstractC3793a.f17959a;
            }
            int i15 = i9 & 14;
            if (i15 != 4 && ((i9 & 8) == 0 || !c2395p.m3874i(interfaceC0617m2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if ((i9 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean m3872h = z12 | z11 | c2395p.m3872h(z10);
            Object m3847O = c2395p.m3847O();
            if (m3872h || m3847O == C2375k.f13421a) {
                m3847O = new C0603f(interfaceC0617m2, z7, z10);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3810r m1037a = AbstractC0479l.m1037a(interfaceC3810r, false, (InterfaceC3279c) m3847O);
            long j9 = j7;
            interfaceC0617m2 = interfaceC0617m;
            m1b(interfaceC0617m2, c3799g, AbstractC3178i.m4873d(280174801, new C0599d((InterfaceC3679g2) c2395p.m3878k(AbstractC3674f1.f17528s), j9, z10, m1037a, interfaceC0617m), c2395p), c2395p, i15 | 384);
            j8 = j9;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0601e(interfaceC0617m2, z7, enumC3036j, z8, j8, interfaceC3810r, i7);
        }
    }

    /* renamed from: f */
    public static final void m5f(InterfaceC3810r interfaceC3810r, InterfaceC3277a interfaceC3277a, boolean z7, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(2111672474);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if (c2395p.m3874i(interfaceC3277a)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i8 | i9;
        if (c2395p.m3872h(z7)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        if (((i12 | i10) & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC3122c.m4828a(c2395p, AbstractC3793a.m5821a(AbstractC0155c.m354m(interfaceC3810r, AbstractC0641z.f2120a, AbstractC0641z.f2121b), new C0611j(interfaceC3277a, z7)));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0605g(interfaceC3810r, interfaceC3277a, z7, i7);
        }
    }

    /* renamed from: g */
    public static final boolean m6g(C0103e c0103e, long j6) {
        if (c0103e.f17992e.f18005r) {
            C3537s c3537s = AbstractC3498f.m5382v(c0103e).f16872I.f16799c;
            if (c3537s.f17011T.f18005r) {
                long mo4927U = c3537s.mo4927U(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (mo4927U >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (mo4927U & 4294967295L));
                long j7 = c0103e.f475u;
                float f7 = ((int) (j7 >> 32)) + intBitsToFloat;
                float f8 = ((int) (j7 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f7) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f8) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public static void m7h(Throwable th, Throwable th2) {
        boolean z7;
        AbstractC3367j.m5100e(th, "<this>");
        AbstractC3367j.m5100e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC2881a.f15058a;
            if (num != null && num.intValue() < 19) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (z7) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC2818a.f14867a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L11;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0654g m8i(C0265c c0265c, float f7) {
        int ceil = ((int) Math.ceil(f7)) * 2;
        C0654g c0654g = AbstractC2710c.f14538a;
        C0644b c0644b = AbstractC2710c.f14539b;
        C1568b c1568b = AbstractC2710c.f14540c;
        if (c0654g != null) {
            Bitmap bitmap = c0654g.f2144a;
            if (c0644b != null) {
                if (ceil <= bitmap.getWidth()) {
                }
            }
        }
        c0654g = AbstractC0659i0.m1406f(ceil, ceil, 1);
        AbstractC2710c.f14538a = c0654g;
        c0644b = AbstractC0659i0.m1401a(c0654g);
        AbstractC2710c.f14539b = c0644b;
        C0654g c0654g2 = c0654g;
        C0644b c0644b2 = c0644b;
        Bitmap bitmap2 = c0654g2.f2144a;
        if (c1568b == null) {
            c1568b = new C1568b();
            AbstractC2710c.f14540c = c1568b;
        }
        C1568b c1568b2 = c1568b;
        C1567a c1567a = c1568b2.f10181e;
        EnumC3103m layoutDirection = c0265c.f999e.getLayoutDirection();
        long m2975c = AbstractC1793a0.m2975c(bitmap2.getWidth(), bitmap2.getHeight());
        InterfaceC3093c interfaceC3093c = c1567a.f10177a;
        EnumC3103m enumC3103m = c1567a.f10178b;
        InterfaceC0674q interfaceC0674q = c1567a.f10179c;
        long j6 = c1567a.f10180d;
        c1567a.f10177a = c0265c;
        c1567a.f10178b = layoutDirection;
        c1567a.f10179c = c0644b2;
        c1567a.f10180d = m2975c;
        c0644b2.mo1341m();
        InterfaceC1570d.m2535D(c1568b2, C0677s.f2204b, 0L, c1568b2.mo2546c(), 0.0f, 58);
        InterfaceC1570d.m2535D(c1568b2, AbstractC0659i0.m1404d(4278190080L), 0L, AbstractC1793a0.m2975c(f7, f7), 0.0f, 120);
        InterfaceC1570d.m2540R(c1568b2, AbstractC0659i0.m1404d(4278190080L), f7, AbstractC3784a.m5797a(f7, f7), null, 120);
        c0644b2.mo1338j();
        c1567a.f10177a = interfaceC3093c;
        c1567a.f10178b = enumC3103m;
        c1567a.f10179c = interfaceC0674q;
        c1567a.f10180d = j6;
        return c0654g2;
    }

    /* renamed from: j */
    public static Map m9j(InterfaceC1816x interfaceC1816x) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator mo33d = interfaceC1816x.mo33d();
        while (mo33d.hasNext()) {
            Object mo30a = interfaceC1816x.mo30a(mo33d.next());
            Object obj = linkedHashMap.get(mo30a);
            if (obj == null && !linkedHashMap.containsKey(mo30a)) {
                obj = new Object();
            }
            C3377t c3377t = (C3377t) obj;
            c3377t.f16449e++;
            linkedHashMap.put(mo30a, c3377t);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC3367j.m5098c(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof InterfaceC3594a) && !(entry instanceof InterfaceC3596c)) {
                AbstractC3382y.m5113d(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((C3377t) entry.getValue()).f16449e));
        }
        return AbstractC3382y.m5110a(linkedHashMap);
    }

    /* renamed from: k */
    public static final C2266e m10k() {
        C2266e c2266e = f4e;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Close", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(19.0f, 6.41f);
        c0811dk.m1510k(17.59f, 5.0f);
        c0811dk.m1510k(12.0f, 10.59f);
        c0811dk.m1510k(6.41f, 5.0f);
        c0811dk.m1510k(5.0f, 6.41f);
        c0811dk.m1510k(10.59f, 12.0f);
        c0811dk.m1510k(5.0f, 17.59f);
        c0811dk.m1510k(6.41f, 19.0f);
        c0811dk.m1510k(12.0f, 13.41f);
        c0811dk.m1510k(17.59f, 19.0f);
        c0811dk.m1510k(19.0f, 17.59f);
        c0811dk.m1510k(13.41f, 12.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f4e = m3673b;
        return m3673b;
    }

    /* renamed from: l */
    public static final C2266e m11l() {
        C2266e c2266e = f8i;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Info", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(12.0f, 2.0f);
        m179f.m1506g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        m179f.m1514o(4.48f, 10.0f, 10.0f, 10.0f);
        m179f.m1514o(10.0f, -4.48f, 10.0f, -10.0f);
        m179f.m1513n(17.52f, 2.0f, 12.0f, 2.0f);
        m179f.m1505f();
        m179f.m1512m(13.0f, 17.0f);
        m179f.m1509j(-2.0f);
        m179f.m1517r(-6.0f);
        m179f.m1509j(2.0f);
        m179f.m1517r(6.0f);
        m179f.m1505f();
        m179f.m1512m(13.0f, 9.0f);
        m179f.m1509j(-2.0f);
        m179f.m1510k(11.0f, 7.0f);
        m179f.m1509j(2.0f);
        m179f.m1517r(2.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f8i = m3673b;
        return m3673b;
    }

    /* renamed from: m */
    public static final C2266e m12m() {
        C2266e c2266e = f1b;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("AutoMirrored.Filled.ListAlt", true);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(19.0f, 5.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1510k(5.0f, 19.0f);
        c0811dk.m1510k(5.0f, 5.0f);
        c0811dk.m1509j(14.0f);
        C2282s c2282s = new C2282s(1.1f, -2.0f);
        ArrayList arrayList = c0811dk.f3514f;
        arrayList.add(c2282s);
        c0811dk.m1510k(3.9f, 3.0f);
        c0811dk.m1507h(-0.5f, 0.0f, -0.9f, 0.4f, -0.9f, 0.9f);
        c0811dk.m1517r(16.2f);
        c0811dk.m1507h(0.0f, 0.4f, 0.4f, 0.9f, 0.9f, 0.9f);
        c0811dk.m1509j(16.2f);
        c0811dk.m1507h(0.4f, 0.0f, 0.9f, -0.5f, 0.9f, -0.9f);
        c0811dk.m1510k(21.0f, 3.9f);
        c0811dk.m1507h(0.0f, -0.5f, -0.5f, -0.9f, -0.9f, -0.9f);
        c0811dk.m1505f();
        c0811dk.m1512m(11.0f, 7.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(-6.0f);
        c0811dk.m1510k(11.0f, 7.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(11.0f, 11.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(-6.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(11.0f, 15.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(-6.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 7.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1510k(7.0f, 9.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 11.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1510k(7.0f, 13.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 15.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1510k(7.0f, 17.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f1b = m3673b;
        return m3673b;
    }

    /* renamed from: n */
    public static final C2266e m13n() {
        C2266e c2266e = f11l;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Pause", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(6.0f, 19.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1510k(10.0f, 5.0f);
        c0811dk.m1510k(6.0f, 5.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(14.0f, 5.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1510k(18.0f, 5.0f);
        c0811dk.m1509j(-4.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f11l = m3673b;
        return m3673b;
    }

    /* renamed from: o */
    public static final C2266e m14o() {
        C2266e c2266e = f12m;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.PowerSettingsNew", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(13.0f, 3.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(10.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1510k(13.0f, 3.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(17.83f, 5.17f);
        c0811dk.m1511l(-1.42f, 1.42f);
        c0811dk.m1506g(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
        c0811dk.m1507h(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        c0811dk.m1514o(-7.0f, -3.13f, -7.0f, -7.0f);
        c0811dk.m1507h(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
        c0811dk.m1510k(6.17f, 5.17f);
        c0811dk.m1506g(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
        c0811dk.m1507h(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        c0811dk.m1514o(9.0f, -4.03f, 9.0f, -9.0f);
        c0811dk.m1507h(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f12m = m3673b;
        return m3673b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1635h m15p(Display display, int i7) {
        RoundedCorner roundedCorner;
        int position;
        int i8;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT >= 31 && roundedCorner != null) {
            position = roundedCorner.getPosition();
            if (position != 0) {
                i8 = 1;
                if (position != 1) {
                    i8 = 2;
                    if (position != 2) {
                        i8 = 3;
                        if (position != 3) {
                            throw new IllegalArgumentException(AbstractC2647h.m4256b("Invalid position: ", position));
                        }
                    }
                }
            } else {
                i8 = 0;
            }
            radius = roundedCorner.getRadius();
            center = roundedCorner.getCenter();
            return new C1635h(i8, radius, center);
        }
        return null;
    }

    /* renamed from: q */
    public static final C2266e m16q() {
        C2266e c2266e = f13n;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Router", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.2f, 5.9f);
        c0811dk.m1511l(0.8f, -0.8f);
        c0811dk.m1506g(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        c0811dk.m1514o(-3.6f, 0.7f, -5.0f, 2.1f);
        c0811dk.m1511l(0.8f, 0.8f);
        c0811dk.m1506g(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        c0811dk.m1514o(3.0f, 0.6f, 4.2f, 1.7f);
        c0811dk.m1505f();
        c0811dk.m1512m(19.3f, 6.7f);
        c0811dk.m1507h(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        c0811dk.m1514o(-2.4f, 0.5f, -3.3f, 1.4f);
        c0811dk.m1511l(0.8f, 0.8f);
        c0811dk.m1507h(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        c0811dk.m1507h(0.9f, 0.0f, 1.8f, 0.3f, 2.5f, 1.0f);
        c0811dk.m1511l(0.8f, -0.8f);
        c0811dk.m1505f();
        c0811dk.m1512m(19.0f, 13.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1510k(17.0f, 9.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(4.0f);
        c0811dk.m1510k(5.0f, 13.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c0811dk.m1517r(4.0f);
        c0811dk.m1507h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c0811dk.m1509j(14.0f);
        c0811dk.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0811dk.m1517r(-4.0f);
        c0811dk.m1507h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(8.0f, 18.0f);
        c0811dk.m1510k(6.0f, 18.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(11.5f, 18.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(15.0f, 18.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f13n = m3673b;
        return m3673b;
    }

    /* renamed from: r */
    public static final C2266e m17r() {
        C2266e c2266e = f14o;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Shield", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(12.0f, 1.0f));
        arrayList.add(new C2275l(3.0f, 5.0f));
        arrayList.add(new C2284u(6.0f));
        arrayList.add(new C2279p(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f));
        arrayList.add(new C2279p(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f));
        arrayList.add(new C2285v(5.0f));
        arrayList.add(new C2281r(-9.0f, -4.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14o = m3673b;
        return m3673b;
    }

    /* renamed from: s */
    public static final C2266e m18s() {
        C2266e c2266e = f15p;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Sync", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(12.0f, 4.0f);
        c0811dk.m1510k(12.0f, 1.0f);
        c0811dk.m1510k(8.0f, 5.0f);
        c0811dk.m1511l(4.0f, 4.0f);
        c0811dk.m1510k(12.0f, 6.0f);
        c0811dk.m1507h(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        c0811dk.m1507h(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
        c0811dk.m1511l(1.46f, 1.46f);
        c0811dk.m1506g(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
        c0811dk.m1507h(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(12.0f, 18.0f);
        c0811dk.m1507h(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        c0811dk.m1507h(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
        c0811dk.m1510k(5.24f, 7.74f);
        c0811dk.m1506g(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
        c0811dk.m1507h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        c0811dk.m1517r(3.0f);
        c0811dk.m1511l(4.0f, -4.0f);
        c0811dk.m1511l(-4.0f, -4.0f);
        c0811dk.m1517r(3.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f15p = m3673b;
        return m3673b;
    }

    /* renamed from: t */
    public static final InterfaceC3810r m19t(InterfaceC3810r interfaceC3810r, float f7) {
        if (f7 == 0.0f) {
            return interfaceC3810r;
        }
        return AbstractC0168a.m386c(interfaceC3810r, 0.0f, f7, null, 524031);
    }

    /* renamed from: u */
    public static void m20u() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    /* renamed from: v */
    public static final C0465c m21v(InterfaceC3238v interfaceC3238v) {
        C0465c m4895f = AbstractC3191c1.m4895f(interfaceC3238v);
        float f7 = m4895f.f1625a;
        float f8 = m4895f.f1626b;
        long mo4932g = interfaceC3238v.mo4932g((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
        float f9 = m4895f.f1627c;
        float f10 = m4895f.f1628d;
        long mo4932g2 = interfaceC3238v.mo4932g((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        return new C0465c(Float.intBitsToFloat((int) (mo4932g >> 32)), Float.intBitsToFloat((int) (mo4932g & 4294967295L)), Float.intBitsToFloat((int) (mo4932g2 >> 32)), Float.intBitsToFloat((int) (mo4932g2 & 4294967295L)));
    }
}
