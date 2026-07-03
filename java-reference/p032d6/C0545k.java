package p032d6;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.paoman.lema.FloatingSpeedService;
import p015b6.C0310q;
import p053g5.C1694m;
import p091l6.C2471b;
import p091l6.C2472c;
import p091l6.C2477h;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0545k implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f1890e;

    /* renamed from: f */
    public final /* synthetic */ Object f1891f;

    public /* synthetic */ C0545k(int i7, Object obj) {
        this.f1890e = i7;
        this.f1891f = obj;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7 = this.f1890e;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f1891f;
        switch (i7) {
            case 0:
                ((C0310q) obj4).mo23f((Throwable) obj);
                return c1694m;
            case 1:
                View view = (View) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                int i8 = FloatingSpeedService.f1540A;
                AbstractC3367j.m5100e(view, "view");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                AbstractC3367j.m5098c(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                layoutParams2.x += intValue;
                layoutParams2.y += intValue2;
                WindowManager windowManager = ((FloatingSpeedService) obj4).f1545i;
                if (windowManager != null) {
                    windowManager.updateViewLayout(view, layoutParams2);
                }
                return c1694m;
            case 2:
                C2472c c2472c = (C2472c) obj4;
                C2472c.f13762h.set(c2472c, null);
                c2472c.m4030f(null);
                return c1694m;
            default:
                ((C2477h) obj4).m4033c();
                return c1694m;
        }
    }

    public /* synthetic */ C0545k(C2472c c2472c, C2471b c2471b) {
        this.f1890e = 2;
        this.f1891f = c2472c;
    }
}
