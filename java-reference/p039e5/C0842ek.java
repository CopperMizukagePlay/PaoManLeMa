package p039e5;

import android.net.Network;
import java.util.Comparator;
import p066i3.AbstractC2067b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ek */
/* loaded from: classes.dex */
public final class C0842ek implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ Network f3770e;

    /* renamed from: f */
    public final /* synthetic */ Network f3771f;

    /* renamed from: g */
    public final /* synthetic */ Network f3772g;

    public C0842ek(Network network, Network network2, Network network3) {
        this.f3770e = network;
        this.f3771f = network2;
        this.f3772g = network3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        Network network = (Network) obj;
        Network network2 = this.f3770e;
        boolean m5096a = AbstractC3367j.m5096a(network, network2);
        int i8 = 3;
        Network network3 = this.f3772g;
        Network network4 = this.f3771f;
        if (m5096a) {
            i7 = 0;
        } else if (AbstractC3367j.m5096a(network, network4)) {
            i7 = 1;
        } else if (AbstractC3367j.m5096a(network, network3)) {
            i7 = 2;
        } else {
            i7 = 3;
        }
        Integer valueOf = Integer.valueOf(i7);
        Network network5 = (Network) obj2;
        if (AbstractC3367j.m5096a(network5, network2)) {
            i8 = 0;
        } else if (AbstractC3367j.m5096a(network5, network4)) {
            i8 = 1;
        } else if (AbstractC3367j.m5096a(network5, network3)) {
            i8 = 2;
        }
        return AbstractC2067b.m3284i(valueOf, Integer.valueOf(i8));
    }
}
