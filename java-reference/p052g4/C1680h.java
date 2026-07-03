package p052g4;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import p023c5.RunnableC0416h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.h */
/* loaded from: classes.dex */
public final class C1680h {

    /* renamed from: a */
    public final CaptureActivity f10459a;

    /* renamed from: e */
    public final RunnableC0416h f10463e;

    /* renamed from: f */
    public boolean f10464f;

    /* renamed from: c */
    public boolean f10461c = false;

    /* renamed from: b */
    public final C1679g f10460b = new C1679g(this);

    /* renamed from: d */
    public final Handler f10462d = new Handler();

    public C1680h(CaptureActivity captureActivity, RunnableC0416h runnableC0416h) {
        this.f10459a = captureActivity;
        this.f10463e = runnableC0416h;
    }

    /* renamed from: a */
    public final void m2746a() {
        this.f10462d.removeCallbacksAndMessages(null);
        if (this.f10461c) {
            this.f10459a.unregisterReceiver(this.f10460b);
            this.f10461c = false;
        }
    }
}
