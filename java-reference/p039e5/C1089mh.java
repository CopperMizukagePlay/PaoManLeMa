package p039e5;

import java.util.Iterator;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p152u.C3326n;
import p152u.C3330r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mh */
/* loaded from: classes.dex */
public final class C1089mh extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f5908i;

    /* renamed from: j */
    public final /* synthetic */ C3330r f5909j;

    /* renamed from: k */
    public final /* synthetic */ C3326n f5910k;

    /* renamed from: l */
    public final /* synthetic */ float f5911l;

    /* renamed from: m */
    public final /* synthetic */ float f5912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089mh(C3330r c3330r, C3326n c3326n, float f7, float f8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5909j = c3330r;
        this.f5910k = c3326n;
        this.f5911l = f7;
        this.f5912m = f8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1089mh) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1089mh(this.f5909j, this.f5910k, this.f5911l, this.f5912m, interfaceC2313c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object obj2;
        Object obj3;
        int i7 = this.f5908i;
        C1694m c1694m = C1694m.f10482a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return c1694m;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        int i8 = this.f5910k.f16329a;
        float f7 = this.f5911l - r8.f16341m;
        this.f5908i = 1;
        float f8 = AbstractC1092mk.f5952h;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i8 >= 0) {
            C3330r c3330r = this.f5909j;
            Iterator it = c3330r.m5067g().f16321j.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (((C3326n) obj3).f16329a == i8) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            if (((C3326n) obj3) != null) {
                float f9 = r5.f16341m + f7;
                float f10 = r5.f16342n + f9;
                float f11 = c3330r.m5067g().f16322k;
                float f12 = c3330r.m5067g().f16323l;
                float f13 = this.f5912m;
                if (f9 >= f11 + f13) {
                }
                if (obj2 != enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            }
        }
        obj2 = c1694m;
        if (obj2 != enumC2465a) {
        }
    }
}
