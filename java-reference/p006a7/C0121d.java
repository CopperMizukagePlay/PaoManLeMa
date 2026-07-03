package p006a7;

import java.io.IOException;
import java.io.OutputStream;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.d */
/* loaded from: classes.dex */
public final class C0121d implements InterfaceC0142y {

    /* renamed from: e */
    public final /* synthetic */ int f500e = 0;

    /* renamed from: f */
    public final C0143z f501f;

    /* renamed from: g */
    public final Object f502g;

    public C0121d(OutputStream outputStream, C0143z c0143z) {
        this.f502g = outputStream;
        this.f501f = c0143z;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        switch (this.f500e) {
            case 0:
                return this.f501f;
            default:
                return this.f501f;
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f500e) {
            case 0:
                C0121d c0121d = (C0121d) this.f502g;
                C0143z c0143z = this.f501f;
                c0143z.m233i();
                try {
                    c0121d.close();
                    if (!c0143z.m234j()) {
                        return;
                    } else {
                        throw c0143z.m311l(null);
                    }
                } catch (IOException e7) {
                    if (!c0143z.m234j()) {
                        throw e7;
                    }
                    throw c0143z.m311l(e7);
                } finally {
                    c0143z.m234j();
                }
            default:
                ((OutputStream) this.f502g).close();
                return;
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
        switch (this.f500e) {
            case 0:
                C0121d c0121d = (C0121d) this.f502g;
                C0143z c0143z = this.f501f;
                c0143z.m233i();
                try {
                    c0121d.flush();
                    if (!c0143z.m234j()) {
                        return;
                    } else {
                        throw c0143z.m311l(null);
                    }
                } catch (IOException e7) {
                    if (!c0143z.m234j()) {
                        throw e7;
                    }
                    throw c0143z.m311l(e7);
                } finally {
                    c0143z.m234j();
                }
            default:
                ((OutputStream) this.f502g).flush();
                return;
        }
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        switch (this.f500e) {
            case 0:
                AbstractC0117b.m219d(c0126i.f524f, 0L, j6);
                long j7 = j6;
                while (true) {
                    long j8 = 0;
                    if (j7 > 0) {
                        C0139v c0139v = c0126i.f523e;
                        AbstractC3367j.m5097b(c0139v);
                        while (true) {
                            if (j8 < 65536) {
                                j8 += c0139v.f557c - c0139v.f556b;
                                if (j8 >= j7) {
                                    j8 = j7;
                                } else {
                                    c0139v = c0139v.f560f;
                                    AbstractC3367j.m5097b(c0139v);
                                }
                            }
                        }
                        C0121d c0121d = (C0121d) this.f502g;
                        C0143z c0143z = this.f501f;
                        c0143z.m233i();
                        try {
                            try {
                                c0121d.mo232j(j8, c0126i);
                                if (!c0143z.m234j()) {
                                    j7 -= j8;
                                } else {
                                    throw c0143z.m311l(null);
                                }
                            } catch (IOException e7) {
                                if (!c0143z.m234j()) {
                                    throw e7;
                                }
                                throw c0143z.m311l(e7);
                            }
                        } catch (Throwable th) {
                            c0143z.m234j();
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            default:
                AbstractC0117b.m219d(c0126i.f524f, 0L, j6);
                while (j6 > 0) {
                    this.f501f.mo224f();
                    C0139v c0139v2 = c0126i.f523e;
                    AbstractC3367j.m5097b(c0139v2);
                    int min = (int) Math.min(j6, c0139v2.f557c - c0139v2.f556b);
                    ((OutputStream) this.f502g).write(c0139v2.f555a, c0139v2.f556b, min);
                    int i7 = c0139v2.f556b + min;
                    c0139v2.f556b = i7;
                    long j9 = min;
                    j6 -= j9;
                    c0126i.f524f -= j9;
                    if (i7 == c0139v2.f557c) {
                        c0126i.f523e = c0139v2.m304a();
                        AbstractC0140w.m308a(c0139v2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f500e) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0121d) this.f502g) + ')';
            default:
                return "sink(" + ((OutputStream) this.f502g) + ')';
        }
    }

    public C0121d(C0143z c0143z, C0121d c0121d) {
        this.f501f = c0143z;
        this.f502g = c0121d;
    }
}
