package p032d6;

import p040e6.C1507c;
import p069i6.AbstractC2100m;
import p069i6.AbstractC2106s;
import p083k6.C2325e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC0531f0 {

    /* renamed from: a */
    public static final InterfaceC0540i0 f1873a;

    static {
        String str;
        boolean z7;
        InterfaceC0540i0 interfaceC0540i0;
        int i7 = AbstractC2106s.f12382a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z7 = Boolean.parseBoolean(str);
        } else {
            z7 = false;
        }
        if (!z7) {
            interfaceC0540i0 = RunnableC0528e0.f1868n;
        } else {
            C2325e c2325e = AbstractC0549l0.f1898a;
            C1507c c1507c = AbstractC2100m.f12376a;
            C1507c c1507c2 = c1507c.f9992j;
            interfaceC0540i0 = c1507c;
            if (c1507c == null) {
                interfaceC0540i0 = RunnableC0528e0.f1868n;
            }
        }
        f1873a = interfaceC0540i0;
    }
}
