package p085l0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0068q2;
import p008b.C0226c0;
import p015b6.C0310q;
import p017c.C0320e;
import p017c.C0321f;
import p032d6.C0526d1;
import p032d6.C0548l;
import p032d6.C0584x;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0542j;
import p053g5.C1687f;
import p053g5.C1694m;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p077k.C2194h0;
import p077k.C2196i0;
import p082k5.InterfaceC2318h;
import p101n0.C2701a;
import p101n0.C2705e;
import p101n0.C2707g;
import p130r0.C3024b;
import p150t5.InterfaceC3281e;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.C3452b;
import p161v0.C3460g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.u1 */
/* loaded from: classes.dex */
public final class C2414u1 extends AbstractC2406s {

    /* renamed from: x */
    public static final C1701c0 f13577x = AbstractC1719t.m2771b(C3024b.f15580h);

    /* renamed from: y */
    public static final AtomicReference f13578y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a */
    public final C2351e f13579a;

    /* renamed from: b */
    public final Object f13580b;

    /* renamed from: c */
    public InterfaceC0520b1 f13581c;

    /* renamed from: d */
    public Throwable f13582d;

    /* renamed from: e */
    public final ArrayList f13583e;

    /* renamed from: f */
    public Object f13584f;

    /* renamed from: g */
    public C2196i0 f13585g;

    /* renamed from: h */
    public final C2705e f13586h;

    /* renamed from: i */
    public final ArrayList f13587i;

    /* renamed from: j */
    public final ArrayList f13588j;

    /* renamed from: k */
    public final C2194h0 f13589k;

    /* renamed from: l */
    public final C0068q2 f13590l;

    /* renamed from: m */
    public final C2194h0 f13591m;

    /* renamed from: n */
    public final C2194h0 f13592n;

    /* renamed from: o */
    public ArrayList f13593o;

    /* renamed from: p */
    public LinkedHashSet f13594p;

    /* renamed from: q */
    public C0548l f13595q;

    /* renamed from: r */
    public C0019e1 f13596r;

    /* renamed from: s */
    public boolean f13597s;

    /* renamed from: t */
    public final C1701c0 f13598t;

    /* renamed from: u */
    public final C0526d1 f13599u;

    /* renamed from: v */
    public final InterfaceC2318h f13600v;

    /* renamed from: w */
    public final C2413u0 f13601w;

    public C2414u1(InterfaceC2318h interfaceC2318h) {
        C2351e c2351e = new C2351e(new C0226c0(13, this));
        this.f13579a = c2351e;
        this.f13580b = new Object();
        this.f13583e = new ArrayList();
        this.f13585g = new C2196i0();
        this.f13586h = new C2705e(new C2415v[16]);
        this.f13587i = new ArrayList();
        this.f13588j = new ArrayList();
        this.f13589k = new C2194h0();
        this.f13590l = new C0068q2(14);
        this.f13591m = new C2194h0();
        this.f13592n = new C2194h0();
        this.f13598t = AbstractC1719t.m2771b(EnumC2408s1.f13552g);
        new C0031h1(10, (byte) 0);
        C0526d1 c0526d1 = new C0526d1((InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f));
        c0526d1.mo1119y(new C0310q(16, this));
        this.f13599u = c0526d1;
        this.f13600v = interfaceC2318h.mo855z(c2351e).mo855z(c0526d1);
        this.f13601w = new C2413u0(8);
    }

