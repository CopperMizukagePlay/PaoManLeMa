package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p068i5.C2079c;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kc */
/* loaded from: classes.dex */
public final class C1022kc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5259i;

    /* renamed from: j */
    public int f5260j;

    /* renamed from: k */
    public final /* synthetic */ C1270sc f5261k;

    /* renamed from: l */
    public final /* synthetic */ C2079c f5262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1022kc(C1270sc c1270sc, C2079c c2079c, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f5259i = i7;
        this.f5261k = c1270sc;
        this.f5262l = c2079c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5259i) {
            case 0:
                return ((C1022kc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1022kc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5259i) {
            case 0:
                return new C1022kc(this.f5261k, this.f5262l, interfaceC2313c, 0);
            default:
                return new C1022kc(this.f5261k, this.f5262l, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f5259i) {
            case 0:
                int i7 = this.f5260j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1270sc c1270sc = this.f5261k;
                C0991jc c0991jc = new C0991jc(c1270sc, 0);
                this.f5260j = 1;
                Object m2326t = C1270sc.m2326t(c1270sc, this.f5262l, "双向测试进行中…", "双向测试进行中…", EnumC0803dc.f3385f, c0991jc, this, 128);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m2326t == enumC2465a) {
                    return enumC2465a;
                }
                return m2326t;
            default:
                int i8 = this.f5260j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1270sc c1270sc2 = this.f5261k;
                C0991jc c0991jc2 = new C0991jc(c1270sc2, 1);
                this.f5260j = 1;
                Object m2326t2 = C1270sc.m2326t(c1270sc2, this.f5262l, "双向测试进行中…", "双向测试进行中…", EnumC0803dc.f3386g, c0991jc2, this, 128);
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (m2326t2 == enumC2465a2) {
                    return enumC2465a2;
                }
                return m2326t2;
        }
    }
}
