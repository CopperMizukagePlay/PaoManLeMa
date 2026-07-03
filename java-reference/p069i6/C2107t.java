package p069i6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p032d6.AbstractRunnableC0561p0;
import p032d6.C0564q0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.t */
/* loaded from: classes.dex */
public class C2107t {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12383b = AtomicIntegerFieldUpdater.newUpdater(C2107t.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public AbstractRunnableC0561p0[] f12384a;

    /* renamed from: a */
    public final void m3465a(AbstractRunnableC0561p0 abstractRunnableC0561p0) {
        abstractRunnableC0561p0.m1231d((C0564q0) this);
        AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = this.f12384a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12383b;
        if (abstractRunnableC0561p0Arr == null) {
            abstractRunnableC0561p0Arr = new AbstractRunnableC0561p0[4];
            this.f12384a = abstractRunnableC0561p0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0561p0Arr.length) {
            Object[] copyOf = Arrays.copyOf(abstractRunnableC0561p0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            abstractRunnableC0561p0Arr = (AbstractRunnableC0561p0[]) copyOf;
            this.f12384a = abstractRunnableC0561p0Arr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        abstractRunnableC0561p0Arr[i7] = abstractRunnableC0561p0;
        abstractRunnableC0561p0.f1909f = i7;
        m3467c(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC0561p0 m3466b(int i7) {
        Object[] objArr = this.f12384a;
        AbstractC3367j.m5097b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12383b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            m3468d(i7, atomicIntegerFieldUpdater.get(this));
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                AbstractRunnableC0561p0 abstractRunnableC0561p0 = objArr[i7];
                AbstractC3367j.m5097b(abstractRunnableC0561p0);
                Object obj = objArr[i8];
                AbstractC3367j.m5097b(obj);
                if (abstractRunnableC0561p0.compareTo(obj) < 0) {
                    m3468d(i7, i8);
                    m3467c(i8);
                }
            }
            while (true) {
                int i9 = i7 * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f12384a;
                AbstractC3367j.m5097b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    AbstractC3367j.m5097b(comparable);
                    Object obj2 = objArr2[i10];
                    AbstractC3367j.m5097b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i7];
                AbstractC3367j.m5097b(comparable2);
                Comparable comparable3 = objArr2[i11];
                AbstractC3367j.m5097b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                m3468d(i7, i11);
                i7 = i11;
            }
        }
        AbstractRunnableC0561p0 abstractRunnableC0561p02 = objArr[atomicIntegerFieldUpdater.get(this)];
        AbstractC3367j.m5097b(abstractRunnableC0561p02);
        abstractRunnableC0561p02.m1231d(null);
        abstractRunnableC0561p02.f1909f = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC0561p02;
    }

    /* renamed from: c */
    public final void m3467c(int i7) {
        while (i7 > 0) {
            AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = this.f12384a;
            AbstractC3367j.m5097b(abstractRunnableC0561p0Arr);
            int i8 = (i7 - 1) / 2;
            AbstractRunnableC0561p0 abstractRunnableC0561p0 = abstractRunnableC0561p0Arr[i8];
            AbstractC3367j.m5097b(abstractRunnableC0561p0);
            AbstractRunnableC0561p0 abstractRunnableC0561p02 = abstractRunnableC0561p0Arr[i7];
            AbstractC3367j.m5097b(abstractRunnableC0561p02);
            if (abstractRunnableC0561p0.compareTo(abstractRunnableC0561p02) <= 0) {
                return;
            }
            m3468d(i7, i8);
            i7 = i8;
        }
    }

    /* renamed from: d */
    public final void m3468d(int i7, int i8) {
        AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = this.f12384a;
        AbstractC3367j.m5097b(abstractRunnableC0561p0Arr);
        AbstractRunnableC0561p0 abstractRunnableC0561p0 = abstractRunnableC0561p0Arr[i8];
        AbstractC3367j.m5097b(abstractRunnableC0561p0);
        AbstractRunnableC0561p0 abstractRunnableC0561p02 = abstractRunnableC0561p0Arr[i7];
        AbstractC3367j.m5097b(abstractRunnableC0561p02);
        abstractRunnableC0561p0Arr[i7] = abstractRunnableC0561p0;
        abstractRunnableC0561p0Arr[i8] = abstractRunnableC0561p02;
        abstractRunnableC0561p0.f1909f = i7;
        abstractRunnableC0561p02.f1909f = i8;
    }
}
