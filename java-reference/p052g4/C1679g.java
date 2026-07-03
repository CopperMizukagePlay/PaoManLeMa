package p052g4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p031d5.RunnableC0505e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.g */
/* loaded from: classes.dex */
public final class C1679g extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C1680h f10458a;

    public C1679g(C1680h c1680h) {
        this.f10458a = c1680h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z7;
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            if (intent.getIntExtra("plugged", -1) <= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f10458a.f10462d.post(new RunnableC0505e(2, this, z7));
        }
    }
}
