package p170w1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p019c1.AbstractC0362f;
import p019c1.C0360d;
import p019c1.C0368l;
import p027d1.C0465c;
import p032d6.InterfaceC0516a0;
import p035e1.AbstractC0659i0;
import p053g5.C1694m;
import p102n1.AbstractC2710c;
import p102n1.C2708a;
import p102n1.C2709b;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p163v2.RunnableC3561a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.p */
/* loaded from: classes.dex */
public final class C3712p extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17656f;

    /* renamed from: g */
    public final /* synthetic */ C3728t f17657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3712p(C3728t c3728t, int i7) {
        super(1);
        this.f17656f = i7;
        this.f17657g = c3728t;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0360d c0360d;
        int i7;
        boolean z7;
        boolean z8;
        Rect rect;
        Looper looper;
        switch (this.f17656f) {
            case 0:
                KeyEvent keyEvent = ((C2709b) obj).f14537a;
                long m4345s = AbstractC2710c.m4345s(keyEvent);
                boolean z9 = true;
                if (C2708a.m4318a(m4345s, C2708a.f14522c)) {
                    c0360d = new C0360d(2);
                } else if (C2708a.m4318a(m4345s, C2708a.f14523d)) {
                    c0360d = new C0360d(1);
                } else if (C2708a.m4318a(m4345s, C2708a.f14529j)) {
                    if (keyEvent.isShiftPressed()) {
                        i7 = 2;
                    } else {
                        i7 = 1;
                    }
                    c0360d = new C0360d(i7);
                } else if (C2708a.m4318a(m4345s, C2708a.f14527h)) {
                    c0360d = new C0360d(4);
                } else if (C2708a.m4318a(m4345s, C2708a.f14526g)) {
                    c0360d = new C0360d(3);
                } else if (!C2708a.m4318a(m4345s, C2708a.f14524e) && !C2708a.m4318a(m4345s, C2708a.f14532m)) {
                    if (!C2708a.m4318a(m4345s, C2708a.f14525f) && !C2708a.m4318a(m4345s, C2708a.f14533n)) {
                        if (!C2708a.m4318a(m4345s, C2708a.f14528i) && !C2708a.m4318a(m4345s, C2708a.f14530k) && !C2708a.m4318a(m4345s, C2708a.f14534o)) {
                            if (!C2708a.m4318a(m4345s, C2708a.f14521b) && !C2708a.m4318a(m4345s, C2708a.f14531l)) {
                                c0360d = null;
                            } else {
                                c0360d = new C0360d(8);
                            }
                        } else {
                            c0360d = new C0360d(7);
                        }
                    } else {
                        c0360d = new C0360d(6);
                    }
                } else {
                    c0360d = new C0360d(5);
                }
                if (c0360d != null) {
                    int i8 = c0360d.f1227a;
                    if (AbstractC2710c.m4320C(keyEvent) == 2) {
                        Integer m800C = AbstractC0362f.m800C(i8);
                        C3728t c3728t = this.f17657g;
                        C0465c embeddedViewFocusRect = c3728t.getEmbeddedViewFocusRect();
                        Boolean m834e = ((C0368l) c3728t.getFocusOwner()).m834e(i8, embeddedViewFocusRect, new C3708o(c0360d, 1));
                        if (m834e != null) {
                            z7 = m834e.booleanValue();
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            return Boolean.TRUE;
                        }
                        if (i8 == 1 || i8 == 2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!z8) {
                            return Boolean.FALSE;
                        }
                        if (m800C != null) {
                            int intValue = m800C.intValue();
                            Object obj2 = C3694k1.f17581f.get();
                            AbstractC3367j.m5097b(obj2);
                            C3694k1 c3694k1 = (C3694k1) obj2;
                            View view = c3728t;
                            while (true) {
                                if (view != null) {
                                    View rootView = c3728t.getRootView();
                                    AbstractC3367j.m5098c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    view = c3694k1.m5705b((ViewGroup) rootView, view, intValue);
                                    if (view != null) {
                                        if (!view.equals(c3728t)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == c3728t) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (AbstractC3367j.m5096a(view, c3728t)) {
                                view = null;
                            }
                            if (view != null) {
                                if (embeddedViewFocusRect != null) {
                                    rect = AbstractC0659i0.m1423w(embeddedViewFocusRect);
                                } else {
                                    rect = null;
                                }
                                if (rect != null) {
                                    View rootView2 = c3728t.getRootView();
                                    AbstractC3367j.m5098c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) rootView2;
                                    viewGroup.offsetDescendantRectToMyCoords(c3728t, rect);
                                    viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                    if (AbstractC0362f.m827y(view, m800C, rect)) {
                                        return Boolean.TRUE;
                                    }
                                } else {
                                    throw new IllegalStateException("Invalid rect");
                                }
                            }
                        }
                        if (!((C0368l) c3728t.getFocusOwner()).m831b(i8, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean m834e2 = ((C0368l) c3728t.getFocusOwner()).m834e(i8, null, new C3708o(c0360d, 0));
                        if (m834e2 != null) {
                            z9 = m834e2.booleanValue();
                        }
                        return Boolean.valueOf(z9);
                    }
                }
                return Boolean.FALSE;
            case 1:
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) obj;
                C3728t c3728t2 = this.f17657g;
                Handler handler = c3728t2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    interfaceC3277a.mo52a();
                } else {
                    Handler handler2 = c3728t2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC3561a(2, interfaceC3277a));
                    }
                }
                return C1694m.f10482a;
            default:
                C3728t c3728t3 = this.f17657g;
                return new C3705n0(c3728t3, c3728t3.getTextInputService(), (InterfaceC0516a0) obj);
        }
    }
}
