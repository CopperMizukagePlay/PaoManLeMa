package p035e1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0648d implements ComponentCallbacks2 {

    /* renamed from: e */
    public final /* synthetic */ C0652f f2131e;

    public ComponentCallbacks2C0648d(C0652f c0652f) {
        this.f2131e = c0652f;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 >= 40) {
            this.f2131e.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
