package p018c0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import p001a0.C0053n;
import p012b3.AbstractC0273a;
import p058h2.AbstractC1765b;
import p059h3.C1781g;
import p067i4.AbstractC2072e;
import p102n1.AbstractC2710c;
import p183y0.AbstractC3832a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.s */
/* loaded from: classes.dex */
public final class C0349s {

    /* renamed from: a */
    public final Object f1169a;

    /* renamed from: b */
    public final View f1170b;

    public C0349s(View view) {
        this.f1170b = view;
        this.f1169a = AbstractC2710c.m4326I(new C0053n(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g5.d] */
    /* renamed from: a */
    public InputMethodManager m787a() {
        return (InputMethodManager) this.f1169a.getValue();
    }

    /* renamed from: b */
    public AutofillId m788b(long j6) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession m2899f = AbstractC1765b.m2899f(this.f1169a);
            C1781g m3334l = AbstractC2072e.m3334l(this.f1170b);
            Objects.requireNonNull(m3334l);
            return AbstractC0273a.m573c(m2899f, AbstractC3832a.m5840a(m3334l.f10824a), j6);
        }
        return null;
    }

    public C0349s(ContentCaptureSession contentCaptureSession, View view) {
        this.f1169a = contentCaptureSession;
        this.f1170b = view;
    }
}
