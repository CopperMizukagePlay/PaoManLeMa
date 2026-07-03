package p001a0;

import android.content.Context;
import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import p018c0.C0334d;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p039e5.AbstractC1155ol;
import p039e5.AbstractC1249rm;
import p039e5.C0877fn;
import p039e5.C1405wn;
import p039e5.EnumC1063lm;
import p053g5.C1694m;
import p057h1.C1752b;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p100n.InterfaceC2627a0;
import p107o.EnumC2788y0;
import p137s.C3081j;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3281e;
import p152u.C3317e;
import p152u.C3325m;
import p152u.C3330r;
import p160v.AbstractC3420l;
import p160v.C3418k;
import p160v.C3442w;
import p160v.C3444x;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.d2 */
/* loaded from: classes.dex */
public final class C0016d2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f95i;

    /* renamed from: j */
    public int f96j;

    /* renamed from: k */
    public final /* synthetic */ boolean f97k;

    /* renamed from: l */
    public Object f98l;

    /* renamed from: m */
    public final /* synthetic */ Object f99m;

    /* renamed from: n */
    public final /* synthetic */ Object f100n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016d2(String str, Network network, Context context, boolean z7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f95i = 2;
        this.f98l = str;
        this.f99m = network;
        this.f100n = context;
        this.f97k = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f95i) {
            case 0:
                return ((C0016d2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0016d2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0016d2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0016d2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f95i) {
            case 0:
                return new C0016d2((InterfaceC2425y0) this.f99m, this.f97k, (C3081j) this.f100n, interfaceC2313c);
            case 1:
                return new C0016d2(this.f97k, (List) this.f98l, (EnumC1063lm) this.f99m, (C3330r) this.f100n, interfaceC2313c, 1);
            case 2:
                return new C0016d2((String) this.f98l, (Network) this.f99m, (Context) this.f100n, this.f97k, interfaceC2313c);
            default:
                return new C0016d2(this.f97k, (C3444x) this.f98l, (InterfaceC2627a0) this.f99m, (C1752b) this.f100n, interfaceC2313c, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (p100n.C2635d.m4205c(r12.f16653p, new java.lang.Float(1.0f), (p100n.InterfaceC2627a0) r5, r3, r26, 4) == r9) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC3079h c3082k;
        C1405wn c1405wn;
        Object m1122A;
        C0877fn c0877fn;
        String str;
        int i7 = this.f95i;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f100n;
        Object obj3 = this.f99m;
        boolean z7 = this.f97k;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        int i8 = 0;
        int i9 = 0;
        switch (i7) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj3;
                int i10 = this.f96j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC2425y0 = (InterfaceC2425y0) this.f98l;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3083l c3083l = (C3083l) interfaceC2425y0.getValue();
                    if (c3083l != null) {
                        C3081j c3081j = (C3081j) obj2;
                        if (z7) {
                            c3082k = new C3084m(c3083l);
                        } else {
                            c3082k = new C3082k(c3083l);
                        }
                        if (c3081j != null) {
                            this.f98l = interfaceC2425y0;
                            this.f96j = 1;
                            if (c3081j.m4747b(c3082k, this) == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                    } else {
                        return c1694m;
                    }
                }
                interfaceC2425y0.setValue(null);
                return c1694m;
            case 1:
                List list = (List) this.f98l;
                int i11 = this.f96j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                if (!z7 && !list.isEmpty()) {
                    int ordinal = ((EnumC1063lm) obj3).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i8 = AbstractC1806n.m3066N(list);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    C3330r c3330r = (C3330r) obj2;
                    this.f96j = 1;
                    C0068q2 c0068q2 = C3330r.f16359x;
                    C3317e c3317e = c3330r.f16364e;
                    InterfaceC3093c interfaceC3093c = ((C3325m) c3330r.f16365f.getValue()).f16319h;
                    float f7 = AbstractC3420l.f16584a;
                    Object mo112a = c3317e.f16281e.mo112a(EnumC2788y0.f14796e, new C3418k(i8, interfaceC3093c, c3317e, null), this);
                    if (mo112a != enumC2465a) {
                        mo112a = c1694m;
                    }
                    if (mo112a != enumC2465a) {
                        mo112a = c1694m;
                    }
                    if (mo112a != enumC2465a) {
                        mo112a = c1694m;
                    }
                    if (mo112a == enumC2465a) {
                        return enumC2465a;
                    }
                    return c1694m;
                }
                return c1694m;
            case 2:
                int i12 = this.f96j;
                InterfaceC2313c interfaceC2313c = null;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    Pattern pattern = AbstractC1155ol.f6638a;
                    String m2015c = AbstractC1155ol.m2015c((String) this.f98l);
                    boolean m2014b = AbstractC1155ol.m2014b(m2015c);
                    C1813u c1813u = C1813u.f10860e;
                    if (m2014b) {
                        int ordinal2 = AbstractC1155ol.m2013a(m2015c).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    Network network = (Network) obj3;
                                    Context context = (Context) obj2;
                                    if (z7 && context != null) {
                                        C1405wn m2239R = AbstractC1249rm.m2239R(context, true, true, false, c1813u, false, c1813u);
                                        if (m2239R.m2388b()) {
                                            c1405wn = m2239R;
                                            this.f96j = 1;
                                            C2325e c2325e = AbstractC0549l0.f1898a;
                                            m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d(m2015c, network, c1405wn, interfaceC2313c, 17), this);
                                            if (m1122A == enumC2465a) {
                                                return enumC2465a;
                                            }
                                        }
                                    }
                                    c1405wn = null;
                                    this.f96j = 1;
                                    C2325e c2325e2 = AbstractC0549l0.f1898a;
                                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d(m2015c, network, c1405wn, interfaceC2313c, 17), this);
                                    if (m1122A == enumC2465a) {
                                    }
                                }
                            } else {
                                return AbstractC3784a.m5817z(new C0877fn(m2015c, "IPv6"));
                            }
                        } else {
                            return AbstractC3784a.m5817z(new C0877fn(m2015c, "IPv4"));
                        }
                    }
                    return c1813u;
                }
                ArrayList arrayList = new ArrayList();
                for (InetAddress inetAddress : (Iterable) m1122A) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress != null) {
                        if (inetAddress.getAddress().length != 4) {
                            str = "IPv6";
                        } else {
                            str = "IPv4";
                        }
                        c0877fn = new C0877fn(hostAddress, str);
                    } else {
                        c0877fn = null;
                    }
                    if (c0877fn != null) {
                        arrayList.add(c0877fn);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj4 = arrayList.get(i9);
                    i9++;
                    if (hashSet.add(((C0877fn) obj4).f4045a)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            default:
                C3444x c3444x = (C3444x) this.f98l;
                int i13 = this.f96j;
                try {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                AbstractC1793a0.m2972L(obj);
                                return c1694m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        if (z7) {
                            C2635d c2635d = c3444x.f16653p;
                            Float f8 = new Float(0.0f);
                            this.f96j = 1;
                            if (c2635d.m4207e(f8, this) == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                    }
                    C3442w c3442w = new C3442w((C1752b) obj2, c3444x, i8);
                    this.f96j = 2;
                    break;
                } finally {
                    int i14 = C3444x.f16637t;
                    c3444x.m5191d(false);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016d2(InterfaceC2425y0 interfaceC2425y0, boolean z7, C3081j c3081j, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f95i = 0;
        this.f99m = interfaceC2425y0;
        this.f97k = z7;
        this.f100n = c3081j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0016d2(boolean z7, Object obj, Object obj2, Object obj3, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f95i = i7;
        this.f97k = z7;
        this.f98l = obj;
        this.f99m = obj2;
        this.f100n = obj3;
    }
}
