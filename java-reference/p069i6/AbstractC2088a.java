package p069i6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000a.AbstractC0000a;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0570s0;
import p032d6.AbstractC0574t1;
import p032d6.AbstractC0581w;
import p032d6.C0569s;
import p032d6.C0583w1;
import p032d6.C0584x;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0571s1;
import p032d6.InterfaceC0587y;
import p039e5.C1279sl;
import p050g2.C1584e0;
import p053g5.C1690i;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p100n.AbstractC2647h;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.a */
/* loaded from: classes.dex */
public abstract class AbstractC2088a {

    /* renamed from: a */
    public static final C1279sl f12340a;

    /* renamed from: b */
    public static final C1279sl f12341b;

    /* renamed from: c */
    public static final C1279sl f12342c;

    /* renamed from: d */
    public static final C1279sl f12343d;

    /* renamed from: e */
    public static final C1584e0 f12344e = new C1584e0(4);

    /* renamed from: f */
    public static final C1584e0 f12345f = new C1584e0(5);

    /* renamed from: g */
    public static final C1584e0 f12346g = new C1584e0(6);

    static {
        int i7 = 1;
        f12340a = new C1279sl("CLOSED", i7);
        f12341b = new C1279sl("UNDEFINED", i7);
        f12342c = new C1279sl("REUSABLE_CLAIMED", i7);
        f12343d = new C1279sl("NO_THREAD_ELEMENTS", i7);
    }

    /* renamed from: a */
    public static final void m3430a(int i7) {
        if (i7 >= 1) {
        } else {
            throw new IllegalArgumentException(AbstractC2647h.m4256b("Expected positive parallelism level, but got ", i7).toString());
        }
    }

