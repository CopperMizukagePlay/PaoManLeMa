package p008b;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.p */
/* loaded from: classes.dex */
public final class C0248p extends View {

    /* renamed from: e */
    public final /* synthetic */ RunnableC0247o f975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248p(RunnableC0247o runnableC0247o, Context context) {
        super(context);
        this.f975e = runnableC0247o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC3367j.m5100e(configuration, "newConfig");
        this.f975e.run();
    }
}
