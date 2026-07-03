package p128q6;

import java.io.IOException;
import java.net.ProtocolException;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.InterfaceC0142y;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.c */
/* loaded from: classes.dex */
public final class C3000c implements InterfaceC0142y {

    /* renamed from: e */
    public final InterfaceC0142y f15470e;

    /* renamed from: f */
    public final long f15471f;

    /* renamed from: g */
    public boolean f15472g;

    /* renamed from: h */
    public long f15473h;

    /* renamed from: i */
    public boolean f15474i;

    /* renamed from: j */
    public final /* synthetic */ C3002e f15475j;

    public C3000c(C3002e c3002e, InterfaceC0142y interfaceC0142y, long j6) {
        AbstractC3367j.m5100e(interfaceC0142y, "delegate");
        this.f15475j = c3002e;
        this.f15470e = interfaceC0142y;
        this.f15471f = j6;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        return this.f15470e.mo231a();
    }

    /* renamed from: b */
    public final void m4667b() {
        this.f15470e.close();
    }

    /* renamed from: c */
    public final IOException m4668c(IOException iOException) {
        if (this.f15472g) {
            return iOException;
        }
        this.f15472g = true;
        return this.f15475j.m4672a(false, true, iOException);
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15474i) {
            return;
        }
        this.f15474i = true;
        long j6 = this.f15471f;
        if (j6 != -1 && this.f15473h != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m4667b();
            m4668c(null);
        } catch (IOException e7) {
            throw m4668c(e7);
        }
    }

    /* renamed from: d */
    public final void m4669d() {
        this.f15470e.flush();
    }

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
        try {
            m4669d();
        } catch (IOException e7) {
            throw m4668c(e7);
        }
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        if (!this.f15474i) {
            long j7 = this.f15471f;
            if (j7 != -1 && this.f15473h + j6 > j7) {
                throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f15473h + j6));
            }
            try {
                this.f15470e.mo232j(j6, c0126i);
                this.f15473h += j6;
                return;
            } catch (IOException e7) {
                throw m4668c(e7);
            }
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return C3000c.class.getSimpleName() + '(' + this.f15470e + ')';
    }
}
