package p151t6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.C0130m;
import p006a7.InterfaceC0116a0;
import p006a7.InterfaceC0128k;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.r */
/* loaded from: classes.dex */
public final class C3304r implements InterfaceC0116a0 {

    /* renamed from: e */
    public final InterfaceC0128k f16219e;

    /* renamed from: f */
    public int f16220f;

    /* renamed from: g */
    public int f16221g;

    /* renamed from: h */
    public int f16222h;

    /* renamed from: i */
    public int f16223i;

    /* renamed from: j */
    public int f16224j;

    public C3304r(InterfaceC0128k interfaceC0128k) {
        AbstractC3367j.m5100e(interfaceC0128k, "source");
        this.f16219e = interfaceC0128k;
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        int i7;
        int readInt;
        AbstractC3367j.m5100e(c0126i, "sink");
        do {
            int i8 = this.f16223i;
            InterfaceC0128k interfaceC0128k = this.f16219e;
            if (i8 == 0) {
                interfaceC0128k.skip(this.f16224j);
                this.f16224j = 0;
                if ((this.f16221g & 4) == 0) {
                    i7 = this.f16222h;
                    int m4374t = AbstractC2721b.m4374t(interfaceC0128k);
                    this.f16223i = m4374t;
                    this.f16220f = m4374t;
                    int readByte = interfaceC0128k.readByte() & 255;
                    this.f16221g = interfaceC0128k.readByte() & 255;
                    Logger logger = C3305s.f16225h;
                    if (logger.isLoggable(Level.FINE)) {
                        C0130m c0130m = AbstractC3292f.f16159a;
                        logger.fine(AbstractC3292f.m5005a(true, this.f16222h, this.f16220f, readByte, this.f16221g));
                    }
                    readInt = interfaceC0128k.readInt() & Integer.MAX_VALUE;
                    this.f16222h = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long mo214C = interfaceC0128k.mo214C(Math.min(8192L, i8), c0126i);
                if (mo214C != -1) {
                    this.f16223i -= (int) mo214C;
                    return mo214C;
                }
            }
            return -1L;
        } while (readInt == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        return this.f16219e.mo215a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
