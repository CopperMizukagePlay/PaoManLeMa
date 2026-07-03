package p170w1;

import android.os.SystemClock;
import android.view.MotionEvent;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.r */
/* loaded from: classes.dex */
public final class C3720r extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17681f;

    /* renamed from: g */
    public final /* synthetic */ C3728t f17682g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3720r(C3728t c3728t, int i7) {
        super(0);
        this.f17681f = i7;
        this.f17682g = c3728t;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int actionMasked;
        C3696l c3696l;
        switch (this.f17681f) {
            case 0:
                C3728t c3728t = this.f17682g;
                MotionEvent motionEvent = c3728t.f17776w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c3728t.f17778x0 = SystemClock.uptimeMillis();
                    c3728t.post(c3728t.f17706C0);
                }
                return C1694m.f10482a;
            default:
                c3696l = this.f17682g.get_viewTreeOwners();
                return c3696l;
        }
    }
}
