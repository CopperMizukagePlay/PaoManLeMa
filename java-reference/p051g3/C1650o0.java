package p051g3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.o0 */
/* loaded from: classes.dex */
public class C1650o0 extends C1648n0 {
    public C1650o0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0, windowInsets);
    }

    @Override // p051g3.C1664v0
    /* renamed from: a */
    public C1672z0 mo2692a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f10404c.consumeDisplayCutout();
        return C1672z0.m2741c(null, consumeDisplayCutout);
    }

    @Override // p051g3.C1646m0, p051g3.C1664v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650o0)) {
            return false;
        }
        C1650o0 c1650o0 = (C1650o0) obj;
        if (Objects.equals(this.f10404c, c1650o0.f10404c) && Objects.equals(this.f10408g, c1650o0.f10408g) && C1646m0.m2661M(this.f10409h, c1650o0.f10409h)) {
            return true;
        }
        return false;
    }

    @Override // p051g3.C1664v0
    /* renamed from: h */
    public C1624c mo2693h() {
        DisplayCutout displayCutout;
        displayCutout = this.f10404c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1624c(displayCutout);
    }

    @Override // p051g3.C1664v0
    public int hashCode() {
        return this.f10404c.hashCode();
    }

    public C1650o0(C1672z0 c1672z0, C1650o0 c1650o0) {
        super(c1672z0, c1650o0);
    }
}
