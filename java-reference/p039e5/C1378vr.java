package p039e5;

import java.util.concurrent.atomic.AtomicLong;
import p006a7.C0137t;
import p099m6.AbstractC2595c;
import p099m6.C2621v;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vr */
/* loaded from: classes.dex */
public final class C1378vr extends AbstractC2595c {

    /* renamed from: a */
    public final C1248rl f8268a;

    /* renamed from: b */
    public final byte[] f8269b;

    /* renamed from: c */
    public final boolean f8270c;

    /* renamed from: d */
    public final String f8271d;

    /* renamed from: e */
    public final /* synthetic */ C1100ms f8272e;

    public C1378vr(C1100ms c1100ms, C1248rl c1248rl, byte[] bArr, boolean z7, String str) {
        AbstractC3367j.m5100e(c1248rl, "target");
        AbstractC3367j.m5100e(bArr, "payload");
        this.f8272e = c1100ms;
        this.f8268a = c1248rl;
        this.f8269b = bArr;
        this.f8270c = z7;
        this.f8271d = str;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: c */
    public final long mo2158c() {
        return -1L;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: d */
    public final C2621v mo2159d() {
        return this.f8272e.f6040R;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: p */
    public final void mo2160p(C0137t c0137t) {
        int i7 = 0;
        while (this.f8272e.f6076g.get() && !this.f8272e.f6079h.get() && !Thread.currentThread().isInterrupted()) {
            c0137t.write(this.f8269b);
            long length = this.f8269b.length;
            this.f8272e.f6085j.addAndGet(length);
            AtomicLong atomicLong = (AtomicLong) this.f8272e.f6102p.get(this.f8268a.f7390a);
            if (atomicLong != null) {
                atomicLong.addAndGet(length);
            }
            if (!this.f8272e.f6080h0 && !this.f8270c) {
                this.f8272e.m1983i1(length, this.f8271d);
            } else {
                this.f8272e.m1985j1(length, this.f8271d);
            }
            if (!this.f8270c && !this.f8272e.f6080h0 && (i7 = i7 + 1) >= 4) {
                c0137t.mo258k();
                i7 = 0;
            }
            C1100ms c1100ms = this.f8272e;
            C1096mo c1096mo = c1100ms.f6089k0;
            if (c1096mo.f5974c > 0.0d) {
                long j6 = this.f8272e.f6085j.get() + c1100ms.f6082i.get();
                C1100ms c1100ms2 = this.f8272e;
                C1100ms.m1902Z0(j6, Math.min(c1100ms2.f6056Z, c1100ms2.f6059a0), this.f8272e.f6089k0.f5974c);
            } else if (c1096mo.f5973b > 0.0d) {
                long j7 = c1100ms.f6085j.get();
                C1100ms c1100ms3 = this.f8272e;
                C1100ms.m1902Z0(j7, c1100ms3.f6059a0, c1100ms3.f6089k0.f5973b);
            }
        }
        if (!this.f8270c) {
            c0137t.flush();
        }
    }
}