    /* renamed from: r */
    public static void m3914r(C3452b c3452b) {
        try {
            if (!(c3452b.mo5203w() instanceof C3460g)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c3452b.mo5198c();
        }
    }

    /* renamed from: x */
    public static final void m3915x(ArrayList arrayList, C2414u1 c2414u1, C2415v c2415v) {
        arrayList.clear();
        synchronized (c2414u1.f13580b) {
            Iterator it = c2414u1.f13588j.iterator();
            if (it.hasNext()) {
                ((AbstractC2422x0) it.next()).getClass();
                throw null;
            }
        }
    }

    /* renamed from: A */
    public final void m3916A(Throwable th, C2415v c2415v) {
        if (((Boolean) f13578y.get()).booleanValue() && !(th instanceof C2371j)) {
            synchronized (this.f13580b) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.f13587i.clear();
                    this.f13586h.m4305g();
                    this.f13585g = new C2196i0();
                    this.f13588j.clear();
                    this.f13589k.m3586a();
                    this.f13591m.m3586a();
                    this.f13596r = new C0019e1(th);
                    if (c2415v != null) {
                        m3918C(c2415v);
                    }
                    m3920t();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f13580b) {
            C0019e1 c0019e1 = this.f13596r;
            if (c0019e1 == null) {
                this.f13596r = new C0019e1(th);
            } else {
                throw ((Throwable) c0019e1.f109e);
            }
        }
        throw th;
    }

    /* renamed from: B */
    public final boolean m3917B() {
        synchronized (this.f13580b) {
            boolean z7 = true;
            if (this.f13585g.m3605g()) {
                if (this.f13586h.f14519g == 0 && !m3921u() && !this.f13589k.m3595j()) {
                    z7 = false;
                }
                return z7;
            }
            List m3923w = m3923w();
            C2707g c2707g = new C2707g(this.f13585g);
            this.f13585g = new C2196i0();
            try {
                int size = m3923w.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C2415v) m3923w.get(i7)).m3950x(c2707g);
                    if (((EnumC2408s1) this.f13598t.getValue()).compareTo(EnumC2408s1.f13551f) <= 0) {
                        break;
                    }
                }
                synchronized (this.f13580b) {
                    if (m3920t() == null) {
                        if (this.f13586h.f14519g == 0 && !m3921u() && !this.f13589k.m3595j()) {
                            z7 = false;
                        }
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return z7;
            } catch (Throwable th) {
                synchronized (this.f13580b) {
                    C2196i0 c2196i0 = this.f13585g;
                    c2196i0.getClass();
                    Iterator<E> it = c2707g.iterator();
                    while (it.hasNext()) {
                        c2196i0.m3607i(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: C */
    public final void m3918C(C2415v c2415v) {
        ArrayList arrayList = this.f13593o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f13593o = arrayList;
        }
        if (!arrayList.contains(c2415v)) {
            arrayList.add(c2415v);
        }
        if (this.f13583e.remove(c2415v)) {
            this.f13584f = null;
        }
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: a */
    public final void mo3803a(C2415v c2415v, InterfaceC3281e interfaceC3281e) {
        EnumC2408s1 enumC2408s1;
        boolean z7;
        C3452b c3452b;
        C3452b mo5197C;
        boolean z8 = c2415v.f13621x.f13472F;
        synchronized (this.f13580b) {
            EnumC2408s1 enumC2408s12 = (EnumC2408s1) this.f13598t.getValue();
            enumC2408s1 = EnumC2408s1.f13551f;
            z7 = true;
            if (enumC2408s12.compareTo(enumC2408s1) > 0) {
                z7 = true ^ m3923w().contains(c2415v);
            }
        }
        try {
            C0310q c0310q = new C0310q(15, c2415v);
            C0321f c0321f = new C0321f(16, c2415v, null);
            AbstractC3459f m5244k = AbstractC3465l.m5244k();
            if (m5244k instanceof C3452b) {
                c3452b = (C3452b) m5244k;
            } else {
                c3452b = null;
            }
            if (c3452b != null && (mo5197C = c3452b.mo5197C(c0310q, c0321f)) != null) {
                try {
                    AbstractC3459f m5227j = mo5197C.m5227j();
                    try {
                        c2415v.m3936j(interfaceC3281e);
                        synchronized (this.f13580b) {
                            if (((EnumC2408s1) this.f13598t.getValue()).compareTo(enumC2408s1) > 0 && !m3923w().contains(c2415v)) {
                                this.f13583e.add(c2415v);
                                this.f13584f = null;
                            }
                        }
                        if (!z8) {
                            AbstractC3465l.m5244k().mo5201m();
                        }
                        try {
                            synchronized (this.f13580b) {
                                ArrayList arrayList = this.f13588j;
                                if (arrayList.size() > 0) {
                                    ((AbstractC2422x0) arrayList.get(0)).getClass();
                                    throw null;
                                }
                            }
                            try {
                                c2415v.m3930d();
                                c2415v.m3932f();
                                if (!z8) {
                                    AbstractC3465l.m5244k().mo5201m();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                m3916A(th, null);
                                return;
                            }
                        } catch (Throwable th2) {
                            m3916A(th2, c2415v);
                            return;
                        }
                    } finally {
                        AbstractC3459f.m5225q(m5227j);
                    }
                } finally {
                    m3914r(mo5197C);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z7) {
                synchronized (this.f13580b) {
                }
            }
            m3916A(th3, c2415v);
        }
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: c */
    public final boolean mo3805c() {
        return ((Boolean) f13578y.get()).booleanValue();
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: d */
    public final boolean mo3806d() {
        return false;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: e */
    public final boolean mo3807e() {
        return false;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: f */
    public final long mo3808f() {
        return 1000;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: g */
    public final InterfaceC2403r mo3809g() {
        return null;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: i */
    public final InterfaceC2318h mo3811i() {
        return this.f13600v;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: j */
    public final void mo3812j(C2415v c2415v) {
        InterfaceC0542j interfaceC0542j;
        synchronized (this.f13580b) {
            if (!this.f13586h.m4306h(c2415v)) {
                this.f13586h.m4300b(c2415v);
                interfaceC0542j = m3920t();
            } else {
                interfaceC0542j = null;
            }
        }
        if (interfaceC0542j != null) {
            ((C0548l) interfaceC0542j).mo663n(C1694m.f10482a);
        }
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: k */
    public final AbstractC2419w0 mo3813k(AbstractC2422x0 abstractC2422x0) {
        AbstractC2419w0 abstractC2419w0;
        synchronized (this.f13580b) {
            abstractC2419w0 = (AbstractC2419w0) this.f13591m.m3596k(abstractC2422x0);
        }
        return abstractC2419w0;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: n */
    public final void mo3816n(C2415v c2415v) {
        synchronized (this.f13580b) {
            try {
                LinkedHashSet linkedHashSet = this.f13594p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f13594p = linkedHashSet;
                }
                linkedHashSet.add(c2415v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: q */
    public final void mo3819q(C2415v c2415v) {
        synchronized (this.f13580b) {
            if (this.f13583e.remove(c2415v)) {
                this.f13584f = null;
            }
            this.f13586h.m4308j(c2415v);
            this.f13587i.remove(c2415v);
        }
    }

    /* renamed from: s */
    public final void m3919s() {
        synchronized (this.f13580b) {
            if (((EnumC2408s1) this.f13598t.getValue()).compareTo(EnumC2408s1.f13554i) >= 0) {
                C1701c0 c1701c0 = this.f13598t;
                EnumC2408s1 enumC2408s1 = EnumC2408s1.f13551f;
                c1701c0.getClass();
                c1701c0.m2752j(null, enumC2408s1);
            }
        }
        this.f13599u.mo1114c(null);
    }

    /* renamed from: t */
    public final InterfaceC0542j m3920t() {
        C1701c0 c1701c0 = this.f13598t;
        int compareTo = ((EnumC2408s1) c1701c0.getValue()).compareTo(EnumC2408s1.f13551f);
        ArrayList arrayList = this.f13588j;
        ArrayList arrayList2 = this.f13587i;
        C2705e c2705e = this.f13586h;
        if (compareTo <= 0) {
            for (C2415v c2415v : m3923w()) {
            }
            this.f13583e.clear();
            this.f13584f = C1813u.f10860e;
            this.f13585g = new C2196i0();
            c2705e.m4305g();
            arrayList2.clear();
            arrayList.clear();
            this.f13593o = null;
            C0548l c0548l = this.f13595q;
            if (c0548l != null) {
                c0548l.mo1199p(null);
            }
            this.f13595q = null;
            this.f13596r = null;
            return null;
        }
        C0019e1 c0019e1 = this.f13596r;
        EnumC2408s1 enumC2408s1 = EnumC2408s1.f13555j;
        EnumC2408s1 enumC2408s12 = EnumC2408s1.f13552g;
        if (c0019e1 == null) {
            if (this.f13581c == null) {
                this.f13585g = new C2196i0();
                c2705e.m4305g();
                if (m3921u()) {
                    enumC2408s12 = EnumC2408s1.f13553h;
                }
            } else {
                enumC2408s12 = (c2705e.f14519g == 0 && !this.f13585g.m3606h() && arrayList2.isEmpty() && arrayList.isEmpty() && !m3921u() && !this.f13589k.m3595j()) ? EnumC2408s1.f13554i : enumC2408s1;
            }
        }
        c1701c0.getClass();
        c1701c0.m2752j(null, enumC2408s12);
        if (enumC2408s12 != enumC2408s1) {
            return null;
        }
        C0548l c0548l2 = this.f13595q;
        this.f13595q = null;
        return c0548l2;
    }

    /* renamed from: u */
    public final boolean m3921u() {
        if (!this.f13597s && (this.f13579a.f13386h.get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m3922v() {
        boolean z7;
        synchronized (this.f13580b) {
            if (!this.f13585g.m3606h() && this.f13586h.f14519g == 0) {
                if (!m3921u()) {
                    z7 = false;
                }
            }
            z7 = true;
        }
        return z7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* renamed from: w */
    public final List m3923w() {
        List arrayList;
        ?? r02 = this.f13584f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList2 = this.f13583e;
        if (arrayList2.isEmpty()) {
            arrayList = C1813u.f10860e;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.f13584f = arrayList;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (((p053g5.C1687f) r10.get(r4)).f10472f == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        r11 = (p053g5.C1687f) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        if (r11.f10472f != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
    
        r11 = (p085l0.AbstractC2422x0) r11.f10471e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r4 = r17.f13580b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        p060h5.AbstractC1811s.m3076X(r3, r17.f13588j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        if (((p053g5.C1687f) r11).f10472f == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        r10 = r3;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m3924y(List list, C2196i0 c2196i0) {
        C3452b c3452b;
        C3452b mo5197C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            ((AbstractC2422x0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C2415v c2415v = (C2415v) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c2415v.f13621x.f13472F) {
                AbstractC2399q.m3900c("Check failed");
            }
            C0310q c0310q = new C0310q(15, c2415v);
            C0321f c0321f = new C0321f(16, c2415v, c2196i0);
            AbstractC3459f m5244k = AbstractC3465l.m5244k();
            if (m5244k instanceof C3452b) {
                c3452b = (C3452b) m5244k;
            } else {
                c3452b = null;
            }
            if (c3452b != null && (mo5197C = c3452b.mo5197C(c0310q, c0321f)) != null) {
                try {
                    AbstractC3459f m5227j = mo5197C.m5227j();
                    try {
                        synchronized (this.f13580b) {
                            try {
                                arrayList = new ArrayList(list2.size());
                                int size2 = list2.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    AbstractC2422x0 abstractC2422x0 = (AbstractC2422x0) list2.get(i8);
                                    C2194h0 c2194h0 = this.f13589k;
                                    abstractC2422x0.getClass();
                                    Object m4297a = C2701a.m4297a(c2194h0);
                                    arrayList.add(new C1687f(abstractC2422x0, m4297a));
                                }
                                int size3 = arrayList.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size3) {
                                        break;
                                    }
                                    C1687f c1687f = (C1687f) arrayList.get(i9);
                                    if (c1687f.f10472f == null) {
                                        C0068q2 c0068q2 = this.f13590l;
                                        ((AbstractC2422x0) c1687f.f10471e).getClass();
                                        if (((C2194h0) c0068q2.f344f).m3587b(null)) {
                                            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                            int size4 = arrayList.size();
                                            int i10 = 0;
                                            while (i10 < size4) {
                                                Object obj3 = arrayList.get(i10);
                                                i10++;
                                                C1687f c1687f2 = (C1687f) obj3;
                                                if (c1687f2.f10472f == null) {
                                                    C0068q2 c0068q22 = this.f13590l;
                                                    ((AbstractC2422x0) c1687f2.f10471e).getClass();
                                                    C2194h0 c2194h02 = (C2194h0) c0068q22.f344f;
                                                    if (c2194h02.m3594i()) {
                                                        ((C2194h0) c0068q22.f345g).m3586a();
                                                    }
                                                }
                                                arrayList2.add(c1687f2);
                                            }
                                            arrayList = arrayList2;
                                        }
                                    }
                                    i9++;
                                }
                            } finally {
                            }
                        }
                        int size5 = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size5) {
                                break;
                            }
                            if (((C1687f) arrayList.get(i11)).f10472f != null) {
                                break;
                            }
                            i11++;
                        }
                        c2415v.m3943q(arrayList);
                        AbstractC3459f.m5225q(m5227j);
                    } catch (Throwable th) {
                        AbstractC3459f.m5225q(m5227j);
                        throw th;
                    }
                } finally {
                    m3914r(mo5197C);
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return AbstractC1805m.m3035C0(hashMap.keySet());
    }

    /* renamed from: z */
    public final C2415v m3925z(C2415v c2415v, C2196i0 c2196i0) {
        C3452b c3452b;
        C3452b mo5197C;
        if (c2415v.f13621x.f13472F || c2415v.f13622y == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f13594p;
        if (linkedHashSet == null || !linkedHashSet.contains(c2415v)) {
            C0310q c0310q = new C0310q(15, c2415v);
            C0321f c0321f = new C0321f(16, c2415v, c2196i0);
            AbstractC3459f m5244k = AbstractC3465l.m5244k();
            if (m5244k instanceof C3452b) {
                c3452b = (C3452b) m5244k;
            } else {
                c3452b = null;
            }
            if (c3452b != null && (mo5197C = c3452b.mo5197C(c0310q, c0321f)) != null) {
                try {
                    AbstractC3459f m5227j = mo5197C.m5227j();
                    if (c2196i0 != null) {
                        try {
                            if (c2196i0.m3606h()) {
                                C0320e c0320e = new C0320e(28, c2196i0, c2415v);
                                C2395p c2395p = c2415v.f13621x;
                                if (c2395p.f13472F) {
                                    AbstractC2399q.m3900c("Preparing a composition while composing is not supported");
                                }
                                c2395p.f13472F = true;
                                try {
                                    c0320e.mo52a();
                                    c2395p.f13472F = false;
                                } catch (Throwable th) {
                                    c2395p.f13472F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC3459f.m5225q(m5227j);
                            throw th2;
                        }
                    }
                    boolean m3949w = c2415v.m3949w();
                    AbstractC3459f.m5225q(m5227j);
                    if (m3949w) {
                        return c2415v;
                    }
                } finally {
                    m3914r(mo5197C);
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: l */
    public final void mo3814l(Set set) {
    }
}
