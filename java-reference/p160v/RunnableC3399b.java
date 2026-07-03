package p160v;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import p085l0.InterfaceC2417v1;
import p101n0.C2705e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.b */
/* loaded from: classes.dex */
public final class RunnableC3399b implements InterfaceC2417v1, Runnable, Choreographer.FrameCallback {

    /* renamed from: k */
    public static long f16515k;

    /* renamed from: e */
    public final View f16516e;

    /* renamed from: g */
    public boolean f16518g;

    /* renamed from: i */
    public boolean f16520i;

    /* renamed from: j */
    public long f16521j;

    /* renamed from: f */
    public final C2705e f16517f = new C2705e(new C3398a1[16]);

    /* renamed from: h */
    public final Choreographer f16519h = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC3399b(View view) {
        float f7;
        this.f16516e = view;
        if (f16515k == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            f16515k = 1000000000 / f7;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        if (this.f16520i) {
            this.f16521j = j6;
            this.f16516e.post(this);
        }
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: e */
    public final void mo2779e() {
        this.f16520i = true;
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: j */
    public final void mo2781j() {
        this.f16520i = false;
        this.f16516e.removeCallbacks(this);
        this.f16519h.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2705e c2705e = this.f16517f;
        if (c2705e.f14519g != 0 && this.f16518g && this.f16520i && this.f16516e.getWindowVisibility() == 0) {
            C3396a c3396a = new C3396a(this.f16521j + f16515k);
            boolean z7 = false;
            while (c2705e.f14519g != 0 && !z7) {
                if (c3396a.m5157a() <= 0 || ((C3398a1) c2705e.f14517e[0]).m5161b(c3396a)) {
                    z7 = true;
                } else {
                    c2705e.m4309k(0);
                }
            }
            if (z7) {
                this.f16519h.postFrameCallback(this);
                return;
            } else {
                this.f16518g = false;
                return;
            }
        }
        this.f16518g = false;
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: g */
    public final void mo2780g() {
    }
}
