package p031d5;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p023c5.C0432x;
import p052g4.C1673a;
import p102n1.AbstractC2710c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.i */
/* loaded from: classes.dex */
public final class C0509i {

    /* renamed from: m */
    public static final /* synthetic */ int f1819m = 0;

    /* renamed from: a */
    public Camera f1820a;

    /* renamed from: b */
    public Camera.CameraInfo f1821b;

    /* renamed from: c */
    public C0502b f1822c;

    /* renamed from: d */
    public C1673a f1823d;

    /* renamed from: e */
    public boolean f1824e;

    /* renamed from: f */
    public String f1825f;

    /* renamed from: h */
    public C0512l f1827h;

    /* renamed from: i */
    public C0432x f1828i;

    /* renamed from: j */
    public C0432x f1829j;

    /* renamed from: g */
    public C0510j f1826g = new C0510j();

    /* renamed from: k */
    public int f1830k = -1;

    /* renamed from: l */
    public final C0508h f1831l = new C0508h(this);

    public C0509i(Context context) {
    }

    /* renamed from: a */
    public final int m1089a() {
        int i7;
        int i8 = this.f1827h.f1835b;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        i9 = 270;
                    }
                } else {
                    i9 = 180;
                }
            } else {
                i9 = 90;
            }
        }
        Camera.CameraInfo cameraInfo = this.f1821b;
        if (cameraInfo.facing == 1) {
            i7 = (360 - ((cameraInfo.orientation + i9) % 360)) % 360;
        } else {
            i7 = ((cameraInfo.orientation - i9) + 360) % 360;
        }
        Log.i("i", "Camera Display Orientation: " + i7);
        return i7;
    }

    /* renamed from: b */
    public final void m1090b() {
        if (this.f1820a != null) {
            try {
                int m1089a = m1089a();
                this.f1830k = m1089a;
                this.f1820a.setDisplayOrientation(m1089a);
            } catch (Exception unused) {
                Log.w("i", "Failed to set rotation.");
            }
            try {
                m1092d(false);
            } catch (Exception unused2) {
                try {
                    m1092d(true);
                } catch (Exception unused3) {
                    Log.w("i", "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.f1820a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.f1829j = this.f1828i;
            } else {
                this.f1829j = new C0432x(previewSize.width, previewSize.height);
            }
            this.f1831l.f1817b = this.f1829j;
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: c */
    public final void m1091c() {
        Camera open;
        int m4340n = AbstractC2710c.m4340n(this.f1826g.f1832a);
        if (m4340n == -1) {
            open = null;
        } else {
            open = Camera.open(m4340n);
        }
        this.f1820a = open;
        if (open != null) {
            int m4340n2 = AbstractC2710c.m4340n(this.f1826g.f1832a);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f1821b = cameraInfo;
            Camera.getCameraInfo(m4340n2, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: d */
    public final void m1092d(boolean z7) {
        boolean z8;
        String str;
        Camera.Parameters parameters = this.f1820a.getParameters();
        String str2 = this.f1825f;
        if (str2 == null) {
            this.f1825f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("i", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("i", "Initial camera parameters: " + parameters.flatten());
        if (z7) {
            Log.w("i", "In camera config safe mode -- most settings will not be honored");
        }
        this.f1826g.getClass();
        int i7 = AbstractC0503c.f1794a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String m1087a = AbstractC0503c.m1087a("focus mode", supportedFocusModes, "auto");
        if (!z7 && m1087a == null) {
            m1087a = AbstractC0503c.m1087a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (m1087a != null) {
            if (m1087a.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(m1087a));
            } else {
                parameters.setFocusMode(m1087a);
            }
        }
        if (!z7) {
            AbstractC0503c.m1088b(parameters, false);
            this.f1826g.getClass();
            this.f1826g.getClass();
            this.f1826g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new C0432x(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new C0432x(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f1828i = null;
        } else {
            C0512l c0512l = this.f1827h;
            int i8 = this.f1830k;
            if (i8 != -1) {
                if (i8 % 180 != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                C0432x c0432x = (C0432x) c0512l.f1836c;
                if (c0432x == null) {
                    c0432x = null;
                } else if (z8) {
                    c0432x = new C0432x(c0432x.f1471f, c0432x.f1470e);
                }
                AbstractC0514n abstractC0514n = (AbstractC0514n) c0512l.f1837d;
                abstractC0514n.getClass();
                if (c0432x != null) {
                    Collections.sort(arrayList, new C0513m(abstractC0514n, c0432x));
                }
                Log.i("n", "Viewfinder size: " + c0432x);
                Log.i("n", "Preview in order of preference: " + arrayList);
                C0432x c0432x2 = (C0432x) arrayList.get(0);
                this.f1828i = c0432x2;
                parameters.setPreviewSize(c0432x2.f1470e, c0432x2.f1471f);
            } else {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                str = sb2.toString();
            } else {
                str = "[]";
            }
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i9 = next[0];
                    int i10 = next[1];
                    if (i9 >= 10000 && i10 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("i", "Final camera parameters: " + parameters.flatten());
        this.f1820a.setParameters(parameters);
    }

    /* renamed from: e */
    public final void m1093e(boolean z7) {
        boolean z8;
        String flashMode;
        Camera camera = this.f1820a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters != null && (flashMode = parameters.getFlashMode()) != null && ("on".equals(flashMode) || "torch".equals(flashMode))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z7 != z8) {
                    C0502b c0502b = this.f1822c;
                    if (c0502b != null) {
                        c0502b.m1086c();
                    }
                    Camera.Parameters parameters2 = this.f1820a.getParameters();
                    AbstractC0503c.m1088b(parameters2, z7);
                    this.f1826g.getClass();
                    this.f1820a.setParameters(parameters2);
                    C0502b c0502b2 = this.f1822c;
                    if (c0502b2 != null) {
                        c0502b2.f1788a = false;
                        c0502b2.m1085b();
                    }
                }
            } catch (RuntimeException e7) {
                Log.e("i", "Failed to set torch", e7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, g4.a] */
    /* renamed from: f */
    public final void m1094f() {
        Camera camera = this.f1820a;
        if (camera != null && !this.f1824e) {
            camera.startPreview();
            this.f1824e = true;
            this.f1822c = new C0502b(this.f1820a, this.f1826g);
            C0510j c0510j = this.f1826g;
            ?? obj = new Object();
            obj.f10451a = this;
            obj.f10452b = new Handler();
            this.f1823d = obj;
            c0510j.getClass();
        }
    }
}
