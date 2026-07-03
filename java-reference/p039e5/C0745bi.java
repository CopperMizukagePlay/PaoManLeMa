package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p032d6.InterfaceC0516a0;
import p085l0.InterfaceC2425y0;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bi */
/* loaded from: classes.dex */
public final class C0745bi extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0516a0 f2661a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2425y0 f2662b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2425y0 f2663c;

    /* renamed from: d */
    public final /* synthetic */ Context f2664d;

    /* renamed from: e */
    public final /* synthetic */ C3469p f2665e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f2666f;

    public C0745bi(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, Context context, C3469p c3469p, InterfaceC2425y0 interfaceC2425y03) {
        this.f2661a = interfaceC0516a0;
        this.f2662b = interfaceC2425y0;
        this.f2663c = interfaceC2425y02;
        this.f2664d = context;
        this.f2665e = c3469p;
        this.f2666f = interfaceC2425y03;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC3367j.m5100e(network, "network");
        AbstractC1092mk.m1724R(this.f2664d, this.f2661a, this.f2662b, this.f2663c, this.f2665e, this.f2666f);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC3367j.m5100e(network, "network");
        AbstractC3367j.m5100e(networkCapabilities, "networkCapabilities");
        AbstractC1092mk.m1724R(this.f2664d, this.f2661a, this.f2662b, this.f2663c, this.f2665e, this.f2666f);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC3367j.m5100e(network, "network");
        AbstractC1092mk.m1724R(this.f2664d, this.f2661a, this.f2662b, this.f2663c, this.f2665e, this.f2666f);
    }
}
