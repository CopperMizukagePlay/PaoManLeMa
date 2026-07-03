package p039e5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qk */
/* loaded from: classes.dex */
public final class C1216qk extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ int f7127a;

    public /* synthetic */ C1216qk(int i7) {
        this.f7127a = i7;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f7127a) {
            case 0:
                AbstractC3367j.m5100e(network, "network");
                C1247rk.f7378e = network;
                String m4256b = AbstractC2647h.m4256b("Network@", System.identityHashCode(network));
                if (m4256b == null) {
                    m4256b = "default";
                }
                String concat = "CELLULAR_KEEP available ".concat(m4256b);
                AbstractC3367j.m5100e(concat, "message");
                if (Log.isLoggable("HBCS-NetIface", 4)) {
                    Log.i("HBCS-NetIface", concat);
                    return;
                }
                return;
            default:
                AbstractC3367j.m5100e(network, "network");
                C1247rk.f7387n = network;
                String m4256b2 = AbstractC2647h.m4256b("Network@", System.identityHashCode(network));
                if (m4256b2 == null) {
                    m4256b2 = "default";
                }
                String concat2 = "WIFI_KEEP available ".concat(m4256b2);
                AbstractC3367j.m5100e(concat2, "message");
                if (Log.isLoggable("HBCS-NetIface", 4)) {
                    Log.i("HBCS-NetIface", concat2);
                }
                C1334ue c1334ue = C1247rk.f7388o;
                if (c1334ue != null) {
                    c1334ue.mo52a();
                    return;
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f7127a) {
            case 0:
                AbstractC3367j.m5100e(network, "network");
                if (AbstractC3367j.m5096a(C1247rk.f7378e, network)) {
                    C1247rk.f7378e = null;
                    String m4256b = AbstractC2647h.m4256b("Network@", System.identityHashCode(network));
                    if (m4256b == null) {
                        m4256b = "default";
                    }
                    String concat = "CELLULAR_KEEP lost ".concat(m4256b);
                    AbstractC3367j.m5100e(concat, "message");
                    if (Log.isLoggable("HBCS-NetIface", 5)) {
                        Log.w("HBCS-NetIface", concat);
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC3367j.m5100e(network, "network");
                if (AbstractC3367j.m5096a(C1247rk.f7387n, network)) {
                    C1247rk.f7387n = null;
                    String m4256b2 = AbstractC2647h.m4256b("Network@", System.identityHashCode(network));
                    if (m4256b2 == null) {
                        m4256b2 = "default";
                    }
                    String concat2 = "WIFI_KEEP lost ".concat(m4256b2);
                    AbstractC3367j.m5100e(concat2, "message");
                    if (Log.isLoggable("HBCS-NetIface", 5)) {
                        Log.w("HBCS-NetIface", concat2);
                    }
                    C1334ue c1334ue = C1247rk.f7388o;
                    if (c1334ue != null) {
                        c1334ue.mo52a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        switch (this.f7127a) {
            case 0:
                C1247rk.f7378e = null;
                if (Log.isLoggable("HBCS-NetIface", 5)) {
                    Log.w("HBCS-NetIface", "CELLULAR_KEEP unavailable");
                    return;
                }
                return;
            default:
                C1247rk.f7387n = null;
                if (Log.isLoggable("HBCS-NetIface", 5)) {
                    Log.w("HBCS-NetIface", "WIFI_KEEP unavailable");
                }
                C1334ue c1334ue = C1247rk.f7388o;
                if (c1334ue != null) {
                    c1334ue.mo52a();
                    return;
                }
                return;
        }
    }
}
