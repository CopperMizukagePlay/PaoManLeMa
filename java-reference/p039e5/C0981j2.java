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
/* renamed from: e5.j2 */
/* loaded from: classes.dex */
public final class C0981j2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5007i;

    /* renamed from: j */
    public final /* synthetic */ String f5008j;

    /* renamed from: k */
    public final /* synthetic */ String f5009k;

    /* renamed from: l */
    public final /* synthetic */ Network f5010l;

    /* renamed from: m */
    public final /* synthetic */ int f5011m;

    /* renamed from: n */
    public final /* synthetic */ int f5012n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0981j2(String str, String str2, Network network, int i7, int i8, InterfaceC2313c interfaceC2313c, int i9) {
        super(2, interfaceC2313c);
        this.f5007i = i9;
        this.f5008j = str;
        this.f5009k = str2;
        this.f5010l = network;
        this.f5011m = i7;
        this.f5012n = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5007i) {
            case 0:
                return ((C0981j2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0981j2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5007i) {
            case 0:
                return new C0981j2(this.f5008j, this.f5009k, this.f5010l, this.f5011m, this.f5012n, interfaceC2313c, 0);
            default:
                return new C0981j2(this.f5008j, this.f5009k, this.f5010l, this.f5011m, this.f5012n, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f5007i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                String str = this.f5008j;
                AbstractC3367j.m5100e(str, "hostname");
                String str2 = this.f5009k;
                AbstractC3367j.m5100e(str2, "dnsServer");
                return AbstractC1249rm.m2291v0(str, 1, str2, this.f5010l, this.f5011m, this.f5012n, null, 0);
            default:
                AbstractC1793a0.m2972L(obj);
                String str3 = this.f5008j;
                AbstractC3367j.m5100e(str3, "hostname");
                String str4 = this.f5009k;
                AbstractC3367j.m5100e(str4, "dnsServer");
                return AbstractC1249rm.m2291v0(str3, 28, str4, this.f5010l, this.f5011m, this.f5012n, null, 0);
        }
    }
}
