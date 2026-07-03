package p151t6;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import p006a7.C0126i;
import p006a7.C0137t;
import p006a7.C0138u;
import p039e5.C1182ph;
import p092m.AbstractC2487d;
import p106n6.AbstractC2721b;
import p121p6.C2884c;
import p121p6.C2886e;
import p128q6.C3011n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.o */
/* loaded from: classes.dex */
public final class C3301o implements Closeable {

    /* renamed from: E */
    public static final C3286a0 f16184E;

    /* renamed from: A */
    public final Socket f16185A;

    /* renamed from: B */
    public final C3310x f16186B;

    /* renamed from: C */
    public final C1182ph f16187C;

    /* renamed from: D */
    public final LinkedHashSet f16188D;

    /* renamed from: e */
    public final AbstractC3294h f16189e;

    /* renamed from: f */
    public final LinkedHashMap f16190f = new LinkedHashMap();

    /* renamed from: g */
    public final String f16191g;

    /* renamed from: h */
    public int f16192h;

    /* renamed from: i */
    public int f16193i;

    /* renamed from: j */
    public boolean f16194j;

    /* renamed from: k */
    public final C2886e f16195k;

    /* renamed from: l */
    public final C2884c f16196l;

    /* renamed from: m */
    public final C2884c f16197m;

    /* renamed from: n */
    public final C2884c f16198n;

    /* renamed from: o */
    public final C3312z f16199o;

    /* renamed from: p */
    public long f16200p;

    /* renamed from: q */
    public long f16201q;

    /* renamed from: r */
    public long f16202r;

    /* renamed from: s */
    public long f16203s;

    /* renamed from: t */
    public long f16204t;

    /* renamed from: u */
    public final C3286a0 f16205u;

    /* renamed from: v */
    public C3286a0 f16206v;

    /* renamed from: w */
    public long f16207w;

    /* renamed from: x */
    public long f16208x;

    /* renamed from: y */
    public long f16209y;

    /* renamed from: z */
    public long f16210z;

    static {
        C3286a0 c3286a0 = new C3286a0();
        c3286a0.m4993c(7, 65535);
        c3286a0.m4993c(5, 16384);
        f16184E = c3286a0;
    }

    public C3301o(C3011n c3011n) {
        this.f16189e = (AbstractC3294h) c3011n.f15540g;
        String str = (String) c3011n.f15537d;
        if (str != null) {
            this.f16191g = str;
            this.f16193i = 3;
            C2886e c2886e = (C2886e) c3011n.f15535b;
            this.f16195k = c2886e;
            C2884c m4565e = c2886e.m4565e();
            this.f16196l = m4565e;
            this.f16197m = c2886e.m4565e();
            this.f16198n = c2886e.m4565e();
            this.f16199o = C3312z.f16263a;
            C3286a0 c3286a0 = new C3286a0();
            c3286a0.m4993c(7, 16777216);
            this.f16205u = c3286a0;
            this.f16206v = f16184E;
            this.f16210z = r2.m4991a();
            Socket socket = (Socket) c3011n.f15536c;
            if (socket != null) {
                this.f16185A = socket;
                C0137t c0137t = (C0137t) c3011n.f15539f;
                if (c0137t != null) {
                    this.f16186B = new C3310x(c0137t);
                    C0138u c0138u = (C0138u) c3011n.f15538e;
                    if (c0138u != null) {
                        this.f16187C = new C1182ph(this, new C3305s(c0138u));
                        this.f16188D = new LinkedHashSet();
                        int i7 = c3011n.f15534a;
                        if (i7 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i7);
                            m4565e.m4558c(new C3299m(str.concat(" ping"), this, nanos, 0), nanos);
                            return;
                        }
                        return;
                    }
                    AbstractC3367j.m5105j("source");
                    throw null;
                }
                AbstractC3367j.m5105j("sink");
                throw null;
            }
            AbstractC3367j.m5105j("socket");
            throw null;
        }
        AbstractC3367j.m5105j("connectionName");
        throw null;
    }

    /* renamed from: b */
    public final void m5006b(int i7, int i8, IOException iOException) {
        int i9;
        Object[] objArr;
        AbstractC2487d.m4055s("connectionCode", i7);
        AbstractC2487d.m4055s("streamCode", i8);
        byte[] bArr = AbstractC2721b.f14569a;
        try {
            m5009f(i7);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f16190f.isEmpty()) {
                objArr = this.f16190f.values().toArray(new C3309w[0]);
                this.f16190f.clear();
            } else {
                objArr = null;
            }
        }
        C3309w[] c3309wArr = (C3309w[]) objArr;
        if (c3309wArr != null) {
            for (C3309w c3309w : c3309wArr) {
                try {
                    c3309w.m5024c(i8, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f16186B.close();
        } catch (IOException unused3) {
        }
        try {
            this.f16185A.close();
        } catch (IOException unused4) {
        }
        this.f16196l.m4560e();
        this.f16197m.m4560e();
        this.f16198n.m4560e();
    }

    /* renamed from: c */
    public final synchronized C3309w m5007c(int i7) {
        return (C3309w) this.f16190f.get(Integer.valueOf(i7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m5006b(1, 9, null);
    }

    /* renamed from: d */
    public final synchronized C3309w m5008d(int i7) {
        C3309w c3309w;
        c3309w = (C3309w) this.f16190f.remove(Integer.valueOf(i7));
        notifyAll();
        return c3309w;
    }

    /* renamed from: f */
    public final void m5009f(int i7) {
        AbstractC2487d.m4055s("statusCode", i7);
        synchronized (this.f16186B) {
            synchronized (this) {
                if (this.f16194j) {
                    return;
                }
                this.f16194j = true;
                this.f16186B.m5035f(AbstractC2721b.f14569a, this.f16192h, i7);
            }
        }
    }

    public final void flush() {
        this.f16186B.flush();
    }

    /* renamed from: h */
    public final synchronized void m5010h(long j6) {
        long j7 = this.f16207w + j6;
        this.f16207w = j7;
        long j8 = j7 - this.f16208x;
        if (j8 >= this.f16205u.m4991a() / 2) {
            m5013o(0, j8);
            this.f16208x += j8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f16186B.f16257g);
        r6 = r2;
        r8.f16209y += r6;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5011m(int i7, boolean z7, C0126i c0126i, long j6) {
        int min;
        long j7;
        boolean z8;
        if (j6 == 0) {
            this.f16186B.m5033c(z7, i7, c0126i, 0);
            return;
        }
        loop0: while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j8 = this.f16209y;
                            long j9 = this.f16210z;
                            if (j8 < j9) {
                                break;
                            } else if (!this.f16190f.containsKey(Integer.valueOf(i7))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j6 -= j7;
            C3310x c3310x = this.f16186B;
            if (z7 && j6 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            c3310x.m5033c(z8, i7, c0126i, min);
        }
    }

    /* renamed from: n */
    public final void m5012n(int i7, int i8) {
        AbstractC2487d.m4055s("errorCode", i8);
        this.f16196l.m4558c(new C3296j(this.f16191g + '[' + i7 + "] writeSynReset", this, i7, i8, 2), 0L);
    }

    /* renamed from: o */
    public final void m5013o(int i7, long j6) {
        this.f16196l.m4558c(new C3300n(this.f16191g + '[' + i7 + "] windowUpdate", this, i7, j6), 0L);
    }
}