    /* renamed from: b */
    public static final Object m3431b(AbstractC2104q abstractC2104q, long j6, InterfaceC3281e interfaceC3281e) {
        while (true) {
            if (abstractC2104q.f12380c >= j6 && !abstractC2104q.mo3444d()) {
                return abstractC2104q;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC2089b.f12347a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC2104q);
            C1279sl c1279sl = f12340a;
            if (obj == c1279sl) {
                return c1279sl;
            }
            AbstractC2104q abstractC2104q2 = (AbstractC2104q) ((AbstractC2089b) obj);
            if (abstractC2104q2 == null) {
                abstractC2104q2 = (AbstractC2104q) interfaceC3281e.mo22d(Long.valueOf(abstractC2104q.f12380c + 1), abstractC2104q);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2104q, null, abstractC2104q2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2104q) != null) {
                        break;
                    }
                }
                if (abstractC2104q.mo3444d()) {
                    abstractC2104q.m3445e();
                }
            }
            abstractC2104q = abstractC2104q2;
        }
    }

    /* renamed from: c */
    public static final AbstractC2104q m3432c(Object obj) {
        if (obj != f12340a) {
            return (AbstractC2104q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* renamed from: d */
    public static final void m3433d(Throwable th, InterfaceC2318h interfaceC2318h) {
        Throwable runtimeException;
        Iterator it = AbstractC2091d.f12350a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0587y) it.next()).mo1248q(th, interfaceC2318h);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0000a.m7h(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0000a.m7h(th, new C2092e(interfaceC2318h));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: e */
    public static final boolean m3434e(Object obj) {
        if (obj == f12340a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final Object m3435f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: g */
    public static final void m3436g(InterfaceC2318h interfaceC2318h, Object obj) {
        if (obj != f12343d) {
            if (obj instanceof C2108u) {
                C2108u c2108u = (C2108u) obj;
                InterfaceC0571s1[] interfaceC0571s1Arr = c2108u.f12386b;
                int length = interfaceC0571s1Arr.length - 1;
                if (length < 0) {
                    return;
                }
                InterfaceC0571s1 interfaceC0571s1 = interfaceC0571s1Arr[length];
                AbstractC3367j.m5097b(null);
                Object obj2 = c2108u.f12385a[length];
                throw null;
            }
            Object mo852B = interfaceC2318h.mo852B(null, f12345f);
            AbstractC3367j.m5098c(mo852B, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC2487d.m4054r(mo852B);
            throw null;
        }
    }

    /* renamed from: h */
    public static final void m3437h(Object obj, InterfaceC2313c interfaceC2313c) {
        Object c0569s;
        C0583w1 c0583w1;
        if (interfaceC2313c instanceof C2093f) {
            C2093f c2093f = (C2093f) interfaceC2313c;
            AbstractC0581w abstractC0581w = c2093f.f12353h;
            AbstractC2583c abstractC2583c = c2093f.f12354i;
            Throwable m2747a = C1690i.m2747a(obj);
            if (m2747a == null) {
                c0569s = obj;
            } else {
                c0569s = new C0569s(m2747a, false);
            }
            if (abstractC0581w.mo1244K(abstractC2583c.mo662j())) {
                c2093f.f12355j = c0569s;
                c2093f.f1892g = 1;
                abstractC0581w.mo1233J(abstractC2583c.mo662j(), c2093f);
                return;
            }
            AbstractC0570s0 m1243a = AbstractC0574t1.m1243a();
            if (m1243a.f1925g >= 4294967296L) {
                c2093f.f12355j = c0569s;
                c2093f.f1892g = 1;
                m1243a.m1240N(c2093f);
                return;
            }
            m1243a.m1241P(true);
            try {
                InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) abstractC2583c.mo662j().mo853h(C0584x.f1939f);
                if (interfaceC0520b1 != null && !interfaceC0520b1.mo1113b()) {
                    c2093f.mo663n(AbstractC1793a0.m2985m(interfaceC0520b1.mo1118w()));
                } else {
                    Object obj2 = c2093f.f12356k;
                    InterfaceC2318h mo662j = abstractC2583c.mo662j();
                    Object m3441l = m3441l(mo662j, obj2);
                    if (m3441l != f12343d) {
                        c0583w1 = AbstractC0525d0.m1148z(abstractC2583c, mo662j, m3441l);
                    } else {
                        c0583w1 = null;
                    }
                    try {
                        abstractC2583c.mo663n(obj);
                    } finally {
                        if (c0583w1 == null || c0583w1.m1246m0()) {
                            m3436g(mo662j, m3441l);
                        }
                    }
                }
                do {
                } while (m1243a.m1242R());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC2313c.mo663n(obj);
    }

    /* renamed from: i */
    public static final long m3438i(String str, long j6, long j7, long j8) {
        String str2;
        int i7 = AbstractC2106s.f12382a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j6;
        }
        Long m974P = AbstractC0451r.m974P(str2);
        if (m974P != null) {
            long longValue = m974P.longValue();
            if (j7 <= longValue && longValue <= j8) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j7);
            AbstractC2487d.m4056t(sb, "..", j8, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    /* renamed from: j */
    public static int m3439j(int i7, int i8, String str) {
        int i9;
        if ((i8 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = 2097150;
        }
        return (int) m3438i(str, i7, 1, i9);
    }

    /* renamed from: k */
    public static final Object m3440k(InterfaceC2318h interfaceC2318h) {
        Object mo852B = interfaceC2318h.mo852B(0, f12344e);
        AbstractC3367j.m5097b(mo852B);
        return mo852B;
    }

    /* renamed from: l */
    public static final Object m3441l(InterfaceC2318h interfaceC2318h, Object obj) {
        if (obj == null) {
            obj = m3440k(interfaceC2318h);
        }
        if (obj == 0) {
            return f12343d;
        }
        if (obj instanceof Integer) {
            return interfaceC2318h.mo852B(new C2108u(((Number) obj).intValue(), interfaceC2318h), f12346g);
        }
        AbstractC2487d.m4054r(obj);
        throw null;
    }
}
