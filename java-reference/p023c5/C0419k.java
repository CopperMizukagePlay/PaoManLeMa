package p023c5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.paoman.lema.R;
import p001a0.C0019e1;
import p031d5.C0507g;
import p052g4.C1676d;
import p052g4.C1680h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.k */
/* loaded from: classes.dex */
public final class C0419k {

    /* renamed from: n */
    public static final /* synthetic */ int f1430n = 0;

    /* renamed from: a */
    public final CaptureActivity f1431a;

    /* renamed from: b */
    public final DecoratedBarcodeView f1432b;

    /* renamed from: h */
    public final C1680h f1438h;

    /* renamed from: i */
    public final C1676d f1439i;

    /* renamed from: j */
    public final Handler f1440j;

    /* renamed from: m */
    public boolean f1443m;

    /* renamed from: c */
    public int f1433c = -1;

    /* renamed from: d */
    public boolean f1434d = false;

    /* renamed from: e */
    public boolean f1435e = true;

    /* renamed from: f */
    public String f1436f = "";

    /* renamed from: g */
    public boolean f1437g = false;

    /* renamed from: k */
    public boolean f1441k = false;

    /* renamed from: l */
    public final C0019e1 f1442l = new C0019e1(this);

    public C0419k(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        C0414f c0414f = new C0414f(1, this);
        this.f1443m = false;
        this.f1431a = captureActivity;
        this.f1432b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f1413n.add(c0414f);
        this.f1440j = new Handler();
        this.f1438h = new C1680h(captureActivity, new RunnableC0416h(this, 0));
        this.f1439i = new C1676d(captureActivity);
    }

    /* renamed from: a */
    public final void m900a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f1432b;
        C0507g c0507g = decoratedBarcodeView.getBarcodeView().f1404e;
        if (c0507g != null && !c0507g.f1810g) {
            this.f1441k = true;
        } else {
            this.f1431a.finish();
        }
        decoratedBarcodeView.f1521e.m977g();
        this.f1438h.m2746a();
    }

    /* renamed from: b */
    public final void m901b(String str) {
        CaptureActivity captureActivity = this.f1431a;
        if (!captureActivity.isFinishing() && !this.f1437g && !this.f1441k) {
            if (str.isEmpty()) {
                str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
            builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: c5.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C0419k.this.f1431a.finish();
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: c5.j
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C0419k.this.f1431a.finish();
                }
            });
            builder.show();
        }
    }
}
