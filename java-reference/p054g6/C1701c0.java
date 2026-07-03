package p054g6;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.C0548l;
import p039e5.C1279sl;
import p047f6.EnumC1546a;
import p053g5.C1694m;
import p061h6.AbstractC1820b;
import p061h6.AbstractC1821c;
import p061h6.AbstractC1822d;
import p061h6.AbstractC1824f;
import p061h6.InterfaceC1831m;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.c0 */
/* loaded from: classes.dex */
public final class C1701c0 extends AbstractC1820b implements InterfaceC1714o, InterfaceC1702d, InterfaceC1831m {

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10501j = AtomicReferenceFieldUpdater.newUpdater(C1701c0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: i */
    public int f10502i;

    public C1701c0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p061h6.AbstractC1820b
    /* renamed from: b */
    public final AbstractC1822d mo2748b() {
        return new C1703d0();
    }

    @Override // p061h6.AbstractC1820b
    /* renamed from: c */
    public final AbstractC1822d[] mo2749c() {
        return new C1703d0[2];
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo35f(p054g6.InterfaceC1704e r18, p082k5.InterfaceC2313c r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054g6.C1701c0.mo35f(g6.e, k5.c):java.lang.Object");
    }

    /* renamed from: g */
    public final boolean m2750g(Object obj, Object obj2) {
        C1279sl c1279sl = AbstractC1821c.f10872b;
        if (obj == null) {
            obj = c1279sl;
        }
        if (obj2 == null) {
            obj2 = c1279sl;
        }
        return m2752j(obj, obj2);
    }

    @Override // p054g6.InterfaceC1697a0
    public final Object getValue() {
        C1279sl c1279sl = AbstractC1821c.f10872b;
        Object obj = f10501j.get(this);
        if (obj == c1279sl) {
            return null;
        }
        return obj;
    }

    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        m2751i(obj);
        return C1694m.f10482a;
    }

    /* renamed from: i */
    public final void m2751i(Object obj) {
        if (obj == null) {
            obj = AbstractC1821c.f10872b;
        }
        m2752j(null, obj);
    }

    /* renamed from: j */
    public final boolean m2752j(Object obj, Object obj2) {
        int i7;
        AbstractC1822d[] abstractC1822dArr;
        C1279sl c1279sl;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10501j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3367j.m5096a(obj3, obj)) {
                return false;
            }
            if (AbstractC3367j.m5096a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f10502i;
            if ((i8 & 1) == 0) {
                int i9 = i8 + 1;
                this.f10502i = i9;
                AbstractC1822d[] abstractC1822dArr2 = this.f10867e;
                while (true) {
                    C1703d0[] c1703d0Arr = (C1703d0[]) abstractC1822dArr2;
                    if (c1703d0Arr != null) {
                        for (C1703d0 c1703d0 : c1703d0Arr) {
                            if (c1703d0 != null) {
                                AtomicReference atomicReference = c1703d0.f10503a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (c1279sl = AbstractC1719t.f10557c)) {
                                        C1279sl c1279sl2 = AbstractC1719t.f10556b;
                                        if (obj4 == c1279sl2) {
                                            while (!atomicReference.compareAndSet(obj4, c1279sl)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, c1279sl2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0548l) obj4).mo663n(C1694m.f10482a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i7 = this.f10502i;
                        if (i7 == i9) {
                            this.f10502i = i9 + 1;
                            return true;
                        }
                        abstractC1822dArr = this.f10867e;
                    }
                    abstractC1822dArr2 = abstractC1822dArr;
                    i9 = i7;
                }
            } else {
                this.f10502i = i8 + 2;
                return true;
            }
        }
    }

    @Override // p061h6.InterfaceC1831m
    /* renamed from: m */
    public final InterfaceC1702d mo2753m(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        if ((((i7 >= 0 && i7 < 2) || i7 == -2) && enumC1546a == EnumC1546a.f10129f) || ((i7 == 0 || i7 == -3) && enumC1546a == EnumC1546a.f10128e)) {
            return this;
        }
        return new AbstractC1824f(this, interfaceC2318h, i7, enumC1546a);
    }
}
