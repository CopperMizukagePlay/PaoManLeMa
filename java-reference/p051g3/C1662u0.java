package p051g3;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.u0 */
/* loaded from: classes.dex */
public final class C1662u0 extends C1658s0 {
    public C1662u0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0, windowInsets);
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: f */
    public List<Rect> mo2669f(int i7) {
        List<Rect> boundingRects;
        boundingRects = this.f10404c.getBoundingRects(AbstractC1670y0.m2733a(i7));
        return boundingRects;
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: g */
    public List<Rect> mo2670g(int i7) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.f10404c.getBoundingRectsIgnoringVisibility(AbstractC1670y0.m2733a(i7));
        return boundingRectsIgnoringVisibility;
    }

    public C1662u0(C1672z0 c1672z0, C1662u0 c1662u0) {
        super(c1672z0, c1662u0);
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: q */
    public void mo2675q() {
    }
}
