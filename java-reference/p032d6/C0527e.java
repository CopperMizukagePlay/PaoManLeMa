package p032d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.e */
/* loaded from: classes.dex */
public final class C0527e {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1866b = AtomicIntegerFieldUpdater.newUpdater(C0527e.class, "notCompletedCount$volatile");

    /* renamed from: a */
    public final InterfaceC0534g0[] f1867a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0527e(InterfaceC0534g0[] interfaceC0534g0Arr) {
        this.f1867a = interfaceC0534g0Arr;
        this.notCompletedCount$volatile = interfaceC0534g0Arr.length;
    }
}
