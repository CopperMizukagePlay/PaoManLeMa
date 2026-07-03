package p161v0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p060h5.AbstractC1798f;
import p108o0.InterfaceC2793c;
import p108o0.InterfaceC2794d;
import p123q0.C2967b;
import p123q0.C2969d;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3597d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.s */
/* loaded from: classes.dex */
public final class C3472s implements InterfaceC3478y, Map, InterfaceC3597d {

    /* renamed from: e */
    public C3471r f16737e;

    /* renamed from: f */
    public final C3466m f16738f;

    /* renamed from: g */
    public final C3466m f16739g;

    /* renamed from: h */
    public final C3466m f16740h;

    public C3472s() {
        C2967b c2967b = C2967b.f15371g;
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        C3471r c3471r = new C3471r(m5244k.mo5221g(), c2967b);
        if (!(m5244k instanceof C3450a)) {
            c3471r.f16668b = new C3471r(1, c2967b);
        }
        this.f16737e = c3471r;
        this.f16738f = new C3466m(this, 0);
        this.f16739g = new C3466m(this, 1);
        this.f16740h = new C3466m(this, 2);
    }

    /* renamed from: d */
    public static final boolean m5271d(C3472s c3472s, C3471r c3471r, int i7, InterfaceC2794d interfaceC2794d) {
        boolean z7;
        synchronized (AbstractC3470q.f16734b) {
            int i8 = c3471r.f16736d;
            if (i8 == i7) {
                c3471r.f16735c = interfaceC2794d;
                z7 = true;
                c3471r.f16736d = i8 + 1;
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f16737e;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f16737e = (C3471r) abstractC3451a0;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC3459f m5244k;
        C3471r c3471r = this.f16737e;
        AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
        C2967b c2967b = C2967b.f15371g;
        if (c2967b != c3471r2.f16735c) {
            C3471r c3471r3 = this.f16737e;
            AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                C3471r c3471r4 = (C3471r) AbstractC3465l.m5256w(c3471r3, this, m5244k);
                synchronized (AbstractC3470q.f16734b) {
                    c3471r4.f16735c = c2967b;
                    c3471r4.f16736d++;
                }
            }
            AbstractC3465l.m5247n(m5244k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m5272e().f16735c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m5272e().f16735c.containsValue(obj);
    }

    /* renamed from: e */
    public final C3471r m5272e() {
        C3471r c3471r = this.f16737e;
        AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C3471r) AbstractC3465l.m5253t(c3471r, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f16738f;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m5272e().f16735c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC1798f) m5272e().f16735c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f16739g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        Object put;
        AbstractC3459f m5244k;
        boolean m5271d;
        do {
            synchronized (AbstractC3470q.f16734b) {
                C3471r c3471r = this.f16737e;
                AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                interfaceC2794d = c3471r2.f16735c;
                i7 = c3471r2.f16736d;
            }
            AbstractC3367j.m5097b(interfaceC2794d);
            C2969d c2969d = (C2969d) interfaceC2794d.builder();
            put = c2969d.put(obj, obj2);
            InterfaceC2794d build = c2969d.build();
            if (AbstractC3367j.m5096a(build, interfaceC2794d)) {
                break;
            }
            C3471r c3471r3 = this.f16737e;
            AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5271d = m5271d(this, (C3471r) AbstractC3465l.m5256w(c3471r3, this, m5244k), i7, build);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5271d);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        AbstractC3459f m5244k;
        boolean m5271d;
        do {
            synchronized (AbstractC3470q.f16734b) {
                C3471r c3471r = this.f16737e;
                AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                interfaceC2794d = c3471r2.f16735c;
                i7 = c3471r2.f16736d;
            }
            AbstractC3367j.m5097b(interfaceC2794d);
            C2969d c2969d = (C2969d) interfaceC2794d.builder();
            c2969d.putAll(map);
            InterfaceC2794d build = c2969d.build();
            if (!AbstractC3367j.m5096a(build, interfaceC2794d)) {
                C3471r c3471r3 = this.f16737e;
                AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (AbstractC3465l.f16721c) {
                    m5244k = AbstractC3465l.m5244k();
                    m5271d = m5271d(this, (C3471r) AbstractC3465l.m5256w(c3471r3, this, m5244k), i7, build);
                }
                AbstractC3465l.m5247n(m5244k, this);
            } else {
                return;
            }
        } while (!m5271d);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC2794d interfaceC2794d;
        int i7;
        Object remove;
        AbstractC3459f m5244k;
        boolean m5271d;
        do {
            synchronized (AbstractC3470q.f16734b) {
                C3471r c3471r = this.f16737e;
                AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C3471r c3471r2 = (C3471r) AbstractC3465l.m5242i(c3471r);
                interfaceC2794d = c3471r2.f16735c;
                i7 = c3471r2.f16736d;
            }
            AbstractC3367j.m5097b(interfaceC2794d);
            InterfaceC2793c builder = interfaceC2794d.builder();
            remove = builder.remove(obj);
            InterfaceC2794d build = builder.build();
            if (AbstractC3367j.m5096a(build, interfaceC2794d)) {
                break;
            }
            C3471r c3471r3 = this.f16737e;
            AbstractC3367j.m5098c(c3471r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5271d = m5271d(this, (C3471r) AbstractC3465l.m5256w(c3471r3, this, m5244k), i7, build);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5271d);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        AbstractC1798f abstractC1798f = (AbstractC1798f) m5272e().f16735c;
        abstractC1798f.getClass();
        return ((C2967b) abstractC1798f).f15373f;
    }

    public final String toString() {
        C3471r c3471r = this.f16737e;
        AbstractC3367j.m5098c(c3471r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C3471r) AbstractC3465l.m5242i(c3471r)).f16735c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f16740h;
    }
}
