package p051g3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.r */
/* loaded from: classes.dex */
public abstract class AbstractC1655r {
    /* renamed from: a */
    public static AutofillId m2700a(View view) {
        return view.getAutofillId();
    }

    /* renamed from: b */
    public static float m2701b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* renamed from: c */
    public static float m2702c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* renamed from: d */
    public static Intent m2703d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
    }

    /* renamed from: e */
    public static void m2704e(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
