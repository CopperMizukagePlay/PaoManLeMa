package p170w1;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import p117p1.C2842a;
import p117p1.InterfaceC2864o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.f0 */
/* loaded from: classes.dex */
public final class C3673f0 {

    /* renamed from: a */
    public static final C3673f0 f17509a = new Object();

    /* renamed from: a */
    public final void m5666a(View view, InterfaceC2864o interfaceC2864o) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (interfaceC2864o instanceof C2842a) {
            systemIcon = PointerIcon.getSystemIcon(context, ((C2842a) interfaceC2864o).f14934b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!AbstractC3367j.m5096a(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
