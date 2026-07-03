package p151t6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006a7.C0126i;
import p006a7.C0137t;
import p006a7.InterfaceC0127j;
import p060h5.AbstractC1804l;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.x */
/* loaded from: classes.dex */
public final class C3310x implements Closeable {

    /* renamed from: j */
    public static final Logger f16254j = Logger.getLogger(AbstractC3292f.class.getName());

    /* renamed from: e */
    public final InterfaceC0127j f16255e;

    /* renamed from: f */
    public final C0126i f16256f;

    /* renamed from: g */
    public int f16257g;

    /* renamed from: h */
    public boolean f16258h;

    /* renamed from: i */
    public final C3290d f16259i;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a7.i] */
    public C3310x(C0137t c0137t) {
        AbstractC3367j.m5100e(c0137t, "sink");
        this.f16255e = c0137t;
        ?? obj = new Object();
        this.f16256f = obj;
        this.f16257g = 16384;
        this.f16259i = new C3290d(obj);
    }

    /* renamed from: b */
    public final synchronized void m5032b(C3286a0 c3286a0) {
        int i7;
        try {
            AbstractC3367j.m5100e(c3286a0, "peerSettings");
            if (!this.f16258h) {
                int i8 = this.f16257g;
                int i9 = c3286a0.f16130a;
                if ((i9 & 32) != 0) {
                    i8 = c3286a0.f16131b[5];
                }
                this.f16257g = i8;
                int i10 = -1;
                if ((i9 & 2) != 0) {
                    i7 = c3286a0.f16131b[1];
                } else {
                    i7 = -1;
                }
                if (i7 != -1) {
                    C3290d c3290d = this.f16259i;
                    if ((i9 & 2) != 0) {
                        i10 = c3286a0.f16131b[1];
                    }
                    c3290d.getClass();
                    int min = Math.min(i10, 16384);
                    int i11 = c3290d.f16152d;
                    if (i11 != min) {
                        if (min < i11) {
                            c3290d.f16150b = Math.min(c3290d.f16150b, min);
                        }
                        c3290d.f16151c = true;
                        c3290d.f16152d = min;
                        int i12 = c3290d.f16156h;
                        if (min < i12) {
                            if (min == 0) {
                                C3287b[] c3287bArr = c3290d.f16153e;
                                AbstractC1804l.m3023P(c3287bArr, 0, c3287bArr.length);
                                c3290d.f16154f = c3290d.f16153e.length - 1;
                                c3290d.f16155g = 0;
                                c3290d.f16156h = 0;
                            } else {
                                c3290d.m4999a(i12 - min);
                            }
                        }
                    }
                }
                m5034d(0, 0, 4, 1);
                this.f16255e.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m5033c(boolean z7, int i7, C0126i c0126i, int i8) {
        if (!this.f16258h) {
            m5034d(i7, i8, 0, z7 ? 1 : 0);
            if (i8 > 0) {
                InterfaceC0127j interfaceC0127j = this.f16255e;
                AbstractC3367j.m5097b(c0126i);
                interfaceC0127j.mo232j(i8, c0126i);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16258h = true;
        this.f16255e.close();
    }

    /* renamed from: d */
    public final void m5034d(int i7, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f16254j;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC3292f.m5005a(false, i7, i8, i9, i10));
        }
        if (i8 <= this.f16257g) {
            if ((Integer.MIN_VALUE & i7) == 0) {
                byte[] bArr = AbstractC2721b.f14569a;
                InterfaceC0127j interfaceC0127j = this.f16255e;
                AbstractC3367j.m5100e(interfaceC0127j, "<this>");
                interfaceC0127j.writeByte((i8 >>> 16) & 255);
                interfaceC0127j.writeByte((i8 >>> 8) & 255);
                interfaceC0127j.writeByte(i8 & 255);
                interfaceC0127j.writeByte(i9 & 255);
                interfaceC0127j.writeByte(i10 & 255);
                interfaceC0127j.writeInt(i7 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(AbstractC2647h.m4256b("reserved bit set: ", i7).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f16257g + ": " + i8).toString());
    }

    /* renamed from: f */
    public final synchronized void m5035f(byte[] bArr, int i7, int i8) {
        AbstractC2487d.m4055s("errorCode", i8);
        if (!this.f16258h) {
            if (AbstractC2647h.m4257c(i8) != -1) {
                m5034d(0, bArr.length + 8, 7, 0);
                this.f16255e.writeInt(i7);
                this.f16255e.writeInt(AbstractC2647h.m4257c(i8));
                if (bArr.length != 0) {
                    this.f16255e.write(bArr);
                }
                this.f16255e.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f16258h) {
            this.f16255e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void m5036h(boolean z7, int i7, ArrayList arrayList) {
        int i8;
        int i9;
        if (!this.f16258h) {
            this.f16259i.m5002d(arrayList);
            long j6 = this.f16256f.f524f;
            long min = Math.min(this.f16257g, j6);
            if (j6 == min) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            if (z7) {
                i8 |= 1;
            }
            m5034d(i7, (int) min, 1, i8);
            this.f16255e.mo232j(min, this.f16256f);
            if (j6 > min) {
                long j7 = j6 - min;
                while (j7 > 0) {
                    long min2 = Math.min(this.f16257g, j7);
                    j7 -= min2;
                    int i10 = (int) min2;
                    if (j7 == 0) {
                        i9 = 4;
                    } else {
                        i9 = 0;
                    }
                    m5034d(i7, i10, 9, i9);
                    this.f16255e.mo232j(min2, this.f16256f);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: m */
    public final synchronized void m5037m(int i7, int i8, boolean z7) {
        if (!this.f16258h) {
            m5034d(0, 8, 6, z7 ? 1 : 0);
            this.f16255e.writeInt(i7);
            this.f16255e.writeInt(i8);
            this.f16255e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: n */
    public final synchronized void m5038n(int i7, int i8) {
        AbstractC2487d.m4055s("errorCode", i8);
        if (!this.f16258h) {
            if (AbstractC2647h.m4257c(i8) != -1) {
                m5034d(i7, 4, 3, 0);
                this.f16255e.writeInt(AbstractC2647h.m4257c(i8));
                this.f16255e.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: o */
    public final synchronized void m5039o(int i7, long j6) {
        if (!this.f16258h) {
            if (j6 != 0 && j6 <= 2147483647L) {
                m5034d(i7, 4, 8, 0);
                this.f16255e.writeInt((int) j6);
                this.f16255e.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
