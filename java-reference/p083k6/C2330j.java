package p083k6;

import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.j */
/* loaded from: classes.dex */
public final class C2330j extends AbstractRunnableC2329i {

    /* renamed from: g */
    public final Runnable f13309g;

    public C2330j(Runnable runnable, long j6, boolean z7) {
        super(j6, z7);
        this.f13309g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13309g.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f13309g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0525d0.m1134l(runnable));
        sb.append(", ");
        sb.append(this.f13307e);
        sb.append(", ");
        if (this.f13308f) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return AbstractC0094y0.m187n(sb, str, ']');
    }
}
