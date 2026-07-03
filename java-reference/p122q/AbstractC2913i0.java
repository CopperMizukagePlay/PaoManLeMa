package p122q;

import androidx.compose.foundation.gestures.DraggableElement;
import p137s.C3081j;
import p150t5.InterfaceC3282f;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC2913i0 {

    /* renamed from: a */
    public static final C2910h0 f15176a = new C2910h0(3, null, 0);

    /* renamed from: b */
    public static final C2910h0 f15177b = new C2910h0(3, null, 1);

    /* renamed from: a */
    public static InterfaceC3810r m4581a(InterfaceC3810r interfaceC3810r, InterfaceC2922l0 interfaceC2922l0, EnumC2931o0 enumC2931o0, boolean z7, C3081j c3081j, boolean z8, InterfaceC3282f interfaceC3282f, boolean z9, int i7) {
        boolean z10;
        boolean z11;
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        boolean z12 = z7;
        if ((i7 & 8) != 0) {
            c3081j = null;
        }
        C3081j c3081j2 = c3081j;
        if ((i7 & 16) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        if ((i7 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        return interfaceC3810r.mo5829e(new DraggableElement(interfaceC2922l0, enumC2931o0, z12, c3081j2, z10, f15176a, interfaceC3282f, z11));
    }
}
