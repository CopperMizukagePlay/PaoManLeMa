package p023c5;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.lifecycle.RunnableC0219y;
import com.journeyapps.barcodescanner.BarcodeView;
import p001a0.C0019e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.w */
/* loaded from: classes.dex */
public final class C0431w extends OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ C0427s f1469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0431w(C0427s c0427s, Context context) {
        super(context, 3);
        this.f1469a = c0427s;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        int rotation;
        C0427s c0427s = this.f1469a;
        WindowManager windowManager = (WindowManager) c0427s.f1462g;
        C0019e1 c0019e1 = (C0019e1) c0427s.f1464i;
        if (windowManager != null && c0019e1 != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != c0427s.f1461f) {
            c0427s.f1461f = rotation;
            ((BarcodeView) c0019e1.f109e).f1406g.postDelayed(new RunnableC0219y(4, c0019e1), 250L);
        }
    }
}
