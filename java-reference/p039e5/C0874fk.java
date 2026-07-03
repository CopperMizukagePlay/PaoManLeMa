package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fk */
/* loaded from: classes.dex */
public final class C0874fk extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f4033i;

    /* renamed from: j */
    public int f4034j;

    /* renamed from: k */
    public final /* synthetic */ List f4035k;

    /* renamed from: l */
    public final /* synthetic */ String f4036l;

    /* renamed from: m */
    public final /* synthetic */ String f4037m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0874fk(List list, String str, String str2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f4033i = i7;
        this.f4035k = list;
        this.f4036l = str;
        this.f4037m = str2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f4033i) {
            case 0:
                return ((C0874fk) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0874fk) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f4033i) {
            case 0:
                return new C0874fk(this.f4035k, this.f4036l, this.f4037m, interfaceC2313c, 0);
            default:
                return new C0874fk(this.f4035k, this.f4036l, this.f4037m, interfaceC2313c, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r13 == r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l5.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7 = this.f4033i;
        Object obj2 = EnumC2465a.f13750e;
        switch (i7) {
            case 0:
                int i8 = this.f4034j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f4034j = 1;
                C2325e c2325e = AbstractC0549l0.f1898a;
                Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0874fk(this.f4035k, this.f4036l, this.f4037m, null, 1), this);
                if (m1122A == obj2) {
                    return obj2;
                }
                return m1122A;
            default:
                int i9 = this.f4034j;
                List<C0910go> list = this.f4035k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = ((C0910go) it.next()).f4326e;
                        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((C1467yn) it2.next()).f9464a);
                        }
                        AbstractC1811s.m3076X(arrayList2, arrayList);
                    }
                    List m3042f0 = AbstractC1805m.m3042f0(arrayList);
                    this.f4034j = 1;
                    obj = C1247rk.m2182c(m3042f0, this.f4036l, this.f4037m, this);
                    break;
                }
                Map map = (Map) obj;
                obj2 = new ArrayList(AbstractC1807o.m3073U(list));
                for (C0910go c0910go : list) {
                    List<C1467yn> list3 = c0910go.f4326e;
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list3));
                    for (C1467yn c1467yn : list3) {
                        String str = (String) map.get(c1467yn.f9464a);
                        if (str == null) {
                            str = "";
                        }
                        arrayList3.add(C1467yn.m2427a(c1467yn, str, false, c1467yn.f9470g, c1467yn.f9471h, 23));
                    }
                    obj2.add(C0910go.m1551a(c0910go, arrayList3, null, 47));
                }
                return obj2;
        }
    }
}
