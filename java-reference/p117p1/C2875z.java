package p117p1;

import android.view.MotionEvent;
import java.util.HashMap;
import p053g5.C1694m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.AbstractC3382y;
import p162v1.C3502g0;
import p162v1.InterfaceC3524n1;
import p163v2.AbstractC3569i;
import p163v2.C3576p;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.z */
/* loaded from: classes.dex */
public final class C2875z extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f15043f;

    /* renamed from: g */
    public final /* synthetic */ C3576p f15044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2875z(C3576p c3576p, int i7) {
        super(1);
        this.f15043f = i7;
        this.f15044g = c3576p;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean dispatchTouchEvent;
        C3728t c3728t;
        switch (this.f15043f) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C3576p c3576p = this.f15044g;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case AbstractC3122c.f15761f /* 5 */:
                    case AbstractC3122c.f15759d /* 6 */:
                        dispatchTouchEvent = c3576p.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = c3576p.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            default:
                InterfaceC3524n1 interfaceC3524n1 = (InterfaceC3524n1) obj;
                if (interfaceC3524n1 instanceof C3728t) {
                    c3728t = (C3728t) interfaceC3524n1;
                } else {
                    c3728t = null;
                }
                C3576p c3576p2 = this.f15044g;
                if (c3728t != null) {
                    c3728t.getAndroidViewsHandler$ui_release().removeViewInLayout(c3576p2);
                    HashMap<C3502g0, AbstractC3569i> layoutNodeToHolder = c3728t.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                    AbstractC3382y.m5110a(layoutNodeToHolder).remove(c3728t.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(c3576p2));
                    c3576p2.setImportantForAccessibility(0);
                }
                c3576p2.removeAllViewsInLayout();
                return C1694m.f10482a;
        }
    }
}
