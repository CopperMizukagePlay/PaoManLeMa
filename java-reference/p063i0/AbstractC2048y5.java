package p063i0;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2395p;
import p085l0.C2401q1;
import p107o.C2767p;
import p137s.C3081j;
import p140s2.C3096f;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p174w5.AbstractC3784a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.y5 */
/* loaded from: classes.dex */
public abstract class AbstractC2048y5 {

    /* renamed from: a */
    public static final C2336a0 f12192a = new C2336a0(C2011u0.f11891p);

    /* renamed from: a */
    public static final void m3210a(InterfaceC3810r interfaceC3810r, InterfaceC0667m0 interfaceC0667m0, long j6, long j7, float f7, float f8, C3173d c3173d, C2395p c2395p, int i7, int i8) {
        long j8;
        float f9;
        float f10;
        if ((i8 & 1) != 0) {
            interfaceC3810r = C3807o.f17991a;
        }
        InterfaceC3810r interfaceC3810r2 = interfaceC3810r;
        if ((i8 & 2) != 0) {
            interfaceC0667m0 = AbstractC0659i0.f2147a;
        }
        InterfaceC0667m0 interfaceC0667m02 = interfaceC0667m0;
        if ((i8 & 8) != 0) {
            j8 = AbstractC2019v0.m3193b(j6, c2395p);
        } else {
            j8 = j7;
        }
        if ((i8 & 16) != 0) {
            f9 = 0;
        } else {
            f9 = f7;
        }
        if ((i8 & 32) != 0) {
            f10 = 0;
        } else {
            f10 = f8;
        }
        C2336a0 c2336a0 = f12192a;
        float f11 = ((C3096f) c2395p.m3878k(c2336a0)).f15693e + f9;
        AbstractC2418w.m3960b(new C2401q1[]{AbstractC1862c1.f10996a.mo3716a(new C0677s(j8)), c2336a0.mo3716a(new C3096f(f11))}, AbstractC3178i.m4873d(-70914509, new C2024v5(interfaceC3810r2, interfaceC0667m02, j6, f11, null, f10, c3173d), c2395p), c2395p, 56);
    }

    /* renamed from: b */
    public static final void m3211b(InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7, InterfaceC0667m0 interfaceC0667m0, long j6, long j7, float f7, float f8, C2767p c2767p, C3081j c3081j, C3173d c3173d, C2395p c2395p, int i7, int i8) {
        boolean z8;
        float f9;
        C2767p c2767p2;
        if ((i8 & 4) != 0) {
            z8 = true;
        } else {
            z8 = z7;
        }
        if ((i8 & 64) != 0) {
            f9 = 0;
        } else {
            f9 = f7;
        }
        if ((i8 & 256) != 0) {
            c2767p2 = null;
        } else {
            c2767p2 = c2767p;
        }
        C2336a0 c2336a0 = f12192a;
        float f10 = ((C3096f) c2395p.m3878k(c2336a0)).f15693e + f9;
        AbstractC2418w.m3960b(new C2401q1[]{AbstractC1862c1.f10996a.mo3716a(new C0677s(j7)), c2336a0.mo3716a(new C3096f(f10))}, AbstractC3178i.m4873d(1279702876, new C2032w5(interfaceC3810r, interfaceC0667m0, j6, f10, c2767p2, c3081j, z8, interfaceC3277a, f8, c3173d), c2395p), c2395p, 56);
    }

    /* renamed from: c */
    public static final InterfaceC3810r m3212c(InterfaceC3810r interfaceC3810r, InterfaceC0667m0 interfaceC0667m0, long j6, C2767p c2767p, float f7) {
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3810r interfaceC3810r3 = C3807o.f17991a;
        if (f7 > 0.0f) {
            interfaceC3810r2 = AbstractC0168a.m385b(interfaceC3810r3, f7, interfaceC0667m0, 124895);
        } else {
            interfaceC3810r2 = interfaceC3810r3;
        }
        InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(interfaceC3810r2);
        if (c2767p != null) {
            interfaceC3810r3 = new BorderModifierNodeElement(c2767p.f14742a, c2767p.f14743b, interfaceC0667m0);
        }
        return AbstractC3784a.m5799c(AbstractC0145a.m319b(mo5829e.mo5829e(interfaceC3810r3), j6, interfaceC0667m0), interfaceC0667m0);
    }

    /* renamed from: d */
    public static final long m3213d(long j6, float f7, C2395p c2395p) {
        C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
        boolean booleanValue = ((Boolean) c2395p.m3878k(AbstractC2019v0.f11944b)).booleanValue();
        long j7 = c2003t0.f11822p;
        if (C0677s.m1454c(j6, j7) && booleanValue) {
            if (C3096f.m4776a(f7, 0)) {
                return j7;
            }
            return AbstractC0659i0.m1410j(C0677s.m1453b(((((float) Math.log(f7 + 1)) * 4.5f) + 2.0f) / 100.0f, c2003t0.f11826t), j7);
        }
        return j6;
    }
}
