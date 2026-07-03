package p083k6;

import p032d6.AbstractC0581w;
import p069i6.AbstractC2088a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.e */
/* loaded from: classes.dex */
public final class C2325e extends AbstractC2328h {

    /* renamed from: h */
    public static final C2325e f13304h;

    /* JADX WARN: Type inference failed for: r0v0, types: [k6.e, k6.h, d6.w] */
    static {
        int i7 = AbstractC2331k.f13312c;
        int i8 = AbstractC2331k.f13313d;
        long j6 = AbstractC2331k.f13314e;
        String str = AbstractC2331k.f13310a;
        ?? abstractC0581w = new AbstractC0581w();
        abstractC0581w.f13306g = new ExecutorC2323c(i7, i8, j6, str);
        f13304h = abstractC0581w;
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: L */
    public final AbstractC0581w mo1245L(int i7) {
        AbstractC2088a.m3430a(i7);
        if (i7 >= AbstractC2331k.f13312c) {
            return this;
        }
        return super.mo1245L(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
