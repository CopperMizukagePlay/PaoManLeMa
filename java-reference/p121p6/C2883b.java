package p121p6;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p079k1.C2258a;
import p106n6.AbstractC2721b;
import p128q6.C3009l;
import p150t5.InterfaceC3277a;
import p151t6.C3301o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p6.b */
/* loaded from: classes.dex */
public final class C2883b extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f15063e;

    /* renamed from: f */
    public final /* synthetic */ Object f15064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2883b(String str, Object obj, int i7) {
        super(str, true);
        this.f15063e = i7;
        this.f15064f = obj;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        switch (this.f15063e) {
            case 0:
                ((InterfaceC3277a) this.f15064f).mo52a();
                return -1L;
            case 1:
                C2258a c2258a = (C2258a) this.f15064f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) c2258a.f13097e).iterator();
                int i7 = 0;
                long j6 = Long.MIN_VALUE;
                C3009l c3009l = null;
                int i8 = 0;
                while (it.hasNext()) {
                    C3009l c3009l2 = (C3009l) it.next();
                    AbstractC3367j.m5099d(c3009l2, "connection");
                    synchronized (c3009l2) {
                        if (c2258a.m3665b(c3009l2, nanoTime) > 0) {
                            i8++;
                        } else {
                            i7++;
                            long j7 = nanoTime - c3009l2.f15531q;
                            if (j7 > j6) {
                                c3009l = c3009l2;
                                j6 = j7;
                            }
                        }
                    }
                }
                long j8 = c2258a.f13094b;
                if (j6 < j8 && i7 <= c2258a.f13093a) {
                    if (i7 > 0) {
                        return j8 - j6;
                    }
                    if (i8 <= 0) {
                        return -1L;
                    }
                    return j8;
                }
                AbstractC3367j.m5097b(c3009l);
                synchronized (c3009l) {
                    if (!c3009l.f15530p.isEmpty()) {
                        return 0L;
                    }
                    if (c3009l.f15531q + j6 != nanoTime) {
                        return 0L;
                    }
                    c3009l.f15524j = true;
                    ((ConcurrentLinkedQueue) c2258a.f13097e).remove(c3009l);
                    Socket socket = c3009l.f15518d;
                    AbstractC3367j.m5097b(socket);
                    AbstractC2721b.m4359e(socket);
                    if (!((ConcurrentLinkedQueue) c2258a.f13097e).isEmpty()) {
                        return 0L;
                    }
                    ((C2884c) c2258a.f13095c).m4556a();
                    return 0L;
                }
            default:
                C3301o c3301o = (C3301o) this.f15064f;
                c3301o.getClass();
                try {
                    c3301o.f16186B.m5037m(2, 0, false);
                    return -1L;
                } catch (IOException e7) {
                    c3301o.m5006b(2, 2, e7);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2883b(C2258a c2258a, String str) {
        super(str, true);
        this.f15063e = 1;
        this.f15064f = c2258a;
    }
}
