package p051g3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p001a0.C0019e1;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.a1 */
/* loaded from: classes.dex */
public class C1620a1 extends AbstractC3784a {

    /* renamed from: u */
    public final /* synthetic */ int f10360u;

    /* renamed from: v */
    public final Window f10361v;

    /* renamed from: w */
    public final Object f10362w;

    public C1620a1(Window window, C0019e1 c0019e1, int i7) {
        WindowInsetsController insetsController;
        this.f10360u = i7;
        switch (i7) {
            case 1:
                insetsController = window.getInsetsController();
                this.f10362w = insetsController;
                this.f10361v = window;
                return;
            default:
                this.f10361v = window;
                this.f10362w = c0019e1;
                return;
        }
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: F */
    public void mo2624F(boolean z7) {
        switch (this.f10360u) {
            case 1:
                Window window = this.f10361v;
                if (window != null) {
                    if (z7) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                        return;
                    } else {
                        m2629L(16);
                        return;
                    }
                }
                if (z7) {
                    ((WindowInsetsController) this.f10362w).setSystemBarsAppearance(16, 16);
                    return;
                } else {
                    ((WindowInsetsController) this.f10362w).setSystemBarsAppearance(0, 16);
                    return;
                }
            default:
                return;
        }
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: G */
    public void mo2625G(boolean z7) {
        switch (this.f10360u) {
            case 0:
                if (z7) {
                    Window window = this.f10361v;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    m2628K(8192);
                    return;
                }
                m2629L(8192);
                return;
            default:
                Window window2 = this.f10361v;
                if (window2 != null) {
                    if (z7) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                        return;
                    } else {
                        m2629L(8192);
                        return;
                    }
                }
                if (z7) {
                    ((WindowInsetsController) this.f10362w).setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    ((WindowInsetsController) this.f10362w).setSystemBarsAppearance(0, 8);
                    return;
                }
        }
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: H */
    public void mo2626H() {
        switch (this.f10360u) {
            case 0:
                this.f10361v.getDecorView().setTag(356039078, 2);
                m2629L(2048);
                m2628K(4096);
                return;
            default:
                Window window = this.f10361v;
                if (window == null) {
                    ((WindowInsetsController) this.f10362w).setSystemBarsBehavior(2);
                    return;
                }
                window.getDecorView().setTag(356039078, 2);
                m2629L(2048);
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
                return;
        }
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: I */
    public final void mo2627I() {
        switch (this.f10360u) {
            case 0:
                for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                    if ((519 & i7) != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 8) {
                                    ((C0019e1) ((C0019e1) this.f10362w).f109e).mo49u();
                                }
                            } else {
                                m2629L(2);
                            }
                        } else {
                            m2629L(4);
                            this.f10361v.clearFlags(1024);
                        }
                    }
                }
                return;
            default:
                ((WindowInsetsController) this.f10362w).show(519);
                return;
        }
    }

    /* renamed from: K */
    public void m2628K(int i7) {
        View decorView = this.f10361v.getDecorView();
        decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
    }

    /* renamed from: L */
    public final void m2629L(int i7) {
        switch (this.f10360u) {
            case 0:
                View decorView = this.f10361v.getDecorView();
                decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
                return;
            default:
                View decorView2 = this.f10361v.getDecorView();
                decorView2.setSystemUiVisibility((~i7) & decorView2.getSystemUiVisibility());
                return;
        }
    }

    @Override // p174w5.AbstractC3784a
    /* renamed from: v */
    public final void mo2630v() {
        switch (this.f10360u) {
            case 0:
                for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                    if ((519 & i7) != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 8) {
                                    ((C0019e1) ((C0019e1) this.f10362w).f109e).mo43o();
                                }
                            } else {
                                m2628K(2);
                            }
                        } else {
                            m2628K(4);
                        }
                    }
                }
                return;
            default:
                ((WindowInsetsController) this.f10362w).hide(519);
                return;
        }
    }
}
