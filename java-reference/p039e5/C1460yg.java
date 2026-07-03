package p039e5;

import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.InterfaceC0213t;
import java.util.Map;
import p001a0.C0019e1;
import p017c.C0323h;
import p060h5.AbstractC1793a0;
import p071j0.C2114a;
import p077k.C2194h0;
import p085l0.InterfaceC2360g0;
import p118p3.C2876a;
import p150t5.InterfaceC3277a;
import p153u0.C3336c;
import p153u0.C3341h;
import p158u5.C3379v;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yg */
/* loaded from: classes.dex */
public final class C1460yg implements InterfaceC2360g0 {

    /* renamed from: a */
    public final /* synthetic */ int f9409a;

    /* renamed from: b */
    public final /* synthetic */ Object f9410b;

    /* renamed from: c */
    public final /* synthetic */ Object f9411c;

    /* renamed from: d */
    public final /* synthetic */ Object f9412d;

    public /* synthetic */ C1460yg(Object obj, Object obj2, Object obj3, int i7) {
        this.f9409a = i7;
        this.f9410b = obj;
        this.f9411c = obj2;
        this.f9412d = obj3;
    }

    @Override // p085l0.InterfaceC2360g0
    /* renamed from: a */
    public final void mo26a() {
        switch (this.f9409a) {
            case 0:
                Float f7 = (Float) this.f9412d;
                Window window = (Window) this.f9410b;
                if (window != null) {
                    C0019e1 c0019e1 = (C0019e1) this.f9411c;
                    if (c0019e1 != null) {
                        ((AbstractC3784a) c0019e1.f109e).mo2627I();
                    }
                    AbstractC1793a0.m2969I(window, true);
                    if (f7 != null) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.screenBrightness = f7.floatValue();
                        window.setAttributes(attributes);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((InterfaceC3277a) this.f9410b).mo52a();
                ((InterfaceC0213t) this.f9411c).mo415g().m473f((C2114a) this.f9412d);
                return;
            case 2:
                ((InterfaceC0213t) this.f9410b).mo415g().m473f((C2876a) this.f9411c);
                C0323h c0323h = (C0323h) ((C3379v) this.f9412d).f16451e;
                if (c0323h != null) {
                    c0323h.m673a();
                    return;
                }
                return;
            default:
                C3336c c3336c = (C3336c) this.f9410b;
                C2194h0 c2194h0 = c3336c.f16394f;
                Object obj = this.f9411c;
                Object m3596k = c2194h0.m3596k(obj);
                C3341h c3341h = (C3341h) this.f9412d;
                if (m3596k == c3341h) {
                    Map map = c3336c.f16393e;
                    Map mo5075d = c3341h.mo5075d();
                    if (mo5075d.isEmpty()) {
                        map.remove(obj);
                        return;
                    } else {
                        map.put(obj, mo5075d);
                        return;
                    }
                }
                return;
        }
    }
}
