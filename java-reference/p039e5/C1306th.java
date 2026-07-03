package p039e5;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0062p0;
import p001a0.C0066q0;
import p008b.C0230e0;
import p015b6.C0310q;
import p024c6.AbstractC0444k;
import p024c6.C0453t;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0541i1;
import p032d6.C0584x;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0534g0;
import p032d6.InterfaceC0585x0;
import p047f6.AbstractC1555j;
import p047f6.C1547b;
import p047f6.C1548c;
import p047f6.C1554i;
import p047f6.InterfaceC1552g;
import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p071j0.C2159x;
import p071j0.C2160y;
import p077k.C2196i0;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2316f;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p091l6.C2472c;
import p091l6.InterfaceC2470a;
import p098m5.AbstractC2590j;
import p099m6.C2623x;
import p107o.EnumC2788y0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.C3469p;
import p170w1.C3715p2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.th */
/* loaded from: classes.dex */
public final class C1306th extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f7812i;

    /* renamed from: j */
    public int f7813j;

    /* renamed from: k */
    public Object f7814k;

    /* renamed from: l */
    public Object f7815l;

    /* renamed from: m */
    public Object f7816m;

    /* renamed from: n */
    public Object f7817n;

    /* renamed from: o */
    public Object f7818o;

    /* renamed from: p */
    public /* synthetic */ Object f7819p;

    /* renamed from: q */
    public final /* synthetic */ Object f7820q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306th(Context context, InterfaceC2313c interfaceC2313c, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, C3469p c3469p) {
        super(2, interfaceC2313c);
        this.f7812i = 1;
        this.f7819p = context;
        this.f7814k = interfaceC2425y0;
        this.f7815l = interfaceC2425y02;
        this.f7816m = interfaceC2425y03;
        this.f7817n = interfaceC2425y04;
        this.f7820q = c3469p;
        this.f7818o = interfaceC2425y05;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f7812i) {
            case 0:
                return ((C1306th) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C1306th) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C1306th) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 3:
                return ((C1306th) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 4:
                return ((C1306th) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15761f /* 5 */:
                ((C1306th) mo28k((InterfaceC1704e) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            default:
                return ((C1306th) mo28k((InterfaceC1704e) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [t5.c, m5.j] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f7812i) {
            case 0:
                return new C1306th((String) this.f7819p, (String) this.f7820q, (InterfaceC2425y0) this.f7815l, (InterfaceC2425y0) this.f7816m, (InterfaceC2425y0) this.f7817n, (InterfaceC2425y0) this.f7818o, interfaceC2313c);
            case 1:
                return new C1306th((Context) this.f7819p, interfaceC2313c, (InterfaceC2425y0) this.f7814k, (InterfaceC2425y0) this.f7815l, (InterfaceC2425y0) this.f7816m, (InterfaceC2425y0) this.f7817n, (InterfaceC2425y0) this.f7818o, (C3469p) this.f7820q);
            case 2:
                return new C1306th((Context) this.f7819p, (InterfaceC2425y0) this.f7814k, (InterfaceC2425y0) this.f7815l, (InterfaceC2425y0) this.f7816m, (InterfaceC0516a0) this.f7820q, (InterfaceC2425y0) this.f7817n, (InterfaceC2425y0) this.f7818o, interfaceC2313c);
            case 3:
                C1306th c1306th = new C1306th((List) this.f7816m, (C1248rl) this.f7817n, (InterfaceC3279c) this.f7818o, (String) this.f7819p, (String) this.f7820q, interfaceC2313c, 3);
                c1306th.f7815l = obj;
                return c1306th;
            case 4:
                C1306th c1306th2 = new C1306th((EnumC2788y0) this.f7818o, (C2160y) this.f7819p, (AbstractC2590j) this.f7820q, interfaceC2313c);
                c1306th2.f7817n = obj;
                return c1306th2;
            case AbstractC3122c.f15761f /* 5 */:
                C1306th c1306th3 = new C1306th((InterfaceC3277a) this.f7820q, interfaceC2313c);
                c1306th3.f7819p = obj;
                return c1306th3;
            default:
                C1306th c1306th4 = new C1306th((ContentResolver) this.f7816m, (Uri) this.f7817n, (C3715p2) this.f7818o, (C1548c) this.f7819p, (Context) this.f7820q, interfaceC2313c, 6);
                c1306th4.f7815l = obj;
                return c1306th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #7 {all -> 0x002d, blocks: (B:9:0x0028, B:11:0x005d, B:16:0x006a, B:18:0x0072, B:27:0x003f, B:30:0x0054), top: B:4:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:41:0x00c3, B:43:0x0174, B:47:0x018a, B:49:0x018f, B:52:0x0198, B:54:0x01ad, B:56:0x01bb, B:58:0x01c5, B:63:0x01d6, B:72:0x01e3, B:75:0x01ea, B:78:0x01f4, B:83:0x01fb, B:89:0x0215, B:91:0x021e, B:100:0x0243, B:101:0x0246, B:107:0x00e9, B:110:0x0106, B:117:0x0143, B:123:0x015a, B:132:0x0255, B:133:0x0258, B:85:0x020a, B:88:0x0212, B:96:0x023f, B:97:0x0242, B:119:0x014f, B:122:0x0157, B:129:0x0251, B:130:0x0254), top: B:35:0x00a5, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0247 A[LOOP:0: B:48:0x018d->B:80:0x0247, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v33, types: [t5.c] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f9 -> B:40:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x021c -> B:40:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0234 -> B:40:0x0235). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m1122A;
        Object m1122A2;
        String m3051o0;
        Object m1122A3;
        InterfaceC0534g0 m1125c;
        Object m1122A4;
        List<C0910go> list;
        Object m1162d;
        C2159x c2159x;
        InterfaceC2470a interfaceC2470a;
        ?? r52;
        C2160y c2160y;
        C2160y c2160y2;
        C2159x c2159x2;
        Object mo23f;
        InterfaceC2470a interfaceC2470a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        C0230e0 c0230e0;
        InterfaceC1704e interfaceC1704e;
        C2196i0 c2196i0;
        InterfaceC3279c c0310q;
        InterfaceC1552g m2510a;
        Object obj2;
        Object obj3;
        Set set;
        boolean z7;
        Object mo2496l;
        AbstractC3459f mo5202u;
        int i7;
        InterfaceC1704e interfaceC1704e2;
        C1547b c1547b;
        Object obj4;
        boolean z8 = false;
        int i8 = 2;
        switch (this.f7812i) {
            case 0:
                String str = (String) this.f7820q;
                String str2 = (String) this.f7819p;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f7817n;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f7815l;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f7818o;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f7816m;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i9 = this.f7813j;
                InterfaceC2313c interfaceC2313c = null;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            interfaceC2425y0 = (InterfaceC2425y0) this.f7814k;
                            AbstractC1793a0.m2972L(obj);
                            m1122A2 = obj;
                            float f7 = AbstractC1092mk.f5952h;
                            interfaceC2425y0.setValue((String) m1122A2);
                            interfaceC2425y03.setValue(Boolean.FALSE);
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2425y02 = (InterfaceC2425y0) this.f7814k;
                    AbstractC1793a0.m2972L(obj);
                    m1122A = obj;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (str2 != null && !AbstractC0444k.m937a0(str2)) {
                        float f8 = AbstractC1092mk.f5952h;
                        interfaceC2425y04.setValue(Boolean.TRUE);
                        C2623x c2623x = C1373vm.f8207a;
                        EnumC1342um enumC1342um = EnumC1342um.f7976e;
                        this.f7814k = interfaceC2425y02;
                        this.f7813j = 1;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(interfaceC2313c, enumC1342um, str2, interfaceC2313c, 4), this);
                        if (m1122A == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        float f9 = AbstractC1092mk.f5952h;
                        interfaceC2425y02.setValue(null);
                        interfaceC2425y04.setValue(Boolean.FALSE);
                        if (str == null && !AbstractC0444k.m937a0(str)) {
                            interfaceC2425y03.setValue(Boolean.TRUE);
                            C2623x c2623x2 = C1373vm.f8207a;
                            EnumC1342um enumC1342um2 = EnumC1342um.f7977f;
                            this.f7814k = interfaceC2425y0;
                            this.f7813j = 2;
                            C2325e c2325e2 = AbstractC0549l0.f1898a;
                            m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(interfaceC2313c, enumC1342um2, str, interfaceC2313c, 4), this);
                            if (m1122A2 == enumC2465a) {
                                return enumC2465a;
                            }
                            float f72 = AbstractC1092mk.f5952h;
                            interfaceC2425y0.setValue((String) m1122A2);
                            interfaceC2425y03.setValue(Boolean.FALSE);
                            return C1694m.f10482a;
                        }
                        interfaceC2425y0.setValue(null);
                        interfaceC2425y03.setValue(Boolean.FALSE);
                        return C1694m.f10482a;
                    }
                }
                float f10 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue((String) m1122A);
                interfaceC2425y04.setValue(Boolean.FALSE);
                if (str == null) {
                }
                interfaceC2425y0.setValue(null);
                interfaceC2425y03.setValue(Boolean.FALSE);
                return C1694m.f10482a;
            case 1:
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f7815l;
                Context context = (Context) this.f7819p;
                InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) this.f7814k;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i10 = this.f7813j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    float f11 = AbstractC1092mk.f5952h;
                    if (!((Boolean) interfaceC2425y06.getValue()).booleanValue()) {
                        return C1694m.f10482a;
                    }
                }
                do {
                    List m1760Z2 = AbstractC1092mk.m1760Z2(context);
                    if ((((C0976ir) interfaceC2425y05.getValue()).f4968a || ((C0976ir) interfaceC2425y05.getValue()).f4969b) && AbstractC1092mk.m1683I3(((Boolean) interfaceC2425y06.getValue()).booleanValue(), m1760Z2)) {
                        AbstractC1092mk.m1746W0(context, interfaceC2425y06);
                        if (((Boolean) ((InterfaceC2425y0) this.f7816m).getValue()).booleanValue()) {
                            AbstractC1092mk.m1742V0(context, (C3469p) this.f7820q, (InterfaceC2425y0) this.f7818o, ((Boolean) ((InterfaceC2425y0) this.f7817n).getValue()).booleanValue());
                        }
                        if (m1760Z2.isEmpty()) {
                            m3051o0 = "[]";
                        } else {
                            m3051o0 = AbstractC1805m.m3051o0(m1760Z2, null, "[", "]", new C0866fc(16), 25);
                        }
                        String str3 = "WIFI_COEXIST wifi_missing targets=" + m3051o0;
                        AbstractC3367j.m5100e(str3, "message");
                        if (Log.isLoggable("HBCS-NetIface", 4)) {
                            Log.i("HBCS-NetIface", str3);
                        }
                    }
                    this.f7813j = 1;
                } while (AbstractC0525d0.m1131i(1000L, this) != enumC2465a2);
                return enumC2465a2;
            case 2:
                Context context2 = (Context) this.f7819p;
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                int i11 = this.f7813j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A3 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1238rb c1238rb = C1238rb.f7307a;
                    C1238rb.m2164d(context2);
                    this.f7813j = 1;
                    C2325e c2325e3 = AbstractC0549l0.f1898a;
                    m1122A3 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1176pb(context2, null, 0), this);
                    if (m1122A3 == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                C1227r0 c1227r0 = (C1227r0) m1122A3;
                if (c1227r0 != null) {
                    InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) this.f7814k;
                    float f12 = AbstractC1092mk.f5952h;
                    interfaceC2425y07.setValue(c1227r0);
                    AbstractC1092mk.m1847r0((InterfaceC2425y0) this.f7815l, true);
                }
                InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) this.f7816m;
                float f13 = AbstractC1092mk.f5952h;
                if (((Boolean) interfaceC2425y08.getValue()).booleanValue()) {
                    AbstractC1092mk.m1714P((InterfaceC0516a0) this.f7820q, (InterfaceC2425y0) this.f7817n, (InterfaceC2425y0) this.f7818o, context2, (InterfaceC2425y0) this.f7814k, (InterfaceC2425y0) this.f7815l, false, true);
                }
                return C1694m.f10482a;
            case 3:
                List list2 = (List) this.f7816m;
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f7818o;
                EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                int i12 = this.f7813j;
                InterfaceC2313c interfaceC2313c2 = null;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            List list3 = (List) this.f7814k;
                            InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) this.f7815l;
                            AbstractC1793a0.m2972L(obj);
                            list = list3;
                            interfaceC3279c = interfaceC3279c2;
                            m1162d = obj;
                            interfaceC3279c.mo23f(AbstractC1092mk.m1727R2(list, (List) m1162d));
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m1125c = (InterfaceC0534g0) this.f7815l;
                    AbstractC1793a0.m2972L(obj);
                    m1122A4 = obj;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    m1125c = AbstractC0525d0.m1125c((InterfaceC0516a0) this.f7815l, null, new C0874fk(list2, (String) this.f7819p, (String) this.f7820q, interfaceC2313c2, 0), 3);
                    C1248rl c1248rl = (C1248rl) this.f7817n;
                    this.f7815l = m1125c;
                    this.f7813j = 1;
                    C2325e c2325e4 = AbstractC0549l0.f1898a;
                    m1122A4 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0062p0(list2, c1248rl, interfaceC2313c2, 13), this);
                    if (m1122A4 == enumC2465a4) {
                        return enumC2465a4;
                    }
                }
                list = (List) m1122A4;
                C0541i1 c0541i1 = (C0541i1) m1125c;
                c0541i1.getClass();
                if (!(C0541i1.f1886e.get(c0541i1) instanceof InterfaceC0585x0)) {
                    interfaceC3279c.mo23f(AbstractC1092mk.m1727R2(list, (List) m1125c.m1163f()));
                    return C1694m.f10482a;
                }
                float f14 = AbstractC1092mk.f5952h;
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                for (C0910go c0910go : list) {
                    List list4 = c0910go.f4326e;
                    ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list4));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C1467yn.m2427a((C1467yn) it.next(), "", true, null, null, 215));
                    }
                    arrayList.add(C0910go.m1551a(c0910go, arrayList2, null, 47));
                }
                interfaceC3279c.mo23f(arrayList);
                this.f7815l = interfaceC3279c;
                this.f7814k = list;
                this.f7813j = 2;
                m1162d = m1125c.m1162d(this);
                if (m1162d == enumC2465a4) {
                    return enumC2465a4;
                }
                interfaceC3279c.mo23f(AbstractC1092mk.m1727R2(list, (List) m1162d));
                return C1694m.f10482a;
            case 4:
                C2160y c2160y3 = (C2160y) this.f7819p;
                EnumC2465a enumC2465a5 = EnumC2465a.f13750e;
                ?? r32 = this.f7813j;
                try {
                    try {
                        if (r32 != 0) {
                            if (r32 != 1) {
                                if (r32 == 2) {
                                    c2160y2 = (C2160y) this.f7815l;
                                    interfaceC2470a2 = (InterfaceC2470a) this.f7814k;
                                    c2159x2 = (C2159x) this.f7817n;
                                    try {
                                        AbstractC1793a0.m2972L(obj);
                                        mo23f = obj;
                                        atomicReference2 = c2160y2.f12557a;
                                        while (!atomicReference2.compareAndSet(c2159x2, null) && atomicReference2.get() == c2159x2) {
                                        }
                                        ((C2472c) interfaceC2470a2).m4030f(null);
                                        return mo23f;
                                    } catch (Throwable th) {
                                        th = th;
                                        atomicReference = c2160y2.f12557a;
                                        while (!atomicReference.compareAndSet(c2159x2, null) && atomicReference.get() == c2159x2) {
                                        }
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c2160y3 = (C2160y) this.f7816m;
                            InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) this.f7815l;
                            interfaceC2470a = (InterfaceC2470a) this.f7814k;
                            C2159x c2159x3 = (C2159x) this.f7817n;
                            AbstractC1793a0.m2972L(obj);
                            c2159x = c2159x3;
                            r52 = interfaceC3279c3;
                        } else {
                            AbstractC1793a0.m2972L(obj);
                            InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f7817n;
                            EnumC2788y0 enumC2788y0 = (EnumC2788y0) this.f7818o;
                            InterfaceC2316f mo853h = interfaceC0516a0.mo1107i().mo853h(C0584x.f1939f);
                            AbstractC3367j.m5097b(mo853h);
                            C2159x c2159x4 = new C2159x(enumC2788y0, (InterfaceC0520b1) mo853h);
                            AtomicReference atomicReference3 = c2160y3.f12557a;
                            while (true) {
                                C2159x c2159x5 = (C2159x) atomicReference3.get();
                                if (c2159x5 != null && c2159x4.f12555a.compareTo(c2159x5.f12555a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference3.compareAndSet(c2159x5, c2159x4)) {
                                    if (atomicReference3.get() != c2159x5) {
                                        break;
                                    }
                                }
                                if (c2159x5 != null) {
                                    c2159x5.f12556b.mo1114c(null);
                                }
                                C2472c c2472c = c2160y3.f12558b;
                                AbstractC2590j abstractC2590j = (AbstractC2590j) this.f7820q;
                                this.f7817n = c2159x4;
                                this.f7814k = c2472c;
                                this.f7815l = abstractC2590j;
                                this.f7816m = c2160y3;
                                this.f7813j = 1;
                                if (c2472c.m4028d(this) != enumC2465a5) {
                                    c2159x = c2159x4;
                                    interfaceC2470a = c2472c;
                                    r52 = abstractC2590j;
                                } else {
                                    return enumC2465a5;
                                }
                            }
                        }
                        this.f7817n = c2159x;
                        this.f7814k = interfaceC2470a;
                        this.f7815l = c2160y;
                        this.f7816m = null;
                        this.f7813j = 2;
                        mo23f = r52.mo23f(this);
                        if (mo23f != enumC2465a5) {
                            c2160y2 = c2160y;
                            interfaceC2470a2 = interfaceC2470a;
                            c2159x2 = c2159x;
                            atomicReference2 = c2160y2.f12557a;
                            while (!atomicReference2.compareAndSet(c2159x2, null)) {
                            }
                            ((C2472c) interfaceC2470a2).m4030f(null);
                            return mo23f;
                        }
                        return enumC2465a5;
                    } catch (Throwable th2) {
                        th = th2;
                        c2160y2 = c2160y;
                        c2159x2 = c2159x;
                        atomicReference = c2160y2.f12557a;
                        while (!atomicReference.compareAndSet(c2159x2, null)) {
                        }
                        throw th;
                    }
                    c2160y = c2160y3;
                } catch (Throwable th3) {
                    ((C2472c) r32).m4030f(null);
                    throw th3;
                }
                break;
            case AbstractC3122c.f15761f /* 5 */:
                EnumC2465a enumC2465a6 = EnumC2465a.f13750e;
                int i13 = this.f7813j;
                try {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    obj2 = this.f7818o;
                                    c0230e0 = (C0230e0) this.f7817n;
                                    m2510a = (InterfaceC1552g) this.f7816m;
                                    c0310q = (InterfaceC3279c) this.f7815l;
                                    c2196i0 = (C2196i0) this.f7814k;
                                    interfaceC1704e = (InterfaceC1704e) this.f7819p;
                                    AbstractC1793a0.m2972L(obj);
                                    z8 = false;
                                    i8 = 2;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj2 = this.f7818o;
                                c0230e0 = (C0230e0) this.f7817n;
                                m2510a = (InterfaceC1552g) this.f7816m;
                                c0310q = (InterfaceC3279c) this.f7815l;
                                c2196i0 = (C2196i0) this.f7814k;
                                interfaceC1704e = (InterfaceC1704e) this.f7819p;
                                AbstractC1793a0.m2972L(obj);
                                obj3 = obj;
                                set = (Set) obj3;
                                z7 = z8;
                                while (true) {
                                    if (!z7) {
                                        Object[] objArr = c2196i0.f12685b;
                                        long[] jArr = c2196i0.f12684a;
                                        int length = jArr.length - i8;
                                        if (length >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j6 = jArr[i14];
                                                int i15 = i14;
                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j6 & 255) < 128) {
                                                            i7 = i17;
                                                            if (set.contains(objArr[(i15 << 3) + i17])) {
                                                            }
                                                        } else {
                                                            i7 = i17;
                                                        }
                                                        j6 >>= 8;
                                                        i17 = i7 + 1;
                                                    }
                                                    if (i16 != 8) {
                                                    }
                                                }
                                                if (i15 != length) {
                                                    i14 = i15 + 1;
                                                }
                                            }
                                        }
                                        z7 = false;
                                        mo2496l = m2510a.mo2496l();
                                        if (mo2496l instanceof C1554i) {
                                            mo2496l = null;
                                        }
                                        set = (Set) mo2496l;
                                        if (set == null) {
                                            if (z7) {
                                                try {
                                                    c2196i0.m3600b();
                                                    mo5202u = AbstractC3465l.m5244k().mo5202u(c0310q);
                                                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f7820q;
                                                    try {
                                                        Object mo52a = interfaceC3277a.mo52a();
                                                        mo5202u.mo5198c();
                                                        if (!AbstractC3367j.m5096a(mo52a, obj2)) {
                                                            this.f7819p = interfaceC1704e;
                                                            this.f7814k = c2196i0;
                                                            this.f7815l = c0310q;
                                                            this.f7816m = m2510a;
                                                            this.f7817n = c0230e0;
                                                            this.f7818o = mo52a;
                                                            this.f7813j = 3;
                                                            if (interfaceC1704e.mo160h(mo52a, this) != enumC2465a6) {
                                                                obj2 = mo52a;
                                                            }
                                                            return enumC2465a6;
                                                        }
                                                    } finally {
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                                AbstractC3459f m5227j = mo5202u.m5227j();
                                            }
                                            z8 = false;
                                            i8 = 2;
                                        } else {
                                            i8 = 2;
                                        }
                                    }
                                    z7 = true;
                                    mo2496l = m2510a.mo2496l();
                                    if (mo2496l instanceof C1554i) {
                                    }
                                    set = (Set) mo2496l;
                                    if (set == null) {
                                    }
                                }
                            }
                        } else {
                            obj2 = this.f7818o;
                            c0230e0 = (C0230e0) this.f7817n;
                            m2510a = (InterfaceC1552g) this.f7816m;
                            c0310q = (InterfaceC3279c) this.f7815l;
                            c2196i0 = (C2196i0) this.f7814k;
                            interfaceC1704e = (InterfaceC1704e) this.f7819p;
                            AbstractC1793a0.m2972L(obj);
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        interfaceC1704e = (InterfaceC1704e) this.f7819p;
                        c2196i0 = new C2196i0();
                        c0310q = new C0310q(17, c2196i0);
                        m2510a = AbstractC1555j.m2510a(Integer.MAX_VALUE, 6, null);
                        C0453t c0453t = new C0453t(14, m2510a);
                        AbstractC3465l.m5239f(AbstractC3465l.f16719a);
                        synchronized (AbstractC3465l.f16721c) {
                            AbstractC3465l.f16726h = AbstractC1805m.m3059w0(AbstractC3465l.f16726h, c0453t);
                        }
                        c0230e0 = new C0230e0(c0453t);
                        AbstractC3459f mo5202u2 = AbstractC3465l.m5244k().mo5202u(c0310q);
                        InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) this.f7820q;
                        try {
                            AbstractC3459f m5227j2 = mo5202u2.m5227j();
                            try {
                                Object mo52a2 = interfaceC3277a2.mo52a();
                                mo5202u2.mo5198c();
                                this.f7819p = interfaceC1704e;
                                this.f7814k = c2196i0;
                                this.f7815l = c0310q;
                                this.f7816m = m2510a;
                                this.f7817n = c0230e0;
                                this.f7818o = mo52a2;
                                this.f7813j = 1;
                                if (interfaceC1704e.mo160h(mo52a2, this) != enumC2465a6) {
                                    obj2 = mo52a2;
                                } else {
                                    return enumC2465a6;
                                }
                            } finally {
                                AbstractC3459f.m5225q(m5227j2);
                            }
                        } finally {
                        }
                    }
                    this.f7819p = interfaceC1704e;
                    this.f7814k = c2196i0;
                    this.f7815l = c0310q;
                    this.f7816m = m2510a;
                    this.f7817n = c0230e0;
                    this.f7818o = obj2;
                    this.f7813j = i8;
                    obj3 = m2510a.mo2507x(this);
                    if (obj3 == enumC2465a6) {
                        return enumC2465a6;
                    }
                    set = (Set) obj3;
                    z7 = z8;
                    while (true) {
                        if (!z7) {
                        }
                        z7 = true;
                        mo2496l = m2510a.mo2496l();
                        if (mo2496l instanceof C1554i) {
                        }
                        set = (Set) mo2496l;
                        if (set == null) {
                        }
                        i8 = 2;
                    }
                } catch (Throwable th5) {
                    c0230e0.m507a();
                    throw th5;
                }
            default:
                C3715p2 c3715p2 = (C3715p2) this.f7818o;
                ContentResolver contentResolver = (ContentResolver) this.f7816m;
                EnumC2465a enumC2465a7 = EnumC2465a.f13750e;
                int i18 = this.f7813j;
                try {
                    if (i18 != 0) {
                        if (i18 != 1) {
                            if (i18 == 2) {
                                C1547b c1547b2 = (C1547b) this.f7814k;
                                interfaceC1704e2 = (InterfaceC1704e) this.f7815l;
                                AbstractC1793a0.m2972L(obj);
                                c1547b = c1547b2;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            C1547b c1547b3 = (C1547b) this.f7814k;
                            interfaceC1704e2 = (InterfaceC1704e) this.f7815l;
                            AbstractC1793a0.m2972L(obj);
                            c1547b = c1547b3;
                            obj4 = obj;
                            if (!((Boolean) obj4).booleanValue()) {
                                c1547b.m2477c();
                                Float f15 = new Float(Settings.Global.getFloat(((Context) this.f7820q).getContentResolver(), "animator_duration_scale", 1.0f));
                                this.f7815l = interfaceC1704e2;
                                this.f7814k = c1547b;
                                this.f7813j = 2;
                                if (interfaceC1704e2.mo160h(f15, this) == enumC2465a7) {
                                    return enumC2465a7;
                                }
                            } else {
                                contentResolver.unregisterContentObserver(c3715p2);
                                return C1694m.f10482a;
                            }
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        interfaceC1704e2 = (InterfaceC1704e) this.f7815l;
                        contentResolver.registerContentObserver((Uri) this.f7817n, false, c3715p2);
                        c1547b = new C1547b((C1548c) this.f7819p);
                    }
                    this.f7815l = interfaceC1704e2;
                    this.f7814k = c1547b;
                    this.f7813j = 1;
                    obj4 = c1547b.m2476b(this);
                    if (obj4 == enumC2465a7) {
                        return enumC2465a7;
                    }
                    if (!((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th6) {
                    contentResolver.unregisterContentObserver(c3715p2);
                    throw th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306th(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7812i = 2;
        this.f7819p = context;
        this.f7814k = interfaceC2425y0;
        this.f7815l = interfaceC2425y02;
        this.f7816m = interfaceC2425y03;
        this.f7820q = interfaceC0516a0;
        this.f7817n = interfaceC2425y04;
        this.f7818o = interfaceC2425y05;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1306th(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f7812i = i7;
        this.f7816m = obj;
        this.f7817n = obj2;
        this.f7818o = obj3;
        this.f7819p = obj4;
        this.f7820q = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306th(String str, String str2, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7812i = 0;
        this.f7819p = str;
        this.f7820q = str2;
        this.f7815l = interfaceC2425y0;
        this.f7816m = interfaceC2425y02;
        this.f7817n = interfaceC2425y03;
        this.f7818o = interfaceC2425y04;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306th(EnumC2788y0 enumC2788y0, C2160y c2160y, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7812i = 4;
        this.f7818o = enumC2788y0;
        this.f7819p = c2160y;
        this.f7820q = (AbstractC2590j) interfaceC3279c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306th(InterfaceC3277a interfaceC3277a, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7812i = 5;
        this.f7820q = interfaceC3277a;
    }
}
