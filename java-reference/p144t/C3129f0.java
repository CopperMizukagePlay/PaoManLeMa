package p144t;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.f0 */
/* loaded from: classes.dex */
public final class C3129f0 implements InterfaceC3159u0 {

    /* renamed from: a */
    public final InterfaceC3159u0 f15774a;

    /* renamed from: b */
    public final int f15775b;

    public C3129f0(InterfaceC3159u0 interfaceC3159u0, int i7) {
        this.f15774a = interfaceC3159u0;
        this.f15775b = i7;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: a */
    public final int mo3478a(InterfaceC3093c interfaceC3093c) {
        if ((this.f15775b & 32) != 0) {
            return this.f15774a.mo3478a(interfaceC3093c);
        }
        return 0;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: b */
    public final int mo3479b(InterfaceC3093c interfaceC3093c) {
        if ((this.f15775b & 16) != 0) {
            return this.f15774a.mo3479b(interfaceC3093c);
        }
        return 0;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: c */
    public final int mo3480c(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        int i7;
        if (enumC3103m == EnumC3103m.f15703e) {
            i7 = 4;
        } else {
            i7 = 1;
        }
        if ((i7 & this.f15775b) != 0) {
            return this.f15774a.mo3480c(interfaceC3093c, enumC3103m);
        }
        return 0;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: d */
    public final int mo3481d(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        int i7;
        if (enumC3103m == EnumC3103m.f15703e) {
            i7 = 8;
        } else {
            i7 = 2;
        }
        if ((i7 & this.f15775b) != 0) {
            return this.f15774a.mo3481d(interfaceC3093c, enumC3103m);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3129f0)) {
            return false;
        }
        C3129f0 c3129f0 = (C3129f0) obj;
        if (AbstractC3367j.m5096a(this.f15774a, c3129f0.f15774a) && this.f15775b == c3129f0.f15775b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15775b) + (this.f15774a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f15774a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i7 = this.f15775b;
        int i8 = AbstractC3122c.f15758c;
        if ((i7 & i8) == i8) {
            AbstractC3122c.m4833f(sb3, "Start");
        }
        int i9 = AbstractC3122c.f15760e;
        if ((i7 & i9) == i9) {
            AbstractC3122c.m4833f(sb3, "Left");
        }
        if ((i7 & 16) == 16) {
            AbstractC3122c.m4833f(sb3, "Top");
        }
        int i10 = AbstractC3122c.f15759d;
        if ((i7 & i10) == i10) {
            AbstractC3122c.m4833f(sb3, "End");
        }
        int i11 = AbstractC3122c.f15761f;
        if ((i7 & i11) == i11) {
            AbstractC3122c.m4833f(sb3, "Right");
        }
        if ((i7 & 32) == 32) {
            AbstractC3122c.m4833f(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        AbstractC3367j.m5099d(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
