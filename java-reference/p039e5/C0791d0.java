package p039e5;

import p008b.C0242k0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d0 */
/* loaded from: classes.dex */
public final class C0791d0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3222i;

    /* renamed from: j */
    public int f3223j;

    /* renamed from: k */
    public final /* synthetic */ C1196q0 f3224k;

    /* renamed from: l */
    public final /* synthetic */ String f3225l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0791d0(C1196q0 c1196q0, String str, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f3222i = i7;
        this.f3224k = c1196q0;
        this.f3225l = str;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3222i) {
            case 0:
                return ((C0791d0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0791d0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0791d0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0791d0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3222i) {
            case 0:
                return new C0791d0(this.f3224k, this.f3225l, interfaceC2313c, 0);
            case 1:
                return new C0791d0(this.f3224k, this.f3225l, interfaceC2313c, 1);
            case 2:
                return new C0791d0(this.f3224k, this.f3225l, interfaceC2313c, 2);
            default:
                return new C0791d0(this.f3224k, this.f3225l, interfaceC2313c, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r1 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (p032d6.AbstractC0525d0.m1129g(r8, r7) == r6) goto L51;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        switch (this.f3222i) {
            case 0:
                int i7 = this.f3223j;
                C1694m c1694m = C1694m.f10482a;
                String str = this.f3225l;
                C1196q0 c1196q0 = this.f3224k;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            c1196q0.m2122V(str, new C0242k0(14));
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1196q0.m2095b(c1196q0, str);
                    InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) c1196q0.f6968g.remove(str);
                    if (interfaceC0520b1 != null) {
                        this.f3223j = 1;
                        break;
                    }
                }
                C0242k0 c0242k0 = new C0242k0(13);
                this.f3223j = 2;
                c1196q0.m2121U(str, c0242k0);
                break;
            case 1:
                int i8 = this.f3223j;
                C1694m c1694m2 = C1694m.f10482a;
                String str2 = this.f3225l;
                C1196q0 c1196q02 = this.f3224k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0242k0 c0242k02 = new C0242k0(17);
                    this.f3223j = 1;
                    c1196q02.m2121U(str2, c0242k02);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (c1694m2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                c1196q02.m2119P(str2);
                return c1694m2;
            case 2:
                int i9 = this.f3223j;
                C1694m c1694m3 = C1694m.f10482a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C0242k0 c0242k03 = new C0242k0(19);
                this.f3223j = 1;
                this.f3224k.m2121U(this.f3225l, c0242k03);
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                if (c1694m3 == enumC2465a3) {
                    return enumC2465a3;
                }
                return c1694m3;
            default:
                int i10 = this.f3223j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f3223j = 1;
                    Object m2100g = C1196q0.m2100g(this.f3224k, this.f3225l, this);
                    EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                    if (m2100g == enumC2465a4) {
                        return enumC2465a4;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
