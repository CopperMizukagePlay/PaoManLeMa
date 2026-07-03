package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p001a0.C0016d2;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j4 */
/* loaded from: classes.dex */
public final class C0983j4 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5017i;

    /* renamed from: j */
    public int f5018j;

    /* renamed from: k */
    public final /* synthetic */ String f5019k;

    /* renamed from: l */
    public final /* synthetic */ List f5020l;

    /* renamed from: m */
    public final /* synthetic */ Context f5021m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f5022n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f5023o;

    /* renamed from: p */
    public final /* synthetic */ String f5024p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f5025q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0983j4(String str, List list, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, String str2, InterfaceC2425y0 interfaceC2425y03, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f5017i = i7;
        this.f5019k = str;
        this.f5020l = list;
        this.f5021m = context;
        this.f5022n = interfaceC2425y0;
        this.f5023o = interfaceC2425y02;
        this.f5024p = str2;
        this.f5025q = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5017i) {
            case 0:
                return ((C0983j4) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0983j4) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0983j4) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5017i) {
            case 0:
                return new C0983j4(this.f5019k, this.f5020l, this.f5021m, this.f5022n, this.f5023o, this.f5024p, this.f5025q, interfaceC2313c, 0);
            case 1:
                return new C0983j4(this.f5019k, this.f5020l, this.f5021m, this.f5022n, this.f5023o, this.f5024p, this.f5025q, interfaceC2313c, 1);
            default:
                return new C0983j4(this.f5019k, this.f5020l, this.f5021m, this.f5022n, this.f5023o, this.f5024p, this.f5025q, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object obj2;
        Network network;
        Object m1122A;
        Object obj3;
        Network network2;
        Object m1122A2;
        Object obj4;
        Network network3;
        Object m1122A3;
        int i7 = this.f5017i;
        InterfaceC2425y0 interfaceC2425y0 = this.f5025q;
        Context context = this.f5021m;
        String str = this.f5024p;
        List list = this.f5020l;
        C1813u c1813u = C1813u.f10860e;
        String str2 = this.f5019k;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        InterfaceC2425y0 interfaceC2425y02 = this.f5023o;
        String str3 = null;
        InterfaceC2425y0 interfaceC2425y03 = this.f5022n;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                int i8 = this.f5018j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    Pattern pattern = AbstractC1155ol.f6638a;
                    String m2015c = AbstractC1155ol.m2015c(str2);
                    if (!AbstractC1155ol.m2014b(m2015c)) {
                        C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                        interfaceC2425y03.setValue(c1813u);
                        interfaceC2425y02.setValue(null);
                        return c1694m;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (AbstractC3367j.m5096a(((C1248rl) obj2).f7390a, str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    C1248rl c1248rl = (C1248rl) obj2;
                    if (c1248rl != null) {
                        network = c1248rl.f7392c;
                    } else {
                        network = null;
                    }
                    Context applicationContext = context.getApplicationContext();
                    C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                    boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    this.f5018j = 1;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0016d2(m2015c, network, applicationContext, booleanValue, null), this);
                    if (m1122A == enumC2465a) {
                        return enumC2465a;
                    }
                }
                List list2 = (List) m1122A;
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                interfaceC2425y03.setValue(list2);
                if (list2.size() == 1) {
                    str3 = ((C0877fn) AbstractC1805m.m3045i0(list2)).f4045a;
                } else {
                    if (((String) interfaceC2425y02.getValue()) != null && !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC3367j.m5096a(((C0877fn) it2.next()).f4045a, (String) interfaceC2425y02.getValue())) {
                                str3 = (String) interfaceC2425y02.getValue();
                            }
                        }
                    }
                    C0877fn c0877fn = (C0877fn) AbstractC1805m.m3047k0(list2);
                    if (c0877fn != null) {
                        str3 = c0877fn.f4045a;
                    }
                }
                interfaceC2425y02.setValue(str3);
                return c1694m;
            case 1:
                int i9 = this.f5018j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A2 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    Pattern pattern2 = AbstractC1155ol.f6638a;
                    String m2015c2 = AbstractC1155ol.m2015c(str2);
                    if (!AbstractC1155ol.m2014b(m2015c2)) {
                        C3137j0 c3137j04 = AbstractC1172p7.f6835a;
                        interfaceC2425y03.setValue(c1813u);
                        interfaceC2425y02.setValue(null);
                        return c1694m;
                    }
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (AbstractC3367j.m5096a(((C1248rl) obj3).f7390a, str)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    C1248rl c1248rl2 = (C1248rl) obj3;
                    if (c1248rl2 != null) {
                        network2 = c1248rl2.f7392c;
                    } else {
                        network2 = null;
                    }
                    Context applicationContext2 = context.getApplicationContext();
                    C3137j0 c3137j05 = AbstractC1172p7.f6835a;
                    boolean booleanValue2 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    this.f5018j = 1;
                    C2325e c2325e2 = AbstractC0549l0.f1898a;
                    m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0016d2(m2015c2, network2, applicationContext2, booleanValue2, null), this);
                    if (m1122A2 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                List list3 = (List) m1122A2;
                C3137j0 c3137j06 = AbstractC1172p7.f6835a;
                interfaceC2425y03.setValue(list3);
                if (list3.size() == 1) {
                    str3 = ((C0877fn) AbstractC1805m.m3045i0(list3)).f4045a;
                } else {
                    if (((String) interfaceC2425y02.getValue()) != null && !list3.isEmpty()) {
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            if (AbstractC3367j.m5096a(((C0877fn) it4.next()).f4045a, (String) interfaceC2425y02.getValue())) {
                                str3 = (String) interfaceC2425y02.getValue();
                            }
                        }
                    }
                    C0877fn c0877fn2 = (C0877fn) AbstractC1805m.m3047k0(list3);
                    if (c0877fn2 != null) {
                        str3 = c0877fn2.f4045a;
                    }
                }
                interfaceC2425y02.setValue(str3);
                return c1694m;
            default:
                int i10 = this.f5018j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A3 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    Pattern pattern3 = AbstractC1155ol.f6638a;
                    if (!AbstractC1155ol.m2014b(str2)) {
                        C3137j0 c3137j07 = AbstractC1172p7.f6835a;
                        interfaceC2425y03.setValue(c1813u);
                        interfaceC2425y02.setValue(null);
                        return c1694m;
                    }
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj4 = it5.next();
                            if (AbstractC3367j.m5096a(((C1248rl) obj4).f7390a, str)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    C1248rl c1248rl3 = (C1248rl) obj4;
                    if (c1248rl3 != null) {
                        network3 = c1248rl3.f7392c;
                    } else {
                        network3 = null;
                    }
                    Context applicationContext3 = context.getApplicationContext();
                    C3137j0 c3137j08 = AbstractC1172p7.f6835a;
                    boolean booleanValue3 = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    this.f5018j = 1;
                    C2325e c2325e3 = AbstractC0549l0.f1898a;
                    m1122A3 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0016d2(this.f5019k, network3, applicationContext3, booleanValue3, null), this);
                    if (m1122A3 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                List list4 = (List) m1122A3;
                C3137j0 c3137j09 = AbstractC1172p7.f6835a;
                interfaceC2425y03.setValue(list4);
                if (list4.size() == 1) {
                    str3 = ((C0877fn) AbstractC1805m.m3045i0(list4)).f4045a;
                } else {
                    if (((String) interfaceC2425y02.getValue()) != null && !list4.isEmpty()) {
                        Iterator it6 = list4.iterator();
                        while (it6.hasNext()) {
                            if (AbstractC3367j.m5096a(((C0877fn) it6.next()).f4045a, (String) interfaceC2425y02.getValue())) {
                                str3 = (String) interfaceC2425y02.getValue();
                            }
                        }
                    }
                    C0877fn c0877fn3 = (C0877fn) AbstractC1805m.m3047k0(list4);
                    if (c0877fn3 != null) {
                        str3 = c0877fn3.f4045a;
                    }
                }
                interfaceC2425y02.setValue(str3);
                return c1694m;
        }
    }
}
