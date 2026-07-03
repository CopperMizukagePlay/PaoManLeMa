package p057h1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.l */
/* loaded from: classes.dex */
public final class C1762l extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ int f10761a;

    public /* synthetic */ C1762l(int i7) {
        this.f10761a = i7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f10761a) {
            case 0:
                if ((view instanceof C1763m) && (outline2 = ((C1763m) view).f10767i) != null) {
                    outline.set(outline2);
                    return;
                }
                return;
            case 1:
                AbstractC3367j.m5098c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                AbstractC2487d.m4054r(view);
                throw null;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
