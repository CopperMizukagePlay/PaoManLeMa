package p039e5;

import android.content.Context;
import android.net.Network;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.FillElement;
import java.security.SecureRandom;
import java.util.List;
import java.util.regex.Pattern;
import p019c1.C0363g;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p073j2.AbstractC2168e;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3367j;
import p168w.C3619d;
import p168w.C3638u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l5 */
/* loaded from: classes.dex */
public final class C1046l5 implements InterfaceC3283g {

    /* renamed from: A */
    public final /* synthetic */ InterfaceC3279c f5384A;

    /* renamed from: B */
    public final /* synthetic */ InterfaceC3279c f5385B;

    /* renamed from: C */
    public final /* synthetic */ InterfaceC3279c f5386C;

    /* renamed from: D */
    public final /* synthetic */ InterfaceC2425y0 f5387D;

    /* renamed from: E */
    public final /* synthetic */ C1473yt f5388E;

    /* renamed from: F */
    public final /* synthetic */ C1270sc f5389F;

    /* renamed from: G */
    public final /* synthetic */ C1394wc f5390G;

    /* renamed from: H */
    public final /* synthetic */ C1451y7 f5391H;

    /* renamed from: I */
    public final /* synthetic */ C0703a8 f5392I;

    /* renamed from: J */
    public final /* synthetic */ InterfaceC2425y0 f5393J;

    /* renamed from: K */
    public final /* synthetic */ InterfaceC0516a0 f5394K;

    /* renamed from: L */
    public final /* synthetic */ C3619d f5395L;

    /* renamed from: M */
    public final /* synthetic */ C1031kl f5396M;

    /* renamed from: N */
    public final /* synthetic */ C1062ll f5397N;

    /* renamed from: O */
    public final /* synthetic */ InterfaceC2425y0 f5398O;

    /* renamed from: P */
    public final /* synthetic */ InterfaceC2425y0 f5399P;

    /* renamed from: Q */
    public final /* synthetic */ InterfaceC2425y0 f5400Q;

    /* renamed from: R */
    public final /* synthetic */ InterfaceC2425y0 f5401R;

    /* renamed from: S */
    public final /* synthetic */ C1219qn f5402S;

    /* renamed from: T */
    public final /* synthetic */ C1281sn f5403T;

    /* renamed from: U */
    public final /* synthetic */ InterfaceC2425y0 f5404U;

    /* renamed from: V */
    public final /* synthetic */ InterfaceC2425y0 f5405V;

    /* renamed from: W */
    public final /* synthetic */ InterfaceC2425y0 f5406W;

    /* renamed from: e */
    public final /* synthetic */ C1156om f5407e;

    /* renamed from: f */
    public final /* synthetic */ String f5408f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f5409g;

    /* renamed from: h */
    public final /* synthetic */ EnumC1125nm f5410h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f5411i;

    /* renamed from: j */
    public final /* synthetic */ String f5412j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f5413k;

    /* renamed from: l */
    public final /* synthetic */ boolean f5414l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f5415m;

    /* renamed from: n */
    public final /* synthetic */ String f5416n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC3279c f5417o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f5418p;

    /* renamed from: q */
    public final /* synthetic */ Context f5419q;

    /* renamed from: r */
    public final /* synthetic */ C1001jm f5420r;

    /* renamed from: s */
    public final /* synthetic */ String f5421s;

    /* renamed from: t */
    public final /* synthetic */ String f5422t;

    /* renamed from: u */
    public final /* synthetic */ C1504zt f5423u;

    /* renamed from: v */
    public final /* synthetic */ String f5424v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC3279c f5425w;

    /* renamed from: x */
    public final /* synthetic */ EnumC1163ot f5426x;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC3279c f5427y;

    /* renamed from: z */
    public final /* synthetic */ String f5428z;

