package p032d6;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.t1 */
/* loaded from: classes.dex */
public abstract class AbstractC0574t1 {

    /* renamed from: a */
    public static final ThreadLocal f1928a = new ThreadLocal();

    /* renamed from: a */
    public static AbstractC0570s0 m1243a() {
        ThreadLocal threadLocal = f1928a;
        AbstractC0570s0 abstractC0570s0 = (AbstractC0570s0) threadLocal.get();
        if (abstractC0570s0 == null) {
            C0533g c0533g = new C0533g(Thread.currentThread());
            threadLocal.set(c0533g);
            return c0533g;
        }
        return abstractC0570s0;
    }
}
