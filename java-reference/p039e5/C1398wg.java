package p039e5;

import android.content.Context;
import android.view.View;
import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p117p1.C2857h0;
import p117p1.InterfaceC2872w;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wg */
/* loaded from: classes.dex */
public final class C1398wg implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ Context f8375a;

    /* renamed from: b */
    public final /* synthetic */ View f8376b;

    public C1398wg(Context context, View view) {
        this.f8375a = context;
        this.f8376b = view;
    }

    @Override // androidx.compose.p007ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2872w interfaceC2872w, InterfaceC2313c interfaceC2313c) {
        C2857h0 c2857h0 = (C2857h0) interfaceC2872w;
        Object m4533K0 = c2857h0.m4533K0(new C1367vg(this.f8375a, this.f8376b, null), interfaceC2313c);
        if (m4533K0 == EnumC2465a.f13750e) {
            return m4533K0;
        }
        return C1694m.f10482a;
    }
}
