package p039e5;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l */
/* loaded from: classes.dex */
public final class C1040l implements Closeable {

    /* renamed from: e */
    public final Closeable f5347e;

    /* renamed from: f */
    public final FileChannel f5348f;

    /* renamed from: g */
    public final boolean f5349g;

    public C1040l(Closeable closeable, FileChannel fileChannel, boolean z7) {
        this.f5347e = closeable;
        this.f5348f = fileChannel;
        this.f5349g = z7;
    }

    /* renamed from: b */
    public final void m1634b(long j6, byte[] bArr, int i7, int i8) {
        AbstractC3367j.m5100e(bArr, "buffer");
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i7, i8);
        while (wrap.hasRemaining()) {
            int write = this.f5348f.write(wrap, j6);
            if (write > 0) {
                j6 += write;
            } else {
                throw new IllegalStateException("目标文件停止接受写入");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5347e.close();
    }
}
