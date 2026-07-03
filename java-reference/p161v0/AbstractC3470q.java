package p161v0;

import p116p0.AbstractC2834c;
import p116p0.C2837f;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.q */
/* loaded from: classes.dex */
public abstract class AbstractC3470q {

    /* renamed from: a */
    public static final Object f16733a = new Object();

    /* renamed from: b */
    public static final Object f16734b = new Object();

    /* renamed from: a */
    public static final void m5260a(int i7, int i8) {
        if (i7 >= 0 && i7 < i8) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i8 + ')');
    }

    /* renamed from: b */
    public static final boolean m5261b(C3475v c3475v, int i7, AbstractC2834c abstractC2834c, boolean z7) {
        boolean z8;
        synchronized (f16733a) {
            try {
                int i8 = c3475v.f16764d;
                if (i8 == i7) {
                    c3475v.f16763c = abstractC2834c;
                    z8 = true;
                    if (z7) {
                        c3475v.f16765e++;
                    }
                    c3475v.f16764d = i8 + 1;
                } else {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    /* renamed from: c */
    public static final int m5262c(long[] jArr, long j6) {
        int length = jArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i8 = (i7 + length) >>> 1;
            long j7 = jArr[i8];
            if (j6 > j7) {
                i7 = i8 + 1;
            } else if (j6 < j7) {
                length = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i7 + 1);
    }

    /* renamed from: d */
    public static AbstractC3459f m5263d() {
        return (AbstractC3459f) AbstractC3465l.f16720b.m105t();
    }

    /* renamed from: e */
    public static final C3475v m5264e(C3469p c3469p) {
        C3475v c3475v = c3469p.f16732e;
        AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (C3475v) AbstractC3465l.m5253t(c3475v, c3469p);
    }

    /* renamed from: f */
    public static final int m5265f(C3469p c3469p) {
        C3475v c3475v = c3469p.f16732e;
        AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((C3475v) AbstractC3465l.m5242i(c3475v)).f16765e;
    }

    /* renamed from: g */
    public static AbstractC3459f m5266g(AbstractC3459f abstractC3459f) {
        if (abstractC3459f instanceof C3455c0) {
            C3455c0 c3455c0 = (C3455c0) abstractC3459f;
            if (c3455c0.f16690t == AbstractC3178i.m4871b()) {
                c3455c0.f16688r = null;
                return abstractC3459f;
            }
        }
        if (abstractC3459f instanceof C3457d0) {
            C3457d0 c3457d0 = (C3457d0) abstractC3459f;
            if (c3457d0.f16697i == AbstractC3178i.m4871b()) {
                c3457d0.f16696h = null;
                return abstractC3459f;
            }
        }
        AbstractC3459f m5241h = AbstractC3465l.m5241h(abstractC3459f, null, false);
        m5241h.m5227j();
        return m5241h;
    }

    /* renamed from: h */
    public static final boolean m5267h(C3469p c3469p, InterfaceC3279c interfaceC3279c) {
        int i7;
        AbstractC2834c abstractC2834c;
        Object mo23f;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (f16733a) {
                C3475v c3475v = c3469p.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            C2837f mo4458e = abstractC2834c.mo4458e();
            mo23f = interfaceC3279c.mo23f(mo4458e);
            AbstractC2834c m4477c = mo4458e.m4477c();
            if (AbstractC3367j.m5096a(m4477c, abstractC2834c)) {
                break;
            }
            C3475v c3475v3 = c3469p.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, c3469p, m5244k), i7, m4477c, true);
            }
            AbstractC3465l.m5247n(m5244k, c3469p);
        } while (!m5261b);
        return ((Boolean) mo23f).booleanValue();
    }

    /* renamed from: i */
    public static Object m5268i(InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c) {
        C3452b c3452b;
        AbstractC3459f c3455c0;
        if (interfaceC3279c == null) {
            return interfaceC3277a.mo52a();
        }
        AbstractC3459f abstractC3459f = (AbstractC3459f) AbstractC3465l.f16720b.m105t();
        if (abstractC3459f instanceof C3455c0) {
            C3455c0 c3455c02 = (C3455c0) abstractC3459f;
            if (c3455c02.f16690t == AbstractC3178i.m4871b()) {
                InterfaceC3279c interfaceC3279c2 = c3455c02.f16688r;
                InterfaceC3279c interfaceC3279c3 = c3455c02.f16689s;
                try {
                    ((C3455c0) abstractC3459f).f16688r = AbstractC3465l.m5245l(interfaceC3279c, interfaceC3279c2, true);
                    ((C3455c0) abstractC3459f).f16689s = interfaceC3279c3;
                    return interfaceC3277a.mo52a();
                } finally {
                    c3455c02.f16688r = interfaceC3279c2;
                    c3455c02.f16689s = interfaceC3279c3;
                }
            }
        }
        if (abstractC3459f != null && !(abstractC3459f instanceof C3452b)) {
            if (interfaceC3279c == null) {
                return interfaceC3277a.mo52a();
            }
            c3455c0 = abstractC3459f.mo5202u(interfaceC3279c);
        } else {
            if (abstractC3459f instanceof C3452b) {
                c3452b = (C3452b) abstractC3459f;
            } else {
                c3452b = null;
            }
            c3455c0 = new C3455c0(c3452b, interfaceC3279c, null, true, false);
        }
        try {
            AbstractC3459f m5227j = c3455c0.m5227j();
            try {
                Object mo52a = interfaceC3277a.mo52a();
                AbstractC3459f.m5225q(m5227j);
                c3455c0.mo5198c();
                return mo52a;
            } catch (Throwable th) {
                AbstractC3459f.m5225q(m5227j);
                throw th;
            }
        } catch (Throwable th2) {
            c3455c0.mo5198c();
            throw th2;
        }
    }

    /* renamed from: j */
    public static void m5269j(AbstractC3459f abstractC3459f, AbstractC3459f abstractC3459f2, InterfaceC3279c interfaceC3279c) {
        if (abstractC3459f == abstractC3459f2) {
            if (abstractC3459f instanceof C3455c0) {
                ((C3455c0) abstractC3459f).f16688r = interfaceC3279c;
                return;
            } else if (abstractC3459f instanceof C3457d0) {
                ((C3457d0) abstractC3459f).f16696h = interfaceC3279c;
                return;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC3459f).toString());
            }
        }
        abstractC3459f2.getClass();
        AbstractC3459f.m5225q(abstractC3459f);
        abstractC3459f2.mo5198c();
    }

    /* renamed from: k */
    public static final void m5270k() {
        throw new UnsupportedOperationException();
    }
}
