package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p158u5.C3379v;
import p195z5.C3877b;
import p195z5.C3878c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.st */
/* loaded from: classes.dex */
public final class C1287st extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ C1473yt f7668A;

    /* renamed from: B */
    public final /* synthetic */ int f7669B;

    /* renamed from: C */
    public final /* synthetic */ String f7670C;

    /* renamed from: D */
    public final /* synthetic */ String f7671D;

    /* renamed from: E */
    public final /* synthetic */ C1381w f7672E;

    /* renamed from: F */
    public final /* synthetic */ boolean f7673F;

    /* renamed from: G */
    public final /* synthetic */ Network f7674G;

    /* renamed from: H */
    public final /* synthetic */ Context f7675H;

    /* renamed from: i */
    public C3379v f7676i;

    /* renamed from: j */
    public List f7677j;

    /* renamed from: k */
    public C3377t f7678k;

    /* renamed from: l */
    public C3377t f7679l;

    /* renamed from: m */
    public C1473yt f7680m;

    /* renamed from: n */
    public String f7681n;

    /* renamed from: o */
    public String f7682o;

    /* renamed from: p */
    public C1194pt f7683p;

    /* renamed from: q */
    public InterfaceC3279c f7684q;

    /* renamed from: r */
    public Network f7685r;

    /* renamed from: s */
    public Context f7686s;

    /* renamed from: t */
    public int f7687t;

    /* renamed from: u */
    public int f7688u;

    /* renamed from: v */
    public int f7689v;

    /* renamed from: w */
    public boolean f7690w;

    /* renamed from: x */
    public int f7691x;

    /* renamed from: y */
    public /* synthetic */ Object f7692y;

    /* renamed from: z */
    public final /* synthetic */ C1194pt f7693z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287st(C1194pt c1194pt, C1473yt c1473yt, int i7, String str, String str2, C1381w c1381w, boolean z7, Network network, Context context, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7693z = c1194pt;
        this.f7668A = c1473yt;
        this.f7669B = i7;
        this.f7670C = str;
        this.f7671D = str2;
        this.f7672E = c1381w;
        this.f7673F = z7;
        this.f7674G = network;
        this.f7675H = context;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1287st) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1287st c1287st = new C1287st(this.f7693z, this.f7668A, this.f7669B, this.f7670C, this.f7671D, this.f7672E, this.f7673F, this.f7674G, this.f7675H, interfaceC2313c);
        c1287st.f7692y = obj;
        return c1287st;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01b2  */
    /* JADX WARN: Type inference failed for: r11v17, types: [t5.c] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [u5.t] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r6v1, types: [u5.t] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x018b -> B:5:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x022d -> B:21:0x024b). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7;
        boolean z7;
        ArrayList arrayList;
        int i8;
        String str;
        C1381w c1381w;
        InterfaceC0516a0 interfaceC0516a0;
        Context context;
        C1194pt c1194pt;
        String str2;
        Network network;
        int i9;
        C3377t c3377t;
        int i10;
        C1473yt c1473yt;
        C3377t c3377t2;
        C3379v c3379v;
        int i11 = this.f7691x;
        C1473yt c1473yt2 = this.f7668A;
        String str3 = "*";
        if (i11 != 0) {
            if (i11 == 1) {
                int i12 = this.f7689v;
                boolean z8 = this.f7690w;
                int i13 = this.f7688u;
                int i14 = this.f7687t;
                Context context2 = this.f7686s;
                Network network2 = this.f7685r;
                ?? r11 = this.f7684q;
                C1194pt c1194pt2 = this.f7683p;
                String str4 = this.f7682o;
                String str5 = this.f7681n;
                C1473yt c1473yt3 = this.f7680m;
                C3377t c3377t3 = this.f7679l;
                C3377t c3377t4 = this.f7678k;
                ?? r12 = this.f7677j;
                C3379v c3379v2 = this.f7676i;
                InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f7692y;
                AbstractC1793a0.m2972L(obj);
                String str6 = "*";
                int i15 = i13;
                Network network3 = network2;
                C1194pt c1194pt3 = c1194pt2;
                String str7 = str4;
                C1473yt c1473yt4 = c1473yt3;
                C3377t c3377t5 = c3377t3;
                C3377t c3377t6 = c3377t4;
                Context context3 = context2;
                String str8 = str5;
                C3379v c3379v3 = c3379v2;
                z7 = z8;
                int i16 = i14;
                ArrayList arrayList2 = r12;
                int i17 = i12;
                C1473yt c1473yt5 = c1473yt2;
                C1381w c1381w2 = r11;
                InterfaceC0516a0 interfaceC0516a03 = interfaceC0516a02;
                Object m1126d = obj;
                int i18 = c3377t6.f16449e;
                c1194pt3.getClass();
                c3377t6.f16449e = i18 + 5;
                Iterator it = ((List) m1126d).iterator();
                while (it.hasNext()) {
                    C1225qt c1225qt = (C1225qt) it.next();
                    boolean z9 = c1225qt.f7188c;
                    Iterator it2 = it;
                    String str9 = c1225qt.f7186a;
                    if (z9) {
                        c3377t5.f16449e++;
                        InterfaceC0516a0 interfaceC0516a04 = interfaceC0516a03;
                        String str10 = str6;
                        if (AbstractC3367j.m5096a(c3379v3.f16451e, str10) && !str9.equals(str10)) {
                            c3379v3.f16451e = str9;
                        }
                        C1381w c1381w3 = c1381w2;
                        int i19 = i15;
                        double d7 = c1225qt.f7187b;
                        if (d7 > 0.0d) {
                            arrayList2.add(new Double(d7));
                        }
                        i15 = i19;
                        c1381w2 = c1381w3;
                        str6 = str10;
                        interfaceC0516a03 = interfaceC0516a04;
                    }
                    it = it2;
                }
                C1381w c1381w4 = c1381w2;
                int i20 = i15;
                InterfaceC0516a0 interfaceC0516a05 = interfaceC0516a03;
                String str11 = str6;
                C1473yt c1473yt6 = c1473yt4;
                c1381w4.mo23f(C1473yt.m2430a(c1473yt6, i20, (String) c3379v3.f16451e, arrayList2, c3377t6.f16449e, c3377t5.f16449e, str8, str7));
                str2 = str7;
                c1194pt = c1194pt3;
                interfaceC0516a0 = interfaceC0516a05;
                str = str8;
                c1473yt = c1473yt6;
                C3377t c3377t7 = c3377t5;
                network = network3;
                arrayList = arrayList2;
                C3377t c3377t8 = c3377t6;
                context = context3;
                C1381w c1381w5 = c1381w4;
                int i21 = i17;
                i8 = i20;
                i10 = i16;
                i7 = 1;
                C3379v c3379v4 = c3379v3;
                i9 = i21 + 1;
                str3 = str11;
                c1381w = c1381w5;
                c3377t = c3377t7;
                c1473yt2 = c1473yt5;
                c3379v = c3379v4;
                c3377t2 = c3377t8;
                if (i9 >= i10) {
                    c1473yt5 = c1473yt2;
                    if (!c1473yt.f9793b.get()) {
                        return C1473yt.m2430a(c1473yt, i8, (String) c3379v.f16451e, arrayList, c3377t2.f16449e, c3377t.f16449e, str, str2);
                    }
                    C1473yt c1473yt7 = c1473yt;
                    int i22 = i10;
                    C3377t c3377t9 = c3377t2;
                    ArrayList arrayList3 = arrayList;
                    if (AbstractC3367j.m5096a(c3379v.f16451e, str3)) {
                        c1194pt.getClass();
                        String str12 = str2;
                        int i23 = i7;
                        C3877b c3877b = new C3877b(i23, 5, i23);
                        ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(c3877b));
                        Iterator it3 = c3877b.iterator();
                        C3377t c3377t10 = c3377t;
                        while (true) {
                            C3878c c3878c = (C3878c) it3;
                            if (!c3878c.f18168g) {
                                break;
                            }
                            c3878c.nextInt();
                            C2325e c2325e = AbstractC0549l0.f1898a;
                            C1381w c1381w6 = c1381w;
                            boolean z10 = z7;
                            String str13 = str12;
                            String str14 = str3;
                            C3377t c3377t11 = c3377t9;
                            int i24 = i22;
                            int i25 = i8;
                            int i26 = i9;
                            ArrayList arrayList5 = arrayList4;
                            arrayList5.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C1256rt(c1473yt7, str13, i25, c1194pt, z10, network, context, (InterfaceC2313c) null), 2));
                            z7 = z10;
                            c1381w = c1381w6;
                            c3377t10 = c3377t10;
                            arrayList4 = arrayList5;
                            str12 = str13;
                            i9 = i26;
                            i8 = i25;
                            i22 = i24;
                            c3377t9 = c3377t11;
                            str3 = str14;
                        }
                        str6 = str3;
                        C1381w c1381w7 = c1381w;
                        boolean z11 = z7;
                        C3377t c3377t12 = c3377t9;
                        String str15 = str12;
                        i16 = i22;
                        C3377t c3377t13 = c3377t10;
                        int i27 = i8;
                        i17 = i9;
                        ArrayList arrayList6 = arrayList4;
                        c1473yt4 = c1473yt7;
                        this.f7692y = interfaceC0516a0;
                        this.f7676i = c3379v;
                        this.f7677j = arrayList3;
                        this.f7678k = c3377t12;
                        this.f7679l = c3377t13;
                        this.f7680m = c1473yt4;
                        String str16 = str;
                        this.f7681n = str16;
                        this.f7682o = str15;
                        this.f7683p = c1194pt;
                        this.f7684q = c1381w7;
                        this.f7685r = network;
                        this.f7686s = context;
                        this.f7687t = i16;
                        this.f7688u = i27;
                        this.f7690w = z11;
                        this.f7689v = i17;
                        this.f7691x = 1;
                        m1126d = AbstractC0525d0.m1126d(arrayList6, this);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m1126d == enumC2465a) {
                            return enumC2465a;
                        }
                        Network network4 = network;
                        c3377t5 = c3377t13;
                        arrayList2 = arrayList3;
                        network3 = network4;
                        c1194pt3 = c1194pt;
                        c1381w2 = c1381w7;
                        str7 = str15;
                        context3 = context;
                        c3377t6 = c3377t12;
                        i15 = i27;
                        str8 = str16;
                        z7 = z11;
                        interfaceC0516a03 = interfaceC0516a0;
                        c3379v3 = c3379v;
                        int i182 = c3377t6.f16449e;
                        c1194pt3.getClass();
                        c3377t6.f16449e = i182 + 5;
                        Iterator it4 = ((List) m1126d).iterator();
                        while (it4.hasNext()) {
                        }
                        C1381w c1381w42 = c1381w2;
                        int i202 = i15;
                        InterfaceC0516a0 interfaceC0516a052 = interfaceC0516a03;
                        String str112 = str6;
                        C1473yt c1473yt62 = c1473yt4;
                        c1381w42.mo23f(C1473yt.m2430a(c1473yt62, i202, (String) c3379v3.f16451e, arrayList2, c3377t6.f16449e, c3377t5.f16449e, str8, str7));
                        str2 = str7;
                        c1194pt = c1194pt3;
                        interfaceC0516a0 = interfaceC0516a052;
                        str = str8;
                        c1473yt = c1473yt62;
                        C3377t c3377t72 = c3377t5;
                        network = network3;
                        arrayList = arrayList2;
                        C3377t c3377t82 = c3377t6;
                        context = context3;
                        C1381w c1381w52 = c1381w42;
                        int i212 = i17;
                        i8 = i202;
                        i10 = i16;
                        i7 = 1;
                        C3379v c3379v42 = c3379v3;
                        i9 = i212 + 1;
                        str3 = str112;
                        c1381w = c1381w52;
                        c3377t = c3377t72;
                        c1473yt2 = c1473yt5;
                        c3379v = c3379v42;
                        c3377t2 = c3377t82;
                        if (i9 >= i10) {
                            return C1473yt.m2430a(c1473yt2, this.f7669B, (String) c3379v.f16451e, arrayList, c3377t2.f16449e, c3377t.f16449e, this.f7670C, this.f7671D);
                        }
                    } else {
                        arrayList = arrayList3;
                        C3377t c3377t14 = c3377t;
                        c1381w52 = c1381w;
                        str112 = str3;
                        c3377t72 = c3377t14;
                        z7 = z7;
                        c3377t82 = c3377t9;
                        i212 = i9;
                        i8 = i8;
                        c1473yt = c1473yt7;
                        i7 = 1;
                        i10 = i22;
                        c3379v42 = c3379v;
                        i9 = i212 + 1;
                        str3 = str112;
                        c1381w = c1381w52;
                        c3377t = c3377t72;
                        c1473yt2 = c1473yt5;
                        c3379v = c3379v42;
                        c3377t2 = c3377t82;
                        if (i9 >= i10) {
                        }
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            i7 = 1;
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a06 = (InterfaceC0516a0) this.f7692y;
            ?? obj2 = new Object();
            obj2.f16451e = "*";
            ArrayList arrayList7 = new ArrayList();
            Object obj3 = new Object();
            Object obj4 = new Object();
            C1194pt c1194pt4 = this.f7693z;
            int i28 = c1194pt4.f6956a + 1;
            int i29 = this.f7669B;
            String str17 = this.f7670C;
            String str18 = this.f7671D;
            C1381w c1381w8 = this.f7672E;
            z7 = this.f7673F;
            Network network5 = this.f7674G;
            arrayList = arrayList7;
            i8 = i29;
            str = str17;
            c1381w = c1381w8;
            interfaceC0516a0 = interfaceC0516a06;
            context = this.f7675H;
            c1194pt = c1194pt4;
            str2 = str18;
            network = network5;
            i9 = 0;
            c3377t = obj4;
            i10 = i28;
            c1473yt = c1473yt2;
            c3379v = obj2;
            c3377t2 = obj3;
            if (i9 >= i10) {
            }
        }
    }
}
