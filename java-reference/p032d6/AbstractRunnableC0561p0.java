package p032d6;

import p039e5.C1279sl;
import p069i6.C2107t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.p0 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0561p0 implements Runnable, Comparable, InterfaceC0552m0 {
    private volatile Object _heap;

    /* renamed from: e */
    public long f1908e;

    /* renamed from: f */
    public int f1909f;

    @Override // p032d6.InterfaceC0552m0
    /* renamed from: a */
    public final void mo1155a() {
        C0564q0 c0564q0;
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1279sl c1279sl = AbstractC0525d0.f1856b;
                if (obj == c1279sl) {
                    return;
                }
                C2107t c2107t = null;
                if (obj instanceof C0564q0) {
                    c0564q0 = (C0564q0) obj;
                } else {
                    c0564q0 = null;
                }
                if (c0564q0 != null) {
                    synchronized (c0564q0) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof C2107t) {
                            c2107t = (C2107t) obj2;
                        }
                        if (c2107t != null) {
                            c0564q0.m3466b(this.f1909f);
                        }
                    }
                }
                this._heap = c1279sl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final int m1230b(long j6, C0564q0 c0564q0, AbstractC0567r0 abstractC0567r0) {
        AbstractRunnableC0561p0 abstractRunnableC0561p0;
        boolean z7;
        synchronized (this) {
            if (this._heap == AbstractC0525d0.f1856b) {
                return 2;
            }
            synchronized (c0564q0) {
                try {
                    AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = c0564q0.f12384a;
                    if (abstractRunnableC0561p0Arr != null) {
                        abstractRunnableC0561p0 = abstractRunnableC0561p0Arr[0];
                    } else {
                        abstractRunnableC0561p0 = null;
                    }
                    if (AbstractC0567r0.f1921m.get(abstractC0567r0) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        return 1;
                    }
                    if (abstractRunnableC0561p0 == null) {
                        c0564q0.f1913c = j6;
                    } else {
                        long j7 = abstractRunnableC0561p0.f1908e;
                        if (j7 - j6 < 0) {
                            j6 = j7;
                        }
                        if (j6 - c0564q0.f1913c > 0) {
                            c0564q0.f1913c = j6;
                        }
                    }
                    long j8 = this.f1908e;
                    long j9 = c0564q0.f1913c;
                    if (j8 - j9 < 0) {
                        this.f1908e = j9;
                    }
                    c0564q0.m3465a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f1908e - ((AbstractRunnableC0561p0) obj).f1908e;
        if (j6 > 0) {
            return 1;
        }
        if (j6 < 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: d */
    public final void m1231d(C0564q0 c0564q0) {
        if (this._heap != AbstractC0525d0.f1856b) {
            this._heap = c0564q0;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1908e + ']';
    }
}
