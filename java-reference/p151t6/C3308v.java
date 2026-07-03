package p151t6;

import java.net.SocketTimeoutException;
import p006a7.C0123f;
import p092m.AbstractC2487d;
import p121p6.C2883b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.v */
/* loaded from: classes.dex */
public final class C3308v extends C0123f {

    /* renamed from: m */
    public final /* synthetic */ C3309w f16239m;

    public C3308v(C3309w c3309w) {
        this.f16239m = c3309w;
    }

    @Override // p006a7.C0123f
    /* renamed from: k */
    public final void mo235k() {
        this.f16239m.m5026e(9);
        C3301o c3301o = this.f16239m.f16241b;
        synchronized (c3301o) {
            long j6 = c3301o.f16203s;
            long j7 = c3301o.f16202r;
            if (j6 < j7) {
                return;
            }
            c3301o.f16202r = j7 + 1;
            c3301o.f16204t = System.nanoTime() + 1000000000;
            c3301o.f16196l.m4558c(new C2883b(AbstractC2487d.m4046j(new StringBuilder(), c3301o.f16191g, " ping"), c3301o, 2), 0L);
        }
    }

    /* renamed from: l */
    public final void m5021l() {
        if (!m234j()) {
        } else {
            throw new SocketTimeoutException("timeout");
        }
    }
}
