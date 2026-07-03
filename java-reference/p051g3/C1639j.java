package p051g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0019e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.j */
/* loaded from: classes.dex */
public final class C1639j extends C0019e1 {

    /* renamed from: f */
    public View f10391f;

    /* JADX WARN: Type inference failed for: r4v0, types: [g3.i] */
    @Override // p001a0.C0019e1
    /* renamed from: o */
    public final void mo43o() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f10391f;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: g3.i
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                    boolean z7;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i7 & 8) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    atomicBoolean2.set(z7);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.mo43o();
    }

    @Override // p001a0.C0019e1
    /* renamed from: u */
    public final void mo49u() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f10391f;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.mo49u();
    }
}
