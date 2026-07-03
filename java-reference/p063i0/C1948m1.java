package p063i0;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p071j0.C2121d0;
import p071j0.C2146q;
import p071j0.C2150s;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.InterfaceC2656k;
import p150t5.InterfaceC3283g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.m1 */
/* loaded from: classes.dex */
public final class C1948m1 extends AbstractC2590j implements InterfaceC3283g {

    /* renamed from: i */
    public int f11511i;

    /* renamed from: j */
    public /* synthetic */ C2146q f11512j;

    /* renamed from: k */
    public /* synthetic */ C2121d0 f11513k;

    /* renamed from: l */
    public /* synthetic */ EnumC1964o1 f11514l;

    /* renamed from: m */
    public final /* synthetic */ C1956n1 f11515m;

    /* renamed from: n */
    public final /* synthetic */ float f11516n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2656k f11517o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1948m1(C1956n1 c1956n1, float f7, InterfaceC2656k interfaceC2656k, InterfaceC2313c interfaceC2313c) {
        super(4, interfaceC2313c);
        this.f11515m = c1956n1;
        this.f11516n = f7;
        this.f11517o = interfaceC2656k;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        float f7 = this.f11516n;
        InterfaceC2656k interfaceC2656k = this.f11517o;
        C1948m1 c1948m1 = new C1948m1(this.f11515m, f7, interfaceC2656k, (InterfaceC2313c) obj4);
        c1948m1.f11512j = (C2146q) obj;
        c1948m1.f11513k = (C2121d0) obj2;
        c1948m1.f11514l = (EnumC1964o1) obj3;
        return c1948m1.mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [u5.s, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        float m3729g;
        C2150s c2150s = this.f11515m.f11575a;
        int i7 = this.f11511i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2146q c2146q = this.f11512j;
            float m3474c = this.f11513k.m3474c(this.f11514l);
            if (!Float.isNaN(m3474c)) {
                ?? obj2 = new Object();
                if (Float.isNaN(c2150s.f12515h.m3729g())) {
                    m3729g = 0.0f;
                } else {
                    m3729g = c2150s.f12515h.m3729g();
                }
                float f7 = m3729g;
                obj2.f16448e = f7;
                C1940l1 c1940l1 = new C1940l1(c2146q, obj2, 0);
                this.f11512j = null;
                this.f11513k = null;
                this.f11511i = 1;
                Object m4217c = AbstractC2638e.m4217c(f7, m3474c, this.f11516n, this.f11517o, c1940l1, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m4217c == enumC2465a) {
                    return enumC2465a;
                }
            }
        }
        return C1694m.f10482a;
    }
}
