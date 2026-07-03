package androidx.compose.p007ui.graphics;

import p035e1.AbstractC0659i0;
import p035e1.AbstractC0683y;
import p035e1.C0675q0;
import p035e1.InterfaceC0667m0;
import p150t5.InterfaceC3279c;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.ui.graphics.a */
/* loaded from: classes.dex */
public abstract class AbstractC0168a {
    /* renamed from: a */
    public static final InterfaceC3810r m384a(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c) {
        return interfaceC3810r.mo5829e(new BlockGraphicsLayerElement(interfaceC3279c));
    }

    /* renamed from: b */
    public static InterfaceC3810r m385b(InterfaceC3810r interfaceC3810r, float f7, InterfaceC0667m0 interfaceC0667m0, int i7) {
        if ((i7 & 32) != 0) {
            f7 = 0.0f;
        }
        float f8 = f7;
        long j6 = C0675q0.f2200b;
        if ((i7 & 2048) != 0) {
            interfaceC0667m0 = AbstractC0659i0.f2147a;
        }
        long j7 = AbstractC0683y.f2215a;
        return interfaceC3810r.mo5829e(new GraphicsLayerElement(1.0f, f8, 0.0f, j6, interfaceC0667m0, false, j7, j7));
    }

    /* renamed from: c */
    public static InterfaceC3810r m386c(InterfaceC3810r interfaceC3810r, float f7, float f8, InterfaceC0667m0 interfaceC0667m0, int i7) {
        float f9;
        InterfaceC0667m0 interfaceC0667m02;
        boolean z7;
        if ((i7 & 4) != 0) {
            f7 = 1.0f;
        }
        float f10 = f7;
        if ((i7 & 256) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f8;
        }
        long j6 = C0675q0.f2200b;
        if ((i7 & 2048) != 0) {
            interfaceC0667m02 = AbstractC0659i0.f2147a;
        } else {
            interfaceC0667m02 = interfaceC0667m0;
        }
        if ((i7 & 4096) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z8 = z7;
        long j7 = AbstractC0683y.f2215a;
        return interfaceC3810r.mo5829e(new GraphicsLayerElement(f10, 0.0f, f9, j6, interfaceC0667m02, z8, j7, j7));
    }
}
