package p032d6;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p000a.AbstractC0000a;
import p001a0.C0098z1;
import p039e5.C1279sl;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.C1813u;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p069i6.AbstractC2088a;
import p069i6.C2090c;
import p069i6.C2093f;
import p069i6.C2103p;
import p082k5.C2314d;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2315e;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p098m5.InterfaceC2584d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC0525d0 {

    /* renamed from: a */
    public static final C1279sl f1855a;

    /* renamed from: b */
    public static final C1279sl f1856b;

    /* renamed from: c */
    public static final C1279sl f1857c;

    /* renamed from: d */
    public static final C1279sl f1858d;

    /* renamed from: e */
    public static final C1279sl f1859e;

    /* renamed from: f */
    public static final C1279sl f1860f;

    /* renamed from: g */
    public static final C1279sl f1861g;

    /* renamed from: h */
    public static final C1279sl f1862h;

    /* renamed from: i */
    public static final C0555n0 f1863i = new C0555n0(false);

    /* renamed from: j */
    public static final C0555n0 f1864j = new C0555n0(true);

    static {
        int i7 = 1;
        f1855a = new C1279sl("RESUME_TOKEN", i7);
        f1856b = new C1279sl("REMOVED_TASK", i7);
        f1857c = new C1279sl("CLOSED_EMPTY", i7);
        f1858d = new C1279sl("COMPLETING_ALREADY", i7);
        f1859e = new C1279sl("COMPLETING_WAITING_CHILDREN", i7);
        f1860f = new C1279sl("COMPLETING_RETRY", i7);
        f1861g = new C1279sl("TOO_LATE_TO_CANCEL", i7);
        f1862h = new C1279sl("SEALED", i7);
    }

    /* renamed from: A */
    public static final Object m1122A(InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        InterfaceC2318h m1133k;
        InterfaceC2318h mo662j = interfaceC2313c.mo662j();
        if (!((Boolean) interfaceC2318h.mo852B(Boolean.FALSE, new C0575u(2))).booleanValue()) {
            m1133k = mo662j.mo855z(interfaceC2318h);
        } else {
            m1133k = m1133k(mo662j, interfaceC2318h, false);
        }
        m1132j(m1133k);
        if (m1133k == mo662j) {
            C2103p c2103p = new C2103p(interfaceC2313c, m1133k);
            return AbstractC2072e.m3346x(c2103p, c2103p, interfaceC3281e);
        }
        C2314d c2314d = C2314d.f13272e;
        if (AbstractC3367j.m5096a(m1133k.mo853h(c2314d), mo662j.mo853h(c2314d))) {
            C0583w1 c0583w1 = new C0583w1(interfaceC2313c, m1133k);
            InterfaceC2318h interfaceC2318h2 = c0583w1.f1840g;
            Object m3441l = AbstractC2088a.m3441l(interfaceC2318h2, null);
            try {
                return AbstractC2072e.m3346x(c0583w1, c0583w1, interfaceC3281e);
            } finally {
                AbstractC2088a.m3436g(interfaceC2318h2, m3441l);
            }
        }
        C2103p c2103p2 = new C2103p(interfaceC2313c, m1133k);
        try {
            AbstractC2088a.m3437h(C1694m.f10482a, AbstractC2064e.m3250x(AbstractC2064e.m3242p(c2103p2, c2103p2, interfaceC3281e)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0543j0.f1888i;
            do {
                int i7 = atomicIntegerFieldUpdater.get(c2103p2);
                if (i7 != 0) {
                    if (i7 == 2) {
                        Object m1147y = m1147y(C0541i1.f1886e.get(c2103p2));
                        if (m1147y instanceof C0569s) {
                            throw ((C0569s) m1147y).f1923a;
                        }
                        return m1147y;
                    }
                    throw new IllegalStateException("Already suspended");
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c2103p2, 0, 1));
            return EnumC2465a.f13750e;
        } catch (Throwable th) {
            c2103p2.mo663n(AbstractC1793a0.m2985m(th));
            throw th;
        }
    }

    /* renamed from: a */
    public static final C2090c m1123a(InterfaceC2318h interfaceC2318h) {
        if (interfaceC2318h.mo853h(C0584x.f1939f) == null) {
            interfaceC2318h = interfaceC2318h.mo855z(new C0526d1(null));
        }
        return new C2090c(interfaceC2318h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.r1, d6.d1] */
    /* renamed from: b */
    public static C0568r1 m1124b() {
        return new C0526d1(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d6.a, d6.h0] */
    /* renamed from: c */
    public static C0537h0 m1125c(InterfaceC0516a0 interfaceC0516a0, InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC2318h = C2319i.f13273e;
        }
        ?? abstractC0515a = new AbstractC0515a(m1142t(interfaceC0516a0, interfaceC2318h), true);
        abstractC0515a.m1110l0(EnumC0519b0.f1844e, abstractC0515a, interfaceC3281e);
        return abstractC0515a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final Object m1126d(List list, InterfaceC2313c interfaceC2313c) {
        if (list.isEmpty()) {
            return C1813u.f10860e;
        }
        InterfaceC0534g0[] interfaceC0534g0Arr = (InterfaceC0534g0[]) list.toArray(new InterfaceC0534g0[0]);
        C0527e c0527e = new C0527e(interfaceC0534g0Arr);
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(interfaceC2313c));
        c0548l.m1222u();
        int length = interfaceC0534g0Arr.length;
        C0521c[] c0521cArr = new C0521c[length];
        for (int i7 = 0; i7 < length; i7++) {
            C0550l1 c0550l1 = interfaceC0534g0Arr[i7];
            ((C0541i1) c0550l1).start();
            C0521c c0521c = new C0521c(c0527e, c0548l);
            c0521c.f1851j = m1138p(c0550l1, true, c0521c);
            c0521cArr[i7] = c0521c;
        }
        C0524d c0524d = new C0524d(c0521cArr);
        for (int i8 = 0; i8 < length; i8++) {
            C0521c c0521c2 = c0521cArr[i8];
            c0521c2.getClass();
            C0521c.f1849l.set(c0521c2, c0524d);
        }
        if (!(C0548l.f1894k.get(c0548l) instanceof InterfaceC0556n1)) {
            c0524d.m1121b();
        } else {
            c0548l.m1225x(c0524d);
        }
        return c0548l.m1221t();
    }

    /* renamed from: e */
    public static final void m1127e(InterfaceC0516a0 interfaceC0516a0, CancellationException cancellationException) {
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC0516a0.mo1107i().mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null) {
            interfaceC0520b1.mo1114c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0516a0).toString());
        }
    }

    /* renamed from: g */
    public static final Object m1129g(InterfaceC0520b1 interfaceC0520b1, AbstractC2583c abstractC2583c) {
        interfaceC0520b1.mo1114c(null);
        Object mo1116s = interfaceC0520b1.mo1116s(abstractC2583c);
        if (mo1116s == EnumC2465a.f13750e) {
            return mo1116s;
        }
        return C1694m.f10482a;
    }

    /* renamed from: h */
    public static final Object m1130h(InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        C2103p c2103p = new C2103p(interfaceC2313c, interfaceC2313c.mo662j());
        return AbstractC2072e.m3346x(c2103p, c2103p, interfaceC3281e);
    }

    /* renamed from: i */
    public static final Object m1131i(long j6, InterfaceC2313c interfaceC2313c) {
        InterfaceC0540i0 interfaceC0540i0;
        if (j6 > 0) {
            C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(interfaceC2313c));
            c0548l.m1222u();
            if (j6 < Long.MAX_VALUE) {
                InterfaceC2316f mo853h = c0548l.f1897i.mo853h(C2314d.f13272e);
                if (mo853h instanceof InterfaceC0540i0) {
                    interfaceC0540i0 = (InterfaceC0540i0) mo853h;
                } else {
                    interfaceC0540i0 = null;
                }
                if (interfaceC0540i0 == null) {
                    interfaceC0540i0 = AbstractC0531f0.f1873a;
                }
                interfaceC0540i0.mo1168n(j6, c0548l);
            }
            Object m1221t = c0548l.m1221t();
            if (m1221t == EnumC2465a.f13750e) {
                return m1221t;
            }
        }
        return C1694m.f10482a;
    }

    /* renamed from: j */
    public static final void m1132j(InterfaceC2318h interfaceC2318h) {
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null && !interfaceC0520b1.mo1113b()) {
            throw interfaceC0520b1.mo1118w();
        }
    }

    /* renamed from: k */
    public static final InterfaceC2318h m1133k(InterfaceC2318h interfaceC2318h, InterfaceC2318h interfaceC2318h2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) interfaceC2318h.mo852B(bool, new C0575u(2))).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC2318h2.mo852B(bool, new C0575u(2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC2318h.mo855z(interfaceC2318h2);
        }
        C0575u c0575u = new C0575u(0);
        C2319i c2319i = C2319i.f13273e;
        InterfaceC2318h interfaceC2318h3 = (InterfaceC2318h) interfaceC2318h.mo852B(c2319i, c0575u);
        Object obj = interfaceC2318h2;
        if (booleanValue2) {
            obj = interfaceC2318h2.mo852B(c2319i, new C0575u(1));
        }
        return interfaceC2318h3.mo855z((InterfaceC2318h) obj);
    }

    /* renamed from: l */
    public static final String m1134l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: m */
    public static final InterfaceC0520b1 m1135m(InterfaceC2318h interfaceC2318h) {
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null) {
            return interfaceC0520b1;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC2318h).toString());
    }

    /* renamed from: n */
    public static final C0548l m1136n(InterfaceC2313c interfaceC2313c) {
        C0548l c0548l;
        C0548l c0548l2;
        if (!(interfaceC2313c instanceof C2093f)) {
            return new C0548l(1, interfaceC2313c);
        }
        C2093f c2093f = (C2093f) interfaceC2313c;
        C1279sl c1279sl = AbstractC2088a.f12342c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2093f.f12352l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c2093f);
            c0548l = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2093f, c1279sl);
                c0548l2 = null;
                break;
            }
            if (obj instanceof C0548l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c2093f, obj, c1279sl)) {
                    if (atomicReferenceFieldUpdater.get(c2093f) != obj) {
                        break;
                    }
                }
                c0548l2 = (C0548l) obj;
                break loop0;
            }
            if (obj != c1279sl && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0548l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0548l.f1894k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0548l2);
            if ((obj2 instanceof C0566r) && ((C0566r) obj2).f1917d != null) {
                c0548l2.m1219o();
            } else {
                C0548l.f1893j.set(c0548l2, 536870911);
                atomicReferenceFieldUpdater2.set(c0548l2, C0518b.f1843a);
                c0548l = c0548l2;
            }
            if (c0548l != null) {
                return c0548l;
            }
        }
        return new C0548l(2, interfaceC2313c);
    }

    /* renamed from: o */
    public static final void m1137o(Throwable th, InterfaceC2318h interfaceC2318h) {
        try {
            InterfaceC0587y interfaceC0587y = (InterfaceC0587y) interfaceC2318h.mo853h(C0584x.f1938e);
            if (interfaceC0587y != null) {
                interfaceC0587y.mo1248q(th, interfaceC2318h);
            } else {
                AbstractC2088a.m3433d(th, interfaceC2318h);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0000a.m7h(runtimeException, th);
                th = runtimeException;
            }
            AbstractC2088a.m3433d(th, interfaceC2318h);
        }
    }

    /* renamed from: p */
    public static final InterfaceC0552m0 m1138p(InterfaceC0520b1 interfaceC0520b1, boolean z7, AbstractC0529e1 abstractC0529e1) {
        if (interfaceC0520b1 instanceof C0541i1) {
            return ((C0541i1) interfaceC0520b1).m1184V(z7, abstractC0529e1);
        }
        return interfaceC0520b1.mo1117u(abstractC0529e1.mo1111k(), z7, new C0098z1(1, abstractC0529e1, AbstractC0529e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    /* renamed from: q */
    public static final boolean m1139q(InterfaceC0516a0 interfaceC0516a0) {
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC0516a0.mo1107i().mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null) {
            return interfaceC0520b1.mo1113b();
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m1140r(InterfaceC2318h interfaceC2318h) {
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null) {
            return interfaceC0520b1.mo1113b();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [d6.q1, d6.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: s */
    public static C0565q1 m1141s(InterfaceC0516a0 interfaceC0516a0, InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e, int i7) {
        EnumC0519b0 enumC0519b0;
        ?? r22;
        if ((i7 & 1) != 0) {
            interfaceC2318h = C2319i.f13273e;
        }
        if ((i7 & 2) != 0) {
            enumC0519b0 = EnumC0519b0.f1844e;
        } else {
            enumC0519b0 = EnumC0519b0.f1847h;
        }
        InterfaceC2318h m1142t = m1142t(interfaceC0516a0, interfaceC2318h);
        if (enumC0519b0 == EnumC0519b0.f1845f) {
            r22 = new C0544j1(m1142t, interfaceC3281e);
        } else {
            r22 = new AbstractC0515a(m1142t, true);
        }
        r22.m1110l0(enumC0519b0, r22, interfaceC3281e);
        return r22;
    }

    /* renamed from: t */
    public static final InterfaceC2318h m1142t(InterfaceC0516a0 interfaceC0516a0, InterfaceC2318h interfaceC2318h) {
        InterfaceC2318h m1133k = m1133k(interfaceC0516a0.mo1107i(), interfaceC2318h, true);
        C2325e c2325e = AbstractC0549l0.f1898a;
        if (m1133k != c2325e && m1133k.mo853h(C2314d.f13272e) == null) {
            return m1133k.mo855z(c2325e);
        }
        return m1133k;
    }

    /* renamed from: u */
    public static final Object m1143u(Object obj) {
        if (obj instanceof C0569s) {
            return AbstractC1793a0.m2985m(((C0569s) obj).f1923a);
        }
        return obj;
    }

    /* renamed from: v */
    public static final void m1144v(C0548l c0548l, InterfaceC2313c interfaceC2313c, boolean z7) {
        Object mo1204f;
        C0583w1 c0583w1;
        Object obj = C0548l.f1894k.get(c0548l);
        Throwable mo1203d = c0548l.mo1203d(obj);
        if (mo1203d != null) {
            mo1204f = AbstractC1793a0.m2985m(mo1203d);
        } else {
            mo1204f = c0548l.mo1204f(obj);
        }
        if (z7) {
            AbstractC3367j.m5098c(interfaceC2313c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C2093f c2093f = (C2093f) interfaceC2313c;
            AbstractC2583c abstractC2583c = c2093f.f12354i;
            Object obj2 = c2093f.f12356k;
            InterfaceC2318h mo662j = abstractC2583c.mo662j();
            Object m3441l = AbstractC2088a.m3441l(mo662j, obj2);
            if (m3441l != AbstractC2088a.f12343d) {
                c0583w1 = m1148z(abstractC2583c, mo662j, m3441l);
            } else {
                c0583w1 = null;
            }
            try {
                abstractC2583c.mo663n(mo1204f);
                if (c0583w1 != null && !c0583w1.m1246m0()) {
                    return;
                }
                AbstractC2088a.m3436g(mo662j, m3441l);
                return;
            } catch (Throwable th) {
                if (c0583w1 == null || c0583w1.m1246m0()) {
                    AbstractC2088a.m3436g(mo662j, m3441l);
                }
                throw th;
            }
        }
        interfaceC2313c.mo663n(mo1204f);
    }

    /* renamed from: w */
    public static final Object m1145w(InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e) {
        AbstractC0570s0 abstractC0570s0;
        InterfaceC2318h m1133k;
        long j6;
        C0569s c0569s;
        Thread currentThread = Thread.currentThread();
        InterfaceC2317g interfaceC2317g = C2314d.f13272e;
        InterfaceC2315e interfaceC2315e = (InterfaceC2315e) interfaceC2318h.mo853h(interfaceC2317g);
        C2319i c2319i = C2319i.f13273e;
        if (interfaceC2315e == null) {
            abstractC0570s0 = AbstractC0574t1.m1243a();
            m1133k = m1133k(c2319i, interfaceC2318h.mo855z(abstractC0570s0), true);
            C2325e c2325e = AbstractC0549l0.f1898a;
            if (m1133k != c2325e && m1133k.mo853h(interfaceC2317g) == null) {
                m1133k = m1133k.mo855z(c2325e);
            }
        } else {
            if (interfaceC2315e instanceof AbstractC0570s0) {
            }
            abstractC0570s0 = (AbstractC0570s0) AbstractC0574t1.f1928a.get();
            m1133k = m1133k(c2319i, interfaceC2318h, true);
            C2325e c2325e2 = AbstractC0549l0.f1898a;
            if (m1133k != c2325e2 && m1133k.mo853h(interfaceC2317g) == null) {
                m1133k = m1133k.mo855z(c2325e2);
            }
        }
        C0530f c0530f = new C0530f(m1133k, currentThread, abstractC0570s0);
        c0530f.m1110l0(EnumC0519b0.f1844e, c0530f, interfaceC3281e);
        AbstractC0570s0 abstractC0570s02 = c0530f.f1872i;
        if (abstractC0570s02 != null) {
            int i7 = AbstractC0570s0.f1924j;
            abstractC0570s02.m1241P(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (abstractC0570s02 != null) {
                    j6 = abstractC0570s02.mo1234Q();
                } else {
                    j6 = Long.MAX_VALUE;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0541i1.f1886e;
                if (atomicReferenceFieldUpdater.get(c0530f) instanceof InterfaceC0585x0) {
                    LockSupport.parkNanos(c0530f, j6);
                } else {
                    if (abstractC0570s02 != null) {
                        int i8 = AbstractC0570s0.f1924j;
                        abstractC0570s02.m1239M(false);
                    }
                    Object m1147y = m1147y(atomicReferenceFieldUpdater.get(c0530f));
                    if (m1147y instanceof C0569s) {
                        c0569s = (C0569s) m1147y;
                    } else {
                        c0569s = null;
                    }
                    if (c0569s == null) {
                        return m1147y;
                    }
                    throw c0569s.f1923a;
                }
            } catch (Throwable th) {
                if (abstractC0570s02 != null) {
                    int i9 = AbstractC0570s0.f1924j;
                    abstractC0570s02.m1239M(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0530f.m1173G(interruptedException);
        throw interruptedException;
    }

    /* renamed from: x */
    public static final String m1146x(InterfaceC2313c interfaceC2313c) {
        Object m2985m;
        if (interfaceC2313c instanceof C2093f) {
            return ((C2093f) interfaceC2313c).toString();
        }
        try {
            m2985m = interfaceC2313c + '@' + m1134l(interfaceC2313c);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (C1690i.m2747a(m2985m) != null) {
            m2985m = interfaceC2313c.getClass().getName() + '@' + m1134l(interfaceC2313c);
        }
        return (String) m2985m;
    }

    /* renamed from: y */
    public static final Object m1147y(Object obj) {
        C0588y0 c0588y0;
        InterfaceC0585x0 interfaceC0585x0;
        if (obj instanceof C0588y0) {
            c0588y0 = (C0588y0) obj;
        } else {
            c0588y0 = null;
        }
        if (c0588y0 != null && (interfaceC0585x0 = c0588y0.f1941a) != null) {
            return interfaceC0585x0;
        }
        return obj;
    }

    /* renamed from: z */
    public static final C0583w1 m1148z(InterfaceC2313c interfaceC2313c, InterfaceC2318h interfaceC2318h, Object obj) {
        C0583w1 c0583w1 = null;
        if ((interfaceC2313c instanceof InterfaceC2584d) && interfaceC2318h.mo853h(C0586x1.f1940e) != null) {
            InterfaceC2584d interfaceC2584d = (InterfaceC2584d) interfaceC2313c;
            while (true) {
                if ((interfaceC2584d instanceof C0543j0) || (interfaceC2584d = interfaceC2584d.mo1215g()) == null) {
                    break;
                }
                if (interfaceC2584d instanceof C0583w1) {
                    c0583w1 = (C0583w1) interfaceC2584d;
                    break;
                }
            }
            if (c0583w1 != null) {
                c0583w1.m1247n0(interfaceC2318h, obj);
            }
        }
        return c0583w1;
    }
}
