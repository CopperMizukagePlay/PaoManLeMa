package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xs */
/* loaded from: classes.dex */
public final class C1441xs extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public C0883ft f9207i;

    /* renamed from: j */
    public Context f9208j;

    /* renamed from: k */
    public List f9209k;

    /* renamed from: l */
    public List f9210l;

    /* renamed from: m */
    public Collection f9211m;

    /* renamed from: n */
    public Iterator f9212n;

    /* renamed from: o */
    public C1248rl f9213o;

    /* renamed from: p */
    public boolean f9214p;

    /* renamed from: q */
    public int f9215q;

    /* renamed from: r */
    public final /* synthetic */ List f9216r;

    /* renamed from: s */
    public final /* synthetic */ C0883ft f9217s;

    /* renamed from: t */
    public final /* synthetic */ Context f9218t;

    /* renamed from: u */
    public final /* synthetic */ List f9219u;

    /* renamed from: v */
    public final /* synthetic */ boolean f9220v;

    /* renamed from: w */
    public final /* synthetic */ List f9221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441xs(List list, C0883ft c0883ft, Context context, List list2, boolean z7, List list3, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9216r = list;
        this.f9217s = c0883ft;
        this.f9218t = context;
        this.f9219u = list2;
        this.f9220v = z7;
        this.f9221w = list3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1441xs) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1441xs(this.f9216r, this.f9217s, this.f9218t, this.f9219u, this.f9220v, this.f9221w, interfaceC2313c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0100  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007b -> B:5:0x0081). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Iterator it;
        Context context;
        List list;
        boolean z7;
        List list2;
        ArrayList arrayList;
        C0883ft c0883ft;
        C1255rs c1255rs;
        C1441xs c1441xs = this;
        int i7 = c1441xs.f9215q;
        if (i7 != 0) {
            if (i7 == 1) {
                boolean z8 = c1441xs.f9214p;
                C1248rl c1248rl = c1441xs.f9213o;
                Iterator it2 = c1441xs.f9212n;
                Collection collection = c1441xs.f9211m;
                List list3 = c1441xs.f9210l;
                List list4 = c1441xs.f9209k;
                Context context2 = c1441xs.f9208j;
                C0883ft c0883ft2 = c1441xs.f9207i;
                AbstractC1793a0.m2972L(obj);
                z7 = z8;
                c0883ft = c0883ft2;
                list2 = list3;
                it = it2;
                ArrayList arrayList2 = collection;
                list = list4;
                Object m1529b = obj;
                List list5 = (List) m1529b;
                if (!list5.isEmpty()) {
                    c1255rs = null;
                } else {
                    Network network = c1248rl.f7392c;
                    List list6 = C0883ft.f4080j;
                    c0883ft.getClass();
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list2));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        AbstractC0094y0.m191r((String) it3.next(), arrayList3);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList3.get(i9);
                        i9++;
                        if (!AbstractC0444k.m937a0((String) obj2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList4.size();
                    while (i8 < size2) {
                        Object obj3 = arrayList4.get(i8);
                        i8++;
                        AbstractC1811s.m3076X(C0883ft.m1538p((String) obj3, network), arrayList5);
                    }
                    c1255rs = new C1255rs(c1248rl.f7390a, c1248rl.f7391b, c1248rl.f7392c, c1248rl.f7394e, list5, arrayList5);
                }
                if (c1255rs != null) {
                    arrayList2.add(c1255rs);
                }
                c1441xs = this;
                context = context2;
                arrayList = arrayList2;
                if (it.hasNext()) {
                    C1248rl c1248rl2 = (C1248rl) it.next();
                    c1441xs.f9207i = c0883ft;
                    c1441xs.f9208j = context;
                    c1441xs.f9209k = list;
                    c1441xs.f9210l = list2;
                    c1441xs.f9211m = arrayList;
                    c1441xs.f9212n = it;
                    c1441xs.f9213o = c1248rl2;
                    c1441xs.f9214p = z7;
                    c1441xs.f9215q = 1;
                    m1529b = C0883ft.m1529b(c0883ft, context, c1248rl2, list, z7, c1441xs);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1529b == enumC2465a) {
                        return enumC2465a;
                    }
                    ArrayList arrayList6 = arrayList;
                    context2 = context;
                    c1248rl = c1248rl2;
                    arrayList2 = arrayList6;
                    List list52 = (List) m1529b;
                    if (!list52.isEmpty()) {
                    }
                    if (c1255rs != null) {
                    }
                    c1441xs = this;
                    context = context2;
                    arrayList = arrayList2;
                    if (it.hasNext()) {
                        return arrayList;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = c1441xs.f9216r.iterator();
            C0883ft c0883ft3 = c1441xs.f9217s;
            Context context3 = c1441xs.f9218t;
            it = it4;
            context = context3;
            list = c1441xs.f9219u;
            z7 = c1441xs.f9220v;
            list2 = c1441xs.f9221w;
            arrayList = arrayList7;
            c0883ft = c0883ft3;
            if (it.hasNext()) {
            }
        }
    }
}
