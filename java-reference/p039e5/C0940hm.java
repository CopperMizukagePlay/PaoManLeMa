package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.util.List;
import java.util.regex.Pattern;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hm */
/* loaded from: classes.dex */
public final class C0940hm extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f4617i;

    /* renamed from: j */
    public /* synthetic */ Object f4618j;

    /* renamed from: k */
    public final /* synthetic */ String f4619k;

    /* renamed from: l */
    public final /* synthetic */ Network f4620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0940hm(String str, Network network, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f4617i = i7;
        this.f4619k = str;
        this.f4620l = network;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f4617i) {
            case 0:
                return ((C0940hm) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0940hm) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f4617i) {
            case 0:
                C0940hm c0940hm = new C0940hm(this.f4619k, this.f4620l, interfaceC2313c, 0);
                c0940hm.f4618j = obj;
                return c0940hm;
            default:
                C0940hm c0940hm2 = new C0940hm(this.f4619k, this.f4620l, interfaceC2313c, 1);
                c0940hm2.f4618j = obj;
                return c0940hm2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object m2985m;
        String hostAddress;
        Object m2985m2;
        String hostAddress2;
        int i7 = this.f4617i;
        C1813u c1813u = C1813u.f10860e;
        Object obj2 = null;
        Network network = this.f4620l;
        EnumC1124nl enumC1124nl = EnumC1124nl.f6340f;
        EnumC1124nl enumC1124nl2 = EnumC1124nl.f6339e;
        String str = this.f4619k;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                Pattern pattern = AbstractC1155ol.f6638a;
                EnumC1124nl m2013a = AbstractC1155ol.m2013a(str);
                if (m2013a != enumC1124nl2 && m2013a != enumC1124nl) {
                    try {
                        if (network != null) {
                            InetAddress[] allByName = network.getAllByName(str);
                            AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                            m2985m = AbstractC1804l.m3031X(allByName);
                        } else {
                            InetAddress[] allByName2 = InetAddress.getAllByName(str);
                            AbstractC3367j.m5099d(allByName2, "getAllByName(...)");
                            m2985m = AbstractC1804l.m3031X(allByName2);
                        }
                    } catch (Throwable th) {
                        m2985m = AbstractC1793a0.m2985m(th);
                    }
                    if (!(m2985m instanceof C1689h)) {
                        obj2 = m2985m;
                    }
                    ?? r22 = (List) obj2;
                    if (r22 != 0) {
                        c1813u = r22;
                    }
                    InetAddress inetAddress = (InetAddress) AbstractC1805m.m3047k0(c1813u);
                    if (inetAddress != null && (hostAddress = inetAddress.getHostAddress()) != null) {
                        return hostAddress;
                    }
                    return str;
                }
                return str;
            default:
                AbstractC1793a0.m2972L(obj);
                Pattern pattern2 = AbstractC1155ol.f6638a;
                EnumC1124nl m2013a2 = AbstractC1155ol.m2013a(str);
                if (m2013a2 != enumC1124nl2 && m2013a2 != enumC1124nl) {
                    try {
                        if (network != null) {
                            InetAddress[] allByName3 = network.getAllByName(str);
                            AbstractC3367j.m5099d(allByName3, "getAllByName(...)");
                            m2985m2 = AbstractC1804l.m3031X(allByName3);
                        } else {
                            InetAddress[] allByName4 = InetAddress.getAllByName(str);
                            AbstractC3367j.m5099d(allByName4, "getAllByName(...)");
                            m2985m2 = AbstractC1804l.m3031X(allByName4);
                        }
                    } catch (Throwable th2) {
                        m2985m2 = AbstractC1793a0.m2985m(th2);
                    }
                    if (!(m2985m2 instanceof C1689h)) {
                        obj2 = m2985m2;
                    }
                    ?? r23 = (List) obj2;
                    if (r23 != 0) {
                        c1813u = r23;
                    }
                    InetAddress inetAddress2 = (InetAddress) AbstractC1805m.m3047k0(c1813u);
                    if (inetAddress2 != null && (hostAddress2 = inetAddress2.getHostAddress()) != null) {
                        return hostAddress2;
                    }
                    return str;
                }
                return str;
        }
    }
}
