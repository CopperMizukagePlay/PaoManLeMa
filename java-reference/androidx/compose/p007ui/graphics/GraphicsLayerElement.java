package androidx.compose.p007ui.graphics;

import p001a0.C0005b;
import p035e1.AbstractC0659i0;
import p035e1.C0669n0;
import p035e1.C0675q0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f761a;

    /* renamed from: b */
    public final float f762b;

    /* renamed from: c */
    public final float f763c;

    /* renamed from: d */
    public final long f764d;

    /* renamed from: e */
    public final InterfaceC0667m0 f765e;

    /* renamed from: f */
    public final boolean f766f;

    /* renamed from: g */
    public final long f767g;

    /* renamed from: h */
    public final long f768h;

    public GraphicsLayerElement(float f7, float f8, float f9, long j6, InterfaceC0667m0 interfaceC0667m0, boolean z7, long j7, long j8) {
        this.f761a = f7;
        this.f762b = f8;
        this.f763c = f9;
        this.f764d = j6;
        this.f765e = interfaceC0667m0;
        this.f766f = z7;
        this.f767g = j7;
        this.f768h = j8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
                if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f761a, graphicsLayerElement.f761a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f762b, graphicsLayerElement.f762b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f763c, graphicsLayerElement.f763c) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                    long j6 = graphicsLayerElement.f764d;
                    int i7 = C0675q0.f2201c;
                    if (this.f764d == j6 && AbstractC3367j.m5096a(this.f765e, graphicsLayerElement.f765e) && this.f766f == graphicsLayerElement.f766f && C0677s.m1454c(this.f767g, graphicsLayerElement.f767g) && C0677s.m1454c(this.f768h, graphicsLayerElement.f768h)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e1.n0, java.lang.Object, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f2189s = 1.0f;
        abstractC3809q.f2190t = 1.0f;
        abstractC3809q.f2191u = this.f761a;
        abstractC3809q.f2192v = this.f762b;
        abstractC3809q.f2193w = this.f763c;
        abstractC3809q.f2194x = 8.0f;
        abstractC3809q.f2195y = this.f764d;
        abstractC3809q.f2196z = this.f765e;
        abstractC3809q.f2184A = this.f766f;
        abstractC3809q.f2185B = this.f767g;
        abstractC3809q.f2186C = this.f768h;
        abstractC3809q.f2187D = 3;
        abstractC3809q.f2188E = new C0005b(10, abstractC3809q);
        return abstractC3809q;
    }

    public final int hashCode() {
        int m4038b = AbstractC2487d.m4038b(8.0f, AbstractC2487d.m4038b(this.f763c, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(this.f762b, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(this.f761a, AbstractC2487d.m4038b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = C0675q0.f2201c;
        int m4040d = AbstractC2487d.m4040d((this.f765e.hashCode() + AbstractC2487d.m4039c(m4038b, 31, this.f764d)) * 31, 961, this.f766f);
        int i8 = C0677s.f2210h;
        return AbstractC2647h.m4255a(3, AbstractC2647h.m4255a(0, AbstractC2487d.m4039c(AbstractC2487d.m4039c(m4040d, 31, this.f767g), 31, this.f768h), 31), 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0669n0 c0669n0 = (C0669n0) abstractC3809q;
        c0669n0.f2189s = 1.0f;
        c0669n0.f2190t = 1.0f;
        c0669n0.f2191u = this.f761a;
        c0669n0.f2192v = this.f762b;
        c0669n0.f2193w = this.f763c;
        c0669n0.f2194x = 8.0f;
        c0669n0.f2195y = this.f764d;
        c0669n0.f2196z = this.f765e;
        c0669n0.f2184A = this.f766f;
        c0669n0.f2185B = this.f767g;
        c0669n0.f2186C = this.f768h;
        c0669n0.f2187D = 3;
        AbstractC3497e1 abstractC3497e1 = AbstractC3498f.m5380t(c0669n0, 2).f16848t;
        if (abstractC3497e1 != null) {
            abstractC3497e1.m5357u1(c0669n0.f2188E, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f761a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f762b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f763c);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C0675q0.m1451c(this.f764d));
        sb.append(", shape=");
        sb.append(this.f765e);
        sb.append(", clip=");
        sb.append(this.f766f);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC2487d.m4051o(this.f767g, sb, ", spotShadowColor=");
        sb.append((Object) C0677s.m1460i(this.f768h));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC0659i0.m1398E(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
