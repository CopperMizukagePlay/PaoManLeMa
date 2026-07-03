package p051g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.z0 */
/* loaded from: classes.dex */
public final class C1672z0 {

    /* renamed from: b */
    public static final C1672z0 f10449b;

    /* renamed from: a */
    public final C1664v0 f10450a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f10449b = C1658s0.f10426x;
        } else if (i7 >= 30) {
            f10449b = C1654q0.f10424w;
        } else {
            f10449b = C1664v0.f10435b;
        }
    }

    public C1672z0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f10450a = new C1662u0(this, windowInsets);
            return;
        }
        if (i7 >= 34) {
            this.f10450a = new C1658s0(this, windowInsets);
            return;
        }
        if (i7 >= 31) {
            this.f10450a = new C1656r0(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.f10450a = new C1654q0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f10450a = new C1652p0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f10450a = new C1650o0(this, windowInsets);
        } else {
            this.f10450a = new C1648n0(this, windowInsets);
        }
    }

    /* renamed from: a */
    public static C0274b m2740a(C0274b c0274b, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, c0274b.f1015a - i7);
        int max2 = Math.max(0, c0274b.f1016b - i8);
        int max3 = Math.max(0, c0274b.f1017c - i9);
        int max4 = Math.max(0, c0274b.f1018d - i10);
        if (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) {
            return c0274b;
        }
        return C0274b.m581b(max, max2, max3, max4);
    }

    /* renamed from: c */
    public static C1672z0 m2741c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1672z0 c1672z0 = new C1672z0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i7 = AbstractC1653q.f10423a;
            C1672z0 m2653a = AbstractC1645m.m2653a(view);
            C1664v0 c1664v0 = c1672z0.f10450a;
            c1664v0.mo2682y(m2653a);
            View rootView = view.getRootView();
            c1664v0.mo2667d(rootView);
            c1664v0.mo2674p(rootView);
            c1664v0.mo2675q();
            c1664v0.mo2662A(view.getWindowSystemUiVisibility());
        }
        return c1672z0;
    }

    /* renamed from: b */
    public final WindowInsets m2742b() {
        C1664v0 c1664v0 = this.f10450a;
        if (c1664v0 instanceof C1646m0) {
            return ((C1646m0) c1664v0).f10404c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672z0)) {
            return false;
        }
        return Objects.equals(this.f10450a, ((C1672z0) obj).f10450a);
    }

    public final int hashCode() {
        C1664v0 c1664v0 = this.f10450a;
        if (c1664v0 == null) {
            return 0;
        }
        return c1664v0.hashCode();
    }

    public C1672z0(C1672z0 c1672z0) {
        if (c1672z0 != null) {
            C1664v0 c1664v0 = c1672z0.f10450a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 35 && (c1664v0 instanceof C1662u0)) {
                this.f10450a = new C1662u0(this, (C1662u0) c1664v0);
            } else if (i7 >= 34 && (c1664v0 instanceof C1658s0)) {
                this.f10450a = new C1658s0(this, (C1658s0) c1664v0);
            } else if (i7 >= 31 && (c1664v0 instanceof C1656r0)) {
                this.f10450a = new C1656r0(this, (C1656r0) c1664v0);
            } else if (i7 >= 30 && (c1664v0 instanceof C1654q0)) {
                this.f10450a = new C1654q0(this, (C1654q0) c1664v0);
            } else if (i7 >= 29 && (c1664v0 instanceof C1652p0)) {
                this.f10450a = new C1652p0(this, (C1652p0) c1664v0);
            } else if (i7 >= 28 && (c1664v0 instanceof C1650o0)) {
                this.f10450a = new C1650o0(this, (C1650o0) c1664v0);
            } else if (c1664v0 instanceof C1648n0) {
                this.f10450a = new C1648n0(this, (C1648n0) c1664v0);
            } else if (c1664v0 instanceof C1646m0) {
                this.f10450a = new C1646m0(this, (C1646m0) c1664v0);
            } else {
                this.f10450a = new C1664v0(this);
            }
            c1664v0.mo2668e(this);
            return;
        }
        this.f10450a = new C1664v0(this);
    }
}
