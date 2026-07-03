package p123q0;

import p077k.C2215s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.m */
/* loaded from: classes.dex */
public final class C2978m extends AbstractC2977l {

    /* renamed from: h */
    public final /* synthetic */ int f15400h;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15400h) {
            case 0:
                int i7 = this.f15399g;
                this.f15399g = i7 + 2;
                Object[] objArr = this.f15397e;
                return new C2215s(1, objArr[i7], objArr[i7 + 1]);
            case 1:
                int i8 = this.f15399g;
                this.f15399g = i8 + 2;
                return this.f15397e[i8];
            default:
                int i9 = this.f15399g;
                this.f15399g = i9 + 2;
                return this.f15397e[i9 + 1];
        }
    }
}
