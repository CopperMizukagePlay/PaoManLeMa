package p051g3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import p001a0.C0068q2;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.y */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1669y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final AbstractC1661u f10443a;

    /* renamed from: b */
    public C1672z0 f10444b;

    public ViewOnApplyWindowInsetsListenerC1669y(View view, AbstractC1661u abstractC1661u) {
        C1672z0 c1672z0;
        AbstractC1644l0 c1630e0;
        this.f10443a = abstractC1661u;
        int i7 = AbstractC1653q.f10423a;
        C1672z0 m2653a = AbstractC1645m.m2653a(view);
        if (m2653a != null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 36) {
                c1630e0 = new C1642k0(m2653a);
            } else if (i8 >= 35) {
                c1630e0 = new C1640j0(m2653a);
            } else if (i8 >= 34) {
                c1630e0 = new C1638i0(m2653a);
            } else if (i8 >= 31) {
                c1630e0 = new C1636h0(m2653a);
            } else if (i8 >= 30) {
                c1630e0 = new C1634g0(m2653a);
            } else if (i8 >= 29) {
                c1630e0 = new C1632f0(m2653a);
            } else {
                c1630e0 = new C1630e0(m2653a);
            }
            c1672z0 = c1630e0.mo2641b();
        } else {
            c1672z0 = null;
        }
        this.f10444b = c1672z0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j6;
        int[] iArr;
        boolean z7;
        boolean z8;
        if (!view.isLaidOut()) {
            this.f10444b = C1672z0.m2741c(view, windowInsets);
            return C1671z.m2738j(view, windowInsets);
        }
        C1672z0 m2741c = C1672z0.m2741c(view, windowInsets);
        C1664v0 c1664v0 = m2741c.f10450a;
        if (this.f10444b == null) {
            int i7 = AbstractC1653q.f10423a;
            this.f10444b = AbstractC1645m.m2653a(view);
        }
        if (this.f10444b == null) {
            this.f10444b = m2741c;
            return C1671z.m2738j(view, windowInsets);
        }
        AbstractC1661u m2739k = C1671z.m2739k(view);
        if (m2739k != null && Objects.equals(m2739k.f10428e, m2741c)) {
            return C1671z.m2738j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C1672z0 c1672z0 = this.f10444b;
        int i8 = 1;
        while (i8 <= 512) {
            C0274b mo2671i = c1664v0.mo2671i(i8);
            C0274b mo2671i2 = c1672z0.f10450a.mo2671i(i8);
            int i9 = mo2671i.f1015a;
            int i10 = mo2671i.f1018d;
            int i11 = mo2671i.f1017c;
            int i12 = mo2671i.f1016b;
            int i13 = mo2671i2.f1015a;
            int i14 = mo2671i2.f1018d;
            int i15 = mo2671i2.f1017c;
            int i16 = mo2671i2.f1016b;
            if (i9 <= i13 && i12 <= i16 && i11 <= i15 && i10 <= i14) {
                iArr = iArr2;
                z7 = false;
            } else {
                iArr = iArr2;
                z7 = true;
            }
            if (i9 >= i13 && i12 >= i16 && i11 >= i15 && i10 >= i14) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z7 != z8) {
                if (z7) {
                    iArr[0] = iArr[0] | i8;
                } else {
                    iArr3[0] = iArr3[0] | i8;
                }
            }
            i8 <<= 1;
            iArr2 = iArr;
        }
        int i17 = iArr2[0];
        int i18 = iArr3[0];
        int i19 = i17 | i18;
        if (i19 == 0) {
            this.f10444b = m2741c;
            return C1671z.m2738j(view, windowInsets);
        }
        C1672z0 c1672z02 = this.f10444b;
        if ((i17 & 8) != 0) {
            interpolator = C1671z.f10445e;
        } else if ((i18 & 8) != 0) {
            interpolator = C1671z.f10446f;
        } else if ((i17 & 519) != 0) {
            interpolator = C1671z.f10447g;
        } else if ((i18 & 519) != 0) {
            interpolator = C1671z.f10448h;
        } else {
            interpolator = null;
        }
        if ((i19 & 8) != 0) {
            j6 = 160;
        } else {
            j6 = 250;
        }
        C1628d0 c1628d0 = new C1628d0(i19, interpolator, j6);
        c1628d0.f10375a.mo2637e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1628d0.f10375a.mo2634b());
        C0274b mo2671i3 = c1664v0.mo2671i(i19);
        C0274b mo2671i4 = c1672z02.f10450a.mo2671i(i19);
        int min = Math.min(mo2671i3.f1015a, mo2671i4.f1015a);
        int i20 = mo2671i3.f1016b;
        int i21 = mo2671i4.f1016b;
        int min2 = Math.min(i20, i21);
        int i22 = mo2671i3.f1017c;
        int i23 = mo2671i4.f1017c;
        int min3 = Math.min(i22, i23);
        int i24 = mo2671i3.f1018d;
        int i25 = mo2671i4.f1018d;
        C0068q2 c0068q2 = new C0068q2(6, C0274b.m581b(min, min2, min3, Math.min(i24, i25)), C0274b.m581b(Math.max(mo2671i3.f1015a, mo2671i4.f1015a), Math.max(i20, i21), Math.max(i22, i23), Math.max(i24, i25)));
        C1671z.m2735g(view, c1628d0, m2741c, false);
        duration.addUpdateListener(new C1663v(c1628d0, m2741c, c1672z02, i19, view));
        duration.addListener(new C1665w(view, c1628d0));
        ViewTreeObserverOnPreDrawListenerC1633g viewTreeObserverOnPreDrawListenerC1633g = new ViewTreeObserverOnPreDrawListenerC1633g(view, new RunnableC1667x(view, c1628d0, c0068q2, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1633g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1633g);
        this.f10444b = m2741c;
        return C1671z.m2738j(view, windowInsets);
    }
}
