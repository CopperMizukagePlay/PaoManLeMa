package p032d6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p039e5.C1279sl;
import p053g5.C1690i;
import p053g5.C1694m;
import p069i6.AbstractC2088a;
import p069i6.AbstractC2104q;
import p069i6.C2093f;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.InterfaceC2584d;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.l */
/* loaded from: classes.dex */
public class C0548l extends AbstractC0546k0 implements InterfaceC0542j, InterfaceC2584d, InterfaceC0589y1 {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1893j = AtomicIntegerFieldUpdater.newUpdater(C0548l.class, "_decisionAndIndex$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1894k = AtomicReferenceFieldUpdater.newUpdater(C0548l.class, Object.class, "_state$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1895l = AtomicReferenceFieldUpdater.newUpdater(C0548l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h */
    public final InterfaceC2313c f1896h;

    /* renamed from: i */
    public final InterfaceC2318h f1897i;

    public C0548l(int i7, InterfaceC2313c interfaceC2313c) {
        super(i7);
        this.f1896h = interfaceC2313c;
        this.f1897i = interfaceC2313c.mo662j();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0518b.f1843a;
    }

    /* renamed from: A */
    public static void m1208A(InterfaceC0556n1 interfaceC0556n1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC0556n1 + ", already has " + obj).toString());
    }

    /* renamed from: G */
    public static Object m1209G(InterfaceC0556n1 interfaceC0556n1, Object obj, int i7, InterfaceC3282f interfaceC3282f) {
        InterfaceC0539i interfaceC0539i;
        if (obj instanceof C0569s) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (interfaceC3282f == null && !(interfaceC0556n1 instanceof InterfaceC0539i)) {
            return obj;
        }
        if (interfaceC0556n1 instanceof InterfaceC0539i) {
            interfaceC0539i = (InterfaceC0539i) interfaceC0556n1;
        } else {
            interfaceC0539i = null;
        }
        return new C0566r(obj, interfaceC0539i, interfaceC3282f, (Throwable) null, 16);
    }

