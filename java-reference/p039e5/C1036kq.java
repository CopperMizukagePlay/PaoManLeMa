package p039e5;

import java.util.LinkedHashMap;
import p053g5.C1694m;
import p085l0.AbstractC2399q;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2394o2;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p153u0.AbstractC3340g;
import p153u0.C3336c;
import p156u3.AbstractC3354a;
import p169w0.AbstractC3646c;
import p169w0.AbstractC3648e;
import p181x5.AbstractC3824a;
import p181x5.AbstractC3827d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kq */
/* loaded from: classes.dex */
public final /* synthetic */ class C1036kq implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5328e;

    public /* synthetic */ C1036kq(int i7) {
        this.f5328e = i7;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f5328e) {
            case 0:
                return AbstractC2418w.m3980x(Boolean.FALSE);
            case 1:
                return AbstractC2418w.m3980x(Boolean.FALSE);
            case 2:
                return AbstractC2418w.m3980x(Boolean.FALSE);
            case 3:
                return AbstractC2418w.m3980x(Boolean.FALSE);
            case 4:
                C1247rk c1247rk = C1100ms.f5998o1;
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3824a abstractC3824a = AbstractC3827d.f18036e;
                return Integer.valueOf(AbstractC3827d.f18036e.mo5839a().nextInt(2147418112) + 65536);
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC2399q.m3901d("Unexpected call to default provider");
                throw new RuntimeException();
            case 7:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 8:
                return new C3336c(new LinkedHashMap());
            case AbstractC3122c.f15758c /* 9 */:
                C2394o2 c2394o2 = AbstractC3340g.f16400a;
                return null;
            case AbstractC3122c.f15760e /* 10 */:
                C2336a0 c2336a0 = AbstractC3354a.f16416a;
                return null;
            case 11:
                C2394o2 c2394o22 = AbstractC3646c.f17423a;
                return null;
            case 12:
                C2394o2 c2394o23 = AbstractC3648e.f17425a;
                return null;
            default:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
        }
    }
}
