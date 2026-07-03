package androidx.compose.p007ui.draw;

import p035e1.C0666m;
import p072j1.AbstractC2163b;
import p146t1.C3229q0;
import p150t5.InterfaceC3279c;
import p177x0.C3795c;
import p177x0.InterfaceC3797e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.ui.draw.a */
/* loaded from: classes.dex */
public abstract class AbstractC0166a {
    /* renamed from: a */
    public static final InterfaceC3810r m378a(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new DrawBehindElement(interfaceC3279c));
    }

    /* renamed from: b */
    public static final InterfaceC3810r m379b(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new DrawWithCacheElement(interfaceC3279c));
    }

    /* renamed from: c */
    public static final InterfaceC3810r m380c(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new DrawWithContentElement(interfaceC3279c));
    }

    /* renamed from: d */
    public static InterfaceC3810r m381d(InterfaceC3810r interfaceC3810r, AbstractC2163b abstractC2163b, InterfaceC3797e interfaceC3797e, C3229q0 c3229q0, C0666m c0666m, int i7) {
        if ((i7 & 4) != 0) {
            interfaceC3797e = C3795c.f17968i;
        }
        return interfaceC3810r.mo5829e(new PainterElement(abstractC2163b, interfaceC3797e, c3229q0, 1.0f, c0666m));
    }
}
