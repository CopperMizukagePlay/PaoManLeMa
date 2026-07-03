package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0581w;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p060h5.C1813u;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.eo */
/* loaded from: classes.dex */
public final class C0846eo extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3783i = 0;

    /* renamed from: j */
    public int f3784j;

    /* renamed from: k */
    public int f3785k;

    /* renamed from: l */
    public Object f3786l;

    /* renamed from: m */
    public final /* synthetic */ Object f3787m;

    /* renamed from: n */
    public final /* synthetic */ Object f3788n;

    /* renamed from: o */
    public final /* synthetic */ Object f3789o;

    /* renamed from: p */
    public final /* synthetic */ Object f3790p;

    /* renamed from: q */
    public final /* synthetic */ Object f3791q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0846eo(C0973io c0973io, C1248rl c1248rl, C1405wn c1405wn, EnumC1127no enumC1127no, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3787m = c0973io;
        this.f3788n = c1248rl;
        this.f3789o = c1405wn;
        this.f3790p = enumC1127no;
        this.f3791q = interfaceC3281e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3783i) {
            case 0:
                return ((C0846eo) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0846eo) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3783i) {
            case 0:
                return new C0846eo((C0973io) this.f3787m, (C1248rl) this.f3788n, (C1405wn) this.f3789o, (EnumC1127no) this.f3790p, (InterfaceC3281e) this.f3791q, interfaceC2313c);
            default:
                C0846eo c0846eo = new C0846eo((List) this.f3787m, (Map) this.f3788n, (List) this.f3789o, (C1100ms) this.f3790p, this.f3785k, (AbstractC0581w) this.f3791q, interfaceC2313c);
                c0846eo.f3786l = obj;
                return c0846eo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object m2185f;
        String str;
        int i7;
        String str2;
        String str3;
        String str4;
        String str5;
        C1813u c1813u;
        C1813u c1813u2;
        Iterator it;
        List list;
        int i8;
        Iterator it2;
        int m3530q;
        Iterable iterable;
        int i9 = 1;
        switch (this.f3783i) {
            case 0:
                C1813u c1813u3 = C1813u.f10860e;
                C0973io c0973io = (C0973io) this.f3787m;
                Object obj2 = EnumC2465a.f13750e;
                int i10 = this.f3785k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        int i11 = this.f3784j;
                        String str6 = (String) this.f3786l;
                        AbstractC1793a0.m2972L(obj);
                        i7 = i11;
                        str = str6;
                        m2185f = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String str7 = c0973io.f4937c;
                    int i12 = c0973io.f4938d;
                    Network network = ((C1248rl) this.f3788n).f7392c;
                    C1405wn c1405wn = (C1405wn) this.f3789o;
                    EnumC1127no enumC1127no = (EnumC1127no) this.f3790p;
                    InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f3791q;
                    this.f3786l = str7;
                    this.f3784j = i12;
                    this.f3785k = 1;
                    m2185f = C1247rk.m2185f(str7, network, c1405wn, enumC1127no, interfaceC3281e, this);
                    if (m2185f != obj2) {
                        str = str7;
                        i7 = i12;
                    }
                    return obj2;
                }
                C1234r7 c1234r7 = (C1234r7) m2185f;
                ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
                List list2 = c1234r7.f7296a;
                ?? r22 = c1234r7.f7297b;
                ?? m189p = AbstractC0094y0.m189p("CANDIDATE host=", str, " addrs=", AbstractC1265s7.m2304a(list2), " labels=");
                m189p.append(r22);
                AbstractC1265s7.m2308e(m189p.toString());
                List<InetAddress> list3 = c1234r7.f7296a;
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list3));
                for (InetAddress inetAddress : list3) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress == null) {
                        str4 = "";
                    } else {
                        str4 = hostAddress;
                    }
                    if (inetAddress.getAddress().length == 4) {
                        str5 = "IPv4";
                    } else {
                        str5 = "IPv6";
                    }
                    String str8 = str5;
                    ?? r32 = (List) r22.get(str4);
                    if (r32 == 0) {
                        c1813u = c1813u3;
                    } else {
                        c1813u = r32;
                    }
                    ?? r33 = (List) c1234r7.f7298c.get(str4);
                    if (r33 == 0) {
                        c1813u2 = c1813u3;
                    } else {
                        c1813u2 = r33;
                    }
                    arrayList.add(new C1467yn(str4, str8, null, c1813u, c1813u2, 44));
                }
                String str9 = c0973io.f4935a;
                String str10 = c0973io.f4936b;
                C1467yn c1467yn = (C1467yn) AbstractC1805m.m3047k0(arrayList);
                if (c1467yn != null) {
                    str2 = c1467yn.f9464a;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                obj2 = new C0910go(str9, str10, str, i7, arrayList, str3);
                return obj2;
            default:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i13 = this.f3784j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        it = (Iterator) this.f3786l;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f3786l;
                    List list4 = (List) this.f3787m;
                    Map map = (Map) this.f3788n;
                    List list5 = (List) this.f3789o;
                    C1100ms c1100ms = (C1100ms) this.f3790p;
                    int i14 = this.f3785k;
                    AbstractC0581w abstractC0581w = (AbstractC0581w) this.f3791q;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        C1248rl c1248rl = (C1248rl) it3.next();
                        List list6 = (List) map.get(c1248rl.f7390a);
                        if (list6 == null) {
                            list = list5;
                        } else {
                            list = list6;
                        }
                        if (list.isEmpty()) {
                            iterable = C1813u.f10860e;
                            it2 = it3;
                        } else {
                            if (c1100ms.f6080h0) {
                                i8 = C1100ms.m1897S(c1248rl);
                            } else if (i14 < i9) {
                                i8 = i9;
                            } else {
                                i8 = i14;
                            }
                            int size = list.size() * i8;
                            if (c1100ms.f6083i0) {
                                it2 = it3;
                                m3530q = 0;
                            } else {
                                it2 = it3;
                                m3530q = AbstractC2168e.m3530q((int) (size * 0.0d), 0, 0);
                            }
                            int i15 = m3530q + size;
                            ArrayList arrayList3 = new ArrayList(i15);
                            int i16 = 0;
                            while (i16 < i15) {
                                arrayList3.add(AbstractC0525d0.m1141s(interfaceC0516a0, abstractC0581w, new C0850es(i16, size, c1100ms, c1248rl, list, (InterfaceC2313c) null), 2));
                                i16++;
                                arrayList2 = arrayList2;
                                i15 = i15;
                            }
                            iterable = arrayList3;
                        }
                        ArrayList arrayList4 = arrayList2;
                        AbstractC1811s.m3076X(iterable, arrayList4);
                        it3 = it2;
                        arrayList2 = arrayList4;
                        i9 = 1;
                    }
                    it = arrayList2.iterator();
                }
                while (it.hasNext()) {
                    InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) it.next();
                    this.f3786l = it;
                    this.f3784j = 1;
                    if (interfaceC0520b1.mo1116s(this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0846eo(List list, Map map, List list2, C1100ms c1100ms, int i7, AbstractC0581w abstractC0581w, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3787m = list;
        this.f3788n = map;
        this.f3789o = list2;
        this.f3790p = c1100ms;
        this.f3785k = i7;
        this.f3791q = abstractC0581w;
    }
}
