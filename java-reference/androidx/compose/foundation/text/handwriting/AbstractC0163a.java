package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.AbstractC0154b;
import p009b0.AbstractC0262d;
import p150t5.InterfaceC3277a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.text.handwriting.a */
/* loaded from: classes.dex */
public abstract class AbstractC0163a {

    /* renamed from: a */
    public static final float f720a = 40;

    /* renamed from: b */
    public static final float f721b = 10;

    /* renamed from: a */
    public static final InterfaceC3810r m374a(InterfaceC3277a interfaceC3277a, boolean z7) {
        if (z7 && AbstractC0262d.f995a) {
            return AbstractC0154b.m338i(new StylusHandwritingElementWithNegativePadding(interfaceC3277a), f721b, f720a);
        }
        return C3807o.f17991a;
    }
}
