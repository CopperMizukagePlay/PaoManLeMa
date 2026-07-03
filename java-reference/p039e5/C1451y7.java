package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y7 */
/* loaded from: classes.dex */
public final class C1451y7 {

    /* renamed from: a */
    public final C2090c f9295a;

    /* renamed from: b */
    public final AtomicBoolean f9296b;

    /* renamed from: c */
    public C0565q1 f9297c;

    /* renamed from: d */
    public C0565q1 f9298d;

    /* renamed from: e */
    public final C1701c0 f9299e;

    /* renamed from: f */
    public final C1715p f9300f;

    public C1451y7() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f9295a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f9296b = new AtomicBoolean(false);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C0703a8(null, null, null, null, null, 2047));
        this.f9299e = m2771b;
        this.f9300f = new C1715p(m2771b);
    }

    /* renamed from: a */
    public static final String m2423a(C1451y7 c1451y7, C1434xl c1434xl) {
        List m3067O = AbstractC1806n.m3067O(c1434xl.f8841c, c1434xl.f8839a, c1434xl.f8840b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3067O) {
            if (!AbstractC0444k.m937a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC1805m.m3051o0(arrayList, " · ", null, null, null, 62);
    }

    /* renamed from: b */
    public static List m2424b(C0703a8 c0703a8) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0877fn c0877fn = c0703a8.f2340g;
        if (c0877fn != null && (str = c0877fn.f4045a) != null) {
            linkedHashSet.add(str);
        }
        Iterator it = c0703a8.f2338e.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C0877fn) it.next()).f4045a);
        }
        Iterator it2 = c0703a8.f2339f.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList = ((C1482z7) it2.next()).f9833c;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                linkedHashSet.add(((C0877fn) obj).f4045a);
            }
        }
        return AbstractC1805m.m3035C0(linkedHashSet);
    }

    /* renamed from: c */
    public final C1715p m2425c() {
        return this.f9300f;
    }

    /* renamed from: d */
    public final void m2426d() {
        C0565q1 c0565q1 = this.f9297c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f9297c = null;
        C0565q1 c0565q12 = this.f9298d;
        if (c0565q12 != null) {
            c0565q12.mo1114c(null);
        }
        this.f9298d = null;
        if (this.f9296b.getAndSet(false)) {
            C1701c0 c1701c0 = this.f9299e;
            C0703a8 m1494a = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 1778);
            c1701c0.getClass();
            c1701c0.m2752j(null, m1494a);
        }
    }
}
