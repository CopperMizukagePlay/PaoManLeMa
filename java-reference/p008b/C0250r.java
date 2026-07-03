package p008b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p001a0.C0019e1;
import p051g3.C1620a1;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.r */
/* loaded from: classes.dex */
public final class C0250r extends AbstractC0257y {
    @Override // p008b.AbstractC0257y
    /* renamed from: b */
    public void mo524b(C0244l0 c0244l0, C0244l0 c0244l02, Window window, View view, boolean z7, boolean z8) {
        int i7;
        C1620a1 c1620a1;
        AbstractC3367j.m5100e(c0244l0, "statusBarStyle");
        AbstractC3367j.m5100e(c0244l02, "navigationBarStyle");
        AbstractC3367j.m5100e(window, "window");
        AbstractC3367j.m5100e(view, "view");
        AbstractC1793a0.m2969I(window, false);
        if (z7) {
            i7 = c0244l0.f948b;
        } else {
            i7 = c0244l0.f947a;
        }
        window.setStatusBarColor(i7);
        window.setNavigationBarColor(c0244l02.f948b);
        C0019e1 c0019e1 = new C0019e1(view);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 35) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i8 >= 30) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i8 >= 26) {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        } else {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        }
        c1620a1.mo2625G(!z7);
    }
}
