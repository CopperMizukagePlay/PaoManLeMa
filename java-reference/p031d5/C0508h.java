package p031d5;

import android.hardware.Camera;
import android.util.Log;
import com.paoman.lema.R;
import p001a0.C0019e1;
import p023c5.C0425q;
import p023c5.C0432x;
import p023c5.C0433y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.h */
/* loaded from: classes.dex */
public final class C0508h implements Camera.PreviewCallback {

    /* renamed from: a */
    public C0019e1 f1816a;

    /* renamed from: b */
    public C0432x f1817b;

    /* renamed from: c */
    public final /* synthetic */ C0509i f1818c;

    public C0508h(C0509i c0509i) {
        this.f1818c = c0509i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C0432x c0432x = this.f1817b;
        C0019e1 c0019e1 = this.f1816a;
        if (c0432x != null && c0019e1 != null) {
            try {
                if (bArr != null) {
                    C0433y c0433y = new C0433y(bArr, c0432x.f1470e, c0432x.f1471f, camera.getParameters().getPreviewFormat(), this.f1818c.f1830k);
                    if (this.f1818c.f1821b.facing == 1) {
                        c0433y.f1476e = true;
                    }
                    synchronized (((C0425q) c0019e1.f109e).f1456h) {
                        try {
                            C0425q c0425q = (C0425q) c0019e1.f109e;
                            if (c0425q.f1455g) {
                                c0425q.f1451c.obtainMessage(R.id.zxing_decode, c0433y).sendToTarget();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                throw new NullPointerException("No preview data received");
            } catch (RuntimeException e7) {
                Log.e("i", "Camera preview failed", e7);
                c0019e1.m46r();
                return;
            }
        }
        Log.d("i", "Got preview callback, but no handler or resolution available");
        if (c0019e1 != null) {
            new Exception("No resolution available");
            c0019e1.m46r();
        }
    }
}
