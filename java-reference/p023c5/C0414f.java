package p023c5;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.paoman.lema.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.f */
/* loaded from: classes.dex */
public final class C0414f {

    /* renamed from: a */
    public final /* synthetic */ int f1398a;

    /* renamed from: b */
    public final /* synthetic */ Object f1399b;

    public /* synthetic */ C0414f(int i7, Object obj) {
        this.f1398a = i7;
        this.f1399b = obj;
    }

    /* renamed from: a */
    public final void m890a() {
        int i7 = this.f1398a;
        Object obj = this.f1399b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ((BarcodeView) obj).f1413n;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    ((C0414f) obj2).m890a();
                }
                return;
            case 1:
                C0419k c0419k = (C0419k) obj;
                if (c0419k.f1441k) {
                    Log.d("k", "Camera closed; finishing activity");
                    c0419k.f1431a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final void m891c(Exception exc) {
        switch (this.f1398a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f1399b).f1413n;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((C0414f) obj).m891c(exc);
                }
                return;
            case 1:
                C0419k c0419k = (C0419k) this.f1399b;
                c0419k.m901b(c0419k.f1431a.getString(R.string.zxing_msg_camera_framework_bug));
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final void m892e() {
        switch (this.f1398a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f1399b).f1413n;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((C0414f) obj).m892e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f1399b;
                AbstractC0415g abstractC0415g = viewfinderView.f1533m;
                if (abstractC0415g != null) {
                    Rect framingRect = abstractC0415g.getFramingRect();
                    C0432x previewSize = viewfinderView.f1533m.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f1534n = framingRect;
                        viewfinderView.f1535o = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    /* renamed from: g */
    public final void m893g() {
        switch (this.f1398a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f1399b).f1413n;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((C0414f) obj).m893g();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    /* renamed from: j */
    public final void m894j() {
        switch (this.f1398a) {
            case 0:
                ArrayList arrayList = ((BarcodeView) this.f1399b).f1413n;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((C0414f) obj).m894j();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    /* renamed from: b */
    private final void m883b() {
    }

    /* renamed from: f */
    private final void m885f() {
    }

    /* renamed from: h */
    private final void m886h() {
    }

    /* renamed from: i */
    private final void m887i() {
    }

    /* renamed from: k */
    private final void m888k() {
    }

    /* renamed from: l */
    private final void m889l() {
    }

    /* renamed from: d */
    private final void m884d(Exception exc) {
    }
}
