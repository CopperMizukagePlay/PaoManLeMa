package p128q6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p060h5.AbstractC1811s;
import p067i4.C2071d;
import p079k1.C2258a;
import p099m6.AbstractC2614o;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.C2610k;
import p099m6.C2623x;
import p106n6.AbstractC2721b;
import p121p6.C2883b;
import p121p6.C2884c;
import p136r6.C3064a;
import p136r6.C3065b;
import p136r6.C3070g;
import p136r6.InterfaceC3068e;
import p158u5.AbstractC3367j;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.i */
/* loaded from: classes.dex */
public final class C3006i implements Cloneable {

    /* renamed from: e */
    public final C2623x f15494e;

    /* renamed from: f */
    public final C2592a0 f15495f;

    /* renamed from: g */
    public final boolean f15496g;

    /* renamed from: h */
    public final C2258a f15497h;

    /* renamed from: i */
    public final AbstractC2614o f15498i;

    /* renamed from: j */
    public final C3005h f15499j;

    /* renamed from: k */
    public final AtomicBoolean f15500k;

    /* renamed from: l */
    public Object f15501l;

    /* renamed from: m */
    public C2071d f15502m;

    /* renamed from: n */
    public C3009l f15503n;

    /* renamed from: o */
    public boolean f15504o;

    /* renamed from: p */
    public C3002e f15505p;

    /* renamed from: q */
    public boolean f15506q;

    /* renamed from: r */
    public boolean f15507r;

    /* renamed from: s */
    public boolean f15508s;

    /* renamed from: t */
    public volatile boolean f15509t;

    /* renamed from: u */
    public volatile C3002e f15510u;

    /* renamed from: v */
    public volatile C3009l f15511v;

    public C3006i(C2623x c2623x, C2592a0 c2592a0, boolean z7) {
        AbstractC3367j.m5100e(c2592a0, "originalRequest");
        this.f15494e = c2623x;
        this.f15495f = c2592a0;
        this.f15496g = z7;
        this.f15497h = (C2258a) c2623x.f14201f.f109e;
        this.f15498i = c2623x.f14204i.mo1296b(this);
        C3005h c3005h = new C3005h(this);
        c3005h.mo225g(c2623x.f14221z, TimeUnit.MILLISECONDS);
        this.f15499j = c3005h;
        this.f15500k = new AtomicBoolean();
        this.f15508s = true;
    }

    /* renamed from: a */
    public static final String m4677a(C3006i c3006i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (c3006i.f15509t) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (c3006i.f15496g) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(c3006i.f15495f.f14018a.m4176f());
        return sb.toString();
    }

