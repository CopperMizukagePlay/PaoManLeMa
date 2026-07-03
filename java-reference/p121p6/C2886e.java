package p121p6;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p006a7.C0129l;
import p100n.AbstractC2647h;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p106n6.ThreadFactoryC2720a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p6.e */
/* loaded from: classes.dex */
public final class C2886e {

    /* renamed from: h */
    public static final C0129l f15073h = new C0129l(28);

    /* renamed from: i */
    public static final C2886e f15074i;

    /* renamed from: j */
    public static final Logger f15075j;

    /* renamed from: a */
    public final C2673p1 f15076a;

    /* renamed from: c */
    public boolean f15078c;

    /* renamed from: d */
    public long f15079d;

    /* renamed from: b */
    public int f15077b = 10000;

    /* renamed from: e */
    public final ArrayList f15080e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f15081f = new ArrayList();

    /* renamed from: g */
    public final RunnableC2885d f15082g = new RunnableC2885d(0, this);

    static {
        String str = AbstractC2721b.f14575g + " TaskRunner";
        AbstractC3367j.m5100e(str, "name");
        f15074i = new C2886e(new C2673p1(new ThreadFactoryC2720a(str, true)));
        Logger logger = Logger.getLogger(C2886e.class.getName());
        AbstractC3367j.m5099d(logger, "getLogger(TaskRunner::class.java.name)");
        f15075j = logger;
    }

    public C2886e(C2673p1 c2673p1) {
        this.f15076a = c2673p1;
    }

    /* renamed from: a */
    public static final void m4561a(C2886e c2886e, AbstractC2882a abstractC2882a) {
        byte[] bArr = AbstractC2721b.f14569a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC2882a.f15059a);
        try {
            long mo4555a = abstractC2882a.mo4555a();
            synchronized (c2886e) {
                c2886e.m4562b(abstractC2882a, mo4555a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c2886e) {
                c2886e.m4562b(abstractC2882a, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m4562b(AbstractC2882a abstractC2882a, long j6) {
        byte[] bArr = AbstractC2721b.f14569a;
        C2884c c2884c = abstractC2882a.f15061c;
        AbstractC3367j.m5097b(c2884c);
        if (c2884c.f15068d == abstractC2882a) {
            boolean z7 = c2884c.f15070f;
            c2884c.f15070f = false;
            c2884c.f15068d = null;
            this.f15080e.remove(c2884c);
            if (j6 != -1 && !z7 && !c2884c.f15067c) {
                c2884c.m4559d(abstractC2882a, j6, true);
            }
            if (!c2884c.f15069e.isEmpty()) {
                this.f15081f.add(c2884c);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: c */
    public final AbstractC2882a m4563c() {
        long j6;
        AbstractC2882a abstractC2882a;
        boolean z7;
        byte[] bArr = AbstractC2721b.f14569a;
        while (true) {
            ArrayList arrayList = this.f15081f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j7 = Long.MAX_VALUE;
            int i7 = 0;
            AbstractC2882a abstractC2882a2 = null;
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    AbstractC2882a abstractC2882a3 = (AbstractC2882a) ((C2884c) obj).f15069e.get(0);
                    j6 = nanoTime;
                    abstractC2882a = null;
                    long max = Math.max(0L, abstractC2882a3.f15062d - j6);
                    if (max > 0) {
                        j7 = Math.min(max, j7);
                    } else {
                        if (abstractC2882a2 != null) {
                            z7 = true;
                            break;
                        }
                        abstractC2882a2 = abstractC2882a3;
                    }
                    nanoTime = j6;
                } else {
                    j6 = nanoTime;
                    abstractC2882a = null;
                    z7 = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.f15080e;
            if (abstractC2882a2 != null) {
                byte[] bArr2 = AbstractC2721b.f14569a;
                abstractC2882a2.f15062d = -1L;
                C2884c c2884c = abstractC2882a2.f15061c;
                AbstractC3367j.m5097b(c2884c);
                c2884c.f15069e.remove(abstractC2882a2);
                arrayList.remove(c2884c);
                c2884c.f15068d = abstractC2882a2;
                arrayList2.add(c2884c);
                if (z7 || (!this.f15078c && !arrayList.isEmpty())) {
                    RunnableC2885d runnableC2885d = this.f15082g;
                    AbstractC3367j.m5100e(runnableC2885d, "runnable");
                    ((ThreadPoolExecutor) this.f15076a.f14390f).execute(runnableC2885d);
                }
                return abstractC2882a2;
            }
            if (this.f15078c) {
                if (j7 < this.f15079d - j6) {
                    notify();
                    return abstractC2882a;
                }
                return abstractC2882a;
            }
            this.f15078c = true;
            this.f15079d = j6 + j7;
            try {
                try {
                    long j8 = j7 / 1000000;
                    long j9 = j7 - (1000000 * j8);
                    if (j8 > 0 || j7 > 0) {
                        wait(j8, (int) j9);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((C2884c) arrayList2.get(size2)).m4557b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        C2884c c2884c2 = (C2884c) arrayList.get(size3);
                        c2884c2.m4557b();
                        if (c2884c2.f15069e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f15078c = false;
            }
        }
    }

    /* renamed from: d */
    public final void m4564d(C2884c c2884c) {
        AbstractC3367j.m5100e(c2884c, "taskQueue");
        byte[] bArr = AbstractC2721b.f14569a;
        if (c2884c.f15068d == null) {
            boolean isEmpty = c2884c.f15069e.isEmpty();
            ArrayList arrayList = this.f15081f;
            if (!isEmpty) {
                AbstractC3367j.m5100e(arrayList, "<this>");
                if (!arrayList.contains(c2884c)) {
                    arrayList.add(c2884c);
                }
            } else {
                arrayList.remove(c2884c);
            }
        }
        if (this.f15078c) {
            notify();
            return;
        }
        RunnableC2885d runnableC2885d = this.f15082g;
        AbstractC3367j.m5100e(runnableC2885d, "runnable");
        ((ThreadPoolExecutor) this.f15076a.f14390f).execute(runnableC2885d);
    }

    /* renamed from: e */
    public final C2884c m4565e() {
        int i7;
        synchronized (this) {
            i7 = this.f15077b;
            this.f15077b = i7 + 1;
        }
        return new C2884c(this, AbstractC2647h.m4256b("Q", i7));
    }
}
