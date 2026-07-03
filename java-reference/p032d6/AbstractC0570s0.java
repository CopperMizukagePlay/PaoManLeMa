package p032d6;

import p060h5.C1803k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC0570s0 extends AbstractC0581w {

    /* renamed from: j */
    public static final /* synthetic */ int f1924j = 0;

    /* renamed from: g */
    public long f1925g;

    /* renamed from: h */
    public boolean f1926h;

    /* renamed from: i */
    public C1803k f1927i;

    /* renamed from: M */
    public final void m1239M(boolean z7) {
        long j6;
        long j7 = this.f1925g;
        if (z7) {
            j6 = 4294967296L;
        } else {
            j6 = 1;
        }
        long j8 = j7 - j6;
        this.f1925g = j8;
        if (j8 <= 0 && this.f1926h) {
            shutdown();
        }
    }

    /* renamed from: N */
    public final void m1240N(AbstractC0546k0 abstractC0546k0) {
        C1803k c1803k = this.f1927i;
        if (c1803k == null) {
            c1803k = new C1803k();
            this.f1927i = c1803k;
        }
        c1803k.addLast(abstractC0546k0);
    }

    /* renamed from: O */
    public abstract Thread mo1151O();

    /* renamed from: P */
    public final void m1241P(boolean z7) {
        long j6;
        long j7 = this.f1925g;
        if (z7) {
            j6 = 4294967296L;
        } else {
            j6 = 1;
        }
        this.f1925g = j6 + j7;
        if (!z7) {
            this.f1926h = true;
        }
    }

    /* renamed from: Q */
    public abstract long mo1234Q();

    /* renamed from: R */
    public final boolean m1242R() {
        Object removeFirst;
        C1803k c1803k = this.f1927i;
        if (c1803k != null) {
            if (c1803k.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = c1803k.removeFirst();
            }
            AbstractC0546k0 abstractC0546k0 = (AbstractC0546k0) removeFirst;
            if (abstractC0546k0 == null) {
                return false;
            }
            abstractC0546k0.run();
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void mo1152S(long j6, AbstractRunnableC0561p0 abstractRunnableC0561p0) {
        RunnableC0528e0.f1868n.m1238X(j6, abstractRunnableC0561p0);
    }

    public abstract void shutdown();
}
