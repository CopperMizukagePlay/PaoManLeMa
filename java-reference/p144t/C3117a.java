package p144t;

import p012b3.C0274b;
import p051g3.C1672z0;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p092m.AbstractC2487d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.a */
/* loaded from: classes.dex */
public final class C3117a implements InterfaceC3159u0 {

    /* renamed from: a */
    public final int f15744a;

    /* renamed from: b */
    public final String f15745b;

    /* renamed from: c */
    public final C2361g1 f15746c = AbstractC2418w.m3980x(C0274b.f1014e);

    /* renamed from: d */
    public final C2361g1 f15747d = AbstractC2418w.m3980x(Boolean.TRUE);

    public C3117a(String str, int i7) {
        this.f15744a = i7;
        this.f15745b = str;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: a */
    public final int mo3478a(InterfaceC3093c interfaceC3093c) {
        return m4817e().f1018d;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: b */
    public final int mo3479b(InterfaceC3093c interfaceC3093c) {
        return m4817e().f1016b;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: c */
    public final int mo3480c(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return m4817e().f1017c;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: d */
    public final int mo3481d(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return m4817e().f1015a;
    }

    /* renamed from: e */
    public final C0274b m4817e() {
        return (C0274b) this.f15746c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3117a) {
                if (this.f15744a == ((C3117a) obj).f15744a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m4818f(C1672z0 c1672z0, int i7) {
        int i8 = this.f15744a;
        if (i7 != 0 && (i7 & i8) == 0) {
            return;
        }
        this.f15746c.setValue(c1672z0.f10450a.mo2671i(i8));
        this.f15747d.setValue(Boolean.valueOf(c1672z0.f10450a.mo2678u(i8)));
    }

    public final int hashCode() {
        return this.f15744a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15745b);
        sb.append('(');
        sb.append(m4817e().f1015a);
        sb.append(", ");
        sb.append(m4817e().f1016b);
        sb.append(", ");
        sb.append(m4817e().f1017c);
        sb.append(", ");
        return AbstractC2487d.m4045i(sb, m4817e().f1018d, ')');
    }
}
