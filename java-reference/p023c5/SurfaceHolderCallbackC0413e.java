package p023c5;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.e */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0413e implements SurfaceHolder.Callback {

    /* renamed from: a */
    public final /* synthetic */ BarcodeView f1397a;

    public SurfaceHolderCallbackC0413e(BarcodeView barcodeView) {
        this.f1397a = barcodeView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        if (surfaceHolder == null) {
            int i10 = AbstractC0415g.f1400D;
            Log.e("g", "*** WARNING *** surfaceChanged() gave us a null surface!");
        } else {
            C0432x c0432x = new C0432x(i8, i9);
            BarcodeView barcodeView = this.f1397a;
            barcodeView.f1419t = c0432x;
            barcodeView.m899e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f1397a.f1419t = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
