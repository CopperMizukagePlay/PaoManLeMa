package p051g3;

import android.view.WindowInsets;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.n0 */
/* loaded from: classes.dex */
public class C1648n0 extends C1646m0 {

    /* renamed from: s */
    public C0274b f10415s;

    public C1648n0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0, windowInsets);
        this.f10415s = null;
    }

    @Override // p051g3.C1664v0
    /* renamed from: b */
    public C1672z0 mo2686b() {
        return C1672z0.m2741c(null, this.f10404c.consumeStableInsets());
    }

    @Override // p051g3.C1664v0
    /* renamed from: c */
    public C1672z0 mo2687c() {
        return C1672z0.m2741c(null, this.f10404c.consumeSystemWindowInsets());
    }

    @Override // p051g3.C1664v0
    /* renamed from: l */
    public final C0274b mo2688l() {
        if (this.f10415s == null) {
            WindowInsets windowInsets = this.f10404c;
            this.f10415s = C0274b.m581b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f10415s;
    }

    @Override // p051g3.C1664v0
    /* renamed from: s */
    public boolean mo2689s() {
        return this.f10404c.isConsumed();
    }

    @Override // p051g3.C1664v0
    /* renamed from: z */
    public void mo2690z(C0274b c0274b) {
        this.f10415s = c0274b;
    }

    public C1648n0(C1672z0 c1672z0, C1648n0 c1648n0) {
        super(c1672z0, c1648n0);
        this.f10415s = null;
        this.f10415s = c1648n0.f10415s;
    }
}
