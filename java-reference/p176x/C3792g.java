package p176x;

import android.graphics.Rect;
import android.view.View;
import p027d1.C0465c;
import p053g5.C1694m;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3277a;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3516l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C3792g implements InterfaceC3786a {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3516l f17958e;

    public C3792g(InterfaceC3516l interfaceC3516l) {
        this.f17958e = interfaceC3516l;
    }

    @Override // p176x.InterfaceC3786a
    /* renamed from: O */
    public final Object mo5818O(AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a, AbstractC2583c abstractC2583c) {
        C0465c c0465c;
        View m5384x = AbstractC3498f.m5384x(this.f17958e);
        long mo4927U = abstractC3497e1.mo4927U(0L);
        C0465c c0465c2 = (C0465c) interfaceC3277a.mo52a();
        if (c0465c2 != null) {
            c0465c = c0465c2.m1020g(mo4927U);
        } else {
            c0465c = null;
        }
        if (c0465c != null) {
            m5384x.requestRectangleOnScreen(new Rect((int) c0465c.f1625a, (int) c0465c.f1626b, (int) c0465c.f1627c, (int) c0465c.f1628d), false);
        }
        return C1694m.f10482a;
    }
}
