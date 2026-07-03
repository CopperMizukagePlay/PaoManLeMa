package p143s6;

import p006a7.C0126i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s6.e */
/* loaded from: classes.dex */
public final class C3116e extends AbstractC3112a {

    /* renamed from: h */
    public boolean f15743h;

    @Override // p143s6.AbstractC3112a, p006a7.InterfaceC0116a0
    /* renamed from: C */
    public final long mo214C(long j6, C0126i c0126i) {
        AbstractC3367j.m5100e(c0126i, "sink");
        if (!this.f15732f) {
            if (this.f15743h) {
                return -1L;
            }
            long mo214C = super.mo214C(8192L, c0126i);
            if (mo214C == -1) {
                this.f15743h = true;
                m4816b();
                return -1L;
            }
            return mo214C;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15732f) {
            return;
        }
        if (!this.f15743h) {
            m4816b();
        }
        this.f15732f = true;
    }
}
