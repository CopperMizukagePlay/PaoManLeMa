package p008b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p001a0.C0019e1;
import p051g3.C1620a1;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.v */
/* loaded from: classes.dex */
public class C0254v extends C0253u {
    @Override // p008b.C0251s, p008b.AbstractC0257y
    /* renamed from: b */
    public void mo524b(C0244l0 c0244l0, C0244l0 c0244l02, Window window, View view, boolean z7, boolean z8) {
        C1620a1 c1620a1;
        AbstractC3367j.m5100e(c0244l0, "statusBarStyle");
        AbstractC3367j.m5100e(c0244l02, "navigationBarStyle");
        AbstractC3367j.m5100e(window, "window");
        AbstractC3367j.m5100e(view, "view");
        AbstractC1793a0.m2969I(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C0019e1 c0019e1 = new C0019e1(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i7 >= 30) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i7 >= 26) {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        } else {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        }
        c1620a1.mo2625G(!z7);
        c1620a1.mo2624F(!z8);
    }
}
