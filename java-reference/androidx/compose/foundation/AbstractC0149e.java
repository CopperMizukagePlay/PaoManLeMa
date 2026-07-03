package androidx.compose.foundation;

import p137s.C3081j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.e */
/* loaded from: classes.dex */
public abstract class AbstractC0149e {
    static {
        new AbstractC3556y0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return false;
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: h */
            public final AbstractC3809q mo312h() {
                return new AbstractC3809q();
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo313i(AbstractC3809q abstractC3809q) {
            }
        };
    }

    /* renamed from: a */
    public static final InterfaceC3810r m325a(InterfaceC3810r interfaceC3810r, boolean z7, C3081j c3081j) {
        InterfaceC3810r interfaceC3810r2;
        if (z7) {
            interfaceC3810r2 = new FocusableElement(c3081j);
        } else {
            interfaceC3810r2 = C3807o.f17991a;
        }
        return interfaceC3810r.mo5829e(interfaceC3810r2);
    }
}
