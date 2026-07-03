package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001a0.C0062p0;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0576u0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ao */
/* loaded from: classes.dex */
public final class C0719ao extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f2471i = 1;

    /* renamed from: j */
    public int f2472j;

    /* renamed from: k */
    public final /* synthetic */ int f2473k;

    /* renamed from: l */
    public /* synthetic */ Object f2474l;

    /* renamed from: m */
    public final /* synthetic */ Object f2475m;

    /* renamed from: n */
    public final /* synthetic */ Object f2476n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719ao(C1100ms c1100ms, C3379v c3379v, C3379v c3379v2, int i7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f2474l = c1100ms;
        this.f2475m = c3379v;
        this.f2476n = c3379v2;
        this.f2473k = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f2471i) {
            case 0:
                return ((C0719ao) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0719ao) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f2471i) {
            case 0:
                C0719ao c0719ao = new C0719ao((List) this.f2475m, this.f2473k, (Network) this.f2476n, interfaceC2313c);
                c0719ao.f2474l = obj;
                return c0719ao;
            default:
                return new C0719ao((C1100ms) this.f2474l, (C3379v) this.f2475m, (C3379v) this.f2476n, this.f2473k, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r0 == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r0 == r9) goto L25;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        switch (this.f2471i) {
            case 0:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i7 = this.f2472j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f2474l;
                List<InetAddress> list = (List) this.f2475m;
                int i8 = this.f2473k;
                Network network = (Network) this.f2476n;
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                for (InetAddress inetAddress : list) {
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    arrayList.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C0062p0(inetAddress, i8, network, (InterfaceC2313c) null), 2));
                }
                this.f2472j = 1;
                Object m1126d = AbstractC0525d0.m1126d(arrayList, this);
                if (m1126d != enumC2465a) {
                    return m1126d;
                }
                return enumC2465a;
            default:
                C1694m c1694m = C1694m.f10482a;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i9 = this.f2472j;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            if (((C1100ms) this.f2474l).f6079h.get() || ((C1100ms) this.f2474l).f6098n0.isEmpty()) {
                                ((C1100ms) this.f2474l).f6076g.set(false);
                                return c1694m;
                            }
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1100ms c1100ms = (C1100ms) this.f2474l;
                    if (!c1100ms.f6077g0) {
                        List list2 = c1100ms.f6098n0;
                        Map map = (Map) ((C3379v) this.f2475m).f16451e;
                        List list3 = (List) ((C3379v) this.f2476n).f16451e;
                        this.f2472j = 1;
                        Object m1981g1 = c1100ms.m1981g1(list2, map, list3, false, this);
                        if (m1981g1 != enumC2465a2) {
                            m1981g1 = c1694m;
                            break;
                        }
                    }
                }
                C1100ms c1100ms2 = (C1100ms) this.f2474l;
                C0576u0 c0576u0 = c1100ms2.f6067d;
                List list4 = c1100ms2.f6098n0;
                List list5 = (List) ((C3379v) this.f2476n).f16451e;
                Map map2 = (Map) ((C3379v) this.f2475m).f16451e;
                int i10 = this.f2473k;
                C0977is c0977is = new C0977is((C1100ms) this.f2474l, null);
                this.f2472j = 2;
                Object m1130h = AbstractC0525d0.m1130h(new C0920h2(list4, c1100ms2, i10, map2, list5, c0576u0, c0977is, (InterfaceC2313c) null), this);
                if (m1130h != enumC2465a2) {
                    m1130h = c1694m;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719ao(List list, int i7, Network network, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f2475m = list;
        this.f2473k = i7;
        this.f2476n = network;
    }
}
