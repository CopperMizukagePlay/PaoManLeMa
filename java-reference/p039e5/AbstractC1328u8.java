package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.AbstractC0165a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p001a0.AbstractC0094y0;
import p017c.C0320e;
import p024c6.AbstractC0444k;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1807o;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p065i2.AbstractC2064e;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p116p0.AbstractC2834c;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3137j0;
import p144t.C3147o0;
import p144t.C3152r;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u8 */
/* loaded from: classes.dex */
public abstract class AbstractC1328u8 {

    /* renamed from: a */
    public static final C3860d f7898a = AbstractC3861e.m5873a(10);

    /* renamed from: a */
    public static final void m2356a(final Context context, final C0877fn c0877fn, final String str, final boolean z7, final boolean z8, final InterfaceC3277a interfaceC3277a, final InterfaceC3277a interfaceC3277a2, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(291150851);
        if (c2395p2.m3874i(context)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i15 = i7 | i8;
        if (c2395p2.m3870g(c0877fn)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i16 = i15 | i9;
        if (c2395p2.m3870g(str)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i17 = i16 | i10;
        if (c2395p2.m3872h(z7)) {
            i11 = 2048;
        } else {
            i11 = 1024;
        }
        int i18 = i17 | i11;
        if (c2395p2.m3872h(z8)) {
            i12 = 16384;
        } else {
            i12 = 8192;
        }
        int i19 = i18 | i12;
        if (c2395p2.m3874i(interfaceC3277a)) {
            i13 = 131072;
        } else {
            i13 = 65536;
        }
        int i20 = i19 | i13;
        if (c2395p2.m3874i(interfaceC3277a2)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i21 = i20 | i14;
        if ((i21 & 599187) == 599186 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            float f7 = 2;
            InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, f7, 1);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m339j);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p2, 54);
            int hashCode2 = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m346e);
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
            String m1527a = c0877fn.m1527a();
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l;
            if (1.0f > 0.0d) {
                float f8 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f8 = 1.0f;
                }
                AbstractC1850a7.m3108b(m1527a, new LayoutWeightElement(f8, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65532);
                m2357b(z8, interfaceC3277a, interfaceC3277a2, c2395p, (i21 >> 12) & 1022);
                c2395p.m3857Z(-1824629764);
                boolean m3874i = c2395p.m3874i(context);
                if ((i21 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z11 = m3874i | z9;
                Object m3847O = c2395p.m3847O();
                if (z11 || m3847O == C2375k.f13421a) {
                    m3847O = new C0320e(5, context, c0877fn);
                    c2395p.m3877j0(m3847O);
                }
                c2395p.m3888r(false);
                AbstractC1991r4.m3165f((InterfaceC3277a) m3847O, AbstractC0155c.m353l(c3807o, 32), false, null, AbstractC0823e1.f3601m, c2395p, 196656, 28);
                c2395p.m3888r(true);
                if (str != null && !AbstractC0444k.m937a0(str)) {
                    c2395p.m3857Z(1286411040);
                    AbstractC1850a7.m3108b(str, AbstractC0154b.m340k(c3807o, f7, 0.0f, 0.0f, f7, 6), ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, ((i21 >> 6) & 14) | 48, 0, 65528);
                    c2395p.m3888r(false);
                    c2395p2 = c2395p;
                    z10 = true;
                } else {
                    if (z7) {
                        c2395p.m3857Z(1286736633);
                        AbstractC1850a7.m3108b("Geo 查询中…", AbstractC0154b.m340k(c3807o, f7, 0.0f, 0.0f, f7, 6), ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 54, 0, 65528);
                        c2395p2 = c2395p;
                        c2395p2.m3888r(false);
                    } else {
                        c2395p2 = c2395p;
                        c2395p2.m3857Z(1287042541);
                        c2395p2.m3888r(false);
                    }
                    z10 = true;
                }
                c2395p2.m3888r(z10);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(context, c0877fn, str, z7, z8, interfaceC3277a, interfaceC3277a2, i7) { // from class: e5.c8

                /* renamed from: e */
                public final /* synthetic */ Context f2998e;

                /* renamed from: f */
                public final /* synthetic */ C0877fn f2999f;

                /* renamed from: g */
                public final /* synthetic */ String f3000g;

                /* renamed from: h */
                public final /* synthetic */ boolean f3001h;

                /* renamed from: i */
                public final /* synthetic */ boolean f3002i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC3277a f3003j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC3277a f3004k;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(1);
                    AbstractC1328u8.m2356a(this.f2998e, this.f2999f, this.f3000g, this.f3001h, this.f3002i, this.f3003j, this.f3004k, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: b */
    public static final void m2357b(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3277a interfaceC3277a3;
        InterfaceC3277a interfaceC3277a4;
        int i9;
        int i10;
        int i11;
        boolean z8 = z7;
        c2395p.m3859a0(785253181);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3277a2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        int i12 = i8;
        if ((i12 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3277a3 = interfaceC3277a;
            interfaceC3277a4 = interfaceC3277a2;
        } else {
            float f7 = 32;
            C3807o c3807o = C3807o.f17991a;
            int i13 = (i12 << 6) & 896;
            AbstractC1991r4.m3165f(interfaceC3277a, AbstractC0155c.m353l(c3807o, f7), z8, null, AbstractC0823e1.f3599k, c2395p, ((i12 >> 3) & 14) | 196656 | i13, 24);
            interfaceC3277a3 = interfaceC3277a;
            z8 = z7;
            interfaceC3277a4 = interfaceC3277a2;
            AbstractC1991r4.m3165f(interfaceC3277a4, AbstractC0155c.m353l(c3807o, f7), z8, null, AbstractC0823e1.f3600l, c2395p, ((i12 >> 6) & 14) | 196656 | i13, 24);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0799d8(z8, interfaceC3277a3, interfaceC3277a4, i7);
        }
    }

    /* renamed from: c */
    public static final void m2358c(final String str, final String str2, final boolean z7, final boolean z8, final InterfaceC3279c interfaceC3279c, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(-911990401);
        if (c2395p2.m3870g(str2)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i12 = i7 | i8;
        if (c2395p2.m3872h(z7)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i13 = i12 | i9;
        if (c2395p2.m3872h(z8)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i14 = i13 | i10;
        if (c2395p2.m3874i(interfaceC3279c)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i15 = i14 | i11;
        if ((i15 & 9363) == 9362 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            float f7 = 1.0f;
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p2, 54);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            if (1.0f > 0.0d) {
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                int hashCode2 = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l, c2395p, 6, 0, 65534);
                AbstractC1850a7.m3108b(str2, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, (i15 >> 3) & 14, 3120, 55290);
                c2395p2 = c2395p;
                c2395p2.m3888r(true);
                AbstractC0165a.m376a(z7, interfaceC3279c, null, z8, null, c2395p2, ((i15 >> 6) & 14) | ((i15 >> 9) & 112) | (57344 & (i15 << 3)));
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(str, str2, z7, z8, interfaceC3279c, i7) { // from class: e5.e8

                /* renamed from: e */
                public final /* synthetic */ String f3654e;

                /* renamed from: f */
                public final /* synthetic */ String f3655f;

                /* renamed from: g */
                public final /* synthetic */ boolean f3656g;

                /* renamed from: h */
                public final /* synthetic */ boolean f3657h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC3279c f3658i;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(7);
                    AbstractC1328u8.m2358c(this.f3654e, this.f3655f, this.f3656g, this.f3657h, this.f3658i, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: d */
    public static final void m2359d(final InterfaceC3810r interfaceC3810r, final C1451y7 c1451y7, final C0703a8 c0703a8, final List list, final String str, final InterfaceC3279c interfaceC3279c, final InterfaceC3277a interfaceC3277a, final String str2, final String str3, final InterfaceC3279c interfaceC3279c2, final InterfaceC3279c interfaceC3279c3, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c7;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C3137j0 c3137j0;
        C2395p c2395p2;
        AbstractC3367j.m5100e(c0703a8, "state");
        AbstractC3367j.m5100e(list, "availableNetworkTargets");
        AbstractC3367j.m5100e(str, "selectedNetworkId");
        AbstractC3367j.m5100e(interfaceC3279c, "onNetworkSelected");
        AbstractC3367j.m5100e(interfaceC3277a, "onRefreshNetworks");
        AbstractC3367j.m5100e(str2, "publicApiHost");
        AbstractC3367j.m5100e(str3, "apiV4Token");
        AbstractC3367j.m5100e(interfaceC3279c2, "onNavigateToPing");
        AbstractC3367j.m5100e(interfaceC3279c3, "onNavigateToTrace");
        c2395p.m3859a0(977262407);
        if (c2395p.m3874i(c1451y7)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i17 = i7 | i8;
        if (c2395p.m3874i(c0703a8)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i18 = i17 | i9;
        if (c2395p.m3874i(list)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i19 = i18 | i10;
        if (c2395p.m3870g(str)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i20 = i19 | i11;
        if (c2395p.m3874i(interfaceC3279c)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        int i21 = i20 | i12;
        if (c2395p.m3874i(interfaceC3277a)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        int i22 = i21 | i13;
        if (c2395p.m3870g(str2)) {
            i14 = 8388608;
        } else {
            i14 = 4194304;
        }
        int i23 = i22 | i14;
        if (c2395p.m3870g(str3)) {
            i15 = 67108864;
        } else {
            i15 = 33554432;
        }
        int i24 = i23 | i15;
        if (c2395p.m3874i(interfaceC3279c2)) {
            i16 = 536870912;
        } else {
            i16 = 268435456;
        }
        int i25 = i24 | i16;
        if (c2395p.m3874i(interfaceC3279c3)) {
            c7 = 4;
        } else {
            c7 = 2;
        }
        if ((i25 & 306783379) == 306783378 && (c7 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            Object[] objArr = new Object[0];
            c2395p.m3857Z(-1727477034);
            boolean m3874i = c2395p.m3874i(context);
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3874i || m3847O == obj) {
                m3847O = new C1229r2(context, 21);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 0);
            c2395p.m3857Z(-1727474251);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj) {
                AbstractC3367j.m5100e(context, "context");
                m3847O2 = AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_dns_settings_expanded", false);
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O2;
            c2395p.m3888r(false);
            Object[] objArr2 = new Object[0];
            c2395p.m3857Z(-1727470149);
            boolean m3874i2 = c2395p.m3874i(context);
            Object m3847O3 = c2395p.m3847O();
            if (m3874i2 || m3847O3 == obj) {
                m3847O3 = new C1229r2(context, 22);
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O3, c2395p, 0);
            Object[] objArr3 = new Object[0];
            c2395p.m3857Z(-1727466853);
            boolean m3874i3 = c2395p.m3874i(context);
            Object m3847O4 = c2395p.m3847O();
            if (m3874i3 || m3847O4 == obj) {
                m3847O4 = new C1229r2(context, 23);
                c2395p.m3877j0(m3847O4);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O4, c2395p, 0);
            Object[] objArr4 = new Object[0];
            c2395p.m3857Z(-1727463458);
            boolean m3874i4 = c2395p.m3874i(context);
            Object m3847O5 = c2395p.m3847O();
            if (m3874i4 || m3847O5 == obj) {
                m3847O5 = new C1229r2(context, 24);
                c2395p.m3877j0(m3847O5);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O5, c2395p, 0);
            Object[] objArr5 = new Object[0];
            c2395p.m3857Z(-1727459970);
            boolean m3874i5 = c2395p.m3874i(context);
            Object m3847O6 = c2395p.m3847O();
            if (m3874i5 || m3847O6 == obj) {
                m3847O6 = new C1229r2(context, 25);
                c2395p.m3877j0(m3847O6);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr5, (InterfaceC3277a) m3847O6, c2395p, 0);
            c2395p.m3857Z(-1727456932);
            Object m3847O7 = c2395p.m3847O();
            Object obj2 = m3847O7;
            if (m3847O7 == obj) {
                C3469p c3469p = new C3469p();
                List m2259f0 = AbstractC1249rm.m2259f0(context);
                if (m2259f0.isEmpty()) {
                    c3469p.add("");
                    c3469p.add("");
                } else {
                    c3469p.addAll(m2259f0);
                }
                c2395p.m3877j0(c3469p);
                obj2 = c3469p;
            }
            C3469p c3469p2 = (C3469p) obj2;
            Object m181h = AbstractC0094y0.m181h(-1727447054, c2395p, false);
            Object obj3 = m181h;
            if (m181h == obj) {
                C3469p c3469p3 = new C3469p();
                c3469p3.addAll(AbstractC1249rm.m2257e0(context));
                c2395p.m3877j0(c3469p3);
                obj3 = c3469p3;
            }
            C3469p c3469p4 = (C3469p) obj3;
            Object m181h2 = AbstractC0094y0.m181h(-1727441533, c2395p, false);
            if (m181h2 == obj) {
                m181h2 = AbstractC2418w.m3980x(AbstractC1249rm.m2265i0(context));
                c2395p.m3877j0(m181h2);
            }
            InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) m181h2;
            c2395p.m3888r(false);
            Boolean valueOf = Boolean.valueOf(m2360e(interfaceC2425y02));
            c2395p.m3857Z(-1727437996);
            boolean m3874i6 = c2395p.m3874i(context);
            Object m3847O8 = c2395p.m3847O();
            if (m3874i6 || m3847O8 == obj) {
                m3847O8 = new C0797d6(context, interfaceC2425y02, interfaceC2425y07, null, 1);
                c2395p.m3877j0(m3847O8);
            }
            char c8 = c7;
            c2395p.m3888r(false);
            AbstractC2418w.m3965g(valueOf, c2395p, (InterfaceC3281e) m3847O8);
            InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(AbstractC0155c.f660c);
            float f7 = 2;
            C3137j0 c3137j02 = new C3137j0(f7, f7, f7, f7);
            C3130g m4843g = AbstractC3136j.m4843g(6);
            c2395p.m3857Z(-1727384446);
            boolean m3870g = c2395p.m3870g(interfaceC2425y0) | c2395p.m3874i(c0703a8) | c2395p.m3874i(context) | c2395p.m3874i(list);
            boolean z13 = true;
            if ((i25 & 57344) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z14 = z7 | m3870g;
            if ((i25 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z15 = z14 | z8;
            if ((i25 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean m3874i7 = z15 | z9 | c2395p.m3874i(c1451y7) | c2395p.m3870g(interfaceC2425y03) | c2395p.m3870g(interfaceC2425y04) | c2395p.m3870g(interfaceC2425y05) | c2395p.m3870g(interfaceC2425y06);
            if ((i25 & 29360128) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = m3874i7 | z10;
            if ((i25 & 234881024) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z16 | z11;
            if ((i25 & 1879048192) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((c8 & 14) != 4) {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            Object m3847O9 = c2395p.m3847O();
            if (!z19 && m3847O9 != obj) {
                c2395p2 = c2395p;
                c3137j0 = c3137j02;
            } else {
                c3137j0 = c3137j02;
                Object c1447y3 = new C1447y3(c1451y7, c0703a8, interfaceC2425y0, context, list, str, interfaceC3279c, interfaceC3277a, interfaceC2425y03, interfaceC2425y04, interfaceC2425y05, interfaceC2425y06, c3469p2, c3469p4, interfaceC2425y02, interfaceC2425y07, str2, str3, interfaceC3279c2, interfaceC3279c3);
                c2395p2 = c2395p;
                c2395p2.m3877j0(c1447y3);
                m3847O9 = c1447y3;
            }
            c2395p2.m3888r(false);
            AbstractC2064e.m3235e(24960, 234, c2395p2, null, m4843g, c3137j0, (InterfaceC3279c) m3847O9, null, null, mo5829e, false);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(c1451y7, c0703a8, list, str, interfaceC3279c, interfaceC3277a, str2, str3, interfaceC3279c2, interfaceC3279c3, i7) { // from class: e5.b8

                /* renamed from: f */
                public final /* synthetic */ C1451y7 f2618f;

                /* renamed from: g */
                public final /* synthetic */ C0703a8 f2619g;

                /* renamed from: h */
                public final /* synthetic */ List f2620h;

                /* renamed from: i */
                public final /* synthetic */ String f2621i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC3279c f2622j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC3277a f2623k;

                /* renamed from: l */
                public final /* synthetic */ String f2624l;

                /* renamed from: m */
                public final /* synthetic */ String f2625m;

                /* renamed from: n */
                public final /* synthetic */ InterfaceC3279c f2626n;

                /* renamed from: o */
                public final /* synthetic */ InterfaceC3279c f2627o;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int m3957F = AbstractC2418w.m3957F(7);
                    AbstractC1328u8.m2359d(InterfaceC3810r.this, this.f2618f, this.f2619g, this.f2620h, this.f2621i, this.f2622j, this.f2623k, this.f2624l, this.f2625m, this.f2626n, this.f2627o, (C2395p) obj4, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: e */
    public static final boolean m2360e(InterfaceC2425y0 interfaceC2425y0) {
        return ((Boolean) interfaceC2425y0.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static final void m2361f(String str, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        int i9;
        c2395p.m3859a0(2049860934);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i8 = i9 | i7;
        } else {
            i8 = i7;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11789G, c2395p), null, AbstractC3178i.m4873d(-1633090412, new C1297t8(0, c3173d, str), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1137o3(i7, 1, str, c3173d);
        }
    }

    /* renamed from: g */
    public static final void m2362g(Context context, C3469p c3469p) {
        c3469p.getClass();
        AbstractC2834c abstractC2834c = AbstractC3470q.m5264e(c3469p).f16763c;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(abstractC2834c, "servers");
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(abstractC2834c));
        Iterator<E> it = abstractC2834c.iterator();
        while (it.hasNext()) {
            AbstractC0094y0.m191r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!AbstractC0444k.m937a0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            jSONArray.put((String) obj2);
        }
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_dns_page_servers", jSONArray.toString()).apply();
    }
}
