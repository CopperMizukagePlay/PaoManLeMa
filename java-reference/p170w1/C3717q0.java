package p170w1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p032d6.AbstractC0581w;
import p053g5.C1691j;
import p060h5.C1803k;
import p082k5.InterfaceC2318h;
import p085l0.C2369i1;
import p102n1.AbstractC2710c;
import p136r6.C3066c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.q0 */
/* loaded from: classes.dex */
public final class C3717q0 extends AbstractC0581w {

    /* renamed from: q */
    public static final C1691j f17663q = AbstractC2710c.m4327J(C3685i0.f17553l);

    /* renamed from: r */
    public static final C3066c f17664r = new C3066c(1);

    /* renamed from: g */
    public final Choreographer f17665g;

    /* renamed from: h */
    public final Handler f17666h;

    /* renamed from: m */
    public boolean f17671m;

    /* renamed from: n */
    public boolean f17672n;

    /* renamed from: p */
    public final C2369i1 f17674p;

    /* renamed from: i */
    public final Object f17667i = new Object();

    /* renamed from: j */
    public final C1803k f17668j = new C1803k();

    /* renamed from: k */
    public ArrayList f17669k = new ArrayList();

    /* renamed from: l */
    public ArrayList f17670l = new ArrayList();

    /* renamed from: o */
    public final ChoreographerFrameCallbackC3713p0 f17673o = new ChoreographerFrameCallbackC3713p0(this);

    public C3717q0(Choreographer choreographer, Handler handler) {
        this.f17665g = choreographer;
        this.f17666h = handler;
        this.f17674p = new C2369i1(choreographer, this);
    }

    /* renamed from: M */
    public static final void m5714M(C3717q0 c3717q0) {
        Object removeFirst;
        Runnable runnable;
        boolean z7;
        Object removeFirst2;
        do {
            synchronized (c3717q0.f17667i) {
                C1803k c1803k = c3717q0.f17668j;
                if (c1803k.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = c1803k.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c3717q0.f17667i) {
                    C1803k c1803k2 = c3717q0.f17668j;
                    if (c1803k2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = c1803k2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (c3717q0.f17667i) {
                if (c3717q0.f17668j.isEmpty()) {
                    z7 = false;
                    c3717q0.f17671m = false;
                } else {
                    z7 = true;
                }
            }
        } while (z7);
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        synchronized (this.f17667i) {
            this.f17668j.addLast(runnable);
            if (!this.f17671m) {
                this.f17671m = true;
                this.f17666h.post(this.f17673o);
                if (!this.f17672n) {
                    this.f17672n = true;
                    this.f17665g.postFrameCallback(this.f17673o);
                }
            }
        }
    }
}
