package p039e5;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.js */
/* loaded from: classes.dex */
public final class C1007js extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5166i = 0;

    /* renamed from: j */
    public int f5167j;

    /* renamed from: k */
    public final /* synthetic */ C1100ms f5168k;

    /* renamed from: l */
    public final /* synthetic */ C1248rl f5169l;

    /* renamed from: m */
    public final /* synthetic */ String f5170m;

    /* renamed from: n */
    public final /* synthetic */ int f5171n;

    /* renamed from: o */
    public final /* synthetic */ int f5172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007js(C1100ms c1100ms, C1248rl c1248rl, int i7, int i8, String str, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5168k = c1100ms;
        this.f5169l = c1248rl;
        this.f5171n = i7;
        this.f5172o = i8;
        this.f5170m = str;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5166i) {
            case 0:
                return ((C1007js) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1007js) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5166i) {
            case 0:
                return new C1007js(this.f5168k, this.f5169l, this.f5171n, this.f5172o, this.f5170m, interfaceC2313c);
            default:
                return new C1007js(this.f5168k, this.f5169l, this.f5170m, this.f5171n, this.f5172o, interfaceC2313c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7 = this.f5166i;
        String str = this.f5170m;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        C1100ms c1100ms = this.f5168k;
        C1248rl c1248rl = this.f5169l;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                int i8 = this.f5167j;
                try {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 == 2) {
                                AbstractC1793a0.m2972L(obj);
                                return c1694m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        String str2 = c1248rl.f7390a;
                        C1247rk c1247rk = C1100ms.f5998o1;
                        c1100ms.getClass();
                        this.f5167j = 1;
                        if (AbstractC0525d0.m1131i(0L, this) == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    this.f5167j = 2;
                    if (C1100ms.m1907c(c1100ms, c1248rl, str, this) == enumC2465a) {
                        return enumC2465a;
                    }
                    return c1694m;
                } finally {
                    c1100ms.f6016F.decrementAndGet();
                }
            default:
                int i9 = this.f5167j;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        if (!c1100ms.f6120y.contains(c1248rl.f7390a)) {
                            this.f5167j = 2;
                            if (C1100ms.m1918j(this.f5168k, this.f5169l, this.f5170m, this.f5172o, this.f5171n, this) == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (!c1100ms.f6120y.contains(c1248rl.f7390a)) {
                        String str3 = c1248rl.f7390a;
                        this.f5167j = 1;
                        if (C1100ms.m1916i(c1100ms, str3, str, this.f5171n, this) == enumC2465a) {
                            return enumC2465a;
                        }
                        if (!c1100ms.f6120y.contains(c1248rl.f7390a)) {
                        }
                    }
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007js(C1100ms c1100ms, C1248rl c1248rl, String str, int i7, int i8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5168k = c1100ms;
        this.f5169l = c1248rl;
        this.f5170m = str;
        this.f5171n = i7;
        this.f5172o = i8;
    }
}
