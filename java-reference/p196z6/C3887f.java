package p196z6;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import p001a0.AbstractC0094y0;
import p006a7.C0126i;
import p006a7.C0129l;
import p006a7.C0130m;
import p006a7.C0134q;
import p092m.AbstractC2487d;
import p099m6.AbstractC2595c;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.EnumC2624y;
import p099m6.InterfaceC2608i0;
import p106n6.AbstractC2721b;
import p121p6.C2884c;
import p121p6.C2886e;
import p128q6.C3002e;
import p128q6.C3006i;
import p128q6.C3008k;
import p151t6.C3299m;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.f */
/* loaded from: classes.dex */
public final class C3887f implements InterfaceC2608i0, InterfaceC3889h {

    /* renamed from: w */
    public static final List f18189w = AbstractC3784a.m5817z(EnumC2624y.f14223g);

    /* renamed from: a */
    public final AbstractC2595c f18190a;

    /* renamed from: b */
    public final Random f18191b;

    /* renamed from: c */
    public final long f18192c;

    /* renamed from: d */
    public C3888g f18193d;

    /* renamed from: e */
    public final long f18194e;

    /* renamed from: f */
    public final String f18195f;

    /* renamed from: g */
    public C3006i f18196g;

    /* renamed from: h */
    public C3886e f18197h;

    /* renamed from: i */
    public C3890i f18198i;

    /* renamed from: j */
    public C3891j f18199j;

    /* renamed from: k */
    public final C2884c f18200k;

    /* renamed from: l */
    public String f18201l;

    /* renamed from: m */
    public C3008k f18202m;

    /* renamed from: n */
    public final ArrayDeque f18203n;

    /* renamed from: o */
    public final ArrayDeque f18204o;

    /* renamed from: p */
    public long f18205p;

    /* renamed from: q */
    public boolean f18206q;

    /* renamed from: r */
    public int f18207r;

    /* renamed from: s */
    public String f18208s;

    /* renamed from: t */
    public boolean f18209t;

    /* renamed from: u */
    public int f18210u;

    /* renamed from: v */
    public boolean f18211v;

    public C3887f(C2886e c2886e, C2592a0 c2592a0, AbstractC2595c abstractC2595c, Random random, long j6, long j7) {
        AbstractC3367j.m5100e(c2886e, "taskRunner");
        this.f18190a = abstractC2595c;
        this.f18191b = random;
        this.f18192c = j6;
        this.f18193d = null;
        this.f18194e = j7;
        this.f18200k = c2886e.m4565e();
        this.f18203n = new ArrayDeque();
        this.f18204o = new ArrayDeque();
        this.f18207r = -1;
        String str = c2592a0.f14019b;
        if ("GET".equals(str)) {
            C0130m c0130m = C0130m.f528h;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f18195f = C0129l.m279j(bArr).mo284a();
            return;
        }
        throw new IllegalArgumentException(AbstractC2487d.m4058v("Request must be GET: ", str).toString());
    }

