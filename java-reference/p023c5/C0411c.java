package p023c5;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paoman.lema.R;
import java.util.List;
import p001a0.C0068q2;
import p031d5.AbstractC0514n;
import p031d5.C0512l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.c */
/* loaded from: classes.dex */
public final class C0411c implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f1394a;

    /* renamed from: b */
    public final /* synthetic */ BarcodeView f1395b;

    public /* synthetic */ C0411c(BarcodeView barcodeView, int i7) {
        this.f1394a = i7;
        this.f1395b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z7;
        C0068q2 c0068q2;
        C0512l c0512l;
        int i7 = this.f1394a;
        BarcodeView barcodeView = this.f1395b;
        switch (i7) {
            case 0:
                int i8 = message.what;
                if (i8 == R.id.zxing_decode_succeeded) {
                    C0410b c0410b = (C0410b) message.obj;
                    if (c0410b != null && (c0068q2 = barcodeView.f1515F) != null) {
                        z7 = true;
                        if (barcodeView.f1514E != 1) {
                            c0068q2.mo32c(c0410b);
                            if (barcodeView.f1514E == 2) {
                                barcodeView.f1514E = 1;
                                barcodeView.f1515F = null;
                                barcodeView.m979i();
                                return true;
                            }
                        }
                    }
                    z7 = true;
                } else {
                    if (i8 != R.id.zxing_decode_failed) {
                        if (i8 != R.id.zxing_possible_result_points) {
                            return false;
                        }
                        List list = (List) message.obj;
                        C0068q2 c0068q22 = barcodeView.f1515F;
                        if (c0068q22 != null) {
                            z7 = true;
                            if (barcodeView.f1514E != 1) {
                                c0068q22.mo42n(list);
                            }
                        }
                    }
                    z7 = true;
                }
                return z7;
            default:
                C0414f c0414f = barcodeView.f1403C;
                int i9 = message.what;
                if (i9 == R.id.zxing_prewiew_size_ready) {
                    C0432x c0432x = (C0432x) message.obj;
                    barcodeView.f1417r = c0432x;
                    C0432x c0432x2 = barcodeView.f1416q;
                    if (c0432x2 != null) {
                        if (c0432x != null && (c0512l = barcodeView.f1414o) != null) {
                            int i10 = c0432x.f1470e;
                            int i11 = c0432x.f1471f;
                            int i12 = c0432x2.f1470e;
                            int i13 = c0432x2.f1471f;
                            Rect mo1096b = ((AbstractC0514n) c0512l.f1837d).mo1096b(c0432x, (C0432x) c0512l.f1836c);
                            if (mo1096b.width() > 0 && mo1096b.height() > 0) {
                                barcodeView.f1418s = mo1096b;
                                Rect rect = new Rect(0, 0, i12, i13);
                                Rect rect2 = barcodeView.f1418s;
                                Rect rect3 = new Rect(rect);
                                rect3.intersect(rect2);
                                if (barcodeView.f1422w != null) {
                                    rect3.inset(Math.max(0, (rect3.width() - barcodeView.f1422w.f1470e) / 2), Math.max(0, (rect3.height() - barcodeView.f1422w.f1471f) / 2));
                                } else {
                                    int min = (int) Math.min(rect3.width() * barcodeView.f1423x, rect3.height() * barcodeView.f1423x);
                                    rect3.inset(min, min);
                                    if (rect3.height() > rect3.width()) {
                                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                                    }
                                }
                                barcodeView.f1420u = rect3;
                                Rect rect4 = new Rect(barcodeView.f1420u);
                                Rect rect5 = barcodeView.f1418s;
                                rect4.offset(-rect5.left, -rect5.top);
                                Rect rect6 = new Rect((rect4.left * i10) / barcodeView.f1418s.width(), (rect4.top * i11) / barcodeView.f1418s.height(), (rect4.right * i10) / barcodeView.f1418s.width(), (rect4.bottom * i11) / barcodeView.f1418s.height());
                                barcodeView.f1421v = rect6;
                                if (rect6.width() > 0 && barcodeView.f1421v.height() > 0) {
                                    c0414f.m892e();
                                } else {
                                    barcodeView.f1421v = null;
                                    barcodeView.f1420u = null;
                                    Log.w("g", "Preview frame is too small");
                                }
                            }
                            barcodeView.requestLayout();
                            barcodeView.m899e();
                        } else {
                            barcodeView.f1421v = null;
                            barcodeView.f1420u = null;
                            barcodeView.f1418s = null;
                            throw new IllegalStateException("containerSize or previewSize is not set yet");
                        }
                    }
                    return true;
                }
                if (i9 == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (barcodeView.f1404e != null) {
                        barcodeView.m977g();
                        c0414f.m891c(exc);
                    }
                } else if (i9 == R.id.zxing_camera_closed) {
                    c0414f.m890a();
                }
                return false;
        }
    }
}
