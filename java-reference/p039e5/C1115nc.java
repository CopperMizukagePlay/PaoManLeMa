package p039e5;

import java.io.File;
import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nc */
/* loaded from: classes.dex */
public final class C1115nc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f6233i;

    /* renamed from: j */
    public /* synthetic */ Object f6234j;

    /* renamed from: k */
    public final /* synthetic */ C1270sc f6235k;

    /* renamed from: l */
    public final /* synthetic */ File f6236l;

    /* renamed from: m */
    public final /* synthetic */ int f6237m;

    /* renamed from: n */
    public final /* synthetic */ int f6238n;

    /* renamed from: o */
    public final /* synthetic */ int f6239o;

    /* renamed from: p */
    public final /* synthetic */ String f6240p;

    /* renamed from: q */
    public final /* synthetic */ String f6241q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115nc(C1270sc c1270sc, File file, int i7, int i8, int i9, String str, String str2, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6235k = c1270sc;
        this.f6236l = file;
        this.f6237m = i7;
        this.f6238n = i8;
        this.f6239o = i9;
        this.f6240p = str;
        this.f6241q = str2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1115nc) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1115nc c1115nc = new C1115nc(this.f6235k, this.f6236l, this.f6237m, this.f6238n, this.f6239o, this.f6240p, this.f6241q, interfaceC2313c);
        c1115nc.f6234j = obj;
        return c1115nc;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f6233i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f6234j;
        C1270sc c1270sc = this.f6235k;
        c1270sc.f7557g.set(null);
        c1270sc.f7558h.set(null);
        int i8 = this.f6237m;
        File file = this.f6236l;
        int i9 = this.f6238n;
        List m3067O = AbstractC1806n.m3067O(AbstractC0525d0.m1125c(interfaceC0516a0, null, new C1084mc(c1270sc, C1270sc.m2313c(c1270sc, file, i8, i9), this.f6240p, this.f6241q, null, 0), 3), AbstractC0525d0.m1125c(interfaceC0516a0, null, new C1084mc(c1270sc, C1270sc.m2313c(c1270sc, file, this.f6239o, i9), this.f6240p, this.f6241q, null, 1), 3));
        this.f6233i = 1;
        Object m1126d = AbstractC0525d0.m1126d(m3067O, this);
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1126d == enumC2465a) {
            return enumC2465a;
        }
        return m1126d;
    }
}
