package androidx.compose.p007ui.draw;

import p001a0.C0005b;
import p035e1.C0668n;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p092m.AbstractC2487d;
import p115p.AbstractC2826f;
import p140s2.C3096f;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC0667m0 f752a;

    /* renamed from: b */
    public final boolean f753b;

    /* renamed from: c */
    public final long f754c;

    /* renamed from: d */
    public final long f755d;

    public ShadowGraphicsLayerElement(InterfaceC0667m0 interfaceC0667m0, boolean z7, long j6, long j7) {
        float f7 = AbstractC2826f.f14887a;
        this.f752a = interfaceC0667m0;
        this.f753b = z7;
        this.f754c = j6;
        this.f755d = j7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShadowGraphicsLayerElement) {
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
                float f7 = AbstractC2826f.f14890d;
                if (!C3096f.m4776a(f7, f7) || !AbstractC3367j.m5096a(this.f752a, shadowGraphicsLayerElement.f752a) || this.f753b != shadowGraphicsLayerElement.f753b || !C0677s.m1454c(this.f754c, shadowGraphicsLayerElement.f754c) || !C0677s.m1454c(this.f755d, shadowGraphicsLayerElement.f755d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0668n(new C0005b(5, this));
    }

    public final int hashCode() {
        int m4040d = AbstractC2487d.m4040d((this.f752a.hashCode() + (Float.hashCode(AbstractC2826f.f14890d) * 31)) * 31, 31, this.f753b);
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f755d) + AbstractC2487d.m4039c(m4040d, 31, this.f754c);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0668n c0668n = (C0668n) abstractC3809q;
        c0668n.f2183s = new C0005b(5, this);
        AbstractC3497e1 abstractC3497e1 = AbstractC3498f.m5380t(c0668n, 2).f16848t;
        if (abstractC3497e1 != null) {
            abstractC3497e1.m5357u1(c0668n.f2183s, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) C3096f.m4777b(AbstractC2826f.f14890d));
        sb.append(", shape=");
        sb.append(this.f752a);
        sb.append(", clip=");
        sb.append(this.f753b);
        sb.append(", ambientColor=");
        AbstractC2487d.m4051o(this.f754c, sb, ", spotColor=");
        sb.append((Object) C0677s.m1460i(this.f755d));
        sb.append(')');
        return sb.toString();
    }
}
