package p039e5;

import android.content.Context;
import android.net.Network;
import p008b.C0226c0;
import p024c6.AbstractC0444k;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bt */
/* loaded from: classes.dex */
public final class C0756bt extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public /* synthetic */ Object f2905i;

    /* renamed from: j */
    public final /* synthetic */ int f2906j;

    /* renamed from: k */
    public final /* synthetic */ C0883ft f2907k;

    /* renamed from: l */
    public final /* synthetic */ String f2908l;

    /* renamed from: m */
    public final /* synthetic */ int f2909m;

    /* renamed from: n */
    public final /* synthetic */ boolean f2910n;

    /* renamed from: o */
    public final /* synthetic */ String f2911o;

    /* renamed from: p */
    public final /* synthetic */ Network f2912p;

    /* renamed from: q */
    public final /* synthetic */ Context f2913q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756bt(int i7, C0883ft c0883ft, String str, int i8, boolean z7, String str2, Network network, Context context, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f2906j = i7;
        this.f2907k = c0883ft;
        this.f2908l = str;
        this.f2909m = i8;
        this.f2910n = z7;
        this.f2911o = str2;
        this.f2912p = network;
        this.f2913q = context;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0756bt) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C0756bt c0756bt = new C0756bt(this.f2906j, this.f2907k, this.f2908l, this.f2909m, this.f2910n, this.f2911o, this.f2912p, this.f2913q, interfaceC2313c);
        c0756bt.f2905i = obj;
        return c0756bt;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7;
        Object m2985m;
        C0226c0 c0226c0;
        String str;
        AbstractC1793a0.m2972L(obj);
        int i8 = this.f2906j / 1000;
        if (i8 < 1) {
            i7 = 1;
        } else {
            i7 = i8;
        }
        String[] m1531e = C0883ft.m1531e(this.f2908l, i7, this.f2909m, this.f2910n, this.f2911o, null);
        Context context = this.f2913q;
        try {
            c0226c0 = new C0226c0(m1531e, this.f2907k);
            str = this.f2911o;
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (str != null && !AbstractC0444k.m937a0(str)) {
            m2985m = (C1317ts) c0226c0.mo52a();
            C1317ts c1317ts = new C1317ts(false, 0.0d);
            if (!(m2985m instanceof C1689h)) {
                return c1317ts;
            }
            return m2985m;
        }
        Network network = this.f2912p;
        if (network == null) {
            m2985m = (C1317ts) c0226c0.mo52a();
        } else {
            m2985m = (C1317ts) AbstractC1249rm.m2210B0(context, network, c0226c0);
        }
        C1317ts c1317ts2 = new C1317ts(false, 0.0d);
        if (!(m2985m instanceof C1689h)) {
        }
    }
}
