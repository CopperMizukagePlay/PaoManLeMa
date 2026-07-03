package p008b;

import android.window.OnBackInvokedDispatcher;
import p053g5.C1691j;
import p096m3.C2572v;
import p102n1.AbstractC2710c;
import p148t3.C3261j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.h0 */
/* loaded from: classes.dex */
public final class C0236h0 {

    /* renamed from: a */
    public final Runnable f920a;

    /* renamed from: b */
    public final C1691j f921b = AbstractC2710c.m4327J(new C0226c0(0, this));

    public C0236h0(Runnable runnable) {
        this.f920a = runnable;
    }

    /* renamed from: a */
    public final C2572v m510a() {
        return ((C0232f0) this.f921b.getValue()).f916c;
    }

    /* renamed from: b */
    public final void m511b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m510a().m4097e(new C3261j(onBackInvokedDispatcher, 0), 1);
        m510a().m4097e(new C3261j(onBackInvokedDispatcher, 1000000), 0);
    }
}
