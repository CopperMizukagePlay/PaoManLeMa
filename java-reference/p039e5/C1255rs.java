package p039e5;

import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1807o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rs */
/* loaded from: classes.dex */
public final class C1255rs {

    /* renamed from: a */
    public final String f7435a;

    /* renamed from: b */
    public final String f7436b;

    /* renamed from: c */
    public final Network f7437c;

    /* renamed from: d */
    public final String f7438d;

    /* renamed from: e */
    public final List f7439e;

    /* renamed from: f */
    public final List f7440f;

    public C1255rs(String str, String str2, Network network, String str3, List list, List list2) {
        AbstractC3367j.m5100e(str, "targetId");
        AbstractC3367j.m5100e(str2, "targetName");
        this.f7435a = str;
        this.f7436b = str2;
        this.f7437c = network;
        this.f7438d = str3;
        this.f7439e = list;
        this.f7440f = list2;
    }

    /* renamed from: b */
    public static C1486zb m2302b(C1255rs c1255rs) {
        EnumC0876fm enumC0876fm;
        List list = c1255rs.f7439e;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0876fm = EnumC0876fm.f4043g;
            if (!hasNext) {
                break;
            }
            C1286ss c1286ss = (C1286ss) it.next();
            arrayList.add(new C1187pm(c1286ss.f7664a, c1286ss.f7665b, c1286ss.f7666c, c1286ss.f7667d, null, enumC0876fm));
        }
        List<C1286ss> list2 = c1255rs.f7440f;
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
        for (C1286ss c1286ss2 : list2) {
            arrayList2.add(new C1187pm(c1286ss2.f7664a, c1286ss2.f7665b, c1286ss2.f7666c, c1286ss2.f7667d, null, enumC0876fm));
        }
        return c1255rs.m2303a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public final C1486zb m2303a(List list, List list2) {
        AbstractC3367j.m5100e(list, "gatewayProbes");
        AbstractC3367j.m5100e(list2, "externalProbes");
        EnumC0876fm m2225J = AbstractC1249rm.m2225J(list);
        EnumC0876fm m2225J2 = AbstractC1249rm.m2225J(list2);
        List list3 = C0883ft.f4080j;
        return new C1486zb(this.f7435a, this.f7436b, list, list2, C1247rk.m2186g(m2225J, m2225J2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1255rs)) {
            return false;
        }
        C1255rs c1255rs = (C1255rs) obj;
        if (AbstractC3367j.m5096a(this.f7435a, c1255rs.f7435a) && AbstractC3367j.m5096a(this.f7436b, c1255rs.f7436b) && AbstractC3367j.m5096a(this.f7437c, c1255rs.f7437c) && AbstractC3367j.m5096a(this.f7438d, c1255rs.f7438d) && AbstractC3367j.m5096a(this.f7439e, c1255rs.f7439e) && AbstractC3367j.m5096a(this.f7440f, c1255rs.f7440f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m175b = AbstractC0094y0.m175b(this.f7435a.hashCode() * 31, 31, this.f7436b);
        int i7 = 0;
        Network network = this.f7437c;
        if (network == null) {
            hashCode = 0;
        } else {
            hashCode = network.hashCode();
        }
        int i8 = (m175b + hashCode) * 31;
        String str = this.f7438d;
        if (str != null) {
            i7 = str.hashCode();
        }
        return this.f7440f.hashCode() + AbstractC0094y0.m176c(this.f7439e, (i8 + i7) * 31, 31);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("PingChannelConfig(targetId=", this.f7435a, ", targetName=", this.f7436b, ", network=");
        m189p.append(this.f7437c);
        m189p.append(", interfaceName=");
        m189p.append(this.f7438d);
        m189p.append(", gatewayEndpoints=");
        m189p.append(this.f7439e);
        m189p.append(", externalEndpoints=");
        m189p.append(this.f7440f);
        m189p.append(")");
        return m189p.toString();
    }
}
