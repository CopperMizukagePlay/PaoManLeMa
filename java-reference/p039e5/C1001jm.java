package p039e5;

import java.util.concurrent.atomic.AtomicBoolean;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jm */
/* loaded from: classes.dex */
public final class C1001jm {

    /* renamed from: a */
    public final C2090c f5108a;

    /* renamed from: b */
    public final AtomicBoolean f5109b;

    /* renamed from: c */
    public C0565q1 f5110c;

    /* renamed from: d */
    public final C1701c0 f5111d;

    /* renamed from: e */
    public final C1715p f5112e;

    public C1001jm() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f5108a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f5109b = new AtomicBoolean(false);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1156om(false, null, null, null, 0, 0, false, null, false, 131071));
        this.f5111d = m2771b;
        this.f5112e = new C1715p(m2771b);
    }

    /* renamed from: a */
    public final C1715p m1615a() {
        return this.f5112e;
    }

    /* renamed from: b */
    public final void m1616b() {
        this.f5109b.set(false);
        C0565q1 c0565q1 = this.f5110c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f5110c = null;
        C1701c0 c1701c0 = this.f5111d;
        C1156om m2016a = C1156om.m2016a((C1156om) c1701c0.getValue(), null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, "已停止", 98302);
        c1701c0.getClass();
        c1701c0.m2752j(null, m2016a);
    }
}