    /* renamed from: B */
    public String mo1160B() {
        return "CancellableContinuation";
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: C */
    public final void mo1197C(Object obj) {
        m1220q(this.f1892g);
    }

    /* renamed from: D */
    public final void m1210D() {
        C2093f c2093f;
        InterfaceC2313c interfaceC2313c = this.f1896h;
        Throwable th = null;
        if (interfaceC2313c instanceof C2093f) {
            c2093f = (C2093f) interfaceC2313c;
        } else {
            c2093f = null;
        }
        if (c2093f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2093f.f12352l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c2093f);
                C1279sl c1279sl = AbstractC2088a.f12342c;
                if (obj != c1279sl) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2093f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c2093f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c2093f, c1279sl, this)) {
                    if (atomicReferenceFieldUpdater.get(c2093f) != c1279sl) {
                        break;
                    }
                }
            }
            if (th != null) {
                m1219o();
                mo1199p(th);
            }
        }
    }

    /* renamed from: E */
    public final void m1211E(Object obj, int i7, InterfaceC3282f interfaceC3282f) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1894k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC0556n1) {
                Object m1209G = m1209G((InterfaceC0556n1) obj2, obj, i7, interfaceC3282f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m1209G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m1227z()) {
                    m1219o();
                }
                m1220q(i7);
                return;
            }
            if (obj2 instanceof C0551m) {
                C0551m c0551m = (C0551m) obj2;
                if (C0551m.f1900c.compareAndSet(c0551m, 0, 1)) {
                    if (interfaceC3282f != null) {
                        m1217l(interfaceC3282f, c0551m.f1923a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* renamed from: F */
    public final void m1212F(AbstractC0581w abstractC0581w) {
        C2093f c2093f;
        AbstractC0581w abstractC0581w2;
        int i7;
        InterfaceC2313c interfaceC2313c = this.f1896h;
        if (interfaceC2313c instanceof C2093f) {
            c2093f = (C2093f) interfaceC2313c;
        } else {
            c2093f = null;
        }
        if (c2093f != null) {
            abstractC0581w2 = c2093f.f12353h;
        } else {
            abstractC0581w2 = null;
        }
        if (abstractC0581w2 == abstractC0581w) {
            i7 = 4;
        } else {
            i7 = this.f1892g;
        }
        m1211E(C1694m.f10482a, i7, null);
    }

    /* renamed from: H */
    public final C1279sl m1213H(Object obj, InterfaceC3282f interfaceC3282f) {
        C1279sl c1279sl = AbstractC0525d0.f1855a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1894k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC0556n1) {
                Object m1209G = m1209G((InterfaceC0556n1) obj2, obj, this.f1892g, interfaceC3282f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m1209G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m1227z()) {
                    m1219o();
                }
                return c1279sl;
            }
            return null;
        }
    }

    @Override // p032d6.InterfaceC0589y1
    /* renamed from: a */
    public final void mo1214a(AbstractC2104q abstractC2104q, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1893j;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        m1225x(abstractC2104q);
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: b */
    public final void mo1201b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1894k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC0556n1)) {
                if (!(obj instanceof C0569s)) {
                    if (obj instanceof C0566r) {
                        C0566r c0566r = (C0566r) obj;
                        if (c0566r.f1918e == null) {
                            C0566r m1232a = C0566r.m1232a(c0566r, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1232a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            InterfaceC0539i interfaceC0539i = c0566r.f1915b;
                            if (interfaceC0539i != null) {
                                m1216k(interfaceC0539i, cancellationException);
                            }
                            InterfaceC3282f interfaceC3282f = c0566r.f1916c;
                            if (interfaceC3282f != null) {
                                m1217l(interfaceC3282f, cancellationException, c0566r.f1914a);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    C0566r c0566r2 = new C0566r(obj, (InterfaceC0539i) null, (InterfaceC3282f) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0566r2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: c */
    public final InterfaceC2313c mo1202c() {
        return this.f1896h;
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: d */
    public final Throwable mo1203d(Object obj) {
        Throwable mo1203d = super.mo1203d(obj);
        if (mo1203d != null) {
            return mo1203d;
        }
        return null;
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: e */
    public final C1279sl mo1198e(Object obj, InterfaceC3282f interfaceC3282f) {
        return m1213H(obj, interfaceC3282f);
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: f */
    public final Object mo1204f(Object obj) {
        if (obj instanceof C0566r) {
            return ((C0566r) obj).f1914a;
        }
        return obj;
    }

    @Override // p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f1896h;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }

    @Override // p032d6.AbstractC0546k0
    /* renamed from: i */
    public final Object mo1206i() {
        return f1894k.get(this);
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f1897i;
    }

    /* renamed from: k */
    public final void m1216k(InterfaceC0539i interfaceC0539i, Throwable th) {
        try {
            interfaceC0539i.mo1120a(th);
        } catch (Throwable th2) {
            AbstractC0525d0.m1137o(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f1897i);
        }
    }

    /* renamed from: l */
    public final void m1217l(InterfaceC3282f interfaceC3282f, Throwable th, Object obj) {
        InterfaceC2318h interfaceC2318h = this.f1897i;
        try {
            interfaceC3282f.mo24c(th, obj, interfaceC2318h);
        } catch (Throwable th2) {
            AbstractC0525d0.m1137o(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), interfaceC2318h);
        }
    }

    /* renamed from: m */
    public final void m1218m(AbstractC2104q abstractC2104q, Throwable th) {
        InterfaceC2318h interfaceC2318h = this.f1897i;
        int i7 = f1893j.get(this) & 536870911;
        if (i7 != 536870911) {
            try {
                abstractC2104q.mo2512h(i7, interfaceC2318h);
                return;
            } catch (Throwable th2) {
                AbstractC0525d0.m1137o(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), interfaceC2318h);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        Throwable m2747a = C1690i.m2747a(obj);
        if (m2747a != null) {
            obj = new C0569s(m2747a, false);
        }
        m1211E(obj, this.f1892g, null);
    }

    /* renamed from: o */
    public final void m1219o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1895l;
        InterfaceC0552m0 interfaceC0552m0 = (InterfaceC0552m0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0552m0 == null) {
            return;
        }
        interfaceC0552m0.mo1155a();
        atomicReferenceFieldUpdater.set(this, C0553m1.f1901e);
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: p */
    public final boolean mo1199p(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1894k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = false;
            if (!(obj instanceof InterfaceC0556n1)) {
                return false;
            }
            if ((obj instanceof InterfaceC0539i) || (obj instanceof AbstractC2104q)) {
                z7 = true;
            }
            C0551m c0551m = new C0551m(this, th, z7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0551m)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC0556n1 interfaceC0556n1 = (InterfaceC0556n1) obj;
            if (interfaceC0556n1 instanceof InterfaceC0539i) {
                m1216k((InterfaceC0539i) obj, th);
            } else if (interfaceC0556n1 instanceof AbstractC2104q) {
                m1218m((AbstractC2104q) obj, th);
            }
            if (!m1227z()) {
                m1219o();
            }
            m1220q(this.f1892g);
            return true;
        }
    }

    /* renamed from: q */
    public final void m1220q(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        boolean z7;
        boolean z8;
        do {
            atomicIntegerFieldUpdater = f1893j;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    boolean z9 = false;
                    if (i7 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    InterfaceC2313c interfaceC2313c = this.f1896h;
                    if (!z7 && (interfaceC2313c instanceof C2093f)) {
                        if (i7 != 1 && i7 != 2) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        int i10 = this.f1892g;
                        if (i10 == 1 || i10 == 2) {
                            z9 = true;
                        }
                        if (z8 == z9) {
                            C2093f c2093f = (C2093f) interfaceC2313c;
                            AbstractC0581w abstractC0581w = c2093f.f12353h;
                            InterfaceC2318h mo662j = c2093f.f12354i.mo662j();
                            if (abstractC0581w.mo1244K(mo662j)) {
                                abstractC0581w.mo1233J(mo662j, this);
                                return;
                            }
                            AbstractC0570s0 m1243a = AbstractC0574t1.m1243a();
                            if (m1243a.f1925g >= 4294967296L) {
                                m1243a.m1240N(this);
                                return;
                            }
                            m1243a.m1241P(true);
                            try {
                                AbstractC0525d0.m1144v(this, interfaceC2313c, true);
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
                    }
                    AbstractC0525d0.m1144v(this, interfaceC2313c, z7);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    @Override // p032d6.InterfaceC0542j
    /* renamed from: r */
    public final void mo1200r(Object obj, InterfaceC3282f interfaceC3282f) {
        m1211E(obj, this.f1892g, interfaceC3282f);
    }

    /* renamed from: s */
    public Throwable mo1161s(C0541i1 c0541i1) {
        return c0541i1.mo1118w();
    }

    /* renamed from: t */
    public final Object m1221t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        InterfaceC0520b1 interfaceC0520b1;
        boolean m1227z = m1227z();
        do {
            atomicIntegerFieldUpdater = f1893j;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    if (m1227z) {
                        m1210D();
                    }
                    Object obj = f1894k.get(this);
                    if (!(obj instanceof C0569s)) {
                        int i9 = this.f1892g;
                        if ((i9 == 1 || i9 == 2) && (interfaceC0520b1 = (InterfaceC0520b1) this.f1897i.mo853h(C0584x.f1939f)) != null && !interfaceC0520b1.mo1113b()) {
                            CancellationException mo1118w = interfaceC0520b1.mo1118w();
                            mo1201b(mo1118w);
                            throw mo1118w;
                        }
                        return mo1204f(obj);
                    }
                    throw ((C0569s) obj).f1923a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((InterfaceC0552m0) f1895l.get(this)) == null) {
            m1223v();
        }
        if (m1227z) {
            m1210D();
        }
        return EnumC2465a.f13750e;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo1160B());
        sb.append('(');
        sb.append(AbstractC0525d0.m1146x(this.f1896h));
        sb.append("){");
        Object obj = f1894k.get(this);
        if (obj instanceof InterfaceC0556n1) {
            str = "Active";
        } else if (obj instanceof C0551m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0525d0.m1134l(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1222u() {
        InterfaceC0552m0 m1223v = m1223v();
        if (m1223v != null && !(f1894k.get(this) instanceof InterfaceC0556n1)) {
            m1223v.mo1155a();
            f1895l.set(this, C0553m1.f1901e);
        }
    }

    /* renamed from: v */
    public final InterfaceC0552m0 m1223v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) this.f1897i.mo853h(C0584x.f1939f);
        if (interfaceC0520b1 == null) {
            return null;
        }
        InterfaceC0552m0 m1138p = AbstractC0525d0.m1138p(interfaceC0520b1, true, new C0554n(this, 0));
        do {
            atomicReferenceFieldUpdater = f1895l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m1138p)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m1138p;
    }

    /* renamed from: w */
    public final void m1224w(InterfaceC3279c interfaceC3279c) {
        m1225x(new C0536h(1, interfaceC3279c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        m1208A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1225x(InterfaceC0556n1 interfaceC0556n1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1894k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0518b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC0556n1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC0539i) || (obj instanceof AbstractC2104q)) {
                break;
            }
            if (obj instanceof C0569s) {
                C0569s c0569s = (C0569s) obj;
                if (C0569s.f1922b.compareAndSet(c0569s, 0, 1)) {
                    if (obj instanceof C0551m) {
                        Throwable th = c0569s.f1923a;
                        if (interfaceC0556n1 instanceof InterfaceC0539i) {
                            m1216k((InterfaceC0539i) interfaceC0556n1, th);
                            return;
                        } else {
                            m1218m((AbstractC2104q) interfaceC0556n1, th);
                            return;
                        }
                    }
                    return;
                }
                m1208A(interfaceC0556n1, obj);
                throw null;
            }
            if (obj instanceof C0566r) {
                C0566r c0566r = (C0566r) obj;
                if (c0566r.f1915b == null) {
                    if (!(interfaceC0556n1 instanceof AbstractC2104q)) {
                        InterfaceC0539i interfaceC0539i = (InterfaceC0539i) interfaceC0556n1;
                        Throwable th2 = c0566r.f1918e;
                        if (th2 != null) {
                            m1216k(interfaceC0539i, th2);
                            return;
                        }
                        C0566r m1232a = C0566r.m1232a(c0566r, interfaceC0539i, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1232a)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                m1208A(interfaceC0556n1, obj);
                throw null;
            }
            if (!(interfaceC0556n1 instanceof AbstractC2104q)) {
                C0566r c0566r2 = new C0566r(obj, (InterfaceC0539i) interfaceC0556n1, (InterfaceC3282f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0566r2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    /* renamed from: y */
    public final boolean m1226y() {
        return f1894k.get(this) instanceof InterfaceC0556n1;
    }

    /* renamed from: z */
    public final boolean m1227z() {
        if (this.f1892g == 2) {
            InterfaceC2313c interfaceC2313c = this.f1896h;
            AbstractC3367j.m5098c(interfaceC2313c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C2093f.f12352l.get((C2093f) interfaceC2313c) != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
