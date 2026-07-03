package p170w1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p011b2.C0272b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.k0 */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3693k0 implements ComponentCallbacks2 {

    /* renamed from: e */
    public final /* synthetic */ C0272b f17580e;

    public ComponentCallbacks2C3693k0(C0272b c0272b) {
        this.f17580e = c0272b;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C0272b c0272b = this.f17580e;
        synchronized (c0272b) {
            c0272b.f1013a.m3648c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0272b c0272b = this.f17580e;
        synchronized (c0272b) {
            c0272b.f1013a.m3648c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        C0272b c0272b = this.f17580e;
        synchronized (c0272b) {
            c0272b.f1013a.m3648c();
        }
    }
}
