package p051g3;

import android.view.WindowInsetsController;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.c1 */
/* loaded from: classes.dex */
public final class C1626c1 extends C1620a1 {
    @Override // p051g3.C1620a1, p174w5.AbstractC3784a
    /* renamed from: F */
    public final void mo2624F(boolean z7) {
        int i7;
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f10362w;
        if (z7) {
            i7 = 16;
        } else {
            i7 = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i7, 16);
    }

    @Override // p051g3.C1620a1, p174w5.AbstractC3784a
    /* renamed from: G */
    public final void mo2625G(boolean z7) {
        int i7;
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f10362w;
        if (z7) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i7, 8);
    }

    @Override // p051g3.C1620a1, p174w5.AbstractC3784a
    /* renamed from: H */
    public final void mo2626H() {
        ((WindowInsetsController) this.f10362w).setSystemBarsBehavior(2);
    }
}
