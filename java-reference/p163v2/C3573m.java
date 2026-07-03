package p163v2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import p019c1.AbstractC0362f;
import p019c1.C0357a;
import p019c1.InterfaceC0366j;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.m */
/* loaded from: classes.dex */
public final class C3573m extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17174f;

    /* renamed from: g */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC3574n f17175g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3573m(ViewTreeObserverOnGlobalFocusChangeListenerC3574n viewTreeObserverOnGlobalFocusChangeListenerC3574n, int i7) {
        super(1);
        this.f17174f = i7;
        this.f17175g = viewTreeObserverOnGlobalFocusChangeListenerC3574n;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        View findNextFocusFromRect;
        switch (this.f17174f) {
            case 0:
                C0357a c0357a = (C0357a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC3574n viewTreeObserverOnGlobalFocusChangeListenerC3574n = this.f17175g;
                View m5543c = AbstractC3570j.m5543c(viewTreeObserverOnGlobalFocusChangeListenerC3574n);
                if (!m5543c.isFocused() && !m5543c.hasFocus()) {
                    if (!AbstractC0362f.m827y(m5543c, AbstractC0362f.m800C(c0357a.f1219a), AbstractC3570j.m5542b(((C3728t) AbstractC3498f.m5383w(viewTreeObserverOnGlobalFocusChangeListenerC3574n)).getFocusOwner(), AbstractC3498f.m5384x(viewTreeObserverOnGlobalFocusChangeListenerC3574n), m5543c))) {
                        c0357a.f1220b = true;
                    }
                }
                return C1694m.f10482a;
            default:
                C0357a c0357a2 = (C0357a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC3574n viewTreeObserverOnGlobalFocusChangeListenerC3574n2 = this.f17175g;
                View m5543c2 = AbstractC3570j.m5543c(viewTreeObserverOnGlobalFocusChangeListenerC3574n2);
                if (m5543c2.hasFocus()) {
                    InterfaceC0366j focusOwner = ((C3728t) AbstractC3498f.m5383w(viewTreeObserverOnGlobalFocusChangeListenerC3574n2)).getFocusOwner();
                    View m5384x = AbstractC3498f.m5384x(viewTreeObserverOnGlobalFocusChangeListenerC3574n2);
                    if (!(m5543c2 instanceof ViewGroup)) {
                        if (!m5384x.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else {
                        Rect m5542b = AbstractC3570j.m5542b(focusOwner, m5384x, m5543c2);
                        Integer m800C = AbstractC0362f.m800C(c0357a2.f1219a);
                        if (m800C != null) {
                            i7 = m800C.intValue();
                        } else {
                            i7 = 130;
                        }
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = viewTreeObserverOnGlobalFocusChangeListenerC3574n2.f17176s;
                        if (view != null) {
                            findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) m5384x, view, i7);
                        } else {
                            findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) m5384x, m5542b, i7);
                        }
                        if (findNextFocusFromRect != null && AbstractC3570j.m5541a(m5543c2, findNextFocusFromRect)) {
                            findNextFocusFromRect.requestFocus(i7, m5542b);
                            c0357a2.f1220b = true;
                        } else if (!m5384x.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    }
                }
                return C1694m.f10482a;
        }
    }
}
