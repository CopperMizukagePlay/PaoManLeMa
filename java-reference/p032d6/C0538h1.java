package p032d6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.h1 */
/* loaded from: classes.dex */
public final class C0538h1 implements InterfaceC0585x0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1882f = AtomicIntegerFieldUpdater.newUpdater(C0538h1.class, "_isCompleting$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1883g = AtomicReferenceFieldUpdater.newUpdater(C0538h1.class, Object.class, "_rootCause$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1884h = AtomicReferenceFieldUpdater.newUpdater(C0538h1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: e */
    public final C0547k1 f1885e;

    public C0538h1(C0547k1 c0547k1, Throwable th) {
        this.f1885e = c0547k1;
        this._rootCause$volatile = th;
    }

    /* renamed from: a */
    public final void m1164a(Throwable th) {
        Throwable m1165c = m1165c();
        if (m1165c == null) {
            f1883g.set(this, th);
            return;
        }
        if (th != m1165c) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1884h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: b */
    public final boolean mo1156b() {
        if (m1165c() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final Throwable m1165c() {
        return (Throwable) f1883g.get(this);
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: d */
    public final C0547k1 mo1157d() {
        return this.f1885e;
    }

    /* renamed from: e */
    public final boolean m1166e() {
        if (m1165c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final ArrayList m1167f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1884h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable m1165c = m1165c();
        if (m1165c != null) {
            arrayList.add(0, m1165c);
        }
        if (th != null && !th.equals(m1165c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0525d0.f1862h);
        return arrayList;
    }

    public final String toString() {
        boolean z7;
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m1166e());
        sb.append(", completing=");
        if (f1882f.get(this) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        sb.append(z7);
        sb.append(", rootCause=");
        sb.append(m1165c());
        sb.append(", exceptions=");
        sb.append(f1884h.get(this));
        sb.append(", list=");
        sb.append(this.f1885e);
        sb.append(']');
        return sb.toString();
    }
}
