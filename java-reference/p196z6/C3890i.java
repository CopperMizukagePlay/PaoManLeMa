package p196z6;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p001a0.AbstractC0094y0;
import p006a7.C0126i;
import p006a7.C0130m;
import p006a7.InterfaceC0128k;
import p100n.AbstractC2647h;
import p106n6.AbstractC2721b;
import p128q6.C3008k;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.i */
/* loaded from: classes.dex */
public final class C3890i implements Closeable {

    /* renamed from: e */
    public final InterfaceC0128k f18218e;

    /* renamed from: f */
    public final InterfaceC3889h f18219f;

    /* renamed from: g */
    public final boolean f18220g;

    /* renamed from: h */
    public final boolean f18221h;

    /* renamed from: i */
    public boolean f18222i;

    /* renamed from: j */
    public int f18223j;

    /* renamed from: k */
    public long f18224k;

    /* renamed from: l */
    public boolean f18225l;

    /* renamed from: m */
    public boolean f18226m;

    /* renamed from: n */
    public boolean f18227n;

    /* renamed from: o */
    public final C0126i f18228o;

    /* renamed from: p */
    public final C0126i f18229p;

    /* renamed from: q */
    public C3882a f18230q;

    /* renamed from: r */
    public final byte[] f18231r;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a7.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, a7.i] */
    public C3890i(InterfaceC0128k interfaceC0128k, C3887f c3887f, boolean z7, boolean z8) {
        AbstractC3367j.m5100e(interfaceC0128k, "source");
        AbstractC3367j.m5100e(c3887f, "frameCallback");
        this.f18218e = interfaceC0128k;
        this.f18219f = c3887f;
        this.f18220g = z7;
        this.f18221h = z8;
        this.f18228o = new Object();
        this.f18229p = new Object();
        this.f18231r = null;
    }

    /* renamed from: b */
    public final void m5908b() {
        String str;
        short s5;
        C3890i c3890i;
        C3891j c3891j;
        String m4256b;
        long j6 = this.f18224k;
        if (j6 > 0) {
            this.f18218e.mo246I(j6, this.f18228o);
        }
        switch (this.f18223j) {
            case 8:
                C0126i c0126i = this.f18228o;
                long j7 = c0126i.f524f;
                if (j7 != 1) {
                    C3008k c3008k = null;
                    if (j7 == 0) {
                        str = "";
                        s5 = 1005;
                    } else {
                        s5 = c0126i.readShort();
                        str = this.f18228o.m262o();
                        if (s5 >= 1000 && s5 < 5000) {
                            if ((1004 <= s5 && s5 < 1007) || (1015 <= s5 && s5 < 3000)) {
                                m4256b = AbstractC0094y0.m184k(s5, "Code ", " is reserved and may not be used.");
                            } else {
                                m4256b = null;
                            }
                        } else {
                            m4256b = AbstractC2647h.m4256b("Code must be in range [1000,5000): ", s5);
                        }
                        if (m4256b != null) {
                            throw new ProtocolException(m4256b);
                        }
                    }
                    C3887f c3887f = (C3887f) this.f18219f;
                    c3887f.getClass();
                    if (s5 != -1) {
                        synchronized (c3887f) {
                            if (c3887f.f18207r == -1) {
                                c3887f.f18207r = s5;
                                c3887f.f18208s = str;
                                if (c3887f.f18206q && c3887f.f18204o.isEmpty()) {
                                    C3008k c3008k2 = c3887f.f18202m;
                                    c3887f.f18202m = null;
                                    c3890i = c3887f.f18198i;
                                    c3887f.f18198i = null;
                                    c3891j = c3887f.f18199j;
                                    c3887f.f18199j = null;
                                    c3887f.f18200k.m4560e();
                                    c3008k = c3008k2;
                                } else {
                                    c3890i = null;
                                    c3891j = null;
                                }
                            } else {
                                throw new IllegalStateException("already closed");
                            }
                        }
                        if (c3008k != null) {
                            AbstractC2721b.m4358d(c3008k);
                        }
                        if (c3890i != null) {
                            AbstractC2721b.m4358d(c3890i);
                        }
                        if (c3891j != null) {
                            AbstractC2721b.m4358d(c3891j);
                        }
                        this.f18222i = true;
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case AbstractC3122c.f15758c /* 9 */:
                InterfaceC3889h interfaceC3889h = this.f18219f;
                C0126i c0126i2 = this.f18228o;
                C0130m mo257i = c0126i2.mo257i(c0126i2.f524f);
                C3887f c3887f2 = (C3887f) interfaceC3889h;
                synchronized (c3887f2) {
                    try {
                        AbstractC3367j.m5100e(mo257i, "payload");
                        if (!c3887f2.f18209t && (!c3887f2.f18206q || !c3887f2.f18204o.isEmpty())) {
                            c3887f2.f18203n.add(mo257i);
                            c3887f2.m5905f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case AbstractC3122c.f15760e /* 10 */:
                InterfaceC3889h interfaceC3889h2 = this.f18219f;
                C0126i c0126i3 = this.f18228o;
                C0130m mo257i2 = c0126i3.mo257i(c0126i3.f524f);
                C3887f c3887f3 = (C3887f) interfaceC3889h2;
                synchronized (c3887f3) {
                    AbstractC3367j.m5100e(mo257i2, "payload");
                    c3887f3.f18211v = false;
                }
                return;
            default:
                int i7 = this.f18223j;
                byte[] bArr = AbstractC2721b.f14569a;
                String hexString = Integer.toHexString(i7);
                AbstractC3367j.m5099d(hexString, "toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    /* renamed from: c */
    public final void m5909c() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (!this.f18222i) {
            InterfaceC0128k interfaceC0128k = this.f18218e;
            long mo230h = interfaceC0128k.mo215a().mo230h();
            interfaceC0128k.mo215a().mo227b();
            try {
                byte readByte = interfaceC0128k.readByte();
                byte[] bArr = AbstractC2721b.f14569a;
                interfaceC0128k.mo215a().mo225g(mo230h, TimeUnit.NANOSECONDS);
                int i7 = readByte & 15;
                this.f18223j = i7;
                boolean z11 = false;
                if ((readByte & 128) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f18225l = z7;
                if ((readByte & 8) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f18226m = z8;
                if (z8 && !z7) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 != 1 && i7 != 2) {
                    if (z9) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z9) {
                        if (this.f18220g) {
                            z10 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z10 = false;
                    }
                    this.f18227n = z10;
                }
                if ((readByte & 32) == 0) {
                    if ((readByte & 16) == 0) {
                        byte readByte2 = interfaceC0128k.readByte();
                        if ((readByte2 & 128) != 0) {
                            z11 = true;
                        }
                        if (!z11) {
                            long j6 = readByte2 & Byte.MAX_VALUE;
                            this.f18224k = j6;
                            if (j6 == 126) {
                                this.f18224k = interfaceC0128k.readShort() & 65535;
                            } else if (j6 == 127) {
                                long readLong = interfaceC0128k.readLong();
                                this.f18224k = readLong;
                                if (readLong < 0) {
                                    StringBuilder sb = new StringBuilder("Frame length 0x");
                                    String hexString = Long.toHexString(this.f18224k);
                                    AbstractC3367j.m5099d(hexString, "toHexString(this)");
                                    sb.append(hexString);
                                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                                    throw new ProtocolException(sb.toString());
                                }
                            }
                            if (this.f18226m && this.f18224k > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            }
                            if (z11) {
                                byte[] bArr2 = this.f18231r;
                                AbstractC3367j.m5097b(bArr2);
                                interfaceC0128k.readFully(bArr2);
                                return;
                            }
                            return;
                        }
                        throw new ProtocolException("Server-sent frames must not be masked.");
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                interfaceC0128k.mo215a().mo225g(mo230h, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3882a c3882a = this.f18230q;
        if (c3882a != null) {
            c3882a.close();
        }
    }
}
