package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import p001a0.C0008b2;
import p032d6.InterfaceC0516a0;
import p085l0.C2364h0;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.uf */
/* loaded from: classes.dex */
public final /* synthetic */ class C1335uf implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7932e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f7933f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0516a0 f7934g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7935h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f7936i;

    /* renamed from: j */
    public final /* synthetic */ C3469p f7937j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f7938k;

    public /* synthetic */ C1335uf(Context context, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C3469p c3469p, InterfaceC2425y0 interfaceC2425y03) {
        this.f7933f = context;
        this.f7934g = interfaceC0516a0;
        this.f7935h = interfaceC2425y0;
        this.f7936i = interfaceC2425y02;
        this.f7937j = c3469p;
        this.f7938k = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f7932e) {
            case 0:
                InterfaceC0516a0 interfaceC0516a0 = this.f7934g;
                InterfaceC2425y0 interfaceC2425y0 = this.f7935h;
                InterfaceC2425y0 interfaceC2425y02 = this.f7936i;
                Context context = this.f7933f;
                C3469p c3469p = this.f7937j;
                InterfaceC2425y0 interfaceC2425y03 = this.f7938k;
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                C1247rk.f7388o = new C1334ue(interfaceC0516a0, interfaceC2425y0, interfaceC2425y02, context, c3469p, interfaceC2425y03);
                return new C0871fh(1);
            default:
                Context context2 = this.f7933f;
                InterfaceC0516a0 interfaceC0516a02 = this.f7934g;
                InterfaceC2425y0 interfaceC2425y04 = this.f7935h;
                InterfaceC2425y0 interfaceC2425y05 = this.f7936i;
                C3469p c3469p2 = this.f7937j;
                InterfaceC2425y0 interfaceC2425y06 = this.f7938k;
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                Object systemService = context2.getSystemService("connectivity");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                C0745bi c0745bi = new C0745bi(interfaceC0516a02, interfaceC2425y04, interfaceC2425y05, context2, c3469p2, interfaceC2425y06);
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c0745bi);
                return new C0008b2(4, connectivityManager, c0745bi);
        }
    }

    public /* synthetic */ C1335uf(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, Context context, C3469p c3469p, InterfaceC2425y0 interfaceC2425y03) {
        this.f7934g = interfaceC0516a0;
        this.f7935h = interfaceC2425y0;
        this.f7936i = interfaceC2425y02;
        this.f7933f = context;
        this.f7937j = c3469p;
        this.f7938k = interfaceC2425y03;
    }
}
