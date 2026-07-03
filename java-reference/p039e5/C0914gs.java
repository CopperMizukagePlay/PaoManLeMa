package p039e5;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gs */
/* loaded from: classes.dex */
public final class C0914gs extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f4371i;

    /* renamed from: j */
    public int f4372j;

    /* renamed from: k */
    public final /* synthetic */ C1100ms f4373k;

    /* renamed from: l */
    public final /* synthetic */ C1248rl f4374l;

    /* renamed from: m */
    public final /* synthetic */ int f4375m;

    /* renamed from: n */
    public final /* synthetic */ String f4376n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0914gs(C1100ms c1100ms, C1248rl c1248rl, int i7, int i8, String str, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4371i = i8;
        this.f4373k = c1100ms;
        this.f4374l = c1248rl;
        this.f4376n = str;
        this.f4375m = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f4371i) {
            case 0:
                return ((C0914gs) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0914gs) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0914gs) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f4371i) {
            case 0:
                return new C0914gs(this.f4373k, this.f4374l, this.f4375m, 0, this.f4376n, interfaceC2313c);
            case 1:
                return new C0914gs(this.f4373k, this.f4374l, this.f4375m, this.f4376n, interfaceC2313c);
            default:
                return new C0914gs(this.f4373k, this.f4374l, this.f4375m, 2, this.f4376n, interfaceC2313c);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f4371i) {
            case 0:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i7 = this.f4372j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1100ms c1100ms = this.f4373k;
                    C1248rl c1248rl = this.f4374l;
                    List m5817z = AbstractC3784a.m5817z(this.f4376n);
                    int i8 = this.f4375m;
                    this.f4372j = 1;
                    if (C1100ms.m1905b(c1100ms, c1248rl, m5817z, i8, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            case 1:
                C1248rl c1248rl2 = this.f4374l;
                C1100ms c1100ms2 = this.f4373k;
                AtomicInteger atomicInteger = c1100ms2.f6016F;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i9 = this.f4372j;
                try {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                AbstractC1793a0.m2972L(obj);
                                atomicInteger.decrementAndGet();
                                return C1694m.f10482a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        String str = c1248rl2.f7390a;
                        int i10 = this.f4375m;
                        C1247rk c1247rk = C1100ms.f5998o1;
                        long hashCode = (Long.MAX_VALUE & ((i10 * 11917) + (str.hashCode() * 59))) % 80;
                        this.f4372j = 1;
                        if (AbstractC0525d0.m1131i(hashCode, this) == enumC2465a2) {
                            return enumC2465a2;
                        }
                    }
                    String str2 = this.f4376n;
                    this.f4372j = 2;
                    if (C1100ms.m1907c(c1100ms2, c1248rl2, str2, this) == enumC2465a2) {
                        return enumC2465a2;
                    }
                    atomicInteger.decrementAndGet();
                    return C1694m.f10482a;
                } catch (Throwable th) {
                    atomicInteger.decrementAndGet();
                    throw th;
                }
            default:
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                int i11 = this.f4372j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1100ms c1100ms3 = this.f4373k;
                    C1248rl c1248rl3 = this.f4374l;
                    String str3 = this.f4376n;
                    int i12 = this.f4375m + c1100ms3.f6121y0;
                    this.f4372j = 1;
                    if (C1100ms.m1918j(c1100ms3, c1248rl3, str3, 0, i12, this) == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0914gs(C1100ms c1100ms, C1248rl c1248rl, int i7, String str, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4371i = 1;
        this.f4373k = c1100ms;
        this.f4374l = c1248rl;
        this.f4375m = i7;
        this.f4376n = str;
    }
}
