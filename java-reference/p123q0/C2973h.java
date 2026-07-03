package p123q0;

import java.util.Iterator;
import java.util.Map;
import p060h5.AbstractC1801i;
import p108o0.InterfaceC2792b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.h */
/* loaded from: classes.dex */
public final class C2973h extends AbstractC1801i implements InterfaceC2792b {

    /* renamed from: e */
    public final /* synthetic */ int f15389e;

    /* renamed from: f */
    public final C2967b f15390f;

    public /* synthetic */ C2973h(C2967b c2967b, int i7) {
        this.f15389e = i7;
        this.f15390f = c2967b;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        switch (this.f15389e) {
            case 0:
                C2967b c2967b = this.f15390f;
                c2967b.getClass();
                return c2967b.f15373f;
            default:
                C2967b c2967b2 = this.f15390f;
                c2967b2.getClass();
                return c2967b2.f15373f;
        }
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f15389e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2967b c2967b = this.f15390f;
                Object obj2 = c2967b.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !c2967b.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.f15390f.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15389e) {
            case 0:
                C2976k c2976k = this.f15390f.f15372e;
                AbstractC2977l[] abstractC2977lArr = new AbstractC2977l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC2977lArr[i7] = new C2978m(0);
                }
                return new AbstractC2968c(c2976k, abstractC2977lArr);
            default:
                C2976k c2976k2 = this.f15390f.f15372e;
                AbstractC2977l[] abstractC2977lArr2 = new AbstractC2977l[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    abstractC2977lArr2[i8] = new C2978m(1);
                }
                return new AbstractC2968c(c2976k2, abstractC2977lArr2);
        }
    }
}
