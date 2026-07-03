package androidx.compose.foundation.layout;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p144t.C3119a1;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class WrapContentElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final int f654a;

    /* renamed from: b */
    public final AbstractC3368k f655b;

    /* renamed from: c */
    public final Object f656c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i7, InterfaceC3281e interfaceC3281e, Object obj) {
        this.f654a = i7;
        this.f655b = (AbstractC3368k) interfaceC3281e;
        this.f656c = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && WrapContentElement.class == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.f654a != wrapContentElement.f654a || !this.f656c.equals(wrapContentElement.f656c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, t.a1] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15751s = this.f654a;
        abstractC3809q.f15752t = this.f655b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f656c.hashCode() + AbstractC2487d.m4040d(AbstractC2647h.m4257c(this.f654a) * 31, 31, false);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3119a1 c3119a1 = (C3119a1) abstractC3809q;
        c3119a1.f15751s = this.f654a;
        c3119a1.f15752t = this.f655b;
    }
}
