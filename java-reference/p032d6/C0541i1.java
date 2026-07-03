package p032d6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000a.AbstractC0000a;
import p001a0.C0098z1;
import p039e5.C1306th;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p068i5.AbstractC2080d;
import p069i6.C2095h;
import p069i6.C2096i;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.i1 */
/* loaded from: classes.dex */
public class C0541i1 implements InterfaceC0520b1, InterfaceC0559o1 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1886e = AtomicReferenceFieldUpdater.newUpdater(C0541i1.class, Object.class, "_state$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1887f = AtomicReferenceFieldUpdater.newUpdater(C0541i1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0541i1(boolean z7) {
        C0555n0 c0555n0;
        if (z7) {
            c0555n0 = AbstractC0525d0.f1864j;
        } else {
            c0555n0 = AbstractC0525d0.f1863i;
        }
        this._state$volatile = c0555n0;
    }

    /* renamed from: Z */
    public static C0560p m1169Z(C2096i c2096i) {
        while (c2096i.mo1207i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2096i.f12365f;
            C2096i m3448f = c2096i.m3448f();
            if (m3448f == null) {
                Object obj = atomicReferenceFieldUpdater.get(c2096i);
                while (true) {
                    c2096i = (C2096i) obj;
                    if (!c2096i.mo1207i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2096i);
                }
            } else {
                c2096i = m3448f;
            }
        }
        while (true) {
            c2096i = c2096i.m3450h();
            if (!c2096i.mo1207i()) {
                if (c2096i instanceof C0560p) {
                    return (C0560p) c2096i;
                }
                if (c2096i instanceof C0547k1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: g0 */
    public static String m1170g0(Object obj) {
        if (obj instanceof C0538h1) {
            C0538h1 c0538h1 = (C0538h1) obj;
            if (c0538h1.m1166e()) {
                return "Cancelling";
            }
            if (C0538h1.f1882f.get(c0538h1) == 0) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof InterfaceC0585x0) {
            if (((InterfaceC0585x0) obj).mo1156b()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C0569s) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        return interfaceC3281e.mo22d(obj, this);
    }

    /* renamed from: E */
    public void mo1171E(Object obj) {
        mo1159D(obj);
    }

    /* renamed from: F */
    public final Object m1172F(AbstractC2583c abstractC2583c) {
        Object obj;
        do {
            obj = f1886e.get(this);
            if (!(obj instanceof InterfaceC0585x0)) {
                if (!(obj instanceof C0569s)) {
                    return AbstractC0525d0.m1147y(obj);
                }
                throw ((C0569s) obj).f1923a;
            }
        } while (m1194f0(obj) < 0);
        C0532f1 c0532f1 = new C0532f1(AbstractC2064e.m3250x(abstractC2583c), this);
        c0532f1.m1222u();
        c0532f1.m1225x(new C0536h(2, AbstractC0525d0.m1138p(this, true, new C0517a1(1, c0532f1))));
        return c0532f1.m1221t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0 = p032d6.AbstractC0525d0.f1858d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != p032d6.AbstractC0525d0.f1859e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = m1195h0(r0, new p032d6.C0569s(m1178M(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 == p032d6.AbstractC0525d0.f1860f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 != p032d6.AbstractC0525d0.f1858d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r4 = p032d6.C0541i1.f1886e;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof p032d6.C0538h1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if ((r5 instanceof p032d6.InterfaceC0585x0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r1 = m1178M(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r6 = (p032d6.InterfaceC0585x0) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (mo1150Q() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r6.mo1156b() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r4 = m1195h0(r5, new p032d6.C0569s(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r4 == p032d6.AbstractC0525d0.f1858d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r4 == p032d6.AbstractC0525d0.f1860f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = p032d6.C0541i1.f1886e.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r5).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r7 = m1181R(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r7 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r8 = new p032d6.C0538h1(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof p032d6.InterfaceC0585x0) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (r4.get(r9) == r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        m1188a0(r7, r1);
        r10 = p032d6.AbstractC0525d0.f1858d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        r10 = p032d6.AbstractC0525d0.f1861g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005a, code lost:
    
        if (p032d6.C0538h1.f1884h.get((p032d6.C0538h1) r5) != p032d6.AbstractC0525d0.f1862h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005f, code lost:
    
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0061, code lost:
    
        r10 = p032d6.AbstractC0525d0.f1861g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0063, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0069, code lost:
    
        r4 = ((p032d6.C0538h1) r5).m1166e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof p032d6.C0538h1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0070, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0072, code lost:
    
        r1 = m1178M(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0076, code lost:
    
        ((p032d6.C0538h1) r5).m1164a(r1);
        r10 = ((p032d6.C0538h1) r5).m1165c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0083, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0085, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0086, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0087, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0089, code lost:
    
        m1188a0(((p032d6.C0538h1) r5).f1885e, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0090, code lost:
    
        r10 = p032d6.AbstractC0525d0.f1858d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f9, code lost:
    
        if (r0 != p032d6.AbstractC0525d0.f1858d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fe, code lost:
    
        if (r0 != p032d6.AbstractC0525d0.f1859e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        if (r0 != p032d6.AbstractC0525d0.f1861g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0105, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0106, code lost:
    
        mo1159D(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (p032d6.C0538h1.f1882f.get((p032d6.C0538h1) r0) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0109, code lost:
    
        return true;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1173G(Object obj) {
        Object obj2 = AbstractC0525d0.f1858d;
    }

    /* renamed from: H */
    public void mo1174H(CancellationException cancellationException) {
        m1173G(cancellationException);
    }

    /* renamed from: I */
    public final boolean m1175I(Throwable th) {
        if (!mo1185W()) {
            boolean z7 = th instanceof CancellationException;
            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) f1887f.get(this);
            if (interfaceC0557o != null && interfaceC0557o != C0553m1.f1901e) {
                if (!interfaceC0557o.mo1229c(th) && !z7) {
                    return false;
                }
                return true;
            }
            return z7;
        }
        return true;
    }

    /* renamed from: J */
    public String mo1104J() {
        return "Job was cancelled";
    }

    /* renamed from: K */
    public boolean mo1176K(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (m1173G(th) && mo1149P()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [d6.t, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, d6.t] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* renamed from: L */
    public final void m1177L(InterfaceC0585x0 interfaceC0585x0, Object obj) {
        C0569s c0569s;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887f;
        InterfaceC0557o interfaceC0557o = (InterfaceC0557o) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0557o != null) {
            interfaceC0557o.mo1155a();
            atomicReferenceFieldUpdater.set(this, C0553m1.f1901e);
        }
        C0572t c0572t = 0;
        if (obj instanceof C0569s) {
            c0569s = (C0569s) obj;
        } else {
            c0569s = null;
        }
        if (c0569s != null) {
            th = c0569s.f1923a;
        } else {
            th = null;
        }
        if (interfaceC0585x0 instanceof AbstractC0529e1) {
            try {
                ((AbstractC0529e1) interfaceC0585x0).mo1112l(th);
                return;
            } catch (Throwable th2) {
                mo1105T(new RuntimeException("Exception in completion handler " + interfaceC0585x0 + " for " + this, th2));
                return;
            }
        }
        C0547k1 mo1157d = interfaceC0585x0.mo1157d();
        if (mo1157d != null) {
            mo1157d.m3447e(new C2095h(1), 1);
            Object obj2 = C2096i.f12364e.get(mo1157d);
            AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            C2096i c2096i = (C2096i) obj2;
            while (!c2096i.equals(mo1157d)) {
                if (c2096i instanceof AbstractC0529e1) {
                    try {
                        ((AbstractC0529e1) c2096i).mo1112l(th);
                    } catch (Throwable th3) {
                        if (c0572t != 0) {
                            AbstractC0000a.m7h(c0572t, th3);
                        } else {
                            c0572t = new RuntimeException("Exception in completion handler " + c2096i + " for " + this, th3);
                        }
                    }
                }
                c2096i = c2096i.m3450h();
                c0572t = c0572t;
            }
            if (c0572t != 0) {
                mo1105T(c0572t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: M */
    public final Throwable m1178M(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0541i1 c0541i1 = (C0541i1) ((InterfaceC0559o1) obj);
        Object obj2 = f1886e.get(c0541i1);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof C0538h1) {
            cancellationException = ((C0538h1) obj2).m1165c();
        } else if (obj2 instanceof C0569s) {
            cancellationException = ((C0569s) obj2).f1923a;
        } else if (!(obj2 instanceof InterfaceC0585x0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new C0523c1("Parent job is ".concat(m1170g0(obj2)), cancellationException, c0541i1);
        }
        return cancellationException2;
    }

    /* renamed from: N */
    public final Object m1179N(C0538h1 c0538h1, Object obj) {
        C0569s c0569s;
        Throwable m1180O;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C0569s) {
            c0569s = (C0569s) obj;
        } else {
            c0569s = null;
        }
        if (c0569s != null) {
            th = c0569s.f1923a;
        }
        synchronized (c0538h1) {
            c0538h1.m1166e();
            ArrayList m1167f = c0538h1.m1167f(th);
            m1180O = m1180O(c0538h1, m1167f);
            if (m1180O != null && m1167f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(m1167f.size()));
                int size = m1167f.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = m1167f.get(i7);
                    i7++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != m1180O && th2 != m1180O && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC0000a.m7h(m1180O, th2);
                    }
                }
            }
        }
        if (m1180O != null && m1180O != th) {
            obj = new C0569s(m1180O, false);
        }
        if (m1180O != null && (m1175I(m1180O) || mo1182S(m1180O))) {
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0569s.f1922b.compareAndSet((C0569s) obj, 0, 1);
        }
        mo1106b0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1886e;
        if (obj instanceof InterfaceC0585x0) {
            obj2 = new C0588y0((InterfaceC0585x0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0538h1, obj2) && atomicReferenceFieldUpdater.get(this) == c0538h1) {
        }
        m1177L(c0538h1, obj);
        return obj;
    }

    /* renamed from: O */
    public final Throwable m1180O(C0538h1 c0538h1, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!c0538h1.m1166e()) {
                return null;
            }
            return new C0523c1(mo1104J(), null, this);
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                obj = arrayList.get(i8);
                i8++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof AbstractC0577u1) {
            int size2 = arrayList.size();
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i7);
                i7++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof AbstractC0577u1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: P */
    public boolean mo1149P() {
        return true;
    }

    /* renamed from: Q */
    public boolean mo1150Q() {
        return this instanceof C0563q;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [i6.i, d6.k1] */
    /* renamed from: R */
    public final C0547k1 m1181R(InterfaceC0585x0 interfaceC0585x0) {
        C0547k1 mo1157d = interfaceC0585x0.mo1157d();
        if (mo1157d == null) {
            if (interfaceC0585x0 instanceof C0555n0) {
                return new C2096i();
            }
            if (interfaceC0585x0 instanceof AbstractC0529e1) {
                m1192e0((AbstractC0529e1) interfaceC0585x0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC0585x0).toString());
        }
        return mo1157d;
    }

    /* renamed from: S */
    public boolean mo1182S(Throwable th) {
        return false;
    }

    /* renamed from: U */
    public final void m1183U(InterfaceC0520b1 interfaceC0520b1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887f;
        C0553m1 c0553m1 = C0553m1.f1901e;
        if (interfaceC0520b1 == null) {
            atomicReferenceFieldUpdater.set(this, c0553m1);
            return;
        }
        interfaceC0520b1.start();
        InterfaceC0557o mo1115o = interfaceC0520b1.mo1115o(this);
        atomicReferenceFieldUpdater.set(this, mo1115o);
        if (!(f1886e.get(this) instanceof InterfaceC0585x0)) {
            mo1115o.mo1155a();
            atomicReferenceFieldUpdater.set(this, c0553m1);
        }
    }

    /* renamed from: V */
    public final InterfaceC0552m0 m1184V(boolean z7, AbstractC0529e1 abstractC0529e1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0553m1 c0553m1;
        boolean z8;
        Throwable th;
        C0569s c0569s;
        boolean m3447e;
        C0538h1 c0538h1;
        Throwable th2;
        abstractC0529e1.f1870h = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f1886e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj instanceof C0555n0;
            c0553m1 = C0553m1.f1901e;
            z8 = true;
            th = null;
            if (z9) {
                C0555n0 c0555n0 = (C0555n0) obj;
                if (c0555n0.f1904e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0529e1)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m1191d0(c0555n0);
            } else if (obj instanceof InterfaceC0585x0) {
                InterfaceC0585x0 interfaceC0585x0 = (InterfaceC0585x0) obj;
                C0547k1 mo1157d = interfaceC0585x0.mo1157d();
                if (mo1157d == null) {
                    m1192e0((AbstractC0529e1) obj);
                } else {
                    if (abstractC0529e1.mo1111k()) {
                        if (interfaceC0585x0 instanceof C0538h1) {
                            c0538h1 = (C0538h1) interfaceC0585x0;
                        } else {
                            c0538h1 = null;
                        }
                        if (c0538h1 != null) {
                            th2 = c0538h1.m1165c();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            m3447e = mo1157d.m3447e(abstractC0529e1, 5);
                        } else if (z7) {
                            abstractC0529e1.mo1112l(th2);
                            return c0553m1;
                        }
                    } else {
                        m3447e = mo1157d.m3447e(abstractC0529e1, 1);
                    }
                    if (m3447e) {
                        break;
                    }
                }
            } else {
                z8 = false;
                break;
            }
        }
        if (z8) {
            return abstractC0529e1;
        }
        if (z7) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0569s) {
                c0569s = (C0569s) obj2;
            } else {
                c0569s = null;
            }
            if (c0569s != null) {
                th = c0569s.f1923a;
            }
            abstractC0529e1.mo1112l(th);
        }
        return c0553m1;
    }

    /* renamed from: W */
    public boolean mo1185W() {
        return this instanceof C0530f;
    }

    /* renamed from: X */
    public final boolean m1186X(Object obj) {
        Object m1195h0;
        do {
            m1195h0 = m1195h0(f1886e.get(this), obj);
            if (m1195h0 == AbstractC0525d0.f1858d) {
                return false;
            }
            if (m1195h0 == AbstractC0525d0.f1859e) {
                return true;
            }
        } while (m1195h0 == AbstractC0525d0.f1860f);
        mo1159D(m1195h0);
        return true;
    }

    /* renamed from: Y */
    public final Object m1187Y(Object obj) {
        Object m1195h0;
        C0569s c0569s;
        do {
            m1195h0 = m1195h0(f1886e.get(this), obj);
            if (m1195h0 == AbstractC0525d0.f1858d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0569s) {
                    c0569s = (C0569s) obj;
                } else {
                    c0569s = null;
                }
                if (c0569s != null) {
                    th = c0569s.f1923a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (m1195h0 == AbstractC0525d0.f1860f);
        return m1195h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable, d6.t] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: a0 */
    public final void m1188a0(C0547k1 c0547k1, Throwable th) {
        c0547k1.m3447e(new C2095h(4), 4);
        Object obj = C2096i.f12364e.get(c0547k1);
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C2096i c2096i = (C2096i) obj;
        C0572t c0572t = 0;
        while (!c2096i.equals(c0547k1)) {
            if ((c2096i instanceof AbstractC0529e1) && ((AbstractC0529e1) c2096i).mo1111k()) {
                try {
                    ((AbstractC0529e1) c2096i).mo1112l(th);
                } catch (Throwable th2) {
                    if (c0572t != 0) {
                        AbstractC0000a.m7h(c0572t, th2);
                    } else {
                        c0572t = new RuntimeException("Exception in completion handler " + c2096i + " for " + this, th2);
                    }
                }
            }
            c2096i = c2096i.m3450h();
            c0572t = c0572t;
        }
        if (c0572t != 0) {
            mo1105T(c0572t);
        }
        m1175I(th);
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: b */
    public boolean mo1113b() {
        Object obj = f1886e.get(this);
        if ((obj instanceof InterfaceC0585x0) && ((InterfaceC0585x0) obj).mo1156b()) {
            return true;
        }
        return false;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: c */
    public void mo1114c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0523c1(mo1104J(), null, this);
        }
        mo1174H(cancellationException);
    }

    /* renamed from: d */
    public Object m1190d(C1306th c1306th) {
        return m1172F(c1306th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i6.i, d6.k1] */
    /* renamed from: d0 */
    public final void m1191d0(C0555n0 c0555n0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? c2096i = new C2096i();
        C0582w0 c0582w0 = c2096i;
        if (!c0555n0.f1904e) {
            c0582w0 = new C0582w0(c2096i);
        }
        do {
            atomicReferenceFieldUpdater = f1886e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0555n0, c0582w0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0555n0);
    }

    /* renamed from: e0 */
    public final void m1192e0(AbstractC0529e1 abstractC0529e1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2096i c2096i = new C2096i();
        abstractC0529e1.getClass();
        C2096i.f12365f.set(c2096i, abstractC0529e1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2096i.f12364e;
        atomicReferenceFieldUpdater2.set(c2096i, abstractC0529e1);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC0529e1) != abstractC0529e1) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0529e1, abstractC0529e1, c2096i)) {
                if (atomicReferenceFieldUpdater2.get(abstractC0529e1) != abstractC0529e1) {
                    break;
                }
            }
            c2096i.m3449g(abstractC0529e1);
        }
        C2096i m3450h = abstractC0529e1.m3450h();
        do {
            atomicReferenceFieldUpdater = f1886e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0529e1, m3450h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0529e1);
    }

    /* renamed from: f */
    public Object m1193f() {
        Object obj = f1886e.get(this);
        if (!(obj instanceof InterfaceC0585x0)) {
            if (!(obj instanceof C0569s)) {
                return AbstractC0525d0.m1147y(obj);
            }
            throw ((C0569s) obj).f1923a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    /* renamed from: f0 */
    public final int m1194f0(Object obj) {
        boolean z7 = obj instanceof C0555n0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1886e;
        if (z7) {
            if (!((C0555n0) obj).f1904e) {
                C0555n0 c0555n0 = AbstractC0525d0.f1864j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0555n0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                mo1189c0();
                return 1;
            }
            return 0;
        }
        if (obj instanceof C0582w0) {
            C0547k1 c0547k1 = ((C0582w0) obj).f1936e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0547k1)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo1189c0();
            return 1;
        }
        return 0;
    }

    @Override // p082k5.InterfaceC2316f
    public final InterfaceC2317g getKey() {
        return C0584x.f1939f;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3401n(this, interfaceC2317g);
    }

    /* renamed from: h0 */
    public final Object m1195h0(Object obj, Object obj2) {
        Object obj3;
        C0538h1 c0538h1;
        boolean z7;
        C0569s c0569s;
        if (!(obj instanceof InterfaceC0585x0)) {
            return AbstractC0525d0.f1858d;
        }
        if (((obj instanceof C0555n0) || (obj instanceof AbstractC0529e1)) && !(obj instanceof C0560p) && !(obj2 instanceof C0569s)) {
            InterfaceC0585x0 interfaceC0585x0 = (InterfaceC0585x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1886e;
            if (obj2 instanceof InterfaceC0585x0) {
                obj3 = new C0588y0((InterfaceC0585x0) obj2);
            } else {
                obj3 = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0585x0, obj3)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0585x0) {
                    return AbstractC0525d0.f1860f;
                }
            }
            mo1106b0(obj2);
            m1177L(interfaceC0585x0, obj2);
            return obj2;
        }
        InterfaceC0585x0 interfaceC0585x02 = (InterfaceC0585x0) obj;
        C0547k1 m1181R = m1181R(interfaceC0585x02);
        if (m1181R == null) {
            return AbstractC0525d0.f1860f;
        }
        Throwable th = null;
        if (interfaceC0585x02 instanceof C0538h1) {
            c0538h1 = (C0538h1) interfaceC0585x02;
        } else {
            c0538h1 = null;
        }
        if (c0538h1 == null) {
            c0538h1 = new C0538h1(m1181R, null);
        }
        synchronized (c0538h1) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0538h1.f1882f;
            if (atomicIntegerFieldUpdater.get(c0538h1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                return AbstractC0525d0.f1858d;
            }
            atomicIntegerFieldUpdater.set(c0538h1, 1);
            if (c0538h1 != interfaceC0585x02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1886e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0585x02, c0538h1)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0585x02) {
                        return AbstractC0525d0.f1860f;
                    }
                }
            }
            boolean m1166e = c0538h1.m1166e();
            if (obj2 instanceof C0569s) {
                c0569s = (C0569s) obj2;
            } else {
                c0569s = null;
            }
            if (c0569s != null) {
                c0538h1.m1164a(c0569s.f1923a);
            }
            Throwable m1165c = c0538h1.m1165c();
            if (!m1166e) {
                th = m1165c;
            }
            if (th != null) {
                m1188a0(m1181R, th);
            }
            C0560p m1169Z = m1169Z(m1181R);
            if (m1169Z != null && m1196i0(c0538h1, m1169Z, obj2)) {
                return AbstractC0525d0.f1859e;
            }
            m1181R.m3447e(new C2095h(2), 2);
            C0560p m1169Z2 = m1169Z(m1181R);
            if (m1169Z2 != null && m1196i0(c0538h1, m1169Z2, obj2)) {
                return AbstractC0525d0.f1859e;
            }
            return m1179N(c0538h1, obj2);
        }
    }

    /* renamed from: i0 */
    public final boolean m1196i0(C0538h1 c0538h1, C0560p c0560p, Object obj) {
        while (AbstractC0525d0.m1138p(c0560p.f1907i, false, new C0535g1(this, c0538h1, c0560p, obj)) == C0553m1.f1901e) {
            c0560p = m1169Z(c0560p);
            if (c0560p == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: o */
    public final InterfaceC0557o mo1115o(C0541i1 c0541i1) {
        C0569s c0569s;
        C0569s c0569s2;
        C0560p c0560p = new C0560p(c0541i1);
        c0560p.f1870h = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1886e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0555n0) {
                C0555n0 c0555n0 = (C0555n0) obj;
                if (c0555n0.f1904e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0560p)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m1191d0(c0555n0);
            } else {
                boolean z7 = obj instanceof InterfaceC0585x0;
                C0553m1 c0553m1 = C0553m1.f1901e;
                Throwable th = null;
                if (z7) {
                    C0547k1 mo1157d = ((InterfaceC0585x0) obj).mo1157d();
                    if (mo1157d == null) {
                        m1192e0((AbstractC0529e1) obj);
                    } else if (!mo1157d.m3447e(c0560p, 7)) {
                        boolean m3447e = mo1157d.m3447e(c0560p, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C0538h1) {
                            th = ((C0538h1) obj2).m1165c();
                        } else {
                            if (obj2 instanceof C0569s) {
                                c0569s2 = (C0569s) obj2;
                            } else {
                                c0569s2 = null;
                            }
                            if (c0569s2 != null) {
                                th = c0569s2.f1923a;
                            }
                        }
                        c0560p.mo1112l(th);
                        if (m3447e) {
                            break loop0;
                        }
                        return c0553m1;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0569s) {
                        c0569s = (C0569s) obj3;
                    } else {
                        c0569s = null;
                    }
                    if (c0569s != null) {
                        th = c0569s.f1923a;
                    }
                    c0560p.mo1112l(th);
                    return c0553m1;
                }
            }
        }
        return c0560p;
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: s */
    public final Object mo1116s(AbstractC2583c abstractC2583c) {
        Object obj;
        C1694m c1694m;
        do {
            obj = f1886e.get(this);
            boolean z7 = obj instanceof InterfaceC0585x0;
            c1694m = C1694m.f10482a;
            if (!z7) {
                AbstractC0525d0.m1132j(abstractC2583c.mo662j());
                return c1694m;
            }
        } while (m1194f0(obj) < 0);
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(abstractC2583c));
        c0548l.m1222u();
        c0548l.m1225x(new C0536h(2, AbstractC0525d0.m1138p(this, true, new C0554n(c0548l, 1))));
        Object m1221t = c0548l.m1221t();
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1221t != enumC2465a) {
            m1221t = c1694m;
        }
        if (m1221t == enumC2465a) {
            return m1221t;
        }
        return c1694m;
    }

    @Override // p032d6.InterfaceC0520b1
    public final boolean start() {
        int m1194f0;
        do {
            m1194f0 = m1194f0(f1886e.get(this));
            if (m1194f0 == 0) {
                return false;
            }
        } while (m1194f0 != 1);
        return true;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3411x(this, interfaceC2317g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m1170g0(f1886e.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0525d0.m1134l(this));
        return sb.toString();
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: u */
    public final InterfaceC0552m0 mo1117u(boolean z7, boolean z8, C0098z1 c0098z1) {
        AbstractC0529e1 c0517a1;
        if (z7) {
            c0517a1 = new C0591z0(c0098z1);
        } else {
            c0517a1 = new C0517a1(0, c0098z1);
        }
        return m1184V(z8, c0517a1);
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: w */
    public final CancellationException mo1118w() {
        Object obj = f1886e.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof C0538h1) {
            Throwable m1165c = ((C0538h1) obj).m1165c();
            if (m1165c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (m1165c instanceof CancellationException) {
                    cancellationException = (CancellationException) m1165c;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = mo1104J();
                    }
                    return new C0523c1(concat, m1165c, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(obj instanceof InterfaceC0585x0)) {
            if (obj instanceof C0569s) {
                Throwable th = ((C0569s) obj).f1923a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new C0523c1(mo1104J(), th, this);
                }
                return cancellationException;
            }
            return new C0523c1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p032d6.InterfaceC0520b1
    /* renamed from: y */
    public final InterfaceC0552m0 mo1119y(InterfaceC3279c interfaceC3279c) {
        return m1184V(true, new C0517a1(0, interfaceC3279c));
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        return AbstractC2080d.m3374B(this, interfaceC2318h);
    }

    /* renamed from: c0 */
    public void mo1189c0() {
    }

    /* renamed from: D */
    public void mo1159D(Object obj) {
    }

    /* renamed from: T */
    public void mo1105T(C0572t c0572t) {
        throw c0572t;
    }

    /* renamed from: b0 */
    public void mo1106b0(Object obj) {
    }
}
