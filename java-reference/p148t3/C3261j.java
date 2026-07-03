package p148t3;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.j */
/* loaded from: classes.dex */
public final class C3261j extends AbstractC3257f {

    /* renamed from: c */
    public final OnBackInvokedDispatcher f16104c;

    /* renamed from: d */
    public final int f16105d;

    /* renamed from: e */
    public final OnBackInvokedCallback f16106e;

    /* renamed from: f */
    public boolean f16107f;

    public C3261j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i7) {
        OnBackInvokedCallback c3263l;
        this.f16104c = onBackInvokedDispatcher;
        this.f16105d = i7;
        if (Build.VERSION.SDK_INT == 33) {
            c3263l = new C3262k(0, this);
        } else {
            c3263l = new C3263l(this);
        }
        this.f16106e = c3263l;
    }

    @Override // p148t3.AbstractC3257f
    /* renamed from: b */
    public final void mo508b(boolean z7) {
        if (z7 && !this.f16107f) {
            this.f16104c.registerOnBackInvokedCallback(this.f16105d, this.f16106e);
            this.f16107f = true;
        } else if (!z7 && this.f16107f) {
            this.f16104c.unregisterOnBackInvokedCallback(this.f16106e);
            this.f16107f = false;
        }
    }
}
