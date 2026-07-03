package p032d6;

import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.r */
/* loaded from: classes.dex */
public final class C0566r {

    /* renamed from: a */
    public final Object f1914a;

    /* renamed from: b */
    public final InterfaceC0539i f1915b;

    /* renamed from: c */
    public final InterfaceC3282f f1916c;

    /* renamed from: d */
    public final Object f1917d;

    /* renamed from: e */
    public final Throwable f1918e;

    public C0566r(Object obj, InterfaceC0539i interfaceC0539i, InterfaceC3282f interfaceC3282f, Object obj2, Throwable th) {
        this.f1914a = obj;
        this.f1915b = interfaceC0539i;
        this.f1916c = interfaceC3282f;
        this.f1917d = obj2;
        this.f1918e = th;
    }

    /* renamed from: a */
    public static C0566r m1232a(C0566r c0566r, InterfaceC0539i interfaceC0539i, Throwable th, int i7) {
        Object obj = c0566r.f1914a;
        if ((i7 & 2) != 0) {
            interfaceC0539i = c0566r.f1915b;
        }
        InterfaceC0539i interfaceC0539i2 = interfaceC0539i;
        InterfaceC3282f interfaceC3282f = c0566r.f1916c;
        Object obj2 = c0566r.f1917d;
        if ((i7 & 16) != 0) {
            th = c0566r.f1918e;
        }
        return new C0566r(obj, interfaceC0539i2, interfaceC3282f, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0566r)) {
            return false;
        }
        C0566r c0566r = (C0566r) obj;
        if (AbstractC3367j.m5096a(this.f1914a, c0566r.f1914a) && AbstractC3367j.m5096a(this.f1915b, c0566r.f1915b) && AbstractC3367j.m5096a(this.f1916c, c0566r.f1916c) && AbstractC3367j.m5096a(this.f1917d, c0566r.f1917d) && AbstractC3367j.m5096a(this.f1918e, c0566r.f1918e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Object obj = this.f1914a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        InterfaceC0539i interfaceC0539i = this.f1915b;
        if (interfaceC0539i == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC0539i.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        InterfaceC3282f interfaceC3282f = this.f1916c;
        if (interfaceC3282f == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC3282f.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Object obj2 = this.f1917d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Throwable th = this.f1918e;
        if (th != null) {
            i7 = th.hashCode();
        }
        return i11 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1914a + ", cancelHandler=" + this.f1915b + ", onCancellation=" + this.f1916c + ", idempotentResume=" + this.f1917d + ", cancelCause=" + this.f1918e + ')';
    }

    public /* synthetic */ C0566r(Object obj, InterfaceC0539i interfaceC0539i, InterfaceC3282f interfaceC3282f, Throwable th, int i7) {
        this(obj, (i7 & 2) != 0 ? null : interfaceC0539i, (i7 & 4) != 0 ? null : interfaceC3282f, (Object) null, (i7 & 16) != 0 ? null : th);
    }
}
