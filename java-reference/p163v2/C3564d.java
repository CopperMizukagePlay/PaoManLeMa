package p163v2;

import android.view.WindowInsets;
import java.util.HashMap;
import p051g3.AbstractC1653q;
import p051g3.C1672z0;
import p053g5.C1694m;
import p140s2.C3102l;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.C3502g0;
import p162v1.InterfaceC3524n1;
import p170w1.C3700m;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.d */
/* loaded from: classes.dex */
public final class C3564d extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17119f;

    /* renamed from: g */
    public final /* synthetic */ C3576p f17120g;

    /* renamed from: h */
    public final /* synthetic */ C3502g0 f17121h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3564d(C3576p c3576p, C3502g0 c3502g0, int i7) {
        super(1);
        this.f17119f = i7;
        this.f17120g = c3576p;
        this.f17121h = c3502g0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C3728t c3728t;
        WindowInsets m2742b;
        switch (this.f17119f) {
            case 0:
                InterfaceC3524n1 interfaceC3524n1 = (InterfaceC3524n1) obj;
                if (interfaceC3524n1 instanceof C3728t) {
                    c3728t = (C3728t) interfaceC3524n1;
                } else {
                    c3728t = null;
                }
                C3576p c3576p = this.f17120g;
                if (c3728t != null) {
                    HashMap<AbstractC3569i, C3502g0> holderToLayoutNode = c3728t.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    C3502g0 c3502g0 = this.f17121h;
                    holderToLayoutNode.put(c3576p, c3502g0);
                    c3728t.getAndroidViewsHandler$ui_release().addView(c3576p);
                    c3728t.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(c3502g0, c3576p);
                    c3576p.setImportantForAccessibility(1);
                    AbstractC1653q.m2698a(c3576p, new C3700m(c3728t, c3502g0, c3728t));
                }
                if (c3576p.getView().getParent() != c3576p) {
                    c3576p.addView(c3576p.getView());
                }
                return C1694m.f10482a;
            case 1:
                AbstractC3570j.m5544d(this.f17120g, this.f17121h);
                return C1694m.f10482a;
            default:
                C3502g0 c3502g02 = this.f17121h;
                C3576p c3576p2 = this.f17120g;
                AbstractC3570j.m5544d(c3576p2, c3502g02);
                ((C3728t) c3576p2.f17139g).f17709E = true;
                int[] iArr = c3576p2.f17150r;
                int i7 = iArr[0];
                int i8 = iArr[1];
                c3576p2.getView().getLocationOnScreen(iArr);
                long j6 = c3576p2.f17151s;
                long mo4926S = ((InterfaceC3238v) obj).mo4926S();
                c3576p2.f17151s = mo4926S;
                C1672z0 c1672z0 = c3576p2.f17152t;
                if (c1672z0 != null && ((i7 != iArr[0] || i8 != iArr[1] || !C3102l.m4790a(j6, mo4926S)) && (m2742b = c3576p2.m5540g(c1672z0).m2742b()) != null)) {
                    c3576p2.getView().dispatchApplyWindowInsets(m2742b);
                }
                return C1694m.f10482a;
        }
    }
}
