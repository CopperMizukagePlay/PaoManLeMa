package p035e1;

import p001a0.C0005b;
import p001a0.C0078t0;
import p028d2.C0477j;
import p060h5.C1814v;
import p092m.AbstractC2487d;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.InterfaceC3549w;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.n0 */
/* loaded from: classes.dex */
public final class C0669n0 extends AbstractC3809q implements InterfaceC3549w, InterfaceC3551w1 {

    /* renamed from: A */
    public boolean f2184A;

    /* renamed from: B */
    public long f2185B;

    /* renamed from: C */
    public long f2186C;

    /* renamed from: D */
    public int f2187D;

    /* renamed from: E */
    public C0005b f2188E;

    /* renamed from: s */
    public float f2189s;

    /* renamed from: t */
    public float f2190t;

    /* renamed from: u */
    public float f2191u;

    /* renamed from: v */
    public float f2192v;

    /* renamed from: w */
    public float f2193w;

    /* renamed from: x */
    public float f2194x;

    /* renamed from: y */
    public long f2195y;

    /* renamed from: z */
    public InterfaceC0667m0 f2196z;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0078t0(6, mo4918e, this));
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: g */
    public final boolean mo1447g() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f2189s);
        sb.append(", scaleY=");
        sb.append(this.f2190t);
        sb.append(", alpha = ");
        sb.append(this.f2191u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f2192v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f2193w);
        sb.append(", cameraDistance=");
        sb.append(this.f2194x);
        sb.append(", transformOrigin=");
        sb.append((Object) C0675q0.m1451c(this.f2195y));
        sb.append(", shape=");
        sb.append(this.f2196z);
        sb.append(", clip=");
        sb.append(this.f2184A);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC2487d.m4051o(this.f2185B, sb, ", spotShadowColor=");
        AbstractC2487d.m4051o(this.f2186C, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC0659i0.m1398E(this.f2187D));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
    }
}
