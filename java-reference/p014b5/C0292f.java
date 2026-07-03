package p014b5;

import p001a0.C0031h1;
import p067i4.C2073f;
import p194z4.EnumC3873d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b5.f */
/* loaded from: classes.dex */
public final class C0292f {

    /* renamed from: a */
    public final EnumC3873d f1062a;

    /* renamed from: b */
    public final int f1063b;

    /* renamed from: c */
    public final int f1064c;

    /* renamed from: d */
    public final int f1065d;

    /* renamed from: e */
    public final /* synthetic */ C0031h1 f1066e;

    public C0292f(C0031h1 c0031h1, EnumC3873d enumC3873d, int i7, int i8, int i9) {
        this.f1066e = c0031h1;
        this.f1062a = enumC3873d;
        this.f1063b = i7;
        this.f1064c = i8;
        this.f1065d = i9;
    }

    /* renamed from: a */
    public final int m645a() {
        EnumC3873d enumC3873d = this.f1062a;
        EnumC3873d enumC3873d2 = EnumC3873d.BYTE;
        int i7 = this.f1065d;
        if (enumC3873d == enumC3873d2) {
            C0293g c0293g = (C0293g) this.f1066e.f154h;
            C2073f c2073f = (C2073f) c0293g.f1069c;
            String str = (String) c0293g.f1068b;
            int i8 = this.f1063b;
            return str.substring(i8, i7 + i8).getBytes(c2073f.f12278a[this.f1064c].charset()).length;
        }
        return i7;
    }

    public final String toString() {
        C0293g c0293g = (C0293g) this.f1066e.f154h;
        StringBuilder sb = new StringBuilder();
        EnumC3873d enumC3873d = this.f1062a;
        sb.append(enumC3873d);
        sb.append('(');
        if (enumC3873d == EnumC3873d.ECI) {
            C2073f c2073f = (C2073f) c0293g.f1069c;
            sb.append(c2073f.f12278a[this.f1064c].charset().displayName());
        } else {
            String str = (String) c0293g.f1068b;
            int i7 = this.f1065d;
            int i8 = this.f1063b;
            String substring = str.substring(i8, i7 + i8);
            StringBuilder sb2 = new StringBuilder();
            for (int i9 = 0; i9 < substring.length(); i9++) {
                if (substring.charAt(i9) >= ' ' && substring.charAt(i9) <= '~') {
                    sb2.append(substring.charAt(i9));
                } else {
                    sb2.append('.');
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
