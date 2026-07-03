package p039e5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rg */
/* loaded from: classes.dex */
public final class C1243rg extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C2349d1 f7340a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2425y0 f7341b;

    public C1243rg(C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0) {
        this.f7340a = c2349d1;
        this.f7341b = interfaceC2425y0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i7;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        boolean z7 = false;
        if (intExtra >= 0 && intExtra2 > 0) {
            i7 = (intExtra * 100) / intExtra2;
        } else {
            i7 = 0;
        }
        this.f7340a.m3742h(i7);
        int intExtra3 = intent.getIntExtra("status", -1);
        if (intExtra3 == 2 || intExtra3 == 5) {
            z7 = true;
        }
        this.f7341b.setValue(Boolean.valueOf(z7));
    }
}
