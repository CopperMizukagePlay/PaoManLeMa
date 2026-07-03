package p121p6;

import android.view.MotionEvent;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p6.d */
/* loaded from: classes.dex */
public final class RunnableC2885d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f15071e;

    /* renamed from: f */
    public final /* synthetic */ Object f15072f;

    public /* synthetic */ RunnableC2885d(int i7, Object obj) {
        this.f15071e = i7;
        this.f15072f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2882a m4563c;
        long j6;
        switch (this.f15071e) {
            case 0:
                break;
            default:
                C3728t c3728t = (C3728t) this.f15072f;
                c3728t.removeCallbacks(this);
                MotionEvent motionEvent = c3728t.f17776w0;
                if (motionEvent != null) {
                    boolean z7 = false;
                    if (motionEvent.getToolType(0) == 3) {
                        z7 = true;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (z7) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i7 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i7 = 2;
                    }
                    C3728t c3728t2 = (C3728t) this.f15072f;
                    c3728t2.m5735J(motionEvent, i7, c3728t2.f17778x0, false);
                    return;
                }
                return;
        }
        while (true) {
            C2886e c2886e = (C2886e) this.f15072f;
            synchronized (c2886e) {
                m4563c = c2886e.m4563c();
            }
            if (m4563c == null) {
                return;
            }
            C2884c c2884c = m4563c.f15061c;
            AbstractC3367j.m5097b(c2884c);
            C2886e c2886e2 = (C2886e) this.f15072f;
            boolean isLoggable = C2886e.f15075j.isLoggable(Level.FINE);
            if (isLoggable) {
                j6 = System.nanoTime();
                AbstractC2064e.m3238h(m4563c, c2884c, "starting");
            } else {
                j6 = -1;
            }
            try {
                C2886e.m4561a(c2886e2, m4563c);
                if (isLoggable) {
                    AbstractC2064e.m3238h(m4563c, c2884c, "finished run in ".concat(AbstractC2064e.m3248v(System.nanoTime() - j6)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) c2886e2.f15076a.f14390f).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        AbstractC2064e.m3238h(m4563c, c2884c, "failed a run in ".concat(AbstractC2064e.m3248v(System.nanoTime() - j6)));
                    }
                    throw th2;
                }
            }
        }
    }
}
