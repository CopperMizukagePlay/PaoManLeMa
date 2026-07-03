package p063i0;

import p092m.AbstractC2487d;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.c0 */
/* loaded from: classes.dex */
public final class C1861c0 {

    /* renamed from: a */
    public final float f10991a;

    /* renamed from: b */
    public final float f10992b;

    /* renamed from: c */
    public final float f10993c;

    /* renamed from: d */
    public final float f10994d;

    /* renamed from: e */
    public final float f10995e;

    public C1861c0(float f7, float f8, float f9, float f10, float f11) {
        this.f10991a = f7;
        this.f10992b = f8;
        this.f10993c = f9;
        this.f10994d = f10;
        this.f10995e = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1861c0)) {
                C1861c0 c1861c0 = (C1861c0) obj;
                if (C3096f.m4776a(this.f10991a, c1861c0.f10991a) && C3096f.m4776a(this.f10992b, c1861c0.f10992b) && C3096f.m4776a(this.f10993c, c1861c0.f10993c) && C3096f.m4776a(this.f10994d, c1861c0.f10994d) && C3096f.m4776a(this.f10995e, c1861c0.f10995e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10995e) + AbstractC2487d.m4038b(this.f10994d, AbstractC2487d.m4038b(this.f10993c, AbstractC2487d.m4038b(this.f10992b, Float.hashCode(this.f10991a) * 31, 31), 31), 31);
    }
}
