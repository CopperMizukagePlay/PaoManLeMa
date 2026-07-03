package p039e5;

import java.util.ArrayList;
import p018c0.C0334d;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p040e6.C1507c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p069i6.AbstractC2100m;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vj */
/* loaded from: classes.dex */
public final class C1370vj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f8185i = 0;

    /* renamed from: j */
    public int f8186j;

    /* renamed from: k */
    public final /* synthetic */ int f8187k;

    /* renamed from: l */
    public /* synthetic */ Object f8188l;

    /* renamed from: m */
    public final /* synthetic */ Object f8189m;

    /* renamed from: n */
    public final /* synthetic */ Object f8190n;

    /* renamed from: o */
    public final /* synthetic */ Object f8191o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370vj(int i7, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8187k = i7;
        this.f8189m = c2349d1;
        this.f8190n = interfaceC2425y0;
        this.f8191o = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8185i) {
            case 0:
                return ((C1370vj) mo28k((String) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C1370vj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f8185i) {
            case 0:
                C1370vj c1370vj = new C1370vj(this.f8187k, (C2349d1) this.f8189m, (InterfaceC2425y0) this.f8190n, (InterfaceC2425y0) this.f8191o, interfaceC2313c);
                c1370vj.f8188l = obj;
                return c1370vj;
            default:
                return new C1370vj((C1100ms) this.f8188l, (C1248rl) this.f8189m, (String) this.f8190n, (ArrayList) this.f8191o, this.f8187k, interfaceC2313c);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f8185i;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f8191o;
        Object obj3 = this.f8190n;
        Object obj4 = this.f8189m;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        switch (i7) {
            case 0:
                int i8 = this.f8186j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                String str = (String) this.f8188l;
                C2325e c2325e = AbstractC0549l0.f1898a;
                C1507c c1507c = AbstractC2100m.f12376a;
                C0334d c0334d = new C0334d(this.f8187k, str, (C2349d1) obj4, (InterfaceC2425y0) obj3, (InterfaceC2425y0) obj2, null, 10);
                this.f8186j = 1;
                if (AbstractC0525d0.m1122A(c1507c, c0334d, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i9 = this.f8186j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1100ms c1100ms = (C1100ms) this.f8188l;
                C1248rl c1248rl = (C1248rl) obj4;
                String str2 = (String) obj3;
                int indexOf = ((ArrayList) obj2).indexOf(str2);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                this.f8186j = 1;
                if (C1100ms.m1918j(c1100ms, c1248rl, str2, indexOf, this.f8187k, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370vj(C1100ms c1100ms, C1248rl c1248rl, String str, ArrayList arrayList, int i7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8188l = c1100ms;
        this.f8189m = c1248rl;
        this.f8190n = str;
        this.f8191o = arrayList;
        this.f8187k = i7;
    }
}
