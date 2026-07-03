package p008b;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.paoman.lema.MainActivity;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0247o implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AbstractC0257y f970e;

    /* renamed from: f */
    public final /* synthetic */ C0244l0 f971f;

    /* renamed from: g */
    public final /* synthetic */ C0244l0 f972g;

    /* renamed from: h */
    public final /* synthetic */ MainActivity f973h;

    /* renamed from: i */
    public final /* synthetic */ View f974i;

    public /* synthetic */ RunnableC0247o(AbstractC0257y abstractC0257y, C0244l0 c0244l0, C0244l0 c0244l02, MainActivity mainActivity, View view) {
        this.f970e = abstractC0257y;
        this.f971f = c0244l0;
        this.f972g = c0244l02;
        this.f973h = mainActivity;
        this.f974i = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.f973h.getWindow();
        AbstractC3367j.m5099d(window, "getWindow(...)");
        C0244l0 c0244l0 = this.f971f;
        InterfaceC3279c interfaceC3279c = c0244l0.f949c;
        View view = this.f974i;
        Resources resources = view.getResources();
        AbstractC3367j.m5099d(resources, "getResources(...)");
        boolean booleanValue = ((Boolean) interfaceC3279c.mo23f(resources)).booleanValue();
        C0244l0 c0244l02 = this.f972g;
        InterfaceC3279c interfaceC3279c2 = c0244l02.f949c;
        Resources resources2 = view.getResources();
        AbstractC3367j.m5099d(resources2, "getResources(...)");
        this.f970e.mo524b(c0244l0, c0244l02, window, view, booleanValue, ((Boolean) interfaceC3279c2.mo23f(resources2)).booleanValue());
    }
}
