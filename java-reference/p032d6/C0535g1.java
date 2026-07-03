package p032d6;

import p069i6.C2095h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.g1 */
/* loaded from: classes.dex */
public final class C0535g1 extends AbstractC0529e1 {

    /* renamed from: i */
    public final C0541i1 f1876i;

    /* renamed from: j */
    public final C0538h1 f1877j;

    /* renamed from: k */
    public final C0560p f1878k;

    /* renamed from: l */
    public final Object f1879l;

    public C0535g1(C0541i1 c0541i1, C0538h1 c0538h1, C0560p c0560p, Object obj) {
        this.f1876i = c0541i1;
        this.f1877j = c0538h1;
        this.f1878k = c0560p;
        this.f1879l = obj;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: k */
    public final boolean mo1111k() {
        return false;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: l */
    public final void mo1112l(Throwable th) {
        C0560p c0560p = this.f1878k;
        C0560p m1169Z = C0541i1.m1169Z(c0560p);
        C0541i1 c0541i1 = this.f1876i;
        C0538h1 c0538h1 = this.f1877j;
        Object obj = this.f1879l;
        if (m1169Z == null || !c0541i1.m1196i0(c0538h1, m1169Z, obj)) {
            c0538h1.f1885e.m3447e(new C2095h(2), 2);
            C0560p m1169Z2 = C0541i1.m1169Z(c0560p);
            if (m1169Z2 != null && c0541i1.m1196i0(c0538h1, m1169Z2, obj)) {
                return;
            }
            c0541i1.mo1159D(c0541i1.m1179N(c0538h1, obj));
        }
    }
}
