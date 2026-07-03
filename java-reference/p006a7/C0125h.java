package p006a7;

import java.io.IOException;
import java.io.InputStream;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.h */
/* loaded from: classes.dex */
public final class C0125h extends InputStream {

    /* renamed from: e */
    public final /* synthetic */ int f521e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC0128k f522f;

    public /* synthetic */ C0125h(InterfaceC0128k interfaceC0128k, int i7) {
        this.f521e = i7;
        this.f522f = interfaceC0128k;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.f521e) {
            case 0:
                min = Math.min(((C0126i) this.f522f).f524f, Integer.MAX_VALUE);
                return (int) min;
            default:
                C0138u c0138u = (C0138u) this.f522f;
                if (!c0138u.f554g) {
                    min = Math.min(c0138u.f553f.f524f, Integer.MAX_VALUE);
                    return (int) min;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f521e) {
            case 0:
                return;
            default:
                ((C0138u) this.f522f).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f521e) {
            case 0:
                C0126i c0126i = (C0126i) this.f522f;
                if (c0126i.f524f > 0) {
                    return c0126i.readByte() & 255;
                }
                return -1;
            default:
                C0138u c0138u = (C0138u) this.f522f;
                C0126i c0126i2 = c0138u.f553f;
                if (c0138u.f554g) {
                    throw new IOException("closed");
                }
                if (c0126i2.f524f == 0 && c0138u.f552e.mo214C(8192L, c0126i2) == -1) {
                    return -1;
                }
                return c0126i2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f521e) {
            case 0:
                return ((C0126i) this.f522f) + ".inputStream()";
            default:
                return ((C0138u) this.f522f) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        switch (this.f521e) {
            case 0:
                AbstractC3367j.m5100e(bArr, "sink");
                return ((C0126i) this.f522f).read(bArr, i7, i8);
            default:
                AbstractC3367j.m5100e(bArr, "data");
                C0138u c0138u = (C0138u) this.f522f;
                C0126i c0126i = c0138u.f553f;
                if (!c0138u.f554g) {
                    AbstractC0117b.m219d(bArr.length, i7, i8);
                    if (c0126i.f524f == 0 && c0138u.f552e.mo214C(8192L, c0126i) == -1) {
                        return -1;
                    }
                    return c0126i.read(bArr, i7, i8);
                }
                throw new IOException("closed");
        }
    }

    /* renamed from: b */
    private final void m238b() {
    }
}
