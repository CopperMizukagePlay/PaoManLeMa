package p031d5;

import android.os.Handler;
import p052g4.C1673a;
import p052g4.C1679g;
import p052g4.C1680h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0505e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f1798e;

    /* renamed from: f */
    public final /* synthetic */ boolean f1799f;

    /* renamed from: g */
    public final /* synthetic */ Object f1800g;

    public /* synthetic */ RunnableC0505e(int i7, Object obj, boolean z7) {
        this.f1798e = i7;
        this.f1800g = obj;
        this.f1799f = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1798e) {
            case 0:
                C0507g c0507g = (C0507g) this.f1800g;
                c0507g.f1806c.m1093e(this.f1799f);
                return;
            case 1:
                C1673a c1673a = (C1673a) this.f1800g;
                c1673a.f10451a.m1093e(this.f1799f);
                return;
            default:
                C1680h c1680h = ((C1679g) this.f1800g).f10458a;
                c1680h.f10464f = this.f1799f;
                if (c1680h.f10461c) {
                    Handler handler = c1680h.f10462d;
                    handler.removeCallbacksAndMessages(null);
                    if (c1680h.f10464f) {
                        handler.postDelayed(c1680h.f10463e, 300000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
