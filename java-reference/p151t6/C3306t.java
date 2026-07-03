package p151t6;

import java.io.InterruptedIOException;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.InterfaceC0142y;
import p106n6.AbstractC2721b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.t */
/* loaded from: classes.dex */
public final class C3306t implements InterfaceC0142y {

    /* renamed from: e */
    public final boolean f16229e;

    /* renamed from: f */
    public final C0126i f16230f = new Object();

    /* renamed from: g */
    public boolean f16231g;

    /* renamed from: h */
    public final /* synthetic */ C3309w f16232h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a7.i] */
    public C3306t(C3309w c3309w, boolean z7) {
        this.f16232h = c3309w;
        this.f16229e = z7;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        return this.f16232h.f16251l;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public final void m5020b(boolean z7) {
        long min;
        boolean z8;
        boolean z9;
        C3309w c3309w = this.f16232h;
        synchronized (c3309w) {
            c3309w.f16251l.m233i();
            while (c3309w.f16244e >= c3309w.f16245f && !this.f16229e && !this.f16231g) {
                try {
                    synchronized (c3309w) {
                        int i7 = c3309w.f16252m;
                        if (i7 != 0) {
                            break;
                        }
                        try {
                            c3309w.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    c3309w.f16251l.m5021l();
                    throw th;
                }
            }
            c3309w.f16251l.m5021l();
            c3309w.m5023b();
            min = Math.min(c3309w.f16245f - c3309w.f16244e, this.f16230f.f524f);
            c3309w.f16244e += min;
            if (z7 && min == this.f16230f.f524f) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z8;
        }
        this.f16232h.f16251l.m233i();
        try {
            C3309w c3309w2 = this.f16232h;
            c3309w2.f16241b.m5011m(c3309w2.f16240a, z9, this.f16230f, min);
        } finally {
            this.f16232h.f16251l.m5021l();
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        C3309w c3309w = this.f16232h;
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (c3309w) {
            if (this.f16231g) {
                return;
            }
            synchronized (c3309w) {
                int i7 = c3309w.f16252m;
                if (i7 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            C3309w c3309w2 = this.f16232h;
            if (!c3309w2.f16249j.f16229e) {
                if (this.f16230f.f524f > 0) {
                    while (this.f16230f.f524f > 0) {
                        m5020b(true);
                    }
                } else if (z7) {
                    c3309w2.f16241b.m5011m(c3309w2.f16240a, true, null, 0L);
                }
            }
            synchronized (this.f16232h) {
                this.f16231g = true;
            }
            this.f16232h.f16241b.flush();
            this.f16232h.m5022a();
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
        C3309w c3309w = this.f16232h;
        byte[] bArr = AbstractC2721b.f14569a;
        synchronized (c3309w) {
            c3309w.m5023b();
        }
        while (this.f16230f.f524f > 0) {
            m5020b(false);
            this.f16232h.f16241b.flush();
        }
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        byte[] bArr = AbstractC2721b.f14569a;
        C0126i c0126i2 = this.f16230f;
        c0126i2.mo232j(j6, c0126i);
        while (c0126i2.f524f >= 16384) {
            m5020b(false);
        }
    }
}
