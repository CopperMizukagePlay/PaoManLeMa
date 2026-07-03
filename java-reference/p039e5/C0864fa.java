package p039e5;

import android.content.Context;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0070r0;
import p018c0.C0334d;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p060h5.C1815w;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fa */
/* loaded from: classes.dex */
public final class C0864fa extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ C3472s f3958A;

    /* renamed from: B */
    public final /* synthetic */ Context f3959B;

    /* renamed from: C */
    public final /* synthetic */ InterfaceC2425y0 f3960C;

    /* renamed from: D */
    public final /* synthetic */ InterfaceC2425y0 f3961D;

    /* renamed from: E */
    public final /* synthetic */ InterfaceC2425y0 f3962E;

    /* renamed from: F */
    public final /* synthetic */ C3472s f3963F;

    /* renamed from: i */
    public List f3964i;

    /* renamed from: j */
    public C3472s f3965j;

    /* renamed from: k */
    public C3472s f3966k;

    /* renamed from: l */
    public C3472s f3967l;

    /* renamed from: m */
    public Context f3968m;

    /* renamed from: n */
    public InterfaceC2425y0 f3969n;

    /* renamed from: o */
    public InterfaceC2425y0 f3970o;

    /* renamed from: p */
    public Iterator f3971p;

    /* renamed from: q */
    public String f3972q;

    /* renamed from: r */
    public List f3973r;

    /* renamed from: s */
    public boolean f3974s;

    /* renamed from: t */
    public int f3975t;

    /* renamed from: u */
    public /* synthetic */ Object f3976u;

    /* renamed from: v */
    public final /* synthetic */ List f3977v;

    /* renamed from: w */
    public final /* synthetic */ C3472s f3978w;

    /* renamed from: x */
    public final /* synthetic */ InterfaceC0516a0 f3979x;

    /* renamed from: y */
    public final /* synthetic */ C3472s f3980y;

    /* renamed from: z */
    public final /* synthetic */ boolean f3981z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0864fa(List list, C3472s c3472s, InterfaceC0516a0 interfaceC0516a0, C3472s c3472s2, boolean z7, C3472s c3472s3, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, C3472s c3472s4, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3977v = list;
        this.f3978w = c3472s;
        this.f3979x = interfaceC0516a0;
        this.f3980y = c3472s2;
        this.f3981z = z7;
        this.f3958A = c3472s3;
        this.f3959B = context;
        this.f3960C = interfaceC2425y0;
        this.f3961D = interfaceC2425y02;
        this.f3962E = interfaceC2425y03;
        this.f3963F = c3472s4;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0864fa) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C0864fa c0864fa = new C0864fa(this.f3977v, this.f3978w, this.f3979x, this.f3980y, this.f3981z, this.f3958A, this.f3959B, this.f3960C, this.f3961D, this.f3962E, this.f3963F, interfaceC2313c);
        c0864fa.f3976u = obj;
        return c0864fa;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:80|81|(2:82|(7:84|85|86|87|(1:89)|90|(2:93|94)(1:92))(2:124|125))|95|(1:97)(1:120)|(1:99)|100|101|102|(2:112|(1:114)(1:115))(1:104)|105|106|(1:108)|109|(8:111|6|(0)(0)|20|(0)|75|76|(4:127|(5:129|(1:131)|132|133|(1:135))|136|137)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e8, code lost:
    
        r13 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cb A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:102:0x01c0, B:104:0x01cb, B:105:0x01e2, B:112:0x01d2), top: B:101:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:102:0x01c0, B:104:0x01cb, B:105:0x01e2, B:112:0x01d2), top: B:101:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v31, types: [v0.s] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0233 -> B:6:0x023a). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        List list;
        Iterator it;
        C3472s c3472s;
        boolean z7;
        C3472s c3472s2;
        InterfaceC2425y0 interfaceC2425y0;
        C3472s c3472s3;
        InterfaceC2425y0 interfaceC2425y02;
        Context context;
        Object m2985m;
        EnumC2465a enumC2465a;
        InterfaceC2425y0 interfaceC2425y03;
        C3472s c3472s4;
        String str;
        Context context2;
        InterfaceC2425y0 interfaceC2425y04;
        InterfaceC2425y0 interfaceC2425y05;
        Iterator it2;
        String str2;
        Object obj2;
        C3472s c3472s5;
        Context context3;
        C3472s c3472s6;
        boolean z8;
        C3472s c3472s7;
        Iterator it3;
        C0781cm c0781cm;
        C0781cm c0781cm2;
        String str3;
        Object m2985m2;
        Object m1122A;
        URI uri;
        int i7;
        Object m2985m3;
        C1813u c1813u;
        InterfaceC0516a0 interfaceC0516a02;
        List list2;
        InterfaceC2425y0 interfaceC2425y06;
        ?? r22;
        Object next;
        long j6;
        long j7;
        Set set;
        int i8 = this.f3975t;
        InterfaceC2425y0 interfaceC2425y07 = this.f3961D;
        Context context4 = this.f3959B;
        C3472s c3472s8 = this.f3978w;
        String str4 = "";
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    boolean z9 = this.f3974s;
                    List list3 = this.f3973r;
                    str2 = this.f3972q;
                    it2 = this.f3971p;
                    InterfaceC2425y0 interfaceC2425y08 = this.f3970o;
                    InterfaceC2425y0 interfaceC2425y09 = this.f3969n;
                    Context context5 = this.f3968m;
                    C3472s c3472s9 = this.f3967l;
                    C3472s c3472s10 = this.f3966k;
                    C3472s c3472s11 = this.f3965j;
                    List list4 = this.f3964i;
                    InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f3976u;
                    AbstractC1793a0.m2972L(obj);
                    c3472s4 = c3472s8;
                    C3472s c3472s12 = c3472s9;
                    c3472s = c3472s11;
                    list = list4;
                    interfaceC2425y03 = interfaceC2425y07;
                    context2 = context4;
                    List list5 = list3;
                    InterfaceC2425y0 interfaceC2425y010 = interfaceC2425y08;
                    interfaceC2425y02 = interfaceC2425y09;
                    enumC2465a = enumC2465a2;
                    z7 = z9;
                    str = "";
                    context3 = context5;
                    ?? r13 = c3472s10;
                    interfaceC0516a0 = interfaceC0516a03;
                    m1122A = obj;
                    c3472s.putAll((Map) m1122A);
                    C1813u c1813u2 = C1813u.f10860e;
                    if (z7) {
                        List list6 = (List) r13.get(str2);
                        if (list6 == null) {
                            list6 = c1813u2;
                        }
                        ArrayList m3058v0 = AbstractC1805m.m3058v0(list6, list5);
                        c1813u = c1813u2;
                        HashSet hashSet = new HashSet();
                        interfaceC0516a02 = interfaceC0516a0;
                        r22 = new ArrayList();
                        list2 = list5;
                        int size = m3058v0.size();
                        interfaceC2425y06 = interfaceC2425y010;
                        int i9 = 0;
                        while (i9 < size) {
                            int i10 = size;
                            Object obj3 = m3058v0.get(i9);
                            int i11 = i9 + 1;
                            if (hashSet.add(((C0877fn) obj3).f4045a)) {
                                r22.add(obj3);
                            }
                            size = i10;
                            i9 = i11;
                        }
                    } else {
                        c1813u = c1813u2;
                        interfaceC0516a02 = interfaceC0516a0;
                        list2 = list5;
                        interfaceC2425y06 = interfaceC2425y010;
                        r22 = list2;
                    }
                    r13.put(str2, r22);
                    int ordinal = ((EnumC1390w8) interfaceC2425y06.getValue()).ordinal();
                    Set set2 = C1815w.f10862e;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                if (z7) {
                                    Set set3 = (Set) c3472s12.get(str2);
                                    if (set3 != null) {
                                        set2 = set3;
                                    }
                                    ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list2));
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList.add(((C0877fn) it4.next()).f4045a);
                                    }
                                    set2 = AbstractC1793a0.m2967G(set2, arrayList);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList2.add(((C0877fn) it5.next()).f4045a);
                                    }
                                    set2 = AbstractC1805m.m3038F0(arrayList2);
                                }
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            List list7 = (List) r13.get(str2);
                            if (list7 == null) {
                                list7 = c1813u;
                            }
                            Iterator it6 = list7.iterator();
                            if (!it6.hasNext()) {
                                next = null;
                            } else {
                                next = it6.next();
                                if (it6.hasNext()) {
                                    Long l7 = (Long) c3472s.get(((C0877fn) next).f4045a);
                                    if (l7 != null) {
                                        j6 = l7.longValue();
                                    } else {
                                        j6 = Long.MAX_VALUE;
                                    }
                                    do {
                                        Object next2 = it6.next();
                                        Long l8 = (Long) c3472s.get(((C0877fn) next2).f4045a);
                                        if (l8 != null) {
                                            j7 = l8.longValue();
                                        } else {
                                            j7 = Long.MAX_VALUE;
                                        }
                                        if (j6 > j7) {
                                            next = next2;
                                            j6 = j7;
                                        }
                                    } while (it6.hasNext());
                                }
                            }
                            C0877fn c0877fn = (C0877fn) next;
                            if (c0877fn != null) {
                                set = AbstractC1793a0.m2970J(c0877fn.f4045a);
                            } else {
                                set = null;
                            }
                            if (set != null) {
                                set2 = set;
                            }
                        }
                    }
                    c3472s12.put(str2, set2);
                    c3472s2 = c3472s12;
                    it = it2;
                    enumC2465a2 = enumC2465a;
                    context4 = context2;
                    c3472s8 = c3472s4;
                    interfaceC2425y07 = interfaceC2425y03;
                    interfaceC0516a0 = interfaceC0516a02;
                    interfaceC2425y0 = interfaceC2425y06;
                    context = context3;
                    str4 = str;
                    c3472s3 = r13;
                    if (it.hasNext()) {
                        String str5 = (String) it.next();
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        C3472s c3472s13 = c3472s3;
                        ExecutorC2324d executorC2324d = ExecutorC2324d.f13302g;
                        InterfaceC2425y0 interfaceC2425y011 = interfaceC2425y0;
                        c3472s4 = c3472s8;
                        z8 = z7;
                        interfaceC2425y03 = interfaceC2425y07;
                        context2 = context4;
                        C3472s c3472s14 = c3472s2;
                        Context context6 = context;
                        c3472s7 = c3472s13;
                        str = str4;
                        C0070r0 c0070r0 = new C0070r0(context6, str5, interfaceC2425y02, null, 4);
                        this.f3976u = interfaceC0516a0;
                        this.f3964i = list;
                        this.f3965j = c3472s;
                        this.f3966k = c3472s7;
                        this.f3967l = c3472s14;
                        this.f3968m = context6;
                        this.f3969n = interfaceC2425y02;
                        this.f3970o = interfaceC2425y011;
                        this.f3971p = it;
                        this.f3972q = str5;
                        this.f3973r = null;
                        this.f3974s = z8;
                        this.f3975t = 1;
                        obj2 = AbstractC0525d0.m1122A(executorC2324d, c0070r0, this);
                        enumC2465a = enumC2465a2;
                        if (obj2 != enumC2465a) {
                            C3472s c3472s15 = c3472s;
                            c3472s5 = c3472s14;
                            c3472s6 = c3472s15;
                            interfaceC2425y04 = interfaceC2425y02;
                            interfaceC2425y05 = interfaceC2425y011;
                            context3 = context6;
                            str2 = str5;
                            it2 = it;
                            List list8 = (List) obj2;
                            it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    ?? next3 = it3.next();
                                    try {
                                    } catch (Throwable th) {
                                        m2985m3 = AbstractC1793a0.m2985m(th);
                                    }
                                    m2985m3 = Boolean.valueOf(AbstractC3367j.m5096a(new URI(((C0781cm) next3).f3166a).getHost(), str2));
                                    Object obj4 = Boolean.FALSE;
                                    if (m2985m3 instanceof C1689h) {
                                        m2985m3 = obj4;
                                    }
                                    if (((Boolean) m2985m3).booleanValue()) {
                                        c0781cm = next3;
                                        break;
                                    }
                                } else {
                                    c0781cm = null;
                                    break;
                                }
                            }
                            c0781cm2 = c0781cm;
                            if (c0781cm2 == null) {
                                str3 = c0781cm2.f3166a;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = str;
                            }
                            EnumC2465a enumC2465a3 = enumC2465a;
                            uri = new URI(str3);
                            if (uri.getPort() > 0) {
                                i7 = uri.getPort();
                            } else if (AbstractC0451r.m966H(uri.getScheme(), "http")) {
                                i7 = 80;
                            } else {
                                i7 = 443;
                            }
                            m2985m2 = new Integer(i7);
                            Object num = new Integer(443);
                            if (m2985m2 instanceof C1689h) {
                                m2985m2 = num;
                            }
                            int intValue = ((Number) m2985m2).intValue();
                            C2325e c2325e2 = AbstractC0549l0.f1898a;
                            ExecutorC2324d executorC2324d2 = ExecutorC2324d.f13302g;
                            boolean z10 = z8;
                            C0832ea c0832ea = new C0832ea(list8, intValue, null, 0);
                            this.f3976u = interfaceC0516a0;
                            this.f3964i = list;
                            this.f3965j = c3472s6;
                            this.f3966k = c3472s7;
                            this.f3967l = c3472s5;
                            this.f3968m = context3;
                            this.f3969n = interfaceC2425y04;
                            this.f3970o = interfaceC2425y05;
                            this.f3971p = it2;
                            this.f3972q = str2;
                            this.f3973r = list8;
                            this.f3974s = z10;
                            this.f3975t = 2;
                            m1122A = AbstractC0525d0.m1122A(executorC2324d2, c0832ea, this);
                            enumC2465a = enumC2465a3;
                            if (m1122A != enumC2465a) {
                                r13 = c3472s7;
                                list5 = list8;
                                z7 = z10;
                                c3472s12 = c3472s5;
                                c3472s = c3472s6;
                                interfaceC2425y010 = interfaceC2425y05;
                                interfaceC2425y02 = interfaceC2425y04;
                                c3472s.putAll((Map) m1122A);
                                C1813u c1813u22 = C1813u.f10860e;
                                if (z7) {
                                }
                                r13.put(str2, r22);
                                int ordinal2 = ((EnumC1390w8) interfaceC2425y06.getValue()).ordinal();
                                Set set22 = C1815w.f10862e;
                                if (ordinal2 != 0) {
                                }
                                c3472s12.put(str2, set22);
                                c3472s2 = c3472s12;
                                it = it2;
                                enumC2465a2 = enumC2465a;
                                context4 = context2;
                                c3472s8 = c3472s4;
                                interfaceC2425y07 = interfaceC2425y03;
                                interfaceC0516a0 = interfaceC0516a02;
                                interfaceC2425y0 = interfaceC2425y06;
                                context = context3;
                                str4 = str;
                                c3472s3 = r13;
                                if (it.hasNext()) {
                                    C3472s c3472s16 = c3472s8;
                                    Context context7 = context4;
                                    this.f3962E.setValue(Boolean.FALSE);
                                    if (((EnumC1390w8) interfaceC2425y07.getValue()) == EnumC1390w8.f8311g) {
                                        ArrayList m3074V = AbstractC1807o.m3074V(c3472s16.f16740h);
                                        ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(m3074V));
                                        int size2 = m3074V.size();
                                        int i12 = 0;
                                        while (i12 < size2) {
                                            Object obj5 = m3074V.get(i12);
                                            i12++;
                                            arrayList3.add(((C0877fn) obj5).f4045a);
                                        }
                                        List m3042f0 = AbstractC1805m.m3042f0(arrayList3);
                                        if (!m3042f0.isEmpty()) {
                                            AbstractC0525d0.m1141s(this.f3979x, null, new C0334d(context7, m3042f0, this.f3963F, null, 5), 3);
                                        }
                                    }
                                    return C1694m.f10482a;
                                }
                            }
                        }
                        return enumC2465a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                boolean z11 = this.f3974s;
                String str6 = this.f3972q;
                Iterator it7 = this.f3971p;
                InterfaceC2425y0 interfaceC2425y012 = this.f3970o;
                InterfaceC2425y0 interfaceC2425y013 = this.f3969n;
                Context context8 = this.f3968m;
                C3472s c3472s17 = this.f3967l;
                C3472s c3472s18 = this.f3966k;
                C3472s c3472s19 = this.f3965j;
                List list9 = this.f3964i;
                InterfaceC0516a0 interfaceC0516a04 = (InterfaceC0516a0) this.f3976u;
                AbstractC1793a0.m2972L(obj);
                it2 = it7;
                c3472s5 = c3472s17;
                interfaceC2425y03 = interfaceC2425y07;
                c3472s4 = c3472s8;
                context2 = context4;
                c3472s7 = c3472s18;
                c3472s6 = c3472s19;
                z8 = z11;
                str = "";
                interfaceC2425y05 = interfaceC2425y012;
                context3 = context8;
                list = list9;
                enumC2465a = enumC2465a2;
                str2 = str6;
                interfaceC2425y04 = interfaceC2425y013;
                obj2 = obj;
                interfaceC0516a0 = interfaceC0516a04;
                List list82 = (List) obj2;
                it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                c0781cm2 = c0781cm;
                if (c0781cm2 == null) {
                }
                if (str3 == null) {
                }
                EnumC2465a enumC2465a32 = enumC2465a;
                uri = new URI(str3);
                if (uri.getPort() > 0) {
                }
                m2985m2 = new Integer(i7);
                Object num2 = new Integer(443);
                if (m2985m2 instanceof C1689h) {
                }
                int intValue2 = ((Number) m2985m2).intValue();
                C2325e c2325e22 = AbstractC0549l0.f1898a;
                ExecutorC2324d executorC2324d22 = ExecutorC2324d.f13302g;
                boolean z102 = z8;
                C0832ea c0832ea2 = new C0832ea(list82, intValue2, null, 0);
                this.f3976u = interfaceC0516a0;
                this.f3964i = list;
                this.f3965j = c3472s6;
                this.f3966k = c3472s7;
                this.f3967l = c3472s5;
                this.f3968m = context3;
                this.f3969n = interfaceC2425y04;
                this.f3970o = interfaceC2425y05;
                this.f3971p = it2;
                this.f3972q = str2;
                this.f3973r = list82;
                this.f3974s = z102;
                this.f3975t = 2;
                m1122A = AbstractC0525d0.m1122A(executorC2324d22, c0832ea2, this);
                enumC2465a = enumC2465a32;
                if (m1122A != enumC2465a) {
                }
                return enumC2465a;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC0516a0 = (InterfaceC0516a0) this.f3976u;
            list = this.f3977v;
            ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(list));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                try {
                    m2985m = new URI(((C0781cm) it8.next()).f3166a).getHost();
                    if (m2985m == null) {
                        m2985m = "";
                    }
                } catch (Throwable th2) {
                    m2985m = AbstractC1793a0.m2985m(th2);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = "";
                }
                arrayList4.add((String) m2985m);
            }
            List m3042f02 = AbstractC1805m.m3042f0(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : m3042f02) {
                if (!AbstractC0444k.m937a0((String) obj6)) {
                    arrayList5.add(obj6);
                }
            }
            it = arrayList5.iterator();
            c3472s = this.f3980y;
            z7 = this.f3981z;
            c3472s2 = this.f3958A;
            interfaceC2425y0 = interfaceC2425y07;
            c3472s3 = c3472s8;
            interfaceC2425y02 = this.f3960C;
            context = context4;
            if (it.hasNext()) {
            }
        }
    }
}
