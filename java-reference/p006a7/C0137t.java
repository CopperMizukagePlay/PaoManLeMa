package p006a7;

import java.nio.ByteBuffer;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.t */
/* loaded from: classes.dex */
public final class C0137t implements InterfaceC0127j {

    /* renamed from: e */
    public final InterfaceC0142y f549e;

    /* renamed from: f */
    public final C0126i f550f;

    /* renamed from: g */
    public boolean f551g;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a7.i] */
    public C0137t(InterfaceC0142y interfaceC0142y) {
        AbstractC3367j.m5100e(interfaceC0142y, "sink");
        this.f549e = interfaceC0142y;
        this.f550f = new Object();
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: E */
    public final InterfaceC0127j mo242E(String str) {
        AbstractC3367j.m5100e(str, "string");
        if (!this.f551g) {
            this.f550f.m248K(str);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        return this.f549e.mo231a();
    }

    /* renamed from: b */
    public final InterfaceC0127j m300b() {
        if (!this.f551g) {
            C0126i c0126i = this.f550f;
            long j6 = c0126i.f524f;
            if (j6 == 0) {
                j6 = 0;
            } else {
                C0139v c0139v = c0126i.f523e;
                AbstractC3367j.m5097b(c0139v);
                C0139v c0139v2 = c0139v.f561g;
                AbstractC3367j.m5097b(c0139v2);
                if (c0139v2.f557c < 8192 && c0139v2.f559e) {
                    j6 -= r6 - c0139v2.f556b;
                }
            }
            if (j6 > 0) {
                this.f549e.mo232j(j6, c0126i);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0142y interfaceC0142y = this.f549e;
        if (!this.f551g) {
            try {
                C0126i c0126i = this.f550f;
                long j6 = c0126i.f524f;
                if (j6 > 0) {
                    interfaceC0142y.mo232j(j6, c0126i);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                interfaceC0142y.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f551g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: e */
    public final InterfaceC0127j mo253e(C0130m c0130m) {
        AbstractC3367j.m5100e(c0130m, "byteString");
        if (!this.f551g) {
            this.f550f.m268u(c0130m);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j, p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
        if (!this.f551g) {
            C0126i c0126i = this.f550f;
            long j6 = c0126i.f524f;
            InterfaceC0142y interfaceC0142y = this.f549e;
            if (j6 > 0) {
                interfaceC0142y.mo232j(j6, c0126i);
            }
            interfaceC0142y.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: g */
    public final InterfaceC0127j mo255g(long j6) {
        if (!this.f551g) {
            this.f550f.m273z(j6);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f551g;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        AbstractC3367j.m5100e(c0126i, "source");
        if (!this.f551g) {
            this.f550f.mo232j(j6, c0126i);
            m300b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: k */
    public final InterfaceC0127j mo258k() {
        if (!this.f551g) {
            C0126i c0126i = this.f550f;
            long j6 = c0126i.f524f;
            if (j6 > 0) {
                this.f549e.mo232j(j6, c0126i);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: r */
    public final C0126i mo265r() {
        return this.f550f;
    }

    public final String toString() {
        return "buffer(" + this.f549e + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC3367j.m5100e(byteBuffer, "source");
        if (!this.f551g) {
            int write = this.f550f.write(byteBuffer);
            m300b();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    public final InterfaceC0127j writeByte(int i7) {
        if (!this.f551g) {
            this.f550f.m272y(i7);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    public final InterfaceC0127j writeInt(int i7) {
        if (!this.f551g) {
            this.f550f.m239A(i7);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    public final InterfaceC0127j writeShort(int i7) {
        if (!this.f551g) {
            this.f550f.m240B(i7);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p006a7.InterfaceC0127j
    public final InterfaceC0127j write(byte[] bArr) {
        AbstractC3367j.m5100e(bArr, "source");
        if (!this.f551g) {
            this.f550f.m5912write(bArr);
            m300b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
