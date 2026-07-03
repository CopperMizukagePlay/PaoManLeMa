package p051g3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.paoman.lema.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.q */
/* loaded from: classes.dex */
public abstract class AbstractC1653q {

    /* renamed from: a */
    public static final /* synthetic */ int f10423a = 0;

    static {
        new WeakHashMap();
    }

    /* renamed from: a */
    public static void m2698a(ViewGroup viewGroup, AbstractC1621b abstractC1621b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC1621b.f10365b);
    }

    /* renamed from: b */
    public static void m2699b(View view, AbstractC1661u abstractC1661u) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        C1619a0 c1619a0 = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (abstractC1661u != null) {
                c1619a0 = new C1619a0(abstractC1661u);
            }
            view.setWindowInsetsAnimationCallback(c1619a0);
            return;
        }
        PathInterpolator pathInterpolator = C1671z.f10445e;
        if (abstractC1661u != null) {
            onApplyWindowInsetsListener = new ViewOnApplyWindowInsetsListenerC1669y(view, abstractC1661u);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
