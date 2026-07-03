package p069i6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p039e5.C1279sl;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.l */
/* loaded from: classes.dex */
public final class C2099l {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12369e = AtomicReferenceFieldUpdater.newUpdater(C2099l.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f12370f = AtomicLongFieldUpdater.newUpdater(C2099l.class, "_state$volatile");

    /* renamed from: g */
    public static final C1279sl f12371g = new C1279sl("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f12372a;

    /* renamed from: b */
    public final boolean f12373b;

    /* renamed from: c */
    public final int f12374c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f12375d;

    public C2099l(int i7, boolean z7) {
        this.f12372a = i7;
        this.f12373b = z7;
        int i8 = i7 - 1;
        this.f12374c = i8;
        this.f12375d = new AtomicReferenceArray(i7);
        if (i8 <= 1073741823) {
            if ((i7 & i8) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: a */
    public final int m3455a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12370f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                if ((2305843009213693952L & j6) != 0) {
                    return 2;
                }
                return 1;
            }
            int i7 = (int) (1073741823 & j6);
            int i8 = (int) ((1152921503533105152L & j6) >> 30);
            int i9 = this.f12374c;
            if (((i8 + 2) & i9) != (i7 & i9)) {
                boolean z7 = this.f12373b;
                AtomicReferenceArray atomicReferenceArray = this.f12375d;
                if (!z7 && atomicReferenceArray.get(i8 & i9) != null) {
                    int i10 = this.f12372a;
                    if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f12370f.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i8 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i8 & i9, obj);
                        C2099l c2099l = this;
                        while ((atomicLongFieldUpdater.get(c2099l) & 1152921504606846976L) != 0) {
                            c2099l = c2099l.m3457c();
                            AtomicReferenceArray atomicReferenceArray2 = c2099l.f12375d;
                            int i11 = c2099l.f12374c & i8;
                            Object obj2 = atomicReferenceArray2.get(i11);
                            if ((obj2 instanceof C2098k) && ((C2098k) obj2).f12368a == i8) {
                                atomicReferenceArray2.set(i11, obj);
                            } else {
                                c2099l = null;
                            }
                            if (c2099l == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    /* renamed from: b */
    public final boolean m3456b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f12370f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    /* renamed from: c */
    public final C2099l m3457c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        C2099l c2099l;
        while (true) {
            atomicLongFieldUpdater = f12370f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                c2099l = this;
                break;
            }
            long j7 = 1152921504606846976L | j6;
            c2099l = this;
            if (atomicLongFieldUpdater.compareAndSet(c2099l, j6, j7)) {
                j6 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12369e;
            C2099l c2099l2 = (C2099l) atomicReferenceFieldUpdater.get(this);
            if (c2099l2 != null) {
                return c2099l2;
            }
            C2099l c2099l3 = new C2099l(c2099l.f12372a * 2, c2099l.f12373b);
            int i7 = (int) (1073741823 & j6);
            int i8 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i9 = c2099l.f12374c;
                int i10 = i7 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object obj = c2099l.f12375d.get(i10);
                if (obj == null) {
                    obj = new C2098k(i7);
                }
                c2099l3.f12375d.set(c2099l3.f12374c & i7, obj);
                i7++;
            }
            atomicLongFieldUpdater.set(c2099l3, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2099l3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* renamed from: d */
    public final Object m3458d() {
        C2099l c2099l = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12370f;
            long j6 = atomicLongFieldUpdater.get(c2099l);
            if ((j6 & 1152921504606846976L) != 0) {
                return f12371g;
            }
            int i7 = (int) (j6 & 1073741823);
            int i8 = c2099l.f12374c;
            int i9 = i7 & i8;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i8) == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c2099l.f12375d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z7 = c2099l.f12373b;
            if (obj == null) {
                if (z7) {
                    break;
                }
            } else {
                if (obj instanceof C2098k) {
                    break;
                }
                long j7 = (i7 + 1) & 1073741823;
                if (f12370f.compareAndSet(c2099l, j6, (j6 & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                c2099l = this;
                if (z7) {
                    while (true) {
                        long j8 = atomicLongFieldUpdater.get(c2099l);
                        int i10 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            c2099l = c2099l.m3457c();
                        } else {
                            C2099l c2099l2 = c2099l;
                            if (f12370f.compareAndSet(c2099l2, j8, (j8 & (-1073741824)) | j7)) {
                                c2099l2.f12375d.set(i10 & c2099l2.f12374c, null);
                                c2099l = null;
                            } else {
                                c2099l = c2099l2;
                            }
                        }
                        if (c2099l == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
