package p083k6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.m */
/* loaded from: classes.dex */
public final class C2333m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13317b = AtomicReferenceFieldUpdater.newUpdater(C2333m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13318c = AtomicIntegerFieldUpdater.newUpdater(C2333m.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13319d = AtomicIntegerFieldUpdater.newUpdater(C2333m.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13320e = AtomicIntegerFieldUpdater.newUpdater(C2333m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f13321a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC2329i m3707a(AbstractRunnableC2329i abstractRunnableC2329i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13318c;
        if (atomicIntegerFieldUpdater.get(this) - f13319d.get(this) == 127) {
            return abstractRunnableC2329i;
        }
        if (abstractRunnableC2329i.f13308f) {
            f13320e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f13321a;
            if (atomicReferenceArray.get(i7) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i7, abstractRunnableC2329i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    /* renamed from: b */
    public final AbstractRunnableC2329i m3708b() {
        AbstractRunnableC2329i abstractRunnableC2329i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13319d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f13318c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (abstractRunnableC2329i = (AbstractRunnableC2329i) this.f13321a.getAndSet(i8, null)) != null) {
                if (abstractRunnableC2329i.f13308f) {
                    f13320e.decrementAndGet(this);
                }
                return abstractRunnableC2329i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        p083k6.C2333m.f13320e.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.f13308f == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2329i m3709c(int i7, boolean z7) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f13321a;
        AbstractRunnableC2329i abstractRunnableC2329i = (AbstractRunnableC2329i) atomicReferenceArray.get(i8);
        if (abstractRunnableC2329i != null) {
        }
        return null;
    }
}
