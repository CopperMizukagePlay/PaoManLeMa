package p178x2;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p065i2.AbstractC2064e;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x2.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC3820g implements Future {

    /* renamed from: h */
    public static final boolean f18022h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i */
    public static final Logger f18023i = Logger.getLogger(AbstractFutureC3820g.class.getName());

    /* renamed from: j */
    public static final AbstractC2064e f18024j;

    /* renamed from: k */
    public static final Object f18025k;

    /* renamed from: e */
    public volatile Object f18026e;

    /* renamed from: f */
    public volatile C3816c f18027f;

    /* renamed from: g */
    public volatile C3819f f18028g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [i2.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new C3817d(AtomicReferenceFieldUpdater.newUpdater(C3819f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3819f.class, C3819f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC3820g.class, C3819f.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC3820g.class, C3816c.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC3820g.class, Object.class, "e"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f18024j = r32;
        if (th != null) {
            f18023i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f18025k = new Object();
    }

    /* renamed from: b */
    public static void m5831b(AbstractFutureC3820g abstractFutureC3820g) {
        C3819f c3819f;
        C3816c c3816c;
        do {
            c3819f = abstractFutureC3820g.f18028g;
        } while (!f18024j.mo3259k(abstractFutureC3820g, c3819f, C3819f.f18019c));
        while (c3819f != null) {
            Thread thread = c3819f.f18020a;
            if (thread != null) {
                c3819f.f18020a = null;
                LockSupport.unpark(thread);
            }
            c3819f = c3819f.f18021b;
        }
        do {
            c3816c = abstractFutureC3820g.f18027f;
        } while (!f18024j.mo3257i(abstractFutureC3820g, c3816c));
        C3816c c3816c2 = null;
        while (c3816c != null) {
            C3816c c3816c3 = c3816c.f18013a;
            c3816c.f18013a = c3816c2;
            c3816c2 = c3816c;
            c3816c = c3816c3;
        }
        while (c3816c2 != null) {
            c3816c2 = c3816c2.f18013a;
            try {
                throw null;
                break;
            } catch (RuntimeException e7) {
                f18023i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e7);
            }
        }
    }

    /* renamed from: c */
    public static Object m5832c(Object obj) {
        if (!(obj instanceof C3814a)) {
            if (!(obj instanceof AbstractC3815b)) {
                if (obj == f18025k) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((C3814a) obj).f18011a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* renamed from: d */
    public static Object m5833d(AbstractFutureC3820g abstractFutureC3820g) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = abstractFutureC3820g.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m5834a(StringBuilder sb) {
        String valueOf;
        try {
            Object m5833d = m5833d(this);
            sb.append("SUCCESS, result=[");
            if (m5833d == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(m5833d);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        C3814a c3814a;
        Object obj = this.f18026e;
        if (obj == null) {
            if (f18022h) {
                c3814a = new C3814a(new CancellationException("Future.cancel() was called."), z7);
            } else if (z7) {
                c3814a = C3814a.f18009b;
            } else {
                c3814a = C3814a.f18010c;
            }
            if (f18024j.mo3258j(this, obj, c3814a)) {
                m5831b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final void m5835e(C3819f c3819f) {
        c3819f.f18020a = null;
        while (true) {
            C3819f c3819f2 = this.f18028g;
            if (c3819f2 != C3819f.f18019c) {
                C3819f c3819f3 = null;
                while (c3819f2 != null) {
                    C3819f c3819f4 = c3819f2.f18021b;
                    if (c3819f2.f18020a != null) {
                        c3819f3 = c3819f2;
                    } else if (c3819f3 != null) {
                        c3819f3.f18021b = c3819f4;
                        if (c3819f3.f18020a == null) {
                            break;
                        }
                    } else if (!f18024j.mo3259k(this, c3819f2, c3819f4)) {
                        break;
                    }
                    c3819f2 = c3819f4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        C3819f c3819f = C3819f.f18019c;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f18026e;
            if (obj != null) {
                return m5832c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3819f c3819f2 = this.f18028g;
                if (c3819f2 != c3819f) {
                    C3819f c3819f3 = new C3819f();
                    do {
                        AbstractC2064e abstractC2064e = f18024j;
                        abstractC2064e.mo3255C(c3819f3, c3819f2);
                        if (abstractC2064e.mo3259k(this, c3819f2, c3819f3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f18026e;
                                    if (obj2 != null) {
                                        return m5832c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m5835e(c3819f3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5835e(c3819f3);
                        } else {
                            c3819f2 = this.f18028g;
                        }
                    } while (c3819f2 != c3819f);
                }
                return m5832c(this.f18026e);
            }
            while (nanos > 0) {
                Object obj3 = this.f18026e;
                if (obj3 != null) {
                    return m5832c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFutureC3820g = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String m4043g = AbstractC2487d.m4043g(str, " (plus ");
                long j7 = -nanos;
                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit.toNanos(convert);
                boolean z7 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = m4043g + convert + " " + lowerCase;
                    if (z7) {
                        str2 = AbstractC2487d.m4043g(str2, ",");
                    }
                    m4043g = AbstractC2487d.m4043g(str2, " ");
                }
                if (z7) {
                    m4043g = m4043g + nanos2 + " nanoseconds ";
                }
                str = AbstractC2487d.m4043g(m4043g, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC2487d.m4043g(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC2487d.m4044h(str, " for ", abstractFutureC3820g));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18026e instanceof C3814a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f18026e != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f18026e instanceof C3814a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5834a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m5834a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C3819f c3819f = C3819f.f18019c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18026e;
            if (obj2 != null) {
                return m5832c(obj2);
            }
            C3819f c3819f2 = this.f18028g;
            if (c3819f2 != c3819f) {
                C3819f c3819f3 = new C3819f();
                do {
                    AbstractC2064e abstractC2064e = f18024j;
                    abstractC2064e.mo3255C(c3819f3, c3819f2);
                    if (abstractC2064e.mo3259k(this, c3819f2, c3819f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18026e;
                            } else {
                                m5835e(c3819f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m5832c(obj);
                    }
                    c3819f2 = this.f18028g;
                } while (c3819f2 != c3819f);
            }
            return m5832c(this.f18026e);
        }
        throw new InterruptedException();
    }
}
