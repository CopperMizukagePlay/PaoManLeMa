package p032d6;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.o0 */
/* loaded from: classes.dex */
public final class C0558o0 extends AbstractRunnableC0561p0 {

    /* renamed from: g */
    public final C0548l f1905g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC0567r0 f1906h;

    public C0558o0(AbstractC0567r0 abstractC0567r0, long j6, C0548l c0548l) {
        this.f1906h = abstractC0567r0;
        this.f1908e = j6;
        this.f1909f = -1;
        this.f1905g = c0548l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1905g.m1212F(this.f1906h);
    }

    @Override // p032d6.AbstractRunnableC0561p0
    public final String toString() {
        return super.toString() + this.f1905g;
    }
}
