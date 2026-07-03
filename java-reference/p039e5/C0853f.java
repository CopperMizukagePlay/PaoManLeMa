package p039e5;

import java.util.concurrent.atomic.AtomicLong;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0853f implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3869e;

    /* renamed from: f */
    public final /* synthetic */ AtomicLong f3870f;

    public /* synthetic */ C0853f(AtomicLong atomicLong, int i7) {
        this.f3869e = i7;
        this.f3870f = atomicLong;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f3869e) {
            case 0:
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                return C0800d9.m1498a(c0800d9, null, null, EnumC0768c9.f3007g, 0L, this.f3870f.get(), 0L, false, null, 0L, null, null, 4184063);
            default:
                this.f3870f.addAndGet(((Integer) obj).intValue());
                return C1694m.f10482a;
        }
    }
}
