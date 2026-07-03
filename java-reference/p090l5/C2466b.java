package p090l5;

import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2588h;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l5.b */
/* loaded from: classes.dex */
public final class C2466b extends AbstractC2588h {

    /* renamed from: f */
    public int f13754f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f13755g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2313c f13756h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2466b(InterfaceC2313c interfaceC2313c, InterfaceC2313c interfaceC2313c2, InterfaceC3281e interfaceC3281e) {
        super(interfaceC2313c);
        this.f13755g = interfaceC3281e;
        this.f13756h = interfaceC2313c2;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f13754f;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f13754f = 2;
                AbstractC1793a0.m2972L(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f13754f = 1;
        AbstractC1793a0.m2972L(obj);
        InterfaceC3281e interfaceC3281e = this.f13755g;
        AbstractC3367j.m5098c(interfaceC3281e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC3382y.m5111b(2, interfaceC3281e);
        return interfaceC3281e.mo22d(this.f13756h, this);
    }
}
