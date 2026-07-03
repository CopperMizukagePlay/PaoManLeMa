package androidx.compose.p007ui.layout;

import p146t1.C3240w;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.ui.layout.a */
/* loaded from: classes.dex */
public abstract class AbstractC0172a {
    /* renamed from: a */
    public static final Object m391a(InterfaceC3214k0 interfaceC3214k0) {
        C3240w c3240w;
        Object mo4921n = interfaceC3214k0.mo4921n();
        if (mo4921n instanceof C3240w) {
            c3240w = (C3240w) mo4921n;
        } else {
            c3240w = null;
        }
        if (c3240w == null) {
            return null;
        }
        return c3240w.f16058s;
    }

    /* renamed from: b */
    public static final InterfaceC3810r m392b(InterfaceC3810r interfaceC3810r, InterfaceC3282f interfaceC3282f) {
        return interfaceC3810r.mo5829e(new LayoutElement(interfaceC3282f));
    }

    /* renamed from: c */
    public static final InterfaceC3810r m393c(InterfaceC3810r interfaceC3810r, Object obj) {
        return interfaceC3810r.mo5829e(new LayoutIdElement(obj));
    }

    /* renamed from: d */
    public static final InterfaceC3810r m394d(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new OnGloballyPositionedElement(interfaceC3279c));
    }

    /* renamed from: e */
    public static final InterfaceC3810r m395e(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new OnSizeChangedModifier(interfaceC3279c));
    }
}
