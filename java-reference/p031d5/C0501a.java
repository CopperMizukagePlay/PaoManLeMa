package p031d5;

import android.hardware.Camera;
import androidx.lifecycle.RunnableC0219y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.a */
/* loaded from: classes.dex */
public final class C0501a implements Camera.AutoFocusCallback {

    /* renamed from: a */
    public final /* synthetic */ C0502b f1786a;

    public C0501a(C0502b c0502b) {
        this.f1786a = c0502b;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z7, Camera camera) {
        this.f1786a.f1792e.post(new RunnableC0219y(5, this));
    }
}
