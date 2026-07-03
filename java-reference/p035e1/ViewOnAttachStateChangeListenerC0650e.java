package p035e1;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.paoman.lema.R;
import java.util.Iterator;
import p008b.C0226c0;
import p015b6.C0299f;
import p015b6.C0304k;
import p015b6.InterfaceC0305l;
import p032d6.C0565q1;
import p051g3.C1659t;
import p158u5.AbstractC3367j;
import p170w1.AbstractC3652a;
import p170w1.C3653a0;
import p170w1.C3731t2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.e */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0650e implements View.OnAttachStateChangeListener {

    /* renamed from: e */
    public final /* synthetic */ int f2133e;

    /* renamed from: f */
    public final /* synthetic */ Object f2134f;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0650e(int i7, Object obj) {
        this.f2133e = i7;
        this.f2134f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2133e) {
            case 0:
                C0652f c0652f = (C0652f) this.f2134f;
                Context context = view.getContext();
                if (!c0652f.f2140d) {
                    context.getApplicationContext().registerComponentCallbacks(c0652f.f2141e);
                    c0652f.f2140d = true;
                    return;
                }
                return;
            case 1:
                C3653a0 c3653a0 = (C3653a0) this.f2134f;
                AccessibilityManager accessibilityManager = c3653a0.f17457g;
                c3653a0.f17461k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(c3653a0.f17459i);
                accessibilityManager.addTouchExplorationStateChangeListener(c3653a0.f17460j);
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC0305l c0304k;
        boolean z7;
        Boolean bool;
        switch (this.f2133e) {
            case 0:
                C0652f c0652f = (C0652f) this.f2134f;
                Context context = view.getContext();
                if (c0652f.f2140d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c0652f.f2141e);
                    c0652f.f2140d = false;
                    return;
                }
                return;
            case 1:
                C3653a0 c3653a0 = (C3653a0) this.f2134f;
                c3653a0.f17462l.removeCallbacks(c3653a0.f17451N);
                AccessibilityManager accessibilityManager = c3653a0.f17457g;
                accessibilityManager.removeAccessibilityStateChangeListener(c3653a0.f17459i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c3653a0.f17460j);
                return;
            case 2:
                AbstractC3652a abstractC3652a = (AbstractC3652a) this.f2134f;
                ViewParent parent = abstractC3652a.getParent();
                C1659t c1659t = C1659t.f10427m;
                if (parent == null) {
                    c0304k = C0299f.f1080a;
                } else {
                    c0304k = new C0304k(new C0226c0(1, parent), c1659t);
                }
                Iterator it = c0304k.iterator();
                while (true) {
                    z7 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC3367j.m5100e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            if (tag instanceof Boolean) {
                                bool = (Boolean) tag;
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                z7 = bool.booleanValue();
                            }
                            if (z7) {
                                z7 = true;
                            }
                        }
                    }
                }
                if (!z7) {
                    C3731t2 c3731t2 = abstractC3652a.f17431g;
                    if (c3731t2 != null) {
                        c3731t2.m5752a();
                    }
                    abstractC3652a.f17431g = null;
                    abstractC3652a.requestLayout();
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C0565q1) this.f2134f).mo1114c(null);
                return;
        }
    }

    /* renamed from: a */
    private final void m1357a(View view) {
    }

    /* renamed from: b */
    private final void m1358b(View view) {
    }
}
