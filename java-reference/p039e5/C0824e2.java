package p039e5;

import android.net.Network;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.e2 */
/* loaded from: classes.dex */
public final class C0824e2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3602i;

    /* renamed from: j */
    public final /* synthetic */ String f3603j;

    /* renamed from: k */
    public final /* synthetic */ C0729b2 f3604k;

    /* renamed from: l */
    public final /* synthetic */ Network f3605l;

    /* renamed from: m */
    public final /* synthetic */ int f3606m;

    /* renamed from: n */
    public final /* synthetic */ int f3607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0824e2(String str, C0729b2 c0729b2, Network network, int i7, int i8, InterfaceC2313c interfaceC2313c, int i9) {
        super(2, interfaceC2313c);
        this.f3602i = i9;
        this.f3603j = str;
        this.f3604k = c0729b2;
        this.f3605l = network;
        this.f3606m = i7;
        this.f3607n = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3602i) {
            case 0:
                return ((C0824e2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0824e2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3602i) {
            case 0:
                return new C0824e2(this.f3603j, this.f3604k, this.f3605l, this.f3606m, this.f3607n, interfaceC2313c, 0);
            default:
                return new C0824e2(this.f3603j, this.f3604k, this.f3605l, this.f3606m, this.f3607n, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f3602i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                C0729b2 c0729b2 = this.f3604k;
                String str = c0729b2.f2565a;
                C1485za c1485za = c0729b2.f2566b;
                String str2 = this.f3603j;
                AbstractC3367j.m5100e(str2, "hostname");
                AbstractC3367j.m5100e(str, "dnsServer");
                return AbstractC1249rm.m2291v0(str2, 1, str, this.f3605l, this.f3606m, this.f3607n, c1485za, 0);
            default:
                AbstractC1793a0.m2972L(obj);
                C0729b2 c0729b22 = this.f3604k;
                String str3 = c0729b22.f2565a;
                C1485za c1485za2 = c0729b22.f2566b;
                String str4 = this.f3603j;
                AbstractC3367j.m5100e(str4, "hostname");
                AbstractC3367j.m5100e(str3, "dnsServer");
                return AbstractC1249rm.m2291v0(str4, 28, str3, this.f3605l, this.f3606m, this.f3607n, c1485za2, 0);
        }
    }
}
