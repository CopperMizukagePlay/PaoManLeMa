package p008b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0227d implements InterfaceC0209r {

    /* renamed from: e */
    public final /* synthetic */ C0236h0 f907e;

    /* renamed from: f */
    public final /* synthetic */ AbstractActivityC0245m f908f;

    public /* synthetic */ C0227d(C0236h0 c0236h0, AbstractActivityC0245m abstractActivityC0245m) {
        this.f907e = c0236h0;
        this.f908f = abstractActivityC0245m;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (enumC0201n == EnumC0201n.ON_CREATE) {
            onBackInvokedDispatcher = this.f908f.getOnBackInvokedDispatcher();
            AbstractC3367j.m5099d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f907e.m511b(onBackInvokedDispatcher);
        }
    }
}
