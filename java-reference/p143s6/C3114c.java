package p143s6;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p006a7.C0126i;
import p006a7.InterfaceC0128k;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p099m6.C2593b;
import p099m6.C2617r;
import p099m6.C2619t;
import p099m6.C2623x;
import p106n6.AbstractC2721b;
import p122q.C2962y1;
import p128q6.C3009l;
import p128q6.C3011n;
import p136r6.AbstractC3069f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s6.c */
/* loaded from: classes.dex */
public final class C3114c extends AbstractC3112a {

    /* renamed from: h */
    public final C2619t f15737h;

    /* renamed from: i */
    public long f15738i;

    /* renamed from: j */
    public boolean f15739j;

    /* renamed from: k */
    public final /* synthetic */ C3011n f15740k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3114c(C3011n c3011n, C2619t c2619t) {
        super(c3011n);
        AbstractC3367j.m5100e(c2619t, "url");
        this.f15740k = c3011n;
        this.f15737h = c2619t;
        this.f15738i = -1L;
        this.f15739j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r9.f15739j == false) goto L28;
     */
    @Override // p143s6.AbstractC3112a, p006a7.InterfaceC0116a0
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo214C(long j6, C0126i c0126i) {
        C3011n c3011n = this.f15740k;
        InterfaceC0128k interfaceC0128k = (InterfaceC0128k) c3011n.f15537d;
        AbstractC3367j.m5100e(c0126i, "sink");
        if (!this.f15732f) {
            if (this.f15739j) {
                long j7 = this.f15738i;
                if (j7 == 0 || j7 == -1) {
                    if (j7 != -1) {
                        interfaceC0128k.mo263p();
                    }
                    try {
                        this.f15738i = interfaceC0128k.mo243F();
                        String obj = AbstractC0444k.m956t0(interfaceC0128k.mo263p()).toString();
                        if (this.f15738i >= 0 && (obj.length() <= 0 || AbstractC0451r.m971M(obj, ";", false))) {
                            if (this.f15738i == 0) {
                                this.f15739j = false;
                                c3011n.f15540g = ((C2962y1) c3011n.f15539f).m4602a();
                                C2623x c2623x = (C2623x) c3011n.f15535b;
                                AbstractC3367j.m5097b(c2623x);
                                C2593b c2593b = c2623x.f14209n;
                                C2617r c2617r = (C2617r) c3011n.f15540g;
                                AbstractC3367j.m5097b(c2617r);
                                AbstractC3069f.m4744b(c2593b, this.f15737h, c2617r);
                                m4816b();
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15738i + obj + '\"');
                        }
                    } catch (NumberFormatException e7) {
                        throw new ProtocolException(e7.getMessage());
                    }
                }
                long mo214C = super.mo214C(Math.min(8192L, this.f15738i), c0126i);
                if (mo214C != -1) {
                    this.f15738i -= mo214C;
                    return mo214C;
                }
                ((C3009l) c3011n.f15536c).m4697k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m4816b();
                throw protocolException;
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        if (this.f15732f) {
            return;
        }
        if (this.f15739j) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = AbstractC2721b.f14569a;
            AbstractC3367j.m5100e(timeUnit, "timeUnit");
            try {
                z7 = AbstractC2721b.m4375u(this, 100);
            } catch (IOException unused) {
                z7 = false;
            }
            if (!z7) {
                ((C3009l) this.f15740k.f15536c).m4697k();
                m4816b();
            }
        }
        this.f15732f = true;
    }
}
