package p123q0;

import p079k1.C2259a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.n */
/* loaded from: classes.dex */
public final class C2979n extends AbstractC2977l {

    /* renamed from: h */
    public final C2259a0 f15401h;

    public C2979n(C2259a0 c2259a0) {
        this.f15401h = c2259a0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f15399g;
        this.f15399g = i7 + 2;
        Object[] objArr = this.f15397e;
        return new C2966a(this.f15401h, objArr[i7], objArr[i7 + 1]);
    }
}
