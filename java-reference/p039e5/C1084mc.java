package p039e5;

import java.util.List;
import java.util.regex.Pattern;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mc */
/* loaded from: classes.dex */
public final class C1084mc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5886i;

    /* renamed from: j */
    public int f5887j;

    /* renamed from: k */
    public final /* synthetic */ C1270sc f5888k;

    /* renamed from: l */
    public final /* synthetic */ List f5889l;

    /* renamed from: m */
    public final /* synthetic */ String f5890m;

    /* renamed from: n */
    public final /* synthetic */ String f5891n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1084mc(C1270sc c1270sc, List list, String str, String str2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f5886i = i7;
        this.f5888k = c1270sc;
        this.f5889l = list;
        this.f5890m = str;
        this.f5891n = str2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5886i) {
            case 0:
                return ((C1084mc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1084mc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5886i) {
            case 0:
                return new C1084mc(this.f5888k, this.f5889l, this.f5890m, this.f5891n, interfaceC2313c, 0);
            default:
                return new C1084mc(this.f5888k, this.f5889l, this.f5890m, this.f5891n, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f5886i;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        switch (i7) {
            case 0:
                int i8 = this.f5887j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1270sc c1270sc = this.f5888k;
                C0991jc c0991jc = new C0991jc(c1270sc, 2);
                this.f5887j = 1;
                Pattern pattern = C1270sc.f7550m;
                Object m2330s = c1270sc.m2330s(EnumC1363vc.f8154f, this.f5889l, this.f5890m, "测试进行中…", this.f5891n, EnumC0803dc.f3385f, c0991jc, true, this);
                if (m2330s == enumC2465a) {
                    return enumC2465a;
                }
                return m2330s;
            default:
                int i9 = this.f5887j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1270sc c1270sc2 = this.f5888k;
                C0991jc c0991jc2 = new C0991jc(c1270sc2, 3);
                this.f5887j = 1;
                Pattern pattern2 = C1270sc.f7550m;
                Object m2330s2 = c1270sc2.m2330s(EnumC1363vc.f8154f, this.f5889l, this.f5890m, "测试进行中…", this.f5891n, EnumC0803dc.f3386g, c0991jc2, true, this);
                if (m2330s2 == enumC2465a) {
                    return enumC2465a;
                }
                return m2330s2;
        }
    }
}
