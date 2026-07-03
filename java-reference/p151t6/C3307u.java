package p151t6;

import java.io.IOException;
import java.io.InterruptedIOException;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.InterfaceC0116a0;
import p092m.AbstractC2487d;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.u */
/* loaded from: classes.dex */
public final class C3307u implements InterfaceC0116a0 {

    /* renamed from: e */
    public final long f16233e;

    /* renamed from: f */
    public boolean f16234f;

    /* renamed from: g */
    public final C0126i f16235g = new Object();

    /* renamed from: h */
    public final C0126i f16236h = new Object();

    /* renamed from: i */
    public boolean f16237i;

    /* renamed from: j */
    public final /* synthetic */ C3309w f16238j;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a7.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a7.i] */
    public C3307u(C3309w c3309w, long j6, boolean z7) {
        this.f16238j = c3309w;
        this.f16233e = j6;
        this.f16234f = z7;
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        int i7;
        Throwable th;
        boolean z7;
        long j7;
        AbstractC3367j.m5100e(c0126i, "sink");
        do {
            C3309w c3309w = this.f16238j;
            synchronized (c3309w) {
                c3309w.f16250k.m233i();
                try {
                    synchronized (c3309w) {
                        i7 = c3309w.f16252m;
                    }
                } finally {
                    c3309w.f16250k.m5021l();
                }
            }
            if (i7 != 0 && !this.f16234f) {
                th = c3309w.f16253n;
                if (th == null) {
                    synchronized (c3309w) {
                        int i8 = c3309w.f16252m;
                        AbstractC2487d.m4047k(i8);
                        th = new C3288b0(i8);
                    }
                }
            } else {
                th = null;
            }
            if (!this.f16237i) {
                C0126i c0126i2 = this.f16236h;
                long j8 = c0126i2.f524f;
                z7 = false;
                if (j8 > 0) {
                    j7 = c0126i2.mo214C(Math.min(8192L, j8), c0126i);
                    long j9 = c3309w.f16242c + j7;
                    c3309w.f16242c = j9;
                    long j10 = j9 - c3309w.f16243d;
                    if (th == null && j10 >= c3309w.f16241b.f16205u.m4991a() / 2) {
                        c3309w.f16241b.m5013o(c3309w.f16240a, j10);
                        c3309w.f16243d = c3309w.f16242c;
                    }
                } else {
                    if (!this.f16234f && th == null) {
                        try {
                            c3309w.wait();
                            z7 = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    j7 = -1;
                }
            } else {
                throw new IOException("stream closed");
            }
        } while (z7);
        if (j7 != -1) {
            return j7;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        return this.f16238j.f16250k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        C3309w c3309w = this.f16238j;
        synchronized (c3309w) {
            this.f16237i = true;
            C0126i c0126i = this.f16236h;
            j6 = c0126i.f524f;
            c0126i.skip(j6);
            c3309w.notifyAll();
        }
        if (j6 > 0) {
            C3309w c3309w2 = this.f16238j;
            byte[] bArr = AbstractC2721b.f14569a;
            c3309w2.f16241b.m5010h(j6);
        }
        this.f16238j.m5022a();
    }
}
