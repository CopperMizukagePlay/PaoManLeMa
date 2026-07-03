package p170w1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p011b2.C0271a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.j0 */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3689j0 implements ComponentCallbacks2 {

    /* renamed from: e */
    public final /* synthetic */ Configuration f17572e;

    /* renamed from: f */
    public final /* synthetic */ C0271a f17573f;

    public ComponentCallbacks2C3689j0(Configuration configuration, C0271a c0271a) {
        this.f17572e = configuration;
        this.f17573f = c0271a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f17572e;
        configuration2.updateFrom(configuration);
        Iterator it = this.f17573f.f1012a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                it.remove();
            } else {
                throw new ClassCastException();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f17573f.f1012a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f17573f.f1012a.clear();
    }
}
