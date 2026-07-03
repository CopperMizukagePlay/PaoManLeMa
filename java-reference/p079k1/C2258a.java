package p079k1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p049g1.C1568b;
import p092m.AbstractC2487d;
import p099m6.C2591a;
import p106n6.AbstractC2721b;
import p121p6.C2883b;
import p121p6.C2886e;
import p128q6.C3004g;
import p128q6.C3006i;
import p128q6.C3009l;
import p158u5.AbstractC3367j;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C2258a {

    /* renamed from: a */
    public int f13093a;

    /* renamed from: b */
    public long f13094b;

    /* renamed from: c */
    public Object f13095c;

    /* renamed from: d */
    public Object f13096d;

    /* renamed from: e */
    public final Object f13097e;

    public C2258a(C2886e c2886e, int i7) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC3367j.m5100e(c2886e, "taskRunner");
        AbstractC3367j.m5100e(timeUnit, "timeUnit");
        this.f13093a = i7;
        this.f13094b = timeUnit.toNanos(5L);
        this.f13095c = c2886e.m4565e();
        this.f13096d = new C2883b(this, AbstractC2487d.m4046j(new StringBuilder(), AbstractC2721b.f14575g, " ConnectionPool"));
        this.f13097e = new ConcurrentLinkedQueue();
    }

    /* renamed from: a */
    public boolean m3664a(C2591a c2591a, C3006i c3006i, ArrayList arrayList, boolean z7) {
        Iterator it = ((ConcurrentLinkedQueue) this.f13097e).iterator();
        while (true) {
            boolean z8 = false;
            if (!it.hasNext()) {
                return false;
            }
            C3009l c3009l = (C3009l) it.next();
            AbstractC3367j.m5099d(c3009l, "connection");
            synchronized (c3009l) {
                if (z7) {
                    try {
                        if (c3009l.f15521g != null) {
                            z8 = true;
                        }
                        if (!z8) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c3009l.m4694h(c2591a, arrayList)) {
                    c3006i.m4678b(c3009l);
                    return true;
                }
            }
        }
    }

    /* renamed from: b */
    public int m3665b(C3009l c3009l, long j6) {
        byte[] bArr = AbstractC2721b.f14569a;
        ArrayList arrayList = c3009l.f15530p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + c3009l.f15516b.f14094a.f14015h + " was leaked. Did you forget to close a response body?";
                C3395m c3395m = C3395m.f16494a;
                C3395m.f16494a.mo5122j(((C3004g) reference).f15492a, str);
                arrayList.remove(i7);
                c3009l.f15524j = true;
                if (arrayList.isEmpty()) {
                    c3009l.f15531q = j6 - this.f13094b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public C2258a() {
        this.f13094b = 0L;
        this.f13093a = 0;
        this.f13097e = new C1568b();
    }
}
