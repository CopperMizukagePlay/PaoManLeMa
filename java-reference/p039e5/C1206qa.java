package p039e5;

import android.content.Context;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0062p0;
import p018c0.C0334d;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qa */
/* loaded from: classes.dex */
public final class C1206qa extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public List f7061i;

    /* renamed from: j */
    public C3472s f7062j;

    /* renamed from: k */
    public int f7063k;

    /* renamed from: l */
    public /* synthetic */ Object f7064l;

    /* renamed from: m */
    public final /* synthetic */ C3472s f7065m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f7066n;

    /* renamed from: o */
    public final /* synthetic */ Context f7067o;

    /* renamed from: p */
    public final /* synthetic */ String f7068p;

    /* renamed from: q */
    public final /* synthetic */ C0800d9 f7069q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f7070r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f7071s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f7072t;

    /* renamed from: u */
    public final /* synthetic */ C3472s f7073u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206qa(C3472s c3472s, InterfaceC2425y0 interfaceC2425y0, Context context, String str, C0800d9 c0800d9, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, C3472s c3472s2, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7065m = c3472s;
        this.f7066n = interfaceC2425y0;
        this.f7067o = context;
        this.f7068p = str;
        this.f7069q = c0800d9;
        this.f7070r = interfaceC2425y02;
        this.f7071s = interfaceC2425y03;
        this.f7072t = interfaceC2425y04;
        this.f7073u = c3472s2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1206qa) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1206qa c1206qa = new C1206qa(this.f7065m, this.f7066n, this.f7067o, this.f7068p, this.f7069q, this.f7070r, this.f7071s, this.f7072t, this.f7073u, interfaceC2313c);
        c1206qa.f7064l = obj;
        return c1206qa;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:(1:(7:5|6|(3:8|(3:10|(3:12|13|14)(1:16)|15)|17)(1:35)|18|(4:20|(2:23|21)|24|25)(4:29|(2:32|30)|33|34)|26|27)(2:36|37))(1:38))(3:60|(1:62)|50)|39|40|41|(1:43)(2:53|(1:55)(1:56))|44|45|(1:47)|48|(7:51|6|(0)(0)|18|(0)(0)|26|27)|50) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0086, code lost:
    
        r9 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cd  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        C3472s c3472s;
        List list;
        int i7;
        boolean booleanValue;
        ArrayList arrayList;
        boolean booleanValue2;
        Object m3038F0;
        int i8 = this.f7063k;
        Context context = this.f7067o;
        InterfaceC2425y0 interfaceC2425y0 = this.f7066n;
        InterfaceC2313c interfaceC2313c = null;
        int i9 = 1;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    c3472s = this.f7062j;
                    list = this.f7061i;
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f7064l;
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a0 = interfaceC0516a02;
                    c3472s.putAll((Map) obj);
                    InterfaceC2425y0 interfaceC2425y02 = this.f7070r;
                    booleanValue = ((Boolean) interfaceC2425y02.getValue()).booleanValue();
                    List list2 = list;
                    InterfaceC2425y0 interfaceC2425y03 = this.f7071s;
                    if (!booleanValue) {
                        ArrayList m3058v0 = AbstractC1805m.m3058v0((List) interfaceC2425y03.getValue(), list2);
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        int size = m3058v0.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = m3058v0.get(i10);
                            i10++;
                            if (hashSet.add(((C0877fn) obj2).f4045a)) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = list2;
                    }
                    interfaceC2425y03.setValue(arrayList);
                    booleanValue2 = ((Boolean) interfaceC2425y02.getValue()).booleanValue();
                    InterfaceC2425y0 interfaceC2425y04 = this.f7072t;
                    if (!booleanValue2) {
                        Set set = (Set) interfaceC2425y04.getValue();
                        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C0877fn) it.next()).f4045a);
                        }
                        m3038F0 = AbstractC1793a0.m2967G(set, arrayList2);
                    } else {
                        ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list2));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((C0877fn) it2.next()).f4045a);
                        }
                        m3038F0 = AbstractC1805m.m3038F0(arrayList3);
                    }
                    interfaceC2425y04.setValue(m3038F0);
                    interfaceC2425y0.setValue(Boolean.FALSE);
                    AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0334d(context, interfaceC2425y03, this.f7073u, null, 6), 3);
                    return C1694m.f10482a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f7064l;
            AbstractC1793a0.m2972L(obj);
            interfaceC0516a0 = interfaceC0516a03;
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a04 = (InterfaceC0516a0) this.f7064l;
            interfaceC2425y0.setValue(Boolean.TRUE);
            C2325e c2325e = AbstractC0549l0.f1898a;
            ExecutorC2324d executorC2324d = ExecutorC2324d.f13302g;
            C0062p0 c0062p0 = new C0062p0(context, this.f7068p, (InterfaceC2313c) null, 9);
            this.f7064l = interfaceC0516a04;
            this.f7063k = 1;
            Object m1122A = AbstractC0525d0.m1122A(executorC2324d, c0062p0, this);
            if (m1122A != enumC2465a) {
                interfaceC0516a0 = interfaceC0516a04;
                obj = m1122A;
            }
            return enumC2465a;
        }
        List list3 = (List) obj;
        URI uri = new URI(this.f7069q.f3341b);
        if (uri.getPort() > 0) {
            i7 = uri.getPort();
        } else if (AbstractC0451r.m966H(uri.getScheme(), "http")) {
            i7 = 80;
        } else {
            i7 = 443;
        }
        Object m2985m = new Integer(i7);
        Object num = new Integer(443);
        if (m2985m instanceof C1689h) {
            m2985m = num;
        }
        int intValue = ((Number) m2985m).intValue();
        C2325e c2325e2 = AbstractC0549l0.f1898a;
        ExecutorC2324d executorC2324d2 = ExecutorC2324d.f13302g;
        C0832ea c0832ea = new C0832ea(list3, intValue, interfaceC2313c, i9);
        this.f7064l = interfaceC0516a0;
        this.f7061i = list3;
        c3472s = this.f7065m;
        this.f7062j = c3472s;
        this.f7063k = 2;
        Object m1122A2 = AbstractC0525d0.m1122A(executorC2324d2, c0832ea, this);
        if (m1122A2 != enumC2465a) {
            list = list3;
            obj = m1122A2;
            c3472s.putAll((Map) obj);
            InterfaceC2425y0 interfaceC2425y022 = this.f7070r;
            booleanValue = ((Boolean) interfaceC2425y022.getValue()).booleanValue();
            List list22 = list;
            InterfaceC2425y0 interfaceC2425y032 = this.f7071s;
            if (!booleanValue) {
            }
            interfaceC2425y032.setValue(arrayList);
            booleanValue2 = ((Boolean) interfaceC2425y022.getValue()).booleanValue();
            InterfaceC2425y0 interfaceC2425y042 = this.f7072t;
            if (!booleanValue2) {
            }
            interfaceC2425y042.setValue(m3038F0);
            interfaceC2425y0.setValue(Boolean.FALSE);
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0334d(context, interfaceC2425y032, this.f7073u, null, 6), 3);
            return C1694m.f10482a;
        }
        return enumC2465a;
    }
}
