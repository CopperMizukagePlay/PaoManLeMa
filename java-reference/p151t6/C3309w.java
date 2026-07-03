package p151t6;

import java.io.IOException;
import java.util.ArrayDeque;
import p092m.AbstractC2487d;
import p099m6.C2617r;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.w */
/* loaded from: classes.dex */
public final class C3309w {

    /* renamed from: a */
    public final int f16240a;

    /* renamed from: b */
    public final C3301o f16241b;

    /* renamed from: c */
    public long f16242c;

    /* renamed from: d */
    public long f16243d;

    /* renamed from: e */
    public long f16244e;

    /* renamed from: f */
    public long f16245f;

    /* renamed from: g */
    public final ArrayDeque f16246g;

    /* renamed from: h */
    public boolean f16247h;

    /* renamed from: i */
    public final C3307u f16248i;

    /* renamed from: j */
    public final C3306t f16249j;

    /* renamed from: k */
    public final C3308v f16250k;

    /* renamed from: l */
    public final C3308v f16251l;

    /* renamed from: m */
    public int f16252m;

    /* renamed from: n */
    public IOException f16253n;

    public C3309w(int i7, C3301o c3301o, boolean z7, boolean z8, C2617r c2617r) {
        AbstractC3367j.m5100e(c3301o, "connection");
        this.f16240a = i7;
        this.f16241b = c3301o;
        this.f16245f = c3301o.f16206v.m4991a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16246g = arrayDeque;
        this.f16248i = new C3307u(this, c3301o.f16205u.m4991a(), z8);
        this.f16249j = new C3306t(this, z7);
        this.f16250k = new C3308v(this);
        this.f16251l = new C3308v(this);
        if (c2617r != null) {
            if (!m5028g()) {
                arrayDeque.add(c2617r);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (m5028g()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: a */
    public final void m5022a() {
        boolean z7;
        boolean m5029h;
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (this) {
            try {
                C3307u c3307u = this.f16248i;
                if (!c3307u.f16234f && c3307u.f16237i) {
                    C3306t c3306t = this.f16249j;
                    if (!c3306t.f16229e) {
                        if (c3306t.f16231g) {
                        }
                    }
                    z7 = true;
                    m5029h = m5029h();
                }
                z7 = false;
                m5029h = m5029h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            m5024c(9, null);
        } else if (!m5029h) {
            this.f16241b.m5008d(this.f16240a);
        }
    }

    /* renamed from: b */
    public final void m5023b() {
        C3306t c3306t = this.f16249j;
        if (!c3306t.f16231g) {
            if (!c3306t.f16229e) {
                if (this.f16252m != 0) {
                    IOException iOException = this.f16253n;
                    if (iOException == null) {
                        int i7 = this.f16252m;
                        AbstractC2487d.m4047k(i7);
                        throw new C3288b0(i7);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: c */
    public final void m5024c(int i7, IOException iOException) {
        AbstractC2487d.m4055s("rstStatusCode", i7);
        if (!m5025d(i7, iOException)) {
            return;
        }
        C3301o c3301o = this.f16241b;
        c3301o.getClass();
        AbstractC2487d.m4055s("statusCode", i7);
        c3301o.f16186B.m5038n(this.f16240a, i7);
    }

    /* renamed from: d */
    public final boolean m5025d(int i7, IOException iOException) {
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (this) {
            if (this.f16252m != 0) {
                return false;
            }
            this.f16252m = i7;
            this.f16253n = iOException;
            notifyAll();
            if (this.f16248i.f16234f) {
                if (this.f16249j.f16229e) {
                    return false;
                }
            }
            this.f16241b.m5008d(this.f16240a);
            return true;
        }
    }

    /* renamed from: e */
    public final void m5026e(int i7) {
        AbstractC2487d.m4055s("errorCode", i7);
        if (!m5025d(i7, null)) {
            return;
        }
        this.f16241b.m5012n(this.f16240a, i7);
    }

    /* renamed from: f */
    public final C3306t m5027f() {
        synchronized (this) {
            if (!this.f16247h && !m5028g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f16249j;
    }

    /* renamed from: g */
    public final boolean m5028g() {
        boolean z7;
        if ((this.f16240a & 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f16241b.getClass();
        if (true == z7) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final synchronized boolean m5029h() {
        try {
            if (this.f16252m != 0) {
                return false;
            }
            C3307u c3307u = this.f16248i;
            if (!c3307u.f16234f) {
                if (c3307u.f16237i) {
                }
                return true;
            }
            C3306t c3306t = this.f16249j;
            if (c3306t.f16229e || c3306t.f16231g) {
                if (this.f16247h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5030i(C2617r c2617r, boolean z7) {
        boolean m5029h;
        AbstractC3367j.m5100e(c2617r, "headers");
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (this) {
            try {
                if (this.f16247h && z7) {
                    this.f16248i.getClass();
                    if (z7) {
                        this.f16248i.f16234f = true;
                    }
                    m5029h = m5029h();
                    notifyAll();
                }
                this.f16247h = true;
                this.f16246g.add(c2617r);
                if (z7) {
                }
                m5029h = m5029h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!m5029h) {
            this.f16241b.m5008d(this.f16240a);
        }
    }

    /* renamed from: j */
    public final synchronized void m5031j(int i7) {
        AbstractC2487d.m4055s("errorCode", i7);
        if (this.f16252m == 0) {
            this.f16252m = i7;
            notifyAll();
        }
    }
}
