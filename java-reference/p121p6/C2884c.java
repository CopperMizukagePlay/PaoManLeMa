package p121p6;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p006a7.C0129l;
import p065i2.AbstractC2064e;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p6.c */
/* loaded from: classes.dex */
public final class C2884c {

    /* renamed from: a */
    public final C2886e f15065a;

    /* renamed from: b */
    public final String f15066b;

    /* renamed from: c */
    public boolean f15067c;

    /* renamed from: d */
    public AbstractC2882a f15068d;

    /* renamed from: e */
    public final ArrayList f15069e;

    /* renamed from: f */
    public boolean f15070f;

    public C2884c(C2886e c2886e, String str) {
        AbstractC3367j.m5100e(str, "name");
        this.f15065a = c2886e;
        this.f15066b = str;
        this.f15069e = new ArrayList();
    }

    /* renamed from: a */
    public final void m4556a() {
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (this.f15065a) {
            if (m4557b()) {
                this.f15065a.m4564d(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean m4557b() {
        AbstractC2882a abstractC2882a = this.f15068d;
        if (abstractC2882a != null && abstractC2882a.f15060b) {
            this.f15070f = true;
        }
        ArrayList arrayList = this.f15069e;
        boolean z7 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC2882a) arrayList.get(size)).f15060b) {
                AbstractC2882a abstractC2882a2 = (AbstractC2882a) arrayList.get(size);
                C0129l c0129l = C2886e.f15073h;
                if (C2886e.f15075j.isLoggable(Level.FINE)) {
                    AbstractC2064e.m3238h(abstractC2882a2, this, "canceled");
                }
                arrayList.remove(size);
                z7 = true;
            }
        }
        return z7;
    }

    /* renamed from: c */
    public final void m4558c(AbstractC2882a abstractC2882a, long j6) {
        AbstractC3367j.m5100e(abstractC2882a, "task");
        synchronized (this.f15065a) {
            if (this.f15067c) {
                if (abstractC2882a.f15060b) {
                    C0129l c0129l = C2886e.f15073h;
                    if (C2886e.f15075j.isLoggable(Level.FINE)) {
                        AbstractC2064e.m3238h(abstractC2882a, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    C0129l c0129l2 = C2886e.f15073h;
                    if (C2886e.f15075j.isLoggable(Level.FINE)) {
                        AbstractC2064e.m3238h(abstractC2882a, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (m4559d(abstractC2882a, j6, false)) {
                this.f15065a.m4564d(this);
            }
        }
    }

    /* renamed from: d */
    public final boolean m4559d(AbstractC2882a abstractC2882a, long j6, boolean z7) {
        String concat;
        AbstractC3367j.m5100e(abstractC2882a, "task");
        C2884c c2884c = abstractC2882a.f15061c;
        if (c2884c != this) {
            if (c2884c == null) {
                abstractC2882a.f15061c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues");
            }
        }
        long nanoTime = System.nanoTime();
        long j7 = nanoTime + j6;
        ArrayList arrayList = this.f15069e;
        int indexOf = arrayList.indexOf(abstractC2882a);
        if (indexOf != -1) {
            if (abstractC2882a.f15062d <= j7) {
                C0129l c0129l = C2886e.f15073h;
                if (C2886e.f15075j.isLoggable(Level.FINE)) {
                    AbstractC2064e.m3238h(abstractC2882a, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        abstractC2882a.f15062d = j7;
        C0129l c0129l2 = C2886e.f15073h;
        if (C2886e.f15075j.isLoggable(Level.FINE)) {
            if (z7) {
                concat = "run again after ".concat(AbstractC2064e.m3248v(j7 - nanoTime));
            } else {
                concat = "scheduled after ".concat(AbstractC2064e.m3248v(j7 - nanoTime));
            }
            AbstractC2064e.m3238h(abstractC2882a, this, concat);
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                if (((AbstractC2882a) obj).f15062d - nanoTime > j6) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            i7 = arrayList.size();
        }
        arrayList.add(i7, abstractC2882a);
        if (i7 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m4560e() {
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (this.f15065a) {
            this.f15067c = true;
            if (m4557b()) {
                this.f15065a.m4564d(this);
            }
        }
    }

    public final String toString() {
        return this.f15066b;
    }
}
