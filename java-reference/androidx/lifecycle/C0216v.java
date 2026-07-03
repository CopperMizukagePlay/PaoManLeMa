package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.AbstractC0094y0;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p062i.C1840a;
import p070j.AbstractC2113e;
import p070j.C2109a;
import p070j.C2110b;
import p070j.C2111c;
import p070j.C2112d;
import p158u5.AbstractC3367j;
import p172w3.C3778b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C0216v {

    /* renamed from: a */
    public final boolean f879a;

    /* renamed from: b */
    public C2109a f880b;

    /* renamed from: c */
    public EnumC0203o f881c;

    /* renamed from: d */
    public final WeakReference f882d;

    /* renamed from: e */
    public int f883e;

    /* renamed from: f */
    public boolean f884f;

    /* renamed from: g */
    public boolean f885g;

    /* renamed from: h */
    public final ArrayList f886h;

    /* renamed from: i */
    public final C1701c0 f887i;

    public C0216v(InterfaceC0213t interfaceC0213t, boolean z7) {
        new AtomicReference(null);
        this.f879a = z7;
        this.f880b = new C2109a();
        EnumC0203o enumC0203o = EnumC0203o.f864f;
        this.f881c = enumC0203o;
        this.f886h = new ArrayList();
        this.f882d = new WeakReference(interfaceC0213t);
        this.f887i = AbstractC1719t.m2771b(enumC0203o);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.u, java.lang.Object] */
    /* renamed from: a */
    public final void m468a(InterfaceC0211s interfaceC0211s) {
        InterfaceC0209r c0187g;
        C0215u c0215u;
        InterfaceC0213t interfaceC0213t;
        EnumC0201n enumC0201n;
        AbstractC3367j.m5100e(interfaceC0211s, "observer");
        m470c("addObserver");
        EnumC0203o enumC0203o = this.f881c;
        EnumC0203o enumC0203o2 = EnumC0203o.f863e;
        if (enumC0203o != enumC0203o2) {
            enumC0203o2 = EnumC0203o.f864f;
        }
        ?? obj = new Object();
        HashMap hashMap = AbstractC0217w.f888a;
        boolean z7 = interfaceC0211s instanceof InterfaceC0209r;
        boolean z8 = interfaceC0211s instanceof InterfaceC0183e;
        boolean z9 = false;
        int i7 = 1;
        if (z7 && z8) {
            c0187g = new C0187g((InterfaceC0183e) interfaceC0211s, (InterfaceC0209r) interfaceC0211s);
        } else if (z8) {
            c0187g = new C0187g((InterfaceC0183e) interfaceC0211s, (InterfaceC0209r) null);
        } else if (z7) {
            c0187g = (InterfaceC0209r) interfaceC0211s;
        } else {
            Class<?> cls = interfaceC0211s.getClass();
            if (AbstractC0217w.m476b(cls) == 2) {
                Object obj2 = AbstractC0217w.f889b.get(cls);
                AbstractC3367j.m5097b(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0191i[] interfaceC0191iArr = new InterfaceC0191i[size];
                    if (size <= 0) {
                        c0187g = new C3778b(i7, interfaceC0191iArr);
                    } else {
                        AbstractC0217w.m475a((Constructor) list.get(0), interfaceC0211s);
                        throw null;
                    }
                } else {
                    AbstractC0217w.m475a((Constructor) list.get(0), interfaceC0211s);
                    throw null;
                }
            } else {
                c0187g = new C0187g(interfaceC0211s);
            }
        }
        obj.f878b = c0187g;
        obj.f877a = enumC0203o2;
        C2109a c2109a = this.f880b;
        C2111c c2111c = (C2111c) c2109a.f12391i.get(interfaceC0211s);
        if (c2111c != null) {
            c0215u = c2111c.f12396f;
        } else {
            HashMap hashMap2 = c2109a.f12391i;
            C2111c c2111c2 = new C2111c(interfaceC0211s, obj);
            c2109a.f12390h++;
            C2111c c2111c3 = c2109a.f12388f;
            if (c2111c3 == null) {
                c2109a.f12387e = c2111c2;
                c2109a.f12388f = c2111c2;
            } else {
                c2111c3.f12397g = c2111c2;
                c2111c2.f12398h = c2111c3;
                c2109a.f12388f = c2111c2;
            }
            hashMap2.put(interfaceC0211s, c2111c2);
            c0215u = null;
        }
        if (c0215u != null || (interfaceC0213t = (InterfaceC0213t) this.f882d.get()) == null) {
            return;
        }
        if (this.f883e != 0 || this.f884f) {
            z9 = true;
        }
        EnumC0203o m469b = m469b(interfaceC0211s);
        this.f883e++;
        while (obj.f877a.compareTo(m469b) < 0 && this.f880b.f12391i.containsKey(interfaceC0211s)) {
            EnumC0203o enumC0203o3 = obj.f877a;
            ArrayList arrayList = this.f886h;
            arrayList.add(enumC0203o3);
            C0197l c0197l = EnumC0201n.Companion;
            EnumC0203o enumC0203o4 = obj.f877a;
            c0197l.getClass();
            AbstractC3367j.m5100e(enumC0203o4, "state");
            int ordinal = enumC0203o4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        enumC0201n = null;
                    } else {
                        enumC0201n = EnumC0201n.ON_RESUME;
                    }
                } else {
                    enumC0201n = EnumC0201n.ON_START;
                }
            } else {
                enumC0201n = EnumC0201n.ON_CREATE;
            }
            if (enumC0201n != null) {
                obj.m467a(interfaceC0213t, enumC0201n);
                arrayList.remove(arrayList.size() - 1);
                m469b = m469b(interfaceC0211s);
            } else {
                throw new IllegalStateException("no event up from " + obj.f877a);
            }
        }
        if (!z9) {
            m474g();
        }
        this.f883e--;
    }

    /* renamed from: b */
    public final EnumC0203o m469b(InterfaceC0211s interfaceC0211s) {
        C2111c c2111c;
        EnumC0203o enumC0203o;
        HashMap hashMap = this.f880b.f12391i;
        EnumC0203o enumC0203o2 = null;
        if (hashMap.containsKey(interfaceC0211s)) {
            c2111c = ((C2111c) hashMap.get(interfaceC0211s)).f12398h;
        } else {
            c2111c = null;
        }
        if (c2111c != null) {
            enumC0203o = c2111c.f12396f.f877a;
        } else {
            enumC0203o = null;
        }
        ArrayList arrayList = this.f886h;
        if (!arrayList.isEmpty()) {
            enumC0203o2 = (EnumC0203o) arrayList.get(arrayList.size() - 1);
        }
        EnumC0203o enumC0203o3 = this.f881c;
        AbstractC3367j.m5100e(enumC0203o3, "state1");
        if (enumC0203o == null || enumC0203o.compareTo(enumC0203o3) >= 0) {
            enumC0203o = enumC0203o3;
        }
        if (enumC0203o2 != null && enumC0203o2.compareTo(enumC0203o) < 0) {
            return enumC0203o2;
        }
        return enumC0203o;
    }

    /* renamed from: c */
    public final void m470c(String str) {
        C1840a c1840a;
        if (this.f879a) {
            if (C1840a.f10907t != null) {
                c1840a = C1840a.f10907t;
            } else {
                synchronized (C1840a.class) {
                    try {
                        if (C1840a.f10907t == null) {
                            C1840a.f10907t = new C1840a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1840a = C1840a.f10907t;
            }
            ((C1840a) c1840a.f10908s).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            } else {
                throw new IllegalStateException(AbstractC0094y0.m185l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m471d(EnumC0201n enumC0201n) {
        AbstractC3367j.m5100e(enumC0201n, "event");
        m470c("handleLifecycleEvent");
        m472e(enumC0201n.m463a());
    }

    /* renamed from: e */
    public final void m472e(EnumC0203o enumC0203o) {
        if (this.f881c != enumC0203o) {
            InterfaceC0213t interfaceC0213t = (InterfaceC0213t) this.f882d.get();
            EnumC0203o enumC0203o2 = this.f881c;
            AbstractC3367j.m5100e(enumC0203o2, "current");
            EnumC0203o enumC0203o3 = EnumC0203o.f864f;
            EnumC0203o enumC0203o4 = EnumC0203o.f863e;
            if (enumC0203o2 == enumC0203o3 && enumC0203o == enumC0203o4) {
                throw new IllegalStateException(("State must be at least '" + EnumC0203o.f865g + "' to be moved to '" + enumC0203o + "' in component " + interfaceC0213t).toString());
            }
            if (enumC0203o2 == enumC0203o4 && enumC0203o2 != enumC0203o) {
                throw new IllegalStateException(("State is '" + enumC0203o4 + "' and cannot be moved to `" + enumC0203o + "` in component " + interfaceC0213t).toString());
            }
            this.f881c = enumC0203o;
            if (!this.f884f && this.f883e == 0) {
                this.f884f = true;
                m474g();
                this.f884f = false;
                if (this.f881c == enumC0203o4) {
                    this.f880b = new C2109a();
                    return;
                }
                return;
            }
            this.f885g = true;
        }
    }

    /* renamed from: f */
    public final void m473f(InterfaceC0211s interfaceC0211s) {
        AbstractC3367j.m5100e(interfaceC0211s, "observer");
        m470c("removeObserver");
        C2109a c2109a = this.f880b;
        WeakHashMap weakHashMap = c2109a.f12389g;
        HashMap hashMap = c2109a.f12391i;
        C2111c c2111c = (C2111c) hashMap.get(interfaceC0211s);
        if (c2111c != null) {
            c2109a.f12390h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC2113e) it.next()).mo3469a(c2111c);
                }
            }
            C2111c c2111c2 = c2111c.f12398h;
            if (c2111c2 != null) {
                c2111c2.f12397g = c2111c.f12397g;
            } else {
                c2109a.f12387e = c2111c.f12397g;
            }
            C2111c c2111c3 = c2111c.f12397g;
            if (c2111c3 != null) {
                c2111c3.f12398h = c2111c2;
            } else {
                c2109a.f12388f = c2111c2;
            }
            c2111c.f12397g = null;
            c2111c.f12398h = null;
        }
        hashMap.remove(interfaceC0211s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r12.f885g = false;
        r12.f887i.m2751i(r12.f881c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m474g() {
        EnumC0201n enumC0201n;
        EnumC0201n enumC0201n2;
        InterfaceC0213t interfaceC0213t = (InterfaceC0213t) this.f882d.get();
        if (interfaceC0213t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C2109a c2109a = this.f880b;
            if (c2109a.f12390h != 0) {
                C2111c c2111c = c2109a.f12387e;
                AbstractC3367j.m5097b(c2111c);
                EnumC0203o enumC0203o = c2111c.f12396f.f877a;
                C2111c c2111c2 = this.f880b.f12388f;
                AbstractC3367j.m5097b(c2111c2);
                EnumC0203o enumC0203o2 = c2111c2.f12396f.f877a;
                if (enumC0203o == enumC0203o2 && this.f881c == enumC0203o2) {
                    break;
                }
                this.f885g = false;
                EnumC0203o enumC0203o3 = this.f881c;
                C2111c c2111c3 = this.f880b.f12387e;
                AbstractC3367j.m5097b(c2111c3);
                int compareTo = enumC0203o3.compareTo(c2111c3.f12396f.f877a);
                ArrayList arrayList = this.f886h;
                if (compareTo < 0) {
                    C2109a c2109a2 = this.f880b;
                    C2110b c2110b = new C2110b(c2109a2.f12388f, c2109a2.f12387e, 1);
                    c2109a2.f12389g.put(c2110b, Boolean.FALSE);
                    while (c2110b.hasNext() && !this.f885g) {
                        Map.Entry entry = (Map.Entry) c2110b.next();
                        AbstractC3367j.m5097b(entry);
                        InterfaceC0211s interfaceC0211s = (InterfaceC0211s) entry.getKey();
                        C0215u c0215u = (C0215u) entry.getValue();
                        while (c0215u.f877a.compareTo(this.f881c) > 0 && !this.f885g && this.f880b.f12391i.containsKey(interfaceC0211s)) {
                            C0197l c0197l = EnumC0201n.Companion;
                            EnumC0203o enumC0203o4 = c0215u.f877a;
                            c0197l.getClass();
                            AbstractC3367j.m5100e(enumC0203o4, "state");
                            int ordinal = enumC0203o4.ordinal();
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        enumC0201n2 = null;
                                    } else {
                                        enumC0201n2 = EnumC0201n.ON_PAUSE;
                                    }
                                } else {
                                    enumC0201n2 = EnumC0201n.ON_STOP;
                                }
                            } else {
                                enumC0201n2 = EnumC0201n.ON_DESTROY;
                            }
                            if (enumC0201n2 != null) {
                                arrayList.add(enumC0201n2.m463a());
                                c0215u.m467a(interfaceC0213t, enumC0201n2);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c0215u.f877a);
                            }
                        }
                    }
                }
                C2111c c2111c4 = this.f880b.f12388f;
                if (!this.f885g && c2111c4 != null && this.f881c.compareTo(c2111c4.f12396f.f877a) > 0) {
                    C2109a c2109a3 = this.f880b;
                    c2109a3.getClass();
                    C2112d c2112d = new C2112d(c2109a3);
                    c2109a3.f12389g.put(c2112d, Boolean.FALSE);
                    while (c2112d.hasNext() && !this.f885g) {
                        Map.Entry entry2 = (Map.Entry) c2112d.next();
                        InterfaceC0211s interfaceC0211s2 = (InterfaceC0211s) entry2.getKey();
                        C0215u c0215u2 = (C0215u) entry2.getValue();
                        while (c0215u2.f877a.compareTo(this.f881c) < 0 && !this.f885g && this.f880b.f12391i.containsKey(interfaceC0211s2)) {
                            arrayList.add(c0215u2.f877a);
                            C0197l c0197l2 = EnumC0201n.Companion;
                            EnumC0203o enumC0203o5 = c0215u2.f877a;
                            c0197l2.getClass();
                            AbstractC3367j.m5100e(enumC0203o5, "state");
                            int ordinal2 = enumC0203o5.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        enumC0201n = null;
                                    } else {
                                        enumC0201n = EnumC0201n.ON_RESUME;
                                    }
                                } else {
                                    enumC0201n = EnumC0201n.ON_START;
                                }
                            } else {
                                enumC0201n = EnumC0201n.ON_CREATE;
                            }
                            if (enumC0201n != null) {
                                c0215u2.m467a(interfaceC0213t, enumC0201n);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event up from " + c0215u2.f877a);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
