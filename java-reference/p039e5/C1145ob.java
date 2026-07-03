package p039e5;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p195z5.C3878c;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ob */
/* loaded from: classes.dex */
public final class C1145ob extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f6518i;

    /* renamed from: j */
    public /* synthetic */ Object f6519j;

    /* renamed from: k */
    public final /* synthetic */ int f6520k;

    /* renamed from: l */
    public final /* synthetic */ long f6521l;

    /* renamed from: m */
    public final /* synthetic */ long f6522m;

    /* renamed from: n */
    public final /* synthetic */ File f6523n;

    /* renamed from: o */
    public final /* synthetic */ String f6524o;

    /* renamed from: p */
    public final /* synthetic */ AtomicLong f6525p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC3279c f6526q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145ob(int i7, long j6, long j7, File file, String str, AtomicLong atomicLong, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6520k = i7;
        this.f6521l = j6;
        this.f6522m = j7;
        this.f6523n = file;
        this.f6524o = str;
        this.f6525p = atomicLong;
        this.f6526q = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1145ob) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1145ob c1145ob = new C1145ob(this.f6520k, this.f6521l, this.f6522m, this.f6523n, this.f6524o, this.f6525p, this.f6526q, interfaceC2313c);
        c1145ob.f6519j = obj;
        return c1145ob;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f6518i;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f6519j;
        C3879d m3513G = AbstractC2168e.m3513G(0, this.f6520k);
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
        Iterator it = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (!c3878c.f18168g) {
                break;
            }
            int nextInt = c3878c.nextInt();
            C2325e c2325e = AbstractC0549l0.f1898a;
            arrayList.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C1114nb(nextInt, this.f6521l, this.f6520k, this.f6522m, this.f6523n, this.f6524o, this.f6525p, this.f6526q, null), 2));
            i8 = 1;
        }
        this.f6518i = i8;
        Object m1126d = AbstractC0525d0.m1126d(arrayList, this);
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1126d == enumC2465a) {
            return enumC2465a;
        }
        return m1126d;
    }
}
