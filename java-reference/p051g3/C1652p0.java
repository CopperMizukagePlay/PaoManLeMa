package p051g3;

import android.graphics.Insets;
import android.view.WindowInsets;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.p0 */
/* loaded from: classes.dex */
public class C1652p0 extends C1650o0 {

    /* renamed from: t */
    public C0274b f10420t;

    /* renamed from: u */
    public C0274b f10421u;

    /* renamed from: v */
    public C0274b f10422v;

    public C1652p0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0, windowInsets);
        this.f10420t = null;
        this.f10421u = null;
        this.f10422v = null;
    }

    @Override // p051g3.C1664v0
    /* renamed from: k */
    public C0274b mo2695k() {
        Insets mandatorySystemGestureInsets;
        if (this.f10421u == null) {
            mandatorySystemGestureInsets = this.f10404c.getMandatorySystemGestureInsets();
            this.f10421u = C0274b.m582c(mandatorySystemGestureInsets);
        }
        return this.f10421u;
    }

    @Override // p051g3.C1664v0
    /* renamed from: m */
    public C0274b mo2696m() {
        Insets systemGestureInsets;
        if (this.f10420t == null) {
            systemGestureInsets = this.f10404c.getSystemGestureInsets();
            this.f10420t = C0274b.m582c(systemGestureInsets);
        }
        return this.f10420t;
    }

    @Override // p051g3.C1664v0
    /* renamed from: o */
    public C0274b mo2697o() {
        Insets tappableElementInsets;
        if (this.f10422v == null) {
            tappableElementInsets = this.f10404c.getTappableElementInsets();
            this.f10422v = C0274b.m582c(tappableElementInsets);
        }
        return this.f10422v;
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    /* renamed from: r */
    public C1672z0 mo2676r(int i7, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f10404c.inset(i7, i8, i9, i10);
        return C1672z0.m2741c(null, inset);
    }

    public C1652p0(C1672z0 c1672z0, C1652p0 c1652p0) {
        super(c1672z0, c1652p0);
        this.f10420t = null;
        this.f10421u = null;
        this.f10422v = null;
    }

    @Override // p051g3.C1648n0, p051g3.C1664v0
    /* renamed from: z */
    public void mo2690z(C0274b c0274b) {
    }
}
