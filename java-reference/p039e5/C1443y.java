package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.C3378u;
import p195z5.C3878c;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y */
/* loaded from: classes.dex */
public final class C1443y extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f9234i;

    /* renamed from: j */
    public /* synthetic */ Object f9235j;

    /* renamed from: k */
    public final /* synthetic */ C0800d9 f9236k;

    /* renamed from: l */
    public final /* synthetic */ List f9237l;

    /* renamed from: m */
    public final /* synthetic */ List f9238m;

    /* renamed from: n */
    public final /* synthetic */ C1071m f9239n;

    /* renamed from: o */
    public final /* synthetic */ Object f9240o;

    /* renamed from: p */
    public final /* synthetic */ C1196q0 f9241p;

    /* renamed from: q */
    public final /* synthetic */ Map f9242q;

    /* renamed from: r */
    public final /* synthetic */ Set f9243r;

    /* renamed from: s */
    public final /* synthetic */ long f9244s;

    /* renamed from: t */
    public final /* synthetic */ C3378u f9245t;

    /* renamed from: u */
    public final /* synthetic */ C1040l f9246u;

    /* renamed from: v */
    public final /* synthetic */ AtomicLong f9247v;

    /* renamed from: w */
    public final /* synthetic */ long f9248w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1443y(C0800d9 c0800d9, List list, List list2, C1071m c1071m, Object obj, C1196q0 c1196q0, Map map, Set set, long j6, C3378u c3378u, C1040l c1040l, AtomicLong atomicLong, long j7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9236k = c0800d9;
        this.f9237l = list;
        this.f9238m = list2;
        this.f9239n = c1071m;
        this.f9240o = obj;
        this.f9241p = c1196q0;
        this.f9242q = map;
        this.f9243r = set;
        this.f9244s = j6;
        this.f9245t = c3378u;
        this.f9246u = c1040l;
        this.f9247v = atomicLong;
        this.f9248w = j7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1443y) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1443y c1443y = new C1443y(this.f9236k, this.f9237l, this.f9238m, this.f9239n, this.f9240o, this.f9241p, this.f9242q, this.f9243r, this.f9244s, this.f9245t, this.f9246u, this.f9247v, this.f9248w, interfaceC2313c);
        c1443y.f9235j = obj;
        return c1443y;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f9234i;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f9235j;
        C0800d9 c0800d9 = this.f9236k;
        C3879d m3513G = AbstractC2168e.m3513G(0, c0800d9.f3356q);
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
        Iterator it = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (!c3878c.f18168g) {
                break;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(AbstractC0525d0.m1125c(interfaceC0516a0, null, new C1412x(c3878c.nextInt(), this.f9237l, this.f9238m, this.f9239n, this.f9240o, this.f9241p, c0800d9, this.f9242q, this.f9243r, this.f9244s, this.f9245t, this.f9246u, this.f9247v, this.f9248w, null), 3));
            it = it;
            arrayList = arrayList2;
            i8 = 1;
        }
        this.f9234i = i8;
        Object m1126d = AbstractC0525d0.m1126d(arrayList, this);
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1126d == enumC2465a) {
            return enumC2465a;
        }
        return m1126d;
    }
}
