package p039e5;

import android.content.Context;
import android.net.Network;
import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p091l6.C2477h;
import p091l6.C2478i;
import p091l6.InterfaceC2474e;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wt */
/* loaded from: classes.dex */
public final class C1411wt extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ String f8528A;

    /* renamed from: B */
    public final /* synthetic */ EnumC1124nl f8529B;

    /* renamed from: C */
    public final /* synthetic */ C1194pt f8530C;

    /* renamed from: D */
    public final /* synthetic */ Network f8531D;

    /* renamed from: E */
    public final /* synthetic */ Context f8532E;

    /* renamed from: F */
    public final /* synthetic */ ConcurrentHashMap f8533F;

    /* renamed from: G */
    public final /* synthetic */ AtomicInteger f8534G;

    /* renamed from: i */
    public InterfaceC2474e f8535i;

    /* renamed from: j */
    public C1473yt f8536j;

    /* renamed from: k */
    public Serializable f8537k;

    /* renamed from: l */
    public Serializable f8538l;

    /* renamed from: m */
    public Serializable f8539m;

    /* renamed from: n */
    public C1194pt f8540n;

    /* renamed from: o */
    public Network f8541o;

    /* renamed from: p */
    public Context f8542p;

    /* renamed from: q */
    public AtomicInteger f8543q;

    /* renamed from: r */
    public ConcurrentHashMap f8544r;

    /* renamed from: s */
    public AtomicInteger f8545s;

    /* renamed from: t */
    public int f8546t;

    /* renamed from: u */
    public int f8547u;

    /* renamed from: v */
    public final /* synthetic */ C1473yt f8548v;

    /* renamed from: w */
    public final /* synthetic */ AtomicInteger f8549w;

    /* renamed from: x */
    public final /* synthetic */ int f8550x;

    /* renamed from: y */
    public final /* synthetic */ C2478i f8551y;

    /* renamed from: z */
    public final /* synthetic */ String f8552z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411wt(C1473yt c1473yt, AtomicInteger atomicInteger, int i7, C2478i c2478i, String str, String str2, EnumC1124nl enumC1124nl, C1194pt c1194pt, Network network, Context context, ConcurrentHashMap concurrentHashMap, AtomicInteger atomicInteger2, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8548v = c1473yt;
        this.f8549w = atomicInteger;
        this.f8550x = i7;
        this.f8551y = c2478i;
        this.f8552z = str;
        this.f8528A = str2;
        this.f8529B = enumC1124nl;
        this.f8530C = c1194pt;
        this.f8531D = network;
        this.f8532E = context;
        this.f8533F = concurrentHashMap;
        this.f8534G = atomicInteger2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1411wt) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1411wt(this.f8548v, this.f8549w, this.f8550x, this.f8551y, this.f8552z, this.f8528A, this.f8529B, this.f8530C, this.f8531D, this.f8532E, this.f8533F, this.f8534G, interfaceC2313c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x010d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0022, B:9:0x0107, B:11:0x010d, B:12:0x0115, B:21:0x00b8, B:23:0x00c0, B:26:0x00ca), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v10, types: [l6.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C1473yt c1473yt;
        String str;
        String str2;
        EnumC1124nl enumC1124nl;
        C1194pt c1194pt;
        Network network;
        Context context;
        ConcurrentHashMap concurrentHashMap;
        AtomicInteger atomicInteger;
        int i7;
        AtomicInteger atomicInteger2;
        C2478i c2478i;
        ConcurrentHashMap concurrentHashMap2;
        boolean z7;
        Object m1130h;
        AtomicInteger atomicInteger3;
        C1473yt c1473yt2;
        final int i8;
        Object obj2;
        Object obj3;
        C1132nt c1132nt;
        int i9 = this.f8547u;
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int i10 = this.f8546t;
                        AtomicInteger atomicInteger4 = (AtomicInteger) this.f8539m;
                        concurrentHashMap2 = (ConcurrentHashMap) this.f8538l;
                        atomicInteger3 = (AtomicInteger) this.f8537k;
                        C1473yt c1473yt3 = this.f8536j;
                        Object obj4 = this.f8535i;
                        AbstractC1793a0.m2972L(obj);
                        c1473yt2 = c1473yt3;
                        atomicInteger2 = atomicInteger4;
                        i8 = i10;
                        m1130h = obj;
                        obj3 = obj4;
                        c1132nt = (C1132nt) m1130h;
                        if (c1132nt.f6411h) {
                            atomicInteger3.updateAndGet(new IntUnaryOperator() { // from class: e5.vt
                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i11) {
                                    int i12 = i8;
                                    if (i11 >= 0 && i12 >= i11) {
                                        return i11;
                                    }
                                    return i12;
                                }
                            });
                        }
                        concurrentHashMap2.put(new Integer(i8), c1132nt);
                        int incrementAndGet = atomicInteger2.incrementAndGet();
                        C1701c0 c1701c0 = c1473yt2.f9795d;
                        C1504zt c1504zt = (C1504zt) c1701c0.getValue();
                        Collection values = concurrentHashMap2.values();
                        AbstractC3367j.m5099d(values, "<get-values>(...)");
                        C1504zt m2438a = C1504zt.m2438a(c1504zt, null, incrementAndGet, C1473yt.m2433d(AbstractC1805m.m3035C0(values)), null, null, 1951);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m2438a);
                        obj2 = obj3;
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = this.f8546t;
                atomicInteger2 = this.f8545s;
                concurrentHashMap = this.f8544r;
                atomicInteger = this.f8543q;
                context = this.f8542p;
                network = this.f8541o;
                c1194pt = this.f8540n;
                enumC1124nl = (EnumC1124nl) this.f8539m;
                str2 = (String) this.f8538l;
                str = (String) this.f8537k;
                c1473yt = this.f8536j;
                ?? r52 = this.f8535i;
                AbstractC1793a0.m2972L(obj);
                c2478i = r52;
            } else {
                AbstractC1793a0.m2972L(obj);
                c1473yt = this.f8548v;
                if (c1473yt.f9793b.get()) {
                    AtomicInteger atomicInteger5 = this.f8549w;
                    int i11 = atomicInteger5.get();
                    int i12 = this.f8550x;
                    if (i11 <= 0 || i12 <= i11) {
                        C2478i c2478i2 = this.f8551y;
                        this.f8535i = c2478i2;
                        this.f8536j = c1473yt;
                        str = this.f8552z;
                        this.f8537k = str;
                        str2 = this.f8528A;
                        this.f8538l = str2;
                        enumC1124nl = this.f8529B;
                        this.f8539m = enumC1124nl;
                        c1194pt = this.f8530C;
                        this.f8540n = c1194pt;
                        network = this.f8531D;
                        this.f8541o = network;
                        context = this.f8532E;
                        this.f8542p = context;
                        this.f8543q = atomicInteger5;
                        concurrentHashMap = this.f8533F;
                        this.f8544r = concurrentHashMap;
                        AtomicInteger atomicInteger6 = this.f8534G;
                        this.f8545s = atomicInteger6;
                        this.f8546t = i12;
                        this.f8547u = 1;
                        if (c2478i2.m4031a(this) != enumC2465a) {
                            atomicInteger = atomicInteger5;
                            i7 = i12;
                            atomicInteger2 = atomicInteger6;
                            c2478i = c2478i2;
                        }
                        return enumC2465a;
                    }
                }
                return c1694m;
            }
            concurrentHashMap2 = concurrentHashMap;
            Context context2 = context;
            Network network2 = network;
            C1194pt c1194pt2 = c1194pt;
            String str3 = str2;
            String str4 = str;
            C2478i c2478i3 = c2478i;
            obj2 = c2478i3;
            if (c1473yt.f9793b.get()) {
                if (enumC1124nl == EnumC1124nl.f6340f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C1381w c1381w = new C1381w(i7, 3, concurrentHashMap2, c1473yt);
                this.f8535i = c2478i3;
                this.f8536j = c1473yt;
                this.f8537k = atomicInteger;
                this.f8538l = concurrentHashMap2;
                this.f8539m = atomicInteger2;
                this.f8540n = null;
                this.f8541o = null;
                this.f8542p = null;
                this.f8543q = null;
                this.f8544r = null;
                this.f8545s = null;
                this.f8546t = i7;
                this.f8547u = 2;
                int i13 = i7;
                C1473yt c1473yt4 = c1473yt;
                m1130h = AbstractC0525d0.m1130h(new C1287st(c1194pt2, c1473yt4, i13, str4, str3, c1381w, z7, network2, context2, null), this);
                if (m1130h != enumC2465a) {
                    atomicInteger3 = atomicInteger;
                    c1473yt2 = c1473yt4;
                    i8 = i13;
                    obj3 = c2478i3;
                    c1132nt = (C1132nt) m1130h;
                    if (c1132nt.f6411h) {
                    }
                    concurrentHashMap2.put(new Integer(i8), c1132nt);
                    int incrementAndGet2 = atomicInteger2.incrementAndGet();
                    C1701c0 c1701c02 = c1473yt2.f9795d;
                    C1504zt c1504zt2 = (C1504zt) c1701c02.getValue();
                    Collection values2 = concurrentHashMap2.values();
                    AbstractC3367j.m5099d(values2, "<get-values>(...)");
                    C1504zt m2438a2 = C1504zt.m2438a(c1504zt2, null, incrementAndGet2, C1473yt.m2433d(AbstractC1805m.m3035C0(values2)), null, null, 1951);
                    c1701c02.getClass();
                    c1701c02.m2752j(null, m2438a2);
                    obj2 = obj3;
                }
                return enumC2465a;
            }
            return c1694m;
        } finally {
            ((C2477h) obj3).m4033c();
        }
    }
}
