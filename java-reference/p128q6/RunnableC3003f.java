package p128q6;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.AbstractC0000a;
import p099m6.C2623x;
import p159u6.C3395m;
import p172w3.C3781e;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.f */
/* loaded from: classes.dex */
public final class RunnableC3003f implements Runnable {

    /* renamed from: e */
    public final C3781e f15489e;

    /* renamed from: f */
    public volatile AtomicInteger f15490f = new AtomicInteger(0);

    /* renamed from: g */
    public final /* synthetic */ C3006i f15491g;

    public RunnableC3003f(C3006i c3006i, C3781e c3781e) {
        this.f15491g = c3006i;
        this.f15489e = c3781e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2623x c2623x;
        String concat = "OkHttp ".concat(this.f15491g.f15495f.f14018a.m4176f());
        C3006i c3006i = this.f15491g;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            c3006i.f15499j.m233i();
            boolean z7 = false;
            try {
                try {
                } catch (Throwable th) {
                    c3006i.f15494e.f14200e.m4159c(this);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f15489e.m5784i(c3006i, c3006i.m4683g());
                c2623x = c3006i.f15494e;
            } catch (IOException e8) {
                e = e8;
                z7 = true;
                if (z7) {
                    C3395m c3395m = C3395m.f16494a;
                    C3395m c3395m2 = C3395m.f16494a;
                    String str = "Callback failure for " + C3006i.m4677a(c3006i);
                    c3395m2.getClass();
                    C3395m.m5156i(str, 4, e);
                } else {
                    ((C3887f) this.f15489e.f17917b).m5902c(e, null);
                }
                c2623x = c3006i.f15494e;
                c2623x.f14200e.m4159c(this);
            } catch (Throwable th3) {
                th = th3;
                z7 = true;
                c3006i.m4680d();
                if (!z7) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC0000a.m7h(iOException, th);
                    ((C3887f) this.f15489e.f17917b).m5902c(iOException, null);
                }
                throw th;
            }
            c2623x.f14200e.m4159c(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
