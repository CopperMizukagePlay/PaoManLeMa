package p128q6;

import java.io.IOException;
import java.net.ProtocolException;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.InterfaceC0116a0;
import p099m6.AbstractC2614o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.d */
/* loaded from: classes.dex */
public final class C3001d implements InterfaceC0116a0 {

    /* renamed from: e */
    public final InterfaceC0116a0 f15476e;

    /* renamed from: f */
    public final long f15477f;

    /* renamed from: g */
    public long f15478g;

    /* renamed from: h */
    public boolean f15479h;

    /* renamed from: i */
    public boolean f15480i;

    /* renamed from: j */
    public boolean f15481j;

    /* renamed from: k */
    public final /* synthetic */ C3002e f15482k;

    public C3001d(C3002e c3002e, InterfaceC0116a0 interfaceC0116a0, long j6) {
        AbstractC3367j.m5100e(interfaceC0116a0, "delegate");
        this.f15482k = c3002e;
        this.f15476e = interfaceC0116a0;
        this.f15477f = j6;
        this.f15479h = true;
        if (j6 == 0) {
            m4671c(null);
        }
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        AbstractC3367j.m5100e(c0126i, "sink");
        if (!this.f15481j) {
            try {
                long mo214C = this.f15476e.mo214C(8192L, c0126i);
                if (this.f15479h) {
                    this.f15479h = false;
                    ((AbstractC2614o) this.f15482k.f15485c).getClass();
                }
                if (mo214C == -1) {
                    m4671c(null);
                    return -1L;
                }
                long j7 = this.f15478g + mo214C;
                long j8 = this.f15477f;
                if (j8 != -1 && j7 > j8) {
                    throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
                }
                this.f15478g = j7;
                if (j7 == j8) {
                    m4671c(null);
                }
                return mo214C;
            } catch (IOException e7) {
                throw m4671c(e7);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        return this.f15476e.mo215a();
    }

    /* renamed from: b */
    public final void m4670b() {
        this.f15476e.close();
    }

    /* renamed from: c */
    public final IOException m4671c(IOException iOException) {
        if (this.f15480i) {
            return iOException;
        }
        this.f15480i = true;
        C3002e c3002e = this.f15482k;
        if (iOException == null && this.f15479h) {
            this.f15479h = false;
            ((AbstractC2614o) c3002e.f15485c).getClass();
        }
        return c3002e.m4672a(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15481j) {
            return;
        }
        this.f15481j = true;
        try {
            m4670b();
            m4671c(null);
        } catch (IOException e7) {
            throw m4671c(e7);
        }
    }

    public final String toString() {
        return C3001d.class.getSimpleName() + '(' + this.f15476e + ')';
    }
}
