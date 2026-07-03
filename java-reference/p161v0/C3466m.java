package p161v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p060h5.AbstractC1798f;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p108o0.InterfaceC2792b;
import p108o0.InterfaceC2793c;
import p108o0.InterfaceC2794d;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3596c;
import p166v5.InterfaceC3598e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.m */
/* loaded from: classes.dex */
public final class C3466m implements Set, InterfaceC3598e {

    /* renamed from: e */
    public final C3472s f16730e;

    /* renamed from: f */
    public final /* synthetic */ int f16731f;

    public C3466m(C3472s c3472s, int i7) {
        this.f16731f = i7;
        this.f16730e = c3472s;
    }

    /* renamed from: a */
    private final boolean m5257a(Collection collection) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        AbstractC3459f m5244k;
        boolean m5271d;
        Set m3038F0 = AbstractC1805m.m3038F0(collection);
        C3472s c3472s = this.f16730e;
        boolean z7 = false;
        do {
            synchronized (AbstractC3470q.f16734b) {
                C3471r c3471r = c3472s.f16737e;
                AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                interfaceC2794d = c3471r2.f16735c;
                i7 = c3471r2.f16736d;
            }
            AbstractC3367j.m5097b(interfaceC2794d);
            InterfaceC2793c builder = interfaceC2794d.builder();
            Iterator it = c3472s.f16738f.iterator();
            while (((C3477x) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C3477x) it).next();
                if (!m3038F0.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z7 = true;
                }
            }
            InterfaceC2794d build = builder.build();
            if (AbstractC3367j.m5096a(build, interfaceC2794d)) {
                break;
            }
            C3471r c3471r3 = c3472s.f16737e;
            AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5271d = C3472s.m5271d(c3472s, (C3471r) AbstractC3465l.m5256w(c3471r3, c3472s, m5244k), i7, build);
            }
            AbstractC3465l.m5247n(m5244k, c3472s);
        } while (!m5271d);
        return z7;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f16731f) {
            case 0:
                AbstractC3470q.m5270k();
                throw null;
            case 1:
                AbstractC3470q.m5270k();
                throw null;
            default:
                AbstractC3470q.m5270k();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f16731f) {
            case 0:
                AbstractC3470q.m5270k();
                throw null;
            case 1:
                AbstractC3470q.m5270k();
                throw null;
            default:
                AbstractC3470q.m5270k();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16730e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f16731f) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC3594a) || (obj instanceof InterfaceC3596c))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return AbstractC3367j.m5096a(this.f16730e.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return this.f16730e.containsKey(obj);
            default:
                return this.f16730e.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f16731f) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f16730e.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f16730e.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16730e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16731f) {
            case 0:
                C3472s c3472s = this.f16730e;
                return new C3477x(c3472s, ((InterfaceC2792b) ((AbstractC1798f) c3472s.m5272e().f16735c).entrySet()).iterator(), 0);
            case 1:
                C3472s c3472s2 = this.f16730e;
                return new C3477x(c3472s2, ((InterfaceC2792b) ((AbstractC1798f) c3472s2.m5272e().f16735c).entrySet()).iterator(), 1);
            default:
                C3472s c3472s3 = this.f16730e;
                return new C3477x(c3472s3, ((InterfaceC2792b) ((AbstractC1798f) c3472s3.m5272e().f16735c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f16731f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof InterfaceC3594a) && !(obj instanceof InterfaceC3596c)) || this.f16730e.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (this.f16730e.remove(obj) != null) {
                    return true;
                }
                return false;
            default:
                C3472s c3472s = this.f16730e;
                Iterator it = c3472s.f16738f.iterator();
                while (true) {
                    if (((C3477x) it).hasNext()) {
                        obj2 = ((C3477x) it).next();
                        if (AbstractC3367j.m5096a(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    c3472s.remove(entry.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        AbstractC3459f m5244k;
        boolean m5271d;
        switch (this.f16731f) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z7 = false;
                    while (it.hasNext()) {
                        if (this.f16730e.remove(((Map.Entry) it.next()).getKey()) != null || z7) {
                            z7 = true;
                        }
                    }
                    return z7;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z8 = false;
                    while (it2.hasNext()) {
                        if (this.f16730e.remove(it2.next()) != null || z8) {
                            z8 = true;
                        }
                    }
                    return z8;
                    break;
                }
            default:
                Set m3038F0 = AbstractC1805m.m3038F0(collection);
                C3472s c3472s = this.f16730e;
                boolean z9 = false;
                do {
                    synchronized (AbstractC3470q.f16734b) {
                        C3471r c3471r = c3472s.f16737e;
                        AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                        interfaceC2794d = c3471r2.f16735c;
                        i7 = c3471r2.f16736d;
                    }
                    AbstractC3367j.m5097b(interfaceC2794d);
                    InterfaceC2793c builder = interfaceC2794d.builder();
                    Iterator it3 = c3472s.f16738f.iterator();
                    while (((C3477x) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C3477x) it3).next();
                        if (m3038F0.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z9 = true;
                        }
                    }
                    InterfaceC2794d build = builder.build();
                    if (!AbstractC3367j.m5096a(build, interfaceC2794d)) {
                        C3471r c3471r3 = c3472s.f16737e;
                        AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC3465l.f16721c) {
                            m5244k = AbstractC3465l.m5244k();
                            m5271d = C3472s.m5271d(c3472s, (C3471r) AbstractC3465l.m5256w(c3471r3, c3472s, m5244k), i7, build);
                        }
                        AbstractC3465l.m5247n(m5244k, c3472s);
                    }
                    return z9;
                } while (!m5271d);
                return z9;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        AbstractC3459f m5244k;
        boolean m5271d;
        InterfaceC2794d interfaceC2794d2;
        int i8;
        AbstractC3459f m5244k2;
        boolean m5271d2;
        switch (this.f16731f) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(collection2));
                if (m3082N < 16) {
                    m3082N = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C3472s c3472s = this.f16730e;
                boolean z7 = false;
                do {
                    synchronized (AbstractC3470q.f16734b) {
                        C3471r c3471r = c3472s.f16737e;
                        AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                        interfaceC2794d = c3471r2.f16735c;
                        i7 = c3471r2.f16736d;
                    }
                    AbstractC3367j.m5097b(interfaceC2794d);
                    InterfaceC2793c builder = interfaceC2794d.builder();
                    Iterator it = c3472s.f16738f.iterator();
                    while (((C3477x) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C3477x) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC3367j.m5096a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            builder.remove(entry2.getKey());
                            z7 = true;
                        }
                    }
                    InterfaceC2794d build = builder.build();
                    if (!AbstractC3367j.m5096a(build, interfaceC2794d)) {
                        C3471r c3471r3 = c3472s.f16737e;
                        AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC3465l.f16721c) {
                            m5244k = AbstractC3465l.m5244k();
                            m5271d = C3472s.m5271d(c3472s, (C3471r) AbstractC3465l.m5256w(c3471r3, c3472s, m5244k), i7, build);
                        }
                        AbstractC3465l.m5247n(m5244k, c3472s);
                    }
                    return z7;
                } while (!m5271d);
                return z7;
            case 1:
                return m5257a(collection);
            default:
                Set m3038F0 = AbstractC1805m.m3038F0(collection);
                C3472s c3472s2 = this.f16730e;
                boolean z8 = false;
                do {
                    synchronized (AbstractC3470q.f16734b) {
                        C3471r c3471r4 = c3472s2.f16737e;
                        AbstractC3367j.m5098c(c3471r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C3471r c3471r5 = (C3471r) AbstractC3465l.m5242i(c3471r4);
                        interfaceC2794d2 = c3471r5.f16735c;
                        i8 = c3471r5.f16736d;
                    }
                    AbstractC3367j.m5097b(interfaceC2794d2);
                    InterfaceC2793c builder2 = interfaceC2794d2.builder();
                    Iterator it2 = c3472s2.f16738f.iterator();
                    while (((C3477x) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C3477x) it2).next();
                        if (!m3038F0.contains(entry3.getValue())) {
                            builder2.remove(entry3.getKey());
                            z8 = true;
                        }
                    }
                    InterfaceC2794d build2 = builder2.build();
                    if (!AbstractC3367j.m5096a(build2, interfaceC2794d2)) {
                        C3471r c3471r6 = c3472s2.f16737e;
                        AbstractC3367j.m5098c(c3471r6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC3465l.f16721c) {
                            m5244k2 = AbstractC3465l.m5244k();
                            m5271d2 = C3472s.m5271d(c3472s2, (C3471r) AbstractC3465l.m5256w(c3471r6, c3472s2, m5244k2), i8, build2);
                        }
                        AbstractC3465l.m5247n(m5244k2, c3472s2);
                    }
                    return z8;
                } while (!m5271d2);
                return z8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16730e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }
}
