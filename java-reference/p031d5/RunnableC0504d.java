package p031d5;

import android.hardware.Camera;
import android.util.Log;
import p001a0.C0019e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0504d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f1795e;

    /* renamed from: f */
    public final /* synthetic */ C0507g f1796f;

    /* renamed from: g */
    public final /* synthetic */ C0019e1 f1797g;

    public /* synthetic */ RunnableC0504d(C0507g c0507g, C0019e1 c0019e1, int i7) {
        this.f1795e = i7;
        this.f1796f = c0507g;
        this.f1797g = c0019e1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f1795e;
        C0019e1 c0019e1 = this.f1797g;
        C0507g c0507g = this.f1796f;
        switch (i7) {
            case 0:
                if (!c0507g.f1809f) {
                    Log.d("g", "Camera is closed, not requesting preview");
                    return;
                } else {
                    c0507g.f1804a.m905c(new RunnableC0504d(c0507g, c0019e1, 1));
                    return;
                }
            default:
                C0509i c0509i = c0507g.f1806c;
                Camera camera = c0509i.f1820a;
                if (camera != null && c0509i.f1824e) {
                    C0508h c0508h = c0509i.f1831l;
                    c0508h.f1816a = c0019e1;
                    camera.setOneShotPreviewCallback(c0508h);
                    return;
                }
                return;
        }
    }
}
