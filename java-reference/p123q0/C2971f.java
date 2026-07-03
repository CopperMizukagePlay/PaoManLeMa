package p123q0;

import java.util.Iterator;
import java.util.Map;
import p060h5.AbstractC1800h;
import p079k1.C2259a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.f */
/* loaded from: classes.dex */
public final class C2971f extends AbstractC1800h {

    /* renamed from: e */
    public final /* synthetic */ int f15387e;

    /* renamed from: f */
    public final C2969d f15388f;

    public /* synthetic */ C2971f(int i7, C2969d c2969d) {
        this.f15387e = i7;
        this.f15388f = c2969d;
    }

    @Override // p060h5.AbstractC1800h
    /* renamed from: a */
    public final int mo3001a() {
        switch (this.f15387e) {
            case 0:
                C2969d c2969d = this.f15388f;
                c2969d.getClass();
                return c2969d.f15382j;
            default:
                C2969d c2969d2 = this.f15388f;
                c2969d2.getClass();
                return c2969d2.f15382j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f15387e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15387e) {
            case 0:
                this.f15388f.clear();
                return;
            default:
                this.f15388f.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f15387e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2969d c2969d = this.f15388f;
                Object obj2 = c2969d.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !c2969d.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.f15388f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15387e) {
            case 0:
                return new C2259a0(this.f15388f);
            default:
                AbstractC2977l[] abstractC2977lArr = new AbstractC2977l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC2977lArr[i7] = new C2978m(1);
                }
                return new C2970e(this.f15388f, abstractC2977lArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f15387e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f15388f.remove(entry.getKey(), entry.getValue());
            default:
                C2969d c2969d = this.f15388f;
                if (c2969d.containsKey(obj)) {
                    c2969d.remove(obj);
                    return true;
                }
                return false;
        }
    }
}