    public C1046l5(C1156om c1156om, String str, InterfaceC3279c interfaceC3279c, EnumC1125nm enumC1125nm, InterfaceC3279c interfaceC3279c2, String str2, InterfaceC3279c interfaceC3279c3, boolean z7, InterfaceC3279c interfaceC3279c4, String str3, InterfaceC3279c interfaceC3279c5, InterfaceC2425y0 interfaceC2425y0, Context context, C1001jm c1001jm, String str4, String str5, C1504zt c1504zt, String str6, InterfaceC3279c interfaceC3279c6, EnumC1163ot enumC1163ot, InterfaceC3279c interfaceC3279c7, String str7, InterfaceC3279c interfaceC3279c8, InterfaceC3279c interfaceC3279c9, InterfaceC3279c interfaceC3279c10, InterfaceC2425y0 interfaceC2425y02, C1473yt c1473yt, C1270sc c1270sc, C1394wc c1394wc, C1451y7 c1451y7, C0703a8 c0703a8, InterfaceC2425y0 interfaceC2425y03, InterfaceC0516a0 interfaceC0516a0, C3619d c3619d, C1031kl c1031kl, C1062ll c1062ll, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, C1219qn c1219qn, C1281sn c1281sn, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010) {
        this.f5407e = c1156om;
        this.f5408f = str;
        this.f5409g = interfaceC3279c;
        this.f5410h = enumC1125nm;
        this.f5411i = interfaceC3279c2;
        this.f5412j = str2;
        this.f5413k = interfaceC3279c3;
        this.f5414l = z7;
        this.f5415m = interfaceC3279c4;
        this.f5416n = str3;
        this.f5417o = interfaceC3279c5;
        this.f5418p = interfaceC2425y0;
        this.f5419q = context;
        this.f5420r = c1001jm;
        this.f5421s = str4;
        this.f5422t = str5;
        this.f5423u = c1504zt;
        this.f5424v = str6;
        this.f5425w = interfaceC3279c6;
        this.f5426x = enumC1163ot;
        this.f5427y = interfaceC3279c7;
        this.f5428z = str7;
        this.f5384A = interfaceC3279c8;
        this.f5385B = interfaceC3279c9;
        this.f5386C = interfaceC3279c10;
        this.f5387D = interfaceC2425y02;
        this.f5388E = c1473yt;
        this.f5389F = c1270sc;
        this.f5390G = c1394wc;
        this.f5391H = c1451y7;
        this.f5392I = c0703a8;
        this.f5393J = interfaceC2425y03;
        this.f5394K = interfaceC0516a0;
        this.f5395L = c3619d;
        this.f5396M = c1031kl;
        this.f5397N = c1062ll;
        this.f5398O = interfaceC2425y04;
        this.f5399P = interfaceC2425y05;
        this.f5400Q = interfaceC2425y06;
        this.f5401R = interfaceC2425y07;
        this.f5402S = c1219qn;
        this.f5403T = c1281sn;
        this.f5404U = interfaceC2425y08;
        this.f5405V = interfaceC2425y09;
        this.f5406W = interfaceC2425y010;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        C1473yt c1473yt;
        int intValue = ((Number) obj2).intValue();
        C2395p c2395p = (C2395p) obj3;
        ((Number) obj4).intValue();
        AbstractC3367j.m5100e((C3638u) obj, "$this$HorizontalPager");
        int ordinal = ((EnumC1105n2) EnumC1105n2.f6156l.get(intValue)).ordinal();
        Object obj5 = this.f5422t;
        Object obj6 = this.f5421s;
        Object obj7 = this.f5416n;
        InterfaceC2425y0 interfaceC2425y0 = this.f5405V;
        Object obj8 = C2375k.f13421a;
        final Context context = this.f5419q;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                c2395p.m3857Z(451230952);
                                FillElement fillElement = AbstractC0155c.f660c;
                                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                                List list = (List) interfaceC2425y0.getValue();
                                InterfaceC2425y0 interfaceC2425y02 = this.f5404U;
                                String str = (String) interfaceC2425y02.getValue();
                                c2395p.m3857Z(451240719);
                                boolean m3870g = c2395p.m3870g(interfaceC2425y02) | c2395p.m3874i(context);
                                Object m3847O = c2395p.m3847O();
                                if (m3870g || m3847O == obj8) {
                                    m3847O = new C1385w3(context, interfaceC2425y02, 4);
                                    c2395p.m3877j0(m3847O);
                                }
                                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) m3847O;
                                c2395p.m3888r(false);
                                c2395p.m3857Z(451246329);
                                boolean m3874i = c2395p.m3874i(context);
                                Object m3847O2 = c2395p.m3847O();
                                if (m3874i || m3847O2 == obj8) {
                                    m3847O2 = new C0984j5(context, interfaceC2425y0, 3);
                                    c2395p.m3877j0(m3847O2);
                                }
                                c2395p.m3888r(false);
                                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) ((AbstractC3365h) m3847O2);
                                c2395p.m3857Z(451248236);
                                boolean m3870g2 = c2395p.m3870g(interfaceC2425y02);
                                Object m3847O3 = c2395p.m3847O();
                                if (m3870g2 || m3847O3 == obj8) {
                                    m3847O3 = new C0891g5(interfaceC2425y02, interfaceC2425y0, 0);
                                    c2395p.m3877j0(m3847O3);
                                }
                                c2395p.m3888r(false);
                                AbstractC1172p7.m2034K(fillElement, this.f5402S, this.f5403T, list, str, interfaceC3279c, interfaceC3277a, (InterfaceC3277a) m3847O3, c2395p, 582);
                                c2395p.m3888r(false);
                            } else {
                                c2395p.m3857Z(451054208);
                                c2395p.m3888r(false);
                                throw new RuntimeException();
                            }
                        } else {
                            c2395p.m3857Z(451199352);
                            FillElement fillElement2 = AbstractC0155c.f660c;
                            C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                            List list2 = (List) interfaceC2425y0.getValue();
                            InterfaceC2425y0 interfaceC2425y03 = this.f5398O;
                            String str2 = (String) interfaceC2425y03.getValue();
                            c2395p.m3857Z(451207997);
                            boolean m3870g3 = c2395p.m3870g(interfaceC2425y03) | c2395p.m3874i(context);
                            Object m3847O4 = c2395p.m3847O();
                            if (m3870g3 || m3847O4 == obj8) {
                                m3847O4 = new C1385w3(context, interfaceC2425y03, 7);
                                c2395p.m3877j0(m3847O4);
                            }
                            InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) m3847O4;
                            c2395p.m3888r(false);
                            c2395p.m3857Z(451213049);
                            boolean m3874i2 = c2395p.m3874i(context);
                            Object m3847O5 = c2395p.m3847O();
                            if (m3874i2 || m3847O5 == obj8) {
                                m3847O5 = new C0984j5(context, interfaceC2425y0, 1);
                                c2395p.m3877j0(m3847O5);
                            }
                            c2395p.m3888r(false);
                            InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) ((AbstractC3365h) m3847O5);
                            c2395p.m3857Z(451214947);
                            boolean m3870g4 = c2395p.m3870g(interfaceC2425y03);
                            Object m3847O6 = c2395p.m3847O();
                            if (m3870g4 || m3847O6 == obj8) {
                                m3847O6 = new C0891g5(interfaceC2425y03, interfaceC2425y0, 1);
                                c2395p.m3877j0(m3847O6);
                            }
                            InterfaceC3277a interfaceC3277a3 = (InterfaceC3277a) m3847O6;
                            c2395p.m3888r(false);
                            InterfaceC2425y0 interfaceC2425y04 = this.f5399P;
                            boolean booleanValue = ((Boolean) interfaceC2425y04.getValue()).booleanValue();
                            c2395p.m3857Z(451219331);
                            boolean m3870g5 = c2395p.m3870g(interfaceC2425y04);
                            Object m3847O7 = c2395p.m3847O();
                            if (m3870g5 || m3847O7 == obj8) {
                                m3847O7 = new C1353v2(interfaceC2425y04, 12);
                                c2395p.m3877j0(m3847O7);
                            }
                            InterfaceC3277a interfaceC3277a4 = (InterfaceC3277a) m3847O7;
                            c2395p.m3888r(false);
                            InterfaceC2425y0 interfaceC2425y05 = this.f5400Q;
                            boolean booleanValue2 = ((Boolean) interfaceC2425y05.getValue()).booleanValue();
                            c2395p.m3857Z(451223618);
                            boolean m3870g6 = c2395p.m3870g(interfaceC2425y05);
                            Object m3847O8 = c2395p.m3847O();
                            if (m3870g6 || m3847O8 == obj8) {
                                m3847O8 = new C1353v2(interfaceC2425y05, 10);
                                c2395p.m3877j0(m3847O8);
                            }
                            InterfaceC3277a interfaceC3277a5 = (InterfaceC3277a) m3847O8;
                            c2395p.m3888r(false);
                            InterfaceC2425y0 interfaceC2425y06 = this.f5401R;
                            boolean booleanValue3 = ((Boolean) interfaceC2425y06.getValue()).booleanValue();
                            c2395p.m3857Z(451227486);
                            boolean m3870g7 = c2395p.m3870g(interfaceC2425y06);
                            Object m3847O9 = c2395p.m3847O();
                            if (m3870g7 || m3847O9 == obj8) {
                                m3847O9 = new C1353v2(interfaceC2425y06, 11);
                                c2395p.m3877j0(m3847O9);
                            }
                            InterfaceC3277a interfaceC3277a6 = (InterfaceC3277a) m3847O9;
                            c2395p.m3888r(false);
                            SecureRandom secureRandom = C1031kl.f5303g;
                            AbstractC1172p7.m2076w(fillElement2, this.f5396M, this.f5397N, list2, str2, interfaceC3279c2, interfaceC3277a2, interfaceC3277a3, booleanValue, interfaceC3277a4, booleanValue2, interfaceC3277a5, booleanValue3, interfaceC3277a6, c2395p, 582);
                            c2395p.m3888r(false);
                        }
                    } else {
                        c2395p.m3857Z(451175578);
                        FillElement fillElement3 = AbstractC0155c.f660c;
                        C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                        List list3 = (List) interfaceC2425y0.getValue();
                        InterfaceC2425y0 interfaceC2425y07 = this.f5393J;
                        String str3 = (String) interfaceC2425y07.getValue();
                        c2395p.m3857Z(451184669);
                        boolean m3870g8 = c2395p.m3870g(interfaceC2425y07) | c2395p.m3874i(context);
                        Object m3847O10 = c2395p.m3847O();
                        if (m3870g8 || m3847O10 == obj8) {
                            m3847O10 = new C1385w3(context, interfaceC2425y07, 6);
                            c2395p.m3877j0(m3847O10);
                        }
                        InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) m3847O10;
                        c2395p.m3888r(false);
                        c2395p.m3857Z(451189721);
                        boolean m3874i3 = c2395p.m3874i(context);
                        Object m3847O11 = c2395p.m3847O();
                        if (m3874i3 || m3847O11 == obj8) {
                            m3847O11 = new C0984j5(context, interfaceC2425y0, 0);
                            c2395p.m3877j0(m3847O11);
                        }
                        c2395p.m3888r(false);
                        InterfaceC3277a interfaceC3277a7 = (InterfaceC3277a) ((AbstractC3365h) m3847O11);
                        c2395p.m3857Z(451194450);
                        InterfaceC3279c interfaceC3279c4 = this.f5409g;
                        boolean m3870g9 = c2395p.m3870g(interfaceC3279c4);
                        InterfaceC0516a0 interfaceC0516a0 = this.f5394K;
                        boolean m3874i4 = m3870g9 | c2395p.m3874i(interfaceC0516a0);
                        C3619d c3619d = this.f5395L;
                        boolean m3870g10 = m3874i4 | c2395p.m3870g(c3619d);
                        Object m3847O12 = c2395p.m3847O();
                        if (m3870g10 || m3847O12 == obj8) {
                            m3847O12 = new C1015k5(interfaceC3279c4, interfaceC0516a0, c3619d, 0);
                            c2395p.m3877j0(m3847O12);
                        }
                        c2395p.m3888r(false);
                        InterfaceC3279c interfaceC3279c5 = (InterfaceC3279c) ((AbstractC3365h) m3847O12);
                        c2395p.m3857Z(451196179);
                        InterfaceC3279c interfaceC3279c6 = this.f5425w;
                        boolean m3870g11 = c2395p.m3870g(interfaceC3279c6) | c2395p.m3874i(interfaceC0516a0) | c2395p.m3870g(c3619d);
                        Object m3847O13 = c2395p.m3847O();
                        if (m3870g11 || m3847O13 == obj8) {
                            m3847O13 = new C1015k5(interfaceC3279c6, interfaceC0516a0, c3619d, 1);
                            c2395p.m3877j0(m3847O13);
                        }
                        c2395p.m3888r(false);
                        AbstractC1328u8.m2359d(fillElement3, this.f5391H, this.f5392I, list3, str3, interfaceC3279c3, interfaceC3277a7, this.f5421s, this.f5422t, interfaceC3279c5, (InterfaceC3279c) ((AbstractC3365h) m3847O13), c2395p, 6);
                        c2395p.m3888r(false);
                    }
                } else {
                    c2395p.m3857Z(451167837);
                    FillElement fillElement4 = AbstractC0155c.f660c;
                    C3137j0 c3137j04 = AbstractC1172p7.f6835a;
                    EnumC1363vc enumC1363vc = (EnumC1363vc) this.f5406W.getValue();
                    Pattern pattern = C1270sc.f7550m;
                    AbstractC1302td.m2340g(fillElement4, this.f5389F, this.f5390G, enumC1363vc, c2395p, 582);
                    c2395p.m3888r(false);
                }
            } else {
                c2395p.m3857Z(451109483);
                FillElement fillElement5 = AbstractC0155c.f660c;
                C3137j0 c3137j05 = AbstractC1172p7.f6835a;
                List list4 = (List) interfaceC2425y0.getValue();
                InterfaceC2425y0 interfaceC2425y08 = this.f5387D;
                String str4 = (String) interfaceC2425y08.getValue();
                c2395p.m3857Z(451134369);
                boolean m3870g12 = c2395p.m3870g(interfaceC2425y08) | c2395p.m3874i(context);
                Object m3847O14 = c2395p.m3847O();
                if (m3870g12 || m3847O14 == obj8) {
                    m3847O14 = new C1385w3(context, interfaceC2425y08, 5);
                    c2395p.m3877j0(m3847O14);
                }
                InterfaceC3279c interfaceC3279c7 = (InterfaceC3279c) m3847O14;
                c2395p.m3888r(false);
                c2395p.m3857Z(451139545);
                boolean m3874i5 = c2395p.m3874i(context);
                Object m3847O15 = c2395p.m3847O();
                if (m3874i5 || m3847O15 == obj8) {
                    m3847O15 = new C0984j5(context, interfaceC2425y0, 4);
                    c2395p.m3877j0(m3847O15);
                }
                c2395p.m3888r(false);
                InterfaceC3277a interfaceC3277a8 = (InterfaceC3277a) ((AbstractC3365h) m3847O15);
                c2395p.m3857Z(451141877);
                C1473yt c1473yt2 = this.f5388E;
                boolean m3870g13 = c2395p.m3870g(obj5) | c2395p.m3870g(obj6) | c2395p.m3870g(obj7) | c2395p.m3874i(c1473yt2) | c2395p.m3870g(this.f5424v) | c2395p.m3870g(this.f5426x) | c2395p.m3870g(this.f5428z) | c2395p.m3870g(interfaceC2425y08) | c2395p.m3874i(context);
                Object m3847O16 = c2395p.m3847O();
                if (m3870g13 || m3847O16 == obj8) {
                    c1473yt = c1473yt2;
                    Object c0955i5 = new C0955i5(c1473yt, this.f5424v, this.f5426x, this.f5428z, this.f5416n, this.f5421s, this.f5422t, context, this.f5387D, this.f5405V);
                    c2395p.m3877j0(c0955i5);
                    m3847O16 = c0955i5;
                } else {
                    c1473yt = c1473yt2;
                }
                InterfaceC3279c interfaceC3279c8 = (InterfaceC3279c) m3847O16;
                c2395p.m3888r(false);
                c2395p.m3857Z(451165176);
                boolean m3874i6 = c2395p.m3874i(c1473yt);
                Object m3847O17 = c2395p.m3847O();
                if (m3874i6 || m3847O17 == obj8) {
                    Object c0363g = new C0363g(0, c1473yt, C1473yt.class, "stop", "stop()V", 0, 0, 2);
                    c2395p.m3877j0(c0363g);
                    m3847O17 = c0363g;
                }
                c2395p.m3888r(false);
                AbstractC1172p7.m2040Q(fillElement5, this.f5423u, this.f5424v, this.f5425w, this.f5426x, this.f5427y, this.f5428z, this.f5384A, this.f5421s, this.f5385B, this.f5422t, this.f5386C, this.f5416n, this.f5417o, list4, str4, interfaceC3279c7, interfaceC3277a8, interfaceC3279c8, (InterfaceC3277a) ((AbstractC3365h) m3847O17), c2395p, 70);
                c2395p.m3888r(false);
            }
        } else {
            c2395p.m3857Z(451052331);
            FillElement fillElement6 = AbstractC0155c.f660c;
            C3137j0 c3137j06 = AbstractC1172p7.f6835a;
            List list5 = (List) interfaceC2425y0.getValue();
            InterfaceC2425y0 interfaceC2425y09 = this.f5418p;
            String str5 = (String) interfaceC2425y09.getValue();
            c2395p.m3857Z(451073663);
            boolean m3870g14 = c2395p.m3870g(interfaceC2425y09) | c2395p.m3874i(context);
            Object m3847O18 = c2395p.m3847O();
            if (m3870g14 || m3847O18 == obj8) {
                m3847O18 = new C1385w3(context, interfaceC2425y09, 3);
                c2395p.m3877j0(m3847O18);
            }
            InterfaceC3279c interfaceC3279c9 = (InterfaceC3279c) m3847O18;
            c2395p.m3888r(false);
            c2395p.m3857Z(451078777);
            boolean m3874i7 = c2395p.m3874i(context);
            Object m3847O19 = c2395p.m3847O();
            if (m3874i7 || m3847O19 == obj8) {
                m3847O19 = new C0984j5(context, interfaceC2425y0, 2);
                c2395p.m3877j0(m3847O19);
            }
            c2395p.m3888r(false);
            InterfaceC3277a interfaceC3277a9 = (InterfaceC3277a) ((AbstractC3365h) m3847O19);
            c2395p.m3857Z(451081135);
            final C1001jm c1001jm = this.f5420r;
            boolean m3870g15 = c2395p.m3870g(obj5) | c2395p.m3870g(obj6) | c2395p.m3870g(obj7) | c2395p.m3874i(c1001jm) | c2395p.m3870g(this.f5408f) | c2395p.m3870g(this.f5410h) | c2395p.m3870g(this.f5412j) | c2395p.m3872h(this.f5414l) | c2395p.m3870g(interfaceC2425y09) | c2395p.m3874i(context);
            Object m3847O20 = c2395p.m3847O();
            if (m3870g15 || m3847O20 == obj8) {
                final String str6 = this.f5408f;
                final EnumC1125nm enumC1125nm = this.f5410h;
                final String str7 = this.f5412j;
                final String str8 = this.f5416n;
                final boolean z7 = this.f5414l;
                final String str9 = this.f5421s;
                final String str10 = this.f5422t;
                final InterfaceC2425y0 interfaceC2425y010 = this.f5418p;
                final InterfaceC2425y0 interfaceC2425y011 = this.f5405V;
                Object obj9 = new InterfaceC3279c() { // from class: e5.h5
                    @Override // p150t5.InterfaceC3279c
                    /* renamed from: f */
                    public final Object mo23f(Object obj10) {
                        int i7;
                        int i8;
                        String str11 = (String) obj10;
                        AbstractC3367j.m5100e(str11, "resolvedAddress");
                        Integer m973O = AbstractC0451r.m973O(str7);
                        if (m973O != null) {
                            i7 = AbstractC2168e.m3530q(m973O.intValue(), 1, 10000);
                        } else {
                            i7 = 4;
                        }
                        int i9 = i7;
                        Integer m973O2 = AbstractC0451r.m973O(str8);
                        if (m973O2 != null) {
                            i8 = AbstractC2168e.m3530q(m973O2.intValue(), 1, 65535);
                        } else {
                            i8 = 443;
                        }
                        int i10 = i8;
                        C3137j0 c3137j07 = AbstractC1172p7.f6835a;
                        Network m2044U = AbstractC1172p7.m2044U(interfaceC2425y011, (String) interfaceC2425y010.getValue());
                        Context applicationContext = context.getApplicationContext();
                        String str12 = str6;
                        AbstractC3367j.m5100e(str12, "target");
                        EnumC1125nm enumC1125nm2 = enumC1125nm;
                        AbstractC3367j.m5100e(enumC1125nm2, "protocol");
                        String str13 = str9;
                        AbstractC3367j.m5100e(str13, "publicApiHost");
                        String str14 = str10;
                        AbstractC3367j.m5100e(str14, "apiV4Token");
                        C1001jm c1001jm2 = C1001jm.this;
                        c1001jm2.m1616b();
                        String m2015c = AbstractC1155ol.m2015c(str12);
                        if (!AbstractC1155ol.m2014b(m2015c)) {
                            C1701c0 c1701c0 = c1001jm2.f5111d;
                            c1701c0.m2752j(null, C1156om.m2016a((C1156om) c1701c0.getValue(), null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, "目标地址无效", 98303));
                        } else {
                            c1001jm2.f5109b.set(true);
                            c1001jm2.f5110c = AbstractC0525d0.m1141s(c1001jm2.f5108a, null, new C0971im(enumC1125nm2, c1001jm2, m2015c, i10, str11, m2044U, i9, z7, applicationContext, str13, str14, null), 3);
                        }
                        return C1694m.f10482a;
                    }
                };
                c2395p.m3877j0(obj9);
                m3847O20 = obj9;
            }
            InterfaceC3279c interfaceC3279c10 = (InterfaceC3279c) m3847O20;
            c2395p.m3888r(false);
            c2395p.m3857Z(451105234);
            boolean m3874i8 = c2395p.m3874i(c1001jm);
            Object m3847O21 = c2395p.m3847O();
            if (m3874i8 || m3847O21 == obj8) {
                Object c0363g2 = new C0363g(0, c1001jm, C1001jm.class, "stop", "stop()V", 0, 0, 1);
                c2395p.m3877j0(c0363g2);
                m3847O21 = c0363g2;
            }
            c2395p.m3888r(false);
            AbstractC1172p7.m2027D(fillElement6, this.f5407e, this.f5408f, this.f5409g, this.f5410h, this.f5411i, this.f5412j, this.f5413k, this.f5414l, this.f5415m, this.f5416n, this.f5417o, list5, str5, interfaceC3279c9, interfaceC3277a9, interfaceC3279c10, (InterfaceC3277a) ((AbstractC3365h) m3847O21), c2395p, 70);
            c2395p.m3888r(false);
        }
        return C1694m.f10482a;
    }
}
