package p063i0;

import android.graphics.Rect;
import android.view.View;
import p000a.AbstractC0000a;
import p027d1.C0465c;
import p035e1.AbstractC0659i0;
import p053g5.C1694m;
import p067i4.AbstractC2072e;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u1 */
/* loaded from: classes.dex */
public final class C2012u1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ View f11895f;

    /* renamed from: g */
    public final /* synthetic */ int f11896g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f11897h;

    /* renamed from: i */
    public final /* synthetic */ C2349d1 f11898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2012u1(View view, int i7, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1) {
        super(0);
        this.f11895f = view;
        this.f11896g = i7;
        this.f11897h = interfaceC2425y0;
        this.f11898i = c2349d1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        C0465c m3d;
        View rootView = this.f11895f.getRootView();
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        C0465c m1395B = AbstractC0659i0.m1395B(rect);
        InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f11897h.getValue();
        if (interfaceC3238v == null) {
            m3d = C0465c.f1624e;
        } else {
            m3d = AbstractC0000a.m3d(interfaceC3238v.mo4933h(0L), AbstractC2072e.m3347y(interfaceC3238v.mo4926S()));
        }
        this.f11898i.m3742h(AbstractC2052z1.m3220c(this.f11896g, m1395B, m3d));
        return C1694m.f10482a;
    }
}
