package p170w1;

import java.util.concurrent.CancellationException;
import p027d1.C0465c;
import p032d6.C0548l;
import p032d6.InterfaceC0516a0;
import p039e5.C0827e5;
import p047f6.C1547b;
import p047f6.C1548c;
import p047f6.InterfaceC1562q;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p077k.C2196i0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2649h1;
import p101n0.C2705e;
import p122q.C2891b;
import p122q.C2912i;
import p122q.C2915j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p161v0.AbstractC3465l;
import p162v1.AbstractC3497e1;
import p176x.C3791f;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.m1 */
/* loaded from: classes.dex */
public final class C3702m1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f17604i = 0;

    /* renamed from: j */
    public int f17605j;

    /* renamed from: k */
    public Object f17606k;

    /* renamed from: l */
    public Object f17607l;

    /* renamed from: m */
    public final /* synthetic */ Object f17608m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3702m1(C1548c c1548c, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f17608m = c1548c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f17604i) {
            case 0:
                return ((C3702m1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C3702m1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t5.a, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f17604i) {
            case 0:
                return new C3702m1((C1548c) this.f17608m, interfaceC2313c);
            default:
                return new C3702m1((C3791f) this.f17606k, (AbstractC3497e1) this.f17607l, (AbstractC3368k) this.f17608m, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d4, code lost:
    
        if (r13 == r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:53:0x00ee, B:54:0x0117, B:56:0x011f, B:57:0x012d, B:64:0x013b, B:66:0x010a, B:70:0x013e, B:73:0x0143, B:74:0x0144, B:81:0x0104, B:59:0x012e, B:61:0x0134), top: B:49:0x00e2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARN: Type inference failed for: r4v6, types: [f6.q] */
    /* JADX WARN: Type inference failed for: r6v4, types: [t5.a, u5.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0114 -> B:49:0x0117). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C1548c c1548c;
        C1547b c1547b;
        Object obj2;
        switch (this.f17604i) {
            case 0:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i7 = this.f17605j;
                CancellationException cancellationException = null;
                try {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            c1547b = (C1547b) this.f17607l;
                            ?? r42 = (InterfaceC1562q) this.f17606k;
                            AbstractC1793a0.m2972L(obj);
                            c1548c = r42;
                            if (((Boolean) obj).booleanValue()) {
                                boolean z7 = false;
                                AbstractC3706n1.f17622b.set(false);
                                synchronized (AbstractC3465l.f16721c) {
                                    C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
                                    if (c2196i0 != null && c2196i0.m3606h()) {
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    AbstractC3465l.m5234a();
                                }
                                this.f17606k = c1548c;
                                this.f17607l = c1547b;
                                this.f17605j = 1;
                                obj = c1547b.m2476b(this);
                                c1548c = c1548c;
                                if (obj == enumC2465a) {
                                    return enumC2465a;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    c1548c.mo2489c(null);
                                    return C1694m.f10482a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        c1548c = (C1548c) this.f17608m;
                        c1547b = new C1547b(c1548c);
                        this.f17606k = c1548c;
                        this.f17607l = c1547b;
                        this.f17605j = 1;
                        obj = c1547b.m2476b(this);
                        c1548c = c1548c;
                        if (obj == enumC2465a) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (th instanceof CancellationException) {
                            cancellationException = th;
                        }
                        if (cancellationException == null) {
                            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException.initCause(th);
                        }
                        c1548c.mo2489c(cancellationException);
                        throw th2;
                    }
                }
                break;
            default:
                C1694m c1694m = C1694m.f10482a;
                C3791f c3791f = (C3791f) this.f17606k;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i8 = this.f17605j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2915j c2915j = c3791f.f17956s;
                C0827e5 c0827e5 = new C0827e5(c3791f, (AbstractC3497e1) this.f17607l, (InterfaceC3277a) this.f17608m);
                this.f17605j = 1;
                c2915j.getClass();
                C0465c c0465c = (C0465c) c0827e5.mo52a();
                if (c0465c != null && !c2915j.m4584M0(c0465c, c2915j.f15178A)) {
                    C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(this));
                    c0548l.m1222u();
                    C2912i c2912i = new C2912i(c0827e5, c0548l);
                    C2891b c2891b = c2915j.f15184w;
                    C2705e c2705e = c2891b.f15099a;
                    C0465c c0465c2 = (C0465c) c0827e5.mo52a();
                    if (c0465c2 == null) {
                        c0548l.mo663n(c1694m);
                    } else {
                        c0548l.m1224w(new C2649h1(7, c2891b, c2912i));
                        int i9 = new C3877b(0, c2705e.f14519g - 1, 1).f18164f;
                        if (i9 >= 0) {
                            while (true) {
                                C0465c c0465c3 = (C0465c) ((C2912i) c2705e.f14517e[i9]).f15174a.mo52a();
                                if (c0465c3 != null) {
                                    C0465c m1016c = c0465c2.m1016c(c0465c3);
                                    if (m1016c.equals(c0465c2)) {
                                        c2705e.m4299a(i9 + 1, c2912i);
                                    } else if (!m1016c.equals(c0465c3)) {
                                        CancellationException cancellationException2 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i10 = c2705e.f14519g - 1;
                                        if (i10 <= i9) {
                                            while (true) {
                                                ((C2912i) c2705e.f14517e[i9]).f15175b.mo1199p(cancellationException2);
                                                if (i10 != i9) {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i9 != 0) {
                                    i9--;
                                }
                            }
                            if (!c2915j.f15179B) {
                                c2915j.m4585N0();
                            }
                        }
                        c2705e.m4299a(0, c2912i);
                        if (!c2915j.f15179B) {
                        }
                    }
                    obj2 = c0548l.m1221t();
                    break;
                }
                obj2 = c1694m;
                if (obj2 == enumC2465a2) {
                    return enumC2465a2;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3702m1(C3791f c3791f, AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f17606k = c3791f;
        this.f17607l = abstractC3497e1;
        this.f17608m = (AbstractC3368k) interfaceC3277a;
    }
}
