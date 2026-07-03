package p144t;

import androidx.compose.foundation.layout.LayoutWeightElement;
import p092m.AbstractC2487d;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.p0 */
/* loaded from: classes.dex */
public final class C3149p0 {

    /* renamed from: a */
    public static final C3149p0 f15825a = new Object();

    /* renamed from: a */
    public final InterfaceC3810r m4856a(InterfaceC3810r interfaceC3810r, float f7, boolean z7) {
        if (f7 > 0.0d) {
            if (f7 > Float.MAX_VALUE) {
                f7 = Float.MAX_VALUE;
            }
            return interfaceC3810r.mo5829e(new LayoutWeightElement(f7, z7));
        }
        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", f7, "; must be greater than zero").toString());
    }
}
