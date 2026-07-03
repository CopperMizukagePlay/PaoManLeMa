package p039e5;

import android.content.Context;
import android.net.Network;
import p017c.C0320e;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rt */
/* loaded from: classes.dex */
public final class C1256rt extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f7441i = 1;

    /* renamed from: j */
    public int f7442j;

    /* renamed from: k */
    public final /* synthetic */ C1473yt f7443k;

    /* renamed from: l */
    public final /* synthetic */ String f7444l;

    /* renamed from: m */
    public final /* synthetic */ int f7445m;

    /* renamed from: n */
    public final /* synthetic */ boolean f7446n;

    /* renamed from: o */
    public final /* synthetic */ Network f7447o;

    /* renamed from: p */
    public final /* synthetic */ Context f7448p;

    /* renamed from: q */
    public /* synthetic */ Object f7449q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256rt(C1473yt c1473yt, String str, int i7, C1194pt c1194pt, boolean z7, Network network, Context context, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7443k = c1473yt;
        this.f7444l = str;
        this.f7445m = i7;
        this.f7449q = c1194pt;
        this.f7446n = z7;
        this.f7447o = network;
        this.f7448p = context;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f7441i) {
            case 0:
                return ((C1256rt) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1256rt) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f7441i) {
            case 0:
                C1256rt c1256rt = new C1256rt(this.f7446n, this.f7442j, this.f7445m, this.f7444l, this.f7448p, this.f7447o, this.f7443k, interfaceC2313c);
                c1256rt.f7449q = obj;
                return c1256rt;
            default:
                return new C1256rt(this.f7443k, this.f7444l, this.f7445m, (C1194pt) this.f7449q, this.f7446n, this.f7447o, this.f7448p, interfaceC2313c);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        String[] strArr;
        Object m2985m;
        switch (this.f7441i) {
            case 0:
                int i7 = this.f7442j;
                AbstractC1793a0.m2972L(obj);
                boolean z7 = this.f7446n;
                String str = this.f7444l;
                int i8 = this.f7445m;
                if (z7) {
                    strArr = new String[]{"ping6", "-n", "-c", String.valueOf(1), "-W", String.valueOf(i7), "-t", String.valueOf(i8), str};
                } else {
                    strArr = new String[]{"ping", "-n", "-c", String.valueOf(1), "-W", String.valueOf(i7), "-t", String.valueOf(i8), str};
                }
                try {
                    m2985m = (String) AbstractC1249rm.m2210B0(this.f7448p, this.f7447o, new C0320e(27, strArr, this.f7443k));
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    return "";
                }
                return m2985m;
            default:
                int i9 = this.f7442j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1473yt c1473yt = this.f7443k;
                if (!c1473yt.f9793b.get()) {
                    return new C1225qt("*", 0.0d, false);
                }
                this.f7442j = 1;
                Object m2431b = C1473yt.m2431b(c1473yt, this.f7444l, this.f7445m, 3, this.f7446n, this.f7447o, this.f7448p, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m2431b == enumC2465a) {
                    return enumC2465a;
                }
                return m2431b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256rt(boolean z7, int i7, int i8, String str, Context context, Network network, C1473yt c1473yt, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7446n = z7;
        this.f7442j = i7;
        this.f7445m = i8;
        this.f7444l = str;
        this.f7448p = context;
        this.f7447o = network;
        this.f7443k = c1473yt;
    }
}
