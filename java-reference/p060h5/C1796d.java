package p060h5;

import java.util.RandomAccess;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.d */
/* loaded from: classes.dex */
public final class C1796d extends AbstractC1797e implements RandomAccess {

    /* renamed from: e */
    public final AbstractC1797e f10850e;

    /* renamed from: f */
    public final int f10851f;

    /* renamed from: g */
    public final int f10852g;

    public C1796d(AbstractC1797e abstractC1797e, int i7, int i8) {
        this.f10850e = abstractC1797e;
        this.f10851f = i7;
        AbstractC1793a0.m2982j(i7, i8, abstractC1797e.mo299a());
        this.f10852g = i8 - i7;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f10852g;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f10852g;
        if (i7 >= 0 && i7 < i8) {
            return this.f10850e.get(this.f10851f + i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }
}
