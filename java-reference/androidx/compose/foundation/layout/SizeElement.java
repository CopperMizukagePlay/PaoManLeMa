package androidx.compose.foundation.layout;

import p092m.AbstractC2487d;
import p140s2.C3096f;
import p144t.C3151q0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class SizeElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f647a;

    /* renamed from: b */
    public final float f648b;

    /* renamed from: c */
    public final float f649c;

    /* renamed from: d */
    public final float f650d;

    /* renamed from: e */
    public final boolean f651e;

    public SizeElement(float f7, float f8, float f9, float f10, boolean z7) {
        this.f647a = f7;
        this.f648b = f8;
        this.f649c = f9;
        this.f650d = f10;
        this.f651e = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) obj;
                if (!C3096f.m4776a(this.f647a, sizeElement.f647a) || !C3096f.m4776a(this.f648b, sizeElement.f648b) || !C3096f.m4776a(this.f649c, sizeElement.f649c) || !C3096f.m4776a(this.f650d, sizeElement.f650d) || this.f651e != sizeElement.f651e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, t.q0] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15827s = this.f647a;
        abstractC3809q.f15828t = this.f648b;
        abstractC3809q.f15829u = this.f649c;
        abstractC3809q.f15830v = this.f650d;
        abstractC3809q.f15831w = this.f651e;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f651e) + AbstractC2487d.m4038b(this.f650d, AbstractC2487d.m4038b(this.f649c, AbstractC2487d.m4038b(this.f648b, Float.hashCode(this.f647a) * 31, 31), 31), 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3151q0 c3151q0 = (C3151q0) abstractC3809q;
        c3151q0.f15827s = this.f647a;
        c3151q0.f15828t = this.f648b;
        c3151q0.f15829u = this.f649c;
        c3151q0.f15830v = this.f650d;
        c3151q0.f15831w = this.f651e;
    }

    public /* synthetic */ SizeElement(float f7, float f8, float f9, float f10, int i7) {
        this((i7 & 1) != 0 ? Float.NaN : f7, (i7 & 2) != 0 ? Float.NaN : f8, (i7 & 4) != 0 ? Float.NaN : f9, (i7 & 8) != 0 ? Float.NaN : f10, true);
    }
}
