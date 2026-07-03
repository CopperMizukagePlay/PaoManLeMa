package p143s6;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p006a7.C0126i;
import p106n6.AbstractC2721b;
import p128q6.C3009l;
import p128q6.C3011n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s6.d */
/* loaded from: classes.dex */
public final class C3115d extends AbstractC3112a {

    /* renamed from: h */
    public long f15741h;

    /* renamed from: i */
    public final /* synthetic */ C3011n f15742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115d(C3011n c3011n, long j6) {
        super(c3011n);
        this.f15742i = c3011n;
        this.f15741h = j6;
        if (j6 == 0) {
            m4816b();
        }
    }

    @Override // p143s6.AbstractC3112a, p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        AbstractC3367j.m5100e(c0126i, "sink");
        if (!this.f15732f) {
            long j7 = this.f15741h;
            if (j7 == 0) {
                return -1L;
            }
            long mo214C = super.mo214C(Math.min(j7, 8192L), c0126i);
            if (mo214C != -1) {
                long j8 = this.f15741h - mo214C;
                this.f15741h = j8;
                if (j8 == 0) {
                    m4816b();
                }
                return mo214C;
            }
            ((C3009l) this.f15742i.f15536c).m4697k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m4816b();
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        if (this.f15732f) {
            return;
        }
        if (this.f15741h != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = AbstractC2721b.f14569a;
            AbstractC3367j.m5100e(timeUnit, "timeUnit");
            try {
                z7 = AbstractC2721b.m4375u(this, 100);
            } catch (IOException unused) {
                z7 = false;
            }
            if (!z7) {
                ((C3009l) this.f15742i.f15536c).m4697k();
                m4816b();
            }
        }
        this.f15732f = true;
    }
}
