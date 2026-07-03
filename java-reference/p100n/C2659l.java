package p100n;

import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.l */
/* loaded from: classes.dex */
public final class C2659l implements InterfaceC2390n2 {

    /* renamed from: e */
    public final C2664m1 f14348e;

    /* renamed from: f */
    public final C2361g1 f14349f;

    /* renamed from: g */
    public AbstractC2674q f14350g;

    /* renamed from: h */
    public long f14351h;

    /* renamed from: i */
    public long f14352i;

    /* renamed from: j */
    public boolean f14353j;

    public /* synthetic */ C2659l(C2664m1 c2664m1, Object obj, AbstractC2674q abstractC2674q, int i7) {
        this(c2664m1, obj, (i7 & 4) != 0 ? null : abstractC2674q, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* renamed from: a */
    public final Object m4265a() {
        return this.f14348e.f14362b.mo23f(this.f14350g);
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return this.f14349f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f14349f.getValue() + ", velocity=" + m4265a() + ", isRunning=" + this.f14353j + ", lastFrameTimeNanos=" + this.f14351h + ", finishedTimeNanos=" + this.f14352i + ')';
    }

    public C2659l(C2664m1 c2664m1, Object obj, AbstractC2674q abstractC2674q, long j6, long j7, boolean z7) {
        AbstractC2674q abstractC2674q2;
        this.f14348e = c2664m1;
        this.f14349f = AbstractC2418w.m3980x(obj);
        if (abstractC2674q != null) {
            abstractC2674q2 = AbstractC2638e.m4225k(abstractC2674q);
        } else {
            abstractC2674q2 = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
            abstractC2674q2.mo4269d();
        }
        this.f14350g = abstractC2674q2;
        this.f14351h = j6;
        this.f14352i = j7;
        this.f14353j = z7;
    }
}
