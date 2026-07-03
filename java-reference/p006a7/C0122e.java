package p006a7;

import java.io.IOException;
import java.io.InputStream;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.e */
/* loaded from: classes.dex */
public final class C0122e implements InterfaceC0116a0 {

    /* renamed from: e */
    public final /* synthetic */ int f503e;

    /* renamed from: f */
    public final Object f504f;

    /* renamed from: g */
    public final Object f505g;

    public /* synthetic */ C0122e(int i7, Object obj, Object obj2) {
        this.f503e = i7;
        this.f504f = obj;
        this.f505g = obj2;
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        switch (this.f503e) {
            case 0:
                AbstractC3367j.m5100e(c0126i, "sink");
                C0143z c0143z = (C0143z) this.f504f;
                C0122e c0122e = (C0122e) this.f505g;
                c0143z.m233i();
                try {
                    long mo214C = c0122e.mo214C(8192L, c0126i);
                    if (!c0143z.m234j()) {
                        return mo214C;
                    }
                    throw c0143z.m311l(null);
                } catch (IOException e7) {
                    if (!c0143z.m234j()) {
                        throw e7;
                    }
                    throw c0143z.m311l(e7);
                } finally {
                    c0143z.m234j();
                }
            default:
                AbstractC3367j.m5100e(c0126i, "sink");
                try {
                    ((C0120c0) this.f505g).mo224f();
                    C0139v m266s = c0126i.m266s(1);
                    int read = ((InputStream) this.f504f).read(m266s.f555a, m266s.f557c, (int) Math.min(8192L, 8192 - m266s.f557c));
                    if (read == -1) {
                        if (m266s.f556b == m266s.f557c) {
                            c0126i.f523e = m266s.m304a();
                            AbstractC0140w.m308a(m266s);
                        }
                        return -1L;
                    }
                    m266s.f557c += read;
                    long j7 = read;
                    c0126i.f524f += j7;
                    return j7;
                } catch (AssertionError e8) {
                    if (AbstractC0117b.m220e(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        switch (this.f503e) {
            case 0:
                return (C0143z) this.f504f;
            default:
                return (C0120c0) this.f505g;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f503e) {
            case 0:
                C0143z c0143z = (C0143z) this.f504f;
                C0122e c0122e = (C0122e) this.f505g;
                c0143z.m233i();
                try {
                    c0122e.close();
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
                ((InputStream) this.f504f).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f503e) {
            case 0:
                return "AsyncTimeout.source(" + ((C0122e) this.f505g) + ')';
            default:
                return "source(" + ((InputStream) this.f504f) + ')';
        }
    }
}
