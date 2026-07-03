package p051g3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.m */
/* loaded from: classes.dex */
public abstract class AbstractC1645m {
    /* renamed from: a */
    public static C1672z0 m2653a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1672z0 m2741c = C1672z0.m2741c(null, rootWindowInsets);
        C1664v0 c1664v0 = m2741c.f10450a;
        c1664v0.mo2682y(m2741c);
        View rootView = view.getRootView();
        c1664v0.mo2667d(rootView);
        c1664v0.mo2674p(rootView);
        c1664v0.mo2675q();
        return m2741c;
    }
}
