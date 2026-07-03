package p006a7;

import java.io.IOException;
import java.util.zip.Deflater;
import p106n6.AbstractC2721b;
import p128q6.C3011n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.n */
/* loaded from: classes.dex */
public final class C0131n implements InterfaceC0142y {

    /* renamed from: e */
    public final /* synthetic */ int f532e = 0;

    /* renamed from: f */
    public boolean f533f;

    /* renamed from: g */
    public final Object f534g;

    /* renamed from: h */
    public final Object f535h;

    public C0131n(C0126i c0126i, Deflater deflater) {
        this.f534g = new C0137t(c0126i);
        this.f535h = deflater;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        switch (this.f532e) {
            case 0:
                return ((C0137t) this.f534g).f549e.mo231a();
            default:
                return (C0132o) this.f534g;
        }
    }

    /* renamed from: b */
    public void m295b(boolean z7) {
        C0139v m266s;
        int deflate;
        Deflater deflater = (Deflater) this.f535h;
        C0137t c0137t = (C0137t) this.f534g;
        C0126i c0126i = c0137t.f550f;
        while (true) {
            m266s = c0126i.m266s(1);
            byte[] bArr = m266s.f555a;
            if (z7) {
                try {
                    int i7 = m266s.f557c;
                    deflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
                } catch (NullPointerException e7) {
                    throw new IOException("Deflater already closed", e7);
                }
            } else {
                int i8 = m266s.f557c;
                deflate = deflater.deflate(bArr, i8, 8192 - i8);
            }
            if (deflate > 0) {
                m266s.f557c += deflate;
                c0126i.f524f += deflate;
                c0137t.m300b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (m266s.f556b == m266s.f557c) {
            c0126i.f523e = m266s.m304a();
            AbstractC0140w.m308a(m266s);
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f532e) {
            case 0:
                Deflater deflater = (Deflater) this.f535h;
                if (!this.f533f) {
                    try {
                        deflater.finish();
                        m295b(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((C0137t) this.f534g).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.f533f = true;
                    if (th == null) {
                        return;
                    } else {
                        throw th;
                    }
                }
                return;
            default:
                C3011n c3011n = (C3011n) this.f535h;
                if (!this.f533f) {
                    this.f533f = true;
                    C0132o c0132o = (C0132o) this.f534g;
                    C0120c0 c0120c0 = c0132o.f536e;
                    c0132o.f536e = C0120c0.f496d;
                    c0120c0.mo226a();
                    c0120c0.mo227b();
                    c3011n.f15534a = 3;
                    return;
                }
                return;
        }
    }

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
        switch (this.f532e) {
            case 0:
                m295b(true);
                ((C0137t) this.f534g).flush();
                return;
            default:
                if (!this.f533f) {
                    ((InterfaceC0127j) ((C3011n) this.f535h).f15538e).flush();
                    return;
                }
                return;
        }
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        switch (this.f532e) {
            case 0:
                AbstractC0117b.m219d(c0126i.f524f, 0L, j6);
                long j7 = j6;
                while (j7 > 0) {
                    C0139v c0139v = c0126i.f523e;
                    AbstractC3367j.m5097b(c0139v);
                    int min = (int) Math.min(j7, c0139v.f557c - c0139v.f556b);
                    ((Deflater) this.f535h).setInput(c0139v.f555a, c0139v.f556b, min);
                    m295b(false);
                    long j8 = min;
                    c0126i.f524f -= j8;
                    int i7 = c0139v.f556b + min;
                    c0139v.f556b = i7;
                    if (i7 == c0139v.f557c) {
                        c0126i.f523e = c0139v.m304a();
                        AbstractC0140w.m308a(c0139v);
                    }
                    j7 -= j8;
                }
                return;
            default:
                if (!this.f533f) {
                    AbstractC2721b.m4357c(c0126i.f524f, 0L, j6);
                    ((InterfaceC0127j) ((C3011n) this.f535h).f15538e).mo232j(j6, c0126i);
                    return;
                }
                throw new IllegalStateException("closed");
        }
    }

    public String toString() {
        switch (this.f532e) {
            case 0:
                return "DeflaterSink(" + ((C0137t) this.f534g) + ')';
            default:
                return super.toString();
        }
    }

    public C0131n(C3011n c3011n) {
        this.f535h = c3011n;
        this.f534g = new C0132o(((InterfaceC0127j) c3011n.f15538e).mo231a());
    }
}
