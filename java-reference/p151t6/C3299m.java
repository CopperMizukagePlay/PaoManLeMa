package p151t6;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p006a7.C0130m;
import p121p6.AbstractC2882a;
import p158u5.AbstractC3367j;
import p196z6.C3887f;
import p196z6.C3891j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.m */
/* loaded from: classes.dex */
public final class C3299m extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f16178e;

    /* renamed from: f */
    public final /* synthetic */ long f16179f;

    /* renamed from: g */
    public final /* synthetic */ Object f16180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3299m(String str, Object obj, long j6, int i7) {
        super(str, true);
        this.f16178e = i7;
        this.f16180g = obj;
        this.f16179f = j6;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        C3301o c3301o;
        boolean z7;
        int i7;
        switch (this.f16178e) {
            case 0:
                synchronized (((C3301o) this.f16180g)) {
                    c3301o = (C3301o) this.f16180g;
                    long j6 = c3301o.f16201q;
                    long j7 = c3301o.f16200p;
                    if (j6 < j7) {
                        z7 = true;
                    } else {
                        c3301o.f16200p = j7 + 1;
                        z7 = false;
                    }
                }
                if (z7) {
                    c3301o.m5006b(2, 2, null);
                    return -1L;
                }
                try {
                    c3301o.f16186B.m5037m(1, 0, false);
                } catch (IOException e7) {
                    c3301o.m5006b(2, 2, e7);
                }
                return this.f16179f;
            default:
                C3887f c3887f = (C3887f) this.f16180g;
                synchronized (c3887f) {
                    try {
                        if (!c3887f.f18209t) {
                            C3891j c3891j = c3887f.f18199j;
                            if (c3891j != null) {
                                if (c3887f.f18211v) {
                                    i7 = c3887f.f18210u;
                                } else {
                                    i7 = -1;
                                }
                                c3887f.f18210u++;
                                c3887f.f18211v = true;
                                if (i7 != -1) {
                                    c3887f.m5902c(new SocketTimeoutException("sent ping but didn't receive pong within " + c3887f.f18192c + "ms (after " + (i7 - 1) + " successful ping/pongs)"), null);
                                } else {
                                    try {
                                        C0130m c0130m = C0130m.f528h;
                                        AbstractC3367j.m5100e(c0130m, "payload");
                                        c3891j.m5910b(9, c0130m);
                                    } catch (IOException e8) {
                                        c3887f.m5902c(e8, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f16179f;
        }
    }
}
