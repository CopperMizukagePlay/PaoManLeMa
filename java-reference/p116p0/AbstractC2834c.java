package p116p0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p060h5.AbstractC1797e;
import p108o0.C2791a;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2834c extends AbstractC1797e implements List, Collection, InterfaceC3594a {
    /* renamed from: b */
    public abstract AbstractC2834c mo4455b(int i7, Object obj);

    /* renamed from: c */
    public abstract AbstractC2834c mo4456c(Object obj);

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public AbstractC2834c mo4457d(Collection collection) {
        C2837f mo4458e = mo4458e();
        mo4458e.addAll(collection);
        return mo4458e.m4477c();
    }

    /* renamed from: e */
    public abstract C2837f mo4458e();

    /* renamed from: f */
    public abstract AbstractC2834c mo4459f(C2833b c2833b);

    /* renamed from: g */
    public abstract AbstractC2834c mo4460g(int i7);

    /* renamed from: h */
    public abstract AbstractC2834c mo4461h(int i7, Object obj);

    @Override // p060h5.AbstractC1797e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final List subList(int i7, int i8) {
        return new C2791a(this, i7, i8);
    }
}
