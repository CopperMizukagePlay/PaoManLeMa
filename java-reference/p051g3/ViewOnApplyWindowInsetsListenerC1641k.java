package p051g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.k */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1641k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C1672z0 f10392a = null;

    /* renamed from: b */
    public final /* synthetic */ View f10393b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1631f f10394c;

    public ViewOnApplyWindowInsetsListenerC1641k(View view, InterfaceC1631f interfaceC1631f) {
        this.f10393b = view;
        this.f10394c = interfaceC1631f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1672z0 m2741c = C1672z0.m2741c(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC1631f interfaceC1631f = this.f10394c;
        if (i7 < 30) {
            AbstractC1643l.m2650a(windowInsets, this.f10393b);
            if (m2741c.equals(this.f10392a)) {
                return interfaceC1631f.mo2644c(view, m2741c).m2742b();
            }
        }
        this.f10392a = m2741c;
        C1672z0 mo2644c = interfaceC1631f.mo2644c(view, m2741c);
        if (i7 >= 30) {
            return mo2644c.m2742b();
        }
        int i8 = AbstractC1653q.f10423a;
        view.requestApplyInsets();
        return mo2644c.m2742b();
    }
}
