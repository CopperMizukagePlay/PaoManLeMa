package p085l0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.q1 */
/* loaded from: classes.dex */
public final class C2401q1 {

    /* renamed from: a */
    public final AbstractC2397p1 f13529a;

    /* renamed from: b */
    public final boolean f13530b;

    /* renamed from: c */
    public final InterfaceC2370i2 f13531c;

    /* renamed from: d */
    public final boolean f13532d;

    /* renamed from: e */
    public final Object f13533e;

    /* renamed from: f */
    public boolean f13534f = true;

    public C2401q1(AbstractC2397p1 abstractC2397p1, Object obj, boolean z7, InterfaceC2370i2 interfaceC2370i2, boolean z8) {
        this.f13529a = abstractC2397p1;
        this.f13530b = z7;
        this.f13531c = interfaceC2370i2;
        this.f13532d = z8;
        this.f13533e = obj;
    }

    /* renamed from: a */
    public final Object m3904a() {
        if (this.f13530b) {
            return null;
        }
        Object obj = this.f13533e;
        if (obj != null) {
            return obj;
        }
        AbstractC2399q.m3901d("Unexpected form of a provided value");
        throw new RuntimeException();
    }
}
