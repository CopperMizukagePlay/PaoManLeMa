package androidx.compose.foundation;

import p001a0.C0040j2;
import p028d2.C0474g;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0663k0;
import p035e1.InterfaceC0667m0;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.a */
/* loaded from: classes.dex */
public abstract class AbstractC0145a {
    /* renamed from: a */
    public static InterfaceC3810r m318a(InterfaceC3810r interfaceC3810r, AbstractC0663k0 abstractC0663k0) {
        return interfaceC3810r.mo5829e(new BackgroundElement(0L, abstractC0663k0, AbstractC0659i0.f2147a, 1));
    }

    /* renamed from: b */
    public static final InterfaceC3810r m319b(InterfaceC3810r interfaceC3810r, long j6, InterfaceC0667m0 interfaceC0667m0) {
        return interfaceC3810r.mo5829e(new BackgroundElement(j6, null, interfaceC0667m0, 2));
    }

    /* renamed from: c */
    public static final InterfaceC3810r m320c(InterfaceC3810r interfaceC3810r, C3081j c3081j, InterfaceC2768p0 interfaceC2768p0, boolean z7, String str, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        InterfaceC3810r m5821a;
        if (interfaceC2768p0 instanceof InterfaceC2780u0) {
            m5821a = new ClickableElement(c3081j, (InterfaceC2780u0) interfaceC2768p0, z7, str, c0474g, interfaceC3277a);
        } else if (interfaceC2768p0 == null) {
            m5821a = new ClickableElement(c3081j, null, z7, str, c0474g, interfaceC3277a);
        } else {
            C3807o c3807o = C3807o.f17991a;
            if (c3081j != null) {
                m5821a = AbstractC0150f.m326a(c3807o, c3081j, interfaceC2768p0).mo5829e(new ClickableElement(c3081j, null, z7, str, c0474g, interfaceC3277a));
            } else {
                m5821a = AbstractC3793a.m5821a(c3807o, new C0146b(interfaceC2768p0, z7, str, c0474g, interfaceC3277a));
            }
        }
        return interfaceC3810r.mo5829e(m5821a);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC3810r m321d(InterfaceC3810r interfaceC3810r, C3081j c3081j, InterfaceC2768p0 interfaceC2768p0, boolean z7, C0474g c0474g, InterfaceC3277a interfaceC3277a, int i7) {
        if ((i7 & 16) != 0) {
            c0474g = null;
        }
        return m320c(interfaceC3810r, c3081j, interfaceC2768p0, z7, null, c0474g, interfaceC3277a);
    }

    /* renamed from: e */
    public static InterfaceC3810r m322e(int i7, String str, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return AbstractC3793a.m5821a(interfaceC3810r, new C0040j2(z7, str, interfaceC3277a, 3));
    }

    /* renamed from: f */
    public static InterfaceC3810r m323f(InterfaceC3810r interfaceC3810r, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2) {
        return AbstractC3793a.m5821a(interfaceC3810r, new C0147c(interfaceC3277a, interfaceC3277a2));
    }

    /* renamed from: g */
    public static InterfaceC3810r m324g(InterfaceC3810r interfaceC3810r, C3081j c3081j) {
        return interfaceC3810r.mo5829e(new HoverableElement(c3081j));
    }
}
