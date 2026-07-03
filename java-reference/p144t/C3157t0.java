package p144t;

import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p092m.AbstractC2487d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.t0 */
/* loaded from: classes.dex */
public final class C3157t0 implements InterfaceC3159u0 {

    /* renamed from: a */
    public final String f15841a;

    /* renamed from: b */
    public final C2361g1 f15842b;

    public C3157t0(C3123c0 c3123c0, String str) {
        this.f15841a = str;
        this.f15842b = AbstractC2418w.m3980x(c3123c0);
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: a */
    public final int mo3478a(InterfaceC3093c interfaceC3093c) {
        return m4860e().f15766d;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: b */
    public final int mo3479b(InterfaceC3093c interfaceC3093c) {
        return m4860e().f15764b;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: c */
    public final int mo3480c(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return m4860e().f15765c;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: d */
    public final int mo3481d(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return m4860e().f15763a;
    }

    /* renamed from: e */
    public final C3123c0 m4860e() {
        return (C3123c0) this.f15842b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3157t0)) {
            return false;
        }
        return AbstractC3367j.m5096a(m4860e(), ((C3157t0) obj).m4860e());
    }

    /* renamed from: f */
    public final void m4861f(C3123c0 c3123c0) {
        this.f15842b.setValue(c3123c0);
    }

    public final int hashCode() {
        return this.f15841a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15841a);
        sb.append("(left=");
        sb.append(m4860e().f15763a);
        sb.append(", top=");
        sb.append(m4860e().f15764b);
        sb.append(", right=");
        sb.append(m4860e().f15765c);
        sb.append(", bottom=");
        return AbstractC2487d.m4045i(sb, m4860e().f15766d, ')');
    }
}
