package p161v0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p008b.C0230e0;
import p015b6.C0310q;
import p024c6.C0453t;
import p060h5.AbstractC1805m;
import p085l0.AbstractC2389n1;
import p085l0.AbstractC2399q;
import p101n0.C2705e;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.u */
/* loaded from: classes.dex */
public final class C3474u {

    /* renamed from: a */
    public final AbstractC3368k f16753a;

    /* renamed from: c */
    public boolean f16755c;

    /* renamed from: h */
    public C0230e0 f16760h;

    /* renamed from: i */
    public C3473t f16761i;

    /* renamed from: b */
    public final AtomicReference f16754b = new AtomicReference(null);

    /* renamed from: d */
    public final C0453t f16756d = new C0453t(16, this);

    /* renamed from: e */
    public final C0310q f16757e = new C0310q(21, this);

    /* renamed from: f */
    public final C2705e f16758f = new C2705e(new C3473t[16]);

    /* renamed from: g */
    public final Object f16759g = new Object();

    /* renamed from: j */
    public long f16762j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C3474u(InterfaceC3279c interfaceC3279c) {
        this.f16753a = (AbstractC3368k) interfaceC3279c;
    }

    /* renamed from: a */
    public final void m5278a() {
        synchronized (this.f16759g) {
            C2705e c2705e = this.f16758f;
            Object[] objArr = c2705e.f14517e;
            int i7 = c2705e.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                C3473t c3473t = (C3473t) objArr[i8];
                c3473t.f16745e.m3586a();
                c3473t.f16746f.m3586a();
                c3473t.f16751k.m3586a();
                c3473t.f16752l.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final boolean m5279b() {
        boolean z7;
        Set set;
        Set set2;
        synchronized (this.f16759g) {
            z7 = this.f16755c;
        }
        if (z7) {
            return false;
        }
        boolean z8 = false;
        while (true) {
            AtomicReference atomicReference = this.f16754b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    AbstractC2399q.m3901d("Unexpected notification");
                    throw new RuntimeException();
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z8;
            }
            synchronized (this.f16759g) {
                C2705e c2705e = this.f16758f;
                Object[] objArr = c2705e.f14517e;
                int i7 = c2705e.f14519g;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (!((C3473t) objArr[i8]).m5274b(set) && !z8) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m5280c(Object obj, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a) {
        Object obj2;
        C3473t c3473t;
        synchronized (this.f16759g) {
            C2705e c2705e = this.f16758f;
            Object[] objArr = c2705e.f14517e;
            int i7 = c2705e.f14519g;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    obj2 = objArr[i8];
                    if (((C3473t) obj2).f16741a == interfaceC3279c) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            c3473t = (C3473t) obj2;
            if (c3473t == null) {
                AbstractC3367j.m5098c(interfaceC3279c, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC3382y.m5111b(1, interfaceC3279c);
                c3473t = new C3473t(interfaceC3279c);
                c2705e.m4300b(c3473t);
            }
        }
        C3473t c3473t2 = this.f16761i;
        long j6 = this.f16762j;
        if (j6 != -1 && j6 != AbstractC3178i.m4871b()) {
            AbstractC2389n1.m3828a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j6 + "), currentThread={id=" + AbstractC3178i.m4871b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f16761i = c3473t;
            this.f16762j = AbstractC3178i.m4871b();
            c3473t.m5273a(obj, this.f16757e, interfaceC3277a);
        } finally {
            this.f16761i = c3473t2;
            this.f16762j = j6;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    /* renamed from: d */
    public final void m5281d() {
        C0453t c0453t = this.f16756d;
        AbstractC3465l.m5239f(AbstractC3465l.f16719a);
        synchronized (AbstractC3465l.f16721c) {
            AbstractC3465l.f16726h = AbstractC1805m.m3059w0(AbstractC3465l.f16726h, c0453t);
        }
        this.f16760h = new C0230e0(c0453t);
    }
}
