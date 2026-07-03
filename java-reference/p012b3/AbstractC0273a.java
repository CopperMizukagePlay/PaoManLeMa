package p012b3;

import android.content.Context;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0273a {
    /* renamed from: a */
    public static ContentCaptureSession m571a(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: b */
    public static String m572b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AutofillId m573c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j6) {
        return contentCaptureSession.newAutofillId(autofillId, j6);
    }

    /* renamed from: d */
    public static ViewStructure m574d(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j6) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j6);
    }

    /* renamed from: e */
    public static void m575e(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* renamed from: f */
    public static void m576f(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    /* renamed from: g */
    public static void m577g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    /* renamed from: h */
    public static void m578h(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    /* renamed from: i */
    public static Insets m579i(int i7, int i8, int i9, int i10) {
        return Insets.of(i7, i8, i9, i10);
    }
}
