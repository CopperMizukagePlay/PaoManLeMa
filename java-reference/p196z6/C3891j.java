package p196z6;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import p006a7.AbstractC0117b;
import p006a7.C0124g;
import p006a7.C0126i;
import p006a7.C0130m;
import p006a7.C0131n;
import p006a7.C0139v;
import p006a7.InterfaceC0127j;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.j */
/* loaded from: classes.dex */
public final class C3891j implements Closeable {

    /* renamed from: e */
    public final InterfaceC0127j f18232e;

    /* renamed from: f */
    public final Random f18233f;

    /* renamed from: g */
    public final boolean f18234g;

    /* renamed from: h */
    public final boolean f18235h;

    /* renamed from: i */
    public final long f18236i;

    /* renamed from: j */
    public final C0126i f18237j;

    /* renamed from: k */
    public final C0126i f18238k;

    /* renamed from: l */
    public boolean f18239l;

    /* renamed from: m */
    public C3882a f18240m;

    /* renamed from: n */
    public final byte[] f18241n;

    /* renamed from: o */
    public final C0124g f18242o;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, a7.i] */
    public C3891j(InterfaceC0127j interfaceC0127j, Random random, boolean z7, boolean z8, long j6) {
        AbstractC3367j.m5100e(interfaceC0127j, "sink");
        this.f18232e = interfaceC0127j;
        this.f18233f = random;
        this.f18234g = z7;
        this.f18235h = z8;
        this.f18236i = j6;
        this.f18237j = new Object();
        this.f18238k = interfaceC0127j.mo265r();
        this.f18241n = new byte[4];
        this.f18242o = new C0124g();
    }

    /* renamed from: b */
    public final void m5910b(int i7, C0130m c0130m) {
        if (!this.f18239l) {
            int mo286c = c0130m.mo286c();
            if (mo286c <= 125) {
                C0126i c0126i = this.f18238k;
                c0126i.m272y(i7 | 128);
                c0126i.m272y(mo286c | 128);
                byte[] bArr = this.f18241n;
                AbstractC3367j.m5097b(bArr);
                this.f18233f.nextBytes(bArr);
                c0126i.m5912write(bArr);
                if (mo286c > 0) {
                    long j6 = c0126i.f524f;
                    c0126i.m268u(c0130m);
                    C0124g c0124g = this.f18242o;
                    AbstractC3367j.m5097b(c0124g);
                    c0126i.m256h(c0124g);
                    c0124g.m237c(j6);
                    AbstractC2064e.m3228I(c0124g, bArr);
                    c0124g.close();
                }
                this.f18232e.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* renamed from: c */
    public final void m5911c(C0130m c0130m) {
        int i7;
        if (!this.f18239l) {
            C0126i c0126i = this.f18237j;
            c0126i.m268u(c0130m);
            if (this.f18234g && c0130m.f529e.length >= this.f18236i) {
                C3882a c3882a = this.f18240m;
                if (c3882a == null) {
                    c3882a = new C3882a(0, this.f18235h);
                    this.f18240m = c3882a;
                }
                C0131n c0131n = (C0131n) c3882a.f18182i;
                C0126i c0126i2 = c3882a.f18180g;
                if (c0126i2.f524f == 0) {
                    if (c3882a.f18179f) {
                        ((Deflater) c3882a.f18181h).reset();
                    }
                    c0131n.mo232j(c0126i.f524f, c0126i);
                    c0131n.flush();
                    C0130m c0130m2 = AbstractC3883b.f18183a;
                    long j6 = c0126i2.f524f;
                    byte[] bArr = c0130m2.f529e;
                    long length = j6 - bArr.length;
                    int length2 = bArr.length;
                    if (length >= 0 && length2 >= 0 && j6 - length >= length2 && bArr.length >= length2) {
                        for (int i8 = 0; i8 < length2; i8++) {
                            if (c0126i2.m252d(i8 + length) == c0130m2.f529e[i8]) {
                            }
                        }
                        long j7 = c0126i2.f524f - 4;
                        C0124g m256h = c0126i2.m256h(AbstractC0117b.f495a);
                        try {
                            m256h.m236b(j7);
                            m256h.close();
                            c0126i.mo232j(c0126i2.f524f, c0126i2);
                            i7 = 193;
                        } finally {
                        }
                    }
                    c0126i2.m272y(0);
                    c0126i.mo232j(c0126i2.f524f, c0126i2);
                    i7 = 193;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                i7 = 129;
            }
            long j8 = c0126i.f524f;
            C0126i c0126i3 = this.f18238k;
            c0126i3.m272y(i7);
            if (j8 <= 125) {
                c0126i3.m272y(((int) j8) | 128);
            } else if (j8 <= 65535) {
                c0126i3.m272y(254);
                c0126i3.m240B((int) j8);
            } else {
                c0126i3.m272y(255);
                C0139v m266s = c0126i3.m266s(8);
                byte[] bArr2 = m266s.f555a;
                int i9 = m266s.f557c;
                bArr2[i9] = (byte) ((j8 >>> 56) & 255);
                bArr2[i9 + 1] = (byte) ((j8 >>> 48) & 255);
                bArr2[i9 + 2] = (byte) ((j8 >>> 40) & 255);
                bArr2[i9 + 3] = (byte) ((j8 >>> 32) & 255);
                bArr2[i9 + 4] = (byte) ((j8 >>> 24) & 255);
                bArr2[i9 + 5] = (byte) ((j8 >>> 16) & 255);
                bArr2[i9 + 6] = (byte) ((j8 >>> 8) & 255);
                bArr2[i9 + 7] = (byte) (j8 & 255);
                m266s.f557c = i9 + 8;
                c0126i3.f524f += 8;
            }
            byte[] bArr3 = this.f18241n;
            AbstractC3367j.m5097b(bArr3);
            this.f18233f.nextBytes(bArr3);
            c0126i3.m5912write(bArr3);
            if (j8 > 0) {
                C0124g c0124g = this.f18242o;
                AbstractC3367j.m5097b(c0124g);
                c0126i.m256h(c0124g);
                c0124g.m237c(0L);
                AbstractC2064e.m3228I(c0124g, bArr3);
                c0124g.close();
            }
            c0126i3.mo232j(j8, c0126i);
            this.f18232e.mo258k();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3882a c3882a = this.f18240m;
        if (c3882a != null) {
            c3882a.close();
        }
    }
}
