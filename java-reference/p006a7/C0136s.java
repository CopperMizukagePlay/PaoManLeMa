package p006a7;

import java.util.RandomAccess;
import p060h5.AbstractC1797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.s */
/* loaded from: classes.dex */
public final class C0136s extends AbstractC1797e implements RandomAccess {

    /* renamed from: e */
    public final C0130m[] f547e;

    /* renamed from: f */
    public final int[] f548f;

    public C0136s(C0130m[] c0130mArr, int[] iArr) {
        this.f547e = c0130mArr;
        this.f548f = iArr;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f547e.length;
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C0130m)) {
            return false;
        }
        return super.contains((C0130m) obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f547e[i7];
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C0130m)) {
            return -1;
        }
        return super.indexOf((C0130m) obj);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C0130m)) {
            return -1;
        }
        return super.lastIndexOf((C0130m) obj);
    }
}