    /* renamed from: b */
    public final void m4678b(C3009l c3009l) {
        byte[] bArr = AbstractC2721b.f14569a;
        if (this.f15503n == null) {
            this.f15503n = c3009l;
            c3009l.f15530p.add(new C3004g(this, this.f15501l));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: c */
    public final IOException m4679c(IOException iOException) {
        IOException iOException2;
        Socket m4686j;
        byte[] bArr = AbstractC2721b.f14569a;
        C3009l c3009l = this.f15503n;
        if (c3009l != null) {
            synchronized (c3009l) {
                m4686j = m4686j();
            }
            if (this.f15503n == null) {
                if (m4686j != null) {
                    AbstractC2721b.m4359e(m4686j);
                }
                this.f15498i.getClass();
            } else if (m4686j != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f15504o || !this.f15499j.m234j()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            AbstractC2614o abstractC2614o = this.f15498i;
            AbstractC3367j.m5097b(iOException2);
            abstractC2614o.getClass();
            return iOException2;
        }
        this.f15498i.getClass();
        return iOException2;
    }

    public final Object clone() {
        return new C3006i(this.f15494e, this.f15495f, this.f15496g);
    }

    /* renamed from: d */
    public final void m4680d() {
        Socket socket;
        if (this.f15509t) {
            return;
        }
        this.f15509t = true;
        C3002e c3002e = this.f15510u;
        if (c3002e != null) {
            ((InterfaceC3068e) c3002e.f15487e).cancel();
        }
        C3009l c3009l = this.f15511v;
        if (c3009l != null && (socket = c3009l.f15517c) != null) {
            AbstractC2721b.m4359e(socket);
        }
        this.f15498i.getClass();
    }

    /* renamed from: e */
    public final C2598d0 m4681e() {
        if (this.f15500k.compareAndSet(false, true)) {
            this.f15499j.m233i();
            C3395m c3395m = C3395m.f16494a;
            this.f15501l = C3395m.f16494a.mo5121g();
            this.f15498i.getClass();
            try {
                C2610k c2610k = this.f15494e.f14200e;
                synchronized (c2610k) {
                    c2610k.f14132f.add(this);
                }
                return m4683g();
            } finally {
                C2610k c2610k2 = this.f15494e.f14200e;
                c2610k2.m4158b(c2610k2.f14132f, this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: f */
    public final void m4682f(boolean z7) {
        C3002e c3002e;
        synchronized (this) {
            if (!this.f15508s) {
                throw new IllegalStateException("released");
            }
        }
        if (z7 && (c3002e = this.f15510u) != null) {
            ((InterfaceC3068e) c3002e.f15487e).cancel();
            ((C3006i) c3002e.f15484b).m4684h(c3002e, true, true, null);
        }
        this.f15505p = null;
    }

    /* renamed from: g */
    public final C2598d0 m4683g() {
        ArrayList arrayList = new ArrayList();
        AbstractC1811s.m3076X(this.f15494e.f14202g, arrayList);
        arrayList.add(new C3064a(this.f15494e));
        arrayList.add(new C3064a(this.f15494e.f14209n));
        arrayList.add(new Object());
        arrayList.add(C2998a.f15465a);
        if (!this.f15496g) {
            AbstractC1811s.m3076X(this.f15494e.f14203h, arrayList);
        }
        arrayList.add(new C3065b(this.f15496g));
        C2592a0 c2592a0 = this.f15495f;
        C2623x c2623x = this.f15494e;
        try {
            try {
                C2598d0 m4746b = new C3070g(this, arrayList, 0, null, c2592a0, c2623x.f14194A, c2623x.f14195B, c2623x.f14196C).m4746b(this.f15495f);
                if (!this.f15509t) {
                    m4685i(null);
                    return m4746b;
                }
                AbstractC2721b.m4358d(m4746b);
                throw new IOException("Canceled");
            } catch (IOException e7) {
                IOException m4685i = m4685i(e7);
                AbstractC3367j.m5098c(m4685i, "null cannot be cast to non-null type kotlin.Throwable");
                throw m4685i;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m4685i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException m4684h(C3002e c3002e, boolean z7, boolean z8, IOException iOException) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC3367j.m5100e(c3002e, "exchange");
        if (c3002e.equals(this.f15510u)) {
            synchronized (this) {
                z9 = false;
                if (z7) {
                    try {
                        if (!this.f15506q) {
                        }
                        if (z7) {
                            this.f15506q = false;
                        }
                        if (z8) {
                            this.f15507r = false;
                        }
                        z11 = this.f15506q;
                        if (z11 && !this.f15507r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z11 && !this.f15507r) {
                            if (!this.f15508s) {
                                z9 = true;
                            }
                        }
                        z10 = z9;
                        z9 = z12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z8 || !this.f15507r) {
                    z10 = false;
                }
                if (z7) {
                }
                if (z8) {
                }
                z11 = this.f15506q;
                if (z11) {
                }
                z12 = false;
                if (!z11) {
                    if (!this.f15508s) {
                    }
                }
                z10 = z9;
                z9 = z12;
            }
            if (z9) {
                this.f15510u = null;
                C3009l c3009l = this.f15503n;
                if (c3009l != null) {
                    synchronized (c3009l) {
                        c3009l.f15527m++;
                    }
                }
            }
            if (z10) {
                return m4679c(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: i */
    public final IOException m4685i(IOException iOException) {
        boolean z7;
        synchronized (this) {
            z7 = false;
            if (this.f15508s) {
                this.f15508s = false;
                if (!this.f15506q) {
                    if (!this.f15507r) {
                        z7 = true;
                    }
                }
            }
        }
        if (z7) {
            return m4679c(iOException);
        }
        return iOException;
    }

    /* renamed from: j */
    public final Socket m4686j() {
        C3009l c3009l = this.f15503n;
        AbstractC3367j.m5097b(c3009l);
        byte[] bArr = AbstractC2721b.f14569a;
        ArrayList arrayList = c3009l.f15530p;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                if (AbstractC3367j.m5096a(((Reference) obj).get(), this)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 != -1) {
            arrayList.remove(i7);
            this.f15503n = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            c3009l.f15531q = System.nanoTime();
            C2258a c2258a = this.f15497h;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c2258a.f13097e;
            C2884c c2884c = (C2884c) c2258a.f13095c;
            byte[] bArr2 = AbstractC2721b.f14569a;
            if (!c3009l.f15524j && c2258a.f13093a != 0) {
                c2884c.m4558c((C2883b) c2258a.f13096d, 0L);
                return null;
            }
            c3009l.f15524j = true;
            concurrentLinkedQueue.remove(c3009l);
            if (concurrentLinkedQueue.isEmpty()) {
                c2884c.m4556a();
            }
            Socket socket = c3009l.f15518d;
            AbstractC3367j.m5097b(socket);
            return socket;
        }
        throw new IllegalStateException("Check failed.");
    }
}
