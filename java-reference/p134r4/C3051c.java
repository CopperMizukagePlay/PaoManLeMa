package p134r4;

import p022c4.C0406p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r4.c */
/* loaded from: classes.dex */
public final class C3051c {

    /* renamed from: a */
    public final int f15631a;

    /* renamed from: b */
    public final int[] f15632b;

    /* renamed from: c */
    public final C0406p[] f15633c;

    public C3051c(int i7, int[] iArr, int i8, int i9, int i10) {
        this.f15631a = i7;
        this.f15632b = iArr;
        float f7 = i8;
        float f8 = i10;
        this.f15633c = new C0406p[]{new C0406p(f7, f8), new C0406p(i9, f8)};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3051c) || this.f15631a != ((C3051c) obj).f15631a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15631a;
    }
}
