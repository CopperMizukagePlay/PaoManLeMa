package p051g3;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.s0 */
/* loaded from: classes.dex */
public class C1658s0 extends C1656r0 {

    /* renamed from: x */
    public static final C1672z0 f10426x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f10426x = C1672z0.m2741c(null, windowInsets);
    }

    public C1658s0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0, windowInsets);
    }

    @Override // p051g3.C1654q0, p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: i */
    public C0274b mo2671i(int i7) {
        Insets insets;
        insets = this.f10404c.getInsets(AbstractC1670y0.m2733a(i7));
        return C0274b.m582c(insets);
    }

    @Override // p051g3.C1654q0, p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: j */
    public C0274b mo2672j(int i7) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f10404c.getInsetsIgnoringVisibility(AbstractC1670y0.m2733a(i7));
        return C0274b.m582c(insetsIgnoringVisibility);
    }

    @Override // p051g3.C1654q0, p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: u */
    public boolean mo2678u(int i7) {
        boolean isVisible;
        isVisible = this.f10404c.isVisible(AbstractC1670y0.m2733a(i7));
        return isVisible;
    }

    public C1658s0(C1672z0 c1672z0, C1658s0 c1658s0) {
        super(c1672z0, c1658s0);
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: p */
    public void mo2674p(View view) {
    }
}
