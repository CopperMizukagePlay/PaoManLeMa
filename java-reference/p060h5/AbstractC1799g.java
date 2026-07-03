package p060h5;

import java.util.AbstractList;
import java.util.List;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.g */
/* loaded from: classes.dex */
public abstract class AbstractC1799g extends AbstractList implements List, InterfaceC3595b {
    /* renamed from: a */
    public abstract int mo2999a();

    /* renamed from: b */
    public abstract Object mo3000b(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return mo3000b(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo2999a();
    }
}
