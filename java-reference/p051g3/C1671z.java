package p051g3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.paoman.lema.R;
import java.util.List;
import p001a0.C0068q2;
import p111o3.InterpolatorC2816a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.z */
/* loaded from: classes.dex */
public final class C1671z extends AbstractC1625c0 {

    /* renamed from: e */
    public static final PathInterpolator f10445e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final InterpolatorC2816a f10446f = new InterpolatorC2816a(InterpolatorC2816a.f14862c);

    /* renamed from: g */
    public static final DecelerateInterpolator f10447g = new DecelerateInterpolator(1.5f);

    /* renamed from: h */
    public static final AccelerateInterpolator f10448h = new AccelerateInterpolator(1.5f);

    /* renamed from: f */
    public static void m2734f(View view, C1628d0 c1628d0) {
        AbstractC1661u m2739k = m2739k(view);
        if (m2739k != null) {
            m2739k.mo2710a(c1628d0);
            if (m2739k.f10429f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m2734f(viewGroup.getChildAt(i7), c1628d0);
            }
        }
    }

    /* renamed from: g */
    public static void m2735g(View view, C1628d0 c1628d0, C1672z0 c1672z0, boolean z7) {
        AbstractC1661u m2739k = m2739k(view);
        if (m2739k != null) {
            m2739k.f10428e = c1672z0;
            if (!z7) {
                m2739k.mo2711b(c1628d0);
                if (m2739k.f10429f == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m2735g(viewGroup.getChildAt(i7), c1628d0, c1672z0, z7);
            }
        }
    }

    /* renamed from: h */
    public static void m2736h(View view, C1672z0 c1672z0, List list) {
        AbstractC1661u m2739k = m2739k(view);
        if (m2739k != null) {
            c1672z0 = m2739k.mo2712d(c1672z0, list);
            if (m2739k.f10429f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m2736h(viewGroup.getChildAt(i7), c1672z0, list);
            }
        }
    }

    /* renamed from: i */
    public static void m2737i(View view, C1628d0 c1628d0, C0068q2 c0068q2) {
        AbstractC1661u m2739k = m2739k(view);
        if (m2739k != null) {
            m2739k.mo2713e(c1628d0, c0068q2);
            if (m2739k.f10429f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m2737i(viewGroup.getChildAt(i7), c1628d0, c0068q2);
            }
        }
    }

    /* renamed from: j */
    public static WindowInsets m2738j(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: k */
    public static AbstractC1661u m2739k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC1669y) {
            return ((ViewOnApplyWindowInsetsListenerC1669y) tag).f10443a;
        }
        return null;
    }
}
