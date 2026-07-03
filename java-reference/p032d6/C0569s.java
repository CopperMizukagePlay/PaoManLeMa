package p032d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.s */
/* loaded from: classes.dex */
public class C0569s {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1922b = AtomicIntegerFieldUpdater.newUpdater(C0569s.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f1923a;

    public C0569s(Throwable th, boolean z7) {
        this.f1923a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1923a + ']';
    }
}
