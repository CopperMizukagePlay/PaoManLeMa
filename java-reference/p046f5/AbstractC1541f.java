package p046f5;

import java.util.List;
import p060h5.AbstractC1806n;
import p073j2.AbstractC2168e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f5.f */
/* loaded from: classes.dex */
public abstract class AbstractC1541f {

    /* renamed from: a */
    public static final List f10116a = AbstractC1806n.m3067O(Float.valueOf(0.85f), Float.valueOf(1.0f), Float.valueOf(1.15f), Float.valueOf(1.3f));

    /* renamed from: a */
    public static float m2473a(float f7) {
        return AbstractC2168e.m3529p(f7, 0.85f, 1.35f);
    }

    /* renamed from: b */
    public static String m2474b(float f7) {
        return AbstractC3784a.m5794D(m2473a(f7) * 100.0f) + "%";
    }
}
