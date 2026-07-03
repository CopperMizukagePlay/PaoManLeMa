package p031d5;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import com.paoman.lema.R;
import p001a0.C0068q2;
import p023c5.C0427s;
import p023c5.C0432x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.f */
/* loaded from: classes.dex */
public final class RunnableC0506f implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f1801e;

    /* renamed from: f */
    public final /* synthetic */ C0507g f1802f;

    public /* synthetic */ RunnableC0506f(C0507g c0507g, int i7) {
        this.f1801e = i7;
        this.f1802f = c0507g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = false;
        C0432x c0432x = null;
        switch (this.f1801e) {
            case 0:
                C0507g c0507g = this.f1802f;
                try {
                    Log.d("g", "Opening camera");
                    c0507g.f1806c.m1091c();
                    return;
                } catch (Exception e7) {
                    Handler handler = c0507g.f1807d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e7).sendToTarget();
                    }
                    Log.e("g", "Failed to open camera", e7);
                    return;
                }
            case 1:
                C0507g c0507g2 = this.f1802f;
                C0509i c0509i = c0507g2.f1806c;
                try {
                    Log.d("g", "Configuring camera");
                    c0509i.m1090b();
                    Handler handler2 = c0507g2.f1807d;
                    if (handler2 != null) {
                        C0432x c0432x2 = c0509i.f1829j;
                        if (c0432x2 != null) {
                            int i7 = c0509i.f1830k;
                            if (i7 != -1) {
                                if (i7 % 180 != 0) {
                                    z7 = true;
                                }
                                if (z7) {
                                    c0432x = new C0432x(c0432x2.f1471f, c0432x2.f1470e);
                                } else {
                                    c0432x = c0432x2;
                                }
                            } else {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, c0432x).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    Handler handler3 = c0507g2.f1807d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e8).sendToTarget();
                    }
                    Log.e("g", "Failed to configure camera", e8);
                    return;
                }
            case 2:
                C0507g c0507g3 = this.f1802f;
                C0509i c0509i2 = c0507g3.f1806c;
                try {
                    Log.d("g", "Starting preview");
                    C0068q2 c0068q2 = c0507g3.f1805b;
                    Camera camera = c0509i2.f1820a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) c0068q2.f344f;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) c0068q2.f345g);
                    }
                    c0509i2.m1094f();
                    return;
                } catch (Exception e9) {
                    Handler handler4 = c0507g3.f1807d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e9).sendToTarget();
                    }
                    Log.e("g", "Failed to start preview", e9);
                    return;
                }
            default:
                try {
                    Log.d("g", "Closing camera");
                    C0509i c0509i3 = this.f1802f.f1806c;
                    C0502b c0502b = c0509i3.f1822c;
                    if (c0502b != null) {
                        c0502b.m1086c();
                        c0509i3.f1822c = null;
                    }
                    if (c0509i3.f1823d != null) {
                        c0509i3.f1823d = null;
                    }
                    Camera camera2 = c0509i3.f1820a;
                    if (camera2 != null && c0509i3.f1824e) {
                        camera2.stopPreview();
                        c0509i3.f1831l.f1816a = null;
                        c0509i3.f1824e = false;
                    }
                    C0509i c0509i4 = this.f1802f.f1806c;
                    Camera camera3 = c0509i4.f1820a;
                    if (camera3 != null) {
                        camera3.release();
                        c0509i4.f1820a = null;
                    }
                } catch (Exception e10) {
                    Log.e("g", "Failed to close camera", e10);
                }
                C0507g c0507g4 = this.f1802f;
                c0507g4.f1810g = true;
                c0507g4.f1807d.sendEmptyMessage(R.id.zxing_camera_closed);
                C0427s c0427s = this.f1802f.f1804a;
                synchronized (c0427s.f1464i) {
                    int i8 = c0427s.f1461f - 1;
                    c0427s.f1461f = i8;
                    if (i8 == 0) {
                        synchronized (c0427s.f1464i) {
                            ((HandlerThread) c0427s.f1463h).quit();
                            c0427s.f1463h = null;
                            c0427s.f1462g = null;
                        }
                    }
                }
                return;
        }
    }
}
