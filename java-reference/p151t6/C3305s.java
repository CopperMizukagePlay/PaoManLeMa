package p151t6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001a0.AbstractC0094y0;
import p006a7.C0126i;
import p006a7.C0130m;
import p006a7.C0138u;
import p006a7.InterfaceC0128k;
import p039e5.C1182ph;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p106n6.AbstractC2721b;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.s */
/* loaded from: classes.dex */
public final class C3305s implements Closeable {

    /* renamed from: h */
    public static final Logger f16225h;

    /* renamed from: e */
    public final InterfaceC0128k f16226e;

    /* renamed from: f */
    public final C3304r f16227f;

    /* renamed from: g */
    public final C3289c f16228g;

    static {
        Logger logger = Logger.getLogger(AbstractC3292f.class.getName());
        AbstractC3367j.m5099d(logger, "getLogger(Http2::class.java.name)");
        f16225h = logger;
    }

    public C3305s(C0138u c0138u) {
        AbstractC3367j.m5100e(c0138u, "source");
        this.f16226e = c0138u;
        C3304r c3304r = new C3304r(c0138u);
        this.f16227f = c3304r;
        this.f16228g = new C3289c(c3304r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x024e, code lost:
    
        throw new java.io.IOException(p100n.AbstractC2647h.m4256b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5015b(boolean z7, C1182ph c1182ph) {
        int i7;
        int i8;
        Object[] array;
        String m4363i;
        int i9 = 0;
        try {
            this.f16226e.mo241D(9L);
            int m4374t = AbstractC2721b.m4374t(this.f16226e);
            if (m4374t <= 16384) {
                int readByte = this.f16226e.readByte() & 255;
                byte readByte2 = this.f16226e.readByte();
                int i10 = readByte2 & 255;
                int readInt = this.f16226e.readInt();
                int i11 = readInt & Integer.MAX_VALUE;
                Logger logger = f16225h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC3292f.m5005a(true, i11, m4374t, readByte, i10));
                }
                if (z7 && readByte != 4) {
                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = AbstractC3292f.f16160b;
                    if (readByte < strArr.length) {
                        m4363i = strArr[readByte];
                    } else {
                        m4363i = AbstractC2721b.m4363i("0x%02x", Integer.valueOf(readByte));
                    }
                    sb.append(m4363i);
                    throw new IOException(sb.toString());
                }
                int i12 = 3;
                int i13 = 2;
                switch (readByte) {
                    case 0:
                        m5016c(c1182ph, m4374t, i10, i11);
                        return true;
                    case 1:
                        m5018f(c1182ph, m4374t, i10, i11);
                        return true;
                    case 2:
                        if (m4374t == 5) {
                            if (i11 != 0) {
                                InterfaceC0128k interfaceC0128k = this.f16226e;
                                interfaceC0128k.readInt();
                                interfaceC0128k.readByte();
                                return true;
                            }
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        throw new IOException(AbstractC0094y0.m184k(m4374t, "TYPE_PRIORITY length: ", " != 5"));
                    case 3:
                        if (m4374t == 4) {
                            if (i11 != 0) {
                                int readInt2 = this.f16226e.readInt();
                                int[] m4258d = AbstractC2647h.m4258d(14);
                                int length = m4258d.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < length) {
                                        int i15 = m4258d[i14];
                                        if (AbstractC2647h.m4257c(i15) == readInt2) {
                                            i7 = i15;
                                        } else {
                                            i14++;
                                        }
                                    } else {
                                        i7 = 0;
                                    }
                                }
                                if (i7 != 0) {
                                    C3301o c3301o = (C3301o) c1182ph.f6887g;
                                    if (i11 != 0 && (readInt & 1) == 0) {
                                        i9 = 1;
                                    }
                                    if (i9 != 0) {
                                        c3301o.f16197m.m4558c(new C3296j(c3301o.f16191g + '[' + i11 + "] onReset", c3301o, i11, i7, 1), 0L);
                                        return true;
                                    }
                                    C3309w m5008d = c3301o.m5008d(i11);
                                    if (m5008d == null) {
                                        return true;
                                    }
                                    m5008d.m5031j(i7);
                                    return true;
                                }
                                throw new IOException(AbstractC2647h.m4256b("TYPE_RST_STREAM unexpected error code: ", readInt2));
                            }
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        throw new IOException(AbstractC0094y0.m184k(m4374t, "TYPE_RST_STREAM length: ", " != 4"));
                    case 4:
                        InterfaceC0128k interfaceC0128k2 = this.f16226e;
                        if (i11 == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (m4374t != 0) {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else {
                                if (m4374t % 6 == 0) {
                                    C3286a0 c3286a0 = new C3286a0();
                                    C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4374t), 6);
                                    int i16 = m3512F.f18163e;
                                    int i17 = m3512F.f18164f;
                                    int i18 = m3512F.f18165g;
                                    if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                                        while (true) {
                                            short readShort = interfaceC0128k2.readShort();
                                            byte[] bArr = AbstractC2721b.f14569a;
                                            int i19 = readShort & 65535;
                                            int readInt3 = interfaceC0128k2.readInt();
                                            if (i19 != 2) {
                                                if (i19 != i12) {
                                                    if (i19 != 4) {
                                                        if (i19 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                        }
                                                    } else if (readInt3 >= 0) {
                                                        i19 = 7;
                                                    } else {
                                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else if (readInt3 != 0 && readInt3 != 1) {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                            }
                                            c3286a0.m4993c(i19, readInt3);
                                            if (i16 != i17) {
                                                i16 += i18;
                                                i12 = 3;
                                            }
                                        }
                                    }
                                    C3301o c3301o2 = (C3301o) c1182ph.f6887g;
                                    c3301o2.f16196l.m4558c(new C3295i(AbstractC2487d.m4046j(new StringBuilder(), c3301o2.f16191g, " applyAndAckSettings"), c1182ph, c3286a0, i13), 0L);
                                    return true;
                                }
                                throw new IOException(AbstractC2647h.m4256b("TYPE_SETTINGS length % 6 != 0: ", m4374t));
                            }
                        } else {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        m5019h(c1182ph, m4374t, i10, i11);
                        return true;
                    case AbstractC3122c.f15759d /* 6 */:
                        if (m4374t == 8) {
                            if (i11 == 0) {
                                int readInt4 = this.f16226e.readInt();
                                int readInt5 = this.f16226e.readInt();
                                if ((readByte2 & 1) != 0) {
                                    i9 = 1;
                                }
                                if (i9 != 0) {
                                    C3301o c3301o3 = (C3301o) c1182ph.f6887g;
                                    synchronized (c3301o3) {
                                        try {
                                            if (readInt4 != 1) {
                                                if (readInt4 != 2) {
                                                    if (readInt4 == 3) {
                                                        c3301o3.notifyAll();
                                                    }
                                                } else {
                                                    c3301o3.f16203s++;
                                                }
                                            } else {
                                                c3301o3.f16201q++;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                                ((C3301o) c1182ph.f6887g).f16196l.m4558c(new C3296j(AbstractC2487d.m4046j(new StringBuilder(), ((C3301o) c1182ph.f6887g).f16191g, " ping"), (C3301o) c1182ph.f6887g, readInt4, readInt5, 0), 0L);
                                return true;
                            }
                            throw new IOException("TYPE_PING streamId != 0");
                        }
                        throw new IOException(AbstractC2647h.m4256b("TYPE_PING length != 8: ", m4374t));
                    case 7:
                        if (m4374t >= 8) {
                            if (i11 == 0) {
                                int readInt6 = this.f16226e.readInt();
                                int readInt7 = this.f16226e.readInt();
                                int i20 = m4374t - 8;
                                int[] m4258d2 = AbstractC2647h.m4258d(14);
                                int length2 = m4258d2.length;
                                int i21 = 0;
                                while (true) {
                                    if (i21 < length2) {
                                        i8 = m4258d2[i21];
                                        if (AbstractC2647h.m4257c(i8) != readInt7) {
                                            i21++;
                                        }
                                    } else {
                                        i8 = 0;
                                    }
                                }
                                if (i8 != 0) {
                                    C0130m c0130m = C0130m.f528h;
                                    if (i20 > 0) {
                                        c0130m = this.f16226e.mo257i(i20);
                                    }
                                    AbstractC3367j.m5100e(c0130m, "debugData");
                                    c0130m.mo286c();
                                    C3301o c3301o4 = (C3301o) c1182ph.f6887g;
                                    synchronized (c3301o4) {
                                        array = c3301o4.f16190f.values().toArray(new C3309w[0]);
                                        c3301o4.f16194j = true;
                                    }
                                    C3309w[] c3309wArr = (C3309w[]) array;
                                    int length3 = c3309wArr.length;
                                    while (i9 < length3) {
                                        C3309w c3309w = c3309wArr[i9];
                                        if (c3309w.f16240a > readInt6 && c3309w.m5028g()) {
                                            c3309w.m5031j(8);
                                            ((C3301o) c1182ph.f6887g).m5008d(c3309w.f16240a);
                                        }
                                        i9++;
                                    }
                                    break;
                                } else {
                                    throw new IOException(AbstractC2647h.m4256b("TYPE_GOAWAY unexpected error code: ", readInt7));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        } else {
                            throw new IOException(AbstractC2647h.m4256b("TYPE_GOAWAY length < 8: ", m4374t));
                        }
                    case 8:
                        if (m4374t == 4) {
                            long readInt8 = this.f16226e.readInt() & 2147483647L;
                            if (readInt8 != 0) {
                                if (i11 == 0) {
                                    C3301o c3301o5 = (C3301o) c1182ph.f6887g;
                                    synchronized (c3301o5) {
                                        c3301o5.f16210z += readInt8;
                                        c3301o5.notifyAll();
                                    }
                                    return true;
                                }
                                C3309w m5007c = ((C3301o) c1182ph.f6887g).m5007c(i11);
                                if (m5007c != null) {
                                    synchronized (m5007c) {
                                        m5007c.f16245f += readInt8;
                                        if (readInt8 > 0) {
                                            m5007c.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException(AbstractC2647h.m4256b("TYPE_WINDOW_UPDATE length !=4: ", m4374t));
                        }
                        break;
                    default:
                        this.f16226e.skip(m4374t);
                        return true;
                }
                return true;
            }
            throw new IOException(AbstractC2647h.m4256b("FRAME_SIZE_ERROR: ", m4374t));
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, a7.i] */
    /* renamed from: c */
    public final void m5016c(C1182ph c1182ph, int i7, int i8, int i9) {
        boolean z7;
        int i10;
        boolean z8;
        long j6;
        boolean z9;
        boolean z10;
        if (i9 != 0) {
            if ((i8 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 32) == 0) {
                if ((i8 & 8) != 0) {
                    byte readByte = this.f16226e.readByte();
                    byte[] bArr = AbstractC2721b.f14569a;
                    i10 = readByte & 255;
                } else {
                    i10 = 0;
                }
                int m5014a = AbstractC3303q.m5014a(i7, i8, i10);
                InterfaceC0128k interfaceC0128k = this.f16226e;
                AbstractC3367j.m5100e(interfaceC0128k, "source");
                C3301o c3301o = (C3301o) c1182ph.f6887g;
                long j7 = 0;
                if (i9 != 0 && (i9 & 1) == 0) {
                    ?? obj = new Object();
                    long j8 = m5014a;
                    interfaceC0128k.mo241D(j8);
                    interfaceC0128k.mo214C(j8, obj);
                    c3301o.f16197m.m4558c(new C3297k(c3301o.f16191g + '[' + i9 + "] onData", c3301o, i9, obj, m5014a, z7), 0L);
                } else {
                    C3309w m5007c = c3301o.m5007c(i9);
                    if (m5007c == null) {
                        ((C3301o) c1182ph.f6887g).m5012n(i9, 2);
                        long j9 = m5014a;
                        ((C3301o) c1182ph.f6887g).m5010h(j9);
                        interfaceC0128k.skip(j9);
                    } else {
                        byte[] bArr2 = AbstractC2721b.f14569a;
                        C3307u c3307u = m5007c.f16248i;
                        long j10 = m5014a;
                        c3307u.getClass();
                        long j11 = j10;
                        while (true) {
                            if (j11 > j7) {
                                synchronized (c3307u.f16238j) {
                                    z8 = c3307u.f16234f;
                                    j6 = j7;
                                    if (c3307u.f16236h.f524f + j11 > c3307u.f16233e) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                }
                                if (z9) {
                                    interfaceC0128k.skip(j11);
                                    c3307u.f16238j.m5026e(4);
                                    break;
                                }
                                if (z8) {
                                    interfaceC0128k.skip(j11);
                                    break;
                                }
                                long mo214C = interfaceC0128k.mo214C(j11, c3307u.f16235g);
                                if (mo214C != -1) {
                                    j11 -= mo214C;
                                    C3309w c3309w = c3307u.f16238j;
                                    synchronized (c3309w) {
                                        try {
                                            if (c3307u.f16237i) {
                                                C0126i c0126i = c3307u.f16235g;
                                                c0126i.skip(c0126i.f524f);
                                            } else {
                                                C0126i c0126i2 = c3307u.f16236h;
                                                if (c0126i2.f524f == j6) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                c0126i2.m270w(c3307u.f16235g);
                                                if (z10) {
                                                    c3309w.notifyAll();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    j7 = j6;
                                } else {
                                    throw new EOFException();
                                }
                            } else {
                                C3309w c3309w2 = c3307u.f16238j;
                                byte[] bArr3 = AbstractC2721b.f14569a;
                                c3309w2.f16241b.m5010h(j10);
                                break;
                            }
                        }
                        if (z7) {
                            m5007c.m5030i(AbstractC2721b.f14570b, true);
                        }
                    }
                }
                this.f16226e.skip(i10);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16226e.close();
    }

    /* renamed from: d */
    public final List m5017d(int i7, int i8, int i9, int i10) {
        C3304r c3304r = this.f16227f;
        c3304r.f16223i = i7;
        c3304r.f16220f = i7;
        c3304r.f16224j = i8;
        c3304r.f16221g = i9;
        c3304r.f16222h = i10;
        C3289c c3289c = this.f16228g;
        C0138u c0138u = c3289c.f16144c;
        ArrayList arrayList = c3289c.f16143b;
        while (!c0138u.m301b()) {
            byte readByte = c0138u.readByte();
            byte[] bArr = AbstractC2721b.f14569a;
            int i11 = readByte & 255;
            if (i11 != 128) {
                if ((readByte & 128) == 128) {
                    int m4998e = c3289c.m4998e(i11, 127);
                    int i12 = m4998e - 1;
                    if (i12 >= 0) {
                        C3287b[] c3287bArr = AbstractC3291e.f16157a;
                        if (i12 <= c3287bArr.length - 1) {
                            arrayList.add(c3287bArr[i12]);
                        }
                    }
                    int length = c3289c.f16146e + 1 + (i12 - AbstractC3291e.f16157a.length);
                    if (length >= 0) {
                        C3287b[] c3287bArr2 = c3289c.f16145d;
                        if (length < c3287bArr2.length) {
                            C3287b c3287b = c3287bArr2[length];
                            AbstractC3367j.m5097b(c3287b);
                            arrayList.add(c3287b);
                        }
                    }
                    throw new IOException(AbstractC2647h.m4256b("Header index too large ", m4998e));
                }
                if (i11 == 64) {
                    C3287b[] c3287bArr3 = AbstractC3291e.f16157a;
                    C0130m m4997d = c3289c.m4997d();
                    AbstractC3291e.m5004a(m4997d);
                    c3289c.m4996c(new C3287b(m4997d, c3289c.m4997d()));
                } else if ((readByte & 64) == 64) {
                    c3289c.m4996c(new C3287b(c3289c.m4995b(c3289c.m4998e(i11, 63) - 1), c3289c.m4997d()));
                } else if ((readByte & 32) == 32) {
                    int m4998e2 = c3289c.m4998e(i11, 31);
                    c3289c.f16142a = m4998e2;
                    if (m4998e2 >= 0 && m4998e2 <= 4096) {
                        int i13 = c3289c.f16148g;
                        if (m4998e2 < i13) {
                            if (m4998e2 == 0) {
                                AbstractC1804l.m3023P(r7, 0, c3289c.f16145d.length);
                                c3289c.f16146e = c3289c.f16145d.length - 1;
                                c3289c.f16147f = 0;
                                c3289c.f16148g = 0;
                            } else {
                                c3289c.m4994a(i13 - m4998e2);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + c3289c.f16142a);
                    }
                } else if (i11 != 16 && i11 != 0) {
                    arrayList.add(new C3287b(c3289c.m4995b(c3289c.m4998e(i11, 15) - 1), c3289c.m4997d()));
                } else {
                    C3287b[] c3287bArr4 = AbstractC3291e.f16157a;
                    C0130m m4997d2 = c3289c.m4997d();
                    AbstractC3291e.m5004a(m4997d2);
                    arrayList.add(new C3287b(m4997d2, c3289c.m4997d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        List m3035C0 = AbstractC1805m.m3035C0(arrayList);
        arrayList.clear();
        return m3035C0;
    }

    /* renamed from: f */
    public final void m5018f(C1182ph c1182ph, int i7, int i8, int i9) {
        boolean z7;
        if (i9 != 0) {
            int i10 = 0;
            int i11 = 1;
            if ((i8 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 8) != 0) {
                byte readByte = this.f16226e.readByte();
                byte[] bArr = AbstractC2721b.f14569a;
                i10 = readByte & 255;
            }
            if ((i8 & 32) != 0) {
                InterfaceC0128k interfaceC0128k = this.f16226e;
                interfaceC0128k.readInt();
                interfaceC0128k.readByte();
                byte[] bArr2 = AbstractC2721b.f14569a;
                i7 -= 5;
            }
            List m5017d = m5017d(AbstractC3303q.m5014a(i7, i8, i10), i10, i8, i9);
            C3301o c3301o = (C3301o) c1182ph.f6887g;
            if (i9 != 0 && (i9 & 1) == 0) {
                c3301o.f16197m.m4558c(new C3298l(c3301o.f16191g + '[' + i9 + "] onHeaders", c3301o, i9, m5017d, z7), 0L);
                return;
            }
            synchronized (c3301o) {
                C3309w m5007c = c3301o.m5007c(i9);
                if (m5007c == null) {
                    if (c3301o.f16194j) {
                        return;
                    }
                    if (i9 <= c3301o.f16192h) {
                        return;
                    }
                    if (i9 % 2 == c3301o.f16193i % 2) {
                        return;
                    }
                    C3309w c3309w = new C3309w(i9, c3301o, false, z7, AbstractC2721b.m4376v(m5017d));
                    c3301o.f16192h = i9;
                    c3301o.f16190f.put(Integer.valueOf(i9), c3309w);
                    c3301o.f16195k.m4565e().m4558c(new C3295i(c3301o.f16191g + '[' + i9 + "] onStream", c3301o, c3309w, i11), 0L);
                    return;
                }
                m5007c.m5030i(AbstractC2721b.m4376v(m5017d), z7);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: h */
    public final void m5019h(C1182ph c1182ph, int i7, int i8, int i9) {
        int i10;
        if (i9 != 0) {
            if ((i8 & 8) != 0) {
                byte readByte = this.f16226e.readByte();
                byte[] bArr = AbstractC2721b.f14569a;
                i10 = readByte & 255;
            } else {
                i10 = 0;
            }
            int readInt = this.f16226e.readInt() & Integer.MAX_VALUE;
            List m5017d = m5017d(AbstractC3303q.m5014a(i7 - 4, i8, i10), i10, i8, i9);
            C3301o c3301o = (C3301o) c1182ph.f6887g;
            synchronized (c3301o) {
                if (c3301o.f16188D.contains(Integer.valueOf(readInt))) {
                    c3301o.m5012n(readInt, 2);
                    return;
                }
                c3301o.f16188D.add(Integer.valueOf(readInt));
                c3301o.f16197m.m4558c(new C3298l(c3301o.f16191g + '[' + readInt + "] onRequest", c3301o, readInt, m5017d), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
