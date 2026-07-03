package p006a7;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p001a0.AbstractC0094y0;
import p016b7.AbstractC0314a;
import p016b7.AbstractC0315b;
import p024c6.AbstractC0434a;
import p060h5.AbstractC1804l;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.i */
/* loaded from: classes.dex */
public final class C0126i implements InterfaceC0128k, InterfaceC0127j, Cloneable, ByteChannel {

    /* renamed from: e */
    public C0139v f523e;

    /* renamed from: f */
    public long f524f;

    /* renamed from: A */
    public final void m239A(int i7) {
        C0139v m266s = m266s(4);
        byte[] bArr = m266s.f555a;
        int i8 = m266s.f557c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        m266s.f557c = i8 + 4;
        this.f524f += 4;
    }

    /* renamed from: B */
    public final void m240B(int i7) {
        C0139v m266s = m266s(2);
        byte[] bArr = m266s.f555a;
        int i8 = m266s.f557c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        m266s.f557c = i8 + 2;
        this.f524f += 2;
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        AbstractC3367j.m5100e(c0126i, "sink");
        if (j6 >= 0) {
            long j7 = this.f524f;
            if (j7 == 0) {
                return -1L;
            }
            if (j6 > j7) {
                j6 = j7;
            }
            c0126i.mo232j(j6, this);
            return j6;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: D */
    public final void mo241D(long j6) {
        if (this.f524f >= j6) {
        } else {
            throw new EOFException();
        }
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ InterfaceC0127j mo242E(String str) {
        m248K(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, a7.i] */
    @Override // p006a7.InterfaceC0128k
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo243F() {
        int i7;
        if (this.f524f != 0) {
            int i8 = 0;
            boolean z7 = false;
            long j6 = 0;
            do {
                C0139v c0139v = this.f523e;
                AbstractC3367j.m5097b(c0139v);
                byte[] bArr = c0139v.f555a;
                int i9 = c0139v.f556b;
                int i10 = c0139v.f557c;
                while (i9 < i10) {
                    byte b8 = bArr[i9];
                    if (b8 >= 48 && b8 <= 57) {
                        i7 = b8 - 48;
                    } else if (b8 >= 97 && b8 <= 102) {
                        i7 = b8 - 87;
                    } else if (b8 >= 65 && b8 <= 70) {
                        i7 = b8 - 55;
                    } else {
                        z7 = true;
                        if (i8 == 0) {
                            char[] cArr = AbstractC0315b.f1111a;
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b8 >> 4) & 15], cArr[b8 & 15]})));
                        }
                        if (i9 != i10) {
                            this.f523e = c0139v.m304a();
                            AbstractC0140w.m308a(c0139v);
                        } else {
                            c0139v.f556b = i9;
                        }
                        if (!z7) {
                            break;
                        }
                    }
                    if (((-1152921504606846976L) & j6) == 0) {
                        j6 = (j6 << 4) | i7;
                        i9++;
                        i8++;
                    } else {
                        ?? obj = new Object();
                        obj.m273z(j6);
                        obj.m272y(b8);
                        throw new NumberFormatException("Number too large: ".concat(obj.m262o()));
                    }
                }
                if (i9 != i10) {
                }
                if (!z7) {
                }
            } while (this.f523e != null);
            this.f524f -= i8;
            return j6;
        }
        throw new EOFException();
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: G */
    public final String mo244G(Charset charset) {
        return m261n(this.f524f, charset);
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: H */
    public final InputStream mo245H() {
        return new C0125h(this, 0);
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: I */
    public final void mo246I(long j6, C0126i c0126i) {
        long j7 = this.f524f;
        if (j7 >= j6) {
            c0126i.mo232j(j6, this);
        } else {
            c0126i.mo232j(j7, this);
            throw new EOFException();
        }
    }

    /* renamed from: J */
    public final void m247J(int i7, int i8, String str) {
        char charAt;
        char c7;
        AbstractC3367j.m5100e(str, "string");
        if (i7 >= 0) {
            if (i8 >= i7) {
                if (i8 <= str.length()) {
                    while (i7 < i8) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 < 128) {
                            C0139v m266s = m266s(1);
                            byte[] bArr = m266s.f555a;
                            int i9 = m266s.f557c - i7;
                            int min = Math.min(i8, 8192 - i9);
                            int i10 = i7 + 1;
                            bArr[i7 + i9] = (byte) charAt2;
                            while (true) {
                                i7 = i10;
                                if (i7 >= min || (charAt = str.charAt(i7)) >= 128) {
                                    break;
                                }
                                i10 = i7 + 1;
                                bArr[i7 + i9] = (byte) charAt;
                            }
                            int i11 = m266s.f557c;
                            int i12 = (i9 + i7) - i11;
                            m266s.f557c = i11 + i12;
                            this.f524f += i12;
                        } else {
                            if (charAt2 < 2048) {
                                C0139v m266s2 = m266s(2);
                                byte[] bArr2 = m266s2.f555a;
                                int i13 = m266s2.f557c;
                                bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                                m266s2.f557c = i13 + 2;
                                this.f524f += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i14 = i7 + 1;
                                if (i14 < i8) {
                                    c7 = str.charAt(i14);
                                } else {
                                    c7 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c7 && c7 < 57344) {
                                    int i15 = (((charAt2 & 1023) << 10) | (c7 & 1023)) + 65536;
                                    C0139v m266s3 = m266s(4);
                                    byte[] bArr3 = m266s3.f555a;
                                    int i16 = m266s3.f557c;
                                    bArr3[i16] = (byte) ((i15 >> 18) | 240);
                                    bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                                    bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                                    bArr3[i16 + 3] = (byte) ((i15 & 63) | 128);
                                    m266s3.f557c = i16 + 4;
                                    this.f524f += 4;
                                    i7 += 2;
                                } else {
                                    m272y(63);
                                    i7 = i14;
                                }
                            } else {
                                C0139v m266s4 = m266s(3);
                                byte[] bArr4 = m266s4.f555a;
                                int i17 = m266s4.f557c;
                                bArr4[i17] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                                m266s4.f557c = i17 + 3;
                                this.f524f += 3;
                            }
                            i7++;
                        }
                    }
                    return;
                }
                StringBuilder m188o = AbstractC0094y0.m188o(i8, "endIndex > string.length: ", " > ");
                m188o.append(str.length());
                throw new IllegalArgumentException(m188o.toString().toString());
            }
            throw new IllegalArgumentException(AbstractC0094y0.m182i(i8, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("beginIndex < 0: ", i7).toString());
    }

    /* renamed from: K */
    public final void m248K(String str) {
        AbstractC3367j.m5100e(str, "string");
        m247J(0, str.length(), str);
    }

    /* renamed from: L */
    public final void m249L(int i7) {
        String str;
        if (i7 < 128) {
            m272y(i7);
            return;
        }
        if (i7 < 2048) {
            C0139v m266s = m266s(2);
            byte[] bArr = m266s.f555a;
            int i8 = m266s.f557c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            m266s.f557c = i8 + 2;
            this.f524f += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            m272y(63);
            return;
        }
        if (i7 < 65536) {
            C0139v m266s2 = m266s(3);
            byte[] bArr2 = m266s2.f555a;
            int i9 = m266s2.f557c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            m266s2.f557c = i9 + 3;
            this.f524f += 3;
            return;
        }
        if (i7 <= 1114111) {
            C0139v m266s3 = m266s(4);
            byte[] bArr3 = m266s3.f555a;
            int i10 = m266s3.f557c;
            bArr3[i10] = (byte) ((i7 >> 18) | 240);
            bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
            m266s3.f557c = i10 + 4;
            this.f524f += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i7 != 0) {
            char[] cArr = AbstractC0315b.f1111a;
            char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
            int i11 = 0;
            while (i11 < 8 && cArr2[i11] == '0') {
                i11++;
            }
            if (i11 >= 0) {
                if (i11 <= 8) {
                    str = new String(cArr2, i11, 8 - i11);
                } else {
                    throw new IllegalArgumentException(AbstractC0094y0.m184k(i11, "startIndex: ", " > endIndex: 8"));
                }
            } else {
                throw new IndexOutOfBoundsException(AbstractC0094y0.m184k(i11, "startIndex: ", ", endIndex: 8, size: 8"));
            }
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        return C0120c0.f496d;
    }

    /* renamed from: b */
    public final void m250b(C0126i c0126i, long j6, long j7) {
        AbstractC3367j.m5100e(c0126i, "out");
        long j8 = j6;
        AbstractC0117b.m219d(this.f524f, j8, j7);
        if (j7 != 0) {
            c0126i.f524f += j7;
            C0139v c0139v = this.f523e;
            while (true) {
                AbstractC3367j.m5097b(c0139v);
                long j9 = c0139v.f557c - c0139v.f556b;
                if (j8 < j9) {
                    break;
                }
                j8 -= j9;
                c0139v = c0139v.f560f;
            }
            C0139v c0139v2 = c0139v;
            long j10 = j7;
            while (j10 > 0) {
                AbstractC3367j.m5097b(c0139v2);
                C0139v m306c = c0139v2.m306c();
                int i7 = m306c.f556b + ((int) j8);
                m306c.f556b = i7;
                m306c.f557c = Math.min(i7 + ((int) j10), m306c.f557c);
                C0139v c0139v3 = c0126i.f523e;
                if (c0139v3 == null) {
                    m306c.f561g = m306c;
                    m306c.f560f = m306c;
                    c0126i.f523e = m306c;
                } else {
                    C0139v c0139v4 = c0139v3.f561g;
                    AbstractC3367j.m5097b(c0139v4);
                    c0139v4.m305b(m306c);
                }
                j10 -= m306c.f557c - m306c.f556b;
                c0139v2 = c0139v2.f560f;
                j8 = 0;
            }
        }
    }

    /* renamed from: c */
    public final boolean m251c() {
        if (this.f524f == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a7.i] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f524f == 0) {
            return obj;
        }
        C0139v c0139v = this.f523e;
        AbstractC3367j.m5097b(c0139v);
        C0139v m306c = c0139v.m306c();
        obj.f523e = m306c;
        m306c.f561g = m306c;
        m306c.f560f = m306c;
        for (C0139v c0139v2 = c0139v.f560f; c0139v2 != c0139v; c0139v2 = c0139v2.f560f) {
            C0139v c0139v3 = m306c.f561g;
            AbstractC3367j.m5097b(c0139v3);
            AbstractC3367j.m5097b(c0139v2);
            c0139v3.m305b(c0139v2.m306c());
        }
        obj.f524f = this.f524f;
        return obj;
    }

    /* renamed from: d */
    public final byte m252d(long j6) {
        AbstractC0117b.m219d(this.f524f, j6, 1L);
        C0139v c0139v = this.f523e;
        if (c0139v != null) {
            long j7 = this.f524f;
            if (j7 - j6 < j6) {
                while (j7 > j6) {
                    c0139v = c0139v.f561g;
                    AbstractC3367j.m5097b(c0139v);
                    j7 -= c0139v.f557c - c0139v.f556b;
                }
                return c0139v.f555a[(int) ((c0139v.f556b + j6) - j7)];
            }
            long j8 = 0;
            while (true) {
                int i7 = c0139v.f557c;
                int i8 = c0139v.f556b;
                long j9 = (i7 - i8) + j8;
                if (j9 <= j6) {
                    c0139v = c0139v.f560f;
                    AbstractC3367j.m5097b(c0139v);
                    j8 = j9;
                } else {
                    return c0139v.f555a[(int) ((i8 + j6) - j8)];
                }
            }
        } else {
            AbstractC3367j.m5097b(null);
            throw null;
        }
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC0127j mo253e(C0130m c0130m) {
        m268u(c0130m);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0126i)) {
            return false;
        }
        long j6 = this.f524f;
        C0126i c0126i = (C0126i) obj;
        if (j6 != c0126i.f524f) {
            return false;
        }
        if (j6 == 0) {
            return true;
        }
        C0139v c0139v = this.f523e;
        AbstractC3367j.m5097b(c0139v);
        C0139v c0139v2 = c0126i.f523e;
        AbstractC3367j.m5097b(c0139v2);
        int i7 = c0139v.f556b;
        int i8 = c0139v2.f556b;
        long j7 = 0;
        while (j7 < this.f524f) {
            long min = Math.min(c0139v.f557c - i7, c0139v2.f557c - i8);
            long j8 = 0;
            while (j8 < min) {
                int i9 = i7 + 1;
                int i10 = i8 + 1;
                if (c0139v.f555a[i7] != c0139v2.f555a[i8]) {
                    return false;
                }
                j8++;
                i7 = i9;
                i8 = i10;
            }
            if (i7 == c0139v.f557c) {
                c0139v = c0139v.f560f;
                AbstractC3367j.m5097b(c0139v);
                i7 = c0139v.f556b;
            }
            if (i8 == c0139v2.f557c) {
                c0139v2 = c0139v2.f560f;
                AbstractC3367j.m5097b(c0139v2);
                i8 = c0139v2.f556b;
            }
            j7 += min;
        }
        return true;
    }

    /* renamed from: f */
    public final long m254f(byte b8, long j6, long j7) {
        C0139v c0139v;
        long j8 = 0;
        if (0 <= j6 && j6 <= j7) {
            long j9 = this.f524f;
            if (j7 > j9) {
                j7 = j9;
            }
            if (j6 != j7 && (c0139v = this.f523e) != null) {
                if (j9 - j6 < j6) {
                    while (j9 > j6) {
                        c0139v = c0139v.f561g;
                        AbstractC3367j.m5097b(c0139v);
                        j9 -= c0139v.f557c - c0139v.f556b;
                    }
                    while (j9 < j7) {
                        byte[] bArr = c0139v.f555a;
                        int min = (int) Math.min(c0139v.f557c, (c0139v.f556b + j7) - j9);
                        for (int i7 = (int) ((c0139v.f556b + j6) - j9); i7 < min; i7++) {
                            if (bArr[i7] == b8) {
                                return (i7 - c0139v.f556b) + j9;
                            }
                        }
                        j9 += c0139v.f557c - c0139v.f556b;
                        c0139v = c0139v.f560f;
                        AbstractC3367j.m5097b(c0139v);
                        j6 = j9;
                    }
                    return -1L;
                }
                while (true) {
                    long j10 = (c0139v.f557c - c0139v.f556b) + j8;
                    if (j10 > j6) {
                        break;
                    }
                    c0139v = c0139v.f560f;
                    AbstractC3367j.m5097b(c0139v);
                    j8 = j10;
                }
                while (j8 < j7) {
                    byte[] bArr2 = c0139v.f555a;
                    int min2 = (int) Math.min(c0139v.f557c, (c0139v.f556b + j7) - j8);
                    for (int i8 = (int) ((c0139v.f556b + j6) - j8); i8 < min2; i8++) {
                        if (bArr2[i8] == b8) {
                            return (i8 - c0139v.f556b) + j8;
                        }
                    }
                    j8 += c0139v.f557c - c0139v.f556b;
                    c0139v = c0139v.f560f;
                    AbstractC3367j.m5097b(c0139v);
                    j6 = j8;
                }
                return -1L;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.f524f);
        AbstractC2487d.m4056t(sb, " fromIndex=", j6, " toIndex=");
        sb.append(j7);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC0127j mo255g(long j6) {
        m273z(j6);
        return this;
    }

    /* renamed from: h */
    public final C0124g m256h(C0124g c0124g) {
        AbstractC3367j.m5100e(c0124g, "unsafeCursor");
        byte[] bArr = AbstractC0314a.f1110a;
        if (c0124g == AbstractC0117b.f495a) {
            c0124g = new C0124g();
        }
        if (c0124g.f514e == null) {
            c0124g.f514e = this;
            c0124g.f515f = true;
            return c0124g;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public final int hashCode() {
        C0139v c0139v = this.f523e;
        if (c0139v == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = c0139v.f557c;
            for (int i9 = c0139v.f556b; i9 < i8; i9++) {
                i7 = (i7 * 31) + c0139v.f555a[i9];
            }
            c0139v = c0139v.f560f;
            AbstractC3367j.m5097b(c0139v);
        } while (c0139v != this.f523e);
        return i7;
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: i */
    public final C0130m mo257i(long j6) {
        if (j6 >= 0 && j6 <= 2147483647L) {
            if (this.f524f >= j6) {
                if (j6 >= 4096) {
                    C0130m m264q = m264q((int) j6);
                    skip(j6);
                    return m264q;
                }
                return new C0130m(m260m(j6));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j6).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        C0139v c0139v;
        C0139v m309b;
        int i7;
        AbstractC3367j.m5100e(c0126i, "source");
        if (c0126i != this) {
            AbstractC0117b.m219d(c0126i.f524f, 0L, j6);
            while (j6 > 0) {
                C0139v c0139v2 = c0126i.f523e;
                AbstractC3367j.m5097b(c0139v2);
                int i8 = c0139v2.f557c;
                C0139v c0139v3 = c0126i.f523e;
                AbstractC3367j.m5097b(c0139v3);
                long j7 = i8 - c0139v3.f556b;
                int i9 = 0;
                if (j6 < j7) {
                    C0139v c0139v4 = this.f523e;
                    if (c0139v4 != null) {
                        c0139v = c0139v4.f561g;
                    } else {
                        c0139v = null;
                    }
                    if (c0139v != null && c0139v.f559e) {
                        long j8 = c0139v.f557c + j6;
                        if (c0139v.f558d) {
                            i7 = 0;
                        } else {
                            i7 = c0139v.f556b;
                        }
                        if (j8 - i7 <= 8192) {
                            C0139v c0139v5 = c0126i.f523e;
                            AbstractC3367j.m5097b(c0139v5);
                            c0139v5.m307d(c0139v, (int) j6);
                            c0126i.f524f -= j6;
                            this.f524f += j6;
                            return;
                        }
                    }
                    C0139v c0139v6 = c0126i.f523e;
                    AbstractC3367j.m5097b(c0139v6);
                    int i10 = (int) j6;
                    if (i10 > 0 && i10 <= c0139v6.f557c - c0139v6.f556b) {
                        if (i10 >= 1024) {
                            m309b = c0139v6.m306c();
                        } else {
                            m309b = AbstractC0140w.m309b();
                            byte[] bArr = c0139v6.f555a;
                            byte[] bArr2 = m309b.f555a;
                            int i11 = c0139v6.f556b;
                            AbstractC1804l.m3018K(bArr, bArr2, 0, i11, i11 + i10, 2);
                        }
                        m309b.f557c = m309b.f556b + i10;
                        c0139v6.f556b += i10;
                        C0139v c0139v7 = c0139v6.f561g;
                        AbstractC3367j.m5097b(c0139v7);
                        c0139v7.m305b(m309b);
                        c0126i.f523e = m309b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C0139v c0139v8 = c0126i.f523e;
                AbstractC3367j.m5097b(c0139v8);
                long j9 = c0139v8.f557c - c0139v8.f556b;
                c0126i.f523e = c0139v8.m304a();
                C0139v c0139v9 = this.f523e;
                if (c0139v9 == null) {
                    this.f523e = c0139v8;
                    c0139v8.f561g = c0139v8;
                    c0139v8.f560f = c0139v8;
                } else {
                    C0139v c0139v10 = c0139v9.f561g;
                    AbstractC3367j.m5097b(c0139v10);
                    c0139v10.m305b(c0139v8);
                    C0139v c0139v11 = c0139v8.f561g;
                    if (c0139v11 != c0139v8) {
                        AbstractC3367j.m5097b(c0139v11);
                        if (c0139v11.f559e) {
                            int i12 = c0139v8.f557c - c0139v8.f556b;
                            C0139v c0139v12 = c0139v8.f561g;
                            AbstractC3367j.m5097b(c0139v12);
                            int i13 = 8192 - c0139v12.f557c;
                            C0139v c0139v13 = c0139v8.f561g;
                            AbstractC3367j.m5097b(c0139v13);
                            if (!c0139v13.f558d) {
                                C0139v c0139v14 = c0139v8.f561g;
                                AbstractC3367j.m5097b(c0139v14);
                                i9 = c0139v14.f556b;
                            }
                            if (i12 <= i13 + i9) {
                                C0139v c0139v15 = c0139v8.f561g;
                                AbstractC3367j.m5097b(c0139v15);
                                c0139v8.m307d(c0139v15, i12);
                                c0139v8.m304a();
                                AbstractC0140w.m308a(c0139v8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                c0126i.f524f -= j9;
                this.f524f += j9;
                j6 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: l */
    public final boolean mo259l(long j6) {
        if (this.f524f >= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final byte[] m260m(long j6) {
        if (j6 >= 0 && j6 <= 2147483647L) {
            if (this.f524f >= j6) {
                byte[] bArr = new byte[(int) j6];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j6).toString());
    }

    /* renamed from: n */
    public final String m261n(long j6, Charset charset) {
        AbstractC3367j.m5100e(charset, "charset");
        if (j6 >= 0 && j6 <= 2147483647L) {
            if (this.f524f >= j6) {
                if (j6 == 0) {
                    return "";
                }
                C0139v c0139v = this.f523e;
                AbstractC3367j.m5097b(c0139v);
                int i7 = c0139v.f556b;
                if (i7 + j6 > c0139v.f557c) {
                    return new String(m260m(j6), charset);
                }
                int i8 = (int) j6;
                String str = new String(c0139v.f555a, i7, i8, charset);
                int i9 = c0139v.f556b + i8;
                c0139v.f556b = i9;
                this.f524f -= j6;
                if (i9 == c0139v.f557c) {
                    this.f523e = c0139v.m304a();
                    AbstractC0140w.m308a(c0139v);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j6).toString());
    }

    /* renamed from: o */
    public final String m262o() {
        return m261n(this.f524f, AbstractC0434a.f1477a);
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: p */
    public final String mo263p() {
        return mo271x(Long.MAX_VALUE);
    }

    /* renamed from: q */
    public final C0130m m264q(int i7) {
        if (i7 == 0) {
            return C0130m.f528h;
        }
        AbstractC0117b.m219d(this.f524f, 0L, i7);
        C0139v c0139v = this.f523e;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            AbstractC3367j.m5097b(c0139v);
            int i11 = c0139v.f557c;
            int i12 = c0139v.f556b;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                c0139v = c0139v.f560f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10];
        int[] iArr = new int[i10 * 2];
        C0139v c0139v2 = this.f523e;
        int i13 = 0;
        while (i8 < i7) {
            AbstractC3367j.m5097b(c0139v2);
            bArr[i13] = c0139v2.f555a;
            i8 += c0139v2.f557c - c0139v2.f556b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = c0139v2.f556b;
            c0139v2.f558d = true;
            i13++;
            c0139v2 = c0139v2.f560f;
        }
        return new C0141x(bArr, iArr);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC3367j.m5100e(byteBuffer, "sink");
        C0139v c0139v = this.f523e;
        if (c0139v == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0139v.f557c - c0139v.f556b);
        byteBuffer.put(c0139v.f555a, c0139v.f556b, min);
        int i7 = c0139v.f556b + min;
        c0139v.f556b = i7;
        this.f524f -= min;
        if (i7 == c0139v.f557c) {
            this.f523e = c0139v.m304a();
            AbstractC0140w.m308a(c0139v);
        }
        return min;
    }

    @Override // p006a7.InterfaceC0128k
    public final byte readByte() {
        if (this.f524f != 0) {
            C0139v c0139v = this.f523e;
            AbstractC3367j.m5097b(c0139v);
            int i7 = c0139v.f556b;
            int i8 = c0139v.f557c;
            int i9 = i7 + 1;
            byte b8 = c0139v.f555a[i7];
            this.f524f--;
            if (i9 == i8) {
                this.f523e = c0139v.m304a();
                AbstractC0140w.m308a(c0139v);
                return b8;
            }
            c0139v.f556b = i9;
            return b8;
        }
        throw new EOFException();
    }

    @Override // p006a7.InterfaceC0128k
    public final void readFully(byte[] bArr) {
        AbstractC3367j.m5100e(bArr, "sink");
        int i7 = 0;
        while (i7 < bArr.length) {
            int read = read(bArr, i7, bArr.length - i7);
            if (read != -1) {
                i7 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // p006a7.InterfaceC0128k
    public final int readInt() {
        if (this.f524f >= 4) {
            C0139v c0139v = this.f523e;
            AbstractC3367j.m5097b(c0139v);
            int i7 = c0139v.f556b;
            int i8 = c0139v.f557c;
            if (i8 - i7 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c0139v.f555a;
            int i9 = i7 + 3;
            int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
            int i11 = i7 + 4;
            int i12 = (bArr[i9] & 255) | i10;
            this.f524f -= 4;
            if (i11 == i8) {
                this.f523e = c0139v.m304a();
                AbstractC0140w.m308a(c0139v);
                return i12;
            }
            c0139v.f556b = i11;
            return i12;
        }
        throw new EOFException();
    }

    @Override // p006a7.InterfaceC0128k
    public final long readLong() {
        if (this.f524f >= 8) {
            C0139v c0139v = this.f523e;
            AbstractC3367j.m5097b(c0139v);
            int i7 = c0139v.f556b;
            int i8 = c0139v.f557c;
            if (i8 - i7 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c0139v.f555a;
            int i9 = i7 + 7;
            long j6 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
            int i10 = i7 + 8;
            long j7 = j6 | (bArr[i9] & 255);
            this.f524f -= 8;
            if (i10 == i8) {
                this.f523e = c0139v.m304a();
                AbstractC0140w.m308a(c0139v);
                return j7;
            }
            c0139v.f556b = i10;
            return j7;
        }
        throw new EOFException();
    }

    @Override // p006a7.InterfaceC0128k
    public final short readShort() {
        if (this.f524f >= 2) {
            C0139v c0139v = this.f523e;
            AbstractC3367j.m5097b(c0139v);
            int i7 = c0139v.f556b;
            int i8 = c0139v.f557c;
            if (i8 - i7 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c0139v.f555a;
            int i9 = i7 + 1;
            int i10 = (bArr[i7] & 255) << 8;
            int i11 = i7 + 2;
            int i12 = (bArr[i9] & 255) | i10;
            this.f524f -= 2;
            if (i11 == i8) {
                this.f523e = c0139v.m304a();
                AbstractC0140w.m308a(c0139v);
            } else {
                c0139v.f556b = i11;
            }
            return (short) i12;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public final C0139v m266s(int i7) {
        if (i7 >= 1 && i7 <= 8192) {
            C0139v c0139v = this.f523e;
            if (c0139v == null) {
                C0139v m309b = AbstractC0140w.m309b();
                this.f523e = m309b;
                m309b.f561g = m309b;
                m309b.f560f = m309b;
                return m309b;
            }
            C0139v c0139v2 = c0139v.f561g;
            AbstractC3367j.m5097b(c0139v2);
            if (c0139v2.f557c + i7 <= 8192 && c0139v2.f559e) {
                return c0139v2;
            }
            C0139v m309b2 = AbstractC0140w.m309b();
            c0139v2.m305b(m309b2);
            return m309b2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // p006a7.InterfaceC0128k
    public final void skip(long j6) {
        while (j6 > 0) {
            C0139v c0139v = this.f523e;
            if (c0139v != null) {
                int min = (int) Math.min(j6, c0139v.f557c - c0139v.f556b);
                long j7 = min;
                this.f524f -= j7;
                j6 -= j7;
                int i7 = c0139v.f556b + min;
                c0139v.f556b = i7;
                if (i7 == c0139v.f557c) {
                    this.f523e = c0139v.m304a();
                    AbstractC0140w.m308a(c0139v);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final void m267t(int i7, byte[] bArr) {
        AbstractC3367j.m5100e(bArr, "source");
        int i8 = 0;
        long j6 = i7;
        AbstractC0117b.m219d(bArr.length, 0, j6);
        while (i8 < i7) {
            C0139v m266s = m266s(1);
            int min = Math.min(i7 - i8, 8192 - m266s.f557c);
            int i9 = i8 + min;
            AbstractC1804l.m3013F(m266s.f557c, i8, i9, bArr, m266s.f555a);
            m266s.f557c += min;
            i8 = i9;
        }
        this.f524f += j6;
    }

    public final String toString() {
        long j6 = this.f524f;
        if (j6 <= 2147483647L) {
            return m264q((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f524f).toString());
    }

    /* renamed from: u */
    public final void m268u(C0130m c0130m) {
        AbstractC3367j.m5100e(c0130m, "byteString");
        c0130m.mo294k(this, c0130m.mo286c());
    }

    @Override // p006a7.InterfaceC0128k
    /* renamed from: v */
    public final int mo269v(C0136s c0136s) {
        AbstractC3367j.m5100e(c0136s, "options");
        int m670b = AbstractC0314a.m670b(this, c0136s, false);
        if (m670b == -1) {
            return -1;
        }
        skip(c0136s.f547e[m670b].mo286c());
        return m670b;
    }

    /* renamed from: w */
    public final void m270w(InterfaceC0116a0 interfaceC0116a0) {
        AbstractC3367j.m5100e(interfaceC0116a0, "source");
        do {
        } while (interfaceC0116a0.mo214C(8192L, this) != -1);
    }

    @Override // p006a7.InterfaceC0127j
    public final /* bridge */ /* synthetic */ InterfaceC0127j write(byte[] bArr) {
        m5912write(bArr);
        return this;
    }

    @Override // p006a7.InterfaceC0127j
    public final /* bridge */ /* synthetic */ InterfaceC0127j writeByte(int i7) {
        m272y(i7);
        return this;
    }

    @Override // p006a7.InterfaceC0127j
    public final /* bridge */ /* synthetic */ InterfaceC0127j writeInt(int i7) {
        m239A(i7);
        return this;
    }

    @Override // p006a7.InterfaceC0127j
    public final /* bridge */ /* synthetic */ InterfaceC0127j writeShort(int i7) {
        m240B(i7);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, a7.i] */
    @Override // p006a7.InterfaceC0128k
    /* renamed from: x */
    public final String mo271x(long j6) {
        if (j6 >= 0) {
            long j7 = Long.MAX_VALUE;
            if (j6 != Long.MAX_VALUE) {
                j7 = j6 + 1;
            }
            long j8 = j7;
            long m254f = m254f((byte) 10, 0L, j8);
            if (m254f != -1) {
                return AbstractC0314a.m669a(m254f, this);
            }
            if (j8 < this.f524f && m252d(j8 - 1) == 13 && m252d(j8) == 10) {
                return AbstractC0314a.m669a(j8, this);
            }
            ?? obj = new Object();
            m250b(obj, 0L, Math.min(32, this.f524f));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f524f, j6) + " content=" + obj.mo257i(obj.f524f).mo287d() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j6).toString());
    }

    /* renamed from: y */
    public final void m272y(int i7) {
        C0139v m266s = m266s(1);
        byte[] bArr = m266s.f555a;
        int i8 = m266s.f557c;
        m266s.f557c = i8 + 1;
        bArr[i8] = (byte) i7;
        this.f524f++;
    }

    /* renamed from: z */
    public final void m273z(long j6) {
        if (j6 == 0) {
            m272y(48);
            return;
        }
        long j7 = (j6 >>> 1) | j6;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i7 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        C0139v m266s = m266s(i7);
        byte[] bArr = m266s.f555a;
        int i8 = m266s.f557c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = AbstractC0314a.f1110a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        m266s.f557c += i7;
        this.f524f += i7;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC3367j.m5100e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            C0139v m266s = m266s(1);
            int min = Math.min(i7, 8192 - m266s.f557c);
            byteBuffer.get(m266s.f555a, m266s.f557c, min);
            i7 -= min;
            m266s.f557c += min;
        }
        this.f524f += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m5912write(byte[] bArr) {
        AbstractC3367j.m5100e(bArr, "source");
        m267t(bArr.length, bArr);
    }

    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC3367j.m5100e(bArr, "sink");
        AbstractC0117b.m219d(bArr.length, i7, i8);
        C0139v c0139v = this.f523e;
        if (c0139v == null) {
            return -1;
        }
        int min = Math.min(i8, c0139v.f557c - c0139v.f556b);
        byte[] bArr2 = c0139v.f555a;
        int i9 = c0139v.f556b;
        AbstractC1804l.m3013F(i7, i9, i9 + min, bArr2, bArr);
        int i10 = c0139v.f556b + min;
        c0139v.f556b = i10;
        this.f524f -= min;
        if (i10 == c0139v.f557c) {
            this.f523e = c0139v.m304a();
            AbstractC0140w.m308a(c0139v);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p006a7.InterfaceC0142y
    public final void close() {
    }

    @Override // p006a7.InterfaceC0127j, p006a7.InterfaceC0142y, java.io.Flushable
    public final void flush() {
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: k */
    public final InterfaceC0127j mo258k() {
        return this;
    }

    @Override // p006a7.InterfaceC0127j
    /* renamed from: r */
    public final C0126i mo265r() {
        return this;
    }
}