    /* renamed from: a */
    public final void m5900a(C2598d0 c2598d0, C3002e c3002e) {
        int i7 = c2598d0.f14059h;
        if (i7 == 101) {
            String m4141b = C2598d0.m4141b("Connection", c2598d0);
            if ("Upgrade".equalsIgnoreCase(m4141b)) {
                String m4141b2 = C2598d0.m4141b("Upgrade", c2598d0);
                if ("websocket".equalsIgnoreCase(m4141b2)) {
                    String m4141b3 = C2598d0.m4141b("Sec-WebSocket-Accept", c2598d0);
                    C0130m c0130m = C0130m.f528h;
                    String mo284a = C0129l.m278g(this.f18195f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo285b("SHA-1").mo284a();
                    if (AbstractC3367j.m5096a(mo284a, m4141b3)) {
                        if (c3002e != null) {
                            return;
                        } else {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + mo284a + "' but was '" + m4141b3 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + m4141b2 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + m4141b + '\'');
        }
        StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
        sb.append(i7);
        sb.append(' ');
        throw new ProtocolException(AbstractC0094y0.m187n(sb, c2598d0.f14058g, '\''));
    }

    /* renamed from: b */
    public final boolean m5901b(String str, int i7) {
        String str2;
        synchronized (this) {
            C0130m c0130m = null;
            try {
                if (i7 >= 1000 && i7 < 5000) {
                    if ((1004 <= i7 && i7 < 1007) || (1015 <= i7 && i7 < 3000)) {
                        str2 = "Code " + i7 + " is reserved and may not be used.";
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = "Code must be in range [1000,5000): " + i7;
                }
                if (str2 == null) {
                    if (str != null) {
                        C0130m c0130m2 = C0130m.f528h;
                        c0130m = C0129l.m278g(str);
                        if (c0130m.f529e.length > 123) {
                            throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                        }
                    }
                    if (!this.f18209t && !this.f18206q) {
                        this.f18206q = true;
                        this.f18204o.add(new C3884c(i7, c0130m));
                        m5905f();
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(str2.toString());
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final void m5902c(Exception exc, C2598d0 c2598d0) {
        synchronized (this) {
            if (this.f18209t) {
                return;
            }
            this.f18209t = true;
            C3008k c3008k = this.f18202m;
            this.f18202m = null;
            C3890i c3890i = this.f18198i;
            this.f18198i = null;
            C3891j c3891j = this.f18199j;
            this.f18199j = null;
            this.f18200k.m4560e();
            try {
                this.f18190a.mo2349l(this, exc);
            } finally {
                if (c3008k != null) {
                    AbstractC2721b.m4358d(c3008k);
                }
                if (c3890i != null) {
                    AbstractC2721b.m4358d(c3890i);
                }
                if (c3891j != null) {
                    AbstractC2721b.m4358d(c3891j);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m5903d(String str, C3008k c3008k) {
        C3887f c3887f;
        AbstractC3367j.m5100e(str, "name");
        C3888g c3888g = this.f18193d;
        AbstractC3367j.m5097b(c3888g);
        synchronized (this) {
            try {
                this.f18201l = str;
                this.f18202m = c3008k;
                this.f18199j = new C3891j(c3008k.f15514f, this.f18191b, c3888g.f18212a, c3888g.f18214c, this.f18194e);
                this.f18197h = new C3886e(this);
                long j6 = this.f18192c;
                if (j6 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j6);
                    c3887f = this;
                    try {
                        this.f18200k.m4558c(new C3299m(str.concat(" ping"), c3887f, nanos, 1), nanos);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    c3887f = this;
                }
                if (!c3887f.f18204o.isEmpty()) {
                    m5905f();
                }
                c3887f.f18198i = new C3890i(c3008k.f15513e, this, c3888g.f18212a, c3888g.f18216e);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: e */
    public final void m5904e() {
        while (this.f18207r == -1) {
            C3890i c3890i = this.f18198i;
            AbstractC3367j.m5097b(c3890i);
            c3890i.m5909c();
            if (c3890i.f18226m) {
                c3890i.m5908b();
            } else {
                InterfaceC3889h interfaceC3889h = c3890i.f18219f;
                C0126i c0126i = c3890i.f18229p;
                int i7 = c3890i.f18223j;
                if (i7 != 1 && i7 != 2) {
                    byte[] bArr = AbstractC2721b.f14569a;
                    String hexString = Integer.toHexString(i7);
                    AbstractC3367j.m5099d(hexString, "toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c3890i.f18222i) {
                    long j6 = c3890i.f18224k;
                    if (j6 > 0) {
                        c3890i.f18218e.mo246I(j6, c0126i);
                    }
                    if (!c3890i.f18225l) {
                        while (!c3890i.f18222i) {
                            c3890i.m5909c();
                            if (!c3890i.f18226m) {
                                break;
                            } else {
                                c3890i.m5908b();
                            }
                        }
                        if (c3890i.f18223j != 0) {
                            int i8 = c3890i.f18223j;
                            byte[] bArr2 = AbstractC2721b.f14569a;
                            String hexString2 = Integer.toHexString(i8);
                            AbstractC3367j.m5099d(hexString2, "toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    } else {
                        if (c3890i.f18227n) {
                            C3882a c3882a = c3890i.f18230q;
                            if (c3882a == null) {
                                c3882a = new C3882a(1, c3890i.f18221h);
                                c3890i.f18230q = c3882a;
                            }
                            Inflater inflater = (Inflater) c3882a.f18181h;
                            C0126i c0126i2 = c3882a.f18180g;
                            if (c0126i2.f524f == 0) {
                                if (c3882a.f18179f) {
                                    inflater.reset();
                                }
                                c0126i2.m270w(c0126i);
                                c0126i2.m239A(65535);
                                long bytesRead = inflater.getBytesRead() + c0126i2.f524f;
                                do {
                                    ((C0134q) c3882a.f18182i).m298b(Long.MAX_VALUE, c0126i);
                                } while (inflater.getBytesRead() < bytesRead);
                            } else {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                        }
                        if (i7 == 1) {
                            String m262o = c0126i.m262o();
                            C3887f c3887f = (C3887f) interfaceC3889h;
                            c3887f.getClass();
                            c3887f.f18190a.mo2350m(c3887f, m262o);
                        } else {
                            C0130m mo257i = c0126i.mo257i(c0126i.f524f);
                            ((C3887f) interfaceC3889h).getClass();
                            AbstractC3367j.m5100e(mo257i, "bytes");
                        }
                    }
                }
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: f */
    public final void m5905f() {
        byte[] bArr = AbstractC2721b.f14569a;
        C3886e c3886e = this.f18197h;
        if (c3886e != null) {
            this.f18200k.m4558c(c3886e, 0L);
        }
    }

    /* renamed from: g */
    public final boolean m5906g(String str) {
        AbstractC3367j.m5100e(str, "text");
        C0130m c0130m = C0130m.f528h;
        C0130m m278g = C0129l.m278g(str);
        synchronized (this) {
            if (!this.f18209t && !this.f18206q) {
                long j6 = this.f18205p;
                byte[] bArr = m278g.f529e;
                if (bArr.length + j6 > 16777216) {
                    m5901b(null, 1001);
                    return false;
                }
                this.f18205p = j6 + bArr.length;
                this.f18204o.add(new C3885d(m278g));
                m5905f();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c9, code lost:
    
        if (r2 < 3000) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:20:0x0073, B:28:0x0082, B:30:0x0086, B:31:0x0090, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x011f, B:67:0x0121, B:68:0x0122, B:69:0x012b, B:74:0x00df, B:75:0x012c, B:76:0x0131, B:60:0x0104, B:33:0x0091), top: B:18:0x0071, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:20:0x0073, B:28:0x0082, B:30:0x0086, B:31:0x0090, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x011f, B:67:0x0121, B:68:0x0122, B:69:0x012b, B:74:0x00df, B:75:0x012c, B:76:0x0131, B:60:0x0104, B:33:0x0091), top: B:18:0x0071, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:20:0x0073, B:28:0x0082, B:30:0x0086, B:31:0x0090, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x011f, B:67:0x0121, B:68:0x0122, B:69:0x012b, B:74:0x00df, B:75:0x012c, B:76:0x0131, B:60:0x0104, B:33:0x0091), top: B:18:0x0071, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:20:0x0073, B:28:0x0082, B:30:0x0086, B:31:0x0090, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x011f, B:67:0x0121, B:68:0x0122, B:69:0x012b, B:74:0x00df, B:75:0x012c, B:76:0x0131, B:60:0x0104, B:33:0x0091), top: B:18:0x0071, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, a7.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [z6.j] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5907h() {
        C3008k c3008k;
        Object obj;
        String str;
        String str2;
        ?? r7;
        ?? r62;
        synchronized (this) {
            try {
                if (this.f18209t) {
                    return false;
                }
                C3891j c3891j = this.f18199j;
                Object poll = this.f18203n.poll();
                String str3 = null;
                try {
                    if (poll == null) {
                        obj = this.f18204o.poll();
                        if (obj instanceof C3884c) {
                            int i7 = this.f18207r;
                            str = this.f18208s;
                            if (i7 != -1) {
                                c3008k = this.f18202m;
                                this.f18202m = null;
                                C3890i c3890i = this.f18198i;
                                this.f18198i = null;
                                r7 = this.f18199j;
                                this.f18199j = null;
                                this.f18200k.m4560e();
                                r62 = c3890i;
                                if (poll != null) {
                                    AbstractC3367j.m5097b(c3891j);
                                    c3891j.m5910b(10, (C0130m) poll);
                                } else if (obj instanceof C3885d) {
                                    AbstractC3367j.m5097b(c3891j);
                                    c3891j.m5911c(((C3885d) obj).f18186a);
                                    synchronized (this) {
                                        this.f18205p -= r4.f18186a.f529e.length;
                                    }
                                } else if (obj instanceof C3884c) {
                                    C3884c c3884c = (C3884c) obj;
                                    AbstractC3367j.m5097b(c3891j);
                                    int i8 = c3884c.f18184a;
                                    C0130m c0130m = c3884c.f18185b;
                                    C0130m c0130m2 = C0130m.f528h;
                                    if (i8 >= 1000 && i8 < 5000) {
                                        if (1004 <= i8) {
                                            if (i8 < 1007) {
                                                str3 = "Code " + i8 + " is reserved and may not be used.";
                                                if (str3 == null) {
                                                    ?? obj2 = new Object();
                                                    obj2.m240B(i8);
                                                    if (c0130m != null) {
                                                        obj2.m268u(c0130m);
                                                    }
                                                    try {
                                                        c3891j.m5910b(8, obj2.mo257i(obj2.f524f));
                                                        if (c3008k != null) {
                                                            AbstractC3367j.m5097b(str);
                                                        }
                                                    } finally {
                                                        c3891j.f18239l = true;
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException(str3.toString());
                                                }
                                            }
                                        }
                                        if (1015 <= i8) {
                                        }
                                        if (str3 == null) {
                                        }
                                    }
                                    str3 = "Code must be in range [1000,5000): " + i8;
                                    if (str3 == null) {
                                    }
                                } else {
                                    throw new AssertionError();
                                }
                                return true;
                            }
                            this.f18200k.m4558c(new C3886e(this.f18201l + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                            c3008k = null;
                            str2 = null;
                            r7 = str2;
                            r62 = str2;
                            if (poll != null) {
                            }
                            return true;
                        }
                        if (obj == null) {
                            return false;
                        }
                        c3008k = null;
                        str = null;
                    } else {
                        c3008k = null;
                        obj = null;
                        str = null;
                    }
                    if (poll != null) {
                    }
                    return true;
                } finally {
                    if (c3008k != null) {
                        AbstractC2721b.m4358d(c3008k);
                    }
                    if (r62 != 0) {
                        AbstractC2721b.m4358d(r62);
                    }
                    if (r7 != null) {
                        AbstractC2721b.m4358d(r7);
                    }
                }
                str2 = str;
                r7 = str2;
                r62 = str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
