package p071j0;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1940l1;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.InterfaceC2656k;
import p150t5.InterfaceC3283g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.i */
/* loaded from: classes.dex */
public final class C2130i extends AbstractC2590j implements InterfaceC3283g {

    /* renamed from: i */
    public int f12431i;

    /* renamed from: j */
    public /* synthetic */ C2146q f12432j;

    /* renamed from: k */
    public /* synthetic */ C2121d0 f12433k;

    /* renamed from: l */
    public /* synthetic */ Object f12434l;

    /* renamed from: m */
    public final /* synthetic */ C2150s f12435m;

    /* renamed from: n */
    public final /* synthetic */ float f12436n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2130i(C2150s c2150s, float f7, InterfaceC2313c interfaceC2313c) {
        super(4, interfaceC2313c);
        this.f12435m = c2150s;
        this.f12436n = f7;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        C2130i c2130i = new C2130i(this.f12435m, this.f12436n, (InterfaceC2313c) obj4);
        c2130i.f12432j = (C2146q) obj;
        c2130i.f12433k = (C2121d0) obj2;
        c2130i.f12434l = obj3;
        return c2130i.mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [u5.s, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        float m3729g;
        int i7 = this.f12431i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2146q c2146q = this.f12432j;
            float m3474c = this.f12433k.m3474c(this.f12434l);
            if (!Float.isNaN(m3474c)) {
                ?? obj2 = new Object();
                C2150s c2150s = this.f12435m;
                if (Float.isNaN(c2150s.f12515h.m3729g())) {
                    m3729g = 0.0f;
                } else {
                    m3729g = c2150s.f12515h.m3729g();
                }
                obj2.f16448e = m3729g;
                InterfaceC2656k interfaceC2656k = c2150s.f12509b;
                C1940l1 c1940l1 = new C1940l1(c2146q, obj2, 1);
                this.f12432j = null;
                this.f12433k = null;
                this.f12431i = 1;
                Object m4217c = AbstractC2638e.m4217c(m3729g, m3474c, this.f12436n, interfaceC2656k, c1940l1, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m4217c == enumC2465a) {
                    return enumC2465a;
                }
            }
        }
        return C1694m.f10482a;
    }
}
