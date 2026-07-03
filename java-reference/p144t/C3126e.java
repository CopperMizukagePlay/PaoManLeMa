package p144t;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.InterfaceC3223n0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C3126e implements InterfaceC3128f, InterfaceC3132h {

    /* renamed from: a */
    public final /* synthetic */ int f15770a;

    /* renamed from: b */
    public final float f15771b;

    public C3126e(int i7) {
        this.f15770a = i7;
        switch (i7) {
            case 1:
                this.f15771b = 0;
                return;
            case 2:
                this.f15771b = 0;
                return;
            case 3:
                this.f15771b = 0;
                return;
            default:
                this.f15771b = 0;
                return;
        }
    }

    @Override // p144t.InterfaceC3128f, p144t.InterfaceC3132h
    /* renamed from: a */
    public final float mo4835a() {
        switch (this.f15770a) {
            case 0:
                return this.f15771b;
            case 1:
                return this.f15771b;
            case 2:
                return this.f15771b;
            default:
                return this.f15771b;
        }
    }

    @Override // p144t.InterfaceC3132h
    /* renamed from: b */
    public final void mo4834b(int i7, InterfaceC3223n0 interfaceC3223n0, int[] iArr, int[] iArr2) {
        switch (this.f15770a) {
            case 0:
                AbstractC3136j.m4837a(i7, iArr, iArr2, false);
                return;
            case 1:
                AbstractC3136j.m4840d(i7, iArr, iArr2, false);
                return;
            case 2:
                AbstractC3136j.m4841e(i7, iArr, iArr2, false);
                return;
            default:
                AbstractC3136j.m4842f(i7, iArr, iArr2, false);
                return;
        }
    }

    @Override // p144t.InterfaceC3128f
    /* renamed from: c */
    public final void mo4823c(InterfaceC3093c interfaceC3093c, int i7, int[] iArr, EnumC3103m enumC3103m, int[] iArr2) {
        switch (this.f15770a) {
            case 0:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4837a(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4837a(i7, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4840d(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4840d(i7, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4841e(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4841e(i7, iArr, iArr2, true);
                    return;
                }
            default:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4842f(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4842f(i7, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f15770a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
