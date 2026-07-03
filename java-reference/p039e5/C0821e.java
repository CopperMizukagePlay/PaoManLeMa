package p039e5;

import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0821e implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3581e;

    /* renamed from: f */
    public final /* synthetic */ long f3582f;

    /* renamed from: g */
    public final /* synthetic */ long f3583g;

    public /* synthetic */ C0821e(int i7, long j6, long j7) {
        this.f3581e = i7;
        this.f3582f = j6;
        this.f3583g = j7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f3581e) {
            case 0:
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                return C0800d9.m1498a(c0800d9, null, null, EnumC0768c9.f3007g, this.f3582f, this.f3583g, 0L, false, null, 0L, null, null, 4179967);
            default:
                C0831e9 c0831e9 = (C0831e9) obj;
                AbstractC3367j.m5100e(c0831e9, "it");
                return C0831e9.m1519a(c0831e9, this.f3582f, this.f3583g, 0L, 0L, null, "接管慢线程后半段", 49);
        }
    }
}
