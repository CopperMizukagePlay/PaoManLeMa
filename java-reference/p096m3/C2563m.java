package p096m3;

import java.util.concurrent.ThreadPoolExecutor;
import p065i2.AbstractC2064e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.m */
/* loaded from: classes.dex */
public final class C2563m extends AbstractC2064e {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2064e f13941a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f13942b;

    public C2563m(AbstractC2064e abstractC2064e, ThreadPoolExecutor threadPoolExecutor) {
        this.f13941a = abstractC2064e;
        this.f13942b = threadPoolExecutor;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: A */
    public final void mo3253A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f13942b;
        try {
            this.f13941a.mo3253A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: B */
    public final void mo3254B(C2572v c2572v) {
        ThreadPoolExecutor threadPoolExecutor = this.f13942b;
        try {
            this.f13941a.mo3254B(c2572v);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
