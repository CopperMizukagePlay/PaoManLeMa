package p183y0;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import p028d2.C0484q;
import p036e2.C0685a;
import p059h3.C1781g;
import p067i4.AbstractC2072e;
import p077k.C2222x;
import p092m.AbstractC2487d;
import p100n.C2673p1;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C3834c extends AbstractC3840i {

    /* renamed from: a */
    public final C2673p1 f18045a;

    /* renamed from: b */
    public final C0484q f18046b;

    /* renamed from: c */
    public final C3728t f18047c;

    /* renamed from: d */
    public final C0685a f18048d;

    /* renamed from: e */
    public final String f18049e;

    /* renamed from: f */
    public final AutofillId f18050f;

    /* renamed from: g */
    public final C2222x f18051g;

    /* renamed from: h */
    public boolean f18052h;

    public C3834c(C2673p1 c2673p1, C0484q c0484q, C3728t c3728t, C0685a c0685a, String str) {
        AutofillId autofillId;
        this.f18045a = c2673p1;
        this.f18046b = c0484q;
        this.f18047c = c3728t;
        this.f18048d = c0685a;
        this.f18049e = str;
        new Rect();
        c3728t.setImportantForAutofill(1);
        C1781g m3334l = AbstractC2072e.m3334l(c3728t);
        if (m3334l != null) {
            autofillId = AbstractC3832a.m5840a(m3334l.f10824a);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.f18050f = autofillId;
            this.f18051g = new C2222x();
            return;
        }
        throw AbstractC2487d.m4041e("Required value was null.");
    }
}
