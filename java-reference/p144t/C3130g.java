package p144t;

import p092m.AbstractC2487d;
import p140s2.C3096f;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.g */
/* loaded from: classes.dex */
public final class C3130g implements InterfaceC3128f, InterfaceC3132h {

    /* renamed from: a */
    public final float f15776a;

    /* renamed from: b */
    public final boolean f15777b;

    /* renamed from: c */
    public final InterfaceC3281e f15778c;

    /* renamed from: d */
    public final float f15779d;

    public C3130g(float f7, boolean z7, InterfaceC3281e interfaceC3281e) {
        this.f15776a = f7;
        this.f15777b = z7;
        this.f15778c = interfaceC3281e;
        this.f15779d = f7;
    }

    @Override // p144t.InterfaceC3128f, p144t.InterfaceC3132h
    /* renamed from: a */
    public final float mo4835a() {
        return this.f15779d;
    }

    @Override // p144t.InterfaceC3132h
    /* renamed from: b */
    public final void mo4834b(int i7, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int[] iArr2) {
        mo4823c(interfaceC3223n0, i7, iArr, EnumC3103m.f15703e, iArr2);
    }

    @Override // p144t.InterfaceC3128f
    /* renamed from: c */
    public final void mo4823c(InterfaceC3093c interfaceC3093c, int i7, int[] iArr, EnumC3103m enumC3103m, int[] iArr2) {
        boolean z7;
        int i8;
        int i9;
        if (iArr.length != 0) {
            int mo4513Q = interfaceC3093c.mo4513Q(this.f15776a);
            if (this.f15777b && enumC3103m == EnumC3103m.f15704f) {
                z7 = true;
            } else {
                z7 = false;
            }
            C3120b c3120b = AbstractC3136j.f15789a;
            if (!z7) {
                int length = iArr.length;
                int i10 = 0;
                i8 = 0;
                i9 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    int min = Math.min(i8, i7 - i12);
                    iArr2[i11] = min;
                    int min2 = Math.min(mo4513Q, (i7 - min) - i12);
                    int i13 = iArr2[i11] + i12 + min2;
                    i10++;
                    i9 = min2;
                    i8 = i13;
                    i11++;
                }
            } else {
                i8 = 0;
                i9 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i14 = iArr[length2];
                    int min3 = Math.min(i8, i7 - i14);
                    iArr2[length2] = min3;
                    i9 = Math.min(mo4513Q, (i7 - min3) - i14);
                    i8 = iArr2[length2] + i14 + i9;
                }
            }
            int i15 = i8 - i9;
            InterfaceC3281e interfaceC3281e = this.f15778c;
            if (interfaceC3281e != null && i15 < i7) {
                int intValue = ((Number) interfaceC3281e.mo22d(Integer.valueOf(i7 - i15), enumC3103m)).intValue();
                int length3 = iArr2.length;
                for (int i16 = 0; i16 < length3; i16++) {
                    iArr2[i16] = iArr2[i16] + intValue;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3130g) {
                C3130g c3130g = (C3130g) obj;
                if (!C3096f.m4776a(this.f15776a, c3130g.f15776a) || this.f15777b != c3130g.f15777b || !AbstractC3367j.m5096a(this.f15778c, c3130g.f15778c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(Float.hashCode(this.f15776a) * 31, 31, this.f15777b);
        InterfaceC3281e interfaceC3281e = this.f15778c;
        if (interfaceC3281e == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC3281e.hashCode();
        }
        return m4040d + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f15777b) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb.append(str);
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) C3096f.m4777b(this.f15776a));
        sb.append(", ");
        sb.append(this.f15778c);
        sb.append(')');
        return sb.toString();
    }
}
