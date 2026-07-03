package p035e1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.k */
/* loaded from: classes.dex */
public final class C0662k {

    /* renamed from: a */
    public final PathMeasure f2173a;

    public C0662k(PathMeasure pathMeasure) {
        this.f2173a = pathMeasure;
    }

    /* renamed from: a */
    public final void m1443a(float f7, float f8, C0660j c0660j) {
        if (c0660j != null) {
            this.f2173a.getSegment(f7, f8, c0660j.f2151a, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
