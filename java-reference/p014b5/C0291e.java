package p014b5;

import p067i4.C2073f;
import p194z4.C3875f;
import p194z4.EnumC3873d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b5.e */
/* loaded from: classes.dex */
public final class C0291e {

    /* renamed from: a */
    public final EnumC3873d f1056a;

    /* renamed from: b */
    public final int f1057b;

    /* renamed from: c */
    public final int f1058c;

    /* renamed from: d */
    public final int f1059d;

    /* renamed from: e */
    public final C0291e f1060e;

    /* renamed from: f */
    public final int f1061f;

    public C0291e(C0293g c0293g, EnumC3873d enumC3873d, int i7, int i8, int i9, C0291e c0291e, C3875f c3875f) {
        int i10;
        int i11;
        this.f1056a = enumC3873d;
        this.f1057b = i7;
        EnumC3873d enumC3873d2 = EnumC3873d.BYTE;
        if (enumC3873d != enumC3873d2 && c0291e != null) {
            i10 = c0291e.f1058c;
        } else {
            i10 = i8;
        }
        this.f1058c = i10;
        this.f1059d = i9;
        this.f1060e = c0291e;
        boolean z7 = false;
        if (c0291e != null) {
            i11 = c0291e.f1061f;
        } else {
            i11 = 0;
        }
        if ((enumC3873d == enumC3873d2 && c0291e == null && i10 != 0) || (c0291e != null && i10 != c0291e.f1058c)) {
            z7 = true;
        }
        int i12 = 4;
        i11 = (c0291e == null || enumC3873d != c0291e.f1056a || z7) ? i11 + enumC3873d.m5895a(c3875f) + 4 : i11;
        int ordinal = enumC3873d.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i11 += 13;
                    }
                } else {
                    i11 += ((String) c0293g.f1068b).substring(i7, i9 + i7).getBytes(((C2073f) c0293g.f1069c).f12278a[i8].charset()).length * 8;
                    if (z7) {
                        i11 += 12;
                    }
                }
            } else {
                i11 += i9 != 1 ? 11 : 6;
            }
        } else {
            if (i9 != 1) {
                if (i9 == 2) {
                    i12 = 7;
                } else {
                    i12 = 10;
                }
            }
            i11 += i12;
        }
        this.f1061f = i11;
    }
}
