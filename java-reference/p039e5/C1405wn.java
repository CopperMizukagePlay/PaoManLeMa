package p039e5;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008b.C0226c0;
import p024c6.AbstractC0444k;
import p053g5.C1689h;
import p053g5.C1691j;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wn */
/* loaded from: classes.dex */
public final class C1405wn {

    /* renamed from: a */
    public final List f8503a;

    /* renamed from: b */
    public final int f8504b;

    /* renamed from: c */
    public final int f8505c;

    /* renamed from: d */
    public final boolean f8506d;

    /* renamed from: e */
    public final List f8507e;

    /* renamed from: f */
    public final C1691j f8508f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1405wn() {
        this(2000, 3, r3, r3, false);
        C1813u c1813u = C1813u.f10860e;
    }

    /* renamed from: a */
    public final String m2387a() {
        return AbstractC1805m.m3051o0(AbstractC1806n.m3067O(AbstractC1805m.m3051o0(m2389c(), "|", null, null, null, 62), String.valueOf(AbstractC2168e.m3530q(this.f8504b, 300, 10000)), String.valueOf(AbstractC2168e.m3530q(this.f8505c, 1, 10)), String.valueOf(this.f8506d), AbstractC1805m.m3051o0((List) this.f8508f.getValue(), "|", null, null, new C0866fc(22), 30)), "#", null, null, null, 62);
    }

    /* renamed from: b */
    public final boolean m2388b() {
        return !m2389c().isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2389c() {
        Object m2985m;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8503a.iterator();
        while (it.hasNext()) {
            String m945i0 = AbstractC0444k.m945i0(AbstractC0444k.m956t0((String) it.next()).toString(), "[", "]");
            Object obj = null;
            if (!AbstractC0444k.m937a0(m945i0)) {
                int ordinal = AbstractC1155ol.m2013a(m945i0).ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    try {
                        m2985m = InetAddress.getByName(m945i0).getHostAddress();
                    } catch (Throwable th) {
                        m2985m = AbstractC1793a0.m2985m(th);
                    }
                    if (!(m2985m instanceof C1689h)) {
                        obj = m2985m;
                    }
                    m945i0 = (String) obj;
                }
                if (m945i0 == null) {
                    arrayList.add(m945i0);
                }
            }
            m945i0 = null;
            if (m945i0 == null) {
            }
        }
        return AbstractC1805m.m3042f0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405wn)) {
            return false;
        }
        C1405wn c1405wn = (C1405wn) obj;
        if (AbstractC3367j.m5096a(this.f8503a, c1405wn.f8503a) && this.f8504b == c1405wn.f8504b && this.f8505c == c1405wn.f8505c && this.f8506d == c1405wn.f8506d && AbstractC3367j.m5096a(this.f8507e, c1405wn.f8507e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8507e.hashCode() + AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f8505c, AbstractC2647h.m4255a(this.f8504b, this.f8503a.hashCode() * 31, 31), 31), 31, this.f8506d);
    }

    public final String toString() {
        return "SpeedCustomDnsConfig(servers=" + this.f8503a + ", timeoutMs=" + this.f8504b + ", retryCount=" + this.f8505c + ", ecsEnabled=" + this.f8506d + ", ecsSubnets=" + this.f8507e + ")";
    }

    public C1405wn(int i7, int i8, List list, List list2, boolean z7) {
        AbstractC3367j.m5100e(list2, "ecsSubnets");
        this.f8503a = list;
        this.f8504b = i7;
        this.f8505c = i8;
        this.f8506d = z7;
        this.f8507e = list2;
        this.f8508f = AbstractC2710c.m4327J(new C0226c0(11, this));
    }
}
