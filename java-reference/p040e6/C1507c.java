package p040e6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p017c.C0321f;
import p032d6.AbstractC0549l0;
import p032d6.AbstractC0581w;
import p032d6.C0548l;
import p032d6.C0584x;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0540i0;
import p032d6.RunnableC0562p1;
import p069i6.AbstractC2100m;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e6.c */
/* loaded from: classes.dex */
public final class C1507c extends AbstractC0581w implements InterfaceC0540i0 {

    /* renamed from: g */
    public final Handler f9989g;

    /* renamed from: h */
    public final String f9990h;

    /* renamed from: i */
    public final boolean f9991i;

    /* renamed from: j */
    public final C1507c f9992j;

    public C1507c(Handler handler, String str, boolean z7) {
        this.f9989g = handler;
        this.f9990h = str;
        this.f9991i = z7;
        this.f9992j = z7 ? this : new C1507c(handler, str, true);
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        if (!this.f9989g.post(runnable)) {
            m2439M(interfaceC2318h, runnable);
        }
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: K */
    public final boolean mo1244K(InterfaceC2318h interfaceC2318h) {
        if (this.f9991i && AbstractC3367j.m5096a(Looper.myLooper(), this.f9989g.getLooper())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public final void m2439M(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
        if (interfaceC0520b1 != null) {
            interfaceC0520b1.mo1114c(cancellationException);
        }
        C2325e c2325e = AbstractC0549l0.f1898a;
        ExecutorC2324d.f13302g.mo1233J(interfaceC2318h, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1507c) {
            C1507c c1507c = (C1507c) obj;
            if (c1507c.f9989g == this.f9989g && c1507c.f9991i == this.f9991i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int identityHashCode = System.identityHashCode(this.f9989g);
        if (this.f9991i) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return identityHashCode ^ i7;
    }

    @Override // p032d6.InterfaceC0540i0
    /* renamed from: n */
    public final void mo1168n(long j6, C0548l c0548l) {
        RunnableC0562p1 runnableC0562p1 = new RunnableC0562p1(1, c0548l, this);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f9989g.postDelayed(runnableC0562p1, j6)) {
            c0548l.m1224w(new C0321f(15, this, runnableC0562p1));
        } else {
            m2439M(c0548l.f1897i, runnableC0562p1);
        }
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        C1507c c1507c;
        String str;
        C2325e c2325e = AbstractC0549l0.f1898a;
        C1507c c1507c2 = AbstractC2100m.f12376a;
        if (this == c1507c2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1507c = c1507c2.f9992j;
            } catch (UnsupportedOperationException unused) {
                c1507c = null;
            }
            if (this == c1507c) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f9990h;
            if (str2 == null) {
                str2 = this.f9989g.toString();
            }
            if (this.f9991i) {
                return AbstractC2487d.m4043g(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public C1507c(Handler handler) {
        this(handler, null, false);
    }
}
