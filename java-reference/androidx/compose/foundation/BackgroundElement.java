package androidx.compose.foundation;

import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p092m.AbstractC2487d;
import p107o.C2749j;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class BackgroundElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final long f575a;

    /* renamed from: b */
    public final AbstractC0670o f576b;

    /* renamed from: c */
    public final float f577c;

    /* renamed from: d */
    public final InterfaceC0667m0 f578d;

    public BackgroundElement(long j6, AbstractC0663k0 abstractC0663k0, InterfaceC0667m0 interfaceC0667m0, int i7) {
        j6 = (i7 & 1) != 0 ? C0677s.f2209g : j6;
        abstractC0663k0 = (i7 & 2) != 0 ? null : abstractC0663k0;
        this.f575a = j6;
        this.f576b = abstractC0663k0;
        this.f577c = 1.0f;
        this.f578d = interfaceC0667m0;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !C0677s.m1454c(this.f575a, backgroundElement.f575a) || !AbstractC3367j.m5096a(this.f576b, backgroundElement.f576b) || this.f577c != backgroundElement.f577c || !AbstractC3367j.m5096a(this.f578d, backgroundElement.f578d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.j, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14677s = this.f575a;
        abstractC3809q.f14678t = this.f576b;
        abstractC3809q.f14679u = this.f577c;
        abstractC3809q.f14680v = this.f578d;
        abstractC3809q.f14681w = 9205357640488583168L;
        return abstractC3809q;
    }

    public final int hashCode() {
        int i7;
        int i8 = C0677s.f2210h;
        int hashCode = Long.hashCode(this.f575a) * 31;
        AbstractC0670o abstractC0670o = this.f576b;
        if (abstractC0670o != null) {
            i7 = abstractC0670o.hashCode();
        } else {
            i7 = 0;
        }
        return this.f578d.hashCode() + AbstractC2487d.m4038b(this.f577c, (hashCode + i7) * 31, 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2749j c2749j = (C2749j) abstractC3809q;
        c2749j.f14677s = this.f575a;
        c2749j.f14678t = this.f576b;
        c2749j.f14679u = this.f577c;
        c2749j.f14680v = this.f578d;
    }
}
