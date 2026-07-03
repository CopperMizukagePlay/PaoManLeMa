package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC0150f;
import p028d2.C0474g;
import p043f2.EnumC1533a;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.selection.b */
/* loaded from: classes.dex */
public abstract class AbstractC0161b {
    /* renamed from: a */
    public static final InterfaceC3810r m371a(InterfaceC3810r interfaceC3810r, boolean z7, C3081j c3081j, InterfaceC2768p0 interfaceC2768p0, boolean z8, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        InterfaceC3810r m5821a;
        if (interfaceC2768p0 instanceof InterfaceC2780u0) {
            m5821a = new SelectableElement(z7, c3081j, (InterfaceC2780u0) interfaceC2768p0, z8, c0474g, interfaceC3277a);
        } else if (interfaceC2768p0 == null) {
            m5821a = new SelectableElement(z7, c3081j, null, z8, c0474g, interfaceC3277a);
        } else {
            C3807o c3807o = C3807o.f17991a;
            if (c3081j != null) {
                m5821a = AbstractC0150f.m326a(c3807o, c3081j, interfaceC2768p0).mo5829e(new SelectableElement(z7, c3081j, null, z8, c0474g, interfaceC3277a));
            } else {
                m5821a = AbstractC3793a.m5821a(c3807o, new C0160a(interfaceC2768p0, z7, z8, c0474g, interfaceC3277a));
            }
        }
        return interfaceC3810r.mo5829e(m5821a);
    }

    /* renamed from: b */
    public static final InterfaceC3810r m372b(InterfaceC3810r interfaceC3810r, boolean z7, C3081j c3081j, boolean z8, C0474g c0474g, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new ToggleableElement(z7, c3081j, z8, c0474g, interfaceC3279c));
    }

    /* renamed from: c */
    public static final InterfaceC3810r m373c(C0474g c0474g, EnumC1533a enumC1533a, InterfaceC2768p0 interfaceC2768p0, InterfaceC3277a interfaceC3277a, boolean z7) {
        if (interfaceC2768p0 instanceof InterfaceC2780u0) {
            return new TriStateToggleableElement(enumC1533a, null, (InterfaceC2780u0) interfaceC2768p0, z7, c0474g, interfaceC3277a);
        }
        if (interfaceC2768p0 == null) {
            return new TriStateToggleableElement(enumC1533a, null, null, z7, c0474g, interfaceC3277a);
        }
        return AbstractC3793a.m5821a(C3807o.f17991a, new C0162c(c0474g, enumC1533a, interfaceC2768p0, interfaceC3277a, z7));
    }
}
