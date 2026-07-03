package p023c5;

import android.content.Intent;
import android.util.Log;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0416h implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f1426e;

    /* renamed from: f */
    public final /* synthetic */ C0419k f1427f;

    public /* synthetic */ RunnableC0416h(C0419k c0419k, int i7) {
        this.f1426e = i7;
        this.f1427f = c0419k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f1426e;
        C0419k c0419k = this.f1427f;
        switch (i7) {
            case 0:
                Log.d("k", "Finishing due to inactivity");
                c0419k.f1431a.finish();
                return;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                c0419k.f1431a.setResult(0, intent);
                c0419k.m900a();
                return;
        }
    }
}
