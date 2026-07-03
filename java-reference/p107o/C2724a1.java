package p107o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p032d6.C0584x;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p061h6.C1829k;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2316f;
import p090l5.EnumC2465a;
import p091l6.C2472c;
import p091l6.InterfaceC2470a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.a1 */
/* loaded from: classes.dex */
public final class C2724a1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public InterfaceC2470a f14584i;

    /* renamed from: j */
    public Object f14585j;

    /* renamed from: k */
    public Object f14586k;

    /* renamed from: l */
    public C2727b1 f14587l;

    /* renamed from: m */
    public int f14588m;

    /* renamed from: n */
    public /* synthetic */ Object f14589n;

    /* renamed from: o */
    public final /* synthetic */ EnumC2788y0 f14590o;

    /* renamed from: p */
    public final /* synthetic */ C2727b1 f14591p;

    /* renamed from: q */
    public final /* synthetic */ AbstractC2590j f14592q;

    /* renamed from: r */
    public final /* synthetic */ Object f14593r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2724a1(EnumC2788y0 enumC2788y0, C2727b1 c2727b1, InterfaceC3281e interfaceC3281e, Object obj, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f14590o = enumC2788y0;
        this.f14591p = c2727b1;
        this.f14592q = (AbstractC2590j) interfaceC3281e;
        this.f14593r = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2724a1) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [m5.j, t5.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2724a1 c2724a1 = new C2724a1(this.f14590o, this.f14591p, this.f14592q, this.f14593r, interfaceC2313c);
        c2724a1.f14589n = obj;
        return c2724a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [t5.e] */
    /* JADX WARN: Type inference failed for: r6v5, types: [l6.a] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        C2472c c2472c;
        Object obj2;
        C2790z0 c2790z0;
        C2727b1 c2727b1;
        ?? r62;
        C2790z0 c2790z02;
        InterfaceC2470a interfaceC2470a;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i7 = this.f14588m;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        try {
            try {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            c2727b1 = (C2727b1) this.f14585j;
                            interfaceC2470a = this.f14584i;
                            c2790z02 = (C2790z0) this.f14589n;
                            try {
                                AbstractC1793a0.m2972L(obj);
                                atomicReference2 = c2727b1.f14612a;
                                while (!atomicReference2.compareAndSet(c2790z02, null) && atomicReference2.get() == c2790z02) {
                                }
                                ((C2472c) interfaceC2470a).m4030f(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                atomicReference = c2727b1.f14612a;
                                while (!atomicReference.compareAndSet(c2790z02, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2727b1 = this.f14587l;
                    obj2 = this.f14586k;
                    InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f14585j;
                    ?? r63 = this.f14584i;
                    c2790z0 = (C2790z0) this.f14589n;
                    AbstractC1793a0.m2972L(obj);
                    r62 = interfaceC3281e;
                    c2472c = r63;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC2316f mo853h = ((InterfaceC0516a0) this.f14589n).mo1107i().mo853h(C0584x.f1939f);
                    AbstractC3367j.m5097b(mo853h);
                    C2790z0 c2790z03 = new C2790z0(this.f14590o, (InterfaceC0520b1) mo853h);
                    C2727b1 c2727b12 = this.f14591p;
                    AtomicReference atomicReference3 = c2727b12.f14612a;
                    while (true) {
                        C2790z0 c2790z04 = (C2790z0) atomicReference3.get();
                        if (c2790z04 != null && c2790z03.f14800a.compareTo(c2790z04.f14800a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c2790z04, c2790z03)) {
                            if (atomicReference3.get() != c2790z04) {
                                break;
                            }
                        }
                        if (c2790z04 != null) {
                            c2790z04.f14801b.mo1114c(new C1829k("Mutation interrupted", 2));
                        }
                        c2472c = c2727b12.f14613b;
                        this.f14589n = c2790z03;
                        this.f14584i = c2472c;
                        AbstractC2590j abstractC2590j = this.f14592q;
                        this.f14585j = abstractC2590j;
                        Object obj3 = this.f14593r;
                        this.f14586k = obj3;
                        this.f14587l = c2727b12;
                        this.f14588m = 1;
                        if (c2472c.m4028d(this) != enumC2465a) {
                            obj2 = obj3;
                            c2790z0 = c2790z03;
                            c2727b1 = c2727b12;
                            r62 = abstractC2590j;
                        }
                    }
                }
                this.f14589n = c2790z0;
                this.f14584i = c2472c;
                this.f14585j = c2727b1;
                this.f14586k = null;
                this.f14587l = null;
                this.f14588m = 2;
                obj = r62.mo22d(obj2, this);
                if (obj != enumC2465a) {
                    interfaceC2470a = c2472c;
                    c2790z02 = c2790z0;
                    atomicReference2 = c2727b1.f14612a;
                    while (!atomicReference2.compareAndSet(c2790z02, null)) {
                    }
                    ((C2472c) interfaceC2470a).m4030f(null);
                    return obj;
                }
                return enumC2465a;
            } catch (Throwable th2) {
                th = th2;
                c2790z02 = c2790z0;
                atomicReference = c2727b1.f14612a;
                while (!atomicReference.compareAndSet(c2790z02, null) && atomicReference.get() == c2790z02) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((C2472c) 2).m4030f(null);
            throw th3;
        }
    }
}
